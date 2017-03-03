package OopWeek3;



import java.util.*;


public class Task2ListString2 {

    public static void main (String [] args) {
        Map <String, Integer> map = new HashMap<String, Integer>();

        Scanner scanner = new Scanner (System.in);
        String stringFromConsol;
        do {
            stringFromConsol = scanner.nextLine();
            Integer freq = map.get(stringFromConsol);
            if (!(freq==null)) {
                map.put (stringFromConsol, freq+1);
            } else map.put(stringFromConsol, 1);
        } while (!stringFromConsol.equals(""));
            System.out.println(map);

        List list = new ArrayList(map.entrySet());
        Collections.sort(list, new Comparator() {

            public int compare(Object obj1, Object obj2) {
                Map.Entry ent1 = (Map.Entry) obj1;
                Map.Entry ent2 = (Map.Entry) obj2;
                Comparable c1 = (Comparable) ent1.getValue();
                Comparable c2 = (Comparable) ent2.getValue();
                    return c2.compareTo(c1);
            }
        });
        System.out.println(list);
    }
}
