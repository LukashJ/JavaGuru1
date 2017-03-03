package OopWeek2;


public class Task2ClassBook {

    public static void main (String [] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        book1.setAuthorBook("Лев Толстой");
        book1.setYearBook(1865);
        book1.setTitleBook("Война и мир");
        book1.setNumbersPages(1000);

        book2.setAuthorBook("Александр Пушкин");
        book2.setYearBook(1825);
        book2.setTitleBook("Евгений Онегин");
        book2.setNumbersPages(200);

        book3.setAuthorBook("Николай Гоголь");
        book3.setYearBook(1842);
        book3.setTitleBook("Мертвые души");
        book3.setNumbersPages(300);

        System.out.println(book1.getAuthorBook()+ " " + book1.getYearBook()+ " " + book1.getTitleBook()+ " " + book1.getNumbersPages());
        System.out.println(book2.getAuthorBook()+ " " + book2.getYearBook()+ " " + book2.getTitleBook()+ " " + book2.getNumbersPages());
        System.out.println(book3.getAuthorBook()+ " " + book3.getYearBook()+ " " + book3.getTitleBook()+ " " + book3.getNumbersPages());
    }
}

class Book {
    private String authorBook;
    private int yearBook;
    private String titleBook;
    private int numbersPages;

public String getAuthorBook() {
    return authorBook;
}

public void setAuthorBook (String authorBook) {
    this.authorBook=authorBook;
}

public int getYearBook() {
     return yearBook;
    }

public void setYearBook (int yearBook){
    this.yearBook=yearBook;
    }

public String getTitleBook() {
        return titleBook;
    }

public void setTitleBook (String titleBook) {
        this.titleBook=titleBook;
    }

public int getNumbersPages() {
        return numbersPages;
    }

public void setNumbersPages (int numbersPages) {
        this.numbersPages=numbersPages;
    }
}
