
import java.util.ArrayList;
import java.util.Date;
import java.util.function.DoubleBinaryOperator;

public class Order {
    private  static int numberCounter =0;
    private int orderNumber;
    private OrderStatus orderStatus;
    private Date orderDate;
    private ArrayList<Item> items;
    private double amount;
    private String shippingAddress;
    private ArrayList<OrderLog> orderLogs;

    public Order() {
        numberCounter += 1;
        this.orderNumber = numberCounter;
        orderLogs = new ArrayList<>();
        addOrderLog(new OrderLog(new Date(),OrderStatus.CREATED));
    }

    public Shipment moveToShipment(){
        Shipment shipment = new Shipment(this);
        return shipment;
    }

    public void addOrderLog(OrderLog orderLog){
        orderLogs.add(orderLog);
    }
    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
        addOrderLog(new OrderLog(new Date(),orderStatus));
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = new ArrayList<>(items);
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", orderStatus=" + orderStatus +
                ", orderDate=" + orderDate +
                ", items=" + items +
                ", amount=" + amount +
                ", shippingAddress='" + shippingAddress + ''' +
                '}';
    }
}
