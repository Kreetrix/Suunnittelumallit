package Assignment_2.B;

import Assignment_2.Checkbox;

public class CheckboxB extends Checkbox {

    public CheckboxB(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("▲▲ " + text + " ▲▲");
    }

}
