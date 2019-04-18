package com.hsf.design.adapter.classadapter;

import com.hsf.design.adapter.objadapter.Target;

public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
