public class Library {
    public void checkoutBook(Customer customer, Book book) {
        if (customer.canCheckout(book)) {
            customer.checkout(book);
        }
    }
}

public class Customer {
    private double fine;
    private Card card;
    private List<Book> books;

    public boolean canCheckout(Book book) {
        return fine <= 0.0 && card != null && card.getExpiration() == null && book != null && !book.isCheckedOut();
    }

    public void checkout(Book book) {
        books.add(book);
        book.setCheckedOut(true);
    }
}
