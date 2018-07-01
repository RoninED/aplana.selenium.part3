package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    Wait <WebDriver> wait;

    public MainPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
       wait = new WebDriverWait(webDriver, 15, 500);

    }


    @FindBy(xpath = "//UL[@class='lg-menu__list']")
    WebElement Страхование;

    @FindBy (xpath = "//A[text()='Путешествия и покупки']")
    WebElement ПутешествияИПокупки;



    public void selectMenu (String nameMenu){
        Страхование.findElement(By.xpath(".//SPAN[text()='"+nameMenu+"']")).click();
    }

    public void selectSubMenu (String nameSubMenu){
        wait.until(ExpectedConditions.visibilityOf(ПутешествияИПокупки)).click();
    }


    @FindBy (xpath = "//A[text()='Оформить онлайн']")
    WebElement clickButtonОформитьоОнлайн;
    public void clickButtonОформитьоОнлайн (){
        wait.until(ExpectedConditions.visibilityOf(clickButtonОформитьоОнлайн)).click();
    }


}