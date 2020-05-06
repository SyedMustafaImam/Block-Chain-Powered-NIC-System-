package dsa_project_nadra.powered.by.blockchain_;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.Calendar;
import java.text.SimpleDateFormat;
public class Database {

  public  String previousHash;
  public  String trans1_Hash, trans2_Hash, trans3_Hash, trans4_Hash, trans5_Hash,trans6_Hash;
  
  public String time1,time2,time3,time4,time5,time6;
   public String time7,time8,time9,time10,time11,time12;
  public    String[] question = {"Name:", "Father Name:", "Gender:", "City:", "District:","Date of Birth:", "Country:", "Date of Issued:","Date of Expiry:", "NIC:"};
  public  String[] answer = new String[question.length];
  public String[] name =new String[6];
  
   static BlockChain_Defender bd = new BlockChain_Defender();
  
    Scanner sc = new Scanner(System.in);
    
    Ledger LegWrite = new Ledger();
    
    List<Block> blockChainList = new ArrayList<>();
  
     queuu_arr user1 = new queuu_arr(question.length);
     queuu_arr user2 = new queuu_arr(question.length);    
     queuu_arr user3 = new queuu_arr(question.length);    
     queuu_arr user4 = new queuu_arr(question.length);
     queuu_arr user5 = new queuu_arr(question.length);
     queuu_arr user6 = new queuu_arr(question.length);
     
     public void transction1() throws NoSuchAlgorithmException, UnsupportedEncodingException, FileNotFoundException {
         
         List<String> transactions1 = new ArrayList<>();
    
        System.out.println("Enter User 1 details.");
        for (int i = 0; i < question.length-3; i++) {
            System.out.println(question[i]);
            answer[i] = sc.next();
            user1.insert(answer[i]);
            transactions1.add(answer[i]);
        }
       
         String DOI1=DOI(0);
        System.out.println(question[question.length-3]);
        System.out.println(DOI1);
            answer[question.length-3] = DOI1;
            user1.insert(answer[question.length-3]);
            transactions1.add(answer[question.length-3]); 
      time1=TIME();
      
       LegWrite.TimeWrite("Time1", time1);
       time7=add25days(25);
       LegWrite.TimeWrite("Time7", time7);
         String DOE1=DOE(0);
        System.out.println(question[question.length-2]);
        System.out.println(DOE1);
            answer[question.length-2] = DOE1;
            user1.insert(answer[question.length-2]);
            transactions1.add(answer[question.length-2]);    
            
             String NIC1=NIC();
        System.out.println(question[question.length-1]);
        System.out.println(NIC1);
            answer[question.length-1] = NIC1;
            user1.insert(answer[question.length-1]);
            transactions1.add(answer[question.length-1]);
            
           
      
        MerkleTree merkleTree1 = new MerkleTree(transactions1);
      
      trans1_Hash=merkleTree1.getMerkleRoot().get(0);
      Block gensis = new Block("Gensis",null,trans1_Hash);
      blockChainList.add(gensis);
      
      LegWrite.LedgerWrite(user1.queue,"Tansaction1");
      name[0]=user1.queue[0];
    }

  public void transction2() throws NoSuchAlgorithmException, UnsupportedEncodingException, FileNotFoundException {
        List<String> transactions2 = new ArrayList<>();
        
        System.out.println("Enter User 2 details.");
        for (int i = 0; i < question.length-3; i++) {
            System.out.println(question[i]);
            answer[i] = sc.next();
            user2.insert(answer[i]);
            transactions2.add(answer[i]);
        }
       
         String DOI2=DOI(0);
        System.out.println(question[question.length-3]);
        System.out.println(DOI2);
            answer[question.length-3] = DOI2;
            user2.insert(answer[question.length-3]);
            transactions2.add(answer[question.length-3]); 
      
       
         String DOE2=DOE(0);
        System.out.println(question[question.length-2]);
        System.out.println(DOE2);
            answer[question.length-2] = DOE2;
            user2.insert(answer[question.length-2]);
            transactions2.add(answer[question.length-2]);    
            
             String NIC2=NIC();
        System.out.println(question[question.length-1]);
        System.out.println(NIC2);
            answer[question.length-1] = NIC2;
            user2.insert(answer[question.length-1]);
            transactions2.add(answer[question.length-1]);
            
        time2=TIME();    
       LegWrite.TimeWrite("Time2", time2);
            time8=add25days(25);
       LegWrite.TimeWrite("Time8", time8);
        MerkleTree merkleTree2 = new MerkleTree(transactions2);
       
      trans2_Hash=merkleTree2.getMerkleRoot().get(0);
      Block trans2 = new Block("Block2",trans1_Hash,trans2_Hash);
      blockChainList.add(trans2);
       LegWrite.LedgerWrite(user2.queue,"Tansaction2");
       name[1]=user2.queue[0];    
  }

