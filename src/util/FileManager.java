package util;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileManager {

    CriptoController opt = new CriptoController();

    public String Read(String dir) {
        String value = "";
        try {
            File file = new File(dir);
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                value = reader.nextLine();
            }
            return value;
        } catch (FileNotFoundException ex) {
            System.out.println("Erro: Arquivo não encontrado!");
            return "";
        }
    }

    public boolean Write(String dir, String text, String file) {
        try {
            String path = dir + "\\" + file;
            verifyExistenceDirandFile(dir, file);
//            arq = new FileWriter(directory, directory.exists());
            FileWriter arq;

            arq = new FileWriter(path);

            PrintWriter write = new PrintWriter(arq);

            write.println(text);
            write.close();
            System.out.println("escrito com suscesso");
            return true;
        } catch (IOException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public void Remove(String path) {

        File arq = new File(path);

        if (arq.delete()) {
            System.out.println("apagado com suscesso");

        } else {
            System.out.println("apagado com suscesso");

        }

    }

    public void verifyExistenceDirandFile(String dir, String File) {
        
        try {
            File directory = new File(dir);
            boolean mkdir = directory.mkdir();
            String path = dir + "\\" + File;
            File file = new File(path);
            boolean newFile = file.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
