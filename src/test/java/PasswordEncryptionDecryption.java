import org.apache.commons.codec.binary.Base64;

public class PasswordEncryptionDecryption {

    public static void main(String[] args) {
    }

    //	use below method to encrypt the password
    public static String encryptPassword(String pswd) {
        byte[] encodePwdBytes = Base64.encodeBase64(pswd.getBytes());
        String encodePwd = new String(encodePwdBytes);
        return encodePwd;
    }

    // use below method to decrypt the encrypted password
    public static String decryptPassword(String pswd) {
        byte[] decodePwdBytes = Base64.decodeBase64(pswd.getBytes());
        String decodePwd = new String(decodePwdBytes);
        return decodePwd;
    }
}
