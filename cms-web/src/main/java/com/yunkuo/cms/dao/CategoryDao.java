package com.yunkuo.cms.dao;

import com.yunkuo.cms.model.CategoryDO;

public interface CategoryDao {
    int deleteByPK(Integer id);

    int add(CategoryDO record);

    int insertSelective(CategoryDO record);

    CategoryDO queryByPK(Integer id);

    int update(CategoryDO record);

    int updateByPK(CategoryDO record);
}