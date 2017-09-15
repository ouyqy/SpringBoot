package com.avalon.bean;

/**
 * Created by ouyqy on 2017/9/15.
 */
public class DemoObj {
    private String id;
    private String name;

    public DemoObj() {
    }

    public DemoObj(String id, String name) {

        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
