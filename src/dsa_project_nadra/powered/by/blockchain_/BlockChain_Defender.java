
package dsa_project_nadra.powered.by.blockchain_;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class BlockChain_Defender extends Database{
    /*public  String previousHash;
  public  String trans1_Hash, trans2_Hash, trans3_Hash, trans4_Hash, trans5_Hash,trans6_Hash;

public    String[] question = {"Name:", "Father Name:", "Gender:", "City:", "District:","Date of Birth:", "Country:", "Date of Issued:","Date of Expiry:", "NIC:"};
  public  String[] answer = new String[question.length];

    Scanner sc = new Scanner(System.in);
    
    List<Block> blockChainList = new ArrayList<>();
  
    public void transction1() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        List<String> transactions1 = new ArrayList<>();
        queuu_arr user1 = new queuu_arr(question.length);
        System.out.println("Enter User 1 details.");
        for (int i = 0; i < question.length-3; i++) {
            System.out.println(question[i]);
            answer[i] = sc.next();
            user1.insert(answer[i]);
            transactions1.add(answer[i]);
        }
       
         String DOI1=DOI();
        System.out.println(question[question.length-3]);
        System.out.println(DOI1);
            answer[question.length-3] = DOI1;
            user1.insert(answer[question.length-3]);
            transactions1.add(answer[question.length-3]); 
      
       
         String DOE1=DOE();
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
            
            
            user1.display();
         System.out.println("Now hashing the details of user 1:");
        MerkleTree merkleTree1 = new MerkleTree(transactions1);
        System.out.println(merkleTree1.getMerkleRoot().get(0));
      trans1_Hash=merkleTree1.getMerkleRoot().get(0);
      Block gensis = new Block("Gensis",null,trans1_Hash);
      blockChainList.add(gensis);
    }

  public void transction2() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        List<String> transactions2 = new ArrayList<>();
        queuu_arr user2 = new queuu_arr(question.length);
        System.out.println("Enter User 2 details.");
        for (int i = 0; i < question.length-3; i++) {
            System.out.println(question[i]);
            answer[i] = sc.next();
            user2.insert(answer[i]);
            transactions2.add(answer[i]);
        }
       
         String DOI2=DOI();
        System.out.println(question[question.length-3]);
        System.out.println(DOI2);
            answer[question.length-3] = DOI2;
            user2.insert(answer[question.length-3]);
            transactions2.add(answer[question.length-3]); 
      
       
         String DOE2=DOE();
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
            
            
            user2.display();
         System.out.println("Now hashing the details of user 2:");
        MerkleTree merkleTree2 = new MerkleTree(transactions2);
        System.out.println(merkleTree2.getMerkleRoot().get(0));
      trans2_Hash=merkleTree2.getMerkleRoot().get(0);
      Block trans2 = new Block("Block2",trans1_Hash,trans2_Hash);
      blockChainList.add(trans2);
      
    }

  public void transction3() throws NoSuchAlgorithmException, UnsupportedEncodingException {
       
    String[] answer = {"Elliott Francis Joseph", "Anthony Jospeh","M","Karachi","South","21/07/2000","Pakistan",null,null,null};
      
        List<String> transactions3 = new ArrayList<>();
        queuu_arr user3 = new queuu_arr(question.length);
        System.out.println("User 3 details already in system.");
        for (int i = 0; i < question.length-3; i++) {
           
            user3.insert(answer[i]);
            transactions3.add(answer[i]);
        }
       
         String DOI3=DOI();
            answer[question.length-3] = DOI3;
            user3.insert(answer[question.length-3]);
            transactions3.add(answer[question.length-3]); 
      
       
         String DOE3=DOE();
            answer[question.length-2] = DOE3;
            user3.insert(answer[question.length-2]);
            transactions3.add(answer[question.length-2]);    
            
             String NIC3=NIC();
            answer[question.length-1] = NIC3;
            user3.insert(answer[question.length-1]);
            transactions3.add(answer[question.length-1]);
            
            
            user3.display();
         System.out.println("Now hashing the details of user 3:");
        MerkleTree merkleTree3 = new MerkleTree(transactions3);
        System.out.println(merkleTree3.getMerkleRoot().get(0));
      trans3_Hash=merkleTree3.getMerkleRoot().get(0);
      Block trans3 = new Block("Block3",trans2_Hash,trans3_Hash);
      blockChainList.add(trans3);
      
    }

    
  public void transction4() throws NoSuchAlgorithmException, UnsupportedEncodingException {
       
    String[] answer = {"Syed Hurrar Hassan Rizvi", "Syed Hassan Rizvi","M","Karachi","North","23/07/2000","Pakistan",null,null,null};
      
        List<String> transactions4 = new ArrayList<>();
        queuu_arr user4 = new queuu_arr(question.length);
        System.out.println("User 4 details already in system.");
        for (int i = 0; i < question.length-3; i++) {
            user4.insert(answer[i]);
            transactions4.add(answer[i]);
        }
       
         String DOI4=DOI();
            answer[question.length-3] = DOI4;
            user4.insert(answer[question.length-3]);
            transactions4.add(answer[question.length-3]); 
      
       
         String DOE4=DOE();
            answer[question.length-2] = DOE4;
            user4.insert(answer[question.length-2]);
            transactions4.add(answer[question.length-2]);    
            
             String NIC4=NIC();
            answer[question.length-1] = NIC4;
            user4.insert(answer[question.length-1]);
            transactions4.add(answer[question.length-1]);
            
            
            user4.display();
         System.out.println("Now hashing the details of user 4:");
        MerkleTree merkleTree4 = new MerkleTree(transactions4);
        System.out.println(merkleTree4.getMerkleRoot().get(0));
      trans4_Hash=merkleTree4.getMerkleRoot().get(0);
      Block trans4 = new Block("Block4",trans3_Hash,trans4_Hash);
      blockChainList.add(trans4);
      
    }   
    
     public void transction5() throws NoSuchAlgorithmException, UnsupportedEncodingException {
       
    String[] answer = {"Muhammad Usama Fasial", "Fasial","M","Karachi","South","14/02/1998","Pakistan",null,null,null};
      
        List<String> transactions5 = new ArrayList<>();
        queuu_arr user5 = new queuu_arr(question.length);
        System.out.println("User 5 details already in system.");
        for (int i = 0; i < question.length-3; i++) {
            user5.insert(answer[i]);
            transactions5.add(answer[i]);
        }
       
         String DOI5=DOI();
            answer[question.length-3] = DOI5;
            user5.insert(answer[question.length-3]);
            transactions5.add(answer[question.length-3]); 
      
       
         String DOE5=DOE();
            answer[question.length-2] = DOE5;
            user5.insert(answer[question.length-2]);
            transactions5.add(answer[question.length-2]);    
            
             String NIC5=NIC();
            answer[question.length-1] = NIC5;
            user5.insert(answer[question.length-1]);
            transactions5.add(answer[question.length-1]);
            
            
            user5.display();
         System.out.println("Now hashing the details of user 5:");
        MerkleTree merkleTree5 = new MerkleTree(transactions5);
        System.out.println(merkleTree5.getMerkleRoot().get(0));
      trans5_Hash=merkleTree5.getMerkleRoot().get(0);
      Block trans5 = new Block("Block5",trans4_Hash,trans5_Hash);
      blockChainList.add(trans5);
      
    }   
    
    @Override
  public void transction6() throws NoSuchAlgorithmException, UnsupportedEncodingException {
       
    String[] answer = {"Malik Rafaqat", "Azeem Sheikh Kashmiri","M","Karachi","North","06/09/2000","Pakistan",null,null,null};
      
        List<String> transactions6 = new ArrayList<>();
        queuu_arr user6 = new queuu_arr(question.length);
        System.out.println("User 6 details already in system.");
        for (int i = 0; i < question.length-3; i++) {
            user6.insert(answer[i]);
            transactions6.add(answer[i]);
        }
       
         String DOI6=DOI();
            answer[question.length-3] = DOI6;
            user6.insert(answer[question.length-3]);
            transactions6.add(answer[question.length-3]); 
      
       
         String DOE6=DOE();
            answer[question.length-2] = DOE6;
            user6.insert(answer[question.length-2]);
            transactions6.add(answer[question.length-2]);    
            
             String NIC6=NIC();
            answer[question.length-1] = NIC6;
            user6.insert(answer[question.length-1]);
            transactions6.add(answer[question.length-1]);
            
            
            user6.display();
         System.out.println("Now hashing the details of user 6:");
        MerkleTree merkleTree6 = new MerkleTree(transactions6);
        System.out.println(merkleTree6.getMerkleRoot().get(0));
      trans6_Hash=merkleTree6.getMerkleRoot().get(0);
      Block trans6 = new Block("Block6",trans5_Hash,trans6_Hash);
      blockChainList.add(trans6);
      
    }       
     
    public void validation()
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

public String DOI()
{
  SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
Calendar cal=Calendar.getInstance();
  
  cal.add(Calendar.YEAR, 0);
  
return ""+df.format(cal.getTime());    
}

public String DOE()
{
  SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
Calendar cal=Calendar.getInstance();
  
  cal.add(Calendar.YEAR, 5);
  
return ""+df.format(cal.getTime());    
}
*/





}       

