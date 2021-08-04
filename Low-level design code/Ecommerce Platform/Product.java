
public class Product {
    private static int idCounter=0;
    private  int id;
    private String name;
    private String description;
    private double price;
    private double ratings;
    private Category category;
    private int availableCount;
    private Seller seller;

    public Product(String name, String description, double price, 
                                  Category category, int availableCount) {
        idCounter += 1;
        this.id = idCounter;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.availableCount = availableCount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public double getRatings() {
        return ratings;
    }

    public Category getCategory() {
        return category;
    }

    public int getAvailableCount() {
        return availableCount;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public void setAvailableCount(int availableCount) {
        this.availableCount = availableCount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + ''' +
                ", description='" + description + ''' +
                ", price=" + price +
                ", ratings=" + ratings +
                ", category=" + category +
                ", availableCount=" + availableCount +
                ", seller=" + seller +
                '}';
    }

    public Seller getSeller() {
        return seller;
    }
}

