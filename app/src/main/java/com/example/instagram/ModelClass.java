package com.example.instagram;

public class ModelClass {
    private String name;
    private String instaid ;

    public ModelClass(String name, String instaid) {
        this.name = name;
        this.instaid = instaid;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstaid() {
        return instaid;
    }

    public void setInstaid(String instaid) {
        this.instaid = instaid;
    }
}
