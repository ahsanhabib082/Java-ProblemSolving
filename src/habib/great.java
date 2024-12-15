package habib;

import java.util.Scanner;

public class great {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number : " );
        int x= sc.nextInt();
        System.out.println("Enter the second Number : " );
        int y= sc.nextInt();
        System.out.println("Enter the third Number : " );
        int z= sc.nextInt();

        if(x>y && x>z){
            System.out.println("X is the greatest number : " + x);
        }
        else if(y>x && y>z){
            System.out.println("Y is the greatest number : " + y);
        }
        else{
            System.out.println("Z is the greatest number : " + z);
        }

    }


}