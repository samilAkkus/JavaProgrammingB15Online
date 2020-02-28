package day43;

public class Pet {

   private String type;
   private String name;

   public Pet(){

       this.name = "noname";
       this.type = "unknown";
   }

    public Pet(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sesadnsd(){

        System.out.println("asdknd");
    }


    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public void speak(){

       if(this.type.equals("cat")){

           System.out.println("meow");
       }else {

           if(this.type.equals("dog")){

               System.out.println("hav");
           }else {

               if(this.type.equals("cow")){

                   System.out.println("moo");
               }else {

                   if(this.type.equals("horse")){

                       System.out.println("neinei");
                   }else {

                       System.out.println("unknown animaaaaal");
                   }
               }
           }
       }



    }
}
