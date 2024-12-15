package habib;
import java.util.Scanner;
public class posneg
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println( "Input any Number :");
        int n = sc.nextInt();

        if (n>0){
            System.out.println("positive");
        }

        else if (n<0){
            System.out.println("negative");
        }
        else{
            System.out.println("zero");
        }


    }
}