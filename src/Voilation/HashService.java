package Voilation;

public class HashService extends PasswordGenerator implements NoHash,Features{
    public String OriginalPassword(String password){
        // it voilates liskov-substitution principle because as intent's this class must hash the password but we are returning original password, so this class may not able to replace the parent class
        return password;
    }
    public String hashPassword(String password,String hashingType){
        try{
            if(hashingType.equals("SHA1")){
                return "hashed with SHA-1";
            }
            else if(hashingType.equals("SHA2")){
                return "hashed with SHA-2";
            }
            else if(hashingType.equals("NTLM")){
                return "hashed with NTLM";
            }
            else if(hashingType.equals("SHA256")){
                return "hashed with SHA256";
            }
            else if(hashingType.equals("")){
                throw new NullPointerException("Must specify the hashingType");
            }
            return "";
            // voilates the openClosed Principle Because if we need to use new Hash function then another else-if condition need to be inserted
        }
        catch(NullPointerException obj){
            return obj.getMessage();
        }
    }
    public String decodeFromHash(String hash){
        if(hash.equals("SHA256")){
            return "It can't be Decoded";//It voilates the liskov principle
        }
        return "Decoded with "+hash;
    }
    public void savePassword(String password){
        System.out.println("Password: "+password+" Stored in DataBase");
    }
    //It voilates the single responsibility because it has more than one responsibility hashing,decoding,storing
}