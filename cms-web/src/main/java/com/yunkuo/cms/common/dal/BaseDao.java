package com.yunkuo.cms.common.dal;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by kevon on 13-12-7.
 */
public abstract interface BaseDao<T>
{
    public abstract int insertData(T paramT);

    //public abstract int deleteDataByPK(Object paramObject);

    public abstract int deleteData(T paramT);

    public abstract int updateData(T paramT);

    public abstract int updateDataByPK(T paramT);

    public abstract Object queryObjectByPK(Object paramObject);

    public abstract int queryForInt(T paramT);

    public abstract List<T> queryForListAll();

    public abstract List<T> queryForList(T paramT, int paramInt1, int paramInt2);

   // public abstract PaginationBean<T> queryForListByPagination(T paramT, Page paramPage);

    public abstract T queryObject(T paramT);

    public abstract List<T> queryForList(T paramT);
}
