package com.calculator_module.exam;

public class InputObject {
    private String input;

    public InputObject(String input) {
        this.input = input;
    }


    public void removeB(){
        if(input.indexOf('(') != -1){
            input.replace('(',' ');
        }
        if(input.indexOf(')') != -1){
            input.replace(')',' ');
        }
        this.input.trim();
    }


    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
}
