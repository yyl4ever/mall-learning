package com.macro.mall.tiny.mbg.model;

import java.util.List;

/**
 * @Author: yangyl
 * @Date: 2020-02-20 12:59
 * @Description: 地区
 */
public class RegionDtoNode extends RegionDto {
    private List<RegionDtoNode> children;

    public List<RegionDtoNode> getChildren() {
        return children;
    }

    public void setChildren(List<RegionDtoNode> children) {
        this.children = children;
    }
}
