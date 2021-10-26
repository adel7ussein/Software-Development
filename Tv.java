package javaapplication4;

public class Tv {

    private int channel;
    private int volumeLevel;
    private boolean on;

    public Tv() {
    }

    ;
    
    public void turnOn() {

        on = true;
        System.out.println("the tv is turnned on");

    }

    ;
    public void turnOff() {

        on = false;
        System.out.println("the tv is turnned off");

    }

    ;

    public void setChannel(int channel) {
        if (channel >= 1 && channel <= 120) {
            this.channel = channel;
        }
    }

    public void setVolumeLevel(int volumeLevel) {
        if (volumeLevel >= 1 && volumeLevel <= 7) {
            this.volumeLevel = volumeLevel;
        }
    }

    public void channelUp() {

        this.channel++;

    }

    ;
    public void channelDown() {
        this.channel--;

    }

    ;
    public void volumeUp() {
        this.volumeLevel++;

    }

    ;
    public void volumeDown() {
        this.volumeLevel--;

    }
;

}
