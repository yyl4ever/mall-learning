package com.macro.mall.tiny.common.api;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 分页数据封装类
 * @Author: yangyl
 * @Date: 2019/8/22 17:23
 */
public class CommonPage<T> {
    private Integer pageNum;
    private Integer pageSize;
    /**
     * 总页数
     */
    private Integer totalPage;
    /**
     * 总记录数
     */
    private Long total;
    private List<T> list;

    /**
     * 将PageHelper分页后的List转换为分页信息
     * @param list
     * @param <T>
     * @return
     */
    public static <T> CommonPage<T> restPage(List<T> list) {
        PageInfo<T> pageInfo = new PageInfo<T>(list);
        CommonPage<T> result = new CommonPage<>();
        result.setTotalPage(pageInfo.getPages());
        result.setPageNum(pageInfo.getPageNum());
        result.setPageSize(pageInfo.getPageSize());
        // TODO debug  怎么计算得到总记录数的？ 传入的List类型其实是Page类型
        result.setTotal(pageInfo.getTotal());
        result.setList(pageInfo.getList());
        return result;
    }
    
    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
