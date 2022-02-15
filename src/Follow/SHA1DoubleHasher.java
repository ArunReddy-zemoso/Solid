package Follow;

class SHA1DoubleHasher implements Hasher,Decryptor{
    //follows open-closed principle
    public String hashPassword(String password){
        return "DoubleHashed with SHA-1";
    }
    public String decodeHashPassword(String hash){
        return "decode with SHA-1";
    }
}