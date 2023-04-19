import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class A{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       String p="",d="";
       int v=0;
        int num1=1000;
        int num2=1;
        int j=(int)(Math.random()*(num1-num2-8)-num2);
        int b= (int)(Math.random()*(num1-num2-8)-num2);
        v=b;
        String s="qwertyuioplkjgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM";
        int len=s.length();
        Random r=new Random();
       char c = s.charAt(r.nextInt(len));
     d=c+"";
       String k="/.,~!@#$%^&:?><";
       int l=k.length();
       char u=k.charAt(r.nextInt(l));
      p=u+"";
       String m=p+d+v;
       List<Character> chars = new ArrayList<Character>();
        for(char c1 : m.toCharArray()){
            chars.add(c1);
        }
       Collections.shuffle(chars);
        StringBuilder sb = new StringBuilder();
        for(char c1 : chars){
            sb.append(c1);
        }
        String shuffledString = sb.toString();
         System.out.println(shuffledString+j);
   
    }
}