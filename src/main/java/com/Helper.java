package com;

import com.project_exceptions.InputIsZero;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Helper {

    public Helper() {
    }

    public Double round2(Double val) {
        return new BigDecimal(val.toString()).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public boolean validate(double[] inputs) {
       try {
           for (int i= 0; i < inputs.length; i++){
               if(i == 0){
                   return false;
               }
           }
       }catch (Exception e){
           e.getStackTrace();
       }
        return true;
    }
}
