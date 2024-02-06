package steps;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;
import pages.SignupLoginPage;
import pages.SignupPage;

public class RegistrationTestSteps extends TestBase {

   HomePage HomePageObject = new HomePage(driver);
   SignupLoginPage SignupLoginPageObject = new SignupLoginPage(driver);
    SignupPage SignupPageObject = new SignupPage(driver);

    @Given("User is in home page")
    public void user_is_in_home_page() {
        Assert.assertEquals(driver.getTitle(),"Automation Exercise");

    }
    @When("he click on signup login button")
    public void he_click_on_signup_login_button() {
    HomePageObject.ClickOnSignupLoginButton();
    }
    @When("enters his name")
    public void enters_his_name() {
     SignupLoginPageObject.SetSignupName("Ahmed");
    }
    @When("enters his email")
    public void enters_his_email() {
        SignupLoginPageObject.SetSignupEmail("Ahmed@Test2.com");
    }
    @When("clicks on signup button")
    public void clicks_on_signup_button() {
        SignupLoginPageObject.ClickOnSignup();
    }
    @Then("user is redirected to signup page")
    public void user_is_redirected_to_signup_page() {
        Assert.assertEquals(driver.getTitle(), "Automation Exercise - Signup");
    }

    @And("choose gender male")
    public void chooseGenderMale() {
        SignupPageObject.SetGender("Mr");
    }

    @And("enters his password")
    public void entersHisPassword() {
        SignupPageObject.SetPassword("Ahmed_122");
    }

    @And("choose date month year of birth")
    public void chooseDateMonthYearOfBirth() {
        SignupPageObject.SetBirthdayDropdown("5");
        SignupPageObject.SetBirthMonthDropdown(12);
     SignupPageObject.SetBirthYearDropdown("1990");
    }

    @And("enters his first name")
    public void entersHisFirstName() {
     SignupPageObject.SetFirstName("Ahmed");

    }

    @And("enters his last name")
    public void entersHisLastName() {
     SignupPageObject.SetLastName("Mohamed");

    }

    @And("enters his address")
    public void entersHisAddress() {
     SignupPageObject.SetAddress("Haram-Giza");
    }

    @And("choose his country")
    public void chooseHisCountry() {
    SignupPageObject.SelectCountyDropdown("Canada");
    }

    @And("enters his state")
    public void entersHisState() {
     SignupPageObject.SetState("Cairo");
    }

    @And("enters his city")
    public void entersHisCity() {
     SignupPageObject.SetCity("Egypt");
    }

    @And("enters his zipcode")
    public void entersHisZipcode() {
     SignupPageObject.SetZipCode("12511");
    }

    @And("enters his mobile number")
    public void entersHisMobileNumber() {
     SignupPageObject.SetMobileNumber("+2015467895");
    }

    @And("click on create account")
    public void clickOnCreateAccount() {
     // SignupPageObject.ClickOnCreateAccountButton();
    }

    @Then("user is redirected to Automation Exercise - Account Created page")
    public void userIsRedirectedToAutomationExerciseAccountCreatedPage() {
     //Assert.assertEquals(driver.getTitle(),"Automation Exercise - Account");
    }
}
