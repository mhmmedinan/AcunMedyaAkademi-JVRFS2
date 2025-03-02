package polyformizm;

public class FileLogger extends Logger {
    @Override
    public void log(Object object) {
        System.out.println("Dosyaya Loglandı" + " : " +  object);
    }

    @Override
    public void info() {
        System.out.println("Burası info seviyesinde bir loglamadır");
    }
}
