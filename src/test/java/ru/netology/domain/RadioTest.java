package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void indicateTheStationNumber() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void indicateMaxTheStationNumber() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void indicateMinTheStationNumber() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void stationIncrease() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(5);
        assertEquals(6, radio.increaseStation());
    }

    @Test
    public void stationIncreaseMax() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(9);
        assertEquals(0, radio.increaseStation());
    }

    @Test
    public void stationDecrease() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(4);
        assertEquals(3, radio.turnDownTheStation());
    }

    @Test
    public void stationDecreaseMin() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(-1);
        assertEquals(9, radio.turnDownTheStation());
    }

    @Test
    public void stationDecreaseToTheMinBorder() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(1);
        assertEquals(0, radio.turnDownTheStation());
    }

    @Test
    public void stationIncreaseToTheMaxBorder() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(8);
        assertEquals(9, radio.increaseStation());
    }

//////////////////////////////////////////////////////Volume//////////////////////

    @Test
    public void increaseInSoundMaxLevel() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(10);
        assertEquals(10, radio.increaseVolume());
    }

    @Test
    public void increaseInSoundToTheMaxLevelBorder() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(9);
        assertEquals(10, radio.increaseVolume());
    }

    @Test
    public void increaseInSoundLevel() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(5);
        assertEquals(6, radio.increaseVolume());
    }

    @Test
    public void decreaseInSoundMinLevel() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(0);
        assertEquals(0, radio.decreaseVolume());
    }

    @Test
    public void decreaseInSoundToTheMinLevelBorder() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(1);
        assertEquals(0, radio.decreaseVolume());
    }

    @Test
    public void decreaseInSoundLevel() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(5);
        assertEquals(4, radio.decreaseVolume());
    }

}
