

package dsa_project_nadra.powered.by.blockchain_;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Password {
    boolean haslen = false;
    boolean hasNum = false;
    boolean hasCap = false;
    boolean hasLow = false;
    
    String[] pass={"A","b","c",".","1","2","3","4"};

    String[] newpass =new String [8];
    stack_array sa = new stack_array(8);
   Scanner sc = new Scanner(System.in);
String key = "adminkey";
   public void mechanism()
   {
   for(int i=0;i<sa.size;i++) 

{
 
   
        sa.push(pass[i]);
        
}
   }
   
   public void CheckPassword()
{
   
if(sa.len==0)
   
{
mechanism();
} 

System.out.println("Enter current of the system password:");
String userpass =sc.next();

if(userpass.length()==sa.getSize())
{   
  
   if(sa.arr[sa.top].equals(pass[7]) && sa.arr[sa.top-1].equals(pass[6]) &&
      sa.arr[sa.top-2].equals(pass[5]) &&sa.arr[sa.top-3].equals(pass[4]) &&
      sa.arr[sa.top-4].equals(pass[3]) &&sa.arr[sa.top-5].equals(pass[2]) &&
      sa.arr[sa.top-6].equals(pass[1]) &&sa.arr[sa.top-7].equals(pass[0])    
     )
   {
       System.out.println("XXXX Password Valid XXXX");
         System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
   }
   else{
       System.out.println("XXXXX Password Invalid  XXXXX");
     System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
   
   }

}
else{

    System.out.println("Error..........");
    System.out.println("");
     System.out.println("");
      System.out.println("");
       System.out.println(""); 
       System.out.println("");
        System.out.println("");
         System.out.println("");
    System.out.println("Please enter password.");
    CheckPassword();
}





}
public void ClrStacks()
{

for(int m =0;m<8;m++)
{
    sa.pop();
}
}

public void PasswordRest()
{
    System.out.println("Enter Admin key:");
String keytest=sc.next();
if(key.equals(keytest))
{
    System.out.println("Admin authority granted.");
    

   
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    mechanism();
    altpass();   
    
    
    
    
    
    
    
    
    




}

else{

    System.out.println("Try Again;");
    PasswordRest();

}








}

public void altpass (){

System.out.println("Password alteration proctocol ACTIVATED");
    
    
    System.out.println("KEYS RULES FOR THIS PROTOCOL:");
    System.out.println("1)Your should be of 8 CHARACTERS Password");
    System.out.println("2) At LEAST 1 UPPERCASE-CHARACTERS");
    System.out.println("3) At LEAST 1 LOWERCASE-CHARACTERS");
    System.out.println("4) At LEAST 1 Number");

    System.out.println("Enter new password(eg.[Abc.1234]):");
String np =sc.next();

if(np.length()<=newpass.length)

{
    for(int i =0;i<np.length();i++)
{
    newpass[i] = Character.toString(np.charAt(i));
   
}


  valPassword(newpass,np);
         
      checkNumPass(newpass);
      checkUpperPass(newpass);
      checkLowerPass(newpass);

if(haslen==true &&  hasCap==true  &&  hasLow==true  && hasNum==true)
{
    ClrStacks();
    
  
    
    System.out.println("Password Changed");
    
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    
} 


else {
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    
    
    altpass();
}


}

else{

    System.out.println("Your password has more 8 characters");
     System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    altpass ();
}


}
public void valPassword(String[] password,String c)
{
    if(c.length()==8)
    {
        System.out.println("Your password has 8 characters.");
         this.haslen=true;

    }
    else{
     System.out.println("Your password does not have 8 characters.");
    this.haslen=false;
    
    
    }
    
}
public void checkNumPass(String[] password)
{
String c;
for (int i=0;i<password.length;i++){
c = password[i];

if(stringContainsNumber(c))
{
this.hasNum=true;
    
}




}
if(hasNum!=true){



 System.out.println("Your password does not have number.");

}
else{

System.out.println("Your password has number.");
}

}

public void checkUpperPass(String[] password)
{
String c;
for (int i=0;i<password.length;i++){
c = password[i];


if(isUpperCase(c))
{
this.hasCap=true;
   
}



}
if(this.hasCap!=true)
{
 System.out.println("Your password does not have UpperCase.");
}

else{

 System.out.println("Your password has UpperCase.");
}


}

public void checkLowerPass(String[] password)
{
String c;
for (int i=0;i<password.length;i++){
c = password[i];

if(isStringLowerCase(c))
{
this.hasLow=true;
    
}




}
if(this.hasLow!=true)
{

 System.out.println("Your password does not have LowerCase.");
}

else{

System.out.println("Your password has LowerCase.");
}
}


public void mainpasswordmenu()
{
boolean condition =true;
do{
System.out.println("Enter 1: For access in the system.");
     
    System.out.println("Enter 2: If you want aleter the acesss rights of the system");
String choice =sc.next();


switch(choice)
{
    case "1":condition =false;SySAcess()
            ;break;
    case "2":condition =false;SySRights()
            ;break;
    default:System.out.println("Wrong choice!")
            ;break;
}
}while(condition);
}

public void SySAcess()
{
   
   CheckPassword();
}

public void SySRights()
{

PasswordRest();
mainpasswordmenu();



}
public boolean stringContainsNumber( String s )
{
    return Pattern.compile( "[0-9]" ).matcher( s ).find();
}
public static boolean isUpperCase(String s)
{
    for (int i=0; i<s.length(); i++)
    {
        if (!Character.isUpperCase(s.charAt(i)))
        {
            return false;
        }
    }
    return true;
}


  private static boolean isStringLowerCase(String str){
        
        //convert String to char array
        char[] charArray = str.toCharArray();
        
        for(int i=0; i < charArray.length; i++){
            
            //if any character is not in lower case, return false
            if( !Character.isLowerCase( charArray[i] ))
                return false;
        }
        
        return true;
 
    }


}   
    





