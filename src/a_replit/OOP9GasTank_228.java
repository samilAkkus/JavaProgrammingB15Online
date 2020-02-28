package a_replit;

public class OOP9GasTank_228 {

    double amount = 0;
    double capacity ;


    public OOP9GasTank_228(double capacity){

        this.capacity = capacity;
    }

    public void addGas(double addGasAmount){

        amount += addGasAmount;
        if(amount > capacity){

            amount = capacity;
        }
    }

    public void useGas(double useGasAmount){

        amount -= useGasAmount;
        if(amount < 0){
            amount = 0;
        }
    }

    public boolean isEmpty(){

        return amount < 0.1;
    }

    public boolean isFull(){

        return amount > capacity-0.1;
    }

    public double getGasLevel(){

        return amount;
    }



    public double fillUp(){

        double difference;

        difference = capacity - amount;

        amount = capacity;

        return difference;


    }

    @Override
    public String toString() {
        return "OOP9GasTank_228{" +
                "amount=" + amount +
                ", capacity=" + capacity +
                '}';
    }

    public static void main(String[] args) {

        OOP9GasTank_228 g1= new OOP9GasTank_228(50);
        System.out.println(g1);
        g1.addGas(60);
        System.out.println(g1);
        System.out.println(g1.isFull());
        g1.useGas(30);
        System.out.println(g1);
        System.out.println("g1.fillUp() = " + g1.fillUp());

        System.out.println(g1);

    }
}
