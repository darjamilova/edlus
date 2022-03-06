package pageObjects;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class NavigationMenuWidget {
    static String functions = ".//ul[@id='menu-biznesam-1']/li[4]";
    static String whatIsEdlus = ".//ul[@id='menu-biznesam-1']/li[2]";

    public static FunctionsPage clickFunctions() {
        $(byXpath(functions)).click();
        return new FunctionsPage();
    }

    public static WhatIsEdlusPage clickWhatIsEdlus() {
        $(byXpath(whatIsEdlus)).click();
        return new WhatIsEdlusPage();
    }
}
