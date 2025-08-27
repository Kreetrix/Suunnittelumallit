package Assignment_2.A;

import Assignment_2.Button;

public class ButtonA extends Button {

    public ButtonA(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("[ " + text + " ]");
    }

}
