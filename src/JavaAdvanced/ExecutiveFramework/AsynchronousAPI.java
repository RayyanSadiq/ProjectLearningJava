package JavaAdvanced.ExecutiveFramework;

public class AsynchronousAPI {

    public static void main(String[] args) {
        var service = new exampleService();
        service.sendAsync();
        System.out.println("Hello World");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
