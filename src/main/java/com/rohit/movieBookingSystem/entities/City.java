package com.rohit.movieBookingSystem.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class City {
    @Id
    @GeneratedValue
    private int cityId;

    @Column(length = 20, nullable = false)
    private String cityName;

    @OneToMany(mappedBy = "city", fetch = FetchType.LAZY)
    private Set<Theatre> theatres;

    public City(){}
    public City(int cityId, String cityName){
        this.cityId = cityId;
        this.cityName = cityName;
    }

    public City(String cityName){
        this.cityName = cityName;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityId=" + cityId +
                ", cityName='" + cityName + '\'' +
                '}';
    }
}
