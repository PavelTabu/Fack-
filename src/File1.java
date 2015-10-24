import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File1 {
    public static class BufferedReaderExample {

        public static void main(String[] args) {

            BufferedReader wq = null;

            try {

                String sCurrentLine;

                wq = new BufferedReader(new FileReader("D:\\Rock2.csv"));

                while ((sCurrentLine = wq.readLine()) != null) {
                    int i ;
                    String[] cv = new String[i];
                    cv = sCurrentLine.split(",");

                    for (i = 0; i < sCurrentLine.length(); i++) {

                        System.out.println(cv[i] + "  ");
                    }

                }

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (wq != null) wq.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }


        }
    }
}