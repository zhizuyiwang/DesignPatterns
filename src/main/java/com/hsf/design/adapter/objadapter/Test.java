package com.hsf.design.adapter.objadapter;

import com.hsf.design.adapter.classadapter.Adapter;
import com.hsf.design.adapter.classadapter.ConcreteTarget;

public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
