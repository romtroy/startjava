public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        Jaeger jaegerTwo = new Jaeger("Acid Geisha", "Japan", 55.4f, 4);
        
        jaegerOne.setModelName("Apex");
        jaegerOne.setHeight(88f);
        jaegerOne.setSpeed(5);
        System.out.print("modelName: " + jaegerOne.getModelName() + ", ");
        System.out.print("origin: " + jaegerOne.getOrigin() + ", ");
        System.out.print("height: " + jaegerOne.getHeight() + ", ");
        System.out.println("speed: " + jaegerOne.getSpeed());
        System.out.println(jaegerTwo);
        jaegerOne.drift();
    }
}