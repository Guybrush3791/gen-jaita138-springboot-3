package org.generation.jaita138.demo6.db.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Building {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 128)
    private String name;
    @Column(length = 64)
    private String address;
    @Column(length = 64)
    private String city;
    @Column(length = 2)
    private String country;

    private int area;
    private int floors;

    private boolean swimmingPool;
    private boolean elevator;

    private boolean deleted = false;

    public Long getId() {

        return this.id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getName() {

        return this.name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getAddress() {

        return this.address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public String getCity() {

        return this.city;
    }

    public void setCity(String city) {

        this.city = city;
    }

    public String getCountry() {

        return this.country;
    }

    public void setCountry(String country) {

        this.country = country;
    }

    public int getArea() {

        return this.area;
    }

    public void setArea(int area) {

        this.area = area;
    }

    public int getFloors() {

        return this.floors;
    }

    public void setFloors(int floors) {

        this.floors = floors;
    }

    public boolean isSwimmingPool() {

        return this.swimmingPool;
    }

    public void setSwimmingPool(boolean swimmingPool) {

        this.swimmingPool = swimmingPool;
    }

    public boolean isElevator() {

        return this.elevator;
    }

    public void setElevator(boolean elevator) {

        this.elevator = elevator;
    }

    public boolean isDeleted() {

        return this.deleted;
    }

    public void setDeleted(boolean deleted) {

        this.deleted = deleted;
    }

    @Override
    public String toString() {

        return "Building [\n"
                + "  id: " + this.id + ",\n"
                + "  name: " + this.name + ",\n"
                + "  address: " + this.address + ",\n"
                + "  city: " + this.city + ",\n"
                + "  country: " + this.country + ",\n"
                + "  area: " + this.area + ",\n"
                + "  floors: " + this.floors + ",\n"
                + "  swimmingPool: " + this.swimmingPool + ",\n"
                + "  elevator: " + this.elevator + "\n"
                + "  deleted: " + this.deleted + "\n"
                + "]";
    }
}
