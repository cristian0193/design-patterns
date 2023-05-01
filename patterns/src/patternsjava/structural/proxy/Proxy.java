package patternsjava.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class Proxy implements Internet {

    private Internet internet = new Access();
    private static List<String> urlBlocked;

    static {
        urlBlocked = new ArrayList<>();
        urlBlocked.add("twitter.com");
        urlBlocked.add("youtube.com");
        urlBlocked.add("google.com");

    }

    @Override
    public void connectTo(String url) throws Exception {
        if(urlBlocked.contains(url)) {
            throw new Exception("URL Blocked - Access Denied");
        }

    }
}
