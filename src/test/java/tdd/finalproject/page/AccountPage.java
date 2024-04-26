package tdd.finalproject.page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tdd.finalproject.utility.SeleniumUtilities;

import java.util.List;

public class AccountPage extends SeleniumUtilities {

    public static WebElement signInBtn;

    public AccountPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public int countRecordPageTen() {
        return recordPageTen.size();
    }
    public int countRecordPageTwentyFive(){
     return recordPageTwentyFive.size();
    }

    public int countRecordPageFifty() {
        return recordPageFifty.size();
    }

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/a[1]")
    public static WebElement accountBtn;

    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div/div/div/div[2]/div/div/div[3]/select/option[1]")
    public WebElement page5Row;

    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div/div/div/div[2]/div/div/div[3]/select")
    public WebElement pageTen;

    @FindBy(xpath = "//tr[@class='css-0']")
    public List<WebElement> recordPageTen;

    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div/div/div/div[2]/div/div/div[3]/select")
    public static WebElement page25;

    @FindBy(xpath = "//tr[@class='css-0']")
    public List<WebElement> recordPageTwentyFive;

    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div/div/div/div[2]/div/div/div[3]/select")
    public  WebElement pageFifty;

    @FindBy(xpath = "//tr[@class='css-0']")
    public List<WebElement> recordPageFifty;
}
