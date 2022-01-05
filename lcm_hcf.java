import java.util.Scanner;

public class lcm_hcf {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int Orn1 = n1;
        int Orn2 =n2;
       
        while(n1%n2!=0){
        
           int n3 = n1 % n2;
            n1=n2;
            n2=n3;
            
        }
        int hcf = n2;
        System.out.println("HCF OF TWO NUMBERs is :" +hcf);
        int lcm = (Orn1 * Orn2) / hcf;
        System.out.println("LCM OF TWO NUMBERs is :" +lcm);
    }
}
