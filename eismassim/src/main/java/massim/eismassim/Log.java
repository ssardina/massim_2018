package massim.eismassim;

/**
 * Very simple Logger.
 */
public abstract class Log {
    private static boolean logOn = true;

    public static void log(String message){
        if (logOn) System.out.println(message);
    }

    public static boolean isLogOn() {
        return logOn;
    }

    public static void setLogOn(boolean logOn) {
        this.logOn = logOn;
    }
}
