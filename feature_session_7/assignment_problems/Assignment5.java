package feature_session_7.assignment_problems;
public class Assignment5 {
    private int[] prices;
    private final String cartId;
    public Assignment5(String cartId, int maxItems) {
        this.cartId = cartId;
        prices = new int[maxItems];
    }
    public void addItem(int price) {
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == 0) {
                prices[i] = price;
                break;
            }
        }
    }
    public int getTotal() {
        int total = 0;
        for (int price : prices) {
            total += price;
        }
        return total;
    }
    public int getItemCount() {
        int count = 0;
        for (int price : prices) {
            if (price != 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Assignment5 cart = new Assignment5("CART-5", 20);
        cart.addItem(250);
        cart.addItem(99);
        cart.addItem(151);
        System.out.println(cart.getTotal());
        System.out.println(cart.getItemCount());
    }
}