
package ru.netology.javaqa.javaqamvn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void testStation1() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);
        int exspected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(exspected, actual);
    }

    @Test
    public void testStation2() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        int exspected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(exspected, actual);
    }

    @Test
    public void testStation3() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);
        int exspected = 10;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(exspected, actual);
    }

    @Test
    public void testStation4() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);
        int exspected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(exspected, actual);
    }

    @Test
    public void testStation5() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        int exspected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(exspected, actual);
    }

    @Test
    public void testStation6() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);
        int exspected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(exspected, actual);
    }

    @Test
    public void testStation7() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);
        int exspected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(exspected, actual);
    }

    @Test
    public void testStation8() {
        Radio radio = new Radio();

        radio.setCurrentStation(2);
        int exspected = 2;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(exspected, actual);
    }

    @Test
    public void testStationNext9() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.next();

        int exspected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(exspected, actual);
    }

    @Test
    public void testStationNext10() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);
        radio.next();

        int exspected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(exspected, actual);
    }

    @Test
    public void testStationNext11() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.next();

        int exspected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(exspected, actual);
    }

    @Test
    public void testStationNext12() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);
        radio.next();

        int exspected = 2;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(exspected, actual);
    }


    @Test
    public void testVolumeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(56);
        radio.volumeUp();

        int expected = 57;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testVolumeUpMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.volumeUp();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeDown() {
        Radio radio = new Radio();
        radio.setCurrentVolume(35);
        radio.volumeDown();

        int expected = 34;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeDownMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.volumeDown();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void testVolumeDownMin1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.volumeDown();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeUpMax1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.volumeUp();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.next();

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}
