public class TextEditor {
    private static TextEditor instance;

    private TextEditor() {}

    public static TextEditor getInstance() {
        if (instance == null) {
            instance = new TextEditor();
        }
        return instance;
    }

    public void display(String text) {
        System.out.println(text);
    }
}
