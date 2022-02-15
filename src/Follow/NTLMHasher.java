package Follow;

public class NTLMHasher implements Hasher,Decryptor{
    //follows open-closed principle
    public String hashPassword(String password){
        return "hashed with NTLM";
    }
    public String decodeHashPassword(String hash){
        return "decode with NTLM";
    }
}