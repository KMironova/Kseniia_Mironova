package com.epam.tc.hw3.injectionDriver;

public class WebDriverInjector implements DriverInjector {
    @Override
    public DriverService getDriverService() {
        return new DriverManager();
    }
}
