public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        Jaeger jaegerTwo = new Jaeger("Acid Geisha", "Japan", 55.4f, 4);
        
        jaegerOne.setModelName("Apex");
        jaegerOne.setOrigin("USA");
        jaegerOne.setHeight(88f);
        jaegerOne.setSpeed(5);
        System.out.println(jaegerOne);
        System.out.println(jaegerTwo);
        jaegerOne.drift();
    }
}