@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {

        this.orderRepository = orderRepository;

    }

    public void placeOrders(Iterable<Order> orders) {

        orderRepository.saveAll(orders);

    }

    
}
