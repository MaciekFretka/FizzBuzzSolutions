package pl.mj;

import java.sql.SQLOutput;

public class FizzBuzzGame {

    int size;

    public FizzBuzzGame(int size) {
        this.size = size;
    }

    public void playGame(){

    Buzz buzz= (number) -> {
        if(number%Buzz.BuzzCondition==0){
            return "Buzz";
        }
        return "";
    };

    Fizz fizz= (number) -> {
        if(number%Fizz.FizzCondition==0) {
            return"Fizz";
        }
        return "";
        };

        for(int i=1;i<=size;i++){
            System.out.print("Kid shout: ");
            String result="";
            result+=fizz.shout(i);
            result+=buzz.shout(i);
            if(result.equals("")) result=String.valueOf(i);
            System.out.println(result);
        }
    }

}
