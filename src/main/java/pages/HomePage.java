package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase{

    public HomePage (WebDriver driver){
        super(driver);
    }
    By SignupLoginButton = By.xpath("//a[@href='/login']");

    //By SignupLoginButton = By.xpath("//i[@class='fa fa-lock']");

    public void ClickOnSignupLoginButton(){
        ClickOnElement(SignupLoginButton);
    }



}
