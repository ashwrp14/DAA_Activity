import java.util.Scanner;

public class Output {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                int len= s1.length();
                //Complete this line
                            System.out.print(s1);
            int x_length = String.valueOf(x).length();
            for(int j=0;j<15-len;j++)
            {
                System.out.print(" ");
            }
            if(x_length==2)
            {
                System.out.println("0"+x);
            }
            else if(x_length ==1)
            {
               System.out.println("00"+x); 
            }
            else
            {
                System.out.println(x); 
            }

            }
            System.out.println("================================");

    }
}



