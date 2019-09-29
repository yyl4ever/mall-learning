package com.macro.mall.tiny.nosql.elasticsearch.document;

import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 * 商品属性信息
 *
 * @Author: yangyl
 * @Date: 2019/9/5 13:34
 */
public class EsProductAttributeValue implements Serializable {
    private static final long serialVersionUID = 1L;
// TODO 商品id呢？
    private Long id;
    private Long productAttributeId;
    /**
     * 属性名称
     */
    @Field(type = FieldType.Keyword)
    private String name;
    /**
     * 属性参数：0->规格；1->参数
     */
    private Integer type;

    /**
     * 属性值
     */
    @Field(type = FieldType.Keyword)
    private String value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductAttributeId() {
        return productAttributeId;
    }

    public void setProductAttributeId(Long productAttributeId) {
        this.productAttributeId = productAttributeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
