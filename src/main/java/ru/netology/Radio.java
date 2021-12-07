package ru.netology;

public class Radio {
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation;
    private int numberOfStations = 10;

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    public Radio() {
    }

    public int getNumberOfStations() {
        return numberOfStations;
    }

    public void setNumberOfStations(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }


    public int increaseStation() {
        if (currentStation == maxStation) {
            this.currentStation = minStation;
        } else {
            currentStation++;
        }
        return currentStation;
    }


    public int turnDownTheStation() {
        if (currentStation == minStation) {
            this.currentStation = maxStation;
        } else {
            currentStation--;
        }
        return currentStation;
    }

    ///////////////////Volume/////////////////

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }


    public int increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;

        }
        if (currentVolume == maxVolume) {
            currentVolume = currentVolume;
        }
        return currentVolume;
    }


    public int decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
        if (currentVolume == minVolume) {
            currentVolume = currentVolume;
        }
        return currentVolume;
    }
}
