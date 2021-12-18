
# Simple Spring Boot Docker Application

The simple Spring Boot application using Docker


## Made with

* [Java 8](https://www.java.com/fr/download/) - JDK 8
* [Spring initializr](https://start.spring.io/) - 2.6.0 
* [IntelliJ IDEA Utlimate](https://www.jetbrains.com/fr-fr/idea/) - Edition 2021.2.2 
* [Docker](https://www.docker.com/) - version 20.10.10 

## Versions

- **Dernière version stable :** 1.0.0
- **Dernière version :** 1.0.1
The list of versions : [Click to display](https://github.com/lorince-tawamba/spring-boot-demo-docker/tags)

## Deployment

**Create the Packages (Jar files)**

```bash
  mvn clean install
```

You’ll have to do this for both application. After this command executes, you’ll see the jar file available in the target folder. The file names will be:

- simple-spring-boot-demo-docker-1.0.1
- simple-spring-boot-demo-docker-1.0.1

**Create the docker image**

```bash
  docker build -t simple-spring-boot-demo-docker:1.0.1 .
```

**Start the docker container**

```bash
  docker run -d -p 8080:8585 -t simple-spring-boot-demo-docker:1.0.1
```

## API Reference

#### Get information

```http
  GET /api/v1/appli/info
```

#### Get current version 

```http
  GET /api/v1/appli/version
```

## Authors

* **Lorince TAWAMBA** _alias_ [@lorince-tawamba](https://github.com/lorince-tawamba)

Read the list of [contributors](https://github.com/lorince-tawamba/spring-boot-demo-docker/contributors) to see who helped with the project !

## License

Ce document est placé sous licence CC BY-NC-SA :  [Creative Commons
Attribution - Pas d'Utilisation Commerciale - Partage dans les Mêmes Conditions](https://creativecommons.org/licenses/by-nc-sa/4.0/)

![Logo](https://licensebuttons.net/l/by-nc-sa/3.0/88x31.png)

En savoir plus sur [les licences Creative Commons](https://creativecommons.org/licenses/?lang=fr-FR)...

# Car Marketplace

Microservices App for Car Marketplace

## Status

[![build](https://github.com/geekymon2/carmarketplace-car-info-svc/actions/workflows/build.yml/badge.svg)](https://github.com/geekymon2/carmarketplace-car-info-svc/actions/workflows/build.yml) &nbsp;&nbsp; [![codecov](https://codecov.io/gh/geekymon2/carmarketplace-car-info-svc/branch/main/graph/badge.svg?token=LH7ATDIHTB)](https://codecov.io/gh/geekymon2/carmarketplace-car-info-svc) &nbsp;&nbsp; ![Docker Image Version (latest by date)](https://img.shields.io/docker/v/geekymon2/cm-car-info-svc) &nbsp;&nbsp; ![Docker Image Size (latest by date)](https://img.shields.io/docker/image-size/geekymon2/cm-car-info-svc)

## About this Service

**Car Info Service**

This micro service provides information for car make brands and models. Get information on all the makes, models, and types of cars, also filter them by make and type. 

## Documentation

For more details refer to the swagger documentation.
