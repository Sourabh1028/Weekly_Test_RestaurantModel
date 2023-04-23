package com.geekster.RestaurantModel.Model;

public class Restaurant {
    private String Name;
    private String Address;
    private String id;
    private String Specialty;
    private String TotalStaff;

    public Restaurant(String name, String address, String number, String specialty, String totalStaff) {
        Name = name;
        Address = address;
        id = number;
        Specialty = specialty;
        TotalStaff = totalStaff;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public String getId() {
        return id;
    }

    public String getSpecialty() {
        return Specialty;
    }

    public String getTotalStaff() {
        return TotalStaff;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSpecialty(String specialty) {
        Specialty = specialty;
    }

    public void setTotalStaff(String totalStaff) {
        TotalStaff = totalStaff;
    }
}
