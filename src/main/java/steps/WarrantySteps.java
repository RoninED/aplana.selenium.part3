package steps;

import pages.WarrantyTravelPage;
import ru.yandex.qatools.allure.annotations.Step;

public class WarrantySteps extends BaseSteps{

    @Step("и тд")
    public void priseMinimum () {
        new WarrantyTravelPage(driver).priseMinimum();
    }

    @Step("и тд")
    public void КнопкаОформить () {
        new WarrantyTravelPage(driver).КнопкаОформить();
    }

    @Step("и тд")
    public void setФамилия (String Фамилия) {
        new WarrantyTravelPage(driver).setФамилия(Фамилия);
    }
//
//
//    public void setФамилия(String Фамилия) {
//        fillField(By.xpath("//INPUT[@name='insured0_surname']"), Фамилия);
//    }
//
//    public void setИмя(String Имя) {
//        fillField(By.xpath("//INPUT[@name='insured0_name']"), Имя);
//    }
//
//    public void setДатаРождения(String ДатаРождения) {
//        fillField(By.xpath("//INPUT[@name=\"insured0_birthDate\"]/self::INPUT"), ДатаРождения);
//    }
//
//    public void setФамилияСтрахователя(String ФамилияСтрахователя) {
//        fillField(By.xpath("//INPUT[@name='surname']/self::INPUT"), ФамилияСтрахователя);
//    }
//
//    public void setИмяСтрахователя(String ИмяСтрахователя) {
//        fillField(By.xpath("//INPUT[@name='name']/self::INPUT"), ИмяСтрахователя);
//    }
//
//    public void setОтчествоСтрахователя(String ОтчествоСтрахователя) {
//        fillField(By.xpath("//INPUT[@name='middlename']/self::INPUT"), ОтчествоСтрахователя);
//    }
//
//    public void setДатаРожденияСтрахователя(String setДатаРожденияСтрахователя) {
//        fillField(By.xpath("//INPUT[@name=\"birthDate\"]"), setДатаРожденияСтрахователя);
//    }
//
//
//    public void setСерияПаспорта(String setСерияПаспорта) {
//        fillField(By.xpath("//INPUT[@ng-model='formdata.insurer.documentList[0].DOCSERIES']/self::INPUT"), setСерияПаспорта);
//    }
//
//    public void setНомерПаспорта(String setНомерПаспорта) {
//        fillField(By.xpath("//INPUT[@ng-model='formdata.insurer.documentList[0].DOCNUMBER']/self::INPUT"), setНомерПаспорта);
//    }
//
//    public void setДатаВыдачиПаспорта(String ДатаВыдачиПаспорта) {
//        fillField(By.xpath("//INPUT[@name=\"issueDate\"]/self::INPUT\n"), ДатаВыдачиПаспорта);
//    }
//
//    public void setКемВыдан(String КемВыдан) {
//        fillField(By.xpath("//TEXTAREA[@name='issuePlace']/self::TEXTAREA"), КемВыдан);
//    }
//
//    @FindBy(xpath = "//SPAN[@ng-click='save()'][text()='Продолжить']/self::SPAN")
//    WebElement buttonПродолжить;
//
//    public void clickПродолжить() {
//        wait.until(ExpectedConditions.visibilityOf(buttonПродолжить)).click();
//    }
}
