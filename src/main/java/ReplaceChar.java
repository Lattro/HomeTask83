import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReplaceChar
{
    private String str;

    public ReplaceChar(String str)
    {
        this.str = str;
    }
    Lock lock = new ReentrantLock();
    public void replaceChar(char oldChar, char newChar)
    {
        lock.lock();
        System.out.println(Thread.currentThread().getName()+ " : ");
        System.out.println(str.replace(oldChar,newChar));;
        lock.unlock();
    }

}
