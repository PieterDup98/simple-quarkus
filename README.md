# simple-quarkus
Simple Quarkus App for Spring MIG Demo


## Interesting findings:

With Quarkus, there is no need to create an Application class. It’s supported, but not required.

mvn quarkus:dev runs Quarkus in development mode. 
This enables live reload with background compilation, which means that when you modify your Java files and/or your resource files and refresh your browser, these changes will automatically take effect.
When running in this mode you can access for a cool Developer UI http://localhost:8080/q/dev-ui

run jar with java -jar target/quarkus-app/quarkus-run.jar

## Insert products
```shell
curl -X POST http://localhost:8080/products -H "Content-Type: application/json" -d '{"name":"Product 1","price":10.0}'
curl -X POST http://localhost:8080/products -H "Content-Type: application/json" -d '{"name":"Product 2","price":20.0}'
curl -X POST http://localhost:8080/products -H "Content-Type: application/json" -d '{"name":"Product 3","price":30.0}'
curl -X POST http://localhost:8080/products -H "Content-Type: application/json" -d '{"name":"Product 4","price":40.0}'
curl -X POST http://localhost:8080/products -H "Content-Type: application/json" -d '{"name":"Product 5","price":50.0}'
```

## View all products
```shell
curl http://localhost:8080/products
```

## Delete a product
```shell
curl -X DELETE http://localhost:8080/products/1
```