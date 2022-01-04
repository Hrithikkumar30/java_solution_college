import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        
        System.out.println("Enter any number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int mult =1;
        
        for (int i = 1; i<=number ; i++){
            mult *= i;

        }
        System.out.println(mult);
        sc.close();
    }
}
