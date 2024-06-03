import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Olaide");
        names.add("Hammed");
        names.add("Ridwan");
        names.add("Ayinde");
        names.add("Abolore");
        names.add("Redux");
        names.add("Redox");
//        System.out.println(names);
//        names.add(2,"Olajide");
//        System.out.println(names);

        List<String> word = new ArrayList<>();
        word.add("StudyEasy");
        word.add("Organization");
        word.add("StudyHard");
        new Main().printList(word);
        word.sort(null);
        System.out.println(word);
        Collections.reverse(word);
        System.out.println(word);


    }

    void printList(List<String> list){
        Iterator<String> data = list.listIterator();
        while (data.hasNext()){
            System.out.println(data.next());
        }
    }
}
