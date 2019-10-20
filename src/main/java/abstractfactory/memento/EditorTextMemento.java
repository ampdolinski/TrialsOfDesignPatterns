package abstractfactory.memento;

public class EditorTextMemento {

    private String text;

    public EditorTextMemento(EditorText editorText) {
        this.text = editorText.getText();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
