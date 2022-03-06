package stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.open;

public class TestTask {
    @When("user opens {string}")
    public void userOpens(String webLink) {
        open(webLink);
    }

    @Then("page title is {string}")
    public void pageTitleIs(String expectedTitle) {


    }
}
