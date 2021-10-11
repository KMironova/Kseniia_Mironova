package com.epam.tc.hw7.entities;

import com.epam.tc.hw6.driver.ConfProperties;
import com.jdiai.tools.DataClass;

public class User extends DataClass<User> {
    public String name = ConfProperties.getProperty("name");
    public String password = ConfProperties.getProperty("password");
}
