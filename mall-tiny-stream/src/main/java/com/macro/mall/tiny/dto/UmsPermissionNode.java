package com.macro.mall.tiny.dto;

import com.macro.mall.tiny.mbg.model.UmsPermission;

import java.util.List;

/**
 * 用于存储下级权限
 * @Author: yangyl
 * @Date: 2019/9/24 17:07
 */
public class UmsPermissionNode extends UmsPermission {
    private List<UmsPermissionNode> children;

    public List<UmsPermissionNode> getChildren() {
        return children;
    }

    public void setChildren(List<UmsPermissionNode> children) {
        this.children = children;
    }
}
