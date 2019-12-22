package day09;

public class LanguagePicker {

    public static void main(String[] args) {

        int num = 6;

        String greeting = "";

        if(num==1){
            greeting = " hello  ";
        }else{
            if(num==2){
                greeting = " salam  ";
            }else{
                if(num==3){
                    greeting = " hola  ";
                }else {
                    if(num==4){
                        greeting = " privet  ";
                    }else {
                        if(num==5){
                            greeting = " merhaba  ";
                        }else {
                            if(num==6){
                                greeting = " szia  ";
                            }else {
                                if(num==7){
                                    greeting = " bonjour  ";
                                }else {
                                    greeting = " unknown ";
                                }
                            }
                        }
                    }
                }
            }
        }

        greeting = greeting + ", sdet";

        System.out.println(greeting);

    }
}
