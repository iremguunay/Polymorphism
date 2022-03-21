import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void addRandomNumber(ArrayList<Integer> arrList) {
        int originalSize = arrList.size();
        Random random = new Random();
        while (originalSize + 1 != arrList.size()) {
            int n = random.nextInt(1000);
            arrList.add(n);
        }
    }

    public static void main(String[] args) {

        //Example 2
        OddArrayList oddListy = new OddArrayList(7);
        oddListy.add(1);
        oddListy.add(2);
        addRandomNumber(oddListy);
        System.out.println(oddListy);

        ArrayList<Integer> listy = new ArrayList<>();
        listy.add(1);
        listy.add(2);
        addRandomNumber(listy);
        System.out.println(listy);

        //Example1
        OddArrayList oddList = new OddArrayList(1,2,3,4,7,9,-13);
        //System.out.println(oddList);

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(7);
        list.add(9);
        list.add(-13);

        //System.out.println(list);

    }
}
