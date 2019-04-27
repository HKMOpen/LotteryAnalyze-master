package com.fph.lotteryanalyze.db;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.fph.lotteryanalyze.db.DltLotteryEntity;
import com.fph.lotteryanalyze.db.LotteryEntity;

import com.fph.lotteryanalyze.db.DltLotteryEntityDao;
import com.fph.lotteryanalyze.db.LotteryEntityDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig dltLotteryEntityDaoConfig;
    private final DaoConfig lotteryEntityDaoConfig;

    private final DltLotteryEntityDao dltLotteryEntityDao;
    private final LotteryEntityDao lotteryEntityDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        dltLotteryEntityDaoConfig = daoConfigMap.get(DltLotteryEntityDao.class).clone();
        dltLotteryEntityDaoConfig.initIdentityScope(type);

        lotteryEntityDaoConfig = daoConfigMap.get(LotteryEntityDao.class).clone();
        lotteryEntityDaoConfig.initIdentityScope(type);

        dltLotteryEntityDao = new DltLotteryEntityDao(dltLotteryEntityDaoConfig, this);
        lotteryEntityDao = new LotteryEntityDao(lotteryEntityDaoConfig, this);

        registerDao(DltLotteryEntity.class, dltLotteryEntityDao);
        registerDao(LotteryEntity.class, lotteryEntityDao);
    }
    
    public void clear() {
        dltLotteryEntityDaoConfig.clearIdentityScope();
        lotteryEntityDaoConfig.clearIdentityScope();
    }

    public DltLotteryEntityDao getDltLotteryEntityDao() {
        return dltLotteryEntityDao;
    }

    public LotteryEntityDao getLotteryEntityDao() {
        return lotteryEntityDao;
    }

}
