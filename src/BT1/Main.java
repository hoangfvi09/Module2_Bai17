package BT1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Product product1= new Product(1,"hvi","hv",1000,"xinh");
        Product product2= new Product(2,"hhvi","hvi",2000,"xinhh");
        Product product3= new Product(3,"hhhvi","hvii",3000,"xinhhh");
        Product product4= new Product(4,"hhhhvi","hvii",4000,"xinhhh");

        String filePath="/Users/hoangfvi/Documents/JAVA/Module 2/Bai17/src/BT1/product.txt";
        ProductManagement.addProductToFile(filePath,product1);
        ProductManagement.addProductToFile(filePath,product2);
        ProductManagement.addProductToFile(filePath,product3);
        ProductManagement.addProductToFile(filePath,product4);

        ProductManagement.showProductFromFile(filePath);
        System.out.println("Product with id 2: ");
        System.out.println(ProductManagement.findProductById(2,filePath));
    }
}
