import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        OddArrayList oddList = new OddArrayList(1,2,3,4,7,9,-13);
        System.out.println(oddList);

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(7);
        list.add(9);
        list.add(-13);

        System.out.println(list);

    }
}
