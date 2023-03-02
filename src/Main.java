public class Main {
    public static void main(String[] args) {
        SingletonLogger logger1 = SingletonLogger.getInstance();
        SingletonLogger logger2 = SingletonLogger.getInstance();
        SingletonLogger logger3 = SingletonLogger.getInstance();
        logger1.logDeposit("0001", 80.5);
        logger2.logWithdraw("0002", 100);
        logger1.logTransfer("0001", "0003", 40);
        logger3.logDeposit("0004", 56.74);
        logger2.logWithdraw("0005", 30);

        Logger logger4 = new Logger();
        Logger logger5 = new Logger();
        Logger logger6 = new Logger();
        logger4.logDeposit("0001", 80.5);
        logger5.logWithdraw("0002", 100);
        logger4.logTransfer("0001", "0003", 40);
        logger6.logDeposit("0004", 56.74);
        logger5.logWithdraw("0005", 30);

    }
}