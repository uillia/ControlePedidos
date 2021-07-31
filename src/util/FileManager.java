package util;

import java.io.*;
import java.util.Scanner;

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

    public boolean Write(String dir, String Texto, String File ) {
        try {
            
            File directory = new File(dir);

            boolean mkdir = directory.mkdir();
            String path = dir +"\\"+ File;
            
            File file = new File(path);
            boolean newFile = file.createNewFile();
//            arq = new FileWriter(directory, directory.exists());
            FileWriter arq = new FileWriter(path);
            PrintWriter write = new PrintWriter(arq);

            write.println(Texto);
            write.close();
            System.out.println("escrito com suscesso");
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
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
}
