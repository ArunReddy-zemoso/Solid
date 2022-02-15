package Follow;

import Voilation.HashService;

public class Hashing{
    public static void main(String[] args) {
        //follows Single Responsibility
        PasswordGenerator passwordGenerator=new PasswordGenerator();
        HashingService hashingService=new HashingService();

        String password=passwordGenerator.generatePassword(3);

        //follows open-closed principle
        hashingService.setHash(new SHA1DoubleHasher());

        System.out.println(hashingService.hashPassword(password));

        //follows liskov principle
        Decryptor decoder=new SHA1DoubleHasher();
        System.out.println(decoder.decodeHashPassword(password));

        //Decryptor decryptor1=new SHA256DoubleHasher();

        originalPassword password1=new originalPassword();
        System.out.println(password1.hashPassword("Arun"));

        StorePassword passwordSaver =new StorePassword();
        passwordSaver.savePassword(hashingService.hashPassword(password));
    }
}