  public void transction3() throws NoSuchAlgorithmException, UnsupportedEncodingException, FileNotFoundException {
       
    String[] answer = {"Elliott", "Anthony","M","Karachi","South","21/07/2000","Pakistan",null,null,null};
      
        List<String> transactions3 = new ArrayList<>();
       
        for (int i = 0; i < question.length-3; i++) {
           
            user3.insert(answer[i]);
            transactions3.add(answer[i]);
        }
       
         String DOI3=DOI(1);
            answer[question.length-3] = DOI3;
            user3.insert(answer[question.length-3]);
            transactions3.add(answer[question.length-3]); 
      
       
         String DOE3=DOE(1);
            answer[question.length-2] = DOE3;
            user3.insert(answer[question.length-2]);
            transactions3.add(answer[question.length-2]);    
            
             String NIC3=NIC();
            answer[question.length-1] = NIC3;
            user3.insert(answer[question.length-1]);
            transactions3.add(answer[question.length-1]);
           
            time3=TIME25(); 
            
         LegWrite.TimeWrite("Time3", time3);
            time9=add25days(26);
       LegWrite.TimeWrite("Time9", time9);
        MerkleTree merkleTree3 = new MerkleTree(transactions3);
     
      trans3_Hash=merkleTree3.getMerkleRoot().get(0);
      Block trans3 = new Block("Block3",trans2_Hash,trans3_Hash);
      blockChainList.add(trans3);
       LegWrite.LedgerWrite(user3.queue,"Tansaction3");   
   
        name[2]=user3.queue[0]; 
  
  }

    
  public void transction4() throws NoSuchAlgorithmException, UnsupportedEncodingException, FileNotFoundException {
       
    String[] answer = {"Hurrar", "Hassan","M","Karachi","North","23/07/2000","Pakistan",null,null,null};
      
        List<String> transactions4 = new ArrayList<>();
       
        for (int i = 0; i < question.length-3; i++) {
            user4.insert(answer[i]);
            transactions4.add(answer[i]);
        }
       
         String DOI4=DOI(2);
            answer[question.length-3] = DOI4;
            user4.insert(answer[question.length-3]);
            transactions4.add(answer[question.length-3]); 
      
          time4=TIME50();   
LegWrite.TimeWrite("Time4", time4);
  time10=add25days(27);
       LegWrite.TimeWrite("Time10", time10);         

String DOE4=DOE(2);
            answer[question.length-2] = DOE4;
            user4.insert(answer[question.length-2]);
            transactions4.add(answer[question.length-2]);    
            
             String NIC4=NIC();
            answer[question.length-1] = NIC4;
            user4.insert(answer[question.length-1]);
            transactions4.add(answer[question.length-1]);
            
            
            
        
        MerkleTree merkleTree4 = new MerkleTree(transactions4);
        
      trans4_Hash=merkleTree4.getMerkleRoot().get(0);
      Block trans4 = new Block("Block4",trans3_Hash,trans4_Hash);
      blockChainList.add(trans4);
         
      LegWrite.LedgerWrite(user4.queue,"Tansaction4");
   
      name[3]=user4.queue[0];
  }   
    
