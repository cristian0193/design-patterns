package patternsjava.behavioral.state;

import patternsjava.behavioral.state.actions.Silent;
import patternsjava.behavioral.state.actions.Vibration;

public class RunMethod {

    public static void runState(){
        MobileContext context = new MobileContext();
        context.alert();

        context.setMobile(new Vibration());
        context.alert();

        context.setMobile(new Silent());
        context.alert();
    }

}
