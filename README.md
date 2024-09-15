# Coworking-Service
  Приложение для управления коворкинг-пространством. Приложение должно позволять пользователям бронировать рабочие места, конференц-залы, а также управлять бронированиями и просматривать доступность ресурсов.
#Функционал
  - регистрация и авторизация пользователя;
  - просмотр списка всех доступных рабочих мест и конференц-залов;
  - просмотр доступных слотов для бронирования на конкретную дату;
  - бронирование рабочего места или конференц-зала на определённое время и дату;
  - отмена бронирования;
  - добавление новых рабочих мест и конференц-залов, а также управление существующими;
  - просмотр всех бронирований и их фильтрация по дате, пользователю или ресурсу. 

Проект реализовывался постепенно в 4 этапа (дз). Ниже представдены описания всех дз. Все дз хранятся в папке homeworks. 

# Стэк технологий
- Java 17
- Apache Maven
- Docker
- Spring
- Liquibase + Postgres
- Swagger

# ДЗ №1

## Как пользоваться приложением 
  Дз представляет собой консольное приложение (с полностью реалищованным функционалом). При запуске основного класса(Main) в консоль выведется список допустимых команд. Эти команды нужно вводить для взаимодействия с приложением. Список команд CRUD операций можно вывести на экран, введя команду edit. Дату и время бронирования нужно вводить в формате ГГГГ-ММ-ДДTЧЧ:ММ:CC (пример: 2024-06-21T12:00:00).

## Ссылки
- https://github.com/Aleksey1123/ylab/tree/master/homeworks/hw1
- https://github.com/Aleksey1123/ylab/pull/2

# ДЗ №2
  Добавлены БД - Postgres, миграции - Liquibase, docker.

## Как пользоваться приложением
  В папке проекта по пути src/main/resources/db лежит docker-compose-файл - его нужно запустить. Jar-файл должен строго находиться по пути src\main\resources\db, иначе приложение не запустится в контейнере. Docker-compose создаст три контейнера: bd - в нём лежит postgres, app - в нём лежит сам jar-файл, liquibase - в нём находятся миграции. Так как приложение консольное, то чтобы взаимодействовать с ним в docker-контейнере нужно ввести данную команду в терминале: 
````
docker exec -it app java -cp app/app.jar org.example.Main
````
После этого можно взаимодействовать в своём терминале с приложением также, как если бы оно было запущено не в контейнере.

## Ссылки
- https://github.com/Aleksey1123/ylab/tree/hw2-feature/homeworks/hw2
- https://github.com/Aleksey1123/ylab/pull/3

# ДЗ №3
  Добавлены сервлеты + DTO + MapStruct. Сервлеты принимают json, валидация присутсвует.

## Как пользоваться приложением
  Нужно скомпилировать проект в war-файл с помощью maven, затем положить папку склмпилированного проекта в папку webapps сервера TomCat. Сервер TomCat должен быть 10 версии или выше. Затем запустить сам сервер через батник startup в bin директории. После того как были проделаны все выше перечисленные действия можно отправлять запросы на сервер. Документация к api написана в java-doc сервлетов.

## Ссылки
- https://github.com/Aleksey1123/ylab/tree/hw3-feature/homeworks/hw3
- https://github.com/Aleksey1123/ylab/pull/4

# ДЗ №4
  Добавлен Spring, соотвественно сервдеты заменены на контроллеры + Spring AOP.

## Как пользоваться приложением
  Использование ничем не отличается от использования в ДЗ №3.

## Ссылки
- https://github.com/Aleksey1123/ylab/tree/hw4-feature/homeworks/hw4
- https://github.com/Aleksey1123/ylab/pull/5
