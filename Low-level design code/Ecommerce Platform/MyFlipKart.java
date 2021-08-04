
import java.util.ArrayList;

public class MyFlipKart {
    public ProductsCatalog productsCatalog;

    public MyFlipKart() {
        productsCatalog = new ProductsCatalog();
    }

    public static void main(String[] args) {
        // -------Data generation code ---- START ------------------------------//

        // Creating Customer --> Piyush
        Customer piyush = new Customer("Piyush Khandelwal","9876987655");

        // Creating Seller --> Daily Needs Groceries
        Seller dailyNeedsGrocery = new Seller("Daily Needs Groceries","9876543210");

        // Creating Seller --> Fashion Point
        Seller fashionPoint = new Seller("Fashion Point","9988776655");

        // Creating Seller --> Digi Electronics
        Seller digiElectronics = new Seller("Digi Electronics","9876598765");

        // Creating category --> Electronics
        Category electronics = new Category("Electronics");

        // Creating category --> Cosmetics
        Category cosmetics = new Category("Cosmetics");

        // Creating category --> Grocery
        Category grocery = new Category("Groceries");

        // Creating category --> Clothing
        Category clothing = new Category("Clothing");

        // -------Data generation code ---- END ------------------------------//

        MyFlipKart myFlipKart = new MyFlipKart();

        // Adding all the categories to Flipkart catalog
        myFlipKart.productsCatalog.addCategory(clothing);
        myFlipKart.productsCatalog.addCategory(grocery);
        myFlipKart.productsCatalog.addCategory(cosmetics);
        myFlipKart.productsCatalog.addCategory(electronics);

        // Seller Digi Electronics adding Mobile to myFlipKart catalog
        digiElectronics.registerProduct(myFlipKart.productsCatalog,
        new Product("Mobile","Latest Technology",10000.00,electronics,5));

        // Seller Digi Electronics adding Camera to myFlipKart catalog
        digiElectronics.registerProduct(myFlipKart.productsCatalog, //
        new Product("Camera","Advanced Technology",50000.00,electronics,10));

        // Seller FashionPoint adding Wearbles to myFlipKart catalog
        fashionPoint.registerProduct(myFlipKart.productsCatalog, //
        new Product("Mens Jackets","XL - Size",1000.00,clothing,10));
        
        fashionPoint.registerProduct(myFlipKart.productsCatalog, //
        new Product("Jackets","XL - Size",1000.00,clothing,10));
        
        // Seller FashionPoint adding Cosmetics to myFlipKart catalog
        fashionPoint.registerProduct(myFlipKart.productsCatalog, // 
        new Product("Nail Paint","Red Color",500.00,cosmetics,25));

        // Seller dailyNeedsGrocery adding grocery to myFlipKart catalog
        dailyNeedsGrocery.registerProduct(myFlipKart.productsCatalog, //
        new Product("Sugar","Fine quality",40.00,grocery,1000));

        // Seller dailyNeedsGrocery adding grocery to myFlipKart catalog
        dailyNeedsGrocery.registerProduct(myFlipKart.productsCatalog, //
        new Product("Milk","100% Pure",50.00,grocery,250));
        
        dailyNeedsGrocery.registerProduct(myFlipKart.productsCatalog, //
        new Product("Toned Milk","Hygenic and Pure",45.00,grocery,250));
        
        dailyNeedsGrocery.registerProduct(myFlipKart.productsCatalog, //
        new Product("Milk Cream","Natural",145.00,grocery,100));


        // Customer searching for product --> milk
        ArrayList<Product> milkResults = myFlipKart.productsCatalog.searchProduct("Milk");
        //System.out.println(milkResults);

        // Customer searching for all the products in grocery
        ArrayList<Product> groceryProducts = myFlipKart.productsCatalog.searchCategory("Groceries");
        //System.out.println(groceryProducts);

        // Customer adding 10 packets of milk to cart
        Item milkTenPackets = new Item(milkResults.get(0),10);
        piyush.addItemToCart(milkTenPackets);

        // Printing current cart status
        piyush.printCartItems();

        // Customer searching for another product --> camera
        ArrayList<Product> cameraResults = myFlipKart.productsCatalog.searchProduct("CaMeRa");
        //System.out.println(cameraResults);

        // Customer adding 1 camera to cart
        Item oneCamera = new Item(cameraResults.get(0),1);
        piyush.addItemToCart(oneCamera);

        // Printing current cart status
        piyush.printCartItems();

        // Customer updating quantity of milk packets from 10 to 15
        piyush.updateItemCount(milkTenPackets,15);

        // Printing current cart status
        piyush.printCartItems();

        // Customer placing the order
        piyush.placeOrder();

        // Customer cart is empty after checkout
        piyush.printCartItems();

        // Printing the current Order of customer
        System.out.println(piyush.getCurrentOrder());

        // Customer order is moved to shipment
        Shipment s = piyush.getCurrentOrder().moveToShipment();

        // Printing the shipment details
        System.out.println(s);


    }
}
