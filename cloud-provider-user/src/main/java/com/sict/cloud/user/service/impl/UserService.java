package com.sict.cloud.user.service.impl;

import com.sict.cloud.user.dao.UsersDao;
import com.sict.cloud.user.model.UsersBO;
import com.sict.cloud.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author xuhong.ding
 * @since 2020/12/29 9:23
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private UsersDao usersDao;

    @Override
    public int deleteByPrimaryKey(String id) {
        return usersDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UsersBO record) {
        return 0;
    }

    @Override
    public int insertSelective(UsersBO record) {
        return 0;
    }

    @Override
    public UsersBO selectByPrimaryKey(String id) {
        return usersDao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UsersBO record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(UsersBO record) {
        return 0;
    }
}
