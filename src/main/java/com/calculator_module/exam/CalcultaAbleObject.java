package com.calculator_module.exam;

public class CalcultaAbleObject {
    private char calculateObject;
    private boolean operation;
    private boolean hightPriority;
    private boolean bracket;

    public CalcultaAbleObject(char calculateObject) {
        this.calculateObject = calculateObject;
        initialize();
    }

    public void initialize(){
        switch (this.calculateObject){
            case '+':
            case '-':{
                this.operation = true;
                break;
            }
            case '*':
            case '/':{
                this.operation = true;
                this.hightPriority = true;
                break;
            }
            case '(':
            case ')':
            {
                this.bracket = true;
            }
            default:
                break;
        }
    }

    public boolean isOperation() {
        return operation;
    }

    public boolean isHightPriority() {
        return hightPriority;
    }

    public boolean isBracket() {
        return bracket;
    }

    public char getCalculateObject() {
        return calculateObject;
    }

    public void setCalculateObject(char calculateObject) {
        this.calculateObject = calculateObject;
    }
}
