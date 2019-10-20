package pl.sdacademy.designpatterns.abstractfactory.memento;

public class MementoDemo {

    public static void main(String[] args) {

        EditorTextMementoManager manager = new EditorTextMementoManager();

        EditorText editorText = new EditorText();

        editorText.addText("HEY HEY HEY\n");
        manager.save(new EditorTextMemento(editorText));
        editorText.addText("DESIGN PATTERNS ARE COOL\n");
        manager.save(new EditorTextMemento(editorText));
        editorText.addText("IT'S ALL A JOKE... " +
                "MOTHER, FORGIVE ME...\n");
        manager.save(new EditorTextMemento(editorText));
        editorText.addText("This should not be displayed later\n");

        System.out.println(editorText.getText());
        manager.restore();
        editorText.restoreFromMemento(manager.restore());
        System.out.println(editorText.getText());

    }

}
