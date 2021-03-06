package com.tencentcloudapi.partners.v20180321.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class RebateInfoElem  extends AbstractModel{


    /**
    * 代理商账号ID
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 返佣月份，如2018-02
    */
    @SerializedName("RebateMonth")
    @Expose
    private String RebateMonth;

    /**
    * 返佣金额，单位分
    */
    @SerializedName("Amt")
    @Expose
    private Integer Amt;

    /**
    * 月度业绩，单位分
    */
    @SerializedName("MonthSales")
    @Expose
    private Integer MonthSales;

    /**
    * 季度业绩，单位分
    */
    @SerializedName("QuarterSales")
    @Expose
    private Integer QuarterSales;

    /**
    * NORMAL(正常)/HAS_OVERDUE_BILL(欠费)/NO_CONTRACT(缺合同)
    */
    @SerializedName("ExceptionFlag")
    @Expose
    private String ExceptionFlag;

    /**
     * 获取代理商账号ID
     * @return Uin 代理商账号ID
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * 设置代理商账号ID
     * @param Uin 代理商账号ID
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * 获取返佣月份，如2018-02
     * @return RebateMonth 返佣月份，如2018-02
     */
    public String getRebateMonth() {
        return this.RebateMonth;
    }

    /**
     * 设置返佣月份，如2018-02
     * @param RebateMonth 返佣月份，如2018-02
     */
    public void setRebateMonth(String RebateMonth) {
        this.RebateMonth = RebateMonth;
    }

    /**
     * 获取返佣金额，单位分
     * @return Amt 返佣金额，单位分
     */
    public Integer getAmt() {
        return this.Amt;
    }

    /**
     * 设置返佣金额，单位分
     * @param Amt 返佣金额，单位分
     */
    public void setAmt(Integer Amt) {
        this.Amt = Amt;
    }

    /**
     * 获取月度业绩，单位分
     * @return MonthSales 月度业绩，单位分
     */
    public Integer getMonthSales() {
        return this.MonthSales;
    }

    /**
     * 设置月度业绩，单位分
     * @param MonthSales 月度业绩，单位分
     */
    public void setMonthSales(Integer MonthSales) {
        this.MonthSales = MonthSales;
    }

    /**
     * 获取季度业绩，单位分
     * @return QuarterSales 季度业绩，单位分
     */
    public Integer getQuarterSales() {
        return this.QuarterSales;
    }

    /**
     * 设置季度业绩，单位分
     * @param QuarterSales 季度业绩，单位分
     */
    public void setQuarterSales(Integer QuarterSales) {
        this.QuarterSales = QuarterSales;
    }

    /**
     * 获取NORMAL(正常)/HAS_OVERDUE_BILL(欠费)/NO_CONTRACT(缺合同)
     * @return ExceptionFlag NORMAL(正常)/HAS_OVERDUE_BILL(欠费)/NO_CONTRACT(缺合同)
     */
    public String getExceptionFlag() {
        return this.ExceptionFlag;
    }

    /**
     * 设置NORMAL(正常)/HAS_OVERDUE_BILL(欠费)/NO_CONTRACT(缺合同)
     * @param ExceptionFlag NORMAL(正常)/HAS_OVERDUE_BILL(欠费)/NO_CONTRACT(缺合同)
     */
    public void setExceptionFlag(String ExceptionFlag) {
        this.ExceptionFlag = ExceptionFlag;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "RebateMonth", this.RebateMonth);
        this.setParamSimple(map, prefix + "Amt", this.Amt);
        this.setParamSimple(map, prefix + "MonthSales", this.MonthSales);
        this.setParamSimple(map, prefix + "QuarterSales", this.QuarterSales);
        this.setParamSimple(map, prefix + "ExceptionFlag", this.ExceptionFlag);

    }
}

