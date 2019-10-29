package com.until.po;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "st_generator_purchase_info")
public class StGeneratorPurchaseInfo {
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
     * 结算单元ID
     */
    @Column(name = "BUSIUNIT_ID")
    private String busiunitId;

    /**
     * 结算单元名称
     */
    @Column(name = "BUSIUNIT_NAME")
    private String busiunitName;

    /**
     * 明细类别   0 电量,1 电价,2 电费
     */
    @Column(name = "DETAIL_TYPE")
    private Integer detailType;

    /**
     * 总上网电量合计
     */
    @Column(name = "ONGRID_ENG_T")
    private BigDecimal ongridEngT;

    /**
     * 基数电量
     */
    @Column(name = "BASE_ENG")
    private BigDecimal baseEng;

    /**
     * 市场化电量
     */
    @Column(name = "MARKET_ENG")
    private BigDecimal marketEng;

    /**
     * 调试电量
     */
    @Column(name = "DEBUG_ENG")
    private BigDecimal debugEng;

    /**
     * 试运行
     */
    @Column(name = "PILOT_RUN")
    private BigDecimal pilotRun;

    /**
     * 超发电量
     */
    @Column(name = "OVER_GENERATOR")
    private BigDecimal overGenerator;

    /**
     * 跨区跨省中长期交易
     */
    @Column(name = "KQKS_ML_TERM_TRADE")
    private BigDecimal kqksMlTermTrade;

    /**
     * 电力直接交易
     */
    @Column(name = "DIRECT_TRADE")
    private BigDecimal directTrade;

    /**
     * 发电权交易
     */
    @Column(name = "RIGHTS_TRADE")
    private BigDecimal rightsTrade;

    /**
     * 合同转让
     */
    @Column(name = "CONTRACT_TRANSFER")
    private BigDecimal contractTransfer;

    /**
     * 抽水招标交易
     */
    @Column(name = "CS_BID_TRADE")
    private BigDecimal csBidTrade;

    /**
     * 预挂牌
     */
    @Column(name = "ADVANCE_LISTING")
    private BigDecimal advanceListing;

    /**
     * 辅助服务交易
     */
    @Column(name = "ASSIST_TRADE")
    private BigDecimal assistTrade;

    /**
     * 配额交易
     */
    @Column(name = "QUOTA_TRADE")
    private BigDecimal quotaTrade;

    /**
     * 其他交易
     */
    @Column(name = "OTHER_TRADE")
    private BigDecimal otherTrade;

    /**
     * 可再生能源证书交易
     */
    @Column(name = "RENEW_CRET_TRADE")
    private BigDecimal renewCretTrade;

    /**
     * 现货结算电量
     */
    @Column(name = "SPOT_ENERGY")
    private BigDecimal spotEnergy;

    /**
     * 现货结算电价
     */
    @Column(name = "SPOT_PRICE")
    private BigDecimal spotPrice;

    /**
     * 现货结算电费
     */
    @Column(name = "SPOT_FEE")
    private BigDecimal spotFee;

    /**
     * 市场化偏差考核电费
     */
    @Column(name = "MARK_CHECKDEV_FEE")
    private BigDecimal markCheckdevFee;

    /**
     * 容量电费
     */
    @Column(name = "CAP_FEE")
    private BigDecimal capFee;

    /**
     * 并网考核电费
     */
    @Column(name = "ONGRID_CHECK_FEE")
    private BigDecimal ongridCheckFee;

    /**
     * 其他电费
     */
    @Column(name = "OTHER_FEE")
    private BigDecimal otherFee;

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
     * 获取结算单元ID
     *
     * @return BUSIUNIT_ID - 结算单元ID
     */
    public String getBusiunitId() {
        return busiunitId;
    }

    /**
     * 设置结算单元ID
     *
     * @param busiunitId 结算单元ID
     */
    public void setBusiunitId(String busiunitId) {
        this.busiunitId = busiunitId == null ? null : busiunitId.trim();
    }

    /**
     * 获取结算单元名称
     *
     * @return BUSIUNIT_NAME - 结算单元名称
     */
    public String getBusiunitName() {
        return busiunitName;
    }

