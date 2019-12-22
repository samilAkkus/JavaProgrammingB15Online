package a_replit;

import java.util.Scanner;

public class Without_X_x_079 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String firstCharacter = word.substring(0,1);

        String lastCharacter = word.substring(word.length() -1);

        if((firstCharacter.equals("x")) && (lastCharacter.equals("x")) ){

            System.out.println(word.substring(1,word.length()-1));

        }else{

            if((firstCharacter.equals("x")) && (lastCharacter.equals("X"))){

                System.out.println(word.substring(1,word.length()-1));

            }else{

                if((firstCharacter.equals("X")) && (lastCharacter.equals("x"))){

                    System.out.println(word.substring(1,word.length()-1));
                }else{

                    if((firstCharacter.equals("X")) && (lastCharacter.equals("X"))){

                        System.out.println(word.substring(1,word.length()-1));
                    }else{

                        if((firstCharacter.equals("x"))){

                            System.out.println(word.substring(1));
                        }else{
                            if((firstCharacter.equals("X"))){

                                System.out.println(word.substring(1));
                            }else{

                                if((lastCharacter.equals("x"))){

                                    System.out.println(word.substring(0,word.length()-1));
                                }else{

                                    if((lastCharacter.equals("X"))){

                                        System.out.println(word.substring(0,word.length()-1));
                                    }else{

                                        System.out.println(word);
                                    }
                                }
                            }

                        }
                    }
                }
            }
        }





    }
}
