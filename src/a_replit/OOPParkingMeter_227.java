package a_replit;

public class OOPParkingMeter_227 {

    int timeLeft = 0;
    int maxTime;

    public OOPParkingMeter_227( int maxTime ){

        this.maxTime = maxTime;
    }

    public boolean add(int time) {
        if (time==25 && timeLeft+30<=maxTime) {
            timeLeft += 30;
            return true;
        }
        return false;
    }

    public void tick(){

        if(timeLeft > 0){

            --timeLeft;
        }
    }

    public boolean isExpired(){

        return timeLeft == 0;
    }


}


