package pageObjects;

import com.codeborne.selenide.SelenideElement;
import lombok.SneakyThrows;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class CookiesWidget {
    private static SelenideElement acceptAppBtn = $(By.xpath(".//*[@class='btn lmt-btn-type-primary lmt-btn-color-black-1']"));

    @SneakyThrows
    public static void acceptAllCookies() {
        Thread.sleep(2000);
        if (acceptAppBtn.isDisplayed()) {
            acceptAppBtn.click();
        }
    }
}
