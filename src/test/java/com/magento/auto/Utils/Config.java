package com.magento.auto.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Config {

    static File file = new File(System.getProperty("user.dir") + "/src/test/resources/TestData/dataFile.properties");
    public static Properties prop = new Properties();
    public  static FileInputStream fileInput = null;
    public static String url;
    public static String username;
    public static String password;

    public static void loadData() {
        try {
            fileInput = new FileInputStream(file);
            prop.load(fileInput);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void getConfigData() {
        url = prop.getProperty("url");
        username = prop.getProperty("username");
        password = prop.getProperty("password");
    }
}
