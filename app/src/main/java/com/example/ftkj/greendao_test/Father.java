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

    private String address;

    private String newaddress;

    private String new2address;

    private String new3address;





    @Generated(hash = 1021719366)
    public Father(Long id, String name, int age, String address, String newaddress, String new2address,
            String new3address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.newaddress = newaddress;
        this.new2address = new2address;
        this.new3address = new3address;
    }



    @Generated(hash = 383274692)
    public Father() {
    }


    public Father(Long id, String name, int age, String newaddress, String new2address, String new3address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.newaddress = newaddress;
        this.new2address = new2address;
        this.new3address = new3address;
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

    @Override
    public String toString() {
        return "Father{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", newaddress='" + newaddress + '\'' +
                ", new2address='" + new2address + '\'' +
                ", new3address='" + new3address + '\'' +
                '}';
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







    public String getAddress() {
        return this.address;
    }



    public void setAddress(String address) {
        this.address = address;
    }



    public String getNewaddress() {
        return this.newaddress;
    }



    public void setNewaddress(String newaddress) {
        this.newaddress = newaddress;
    }



    public String getNew2address() {
        return this.new2address;
    }



    public void setNew2address(String new2address) {
        this.new2address = new2address;
    }



    public String getNew3address() {
        return this.new3address;
    }



    public void setNew3address(String new3address) {
        this.new3address = new3address;
    }



    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 6472366)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getFatherDao() : null;
    }
}
