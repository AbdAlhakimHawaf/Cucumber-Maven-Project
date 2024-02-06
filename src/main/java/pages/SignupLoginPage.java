package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupLoginPage extends PageBase {
    public SignupLoginPage(WebDriver Driver){
        super(Driver);
    }
    By SignupNameField = By.xpath("//input[@data-qa='signup-name']");
    By SignupEmailField = By.xpath("//input[@data-qa='signup-email']");
    By SignupButton = By.xpath("//button[@data-qa='signup-button']");
    public void SetSignupName(String text){
        SetElementText(SignupNameField , text);
    }
    public void SetSignupEmail(String text){
      SetElementText(SignupEmailField ,text);
    }


    public void ClickOnSignup(){
        ClickOnElement(SignupButton);
    }

}
