package com.calculator_module.exam;

import com.calculator_module.calculator.CalculatorHolder;

import java.util.ArrayList;
import java.util.List;

public class EnterToCalculate {
    private String enter;
    List<CalcultaAbleObject> calcultaAbleObjects;

    public EnterToCalculate(String enter) {
        this.enter = enter;
        this.calcultaAbleObjects = new ArrayList<>();
    }

    public void display(){
        toObject();

        for (CalcultaAbleObject c: this.calcultaAbleObjects){
            System.out.println("jjj " + c.getCalculateObject() + " " + c.isBracket() + " "+ c.isHightPriority() + " " + c.isOperation());

        }


    }

    public void toObject(){
        char eneterArray[] = this.enter.toCharArray();
        for (int i = 0; i < eneterArray.length; i++){
            this.calcultaAbleObjects.add(new CalcultaAbleObject(eneterArray[i]));
        }

    }

    public void toArray(){
        char eneterArray[] = this.enter.toCharArray();
        for (int i = 0; i < eneterArray.length; i++){
            System.out.println(eneterArray[i]);
        }
    }

    public String getLastStetam(){
        String input = this.enter;
        if(input.indexOf('(' ) != -1){
            input = input.substring(input.lastIndexOf('('),input.length());
            input = input.substring(input.lastIndexOf('('),input.length()).substring(0,input.indexOf(')')+1);
        }
        return input;
    }
}
