package com.yourname.digitallibrary;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Создаем книги
        Book book1 = new Book("1984", "George Orwell", "123456789");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "987654321");

        // Регистрируем пользователей
        LibraryUser user1 = new LibraryUser("Alice", "U001");
        LibraryUser user2 = new LibraryUser("Bob", "U002");

        // Добавляем книги и пользователей в библиотеку
        library.addBook(book1);
        library.addBook(book2);
        library.registerUser(user1);
        library.registerUser(user2);

        // Вывод данных на консоль
        library.displayBooks();
        library.displayUsers();
    }
}