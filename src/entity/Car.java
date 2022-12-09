package entity;

// Car class : Name isNew Brand double rengi

import dataAccess.BrandDAO;

public class Car {

    private Integer id;

    private String name;

    private boolean isNew;

    private Integer brandId;

    private double price;

    public Car() {
    }

    public Car(Integer id, String name, boolean isNew, Integer brandId, double price) {
        this.id = id;
        this.name = name;
        this.isNew = isNew;
        this.brandId = brandId;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {

        BrandDAO brandDAO = new BrandDAO();

        return "Car{" +
                "name='" + name + '\'' +
                ", isNew=" + isNew +
                ", brand=" + brandDAO.getById(brandId) +
                ", price=" + price +
                '}';
    }
}
