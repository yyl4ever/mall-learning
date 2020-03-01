package com.macro.mall.tiny.mbg.model;

import java.util.Date;

/**
 * @Author: yangyl
 * @Date: 2020-03-01 17:27
 * @Description:
 */
public class CharterApply {
    private Long id;

    /**
     * 是否批复，0：否，1：是
     */
    private Integer approved;

    /**
     * 企业名称
     */
    private String enterpriseName;

    /**
     * 社会信用代码
     */
    private String socialCreditCode;

    /**
     * 企业所在地（省市区）
     */
    private String enterpriseArea;

    /**
     * 企业具体地址
     */
    private String enterpriseAddress;

    /**
     * 企业复工证明上传路径
     */
    private String workResumptionProofUrl;

    /**
     * 出发日期
     */
    private String departureDate;

    /**
     * 出发时间
     */
    private String departureTime;

    /**
     * 出发地（省市区）
     */
    private String departureArea;

    /**
     * 出发地详细地址
     */
    private String departureAddress;

    /**
     * 目的地（省市区）
     */
    private String destinationArea;

    /**
     * 目的地详细地址
     */
    private String destinationAddress;

    /**
     * 车座类型，比如4座、7座、9座
     */
    private String busSeatType;

    /**
     * 包车人名称
     */
    private String chartererName;

    /**
     * 包车人电话
     */
    private String chartererPhone;

    /**
     * 乘客数量
     */
    private Integer passengerCount;

    /**
     * 地区id
     */
    private Long charterAreaId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getApproved() {
        return approved;
    }

    public void setApproved(Integer approved) {
        this.approved = approved;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName == null ? null : enterpriseName.trim();
    }

    public String getSocialCreditCode() {
        return socialCreditCode;
    }

    public void setSocialCreditCode(String socialCreditCode) {
        this.socialCreditCode = socialCreditCode == null ? null : socialCreditCode.trim();
    }

    public String getEnterpriseArea() {
        return enterpriseArea;
    }

    public void setEnterpriseArea(String enterpriseArea) {
        this.enterpriseArea = enterpriseArea == null ? null : enterpriseArea.trim();
    }

    public String getEnterpriseAddress() {
        return enterpriseAddress;
    }

    public void setEnterpriseAddress(String enterpriseAddress) {
        this.enterpriseAddress = enterpriseAddress == null ? null : enterpriseAddress.trim();
    }

    public String getWorkResumptionProofUrl() {
        return workResumptionProofUrl;
    }

    public void setWorkResumptionProofUrl(String workResumptionProofUrl) {
        this.workResumptionProofUrl = workResumptionProofUrl == null ? null : workResumptionProofUrl.trim();
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate == null ? null : departureDate.trim();
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime == null ? null : departureTime.trim();
    }

    public String getDepartureArea() {
        return departureArea;
    }

    public void setDepartureArea(String departureArea) {
        this.departureArea = departureArea == null ? null : departureArea.trim();
    }

    public String getDepartureAddress() {
        return departureAddress;
    }

    public void setDepartureAddress(String departureAddress) {
        this.departureAddress = departureAddress == null ? null : departureAddress.trim();
    }

    public String getDestinationArea() {
        return destinationArea;
    }

    public void setDestinationArea(String destinationArea) {
        this.destinationArea = destinationArea == null ? null : destinationArea.trim();
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress == null ? null : destinationAddress.trim();
    }

    public String getBusSeatType() {
        return busSeatType;
    }

    public void setBusSeatType(String busSeatType) {
        this.busSeatType = busSeatType == null ? null : busSeatType.trim();
    }

    public String getChartererName() {
        return chartererName;
    }

    public void setChartererName(String chartererName) {
        this.chartererName = chartererName == null ? null : chartererName.trim();
    }

    public String getChartererPhone() {
        return chartererPhone;
    }

    public void setChartererPhone(String chartererPhone) {
        this.chartererPhone = chartererPhone == null ? null : chartererPhone.trim();
    }

    public Integer getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(Integer passengerCount) {
        this.passengerCount = passengerCount;
    }

    public Long getCharterAreaId() {
        return charterAreaId;
    }

    public void setCharterAreaId(Long charterAreaId) {
        this.charterAreaId = charterAreaId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", approved=").append(approved);
        sb.append(", enterpriseName=").append(enterpriseName);
        sb.append(", socialCreditCode=").append(socialCreditCode);
        sb.append(", enterpriseArea=").append(enterpriseArea);
        sb.append(", enterpriseAddress=").append(enterpriseAddress);
        sb.append(", workResumptionProofUrl=").append(workResumptionProofUrl);
        sb.append(", departureDate=").append(departureDate);
        sb.append(", departureTime=").append(departureTime);
        sb.append(", departureArea=").append(departureArea);
        sb.append(", departureAddress=").append(departureAddress);
        sb.append(", destinationArea=").append(destinationArea);
        sb.append(", destinationAddress=").append(destinationAddress);
        sb.append(", busSeatType=").append(busSeatType);
        sb.append(", chartererName=").append(chartererName);
        sb.append(", chartererPhone=").append(chartererPhone);
        sb.append(", passengerCount=").append(passengerCount);
        sb.append(", charterAreaId=").append(charterAreaId);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append("]");
        return sb.toString();
    }
}