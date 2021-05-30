import java.util.Arrays;
import java.util.List;

public class LamdaTest {
    public static void main(String[] args) {

    // 1. 기존 Java 7
    List<String> list = Arrays.asList("Apple", "Orange", "Banana");
    String str = "A boc of Oranges";

    boolean match = false;

        for(String s : list){
            if(str.contains(s)){
                match = true;
                break;
            }
        }
    System.out.println("match > " + match);

    // 2. Lamda Expression
    match = list.stream().anyMatch(s -> str.contains(s));
    System.out.println("match > " + match);

    //3. Method reference
    match = list.stream().allMatch(str::contains);
    System.out.println("match > " + match);

    }
}
