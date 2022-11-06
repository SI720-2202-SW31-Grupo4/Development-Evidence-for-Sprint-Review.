package pe.edu.upc.first.user;
import pe.edu.upc.first.history.WishList;
import pe.edu.upc.first.history.OrderHistory;
import pe.edu.upc.first.payment.Order;
import pe.edu.upc.first.business.Computer;

public class Buyer extends Client{
    private WishList wishList = new WishList();
    private OrderHistory orderHistory = new OrderHistory();
    private Order currentOrder = new Order();
    private Computer selectedComputer = new Computer();

    public Buyer(){}//constructor

    public void addOrder(){}
    public void editData(){}
    public void checkOrderStatus(){}
    public void viewWishList(){}
    public void viewOrderHistory(){}

}



