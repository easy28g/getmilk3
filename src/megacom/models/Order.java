package megacom.models;

import megacom.enums.OrderStatus;

import java.util.Date;

public class Order {

    private int id;
    private Date startOrder;
    private OrderStatus orderStatus;

    public Order(Date startOrder) {
        this.id = (int)(Math.random()*(1000000-1))+1;
        this.startOrder = startOrder;
        this.orderStatus = OrderStatus.OPEN;
    }

    public int getId() {
        return id;
    }

    public Date getStartOrder() {
        return startOrder;
    }

    public void setStartOrder(Date startOrder) {
        this.startOrder = startOrder;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

}
