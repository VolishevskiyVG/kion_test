package tests;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Tag("advanced_kion")
public class KionTests extends TestBase {
    @DisplayName("Отображение всех каналов на вкладке Телеканалы")
    @Test
    @Owner("Volishevskii")
    @Severity(SeverityLevel.CRITICAL)
    void switchToTabTv() {
        step("Открыть главную страницу KION", () -> {
            open("https://kion.ru/home");
        });
        step("Перейти во вкладку Телеканалы", () -> {
            $(byText("Телеканалы")).click();
        });
        step("Првоерить, что все каналы отображаются", () -> {
            $(".ui-row-content-container").shouldHave(text("Телеканалы"));
            $(".ui-row-content-container").shouldHave(text("Федеральные"));
            $(".ui-row-content-container").shouldHave(text("Кино и сериалы"));
            $(".ui-row-content-container").shouldHave(text("Детские"));
            $(".ui-row-content-container").shouldHave(text("Спортивные"));
            $(".ui-row-content-container").shouldHave(text("Информационные"));
            $(".ui-row-content-container").shouldHave(text("Познавательные"));
            $(".ui-row-content-container").shouldHave(text("Музыкальные"));
            $(".ui-row-content-container").shouldHave(text("Развлекательные"));
            $(".ui-row-content-container").shouldHave(text("Региональные"));
            $(".ui-row-content-container").shouldHave(text("Телемагазины"));
            $(".ui-row-content-container").shouldHave(text("#НаВсюНочь!"));
            $(".ui-row-content-container").shouldHave(text("Новые каналы"));
            $(".ui-row-content-container").shouldHave(text("4K ТВ"));
            $(".ui-row-content-container").shouldHave(text("Каналы KION"));
        });
    }

    @DisplayName("Отображение всех жанров во вкладке Фильмы")
    @Test
    @Owner("Volishevskii")
    @Severity(SeverityLevel.CRITICAL)
    void switchToTabCinema() {
        step("Открыть главную страницу KION", () -> {
            open("https://kion.ru/home");
        });
        step("Перейти во вкладку Фильмы", () -> {
            $(byText("Фильмы")).click();
        });
        step("Првоерить, что все жанры отображаются", () -> {
            $(byTagAndText("h2", "Топ фильмов за месяц")).shouldHave(text("Топ фильмов за месяц"));
            $(byTagAndText("h2", "Новинки кинопроката")).shouldHave(text("Новинки кинопроката"));
            $(byTagAndText("h2", "Полнометражные мультфильмы")).shouldHave(text("Полнометражные мультфильмы"));
            $(byTagAndText("h2", "Топ бесплатных фильмов с высокой оценкой")).shouldHave(text("Топ бесплатных фильмов с высокой оценкой"));
            $(byTagAndText("h2", "Комедии")).shouldHave(text("Комедии"));
            $(byTagAndText("h2", "Фантастика")).shouldHave(text("Фантастика"));
            $(byTagAndText("h2", "Блокбастеры")).shouldHave(text("Блокбастеры"));
            $(byTagAndText("h2", "Семейное кино")).shouldHave(text("Семейное кино"));
            $(byTagAndText("h2", "Триллеры")).shouldHave(text("Триллеры"));
            $(byTagAndText("h2", "Экранизации комиксов")).shouldHave(text("Экранизации комиксов"));
            $(byTagAndText("h2", "Боевики")).shouldHave(text("Боевики"));
            $(byTagAndText("h2", "Романтические комедии")).shouldHave(text("Романтические комедии"));
            $(byTagAndText("h2", "Ужасы")).shouldHave(text("Ужасы"));
            $(byTagAndText("h2", "Фэнтези")).shouldHave(text("Фэнтези"));
            $(byTagAndText("h2", "Военное")).shouldHave(text("Военное"));
            $(byTagAndText("h2", "Приключения")).shouldHave(text("Приключения"));
            $(byTagAndText("h2", "Драмы")).shouldHave(text("Драмы"));
            $(byTagAndText("h2", "Детективы")).shouldHave(text("Детективы"));
            $(byTagAndText("h2", "Мелодрамы")).shouldHave(text("Мелодрамы"));
            $(byTagAndText("h2", "Советское кино")).shouldHave(text("Советское кино"));
            $(byTagAndText("h2", "Эротические триллеры")).shouldHave(text("Эротические триллеры"));
            $(byTagAndText("h2", "Корейские фильмы")).shouldHave(text("Корейские фильмы"));
            $(byTagAndText("h2", "Российские комедии")).shouldHave(text("Российские комедии"));
            $(byTagAndText("h2", "Психологические триллеры")).shouldHave(text("Психологические триллеры"));
            $(byTagAndText("h2", "Исторические драмы")).shouldHave(text("Исторические драмы"));
            $(byTagAndText("h2", "Фильмы про космос")).shouldHave(text("Фильмы про космос"));
            $(byTagAndText("h2", "Европейское кино")).shouldHave(text("Европейское кино"));
            $(byTagAndText("h2", "Российские мультфильмы")).shouldHave(text("Российские мультфильмы"));
            $(byTagAndText("h2", "Семейное фэнтези")).shouldHave(text("Семейное фэнтези"));
            $(byTagAndText("h2", "Кино на языке оригинала")).shouldHave(text("Кино на языке оригинала"));
            $(byTagAndText("h2", "Аниме")).shouldHave(text("Аниме"));
            $(byTagAndText("h2", "Криминал")).shouldHave(text("Криминал"));
            $(byTagAndText("h2", "Спорт")).shouldHave(text("Спорт"));
            $(byTagAndText("h2", "Вестерн")).shouldHave(text("Вестерн"));
            $(byTagAndText("h2", "Мюзиклы и музыкальные фильмы")).shouldHave(text("Мюзиклы и музыкальные фильмы"));
            $(byTagAndText("h2", "Документальное кино о животных")).shouldHave(text("Документальное кино о животных"));
            $(byTagAndText("h2", "AMEDIATEKA")).shouldHave(text("AMEDIATEKA"));
            $(byTagAndText("h2", "Иви Лайт")).shouldHave(text("Иви Лайт"));
        });
    }

