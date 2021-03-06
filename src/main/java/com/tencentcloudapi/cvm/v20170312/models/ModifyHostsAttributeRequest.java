package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ModifyHostsAttributeRequest  extends AbstractModel{


    /**
    * 一个或多个待操作的CDH实例ID。
    */
    @SerializedName("HostIds")
    @Expose
    private String [] HostIds;

    /**
    * CDH实例显示名称。可任意命名，但不得超过60个字符。
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 自动续费标识。取值范围：<br><li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费<br><li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费<br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费<br><br>若该参数指定为NOTIFY_AND_AUTO_RENEW，在账户余额充足的情况下，实例到期后将按月自动续费。
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
     * 获取一个或多个待操作的CDH实例ID。
     * @return HostIds 一个或多个待操作的CDH实例ID。
     */
    public String [] getHostIds() {
        return this.HostIds;
    }

    /**
     * 设置一个或多个待操作的CDH实例ID。
     * @param HostIds 一个或多个待操作的CDH实例ID。
     */
    public void setHostIds(String [] HostIds) {
        this.HostIds = HostIds;
    }

    /**
     * 获取CDH实例显示名称。可任意命名，但不得超过60个字符。
     * @return HostName CDH实例显示名称。可任意命名，但不得超过60个字符。
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * 设置CDH实例显示名称。可任意命名，但不得超过60个字符。
     * @param HostName CDH实例显示名称。可任意命名，但不得超过60个字符。
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * 获取自动续费标识。取值范围：<br><li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费<br><li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费<br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费<br><br>若该参数指定为NOTIFY_AND_AUTO_RENEW，在账户余额充足的情况下，实例到期后将按月自动续费。
     * @return RenewFlag 自动续费标识。取值范围：<br><li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费<br><li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费<br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费<br><br>若该参数指定为NOTIFY_AND_AUTO_RENEW，在账户余额充足的情况下，实例到期后将按月自动续费。
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * 设置自动续费标识。取值范围：<br><li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费<br><li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费<br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费<br><br>若该参数指定为NOTIFY_AND_AUTO_RENEW，在账户余额充足的情况下，实例到期后将按月自动续费。
     * @param RenewFlag 自动续费标识。取值范围：<br><li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费<br><li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费<br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费<br><br>若该参数指定为NOTIFY_AND_AUTO_RENEW，在账户余额充足的情况下，实例到期后将按月自动续费。
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "HostIds.", this.HostIds);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);

    }
}

