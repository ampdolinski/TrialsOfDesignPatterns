package pl.sdacademy.designpatterns.abstractfactory.strategy;

import javax.crypto.SecretKey;

public class HmacSHA256 implements SecretKeyGenerationStrategy {
    @Override
    public SecretKey generate() {
        return null;
    }
}
