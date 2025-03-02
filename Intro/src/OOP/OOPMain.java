package OOP;

import polyformizm.FileLogger;
import java.time.LocalDateTime;
import java.util.List;

public class OOPMain {
    public static void main(String[] args) {
        Product product = new Product();
        product.setId(1);
        product.setName("Laptop");
        product.setPrice(5000);
        product.setCreatedDate(LocalDateTime.now());

        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getPrice());

     /*   List<Product> products = new ArrayList<>();
        products.add(product);

        for (var item:products){
            System.out.println(product.getName());
        }

*/

        CategoryManager categoryManager = new CategoryManager(new FileLogger());
        List<Category> categories = categoryManager.getCategories();
        for (var item:categories){
            System.out.println(item.getId() + " " + item.getName());
        }

        System.out.println("************************************");
        Category category = new Category(3,"Kırtasiye");

        categoryManager.add(category);

        for (var item:categories){
            System.out.println(item.getId() + " " + item.getName());
        }
    }
}
