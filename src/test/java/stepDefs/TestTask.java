package stepDefs;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;
import static pageObjects.ApplyToConsultationPage.*;
import static pageObjects.NavigationMenuWidget.clickFunctions;
import static pageObjects.NavigationMenuWidget.clickWhatIsEdlus;
import static pageObjects.WhatIsEdlusPage.*;

public class TestTask {
    @When("user opens {string}")
    public void userOpens(String webLink) {
        Configuration.browserSize = "1920x1080";
        open(webLink);
    }

    @Then("page title is {string}")
    public void pageTitleIs(String expectedTitle) {
        $("title").shouldHave(attribute("text", expectedTitle));
    }

    @When("user clicks on {string} hyperlink in menu")
    public void userClickOnHyperlink(String linkName) {
        switch (linkName) {
            case "Funkcijas":
                clickFunctions();
                break;
            case "Kas ir EDLUS":
                clickWhatIsEdlus();
                break;
        }
    }

    @When("user navigates back")
    public void userNavigatesBack() {
        back();
    }

    @Then("he is on the main page")
    public void heIsOnTheMainPage() {
        webdriver().shouldHave(url("https://edlus.lmt.lv/"));
    }

    @Then("“Pieteikties konsultācijai” button is visible")
    public void pieteiktiesKonsultācijaiButtonIsVisible() {
        applyBtnVisible();
    }

    @And("user clicks apply to consultation")
    public void clicksApplyToConsultation() {
        clickApplyBtn();
        switchTo().window("LMT | Biznesa pakalpojuma pieteikums");
    }


    @And("^user fills in all information: (.*), (.*), (.*), (.*), (.*),(.*)$")
    public void userFillsInAllInformationCompanyTitleNameSurnamePhoneNumberEmail(String companyTitle, String name, String surname, String phoneNumber, String email, String comment) {
        enterCompanyName(companyTitle);
        enterClientName(name);
        enterClientSurname(surname);
        enterPhoneNumber(phoneNumber);
        enterEmail(email);
        enterComment(comment);
    }

    @And("close current window")
    public void closeCurrentWindow() {
        Selenide.closeWindow();
    }
}
