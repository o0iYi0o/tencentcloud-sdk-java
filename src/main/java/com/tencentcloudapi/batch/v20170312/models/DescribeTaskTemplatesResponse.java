package com.tencentcloudapi.batch.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeTaskTemplatesResponse  extends AbstractModel{


    /**
    * 任务模板列表
    */
    @SerializedName("TaskTemplateSet")
    @Expose
    private TaskTemplateView [] TaskTemplateSet;

    /**
    * 任务模板数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取任务模板列表
     * @return TaskTemplateSet 任务模板列表
     */
    public TaskTemplateView [] getTaskTemplateSet() {
        return this.TaskTemplateSet;
    }

    /**
     * 设置任务模板列表
     * @param TaskTemplateSet 任务模板列表
     */
    public void setTaskTemplateSet(TaskTemplateView [] TaskTemplateSet) {
        this.TaskTemplateSet = TaskTemplateSet;
    }

    /**
     * 获取任务模板数量
     * @return TotalCount 任务模板数量
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置任务模板数量
     * @param TotalCount 任务模板数量
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @return RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @param RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TaskTemplateSet.", this.TaskTemplateSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

