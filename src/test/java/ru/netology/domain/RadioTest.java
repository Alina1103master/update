package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void Radio() {
        Radio rad = new Radio(10,100);
        assertEquals(10,rad.getCurrentRadioStation());
        assertEquals(100, rad.getMaxVolume());
    }

    Radio rad = new Radio();
    @Test
    public void mustBeInTheFeild() {
        assertEquals(0,rad.getCurrentRadioStation());
        assertEquals(0,rad.getCurrentVolume());
        assertEquals(100,rad.getMaxVolume());
        assertEquals(0,rad.getMinVolume());
    }



    @Test

    public void ShouldSetMaxStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(10);
        int expected = 10;
        assertEquals(expected, rad.getMaxRadioStation());
    }


    @Test
    public void ShouldSetMinStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);
        int expected = 0;
        assertEquals(expected, rad.getCurrentRadioStation());
    }


    @Test
    public void ShouldSetNextRadioStationPositiveNumber5() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(5);
        int expected = 6;
        assertEquals(expected, rad.setNextStation());
        assertEquals(expected, rad.getCurrentRadioStation());
    }

    @Test
    public void ShouldSetNextRadioStationPositiveNumber2() {
        Radio radioRock = new Radio();
        radioRock.setCurrentRadioStation(2);
        int expected = 1;
        assertEquals(expected, rad.setNextStation());
    }

    @Test
    public void ShouldSetPreviousRadioStationPositiveNumber1() {
        Radio radioRock = new Radio();
        radioRock.setCurrentRadioStation(1);
        int expected = 10;
        assertEquals(expected, rad.setEarlyStation());
    }

    @Test
    public void ShouldSetRadioStationNegative() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(-1);
        int expected = 0;
        assertEquals(expected, rad.getCurrentRadioStation());
    }

    @Test
    public void ShouldSetRadioStationNegativeNumber10() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(10);
        int expected = 10;
        assertEquals(expected, rad.getCurrentRadioStation());
    }






    @Test
    public void ShouldSetPreviousRadioStationNumber1() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(1);
        int expected = 0;
        assertEquals(expected, rad.setEarlyStation());
    }

    @Test
    public void ShouldSetPreviousRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);
        assertEquals(10, rad.setEarlyStation());

    }

    @Test
    public void ShouldSetPreviousRadioStationNegative() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(-1);
        int expected = 10;
        assertEquals(expected, rad.setEarlyStation());

    }

    @Test
    public void ShouldSetEarlyRadioStationPositiveNumber10() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        int expected = 9;
        assertEquals(expected, rad.setEarlyVolume());
    }

    @Test

    public void ShouldSetMaxVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(99);
        int expected = 100;
        assertEquals(expected, rad.getMaxVolume());
    }

    @Test

    public void ShouldSetMinVolume() {
        rad.setCurrentVolume(0);
        rad.setCurrentVolume(-1);
        assertEquals(0,rad.getCurrentVolume());
    }

    @Test
    public void ShouldSetVolumePositiveNumber0() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        int expected = 0;
        assertEquals(expected, rad.getCurrentVolume());
    }

    @Test
    public void ShouldSetVolumePositiveNumber1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);
        int expected = 1;
        assertEquals(expected, rad.getCurrentVolume());
    }

    @Test
    public void ShouldSetVolumePositiveNumber9() {
        Radio rad = new Radio();
        rad.setCurrentVolume(9);
        int expected = 9;
        assertEquals(expected, rad.getCurrentVolume());
    }

    @Test
    public void ShouldSetVolumeNegativeNumber101() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.setCurrentVolume(101);
        assertEquals(100, rad.getCurrentVolume());
    }


    @Test
    public void ShouldSetVolumeNegative() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        int expected = 0;
        assertEquals(expected, rad.getCurrentVolume());
    }

    @Test
    public void ShouldSetNextVolumePositiveNumber5() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);
        int expected = 6;
        assertEquals(expected, rad.setNextVolume());
    }

    @Test
    public void ShouldSetNextVolumePositiveNumber2() {
        Radio rad = new Radio();
        rad.setCurrentVolume(2);
        int expected = 3;
        assertEquals(expected, rad.setNextVolume());
    }

    @Test
    public void ShouldSetNextVolumePositiveNumber1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);
        int expected = 2;
        assertEquals(expected, rad.setNextVolume());
    }

    @Test
    public void ShouldSetNextVolumeNegativeNumber100() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        int expected = 100;
        assertEquals(expected, rad.setNextVolume());
    }

    @Test
    public void ShouldSetEarlyVolumePositiveNumber1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);
        int expected = 0;
        assertEquals(expected, rad.setEarlyVolume());
    }

    @Test
    public void ShouldSetEarlyVolumePositiveNumber2() {
        Radio rad = new Radio();
        rad.setCurrentVolume(2);
        int expected = 1;
        assertEquals(expected, rad.setEarlyVolume());
    }



    @Test
    public void ShouldSetEarlyVolumeNegativeNumber0() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        int expected = 0;
        assertEquals(expected, rad.setEarlyVolume());

    }
}
