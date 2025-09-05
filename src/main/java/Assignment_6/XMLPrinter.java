package Assignment_6;

public class XMLPrinter extends BasePrinter {

    XMLPrinter(Printer wrapped) {
        super(wrapped);
    }

    @Override
    public void print(String message) {
        message = "<message>" + message + "</message>";
        super.print(message);
    }

}
