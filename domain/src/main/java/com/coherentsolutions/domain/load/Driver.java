package com.coherentsolutions.domain.load;

import com.coherentsolutions.domain.load.helper.License;

public class Driver extends User{
    private License license;
    public Driver(String firstName, String lastName, int age, License license) {
        super(firstName, lastName, age);
        this.license = license;
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }
}
