package com.yunkuo.cms.dao.impl;

import com.yunkuo.cms.common.dal.BaseDaoImpl;
import com.yunkuo.cms.dao.CategoryDao;
import com.yunkuo.cms.model.CategoryDO;
import org.springframework.stereotype.Repository;

/**
 * Created by kevon on 13-12-8.
 */
@Repository("categoryDao")
public class CategoryDaoImpl<T extends CategoryDO> extends BaseDaoImpl<CategoryDO> implements CategoryDao<T>{
}
