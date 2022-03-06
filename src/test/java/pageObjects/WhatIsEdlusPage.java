package pageObjects;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class WhatIsEdlusPage {
    static String applyBtn = "kas-ir-edlus-pieteikties";

    public static ApplyToConsultationPage clickApplyBtn() {
        $(byId(applyBtn)).click();
        return new ApplyToConsultationPage();
    }

    public static void applyBtnVisible() {
         $(byId(applyBtn)).shouldBe(visible);
    }
}
