package com.zenit.stuffrental.product;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.time.Month;

import static java.time.temporal.ChronoUnit.DAYS;

@Entity
@Table
public class Product {

    @Id
    @SequenceGenerator(
            name = "product_sequence",
            sequenceName = "product_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy= GenerationType.SEQUENCE,
            generator = "product_sequence"
    )
    private Long id;
    @NotNull(message = "Name of offer can not be empty")
    private String offerName;
    @NotNull(message = "Type of offer can not be empty")
    private OfferType offerType;
    @NotNull(message = "Start of offer can not be empty")
    private LocalDate rentStart;
    @NotNull(message = "Ending of offer can not be empty")
    private LocalDate rentEnd;
    @NotNull(message = "Price can not be empty")
    private Double price;
    @NotNull(message = "Availability can not be empty")
    private Boolean availability;

    @Transient
    private Long days;

    protected Product() {}

    public Product(Long id,
                   String offerName,
                   OfferType offerType,
                   LocalDate rentStart,
                   LocalDate rentEnd,
                   Double price,
                   Boolean availability,
                   Long days) {
        this.id = id;
        this.offerName = offerName;
        this.offerType = offerType;
        this.rentStart = rentStart;
        this.rentEnd = rentEnd;
        this.price = price;
        this.availability = availability;
        this.days = days;
    }

    public Product(String offerName,
                   OfferType offerType,
                   LocalDate rentStart,
                   LocalDate rentEnd,
                   Double price,
                   Boolean availability,
                   Long days) {
        this.offerName = offerName;
        this.offerType = offerType;
        this.rentStart = rentStart;
        this.rentEnd = rentEnd;
        this.price = price;
        this.availability = availability;
        this.days = days;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public OfferType getOfferType() {
        return offerType;
    }

    public void setOfferType(OfferType offerType) {
        this.offerType = offerType;
    }

    public LocalDate getRentStart() {
        return rentStart;
    }

    public void setRentStart(LocalDate rentStart) {
        if(LocalDate.EPOCH.isAfter(rentEnd)) {
            this.rentStart = rentStart;
        } else System.err.println("Date of start must by before then end date.");

    }

    public LocalDate getRentEnd() {
        return rentEnd;
    }

    public void setRentEnd(LocalDate rentEnd) {
        if(LocalDate.EPOCH.isBefore(rentStart)) {
            this.rentEnd = rentEnd;
        } else System.err.println("Date of end must by lover then end date.");
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    public Long getDays() {
        return days;
    }

    public void setDays(LocalDate rentStart, LocalDate rentEnd) {
        this.days = DAYS.between(rentEnd, rentStart);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", offerName='" + offerName + '\'' +
                ", offerType=" + offerType +
                ", rentStart=" + rentStart +
                ", rentEnd=" + rentEnd +
                ", price=" + price +
                ", availability=" + availability +
                ", days=" + days +
                '}';
    }
}
