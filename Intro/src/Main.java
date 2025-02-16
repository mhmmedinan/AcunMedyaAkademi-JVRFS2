import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // veriables


        //product name,price,stock

        String productName = "Apple Macbook Air M2";
        String message = "Login successful";

        System.out.println(message);

        System.out.println(productName);
        System.out.println(productName);

        //Not: matematiksel işlem yapılmayan her sayısal değer String veri tipinde tutulurç.

        byte stock = 127; // -128 - 127 // 8 bit
        short stock1 = 32767; // 16 bit
        int stock2 = 2147483647; // 32 bit
        long stock3 = 9223372; //64 bit


        double price = 99.99;
        float price1 = 99.99F;

        //Tam sayı olan veri tipine ondalıklı değer atanmaz. Ama ondlaıklı bir veri tipine tam sayı atanabilir.

        double price2 = 50;


        char gender = 'K';
        boolean isActive = true;

        //controlStatements

        // if-else,switch-case

        //amount,accountBalance
        Scanner scanner = new Scanner(System.in);

        /*System.out.print("Hesap Bakiyenizi giriniz : ");
        double accountBalance = scanner.nextDouble();

        System.out.print("Çekmek istediğiniz miktarı giriniz : ");
        double amount = scanner.nextDouble();

        if(amount<=accountBalance)
        {
            accountBalance-=amount;
            System.out.println("Para çekme işlemi başarılı. Güncel bakiye" + accountBalance);
        }
        else{
            System.out.println("Yetersiz bakiye!");
        }*/


      /*  String correctUsername = "admin";
        String correctPassword = "123456";

        System.out.print("Kullanıcı adınızı giriniz : ");
        String username = scanner.next();

        System.out.print("Parolanızı giriniz : ");
        String password = scanner.next();

        if(username.equals(correctUsername) && password.equals(correctPassword)){
            System.out.println("Giriş başarılı!");
        }
       else{
            System.out.println("Kullanıcı adı veya şifre hatalı");
        }*/


       //loops
        //for,foreach,while,do-while


        for(int i=0;i<=50;i++){
            System.out.println(i);
        }

        for(int i=0;i<=50;i++){
            if(i%2==0){
                System.out.println("Çift sayılar : " + i);
            }
            else{
                System.out.println("Tek sayılar : " + i);
            }
        }

        System.out.print("Sayı giriniz");
        int number = scanner.nextInt();

        boolean isPrime = true;

        if(number==1){
            System.out.println("sayı asal değildir");
            return;
        }
        if(number<=0){
            System.out.println("geçersiz sayı");
            return;
        }

        for (int i = 2;i<number;i++){
            if(number%i==0){
              isPrime = false;
            }
        }



        if(isPrime){
            System.out.println("Sayı asaldır");
        }
        else{
            System.out.println("Sayı asal değildir");
        }

    }
}