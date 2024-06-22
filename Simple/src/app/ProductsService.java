public class ProductsService {

    public Product getProductById(long id) {

        return productRepository.findById(id).
                orElseThrow(() -> 
                new IllegalStateException(String.format("Product with ID %s does not exist", id)));

    }
    
}
