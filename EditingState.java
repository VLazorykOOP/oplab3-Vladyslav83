public class EditingState implements EditorState {
    @Override
    public void handle(TextEditor editor) {
        System.out.println("Editor is in editing mode.");
    }
}
