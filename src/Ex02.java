import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;

        ArrayList<String> list = new ArrayList<>(Arrays.asList("c=","c-", "dz=", "d-", "lj", "nj", "s=", "z="));

        for (int i = 0; i < list.size(); i++) {
            while (true){
                if (str.contains(list.get(i))) {
                    str = str.replaceFirst(list.get(i), " ");
                    count++;
                }else break;
            }
        }
            str = str.replaceAll(" ", "");
            count = count + str.length();
            System.out.println(count);
    }
}