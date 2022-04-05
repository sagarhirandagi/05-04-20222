import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the number");
        int n=scan.nextInt();
        scan.close();

        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("Factorial of "+n+" is: "+fact);
    }
    
}
