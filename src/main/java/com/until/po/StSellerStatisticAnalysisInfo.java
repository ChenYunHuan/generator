package com.until.po;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "st_seller_statistic_analysis_info")
public class StSellerStatisticAnalysisInfo {
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
     * 售电公司名称
     */
    @Column(name = "MEMBERS_NAME")
    private String membersName;

    /**
     * 代理零售用户数量
     */
    @Column(name = "PROXY_USER_COUNT")
    private Integer proxyUserCount;

    /**
     * 代理零售用户用电量
     */
    @Column(name = "MO_USE_ENERGY")
    private BigDecimal moUseEnergy;

    /**
     * 合同购电量
     */
    @Column(name = "SELL_ENERGY_T")
    private BigDecimal sellEnergyT;

    /**
     * 合同购电费
     */
    @Column(name = "SELL_FEE_T")
    private BigDecimal sellFeeT;

    /**
     * 合同购电均价
     */
    @Column(name = "SELL_PRICE_T")
    private BigDecimal sellPriceT;

    /**
     * 市场价购电量
     */
    @Column(name = "MARK_PURCHASE_ENG")
    private BigDecimal markPurchaseEng;

    /**
     * 市场价购电费
     */
    @Column(name = "MARK_PURCHASE_FEE")
    private BigDecimal markPurchaseFee;

    /**
     * 市场价购均价
     */
    @Column(name = "MARK_PURCHASE_PRI")
    private BigDecimal markPurchasePri;

    /**
     * 超用结算电量
     */
    @Column(name = "OVER_USE_ENG")
    private BigDecimal overUseEng;

    /**
     * 超用结算电费
     */
    @Column(name = "OVER_USE_FEE")
    private BigDecimal overUseFee;

    /**
     * 超用结算均价
     */
    @Column(name = "OVER_USE_PRI")
    private BigDecimal overUsePri;

    /**
     * 偏差考核电量
     */
    @Column(name = "CHECKDEV_ENG")
    private BigDecimal checkdevEng;

    /**
     * 偏差考核电费
     */
    @Column(name = "CHECKDEV_FEE")
    private BigDecimal checkdevFee;

    /**
     * 偏差考核均价
     */
    @Column(name = "CHECKDEV_PRI")
    private BigDecimal checkdevPri;

    /**
     * 零售电量
     */
    @Column(name = "USER_ENERGY_T")
    private BigDecimal userEnergyT;

    /**
     * 零售电费
     */
    @Column(name = "USER_FEE_T")
    private BigDecimal userFeeT;

    /**
     * 零售电均价
     */
    @Column(name = "USER_PRICE_T")
    private BigDecimal userPriceT;

    /**
     * 代理用户偏差考核 电量
     */
    @Column(name = "PROXY_CHECK_ENG")
    private BigDecimal proxyCheckEng;

    /**
     * 代理用户偏差考核 电费
     */
    @Column(name = "PROXY_CHECK_FEE")
    private BigDecimal proxyCheckFee;

    /**
     * 代理用户偏差考核 均价
     */
    @Column(name = "PROXY_CHECK_PRI")
    private BigDecimal proxyCheckPri;

    /**
     * 服务费
     */
    @Column(name = "SERVICE_FEE")
    private BigDecimal serviceFee;

    /**
     * 服务均价
     */
    @Column(name = "SERVICE_AVG_PRI")
    private BigDecimal serviceAvgPri;

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
     * 获取售电公司名称
     *
     * @return MEMBERS_NAME - 售电公司名称
     */
    public String getMembersName() {
        return membersName;
    }

    /**
     * 设置售电公司名称
     *
     * @param membersName 售电公司名称
     */
    public void setMembersName(String membersName) {
        this.membersName = membersName == null ? null : membersName.trim();
    }

    /**
     * 获取代理零售用户数量
     *
     * @return PROXY_USER_COUNT - 代理零售用户数量
     */
    public Integer getProxyUserCount() {
        return proxyUserCount;
    }

    /**
     * 设置代理零售用户数量
     *
     * @param proxyUserCount 代理零售用户数量
     */
    public void setProxyUserCount(Integer proxyUserCount) {
        this.proxyUserCount = proxyUserCount;
    }

    /**
     * 获取代理零售用户用电量
     *
     * @return MO_USE_ENERGY - 代理零售用户用电量
     */
    public BigDecimal getMoUseEnergy() {
        return moUseEnergy;
    }

