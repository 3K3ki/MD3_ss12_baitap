package baitap1;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ProductManager[] product = new ProductManager[100];
        int count = 0;

        System.out.println("Nhập tên sản phẩm: ");
        String nameProduct = input.nextLine();
        System.out.println("Nhập idProduct: ");
        int idProduct = input.nextInt();
        System.out.println("Nhập Giá: ");
        int priceProduct = input.nextInt();
        ProductManager manager = new ProductManager(nameProduct, idProduct, priceProduct);
        product[count] = manager;
        count++;
        System.out.println("Thêm mới thành công");
        if (count == 0) {
            System.out.println("không có product");
        }

    }
    public void updateProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product id: ");
        int id = scanner.nextInt();
        Product product = findProductById(id);
        if (product != null) {
            System.out.print("Enter new product name (press Enter to skip): ");
            String name = scanner.nextLine();
            if (!name.isBlank()) {
                product.setName(name);
            }
            System.out.print("Enter new product price (press Enter to skip): ");
            String priceStr = scanner.nextLine();
            if (!priceStr.isBlank()) {
                double price = Double.parseDouble(priceStr);
                product.setPrice(price);
            }
            System.out.println("Product updated successfully!");
        } else {
            System.out.println("Product not found!");
        }
    }
}
