package com.wantoper.GoF10_State;

import com.wantoper.GoF10_State.States.PhoneState;
import com.wantoper.GoF10_State.States.PowerOffState;
import com.wantoper.GoF10_State.States.PowerOnState;

public class Phone {
    private PhoneState phoneState;
    private PowerOffState powerOffState = new PowerOffState();;
    private PowerOnState powerOnState = new PowerOnState();

    public Phone(){
        this.phoneState = powerOffState;
    }

    public void shutdown(){
        phoneState = powerOffState;
    }

    public void startup(){
        phoneState = powerOnState;
    }

    public void OpenApp(){
        this.phoneState.OpenApp();
    }
}
