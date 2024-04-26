package tdd.finalproject.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import tdd.finalproject.base.BaseUITest;
import tdd.finalproject.page.UserProfilePage;

public class UserProfileTest extends BaseUITest {
    @Test
    public void loginWithValidInfoAndNavigateToCustomerServicePortalAndCLick0nProfiLeBtnAndValidateInfoOnProfile() {

        clickOnElement(loginPage.loginBtn);
        sendText(loginPage.userName, "supervisor");
        sendText(loginPage.loginPassword, "tek_supervisor");
        clickOnElement(loginPage.signInBtn);
        clickOnElement(userProfilePage.profileBtn);
        String actualAccountStatus = getElementText(userProfilePage.validateStatus0fTheAccount);
        String expectedAccountStatus = "Active";
        Assert.assertEquals(actualAccountStatus, expectedAccountStatus,
                "The expected account status should be same as actual status");
        String actualUserType = getElementText(userProfilePage.userTypeText);
        String expectedUserType = "CSR";
        Assert.assertEquals(actualUserType, expectedUserType,
                "The expected account user type text should be same as actual user type text");
        String actualFulName = getElementText(userProfilePage.validateFullName);
        String expectedFulName = "Supervisor";
        Assert.assertEquals(actualFulName, expectedFulName,
                "The expected Full Name should be same as actual Full Name");
        String actualUserName = getElementText(UserProfilePage.validateUserName);
        String expectedUserName = "supervisor";
        Assert.assertEquals(actualUserName, expectedUserName,
                "The expected user name should be same as actual user name");

        String actualAuthority = getElementText(userProfitePage.validateAuthority);
        String expectedAuthority = "admin";
        Assert.assertEquals(actualAuthority, expectedAuthority,
                "The expected authority should be same as actual authority");
    }

        @Test
        public void loginWithValidInfoAndNavigateToCustomerServicePortalAndCLick0nProfiLeBtnAndl() {
            clickOnElement(loginPage.loginBtn);
            sendText(loginPage.userName, "supervisor");
            sendText(loginPage.loginPassword, "tek_supervisor");
            clickOnElement(loginPage.signInBtn);
            clickOnElement(userProfilePage.profileBtn);
            clickOnElement(userProfilePage.logoutBtn);
        }

        @Test
        public void validateUserIsTakenToHomePageAfterLogout(){

        clickOnElement(loginPage.loginBtn);
        sendText(loginPage.userName, "supervisor");
        sendText(loginPage.loginPassword,"tek_supervisor");
        clickOnElement(loginPage.signInBtn);
        clickOnElement(userProfilePage.profileBtn);
        clickOnElement(userProfilePage.LogoutBtn);
        boolean isUserTakenToHomePageAfterLogout = isElementDisplayed(homePage.letsGetYouStarted);
        Assert.assertTrue(isUserTakenToHomePageAfterLogout,
                "User should be taken to homepage after successful logout");
    }
}



