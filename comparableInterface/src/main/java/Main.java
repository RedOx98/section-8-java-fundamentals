import java.util.LinkedList;
import java.util.List;



public class Main {

    public static void main(String[] args) {
        List<Object> elements = new LinkedList<>();
        elements.add(new Name("Olaide"));
        elements.add(new Name("Hamm"));
        elements.add(new Name("Redux"));
        elements.add(new Name("Ay"));
        elements.add(new Name("Abo"));
        System.out.println(elements);

        elements.sort(null);
        System.out.println(elements);
    }
}
