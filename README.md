# simple-quarkus
Simple Quarkus App for Capgemini Spring MIG:
1. Simple Rest API
2. Integration with H2 database

Also look at [simple-springBoot](https://github.com/PieterDup98/simple-springBoot) as that repo does exactly the same, but is build with Spring Boot.

## Good to know:

With Quarkus, there is no need to create an Application class. It’s supported, but not required.

Run Quarkus in development mode:
```shell
mvn quarkus:dev
```
This enables live reload with background compilation, which means that when you modify your Java files and/or your resource files and refresh your browser, these changes will automatically take effect.
When running in this mode you can access for a cool Developer UI http://localhost:8080/q/dev-ui

Run jar with:
```shell
java -jar target/quarkus-app/quarkus-run.jar
```

## API examples

### Insert products
```shell
curl -X POST http://localhost:8080/products -H "Content-Type: application/json" -d '{"name":"Product 1","price":10.0}'
curl -X POST http://localhost:8080/products -H "Content-Type: application/json" -d '{"name":"Product 2","price":20.0}'
curl -X POST http://localhost:8080/products -H "Content-Type: application/json" -d '{"name":"Product 3","price":30.0}'
curl -X POST http://localhost:8080/products -H "Content-Type: application/json" -d '{"name":"Product 4","price":40.0}'
curl -X POST http://localhost:8080/products -H "Content-Type: application/json" -d '{"name":"Product 5","price":50.0}'
```

### View all products
```shell
curl http://localhost:8080/products
```

### Delete a product
```shell
curl -X DELETE http://localhost:8080/products/1
```
