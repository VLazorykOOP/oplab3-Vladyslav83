public class BoldTextDecorator implements TextComponent {
    private TextComponent textComponent;

    public BoldTextDecorator(TextComponent textComponent) {
        this.textComponent = textComponent;
    }

    @Override
    public String getText() {
        return "<b>" + textComponent.getText() + "</b>";
    }
}
