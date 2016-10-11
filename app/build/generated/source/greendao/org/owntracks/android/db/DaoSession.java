package org.owntracks.android.db;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import org.owntracks.android.db.Waypoint;

import org.owntracks.android.db.WaypointDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig waypointDaoConfig;

    private final WaypointDao waypointDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        waypointDaoConfig = daoConfigMap.get(WaypointDao.class).clone();
        waypointDaoConfig.initIdentityScope(type);

        waypointDao = new WaypointDao(waypointDaoConfig, this);

        registerDao(Waypoint.class, waypointDao);
    }
    
    public void clear() {
        waypointDaoConfig.getIdentityScope().clear();
    }

    public WaypointDao getWaypointDao() {
        return waypointDao;
    }

}
