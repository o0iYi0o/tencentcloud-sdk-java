package com.tencentcloudapi.iot.v20180123.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class Rule  extends AbstractModel{


    /**
    * 规则Id
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * AppId
    */
    @SerializedName("AppId")
    @Expose
    private Integer AppId;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 查询
    */
    @SerializedName("Query")
    @Expose
    private RuleQuery Query;

    /**
    * 转发
    */
    @SerializedName("Actions")
    @Expose
    private Object [] Actions;

    /**
    * 已启动
    */
    @SerializedName("Active")
    @Expose
    private Integer Active;

    /**
    * 已删除
    */
    @SerializedName("Deleted")
    @Expose
    private Integer Deleted;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * 获取规则Id
     * @return RuleId 规则Id
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * 设置规则Id
     * @param RuleId 规则Id
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * 获取AppId
     * @return AppId AppId
     */
    public Integer getAppId() {
        return this.AppId;
    }

    /**
     * 设置AppId
     * @param AppId AppId
     */
    public void setAppId(Integer AppId) {
        this.AppId = AppId;
    }

    /**
     * 获取名称
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取描述
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取查询
     * @return Query 查询
     */
    public RuleQuery getQuery() {
        return this.Query;
    }

    /**
     * 设置查询
     * @param Query 查询
     */
    public void setQuery(RuleQuery Query) {
        this.Query = Query;
    }

    /**
     * 获取转发
     * @return Actions 转发
     */
    public Object [] getActions() {
        return this.Actions;
    }

    /**
     * 设置转发
     * @param Actions 转发
     */
    public void setActions(Object [] Actions) {
        this.Actions = Actions;
    }

    /**
     * 获取已启动
     * @return Active 已启动
     */
    public Integer getActive() {
        return this.Active;
    }

    /**
     * 设置已启动
     * @param Active 已启动
     */
    public void setActive(Integer Active) {
        this.Active = Active;
    }

    /**
     * 获取已删除
     * @return Deleted 已删除
     */
    public Integer getDeleted() {
        return this.Deleted;
    }

    /**
     * 设置已删除
     * @param Deleted 已删除
     */
    public void setDeleted(Integer Deleted) {
        this.Deleted = Deleted;
    }

    /**
     * 获取创建时间
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取更新时间
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * 设置更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "Query.", this.Query);
        this.setParamArrayObj(map, prefix + "Actions.", this.Actions);
        this.setParamSimple(map, prefix + "Active", this.Active);
        this.setParamSimple(map, prefix + "Deleted", this.Deleted);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

