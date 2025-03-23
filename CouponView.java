package view;

import java.util.Scanner;

public class CouponView {
     public int getUserType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your user type: ");
        System.out.println("1. Daily Customer");
        System.out.println("2. New User");
        System.out.println("3. Special User");
        System.out.print("Enter Choice(1,2,3): ");
        int choice = scanner.nextInt();
        return choice;
    }

    // Method to display the generated coupon and discount
    public void displayCouponDetails(String couponCode, double discountPercentage) {
        System.out.println("Generate coupon code: " + couponCode);
        System.out.println("Discount Applied: " + discountPercentage + "%");
    }
}
