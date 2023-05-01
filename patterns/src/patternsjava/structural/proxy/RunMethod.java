package patternsjava.structural.proxy;

public class RunMethod {

    public static void runProxy() {

        Internet internet = new Proxy();
        try {
            internet.connectTo("udemy.com");
            internet.connectTo("google.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
