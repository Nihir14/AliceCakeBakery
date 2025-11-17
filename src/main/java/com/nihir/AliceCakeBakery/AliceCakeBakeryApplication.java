package com.nihir.AliceCakeBakery;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AliceCakeBakeryApplication implements CommandLineRunner {

    private final CakeBakery cakeBakery;

    public AliceCakeBakeryApplication(CakeBakery cakeBaker) {
        this.cakeBakery = cakeBaker;
    }

    public static void main(String[] args) {
        SpringApplication.run(AliceCakeBakeryApplication.class, args);
    }

    @Override
    public void run(String... args) {
        cakeBakery.bakeCake();
    }

}
