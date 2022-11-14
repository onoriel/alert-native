# alert-native

POC for Spring Native with an Alert Rest service using oracle jdbc dependencies and spring-openapi.

## Packaging artifact

```console
mvn clean package
```

## Running JVM artifact
```console
mvn spring-boot:run
```

## Building Docker Image
```console
mvn spring-boot:build-image
```

## Running Docker Image
```console
docker run --rm -p 7080:7080 localhost/alert-service-native --spring.datasource.plain-url=<<ORACLE_DB_IP>>:<<ORACLE_DB_PORT>>/xe
```

## Building GraalVM Native Version
```console
mvn clean package -Pnative -DskipTests
```

## Running GraalVM Native Version (Windows OS Example)
```console
cd target
alert-service-native.exe
```
