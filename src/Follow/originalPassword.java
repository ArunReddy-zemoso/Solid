package Follow;

public class originalPassword implements NoHasher{
    public String hashPassword(String password){
        return password;
    }
}
