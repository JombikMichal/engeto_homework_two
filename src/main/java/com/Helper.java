package com;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Helper {

    public Helper() {
    }

    public Double round2(Double val) {
        return new BigDecimal(val.toString()).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
