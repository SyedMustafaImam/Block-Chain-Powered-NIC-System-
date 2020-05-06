package dsa_project_nadra.powered.by.blockchain_;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import lombok.Data;

public class Ledger {
    static Database no =new Database();
    public    String[] question = {"Name:", "Father Name:", "Gender:", "City:", "District:","Date of Birth:", "Country:", "Date of Issued:","Date of Expiry:", "NIC:"};
    public String[] NIC=new String [6];
     public String[] DOI=new String [6];
    public String[] DOE=new String [6];
       public String[] mk= new String [6];;
    public void ledgerVerification() throws NoSuchAlgorithmException, UnsupportedEncodingException, FileNotFoundException{
   
        
        no.test();
      
        
        
        
    
    }
     public void LedgerRead(String fname,int k) throws FileNotFoundException,NullPointerException
    {
    java.io.File ledgerdatatofile =new java.io.File(fname+".txt");
     Scanner lg=new Scanner(ledgerdatatofile);
        String[] lgr =new String[10];
        while(lg.hasNext()){
           
                
             lgr[0]= lg.next();
             lgr[1]= lg.next();
             lgr[2]= lg.next();
             lgr[3]= lg.next();
             lgr[4]= lg.next();
             lgr[5]= lg.next();
             lgr[6]= lg.next();
             lgr[7]= lg.next();
             lgr[8]= lg.next();
             lgr[9]= lg.next();
              NIC[k]=lgr[9];
             
         
        
        }
        
    
        lg.close();
          
        display(lgr,k);
    }
    public void LedgerWrite(String[] ledger, String fname) throws FileNotFoundException{
        java.io.File ledgerdata=new java.io.File(fname+".txt");
        try(java.io.PrintWriter output1=new java.io.PrintWriter(ledgerdata)){
            int i;
            for(int o =0;o<ledger.length;o++)
            {
            output1.println(ledger[o]);
            }
                output1.close();
        }
    }
    
public void display(String queue[],int p) throws NullPointerException, FileNotFoundException
{
  int q=p+1;
   String save =Integer.toString(q);
   String timename="Time";
   String TIME=timename.concat(save);

   System.out.println("");
    System.out.println("");
    System.out.println("____________________________________________________________________________________________________________________________");
    System.out.println("Ledger creation at:"+  "\t\t\t\t\t\t\t"  );
    TimeRead(TIME);
            System.out.println("");              
    
    System.out.println("------------------------------------- ID:"+queue[9]+" Block Data ----------------------------------------------------- ");
    
  for(int i=0;i<queue.length;i=i+2) 
  {
      int j=i+1;
      System.out.println(question[i]+ " "+queue[i]+" " +"\t\t\t\t"+question[j]+ " "+queue[j]);
      System.out.println();
  }

System.out.println("-------------------------------------------------------------------------------------------------------------------------- ");
}  
 public void TimeRead(String fname) throws FileNotFoundException,NullPointerException
    {
    java.io.File thp=new java.io.File(fname+".txt");
    String time;
        try (Scanner tm = new Scanner(thp)) {
            time = null;
            while(tm.hasNext()){
                
                
                time= tm.next();
                System.out.print(time);
            }
        }
    
    }
    public void TimeWrite(String fname, String time) throws FileNotFoundException{
        java.io.File tmobj=new java.io.File(fname+".txt");
        try(java.io.PrintWriter output1=new java.io.PrintWriter(tmobj)){
           
            output1.println(time);
           
                output1.close();
        }
    }



   public void LedgerReadDateData(String fname,int k) throws FileNotFoundException,NullPointerException
    {
            String[] lgr =new String[10];
    java.io.File ledgerdatatofile =new java.io.File(fname+".txt");
     Scanner lg=new Scanner(ledgerdatatofile);
    
        while(lg.hasNext()){
           
                
             lgr[0]= lg.next();
             lgr[1]= lg.next();
             lgr[2]= lg.next();
             lgr[3]= lg.next();
             lgr[4]= lg.next();
             lgr[5]= lg.next();
             lgr[6]= lg.next();
             lgr[7]= lg.next();
             lgr[8]= lg.next();
             lgr[9]= lg.next();
              NIC[k]=lgr[9];
              DOE[k]=lgr[0];
              DOI[k]=lgr[7];         
        
        }
        
    
        lg.close();
      DODRECORDSWORKING(NIC,DOE,DOI,k);
          
    }
     
     public String TimeReadDOD(String fname) throws FileNotFoundException,NullPointerException
    {
        String time;
    java.io.File thp=new java.io.File(fname+".txt");
    
        try (Scanner tm = new Scanner(thp)) {
            time = null;
            while(tm.hasNext()){
                
                
                time= tm.next();
                
               
             
            }
        }
    return time;
    }
    
public void  DODRECORDSWORKING(String []NIC,String[]DOE,String[] DOI,int r) throws FileNotFoundException
{   
   

    
    int j=r+1;

     int q=6+j;
   String save =Integer.toString(q);
   String timename="Time";
   String TIME=timename.concat(save);
   this.mk[r]=TimeReadDOD(TIME);
  
    System.out.println("|\t"       +      j +"     |\t"+"   "+NIC[r]+"\t|\t\b   "+mk[r]+""+""+""+"  |\t"+"  "+"  "+""+""+""+  DOI[r]         +"   |\t"+""+DOE[r]+"   "+"|");


}
public void  DODRECORDS() throws FileNotFoundException
{
    System.out.println("              XXXXXXX          NIC DELIEVERY DATE DATA               XXXXXXX     ");
 System.out.println("-------------------------------------------------------------------------------------------------------");
 System.out.println("|     User    |\t     \b     NIC     \t|    \bDate of Delivery  |    Date of Issue |      Name     |  " );
LedgerReadDateData("Tansaction1", 0);
LedgerReadDateData("Tansaction2", 1);
LedgerReadDateData("Tansaction3", 2);
LedgerReadDateData("Tansaction4", 3);
LedgerReadDateData("Tansaction5", 4);
LedgerReadDateData("Tansaction6", 5);
System.out.println("-------------------------------------------------------------------------------------------------------");
    }



}
