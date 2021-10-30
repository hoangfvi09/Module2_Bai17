package BT1;

import java.io.*;
import java.util.ArrayList;

public class ProductManagement {
    public static ArrayList<Product> products=new ArrayList<>();

    public static void addProductToFile(String filePath, Product product) throws IOException{
        products.add(product);
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(filePath));
            oos.writeObject(products);
            oos.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            oos.close();
        }
        System.out.println("Success!");

    }

    public static void showProductFromFile(String filePath) throws IOException{
        ObjectInputStream ois=null;

        try {
            Object obj;
            ois = new ObjectInputStream(new FileInputStream(filePath));
                ArrayList<Product> products = (ArrayList<Product>) ois.readObject();
                for(Product product:products){
                System.out.println(product);
            }
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            ois.close();
        }
    }

    public static Product findProductById(int id, String filePath) throws IOException{
        ObjectInputStream ois = null;

        try {
            Object obj;
            ois = new ObjectInputStream(new FileInputStream(filePath));
            ArrayList<Product> products = (ArrayList<Product>) ois.readObject();
            for(Product product:products){
                if (product.getId()==id){
                    return product;
                }
            }
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            ois.close();
        }
        return null;
    }
}
