package baitap1;

public class ProductManager {
    private String nameProduct;
    private double priceProduct;
    private int idProduct;

    public ProductManager(String nameProduct, int priceProduct, int idProduct) {
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    @Override
    public String toString() {
        return "ProductManager{" +
                "nameProduct='" + nameProduct + '\'' +
                ", priceProduct=" + priceProduct +
                ", idProduct=" + idProduct +
                '}';
    }

}
