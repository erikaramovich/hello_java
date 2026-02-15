package org.example.primeNumber;

public class PrimeNumber {
    private final int value;

    public PrimeNumber(int value){
        if(value <= 1){
            throw new IllegalArgumentException("Value must be positive and more that 1 !");
        }

        this.value = value;
    }

    public boolean isPrime(){
        int n = this.value;
        if(n <= 1) return false;
        if(n == 2) return false;
        if(n % 2 == 0) return false;

        for(int i = 3; i * i <= n; i += 2){
            if(n % i == 0) return false;
        }
        return true;
    }
}
