package Assignment_2.B;

import Assignment_2.Button;
import Assignment_2.Checkbox;
import Assignment_2.TextField;
import Assignment_2.UIFactory;

public class BFactory extends UIFactory {

    @Override
    public Button createButton(String text) {
        return new ButtonB(text);
    }

    @Override
    public Checkbox createCheckbox(String text) {
        return new CheckboxB(text);
    }

    @Override
    public TextField createTextField(String text) {
        return new TextFieldB(text);
    }

}
