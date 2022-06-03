package Factory;

public class Logger {
    private static Logger logger;

    private Logger() {
    }

    public static Logger getInstance(){
        if (logger == null){
            logger = new Logger();
        }
        return logger;
    }

    public void msgError(){
        System.out.println("Error" + logger.hashCode());
    }
    public void msgDebug(){
        System.out.println("Debugging" + logger.hashCode());
    }
    public void msgInfo(){
        System.out.println("Information" + logger.hashCode());
    }
}
