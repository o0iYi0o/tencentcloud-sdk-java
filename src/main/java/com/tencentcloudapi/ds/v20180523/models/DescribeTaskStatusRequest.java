package com.tencentcloudapi.ds.v20180523.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeTaskStatusRequest  extends AbstractModel{


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
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private Integer TaskId;

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
     * 获取任务ID
     * @return TaskId 任务ID
     */
    public Integer getTaskId() {
        return this.TaskId;
    }

    /**
     * 设置任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(Integer TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

