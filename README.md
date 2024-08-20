# Second level cache hibernate

Данный проект демонстрирует способ подключения второго уровня кэширования Hibernate.
Кэширование будет осуществлятся на уровне Session Factories и результат
выполнения запроса на получение конкретного города будет за кэширован 
для всех последующих запросов.   


**Для включения второго уровня:**
1. добавлены зависимости:
    * org.hibernate.orm - hibernate-jcache
    * org.ehcache - ehcache
2. в файле application.yaml внесена конфигурация:
    *   jpa.properties.hibernate.cache.use_second_level_cache: true - включение второго уровня кэширования
    *   jpa.properties.hibernate.cache.region.factory_class: org.hibernate.cache.jcache.internal.JCacheRegionFactory - указание провайдера осуществляющего кэширование
3. над классом сущности для которой включается кэширование, указывается аннотация <strong>@Cache</strong>
    * параметр usage задает стратегию кэширования:
        * READ_ONLY - только для чтения, при изменении сущности данные в кэше не обновляются
        * NONSTRICT_READ_WRITE - изменения в сущности сразу не отразятся в кэше, допускаются устаревшие данные, не использует блокировки для параллельно выполняющихся транзакций
        * READ_WRITE - изменения в сущности отразятся в кэше, использует мягкие (оптимистичные) блокировки для параллельно выполняющихся транзакций
        * TRANSACTIONAL - изменения в сущности отразятся в кэше, использует жесткую (пессимистичную) блокировку для параллельно выполняющихся транзакций