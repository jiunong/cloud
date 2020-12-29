package com.sict.cloud.user.dao;

import com.sict.cloud.user.model.UsersBO;

public interface UsersDao {
    int deleteByPrimaryKey(String id);

    int insert(UsersBO record);

    int insertSelective(UsersBO record);

    UsersBO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UsersBO record);

    int updateByPrimaryKey(UsersBO record);
}