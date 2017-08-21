package com.example.ftkj.greendao_test;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by FTKJ on 2017/8/21.
 */

@Entity
public class Son {
    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "USERNAME")
    private String name;

    private int age;

    private String address;

    @NotNull
    private long fatherId;


    @Generated(hash = 1301203313)
    public Son(Long id, String name, int age, String address, long fatherId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.fatherId = fatherId;
    }

    @Generated(hash = 1259336981)
    public Son() {
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

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public long getFatherId() {
        return this.fatherId;
    }

    public void setFatherId(long fatherId) {
        this.fatherId = fatherId;
    }

    @Override
    public String toString() {
        return "Son{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", fatherId=" + fatherId +
                '}';
    }
}