    /**
     * 设置代理零售用户用电量
     *
     * @param moUseEnergy 代理零售用户用电量
     */
    public void setMoUseEnergy(BigDecimal moUseEnergy) {
        this.moUseEnergy = moUseEnergy;
    }

    /**
     * 获取合同购电量
     *
     * @return SELL_ENERGY_T - 合同购电量
     */
    public BigDecimal getSellEnergyT() {
        return sellEnergyT;
    }

    /**
     * 设置合同购电量
     *
     * @param sellEnergyT 合同购电量
     */
    public void setSellEnergyT(BigDecimal sellEnergyT) {
        this.sellEnergyT = sellEnergyT;
    }

    /**
     * 获取合同购电费
     *
     * @return SELL_FEE_T - 合同购电费
     */
    public BigDecimal getSellFeeT() {
        return sellFeeT;
    }

    /**
     * 设置合同购电费
     *
     * @param sellFeeT 合同购电费
     */
    public void setSellFeeT(BigDecimal sellFeeT) {
        this.sellFeeT = sellFeeT;
    }

    /**
     * 获取合同购电均价
     *
     * @return SELL_PRICE_T - 合同购电均价
     */
    public BigDecimal getSellPriceT() {
        return sellPriceT;
    }

    /**
     * 设置合同购电均价
     *
     * @param sellPriceT 合同购电均价
     */
    public void setSellPriceT(BigDecimal sellPriceT) {
        this.sellPriceT = sellPriceT;
    }

    /**
     * 获取市场价购电量
     *
     * @return MARK_PURCHASE_ENG - 市场价购电量
     */
    public BigDecimal getMarkPurchaseEng() {
        return markPurchaseEng;
    }

    /**
     * 设置市场价购电量
     *
     * @param markPurchaseEng 市场价购电量
     */
    public void setMarkPurchaseEng(BigDecimal markPurchaseEng) {
        this.markPurchaseEng = markPurchaseEng;
    }

    /**
     * 获取市场价购电费
     *
     * @return MARK_PURCHASE_FEE - 市场价购电费
     */
    public BigDecimal getMarkPurchaseFee() {
        return markPurchaseFee;
    }

    /**
     * 设置市场价购电费
     *
     * @param markPurchaseFee 市场价购电费
     */
    public void setMarkPurchaseFee(BigDecimal markPurchaseFee) {
        this.markPurchaseFee = markPurchaseFee;
    }

    /**
     * 获取市场价购均价
     *
     * @return MARK_PURCHASE_PRI - 市场价购均价
     */
    public BigDecimal getMarkPurchasePri() {
        return markPurchasePri;
    }

    /**
     * 设置市场价购均价
     *
     * @param markPurchasePri 市场价购均价
     */
    public void setMarkPurchasePri(BigDecimal markPurchasePri) {
        this.markPurchasePri = markPurchasePri;
    }

    /**
     * 获取超用结算电量
     *
     * @return OVER_USE_ENG - 超用结算电量
     */
    public BigDecimal getOverUseEng() {
        return overUseEng;
    }

    /**
     * 设置超用结算电量
     *
     * @param overUseEng 超用结算电量
     */
    public void setOverUseEng(BigDecimal overUseEng) {
        this.overUseEng = overUseEng;
    }

    /**
     * 获取超用结算电费
     *
     * @return OVER_USE_FEE - 超用结算电费
     */
    public BigDecimal getOverUseFee() {
        return overUseFee;
    }

    /**
     * 设置超用结算电费
     *
     * @param overUseFee 超用结算电费
     */
    public void setOverUseFee(BigDecimal overUseFee) {
        this.overUseFee = overUseFee;
    }

    /**
     * 获取超用结算均价
     *
     * @return OVER_USE_PRI - 超用结算均价
     */
    public BigDecimal getOverUsePri() {
        return overUsePri;
    }

    /**
     * 设置超用结算均价
     *
     * @param overUsePri 超用结算均价
     */
    public void setOverUsePri(BigDecimal overUsePri) {
        this.overUsePri = overUsePri;
    }

    /**
     * 获取偏差考核电量
     *
     * @return CHECKDEV_ENG - 偏差考核电量
     */
    public BigDecimal getCheckdevEng() {
        return checkdevEng;
    }

    /**
     * 设置偏差考核电量
     *
     * @param checkdevEng 偏差考核电量
     */
    public void setCheckdevEng(BigDecimal checkdevEng) {
        this.checkdevEng = checkdevEng;
    }

