package day41;

public class TV {

    String brand;
    boolean isOn;
    int currentChannel;

    public void turnOn(){

        if(isOn == false){

            isOn = true;
            System.out.println("tv is on = " + isOn);
        }


    }

    public void turnOff(){

        if(isOn == true){

            isOn = false;

            System.out.println("tv is on = "+isOn);

        }


    }

    public int getCurrentChannel(){

        return currentChannel;

    }

    public void setCurrentChannel(int newChannelNumber){

        if(currentChannel < 0 || currentChannel > 50){

            return;
        }

        if(isOn == true){

            currentChannel = newChannelNumber;

        }else {

            System.out.println("turn on tv first");
        }




    }

    public void moveForward(){

        ++currentChannel;


    }

    public void moveBackward(){
        --currentChannel;


    }


    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", isOn=" + isOn +
                ", currentChannel=" + currentChannel +
                '}';
    }
}
