/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jacobfinal;

/**
 *
 * @author WombatCleric
 */
import java.util.Iterator;
import java.util.Stack;
public class JacobFinal implements FinalProject 
{

    public JacobFinal()
    {
        
    }
    
    public void Begin()
    {
        
        String name;
        Stack<String> reverse = new Stack<String>();
        
        System.out.println("Enter your name: ");
        name = Itse2417Main.myScan.nextLine;
        
        for(int i = 0; i < name.length(); i++)
        {
            reverse.add(name.charAt(i) + "");
        }
        
        Iterator reversedName = reverse.iterator();
        while(reversedName.hasNext())
        {
            System.out.print(reversedName);
        }
        
        
    }
    
}
