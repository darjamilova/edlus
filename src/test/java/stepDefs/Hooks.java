package stepDefs;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.BeforeAll;
import pageObjects.CookiesWidget;

import static com.codeborne.selenide.Selenide.open;

public class Hooks {
    @BeforeAll
    public static void acceptCookies() {
        Configuration.browserSize = "1920x1080";
        open("https://edlus.lmt.lv/");
        CookiesWidget.acceptAllCookies();
    }
}
