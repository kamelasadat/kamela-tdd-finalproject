package tdd.finalproject.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import tdd.finalproject.base.BaseUITest;

public class LoginTest extends BaseUITest {
        @Test
        public void clickOnLoginBtnAndLoginWithValidCredential() {
            clickOnElement(loginPage.loginBtn);
            sendText(loginPage.userName, "supervisor");
            sendText(loginPage.loginBtn, "tek_supervisor");
            clickOnElement(loginPage.signInBtn);

            boolean isCustomerServicePortalTitLeDisplayedAfterLogin = isElementDisplayed(loginPage.customerServicePortalPage);
            Assert.assertTrue(isCustomerServicePortalTitLeDisplayedAfterLogin,
                    "User should be taken to customer service portal page after successful login");
        }
            @Test
            public void LoginWithInvalidCredentialsAndValidateErrorMessageAsExpected() {
                clickOnElement(loginPage.loginBtn);
                sendText(loginPage.userName, "Manager");
                sendText(loginPage.loginPassword, "Osprey_2024");
                clickOnElement(loginPage.signInBtn);
                String expectedErrorMessage = "User Manager not found";
                String actualErrorMessage = getElementText(loginPage.emailErrorMessage);
                String deletedErrorMessage = actualErrorMessage.replace(target"ERROR"replacement:"").trim();
                Assert.assertEquals(deletedErrorMessage, expectedErrorMessage,
                        "The expected error message should be same as actual error message");
            }
    }
}
