package Voilation;

public class Hashing{
	public static void main(String[] args) throws Exception {
		HashService hash=new HashService();
		String password=hash.generatePassword(4);
		String OriginalPassword=hash.OriginalPassword(password);
		System.out.println("OriginalPassword :"+OriginalPassword);
		System.out.println("HashedPassword "+hash.hashPassword(password,"SHA1"));
		SHA256 sha=new SHA256();
		System.out.println(sha.hashPassword(password));
	}
}