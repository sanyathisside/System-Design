
import java.util.ArrayList;
import java.util.Date;

public class Customer extends User {
    private Cart cart;
    private Order currentOrder;
    private ArrayList<Order> orderHistory;

    public Customer(String name, String phone) {
        super(name, phone);
        cart = new Cart();
        orderHistory = new ArrayList<>();
    }

    public void addItemToCart(Item item){
        this.cart.addItem(item);
    }
    public void removeItemFromCart(Item item){
        this.cart.removeItem(item);
    }
    public void printCartItems(){
        System.out.println(this.cart.getitemList());
    }
    public void updateItemCount(Item item, int newQuantity){
        this.cart.updateItemCount(item,newQuantity);
    }
    public void placeOrder(){
        currentOrder = new Order();
        currentOrder.setOrderStatus(OrderStatus.UNSHIPPED);
        currentOrder.setOrderDate(new Date());
        ArrayList<Item> orderedItems = this.cart.getitemList();
        double orderAmount = 0;
        for(Item item : orderedItems){
            orderAmount += item.getPrice();
        }
        currentOrder.setItems(orderedItems);
        currentOrder.setAmount(orderAmount);
        currentOrder.setShippingAddress(this.getAddress());
        this.cart.checkout();
        this.orderHistory.add(currentOrder);
    }

    public ArrayList<Order> getOrderHistory() {
        return orderHistory;
    }

    public Order getCurrentOrder() {
        return currentOrder;
    }
}
