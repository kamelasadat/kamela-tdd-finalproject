package tdd.finalproject.page;
import tdd.finalproject.utility.SeleniumUtilities;
 import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
    public class SignUpPage extends SeleniumUtilities{

    public SignUpPage() {
        PageFactory.initElements(getDriver(),this);
    }

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div/h2[1]")
    public WebElement SignUpYourAccountPage;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div/h2[3]")
    public WebElement validateEmailAddressAsExpected;
}
