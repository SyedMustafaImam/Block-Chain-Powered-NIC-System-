/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa_project_nadra.powered.by.blockchain_;


import lombok.Getter;
import lombok.ToString;
import java.util.Arrays;
@Getter
@ToString


public class Block {
    private String previousHash;
    private String currentHash;
    private String data;
    
    public Block(String data, String previousHash, String currentHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.currentHash = currentHash;
        // Mix the content of this block with previous hash to create the hash of this new block
        // and that's what makes it block chain
      
    }
}