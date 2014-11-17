package Decorator;

import java.io.*;

public class LowerCaseInputStream extends FilterInputStream{

    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int numOfBytes = super.read(b, off, len);
        for(int i = off; i < off + len; i++){
            int lowerCharInt = Character.toLowerCase((char)b[i]);
            b[i] = (byte) lowerCharInt;
        }
        return numOfBytes;
    }

    @Override
    public int read(byte[] b) throws IOException {
        int numOfBytes = super.read(b);
        for(int i = 0; i < numOfBytes; i++){
            int lowerCharInt = Character.toLowerCase((char)b[i]);
            b[i] = (byte) lowerCharInt;
        }
        return numOfBytes;
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char)c));
    }

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:/test.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        LowerCaseInputStream lowerCaseInputStream = new LowerCaseInputStream(bis);
        int i;
        while((i = lowerCaseInputStream.read()) >= 0){
            System.out.print((char)i);
        }

        // separate output lines
        System.out.println();

        FileInputStream fis1 = new FileInputStream("D:/test.txt");
        BufferedInputStream bis1 = new BufferedInputStream(fis1);
        LowerCaseInputStream lowerCaseInputStream1 = new LowerCaseInputStream(bis1);
        byte[] bytes = new byte[lowerCaseInputStream1.available()];
        lowerCaseInputStream1.read(bytes);
        for(byte b : bytes){
            System.out.print((char) b);
        }

        fis.close();
        fis1.close();
    }
}