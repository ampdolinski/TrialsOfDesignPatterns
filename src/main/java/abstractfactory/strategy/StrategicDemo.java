package abstractfactory.strategy;

import java.security.NoSuchAlgorithmException;

public class StrategicDemo {

    public static void main(String[] args) throws NoSuchAlgorithmException {

        SecretKeyGenerationStrategy strategyA = new AESSecretKeyGenerationStrategy();
        SecretKeyGenerationStrategy strategyB = new DESSecretKeyGenerationStrategy();

        SecretKeyGeneration generator = new SecretKeyGeneration(strategyA);

        System.out.println(generator.create().getAlgorithm());

    }

}
