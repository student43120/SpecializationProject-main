# SpecializationProject - 43120

## Description

This project is an application built with Angular for the frontend and Java with Spring for the backend. It utilizes an external API for weather data. The main purpose of the application is to recommend renting a flat or a tent based on the weather conditions.

### Angular

is a powerful open-source front-end web development framework created and maintained by Google. It allows developers to build robust and dynamic web applications with ease. Angular combines declarative templates, dependency injection, end-to-end tooling, and integrated best practices simplifying the development process and enhance overall productivity.
One of the major advantages of using Angular with Java is the seamless integration and interoperability between the two technologies. Java is a popular and widely adopted programming language for building scalable and enterprise-grade applications. When combined with Angular, Java provides a solid foundation for developing complex web applications.

Backend Compatibility: Java is often used for building robust backend systems, and Angular can seamlessly communicate with Java-based APIs and services through RESTful or GraphQL interfaces. This compatibility allows developers to leverage their existing Java infrastructure and seamlessly integrate it with the frontend, resulting in a unified and cohesive application architecture.
In summary, the combination of Angular and Java offers a powerful and scalable solution for web application development. By leveraging Angular's feature-rich framework and seamless integration with Java, developers can build modern, maintainable, and efficient web applications while leveraging their existing Java knowledge and infrastructure.

### Java

Java is a versatile and widely used object-oriented programming language that provides developers with a robust platform for building scalable, secure, and cross-platform applications. Known for its "write once, run anywhere" principle, Java enables developers to write code that can be executed on different operating systems without any modifications. With its extensive standard library, automatic memory management, strong community support, and wide range of tools and frameworks, Java has become a popular choice for building a wide variety of applications, from desktop software to enterprise-level systems.

### Features

- User-friendly frontend built with Angular for Eureka server.
- Backend server implemented with Java and Spring.
- Integration with an external weather API.
- Accommodation recommendation based on weather data.
- implementation code on cloud Microsoft Azure

## Project VOL 2 edition
-- Docker environment implementation for project
! You can use ready docker image to implement it on Azure !

-- implement configuration in Azure CLI

az group create --name Specialization Project --location eastus
az storage account create --name angularstorage --resource-group Specialization Project --location eastus --sku Standard_LRS
az webapp deployment source config-zip --resource-group Specialization Project --name SpecializationProject43120 --src <project_JAR/WAR_one>

### Prerequisites

- Node.js and Angular CLI for the frontend.
- Java Development Kit (JDK) and Maven for the backend.

## Project Manager - instead JIRA

Project manager is inbuilt app, which is based on java script, express.js and MongoDB.
In code, you can find task without status, because this project was realized by one person.








# BACKEND
```

├── docker-install
│   ├── script-to-install-docker-ubuntu.sh
│   └── script-to-install-docker-windows.bat
├── eureka-server
│   ├── mvnw
│   ├── mvnw.cmd
│   ├── pom.xml
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── com
│       │   │       └── zenit
│       │   │           └── weathereurekaserver
│       │   │               └── WeatherEurekaServerApplication.java
│       │   └── resources
│       │       └── application.yml
│       └── test
│           └── java
│               └── com
│                   └── zenit
│                       └── weathereurekaserver
│                           └── WeatherEurekaServerApplicationTests.java
├── stuff-rental-core-service
│   ├── CURL
│   │   └── curl.txt
│   ├── mvnw
│   ├── mvnw.cmd
│   ├── pom.xml
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── com
│       │   │       └── zenit
│       │   │           └── stuffrental
│       │   │               ├── customer
│       │   │               │   ├── CustomerConfig.java
│       │   │               │   ├── CustomerController.java
│       │   │               │   ├── Customer.java
│       │   │               │   ├── CustomerRepository.java
│       │   │               │   ├── CustomerService.java
│       │   │               │   └── CustomerValidation.java
│       │   │               ├── product
│       │   │               │   ├── OfferType.java
│       │   │               │   ├── ProductConfig.java
│       │   │               │   ├── ProductController.java
│       │   │               │   ├── Product.java
│       │   │               │   ├── ProductRepository.java
│       │   │               │   ├── ProductService.java
│       │   │               │   └── ProductValidation.java
│       │   │               ├── staff
│       │   │               │   ├── StaffConfig.java
│       │   │               │   ├── StaffController.java
│       │   │               │   ├── Staff.java
│       │   │               │   ├── StaffRepository.java
│       │   │               │   ├── StaffService.java
│       │   │               │   └── StaffValidation.java
│       │   │               └── StuffRentalApplication.java
│       │   └── resources
│       │       └── application.properties
│       └── test
│           └── java
│               └── com
│                   └── zenit
│                       └── stuffrental
│                           └── StuffRentalApplicationTests.java
└── wether-event-info-service
    ├── mvnw
    ├── mvnw.cmd
    ├── pom.xml
    └── src
        └── main
            ├── java
            │   └── com
            │       └── zenit
            │           └── eventinfoservice
            │               ├── event
            │               │   ├── DescriptionValue.java
            │               │   ├── EventController.java
            │               │   ├── Event.java
            │               │   ├── EventRepository.java
            │               │   ├── EventService.java
            │               │   └── MonthValue.java
            │               ├── GreetingController.java
            │               └── WeatherEventInfoServiceApplication.java
            └── resources
                └── application.yml
```
