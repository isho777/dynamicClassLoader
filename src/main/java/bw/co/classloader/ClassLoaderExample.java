/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bw.co.classloader;
import java.util.*;
/**
 *
 * @author Ishmael
 */
public class ClassLoaderExample {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{                                    
        ClassLoader clsLoader = ClassLoader.getSystemClassLoader();
        Class cls = clsLoader.loadClass("bw.co.classloader.Lion");  
        Object obj  = cls.newInstance();
        ((Lion)obj).run();
    }
}
