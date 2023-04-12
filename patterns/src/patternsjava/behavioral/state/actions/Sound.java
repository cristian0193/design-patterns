package patternsjava.behavioral.state.actions;

import patternsjava.behavioral.state.Mobile;
import patternsjava.behavioral.state.MobileContext;

public class Sound implements Mobile {

    @Override
    public void alert(MobileContext context) {
        System.out.println("Ring... Ring...");
    }
}
