package util;

import java.io.*;
import java.util.Scanner;

public class FileManager {

    public String Read(String Caminho) {
        String conteudo = "";
        try {
            File arquivo = new File(Caminho);
            Scanner leitor = new Scanner(arquivo);

            while (leitor.hasNextLine()) {
                conteudo = leitor.nextLine();
            }
            return conteudo;
        } catch (FileNotFoundException ex) {
            System.out.println("Erro: Arquivo não encontrado!");
            return "";
        }
    }

    public boolean Write(String path, String Texto) {
        try {
            FileWriter arq = new FileWriter(path);
            File login = new File(path);

            //Se o arquivo já existir, então abrir para concatenação, caso contrário criar novo arquivo
            arq = new FileWriter(login, login.exists());
            

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
