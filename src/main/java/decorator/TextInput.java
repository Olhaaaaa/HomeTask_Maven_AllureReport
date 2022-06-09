package decorator;

import org.openqa.selenium.WebElement;

public class TextInput extends AbstractElement{
    public TextInput(WebElement webElement) {
        super(webElement);
    }

    public void sendKeys(CharSequence... keysToSend) {
        try {
            webElement.clear();
            super.sendKeys(keysToSend);
            System.out.println("Entered value is: " + keysToSend);
        } catch (Exception e) {
            System.out.println("Entered value is failed because of: " + e);
        }
    }
}
