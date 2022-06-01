package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utilities.WaitHelper;

public class LoginPage {

    public WebDriver Idriver;
    WaitHelper waitHelper;

    public LoginPage(WebDriver rdriver) {
        Idriver = rdriver;
        PageFactory.initElements(rdriver, this);
        waitHelper = new WaitHelper(Idriver);

    }

    @FindBy(how = How.CLASS_NAME,using = "icon-container")
    @CacheLookup
    WebElement loginButton;

    @FindBy(how = How.ID,using = "username")
    @CacheLookup
    WebElement username;

    @FindBy(how = How.ID,using = "password")
    @CacheLookup
    WebElement password;

    @FindBy(how = How.NAME,using= "action")
    @CacheLookup
    WebElement clickLoginButton;

    @FindBy(how = How.XPATH,using = "//span[normalize-space()='New Engagement']")
    @CacheLookup
    WebElement createTriggerButton;

    @FindBy(how = How.CSS,using = "body > app-root:nth-child(1) > app-navbar:nth-child(1) > mat-sidenav-container:nth-child(2) > mat-sidenav-content:nth-child(8) > div:nth-child(2) > app-engagement-creation:nth-child(2) > div:nth-child(1) > div:nth-child(1) > app-triggers:nth-child(3) > div:nth-child(1) > app-base-card-container:nth-child(1) > div:nth-child(1) > div:nth-child(1) > app-base-card:nth-child(1) > div:nth-child(1)")
    @CacheLookup
    WebElement clickLocationButton;

    @FindBy(how = How.XPATH,using = "//h2[normalize-space()='Place your Location Fences']")
    @CacheLookup
    WebElement placeLocationTitle;

    @FindBy(how = How.CSS,using = "body > app-root:nth-child(1) > app-navbar:nth-child(1) > mat-sidenav-container:nth-child(2) > mat-sidenav-content:nth-child(8) > div:nth-child(2) > app-engagement-creation:nth-child(2) > div:nth-child(1) > div:nth-child(1) > app-triggers:nth-child(3) > div:nth-child(1) > app-base-card-container:nth-child(1) > div:nth-child(1) > div:nth-child(1) > app-base-card:nth-child(2) > div:nth-child(1)")
    @CacheLookup
    WebElement clickImageButton;

    @FindBy(how = How.CSS,using = "body > app-root:nth-child(1) > app-navbar:nth-child(1) > mat-sidenav-container:nth-child(2) > mat-sidenav-content:nth-child(8) > div:nth-child(2) > app-engagement-creation:nth-child(2) > div:nth-child(1) > div:nth-child(1) > app-triggers:nth-child(3) > div:nth-child(1) > app-base-card-container:nth-child(1) > div:nth-child(1) > div:nth-child(1) > app-base-card:nth-child(3) > div:nth-child(1)")
    @CacheLookup
    WebElement clickAudioButton;

    @FindBy(how = How.XPATH,using = "//mat-icon[normalize-space()='dashboard']")
    @CacheLookup
    WebElement clickDashboardButton;

    public String getPageTitle() {

        return Idriver.getTitle();
    }

    public void clickLoginButtonInitial() {
        waitHelper.WaitForElement(loginButton,30);
        loginButton.click();
    }

    public void setUsername(String uname) {
        waitHelper.WaitForElement(username,30);
        username.clear();
        username.sendKeys(uname);
    }

    public void setPassword(String pwd) {
        waitHelper.WaitForElement(password,30);
        password.clear();
        password.sendKeys(pwd);
    }

    public void clickLoginButton(){
        waitHelper.WaitForElement(clickLoginButton,30);
        clickLoginButton.click();
    }

    public void clickCreateTriggerButton(){
        waitHelper.WaitForElement(createTriggerButton,30);
        createTriggerButton.click();
    }

    public void clickLocationButton(){
        waitHelper.WaitForElement(clickLocationButton,30);
        clickLocationButton.click();
    }
    public void clickImageButton(){
        waitHelper.WaitForElement(clickImageButton,30);
        clickImageButton.click();
    }
    public void clickAudioButton(){
        waitHelper.WaitForElement(clickAudioButton,30);
        clickAudioButton.click();
    }
}
