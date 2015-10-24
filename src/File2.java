import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class File2 {

    public static class BufferedReaderExample {

        public static void main(String[] args) {

            BufferedReader xz = null;

            try {

                String sCurrentLine;

                xz = new BufferedReader(new FileReader("D:\\Rock.csv"));

                while ((sCurrentLine = xz.readLine()) != null) {
                    int i;
                    String [] re = sCurrentLine.split(",");

                      for (i=0;i<sCurrentLine.length();i++ )
                    {

                        System.out.println(re[i] + "  ");
                    }

                }

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (xz != null)xz.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }


        }
        }
}
