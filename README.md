Для сборки и запуска приложения необходимо иметь версию Java (17),
создать в MySQL бд с названием streetshousesflatsdb, затем создать необходимые таблицы,
содержащиеся в файле database.md. Затем необходимо клонировать репозиторий и загрузить зависимости,
описанные в файле pom.xml. После этого запустить приложение.

Запросы для эндпоинтов находятся в файле New Collection.postman_collection.json.

Описание зависимостей:
- spring-boot-starter-web. Стартер для создания веб-приложений,c использованием Spring MVC.
- spring-boot-starter-thymeleaf. Стартер для создания веб-приложений MVC с использованием представлений Thymeleaf.
- spring-boot-starter-data-jpa. Стартер для использования Spring Data JPA с Hibernate.
- mysql-connector-java. Коннектор для MySql
- lombok. Основанная на аннотациях библиотека Java, позволяющая сократить шаблонный код.
- spring-boot-starter-test. Стартер для тестирования приложений Spring Boot библиотеками JUnit Jupiter, Hamcrest и Mockito.