    /**
     * 获取偏差考核电费
     *
     * @return CHECKDEV_FEE - 偏差考核电费
     */
    public BigDecimal getCheckdevFee() {
        return checkdevFee;
    }

    /**
     * 设置偏差考核电费
     *
     * @param checkdevFee 偏差考核电费
     */
    public void setCheckdevFee(BigDecimal checkdevFee) {
        this.checkdevFee = checkdevFee;
    }

    /**
     * 获取偏差考核均价
     *
     * @return CHECKDEV_PRI - 偏差考核均价
     */
    public BigDecimal getCheckdevPri() {
        return checkdevPri;
    }

    /**
     * 设置偏差考核均价
     *
     * @param checkdevPri 偏差考核均价
     */
    public void setCheckdevPri(BigDecimal checkdevPri) {
        this.checkdevPri = checkdevPri;
    }

    /**
     * 获取零售电量
     *
     * @return USER_ENERGY_T - 零售电量
     */
    public BigDecimal getUserEnergyT() {
        return userEnergyT;
    }

    /**
     * 设置零售电量
     *
     * @param userEnergyT 零售电量
     */
    public void setUserEnergyT(BigDecimal userEnergyT) {
        this.userEnergyT = userEnergyT;
    }

    /**
     * 获取零售电费
     *
     * @return USER_FEE_T - 零售电费
     */
    public BigDecimal getUserFeeT() {
        return userFeeT;
    }

    /**
     * 设置零售电费
     *
     * @param userFeeT 零售电费
     */
    public void setUserFeeT(BigDecimal userFeeT) {
        this.userFeeT = userFeeT;
    }

    /**
     * 获取零售电均价
     *
     * @return USER_PRICE_T - 零售电均价
     */
    public BigDecimal getUserPriceT() {
        return userPriceT;
    }

    /**
     * 设置零售电均价
     *
     * @param userPriceT 零售电均价
     */
    public void setUserPriceT(BigDecimal userPriceT) {
        this.userPriceT = userPriceT;
    }

    /**
     * 获取代理用户偏差考核 电量
     *
     * @return PROXY_CHECK_ENG - 代理用户偏差考核 电量
     */
    public BigDecimal getProxyCheckEng() {
        return proxyCheckEng;
    }

    /**
     * 设置代理用户偏差考核 电量
     *
     * @param proxyCheckEng 代理用户偏差考核 电量
     */
    public void setProxyCheckEng(BigDecimal proxyCheckEng) {
        this.proxyCheckEng = proxyCheckEng;
    }

    /**
     * 获取代理用户偏差考核 电费
     *
     * @return PROXY_CHECK_FEE - 代理用户偏差考核 电费
     */
    public BigDecimal getProxyCheckFee() {
        return proxyCheckFee;
    }

    /**
     * 设置代理用户偏差考核 电费
     *
     * @param proxyCheckFee 代理用户偏差考核 电费
     */
    public void setProxyCheckFee(BigDecimal proxyCheckFee) {
        this.proxyCheckFee = proxyCheckFee;
    }

    /**
     * 获取代理用户偏差考核 均价
     *
     * @return PROXY_CHECK_PRI - 代理用户偏差考核 均价
     */
    public BigDecimal getProxyCheckPri() {
        return proxyCheckPri;
    }

    /**
     * 设置代理用户偏差考核 均价
     *
     * @param proxyCheckPri 代理用户偏差考核 均价
     */
    public void setProxyCheckPri(BigDecimal proxyCheckPri) {
        this.proxyCheckPri = proxyCheckPri;
    }

    /**
     * 获取服务费
     *
     * @return SERVICE_FEE - 服务费
     */
    public BigDecimal getServiceFee() {
        return serviceFee;
    }

    /**
     * 设置服务费
     *
     * @param serviceFee 服务费
     */
    public void setServiceFee(BigDecimal serviceFee) {
        this.serviceFee = serviceFee;
    }

    /**
     * 获取服务均价
     *
     * @return SERVICE_AVG_PRI - 服务均价
     */
    public BigDecimal getServiceAvgPri() {
        return serviceAvgPri;
    }

    /**
     * 设置服务均价
     *
     * @param serviceAvgPri 服务均价
     */
    public void setServiceAvgPri(BigDecimal serviceAvgPri) {
        this.serviceAvgPri = serviceAvgPri;
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