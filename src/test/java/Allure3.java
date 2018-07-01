import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Title;
import steps.BaseSteps;
import steps.MainSteps;
import steps.WarrantySteps;

import java.util.ArrayList;

public class Allure3 extends BaseSteps {

    @Test
    @Title("Аааааа")
    public void test () {
        MainSteps mainSteps = new MainSteps();
        WarrantySteps warrantySteps = new WarrantySteps();

        mainSteps.selectMenu("Страхование");
        mainSteps.selectSubMenu("Путешествия и покупки");
        mainSteps.clickButtonОформитьоОнлайн();

        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        System.out.println(tabs.size());
        driver.switchTo().window((String) tabs.get(1));

        warrantySteps.priseMinimum();
        warrantySteps.КнопкаОформить();
        warrantySteps.setФамилия("AAaaaa");
    }


}
