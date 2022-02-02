package Voilation;

public class SHA256 {
    HashService hash;
    public String hashPassword(String password){
        hash=new HashService();//It voilates the Dependency Inversion Principle by Tightly Coupling with HashService
        return hash.hashPassword(password,"SHA256");
    }
}
