package com.hsf.design.adapter.objadapter;

public class Adapter implements Target {
    private Adaptee adaptee = new Adaptee();
    @Override
    public void request() {
        adaptee.adapterRequest();
    }
}
