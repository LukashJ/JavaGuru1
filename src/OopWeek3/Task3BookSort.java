
package OopWeek3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Task3BookSort {

    public static void main(String[] args) throws IOException {
        ArrayList <Book> bookList = new ArrayList<Book>();
        getBooks(bookList);

        Scanner scanner = new Scanner(System.in);
            System.out.println("Please select Sort order:");
            System.out.println("author - a, year - y, title - t, numbers pages - p, without sort - others symbols");
        String sortSelect = scanner.nextLine();

        switch (sortSelect) {
            case "a":
                AuthorBookCompare authorBookCompare = new AuthorBookCompare();
                Collections.sort(bookList, authorBookCompare);
                break;
            case "y":
                YearBookCompare yearBookCompare = new YearBookCompare();
                Collections.sort(bookList, yearBookCompare);
                break;
            case "t":
                TitleBookCompare titleBookCompare = new TitleBookCompare();
                Collections.sort(bookList, titleBookCompare);
                break;
            case "p":
                NumbersPagesCompare numbersPagesCompare = new NumbersPagesCompare();
                Collections.sort(bookList, numbersPagesCompare);
                break;
        }
        for (Book b : bookList) System.out.println(b);
    }

        static void getBooks(ArrayList list) throws IOException {
            File file = new File ("/Users/sergejs/IdeaProjects/JavaGuru1/src/OopWeek3/TestB.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader (fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                addBook(line, list);
            }
        }

        static void addBook (String bookString, ArrayList list) {
            String [] bookTag = bookString.split(",");
            Book nextBook = new Book(bookTag[0], bookTag[1], bookTag[2], Integer.parseInt(bookTag[3]));
            list.add(nextBook);
        }

    }


    class Book {
        private String authorBook;
        private String titleBook;
        private String yearBook;
        private int numbersPages;

        public Book(String authorBook, String titleBook, String yearBook, int numbersPages) {
            this.authorBook = authorBook;
            this.yearBook = yearBook;
            this.titleBook = titleBook;
            this.numbersPages = numbersPages;
        }

        @Override
        public String toString() {
            return authorBook + ", " + titleBook + ", " + yearBook + ", " + numbersPages;
        }

        public String getAuthorBook() {
            return authorBook;
        }

        public String getYearBook() {
            return yearBook;
        }

        public String getTitleBook() {
            return titleBook;
        }

        public int getNumbersPages() {
            return numbersPages;
        }
    }

    class AuthorBookCompare implements Comparator <Book> {
        public int compare (Book one, Book two) {
            return one.getAuthorBook().compareTo(two.getAuthorBook());
        }
    }

    class YearBookCompare implements Comparator <Book> {
        public int compare (Book one, Book two) {
            return one.getYearBook().compareTo(two.getYearBook());
        }
    }

    class TitleBookCompare implements Comparator <Book> {
        public int compare (Book one, Book two) {
            return one.getTitleBook().compareTo(two.getTitleBook());
        }
    }

    class NumbersPagesCompare implements Comparator <Book> {
        public int compare (Book one, Book two) {
            if (one.getNumbersPages()>=two.getNumbersPages()){
                return 1;
            } else {
                return -1;
            }
        }
    }