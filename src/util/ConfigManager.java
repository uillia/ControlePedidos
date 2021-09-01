package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager { // classe criada exclusivamente para ler e escrever valores em arquivos do tipo .properties

    public String getValue(String key, String DefautV, String dir, String file) { //O metodo getValue trabalha juntamente com os arquivos .properties lendo seus valores
        String value;
        FileManager fm = new FileManager();
        fm.verifyExistenceDirandFile(dir, file);

        FileInputStream in = null;
        String path = dir + "\\" + file;
        Properties props = new Properties();

        try {
            in = new FileInputStream(path);
            props.load(in);

            in.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        if (props.getProperty(key) == null) {
            setValue(key, DefautV, path);
            value = DefautV;
        } else {
            value = props.getProperty(key);
            System.out.println(value);
        }
        return value;
    }

    public void setValue(String key, String value, String path) {

        File arquivo = new File(path);
        if (arquivo.exists()) {

        } else {
            arquivo = new File(path);
        }
        Properties props = new Properties();
        try {
            FileOutputStream out = new FileOutputStream(arquivo);
            props.setProperty(key, value);
            props.store(out, "aquivo " + path);
            out.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
