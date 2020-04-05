package bd.com.fullstack.blockchain.naive;

import java.security.MessageDigest;

public class Crypto {

    public static String sha256Hash(String data) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(data.getBytes("UTF-8"));

            StringBuilder hexSB = new StringBuilder();

            for (byte aHash : hash) {
                String hex = Integer.toHexString(0xff & aHash);
                if (hex.length() == 1)
                    hexSB.append('0');
                hexSB.append(hex);
            }
            return hexSB.toString();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
