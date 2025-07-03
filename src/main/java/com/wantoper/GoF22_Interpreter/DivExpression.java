package com.wantoper.GoF22_Interpreter;

public class DivExpression implements Expression {
    private Expression left, right;

    public DivExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() / right.interpret();
    }
}

