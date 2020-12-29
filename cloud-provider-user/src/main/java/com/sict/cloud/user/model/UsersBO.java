package com.sict.cloud.user.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.ToString;

/**
 * users
 * @author  d
 */
@Data
@ToString
public class UsersBO implements Serializable {
    /**
     * 用户id
     */
    private String id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码密文
     */
    private String password;

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 用户手机
     */
    private String mobile;

    /**
     * 简介
     */
    private String description;

    /**
     * 是否已删除Y：已删除，N：未删除
     */
    private String deleted;

    /**
     * 是否有效用户
     */
    private Boolean enabled;

    /**
     * 账号是否未过期
     */
    private Boolean accountNonExpired;

    /**
     * 密码是否未过期
     */
    private Boolean credentialsNonExpired;

    /**
     * 是否未锁定
     */
    private Boolean accountNonLocked;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 更新时间
     */
    private Date updatedTime;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 更新人
     */
    private String updatedBy;

    private static final long serialVersionUID = 1L;
}