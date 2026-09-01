package HackerrankQsn;
import java.util.*;
import java.io.*;
public class Solution4{
    static int B;
    static int H;
    static boolean flag;

    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        flag = true;

        if(B<=0||H<=0){
            flag=false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        sc.close();
    }
    public static void main(String[] args) {
        if(flag){
            System.out.println(H*B);
        }
        
    }

}
