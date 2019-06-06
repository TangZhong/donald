package com.flower.bean;

public class User implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -609395155603943819L;

    /** 用户唯一标识id */
    private Integer id;

    /** 用户名 */
    private String username;

    /** 密码 */
    private String password;

    /** 类型：1管理员，2普通用户... */
    private Integer type;

    /** 额外字段，可作为签名等字段 */
    private String extra;

    /** 微信小程序的用户唯一标识，用于判断用户是否注册 */
    private String openid;

    /** 手机号码 */
    private String phone;

    /**
     * 获取用户唯一标识id
     * 
     * @return 用户唯一标识id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * 设置用户唯一标识id
     * 
     * @param id
     *          用户唯一标识id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户名
     * 
     * @return 用户名
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * 设置用户名
     * 
     * @param username
     *          用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     * 
     * @return 密码
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * 设置密码
     * 
     * @param password
     *          密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取类型：1管理员，2普通用户...
     * 
     * @return 类型：1管理员
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * 设置类型：1管理员，2普通用户...
     * 
     * @param type
     *          类型：1管理员
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取额外字段，可作为签名等字段
     * 
     * @return 额外字段
     */
    public String getExtra() {
        return this.extra;
    }

    /**
     * 设置额外字段，可作为签名等字段
     * 
     * @param extra
     *          额外字段
     */
    public void setExtra(String extra) {
        this.extra = extra;
    }

    /**
     * 获取微信小程序的用户唯一标识，用于判断用户是否注册
     * 
     * @return 微信小程序的用户唯一标识
     */
    public String getOpenid() {
        return this.openid;
    }

    /**
     * 设置微信小程序的用户唯一标识，用于判断用户是否注册
     * 
     * @param openid
     *          微信小程序的用户唯一标识
     */
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * 获取手机号码
     * 
     * @return 手机号码
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * 设置手机号码
     * 
     * @param phone
     *          手机号码
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", type=" + type +
                ", extra='" + extra + '\'' +
                ", openid='" + openid + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}