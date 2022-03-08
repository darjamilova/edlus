package pageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class NavigationMenuWidget {
    private static SelenideElement functions = $(By.xpath(".//ul[@id='menu-biznesam-1']/li[4]"));
    private static SelenideElement whatIsEdlus = $(By.xpath(".//ul[@id='menu-biznesam-1']/li[2]"));

    public static FunctionsPage clickFunctions() {
        functions.click();
        return new FunctionsPage();
    }

    public static WhatIsEdlusPage clickWhatIsEdlus() {
        whatIsEdlus.click();
        return new WhatIsEdlusPage();
    }
}
