package com.wantoper.GoF22_Interpreter;

public class GoF22_Main {
    public static void main(String[] args) {
        // 构建表达式：(7 + 3) * (5 - 2)
        Expression expr = new MulExpression(
                new AddExpression(new NumberExpression(7), new NumberExpression(3)),
                new SubExpression(new NumberExpression(5), new NumberExpression(2))
        );
        int result = expr.interpret();
        System.out.println("(7 + 3) * (5 - 2) = " + result);
    }
}
