package pl.sdacademy.designpatterns.abstractfactory.strategy;

import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

public interface SecretKeyGenerationStrategy {

    SecretKey generate() throws NoSuchAlgorithmException;

}
