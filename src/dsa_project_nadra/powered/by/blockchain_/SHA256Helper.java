package dsa_project_nadra.powered.by.blockchain_;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class SHA256Helper {
    public static String hash(String data) throws NoSuchAlgorithmException, UnsupportedEncodingException
    {
        try{
        //we use SHA 256 usually in blockchain
        MessageDigest digest = MessageDigest.getInstance("SHA");
        byte[] hash = digest.digest(data.getBytes("UTF-8"));
       
        //we want to end up with hexadecimal values not bytes`
        StringBuffer hexadecimalString = new StringBuffer();
 for (int i=0;i<hash.length;i++){
 String hexadecimal = Integer.toHexString(0xff & hash[i]);
 if(hexadecimal.length()==1) hexadecimalString.append('0');
 hexadecimalString.append(hexadecimal);
 
 }
return hexadecimalString.toString();
        } catch (Exception e)
        {
        throw new RuntimeException(e);
        }
    
    }
}
