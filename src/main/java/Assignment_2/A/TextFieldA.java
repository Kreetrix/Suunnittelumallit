package Assignment_2.A;

import Assignment_2.TextField;

public class TextFieldA extends TextField {

    public TextFieldA(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("# " + text + " #");
    }

}
