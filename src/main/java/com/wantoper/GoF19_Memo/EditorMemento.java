package com.wantoper.GoF19_Memo;

public class EditorMemento {
    private final String text;

    public EditorMemento(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}

