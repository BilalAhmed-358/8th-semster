
public interface TextProcessor {
    void process(String text);
}

public class Parser implements TextProcessor {
    public void process(String text) {
        // Parse the text
    }
}

public class Formatter implements TextProcessor {
    public void process(String text) {
        // Format the text
    }
}

public class Analyzer implements TextProcessor {
    public void process(String text) {
        // Analyze the text
    }
}

public class TextProcessorFactory {
    public TextProcessor createProcessor(String type) {
        switch (type) {
            case "parser":
                return new Parser();
            case "formatter":
                return new Formatter();
            case "analyzer":
                return new Analyzer();
            default:
                throw new IllegalArgumentException("Invalid processor type");
        }
    }
}
