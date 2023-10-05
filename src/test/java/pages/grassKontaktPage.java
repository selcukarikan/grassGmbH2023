package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class grassKontaktPage {
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