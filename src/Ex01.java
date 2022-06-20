import java.lang.reflect.Array;
import java.util.*;

public class Ex01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.toUpperCase(Locale.ROOT);
        int count = 0;

        String[] strNoBlank = str.split("");

        List<String> list = new ArrayList<String>(Arrays.asList(strNoBlank));
        System.out.println(list);

        for (int i = 0;i<list.size()-1;i++){
            if(list.get(i).equals(list.get(i+1))){

            }

        }

    }
}
