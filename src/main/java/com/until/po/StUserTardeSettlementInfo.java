package com.until.po;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "st_user_tarde_settlement_info")
public class StUserTardeSettlementInfo {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "GUID")
    private String guid;

    /**
     * 场景ID
     */
    @Column(name = "MARKET_ID")
    private String marketId;

    /**
     * 场景名称
     */
    @Column(name = "MARKET_NAME")
    private String marketName;

    /**
     * 年份
     */
    @Column(name = "FYEAR")
    private String fyear;

    /**
     * 月份
     */
    @Column(name = "FMONTH")
    private String fmonth;

    /**
     * 市场成员ID
     */
    @Column(name = "MEMBERS_ID")
    private String membersId;

    /**
     * 市场成员名称
     */
    @Column(name = "MEMBERS_NAME")
    private String membersName;

    /**
     * 电力用户月度用电量
     */
    @Column(name = "MO_USE_ENERGY")
    private BigDecimal moUseEnergy;

    /**
     * 市场化合同总电量
     */
    @Column(name = "MARKET_CONT_ENG_T")
    private BigDecimal marketContEngT;

    /**
     * 市场化合同总电价
     */
    @Column(name = "MARKET_CONT_PRI_T")
    private BigDecimal marketContPriT;

    /**
     * 市场化合同结算电量
     */
    @Column(name = "MARKET_CONT_SE_ENG")
    private BigDecimal marketContSeEng;

    /**
     * 市场化合同结算电费
     */
    @Column(name = "MARKET_CONT_SE_FEE")
    private BigDecimal marketContSeFee;

    /**
     * 市场化合同结算电价
     */
    @Column(name = "MARKET_CONT_SE_PRI")
    private BigDecimal marketContSePri;

    /**
     * 现货结算电量
     */
    @Column(name = "SPOT_ENERGY")
    private BigDecimal spotEnergy;

    /**
     * 现货结算电费
     */
    @Column(name = "SPOT_FEE")
    private BigDecimal spotFee;

    /**
     * 现货结算电价
     */
    @Column(name = "SPOT_PRICE")
    private BigDecimal spotPrice;

    /**
     * 结算均价下降
     */
    @Column(name = "SE_AVG_PRI_DESC")
    private BigDecimal seAvgPriDesc;

    /**
     * 市场化偏差考核电量
     */
    @Column(name = "MARK_CHECKDEV_ENG")
    private BigDecimal markCheckdevEng;

    /**
     * 市场化偏差考核电费
     */
    @Column(name = "MARK_CHECKDEV_FEE")
    private BigDecimal markCheckdevFee;

    /**
     * 市场化偏差考核电价
     */
    @Column(name = "MARK_CHECKDEV_PRI")
    private BigDecimal markCheckdevPri;

    /**
     * 更新时间
     */
    @Column(name = "UPDATE_DATE")
    private Date updateDate;

    /**
     * 状态
     */
    @Column(name = "STATE")
    private String state;

    /**
     * 是否发布
     */
    @Column(name = "ISSUE")
    private String issue;

    /**
     * 获取主键ID
     *
     * @return GUID - 主键ID
     */
    public String getGuid() {
        return guid;
    }

    /**
     * 设置主键ID
     *
     * @param guid 主键ID
     */
    public void setGuid(String guid) {
        this.guid = guid == null ? null : guid.trim();
    }

    /**
     * 获取场景ID
     *
     * @return MARKET_ID - 场景ID
     */
    public String getMarketId() {
        return marketId;
    }

    /**
     * 设置场景ID
     *
     * @param marketId 场景ID
     */
    public void setMarketId(String marketId) {
        this.marketId = marketId == null ? null : marketId.trim();
    }

    /**
     * 获取场景名称
     *
     * @return MARKET_NAME - 场景名称
     */
    public String getMarketName() {
        return marketName;
    }

    /**
     * 设置场景名称
     *
     * @param marketName 场景名称
     */
    public void setMarketName(String marketName) {
        this.marketName = marketName == null ? null : marketName.trim();
    }

    /**
     * 获取年份
     *
     * @return FYEAR - 年份
     */
    public String getFyear() {
        return fyear;
    }

    /**
     * 设置年份
     *
     * @param fyear 年份
     */
    public void setFyear(String fyear) {
        this.fyear = fyear == null ? null : fyear.trim();
    }

    /**
     * 获取月份
     *
     * @return FMONTH - 月份
     */
    public String getFmonth() {
        return fmonth;
    }

    /**
     * 设置月份
     *
     * @param fmonth 月份
     */
    public void setFmonth(String fmonth) {
        this.fmonth = fmonth == null ? null : fmonth.trim();
    }

    /**
     * 获取市场成员ID
     *
     * @return MEMBERS_ID - 市场成员ID
     */
    public String getMembersId() {
        return membersId;
    }

    /**
     * 设置市场成员ID
     *
     * @param membersId 市场成员ID
     */
    public void setMembersId(String membersId) {
        this.membersId = membersId == null ? null : membersId.trim();
    }

    /**
     * 获取市场成员名称
     *
     * @return MEMBERS_NAME - 市场成员名称
     */
    public String getMembersName() {
        return membersName;
    }

    /**
     * 设置市场成员名称
     *
     * @param membersName 市场成员名称
     */
    public void setMembersName(String membersName) {
        this.membersName = membersName == null ? null : membersName.trim();
    }

    /**
     * 获取电力用户月度用电量
     *
     * @return MO_USE_ENERGY - 电力用户月度用电量
     */
    public BigDecimal getMoUseEnergy() {
        return moUseEnergy;
    }

    /**
     * 设置电力用户月度用电量
     *
     * @param moUseEnergy 电力用户月度用电量
     */
    public void setMoUseEnergy(BigDecimal moUseEnergy) {
        this.moUseEnergy = moUseEnergy;
    }

    /**
     * 获取市场化合同总电量
     *
     * @return MARKET_CONT_ENG_T - 市场化合同总电量
     */
    public BigDecimal getMarketContEngT() {
        return marketContEngT;
    }

    /**
     * 设置市场化合同总电量
     *
     * @param marketContEngT 市场化合同总电量
     */
    public void setMarketContEngT(BigDecimal marketContEngT) {
        this.marketContEngT = marketContEngT;
    }

    /**
     * 获取市场化合同总电价
     *
     * @return MARKET_CONT_PRI_T - 市场化合同总电价
     */
    public BigDecimal getMarketContPriT() {
        return marketContPriT;
    }

    /**
     * 设置市场化合同总电价
     *
     * @param marketContPriT 市场化合同总电价
     */
    public void setMarketContPriT(BigDecimal marketContPriT) {
        this.marketContPriT = marketContPriT;
    }

    /**
     * 获取市场化合同结算电量
     *
     * @return MARKET_CONT_SE_ENG - 市场化合同结算电量
     */
    public BigDecimal getMarketContSeEng() {
        return marketContSeEng;
    }

    /**
     * 设置市场化合同结算电量
     *
     * @param marketContSeEng 市场化合同结算电量
     */
    public void setMarketContSeEng(BigDecimal marketContSeEng) {
        this.marketContSeEng = marketContSeEng;
    }

    /**
     * 获取市场化合同结算电费
     *
     * @return MARKET_CONT_SE_FEE - 市场化合同结算电费
     */
    public BigDecimal getMarketContSeFee() {
        return marketContSeFee;
    }

    /**
     * 设置市场化合同结算电费
     *
     * @param marketContSeFee 市场化合同结算电费
     */
    public void setMarketContSeFee(BigDecimal marketContSeFee) {
        this.marketContSeFee = marketContSeFee;
    }

    /**
     * 获取市场化合同结算电价
     *
     * @return MARKET_CONT_SE_PRI - 市场化合同结算电价
     */
    public BigDecimal getMarketContSePri() {
        return marketContSePri;
    }

    /**
     * 设置市场化合同结算电价
     *
     * @param marketContSePri 市场化合同结算电价
     */
    public void setMarketContSePri(BigDecimal marketContSePri) {
        this.marketContSePri = marketContSePri;
    }

    /**
     * 获取现货结算电量
     *
     * @return SPOT_ENERGY - 现货结算电量
     */
    public BigDecimal getSpotEnergy() {
        return spotEnergy;
    }

    /**
     * 设置现货结算电量
     *
     * @param spotEnergy 现货结算电量
     */
    public void setSpotEnergy(BigDecimal spotEnergy) {
        this.spotEnergy = spotEnergy;
    }

    /**
     * 获取现货结算电费
     *
     * @return SPOT_FEE - 现货结算电费
     */
    public BigDecimal getSpotFee() {
        return spotFee;
    }

    /**
     * 设置现货结算电费
     *
     * @param spotFee 现货结算电费
     */
    public void setSpotFee(BigDecimal spotFee) {
        this.spotFee = spotFee;
    }

    /**
     * 获取现货结算电价
     *
     * @return SPOT_PRICE - 现货结算电价
     */
    public BigDecimal getSpotPrice() {
        return spotPrice;
    }

    /**
     * 设置现货结算电价
     *
     * @param spotPrice 现货结算电价
     */
    public void setSpotPrice(BigDecimal spotPrice) {
        this.spotPrice = spotPrice;
    }

    /**
     * 获取结算均价下降
     *
     * @return SE_AVG_PRI_DESC - 结算均价下降
     */
    public BigDecimal getSeAvgPriDesc() {
        return seAvgPriDesc;
    }

    /**
     * 设置结算均价下降
     *
     * @param seAvgPriDesc 结算均价下降
     */
    public void setSeAvgPriDesc(BigDecimal seAvgPriDesc) {
        this.seAvgPriDesc = seAvgPriDesc;
    }

    /**
     * 获取市场化偏差考核电量
     *
     * @return MARK_CHECKDEV_ENG - 市场化偏差考核电量
     */
    public BigDecimal getMarkCheckdevEng() {
        return markCheckdevEng;
    }

    /**
     * 设置市场化偏差考核电量
     *
     * @param markCheckdevEng 市场化偏差考核电量
     */
    public void setMarkCheckdevEng(BigDecimal markCheckdevEng) {
        this.markCheckdevEng = markCheckdevEng;
    }

    /**
     * 获取市场化偏差考核电费
     *
     * @return MARK_CHECKDEV_FEE - 市场化偏差考核电费
     */
    public BigDecimal getMarkCheckdevFee() {
        return markCheckdevFee;
    }

    /**
     * 设置市场化偏差考核电费
     *
     * @param markCheckdevFee 市场化偏差考核电费
     */
    public void setMarkCheckdevFee(BigDecimal markCheckdevFee) {
        this.markCheckdevFee = markCheckdevFee;
    }

    /**
     * 获取市场化偏差考核电价
     *
     * @return MARK_CHECKDEV_PRI - 市场化偏差考核电价
     */
    public BigDecimal getMarkCheckdevPri() {
        return markCheckdevPri;
    }

    /**
     * 设置市场化偏差考核电价
     *
     * @param markCheckdevPri 市场化偏差考核电价
     */
    public void setMarkCheckdevPri(BigDecimal markCheckdevPri) {
        this.markCheckdevPri = markCheckdevPri;
    }

    /**
     * 获取更新时间
     *
     * @return UPDATE_DATE - 更新时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置更新时间
     *
     * @param updateDate 更新时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取状态
     *
     * @return STATE - 状态
     */
    public String getState() {
        return state;
    }

    /**
     * 设置状态
     *
     * @param state 状态
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * 获取是否发布
     *
     * @return ISSUE - 是否发布
     */
    public String getIssue() {
        return issue;
    }

    /**
     * 设置是否发布
     *
     * @param issue 是否发布
     */
    public void setIssue(String issue) {
        this.issue = issue == null ? null : issue.trim();
    }
}