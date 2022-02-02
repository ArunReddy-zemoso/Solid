package Follow;

class SHA2Hasher implements Hasher,Decryptor{
    public String hashPassword(String password){
        return "hashed with SHA-2";
    }
    public String decodeHashPassword(String hash){
        return "decode with SHA-2";
    }
}