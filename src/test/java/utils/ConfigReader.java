package utils;

import java.io.*;

import java.util.Properties;


public class ConfigReader {

    public static String readProperty(String property){
        Properties prop = null;
        try{
            FileInputStream fileInput = new FileInputStream("config.properties");
            prop = new Properties();
            prop.load(fileInput);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

        return prop.getProperty(property);
    }

}


