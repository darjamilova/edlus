package pageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private static SelenideElement mainText = $(By.xpath(".//div[@class='col content']/h1"));

    public boolean isMainPageDisplayed() {
        return mainText.isDisplayed() &&
                mainText.text().equals("LMT elektroniskā darbalaika uzskaite – EDLUS");
    }
}
