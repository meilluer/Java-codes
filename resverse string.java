import java.util.Scanner;
import java.lang.Math;
import java.util.*;

public class reverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String inp=sc.nextLine();
         List<Character> c = new ArrayList<>();
        for(char ch : inp.toCharArray()){
            c.add(ch);
        }
        int u = c.size(); 
        for(int i = u - 1; i >= 0; i--){ 
            System.out.print(c.get(i)); 
        }
    }
}
