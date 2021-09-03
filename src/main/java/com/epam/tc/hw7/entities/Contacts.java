package com.epam.tc.hw7.entities;

import com.epam.jdi.tools.DataClass;

public class Contacts extends DataClass<Contacts> {
    public String firstName, lastName, acceptConditions, position, passportNumber,
            passportSeria, description, gender, weather;
    public boolean passport;
}
