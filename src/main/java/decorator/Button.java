package decorator;

import org.openqa.selenium.WebElement;

public class Button extends AbstractElement{
    public Button(WebElement webElement) {
        super(webElement);
    }

    public void click() {
        try {
            super.click();
            System.out.println("Clicked successfully");
        } catch (Exception e) {
            System.out.println("Unable to click on field because of: " + e);
        }
    }
}
