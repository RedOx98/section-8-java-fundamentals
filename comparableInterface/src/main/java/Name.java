public class Name implements Comparable<Name>{
    private String name;

    public Name(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Name obj) {
        if (name.length() == obj.name.length()){
            return 0;
        } else if (name.length() > obj.name.length()) {
            return -1;
        }else {
            return 1;
        }
    }
}