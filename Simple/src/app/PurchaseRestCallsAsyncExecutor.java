import java.util.concurrent.CompletableFuture;

@Component
public class PurchaseRestCallsAsyncExecutor {

    RestTemplate restTemplate;

    static final String BASE_URL = "https://internal-api.com";

    public String getOrderDescription(String orderId) {

        ResponseEntity<String> result = 
        restTemplate.getForEntity(String.format("%s/order/%s", BASE_URL, orderId), String.class);

        return result.getBody();
    }

    public void updatePurchaseHandlingExceptions(Purchase purchase) {

        CompletableFuture<T>.allOf(null)
    }
    
}
