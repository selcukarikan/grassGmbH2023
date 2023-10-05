package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class grassKontaktPage {
    public grassKontaktPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath="//input[@id='form-field-name']")
    public WebElement Name;

    @FindBy(xpath="//input[@id='form-field-field_b6585d3']")
    public WebElement Telefonnummer;

    @FindBy(xpath="//input[@id='form-field-email']")
    public WebElement Email;

    @FindBy(xpath="//textarea[@id='form-field-message']")
    public WebElement IhreNachricht;

    @FindBy(xpath="//input[@id='form-field-field_ba1ce13']")
    public WebElement Stimme;

    @FindBy(xpath = "//span[contains(text(),'Senden')]")
    public WebElement Senden;
    @FindBy(xpath = "//div[@role='alert']")

    public WebElement Nachrichtversendet;
}