import java.lang.Math;
import java.util.Scanner;
public class calc{
    public static void main(String[] args){
        System.out.println("Select operation");
        int arth=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Select function:\n sum (1)\n subtraction (2)\n multiplication (3)\n division (4)\n ");
        arth=sc.nextInt();
        switch(arth){
            case 1:
                System.out.println("Sum");
                int s=0,m=0;
                System.out.println("enter two sumbers");
                s=sc.nextInt();
                m=sc.nextInt();
                int s1=s+m;
                System.out.println(s1);
                break;
                case 2:
                    System.out.println("subtraction");
                    int s5=0,m5=0;
                System.out.println("enter two sumbers");
                s5=sc.nextInt();
                m5=sc.nextInt();
                int s7=s5-m5;
                System.out.println(s7);
                break;
                    case 3:
                        System.out.println("multiplication");
                        int s4=0,m4=0;
                System.out.println("enter two sumbers");
                s4=sc.nextInt();
                m4=sc.nextInt();
                int s3=s4*m4;
                System.out.println(s3);
                break;
                        case 4:
                            System.out.println("division");
                            int s2=0,m2=0;
                System.out.println("enter two sumbers");
                s2=sc.nextInt();
                m2=sc.nextInt();
                if(m2==0){
                    System.out.println("cant divide by 0");
                }
                else if(s2<m2){
                 float r=(float)s2/(float)m2;
                  System.out.println(r);
                }
                else{
                int s9=s2/m2;
                System.out.println(s9);
                }
                break;
                 default:
                System.out.println("Non valid");
        }
    }
}