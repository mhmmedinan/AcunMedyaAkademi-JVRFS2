package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //diziler sabittir!
         /*String[] products = new String[3];
         products[0] = "Laptop";
         products[1] = "Mouse";
         products[2] = "Monitor";
         //products[3] = "Masa";

         for(int i=0;i<products.length;i++){
             System.out.println("Ürünler : " + products[i]);
         }*/


        String[] products = {"Laptop","Mouse","Monitor"};
        //products[3] = "Masa";
        for(int i=0;i<products.length;i++){
            System.out.println("Ürünler : " + products[i]);
        }

        System.out.println("---------------------------------------");

        int[] numbers = {10,50,60,75};
        int total = 0;

        for (int i = 0;i<numbers.length;i++){
            total+=numbers[i];
        }
        System.out.println("Dizi elemanlarınının toplamı : " + total);

        System.out.println("---------------------------------------");

        String[] books = {"Javaya giriş","C# programlama","Microservices Mimarisi"};
        String[] writers = {"Batuhan Yalçın","Ali Köçer","Şehmus Ekin"};
        double[] prices = {100,99.99,85};

        System.out.println("Kitaplar : ");
        for (int i = 0;i<books.length;i++){
            System.out.println("Kitap Adı : " + books[i]
             + " " + "Yazar : " + writers[i] + " " + "Fiyat : " + prices[i]);
        }

        String[][] cities = {{"İstanbul","Kocaeli","Sakarya"},{"Ankara","Konya","Kırşehir"},{"Diyarbakır","Gaziantep","Mardin"}}; //new String[3][3];

       /* cities[0][0] = "İstanbul";
        cities[0][1] = "Kocaeli";
        cities[0][2] = "Sakarya";*/

        for (int i=0;i<cities.length;i++){
            System.out.println("-------------------------------");
            for (int j=0;j< cities.length;j++){
                System.out.println(cities[i][j]);
            }
        }

        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("C#");
        programmingLanguages.add("Python");
        programmingLanguages.add("Php");

        for (String languge:programmingLanguages){
            System.out.println("Programlama Dilleri : " + languge);
        }

        programmingLanguages.remove("Php");
        System.out.println("-----------------------");
        for (String language:programmingLanguages){
            System.out.println("Programlama Dilleri : " + language);
        }

        System.out.println("-----------------------");
        int index = programmingLanguages.indexOf("Python");
        if (index>=0){
            programmingLanguages.set(index,"C++");
        }

        for (String language:programmingLanguages)
            System.out.println("Programlama Dilleri : " + language);


        List<String[]> users = new ArrayList<>();
        users.add(new String[]{"Muhammet","Ali","Ceyda"});
        for (String[] user:users)
            System.out.println(user[0] + " " + user[1] + " " + user[2]);


        HashMap<String,Object> products1 = new HashMap<>();
        products1.put("Ad","Laptop");
        products1.put("Fiyat",30000);
        products1.put("stok",5);

        //1 .Yöntem  // name=>name==""
        products1.forEach((key,value)->
                System.out.println(key + " " + value));

        System.out.println("--------------------------------");

        //2.Yöntem keyset ilgili key üzerinden değeri getirir
        for (String key:products1.keySet())
            System.out.println(key + " " + products1.get(key));

        System.out.println("--------------------------------");
        //3.Yöntem entryset() hem anahtar hemde değer üzerinden ulaşmak
        for (Map.Entry<String,Object> entry:products1.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());

    }
}
