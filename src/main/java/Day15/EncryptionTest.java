package Day15;

/*
 ** @author LiGuanda
 ** @date  AM 11:18:41
 ** @description This is a description of EncryptionTest
 ** @params
 ** @return
 ** @since version-1.0  */


import javax.crypto.*;
import java.io.IOException;
import java.security.*;

/**
 * @author Lenovo
 */
public class EncryptionTest {


    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException, ShortBufferException, IllegalBlockSizeException, BadPaddingException, IOException {

/*        Cipher cipher = Cipher.getInstance("AES", "SunJCE");
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        byte[] KEY = "heiheihei".getBytes(StandardCharsets.UTF_8);
        keyGenerator.init(new SecureRandom(KEY));
        SecretKey key = keyGenerator.generateKey();
        cipher.init(Cipher.ENCRYPT_MODE, key);
        String str = "能不能给我一首歌的时间";
        byte[] bytes = new byte[1024];
        cipher.update(str.getBytes(StandardCharsets.UTF_8), 0, str.getBytes(StandardCharsets.UTF_8).length, bytes);
        cipher.doFinal();
        System.out.println(new String(bytes, StandardCharsets.UTF_8));
        ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);
        CipherInputStream cipherInputStream = new CipherInputStream(inputStream, cipher);
        byte[] output = new byte[1024];
        cipherInputStream.read(output, 0, 1024);
        System.out.println(new String(output, StandardCharsets.UTF_8));

        KeyPairGenerator pairGenerator = KeyPairGenerator.getInstance("RSA");
        KeyPair keyPair = pairGenerator.generateKeyPair();
        System.out.println(keyPair.getPublic());
        System.out.println(keyPair.getPrivate());

        Cipher cipher1 = Cipher.getInstance("RSA");
        cipher1.init(Cipher.WRAP_MODE, keyPair.getPublic());
        KeyGenerator rsa = KeyGenerator.getInstance("AES");
        SecretKey key1 = rsa.generateKey();
        byte[] bytes1 = cipher1.wrap(key1);
        cipher1.unwrap()*/
        Cipher cipher = Cipher.getInstance("RSA");
        KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
        KeyPair keyPair = generator.generateKeyPair();
        PublicKey aPublic = keyPair.getPublic();
        cipher.init(Cipher.WRAP_MODE, aPublic);
        KeyGenerator generator1 = KeyGenerator.getInstance("AES");
        generator1.init(new SecureRandom());
        SecretKey key = generator1.generateKey();
        byte[] bytes1 = cipher.wrap(key);
        String str = "IU loves Dage!";
        byte[] bytes = new byte[128];
        cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        cipher.update(str.getBytes(), 0, str.getBytes().length, bytes);


        Cipher cipher1 = Cipher.getInstance("RSA");
        cipher1.init(Cipher.UNWRAP_MODE, keyPair.getPrivate());
        Key key1 = cipher1.unwrap(bytes1, "AES", Cipher.SECRET_KEY);
        cipher1 = Cipher.getInstance("AES");
        cipher1.init(Cipher.DECRYPT_MODE, key1);
        byte[] bytes2 = new byte[130];
        cipher1.update(bytes, 0, bytes.length, bytes2);
        System.out.println(new String(bytes2));


    }


}
