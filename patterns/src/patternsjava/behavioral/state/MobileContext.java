package patternsjava.behavioral.state;

import patternsjava.behavioral.state.actions.Sound;

public class MobileContext {

    private Mobile mobile;

    public MobileContext(){
        mobile = new Sound();
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public void alert(){
        mobile.alert(this);
    }
}
