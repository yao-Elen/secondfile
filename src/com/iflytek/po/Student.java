package com.iflytek.po;

public class Student {
    private Integer id;
    private String name;
    private String age;
    private Integer sex;
    private String nature;

    public Student(Integer id, String name, String age, Integer sex, String nature) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.nature = nature;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

}
