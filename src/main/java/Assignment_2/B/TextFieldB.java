package Assignment_2.B;

import Assignment_2.TextField;

public class TextFieldB extends TextField {

    public TextFieldB(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("!! " + text + " !!");
    }

}
