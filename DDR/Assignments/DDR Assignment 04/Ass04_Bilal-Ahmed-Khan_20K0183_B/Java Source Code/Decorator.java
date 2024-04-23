public interface TextDecorator extends TextProcessor {
    // Additional methods for decorators
}

public class BoldDecorator implements TextDecorator {
    private TextProcessor textProcessor;

    public BoldDecorator(TextProcessor textProcessor) {
        this.textProcessor = textProcessor;
    }

    public void process(String text) {
        textProcessor.process("<b>" + text + "</b>");
    }
}

public class ItalicDecorator implements TextDecorator {
    private TextProcessor textProcessor;

    public ItalicDecorator(TextProcessor textProcessor) {
        this.textProcessor = textProcessor;
    }

    public void process(String text) {
        textProcessor.process("<i>" + text + "</i>");
    }
}
