import java.io.*;
import java.util.*;
import java.math.*;

public class datatypes {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        
        for(int i = 0; i < count;i++){
            String strNum = sc.nextLine();
            BigInteger bigNum = new BigInteger(strNum);
           
            
            if ((bigNum.compareTo(BigInteger.ZERO) > 0  && bigNum.compareTo(BigInteger.valueOf( Long.MAX_VALUE )) > 0) || (bigNum.compareTo(BigInteger.ZERO) < 0  && bigNum.compareTo(BigInteger.valueOf( Long.MIN_VALUE )) < 0)){
                System.out.println(bigNum + " can't be fitted anywhere.");
            } else
                System.out.println( bigNum + " can be fitted in:");
            
            if (bigNum.compareTo(BigInteger.valueOf(Byte.MAX_VALUE )) <= 0 && bigNum.compareTo(BigInteger.valueOf(Byte.MIN_VALUE )) >= 0){
                System.out.println("* byte");
            }
            if (bigNum.compareTo(BigInteger.valueOf(Short.MAX_VALUE )) <= 0 && bigNum.compareTo(BigInteger.valueOf(Short.MIN_VALUE )) >= 0){
                System.out.println("* short");
            }
            if (bigNum.compareTo(BigInteger.valueOf(Integer.MAX_VALUE )) <= 0 && bigNum.compareTo(BigInteger.valueOf(Integer.MIN_VALUE )) >= 0){
                System.out.println("* int");
            }
            if (bigNum.compareTo(BigInteger.valueOf(Long.MAX_VALUE )) <= 0 && bigNum.compareTo(BigInteger.valueOf(Long.MIN_VALUE )) >= 0) {
                System.out.println("* long");
            }
        }
    }
}
