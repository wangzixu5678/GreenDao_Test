package com.example.ftkj.greendao_test;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.ToMany;

import java.util.List;
import org.greenrobot.greendao.DaoException;

/**
 * Created by FTKJ on 2017/8/21.
 */

@Entity
public class Father{
    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "FATHERNAME")
    private String name;

    private int age;

    @ToMany(referencedJoinProperty = "fatherId")
    private List<Son> sons;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated(hash = 442328359)
    private transient FatherDao myDao;




    @Generated(hash = 398136730)
    public Father(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }



    @Generated(hash = 383274692)
    public Father() {
    }

   

    @Override
    public String toString() {
        return "Father{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



    public Long getId() {
        return this.id;
    }



    public void setId(Long id) {
        this.id = id;
    }



    public String getName() {
        return this.name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public int getAge() {
        return this.age;
    }



    public void setAge(int age) {
        this.age = age;
    }



    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */
    @Generated(hash = 1176254786)
    public List<Son> getSons() {
        if (sons == null) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            SonDao targetDao = daoSession.getSonDao();
            List<Son> sonsNew = targetDao._queryFather_Sons(id);
            synchronized (this) {
                if (sons == null) {
                    sons = sonsNew;
                }
            }
        }
        return sons;
    }



    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated(hash = 593492452)
    public synchronized void resetSons() {
        sons = null;
    }



    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }



    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }



    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }



    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 6472366)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getFatherDao() : null;
    }
}