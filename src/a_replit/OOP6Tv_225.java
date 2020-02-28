package a_replit;

public class OOP6Tv_225 {

    public int channel = 1;
    public int volumeLevel = 1;
    public boolean on = false;
    public String brand = "undefined";

    public OOP6Tv_225() {
        System.out.println("Creating TV object using no Args- constructor");
    }

    public OOP6Tv_225(String brand) {
        this.brand = brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {

        if(channel > 0 && channel < 120 && this.on == true){

            this.channel = channel;
        }else {

            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {

        if(volumeLevel >= 1 && volumeLevel <= 7 && this.on == true){

            this.volumeLevel = volumeLevel;
        }else {

            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void channelUp(){
        ++this.channel;
    }

    public void channelDown(){
        --this.channel;
    }

    public void volumeUp(){

        ++this.volumeLevel;
    }

    public void volumeDown(){

        --this.volumeLevel;
    }

    public boolean isOn(){

        return this.on;
    }

    public void turnOn(){

        if(this.on == false){

            this.on = true;
        }else {

            System.out.println("TV is already ON");
        }
    }

    public void turnOff(){

        if(this.on == false){

            System.out.println("TV is already OFF");
        }else {

            this.on = true;
        }
    }
}
