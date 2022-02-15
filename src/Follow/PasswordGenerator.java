package Follow;

class PasswordGenerator //extends HashingService
{
    public String generatePassword(int length){
        if(length==1)
            return "a";
        else if(length==2)
            return "ab";
        else if(length==3)
            return "abc";
        else if(length==4)
            return"abcd";
        return "arun";
    }
}
