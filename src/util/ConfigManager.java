package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConfigManager { // classe criada exclusivamente para ler e escrever valores em arquivos do tipo .properties

    public String getValue(String key, String DefautV, String path) { //O metodo getValue trabalha juntamente com os arquivos .properties lendo seus valores
        String wValorChave;
        FileInputStream in = null;

        Properties props = new Properties();
        File arquivo = new File(path);

        if (arquivo.exists()) {
            System.out.println("arquivo encontrado");
        } else {
            System.out.println("arquivo nao encontrado");
            try {
                new FileWriter(arquivo);
            } catch (IOException ex) {
                Logger.getLogger(ConfigManager.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("arquivo criado");
            setValue(key, DefautV, path); // chama se o metodo que escreve valores
            System.out.println("arquivo salvo e setado valor padão");
            
        }
        
        try {
            in = new FileInputStream(path);
            props.load(in);

            in.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        wValorChave = props.getProperty(key);
        System.out.println(wValorChave);
        return wValorChave;
    }

    public void setValue(String key, String value, String path) {
        
        FileInputStream fis = null;

        File arquivo = new File(path);
        if (arquivo.exists()) {

        } else {
            arquivo = new File(path);
        }
        Properties props = new Properties();
        try {
            FileOutputStream out = new FileOutputStream(arquivo);
            props.setProperty(key, value);
            props.store(out, "aquivo "+ path + "alterado com sucesso");
            out.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
