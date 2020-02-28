package a_replit;

public class OOP4CalculatorII_223 {


    private int x;
    private int y;
    private int result;

    public int getResult() {
        return result;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void plus(){

        this.result = this.x + this.y;

        System.out.println(this.result);
    }

    public void minus(){

        this.result = this.x - this.y;

        System.out.println(this.result);
    }
}
