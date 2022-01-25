package com.annabelle.launch.springboot.models;

public class ModelDemo {
    private String name;
    private String quote;
    private int id;
    private static int nextId =1;

    public ModelDemo(String name, String quote) {
        this();
        this.name = name;
        this.quote = quote;
    }

    public ModelDemo() {
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
