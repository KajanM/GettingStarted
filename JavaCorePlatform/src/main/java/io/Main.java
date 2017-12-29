package io;

import java.io.IOException;
import java.io.Reader;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) {
        //doTryCatchFinally();
        doTryWithResources();
    }

    public static void doTryCatchFinally() {
        char[] buff = new char[8];
        int length;
        Reader reader = null;
        try {
            reader = Helper.openReader("io.txt");
            while ((length = reader.read(buff)) >= 0) {
                System.out.println("\nlength: " + length);
                for (int i = 0; i < length; i++) {
                    System.out.print(buff[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void doTryWithResources() {
        char[] buff = new char[8];
        int length;
        try (Reader reader = Helper.openReader("io.txt")) {

            while ((length = reader.read(buff)) >= 0) {
                System.out.println("\nlength: " + length);
                for (int i = 0; i < length; i++) {
                    System.out.print(buff[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();

        }
    }
}
