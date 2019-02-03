
package Business;

public class Product 
{
    String product_name;
    String description;
    double price;
    int availability_number;
    Supplier supplier;
    public Product()
    {
        supplier = new Supplier();
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvailability_number() {
        return availability_number;
    }

    public void setAvailability_number(int availability_number) {
        this.availability_number = availability_number;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}
   