import java.util.Scanner;

public class week3_q1{
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Enter any number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        while(number > 0){
            int n = number%10;
            sum = sum+n;
            number = number/10;
        }
        System.out.println(sum);
    }
}




