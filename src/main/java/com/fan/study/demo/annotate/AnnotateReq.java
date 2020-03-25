package com.fan.study.demo.annotate;


public class AnnotateReq {

    @CheckReq(length = 3, message = "姓名不能为空且需要小于等于3个字符")
    private String name;

    @CheckReq(min = 1, message = "年龄需要大于等于1")
    private int age;

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
}
