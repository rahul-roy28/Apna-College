import java.util.*;

public class nft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input principal amount
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        
        // Constants
        double dailyRate = 0.01986; // Estimated daily interest rate
        double targetDouble = principal * 2; // Double the principal
        double target1000 = 1000; // Target $1000
        
        // Calculate days using logarithm formula
        int daysToDouble = (int) (Math.log(targetDouble / principal) / Math.log(1 + dailyRate));
        int daysTo1000 = (int) (Math.log(target1000 / principal) / Math.log(1 + dailyRate));
        
        // Output results
        System.out.println("Your double amount is: "+targetDouble);
        System.out.println("Days to double your principal: " + daysToDouble);
        if (target1000 > principal) {
            System.out.println("Days to reach $1000: " + daysTo1000);
        } else {
            System.out.println("Your principal is already $1000 or more.");
        }
        
        scanner.close();
    }
}