    /**
     * 设置结算单元名称
     *
     * @param busiunitName 结算单元名称
     */
    public void setBusiunitName(String busiunitName) {
        this.busiunitName = busiunitName == null ? null : busiunitName.trim();
    }

    /**
     * 获取明细类别   0 电量,1 电价,2 电费
     *
     * @return DETAIL_TYPE - 明细类别   0 电量,1 电价,2 电费
     */
    public Integer getDetailType() {
        return detailType;
    }

    /**
     * 设置明细类别   0 电量,1 电价,2 电费
     *
     * @param detailType 明细类别   0 电量,1 电价,2 电费
     */
    public void setDetailType(Integer detailType) {
        this.detailType = detailType;
    }

    /**
     * 获取总上网电量合计
     *
     * @return ONGRID_ENG_T - 总上网电量合计
     */
    public BigDecimal getOngridEngT() {
        return ongridEngT;
    }

    /**
     * 设置总上网电量合计
     *
     * @param ongridEngT 总上网电量合计
     */
    public void setOngridEngT(BigDecimal ongridEngT) {
        this.ongridEngT = ongridEngT;
    }

    /**
     * 获取基数电量
     *
     * @return BASE_ENG - 基数电量
     */
    public BigDecimal getBaseEng() {
        return baseEng;
    }

    /**
     * 设置基数电量
     *
     * @param baseEng 基数电量
     */
    public void setBaseEng(BigDecimal baseEng) {
        this.baseEng = baseEng;
    }

    /**
     * 获取市场化电量
     *
     * @return MARKET_ENG - 市场化电量
     */
    public BigDecimal getMarketEng() {
        return marketEng;
    }

    /**
     * 设置市场化电量
     *
     * @param marketEng 市场化电量
     */
    public void setMarketEng(BigDecimal marketEng) {
        this.marketEng = marketEng;
    }

    /**
     * 获取调试电量
     *
     * @return DEBUG_ENG - 调试电量
     */
    public BigDecimal getDebugEng() {
        return debugEng;
    }

    /**
     * 设置调试电量
     *
     * @param debugEng 调试电量
     */
    public void setDebugEng(BigDecimal debugEng) {
        this.debugEng = debugEng;
    }

    /**
     * 获取试运行
     *
     * @return PILOT_RUN - 试运行
     */
    public BigDecimal getPilotRun() {
        return pilotRun;
    }

    /**
     * 设置试运行
     *
     * @param pilotRun 试运行
     */
    public void setPilotRun(BigDecimal pilotRun) {
        this.pilotRun = pilotRun;
    }

    /**
     * 获取超发电量
     *
     * @return OVER_GENERATOR - 超发电量
     */
    public BigDecimal getOverGenerator() {
        return overGenerator;
    }

    /**
     * 设置超发电量
     *
     * @param overGenerator 超发电量
     */
    public void setOverGenerator(BigDecimal overGenerator) {
        this.overGenerator = overGenerator;
    }

    /**
     * 获取跨区跨省中长期交易
     *
     * @return KQKS_ML_TERM_TRADE - 跨区跨省中长期交易
     */
    public BigDecimal getKqksMlTermTrade() {
        return kqksMlTermTrade;
    }

    /**
     * 设置跨区跨省中长期交易
     *
     * @param kqksMlTermTrade 跨区跨省中长期交易
     */
    public void setKqksMlTermTrade(BigDecimal kqksMlTermTrade) {
        this.kqksMlTermTrade = kqksMlTermTrade;
    }

    /**
     * 获取电力直接交易
     *
     * @return DIRECT_TRADE - 电力直接交易
     */
    public BigDecimal getDirectTrade() {
        return directTrade;
    }

    /**
     * 设置电力直接交易
     *
     * @param directTrade 电力直接交易
     */
    public void setDirectTrade(BigDecimal directTrade) {
        this.directTrade = directTrade;
    }

    /**
     * 获取发电权交易
     *
     * @return RIGHTS_TRADE - 发电权交易
     */
    public BigDecimal getRightsTrade() {
        return rightsTrade;
    }

