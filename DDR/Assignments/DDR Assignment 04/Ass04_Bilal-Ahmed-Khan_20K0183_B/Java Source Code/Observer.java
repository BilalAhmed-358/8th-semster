public interface TextObserver {
    void update(String result);
}

public class UIComponent implements TextObserver {
    public void update(String result) {
        // Update UI with the processed text result
    }
}

public class TextProcessorSubject {
    private List<TextObserver> observers = new ArrayList<>();

    public void attach(TextObserver observer) {
        observers.add(observer);
    }

    public void detach(TextObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String result) {
        for (TextObserver observer : observers) {
            observer.update(result);
        }
    }
}
