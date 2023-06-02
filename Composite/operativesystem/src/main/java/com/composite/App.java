package com.composite;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ComponentFileSystem file1 = new File("archivo1.txt", 10);
        ComponentFileSystem file2 = new File("archivo2.txt", 5);
        ComponentFileSystem file3 = new File("archivo3.txt", 8);

        // Crear carpetas
        ComponentFileSystem folder1 = new Folder("Carpeta1");
        ComponentFileSystem foler2 = new Folder("Carpeta2");

    
          ((Folder) folder1).add(file1);
          ((Folder) folder1).add(file2);
          ((Folder) foler2).add(file3);
  
          // Agregar carpeta2 a carpeta1
          ((Folder) folder1).add(foler2);
  
          folder1.print();
    }
}
