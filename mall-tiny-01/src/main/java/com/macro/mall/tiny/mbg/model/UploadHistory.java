package com.macro.mall.tiny.mbg.model;

import java.util.Date;

 /**
  * @Author: yangyl
  * @Date: 2020-03-01 17:44
  * @Description: 
 */
public class UploadHistory {
    private Long id;

    /**
    * 上传的文件名称
    */
    private String uploadFileName;

    /**
    * 地区
    */
    private String area;

    /**
    * 省
    */
    private String provinceName;

    /**
    * 省级代码
    */
    private String provinceCode;

    /**
    * 市
    */
    private String cityName;

    /**
    * 市级代码
    */
    private String cityCode;

    /**
    * 县
    */
    private String countyName;

    /**
    * 县级代码
    */
    private String countyCode;

    /**
    * 到达省级代码
    */
    private String endProvinceCode;

    /**
    * 到达省级名称
    */
    private String endProvinceName;

    /**
    * 到达市级代码
    */
    private String endCityCode;

    /**
    * 到达市级名称
    */
    private String endCityName;

    /**
    * 到达县级代码
    */
    private String endCountyCode;

    /**
    * 到达县级名称
    */
    private String endCountyName;

    /**
    * 到达地区
    */
    private String endArea;

    /**
    * 车站
    */
    private String station;

    /**
    * 上传者
    */
    private String uploader;

    /**
    * 上传者电话
    */
    private String uploaderPhone;

    /**
    * 上传时间
    */
    private Date uploadTime;

    /**
    * 所属用户id
    */
    private Long userId;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 修改时间
    */
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName == null ? null : uploadFileName.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName == null ? null : countyName.trim();
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode == null ? null : countyCode.trim();
    }

    public String getEndProvinceCode() {
        return endProvinceCode;
    }

    public void setEndProvinceCode(String endProvinceCode) {
        this.endProvinceCode = endProvinceCode == null ? null : endProvinceCode.trim();
    }

    public String getEndProvinceName() {
        return endProvinceName;
    }

    public void setEndProvinceName(String endProvinceName) {
        this.endProvinceName = endProvinceName == null ? null : endProvinceName.trim();
    }

    public String getEndCityCode() {
        return endCityCode;
    }

    public void setEndCityCode(String endCityCode) {
        this.endCityCode = endCityCode == null ? null : endCityCode.trim();
    }

    public String getEndCityName() {
        return endCityName;
    }

    public void setEndCityName(String endCityName) {
        this.endCityName = endCityName == null ? null : endCityName.trim();
    }

    public String getEndCountyCode() {
        return endCountyCode;
    }

    public void setEndCountyCode(String endCountyCode) {
        this.endCountyCode = endCountyCode == null ? null : endCountyCode.trim();
    }

    public String getEndCountyName() {
        return endCountyName;
    }

    public void setEndCountyName(String endCountyName) {
        this.endCountyName = endCountyName == null ? null : endCountyName.trim();
    }

    public String getEndArea() {
        return endArea;
    }

    public void setEndArea(String endArea) {
        this.endArea = endArea == null ? null : endArea.trim();
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station == null ? null : station.trim();
    }

    public String getUploader() {
        return uploader;
    }

    public void setUploader(String uploader) {
        this.uploader = uploader == null ? null : uploader.trim();
    }

    public String getUploaderPhone() {
        return uploaderPhone;
    }

    public void setUploaderPhone(String uploaderPhone) {
        this.uploaderPhone = uploaderPhone == null ? null : uploaderPhone.trim();
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uploadFileName=").append(uploadFileName);
        sb.append(", area=").append(area);
        sb.append(", provinceName=").append(provinceName);
        sb.append(", provinceCode=").append(provinceCode);
        sb.append(", cityName=").append(cityName);
        sb.append(", cityCode=").append(cityCode);
        sb.append(", countyName=").append(countyName);
        sb.append(", countyCode=").append(countyCode);
        sb.append(", endProvinceCode=").append(endProvinceCode);
        sb.append(", endProvinceName=").append(endProvinceName);
        sb.append(", endCityCode=").append(endCityCode);
        sb.append(", endCityName=").append(endCityName);
        sb.append(", endCountyCode=").append(endCountyCode);
        sb.append(", endCountyName=").append(endCountyName);
        sb.append(", endArea=").append(endArea);
        sb.append(", station=").append(station);
        sb.append(", uploader=").append(uploader);
        sb.append(", uploaderPhone=").append(uploaderPhone);
        sb.append(", uploadTime=").append(uploadTime);
        sb.append(", userId=").append(userId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}