    /**
     * 设置发电权交易
     *
     * @param rightsTrade 发电权交易
     */
    public void setRightsTrade(BigDecimal rightsTrade) {
        this.rightsTrade = rightsTrade;
    }

    /**
     * 获取合同转让
     *
     * @return CONTRACT_TRANSFER - 合同转让
     */
    public BigDecimal getContractTransfer() {
        return contractTransfer;
    }

    /**
     * 设置合同转让
     *
     * @param contractTransfer 合同转让
     */
    public void setContractTransfer(BigDecimal contractTransfer) {
        this.contractTransfer = contractTransfer;
    }

    /**
     * 获取抽水招标交易
     *
     * @return CS_BID_TRADE - 抽水招标交易
     */
    public BigDecimal getCsBidTrade() {
        return csBidTrade;
    }

    /**
     * 设置抽水招标交易
     *
     * @param csBidTrade 抽水招标交易
     */
    public void setCsBidTrade(BigDecimal csBidTrade) {
        this.csBidTrade = csBidTrade;
    }

    /**
     * 获取预挂牌
     *
     * @return ADVANCE_LISTING - 预挂牌
     */
    public BigDecimal getAdvanceListing() {
        return advanceListing;
    }

    /**
     * 设置预挂牌
     *
     * @param advanceListing 预挂牌
     */
    public void setAdvanceListing(BigDecimal advanceListing) {
        this.advanceListing = advanceListing;
    }

    /**
     * 获取辅助服务交易
     *
     * @return ASSIST_TRADE - 辅助服务交易
     */
    public BigDecimal getAssistTrade() {
        return assistTrade;
    }

    /**
     * 设置辅助服务交易
     *
     * @param assistTrade 辅助服务交易
     */
    public void setAssistTrade(BigDecimal assistTrade) {
        this.assistTrade = assistTrade;
    }

    /**
     * 获取配额交易
     *
     * @return QUOTA_TRADE - 配额交易
     */
    public BigDecimal getQuotaTrade() {
        return quotaTrade;
    }

    /**
     * 设置配额交易
     *
     * @param quotaTrade 配额交易
     */
    public void setQuotaTrade(BigDecimal quotaTrade) {
        this.quotaTrade = quotaTrade;
    }

    /**
     * 获取其他交易
     *
     * @return OTHER_TRADE - 其他交易
     */
    public BigDecimal getOtherTrade() {
        return otherTrade;
    }

    /**
     * 设置其他交易
     *
     * @param otherTrade 其他交易
     */
    public void setOtherTrade(BigDecimal otherTrade) {
        this.otherTrade = otherTrade;
    }

    /**
     * 获取可再生能源证书交易
     *
     * @return RENEW_CRET_TRADE - 可再生能源证书交易
     */
    public BigDecimal getRenewCretTrade() {
        return renewCretTrade;
    }

    /**
     * 设置可再生能源证书交易
     *
     * @param renewCretTrade 可再生能源证书交易
     */
    public void setRenewCretTrade(BigDecimal renewCretTrade) {
        this.renewCretTrade = renewCretTrade;
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
     * 获取容量电费
     *
     * @return CAP_FEE - 容量电费
     */
    public BigDecimal getCapFee() {
        return capFee;
    }

    /**
     * 设置容量电费
     *
     * @param capFee 容量电费
     */
    public void setCapFee(BigDecimal capFee) {
        this.capFee = capFee;
    }

    /**
     * 获取并网考核电费
     *
     * @return ONGRID_CHECK_FEE - 并网考核电费
     */
    public BigDecimal getOngridCheckFee() {
        return ongridCheckFee;
    }

    /**
     * 设置并网考核电费
     *
     * @param ongridCheckFee 并网考核电费
     */
    public void setOngridCheckFee(BigDecimal ongridCheckFee) {
        this.ongridCheckFee = ongridCheckFee;
    }

    /**
     * 获取其他电费
     *
     * @return OTHER_FEE - 其他电费
     */
    public BigDecimal getOtherFee() {
        return otherFee;
    }

    /**
     * 设置其他电费
     *
     * @param otherFee 其他电费
     */
    public void setOtherFee(BigDecimal otherFee) {
        this.otherFee = otherFee;
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