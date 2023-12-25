import Modules.Cart;

public class Main {
    public static void main(String[] args) {
        Cart c1 = new Cart(1, "Sam's Shop", new int[]{340, 239});
        Cart c2 = new Cart(2,"Sam's Shop", new int[]{290, 8698});
        Cart c3 = new Cart(3,"Sam's Shop", new int[]{730, 608});
        c1.displayinfo();
        c2.displayinfo();
        c3.displayinfo();
    }
}