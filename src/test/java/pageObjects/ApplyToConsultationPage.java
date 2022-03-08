package pageObjects;

import com.codeborne.selenide.ClickOptions;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class ApplyToConsultationPage {
    static String applyBtn = "popupBtn2";
    static String companyNameInput = "companyId2";
    static String userNameInput = "nameId2";
    static String userSurnameInput = "surnameId2";
    static String phoneInput = "phoneId2";
    static String emailInput = "emailId2";
    static String commentInput = "commentId2";
    static String consentCheckbox = "checkbox-atruna";


    public static void fillInInformation() {
        $(byId(applyBtn)).click();
    }

    public static void enterCompanyName(String companyName) {
        $(byId(companyNameInput)).setValue(companyName);
    }

    public static void enterClientName(String clientName) {
        $(byId(userNameInput)).setValue(clientName);
    }

    public static void enterClientSurname(String clientSurname) {
        $(byId(userSurnameInput)).setValue(clientSurname);
    }

    public static void enterPhoneNumber(String phone) {
        $(byId(phoneInput)).setValue(phone);
    }

    public static void enterEmail(String email) {
        $(byId(emailInput)).setValue(email);
    }

    public static void enterComment(String comment) {
        $(byId(commentInput)).setValue(comment);
    }

    public static void tickCheckbox() {
//        executeJavaScript("document.getElementsByName('checkbox-atruna')[0].type='display';");
//        Coordinates coordinates = $(byId(consentCheckbox)).getCoordinates();
//        $(byId(consentCheckbox)).click(ClickOptions.usingJavaScript().offset(1, 1));
//        click(coordinates.onScreen().getX(), coordinates.onScreen().getY());

    }


}
