import java.util.Scanner;
public class if_else{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n%2==1){
        System.out.printf("Weird");
    }
    else if(n%2==0 && (n>=2&&n<=5)){
         System.out.printf("Not Weird");
    }
    else if(n%2==0 && (n>=6&&n<=20)){
         System.out.printf("Weird");
    }
     else if(n%2==0 && n>=20){
          System.out.printf("Not Weird");
     }
     sc.close();
    }
}
