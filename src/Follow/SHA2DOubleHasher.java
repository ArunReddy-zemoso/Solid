package Follow;

class SHA2DOubleHasher implements Hasher,Decryptor{
    public String hashPassword(String password){
        return "DoubleHashed with SHA-2";
    }
    public String decodeHashPassword(String hash){
        return "decode with SHA-2";
    }
}