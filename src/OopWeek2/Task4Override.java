package OopWeek2;


public class Task4Override {

    public static void main (String [] args) {
        BookNew4 book1 = new BookNew4("Лев Толстой", 1865, "Война и мир", 1000 );
        BookNew4 book2 = new BookNew4("Александр Пушкин", 1825, "Евгений Онегин", 200);
        BookNew4 book3 = new BookNew4("Николай Гоголь", 1842, "Мертвые души", 300);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

 // Вопрос!!! Почему переопределенный метод не срабатывает при вызове book1.toString() ???
 // Работает только System.out.println(book1), хотя по идее одно и тоже.


    }
}

class BookNew4 {
    private String authorBook;
    private int yearBook;
    private String titleBook;
    private int numbersPages;

    public BookNew4(String authorBook, int yearBook, String titleBook, int numbersPages) {
        this.authorBook=authorBook;
        this.yearBook=yearBook;
        this.titleBook=titleBook;
        this.numbersPages=numbersPages;
    }

    @Override
    public String toString() {
        return authorBook + ", " + titleBook + ", " + yearBook + ", " + numbersPages;
    }
}
