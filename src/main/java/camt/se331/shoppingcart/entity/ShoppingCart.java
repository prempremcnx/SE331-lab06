package camt.se331.shoppingcart.entity;

import java.util.Date;
import java.util.List;

/**
 * Created by Dto on 2/7/2015.
 */
public class ShoppingCart {
    List<SelectedProduct> selectedProducts;
    Date purchaseDate;
    public double getTotalProductPrice(){
        double result = 0.0;
        for(int i=0; i<selectedProducts.size(); i++) {
            result+= selectedProducts.get(i).getTotalPrice()*selectedProducts.get(i).getAmount();
        }
        return result;
    };

    public List<SelectedProduct> getSelectedProducts() {
        return selectedProducts;
    }

    public void setSelectedProducts(List<SelectedProduct> selectedProducts) {
        this.selectedProducts = selectedProducts;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public ShoppingCart(List<SelectedProduct> selectedProducts) {

        this.selectedProducts = selectedProducts;
    }

    public ShoppingCart() {

    }
}
