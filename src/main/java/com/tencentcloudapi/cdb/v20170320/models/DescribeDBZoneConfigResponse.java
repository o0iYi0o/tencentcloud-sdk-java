package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeDBZoneConfigResponse  extends AbstractModel{


    /**
    * 可售卖地域配置数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * 可售卖地域配置详情
    */
    @SerializedName("Items")
    @Expose
    private RegionSellConf [] Items;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取可售卖地域配置数量
     * @return TotalCount 可售卖地域配置数量
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置可售卖地域配置数量
     * @param TotalCount 可售卖地域配置数量
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取可售卖地域配置详情
     * @return Items 可售卖地域配置详情
     */
    public RegionSellConf [] getItems() {
        return this.Items;
    }

    /**
     * 设置可售卖地域配置详情
     * @param Items 可售卖地域配置详情
     */
    public void setItems(RegionSellConf [] Items) {
        this.Items = Items;
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

