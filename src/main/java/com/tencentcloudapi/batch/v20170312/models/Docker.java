package com.tencentcloudapi.batch.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class Docker  extends AbstractModel{


    /**
    * Docker Hub 用户名或 Tencent Registry 用户名
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Docker Hub 密码或 Tencent Registry 密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Docker Hub 可以不填，但确保具有公网访问能力。或者是 Tencent Registry 服务地址“ccr.ccs.tencentyun.com”
    */
    @SerializedName("Server")
    @Expose
    private String Server;

    /**
    * Docker Hub填写“[user/repo]:[tag]”，Tencent Registry填写“ccr.ccs.tencentyun.com/[namespace/repo]:[tag]”
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
     * 获取Docker Hub 用户名或 Tencent Registry 用户名
     * @return User Docker Hub 用户名或 Tencent Registry 用户名
     */
    public String getUser() {
        return this.User;
    }

    /**
     * 设置Docker Hub 用户名或 Tencent Registry 用户名
     * @param User Docker Hub 用户名或 Tencent Registry 用户名
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * 获取Docker Hub 密码或 Tencent Registry 密码
     * @return Password Docker Hub 密码或 Tencent Registry 密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * 设置Docker Hub 密码或 Tencent Registry 密码
     * @param Password Docker Hub 密码或 Tencent Registry 密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * 获取Docker Hub 可以不填，但确保具有公网访问能力。或者是 Tencent Registry 服务地址“ccr.ccs.tencentyun.com”
     * @return Server Docker Hub 可以不填，但确保具有公网访问能力。或者是 Tencent Registry 服务地址“ccr.ccs.tencentyun.com”
     */
    public String getServer() {
        return this.Server;
    }

    /**
     * 设置Docker Hub 可以不填，但确保具有公网访问能力。或者是 Tencent Registry 服务地址“ccr.ccs.tencentyun.com”
     * @param Server Docker Hub 可以不填，但确保具有公网访问能力。或者是 Tencent Registry 服务地址“ccr.ccs.tencentyun.com”
     */
    public void setServer(String Server) {
        this.Server = Server;
    }

    /**
     * 获取Docker Hub填写“[user/repo]:[tag]”，Tencent Registry填写“ccr.ccs.tencentyun.com/[namespace/repo]:[tag]”
     * @return Image Docker Hub填写“[user/repo]:[tag]”，Tencent Registry填写“ccr.ccs.tencentyun.com/[namespace/repo]:[tag]”
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * 设置Docker Hub填写“[user/repo]:[tag]”，Tencent Registry填写“ccr.ccs.tencentyun.com/[namespace/repo]:[tag]”
     * @param Image Docker Hub填写“[user/repo]:[tag]”，Tencent Registry填写“ccr.ccs.tencentyun.com/[namespace/repo]:[tag]”
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Server", this.Server);
        this.setParamSimple(map, prefix + "Image", this.Image);

    }
}

