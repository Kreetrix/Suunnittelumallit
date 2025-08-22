package src.A;

import src.Button;
import src.Checkbox;
import src.TextField;
import src.UIFactory;

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
