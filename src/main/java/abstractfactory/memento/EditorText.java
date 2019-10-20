package abstractfactory.memento;

public class EditorText {

    private String text = "";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void addText(String text) {
        this.text += text;
    }

    public void restoreFromMemento(final EditorTextMemento memento) {
        this.text = memento.getText();
    }




}
