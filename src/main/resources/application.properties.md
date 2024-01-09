# Application.properties

Подробненько расписываю что в настройках за что отвечает

## Подключаемся к БД

Подключаемся к БД:

- в примере к PostgresSQL
- подключаемся к пользователю root с паролем 12345678

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/education-db-training
spring.datasource.name=root
spring.datasource.username=root
spring.datasource.password=12345678
```

## Указываем Spring драйвер ORM

Указываем Spring драйвер ORM:

- в примере указываем драйвер PostgresSQL

```properties
spring.datasource.driver-class-name=org.postgresql.Driver
spring.datasource.driverClassName=org.postgresql.Driver
spring.jpa.database=postgresql
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

# Инициализация таблиц

Есть несколько режимов инициализации таблиц и данных в них:

- используя DDL
  - может создавать и заполнять таблицы
- используя ORM
  - может только создавать таблицы

Настраиваем инициализацию в общем виде:

- spring.sql.init.platform=postgresql
    - Указываем PostgresSQL, как диалект для инициализации
- spring.sql.init.mode
    - always - при каждом запуске пересоздает таблицы
    - never - не создает таблицы

```properties
spring.sql.init.platform=postgresql
spring.sql.init.mode=always
```

## Инициализация используя DDL

Инициализация используя DDL:

- по умолчанию использует init.sql в папке resource для создания таблиц
- по умолчанию использует populate.sql в папке resource для наполнения таблиц данными

Настраиваем инициализацию через DDL:

- отключаем генерацию через ORM
    - spring.jpa.hibernate.ddl-auto=none
    - spring.jpa.generate-ddl=false
- spring.sql.init.schema-locations=classpath*:database/initDB.sql
    - настраиваем нестандартный sql-файл для инициализации таблиц
- spring.sql.init.data-locations=classpath*:database/populateDB.sql
    - настраиваем нестандартный sql-файл для заполнения таблиц данными

```properties
spring.jpa.hibernate.ddl-auto=none
spring.jpa.generate-ddl=false
spring.sql.init.schema-locations=classpath*:database/initDB.sql
spring.sql.init.data-locations=classpath*:database/populateDB.sql
```

## Инициализация используя ORM

Инициализация используя ORM:

- включаем генерацию через ORM
  - spring.jpa.hibernate.ddl-auto=none
  - spring.jpa.generate-ddl=false
- может только создавать таблицы, но не заполнять

```properties
spring.jpa.hibernate.ddl-auto=create
spring.jpa.generate-ddl=true
```
