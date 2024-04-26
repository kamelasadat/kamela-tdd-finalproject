package tdd.finalproject.test;


import org.testng.Assert;
import org.testng.annotations.Test;
import tdd.finalproject.base.BaseUITest;

public class CreateAccountTest extends BaseUITest {
    @Test
    public void clickOnCreateAccountBtn(){
        clickOnElement(homePage.createPrimaryAccountButton);
    }
    @Test
    public void validateFormTitleAsExpectedInCreateAccountPage() {
        clickOnElement(homePage.createPrimaryAccountButton);
        String expectedTitle = "Create Primary Account Holder";
        String actualTitle = getElementText(createAccountPage.createPrimaryAccountHolderTitle);
        Assert.assertEquals(actualTitle,expectedTitle,
                "The expected title should be same as the actual title");
    }
    @Test
    public void fillUpTheFormClickOnCreateAccountBtnAndValidateUserNavigatesToSignUpPageAndValidateEmailAsExpected(){
        clickOnElement(homePage.createPrimaryAccountButton);
        sendText(createAccountPage.userEmail,"kamela.sadat@tekschool.com");
        sendText(createAccountPage.firstName,"kamela");
        selectFromDropDown(createAccountPage.userGender,"Famil");
        sendText(createAccountPage.employmentStatus,"student");
        selectFromDropDown(createAccountPage.userTitle,"Mrs.");
        sendText(createAccountPage.userLastName,"sadat");
        selectFromDropDown(createAccountPage.maritalStatus,"Single");
        sendText(createAccountPage.dateOfBirth,"06/017/1990");
        clickOnElement(createAccountPage.createAccountBtn);

        boolean isSignUpYourAccountPageDisplayed = isElementDisplayed(createAccountPage.SignUpYourAccountPage);
        Assert.assertTrue(isSignUpYourAccountPageDisplayed);

        String expectedEmail = "kamela.sadat@tekscool.com";
        String actualEmail = getElementText(createAccountPage.validateEmailAddressAsExpected);
        Assert.assertEquals(actualEmail,expectedEmail,
                "The expected email should be same as the actual email");
    }
    @Test
    public void createAccountWithExistingEmailAndValidateErrorMessageAzsExpected(){
        clickOnElement(homePage.createPrimaryAccountButton);
        sendText(createAccountPage.userEmail,"kamela.sadat@tekschool.com");
        sendText(createAccountPage.firstName,"kamela");
        selectFromDropDown(createAccountPage.userGender,"Famil");
        sendText(createAccountPage.employmentStatus,"student");
        selectFromDropDown(createAccountPage.userTitle,"Mrs.");
        sendText(createAccountPage.userLastName,"sadat");
        selectFromDropDown(createAccountPage.maritalStatus,"Married");
        sendText(createAccountPage.dateOfBirth,"06/17/1990");
        clickOnElement(createAccountPage.createAccountBtn);

        String expectedErrorMessage = "Account with email Hejaz0984@gmail.com is exist";
        String actualErrorMessage = getElementText(createAccountPage.emailErrorMessage);
        String deletedErrorText = actualErrorMessage.replace("ERROR","").trim();
        Assert.assertEquals(deletedErrorText,expectedErrorMessage,
                "The expected error message should be same as actual error message");
    }

}
