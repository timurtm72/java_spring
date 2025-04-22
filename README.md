# Мой сайт и резюме:

- [Мой сайт](https://technocom.site123.me/)
- [Мое резюме инженер программист microcontrollers, PLC](https://innopolis.hh.ru/resume/782d86d5ff0e9487200039ed1f6f3373384b30)
- [Мое резюме инженер программист Java backend developer (Spring)](https://innopolis.hh.ru/resume/9e3b451aff03fd23830039ed1f496e79587649)
- [Linkedin](https://www.linkedin.com/public-profile/settings?trk=d_flagship3_profile_self_view_public_profile)
  
# JavaSpring

## Описание проекта
java_spring - это проект на базе Spring Boot, который представляет собой систему электронного документооборота. Система обеспечивает управление документами, пользователями и бизнес-процессами документооборота в организации.

## Функциональные возможности
- Управление документами и их жизненным циклом
- Работа с шаблонами документов
- Управление учетными записями пользователей
- Комментирование документов и совместная работа
- Хранение и управление вложенными файлами
- Взаимодействие с партнерами

## Технологии
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- PostgreSQL
- ModelMapper
- Maven

## Структура проекта
Проект следует стандартной многослойной архитектуре:
- `model` - сущности базы данных
- `repository` - слой доступа к данным
- `service` - бизнес-логика приложения
- `controller` - REST API контроллеры
- `config` - конфигурационные классы
- `enums` - перечисления
- `dto` - объекты передачи данных
- `mapper` - преобразователи объектов
- `utils` - вспомогательные классы
- `validation` - валидация данных

## Запуск проекта
```bash
git clone https://github.com/timurtm7/java_spring.git
cd java_spring
mvn clean install
mvn spring-boot:run
```

## База данных
Для работы приложения требуется PostgreSQL. Настройки подключения можно изменить в файле `application.properties`.

## Автор
- Тимур Султанов
- Email: timur.sultanov1972@gmail.com
- GitHub: [timurtm7](https://github.com/timurtm7)
