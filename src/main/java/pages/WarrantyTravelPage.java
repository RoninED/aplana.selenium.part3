package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WarrantyTravelPage {
    Wait<WebDriver> wait;
    WebDriver webDriver;

    public WarrantyTravelPage(WebDriver webDriverr) {
        this.webDriver = webDriverr;
        PageFactory.initElements(webDriver, this);
        wait = new WebDriverWait(webDriver, 15, 500);

    }

    public void fillField(By locator, String value) {
        webDriver.findElement(locator).clear();
        webDriver.findElement(locator).sendKeys(value);
    }

    @FindBy(xpath = "//DIV[text()='Минимальная']")
    WebElement priseMinimum;

    public void priseMinimum() {
        wait.until(ExpectedConditions.visibilityOf(priseMinimum)).click();
    }


    @FindBy(xpath = "//SPAN[@ng-click='save()'][text()='Оформить']")
    WebElement КнопкаОформить;

    public void КнопкаОформить() {
        wait.until(ExpectedConditions.visibilityOf(КнопкаОформить)).click();
    }


    public void setФамилия(String Фамилия) {
        fillField(By.xpath("//INPUT[@name='insured0_surname']"), Фамилия);
    }

    public void setИмя(String Имя) {
        fillField(By.xpath("//INPUT[@name='insured0_name']"), Имя);
    }

    public void setДатаРождения(String ДатаРождения) {
        fillField(By.xpath("//INPUT[@name=\"insured0_birthDate\"]/self::INPUT"), ДатаРождения);
    }

    public void setФамилияСтрахователя(String ФамилияСтрахователя) {
        fillField(By.xpath("//INPUT[@name='surname']/self::INPUT"), ФамилияСтрахователя);
    }

    public void setИмяСтрахователя(String ИмяСтрахователя) {
        fillField(By.xpath("//INPUT[@name='name']/self::INPUT"), ИмяСтрахователя);
    }

    public void setОтчествоСтрахователя(String ОтчествоСтрахователя) {
        fillField(By.xpath("//INPUT[@name='middlename']/self::INPUT"), ОтчествоСтрахователя);
    }

    public void setДатаРожденияСтрахователя(String setДатаРожденияСтрахователя) {
        fillField(By.xpath("//INPUT[@name=\"birthDate\"]"), setДатаРожденияСтрахователя);
    }


    public void setСерияПаспорта(String setСерияПаспорта) {
        fillField(By.xpath("//INPUT[@ng-model='formdata.insurer.documentList[0].DOCSERIES']/self::INPUT"), setСерияПаспорта);
    }

    public void setНомерПаспорта(String setНомерПаспорта) {
        fillField(By.xpath("//INPUT[@ng-model='formdata.insurer.documentList[0].DOCNUMBER']/self::INPUT"), setНомерПаспорта);
    }

    public void setДатаВыдачиПаспорта(String ДатаВыдачиПаспорта) {
        fillField(By.xpath("//INPUT[@name=\"issueDate\"]/self::INPUT\n"), ДатаВыдачиПаспорта);
    }

    public void setКемВыдан(String КемВыдан) {
        fillField(By.xpath("//TEXTAREA[@name='issuePlace']/self::TEXTAREA"), КемВыдан);
    }

    @FindBy(xpath = "//SPAN[@ng-click='save()'][text()='Продолжить']/self::SPAN")
    WebElement buttonПродолжить;

    public void clickПродолжить() {
        wait.until(ExpectedConditions.visibilityOf(buttonПродолжить)).click();
    }






}