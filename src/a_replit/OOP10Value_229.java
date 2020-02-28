package a_replit;

public class OOP10Value_229 {

    int value;

    public OOP10Value_229() {

    }

    int setCons;
    int consCount;
    public OOP10Value_229(int value){
        this.value = value;
        setCons = this.value;

        ++consCount;

    }
        int setCount;
    public void setVal(int param){

        this.value = param;
        ++setCount;
    }
    public boolean wasModified(){

        if(setCount > 0){

            return true;
        }else {
            return false;
        }
    }

    public int getVal(){

        if(setCount < 0 && consCount < 0){

            return 0;
        }else {

            if(setCount < 0 && consCount > 0){

                return setCons;
            }else {

                return this.value;
            }
        }


    }

    @Override
    public String toString() {
        return "OOP10Value_229{" +
                "value=" + value +
                '}';
    }

    public static void main(String[] args) {


        OOP10Value_229 v1 = new OOP10Value_229();

        System.out.println(v1.getVal());

        OOP10Value_229 v2 = new OOP10Value_229(20);
        System.out.println(v2.getVal());

        v2.setVal(15);
        System.out.println(v2.getVal());



    }
}
