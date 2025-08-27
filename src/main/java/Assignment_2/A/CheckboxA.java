package Assignment_2.A;

import Assignment_2.Checkbox;

public class CheckboxA extends Checkbox {

    public CheckboxA(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("& " + text + " &");
    }

}
