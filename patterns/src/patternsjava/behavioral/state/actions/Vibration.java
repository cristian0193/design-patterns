package patternsjava.behavioral.state.actions;

import patternsjava.behavioral.state.Mobile;
import patternsjava.behavioral.state.MobileContext;

public class Vibration implements Mobile {

    @Override
    public void alert(MobileContext context) {
        System.out.println("Vibration... Vibration...");
    }
}
