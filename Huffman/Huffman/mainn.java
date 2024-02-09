package Huffman;

import java.io.*;
import java.util.*;

public class mainn {
    public static  void main ( String [] args){
   huffman hm = new huffman();

   String lines = "";
{
   try {
    File myObj = new File("C:\\Users\\Leo\\Desktop\\cyka.txt");
    Scanner myReader = new Scanner(myObj);
    while (myReader.hasNextLine()) {
      String data = myReader.nextLine();
      System.out.println(data);
      lines += data;
    }
    myReader.close();
  } catch (FileNotFoundException e) {
    System.out.println("An error occurred.");
    e.printStackTrace();
  }

   
   hm.updateFrequencies(lines);
   hm.createPQ();
   hm.createHuffmanTree();
   hm.calculateHuffmanCodes();
   String codes = hm.getCodes();
   String encoded = hm.getEncodedLine(lines);

   try {
    FileWriter myWriter = new FileWriter("C:\\Users\\Leo\\Desktop\\blyat.txt");
    myWriter.write(codes);

    myWriter.write(encoded);

    myWriter.close();
    System.out.println("Successfully wrote to the file.");
  } catch (IOException e) {
    System.out.println("An error occurred.");
    e.printStackTrace();
  }
}
  
}}
