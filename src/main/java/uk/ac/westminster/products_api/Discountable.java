package uk.ac.westminster.products_api;

public interface Discountable {
    void ApplyDiscount(double rate);
    double getDiscountedPrice();
}
