package decorator;

import org.openqa.selenium.WebElement;

public class TextField extends AbstractElement {

    public TextField(WebElement webElement) {
        super(webElement);
    }

    public String getText() {
        String text = "";
        try {
            text = super.getText();
            System.out.println("Text retried is: " + text);
            return text;
        } catch (Exception e) {
            System.out.println("Text not retried because of exception: " + e);
        }
        return text;
    }

}
