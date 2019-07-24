package com.example.July22Project;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@JsonIgnoreProperties({"hibernatelazyinitializer", "handler"})
@Table(name = "Consoles")
public class Consoles {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Size(max = 11)
    private Integer id;

    @NotEmpty
    @Size(max = 50)
    private String model;

    @NotEmpty
    @Size(max = 50)
    private String manufacturer;

    @Size(max = 20)
    private String memoryAmount;

    @Size(max = 20)
    private String processor;

    @Digits(integer = 5, fraction = 2)
    @NotNull
    private Double price;

    @NotNull
    @Size(max = 11)
    private  Integer quantity;

    public Consoles(){

    }

    public Consoles(@Size(max = 11) Integer id, @NotEmpty @Size(max = 50) String model, @NotEmpty @Size(max = 50) String manufactuerer, @Size(max = 20) String memoryAmount, @Size(max = 20) String processor, @Digits(integer = 5, fraction = 2) @NotNull Double price, @NotNull @Size(max = 11) Integer quantity) {
        this.id = id;
        this.model = model;
        this.manufacturer = manufactuerer;
        this.memoryAmount = memoryAmount;
        this.processor = processor;
        this.price = price;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMemoryAmount() {
        return memoryAmount;
    }

    public void setMemoryAmount(String memoryAmount) {
        this.memoryAmount = memoryAmount;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
