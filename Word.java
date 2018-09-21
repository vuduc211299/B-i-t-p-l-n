/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author VŨ ĐỨC
 */
public class Word {
    private String word_target;  
    private String word_explain;
    
    // Constructor
    public Word(String word_target, String word_explain){
    	this.word_target = word_target;
    	this.word_explain = word_explain;
    }
    
    // set value word_target
    public void setWordTarget(String word_target){this.word_target = word_target;}
    // set value for word_explain
    public void setWordExplain(String word_explain) {this.word_explain = word_explain;}
    
    // getter 
    public String getWordTarget(){return word_target;}
    public String getWordExplain(){return word_explain;}
}
