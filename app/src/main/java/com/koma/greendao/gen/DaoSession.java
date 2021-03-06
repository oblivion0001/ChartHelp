package com.koma.greendao.gen;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import me.skyrim.charthelp.dao.AffairBean;
import me.skyrim.charthelp.dao.WorkerBean;
import me.skyrim.charthelp.dao.DepartmentBean;

import com.koma.greendao.gen.AffairBeanDao;
import com.koma.greendao.gen.WorkerBeanDao;
import com.koma.greendao.gen.DepartmentBeanDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig affairBeanDaoConfig;
    private final DaoConfig workerBeanDaoConfig;
    private final DaoConfig departmentBeanDaoConfig;

    private final AffairBeanDao affairBeanDao;
    private final WorkerBeanDao workerBeanDao;
    private final DepartmentBeanDao departmentBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        affairBeanDaoConfig = daoConfigMap.get(AffairBeanDao.class).clone();
        affairBeanDaoConfig.initIdentityScope(type);

        workerBeanDaoConfig = daoConfigMap.get(WorkerBeanDao.class).clone();
        workerBeanDaoConfig.initIdentityScope(type);

        departmentBeanDaoConfig = daoConfigMap.get(DepartmentBeanDao.class).clone();
        departmentBeanDaoConfig.initIdentityScope(type);

        affairBeanDao = new AffairBeanDao(affairBeanDaoConfig, this);
        workerBeanDao = new WorkerBeanDao(workerBeanDaoConfig, this);
        departmentBeanDao = new DepartmentBeanDao(departmentBeanDaoConfig, this);

        registerDao(AffairBean.class, affairBeanDao);
        registerDao(WorkerBean.class, workerBeanDao);
        registerDao(DepartmentBean.class, departmentBeanDao);
    }
    
    public void clear() {
        affairBeanDaoConfig.clearIdentityScope();
        workerBeanDaoConfig.clearIdentityScope();
        departmentBeanDaoConfig.clearIdentityScope();
    }

    public AffairBeanDao getAffairBeanDao() {
        return affairBeanDao;
    }

    public WorkerBeanDao getWorkerBeanDao() {
        return workerBeanDao;
    }

    public DepartmentBeanDao getDepartmentBeanDao() {
        return departmentBeanDao;
    }

}
