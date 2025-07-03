package com.wantoper.GoF21_Composite;

// 叶子节点：员工
public class Employee extends CompanyComponent {
    public Employee(String name) {
        super(name);
    }
    @Override
    public void show(int depth) {
        System.out.println("-".repeat(depth) + name);
    }
}

