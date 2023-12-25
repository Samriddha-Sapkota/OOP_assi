package Modules;

public class Cart {
    int id;
    String shopname = "Sam's Shop";
    int[] itemPrice;

    public Cart(int id, String shopname, int[] itemPrice) {
        this.id = id;
        this.shopname = shopname;
        this.itemPrice = itemPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public int[] getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int[] itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void displayinfo(){
        int id = this.id;
        String shopname = this.shopname;
        int[] itemPrice = this.itemPrice;
        int total = 0;
        for (int i = 0; i < itemPrice.length;i++) {
            int price = itemPrice[i];
            total += price;
        }
        System.out.println("The total of cart " + id + " from " + shopname + " is " + total);
    }
}
