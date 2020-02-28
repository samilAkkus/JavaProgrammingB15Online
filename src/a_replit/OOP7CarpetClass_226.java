package a_replit;

public class OOP7CarpetClass_226 {

    public double width;
    public double length;
    public double unitPrice;
    public double totalPrice;
    public boolean isPersian;

    public OOP7CarpetClass_226() {

        this.width = 300;
        this.length = 300;
        this.totalPrice = 200;
        this.isPersian = false;
        this.unitPrice = 0;
    }

    public OOP7CarpetClass_226(double width , double length , double unitPrice , boolean isPersian){

        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;

        if(isPersian == false){

            this.totalPrice = (width+length) * unitPrice;
        }else {

             this.totalPrice =  ((width+length) * unitPrice) + 200;
        }

    }





}
