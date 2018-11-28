/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datasavingtutorial;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DataSavingTutorial 
{
    public final static String PATH = "C:\\Users\\Samson\\Documents\\NetBeansProjects\\DataHandlingTutorial\\src\\";
    
    public static void saveData(ArrayList<String> data, String filePath)
    {
        try
        {
            PrintWriter writer = new PrintWriter(filePath, "UTF-8");
            for(String line: data)
            {
                writer.println(line);
            }
            writer.close();
        }
        catch (FileNotFoundException | UnsupportedEncodingException ex)
        {
            Logger.getLogger(DataSavingTutorial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) 
    {
       ArrayList<String> data = new ArrayList();
       data.add("test123");
       saveData(data, PATH + "test.txt");
    }

}
