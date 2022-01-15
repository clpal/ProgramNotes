package threads;
import java.util.List;
import java.util.ArrayList;
class Geek
{
   String name = "";
    public int count = 0;

    public void  geekName(String geek, List<String> list)
    {
        // Only one thread is permitted
        // to change geek's name at a time.
        synchronized(this)
        {
            name = geek;
            count++;  // how many threads change geek's name.
        }

        // All other threads are permitted
        // to add geek name into list.
        list.add(geek);
    }
}

public class SynchronizedBlock {
    public static void main(String[] args) {
        Geek gk = new Geek();
        List<String> list = new ArrayList<String>();
        gk.geekName("mohit", list);
        System.out.println(gk.name);
        System.out.println(gk.count);
    }
}
