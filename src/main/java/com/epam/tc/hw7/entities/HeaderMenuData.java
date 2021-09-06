package com.epam.tc.hw7.entities;

public enum HeaderMenuData {
    Home("Home"),
    ContactForm("Contact Form"),
    Service("Service"),
    MetalsColors("METALS & COLORS");

    public String value;
    HeaderMenuData(String value) {
        this.value = value;
    }
}
