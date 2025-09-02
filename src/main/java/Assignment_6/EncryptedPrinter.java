package Assignment_6;

import java.security.SecureRandom;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EncryptedPrinter extends BasePrinter {

    EncryptedPrinter(Printer wrapped) {
        super(wrapped);
    }

    private SecretKeySpec generateKey() {
        byte[] key = new byte[32];
        SecureRandom random = new SecureRandom();
        random.nextBytes(key);
        SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
        return secretKey;
    }

    private String encrypt(String message) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        SecretKeySpec key = generateKey();
        byte[] iv = new byte[12];
        GCMParameterSpec gcmSpec = new GCMParameterSpec(128, iv);
        cipher.init(Cipher.ENCRYPT_MODE, key, gcmSpec);
        byte[] encryptedBytes = cipher.doFinal(message.getBytes("UTF-8"));
        byte[] combined = new byte[iv.length + encryptedBytes.length];
        System.arraycopy(iv, 0, combined, 0, iv.length);
        System.arraycopy(encryptedBytes, 0, combined, iv.length, encryptedBytes.length);
        return Base64.getEncoder().encodeToString(combined);
    }

    @Override
    public void print(String message) {
        String encrypted = "";
        try {
            encrypted = encrypt(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.print(encrypted);
    }

}
