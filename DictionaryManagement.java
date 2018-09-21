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
import java.io.File;
import java.util.Scanner;

public class DictionaryManagement {
    
    /*
        *function : insert word_target and explaination
        *         
    */            
    public static void insertFromCommandline(){
        
        
        Scanner scan = new Scanner(System.in);
        int numWord;
        System.out.println("Nhap vao so luong tu");
        numWord = scan.nextInt();
        for(int i = 0; i < numWord; i++){
            Word new_word = new Word(null,null);
            System.out.println("Nhap word:");
            String word_target = scan.nextLine();
            System.out.println("Nhap explain:");
            String word_explain = scan.nextLine();
            // set value for newWord
            new_word.setWordExplain(word_explain);
            new_word.setWordTarget(word_target);
           /*
            * 
            * Add newWord to List
             */
             Dictionary.wordList.add(new_word);
        }
    }

    public static void InsertFromFile() throws Exception 
    {
        // pass the path to the file
        File file =
                new File("C:\\Users\\Admin\\Downloads\\bài tập lớn OOP\\dictionaries.txt");
              Scanner sc = new Scanner(file);
              
              while (sc.hasNext()) System.out.println(sc.next());
    }
}
