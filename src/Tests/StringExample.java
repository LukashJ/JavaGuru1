package Tests;

public class StringExample {
    public static void main(String[] args) {
        StringBuilder habr = new StringBuilder("habrahabr");
        // получить длину строки
        int length = habr.length();
        // теперь можно узнать есть ли символ символ 'h' в "habrahabr"
        int temp;
        char searchChar = 'h';
        for (int i = 0; i < length; ++i) {
  //          habr.setCharAt(i, (habr.charAt(i)));
            temp = (int)habr.charAt(i)+10;
            System.out.println (temp);
            System.out.println ((char)(temp-10));

            }
        System.out.println (habr);
    }

    }


