package pl.sdacademy.designpatterns.abstractfactory.strategy;

import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

public class SecretKeyGeneration {

    private SecretKeyGenerationStrategy secretKeyGenerationStrategy;

    public SecretKeyGeneration(final SecretKeyGenerationStrategy secretKeyGenerationStrategy) {
        this.secretKeyGenerationStrategy = secretKeyGenerationStrategy;
    }

    public SecretKey create() throws NoSuchAlgorithmException {
        return secretKeyGenerationStrategy.generate();
    }

}
