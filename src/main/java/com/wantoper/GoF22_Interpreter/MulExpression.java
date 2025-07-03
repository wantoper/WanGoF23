package com.wantoper.GoF22_Interpreter;

public class MulExpression implements Expression {
    private Expression left, right;

    public MulExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() * right.interpret();
    }
}

