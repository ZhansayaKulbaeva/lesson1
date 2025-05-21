public class DiscountedProduct {
    private int price;
    private  double discount;

    public DiscountedProduct(){

    }

    public DiscountedProduct(int price, double discount) {
        this.price = price;
        this.discount = discount;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

//    public double getFinalPrice() {
//        if (discount > 50) {
//            return price;
//        }else {
//            return price - (price * discount / 100);
//        }
//    }

//    public double getFinalPrice() {
//        if (discount > 50) {
//            return price;
//        } else if (discount < 50) {
//            return price%discount;
//        }
//        return 0;
//    }
}