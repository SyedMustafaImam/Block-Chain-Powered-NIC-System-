package dsa_project_nadra.powered.by.blockchain_;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.ArrayList;
public class MerkleTree {
   //we store the transctions in this list
 private List<String> transctions;   
public MerkleTree(List<String> transctions)
{
this.transctions=transctions;
}
//the root is in the list in the end
public List<String> getMerkleRoot() throws NoSuchAlgorithmException, UnsupportedEncodingException
{
return construct(this.transctions);
}
//It is a recurisive function that keeps merging the
//neighboring hashes (index i and i+1)
private List<String> construct(List<String> transctions) throws NoSuchAlgorithmException, UnsupportedEncodingException{
//base case for recursive method calls
if(transctions.size()==1) return transctions;

//it contains fewer and fewer items in every iteration
List<String> updateList= new ArrayList<>();

//merging the neighboring items
for(int i=0;i<transctions.size()-1;i+=2)
updateList.add(mergeHash(transctions.get(i),transctions.get(i+1)));

//if the number of transactions is odd: the last item is hashed with itself
if(transctions.size()%2==1)
updateList.add(mergeHash(transctions.get(transctions.size()-1),transctions.get(transctions.size()-1)));

//recursive method call
return construct(updateList);
}

private String mergeHash(String hash1, String hash2) throws NoSuchAlgorithmException, UnsupportedEncodingException
{
String mergeHash=hash1+hash2;
return SHA256Helper.hash(mergeHash);

}


}