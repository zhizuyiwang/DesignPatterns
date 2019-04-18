package com.hsf.design.adapter.classadapter;

import com.hsf.design.adapter.objadapter.Target;

public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.adapterRequest();

    }
}
