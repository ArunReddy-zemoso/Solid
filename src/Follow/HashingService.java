package Follow;

class HashingService{
    public Hasher hash;
    public void setHash(Hasher hash){
        this.hash=hash;
    }
    public String hashPassword(String password){
        return hash.hashPassword(password);
    }
}