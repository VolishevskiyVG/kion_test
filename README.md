# Проект по автоматизации тестирования онлайн-кинотеатра KION

## 	Содержание

> ➠ [Покрытый функционал](#покрытый-функционал)
>
> ➠ [Технологический стек](#технологический-стек)
>
> ➠ [Запуск тестов из терминала](#запуск-тестов-из-терминала)
>
> ➠ [Запуск тестов в Jenkins](#-удаленный-запуск-тестов-в-Jenkins)
>
> ➠ [Отчет о результатах тестирования в Allure Report](#-главная-страница-allure-отчета)
>
> ➠ [Уведомления в Telegram с использованием бота](#-уведомления-в-telegram-с-использованием-бота)
>
> ➠ [Пример запуска теста в Selenoid](#-пример-запуска-теста-в-selenoid)

##  Покрытый функционал
> Разработаны автотесты на <code>UI</code>.
### UI

- [x] Переход по главным разделам 
- [x] Проверка поля поиск
- [x] Переход в дополнительный раздел "Справка"
- [x] Отображение текста подсказки "Как оплачивать подписку?" в доп. разделе Справка.
## Технологический стек

<p align="center">
<img width="6%" title="IntelliJ IDEA" src="readme_design/logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="readme_design/logo/Java.svg">
<img width="6%" title="Selenide" src="readme_design/logo/Selenide.svg">
<img width="6%" title="Selenoid" src="readme_design/logo/Selenoid.svg">
<img width="6%" title="Allure Report" src="readme_design/logo/Allure_Report.svg">
<img width="6%" title="Gradle" src="readme_design/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="readme_design/logo/JUnit5.svg">
<img width="6%" title="GitHub" src="readme_design/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="readme_design/logo/Jenkins.svg">
<img width="6%" title="Telegram" src="readme_design/logo/Telegram.svg">
</p>

### Проект написан на <code>Java</code> с использованием <code>Selenide</code> для UI-тестов.
>
> <code>Selenoid</code> выполняет запуск браузеров в контейнерах <code>Docker</code>.
>
> <code>Allure Report</code> формирует отчет о запуске тестов.
>
> Для автоматизированной сборки проекта используется <code>Gradle</code>.
>
> В качестве библиотеки для модульного тестирования используется <code>JUnit 5</code>.
>
> <code>Jenkins</code> выполняет запуск тестов.
> 
> После завершения прогона отправляются уведомления с помощью бота в <code>Telegram</code>.
## Запуск тестов из терминала

### Локальный запуск тестов

#### Локальный запуск тестов 

```
gradle clean test 
```

#### Локальный запуск тестов с использованием параметров из property файла test

```
gradle clean test
```

#### Удаленный запуск:
> -Dbrowser <code>название браузера</code>
> 
> -DbrowserVersion <code>версия браузера</code>
> 
> -DbrowserSize <code>разрешение окна браузера</code>
> 
> -DremoteUrl <code>url remote сервиса</code>

## <img width="4%" title="Jenkins" src="readme_design/logo/Jenkins.svg"> Удаленный запуск тестов в Jenkins

> Для запуска тестов используется параметризированная сборка
