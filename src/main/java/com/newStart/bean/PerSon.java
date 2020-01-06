package com.newStart.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;


/**
 * 将配置文件中的数据弄到类中来@ConfigurationProperties(prefix = "person")
 *
 *
 * */
@Component
@ConfigurationProperties(prefix = "person")
public class PerSon {
    private int age;
    private String name;
    private boolean isBoss;
    private Date brith;
    private Map<String,Object> maps;
    private List<Object> list;
    private Dog dog;

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "PerSon{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", isBoss=" + isBoss +
                ", brith=" + brith +
                ", maps=" + maps +
                ", list=" + list +
                ", dog=" + dog +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBoss(boolean boss) {
        isBoss = boss;
    }

    public void setBrith(Date brith) {
        this.brith = brith;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public boolean isBoss() {
        return isBoss;
    }

    public Date getBrith() {
        return brith;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public List<Object> getList() {
        return list;
    }

    public Dog getDog() {
        return dog;
    }


}
