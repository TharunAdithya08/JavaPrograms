import java.io.*;

public class CopyFile
{
    public static void main(String []args) throws IOException
    {
        try
        {
            FileInputStream fis = new FileInputStream("CopyFile.java");
            FileOutputStream fos = new FileOutputStream("destinationCopyFile_java.txt");
            int i,count=0;
            i = fis.read();
            while(i!=-1)
            {
                if((i>=65 && i<=90)||(i>=97 && i<=122))
                    count++;
                fos.write(i);
                i = fis.read();
                
            }
            System.out.println("File copied successfully");
            System.out.println("The number of alphabets in the file are: " + count);
            fis.close();
            fos.close();

        }
        catch(IOException e)
        {
            System.out.println("Caught an IOException:File not found!");
        }
        finally
        {
            System.out.println("End of main method!");
        }
    }
}