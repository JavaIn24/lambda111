package Task1;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);

        Sum summOf = (n) -> n % 2 == 0;
        System.out.println(sumItnegerList(numbers, summOf));
    }

    public static int sumItnegerList (List<Integer> listExamp, Sum sum){
        int result = 0;
        for (int i: listExamp) {
            if (sum.isEven(i)){
                result+=i;
            }
        }
        return result;
    }
}

interface Sum {
    boolean isEven (int a);
}
