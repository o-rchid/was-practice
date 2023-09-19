package org.example.arithmetic_calculate.tobe;

import org.example.arithmetic_calculate.domain.PositiveNumber;

public interface NewArithmeticOperator {
    boolean supports(String operator);
    int calculate(PositiveNumber operand1, PositiveNumber operand2);
}
