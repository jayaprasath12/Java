import java.util.HashMap;

public class HashMapExample {
    public static void main(String a[]) {
        HashMap<String, String> hm = new HashMap<>();

        hm.put("1", "FIRST");
        hm.put("2", "SECOND");
        hm.put("3", "THIRD");
        hm.put("4", null);   
        hm.put(null, "FIFTH"); 

        System.out.println("HashMap is: " + hm);

        System.out.println("Value of 1: " + hm.get("1"));

        System.out.println("Is HashMap empty? " + hm.isEmpty());

        hm.remove("2");
        System.out.println("After removal process, the HashMap is: " + hm);

        System.out.println("Size of the HashMap: " + hm.size());
    }
}
