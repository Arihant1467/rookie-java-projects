
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class NewClass 
{
    public static void main(String[] args) throws Exception
    {
        KeyPairGenerator kpgen=KeyPairGenerator.getInstance("RSA");
        kpgen.initialize(1024);
        System.out.println("String to be decoded:"+"Hello I am arihant");
        KeyPair kp=kpgen.generateKeyPair();
        System.out.println(kpgen.getAlgorithm());
        System.out.println("Private Key"+kp.getPrivate().getEncoded().toString());
        System.out.println("Private Key"+kp.getPublic().getEncoded().toString());
        File file=new File("private_key.der");
        FileOutputStream fs=new FileOutputStream(file);
        PKCS8EncodedKeySpec pkcs=new PKCS8EncodedKeySpec(kp.getPrivate().getEncoded());
        fs.write(pkcs.getEncoded());// writing private key
        fs.close();
        file=new File("public_key.der");
        X509EncodedKeySpec x509=new X509EncodedKeySpec(kp.getPublic().getEncoded());
        fs=new FileOutputStream(file);
        fs.write(x509.getEncoded());// writing public key
        fs.close();
        Cipher cipher=Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE,kp.getPublic());
        byte [] as=cipher.doFinal("Hello I am arihant".getBytes());
        File f=new File("encrypted_data.txt");// writing in encrypted file
        fs=new FileOutputStream(f);
        fs.write(as);// writing encrypted data
        fs.close();
        System.out.println(new String(as,"UTF8"));
        f=new File("encrypted_data.data");
        fs=new FileOutputStream(f);
        fs.write(as);
        System.out.println();
//        for(byte b: as)
//        {
//            fw.write(""+b);
//        }
        cipher.init(Cipher.DECRYPT_MODE,kp.getPrivate());
        byte[] a=cipher.doFinal(as);
        System.out.println("");
        System.out.println("Decrypting the text:\t"+new String(a,"UTF8"));
        f=new File("decrypted_data.data");// writing decrypted data
        fs=new FileOutputStream(f);
        fs.write(a);// writing decrypted data
        fs.close();
        f=new File("decrypted_string.txt");
        FileWriter fw=new FileWriter(f);
        fw.write(new String(a,"UTF8"));        
        fw.close();
        
    }
   
}
