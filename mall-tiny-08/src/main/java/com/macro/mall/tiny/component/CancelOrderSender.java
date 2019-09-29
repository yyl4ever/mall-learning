package com.macro.mall.tiny.component;

import com.macro.mall.tiny.dto.QueueEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessagePostProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 取消订单消息的发出者
 * @Author: yangyl
 * @Date: 2019/9/11 17:23
 */
@Component
@Slf4j
public class CancelOrderSender {
    
    @Autowired
    private AmqpTemplate amqpTemplate;
    
    public void sendMessage(Long orderId, final long delayTimes) {
        //给延迟队列发送消息，间隔 delayTimes 会被转发到 QUEUE_ORDER_CANCEL,
        // @RabbitListener(queues = "mall.order.cancel") 监听到消息，再进行取消动作
        // TODO 隔了 delayTimes 将 orderId 的订单取消？
        amqpTemplate.convertAndSend(QueueEnum.QUEUE_TTL_ORDER_CANCEL.getExchange(),
                QueueEnum.QUEUE_TTL_ORDER_CANCEL.getRouteKey(),
                orderId,
                new MessagePostProcessor() {
                    @Override
                    public Message postProcessMessage(Message message) throws AmqpException {
                        // 给消息设置延迟毫秒值
                        message.getMessageProperties().setExpiration(String.valueOf(delayTimes));
                        return message;
                    }
                });
    }
    
}
