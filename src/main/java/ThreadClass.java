public class ThreadClass implements Runnable
{
    char oldChar;
    char newChar;
    ReplaceChar replaceChar;

    public ThreadClass(char oldChar, char newChar, ReplaceChar replaceChar) {
        this.oldChar = oldChar;
        this.newChar = newChar;
        this.replaceChar = replaceChar;
    }

    public void run()
    {
        replaceChar.replaceChar(oldChar,newChar);
    }
}
