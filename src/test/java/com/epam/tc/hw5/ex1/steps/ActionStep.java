package com.epam.tc.hw5.ex1.steps;

import io.cucumber.java.en.When;

public class ActionStep extends AbstractStep{

   @When("I select checkbox 'Water'")
   public void selectCheckboxWater() {
       differentPage.selectCheckBoxWater();
   }

   @When("I select checkbox 'Wind'")
   public void selectCheckBoxWind() {
       differentPage.selectCheckBoxWind();
   }
   @When("I select radio 'Selen'")
   public void selectRadioSelen () {
       differentPage.selectRadioSelen();
   }

   @When("I select 'Yellow' from dropdown list")
    public void selectDropdownYellow() {
       differentPage.selectDropDownYellow();
   }
}
