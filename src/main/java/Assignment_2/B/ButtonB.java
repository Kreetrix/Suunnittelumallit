package Assignment_2.B;

import Assignment_2.Button;

public class ButtonB extends Button {

    public ButtonB(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("%% " + text + " %%");
    }

}
