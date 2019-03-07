import java.io.*;
import java.util.Properties;

public class Jar {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("name","jack");
        properties.setProperty("age","17");

        System.out.println(properties.getProperty("age"));

        OutputStream out = new FileOutputStream("my.properties");
        properties.store(out,"This is a comment");

        //假设事先已经存在一个文件，如db.properties,
        Properties db = new Properties();
        db.load(new FileInputStream("db.properties"));
        //db.forEach((k,v)->System.out.println(k+"="+v));
        for(Object key : db.keySet()){
            System.out.println(key +"="+db.getProperty((String)key));
        }
    }
}
