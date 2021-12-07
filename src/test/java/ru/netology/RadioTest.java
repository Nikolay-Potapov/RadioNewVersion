package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();


    @Test
    public void shouldNumberOfStation() {
        Radio radio = new Radio(10);
        radio.setNumberOfStations(8);
        assertEquals(8, radio.getNumberOfStations());

    }

    @Test
    public void increaseCurrentStation() {
        radio.setCurrentStation(8);
        radio.increaseStation();
        assertEquals(9, radio.getCurrentStation());

    }

    @Test
    public void stationIncreaseMax() {
        radio.setCurrentStation(9);
        radio.increaseStation();
        assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void indicateMinTheStationNumber() {
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void indicateMaxTheStationNumber() {
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());

    }


    @Test
    public void stationDecrease() {
        radio.setCurrentStation(3);
        radio.turnDownTheStation();
        assertEquals(2, radio.getCurrentStation());

    }


    @Test
    public void stationDecreaseMin() {
        radio.setCurrentStation(0);
        radio.turnDownTheStation();
        assertEquals(9, radio.getCurrentStation());

    }

    //////////////////////////////////////////////////////Volume//////////////////////
    @Test
    public void increaseInSoundLevel() {
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());

    }


    @Test
    public void shouldUpMaxVolume() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());

    }


    @Test
    public void decreaseInSoundLevel() {
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());

    }


    @Test
    public void decreaseInSoundMinLevel() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());

    }

}