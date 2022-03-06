package pageObjects;

import lombok.Data;
import lombok.SneakyThrows;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;


@Data
public class CookiesWidget {
    static String acceptAppBtn = ".//*[@class='btn lmt-btn-type-primary lmt-btn-color-black-1']";

    @SneakyThrows
    public static void acceptAllCookies() {
        Thread.sleep(2000);
        if ($(byXpath(acceptAppBtn)).isDisplayed()) {
            $(byXpath(acceptAppBtn)).click();
        }
    }
}
