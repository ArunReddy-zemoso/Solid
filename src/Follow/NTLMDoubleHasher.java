package Follow;

public class NTLMDoubleHasher implements Hasher,Decryptor {
    //follows open-closed principle
    public String hashPassword(String password) {
        return "Doublehashed with NTLM";
    }

    public String decodeHashPassword(String hash) {
        return "decode with NTLM";
    }

}