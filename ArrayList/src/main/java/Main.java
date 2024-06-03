import java.util.ArrayList;



public class Main {


    public static void main(String[] args) {
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        numbers.add(25);
//        numbers.add(35);
//        System.out.println(numbers);

//        listnames.add("Olaide");
//        listnames.add("Hammed");
//        listnames.add("Ridwan");
//        listnames.add("Ayinde");
//        listnames.add("Abolore");
//        listnames.add("Redox");

//        System.out.println(listnames);
//        for (String list: listnames
//             ) {
//            System.out.println(list );
//        }
//        System.out.println(listnames.get(3));
//        listnames.remove(0);
//        System.out.println(listnames);

        ArrayList<IntWrapper> numbs = new ArrayList<>();
        numbs.add(new IntWrapper(10));
        numbs.add(new IntWrapper(20));
        numbs.add(new IntWrapper(30));
        numbs.add(new IntWrapper(40));
        numbs.add(new IntWrapper(50));
        System.out.println(numbs.get(4).getX());
    }
}
