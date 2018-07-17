package com.git.wscp.domain;

/**
 * User: wzb
 * Date: 2018/7/14
 * Time: 21:30
 * Version: 1.0
 * Description:
 */
public class Persion {
    private String id;
    private String name;
    private int age;

    public Persion(String id, String name, int age) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persion{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
