
package addition;

import java.util.Scanner;
public class Addition {

    public static void main(String[] args) {
       int value[] = new int[5];
       int sum= 0;
       Scanner sc = new Scanner(System.in);
       for (int i =0; i<5; i++){
           value[i]=sc.nextInt();
           sum=sum+value[i];
       }
       
        System.out.println(sum);
       }
    }
