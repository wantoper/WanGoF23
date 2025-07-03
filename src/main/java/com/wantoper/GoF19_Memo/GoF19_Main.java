package com.wantoper.GoF19_Memo;

public class GoF19_Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Caretaker caretaker = new Caretaker();

        editor.setText("第一次输入内容");
        caretaker.save(editor);
        System.out.println("当前内容: " + editor.getText());

        editor.setText("第二次输入内容");
        caretaker.save(editor);
        System.out.println("当前内容: " + editor.getText());

        editor.setText("第三次输入内容");
        System.out.println("当前内容: " + editor.getText());

        caretaker.undo(editor);
        System.out.println("撤销一次后内容: " + editor.getText());

        caretaker.undo(editor);
        System.out.println("再撤销一次后内容: " + editor.getText());
    }
}
