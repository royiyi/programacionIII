/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.archivosnio;

import java.nio.file.Files;
import static java.nio.file.Files.deleteIfExists;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

import java.util.Scanner;


/**
 * Crear un directorio, añadir un archivo al directorio y añadir contenido al
 * archivo
 *
 * @author Miriam Lopez
 */
public class OperacionesArchivo {

    public void crearDirectorio() {
        Path path = Paths.get("E:\\programacionIII");
        try {
            if (!Files.exists(path)) {
                Files.createDirectory(path);
                System.out.println("directorio creado");
            } else {
                System.out.println("Ya existe el directorio");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void crearArchivo() {
        Path path = Paths.get("E:\\programacionIII\\miArchivo.txt");
        try {
            if (!Files.exists(path)) {
                Files.createFile(path);
                System.out.println("Archivo creado");
            } else {
                System.out.println("El archivo ya existe");
               // agregando contenido al archivo creado anteriormente
              //  Files.write(path, "Creando archivo con Java8".getBytes(), StandardOpenOption.APPEND);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public void agregarContenido(){
        Path path = Paths.get("E:\\programacionIII\\miArchivo.txt");
        String texto,res;
        Scanner leer=new Scanner(System.in);
        try {
            System.out.println("Desea agregar contenido al archivo s/n?");
            res=leer.nextLine();
            while(res.equalsIgnoreCase("s")){
                texto=leer.nextLine();
                texto=texto+"\n";
                Files.write(path, texto.getBytes(), StandardOpenOption.APPEND);
                System.out.println("Desea seguir agregando contenido s/n?");
                res=leer.nextLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void mostrarContenido(){
        Path path = Paths.get("E:\\programacionIII\\miArchivo.txt");
        try {
            List<String> lineasArchivo=Files.readAllLines(path);
            System.out.println("----- CONTENIDO DEL ARCHIVO-----");
            for(String linea:lineasArchivo){
                System.out.println(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public void dropFile(boolean typeFile){
        
        String route = (typeFile)?"E:\\programacionIII\\miArchivo.txt" : "E:\\programacionIII";
        
        Path path = Paths.get(route);
        
        try {
            //true if the file was deleted by this method; false if the file could not be deleted because it did not exist
            if (Files.exists(path)) {
                Files.delete(path);
                System.out.println("Se elimino el archivo correctamente");
            } else {
                System.out.println("El archivo no existe");
            
            }
            
            
            //System.out.println( (Files.deleteIfExists(path))?"The file was DELETE SUCcessfully":"the file was not DELETE");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
 
    
    
    

   

}
//https://docs.oracle.com/javase/7/docs/api/java/nio/file/Files.html#deleteIfExists(java.nio.file.Path)