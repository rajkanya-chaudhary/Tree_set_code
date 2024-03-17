import java.util.*;

public class Treeset_code {
    public static void main(String[] args) {
        // Creating a TreeSet of Integers
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);

        // Creating an iterator for the TreeSet
        Iterator<Integer> itr = treeSet.iterator();

        // Iterating over the TreeSet and printing its elements
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
