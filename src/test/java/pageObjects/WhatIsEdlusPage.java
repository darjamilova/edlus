package pageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import lombok.SneakyThrows;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class WhatIsEdlusPage {
    private static SelenideElement applyBtn = $(By.id("kas-ir-edlus-pieteikties"));

    public static ApplyToConsultationPage clickApplyBtn() {
        applyBtn.waitUntil(visible, 5);
        applyBtn.click();
        return new ApplyToConsultationPage();
    }

    public static void applyBtnVisible() {
        applyBtn.shouldBe(visible);
    }
}
