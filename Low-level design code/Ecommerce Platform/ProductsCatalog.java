
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ProductsCatalog implements Searchable{
    private ArrayList<Product> products;
    private ArrayList<Category> categories;
    private HashMap<String,ArrayList<Product>> categoryProductMap;
    private HashMap<String,ArrayList<Seller>> productSellerMap;
    private ConcurrentHashMap<String,ArrayList<Product>> similarProducts;

    public ProductsCatalog(){
        products = new ArrayList<>();
        categories = new ArrayList<>();
        categoryProductMap = new HashMap<>();
        similarProducts = new ConcurrentHashMap<>();
        similarProducts.put("Dummy Product",new ArrayList<Product>());
        productSellerMap = new HashMap<>();
    }

    public void updateSimilarProductsMap(Product newProduct){
        String productName = newProduct.getName().toLowerCase();
        Set<String> keySet = similarProducts.keySet();
        boolean isSimilar = false;
        for (String key : keySet){
            if(key.toLowerCase().contains(productName) || productName.contains(key.toLowerCase())) {
                isSimilar = true;
                similarProducts.get(key).add(newProduct);
            }
        }
        if(!isSimilar){
            similarProducts.put(newProduct.getName().toLowerCase(),new ArrayList<Product>(List.of(newProduct)));
        }
    }
    private void updateCategoryProductMap(){
        for(Category category : categories){
            categoryProductMap.put(category.getName().toLowerCase(), new ArrayList<Product>());
        }
    }
    private void updateCategoryProductMap(Product product){
        if(categoryProductMap.containsKey(product.getCategory().getName().toLowerCase())){
            categoryProductMap.get(product.getCategory().getName().toLowerCase()).add(product);
        } else{
            categoryProductMap.put(product.getCategory().getName().toLowerCase(),new ArrayList<>(List.of(product)));
        }

    }
    private void updateProductSellerMap(Product newProduct){
        if(productSellerMap.containsKey(newProduct.getName().toLowerCase())){
            productSellerMap.get(newProduct.getName().toLowerCase()).add(newProduct.getSeller());
        }else{
            productSellerMap.put(newProduct.getName().toLowerCase(),new ArrayList<>(List.of(newProduct.getSeller())));
        }
    }

    public void addCategory(Category newCategory){
        categories.add(newCategory);
        updateCategoryProductMap();

    }

    public ConcurrentHashMap<String, ArrayList<Product>> getSimilarProducts() {
        return similarProducts;
    }

    public void addProduct(Product product){
        products.add(product);
        updateProductSellerMap(product);
        updateCategoryProductMap(product);
        updateSimilarProductsMap(product);

    }

    @Override
    public String toString() {
        return "ProductsCatalog{" +
                "products=" + products +
                '}';
    }

    @Override
    public ArrayList<Product> searchProduct(String productName) {
        return similarProducts.get(productName.toLowerCase());
    }

    @Override
    public ArrayList<Product> searchCategory(String categoryName) {
        return categoryProductMap.get(categoryName.toLowerCase());
    }

    public void updateProductQuantity(Product product, int newQuantity) {
        for(Product prod: products){
            if(prod.getId()==product.getId()){
                prod.setAvailableCount(newQuantity);
            }
        }
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }
}
