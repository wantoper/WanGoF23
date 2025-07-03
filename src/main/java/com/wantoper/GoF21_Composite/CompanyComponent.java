package com.wantoper.GoF21_Composite;

// 抽象组件
public abstract class CompanyComponent {
    protected String name;
    public CompanyComponent(String name) {
        this.name = name;
    }
    public abstract void show(int depth);
    public void add(CompanyComponent component) {
        throw new UnsupportedOperationException();
    }
    public void remove(CompanyComponent component) {
        throw new UnsupportedOperationException();
    }
}

