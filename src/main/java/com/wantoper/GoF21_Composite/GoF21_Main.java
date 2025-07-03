package com.wantoper.GoF21_Composite;

public class GoF21_Main {
    public static void main(String[] args) {
        Department root = new Department("总公司");
        Department devDept = new Department("研发部");
        Department hrDept = new Department("人事部");
        Employee e1 = new Employee("张三");
        Employee e2 = new Employee("李四");
        Employee e3 = new Employee("王五");
        Employee e4 = new Employee("赵六");
        devDept.add(e1);
        devDept.add(e2);
        hrDept.add(e3);
        root.add(devDept);
        root.add(hrDept);
        root.add(e4); // 总公司直属员工
        root.show(1);
    }
}
