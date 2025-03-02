package OOP;


//Inheritance
//bir sınıf sadece bir sınıfı yada soyut sınıfı miras alabilir.
public class Product extends BaseEntity {

    private int id;
    private String name;
    private double price;



    //Encapsulation
    //setter
    public void setId(int id){
        this.id = id;
    }

    //getter
    public int getId(){
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
