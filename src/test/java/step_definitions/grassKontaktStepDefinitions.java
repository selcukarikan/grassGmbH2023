package step_definitions;


import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.grassHomePage;
import pages.grassKontaktPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class grassKontaktStepDefinitions {

    Faker faker=new Faker();
    grassHomePage grassHomePage=new grassHomePage();

    grassKontaktPage grassKontaktPage=new grassKontaktPage();


    @Given("User am on the Grass GmbH Homepage")
    public void userAmOnTheGrassGmbHHomepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("grassUrlHomepage"));
    }

    @And("User click on the Kontakt menu")
    public void userClickOnTheKontaktMenu() {
        grassHomePage.Kontaktbutton.click();
    }

    @And("User enter Telefonnummer in the Telefonnummer field")
    public void userEnterTelefonnummerInTheTelefonnummerField() {
        grassKontaktPage.Telefonnummer.sendKeys(faker.phoneNumber().cellPhone());
    }

    @And("User enter email in the Email field")
    public void userEnterEmailInTheEmailField() {
        grassKontaktPage.Email.sendKeys(faker.internet().emailAddress());
    }

    @And("User click on the Cookies option")
    public void userClickOnTheCookiesOption() {
        grassHomePage.Cookies.click();
    }

    @And("User fill in a message in the Ihre Nachricht field")
    public void userFillInAMessageInTheIhreNachrichtField() {
        grassKontaktPage.IhreNachricht.sendKeys(faker.random().hex());
    }

    @And("User click on the Ich stimme zu option")
    public void userClickOnTheIchStimmeZuOption() {
        grassKontaktPage.Stimme.click();
    }

    @And("User click on the Send button")
    public void userClickOnTheSendButton() {
        grassKontaktPage.Senden.click();
    }

    @Then("User want to verify if the text Ihre Nachricht wurde versendet is displayed")
    public void userWantToVerifyIfTheTextIhreNachrichtWurdeVersendetIsDisplayed() {
        Assert.assertTrue(grassKontaktPage.Nachrichtversendet.getText().contains("Senden\n" +
                "Ihre Nachricht wurde versendet."));
    }

    @And("User enter String Telefonnummer in the Telefonnummer field")
    public void userEnterStringTelefonnummerInTheTelefonnummerField() {
        grassKontaktPage.Telefonnummer.sendKeys(faker.random().hex());
    }

    @And("User enter name in the Name field")
    public void userEnterNameInTheNameField() {
        grassKontaktPage.Name.sendKeys(faker.name().fullName());
    }
}


