public class Main {
    public static void main(String[] args) {
        // Singleton
        TextEditor editor = TextEditor.getInstance();

        // State
        EditorState editing = new EditingState();
        EditorState saving = new SavingState();
        EditorState readOnly = new ReadOnlyState();

        // Setting states
        editing.handle(editor);
        saving.handle(editor);
        readOnly.handle(editor);

        // Decorator
        TextComponent plainText = new PlainText("Hello, World!");
        TextComponent boldText = new BoldTextDecorator(plainText);
        TextComponent italicText = new ItalicTextDecorator(boldText);

        // Display text
        editor.display(plainText.getText());
        editor.display(boldText.getText());
        editor.display(italicText.getText());
    }
}
