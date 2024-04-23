public interface TextComponent {
    void process(String text);
}

public class BasicTextComponent implements TextComponent {
    public void process(String text) {
        // Process basic text
    }
}

public class CompositeTextComponent implements TextComponent {
    private List<TextComponent> components = new ArrayList<>();

    public void addComponent(TextComponent component) {
        components.add(component);
    }

    public void removeComponent(TextComponent component) {
        components.remove(component);
    }

    public void process(String text) {
        for (TextComponent component : components) {
            component.process(text);
        }
    }
}
