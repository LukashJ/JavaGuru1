package OopWeek2;

public class Task3ClassBookConstr {

    public static void main (String [] args) {
        BookNew book1 = new BookNew("Лев Толстой", 1865, "Война и мир", 1000 );
        BookNew book2 = new BookNew("Александр Пушкин", 1825, "Евгений Онегин", 200);
        BookNew book3 = new BookNew("Николай Гоголь", 1842, "Мертвые души", 300);

        System.out.println(book1.getAuthorBook()+ " " + book1.getYearBook()+ " " + book1.getTitleBook()+ " " + book1.getNumbersPages());
        System.out.println(book2.getAuthorBook()+ " " + book2.getYearBook()+ " " + book2.getTitleBook()+ " " + book2.getNumbersPages());
        System.out.println(book3.getAuthorBook()+ " " + book3.getYearBook()+ " " + book3.getTitleBook()+ " " + book3.getNumbersPages());
    }
}

class BookNew {
    private String authorBook;
    private int yearBook;
    private String titleBook;
    private int numbersPages;

    public BookNew(String authorBook, int yearBook, String titleBook, int numbersPages) {
        this.authorBook=authorBook;
        this.yearBook=yearBook;
        this.titleBook=titleBook;
        this.numbersPages=numbersPages;
    }

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
