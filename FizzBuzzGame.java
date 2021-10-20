package pl.mj;

import java.sql.SQLOutput;
import java.util.*;

public class FizzBuzzGame {

    int size;

    private Map<Integer,String> conditions = new HashMap<Integer,String>();

    public FizzBuzzGame(int size) {
        conditions.put(3,"Fizz");
        conditions.put(5,"Buzz");
        this.size = size;
    }


    private String prepareShout(Integer number){
        StringBuilder result = new StringBuilder();
        for(Map.Entry<Integer,String> entry : conditions.entrySet()){
            Integer conditionNumber = entry.getKey();
            String shout = entry.getValue();
            if(number%conditionNumber==0) result.append(shout);
        }

        if(result.toString().equals("")) result = new StringBuilder(String.valueOf(number));

        return result.toString();
    }
    public void addCondition(Integer condtionNumber,String shout){
        conditions.put(condtionNumber,shout);

    }
    public void playGame(){

        for(int i=1;i<=100; i++){
            System.out.println("Kid is shouting: "+prepareShout(i));
            }
    }

}