    @DisplayName("Отображение всех жанров во вкладке Сериалы")
    @Test
    @Owner("Volishevskii")
    @Severity(SeverityLevel.CRITICAL)
    void switchToTabSeries() {
        step("Открыть главную страницу KION", () -> {
            open("https://kion.ru/home");
        });
        step("Перейти во вкладку Сериалы", () -> {
            $(byText("Сериалы")).click();
        });
        step("Првоерить, что все жанры отображаются", () -> {
            $(byTagAndText("h2", "Топ сериалов за месяц")).shouldHave(text("Топ сериалов за месяц"));
            $(byTagAndText("h2", "Новые сериалы")).shouldHave(text("Новые сериалы"));
            $(byTagAndText("h2", "Сериалы KION Originals")).shouldHave(text("Сериалы KION Originals"));
            $(byTagAndText("h2", "Топ бесплатных сериалов с высокой оценкой")).shouldHave(text("Топ бесплатных сериалов с высокой оценкой"));
            $(byTagAndText("h2", "Русские сериалы")).shouldHave(text("Русские сериалы"));
            $(byTagAndText("h2", "Популярные мультсериалы для детей")).shouldHave(text("Популярные мультсериалы для детей"));
            $(byTagAndText("h2", "Топ сериалов по оценке зрителей KION")).shouldHave(text("Топ сериалов по оценке зрителей KION"));
            $(byTagAndText("h2", "Триллеры")).shouldHave(text("Триллеры"));
            $(byTagAndText("h2", "Боевики")).shouldHave(text("Боевики"));
            $(byTagAndText("h2", "Российские мультсериалы")).shouldHave(text("Российские мультсериалы"));
            $(byTagAndText("h2", "Детективы")).shouldHave(text("Детективы"));
            $(byTagAndText("h2", "Мелодрамы")).shouldHave(text("Мелодрамы"));
            $(byTagAndText("h2", "Лучшие британские сериалы")).shouldHave(text("Лучшие британские сериалы"));
            $(byTagAndText("h2", "Молодёжные сериалы")).shouldHave(text("Молодёжные сериалы"));
            $(byTagAndText("h2", "Фантастика")).shouldHave(text("Фантастика"));
            $(byTagAndText("h2", "Развивающие мультсериалы")).shouldHave(text("Развивающие мультсериалы"));
            $(byTagAndText("h2", "Сериалы о врачах")).shouldHave(text("Сериалы о врачах"));
            $(byTagAndText("h2", "Сериалы о врачах")).shouldHave(text("Сериалы о врачах"));
            $(byTagAndText("h2", "Европейские сериалы")).shouldHave(text("Европейские сериалы"));
            $(byTagAndText("h2", "Комедийные драмы")).shouldHave(text("Комедийные драмы"));
            $(byTagAndText("h2", "Лучшие сериалы XXI века")).shouldHave(text("Лучшие сериалы XXI века"));
            $(byTagAndText("h2", "Криминал")).shouldHave(text("Криминал"));
            $(byTagAndText("h2", "Мини-сериалы")).shouldHave(text("Мини-сериалы"));
            $(byTagAndText("h2", "Сериалы о полицейских")).shouldHave(text("Сериалы о полицейских"));
            $(byTagAndText("h2", "Азиатские сериалы")).shouldHave(text("Азиатские сериалы"));
            $(byTagAndText("h2", "Приключения")).shouldHave(text("Приключения"));
            $(byTagAndText("h2", "Советские сериалы")).shouldHave(text("Советские сериалы"));
            $(byTagAndText("h2", "Драмы")).shouldHave(text("Драмы"));
            $(byTagAndText("h2", "Американские сериалы")).shouldHave(text("Американские сериалы"));
            $(byTagAndText("h2", "Для детей")).shouldHave(text("Для детей"));
            $(byTagAndText("h2", "Для самых маленьких")).shouldHave(text("Для самых маленьких"));
            $(byTagAndText("h2", "Исторические")).shouldHave(text("Исторические"));
            $(byTagAndText("h2", "Фэнтези")).shouldHave(text("Фэнтези"));
            $(byTagAndText("h2", "AMEDIATEKA")).shouldHave(text("AMEDIATEKA"));
            $(byTagAndText("h2", "Комедии")).shouldHave(text("Комедии"));
            $(byTagAndText("h2", "Иви Лайт")).shouldHave(text("Иви Лайт"));
            $(byTagAndText("h2", "Лучшие зарубежные сериалы")).shouldHave(text("Лучшие зарубежные сериалы"));
            $(byTagAndText("h2", "Документальные сериалы")).shouldHave(text("Документальные сериалы"));
            $(byTagAndText("h2", "Мультсериалы о животных")).shouldHave(text("Мультсериалы о животных"));
        });
    }

