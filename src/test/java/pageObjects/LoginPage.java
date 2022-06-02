package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utilities.WaitHelper;

import java.awt.*;
import java.io.IOException;

public class LoginPage {

    public WebDriver Idriver;
    WaitHelper waitHelper;

    public LoginPage(WebDriver rdriver) {
        Idriver = rdriver;
        PageFactory.initElements(rdriver, this);
        waitHelper = new WaitHelper(Idriver);

    }

    @FindBy(how = How.CLASS_NAME, using = "icon-container")
    @CacheLookup
    WebElement loginButton;

    @FindBy(how = How.ID, using = "username")
    @CacheLookup
    WebElement username;

    @FindBy(how = How.ID, using = "password")
    @CacheLookup
    WebElement password;

    @FindBy(how = How.NAME, using = "action")
    @CacheLookup
    WebElement clickLoginButton;

    @FindBy(how = How.XPATH, using = "//span[normalize-space()='New Engagement']")
    @CacheLookup
    WebElement createTriggerButton;

    @FindBy(how = How.CSS, using = "body > app-root:nth-child(1) > app-navbar:nth-child(1) > mat-sidenav-container:nth-child(2) > mat-sidenav-content:nth-child(8) > div:nth-child(2) > app-engagement-creation:nth-child(2) > div:nth-child(1) > div:nth-child(1) > app-triggers:nth-child(3) > div:nth-child(1) > app-base-card-container:nth-child(1) > div:nth-child(1) > div:nth-child(1) > app-base-card:nth-child(1) > div:nth-child(1)")
    @CacheLookup
    WebElement clickLocationButton;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space()='Place your Location Fences']")
    @CacheLookup
    WebElement placeLocationTitle;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-engagement-creation[1]/div[1]/div[1]/app-triggers[1]/div[1]/app-base-card-container[1]/div[1]/div[1]/app-base-card[2]/div[1]")
    @CacheLookup
    WebElement clickImageButton;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-engagement-creation[1]/div[1]/div[1]/app-image-trigger[1]/app-creation-container[1]/div[1]/div[2]/div[1]/app-image-file-upload[1]/div[1]/section[1]/div[1]/button[1]/span[1]/span[1]")
    @CacheLookup
    WebElement selectImage;

    @FindBy(how = How.CSS, using = "/html[1]/body[1]/app-root[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-engagement-creation[1]/div[1]/div[1]/app-image-trigger[1]/app-creation-container[1]/div[1]/div[2]/div[1]/app-image-file-upload[1]/div[1]/section[1]/div[1]/button[1]/span[1]/span[1]")
    @CacheLookup
    WebElement clickAudioButton;

    @FindBy(how = How.XPATH, using = "//mat-icon[normalize-space()='dashboard']")
    @CacheLookup
    WebElement clickDashboardButton;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Browse for Audio Files')]")
    @CacheLookup
    WebElement audioFileUpload;

    @FindBy(how = How.XPATH, using = "//*[@data-test='next-button']")
    @CacheLookup
    WebElement targetPageButton;

    @FindBy(how = How.CSS, using = " div[data-test='target-page-create-BUY'] span[class='text']")
    @CacheLookup
    WebElement buyButton;

    @FindBy(how = How.NAME, using = "title")
    @CacheLookup
    WebElement notificationTitleBox;

    @FindBy(how = How.NAME, using = "subtitle")
    @CacheLookup
    WebElement notificationSubtitleBox;

    @FindBy(how = How.NAME, using = "url")
    @CacheLookup
    WebElement productURLBox;

    @FindBy(how = How.XPATH, using = "//*[@data-test='next-button']")
    @CacheLookup
    WebElement confirmAndPublishButton;

    @FindBy(how = How.XPATH, using = "//*[@data-test='next-button']")
    @CacheLookup
    WebElement confirmAndPublishButton2;

    @FindBy(how = How.XPATH, using = "//*[@data-test='engagement-name-input']")
    @CacheLookup
    WebElement nameOfEngagementBox;

    @FindBy(how = How.ID, using = "first-name")
    @CacheLookup
    WebElement firstNameField;

    @FindBy(how = How.ID, using = "last-name")
    @CacheLookup
    WebElement lastNameField;

    @FindBy(how = How.ID, using = "business-name")
    @CacheLookup
    WebElement BusinessNameField;

    @FindBy(how = How.ID, using = "billing-phone")
    @CacheLookup
    WebElement billingPhoneField;

    @FindBy(how = How.NAME, using = "name-on-card")
    @CacheLookup
    WebElement nameOnCardField;

    @FindBy(how = How.NAME, using = "street-1")
    @CacheLookup
    WebElement streetNameField;

    @FindBy(how = How.NAME, using = "street-2")
    @CacheLookup
    WebElement streetNameField2;


    @FindBy(how = How.NAME, using = "city")
    @CacheLookup
    WebElement cityNameField;


    @FindBy(how = How.NAME, using = "state")
    @CacheLookup
    WebElement stateNameField;

    @FindBy(how = How.NAME, using = "zip")
    @CacheLookup
    WebElement postCodeField;

    @FindBy(how = How.XPATH, using = "//*[@name='cardnumber']")
    @CacheLookup
    WebElement cardNumberField;

    @FindBy(how = How.XPATH, using = "//*[@placeholder='MM / YY']")
    @CacheLookup
    WebElement expiryDateField;

    @FindBy(how = How.XPATH, using = "//*[@placeholder='CVC']")
    @CacheLookup
    WebElement cvcField;

    @FindBy(how = How.XPATH, using = "//*[@id='mat-checkbox-1-input']")
    @CacheLookup
    WebElement agreeButton;


    public String getPageTitle() {

        return Idriver.getTitle();
    }

    public void clickLoginButtonInitial() {
        waitHelper.WaitForElement(loginButton, 30);
        loginButton.click();
    }

    public void setUsername(String uname) {
        waitHelper.WaitForElement(username, 30);
        username.clear();
        username.sendKeys(uname);
    }

    public void setPassword(String pwd) {
        waitHelper.WaitForElement(password, 30);
        password.clear();
        password.sendKeys(pwd);
    }

    public void clickLoginButton() {
        waitHelper.WaitForElement(clickLoginButton, 30);
        clickLoginButton.click();
    }

    public void clickCreateTriggerButton() {
        waitHelper.WaitForElement(createTriggerButton, 30);
        createTriggerButton.click();
    }

    public void clickLocationButton() {
        waitHelper.WaitForElement(clickLocationButton, 30);
        clickLocationButton.click();
    }

    public void clickImageButton() {
        waitHelper.WaitForElement(clickImageButton, 30);
        clickImageButton.click();
    }

    public void selectImage() throws AWTException, InterruptedException {

        waitHelper.WaitForElement(selectImage, 30);
        selectImage.click();
        try {
            Thread.sleep(1000);
            Runtime.getRuntime().exec("files/fileUpload.exe" + " " + "C:\\Users\\chris\\IdeaProjects\\RezolveFramework\\files\\minion.jpg");
        } catch (IOException e) {
            e.printStackTrace();
        }

        waitHelper.WaitForElement(targetPageButton, 30);
        Assert.assertTrue(targetPageButton.isDisplayed());


    }

    public void targetPageButton() {

        waitHelper.WaitForElementClickable(targetPageButton, 30);
        Assert.assertTrue(targetPageButton.isEnabled());
        try {
            targetPageButton.click();
        } catch (org.openqa.selenium.StaleElementReferenceException ex) {
            targetPageButton.click();
        }

    }

    public void buyPageButton() {

        waitHelper.WaitForElementClickable(buyButton, 30);
        Assert.assertTrue(buyButton.isEnabled());
        buyButton.click();

    }

    public void createBuyTarget() {

        waitHelper.WaitForElementClickable(notificationTitleBox, 30);
        Assert.assertTrue(notificationTitleBox.isEnabled());
        notificationTitleBox.sendKeys("Test");
        waitHelper.WaitForElementClickable(notificationTitleBox, 30);
        Assert.assertTrue(notificationTitleBox.isEnabled());
        notificationSubtitleBox.sendKeys("Test123");
        waitHelper.WaitForElementClickable(productURLBox, 30);
        Assert.assertTrue(productURLBox.isEnabled());
        productURLBox.sendKeys("https://www.bbc.co.uk/news");

    }

    public void confirmAndPublish() {

        try {
            waitHelper.WaitForElementClickable(confirmAndPublishButton, 30);
            Assert.assertTrue(confirmAndPublishButton.isEnabled());
            confirmAndPublishButton.click();

            waitHelper.WaitForElementClickable(nameOfEngagementBox, 30);
            Assert.assertTrue(nameOfEngagementBox.isEnabled());
            nameOfEngagementBox.sendKeys("Test");

            waitHelper.WaitForElementClickable(confirmAndPublishButton2, 30);
            Assert.assertTrue(confirmAndPublishButton2.isEnabled());
            confirmAndPublishButton2.click();
        }
        catch (StaleElementReferenceException e){

        }


    }

    public void paymentDetails(){
        waitHelper.WaitForElementClickable(firstNameField, 30);
        Assert.assertTrue(firstNameField.isEnabled());
        firstNameField.sendKeys("Christy");

        waitHelper.WaitForElementClickable(lastNameField, 30);
        Assert.assertTrue(lastNameField.isEnabled());
        lastNameField.sendKeys("Test");

        waitHelper.WaitForElementClickable(BusinessNameField, 30);
        Assert.assertTrue(BusinessNameField.isEnabled());
        BusinessNameField.sendKeys("Test");

        waitHelper.WaitForElementClickable(billingPhoneField, 30);
        Assert.assertTrue(billingPhoneField.isEnabled());
        billingPhoneField.sendKeys("7449857228");

        waitHelper.WaitForElementClickable(nameOnCardField, 30);
        Assert.assertTrue(nameOnCardField.isEnabled());
        nameOnCardField.sendKeys("C Varghese");
/////
        streetNameField.sendKeys("Amboise");
        streetNameField2.sendKeys("Wayside Road");
        cityNameField.sendKeys("Basingstoke");
        stateNameField.sendKeys("Hampshire");
        postCodeField.sendKeys("RG23 8BH");

       /* waitHelper.WaitForElementClickable(cardNumberField, 30);
        Assert.assertTrue(cardNumberField.isEnabled());
        cardNumberField.sendKeys("4586217896541568");

        waitHelper.WaitForElementClickable(expiryDateField, 30);
        Assert.assertTrue(expiryDateField.isEnabled());
        expiryDateField.sendKeys("1023");

        waitHelper.WaitForElementClickable(cvcField, 30);
        Assert.assertTrue(cvcField.isEnabled());
        cvcField.sendKeys("889");

        waitHelper.WaitForElementClickable(agreeButton, 30);
        Assert.assertTrue(agreeButton.isEnabled());
        agreeButton.click();*/

    }
/*
    public void engagementNameField(){

        waitHelper.WaitForElementClickable(nameOfEngagementBox, 30);
        Assert.assertTrue(nameOfEngagementBox.isEnabled());
        confirmAndPublishButton.sendKeys("Test");
    }*/
//
/*    public void clickAudioButton() {
        waitHelper.WaitForElement(clickAudioButton, 30);
        clickAudioButton.click();
    }

    public void uploadAudioFile() {

        Actions actions = new Actions(Idriver);
        waitHelper.WaitForElement(audioFileUpload, 30);
        actions.moveToElement(audioFileUpload).perform();
        audioFileUpload.sendKeys("C:\\Users\\chris\\Documents\\piano.wav");
    }*/
}
