public class CurrentMethod {
    public static String getMethodName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}