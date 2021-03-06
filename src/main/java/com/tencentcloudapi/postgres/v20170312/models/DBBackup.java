package com.tencentcloudapi.postgres.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DBBackup  extends AbstractModel{


    /**
    * 备份文件唯一标识
    */
    @SerializedName("Id")
    @Expose
    private Integer Id;

    /**
    * 文件生成的开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 文件生成的结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 文件大小(K)
    */
    @SerializedName("Size")
    @Expose
    private Integer Size;

    /**
    * 策略（0-实例备份；1-多库备份）
    */
    @SerializedName("Strategy")
    @Expose
    private Integer Strategy;

    /**
    * 类型（0-定时；1-临时）
    */
    @SerializedName("Way")
    @Expose
    private Integer Way;

    /**
    * 备份方式（1-完整；2-日志；3-差异）
    */
    @SerializedName("Type")
    @Expose
    private Integer Type;

    /**
    * 状态（0-创建中；1-成功；2-失败）
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

    /**
    * DB列表
    */
    @SerializedName("DbList")
    @Expose
    private String [] DbList;

    /**
    * 内网下载地址
    */
    @SerializedName("InternalAddr")
    @Expose
    private String InternalAddr;

    /**
    * 外网下载地址
    */
    @SerializedName("ExternalAddr")
    @Expose
    private String ExternalAddr;

    /**
     * 获取备份文件唯一标识
     * @return Id 备份文件唯一标识
     */
    public Integer getId() {
        return this.Id;
    }

    /**
     * 设置备份文件唯一标识
     * @param Id 备份文件唯一标识
     */
    public void setId(Integer Id) {
        this.Id = Id;
    }

    /**
     * 获取文件生成的开始时间
     * @return StartTime 文件生成的开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置文件生成的开始时间
     * @param StartTime 文件生成的开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取文件生成的结束时间
     * @return EndTime 文件生成的结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置文件生成的结束时间
     * @param EndTime 文件生成的结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 获取文件大小(K)
     * @return Size 文件大小(K)
     */
    public Integer getSize() {
        return this.Size;
    }

    /**
     * 设置文件大小(K)
     * @param Size 文件大小(K)
     */
    public void setSize(Integer Size) {
        this.Size = Size;
    }

    /**
     * 获取策略（0-实例备份；1-多库备份）
     * @return Strategy 策略（0-实例备份；1-多库备份）
     */
    public Integer getStrategy() {
        return this.Strategy;
    }

    /**
     * 设置策略（0-实例备份；1-多库备份）
     * @param Strategy 策略（0-实例备份；1-多库备份）
     */
    public void setStrategy(Integer Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * 获取类型（0-定时；1-临时）
     * @return Way 类型（0-定时；1-临时）
     */
    public Integer getWay() {
        return this.Way;
    }

    /**
     * 设置类型（0-定时；1-临时）
     * @param Way 类型（0-定时；1-临时）
     */
    public void setWay(Integer Way) {
        this.Way = Way;
    }

    /**
     * 获取备份方式（1-完整；2-日志；3-差异）
     * @return Type 备份方式（1-完整；2-日志；3-差异）
     */
    public Integer getType() {
        return this.Type;
    }

    /**
     * 设置备份方式（1-完整；2-日志；3-差异）
     * @param Type 备份方式（1-完整；2-日志；3-差异）
     */
    public void setType(Integer Type) {
        this.Type = Type;
    }

    /**
     * 获取状态（0-创建中；1-成功；2-失败）
     * @return Status 状态（0-创建中；1-成功；2-失败）
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置状态（0-创建中；1-成功；2-失败）
     * @param Status 状态（0-创建中；1-成功；2-失败）
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取DB列表
     * @return DbList DB列表
     */
    public String [] getDbList() {
        return this.DbList;
    }

    /**
     * 设置DB列表
     * @param DbList DB列表
     */
    public void setDbList(String [] DbList) {
        this.DbList = DbList;
    }

    /**
     * 获取内网下载地址
     * @return InternalAddr 内网下载地址
     */
    public String getInternalAddr() {
        return this.InternalAddr;
    }

    /**
     * 设置内网下载地址
     * @param InternalAddr 内网下载地址
     */
    public void setInternalAddr(String InternalAddr) {
        this.InternalAddr = InternalAddr;
    }

    /**
     * 获取外网下载地址
     * @return ExternalAddr 外网下载地址
     */
    public String getExternalAddr() {
        return this.ExternalAddr;
    }

    /**
     * 设置外网下载地址
     * @param ExternalAddr 外网下载地址
     */
    public void setExternalAddr(String ExternalAddr) {
        this.ExternalAddr = ExternalAddr;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamSimple(map, prefix + "Way", this.Way);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "DbList.", this.DbList);
        this.setParamSimple(map, prefix + "InternalAddr", this.InternalAddr);
        this.setParamSimple(map, prefix + "ExternalAddr", this.ExternalAddr);

    }
}

