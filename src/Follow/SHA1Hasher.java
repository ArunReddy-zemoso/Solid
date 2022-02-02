package Follow;

class SHA1Hasher implements Hasher,Decryptor{
    public String hashPassword(String password){
        return "hashed with SHA-1";
    }
    public String decodeHashPassword(String hash){
        return "decode with SHA-1";
    }
}