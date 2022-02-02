package Follow;

public class Hashing{
    public static void main(String[] args) {
        PasswordGenerator hashedPassword=new PasswordGenerator();
        String password=hashedPassword.generatePassword(3);

        hashedPassword.setHash(new SHA1DoubleHasher());
        System.out.println(hashedPassword.hashPassword(password));

        originalPassword password1=new originalPassword();
        System.out.println(password1.hashPassword("Arun"));

        StorePassword passwordSaver =new StorePassword();
        passwordSaver.savePassword(hashedPassword.hashPassword(password));
    }
}