package Voilation;

public interface Features {
    // voilation of Interface Segregation Principle Because Some Hashings can't be decoded ex:SHA256
    String hashPassword(String password,String hashingType);
    String decodeFromHash(String hash);
}
