package OopWeek1;


public class Task5ConcatTime {

    public static void main(String[] args) {
        String string = new String("123");
        stringTime(string);
        StringBuilder stringBuilder = new StringBuilder("123");
        stringBuilderTime(stringBuilder);
        StringBuffer stringBuffer = new StringBuffer("123");
        stringBufferTime(stringBuffer);
    }

    private static void stringTime (String s){
        long before = System.nanoTime();
            for (int i = 0; i < 100000; i++) {
                s=s.concat("qwerty");
            }
        long after = System.nanoTime();
        System.out.println("time String: " + (after - before)/1000000 + "ms.");
    }

    private static void stringBuilderTime (StringBuilder s){
        long before = System.nanoTime();
            for (int i = 0; i < 100000; i++) {
                s=s.append("qwerty");
            }
        long after = System.nanoTime();
        System.out.println("time StringBuilder: " + (after - before)/1000000 + "ms.");
    }

    private static void stringBufferTime (StringBuffer s){
        long before = System.nanoTime();
            for (int i = 0; i < 100000; i++) {
                s=s.append("qwerty");
            }
        long after = System.nanoTime();
        System.out.println("time StringBuffer: " + (after - before)/1000000 + "ms.");
    }
}
