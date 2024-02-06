package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupPage extends PageBase{
    public SignupPage(WebDriver Driver){
        super(Driver);
    }
    By MaleGender = By.id("id_gender1");
    By FemaleGender = By.id("id_gender2");
    public void SetGender(String text){
        if(text == ("Mr") ){
        ClickOnElement(MaleGender);}
        else {ClickOnElement(FemaleGender);}
    }
    By PasswordField = By.id("password");
    public void SetPassword(String text){
        SetElementText(PasswordField,text);
    }
    By BirthdayDropdown = By.id("days");
    public void SetBirthdayDropdown(String text){
        Select Birthday = new Select(driver.findElement(BirthdayDropdown));
        Birthday.selectByValue(text);
    }
    By BirthMonthDropdown = By.id("months");
    public void SetBirthMonthDropdown(int index){
        Select BirthMonth = new Select(driver.findElement(BirthMonthDropdown));
        BirthMonth.selectByIndex(index);

    }
    By BirthYearDropdown = By.id("years");
    public void SetBirthYearDropdown(String text){
        Select BirthYear = new Select(driver.findElement(BirthYearDropdown));
        BirthYear.selectByVisibleText(text);

    }

    By FirstNameField = By.id("first_name");
    public void SetFirstName(String text){
        SetElementText(FirstNameField,text);
    }
    By LastNameField = By.id("last_name");
    public void SetLastName(String text){
        SetElementText(LastNameField,text);
    }
    By AddressField = By.id("address1");
    By CountryField = By.id("country");
    public void SelectCountyDropdown(String text){
        Select Country = new Select(driver.findElement(CountryField));
        Country.selectByVisibleText(text);
    }
    public void SetAddress(String text){
        SetElementText(AddressField,text);
    }
    By CityField = By.id("city");
    public void SetCity(String text){
        SetElementText(CityField,text);
    }
    By StateField = By.id("state");
    public void SetState(String text){
        SetElementText(StateField,text);
    }
    By ZipCodeField = By.id("zipcode");
    public void SetZipCode(String text){
        SetElementText(ZipCodeField,text);
    }
    By MobileNumberField = By.id("mobile_number");
    public void SetMobileNumber(String text){
        SetElementText(MobileNumberField,text);
    }
    By CreateAccountButton = By.xpath("//button[@data-qa='create-account']");
    public void ClickOnCreateAccountButton(){
        ClickOnElement(CreateAccountButton);
    }




}
