
import java.util.Date;

public class OrderLog {
    private Date creationTimestamp;
    private OrderStatus status;

    public OrderLog(Date creationTimestamp, OrderStatus status) {
        this.creationTimestamp = creationTimestamp;
        this.status = status;
    }
}