     public void transction5() throws NoSuchAlgorithmException, UnsupportedEncodingException, FileNotFoundException {
       
    String[] answer = {"Usama", "Fasial","M","Karachi","South","14/02/1998","Pakistan",null,null,null};
      
        List<String> transactions5 = new ArrayList<>();

        for (int i = 0; i < question.length-3; i++) {
            user5.insert(answer[i]);
            transactions5.add(answer[i]);
        }
       
         String DOI5=DOI(3);
            answer[question.length-3] = DOI5;
            user5.insert(answer[question.length-3]);
            transactions5.add(answer[question.length-3]); 
      
         time5=TIME75();    
       LegWrite.TimeWrite("Time5", time5);
         time11=add25days(28);
       LegWrite.TimeWrite("Time11", time11);  
       
       String DOE5=DOE(3);
            answer[question.length-2] = DOE5;
            user5.insert(answer[question.length-2]);
            transactions5.add(answer[question.length-2]);    
            
             String NIC5=NIC();
            answer[question.length-1] = NIC5;
            user5.insert(answer[question.length-1]);
            transactions5.add(answer[question.length-1]);
            
           
         
        MerkleTree merkleTree5 = new MerkleTree(transactions5);
        
      trans5_Hash=merkleTree5.getMerkleRoot().get(0);
      Block trans5 = new Block("Block5",trans4_Hash,trans5_Hash);
      blockChainList.add(trans5);
  
      LegWrite.LedgerWrite(user5.queue,"Tansaction5");
      
      name[4]=user5.queue[0];
     }   
    
  public void transction6() throws NoSuchAlgorithmException, UnsupportedEncodingException, FileNotFoundException {
       
    String[] answer = {"Malik", "Azeem","M","Karachi","North","06/09/2000","Pakistan",null,null,null};
      
        List<String> transactions6 = new ArrayList<>();
      
        for (int i = 0; i < question.length-3; i++) {
            user6.insert(answer[i]);
            transactions6.add(answer[i]);
        }
       
         String DOI6=DOI(4);
            answer[question.length-3] = DOI6;
            user6.insert(answer[question.length-3]);
            transactions6.add(answer[question.length-3]); 
      
       time6=TIME100(); 
            LegWrite.TimeWrite("Time6", time6);
         time12=add25days(29);
       LegWrite.TimeWrite("Time12", time12); 
            
            String DOE6=DOE(4);
            answer[question.length-2] = DOE6;
            user6.insert(answer[question.length-2]);
            transactions6.add(answer[question.length-2]);    
            
             String NIC6=NIC();
            answer[question.length-1] = NIC6;
            user6.insert(answer[question.length-1]);
            transactions6.add(answer[question.length-1]);
           
        
        MerkleTree merkleTree6 = new MerkleTree(transactions6);
        
      trans6_Hash=merkleTree6.getMerkleRoot().get(0);
      Block trans6 = new Block("Block6",trans5_Hash,trans6_Hash);
      blockChainList.add(trans6);
      LegWrite.LedgerWrite(user6.queue,"Tansaction6");
    
      name[5]=user6.queue[0];
  }       
     
    public void validation()
    {
     
        if((blockChainList.get(0).getCurrentHash().equals(blockChainList.get(1).getPreviousHash()))
            &&  (blockChainList.get(1).getCurrentHash().equals(blockChainList.get(2).getPreviousHash()))
            &&  (blockChainList.get(2).getCurrentHash().equals(blockChainList.get(3).getPreviousHash()))
            &&  (blockChainList.get(3).getCurrentHash().equals(blockChainList.get(4).getPreviousHash()))
            &&  (blockChainList.get(4).getCurrentHash().equals(blockChainList.get(5).getPreviousHash())))
        {
             System.out.println("Gensis-Block - PreviousHash: 0 - CurrentHash:"+trans1_Hash);
            System.out.println("Block2 - PreviousHash:" +trans1_Hash+ "- CurrentHash:"+trans2_Hash);
             System.out.println("Block3 - PreviousHash:" +trans2_Hash+ "- CurrentHash:"+trans3_Hash);
              System.out.println("Block4 - PreviousHash:" +trans3_Hash+ "- CurrentHash:"+trans4_Hash);
               System.out.println("Block5 - PreviousHash:" +trans4_Hash+ "- CurrentHash:"+trans5_Hash);
                System.out.println("Block6 - PreviousHash:" +trans5_Hash+ "- CurrentHash:"+trans6_Hash);
           
                menu me = new menu();
                
                me.delay("validating block chain" , 1000);
                System.out.println("!-------BlockChain is Valid-------!");
        } 
        else{
         System.out.println("Its not valid");
        }
    
    }
    
