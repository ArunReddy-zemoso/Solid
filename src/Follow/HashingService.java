package Follow;

class HashingService{
    Hasher hash;
    public void setHash(Hasher hash){
        this.hash=hash;
    }// dependency inversion
    public String hashPassword(String password){
        return hash.hashPassword(password);
    }
}