package Lab4;

import java.util.List;

class Visitor{
    private final String name;
    private final String surname;
    private final String phone;
    private final boolean subscribed;
    private final List<Book> favoriteBooks;

    public Visitor(String name, String surname, String phone, boolean subscribed, List<Book> favoriteBooks) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.subscribed = subscribed;
        this.favoriteBooks = favoriteBooks;
    }

    public String getName() {
        return name;
    }

    public List<Book> getFavoriteBooks() {
        return favoriteBooks;
    }

    public boolean isSubscribed() {
        return subscribed;
    }

    public String getPhone() {
        return phone;
    }

    public String getSurname() {
        return surname;
    }
}
