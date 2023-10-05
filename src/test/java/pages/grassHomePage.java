package pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class grassHomePage {
    public grassHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Alle akzeptieren']")
    public WebElement Cookies;

    @FindBy(xpath = "(//span[@class='menu-text'])[12]")
    public WebElement Kontaktbutton;
}
