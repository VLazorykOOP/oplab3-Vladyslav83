public class ItalicTextDecorator implements TextComponent {
    private TextComponent textComponent;

    public ItalicTextDecorator(TextComponent textComponent) {
        this.textComponent = textComponent;
    }

    @Override
    public String getText() {
        return "<i>" + textComponent.getText() + "</i>";
    }
}
