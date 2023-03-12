package com.example.usecase.calculator;

import com.example.model.calculator.Calculator;
import com.example.model.calculator.gateways.CalculatorRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class CalculatorUseCase {
    private final CalculatorRepository calculatorRepository;
    public Mono<Integer> Add(int a, int b){
        return calculatorRepository.Add(a, b);
    }
}
