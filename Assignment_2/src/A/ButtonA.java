package src.A;

import src.Button;

public class ButtonA extends Button {

    public ButtonA(String text) {
        super(text);
    }

    @Override
    public void display() {
       System.out.println("[ " + text + " ]");
    }
    
}
