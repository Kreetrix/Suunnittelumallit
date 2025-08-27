package Assignment_2.A;

import Assignment_2.Button;
import Assignment_2.Checkbox;
import Assignment_2.TextField;
import Assignment_2.UIFactory;

public class AFactory extends UIFactory {

    @Override
    public Button createButton(String text) {
        return new ButtonA(text);
    }

    @Override
    public Checkbox createCheckbox(String text) {
        return new CheckboxA(text);
    }

    @Override
    public TextField createTextField(String text) {
        return new TextFieldA(text);
    }

}
