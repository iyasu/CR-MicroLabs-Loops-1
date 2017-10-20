package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;
import org.junit.Test;

public class CarRideTest {

    @Test
    public void areWeThereYetTest_Yes(){
        // Given
        String expcepted = "Good";
        CarRide carRide = new CarRide();

        // When
        String actual = carRide.areWeThereYet("Yes");


        // Then
        Assert.assertEquals(expcepted, actual);
    }

    @Test
    public void areWeThereYetTest_notYet(){
        // Given
        String expected = "Are We There Yet?";
        CarRide carRide = new CarRide();

        // When
        String actual = carRide.areWeThereYet("Spoons");

        // Then
        Assert.assertEquals(expected, actual);
    }

}
