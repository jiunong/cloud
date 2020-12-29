package com.sict.cloud.user.service;

import com.sict.cloud.user.model.UsersBO;

/**
 * TODO
 *
 * @author xuhong.ding
 * @since 2020/12/29 9:23
 */
public interface IUserService {
    int deleteByPrimaryKey(String id);

    int insert(UsersBO record);

    int insertSelective(UsersBO record);

    UsersBO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UsersBO record);

    int updateByPrimaryKey(UsersBO record);
}
