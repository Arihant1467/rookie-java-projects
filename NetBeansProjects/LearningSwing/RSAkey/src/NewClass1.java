
import java.io.File;
import java.io.FileInputStream;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import javax.crypto.Cipher;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class NewClass1 
{
    public static void main(String[] args) 
    {
        try
        {
          File file=new File("encrypt_data.data");
          FileInputStream fis=new FileInputStream("encrypted_data.data"); 
          byte[]a =new byte[(int)file.length()];
          fis.read(a);
          file=new File("private_key.der");
          fis=new FileInputStream(file);
          byte[] as=new byte[(int)file.length()];
          fis.read(as);
          KeyFactory kf=KeyFactory.getInstance("RSA");
          PrivateKey pk=kf.generatePrivate(new PKCS8EncodedKeySpec(as));
          Cipher cipher=Cipher.getInstance("RSA");
          cipher.init(Cipher.DECRYPT_MODE,pk);;
          as=cipher.doFinal(as);
          System.out.println(new String(as,"UTF8"));
          
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
