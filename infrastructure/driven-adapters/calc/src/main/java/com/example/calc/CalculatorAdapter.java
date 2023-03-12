package com.example.calc;

import com.example.model.calculator.gateways.CalculatorRepository;
import reactor.core.publisher.Mono;

public class CalculatorAdapter implements CalculatorRepository {
    @Override
    public Mono<Integer> Add(int a, int b) {
        return Mono.just(a + b);
    }
}
