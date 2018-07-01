import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.MainPage;
import pages.WarrantyTravelPage;
import steps.BaseSteps;

import java.util.ArrayList;

public class RefactoringTest extends BaseSteps {

    @Test
    @Ignore
    public void test  () throws Exception {
        driver.get(baseUrl + "/");
        MainPage mainPage = new MainPage(driver);
        mainPage.selectMenu("Страхование");
        mainPage.selectSubMenu("Путешествия и покупки");
        mainPage.clickButtonОформитьоОнлайн();

        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        System.out.println(tabs.size());
        driver.switchTo().window((String) tabs.get(1));

        WarrantyTravelPage warrantyTravelPage = new WarrantyTravelPage(driver);
        warrantyTravelPage.priseMinimum();
        warrantyTravelPage.КнопкаОформить();

        warrantyTravelPage.setФамилия("Super");
        warrantyTravelPage.setИмя("Jonny");
        warrantyTravelPage.setДатаРождения("02.05.1875");
        warrantyTravelPage.setДатаВыдачиПаспорта("15.04.2009");
        warrantyTravelPage.setДатаРожденияСтрахователя("01.01.1989");
        warrantyTravelPage.setИмяСтрахователя("Джонни");
        warrantyTravelPage.setКемВыдан("black rebel motocycle club");
        warrantyTravelPage.setНомерПаспорта("555555");
        warrantyTravelPage.setОтчествоСтрахователя("Тахтамытович");
        warrantyTravelPage.setСерияПаспорта("5555");
        warrantyTravelPage.setФамилияСтрахователя("Кейдж");
        warrantyTravelPage.clickПродолжить();

        WebElement exceptMessage = driver.findElement(By.xpath("//DIV[@ng-show='tryNext && myForm.$invalid']/self::DIV"));
        Assert.assertEquals("Заполнены не все обязательные поля", exceptMessage.getText());


    }




}
