package com.stackroute.pe2;

import java.io.*;

public class ReadFileExtension {

    public String readFile(String fname) {
        String result = null;
        try {
            File maindir = new File(fname);
            File arr[] = {};
            if (maindir.exists() && maindir.isDirectory()) {
                arr = maindir.listFiles(new FilenameFilter() {
                    public boolean accept(File dir, String name) {
                            return name.toLowerCase().endsWith(".txt");
                    }
                });
            }
            else{
                result="Directory Not Found";
                return result;
            }
            for (int i = 0; i < arr.length; i++) {
                File file = new File(arr[i].getPath());
                FileInputStream fin = null;

                // create FileInputStream object
                fin = new FileInputStream(file);

                byte fileContent[] = new byte[(int) file.length()];

                // Reads up to certain bytes of data from this input stream into an array of bytes.
                fin.read(fileContent);
                //create string from byte array
                String s = new String(fileContent);
                System.out.println("File content: " + s);

            }
            result = "Read Using Byte Array";

        } catch (FileNotFoundException ex) {
            result = "File Not Found";
        } catch (IOException ex) {
            result = "Exception while reading";
        }

        return result;
    }
}
