package com.hsf.design.adapter.objadapter;


public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concrete目标方法");
    }
}
