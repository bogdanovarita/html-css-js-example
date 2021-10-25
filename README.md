# Materials for Lecture: HTML, CSS, Java Script Introduction


## Spring Boot Services: book-store, book-discount
Для запуска приложений на машине нужно установить:
- Java 11
- Maven последней версии

### Запустить приложение из командной строки
В корневой директории приложения (book-store, book-discount):

`mvn spring-boot:run`

или

`mvn clean install` - выполнить в корневой папке приложения (book-store или book-discount)

`cd target` - перейти в папку target

`java -jar book-store-0.0.1-SNAPSHOT.jar` - в папке target выполнить команду

### Получить список книг из браузера

http://localhost:8080/book

### Ссылка на консоль базы данных H2
http://localhost:8080/h2-console

имя пользователя: user

пароль: password

### Получить информацию о скидке

http://localhost:8081/discount

## Запустить ангуляр приложение (book-store-angular):
Детали тут: https://angular.io/guide/setup-local
1. Установить npm: https://nodejs.org/en/
2. Установить ангуляр: `npm install -g @angular/cli`
3. Выполнить команду `ng serve` внутри папки book-store-angular  
4. Открыть `http://localhost:4200/` 

Приложение автоматически перегружается при изменении исходников.

## Примеры файлов с кодом (book-store-angular):

1. **HTML**: \book-store-angular\src\app\example\html
2. **CSS**: \book-store-angular\src\app\example\css
3. **JS**: \book-store-angular\src\app\example\js



