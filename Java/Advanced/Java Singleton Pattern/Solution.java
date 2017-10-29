import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
    public static String str;
    private static Singleton instance;
    private Singleton()
    {
        
    }
    static Singleton getSingleInstance(){
        if(instance==null){
            synchronized(Singleton.class)
            { if(instance==null)
                    instance =  new Singleton();
            }
        } 
        return instance;
    }
        

}
