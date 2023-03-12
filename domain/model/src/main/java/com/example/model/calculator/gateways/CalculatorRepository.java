package com.example.model.calculator.gateways;

import reactor.core.publisher.Mono;

public interface CalculatorRepository {
    Mono<Integer> Add(int a, int b);
}
