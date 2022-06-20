import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;

        ArrayList<String> list = new ArrayList<>(Arrays.asList("c=","dz=","d-","lj","nj","s=","z="));

        for(int i = 0;i< list.size();i++){
           if(str.contains(list.get(i))){
               str = str.replaceFirst(list.get(i), " ");
               System.out.println("for문 " + (i+1) +"번쨰 :" + list.get(i));

               count++;
           }

        }
        str = str.replaceAll(" ","");
        System.out.println("str : " + str);
        count = count + str.length();
        System.out.println(count);
    }
}
