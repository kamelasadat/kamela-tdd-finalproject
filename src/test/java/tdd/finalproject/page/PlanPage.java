package tdd.finalproject.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tdd.finalproject.utility.SeleniumUtilities;
public class PlanPage extends SeleniumUtilities {


@FindBy (xpath = "/html/body/div[1]/div/div[2]/div/div/a[2]")

public WebElement planBtn;


@FindBy (xpath = "/html/body/div[1/div/div[3]/div/div/div/div/table/tbody/tr[1]/td[2]")

        public WebElement motorcycle;

        @FindBy (xpath = "/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[2]/td[2]")

        public WebElement boat;

        @FindBy (xpath = "/html/body/div[1]/div/div[31/div/div/div/div/table/tbody/tr [3]/td[2]")

        public WebElement renters;

        @FindBy (xpath = "/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[4]/td[2]")

        public WebElement auto;

        @FindBy (xpath = "/htm/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr [1]/td[4]")

        public WebElement creationDate;

        @FindBy (xpath = "/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[1]/td[5]")

        public WebElement expirationDate;

    }