 public String NIC()
        
{
int number1 = (int)(Math.random() * 100);
int part1=4859-number1-198;

int number2 = (int)(Math.random() * 10000);
int part2=8563241-number2-19*number1;

int part3 = (int)(Math.random() * 9);

   return part1+"-"+part2+"-"+part3 ;
}

public String DOI(int h)
{
  SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
Calendar cal=Calendar.getInstance();
  
  cal.add(Calendar.DATE, h);
  
return ""+df.format(cal.getTime());    
}

public String DOE(int mkh)
{
  SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
Calendar cal=Calendar.getInstance();
  cal.add(Calendar.DATE, mkh);
  cal.add(Calendar.YEAR, 5);
  
return ""+df.format(cal.getTime());    
}
public String TIME()
{
  SimpleDateFormat df = new SimpleDateFormat("EEEEE, dd-MMMMM-yyyy, hh:mm:ss a");
Calendar cal=Calendar.getInstance();
  
  cal.add(Calendar.MINUTE, 0);
  
return ""+df.format(cal.getTime());    
}

public String TIME25()
{
  SimpleDateFormat df = new SimpleDateFormat("EEEEE, dd-MMMMM-yyyy, hh:mm:ss a");
Calendar cal=Calendar.getInstance();
  
  cal.add(Calendar.MINUTE, 80);
  cal.add(Calendar.DATE, 1);
return ""+df.format(cal.getTime());    
}

public String TIME50()
{
  SimpleDateFormat df = new SimpleDateFormat("EEEEE, dd-MMMMM-yyyy, hh:mm:ss a");
Calendar cal=Calendar.getInstance();
  
  cal.add(Calendar.MINUTE, 160);
  cal.add(Calendar.DATE, 2);
return ""+df.format(cal.getTime());    
}


public String TIME75()
{
SimpleDateFormat df = new SimpleDateFormat("EEEEE, dd-MMMMM-yyyy, hh:mm:ss a");
Calendar cal=Calendar.getInstance();
  
 cal.add(Calendar.MINUTE, 240);
  cal.add(Calendar.DATE, 3);
  
return ""+df.format(cal.getTime());    
}

public String TIME100()
{
 SimpleDateFormat df = new SimpleDateFormat("EEEEE, dd-MMMMM-yyyy, hh:mm:ss a");
Calendar cal=Calendar.getInstance();
  
   cal.add(Calendar.MINUTE, 360);
  cal.add(Calendar.DATE, 4);
  
  
return ""+df.format(cal.getTime());    
}


public void test() throws NoSuchAlgorithmException, UnsupportedEncodingException, FileNotFoundException

{
/*transction1();
transction2();
transction3();
transction4();
transction5();
transction6();*/

    LegWrite.LedgerRead("Tansaction1",0);
/*user1.display();*/

/*user2.display();*/
 LegWrite.LedgerRead("Tansaction2",1);

/*user3.display();*/
 LegWrite.LedgerRead("Tansaction3",2);

/*user4.display();*/
 LegWrite.LedgerRead("Tansaction4",3);

/*user5.display();*/
 LegWrite.LedgerRead("Tansaction5",4);

/*user6.display();*/
 LegWrite.LedgerRead("Tansaction6",5);
}
 

public void corruption()
    {
     
        if((blockChainList.get(0).getCurrentHash().equals(blockChainList.get(1).getPreviousHash()))
            &&  (blockChainList.get(1).getCurrentHash().equals(blockChainList.get(3).getPreviousHash()))
            &&  (blockChainList.get(2).getCurrentHash().equals(blockChainList.get(3).getPreviousHash()))
            &&  (blockChainList.get(3).getCurrentHash().equals(blockChainList.get(4).getPreviousHash()))
            &&  (blockChainList.get(4).getCurrentHash().equals(blockChainList.get(5).getPreviousHash())))
        {
            System.out.println("It valid");
        } 
        else{
            
            
            System.out.println("Gensis-Block - PreviousHash: 0 - CurrentHash:"+trans1_Hash);
            System.out.println("Block2 - PreviousHash:" +trans1_Hash+ "- CurrentHash:"+trans2_Hash);
             System.out.println("Block3 - PreviousHash:" +trans2_Hash+ "- CurrentHash:"+trans3_Hash);
              System.out.println("Block4 - PreviousHash:" +"d6acce727dbdc77ba68485m184e65c85af27fa649b"+ "- CurrentHash:"+trans4_Hash);
               System.out.println("Block5 - PreviousHash:" +trans4_Hash+ "- CurrentHash:"+trans5_Hash);
                System.out.println("Block6 - PreviousHash:" +trans5_Hash+ "- CurrentHash:"+trans6_Hash);
            
            
            menu me = new menu();
                
                me.delay("validating block chain" , 1000);
                System.out.println("\n\nXXX-------BlockChain is Not Valid-------XXX");
                System.out.println("XXX---Some Data Have Been Manipulated---XXX");
        }
    }

public void searching(String key)
{
   boolean  flag = false;
   
   
for(int i=0;i<user1.queue.length;i++)
{
if(key.equalsIgnoreCase(user1.queue[i]))
{
    user1.display();
    flag = true;
break;
}


}


for(int i=0;i<user2.queue.length;i++)
{
if(key.equalsIgnoreCase(user2.queue[i]))
{
    user2.display();
       flag = true;
break;
}

}



for(int i=0;i<user3.queue.length;i++)
{
if(key.equalsIgnoreCase(user3.queue[i]))
{
    user3.display();
       flag = true;
break;
}

}


for(int i=0;i<user4.queue.length;i++)
{
if(key.equalsIgnoreCase(user4.queue[i]))
{
    user4.display();
       flag = true;
break;
}

}


for(int i=0;i<user5.queue.length;i++)
{
if(key.equalsIgnoreCase(user5.queue[i]))
{
    user5.display();
       flag = true;
break;
}

}


for(int i=0;i<user6.queue.length;i++)
{
if(key.equalsIgnoreCase(user6.queue[i]))
{
    user6.display();
       flag = true;
break;
}

}

    if (flag== false) {
        System.out.println("XXXX DATA NOT FOUND XXXX");
    }

}
public void sorting(String[] arr24)
        
{
    String temp;
for(int i =0;i<arr24.length;i++)
{
for(int j =i+1;j<arr24.length;j++)
    
{
if(name[i].compareTo(name[j])>0)
{
     temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
}



}
}

for(int k=0;k<name.length;k++)
{
searching(name[k]);

}

}

public void CLRqueue()
        
{
for(int i=0;i<question.length;i++)
{
user1.remove();
user2.remove();
user3.remove();
user4.remove();
user5.remove();
user6.remove();

}

}


public void SortingWTRTIME() throws NoSuchAlgorithmException, UnsupportedEncodingException, FileNotFoundException

{

for(int m=6;m>0;m--)
{
int n=m-1;
String Tansaction= "Tansaction"; 
String mm=Integer.toString(m);
String Tansactionpass= Tansaction.concat(mm);
 LegWrite.LedgerRead(Tansactionpass,n);

}


}
    public String add25days(int k)
{
SimpleDateFormat df = new SimpleDateFormat("EEEEE, dd-MMMMM-yyyy");
Calendar cal=Calendar.getInstance();
  cal.add(Calendar.DATE, k);
  
return ""+df.format(cal.getTime());  


}
}









