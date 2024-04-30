
package ru.netology.javaqa.javaqamvn;

public class Radio {
    private int currentStation;
    private int currentVolume;

    private int minVolume;

    private int maxVolume;


    public void next() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
            return;
        }
        currentStation = 0;

    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void volumeUp() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void volumeDown() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public Radio() {
        this.maxVolume = 100;
        this.minVolume = 0;
    }

}