package pageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ApplyToConsultationPage {
    private static SelenideElement applyBtn = $(By.id("popupBtn2"));
    private static SelenideElement companyNameInput = $(By.id("companyId2"));
    private static SelenideElement userNameInput = $(By.id("nameId2"));
    private static SelenideElement userSurnameInput = $(By.id("surnameId2"));
    private static SelenideElement phoneInput = $(By.id("phoneId2"));
    private static SelenideElement emailInput = $(By.id("emailId2"));
    private static SelenideElement commentInput = $(By.id("commentId2"));
    private static SelenideElement consentCheckbox = $(By.id("checkbox-atruna"));


    public static void fillInInformation() {
        applyBtn.click();
    }

    public static void enterCompanyName(String companyName) {
        companyNameInput.setValue(companyName);
    }

    public static void enterClientName(String clientName) {
        userNameInput.setValue(clientName);
    }

    public static void enterClientSurname(String clientSurname) {
        userSurnameInput.setValue(clientSurname);
    }

    public static void enterPhoneNumber(String phone) {
        phoneInput.setValue(phone);
    }

    public static void enterEmail(String email) {
        emailInput.setValue(email);
    }

    public static void enterComment(String comment) {
        commentInput.setValue(comment);
    }

    public static void tickCheckbox() {
//        executeJavaScript("document.getElementsByName('checkbox-atruna')[0].type='display';");
//        Coordinates coordinates = $(byId(consentCheckbox)).getCoordinates();
//        $(byId(consentCheckbox)).click(ClickOptions.usingJavaScript().offset(1, 1));
//        click(coordinates.onScreen().getX(), coordinates.onScreen().getY());

    }


}
