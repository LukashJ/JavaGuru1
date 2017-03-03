package OopWeek4;

import java.io.IOException;

public class Task1OvertideEquals {

    public static void main (String [] args) {
        Book book1 = new Book("Лев Толстой", 1865, "Война и мир", 1000 );
        Book book2 = new Book("Александр Пушкин", 1825, "Евгений Онегин", 200);
        Book book3 = new Book("Николай Гоголь", 1842, "Мертвые души", 300);
        Book book4 = new Book("Александр Пушкин", 2016, "Евгений Онегин", 150);

        System.out.println ("книги "+ book1 + " и " + book3 + " одинаковы?");
        System.out.println(book1.equals(book3));
        System.out.println ("книги "+ book2 + " и " + book4 + " одинаковы?");
        System.out.println(book2.equals(book4));
        System.out.println(book2.equals(23));
    }
}

class Book {
    private String authorBook;
    private int yearBook;
    private String titleBook;
    private int numbersPages;

    public Book(String authorBook, int yearBook, String titleBook, int numbersPages) {
        this.authorBook = authorBook;
        this.yearBook = yearBook;
        this.titleBook = titleBook;
        this.numbersPages = numbersPages;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public int getYearBook() {
        return yearBook;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public int getNumbersPages() {
        return numbersPages;
    }

    @Override
    public String toString() {
        return authorBook + ", " + titleBook + ", " + yearBook + ", " + numbersPages;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
