package com.yunkuo.cms.dao;

import com.yunkuo.cms.model.UserDO;

public interface UserDao {
    int deleteByPK(Integer id);

    int add(UserDO record);

    int insertSelective(UserDO record);

    UserDO queryByPK(Integer id);

    int update(UserDO record);

    int updateByPK(UserDO record);
}