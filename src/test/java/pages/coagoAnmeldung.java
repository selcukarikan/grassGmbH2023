package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class coagoAnmeldung {
    public coagoAnmeldung (){
        PageFactory.initElements(Driver.getDriver(), this);

    }
}
