import model.CouponModel;
import view.CouponView;
import controller.CouponController;

public class Main {
    public static void main(String[] args) {
        CouponModel couponModel = new CouponModel();
        CouponView couponView = new CouponView();
        
        CouponController couponController = new CouponController(couponModel, couponView);
        
        couponController.generateCouponForUser();
    }
}
