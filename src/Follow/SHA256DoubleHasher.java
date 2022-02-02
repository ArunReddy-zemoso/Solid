package Follow;

class SHA256DoubleHasher implements Hasher{
    public String hashPassword(String password){
        return "DoubleHashed with SHA-256";
    }
}