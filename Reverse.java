import java.io.*;
import java.util.*;

public class Reverse{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
      StringBuilder sr=new StringBuilder(A);
    if(A.equals(sr.reverse().toString()))
    System.out.println("Yes");
    else
    System.out.println("No");
        /* Enter your code here. Print output to STDOUT. */
        
    }
}



