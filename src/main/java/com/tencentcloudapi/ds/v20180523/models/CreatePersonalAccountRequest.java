package com.tencentcloudapi.ds.v20180523.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CreatePersonalAccountRequest  extends AbstractModel{


    /**
    * 模块名
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 个人用户姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 个人用户证件类型。0代表身份证
    */
    @SerializedName("IdentType")
    @Expose
    private Integer IdentType;

    /**
    * 个人用户证件号码
    */
    @SerializedName("IdentNo")
    @Expose
    private String IdentNo;

    /**
    * 个人用户手机号
    */
    @SerializedName("MobilePhone")
    @Expose
    private String MobilePhone;

    /**
     * 获取模块名
     * @return Module 模块名
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * 设置模块名
     * @param Module 模块名
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * 获取操作名
     * @return Operation 操作名
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * 设置操作名
     * @param Operation 操作名
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * 获取个人用户姓名
     * @return Name 个人用户姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置个人用户姓名
     * @param Name 个人用户姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取个人用户证件类型。0代表身份证
     * @return IdentType 个人用户证件类型。0代表身份证
     */
    public Integer getIdentType() {
        return this.IdentType;
    }

    /**
     * 设置个人用户证件类型。0代表身份证
     * @param IdentType 个人用户证件类型。0代表身份证
     */
    public void setIdentType(Integer IdentType) {
        this.IdentType = IdentType;
    }

    /**
     * 获取个人用户证件号码
     * @return IdentNo 个人用户证件号码
     */
    public String getIdentNo() {
        return this.IdentNo;
    }

    /**
     * 设置个人用户证件号码
     * @param IdentNo 个人用户证件号码
     */
    public void setIdentNo(String IdentNo) {
        this.IdentNo = IdentNo;
    }

    /**
     * 获取个人用户手机号
     * @return MobilePhone 个人用户手机号
     */
    public String getMobilePhone() {
        return this.MobilePhone;
    }

    /**
     * 设置个人用户手机号
     * @param MobilePhone 个人用户手机号
     */
    public void setMobilePhone(String MobilePhone) {
        this.MobilePhone = MobilePhone;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IdentType", this.IdentType);
        this.setParamSimple(map, prefix + "IdentNo", this.IdentNo);
        this.setParamSimple(map, prefix + "MobilePhone", this.MobilePhone);

    }
}

