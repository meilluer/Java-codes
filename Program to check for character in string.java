import java.util.Scanner;
public class xyz{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter string:");
        String k=s.nextLine();
        System.out.println("Enter character");
        char g=s.next().charAt(0); 
        int j=k.length();
        int count=0;
        int i=0;
        for(i=0;i<j;i++){
            if(g==k.charAt(i)){
                count++;
            }
        }
          if(count>0){
                System.out.println(g+" found at "+i);
            }
            else{
                System.out.println("did not found "+g);
            }
    }
}
