import model.CouponModel;
import view.CouponView;
import controller.CouponController;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create instances of CouponModel and CouponView
        CouponModel couponModel = new CouponModel();
        CouponView couponView = new CouponView();

        // Step 2: Create an instance of CouponController and pass the model and view
        CouponController couponController = new CouponController(couponModel, couponView);

        // Step 3: Call the method to generate the coupon for the user
        couponController.generateCouponForUser();
    }
}