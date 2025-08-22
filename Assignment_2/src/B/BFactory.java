package src.B;

import src.Button;
import src.Checkbox;
import src.TextField;
import src.UIFactory;

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
