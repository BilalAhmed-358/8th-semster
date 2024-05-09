public class Library {
    public void checkoutBook(Customer customer, Book book) {
        if (customer != null && customer.getFine() <= 0.0 &&
            customer.getCard() != null && customer.getCard().getExpiration() == null &&
            book != null && !book.isCheckedOut()) {
            customer.addBook(book);
            book.setCheckedOut(true);
        }
    }
}
