package day49;

public class Tesla extends Vehicle implements Autonomous , Chargeable {

    int horsePower;
    String model;

    public Tesla(int year , int horsePower , String model) {
        super(year);
        this.horsePower = horsePower;
        this.model = model;
    }

    @Override
    public void start() {

        System.out.println("starting TESLA");

    }

    @Override
    public void selfDrive() {

        System.out.println("TESLA has self-drive");

    }

    @Override
    public String toString() {
        return "Tesla{" +
                "horsePower=" + horsePower +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

 /// extra
    @Override
    public void charge() {

        System.out.println("TESLA is charging");

    }
}
