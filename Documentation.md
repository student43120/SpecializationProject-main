# Documentation for project
Java application with a Spring backend and an Angular frontend.

## Backend (Spring)

1. Prerequisites
   - Java Development Kit (JDK)
   - IDE (IntelliJ IDEA)

2. Set up the backend:
   - Clone the repository
   - Open the project in your IDE
   - Build and run the Spring application

## Frontend (Angular)

1. Prerequisites
   - Node.js
   - Angular CLI

2. Set up the frontend:
   - Clone the repository
   - Install dependencies by running `npm install`
   - Build the Angular application by running `ng build`
   - Copy the `dist/` directory to your Spring project's static file directory



# UML

  ###  - private visibility
  ###  + public visibility

```
--------------------------------------
|            Customer                |
--------------------------------------
| - id: int                         |
| - name: String                     |
| - surname: String                  |
| - email: String                    |
| - phone: String                    |
| - birthday: LocalDate              |
| - age: Integer                     |
--------------------------------------
| + getId(): int                    |
| + getName(): String                |
| + getSurname(): String             |
| + getEmail(): String               |
| + getPhone(): String               |
| + getBirthday(): LocalDate         |
| + getAge(): Integer                |
| + setId(id: int)                  |
| + setName(name: String)            |
| + setSurname(surname: String)      |
| + setEmail(email: String)          |
| + setPhone(phone: String)          |
| + setBirthday(birthday: LocalDate) |
--------------------------------------

--------------------------------------
|              Staff                 |
--------------------------------------
| - id: int                         |
| - name: String                     |
| - surname: String                  |
| - email: String                    |
| - phone: String                    |
--------------------------------------
| + getId(): int                    |
| + getName(): String                |
| + getSurname(): String             |
| + getEmail(): String               |
| + getPhone(): String               |
| + setId(id: int)                  |
| + setName(name: String)            |
| + setSurname(surname: String)      |
| + setEmail(email: String)          |
| + setPhone(phone: String)          |
--------------------------------------


--------------------------------------------
|              Offer                       |
--------------------------------------------
| - id: int                               |
| - offerName: String                      |
| - offerType: OfferType                   |
| - rentStart: LocalDate                   |
| - rentEnd: LocalDate                     |
| - price: Double                          |
| - availability: Boolean                  |
--------------------------------------------
| + getId(): int                          |
| + getOfferName(): String                 |
| + getOfferType(): OfferType              |
| + getRentStart(): LocalDate              |
| + getRentEnd(): LocalDate                |
| + getPrice(): Double                     |
| + getAvailability(): Boolean             |
| + setId(id: int)                        |
| + setOfferName(offerName: String)        |
| + setOfferType(offerType: OfferType)     |
| + setRentStart(rentStart: LocalDate)     |
| + setRentEnd(rentEnd: LocalDate)         |
| + setPrice(price: Double)                |
| + setAvailability(availability: Boolean) |
--------------------------------------------

```




