package day41;

public class Product {

   private String name;
   private double price;

//   public String getName(){
//
//       return name;
//   }
//
//   public void setName(String newName){
//
//       name = newName;
//   }


//    public String getName() {
//        return name;
//    }
//
//    public void setName(String newName) {
//       name = newName ;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double newPrice) {
//
//        if(newPrice > 0){
//
//            price = newPrice;
//        }
//
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
