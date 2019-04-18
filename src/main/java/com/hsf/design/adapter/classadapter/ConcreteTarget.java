package com.hsf.design.adapter.classadapter;


import com.hsf.design.adapter.objadapter.Target;

public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concrete目标方法");
    }
}
