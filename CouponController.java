package controller;

import model.CouponModel;
import view.CouponView;

public class CouponController {
    private CouponModel couponModel;
    private CouponView couponView;

    public CouponController(CouponModel couponModel, CouponView couponView) {
        this.couponModel = couponModel;
        this.couponView = couponView;
    }
    public void generateCouponForUser() {
        int userType = couponView.getUserType();
        double discountPercentage = couponModel.getDiscountPercentage(userType);
        
        String couponCode = couponModel.generateCouponCode();

        couponView.displayCouponDetails(couponCode, discountPercentage);
    }
}
