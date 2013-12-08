package com.yunkuo.cms.service.impl;

//import com.yunkuo.cms.mapper.CategoryMapper;
//import com.yunkuo.cms.model.Category;
import com.yunkuo.cms.dao.CategoryDao;
import com.yunkuo.cms.model.CategoryDO;
import com.yunkuo.cms.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Jin
 * Date: 13-11-30
 * Time: 下午11:02
 * To change this template use File | Settings | File Templates.
 */
/*@Repository(value = "categoryService")
@Transactional*/
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao dao;

    @Override
    public List<CategoryDO> getList() {
        return dao.queryForListAll();
    }
}
