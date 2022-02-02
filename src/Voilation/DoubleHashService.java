package Voilation;

public class DoubleHashService implements NoHash,Features{
    public String OriginalPassword(String password){
        return password;
    }
    public String hashPassword(String password,String hashingType){
        try{
            if(hashingType.equals("SHA1")){
                return "DoubleHashed with SHA-1";
            }
            else if(hashingType.equals("SHA2")){
                return "DoubleHashed  with SHA-2";
            }
            else if(hashingType.equals("NTLM")){
                return "DoubleHashed  with NTLM";
            }
            else if(hashingType.equals("SHA256")){
                return "DoubleHashed  with SHA256";
            }
            else if(hashingType.equals("")){
                throw new NullPointerException("Must specify the hashingType");
            }
            return "";
        }
        catch(NullPointerException obj){
            return obj.getMessage();
        }
    }
    public String decodeFromHash(String hash){
        return "Decoded with "+hash;
    }

}

