package OOP;

import polyformizm.Logger;

import java.util.ArrayList;
import java.util.List;


public class CategoryManager {

    private List<Category> categories;
    private Logger logger;

    public CategoryManager(Logger logger){
        //singleton pattern

        //Dependency Injection
       //this.categories = categories;

        categories = new ArrayList<>();
        categories.add(new Category(1,"Elektronik"));
        categories.add(new Category(2,"Yaşam"));


        this.logger = logger;
    }


    public void add(Category category){

        //kötü kod pratiği
        /*boolean log = true;
        if(log){
            System.out.println("Dbye loglandı");
        }
        else
            System.out.println("Dosyaya loglandı");*/

        logger.log(category.getId() + " " + category.getName());
        logger.info();
        categories.add(category);
    }


    public List<Category> getCategories(){
        return categories;
    }
}


//User sınıfı olşuturunuz.
//Instructor ve Student iki ayrı sınıf daha oluşturunuz.
//InstructorManager adında bir sınıf oluşturunuz.
//add,getlist,getbyid,delete,update metodlarını yazınız.
