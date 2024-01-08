# SpringPractice

Небольшой учебный проект, с использованием Spring

# Структура

Структура, точки входа:

- точки входа лежат в корне пакета com.example.springpractice
- название классов с точками входа оканчивается на [name]SpringApp
  - основные пакеты относящиеся к точке входа лежат в пакете [name]Test 
 
## Описание точек входа

Каждая точка входа направлена на тестирование чего-либо. Ниже приведена таблица, что конкретно проверяем:

ApplicationContextProviderSpringApp:

- Получение ApplicationContext и работа с ним
- По сути класс ApplicaitonContextProvider выводит все заинициализированные Bean |

BeanLifecycleSpringBootApp:

- В каждой жизненной точке Bean, будет происходить вывод в консоль
- Пример использования PostProcess
- Пример получения контекста SpringBoot и завершения SpringBoot приложения
- Вдохновитель, если можно так сказать:
  - статья: https://habr.com/ru/articles/720794/
  - github с примером из статьи: https://github.com/LordDetson/spring-lifecycle/tree/main

 TransactionalSpringApp:

- Пример с применением @Transactional                                                                                         |
