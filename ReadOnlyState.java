public class ReadOnlyState implements EditorState {
    @Override
    public void handle(TextEditor editor) {
        System.out.println("Editor is in read-only mode.");
    }
}
