package tdd.finalproject.test;
import org.testng.Assert;
import org.testng.annotations.Test;
import tdd.finalproject.base.BaseUITest;
import tdd.finalproject.page.AccountPage;

public class AccountTest extends BaseUITest {
    @Test
    public void LoginWithValidInfoAndNavigateToAccountsAndVerifyFivePageIsDefault() {
        clickOnElement(loginPage.loginBtn);
        sendText(loginPage.userName, "supervisor");
        sendText(loginPage.userPassword, "tek_supervisor");
        clickOnElement(loginPage.signInBtn);
        clickOnElement(AccountPage.signInBtn);
        String actualRow = getElementText(AccountPage.page5Row);
        String expectedRow = "Show 5";
        Assert.assertEquals(actualRow, expectedRow,
                "The expected row number should be same as actual row number");
    }

        @Test
        public void loginWithValidInfoAndNavigateToAccountsAndChangePageToTenAndValidateItsTabLeRecord() {
            clickOnElement(loginPage.loginBtn);
            sendText(loginPage.userName, "supervisor");
            sendText(loginPage.userPassword, "tek_supervisor");
            clickOnElement(loginPage.signInBtn);
            clickOnElement(AccountPage.accountBtn);
            selectFromDropDown(AccountPage.pageTen, "Show 10");
            int recordCount = AccountPage.countRecordPageTen();
            recordCount--;
            int actualRecord = recordCount;
            int expectedRecord = 10;
            Assert.assertEquals(actualRecord, expectedRecord);
            //justcomment
        }
        @Test
        public void LoginWithValidInfoAndNavigateToAccountsAndChangePageToTwentyFiveAndValidateItsTableRecord () {
            clickOnElement(loginPage.loginBtn);
            sendText(loginPage.userName, "supervisor");
            sendText(loginPage.userPassword, "tek_supervisor");
            clickOnElement(loginPage.signInBtn);
                clickOnElement(AccountPage.accountBtn);
                selectFromDropDown(AccountPage.page25, "Show 25");
                int recordCount1 = AccountPage.countRecordPageTwentyFive;
                recordCount1--;
                int actualRecord1 = recordCount1;
            int expectedRecord1 = 25;
            Assert.assertEquals(actualRecord1, expectedRecord1);
        }

            @Test
            public void loginWithValidInfoAndNavigateToAccountsAndChangePageToFiftyAndValidateItsTabLeRecord() {
                clickOnElement(loginPage.loginBtn);
                sendText(loginPage.userName, "supervisor");
                sendText(loginPage.userPassword, "tek_supervisor");
                clickOnElement(loginPage.signInBtn);
                clickOnElement(AccountPage.accountBtn);
                selectFromDropDown(AccountPage.pageFifty, "Show 50");
                int recordCount2 = AccountPage.countRecordPageFifty();
                recordCount2--;
                int actualRecord2 = recordCount2;
                int expectedRecord2 = 50;
                Assert.assertEquals(actualRecord2, expectedRecord2);
            }
        }