    @DisplayName("Поиск жанра через ввод")
    @Test
    @Owner("Volishevskii")
    @Severity(SeverityLevel.CRITICAL)
    void searchGenre() {
        step("Открыть главную страницу KION", () -> {
            open("https://kion.ru/home");
        });
        step("Нажать по полю поиск", () -> {
            $("#undefined").click();
        });
        step("ввести жанр Триллер", () -> {
            $("#undefined").setValue("триллер").pressEnter();
        });
        step("Проверить отобразился список фильмов и сериалов", () -> {
            $(byTagAndText("h2", "Фильмы и сериалы")).shouldHave(text("Фильмы и сериалы"));
        });

    }

    @DisplayName("Отображение раздела Справка")
    @Test
    @Owner("Volishevskii")
    @Severity(SeverityLevel.CRITICAL)
    void displayHelp() {
        step("Открыть главную страницу KION", () -> {
            open("https://kion.ru/home");
        });
        step("Перейти в раздел Справка", () -> {
            $(byText("Справка")).click();
        });

        step("Проверить, что отображаются подразделы", () -> {
            $(byTagAndText("h2", "Общая информация")).shouldHave(text("Общая информация"));
            $(byTagAndText("h2", "Устройства")).shouldHave(text("Устройства"));
            $(byTagAndText("h2", "Каналы, фильмы, сериалы")).shouldHave(text("Каналы, фильмы, сериалы"));
            $(byTagAndText("h2", "Функции")).shouldHave(text("Функции"));
            $(byTagAndText("h2", "Оплата")).shouldHave(text("Оплата"));
            $(byTagAndText("h2", "Другие вопросы")).shouldHave(text("Другие вопросы"));
        });
        }

    @DisplayName("Отображение подсказки при нажатие на Как оплачивать подписку")
    @Test
    @Owner("Volishevskii")
    @Severity(SeverityLevel.CRITICAL)
    void uncoverHelpPay() {
        step("Открыть главную страницу KION", () -> {
            open("https://kion.ru/home");
        });
        step("Перейти в раздел Справка", () -> {
            $(byText("Справка")).click();
        });
        step("Раскрыть справку Как оплачивать подписку?", () -> {
            $(byTagAndText("h3", "Как оплачивать подписку?")).click();
        });
        step("Проверить, что отображается текст подсказка", () -> {
            $(byTagAndText("p", "Абоненты МТС могут оплачивать подписку со счёта МТС")).shouldHave(text("Абоненты МТС могут оплачивать подписку со счёта МТС"));
            $(byTagAndText("p", "Абоненты других операторов ― с помощью встроенных покупок в AppStore")).shouldHave(text("Абоненты других операторов ― с помощью встроенных покупок в AppStore"));
        });
    }
    }