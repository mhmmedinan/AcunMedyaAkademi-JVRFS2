package polyformizm;

public class DatabaseLogger extends Logger{
    @Override
    public void log(Object object) {
        System.out.println("Veritabanına Loglandı" + " : " + object);
    }
}
