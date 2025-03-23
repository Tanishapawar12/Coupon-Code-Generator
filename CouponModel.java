package model;

import java.util.Random;

public class CouponModel {
     private String couponCode;
    private double discountPercentage;

    public String generateCouponCode() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder coupon = new StringBuilder();
        
        for (int i = 0; i < 6; i++) {
            int randomIndex = random.nextInt(characters.length());
            coupon.append(characters.charAt(randomIndex));
        }
        this.couponCode = coupon.toString();
        return this.couponCode;
    }

    public double getDiscountPercentage(int userType) {
        switch (userType) {
            case 1: 
                discountPercentage = 15.0;
                break;
            case 2: 
                discountPercentage = 10.0;
                break;
            case 3: 
                discountPercentage = 20.0;
                break;
            default:
                discountPercentage = 0.0;
                break;
        }
        return discountPercentage;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }
}

