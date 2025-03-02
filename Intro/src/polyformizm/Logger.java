package polyformizm;

public abstract class Logger {

    public void info(){
        System.out.println("Loglama çalıştı");
    }
    public abstract void log(Object object);
}
