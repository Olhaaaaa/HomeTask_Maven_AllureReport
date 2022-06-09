package decorator;

import org.openqa.selenium.WebElement;

public class DisplayElement extends AbstractElement{
    public DisplayElement(WebElement webElement) {
        super(webElement);
    }

    public boolean isDisplayed() {
        boolean flag = false;
        try {
            flag = super.isDisplayed();
            System.out.println("Presence of field is: " + flag);
            return flag;
        } catch (Exception e) {
            System.out.println("Presence of field is: " + flag + "because of: " + e);
            return flag;
        }
    }
}
