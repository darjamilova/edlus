package pageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class WhatIsEdlusPage {
    private static SelenideElement applyBtn = $(By.id("kas-ir-edlus-pieteikties"));

    public static ApplyToConsultationPage clickApplyBtn() {
        //to-do: improve tests stability - add check that button position does not change at the moment of the click
        applyBtn.waitUntil(visible, 5000);
        applyBtn.waitUntil(visible, 5000);
        applyBtn.click();
        return new ApplyToConsultationPage();
    }

    public static void applyBtnVisible() {
        applyBtn.shouldBe(visible);
    }
}
