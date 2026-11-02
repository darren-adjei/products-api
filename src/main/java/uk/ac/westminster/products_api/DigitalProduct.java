package uk.ac.westminster.products_api;

public class DigitalProduct extends Product implements Discountable{
    private String downloadUrl;
    private double fileSizeMB;

    public DigitalProduct() {
    }

    public DigitalProduct(Long id, String name, double price, String downloadUrl, double fileSizeMB) {
        super(id, name, price);
        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    @Override
    public String getSummary() {
        return "Digital: " + getName() + " - £" + getPrice() + " - " + getDownloadUrl();
    }

    @Override
    public void ApplyDiscount(double rate) {

    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }

    private double discountedPrice;
}
