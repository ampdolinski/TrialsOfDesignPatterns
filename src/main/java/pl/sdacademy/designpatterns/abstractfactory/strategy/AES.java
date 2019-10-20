package pl.sdacademy.designpatterns.abstractfactory.strategy;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

public class AES implements SecretKeyGenerationStrategy {

    @Override
    public SecretKey generate() throws NoSuchAlgorithmException {
        KeyGenerator.getInstance("AES");
        return null;
    }
}
