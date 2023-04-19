import java.lang.Math;
import java.util.Scanner;
import java.util.*;
public class game{
    public static void main(String[] args){
        System.out.println("Guess the number in 3 attempts!");
        int a=1000;
        int b=100;
        int input =0;
        int count=3;
        Scanner sc=new Scanner(System.in);
        int ran= new Random().nextInt(a-b+1)+b;
        System.out.println(ran);
        while(count!=0){
            System.out.println("Guess the number ");
            input=sc.nextInt();
            if(ran==input){
                System.out.println("Correct!");
                break;
            }
            count--;
            System.out.println("Wrong! try again "+count+ " attempts left!");
        }
        if(count==0){
            System.out.println("Retry No attempts left");
        }
        
    }
}