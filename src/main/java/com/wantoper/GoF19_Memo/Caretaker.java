package com.wantoper.GoF19_Memo;

import java.util.Stack;

public class Caretaker {
    private Stack<EditorMemento> history = new Stack<>();

    public void save(Editor editor) {
        history.push(editor.save());
    }

    public void undo(Editor editor) {
        if (!history.isEmpty()) {
            editor.restore(history.pop());
        }
    }
}

