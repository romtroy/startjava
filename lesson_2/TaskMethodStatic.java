public class TaskMethodStatic {
    String methodName;
    
    public static String getMethodName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}