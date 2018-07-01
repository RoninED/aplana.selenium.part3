package steps;

import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MainSteps extends BaseSteps {

    @Step("Выбран пункт меню страхование")
    public void selectMenu (String nameMenu) {
        new MainPage(driver).selectMenu(nameMenu);
    }

    @Step("Выбран пункт подменю")
    public void selectSubMenu (String nameSubMenu) {
        new MainPage(driver).selectSubMenu(nameSubMenu);
    }

    @Step("Нажато Оформить онлайн")
    public void clickButtonОформитьоОнлайн () {
        new MainPage(driver).clickButtonОформитьоОнлайн();
    }


}
