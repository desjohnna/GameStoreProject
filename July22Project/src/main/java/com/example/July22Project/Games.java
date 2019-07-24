package com.example.July22Project;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@JsonIgnoreProperties({"hibernatelazyinitializer", "handler"})
@Table(name = "Games")

public class Games {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Size(max = 11)
    private int gameId;

    @NotEmpty
    @Size(max = 50)
    private String title;

    @NotEmpty
    @Size(max = 50)
    private String ersbRating;

    @NotEmpty
    private String description;

    @NotNull
    @Digits(integer = 5, fraction = 2)
    private Double price;

    @NotEmpty
    @Size(max = 50)
    private String studio;

    @NotNull
    @Size(max = 11)
    private Integer quantity;


    public Games() {
    }

    public Games(@Size(max = 11) int gameId, @NotEmpty @Size(max = 50) String title, @NotEmpty @Size(max = 50) String ersbRating, @NotEmpty String description, @NotNull @Digits(integer = 5, fraction = 2) Double price, @NotEmpty @Size(max = 50) String studio, @NotNull @Size(max = 11) Integer quantity) {
        this.gameId = gameId;
        this.title = title;
        this.ersbRating = ersbRating;
        this.description = description;
        this.price = price;
        this.studio = studio;
        this.quantity = quantity;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getErsbRating() {
        return ersbRating;
    }

    public void setErsbRating(String ersbRating) {
        this.ersbRating = ersbRating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


}
