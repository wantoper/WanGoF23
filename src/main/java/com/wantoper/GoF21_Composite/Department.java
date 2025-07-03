package com.wantoper.GoF21_Composite;

import java.util.ArrayList;
import java.util.List;

// 容器节点：部门
public class Department extends CompanyComponent {
    private List<CompanyComponent> children = new ArrayList<>();
    public Department(String name) {
        super(name);
    }
    @Override
    public void show(int depth) {
        System.out.println("-".repeat(depth) + name);
        for (CompanyComponent c : children) {
            c.show(depth + 2);
        }
    }
    @Override
    public void add(CompanyComponent component) {
        children.add(component);
    }
    @Override
    public void remove(CompanyComponent component) {
        children.remove(component);
    }
}

