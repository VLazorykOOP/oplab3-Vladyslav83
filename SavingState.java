public class SavingState implements EditorState {
    @Override
    public void handle(TextEditor editor) {
        System.out.println("Editor is saving the document.");
    }
}
