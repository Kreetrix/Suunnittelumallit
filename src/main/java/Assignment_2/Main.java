package Assignment_2;

import Assignment_2.A.*;
import Assignment_2.B.*;

public class Main {
    public static void main(String[] args) {
        UIFactory factory = new AFactory();

        Button button = factory.createButton("This is an A button");
        Checkbox checkbox = factory.createCheckbox("This is an A checkbox");
        TextField textField = factory.createTextField("This is an A text field");

        button.display();
        checkbox.display();
        textField.display();

        button.setText("This text replaces an A button");
        checkbox.setText("This text replaces an A checkbox");
        textField.setText("text replaces an A textFiedl");

        factory = new BFactory();

        button = factory.createButton("This is a B button");
        checkbox = factory.createCheckbox("This is a B checkbox");
        textField = factory.createTextField("This is a B text field");

        button.display();
        checkbox.display();
        textField.display();

        button.setText("This text replaces a B button");
        checkbox.setText("This text replaces a B checkbox");
        textField.setText("text replaces a B textFiedl");

        // setText() is better to be defined and implemented in the common base class,
        // so that button, checkbox, and textfield use/inherit it.
    }
}
