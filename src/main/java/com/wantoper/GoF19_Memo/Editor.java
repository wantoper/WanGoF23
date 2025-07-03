package com.wantoper.GoF19_Memo;

public class Editor {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public EditorMemento save() {
        return new EditorMemento(text);
    }

    public void restore(EditorMemento memento) {
        this.text = memento.getText();
    }
}

