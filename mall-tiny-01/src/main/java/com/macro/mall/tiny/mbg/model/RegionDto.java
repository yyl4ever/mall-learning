package com.macro.mall.tiny.mbg.model;

/**
 * @Author: yangyl
 * @Date: 2020-03-01 16:20
 * @Description:
 */
public class RegionDto {
    /**
     * 区域代码
     */
    private String regionCode;

    /**
     * 父区域代码
     */
    private String parentCode;

    /**
     * 区域名
     */
    private String regionName;

    /**
     * 级别
     */
    private String regionLevel;

    /**
     * 拼音首字母
     */
    private String regionPy;

    private String regionQp;

    /**
     * 备注
     */
    private String remark;

    /**
     * 排序
     */
    private String sort;

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode == null ? null : regionCode.trim();
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode == null ? null : parentCode.trim();
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName == null ? null : regionName.trim();
    }

    public String getRegionLevel() {
        return regionLevel;
    }

    public void setRegionLevel(String regionLevel) {
        this.regionLevel = regionLevel == null ? null : regionLevel.trim();
    }

    public String getRegionPy() {
        return regionPy;
    }

    public void setRegionPy(String regionPy) {
        this.regionPy = regionPy == null ? null : regionPy.trim();
    }

    public String getRegionQp() {
        return regionQp;
    }

    public void setRegionQp(String regionQp) {
        this.regionQp = regionQp == null ? null : regionQp.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort == null ? null : sort.trim();
    }
}