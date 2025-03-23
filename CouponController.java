package controller;

import model.CouponModel;
import view.CouponView;

public class CouponController {
    private CouponModel couponModel;
    private CouponView couponView;

    // Constructor that takes the model and view as arguments
    public CouponController(CouponModel couponModel, CouponView couponView) {
        this.couponModel = couponModel;
        this.couponView = couponView;
    }

    // Method to handle the generation of the coupon code and applying the discount
    public void generateCouponForUser() {
        // Step 1: Ask user for their type
        int userType = couponView.getUserType();

        // Step 2: Fetch the discount percentage from CouponModel
        double discountPercentage = couponModel.getDiscountPercentage(userType);

        // Step 3: Generate the coupon code
        String couponCode = couponModel.generateCouponCode();

        // Step 4: Display the coupon and discount details
        couponView.displayCouponDetails(couponCode, discountPercentage);
    }
}
