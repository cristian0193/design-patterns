package patternsjava.structural.proxy;

public class Access implements Internet {
    @Override
    public void connectTo(String url) {
        System.out.println("Connect to internet: " + url);
    }
}
