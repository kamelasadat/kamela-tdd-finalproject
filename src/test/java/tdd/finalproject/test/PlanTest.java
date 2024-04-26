package tdd.finalproject.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import tdd.finalproject.base.BaseUITest;

public class PlanTest extends BaseUITest {

    @Test
    public void navigateToCustomerServicePortalWithVaLidCredentialsAndNavigateToPlanPage() {

        clickOnElement(loginPage.loginBtn);

        sendText(loginPage.userName, "supervisor");

        sendText(loginPage.loginPassword, "tek_supervisor");

        clickOnElement(loginPage.signInBtn);

        clickOnElement(loginPage.loginBtn);
    }

    @Test
    public void validateFourRow0fDataAfterNavigatingToPlanPage() {
    clickOnElement(loginPage.loginBtn);

    sendText(loginPage.userName, "supervisor");
    sendText(loginPage.loginPassword, "tek_supervisor");
    clickOnElement(loginPage.signInBtn);
    clickOnElement(loginPage.loginBtn);

    boolean isMotorcycLePresent = isElementDisplayed(loginPage.motorcycle);
Assert.assertTrue(isMotorcycLePresent);
    boolean isBoatPresent = isElementDisplayed(loginPage.boat);
Assert.assertTrue(isBoatPresent);
    boolean isRentersPresent = isElementDisplayed(planPage.renters);
Assert.assertTrue(isRentersPresent);
    boolean isAutoPresent = isElementDisplayed(planPage.auto);
Assert.assertTrue(isAutoPresent);

}
    boolean isBoatPresent = isElementDisplayed(planPage.boat);
 Assert.assertTrue(isBoatPresent);
    boolean isRentersPresent = isElementDisplayed(planPage.renters);
Assert.assertTrue(isRentersPresent):

    boolean isAutoPresent = isElementDisplayed(planPage.auto);
Assert.assertTrue(isAutoPresent);
    @Test
    public void validateCreateDateAndExpirationDateAfterLoginAndNavigatingToPLansPage(){
        clickOnElement(loginPage.loginBtn);
        sendText(loginPage.userName, "supervisor");
        sendText (loginPage.loginPassword,"tek_supervisor"):
        clickOnElement(loginPage.signInBtn);
        clickOnElement(planPage.planBtn);

        String actualCreationDate = getELementText(pLanPage.creationDate);
        String expectedCreationDate = April 17, 2024;
        Assert.assertEquals(actualCreationDate, expectedCreationDate,
                message: "Expected creation date should match actual creation date*);
        String actualExpirationDate = getElementText(planPage.expirationDate);
        String exp

        ectedExpirationDate = "April 18, 2024";
        Assert.assertEquals(actualExpirationDate, expectedExpirationDate,
                message: "Expected expiration date should match actual expiration date*);
}
