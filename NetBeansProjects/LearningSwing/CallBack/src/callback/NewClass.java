/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package callback;
public class NewClass 
{
    String a;
    Name n;
    public NewClass(String a)
    {
        this.a=a;
        
    }
    public void implementCallback(String s)
    {
        n.showName(s);
    }
}
