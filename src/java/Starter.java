import java.io.IOException;
import java.net.URL;

/**
 * Created by Алена on 19.02.14.
 */
public class Starter {
    private static IOClass io;
    private static String path = "C:\\Users\\Алена\\IdeaProjects\\my-webapp\\src\\tmp.txt";


    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.ukrinform.ua/eng/rss/news/week");
        io = new IOClass(path);
        //io.read();
        io.readRSS(url);
        //io.write("Hello Hello");
    }
}
