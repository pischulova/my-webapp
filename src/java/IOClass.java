import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 * Created by Алена on 19.02.14.
 */
public class IOClass {
    private String path;
    private URL url;

    public IOClass(String path) {
        this.path = path;
    }

    public void read() throws IOException {
        Scanner in = new Scanner(new File(path));
        while(in.hasNextLine()) {
            String data = in.nextLine();
            System.out.println(data);
        }
        in.close();
    }

    public void write(String st) throws IOException {
        FileOutputStream out = new FileOutputStream(path);
        out.write(st.getBytes());
        out.close();
    }

    public String readRSS(URL url) throws IOException {
        URLConnection uc = url.openConnection();
        BufferedReader reader = new BufferedReader(new InputStreamReader(uc.getInputStream()));
        String data;
        String info = "";
        while ((data = reader.readLine()) != null) {
            info = reader.readLine();
            System.out.println(info);
        }
        reader.close();
        return info;
    }

}
