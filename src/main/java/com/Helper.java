package com;

import com.project_exceptions.InputIsZero;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Helper {

    public Helper() {
    }

    public static Double round2(Double val) {
        return new BigDecimal(val.toString()).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

//    private long getCorrectAnsCount(){
//        return answers.stream().filter(answer -> answer.isCorrect()).count();
//    }

    public static boolean validate(double... inputs) {
        for (int i = 0; i < inputs.length; i++) {
            if (i == 0) {
                return false;
            }
        }
        return true;
    }
}
