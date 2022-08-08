import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int4 = inflater0.getAdler();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(true);
        inflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int3 = inflater1.getTotalIn();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        inflater0.end();
        int int2 = inflater0.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long3 = inflater0.getBytesWritten();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        inflater0.end();
        int int2 = inflater0.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int3 = inflater0.getTotalIn();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int6 = inflater0.getTotalOut();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long4 = inflater0.getBytesWritten();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsInput();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        boolean boolean9 = inflater6.needsDictionary();
        boolean boolean10 = inflater6.needsInput();
        int int11 = inflater6.getRemaining();
        inflater6.reset();
        java.util.zip.Inflater inflater13 = new java.util.zip.Inflater();
        boolean boolean14 = inflater13.finished();
        int int15 = inflater13.getRemaining();
        boolean boolean16 = inflater13.finished();
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater13.setInput(byteArray23);
        inflater6.setInput(byteArray23);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int28 = inflater0.inflate(byteArray23, (int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsInput();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        byte[] byteArray8 = new byte[] { (byte) 1 };
        int int9 = inflater6.inflate(byteArray8);
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int15 = inflater6.inflate(byteArray14);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int16 = inflater0.inflate(byteArray14);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        boolean boolean4 = inflater0.finished();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int6 = inflater0.getAdler();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        int int4 = inflater0.getAdler();
        int int5 = inflater0.getAdler();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int7 = inflater0.getTotalIn();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int6 = inflater0.getTotalIn();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        int int5 = inflater0.getRemaining();
        int int6 = inflater0.getTotalOut();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long6 = inflater0.getBytesWritten();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        inflater0.end();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        boolean boolean6 = inflater5.finished();
        int int7 = inflater5.getRemaining();
        boolean boolean8 = inflater5.finished();
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater5.setInput(byteArray15);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int17 = inflater0.inflate(byteArray15);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.reset();
        long long6 = inflater0.getBytesWritten();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        int int4 = inflater0.getAdler();
        int int5 = inflater0.getAdler();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long7 = inflater0.getBytesRead();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        java.util.zip.Inflater inflater4 = new java.util.zip.Inflater();
        boolean boolean5 = inflater4.finished();
        int int6 = inflater4.getRemaining();
        boolean boolean7 = inflater4.finished();
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater4.setInput(byteArray14);
        inflater0.setInput(byteArray14);
        java.util.zip.Inflater inflater17 = new java.util.zip.Inflater();
        boolean boolean18 = inflater17.finished();
        int int19 = inflater17.getRemaining();
        boolean boolean20 = inflater17.needsDictionary();
        boolean boolean21 = inflater17.needsInput();
        int int22 = inflater17.getRemaining();
        java.util.zip.Inflater inflater23 = new java.util.zip.Inflater();
        boolean boolean24 = inflater23.finished();
        int int25 = inflater23.getRemaining();
        boolean boolean26 = inflater23.finished();
        byte[] byteArray33 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater23.setInput(byteArray33);
        int int35 = inflater17.inflate(byteArray33);
        boolean boolean36 = inflater17.finished();
        int int37 = inflater17.getTotalOut();
        java.util.zip.Inflater inflater38 = new java.util.zip.Inflater();
        boolean boolean39 = inflater38.finished();
        int int40 = inflater38.getRemaining();
        boolean boolean41 = inflater38.needsDictionary();
        long long42 = inflater38.getBytesRead();
        boolean boolean43 = inflater38.needsDictionary();
        java.util.zip.Inflater inflater44 = new java.util.zip.Inflater();
        byte[] byteArray46 = new byte[] { (byte) 1 };
        int int47 = inflater44.inflate(byteArray46);
        long long48 = inflater44.getBytesWritten();
        inflater44.reset();
        long long50 = inflater44.getBytesWritten();
        java.util.zip.Inflater inflater51 = new java.util.zip.Inflater();
        boolean boolean52 = inflater51.finished();
        int int53 = inflater51.getRemaining();
        boolean boolean54 = inflater51.needsDictionary();
        boolean boolean55 = inflater51.needsInput();
        int int56 = inflater51.getRemaining();
        java.util.zip.Inflater inflater57 = new java.util.zip.Inflater();
        boolean boolean58 = inflater57.finished();
        int int59 = inflater57.getRemaining();
        boolean boolean60 = inflater57.finished();
        byte[] byteArray67 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater57.setInput(byteArray67);
        int int69 = inflater51.inflate(byteArray67);
        inflater44.setInput(byteArray67);
        inflater38.setInput(byteArray67);
        int int72 = inflater17.inflate(byteArray67);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        inflater0.setDictionary(byteArray67, 0, (int) (short) 0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int5 = inflater0.getAdler();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        inflater0.end();
        java.util.zip.Inflater inflater2 = new java.util.zip.Inflater();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        int int5 = inflater2.inflate(byteArray4);
        int int6 = inflater2.getTotalIn();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        inflater7.end();
        boolean boolean11 = inflater7.needsInput();
        java.util.zip.Inflater inflater12 = new java.util.zip.Inflater();
        byte[] byteArray14 = new byte[] { (byte) 1 };
        int int15 = inflater12.inflate(byteArray14);
        inflater7.setInput(byteArray14);
        inflater2.setInput(byteArray14);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.setDictionary(byteArray14, (int) (short) 0, 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.reset();
        long long6 = inflater0.getBytesWritten();
        inflater0.end();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        int int8 = inflater5.inflate(byteArray7);
        inflater0.setInput(byteArray7);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int10 = inflater0.getTotalOut();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        int int8 = inflater5.inflate(byteArray7);
        inflater0.setInput(byteArray7);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        boolean boolean6 = inflater5.finished();
        int int7 = inflater5.getRemaining();
        boolean boolean8 = inflater5.needsDictionary();
        boolean boolean9 = inflater5.needsInput();
        int int10 = inflater5.getRemaining();
        java.util.zip.Inflater inflater11 = new java.util.zip.Inflater();
        boolean boolean12 = inflater11.finished();
        int int13 = inflater11.getRemaining();
        boolean boolean14 = inflater11.finished();
        byte[] byteArray21 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater11.setInput(byteArray21);
        int int23 = inflater5.inflate(byteArray21);
        boolean boolean24 = inflater5.finished();
        int int25 = inflater5.getTotalOut();
        java.util.zip.Inflater inflater26 = new java.util.zip.Inflater();
        boolean boolean27 = inflater26.finished();
        int int28 = inflater26.getRemaining();
        boolean boolean29 = inflater26.needsDictionary();
        long long30 = inflater26.getBytesRead();
        boolean boolean31 = inflater26.needsDictionary();
        java.util.zip.Inflater inflater32 = new java.util.zip.Inflater();
        byte[] byteArray34 = new byte[] { (byte) 1 };
        int int35 = inflater32.inflate(byteArray34);
        long long36 = inflater32.getBytesWritten();
        inflater32.reset();
        long long38 = inflater32.getBytesWritten();
        java.util.zip.Inflater inflater39 = new java.util.zip.Inflater();
        boolean boolean40 = inflater39.finished();
        int int41 = inflater39.getRemaining();
        boolean boolean42 = inflater39.needsDictionary();
        boolean boolean43 = inflater39.needsInput();
        int int44 = inflater39.getRemaining();
        java.util.zip.Inflater inflater45 = new java.util.zip.Inflater();
        boolean boolean46 = inflater45.finished();
        int int47 = inflater45.getRemaining();
        boolean boolean48 = inflater45.finished();
        byte[] byteArray55 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater45.setInput(byteArray55);
        int int57 = inflater39.inflate(byteArray55);
        inflater32.setInput(byteArray55);
        inflater26.setInput(byteArray55);
        int int60 = inflater5.inflate(byteArray55);
        java.util.zip.Inflater inflater61 = new java.util.zip.Inflater();
        boolean boolean62 = inflater61.finished();
        int int63 = inflater61.getRemaining();
        boolean boolean64 = inflater61.needsInput();
        java.util.zip.Inflater inflater65 = new java.util.zip.Inflater();
        boolean boolean66 = inflater65.finished();
        int int67 = inflater65.getRemaining();
        boolean boolean68 = inflater65.finished();
        byte[] byteArray75 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater65.setInput(byteArray75);
        inflater61.setInput(byteArray75);
        int int78 = inflater5.inflate(byteArray75);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.setDictionary(byteArray75);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsDictionary();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        boolean boolean9 = inflater6.finished();
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater6.setInput(byteArray16);
        int int18 = inflater0.inflate(byteArray16);
        boolean boolean19 = inflater0.finished();
        int int20 = inflater0.getTotalOut();
        java.util.zip.Inflater inflater21 = new java.util.zip.Inflater();
        boolean boolean22 = inflater21.finished();
        int int23 = inflater21.getRemaining();
        boolean boolean24 = inflater21.needsDictionary();
        long long25 = inflater21.getBytesRead();
        boolean boolean26 = inflater21.needsDictionary();
        java.util.zip.Inflater inflater27 = new java.util.zip.Inflater();
        byte[] byteArray29 = new byte[] { (byte) 1 };
        int int30 = inflater27.inflate(byteArray29);
        long long31 = inflater27.getBytesWritten();
        inflater27.reset();
        long long33 = inflater27.getBytesWritten();
        java.util.zip.Inflater inflater34 = new java.util.zip.Inflater();
        boolean boolean35 = inflater34.finished();
        int int36 = inflater34.getRemaining();
        boolean boolean37 = inflater34.needsDictionary();
        boolean boolean38 = inflater34.needsInput();
        int int39 = inflater34.getRemaining();
        java.util.zip.Inflater inflater40 = new java.util.zip.Inflater();
        boolean boolean41 = inflater40.finished();
        int int42 = inflater40.getRemaining();
        boolean boolean43 = inflater40.finished();
        byte[] byteArray50 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater40.setInput(byteArray50);
        int int52 = inflater34.inflate(byteArray50);
        inflater27.setInput(byteArray50);
        inflater21.setInput(byteArray50);
        int int55 = inflater0.inflate(byteArray50);
        java.util.zip.Inflater inflater56 = new java.util.zip.Inflater();
        boolean boolean57 = inflater56.finished();
        int int58 = inflater56.getRemaining();
        boolean boolean59 = inflater56.needsInput();
        java.util.zip.Inflater inflater60 = new java.util.zip.Inflater();
        boolean boolean61 = inflater60.finished();
        int int62 = inflater60.getRemaining();
        boolean boolean63 = inflater60.finished();
        byte[] byteArray70 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater60.setInput(byteArray70);
        inflater56.setInput(byteArray70);
        int int73 = inflater0.inflate(byteArray70);
        int int74 = inflater0.getRemaining();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        int int8 = inflater5.inflate(byteArray7);
        inflater0.setInput(byteArray7);
        int int10 = inflater0.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long11 = inflater0.getBytesRead();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        boolean boolean4 = inflater0.finished();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long6 = inflater0.getBytesRead();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.end();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.needsDictionary();
        int int8 = inflater6.getTotalOut();
        int int9 = inflater6.getTotalOut();
        boolean boolean10 = inflater6.needsInput();
        java.util.zip.Inflater inflater11 = new java.util.zip.Inflater();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        int int14 = inflater11.inflate(byteArray13);
        inflater11.reset();
        java.util.zip.Inflater inflater16 = new java.util.zip.Inflater();
        byte[] byteArray18 = new byte[] { (byte) 1 };
        int int19 = inflater16.inflate(byteArray18);
        int int20 = inflater16.getTotalIn();
        java.util.zip.Inflater inflater21 = new java.util.zip.Inflater();
        byte[] byteArray23 = new byte[] { (byte) 1 };
        int int24 = inflater21.inflate(byteArray23);
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int30 = inflater21.inflate(byteArray29);
        int int31 = inflater16.inflate(byteArray29);
        inflater11.setInput(byteArray29);
        inflater6.setInput(byteArray29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        inflater0.setDictionary(byteArray29);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        boolean boolean5 = inflater0.needsInput();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long7 = inflater0.getBytesWritten();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsInput();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        byte[] byteArray8 = new byte[] { (byte) 1 };
        int int9 = inflater6.inflate(byteArray8);
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int15 = inflater6.inflate(byteArray14);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.setDictionary(byteArray14);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.reset();
        int int6 = inflater0.getRemaining();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int8 = inflater0.getAdler();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        long long4 = inflater0.getBytesRead();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long6 = inflater0.getBytesWritten();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        boolean boolean5 = inflater0.needsInput();
        inflater0.end();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        byte[] byteArray9 = new byte[] { (byte) 1 };
        int int10 = inflater7.inflate(byteArray9);
        int int11 = inflater7.getTotalIn();
        java.util.zip.Inflater inflater12 = new java.util.zip.Inflater();
        boolean boolean13 = inflater12.finished();
        int int14 = inflater12.getRemaining();
        inflater12.end();
        boolean boolean16 = inflater12.needsInput();
        java.util.zip.Inflater inflater17 = new java.util.zip.Inflater();
        byte[] byteArray19 = new byte[] { (byte) 1 };
        int int20 = inflater17.inflate(byteArray19);
        inflater12.setInput(byteArray19);
        inflater7.setInput(byteArray19);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.setDictionary(byteArray19, (int) (byte) 1, (int) (short) 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(true);
        inflater1.end();
        java.util.zip.Inflater inflater3 = new java.util.zip.Inflater();
        boolean boolean4 = inflater3.finished();
        int int5 = inflater3.getRemaining();
        inflater3.end();
        boolean boolean7 = inflater3.needsInput();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        boolean boolean9 = inflater8.finished();
        int int10 = inflater8.getRemaining();
        boolean boolean11 = inflater8.needsDictionary();
        long long12 = inflater8.getBytesRead();
        boolean boolean13 = inflater8.needsInput();
        java.util.zip.Inflater inflater14 = new java.util.zip.Inflater();
        byte[] byteArray16 = new byte[] { (byte) 1 };
        int int17 = inflater14.inflate(byteArray16);
        long long18 = inflater14.getBytesWritten();
        inflater14.reset();
        long long20 = inflater14.getBytesWritten();
        java.util.zip.Inflater inflater21 = new java.util.zip.Inflater();
        boolean boolean22 = inflater21.finished();
        int int23 = inflater21.getRemaining();
        boolean boolean24 = inflater21.needsDictionary();
        boolean boolean25 = inflater21.needsInput();
        int int26 = inflater21.getRemaining();
        java.util.zip.Inflater inflater27 = new java.util.zip.Inflater();
        boolean boolean28 = inflater27.finished();
        int int29 = inflater27.getRemaining();
        boolean boolean30 = inflater27.finished();
        byte[] byteArray37 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater27.setInput(byteArray37);
        int int39 = inflater21.inflate(byteArray37);
        inflater14.setInput(byteArray37);
        int int41 = inflater8.inflate(byteArray37);
        inflater3.setInput(byteArray37);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater1.setDictionary(byteArray37);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.reset();
        int int6 = inflater0.getRemaining();
        inflater0.end();
        int int8 = inflater0.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        boolean boolean4 = inflater0.finished();
        inflater0.end();
        inflater0.end();
        boolean boolean7 = inflater0.needsDictionary();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        boolean boolean9 = inflater8.finished();
        int int10 = inflater8.getRemaining();
        boolean boolean11 = inflater8.needsInput();
        java.util.zip.Inflater inflater12 = new java.util.zip.Inflater();
        boolean boolean13 = inflater12.finished();
        int int14 = inflater12.getRemaining();
        boolean boolean15 = inflater12.finished();
        byte[] byteArray22 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater12.setInput(byteArray22);
        inflater8.setInput(byteArray22);
        inflater0.setInput(byteArray22);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int26 = inflater0.getAdler();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(true);
        inflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int3 = inflater1.getTotalOut();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        java.util.zip.Inflater inflater4 = new java.util.zip.Inflater();
        boolean boolean5 = inflater4.finished();
        int int6 = inflater4.getRemaining();
        boolean boolean7 = inflater4.finished();
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater4.setInput(byteArray14);
        inflater0.setInput(byteArray14);
        boolean boolean17 = inflater0.needsDictionary();
        boolean boolean18 = inflater0.finished();
        java.util.zip.Inflater inflater19 = new java.util.zip.Inflater();
        byte[] byteArray21 = new byte[] { (byte) 1 };
        int int22 = inflater19.inflate(byteArray21);
        inflater19.reset();
        java.util.zip.Inflater inflater24 = new java.util.zip.Inflater();
        byte[] byteArray26 = new byte[] { (byte) 1 };
        int int27 = inflater24.inflate(byteArray26);
        long long28 = inflater24.getBytesWritten();
        inflater24.reset();
        long long30 = inflater24.getBytesWritten();
        java.util.zip.Inflater inflater31 = new java.util.zip.Inflater();
        boolean boolean32 = inflater31.finished();
        int int33 = inflater31.getRemaining();
        boolean boolean34 = inflater31.needsDictionary();
        boolean boolean35 = inflater31.needsInput();
        int int36 = inflater31.getRemaining();
        java.util.zip.Inflater inflater37 = new java.util.zip.Inflater();
        boolean boolean38 = inflater37.finished();
        int int39 = inflater37.getRemaining();
        boolean boolean40 = inflater37.finished();
        byte[] byteArray47 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater37.setInput(byteArray47);
        int int49 = inflater31.inflate(byteArray47);
        inflater24.setInput(byteArray47);
        inflater19.setInput(byteArray47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        inflater0.setDictionary(byteArray47);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getAdler();
        boolean boolean5 = inflater0.finished();
        inflater0.end();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.needsDictionary();
        long long11 = inflater7.getBytesRead();
        boolean boolean12 = inflater7.needsDictionary();
        java.util.zip.Inflater inflater13 = new java.util.zip.Inflater();
        byte[] byteArray15 = new byte[] { (byte) 1 };
        int int16 = inflater13.inflate(byteArray15);
        long long17 = inflater13.getBytesWritten();
        inflater13.reset();
        long long19 = inflater13.getBytesWritten();
        java.util.zip.Inflater inflater20 = new java.util.zip.Inflater();
        boolean boolean21 = inflater20.finished();
        int int22 = inflater20.getRemaining();
        boolean boolean23 = inflater20.needsDictionary();
        boolean boolean24 = inflater20.needsInput();
        int int25 = inflater20.getRemaining();
        java.util.zip.Inflater inflater26 = new java.util.zip.Inflater();
        boolean boolean27 = inflater26.finished();
        int int28 = inflater26.getRemaining();
        boolean boolean29 = inflater26.finished();
        byte[] byteArray36 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater26.setInput(byteArray36);
        int int38 = inflater20.inflate(byteArray36);
        inflater13.setInput(byteArray36);
        inflater7.setInput(byteArray36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int41 = inflater0.inflate(byteArray36);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        boolean boolean9 = inflater6.finished();
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater6.setInput(byteArray16);
        int int18 = inflater0.inflate(byteArray16);
        inflater0.end();
        java.util.zip.Inflater inflater21 = new java.util.zip.Inflater(true);
        int int22 = inflater21.getRemaining();
        long long23 = inflater21.getBytesRead();
        java.util.zip.Inflater inflater24 = new java.util.zip.Inflater();
        byte[] byteArray26 = new byte[] { (byte) 1 };
        int int27 = inflater24.inflate(byteArray26);
        int int28 = inflater21.inflate(byteArray26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int29 = inflater0.inflate(byteArray26);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(true);
        inflater1.end();
        java.util.zip.Inflater inflater3 = new java.util.zip.Inflater();
        boolean boolean4 = inflater3.finished();
        int int5 = inflater3.getRemaining();
        boolean boolean6 = inflater3.needsDictionary();
        boolean boolean7 = inflater3.needsInput();
        int int8 = inflater3.getRemaining();
        inflater3.reset();
        java.util.zip.Inflater inflater10 = new java.util.zip.Inflater();
        boolean boolean11 = inflater10.finished();
        int int12 = inflater10.getRemaining();
        boolean boolean13 = inflater10.finished();
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater10.setInput(byteArray20);
        inflater3.setInput(byteArray20);
        inflater1.setInput(byteArray20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long24 = inflater1.getBytesWritten();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        boolean boolean4 = inflater0.finished();
        inflater0.end();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int7 = inflater0.getTotalOut();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        inflater0.end();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long5 = inflater0.getBytesWritten();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        inflater0.end();
        int int2 = inflater0.getRemaining();
        java.util.zip.Inflater inflater3 = new java.util.zip.Inflater();
        boolean boolean4 = inflater3.finished();
        int int5 = inflater3.getRemaining();
        inflater3.end();
        boolean boolean7 = inflater3.needsInput();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        boolean boolean9 = inflater8.finished();
        int int10 = inflater8.getRemaining();
        boolean boolean11 = inflater8.needsDictionary();
        long long12 = inflater8.getBytesRead();
        boolean boolean13 = inflater8.needsInput();
        java.util.zip.Inflater inflater14 = new java.util.zip.Inflater();
        byte[] byteArray16 = new byte[] { (byte) 1 };
        int int17 = inflater14.inflate(byteArray16);
        long long18 = inflater14.getBytesWritten();
        inflater14.reset();
        long long20 = inflater14.getBytesWritten();
        java.util.zip.Inflater inflater21 = new java.util.zip.Inflater();
        boolean boolean22 = inflater21.finished();
        int int23 = inflater21.getRemaining();
        boolean boolean24 = inflater21.needsDictionary();
        boolean boolean25 = inflater21.needsInput();
        int int26 = inflater21.getRemaining();
        java.util.zip.Inflater inflater27 = new java.util.zip.Inflater();
        boolean boolean28 = inflater27.finished();
        int int29 = inflater27.getRemaining();
        boolean boolean30 = inflater27.finished();
        byte[] byteArray37 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater27.setInput(byteArray37);
        int int39 = inflater21.inflate(byteArray37);
        inflater14.setInput(byteArray37);
        int int41 = inflater8.inflate(byteArray37);
        inflater3.setInput(byteArray37);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int43 = inflater0.inflate(byteArray37);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        inflater0.end();
        java.util.zip.Inflater inflater2 = new java.util.zip.Inflater();
        boolean boolean3 = inflater2.finished();
        int int4 = inflater2.getRemaining();
        boolean boolean5 = inflater2.needsDictionary();
        boolean boolean6 = inflater2.needsInput();
        int int7 = inflater2.getRemaining();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        boolean boolean9 = inflater8.finished();
        int int10 = inflater8.getRemaining();
        boolean boolean11 = inflater8.finished();
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater8.setInput(byteArray18);
        int int20 = inflater2.inflate(byteArray18);
        boolean boolean21 = inflater2.finished();
        int int22 = inflater2.getTotalOut();
        java.util.zip.Inflater inflater23 = new java.util.zip.Inflater();
        boolean boolean24 = inflater23.finished();
        int int25 = inflater23.getRemaining();
        boolean boolean26 = inflater23.needsDictionary();
        long long27 = inflater23.getBytesRead();
        boolean boolean28 = inflater23.needsDictionary();
        java.util.zip.Inflater inflater29 = new java.util.zip.Inflater();
        byte[] byteArray31 = new byte[] { (byte) 1 };
        int int32 = inflater29.inflate(byteArray31);
        long long33 = inflater29.getBytesWritten();
        inflater29.reset();
        long long35 = inflater29.getBytesWritten();
        java.util.zip.Inflater inflater36 = new java.util.zip.Inflater();
        boolean boolean37 = inflater36.finished();
        int int38 = inflater36.getRemaining();
        boolean boolean39 = inflater36.needsDictionary();
        boolean boolean40 = inflater36.needsInput();
        int int41 = inflater36.getRemaining();
        java.util.zip.Inflater inflater42 = new java.util.zip.Inflater();
        boolean boolean43 = inflater42.finished();
        int int44 = inflater42.getRemaining();
        boolean boolean45 = inflater42.finished();
        byte[] byteArray52 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater42.setInput(byteArray52);
        int int54 = inflater36.inflate(byteArray52);
        inflater29.setInput(byteArray52);
        inflater23.setInput(byteArray52);
        int int57 = inflater2.inflate(byteArray52);
        java.util.zip.Inflater inflater58 = new java.util.zip.Inflater();
        boolean boolean59 = inflater58.finished();
        int int60 = inflater58.getRemaining();
        boolean boolean61 = inflater58.needsInput();
        java.util.zip.Inflater inflater62 = new java.util.zip.Inflater();
        boolean boolean63 = inflater62.finished();
        int int64 = inflater62.getRemaining();
        boolean boolean65 = inflater62.finished();
        byte[] byteArray72 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater62.setInput(byteArray72);
        inflater58.setInput(byteArray72);
        int int75 = inflater2.inflate(byteArray72);
        java.util.zip.Inflater inflater76 = new java.util.zip.Inflater();
        boolean boolean77 = inflater76.finished();
        java.util.zip.Inflater inflater78 = new java.util.zip.Inflater();
        byte[] byteArray80 = new byte[] { (byte) 1 };
        int int81 = inflater78.inflate(byteArray80);
        int int82 = inflater78.getTotalIn();
        java.util.zip.Inflater inflater83 = new java.util.zip.Inflater();
        boolean boolean84 = inflater83.finished();
        int int85 = inflater83.getRemaining();
        inflater83.end();
        boolean boolean87 = inflater83.needsInput();
        java.util.zip.Inflater inflater88 = new java.util.zip.Inflater();
        byte[] byteArray90 = new byte[] { (byte) 1 };
        int int91 = inflater88.inflate(byteArray90);
        inflater83.setInput(byteArray90);
        inflater78.setInput(byteArray90);
        inflater76.setInput(byteArray90);
        inflater2.setInput(byteArray90);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.setDictionary(byteArray90);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        boolean boolean4 = inflater0.finished();
        inflater0.end();
        inflater0.end();
        boolean boolean7 = inflater0.needsDictionary();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        boolean boolean9 = inflater8.finished();
        int int10 = inflater8.getRemaining();
        boolean boolean11 = inflater8.needsInput();
        java.util.zip.Inflater inflater12 = new java.util.zip.Inflater();
        boolean boolean13 = inflater12.finished();
        int int14 = inflater12.getRemaining();
        boolean boolean15 = inflater12.finished();
        byte[] byteArray22 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater12.setInput(byteArray22);
        inflater8.setInput(byteArray22);
        inflater0.setInput(byteArray22);
        java.util.zip.Inflater inflater26 = new java.util.zip.Inflater();
        byte[] byteArray28 = new byte[] { (byte) 1 };
        int int29 = inflater26.inflate(byteArray28);
        boolean boolean30 = inflater26.finished();
        inflater26.end();
        inflater26.end();
        boolean boolean33 = inflater26.needsDictionary();
        java.util.zip.Inflater inflater34 = new java.util.zip.Inflater();
        boolean boolean35 = inflater34.finished();
        int int36 = inflater34.getRemaining();
        boolean boolean37 = inflater34.needsInput();
        java.util.zip.Inflater inflater38 = new java.util.zip.Inflater();
        boolean boolean39 = inflater38.finished();
        int int40 = inflater38.getRemaining();
        boolean boolean41 = inflater38.finished();
        byte[] byteArray48 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater38.setInput(byteArray48);
        inflater34.setInput(byteArray48);
        inflater26.setInput(byteArray48);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int52 = inflater0.inflate(byteArray48);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long5 = inflater0.getBytesWritten();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        int int8 = inflater5.inflate(byteArray7);
        inflater0.setInput(byteArray7);
        int int10 = inflater0.getRemaining();
        boolean boolean11 = inflater0.needsDictionary();
        java.util.zip.Inflater inflater12 = new java.util.zip.Inflater();
        byte[] byteArray14 = new byte[] { (byte) 1 };
        int int15 = inflater12.inflate(byteArray14);
        int int16 = inflater12.getTotalIn();
        long long17 = inflater12.getBytesWritten();
        java.util.zip.Inflater inflater18 = new java.util.zip.Inflater();
        boolean boolean19 = inflater18.finished();
        int int20 = inflater18.getRemaining();
        boolean boolean21 = inflater18.needsDictionary();
        boolean boolean22 = inflater18.needsInput();
        int int23 = inflater18.getRemaining();
        java.util.zip.Inflater inflater24 = new java.util.zip.Inflater();
        boolean boolean25 = inflater24.finished();
        int int26 = inflater24.getRemaining();
        boolean boolean27 = inflater24.finished();
        byte[] byteArray34 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater24.setInput(byteArray34);
        int int36 = inflater18.inflate(byteArray34);
        boolean boolean37 = inflater18.finished();
        int int38 = inflater18.getTotalOut();
        java.util.zip.Inflater inflater39 = new java.util.zip.Inflater();
        boolean boolean40 = inflater39.finished();
        int int41 = inflater39.getRemaining();
        boolean boolean42 = inflater39.needsDictionary();
        long long43 = inflater39.getBytesRead();
        boolean boolean44 = inflater39.needsDictionary();
        java.util.zip.Inflater inflater45 = new java.util.zip.Inflater();
        byte[] byteArray47 = new byte[] { (byte) 1 };
        int int48 = inflater45.inflate(byteArray47);
        long long49 = inflater45.getBytesWritten();
        inflater45.reset();
        long long51 = inflater45.getBytesWritten();
        java.util.zip.Inflater inflater52 = new java.util.zip.Inflater();
        boolean boolean53 = inflater52.finished();
        int int54 = inflater52.getRemaining();
        boolean boolean55 = inflater52.needsDictionary();
        boolean boolean56 = inflater52.needsInput();
        int int57 = inflater52.getRemaining();
        java.util.zip.Inflater inflater58 = new java.util.zip.Inflater();
        boolean boolean59 = inflater58.finished();
        int int60 = inflater58.getRemaining();
        boolean boolean61 = inflater58.finished();
        byte[] byteArray68 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater58.setInput(byteArray68);
        int int70 = inflater52.inflate(byteArray68);
        inflater45.setInput(byteArray68);
        inflater39.setInput(byteArray68);
        int int73 = inflater18.inflate(byteArray68);
        java.util.zip.Inflater inflater74 = new java.util.zip.Inflater();
        boolean boolean75 = inflater74.finished();
        int int76 = inflater74.getRemaining();
        boolean boolean77 = inflater74.needsInput();
        java.util.zip.Inflater inflater78 = new java.util.zip.Inflater();
        boolean boolean79 = inflater78.finished();
        int int80 = inflater78.getRemaining();
        boolean boolean81 = inflater78.finished();
        byte[] byteArray88 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater78.setInput(byteArray88);
        inflater74.setInput(byteArray88);
        int int91 = inflater18.inflate(byteArray88);
        inflater12.setInput(byteArray88, 0, (int) (short) 0);
        inflater0.setInput(byteArray88);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int96 = inflater0.getTotalIn();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        int int4 = inflater0.getAdler();
        inflater0.reset();
        long long6 = inflater0.getBytesWritten();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long8 = inflater0.getBytesWritten();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        boolean boolean9 = inflater6.finished();
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater6.setInput(byteArray16);
        int int18 = inflater0.inflate(byteArray16);
        inflater0.end();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long21 = inflater0.getBytesWritten();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        boolean boolean4 = inflater0.finished();
        inflater0.end();
        boolean boolean6 = inflater0.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        long long7 = inflater0.getBytesWritten();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int9 = inflater0.getTotalOut();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(true);
        inflater1.end();
        int int3 = inflater1.getRemaining();
        java.util.zip.Inflater inflater4 = new java.util.zip.Inflater();
        byte[] byteArray6 = new byte[] { (byte) 1 };
        int int7 = inflater4.inflate(byteArray6);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int13 = inflater4.inflate(byteArray12);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int14 = inflater1.inflate(byteArray12);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        inflater0.reset();
        boolean boolean2 = inflater0.needsInput();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long4 = inflater0.getBytesWritten();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        inflater0.end();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long4 = inflater0.getBytesWritten();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        inflater0.reset();
        boolean boolean2 = inflater0.needsInput();
        inflater0.end();
        java.util.zip.Inflater inflater4 = new java.util.zip.Inflater();
        byte[] byteArray6 = new byte[] { (byte) 1 };
        int int7 = inflater4.inflate(byteArray6);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int13 = inflater4.inflate(byteArray12);
        boolean boolean14 = inflater4.needsInput();
        boolean boolean15 = inflater4.needsDictionary();
        java.util.zip.Inflater inflater16 = new java.util.zip.Inflater();
        boolean boolean17 = inflater16.finished();
        int int18 = inflater16.getRemaining();
        boolean boolean19 = inflater16.needsDictionary();
        long long20 = inflater16.getBytesRead();
        boolean boolean21 = inflater16.needsInput();
        java.util.zip.Inflater inflater22 = new java.util.zip.Inflater();
        byte[] byteArray24 = new byte[] { (byte) 1 };
        int int25 = inflater22.inflate(byteArray24);
        long long26 = inflater22.getBytesWritten();
        inflater22.reset();
        long long28 = inflater22.getBytesWritten();
        java.util.zip.Inflater inflater29 = new java.util.zip.Inflater();
        boolean boolean30 = inflater29.finished();
        int int31 = inflater29.getRemaining();
        boolean boolean32 = inflater29.needsDictionary();
        boolean boolean33 = inflater29.needsInput();
        int int34 = inflater29.getRemaining();
        java.util.zip.Inflater inflater35 = new java.util.zip.Inflater();
        boolean boolean36 = inflater35.finished();
        int int37 = inflater35.getRemaining();
        boolean boolean38 = inflater35.finished();
        byte[] byteArray45 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater35.setInput(byteArray45);
        int int47 = inflater29.inflate(byteArray45);
        inflater22.setInput(byteArray45);
        int int49 = inflater16.inflate(byteArray45);
        inflater4.setInput(byteArray45, 0, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int53 = inflater0.inflate(byteArray45);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.reset();
        long long6 = inflater0.getBytesWritten();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long8 = inflater0.getBytesWritten();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        inflater0.end();
        java.util.zip.Inflater inflater2 = new java.util.zip.Inflater();
        boolean boolean3 = inflater2.needsDictionary();
        int int4 = inflater2.getTotalOut();
        int int5 = inflater2.getTotalOut();
        long long6 = inflater2.getBytesWritten();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.needsDictionary();
        long long11 = inflater7.getBytesRead();
        boolean boolean12 = inflater7.needsDictionary();
        java.util.zip.Inflater inflater13 = new java.util.zip.Inflater();
        byte[] byteArray15 = new byte[] { (byte) 1 };
        int int16 = inflater13.inflate(byteArray15);
        long long17 = inflater13.getBytesWritten();
        inflater13.reset();
        long long19 = inflater13.getBytesWritten();
        java.util.zip.Inflater inflater20 = new java.util.zip.Inflater();
        boolean boolean21 = inflater20.finished();
        int int22 = inflater20.getRemaining();
        boolean boolean23 = inflater20.needsDictionary();
        boolean boolean24 = inflater20.needsInput();
        int int25 = inflater20.getRemaining();
        java.util.zip.Inflater inflater26 = new java.util.zip.Inflater();
        boolean boolean27 = inflater26.finished();
        int int28 = inflater26.getRemaining();
        boolean boolean29 = inflater26.finished();
        byte[] byteArray36 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater26.setInput(byteArray36);
        int int38 = inflater20.inflate(byteArray36);
        inflater13.setInput(byteArray36);
        inflater7.setInput(byteArray36);
        int int41 = inflater2.inflate(byteArray36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        inflater0.setDictionary(byteArray36);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        int int4 = inflater0.getAdler();
        inflater0.reset();
        long long6 = inflater0.getBytesWritten();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long8 = inflater0.getBytesRead();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        inflater0.reset();
        inflater0.end();
        inflater0.end();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        boolean boolean6 = inflater5.finished();
        int int7 = inflater5.getRemaining();
        boolean boolean8 = inflater5.needsDictionary();
        boolean boolean9 = inflater5.needsInput();
        int int10 = inflater5.getRemaining();
        java.util.zip.Inflater inflater11 = new java.util.zip.Inflater();
        boolean boolean12 = inflater11.finished();
        int int13 = inflater11.getRemaining();
        boolean boolean14 = inflater11.finished();
        byte[] byteArray21 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater11.setInput(byteArray21);
        int int23 = inflater5.inflate(byteArray21);
        boolean boolean24 = inflater5.finished();
        int int25 = inflater5.getAdler();
        boolean boolean26 = inflater5.finished();
        int int27 = inflater5.getAdler();
        java.util.zip.Inflater inflater28 = new java.util.zip.Inflater();
        boolean boolean29 = inflater28.finished();
        int int30 = inflater28.getRemaining();
        boolean boolean31 = inflater28.needsDictionary();
        boolean boolean32 = inflater28.needsInput();
        int int33 = inflater28.getRemaining();
        inflater28.reset();
        java.util.zip.Inflater inflater35 = new java.util.zip.Inflater();
        boolean boolean36 = inflater35.finished();
        int int37 = inflater35.getRemaining();
        boolean boolean38 = inflater35.finished();
        byte[] byteArray45 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater35.setInput(byteArray45);
        inflater28.setInput(byteArray45);
        int int48 = inflater5.inflate(byteArray45);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int49 = inflater0.inflate(byteArray45);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        long long4 = inflater0.getBytesRead();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(true);
        inflater1.end();
        boolean boolean3 = inflater1.needsInput();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater(true);
        int int6 = inflater5.getRemaining();
        long long7 = inflater5.getBytesRead();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        int int11 = inflater8.inflate(byteArray10);
        int int12 = inflater5.inflate(byteArray10);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater1.setDictionary(byteArray10);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(true);
        inflater1.end();
        boolean boolean3 = inflater1.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int4 = inflater1.getTotalIn();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        int int2 = inflater0.getTotalOut();
        int int3 = inflater0.getTotalOut();
        long long4 = inflater0.getBytesWritten();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        boolean boolean6 = inflater5.finished();
        int int7 = inflater5.getRemaining();
        boolean boolean8 = inflater5.needsDictionary();
        long long9 = inflater5.getBytesRead();
        boolean boolean10 = inflater5.needsDictionary();
        java.util.zip.Inflater inflater11 = new java.util.zip.Inflater();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        int int14 = inflater11.inflate(byteArray13);
        long long15 = inflater11.getBytesWritten();
        inflater11.reset();
        long long17 = inflater11.getBytesWritten();
        java.util.zip.Inflater inflater18 = new java.util.zip.Inflater();
        boolean boolean19 = inflater18.finished();
        int int20 = inflater18.getRemaining();
        boolean boolean21 = inflater18.needsDictionary();
        boolean boolean22 = inflater18.needsInput();
        int int23 = inflater18.getRemaining();
        java.util.zip.Inflater inflater24 = new java.util.zip.Inflater();
        boolean boolean25 = inflater24.finished();
        int int26 = inflater24.getRemaining();
        boolean boolean27 = inflater24.finished();
        byte[] byteArray34 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater24.setInput(byteArray34);
        int int36 = inflater18.inflate(byteArray34);
        inflater11.setInput(byteArray34);
        inflater5.setInput(byteArray34);
        int int39 = inflater0.inflate(byteArray34);
        int int40 = inflater0.getRemaining();
        int int41 = inflater0.getTotalIn();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int43 = inflater0.getAdler();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(true);
        inflater1.end();
        boolean boolean3 = inflater1.needsInput();
        java.util.zip.Inflater inflater4 = new java.util.zip.Inflater();
        boolean boolean5 = inflater4.needsDictionary();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        boolean boolean9 = inflater6.needsDictionary();
        boolean boolean10 = inflater6.needsInput();
        int int11 = inflater6.getRemaining();
        inflater6.reset();
        java.util.zip.Inflater inflater13 = new java.util.zip.Inflater();
        boolean boolean14 = inflater13.finished();
        int int15 = inflater13.getRemaining();
        boolean boolean16 = inflater13.finished();
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater13.setInput(byteArray23);
        inflater6.setInput(byteArray23);
        inflater4.setInput(byteArray23);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int27 = inflater1.inflate(byteArray23);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        long long4 = inflater0.getBytesRead();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long6 = inflater0.getBytesRead();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        inflater0.reset();
        boolean boolean2 = inflater0.needsInput();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int4 = inflater0.getAdler();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        int int4 = inflater0.getAdler();
        int int5 = inflater0.getAdler();
        boolean boolean6 = inflater0.needsDictionary();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int8 = inflater0.getTotalOut();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        boolean boolean20 = inflater0.finished();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int22 = inflater0.getTotalIn();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int6 = inflater0.getTotalOut();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        inflater0.end();
        boolean boolean22 = inflater0.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int23 = inflater0.getAdler();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        int int3 = inflater0.getTotalOut();
        inflater0.reset();
        boolean boolean5 = inflater0.needsInput();
        int int6 = inflater0.getRemaining();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        inflater0.end();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        int int4 = inflater0.getRemaining();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        boolean boolean6 = inflater5.finished();
        int int7 = inflater5.getRemaining();
        boolean boolean8 = inflater5.finished();
        int int9 = inflater5.getAdler();
        inflater5.reset();
        boolean boolean11 = inflater5.needsInput();
        java.util.zip.Inflater inflater12 = new java.util.zip.Inflater();
        boolean boolean13 = inflater12.finished();
        int int14 = inflater12.getRemaining();
        inflater12.end();
        boolean boolean16 = inflater12.needsInput();
        java.util.zip.Inflater inflater17 = new java.util.zip.Inflater();
        boolean boolean18 = inflater17.finished();
        int int19 = inflater17.getRemaining();
        boolean boolean20 = inflater17.needsDictionary();
        long long21 = inflater17.getBytesRead();
        boolean boolean22 = inflater17.needsInput();
        java.util.zip.Inflater inflater23 = new java.util.zip.Inflater();
        byte[] byteArray25 = new byte[] { (byte) 1 };
        int int26 = inflater23.inflate(byteArray25);
        long long27 = inflater23.getBytesWritten();
        inflater23.reset();
        long long29 = inflater23.getBytesWritten();
        java.util.zip.Inflater inflater30 = new java.util.zip.Inflater();
        boolean boolean31 = inflater30.finished();
        int int32 = inflater30.getRemaining();
        boolean boolean33 = inflater30.needsDictionary();
        boolean boolean34 = inflater30.needsInput();
        int int35 = inflater30.getRemaining();
        java.util.zip.Inflater inflater36 = new java.util.zip.Inflater();
        boolean boolean37 = inflater36.finished();
        int int38 = inflater36.getRemaining();
        boolean boolean39 = inflater36.finished();
        byte[] byteArray46 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater36.setInput(byteArray46);
        int int48 = inflater30.inflate(byteArray46);
        inflater23.setInput(byteArray46);
        int int50 = inflater17.inflate(byteArray46);
        inflater12.setInput(byteArray46);
        inflater5.setInput(byteArray46);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.setDictionary(byteArray46);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        boolean boolean21 = inflater0.finished();
        int int22 = inflater0.getRemaining();
        long long23 = inflater0.getBytesWritten();
        boolean boolean24 = inflater0.needsDictionary();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int26 = inflater0.getAdler();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        inflater0.reset();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        int int8 = inflater5.inflate(byteArray7);
        int int9 = inflater5.getTotalIn();
        java.util.zip.Inflater inflater10 = new java.util.zip.Inflater();
        byte[] byteArray12 = new byte[] { (byte) 1 };
        int int13 = inflater10.inflate(byteArray12);
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int19 = inflater10.inflate(byteArray18);
        int int20 = inflater5.inflate(byteArray18);
        inflater0.setInput(byteArray18);
        boolean boolean22 = inflater0.needsDictionary();
        boolean boolean23 = inflater0.finished();
        inflater0.end();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        boolean boolean26 = inflater25.finished();
        int int27 = inflater25.getRemaining();
        boolean boolean28 = inflater25.finished();
        java.util.zip.Inflater inflater29 = new java.util.zip.Inflater();
        boolean boolean30 = inflater29.finished();
        int int31 = inflater29.getRemaining();
        boolean boolean32 = inflater29.finished();
        byte[] byteArray39 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater29.setInput(byteArray39);
        inflater25.setInput(byteArray39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        inflater0.setDictionary(byteArray39);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        int int4 = inflater0.getAdler();
        inflater0.reset();
        long long6 = inflater0.getBytesWritten();
        inflater0.end();
        boolean boolean8 = inflater0.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int9 = inflater0.getTotalIn();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        boolean boolean4 = inflater0.finished();
        inflater0.end();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int7 = inflater0.getTotalIn();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsInput();
        inflater0.end();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        int int11 = inflater7.getAdler();
        java.util.zip.Inflater inflater12 = new java.util.zip.Inflater();
        boolean boolean13 = inflater12.finished();
        int int14 = inflater12.getRemaining();
        inflater12.end();
        boolean boolean16 = inflater12.needsInput();
        java.util.zip.Inflater inflater17 = new java.util.zip.Inflater();
        byte[] byteArray19 = new byte[] { (byte) 1 };
        int int20 = inflater17.inflate(byteArray19);
        inflater12.setInput(byteArray19);
        int int22 = inflater7.inflate(byteArray19);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int23 = inflater0.inflate(byteArray19);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        inflater0.end();
        int int2 = inflater0.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int3 = inflater0.getAdler();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsInput();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater(true);
        int int8 = inflater7.getRemaining();
        long long9 = inflater7.getBytesRead();
        java.util.zip.Inflater inflater10 = new java.util.zip.Inflater();
        byte[] byteArray12 = new byte[] { (byte) 1 };
        int int13 = inflater10.inflate(byteArray12);
        int int14 = inflater7.inflate(byteArray12);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.setDictionary(byteArray12);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        boolean boolean21 = inflater0.finished();
        int int22 = inflater0.getRemaining();
        long long23 = inflater0.getBytesWritten();
        boolean boolean24 = inflater0.needsDictionary();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int26 = inflater0.getTotalOut();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(true);
        inflater1.end();
        boolean boolean3 = inflater1.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long4 = inflater1.getBytesWritten();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        boolean boolean9 = inflater6.finished();
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater6.setInput(byteArray16);
        int int18 = inflater0.inflate(byteArray16);
        boolean boolean19 = inflater0.finished();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int21 = inflater0.getTotalIn();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        boolean boolean9 = inflater6.finished();
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater6.setInput(byteArray16);
        int int18 = inflater0.inflate(byteArray16);
        boolean boolean19 = inflater0.finished();
        inflater0.end();
        java.util.zip.Inflater inflater21 = new java.util.zip.Inflater();
        byte[] byteArray23 = new byte[] { (byte) 1 };
        int int24 = inflater21.inflate(byteArray23);
        int int25 = inflater21.getTotalIn();
        java.util.zip.Inflater inflater26 = new java.util.zip.Inflater();
        byte[] byteArray28 = new byte[] { (byte) 1 };
        int int29 = inflater26.inflate(byteArray28);
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int35 = inflater26.inflate(byteArray34);
        int int36 = inflater21.inflate(byteArray34);
        int int37 = inflater21.getTotalOut();
        int int38 = inflater21.getTotalOut();
        long long39 = inflater21.getBytesRead();
        java.util.zip.Inflater inflater40 = new java.util.zip.Inflater();
        boolean boolean41 = inflater40.finished();
        int int42 = inflater40.getRemaining();
        boolean boolean43 = inflater40.finished();
        long long44 = inflater40.getBytesRead();
        boolean boolean45 = inflater40.finished();
        long long46 = inflater40.getBytesRead();
        boolean boolean47 = inflater40.needsDictionary();
        boolean boolean48 = inflater40.needsDictionary();
        java.util.zip.Inflater inflater49 = new java.util.zip.Inflater();
        boolean boolean50 = inflater49.needsDictionary();
        int int51 = inflater49.getTotalOut();
        int int52 = inflater49.getTotalOut();
        boolean boolean53 = inflater49.needsInput();
        java.util.zip.Inflater inflater54 = new java.util.zip.Inflater();
        byte[] byteArray56 = new byte[] { (byte) 1 };
        int int57 = inflater54.inflate(byteArray56);
        inflater54.reset();
        java.util.zip.Inflater inflater59 = new java.util.zip.Inflater();
        byte[] byteArray61 = new byte[] { (byte) 1 };
        int int62 = inflater59.inflate(byteArray61);
        int int63 = inflater59.getTotalIn();
        java.util.zip.Inflater inflater64 = new java.util.zip.Inflater();
        byte[] byteArray66 = new byte[] { (byte) 1 };
        int int67 = inflater64.inflate(byteArray66);
        byte[] byteArray72 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int73 = inflater64.inflate(byteArray72);
        int int74 = inflater59.inflate(byteArray72);
        inflater54.setInput(byteArray72);
        inflater49.setInput(byteArray72);
        int int77 = inflater40.inflate(byteArray72);
        inflater21.setInput(byteArray72);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int79 = inflater0.inflate(byteArray72);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        inflater0.end();
        boolean boolean22 = inflater0.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int23 = inflater0.getTotalOut();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsDictionary();
        int int6 = inflater0.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int4 = inflater0.getTotalOut();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int4 = inflater0.getTotalIn();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int9 = inflater0.inflate(byteArray8);
        boolean boolean10 = inflater0.needsInput();
        boolean boolean11 = inflater0.needsDictionary();
        java.util.zip.Inflater inflater12 = new java.util.zip.Inflater();
        boolean boolean13 = inflater12.finished();
        int int14 = inflater12.getRemaining();
        boolean boolean15 = inflater12.needsDictionary();
        long long16 = inflater12.getBytesRead();
        boolean boolean17 = inflater12.needsInput();
        java.util.zip.Inflater inflater18 = new java.util.zip.Inflater();
        byte[] byteArray20 = new byte[] { (byte) 1 };
        int int21 = inflater18.inflate(byteArray20);
        long long22 = inflater18.getBytesWritten();
        inflater18.reset();
        long long24 = inflater18.getBytesWritten();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        boolean boolean26 = inflater25.finished();
        int int27 = inflater25.getRemaining();
        boolean boolean28 = inflater25.needsDictionary();
        boolean boolean29 = inflater25.needsInput();
        int int30 = inflater25.getRemaining();
        java.util.zip.Inflater inflater31 = new java.util.zip.Inflater();
        boolean boolean32 = inflater31.finished();
        int int33 = inflater31.getRemaining();
        boolean boolean34 = inflater31.finished();
        byte[] byteArray41 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater31.setInput(byteArray41);
        int int43 = inflater25.inflate(byteArray41);
        inflater18.setInput(byteArray41);
        int int45 = inflater12.inflate(byteArray41);
        inflater0.setInput(byteArray41, 0, (int) (byte) 0);
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater0.setInput(byteArray10);
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long13 = inflater0.getBytesRead();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        inflater0.reset();
        inflater0.end();
        inflater0.end();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        int int8 = inflater5.inflate(byteArray7);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int14 = inflater5.inflate(byteArray13);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int17 = inflater0.inflate(byteArray13, 0, 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        inflater0.reset();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        int int8 = inflater5.inflate(byteArray7);
        int int9 = inflater5.getTotalIn();
        java.util.zip.Inflater inflater10 = new java.util.zip.Inflater();
        byte[] byteArray12 = new byte[] { (byte) 1 };
        int int13 = inflater10.inflate(byteArray12);
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int19 = inflater10.inflate(byteArray18);
        int int20 = inflater5.inflate(byteArray18);
        inflater0.setInput(byteArray18);
        boolean boolean22 = inflater0.needsDictionary();
        boolean boolean23 = inflater0.finished();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int25 = inflater0.getTotalOut();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        int int4 = inflater0.getAdler();
        inflater0.reset();
        long long6 = inflater0.getBytesWritten();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsDictionary();
        int int6 = inflater0.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int7 = inflater0.getAdler();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        int int2 = inflater0.getTotalOut();
        int int3 = inflater0.getTotalOut();
        boolean boolean4 = inflater0.needsInput();
        long long5 = inflater0.getBytesWritten();
        inflater0.end();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.needsDictionary();
        long long11 = inflater7.getBytesRead();
        boolean boolean12 = inflater7.needsInput();
        int int13 = inflater7.getTotalOut();
        long long14 = inflater7.getBytesRead();
        java.util.zip.Inflater inflater15 = new java.util.zip.Inflater();
        boolean boolean16 = inflater15.finished();
        int int17 = inflater15.getRemaining();
        boolean boolean18 = inflater15.needsDictionary();
        boolean boolean19 = inflater15.needsInput();
        int int20 = inflater15.getRemaining();
        inflater15.reset();
        java.util.zip.Inflater inflater22 = new java.util.zip.Inflater();
        boolean boolean23 = inflater22.finished();
        int int24 = inflater22.getRemaining();
        boolean boolean25 = inflater22.finished();
        byte[] byteArray32 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater22.setInput(byteArray32);
        inflater15.setInput(byteArray32);
        int int37 = inflater7.inflate(byteArray32, 1, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        inflater0.setDictionary(byteArray32);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        inflater0.reset();
        boolean boolean2 = inflater0.needsInput();
        inflater0.end();
        boolean boolean4 = inflater0.needsDictionary();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int5 = inflater0.getTotalIn();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        boolean boolean9 = inflater6.finished();
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater6.setInput(byteArray16);
        int int18 = inflater0.inflate(byteArray16);
        boolean boolean19 = inflater0.finished();
        int int20 = inflater0.getTotalOut();
        java.util.zip.Inflater inflater21 = new java.util.zip.Inflater();
        boolean boolean22 = inflater21.finished();
        int int23 = inflater21.getRemaining();
        boolean boolean24 = inflater21.needsDictionary();
        long long25 = inflater21.getBytesRead();
        boolean boolean26 = inflater21.needsDictionary();
        java.util.zip.Inflater inflater27 = new java.util.zip.Inflater();
        byte[] byteArray29 = new byte[] { (byte) 1 };
        int int30 = inflater27.inflate(byteArray29);
        long long31 = inflater27.getBytesWritten();
        inflater27.reset();
        long long33 = inflater27.getBytesWritten();
        java.util.zip.Inflater inflater34 = new java.util.zip.Inflater();
        boolean boolean35 = inflater34.finished();
        int int36 = inflater34.getRemaining();
        boolean boolean37 = inflater34.needsDictionary();
        boolean boolean38 = inflater34.needsInput();
        int int39 = inflater34.getRemaining();
        java.util.zip.Inflater inflater40 = new java.util.zip.Inflater();
        boolean boolean41 = inflater40.finished();
        int int42 = inflater40.getRemaining();
        boolean boolean43 = inflater40.finished();
        byte[] byteArray50 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater40.setInput(byteArray50);
        int int52 = inflater34.inflate(byteArray50);
        inflater27.setInput(byteArray50);
        inflater21.setInput(byteArray50);
        int int55 = inflater0.inflate(byteArray50);
        java.util.zip.Inflater inflater56 = new java.util.zip.Inflater();
        boolean boolean57 = inflater56.finished();
        int int58 = inflater56.getRemaining();
        boolean boolean59 = inflater56.needsInput();
        java.util.zip.Inflater inflater60 = new java.util.zip.Inflater();
        boolean boolean61 = inflater60.finished();
        int int62 = inflater60.getRemaining();
        boolean boolean63 = inflater60.finished();
        byte[] byteArray70 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater60.setInput(byteArray70);
        inflater56.setInput(byteArray70);
        int int73 = inflater0.inflate(byteArray70);
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        boolean boolean5 = inflater0.needsInput();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        boolean boolean9 = inflater6.needsDictionary();
        boolean boolean10 = inflater6.needsInput();
        int int11 = inflater6.getRemaining();
        java.util.zip.Inflater inflater12 = new java.util.zip.Inflater();
        boolean boolean13 = inflater12.finished();
        int int14 = inflater12.getRemaining();
        boolean boolean15 = inflater12.finished();
        byte[] byteArray22 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater12.setInput(byteArray22);
        int int24 = inflater6.inflate(byteArray22);
        boolean boolean25 = inflater6.finished();
        int int26 = inflater6.getTotalOut();
        java.util.zip.Inflater inflater27 = new java.util.zip.Inflater();
        boolean boolean28 = inflater27.finished();
        int int29 = inflater27.getRemaining();
        boolean boolean30 = inflater27.needsDictionary();
        long long31 = inflater27.getBytesRead();
        boolean boolean32 = inflater27.needsDictionary();
        java.util.zip.Inflater inflater33 = new java.util.zip.Inflater();
        byte[] byteArray35 = new byte[] { (byte) 1 };
        int int36 = inflater33.inflate(byteArray35);
        long long37 = inflater33.getBytesWritten();
        inflater33.reset();
        long long39 = inflater33.getBytesWritten();
        java.util.zip.Inflater inflater40 = new java.util.zip.Inflater();
        boolean boolean41 = inflater40.finished();
        int int42 = inflater40.getRemaining();
        boolean boolean43 = inflater40.needsDictionary();
        boolean boolean44 = inflater40.needsInput();
        int int45 = inflater40.getRemaining();
        java.util.zip.Inflater inflater46 = new java.util.zip.Inflater();
        boolean boolean47 = inflater46.finished();
        int int48 = inflater46.getRemaining();
        boolean boolean49 = inflater46.finished();
        byte[] byteArray56 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater46.setInput(byteArray56);
        int int58 = inflater40.inflate(byteArray56);
        inflater33.setInput(byteArray56);
        inflater27.setInput(byteArray56);
        int int61 = inflater6.inflate(byteArray56);
        java.util.zip.Inflater inflater62 = new java.util.zip.Inflater();
        boolean boolean63 = inflater62.finished();
        int int64 = inflater62.getRemaining();
        boolean boolean65 = inflater62.needsInput();
        java.util.zip.Inflater inflater66 = new java.util.zip.Inflater();
        boolean boolean67 = inflater66.finished();
        int int68 = inflater66.getRemaining();
        boolean boolean69 = inflater66.finished();
        byte[] byteArray76 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater66.setInput(byteArray76);
        inflater62.setInput(byteArray76);
        int int79 = inflater6.inflate(byteArray76);
        inflater0.setInput(byteArray76);
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int82 = inflater0.getTotalIn();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(true);
        inflater1.end();
        boolean boolean3 = inflater1.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int4 = inflater1.getTotalOut();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        int int2 = inflater0.getTotalOut();
        int int3 = inflater0.getAdler();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long5 = inflater0.getBytesRead();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        inflater0.reset();
        boolean boolean2 = inflater0.needsInput();
        inflater0.end();
        boolean boolean4 = inflater0.needsDictionary();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long5 = inflater0.getBytesWritten();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        int int8 = inflater5.inflate(byteArray7);
        inflater0.setInput(byteArray7);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int10 = inflater0.getAdler();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        inflater0.reset();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int4 = inflater0.getTotalIn();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        inflater0.end();
        int int2 = inflater0.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getTotalIn();
        int int5 = inflater0.getTotalIn();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        boolean boolean9 = inflater6.finished();
        long long10 = inflater6.getBytesRead();
        boolean boolean11 = inflater6.finished();
        long long12 = inflater6.getBytesRead();
        boolean boolean13 = inflater6.needsDictionary();
        boolean boolean14 = inflater6.needsDictionary();
        java.util.zip.Inflater inflater15 = new java.util.zip.Inflater();
        boolean boolean16 = inflater15.needsDictionary();
        int int17 = inflater15.getTotalOut();
        int int18 = inflater15.getTotalOut();
        boolean boolean19 = inflater15.needsInput();
        java.util.zip.Inflater inflater20 = new java.util.zip.Inflater();
        byte[] byteArray22 = new byte[] { (byte) 1 };
        int int23 = inflater20.inflate(byteArray22);
        inflater20.reset();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        byte[] byteArray27 = new byte[] { (byte) 1 };
        int int28 = inflater25.inflate(byteArray27);
        int int29 = inflater25.getTotalIn();
        java.util.zip.Inflater inflater30 = new java.util.zip.Inflater();
        byte[] byteArray32 = new byte[] { (byte) 1 };
        int int33 = inflater30.inflate(byteArray32);
        byte[] byteArray38 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int39 = inflater30.inflate(byteArray38);
        int int40 = inflater25.inflate(byteArray38);
        inflater20.setInput(byteArray38);
        inflater15.setInput(byteArray38);
        int int43 = inflater6.inflate(byteArray38);
        inflater0.setInput(byteArray38);
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int46 = inflater0.getTotalOut();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsInput();
        boolean boolean6 = inflater0.finished();
        int int7 = inflater0.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int8 = inflater0.getAdler();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(true);
        inflater1.end();
        int int3 = inflater1.getRemaining();
        boolean boolean4 = inflater1.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater1.reset();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        boolean boolean21 = inflater0.finished();
        int int22 = inflater0.getRemaining();
        inflater0.end();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int25 = inflater0.getTotalIn();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsInput();
        boolean boolean6 = inflater0.finished();
        int int7 = inflater0.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long8 = inflater0.getBytesRead();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        java.util.zip.Inflater inflater4 = new java.util.zip.Inflater();
        boolean boolean5 = inflater4.finished();
        int int6 = inflater4.getRemaining();
        boolean boolean7 = inflater4.finished();
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater4.setInput(byteArray14);
        inflater0.setInput(byteArray14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long17 = inflater0.getBytesWritten();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getTotalIn();
        boolean boolean5 = inflater0.needsDictionary();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long7 = inflater0.getBytesWritten();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        java.util.zip.Inflater inflater4 = new java.util.zip.Inflater();
        boolean boolean5 = inflater4.finished();
        int int6 = inflater4.getRemaining();
        boolean boolean7 = inflater4.finished();
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater4.setInput(byteArray14);
        inflater0.setInput(byteArray14);
        boolean boolean17 = inflater0.needsDictionary();
        boolean boolean18 = inflater0.finished();
        java.util.zip.Inflater inflater19 = new java.util.zip.Inflater();
        boolean boolean20 = inflater19.needsDictionary();
        int int21 = inflater19.getTotalOut();
        int int22 = inflater19.getTotalOut();
        int int23 = inflater19.getAdler();
        boolean boolean24 = inflater19.needsDictionary();
        int int25 = inflater19.getTotalOut();
        java.util.zip.Inflater inflater26 = new java.util.zip.Inflater();
        byte[] byteArray28 = new byte[] { (byte) 1 };
        int int29 = inflater26.inflate(byteArray28);
        boolean boolean30 = inflater26.finished();
        inflater26.end();
        inflater26.end();
        boolean boolean33 = inflater26.needsInput();
        java.util.zip.Inflater inflater34 = new java.util.zip.Inflater();
        boolean boolean35 = inflater34.finished();
        int int36 = inflater34.getRemaining();
        boolean boolean37 = inflater34.needsDictionary();
        boolean boolean38 = inflater34.needsInput();
        int int39 = inflater34.getRemaining();
        inflater34.reset();
        boolean boolean41 = inflater34.needsDictionary();
        int int42 = inflater34.getTotalIn();
        java.util.zip.Inflater inflater43 = new java.util.zip.Inflater();
        boolean boolean44 = inflater43.finished();
        int int45 = inflater43.getRemaining();
        boolean boolean46 = inflater43.needsDictionary();
        boolean boolean47 = inflater43.needsInput();
        int int48 = inflater43.getRemaining();
        inflater43.reset();
        java.util.zip.Inflater inflater50 = new java.util.zip.Inflater();
        boolean boolean51 = inflater50.finished();
        int int52 = inflater50.getRemaining();
        boolean boolean53 = inflater50.needsDictionary();
        boolean boolean54 = inflater50.needsInput();
        int int55 = inflater50.getRemaining();
        inflater50.reset();
        java.util.zip.Inflater inflater57 = new java.util.zip.Inflater();
        boolean boolean58 = inflater57.finished();
        int int59 = inflater57.getRemaining();
        boolean boolean60 = inflater57.finished();
        byte[] byteArray67 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater57.setInput(byteArray67);
        inflater50.setInput(byteArray67);
        int int72 = inflater43.inflate(byteArray67, 0, (int) (byte) 0);
        int int73 = inflater34.inflate(byteArray67);
        inflater26.setInput(byteArray67);
        int int77 = inflater19.inflate(byteArray67, 0, (int) (byte) 0);
        inflater0.setInput(byteArray67);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int79 = inflater0.getAdler();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.reset();
        int int6 = inflater0.getRemaining();
        inflater0.end();
        int int8 = inflater0.getRemaining();
        boolean boolean9 = inflater0.needsDictionary();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int10 = inflater0.getTotalIn();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        long long4 = inflater0.getBytesRead();
        inflater0.end();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.needsDictionary();
        int int8 = inflater6.getTotalOut();
        int int9 = inflater6.getTotalOut();
        int int10 = inflater6.getAdler();
        boolean boolean11 = inflater6.needsDictionary();
        int int12 = inflater6.getTotalOut();
        java.util.zip.Inflater inflater13 = new java.util.zip.Inflater();
        byte[] byteArray15 = new byte[] { (byte) 1 };
        int int16 = inflater13.inflate(byteArray15);
        boolean boolean17 = inflater13.finished();
        inflater13.end();
        inflater13.end();
        boolean boolean20 = inflater13.needsInput();
        java.util.zip.Inflater inflater21 = new java.util.zip.Inflater();
        boolean boolean22 = inflater21.finished();
        int int23 = inflater21.getRemaining();
        boolean boolean24 = inflater21.needsDictionary();
        boolean boolean25 = inflater21.needsInput();
        int int26 = inflater21.getRemaining();
        inflater21.reset();
        boolean boolean28 = inflater21.needsDictionary();
        int int29 = inflater21.getTotalIn();
        java.util.zip.Inflater inflater30 = new java.util.zip.Inflater();
        boolean boolean31 = inflater30.finished();
        int int32 = inflater30.getRemaining();
        boolean boolean33 = inflater30.needsDictionary();
        boolean boolean34 = inflater30.needsInput();
        int int35 = inflater30.getRemaining();
        inflater30.reset();
        java.util.zip.Inflater inflater37 = new java.util.zip.Inflater();
        boolean boolean38 = inflater37.finished();
        int int39 = inflater37.getRemaining();
        boolean boolean40 = inflater37.needsDictionary();
        boolean boolean41 = inflater37.needsInput();
        int int42 = inflater37.getRemaining();
        inflater37.reset();
        java.util.zip.Inflater inflater44 = new java.util.zip.Inflater();
        boolean boolean45 = inflater44.finished();
        int int46 = inflater44.getRemaining();
        boolean boolean47 = inflater44.finished();
        byte[] byteArray54 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater44.setInput(byteArray54);
        inflater37.setInput(byteArray54);
        int int59 = inflater30.inflate(byteArray54, 0, (int) (byte) 0);
        int int60 = inflater21.inflate(byteArray54);
        inflater13.setInput(byteArray54);
        int int64 = inflater6.inflate(byteArray54, 0, (int) (byte) 0);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int65 = inflater0.inflate(byteArray54);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        long long4 = inflater0.getBytesRead();
        long long5 = inflater0.getBytesWritten();
        boolean boolean6 = inflater0.finished();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.needsDictionary();
        boolean boolean11 = inflater7.needsInput();
        int int12 = inflater7.getRemaining();
        inflater7.reset();
        boolean boolean14 = inflater7.needsDictionary();
        int int15 = inflater7.getTotalOut();
        java.util.zip.Inflater inflater16 = new java.util.zip.Inflater();
        byte[] byteArray18 = new byte[] { (byte) 1 };
        int int19 = inflater16.inflate(byteArray18);
        boolean boolean20 = inflater16.finished();
        inflater16.end();
        inflater16.end();
        boolean boolean23 = inflater16.needsInput();
        java.util.zip.Inflater inflater24 = new java.util.zip.Inflater();
        boolean boolean25 = inflater24.finished();
        int int26 = inflater24.getRemaining();
        boolean boolean27 = inflater24.needsDictionary();
        boolean boolean28 = inflater24.needsInput();
        int int29 = inflater24.getRemaining();
        java.util.zip.Inflater inflater30 = new java.util.zip.Inflater();
        boolean boolean31 = inflater30.finished();
        int int32 = inflater30.getRemaining();
        boolean boolean33 = inflater30.finished();
        byte[] byteArray40 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater30.setInput(byteArray40);
        int int42 = inflater24.inflate(byteArray40);
        boolean boolean43 = inflater24.finished();
        int int44 = inflater24.getAdler();
        boolean boolean45 = inflater24.finished();
        int int46 = inflater24.getAdler();
        boolean boolean47 = inflater24.needsInput();
        java.util.zip.Inflater inflater48 = new java.util.zip.Inflater();
        byte[] byteArray50 = new byte[] { (byte) 1 };
        int int51 = inflater48.inflate(byteArray50);
        int int52 = inflater48.getTotalIn();
        java.util.zip.Inflater inflater53 = new java.util.zip.Inflater();
        byte[] byteArray55 = new byte[] { (byte) 1 };
        int int56 = inflater53.inflate(byteArray55);
        byte[] byteArray61 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int62 = inflater53.inflate(byteArray61);
        int int63 = inflater48.inflate(byteArray61);
        int int64 = inflater24.inflate(byteArray61);
        inflater16.setInput(byteArray61, (int) (byte) 0, (int) (short) 1);
        int int68 = inflater7.inflate(byteArray61);
        inflater0.setInput(byteArray61, (int) (byte) 0, 1);
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long73 = inflater0.getBytesRead();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        boolean boolean4 = inflater0.finished();
        inflater0.end();
        inflater0.end();
        boolean boolean7 = inflater0.needsDictionary();
        int int8 = inflater0.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.reset();
        long long6 = inflater0.getBytesWritten();
        inflater0.end();
        inflater0.end();
        boolean boolean9 = inflater0.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int10 = inflater0.getTotalOut();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.reset();
        long long6 = inflater0.getBytesWritten();
        inflater0.end();
        inflater0.end();
        int int9 = inflater0.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int10 = inflater0.getTotalOut();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getTotalIn();
        int int5 = inflater0.getTotalIn();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        boolean boolean9 = inflater6.finished();
        long long10 = inflater6.getBytesRead();
        boolean boolean11 = inflater6.finished();
        long long12 = inflater6.getBytesRead();
        boolean boolean13 = inflater6.needsDictionary();
        boolean boolean14 = inflater6.needsDictionary();
        java.util.zip.Inflater inflater15 = new java.util.zip.Inflater();
        boolean boolean16 = inflater15.needsDictionary();
        int int17 = inflater15.getTotalOut();
        int int18 = inflater15.getTotalOut();
        boolean boolean19 = inflater15.needsInput();
        java.util.zip.Inflater inflater20 = new java.util.zip.Inflater();
        byte[] byteArray22 = new byte[] { (byte) 1 };
        int int23 = inflater20.inflate(byteArray22);
        inflater20.reset();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        byte[] byteArray27 = new byte[] { (byte) 1 };
        int int28 = inflater25.inflate(byteArray27);
        int int29 = inflater25.getTotalIn();
        java.util.zip.Inflater inflater30 = new java.util.zip.Inflater();
        byte[] byteArray32 = new byte[] { (byte) 1 };
        int int33 = inflater30.inflate(byteArray32);
        byte[] byteArray38 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int39 = inflater30.inflate(byteArray38);
        int int40 = inflater25.inflate(byteArray38);
        inflater20.setInput(byteArray38);
        inflater15.setInput(byteArray38);
        int int43 = inflater6.inflate(byteArray38);
        inflater0.setInput(byteArray38);
        inflater0.end();
        java.util.zip.Inflater inflater46 = new java.util.zip.Inflater();
        byte[] byteArray48 = new byte[] { (byte) 1 };
        int int49 = inflater46.inflate(byteArray48);
        int int50 = inflater46.getTotalIn();
        java.util.zip.Inflater inflater51 = new java.util.zip.Inflater();
        byte[] byteArray53 = new byte[] { (byte) 1 };
        int int54 = inflater51.inflate(byteArray53);
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int60 = inflater51.inflate(byteArray59);
        int int61 = inflater46.inflate(byteArray59);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        inflater0.setDictionary(byteArray59);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(false);
        int int2 = inflater1.getAdler();
        long long3 = inflater1.getBytesWritten();
        inflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int5 = inflater1.getAdler();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        int int4 = inflater0.getAdler();
        int int5 = inflater0.getAdler();
        boolean boolean6 = inflater0.finished();
        int int7 = inflater0.getRemaining();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int9 = inflater0.getTotalOut();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.reset();
        long long6 = inflater0.getBytesWritten();
        int int7 = inflater0.getTotalIn();
        boolean boolean8 = inflater0.needsDictionary();
        int int9 = inflater0.getTotalIn();
        long long10 = inflater0.getBytesWritten();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long12 = inflater0.getBytesWritten();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        boolean boolean21 = inflater0.finished();
        int int22 = inflater0.getRemaining();
        long long23 = inflater0.getBytesWritten();
        boolean boolean24 = inflater0.needsDictionary();
        inflater0.end();
        boolean boolean26 = inflater0.needsDictionary();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long27 = inflater0.getBytesWritten();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(true);
        int int2 = inflater1.getRemaining();
        long long3 = inflater1.getBytesRead();
        java.util.zip.Inflater inflater4 = new java.util.zip.Inflater();
        boolean boolean5 = inflater4.finished();
        int int6 = inflater4.getRemaining();
        inflater4.end();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        boolean boolean9 = inflater8.finished();
        int int10 = inflater8.getRemaining();
        boolean boolean11 = inflater8.finished();
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater8.setInput(byteArray18);
        inflater4.setInput(byteArray18);
        inflater1.setInput(byteArray18, (int) (byte) 1, (int) (short) 1);
        int int24 = inflater1.getTotalIn();
        int int25 = inflater1.getRemaining();
        int int26 = inflater1.getAdler();
        inflater1.end();
        boolean boolean28 = inflater1.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long29 = inflater1.getBytesWritten();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int9 = inflater0.inflate(byteArray8);
        int int10 = inflater0.getTotalIn();
        int int11 = inflater0.getRemaining();
        int int12 = inflater0.getTotalOut();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        boolean boolean21 = inflater0.needsDictionary();
        long long22 = inflater0.getBytesWritten();
        int int23 = inflater0.getRemaining();
        int int24 = inflater0.getRemaining();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        byte[] byteArray27 = new byte[] { (byte) 1 };
        int int28 = inflater25.inflate(byteArray27);
        boolean boolean29 = inflater25.finished();
        inflater25.end();
        inflater25.end();
        boolean boolean32 = inflater25.needsDictionary();
        java.util.zip.Inflater inflater33 = new java.util.zip.Inflater();
        boolean boolean34 = inflater33.finished();
        int int35 = inflater33.getRemaining();
        boolean boolean36 = inflater33.needsInput();
        java.util.zip.Inflater inflater37 = new java.util.zip.Inflater();
        boolean boolean38 = inflater37.finished();
        int int39 = inflater37.getRemaining();
        boolean boolean40 = inflater37.finished();
        byte[] byteArray47 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater37.setInput(byteArray47);
        inflater33.setInput(byteArray47);
        inflater25.setInput(byteArray47);
        inflater0.setInput(byteArray47);
        int int52 = inflater0.getRemaining();
        long long53 = inflater0.getBytesRead();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int55 = inflater0.getTotalOut();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        long long4 = inflater0.getBytesRead();
        boolean boolean5 = inflater0.needsDictionary();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        byte[] byteArray8 = new byte[] { (byte) 1 };
        int int9 = inflater6.inflate(byteArray8);
        long long10 = inflater6.getBytesWritten();
        inflater6.reset();
        long long12 = inflater6.getBytesWritten();
        java.util.zip.Inflater inflater13 = new java.util.zip.Inflater();
        boolean boolean14 = inflater13.finished();
        int int15 = inflater13.getRemaining();
        boolean boolean16 = inflater13.needsDictionary();
        boolean boolean17 = inflater13.needsInput();
        int int18 = inflater13.getRemaining();
        java.util.zip.Inflater inflater19 = new java.util.zip.Inflater();
        boolean boolean20 = inflater19.finished();
        int int21 = inflater19.getRemaining();
        boolean boolean22 = inflater19.finished();
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater19.setInput(byteArray29);
        int int31 = inflater13.inflate(byteArray29);
        inflater6.setInput(byteArray29);
        inflater0.setInput(byteArray29);
        boolean boolean34 = inflater0.needsInput();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        boolean boolean21 = inflater0.needsDictionary();
        long long22 = inflater0.getBytesWritten();
        boolean boolean23 = inflater0.needsDictionary();
        long long24 = inflater0.getBytesWritten();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int26 = inflater0.getAdler();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        boolean boolean9 = inflater6.finished();
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater6.setInput(byteArray16);
        int int18 = inflater0.inflate(byteArray16);
        boolean boolean19 = inflater0.finished();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int21 = inflater0.getTotalOut();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        boolean boolean20 = inflater0.finished();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int22 = inflater0.getTotalOut();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getRemaining();
        boolean boolean21 = inflater0.finished();
        inflater0.end();
        int int23 = inflater0.getRemaining();
        java.util.zip.Inflater inflater24 = new java.util.zip.Inflater();
        boolean boolean25 = inflater24.finished();
        int int26 = inflater24.getRemaining();
        boolean boolean27 = inflater24.needsDictionary();
        boolean boolean28 = inflater24.needsInput();
        int int29 = inflater24.getRemaining();
        java.util.zip.Inflater inflater30 = new java.util.zip.Inflater();
        boolean boolean31 = inflater30.finished();
        int int32 = inflater30.getRemaining();
        boolean boolean33 = inflater30.finished();
        byte[] byteArray40 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater30.setInput(byteArray40);
        int int42 = inflater24.inflate(byteArray40);
        boolean boolean43 = inflater24.finished();
        int int44 = inflater24.getAdler();
        boolean boolean45 = inflater24.finished();
        java.util.zip.Inflater inflater46 = new java.util.zip.Inflater();
        boolean boolean47 = inflater46.finished();
        int int48 = inflater46.getRemaining();
        boolean boolean49 = inflater46.needsDictionary();
        long long50 = inflater46.getBytesRead();
        boolean boolean51 = inflater46.needsDictionary();
        java.util.zip.Inflater inflater52 = new java.util.zip.Inflater();
        byte[] byteArray54 = new byte[] { (byte) 1 };
        int int55 = inflater52.inflate(byteArray54);
        long long56 = inflater52.getBytesWritten();
        inflater52.reset();
        long long58 = inflater52.getBytesWritten();
        java.util.zip.Inflater inflater59 = new java.util.zip.Inflater();
        boolean boolean60 = inflater59.finished();
        int int61 = inflater59.getRemaining();
        boolean boolean62 = inflater59.needsDictionary();
        boolean boolean63 = inflater59.needsInput();
        int int64 = inflater59.getRemaining();
        java.util.zip.Inflater inflater65 = new java.util.zip.Inflater();
        boolean boolean66 = inflater65.finished();
        int int67 = inflater65.getRemaining();
        boolean boolean68 = inflater65.finished();
        byte[] byteArray75 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater65.setInput(byteArray75);
        int int77 = inflater59.inflate(byteArray75);
        inflater52.setInput(byteArray75);
        inflater46.setInput(byteArray75);
        inflater24.setInput(byteArray75);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int81 = inflater0.inflate(byteArray75);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        boolean boolean21 = inflater0.needsDictionary();
        long long22 = inflater0.getBytesWritten();
        boolean boolean23 = inflater0.needsDictionary();
        long long24 = inflater0.getBytesWritten();
        boolean boolean25 = inflater0.needsInput();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int27 = inflater0.getAdler();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        inflater0.reset();
        inflater0.end();
        inflater0.end();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater(true);
        int int7 = inflater6.getRemaining();
        long long8 = inflater6.getBytesRead();
        java.util.zip.Inflater inflater9 = new java.util.zip.Inflater();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        int int12 = inflater9.inflate(byteArray11);
        int int13 = inflater6.inflate(byteArray11);
        int int14 = inflater6.getAdler();
        java.util.zip.Inflater inflater15 = new java.util.zip.Inflater();
        byte[] byteArray17 = new byte[] { (byte) 1 };
        int int18 = inflater15.inflate(byteArray17);
        int int19 = inflater15.getTotalIn();
        int int20 = inflater15.getTotalIn();
        java.util.zip.Inflater inflater21 = new java.util.zip.Inflater();
        boolean boolean22 = inflater21.finished();
        int int23 = inflater21.getRemaining();
        boolean boolean24 = inflater21.finished();
        long long25 = inflater21.getBytesRead();
        boolean boolean26 = inflater21.finished();
        long long27 = inflater21.getBytesRead();
        boolean boolean28 = inflater21.needsDictionary();
        boolean boolean29 = inflater21.needsDictionary();
        java.util.zip.Inflater inflater30 = new java.util.zip.Inflater();
        boolean boolean31 = inflater30.needsDictionary();
        int int32 = inflater30.getTotalOut();
        int int33 = inflater30.getTotalOut();
        boolean boolean34 = inflater30.needsInput();
        java.util.zip.Inflater inflater35 = new java.util.zip.Inflater();
        byte[] byteArray37 = new byte[] { (byte) 1 };
        int int38 = inflater35.inflate(byteArray37);
        inflater35.reset();
        java.util.zip.Inflater inflater40 = new java.util.zip.Inflater();
        byte[] byteArray42 = new byte[] { (byte) 1 };
        int int43 = inflater40.inflate(byteArray42);
        int int44 = inflater40.getTotalIn();
        java.util.zip.Inflater inflater45 = new java.util.zip.Inflater();
        byte[] byteArray47 = new byte[] { (byte) 1 };
        int int48 = inflater45.inflate(byteArray47);
        byte[] byteArray53 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int54 = inflater45.inflate(byteArray53);
        int int55 = inflater40.inflate(byteArray53);
        inflater35.setInput(byteArray53);
        inflater30.setInput(byteArray53);
        int int58 = inflater21.inflate(byteArray53);
        inflater15.setInput(byteArray53);
        inflater6.setDictionary(byteArray53);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int63 = inflater0.inflate(byteArray53, (int) (byte) 1, (int) (short) 0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(false);
        int int2 = inflater1.getAdler();
        long long3 = inflater1.getBytesWritten();
        inflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long5 = inflater1.getBytesWritten();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        inflater0.reset();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int4 = inflater0.getTotalOut();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getTotalIn();
        boolean boolean5 = inflater0.needsDictionary();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        int int8 = inflater5.inflate(byteArray7);
        inflater0.setInput(byteArray7);
        int int10 = inflater0.getRemaining();
        boolean boolean11 = inflater0.needsDictionary();
        inflater0.end();
        java.util.zip.Inflater inflater13 = new java.util.zip.Inflater();
        boolean boolean14 = inflater13.needsDictionary();
        int int15 = inflater13.getTotalOut();
        int int16 = inflater13.getTotalOut();
        long long17 = inflater13.getBytesWritten();
        java.util.zip.Inflater inflater18 = new java.util.zip.Inflater();
        boolean boolean19 = inflater18.finished();
        int int20 = inflater18.getRemaining();
        boolean boolean21 = inflater18.needsDictionary();
        long long22 = inflater18.getBytesRead();
        boolean boolean23 = inflater18.needsDictionary();
        java.util.zip.Inflater inflater24 = new java.util.zip.Inflater();
        byte[] byteArray26 = new byte[] { (byte) 1 };
        int int27 = inflater24.inflate(byteArray26);
        long long28 = inflater24.getBytesWritten();
        inflater24.reset();
        long long30 = inflater24.getBytesWritten();
        java.util.zip.Inflater inflater31 = new java.util.zip.Inflater();
        boolean boolean32 = inflater31.finished();
        int int33 = inflater31.getRemaining();
        boolean boolean34 = inflater31.needsDictionary();
        boolean boolean35 = inflater31.needsInput();
        int int36 = inflater31.getRemaining();
        java.util.zip.Inflater inflater37 = new java.util.zip.Inflater();
        boolean boolean38 = inflater37.finished();
        int int39 = inflater37.getRemaining();
        boolean boolean40 = inflater37.finished();
        byte[] byteArray47 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater37.setInput(byteArray47);
        int int49 = inflater31.inflate(byteArray47);
        inflater24.setInput(byteArray47);
        inflater18.setInput(byteArray47);
        int int52 = inflater13.inflate(byteArray47);
        int int53 = inflater13.getTotalOut();
        int int54 = inflater13.getTotalIn();
        java.util.zip.Inflater inflater55 = new java.util.zip.Inflater();
        byte[] byteArray57 = new byte[] { (byte) 1 };
        int int58 = inflater55.inflate(byteArray57);
        inflater55.reset();
        java.util.zip.Inflater inflater60 = new java.util.zip.Inflater();
        byte[] byteArray62 = new byte[] { (byte) 1 };
        int int63 = inflater60.inflate(byteArray62);
        int int64 = inflater60.getTotalIn();
        java.util.zip.Inflater inflater65 = new java.util.zip.Inflater();
        byte[] byteArray67 = new byte[] { (byte) 1 };
        int int68 = inflater65.inflate(byteArray67);
        byte[] byteArray73 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int74 = inflater65.inflate(byteArray73);
        int int75 = inflater60.inflate(byteArray73);
        inflater55.setInput(byteArray73);
        int int77 = inflater13.inflate(byteArray73);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.setDictionary(byteArray73);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getAdler();
        boolean boolean5 = inflater0.finished();
        inflater0.end();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        byte[] byteArray9 = new byte[] { (byte) 1 };
        int int10 = inflater7.inflate(byteArray9);
        long long11 = inflater7.getBytesWritten();
        inflater7.reset();
        long long13 = inflater7.getBytesWritten();
        int int14 = inflater7.getTotalIn();
        boolean boolean15 = inflater7.needsDictionary();
        int int16 = inflater7.getTotalOut();
        int int17 = inflater7.getTotalOut();
        boolean boolean18 = inflater7.needsInput();
        java.util.zip.Inflater inflater19 = new java.util.zip.Inflater();
        byte[] byteArray21 = new byte[] { (byte) 1 };
        int int22 = inflater19.inflate(byteArray21);
        int int23 = inflater19.getTotalIn();
        long long24 = inflater19.getBytesWritten();
        long long25 = inflater19.getBytesRead();
        int int26 = inflater19.getAdler();
        int int27 = inflater19.getTotalOut();
        java.util.zip.Inflater inflater28 = new java.util.zip.Inflater();
        boolean boolean29 = inflater28.finished();
        int int30 = inflater28.getRemaining();
        inflater28.end();
        boolean boolean32 = inflater28.needsInput();
        java.util.zip.Inflater inflater33 = new java.util.zip.Inflater();
        boolean boolean34 = inflater33.finished();
        int int35 = inflater33.getRemaining();
        boolean boolean36 = inflater33.needsDictionary();
        long long37 = inflater33.getBytesRead();
        boolean boolean38 = inflater33.needsInput();
        java.util.zip.Inflater inflater39 = new java.util.zip.Inflater();
        byte[] byteArray41 = new byte[] { (byte) 1 };
        int int42 = inflater39.inflate(byteArray41);
        long long43 = inflater39.getBytesWritten();
        inflater39.reset();
        long long45 = inflater39.getBytesWritten();
        java.util.zip.Inflater inflater46 = new java.util.zip.Inflater();
        boolean boolean47 = inflater46.finished();
        int int48 = inflater46.getRemaining();
        boolean boolean49 = inflater46.needsDictionary();
        boolean boolean50 = inflater46.needsInput();
        int int51 = inflater46.getRemaining();
        java.util.zip.Inflater inflater52 = new java.util.zip.Inflater();
        boolean boolean53 = inflater52.finished();
        int int54 = inflater52.getRemaining();
        boolean boolean55 = inflater52.finished();
        byte[] byteArray62 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater52.setInput(byteArray62);
        int int64 = inflater46.inflate(byteArray62);
        inflater39.setInput(byteArray62);
        int int66 = inflater33.inflate(byteArray62);
        inflater28.setInput(byteArray62);
        inflater19.setInput(byteArray62);
        inflater7.setInput(byteArray62);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int70 = inflater0.inflate(byteArray62);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        int int8 = inflater5.inflate(byteArray7);
        inflater0.setInput(byteArray7);
        int int10 = inflater0.getRemaining();
        boolean boolean11 = inflater0.needsDictionary();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int13 = inflater0.getTotalIn();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(false);
        int int2 = inflater1.getAdler();
        long long3 = inflater1.getBytesWritten();
        inflater1.end();
        boolean boolean5 = inflater1.needsDictionary();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long6 = inflater1.getBytesWritten();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.reset();
        long long6 = inflater0.getBytesWritten();
        inflater0.end();
        inflater0.end();
        int int9 = inflater0.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int10 = inflater0.getAdler();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getRemaining();
        boolean boolean21 = inflater0.finished();
        inflater0.end();
        int int23 = inflater0.getRemaining();
        java.util.zip.Inflater inflater24 = new java.util.zip.Inflater();
        boolean boolean25 = inflater24.finished();
        int int26 = inflater24.getRemaining();
        boolean boolean27 = inflater24.needsDictionary();
        boolean boolean28 = inflater24.needsInput();
        int int29 = inflater24.getRemaining();
        java.util.zip.Inflater inflater30 = new java.util.zip.Inflater();
        boolean boolean31 = inflater30.finished();
        int int32 = inflater30.getRemaining();
        boolean boolean33 = inflater30.finished();
        byte[] byteArray40 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater30.setInput(byteArray40);
        int int42 = inflater24.inflate(byteArray40);
        java.util.zip.Inflater inflater43 = new java.util.zip.Inflater();
        boolean boolean44 = inflater43.finished();
        int int45 = inflater43.getRemaining();
        boolean boolean46 = inflater43.finished();
        java.util.zip.Inflater inflater47 = new java.util.zip.Inflater();
        boolean boolean48 = inflater47.finished();
        int int49 = inflater47.getRemaining();
        boolean boolean50 = inflater47.finished();
        byte[] byteArray57 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater47.setInput(byteArray57);
        inflater43.setInput(byteArray57);
        inflater24.setInput(byteArray57);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int61 = inflater0.inflate(byteArray57);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getTotalIn();
        boolean boolean5 = inflater0.needsDictionary();
        inflater0.end();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        int int10 = inflater7.getTotalOut();
        inflater7.reset();
        boolean boolean12 = inflater7.needsInput();
        long long13 = inflater7.getBytesRead();
        int int14 = inflater7.getTotalOut();
        java.util.zip.Inflater inflater15 = new java.util.zip.Inflater();
        boolean boolean16 = inflater15.finished();
        int int17 = inflater15.getRemaining();
        boolean boolean18 = inflater15.needsDictionary();
        boolean boolean19 = inflater15.needsInput();
        int int20 = inflater15.getRemaining();
        java.util.zip.Inflater inflater21 = new java.util.zip.Inflater();
        boolean boolean22 = inflater21.finished();
        int int23 = inflater21.getRemaining();
        boolean boolean24 = inflater21.finished();
        byte[] byteArray31 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater21.setInput(byteArray31);
        int int33 = inflater15.inflate(byteArray31);
        boolean boolean34 = inflater15.finished();
        int int35 = inflater15.getTotalIn();
        java.util.zip.Inflater inflater36 = new java.util.zip.Inflater();
        boolean boolean37 = inflater36.finished();
        int int38 = inflater36.getRemaining();
        boolean boolean39 = inflater36.needsDictionary();
        boolean boolean40 = inflater36.needsInput();
        int int41 = inflater36.getRemaining();
        inflater36.reset();
        boolean boolean43 = inflater36.needsDictionary();
        int int44 = inflater36.getTotalIn();
        java.util.zip.Inflater inflater45 = new java.util.zip.Inflater();
        boolean boolean46 = inflater45.finished();
        int int47 = inflater45.getRemaining();
        boolean boolean48 = inflater45.needsDictionary();
        boolean boolean49 = inflater45.needsInput();
        int int50 = inflater45.getRemaining();
        inflater45.reset();
        java.util.zip.Inflater inflater52 = new java.util.zip.Inflater();
        boolean boolean53 = inflater52.finished();
        int int54 = inflater52.getRemaining();
        boolean boolean55 = inflater52.needsDictionary();
        boolean boolean56 = inflater52.needsInput();
        int int57 = inflater52.getRemaining();
        inflater52.reset();
        java.util.zip.Inflater inflater59 = new java.util.zip.Inflater();
        boolean boolean60 = inflater59.finished();
        int int61 = inflater59.getRemaining();
        boolean boolean62 = inflater59.finished();
        byte[] byteArray69 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater59.setInput(byteArray69);
        inflater52.setInput(byteArray69);
        int int74 = inflater45.inflate(byteArray69, 0, (int) (byte) 0);
        int int75 = inflater36.inflate(byteArray69);
        int int76 = inflater15.inflate(byteArray69);
        int int77 = inflater7.inflate(byteArray69);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int80 = inflater0.inflate(byteArray69, 0, (int) (byte) 1);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int9 = inflater0.inflate(byteArray8);
        boolean boolean10 = inflater0.needsInput();
        boolean boolean11 = inflater0.needsDictionary();
        int int12 = inflater0.getTotalOut();
        java.util.zip.Inflater inflater13 = new java.util.zip.Inflater();
        boolean boolean14 = inflater13.finished();
        int int15 = inflater13.getRemaining();
        boolean boolean16 = inflater13.needsDictionary();
        boolean boolean17 = inflater13.needsInput();
        int int18 = inflater13.getRemaining();
        java.util.zip.Inflater inflater19 = new java.util.zip.Inflater();
        boolean boolean20 = inflater19.finished();
        int int21 = inflater19.getRemaining();
        boolean boolean22 = inflater19.finished();
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater19.setInput(byteArray29);
        int int31 = inflater13.inflate(byteArray29);
        boolean boolean32 = inflater13.finished();
        int int33 = inflater13.getTotalOut();
        java.util.zip.Inflater inflater34 = new java.util.zip.Inflater();
        boolean boolean35 = inflater34.finished();
        int int36 = inflater34.getRemaining();
        boolean boolean37 = inflater34.needsDictionary();
        long long38 = inflater34.getBytesRead();
        boolean boolean39 = inflater34.needsDictionary();
        java.util.zip.Inflater inflater40 = new java.util.zip.Inflater();
        byte[] byteArray42 = new byte[] { (byte) 1 };
        int int43 = inflater40.inflate(byteArray42);
        long long44 = inflater40.getBytesWritten();
        inflater40.reset();
        long long46 = inflater40.getBytesWritten();
        java.util.zip.Inflater inflater47 = new java.util.zip.Inflater();
        boolean boolean48 = inflater47.finished();
        int int49 = inflater47.getRemaining();
        boolean boolean50 = inflater47.needsDictionary();
        boolean boolean51 = inflater47.needsInput();
        int int52 = inflater47.getRemaining();
        java.util.zip.Inflater inflater53 = new java.util.zip.Inflater();
        boolean boolean54 = inflater53.finished();
        int int55 = inflater53.getRemaining();
        boolean boolean56 = inflater53.finished();
        byte[] byteArray63 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater53.setInput(byteArray63);
        int int65 = inflater47.inflate(byteArray63);
        inflater40.setInput(byteArray63);
        inflater34.setInput(byteArray63);
        int int68 = inflater13.inflate(byteArray63);
        int int69 = inflater0.inflate(byteArray63);
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int71 = inflater0.getAdler();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        boolean boolean9 = inflater6.finished();
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater6.setInput(byteArray16);
        int int18 = inflater0.inflate(byteArray16);
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int20 = inflater0.getAdler();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        int int2 = inflater0.getTotalOut();
        int int3 = inflater0.getAdler();
        int int4 = inflater0.getTotalIn();
        int int5 = inflater0.getAdler();
        int int6 = inflater0.getRemaining();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long8 = inflater0.getBytesWritten();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        int int2 = inflater0.getTotalOut();
        int int3 = inflater0.getAdler();
        int int4 = inflater0.getTotalIn();
        int int5 = inflater0.getAdler();
        inflater0.end();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater(true);
        int int9 = inflater8.getRemaining();
        long long10 = inflater8.getBytesRead();
        int int11 = inflater8.getTotalIn();
        long long12 = inflater8.getBytesWritten();
        int int13 = inflater8.getTotalIn();
        java.util.zip.Inflater inflater14 = new java.util.zip.Inflater();
        byte[] byteArray16 = new byte[] { (byte) 1 };
        int int17 = inflater14.inflate(byteArray16);
        inflater14.reset();
        java.util.zip.Inflater inflater19 = new java.util.zip.Inflater();
        byte[] byteArray21 = new byte[] { (byte) 1 };
        int int22 = inflater19.inflate(byteArray21);
        int int23 = inflater19.getTotalIn();
        java.util.zip.Inflater inflater24 = new java.util.zip.Inflater();
        byte[] byteArray26 = new byte[] { (byte) 1 };
        int int27 = inflater24.inflate(byteArray26);
        byte[] byteArray32 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int33 = inflater24.inflate(byteArray32);
        int int34 = inflater19.inflate(byteArray32);
        inflater14.setInput(byteArray32);
        int int36 = inflater8.inflate(byteArray32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        inflater0.setDictionary(byteArray32);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsDictionary();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long5 = inflater0.getBytesRead();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        boolean boolean21 = inflater0.needsDictionary();
        long long22 = inflater0.getBytesWritten();
        boolean boolean23 = inflater0.needsDictionary();
        long long24 = inflater0.getBytesWritten();
        boolean boolean25 = inflater0.needsInput();
        inflater0.end();
        java.util.zip.Inflater inflater27 = new java.util.zip.Inflater();
        boolean boolean28 = inflater27.needsDictionary();
        inflater27.reset();
        java.util.zip.Inflater inflater30 = new java.util.zip.Inflater();
        boolean boolean31 = inflater30.finished();
        int int32 = inflater30.getRemaining();
        boolean boolean33 = inflater30.finished();
        long long34 = inflater30.getBytesRead();
        int int35 = inflater30.getTotalOut();
        int int36 = inflater30.getAdler();
        java.util.zip.Inflater inflater38 = new java.util.zip.Inflater(true);
        int int39 = inflater38.getRemaining();
        long long40 = inflater38.getBytesRead();
        java.util.zip.Inflater inflater41 = new java.util.zip.Inflater();
        byte[] byteArray43 = new byte[] { (byte) 1 };
        int int44 = inflater41.inflate(byteArray43);
        int int45 = inflater38.inflate(byteArray43);
        int int48 = inflater30.inflate(byteArray43, (int) (short) 1, (int) (short) 0);
        inflater27.setInput(byteArray43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        inflater0.setDictionary(byteArray43);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        boolean boolean9 = inflater6.finished();
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater6.setInput(byteArray16);
        int int18 = inflater0.inflate(byteArray16);
        inflater0.end();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long21 = inflater0.getBytesRead();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getRemaining();
        boolean boolean21 = inflater0.finished();
        inflater0.end();
        int int23 = inflater0.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int24 = inflater0.getAdler();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getTotalIn();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        int int8 = inflater5.inflate(byteArray7);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int14 = inflater5.inflate(byteArray13);
        int int15 = inflater0.inflate(byteArray13);
        boolean boolean16 = inflater0.finished();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int18 = inflater0.getTotalIn();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        int int4 = inflater0.getAdler();
        int int5 = inflater0.getAdler();
        long long6 = inflater0.getBytesWritten();
        long long7 = inflater0.getBytesRead();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        inflater0.reset();
        inflater0.end();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater(true);
        int int6 = inflater5.getRemaining();
        long long7 = inflater5.getBytesRead();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        boolean boolean9 = inflater8.finished();
        int int10 = inflater8.getRemaining();
        inflater8.end();
        java.util.zip.Inflater inflater12 = new java.util.zip.Inflater();
        boolean boolean13 = inflater12.finished();
        int int14 = inflater12.getRemaining();
        boolean boolean15 = inflater12.finished();
        byte[] byteArray22 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater12.setInput(byteArray22);
        inflater8.setInput(byteArray22);
        inflater5.setInput(byteArray22, (int) (byte) 1, (int) (short) 1);
        int int28 = inflater5.getTotalIn();
        boolean boolean29 = inflater5.finished();
        boolean boolean30 = inflater5.needsDictionary();
        java.util.zip.Inflater inflater31 = new java.util.zip.Inflater();
        boolean boolean32 = inflater31.finished();
        int int33 = inflater31.getRemaining();
        boolean boolean34 = inflater31.finished();
        long long35 = inflater31.getBytesRead();
        boolean boolean36 = inflater31.finished();
        long long37 = inflater31.getBytesRead();
        boolean boolean38 = inflater31.needsDictionary();
        boolean boolean39 = inflater31.needsDictionary();
        java.util.zip.Inflater inflater40 = new java.util.zip.Inflater();
        boolean boolean41 = inflater40.needsDictionary();
        int int42 = inflater40.getTotalOut();
        int int43 = inflater40.getTotalOut();
        boolean boolean44 = inflater40.needsInput();
        java.util.zip.Inflater inflater45 = new java.util.zip.Inflater();
        byte[] byteArray47 = new byte[] { (byte) 1 };
        int int48 = inflater45.inflate(byteArray47);
        inflater45.reset();
        java.util.zip.Inflater inflater50 = new java.util.zip.Inflater();
        byte[] byteArray52 = new byte[] { (byte) 1 };
        int int53 = inflater50.inflate(byteArray52);
        int int54 = inflater50.getTotalIn();
        java.util.zip.Inflater inflater55 = new java.util.zip.Inflater();
        byte[] byteArray57 = new byte[] { (byte) 1 };
        int int58 = inflater55.inflate(byteArray57);
        byte[] byteArray63 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int64 = inflater55.inflate(byteArray63);
        int int65 = inflater50.inflate(byteArray63);
        inflater45.setInput(byteArray63);
        inflater40.setInput(byteArray63);
        int int68 = inflater31.inflate(byteArray63);
        inflater5.setDictionary(byteArray63);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        inflater0.setDictionary(byteArray63);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int5 = inflater0.getTotalOut();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        int int4 = inflater0.getAdler();
        int int5 = inflater0.getAdler();
        inflater0.end();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.needsDictionary();
        boolean boolean11 = inflater7.needsInput();
        int int12 = inflater7.getRemaining();
        inflater7.reset();
        java.util.zip.Inflater inflater14 = new java.util.zip.Inflater();
        boolean boolean15 = inflater14.finished();
        int int16 = inflater14.getRemaining();
        boolean boolean17 = inflater14.finished();
        byte[] byteArray24 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater14.setInput(byteArray24);
        inflater7.setInput(byteArray24);
        int int27 = inflater7.getTotalOut();
        boolean boolean28 = inflater7.needsDictionary();
        long long29 = inflater7.getBytesWritten();
        int int30 = inflater7.getRemaining();
        int int31 = inflater7.getRemaining();
        java.util.zip.Inflater inflater32 = new java.util.zip.Inflater();
        byte[] byteArray34 = new byte[] { (byte) 1 };
        int int35 = inflater32.inflate(byteArray34);
        boolean boolean36 = inflater32.finished();
        inflater32.end();
        inflater32.end();
        boolean boolean39 = inflater32.needsDictionary();
        java.util.zip.Inflater inflater40 = new java.util.zip.Inflater();
        boolean boolean41 = inflater40.finished();
        int int42 = inflater40.getRemaining();
        boolean boolean43 = inflater40.needsInput();
        java.util.zip.Inflater inflater44 = new java.util.zip.Inflater();
        boolean boolean45 = inflater44.finished();
        int int46 = inflater44.getRemaining();
        boolean boolean47 = inflater44.finished();
        byte[] byteArray54 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater44.setInput(byteArray54);
        inflater40.setInput(byteArray54);
        inflater32.setInput(byteArray54);
        inflater7.setInput(byteArray54);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.setDictionary(byteArray54);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.end();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater(true);
        int int8 = inflater7.getRemaining();
        long long9 = inflater7.getBytesRead();
        java.util.zip.Inflater inflater10 = new java.util.zip.Inflater();
        boolean boolean11 = inflater10.finished();
        int int12 = inflater10.getRemaining();
        inflater10.end();
        java.util.zip.Inflater inflater14 = new java.util.zip.Inflater();
        boolean boolean15 = inflater14.finished();
        int int16 = inflater14.getRemaining();
        boolean boolean17 = inflater14.finished();
        byte[] byteArray24 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater14.setInput(byteArray24);
        inflater10.setInput(byteArray24);
        inflater7.setInput(byteArray24, (int) (byte) 1, (int) (short) 1);
        int int30 = inflater7.getTotalIn();
        java.util.zip.Inflater inflater31 = new java.util.zip.Inflater();
        boolean boolean32 = inflater31.finished();
        int int33 = inflater31.getRemaining();
        boolean boolean34 = inflater31.needsDictionary();
        boolean boolean35 = inflater31.needsInput();
        int int36 = inflater31.getRemaining();
        inflater31.reset();
        java.util.zip.Inflater inflater38 = new java.util.zip.Inflater();
        boolean boolean39 = inflater38.finished();
        int int40 = inflater38.getRemaining();
        java.util.zip.Inflater inflater41 = new java.util.zip.Inflater();
        boolean boolean42 = inflater41.finished();
        int int43 = inflater41.getRemaining();
        int int44 = inflater41.getTotalOut();
        inflater41.reset();
        boolean boolean46 = inflater41.needsInput();
        int int47 = inflater41.getRemaining();
        boolean boolean48 = inflater41.finished();
        java.util.zip.Inflater inflater49 = new java.util.zip.Inflater();
        byte[] byteArray51 = new byte[] { (byte) 1 };
        int int52 = inflater49.inflate(byteArray51);
        boolean boolean53 = inflater49.finished();
        inflater49.end();
        inflater49.end();
        boolean boolean56 = inflater49.needsDictionary();
        java.util.zip.Inflater inflater57 = new java.util.zip.Inflater();
        boolean boolean58 = inflater57.finished();
        int int59 = inflater57.getRemaining();
        boolean boolean60 = inflater57.needsInput();
        java.util.zip.Inflater inflater61 = new java.util.zip.Inflater();
        boolean boolean62 = inflater61.finished();
        int int63 = inflater61.getRemaining();
        boolean boolean64 = inflater61.finished();
        byte[] byteArray71 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater61.setInput(byteArray71);
        inflater57.setInput(byteArray71);
        inflater49.setInput(byteArray71);
        int int77 = inflater41.inflate(byteArray71, 6, (int) (short) 0);
        int int78 = inflater38.inflate(byteArray71);
        inflater31.setInput(byteArray71, (int) (byte) 0, (int) (byte) 1);
        int int84 = inflater7.inflate(byteArray71, 1, 0);
        inflater0.setInput(byteArray71);
        boolean boolean86 = inflater0.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        boolean boolean5 = inflater0.needsInput();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        boolean boolean9 = inflater6.needsDictionary();
        boolean boolean10 = inflater6.needsInput();
        int int11 = inflater6.getRemaining();
        java.util.zip.Inflater inflater12 = new java.util.zip.Inflater();
        boolean boolean13 = inflater12.finished();
        int int14 = inflater12.getRemaining();
        boolean boolean15 = inflater12.finished();
        byte[] byteArray22 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater12.setInput(byteArray22);
        int int24 = inflater6.inflate(byteArray22);
        boolean boolean25 = inflater6.finished();
        int int26 = inflater6.getTotalOut();
        java.util.zip.Inflater inflater27 = new java.util.zip.Inflater();
        boolean boolean28 = inflater27.finished();
        int int29 = inflater27.getRemaining();
        boolean boolean30 = inflater27.needsDictionary();
        long long31 = inflater27.getBytesRead();
        boolean boolean32 = inflater27.needsDictionary();
        java.util.zip.Inflater inflater33 = new java.util.zip.Inflater();
        byte[] byteArray35 = new byte[] { (byte) 1 };
        int int36 = inflater33.inflate(byteArray35);
        long long37 = inflater33.getBytesWritten();
        inflater33.reset();
        long long39 = inflater33.getBytesWritten();
        java.util.zip.Inflater inflater40 = new java.util.zip.Inflater();
        boolean boolean41 = inflater40.finished();
        int int42 = inflater40.getRemaining();
        boolean boolean43 = inflater40.needsDictionary();
        boolean boolean44 = inflater40.needsInput();
        int int45 = inflater40.getRemaining();
        java.util.zip.Inflater inflater46 = new java.util.zip.Inflater();
        boolean boolean47 = inflater46.finished();
        int int48 = inflater46.getRemaining();
        boolean boolean49 = inflater46.finished();
        byte[] byteArray56 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater46.setInput(byteArray56);
        int int58 = inflater40.inflate(byteArray56);
        inflater33.setInput(byteArray56);
        inflater27.setInput(byteArray56);
        int int61 = inflater6.inflate(byteArray56);
        java.util.zip.Inflater inflater62 = new java.util.zip.Inflater();
        boolean boolean63 = inflater62.finished();
        int int64 = inflater62.getRemaining();
        boolean boolean65 = inflater62.needsInput();
        java.util.zip.Inflater inflater66 = new java.util.zip.Inflater();
        boolean boolean67 = inflater66.finished();
        int int68 = inflater66.getRemaining();
        boolean boolean69 = inflater66.finished();
        byte[] byteArray76 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater66.setInput(byteArray76);
        inflater62.setInput(byteArray76);
        int int79 = inflater6.inflate(byteArray76);
        inflater0.setInput(byteArray76);
        inflater0.end();
        boolean boolean82 = inflater0.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long83 = inflater0.getBytesWritten();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.reset();
        long long6 = inflater0.getBytesWritten();
        int int7 = inflater0.getTotalIn();
        boolean boolean8 = inflater0.needsDictionary();
        int int9 = inflater0.getTotalIn();
        inflater0.end();
        boolean boolean11 = inflater0.needsInput();
        java.util.zip.Inflater inflater12 = new java.util.zip.Inflater();
        byte[] byteArray14 = new byte[] { (byte) 1 };
        int int15 = inflater12.inflate(byteArray14);
        long long16 = inflater12.getBytesWritten();
        inflater12.end();
        java.util.zip.Inflater inflater19 = new java.util.zip.Inflater(true);
        int int20 = inflater19.getRemaining();
        long long21 = inflater19.getBytesRead();
        java.util.zip.Inflater inflater22 = new java.util.zip.Inflater();
        boolean boolean23 = inflater22.finished();
        int int24 = inflater22.getRemaining();
        inflater22.end();
        java.util.zip.Inflater inflater26 = new java.util.zip.Inflater();
        boolean boolean27 = inflater26.finished();
        int int28 = inflater26.getRemaining();
        boolean boolean29 = inflater26.finished();
        byte[] byteArray36 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater26.setInput(byteArray36);
        inflater22.setInput(byteArray36);
        inflater19.setInput(byteArray36, (int) (byte) 1, (int) (short) 1);
        int int42 = inflater19.getTotalIn();
        java.util.zip.Inflater inflater43 = new java.util.zip.Inflater();
        boolean boolean44 = inflater43.finished();
        int int45 = inflater43.getRemaining();
        boolean boolean46 = inflater43.needsDictionary();
        boolean boolean47 = inflater43.needsInput();
        int int48 = inflater43.getRemaining();
        inflater43.reset();
        java.util.zip.Inflater inflater50 = new java.util.zip.Inflater();
        boolean boolean51 = inflater50.finished();
        int int52 = inflater50.getRemaining();
        java.util.zip.Inflater inflater53 = new java.util.zip.Inflater();
        boolean boolean54 = inflater53.finished();
        int int55 = inflater53.getRemaining();
        int int56 = inflater53.getTotalOut();
        inflater53.reset();
        boolean boolean58 = inflater53.needsInput();
        int int59 = inflater53.getRemaining();
        boolean boolean60 = inflater53.finished();
        java.util.zip.Inflater inflater61 = new java.util.zip.Inflater();
        byte[] byteArray63 = new byte[] { (byte) 1 };
        int int64 = inflater61.inflate(byteArray63);
        boolean boolean65 = inflater61.finished();
        inflater61.end();
        inflater61.end();
        boolean boolean68 = inflater61.needsDictionary();
        java.util.zip.Inflater inflater69 = new java.util.zip.Inflater();
        boolean boolean70 = inflater69.finished();
        int int71 = inflater69.getRemaining();
        boolean boolean72 = inflater69.needsInput();
        java.util.zip.Inflater inflater73 = new java.util.zip.Inflater();
        boolean boolean74 = inflater73.finished();
        int int75 = inflater73.getRemaining();
        boolean boolean76 = inflater73.finished();
        byte[] byteArray83 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater73.setInput(byteArray83);
        inflater69.setInput(byteArray83);
        inflater61.setInput(byteArray83);
        int int89 = inflater53.inflate(byteArray83, 6, (int) (short) 0);
        int int90 = inflater50.inflate(byteArray83);
        inflater43.setInput(byteArray83, (int) (byte) 0, (int) (byte) 1);
        int int96 = inflater19.inflate(byteArray83, 1, 0);
        inflater12.setInput(byteArray83);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int98 = inflater0.inflate(byteArray83);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        inflater0.end();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        boolean boolean21 = inflater0.needsDictionary();
        long long22 = inflater0.getBytesWritten();
        boolean boolean23 = inflater0.needsDictionary();
        long long24 = inflater0.getBytesWritten();
        inflater0.end();
        java.util.zip.Inflater inflater26 = new java.util.zip.Inflater();
        boolean boolean27 = inflater26.needsInput();
        java.util.zip.Inflater inflater28 = new java.util.zip.Inflater();
        byte[] byteArray30 = new byte[] { (byte) 1 };
        int int31 = inflater28.inflate(byteArray30);
        inflater28.reset();
        java.util.zip.Inflater inflater33 = new java.util.zip.Inflater();
        byte[] byteArray35 = new byte[] { (byte) 1 };
        int int36 = inflater33.inflate(byteArray35);
        int int37 = inflater33.getTotalIn();
        java.util.zip.Inflater inflater38 = new java.util.zip.Inflater();
        byte[] byteArray40 = new byte[] { (byte) 1 };
        int int41 = inflater38.inflate(byteArray40);
        byte[] byteArray46 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int47 = inflater38.inflate(byteArray46);
        int int48 = inflater33.inflate(byteArray46);
        inflater28.setInput(byteArray46);
        int int50 = inflater26.inflate(byteArray46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        inflater0.setDictionary(byteArray46);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getRemaining();
        boolean boolean21 = inflater0.finished();
        inflater0.end();
        int int23 = inflater0.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int24 = inflater0.getTotalOut();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.reset();
        int int6 = inflater0.getRemaining();
        inflater0.end();
        int int8 = inflater0.getRemaining();
        boolean boolean9 = inflater0.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long10 = inflater0.getBytesRead();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getTotalIn();
        int int5 = inflater0.getTotalIn();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        boolean boolean9 = inflater6.finished();
        long long10 = inflater6.getBytesRead();
        boolean boolean11 = inflater6.finished();
        long long12 = inflater6.getBytesRead();
        boolean boolean13 = inflater6.needsDictionary();
        boolean boolean14 = inflater6.needsDictionary();
        java.util.zip.Inflater inflater15 = new java.util.zip.Inflater();
        boolean boolean16 = inflater15.needsDictionary();
        int int17 = inflater15.getTotalOut();
        int int18 = inflater15.getTotalOut();
        boolean boolean19 = inflater15.needsInput();
        java.util.zip.Inflater inflater20 = new java.util.zip.Inflater();
        byte[] byteArray22 = new byte[] { (byte) 1 };
        int int23 = inflater20.inflate(byteArray22);
        inflater20.reset();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        byte[] byteArray27 = new byte[] { (byte) 1 };
        int int28 = inflater25.inflate(byteArray27);
        int int29 = inflater25.getTotalIn();
        java.util.zip.Inflater inflater30 = new java.util.zip.Inflater();
        byte[] byteArray32 = new byte[] { (byte) 1 };
        int int33 = inflater30.inflate(byteArray32);
        byte[] byteArray38 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int39 = inflater30.inflate(byteArray38);
        int int40 = inflater25.inflate(byteArray38);
        inflater20.setInput(byteArray38);
        inflater15.setInput(byteArray38);
        int int43 = inflater6.inflate(byteArray38);
        inflater0.setInput(byteArray38);
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsInput();
        boolean boolean6 = inflater0.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long7 = inflater0.getBytesRead();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        inflater0.reset();
        inflater0.end();
        boolean boolean4 = inflater0.needsDictionary();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        boolean boolean6 = inflater5.finished();
        int int7 = inflater5.getRemaining();
        boolean boolean8 = inflater5.needsDictionary();
        boolean boolean9 = inflater5.needsInput();
        int int10 = inflater5.getRemaining();
        inflater5.reset();
        java.util.zip.Inflater inflater12 = new java.util.zip.Inflater();
        boolean boolean13 = inflater12.finished();
        int int14 = inflater12.getRemaining();
        boolean boolean15 = inflater12.finished();
        byte[] byteArray22 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater12.setInput(byteArray22);
        inflater5.setInput(byteArray22);
        int int25 = inflater5.getTotalOut();
        boolean boolean26 = inflater5.needsDictionary();
        long long27 = inflater5.getBytesWritten();
        int int28 = inflater5.getRemaining();
        int int29 = inflater5.getRemaining();
        java.util.zip.Inflater inflater30 = new java.util.zip.Inflater();
        byte[] byteArray32 = new byte[] { (byte) 1 };
        int int33 = inflater30.inflate(byteArray32);
        boolean boolean34 = inflater30.finished();
        inflater30.end();
        inflater30.end();
        boolean boolean37 = inflater30.needsDictionary();
        java.util.zip.Inflater inflater38 = new java.util.zip.Inflater();
        boolean boolean39 = inflater38.finished();
        int int40 = inflater38.getRemaining();
        boolean boolean41 = inflater38.needsInput();
        java.util.zip.Inflater inflater42 = new java.util.zip.Inflater();
        boolean boolean43 = inflater42.finished();
        int int44 = inflater42.getRemaining();
        boolean boolean45 = inflater42.finished();
        byte[] byteArray52 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater42.setInput(byteArray52);
        inflater38.setInput(byteArray52);
        inflater30.setInput(byteArray52);
        inflater5.setInput(byteArray52);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.setDictionary(byteArray52);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsDictionary();
        inflater0.end();
        boolean boolean7 = inflater0.needsInput();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        boolean boolean9 = inflater8.finished();
        int int10 = inflater8.getRemaining();
        boolean boolean11 = inflater8.needsDictionary();
        boolean boolean12 = inflater8.needsInput();
        int int13 = inflater8.getRemaining();
        inflater8.reset();
        java.util.zip.Inflater inflater15 = new java.util.zip.Inflater();
        boolean boolean16 = inflater15.finished();
        int int17 = inflater15.getRemaining();
        boolean boolean18 = inflater15.finished();
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater15.setInput(byteArray25);
        inflater8.setInput(byteArray25);
        int int28 = inflater8.getTotalOut();
        boolean boolean29 = inflater8.needsInput();
        boolean boolean30 = inflater8.needsInput();
        java.util.zip.Inflater inflater31 = new java.util.zip.Inflater();
        boolean boolean32 = inflater31.finished();
        int int33 = inflater31.getRemaining();
        boolean boolean34 = inflater31.needsDictionary();
        java.util.zip.Inflater inflater35 = new java.util.zip.Inflater();
        boolean boolean36 = inflater35.finished();
        int int37 = inflater35.getRemaining();
        inflater35.end();
        java.util.zip.Inflater inflater39 = new java.util.zip.Inflater();
        boolean boolean40 = inflater39.finished();
        int int41 = inflater39.getRemaining();
        boolean boolean42 = inflater39.finished();
        byte[] byteArray49 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater39.setInput(byteArray49);
        inflater35.setInput(byteArray49);
        int int52 = inflater31.inflate(byteArray49);
        inflater8.setInput(byteArray49, (int) (byte) 0, (int) (byte) 1);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int56 = inflater0.inflate(byteArray49);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsDictionary();
        inflater0.end();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        long long11 = inflater7.getBytesRead();
        boolean boolean12 = inflater7.finished();
        long long13 = inflater7.getBytesRead();
        boolean boolean14 = inflater7.needsDictionary();
        boolean boolean15 = inflater7.needsDictionary();
        java.util.zip.Inflater inflater16 = new java.util.zip.Inflater();
        boolean boolean17 = inflater16.needsDictionary();
        int int18 = inflater16.getTotalOut();
        int int19 = inflater16.getTotalOut();
        boolean boolean20 = inflater16.needsInput();
        java.util.zip.Inflater inflater21 = new java.util.zip.Inflater();
        byte[] byteArray23 = new byte[] { (byte) 1 };
        int int24 = inflater21.inflate(byteArray23);
        inflater21.reset();
        java.util.zip.Inflater inflater26 = new java.util.zip.Inflater();
        byte[] byteArray28 = new byte[] { (byte) 1 };
        int int29 = inflater26.inflate(byteArray28);
        int int30 = inflater26.getTotalIn();
        java.util.zip.Inflater inflater31 = new java.util.zip.Inflater();
        byte[] byteArray33 = new byte[] { (byte) 1 };
        int int34 = inflater31.inflate(byteArray33);
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int40 = inflater31.inflate(byteArray39);
        int int41 = inflater26.inflate(byteArray39);
        inflater21.setInput(byteArray39);
        inflater16.setInput(byteArray39);
        int int44 = inflater7.inflate(byteArray39);
        inflater7.reset();
        java.util.zip.Inflater inflater46 = new java.util.zip.Inflater();
        byte[] byteArray48 = new byte[] { (byte) 1 };
        int int49 = inflater46.inflate(byteArray48);
        int int50 = inflater46.getAdler();
        boolean boolean51 = inflater46.finished();
        long long52 = inflater46.getBytesWritten();
        java.util.zip.Inflater inflater53 = new java.util.zip.Inflater();
        boolean boolean54 = inflater53.finished();
        boolean boolean55 = inflater53.needsInput();
        boolean boolean56 = inflater53.needsInput();
        java.util.zip.Inflater inflater57 = new java.util.zip.Inflater();
        boolean boolean58 = inflater57.finished();
        int int59 = inflater57.getRemaining();
        boolean boolean60 = inflater57.needsDictionary();
        long long61 = inflater57.getBytesRead();
        boolean boolean62 = inflater57.needsDictionary();
        java.util.zip.Inflater inflater63 = new java.util.zip.Inflater();
        byte[] byteArray65 = new byte[] { (byte) 1 };
        int int66 = inflater63.inflate(byteArray65);
        long long67 = inflater63.getBytesWritten();
        inflater63.reset();
        long long69 = inflater63.getBytesWritten();
        java.util.zip.Inflater inflater70 = new java.util.zip.Inflater();
        boolean boolean71 = inflater70.finished();
        int int72 = inflater70.getRemaining();
        boolean boolean73 = inflater70.needsDictionary();
        boolean boolean74 = inflater70.needsInput();
        int int75 = inflater70.getRemaining();
        java.util.zip.Inflater inflater76 = new java.util.zip.Inflater();
        boolean boolean77 = inflater76.finished();
        int int78 = inflater76.getRemaining();
        boolean boolean79 = inflater76.finished();
        byte[] byteArray86 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater76.setInput(byteArray86);
        int int88 = inflater70.inflate(byteArray86);
        inflater63.setInput(byteArray86);
        inflater57.setInput(byteArray86);
        int int91 = inflater53.inflate(byteArray86);
        int int92 = inflater46.inflate(byteArray86);
        int int93 = inflater7.inflate(byteArray86);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int94 = inflater0.inflate(byteArray86);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int2 = inflater0.getTotalOut();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsDictionary();
        int int6 = inflater0.getRemaining();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.needsDictionary();
        boolean boolean11 = inflater7.needsInput();
        int int12 = inflater7.getRemaining();
        java.util.zip.Inflater inflater13 = new java.util.zip.Inflater();
        boolean boolean14 = inflater13.finished();
        int int15 = inflater13.getRemaining();
        boolean boolean16 = inflater13.finished();
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater13.setInput(byteArray23);
        int int25 = inflater7.inflate(byteArray23);
        boolean boolean26 = inflater7.finished();
        int int27 = inflater7.getTotalIn();
        java.util.zip.Inflater inflater28 = new java.util.zip.Inflater();
        boolean boolean29 = inflater28.finished();
        int int30 = inflater28.getRemaining();
        boolean boolean31 = inflater28.needsDictionary();
        boolean boolean32 = inflater28.needsInput();
        int int33 = inflater28.getRemaining();
        inflater28.reset();
        boolean boolean35 = inflater28.needsDictionary();
        int int36 = inflater28.getTotalIn();
        java.util.zip.Inflater inflater37 = new java.util.zip.Inflater();
        boolean boolean38 = inflater37.finished();
        int int39 = inflater37.getRemaining();
        boolean boolean40 = inflater37.needsDictionary();
        boolean boolean41 = inflater37.needsInput();
        int int42 = inflater37.getRemaining();
        inflater37.reset();
        java.util.zip.Inflater inflater44 = new java.util.zip.Inflater();
        boolean boolean45 = inflater44.finished();
        int int46 = inflater44.getRemaining();
        boolean boolean47 = inflater44.needsDictionary();
        boolean boolean48 = inflater44.needsInput();
        int int49 = inflater44.getRemaining();
        inflater44.reset();
        java.util.zip.Inflater inflater51 = new java.util.zip.Inflater();
        boolean boolean52 = inflater51.finished();
        int int53 = inflater51.getRemaining();
        boolean boolean54 = inflater51.finished();
        byte[] byteArray61 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater51.setInput(byteArray61);
        inflater44.setInput(byteArray61);
        int int66 = inflater37.inflate(byteArray61, 0, (int) (byte) 0);
        int int67 = inflater28.inflate(byteArray61);
        int int68 = inflater7.inflate(byteArray61);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int69 = inflater0.inflate(byteArray61);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsInput();
        boolean boolean6 = inflater0.finished();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        byte[] byteArray9 = new byte[] { (byte) 1 };
        int int10 = inflater7.inflate(byteArray9);
        int int11 = inflater7.getTotalIn();
        long long12 = inflater7.getBytesWritten();
        int int13 = inflater7.getAdler();
        boolean boolean14 = inflater7.needsInput();
        java.util.zip.Inflater inflater15 = new java.util.zip.Inflater();
        boolean boolean16 = inflater15.finished();
        int int17 = inflater15.getRemaining();
        inflater15.end();
        java.util.zip.Inflater inflater19 = new java.util.zip.Inflater();
        boolean boolean20 = inflater19.finished();
        int int21 = inflater19.getRemaining();
        boolean boolean22 = inflater19.finished();
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater19.setInput(byteArray29);
        inflater15.setInput(byteArray29);
        boolean boolean32 = inflater15.needsDictionary();
        boolean boolean33 = inflater15.finished();
        java.util.zip.Inflater inflater34 = new java.util.zip.Inflater();
        boolean boolean35 = inflater34.needsDictionary();
        int int36 = inflater34.getTotalOut();
        int int37 = inflater34.getTotalOut();
        int int38 = inflater34.getAdler();
        boolean boolean39 = inflater34.needsDictionary();
        int int40 = inflater34.getTotalOut();
        java.util.zip.Inflater inflater41 = new java.util.zip.Inflater();
        byte[] byteArray43 = new byte[] { (byte) 1 };
        int int44 = inflater41.inflate(byteArray43);
        boolean boolean45 = inflater41.finished();
        inflater41.end();
        inflater41.end();
        boolean boolean48 = inflater41.needsInput();
        java.util.zip.Inflater inflater49 = new java.util.zip.Inflater();
        boolean boolean50 = inflater49.finished();
        int int51 = inflater49.getRemaining();
        boolean boolean52 = inflater49.needsDictionary();
        boolean boolean53 = inflater49.needsInput();
        int int54 = inflater49.getRemaining();
        inflater49.reset();
        boolean boolean56 = inflater49.needsDictionary();
        int int57 = inflater49.getTotalIn();
        java.util.zip.Inflater inflater58 = new java.util.zip.Inflater();
        boolean boolean59 = inflater58.finished();
        int int60 = inflater58.getRemaining();
        boolean boolean61 = inflater58.needsDictionary();
        boolean boolean62 = inflater58.needsInput();
        int int63 = inflater58.getRemaining();
        inflater58.reset();
        java.util.zip.Inflater inflater65 = new java.util.zip.Inflater();
        boolean boolean66 = inflater65.finished();
        int int67 = inflater65.getRemaining();
        boolean boolean68 = inflater65.needsDictionary();
        boolean boolean69 = inflater65.needsInput();
        int int70 = inflater65.getRemaining();
        inflater65.reset();
        java.util.zip.Inflater inflater72 = new java.util.zip.Inflater();
        boolean boolean73 = inflater72.finished();
        int int74 = inflater72.getRemaining();
        boolean boolean75 = inflater72.finished();
        byte[] byteArray82 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater72.setInput(byteArray82);
        inflater65.setInput(byteArray82);
        int int87 = inflater58.inflate(byteArray82, 0, (int) (byte) 0);
        int int88 = inflater49.inflate(byteArray82);
        inflater41.setInput(byteArray82);
        int int92 = inflater34.inflate(byteArray82, 0, (int) (byte) 0);
        inflater15.setInput(byteArray82);
        int int94 = inflater7.inflate(byteArray82);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int95 = inflater0.inflate(byteArray82);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        boolean boolean5 = inflater0.needsInput();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int7 = inflater0.getTotalOut();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsDictionary();
        boolean boolean6 = inflater0.needsDictionary();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.needsDictionary();
        int int9 = inflater7.getTotalOut();
        int int10 = inflater7.getTotalOut();
        long long11 = inflater7.getBytesWritten();
        java.util.zip.Inflater inflater12 = new java.util.zip.Inflater();
        boolean boolean13 = inflater12.finished();
        int int14 = inflater12.getRemaining();
        boolean boolean15 = inflater12.needsDictionary();
        boolean boolean16 = inflater12.needsInput();
        int int17 = inflater12.getRemaining();
        java.util.zip.Inflater inflater18 = new java.util.zip.Inflater();
        boolean boolean19 = inflater18.finished();
        int int20 = inflater18.getRemaining();
        boolean boolean21 = inflater18.finished();
        byte[] byteArray28 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater18.setInput(byteArray28);
        int int30 = inflater12.inflate(byteArray28);
        boolean boolean31 = inflater12.finished();
        int int32 = inflater12.getAdler();
        boolean boolean33 = inflater12.finished();
        java.util.zip.Inflater inflater34 = new java.util.zip.Inflater();
        boolean boolean35 = inflater34.finished();
        int int36 = inflater34.getRemaining();
        boolean boolean37 = inflater34.needsDictionary();
        long long38 = inflater34.getBytesRead();
        boolean boolean39 = inflater34.needsDictionary();
        java.util.zip.Inflater inflater40 = new java.util.zip.Inflater();
        byte[] byteArray42 = new byte[] { (byte) 1 };
        int int43 = inflater40.inflate(byteArray42);
        long long44 = inflater40.getBytesWritten();
        inflater40.reset();
        long long46 = inflater40.getBytesWritten();
        java.util.zip.Inflater inflater47 = new java.util.zip.Inflater();
        boolean boolean48 = inflater47.finished();
        int int49 = inflater47.getRemaining();
        boolean boolean50 = inflater47.needsDictionary();
        boolean boolean51 = inflater47.needsInput();
        int int52 = inflater47.getRemaining();
        java.util.zip.Inflater inflater53 = new java.util.zip.Inflater();
        boolean boolean54 = inflater53.finished();
        int int55 = inflater53.getRemaining();
        boolean boolean56 = inflater53.finished();
        byte[] byteArray63 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater53.setInput(byteArray63);
        int int65 = inflater47.inflate(byteArray63);
        inflater40.setInput(byteArray63);
        inflater34.setInput(byteArray63);
        inflater12.setInput(byteArray63);
        inflater7.setInput(byteArray63);
        inflater0.setInput(byteArray63);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        java.util.zip.Inflater inflater2 = new java.util.zip.Inflater();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        int int5 = inflater2.inflate(byteArray4);
        int int6 = inflater2.getTotalIn();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        inflater7.end();
        boolean boolean11 = inflater7.needsInput();
        java.util.zip.Inflater inflater12 = new java.util.zip.Inflater();
        byte[] byteArray14 = new byte[] { (byte) 1 };
        int int15 = inflater12.inflate(byteArray14);
        inflater7.setInput(byteArray14);
        inflater2.setInput(byteArray14);
        inflater0.setInput(byteArray14);
        boolean boolean19 = inflater0.finished();
        int int20 = inflater0.getAdler();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int22 = inflater0.getTotalIn();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        int int8 = inflater5.inflate(byteArray7);
        inflater0.setInput(byteArray7);
        int int10 = inflater0.getRemaining();
        boolean boolean11 = inflater0.needsDictionary();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long12 = inflater0.getBytesRead();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsDictionary();
        boolean boolean6 = inflater0.finished();
        int int7 = inflater0.getTotalIn();
        int int8 = inflater0.getRemaining();
        long long9 = inflater0.getBytesWritten();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        boolean boolean2 = inflater0.needsInput();
        boolean boolean3 = inflater0.needsInput();
        inflater0.end();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        boolean boolean6 = inflater5.finished();
        int int7 = inflater5.getRemaining();
        boolean boolean8 = inflater5.finished();
        long long9 = inflater5.getBytesRead();
        inflater5.reset();
        java.util.zip.Inflater inflater11 = new java.util.zip.Inflater();
        boolean boolean12 = inflater11.finished();
        int int13 = inflater11.getRemaining();
        boolean boolean14 = inflater11.needsDictionary();
        boolean boolean15 = inflater11.needsInput();
        boolean boolean16 = inflater11.needsDictionary();
        boolean boolean17 = inflater11.needsDictionary();
        java.util.zip.Inflater inflater18 = new java.util.zip.Inflater();
        boolean boolean19 = inflater18.finished();
        int int20 = inflater18.getRemaining();
        boolean boolean21 = inflater18.finished();
        byte[] byteArray28 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater18.setInput(byteArray28);
        int int30 = inflater11.inflate(byteArray28);
        int int31 = inflater5.inflate(byteArray28);
        java.util.zip.Inflater inflater32 = new java.util.zip.Inflater();
        boolean boolean33 = inflater32.finished();
        int int34 = inflater32.getRemaining();
        boolean boolean35 = inflater32.finished();
        int int36 = inflater32.getAdler();
        java.util.zip.Inflater inflater37 = new java.util.zip.Inflater();
        boolean boolean38 = inflater37.finished();
        int int39 = inflater37.getRemaining();
        inflater37.end();
        boolean boolean41 = inflater37.needsInput();
        java.util.zip.Inflater inflater42 = new java.util.zip.Inflater();
        byte[] byteArray44 = new byte[] { (byte) 1 };
        int int45 = inflater42.inflate(byteArray44);
        inflater37.setInput(byteArray44);
        int int47 = inflater32.inflate(byteArray44);
        inflater5.setInput(byteArray44);
        inflater0.setInput(byteArray44);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int50 = inflater0.getTotalIn();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int9 = inflater0.inflate(byteArray8);
        int int10 = inflater0.getTotalIn();
        int int11 = inflater0.getRemaining();
        int int12 = inflater0.getTotalOut();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int14 = inflater0.getAdler();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        boolean boolean21 = inflater0.finished();
        int int22 = inflater0.getRemaining();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long24 = inflater0.getBytesRead();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        int int4 = inflater0.getAdler();
        int int5 = inflater0.getAdler();
        long long6 = inflater0.getBytesWritten();
        long long7 = inflater0.getBytesRead();
        inflater0.end();
        boolean boolean9 = inflater0.needsDictionary();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long10 = inflater0.getBytesRead();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        long long4 = inflater0.getBytesRead();
        boolean boolean5 = inflater0.needsDictionary();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        byte[] byteArray8 = new byte[] { (byte) 1 };
        int int9 = inflater6.inflate(byteArray8);
        long long10 = inflater6.getBytesWritten();
        inflater6.reset();
        long long12 = inflater6.getBytesWritten();
        java.util.zip.Inflater inflater13 = new java.util.zip.Inflater();
        boolean boolean14 = inflater13.finished();
        int int15 = inflater13.getRemaining();
        boolean boolean16 = inflater13.needsDictionary();
        boolean boolean17 = inflater13.needsInput();
        int int18 = inflater13.getRemaining();
        java.util.zip.Inflater inflater19 = new java.util.zip.Inflater();
        boolean boolean20 = inflater19.finished();
        int int21 = inflater19.getRemaining();
        boolean boolean22 = inflater19.finished();
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater19.setInput(byteArray29);
        int int31 = inflater13.inflate(byteArray29);
        inflater6.setInput(byteArray29);
        inflater0.setInput(byteArray29);
        boolean boolean34 = inflater0.needsInput();
        inflater0.end();
        boolean boolean36 = inflater0.needsDictionary();
        java.util.zip.Inflater inflater37 = new java.util.zip.Inflater();
        boolean boolean38 = inflater37.finished();
        int int39 = inflater37.getRemaining();
        boolean boolean40 = inflater37.needsDictionary();
        boolean boolean41 = inflater37.needsInput();
        int int42 = inflater37.getRemaining();
        java.util.zip.Inflater inflater43 = new java.util.zip.Inflater();
        boolean boolean44 = inflater43.finished();
        int int45 = inflater43.getRemaining();
        boolean boolean46 = inflater43.finished();
        byte[] byteArray53 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater43.setInput(byteArray53);
        int int55 = inflater37.inflate(byteArray53);
        boolean boolean56 = inflater37.finished();
        int int57 = inflater37.getAdler();
        boolean boolean58 = inflater37.finished();
        int int59 = inflater37.getAdler();
        boolean boolean60 = inflater37.needsInput();
        java.util.zip.Inflater inflater61 = new java.util.zip.Inflater();
        byte[] byteArray63 = new byte[] { (byte) 1 };
        int int64 = inflater61.inflate(byteArray63);
        byte[] byteArray69 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int70 = inflater61.inflate(byteArray69);
        int int73 = inflater37.inflate(byteArray69, 0, (int) (short) 1);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int76 = inflater0.inflate(byteArray69, 0, (int) (short) 0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsDictionary();
        boolean boolean6 = inflater0.needsDictionary();
        boolean boolean7 = inflater0.needsDictionary();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        boolean boolean9 = inflater8.needsDictionary();
        int int10 = inflater8.getTotalOut();
        int int11 = inflater8.getTotalOut();
        boolean boolean12 = inflater8.needsInput();
        java.util.zip.Inflater inflater13 = new java.util.zip.Inflater();
        byte[] byteArray15 = new byte[] { (byte) 1 };
        int int16 = inflater13.inflate(byteArray15);
        inflater13.reset();
        java.util.zip.Inflater inflater18 = new java.util.zip.Inflater();
        byte[] byteArray20 = new byte[] { (byte) 1 };
        int int21 = inflater18.inflate(byteArray20);
        int int22 = inflater18.getTotalIn();
        java.util.zip.Inflater inflater23 = new java.util.zip.Inflater();
        byte[] byteArray25 = new byte[] { (byte) 1 };
        int int26 = inflater23.inflate(byteArray25);
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int32 = inflater23.inflate(byteArray31);
        int int33 = inflater18.inflate(byteArray31);
        inflater13.setInput(byteArray31);
        inflater8.setInput(byteArray31);
        inflater0.setInput(byteArray31);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long37 = inflater0.getBytesWritten();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        boolean boolean21 = inflater0.needsDictionary();
        long long22 = inflater0.getBytesWritten();
        int int23 = inflater0.getRemaining();
        int int24 = inflater0.getRemaining();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        byte[] byteArray27 = new byte[] { (byte) 1 };
        int int28 = inflater25.inflate(byteArray27);
        boolean boolean29 = inflater25.finished();
        inflater25.end();
        inflater25.end();
        boolean boolean32 = inflater25.needsDictionary();
        java.util.zip.Inflater inflater33 = new java.util.zip.Inflater();
        boolean boolean34 = inflater33.finished();
        int int35 = inflater33.getRemaining();
        boolean boolean36 = inflater33.needsInput();
        java.util.zip.Inflater inflater37 = new java.util.zip.Inflater();
        boolean boolean38 = inflater37.finished();
        int int39 = inflater37.getRemaining();
        boolean boolean40 = inflater37.finished();
        byte[] byteArray47 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater37.setInput(byteArray47);
        inflater33.setInput(byteArray47);
        inflater25.setInput(byteArray47);
        inflater0.setInput(byteArray47);
        int int52 = inflater0.getRemaining();
        long long53 = inflater0.getBytesRead();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long55 = inflater0.getBytesRead();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        inflater0.reset();
        boolean boolean2 = inflater0.needsInput();
        boolean boolean3 = inflater0.needsDictionary();
        inflater0.end();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.reset();
        int int6 = inflater0.getRemaining();
        inflater0.end();
        int int8 = inflater0.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int9 = inflater0.getTotalIn();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        boolean boolean21 = inflater0.needsDictionary();
        long long22 = inflater0.getBytesWritten();
        int int23 = inflater0.getTotalOut();
        inflater0.end();
        boolean boolean25 = inflater0.needsDictionary();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long26 = inflater0.getBytesRead();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getAdler();
        int int5 = inflater0.getAdler();
        long long6 = inflater0.getBytesRead();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long8 = inflater0.getBytesRead();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        boolean boolean7 = inflater0.needsDictionary();
        int int8 = inflater0.getTotalIn();
        boolean boolean9 = inflater0.finished();
        inflater0.end();
        boolean boolean11 = inflater0.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int12 = inflater0.getTotalIn();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        boolean boolean21 = inflater0.needsDictionary();
        long long22 = inflater0.getBytesWritten();
        int int23 = inflater0.getRemaining();
        int int24 = inflater0.getRemaining();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        byte[] byteArray27 = new byte[] { (byte) 1 };
        int int28 = inflater25.inflate(byteArray27);
        boolean boolean29 = inflater25.finished();
        inflater25.end();
        inflater25.end();
        boolean boolean32 = inflater25.needsDictionary();
        java.util.zip.Inflater inflater33 = new java.util.zip.Inflater();
        boolean boolean34 = inflater33.finished();
        int int35 = inflater33.getRemaining();
        boolean boolean36 = inflater33.needsInput();
        java.util.zip.Inflater inflater37 = new java.util.zip.Inflater();
        boolean boolean38 = inflater37.finished();
        int int39 = inflater37.getRemaining();
        boolean boolean40 = inflater37.finished();
        byte[] byteArray47 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater37.setInput(byteArray47);
        inflater33.setInput(byteArray47);
        inflater25.setInput(byteArray47);
        inflater0.setInput(byteArray47);
        int int52 = inflater0.getRemaining();
        long long53 = inflater0.getBytesRead();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long55 = inflater0.getBytesWritten();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getTotalIn();
        boolean boolean5 = inflater0.needsDictionary();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long7 = inflater0.getBytesRead();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        boolean boolean4 = inflater0.finished();
        inflater0.end();
        inflater0.end();
        boolean boolean7 = inflater0.needsInput();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        boolean boolean9 = inflater8.finished();
        int int10 = inflater8.getRemaining();
        boolean boolean11 = inflater8.needsDictionary();
        boolean boolean12 = inflater8.needsInput();
        int int13 = inflater8.getRemaining();
        inflater8.reset();
        boolean boolean15 = inflater8.needsDictionary();
        int int16 = inflater8.getTotalIn();
        java.util.zip.Inflater inflater17 = new java.util.zip.Inflater();
        boolean boolean18 = inflater17.finished();
        int int19 = inflater17.getRemaining();
        boolean boolean20 = inflater17.needsDictionary();
        boolean boolean21 = inflater17.needsInput();
        int int22 = inflater17.getRemaining();
        inflater17.reset();
        java.util.zip.Inflater inflater24 = new java.util.zip.Inflater();
        boolean boolean25 = inflater24.finished();
        int int26 = inflater24.getRemaining();
        boolean boolean27 = inflater24.needsDictionary();
        boolean boolean28 = inflater24.needsInput();
        int int29 = inflater24.getRemaining();
        inflater24.reset();
        java.util.zip.Inflater inflater31 = new java.util.zip.Inflater();
        boolean boolean32 = inflater31.finished();
        int int33 = inflater31.getRemaining();
        boolean boolean34 = inflater31.finished();
        byte[] byteArray41 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater31.setInput(byteArray41);
        inflater24.setInput(byteArray41);
        int int46 = inflater17.inflate(byteArray41, 0, (int) (byte) 0);
        int int47 = inflater8.inflate(byteArray41);
        inflater0.setInput(byteArray41);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        long long4 = inflater0.getBytesRead();
        long long5 = inflater0.getBytesWritten();
        boolean boolean6 = inflater0.finished();
        inflater0.end();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        int int11 = inflater8.inflate(byteArray10);
        long long12 = inflater8.getBytesWritten();
        inflater8.end();
        java.util.zip.Inflater inflater15 = new java.util.zip.Inflater(true);
        int int16 = inflater15.getRemaining();
        long long17 = inflater15.getBytesRead();
        java.util.zip.Inflater inflater18 = new java.util.zip.Inflater();
        boolean boolean19 = inflater18.finished();
        int int20 = inflater18.getRemaining();
        inflater18.end();
        java.util.zip.Inflater inflater22 = new java.util.zip.Inflater();
        boolean boolean23 = inflater22.finished();
        int int24 = inflater22.getRemaining();
        boolean boolean25 = inflater22.finished();
        byte[] byteArray32 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater22.setInput(byteArray32);
        inflater18.setInput(byteArray32);
        inflater15.setInput(byteArray32, (int) (byte) 1, (int) (short) 1);
        int int38 = inflater15.getTotalIn();
        java.util.zip.Inflater inflater39 = new java.util.zip.Inflater();
        boolean boolean40 = inflater39.finished();
        int int41 = inflater39.getRemaining();
        boolean boolean42 = inflater39.needsDictionary();
        boolean boolean43 = inflater39.needsInput();
        int int44 = inflater39.getRemaining();
        inflater39.reset();
        java.util.zip.Inflater inflater46 = new java.util.zip.Inflater();
        boolean boolean47 = inflater46.finished();
        int int48 = inflater46.getRemaining();
        java.util.zip.Inflater inflater49 = new java.util.zip.Inflater();
        boolean boolean50 = inflater49.finished();
        int int51 = inflater49.getRemaining();
        int int52 = inflater49.getTotalOut();
        inflater49.reset();
        boolean boolean54 = inflater49.needsInput();
        int int55 = inflater49.getRemaining();
        boolean boolean56 = inflater49.finished();
        java.util.zip.Inflater inflater57 = new java.util.zip.Inflater();
        byte[] byteArray59 = new byte[] { (byte) 1 };
        int int60 = inflater57.inflate(byteArray59);
        boolean boolean61 = inflater57.finished();
        inflater57.end();
        inflater57.end();
        boolean boolean64 = inflater57.needsDictionary();
        java.util.zip.Inflater inflater65 = new java.util.zip.Inflater();
        boolean boolean66 = inflater65.finished();
        int int67 = inflater65.getRemaining();
        boolean boolean68 = inflater65.needsInput();
        java.util.zip.Inflater inflater69 = new java.util.zip.Inflater();
        boolean boolean70 = inflater69.finished();
        int int71 = inflater69.getRemaining();
        boolean boolean72 = inflater69.finished();
        byte[] byteArray79 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater69.setInput(byteArray79);
        inflater65.setInput(byteArray79);
        inflater57.setInput(byteArray79);
        int int85 = inflater49.inflate(byteArray79, 6, (int) (short) 0);
        int int86 = inflater46.inflate(byteArray79);
        inflater39.setInput(byteArray79, (int) (byte) 0, (int) (byte) 1);
        int int92 = inflater15.inflate(byteArray79, 1, 0);
        inflater8.setInput(byteArray79);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.setDictionary(byteArray79);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(true);
        int int2 = inflater1.getRemaining();
        long long3 = inflater1.getBytesRead();
        java.util.zip.Inflater inflater4 = new java.util.zip.Inflater();
        boolean boolean5 = inflater4.finished();
        int int6 = inflater4.getRemaining();
        inflater4.end();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        boolean boolean9 = inflater8.finished();
        int int10 = inflater8.getRemaining();
        boolean boolean11 = inflater8.finished();
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater8.setInput(byteArray18);
        inflater4.setInput(byteArray18);
        inflater1.setInput(byteArray18, (int) (byte) 1, (int) (short) 1);
        int int24 = inflater1.getTotalIn();
        int int25 = inflater1.getRemaining();
        int int26 = inflater1.getAdler();
        inflater1.end();
        boolean boolean28 = inflater1.needsInput();
        java.util.zip.Inflater inflater29 = new java.util.zip.Inflater();
        byte[] byteArray31 = new byte[] { (byte) 1 };
        int int32 = inflater29.inflate(byteArray31);
        int int33 = inflater29.getTotalIn();
        long long34 = inflater29.getBytesWritten();
        int int35 = inflater29.getAdler();
        int int36 = inflater29.getAdler();
        long long37 = inflater29.getBytesRead();
        boolean boolean38 = inflater29.finished();
        long long39 = inflater29.getBytesRead();
        java.util.zip.Inflater inflater40 = new java.util.zip.Inflater();
        byte[] byteArray42 = new byte[] { (byte) 1 };
        int int43 = inflater40.inflate(byteArray42);
        int int44 = inflater40.getTotalIn();
        int int45 = inflater40.getTotalIn();
        java.util.zip.Inflater inflater46 = new java.util.zip.Inflater();
        boolean boolean47 = inflater46.finished();
        int int48 = inflater46.getRemaining();
        boolean boolean49 = inflater46.finished();
        long long50 = inflater46.getBytesRead();
        boolean boolean51 = inflater46.finished();
        long long52 = inflater46.getBytesRead();
        boolean boolean53 = inflater46.needsDictionary();
        boolean boolean54 = inflater46.needsDictionary();
        java.util.zip.Inflater inflater55 = new java.util.zip.Inflater();
        boolean boolean56 = inflater55.needsDictionary();
        int int57 = inflater55.getTotalOut();
        int int58 = inflater55.getTotalOut();
        boolean boolean59 = inflater55.needsInput();
        java.util.zip.Inflater inflater60 = new java.util.zip.Inflater();
        byte[] byteArray62 = new byte[] { (byte) 1 };
        int int63 = inflater60.inflate(byteArray62);
        inflater60.reset();
        java.util.zip.Inflater inflater65 = new java.util.zip.Inflater();
        byte[] byteArray67 = new byte[] { (byte) 1 };
        int int68 = inflater65.inflate(byteArray67);
        int int69 = inflater65.getTotalIn();
        java.util.zip.Inflater inflater70 = new java.util.zip.Inflater();
        byte[] byteArray72 = new byte[] { (byte) 1 };
        int int73 = inflater70.inflate(byteArray72);
        byte[] byteArray78 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int79 = inflater70.inflate(byteArray78);
        int int80 = inflater65.inflate(byteArray78);
        inflater60.setInput(byteArray78);
        inflater55.setInput(byteArray78);
        int int83 = inflater46.inflate(byteArray78);
        inflater40.setInput(byteArray78);
        inflater29.setInput(byteArray78);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int88 = inflater1.inflate(byteArray78, (int) (byte) 0, 0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getTotalIn();
        long long5 = inflater0.getBytesWritten();
        int int6 = inflater0.getAdler();
        int int7 = inflater0.getAdler();
        boolean boolean8 = inflater0.needsInput();
        inflater0.reset();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        int int3 = inflater0.getTotalOut();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1 };
        inflater0.setInput(byteArray6);
        inflater0.end();
        java.util.zip.Inflater inflater9 = new java.util.zip.Inflater();
        boolean boolean10 = inflater9.finished();
        int int11 = inflater9.getRemaining();
        boolean boolean12 = inflater9.finished();
        java.util.zip.Inflater inflater13 = new java.util.zip.Inflater();
        boolean boolean14 = inflater13.finished();
        int int15 = inflater13.getRemaining();
        boolean boolean16 = inflater13.finished();
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater13.setInput(byteArray23);
        inflater9.setInput(byteArray23);
        int int26 = inflater9.getAdler();
        java.util.zip.Inflater inflater27 = new java.util.zip.Inflater();
        byte[] byteArray29 = new byte[] { (byte) 1 };
        int int30 = inflater27.inflate(byteArray29);
        boolean boolean31 = inflater27.finished();
        int int32 = inflater27.getRemaining();
        java.util.zip.Inflater inflater33 = new java.util.zip.Inflater();
        byte[] byteArray35 = new byte[] { (byte) 1 };
        int int36 = inflater33.inflate(byteArray35);
        inflater33.reset();
        java.util.zip.Inflater inflater38 = new java.util.zip.Inflater();
        byte[] byteArray40 = new byte[] { (byte) 1 };
        int int41 = inflater38.inflate(byteArray40);
        int int42 = inflater38.getTotalIn();
        java.util.zip.Inflater inflater43 = new java.util.zip.Inflater();
        byte[] byteArray45 = new byte[] { (byte) 1 };
        int int46 = inflater43.inflate(byteArray45);
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int52 = inflater43.inflate(byteArray51);
        int int53 = inflater38.inflate(byteArray51);
        inflater33.setInput(byteArray51);
        inflater27.setInput(byteArray51);
        inflater9.setInput(byteArray51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        inflater0.setDictionary(byteArray51);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        java.util.zip.Inflater inflater4 = new java.util.zip.Inflater();
        boolean boolean5 = inflater4.finished();
        int int6 = inflater4.getRemaining();
        boolean boolean7 = inflater4.finished();
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater4.setInput(byteArray14);
        inflater0.setInput(byteArray14);
        boolean boolean17 = inflater0.needsDictionary();
        boolean boolean18 = inflater0.finished();
        java.util.zip.Inflater inflater19 = new java.util.zip.Inflater();
        boolean boolean20 = inflater19.finished();
        boolean boolean21 = inflater19.needsInput();
        boolean boolean22 = inflater19.needsInput();
        inflater19.reset();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater(false);
        int int26 = inflater25.getTotalIn();
        java.util.zip.Inflater inflater27 = new java.util.zip.Inflater();
        boolean boolean28 = inflater27.finished();
        int int29 = inflater27.getRemaining();
        boolean boolean30 = inflater27.needsDictionary();
        boolean boolean31 = inflater27.needsInput();
        int int32 = inflater27.getRemaining();
        inflater27.reset();
        java.util.zip.Inflater inflater34 = new java.util.zip.Inflater();
        boolean boolean35 = inflater34.finished();
        int int36 = inflater34.getRemaining();
        boolean boolean37 = inflater34.finished();
        byte[] byteArray44 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater34.setInput(byteArray44);
        inflater27.setInput(byteArray44);
        int int47 = inflater27.getTotalOut();
        boolean boolean48 = inflater27.needsInput();
        boolean boolean49 = inflater27.needsInput();
        java.util.zip.Inflater inflater50 = new java.util.zip.Inflater();
        boolean boolean51 = inflater50.finished();
        int int52 = inflater50.getRemaining();
        boolean boolean53 = inflater50.needsDictionary();
        java.util.zip.Inflater inflater54 = new java.util.zip.Inflater();
        boolean boolean55 = inflater54.finished();
        int int56 = inflater54.getRemaining();
        inflater54.end();
        java.util.zip.Inflater inflater58 = new java.util.zip.Inflater();
        boolean boolean59 = inflater58.finished();
        int int60 = inflater58.getRemaining();
        boolean boolean61 = inflater58.finished();
        byte[] byteArray68 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater58.setInput(byteArray68);
        inflater54.setInput(byteArray68);
        int int71 = inflater50.inflate(byteArray68);
        inflater27.setInput(byteArray68, (int) (byte) 0, (int) (byte) 1);
        int int75 = inflater25.inflate(byteArray68);
        inflater19.setInput(byteArray68);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        inflater0.setDictionary(byteArray68);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        int int2 = inflater0.getTotalOut();
        int int3 = inflater0.getAdler();
        int int4 = inflater0.getTotalIn();
        int int5 = inflater0.getAdler();
        int int6 = inflater0.getRemaining();
        int int7 = inflater0.getTotalOut();
        inflater0.end();
        java.util.zip.Inflater inflater9 = new java.util.zip.Inflater();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        int int12 = inflater9.inflate(byteArray11);
        int int13 = inflater9.getAdler();
        boolean boolean14 = inflater9.finished();
        long long15 = inflater9.getBytesWritten();
        java.util.zip.Inflater inflater16 = new java.util.zip.Inflater();
        boolean boolean17 = inflater16.finished();
        boolean boolean18 = inflater16.needsInput();
        boolean boolean19 = inflater16.needsInput();
        java.util.zip.Inflater inflater20 = new java.util.zip.Inflater();
        boolean boolean21 = inflater20.finished();
        int int22 = inflater20.getRemaining();
        boolean boolean23 = inflater20.needsDictionary();
        long long24 = inflater20.getBytesRead();
        boolean boolean25 = inflater20.needsDictionary();
        java.util.zip.Inflater inflater26 = new java.util.zip.Inflater();
        byte[] byteArray28 = new byte[] { (byte) 1 };
        int int29 = inflater26.inflate(byteArray28);
        long long30 = inflater26.getBytesWritten();
        inflater26.reset();
        long long32 = inflater26.getBytesWritten();
        java.util.zip.Inflater inflater33 = new java.util.zip.Inflater();
        boolean boolean34 = inflater33.finished();
        int int35 = inflater33.getRemaining();
        boolean boolean36 = inflater33.needsDictionary();
        boolean boolean37 = inflater33.needsInput();
        int int38 = inflater33.getRemaining();
        java.util.zip.Inflater inflater39 = new java.util.zip.Inflater();
        boolean boolean40 = inflater39.finished();
        int int41 = inflater39.getRemaining();
        boolean boolean42 = inflater39.finished();
        byte[] byteArray49 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater39.setInput(byteArray49);
        int int51 = inflater33.inflate(byteArray49);
        inflater26.setInput(byteArray49);
        inflater20.setInput(byteArray49);
        int int54 = inflater16.inflate(byteArray49);
        int int55 = inflater9.inflate(byteArray49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int56 = inflater0.inflate(byteArray49);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        inflater0.end();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsDictionary();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        int int8 = inflater5.inflate(byteArray7);
        long long9 = inflater5.getBytesWritten();
        inflater5.reset();
        long long11 = inflater5.getBytesWritten();
        int int12 = inflater5.getTotalIn();
        boolean boolean13 = inflater5.needsDictionary();
        int int14 = inflater5.getTotalIn();
        int int15 = inflater5.getTotalIn();
        java.util.zip.Inflater inflater16 = new java.util.zip.Inflater();
        boolean boolean17 = inflater16.finished();
        int int18 = inflater16.getRemaining();
        boolean boolean19 = inflater16.needsDictionary();
        boolean boolean20 = inflater16.needsInput();
        int int21 = inflater16.getRemaining();
        java.util.zip.Inflater inflater22 = new java.util.zip.Inflater();
        boolean boolean23 = inflater22.finished();
        int int24 = inflater22.getRemaining();
        boolean boolean25 = inflater22.finished();
        byte[] byteArray32 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater22.setInput(byteArray32);
        int int34 = inflater16.inflate(byteArray32);
        boolean boolean35 = inflater16.finished();
        int int36 = inflater16.getTotalOut();
        java.util.zip.Inflater inflater37 = new java.util.zip.Inflater();
        boolean boolean38 = inflater37.finished();
        int int39 = inflater37.getRemaining();
        boolean boolean40 = inflater37.needsDictionary();
        long long41 = inflater37.getBytesRead();
        boolean boolean42 = inflater37.needsDictionary();
        java.util.zip.Inflater inflater43 = new java.util.zip.Inflater();
        byte[] byteArray45 = new byte[] { (byte) 1 };
        int int46 = inflater43.inflate(byteArray45);
        long long47 = inflater43.getBytesWritten();
        inflater43.reset();
        long long49 = inflater43.getBytesWritten();
        java.util.zip.Inflater inflater50 = new java.util.zip.Inflater();
        boolean boolean51 = inflater50.finished();
        int int52 = inflater50.getRemaining();
        boolean boolean53 = inflater50.needsDictionary();
        boolean boolean54 = inflater50.needsInput();
        int int55 = inflater50.getRemaining();
        java.util.zip.Inflater inflater56 = new java.util.zip.Inflater();
        boolean boolean57 = inflater56.finished();
        int int58 = inflater56.getRemaining();
        boolean boolean59 = inflater56.finished();
        byte[] byteArray66 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater56.setInput(byteArray66);
        int int68 = inflater50.inflate(byteArray66);
        inflater43.setInput(byteArray66);
        inflater37.setInput(byteArray66);
        int int71 = inflater16.inflate(byteArray66);
        java.util.zip.Inflater inflater72 = new java.util.zip.Inflater();
        boolean boolean73 = inflater72.finished();
        int int74 = inflater72.getRemaining();
        boolean boolean75 = inflater72.needsInput();
        java.util.zip.Inflater inflater76 = new java.util.zip.Inflater();
        boolean boolean77 = inflater76.finished();
        int int78 = inflater76.getRemaining();
        boolean boolean79 = inflater76.finished();
        byte[] byteArray86 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater76.setInput(byteArray86);
        inflater72.setInput(byteArray86);
        int int89 = inflater16.inflate(byteArray86);
        int int90 = inflater5.inflate(byteArray86);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.setDictionary(byteArray86);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        inflater0.end();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsDictionary();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int5 = inflater0.getTotalOut();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        boolean boolean21 = inflater0.needsInput();
        boolean boolean22 = inflater0.needsDictionary();
        boolean boolean23 = inflater0.needsInput();
        inflater0.end();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        byte[] byteArray27 = new byte[] { (byte) 1 };
        int int28 = inflater25.inflate(byteArray27);
        boolean boolean29 = inflater25.finished();
        inflater25.end();
        inflater25.end();
        boolean boolean32 = inflater25.needsInput();
        java.util.zip.Inflater inflater33 = new java.util.zip.Inflater();
        boolean boolean34 = inflater33.finished();
        int int35 = inflater33.getRemaining();
        boolean boolean36 = inflater33.needsDictionary();
        boolean boolean37 = inflater33.needsInput();
        int int38 = inflater33.getRemaining();
        java.util.zip.Inflater inflater39 = new java.util.zip.Inflater();
        boolean boolean40 = inflater39.finished();
        int int41 = inflater39.getRemaining();
        boolean boolean42 = inflater39.finished();
        byte[] byteArray49 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater39.setInput(byteArray49);
        int int51 = inflater33.inflate(byteArray49);
        boolean boolean52 = inflater33.finished();
        int int53 = inflater33.getAdler();
        boolean boolean54 = inflater33.finished();
        int int55 = inflater33.getAdler();
        boolean boolean56 = inflater33.needsInput();
        java.util.zip.Inflater inflater57 = new java.util.zip.Inflater();
        byte[] byteArray59 = new byte[] { (byte) 1 };
        int int60 = inflater57.inflate(byteArray59);
        int int61 = inflater57.getTotalIn();
        java.util.zip.Inflater inflater62 = new java.util.zip.Inflater();
        byte[] byteArray64 = new byte[] { (byte) 1 };
        int int65 = inflater62.inflate(byteArray64);
        byte[] byteArray70 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int71 = inflater62.inflate(byteArray70);
        int int72 = inflater57.inflate(byteArray70);
        int int73 = inflater33.inflate(byteArray70);
        inflater25.setInput(byteArray70, (int) (byte) 0, (int) (short) 1);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.setDictionary(byteArray70);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater0.setInput(byteArray10);
        boolean boolean12 = inflater0.needsInput();
        boolean boolean13 = inflater0.needsDictionary();
        boolean boolean14 = inflater0.needsInput();
        inflater0.reset();
        long long16 = inflater0.getBytesRead();
        long long17 = inflater0.getBytesWritten();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long19 = inflater0.getBytesRead();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getTotalIn();
        long long5 = inflater0.getBytesWritten();
        int int6 = inflater0.getAdler();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int8 = inflater0.getTotalOut();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        boolean boolean4 = inflater0.finished();
        int int5 = inflater0.getRemaining();
        long long6 = inflater0.getBytesRead();
        boolean boolean7 = inflater0.needsDictionary();
        boolean boolean8 = inflater0.needsInput();
        int int9 = inflater0.getAdler();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int11 = inflater0.getTotalIn();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        boolean boolean9 = inflater6.finished();
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater6.setInput(byteArray16);
        int int18 = inflater0.inflate(byteArray16);
        boolean boolean19 = inflater0.finished();
        int int20 = inflater0.getTotalOut();
        java.util.zip.Inflater inflater21 = new java.util.zip.Inflater();
        boolean boolean22 = inflater21.finished();
        int int23 = inflater21.getRemaining();
        boolean boolean24 = inflater21.needsDictionary();
        long long25 = inflater21.getBytesRead();
        boolean boolean26 = inflater21.needsDictionary();
        java.util.zip.Inflater inflater27 = new java.util.zip.Inflater();
        byte[] byteArray29 = new byte[] { (byte) 1 };
        int int30 = inflater27.inflate(byteArray29);
        long long31 = inflater27.getBytesWritten();
        inflater27.reset();
        long long33 = inflater27.getBytesWritten();
        java.util.zip.Inflater inflater34 = new java.util.zip.Inflater();
        boolean boolean35 = inflater34.finished();
        int int36 = inflater34.getRemaining();
        boolean boolean37 = inflater34.needsDictionary();
        boolean boolean38 = inflater34.needsInput();
        int int39 = inflater34.getRemaining();
        java.util.zip.Inflater inflater40 = new java.util.zip.Inflater();
        boolean boolean41 = inflater40.finished();
        int int42 = inflater40.getRemaining();
        boolean boolean43 = inflater40.finished();
        byte[] byteArray50 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater40.setInput(byteArray50);
        int int52 = inflater34.inflate(byteArray50);
        inflater27.setInput(byteArray50);
        inflater21.setInput(byteArray50);
        int int55 = inflater0.inflate(byteArray50);
        java.util.zip.Inflater inflater56 = new java.util.zip.Inflater();
        boolean boolean57 = inflater56.finished();
        int int58 = inflater56.getRemaining();
        boolean boolean59 = inflater56.needsInput();
        java.util.zip.Inflater inflater60 = new java.util.zip.Inflater();
        boolean boolean61 = inflater60.finished();
        int int62 = inflater60.getRemaining();
        boolean boolean63 = inflater60.finished();
        byte[] byteArray70 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater60.setInput(byteArray70);
        inflater56.setInput(byteArray70);
        int int73 = inflater0.inflate(byteArray70);
        int int74 = inflater0.getRemaining();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long76 = inflater0.getBytesRead();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsInput();
        boolean boolean6 = inflater0.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        java.util.zip.Inflater inflater4 = new java.util.zip.Inflater();
        boolean boolean5 = inflater4.finished();
        int int6 = inflater4.getRemaining();
        boolean boolean7 = inflater4.finished();
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater4.setInput(byteArray14);
        inflater0.setInput(byteArray14);
        boolean boolean17 = inflater0.needsDictionary();
        boolean boolean18 = inflater0.finished();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int19 = inflater0.getTotalOut();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        int int3 = inflater0.getTotalOut();
        inflater0.reset();
        boolean boolean5 = inflater0.needsInput();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        boolean boolean9 = inflater6.needsDictionary();
        long long10 = inflater6.getBytesRead();
        boolean boolean11 = inflater6.needsDictionary();
        java.util.zip.Inflater inflater12 = new java.util.zip.Inflater();
        byte[] byteArray14 = new byte[] { (byte) 1 };
        int int15 = inflater12.inflate(byteArray14);
        long long16 = inflater12.getBytesWritten();
        inflater12.reset();
        long long18 = inflater12.getBytesWritten();
        java.util.zip.Inflater inflater19 = new java.util.zip.Inflater();
        boolean boolean20 = inflater19.finished();
        int int21 = inflater19.getRemaining();
        boolean boolean22 = inflater19.needsDictionary();
        boolean boolean23 = inflater19.needsInput();
        int int24 = inflater19.getRemaining();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        boolean boolean26 = inflater25.finished();
        int int27 = inflater25.getRemaining();
        boolean boolean28 = inflater25.finished();
        byte[] byteArray35 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater25.setInput(byteArray35);
        int int37 = inflater19.inflate(byteArray35);
        inflater12.setInput(byteArray35);
        inflater6.setInput(byteArray35);
        int int40 = inflater0.inflate(byteArray35);
        inflater0.end();
        inflater0.end();
        boolean boolean43 = inflater0.needsInput();
        java.util.zip.Inflater inflater44 = new java.util.zip.Inflater();
        boolean boolean45 = inflater44.finished();
        int int46 = inflater44.getRemaining();
        boolean boolean47 = inflater44.needsDictionary();
        long long48 = inflater44.getBytesRead();
        boolean boolean49 = inflater44.needsInput();
        int int50 = inflater44.getTotalOut();
        long long51 = inflater44.getBytesWritten();
        java.util.zip.Inflater inflater52 = new java.util.zip.Inflater();
        byte[] byteArray54 = new byte[] { (byte) 1 };
        int int55 = inflater52.inflate(byteArray54);
        boolean boolean56 = inflater52.finished();
        int int57 = inflater52.getRemaining();
        java.util.zip.Inflater inflater58 = new java.util.zip.Inflater();
        boolean boolean59 = inflater58.finished();
        java.util.zip.Inflater inflater60 = new java.util.zip.Inflater();
        byte[] byteArray62 = new byte[] { (byte) 1 };
        int int63 = inflater60.inflate(byteArray62);
        int int64 = inflater60.getTotalIn();
        java.util.zip.Inflater inflater65 = new java.util.zip.Inflater();
        boolean boolean66 = inflater65.finished();
        int int67 = inflater65.getRemaining();
        inflater65.end();
        boolean boolean69 = inflater65.needsInput();
        java.util.zip.Inflater inflater70 = new java.util.zip.Inflater();
        byte[] byteArray72 = new byte[] { (byte) 1 };
        int int73 = inflater70.inflate(byteArray72);
        inflater65.setInput(byteArray72);
        inflater60.setInput(byteArray72);
        inflater58.setInput(byteArray72);
        int int77 = inflater52.inflate(byteArray72);
        inflater44.setInput(byteArray72);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int79 = inflater0.inflate(byteArray72);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(false);
        int int2 = inflater1.getAdler();
        long long3 = inflater1.getBytesWritten();
        inflater1.end();
        boolean boolean5 = inflater1.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int6 = inflater1.getTotalIn();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        long long4 = inflater0.getBytesRead();
        boolean boolean5 = inflater0.needsDictionary();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        byte[] byteArray8 = new byte[] { (byte) 1 };
        int int9 = inflater6.inflate(byteArray8);
        long long10 = inflater6.getBytesWritten();
        inflater6.reset();
        long long12 = inflater6.getBytesWritten();
        java.util.zip.Inflater inflater13 = new java.util.zip.Inflater();
        boolean boolean14 = inflater13.finished();
        int int15 = inflater13.getRemaining();
        boolean boolean16 = inflater13.needsDictionary();
        boolean boolean17 = inflater13.needsInput();
        int int18 = inflater13.getRemaining();
        java.util.zip.Inflater inflater19 = new java.util.zip.Inflater();
        boolean boolean20 = inflater19.finished();
        int int21 = inflater19.getRemaining();
        boolean boolean22 = inflater19.finished();
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater19.setInput(byteArray29);
        int int31 = inflater13.inflate(byteArray29);
        inflater6.setInput(byteArray29);
        inflater0.setInput(byteArray29);
        boolean boolean34 = inflater0.needsInput();
        inflater0.end();
        boolean boolean36 = inflater0.needsDictionary();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long37 = inflater0.getBytesWritten();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        boolean boolean6 = inflater5.finished();
        int int7 = inflater5.getRemaining();
        boolean boolean8 = inflater5.needsDictionary();
        long long9 = inflater5.getBytesRead();
        boolean boolean10 = inflater5.needsInput();
        java.util.zip.Inflater inflater11 = new java.util.zip.Inflater();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        int int14 = inflater11.inflate(byteArray13);
        long long15 = inflater11.getBytesWritten();
        inflater11.reset();
        long long17 = inflater11.getBytesWritten();
        java.util.zip.Inflater inflater18 = new java.util.zip.Inflater();
        boolean boolean19 = inflater18.finished();
        int int20 = inflater18.getRemaining();
        boolean boolean21 = inflater18.needsDictionary();
        boolean boolean22 = inflater18.needsInput();
        int int23 = inflater18.getRemaining();
        java.util.zip.Inflater inflater24 = new java.util.zip.Inflater();
        boolean boolean25 = inflater24.finished();
        int int26 = inflater24.getRemaining();
        boolean boolean27 = inflater24.finished();
        byte[] byteArray34 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater24.setInput(byteArray34);
        int int36 = inflater18.inflate(byteArray34);
        inflater11.setInput(byteArray34);
        int int38 = inflater5.inflate(byteArray34);
        inflater0.setInput(byteArray34);
        boolean boolean40 = inflater0.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long41 = inflater0.getBytesWritten();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        int int2 = inflater0.getTotalOut();
        int int3 = inflater0.getTotalOut();
        long long4 = inflater0.getBytesWritten();
        long long5 = inflater0.getBytesRead();
        inflater0.end();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        byte[] byteArray9 = new byte[] { (byte) 1 };
        int int10 = inflater7.inflate(byteArray9);
        int int11 = inflater7.getAdler();
        boolean boolean12 = inflater7.finished();
        java.util.zip.Inflater inflater13 = new java.util.zip.Inflater();
        byte[] byteArray15 = new byte[] { (byte) 1 };
        int int16 = inflater13.inflate(byteArray15);
        inflater13.reset();
        java.util.zip.Inflater inflater18 = new java.util.zip.Inflater();
        byte[] byteArray20 = new byte[] { (byte) 1 };
        int int21 = inflater18.inflate(byteArray20);
        long long22 = inflater18.getBytesWritten();
        inflater18.reset();
        long long24 = inflater18.getBytesWritten();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        boolean boolean26 = inflater25.finished();
        int int27 = inflater25.getRemaining();
        boolean boolean28 = inflater25.needsDictionary();
        boolean boolean29 = inflater25.needsInput();
        int int30 = inflater25.getRemaining();
        java.util.zip.Inflater inflater31 = new java.util.zip.Inflater();
        boolean boolean32 = inflater31.finished();
        int int33 = inflater31.getRemaining();
        boolean boolean34 = inflater31.finished();
        byte[] byteArray41 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater31.setInput(byteArray41);
        int int43 = inflater25.inflate(byteArray41);
        inflater18.setInput(byteArray41);
        inflater13.setInput(byteArray41);
        inflater7.setInput(byteArray41, (int) (byte) 0, 1);
        java.util.zip.Inflater inflater50 = new java.util.zip.Inflater(true);
        int int51 = inflater50.getRemaining();
        long long52 = inflater50.getBytesRead();
        java.util.zip.Inflater inflater53 = new java.util.zip.Inflater();
        boolean boolean54 = inflater53.finished();
        int int55 = inflater53.getRemaining();
        inflater53.end();
        java.util.zip.Inflater inflater57 = new java.util.zip.Inflater();
        boolean boolean58 = inflater57.finished();
        int int59 = inflater57.getRemaining();
        boolean boolean60 = inflater57.finished();
        byte[] byteArray67 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater57.setInput(byteArray67);
        inflater53.setInput(byteArray67);
        inflater50.setInput(byteArray67, (int) (byte) 1, (int) (short) 1);
        int int73 = inflater7.inflate(byteArray67);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        inflater0.setDictionary(byteArray67);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        long long21 = inflater0.getBytesRead();
        inflater0.end();
        int int23 = inflater0.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getRemaining();
        boolean boolean21 = inflater0.finished();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int23 = inflater0.getTotalOut();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        boolean boolean4 = inflater0.finished();
        inflater0.end();
        inflater0.end();
        boolean boolean7 = inflater0.needsDictionary();
        int int8 = inflater0.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int9 = inflater0.getTotalIn();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        int int2 = inflater0.getTotalOut();
        int int3 = inflater0.getAdler();
        int int4 = inflater0.getTotalIn();
        int int5 = inflater0.getAdler();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int7 = inflater0.getTotalOut();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        boolean boolean4 = inflater0.finished();
        inflater0.end();
        boolean boolean6 = inflater0.finished();
        boolean boolean7 = inflater0.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        long long4 = inflater0.getBytesRead();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int6 = inflater0.getAdler();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        int int3 = inflater0.getTotalOut();
        inflater0.reset();
        boolean boolean5 = inflater0.needsInput();
        boolean boolean6 = inflater0.needsInput();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long8 = inflater0.getBytesWritten();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        long long4 = inflater0.getBytesRead();
        inflater0.end();
        boolean boolean6 = inflater0.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int7 = inflater0.getAdler();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        int int2 = inflater0.getTotalOut();
        int int3 = inflater0.getTotalOut();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getTotalIn();
        int int6 = inflater0.getTotalIn();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int8 = inflater0.getAdler();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.end();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        inflater6.end();
        java.util.zip.Inflater inflater10 = new java.util.zip.Inflater();
        boolean boolean11 = inflater10.finished();
        int int12 = inflater10.getRemaining();
        boolean boolean13 = inflater10.finished();
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater10.setInput(byteArray20);
        inflater6.setInput(byteArray20);
        inflater0.setInput(byteArray20);
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long25 = inflater0.getBytesWritten();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        java.util.zip.Inflater inflater4 = new java.util.zip.Inflater();
        boolean boolean5 = inflater4.finished();
        int int6 = inflater4.getRemaining();
        boolean boolean7 = inflater4.finished();
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater4.setInput(byteArray14);
        inflater0.setInput(byteArray14);
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int18 = inflater0.getAdler();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        int int4 = inflater0.getAdler();
        boolean boolean5 = inflater0.finished();
        long long6 = inflater0.getBytesWritten();
        long long7 = inflater0.getBytesRead();
        inflater0.end();
        java.util.zip.Inflater inflater9 = new java.util.zip.Inflater();
        boolean boolean10 = inflater9.finished();
        int int11 = inflater9.getRemaining();
        boolean boolean12 = inflater9.needsDictionary();
        boolean boolean13 = inflater9.needsInput();
        int int14 = inflater9.getRemaining();
        inflater9.reset();
        java.util.zip.Inflater inflater16 = new java.util.zip.Inflater();
        boolean boolean17 = inflater16.finished();
        int int18 = inflater16.getRemaining();
        boolean boolean19 = inflater16.finished();
        byte[] byteArray26 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater16.setInput(byteArray26);
        inflater9.setInput(byteArray26);
        int int29 = inflater9.getTotalOut();
        boolean boolean30 = inflater9.needsInput();
        boolean boolean31 = inflater9.needsInput();
        java.util.zip.Inflater inflater32 = new java.util.zip.Inflater();
        boolean boolean33 = inflater32.finished();
        int int34 = inflater32.getRemaining();
        boolean boolean35 = inflater32.needsDictionary();
        java.util.zip.Inflater inflater36 = new java.util.zip.Inflater();
        boolean boolean37 = inflater36.finished();
        int int38 = inflater36.getRemaining();
        inflater36.end();
        java.util.zip.Inflater inflater40 = new java.util.zip.Inflater();
        boolean boolean41 = inflater40.finished();
        int int42 = inflater40.getRemaining();
        boolean boolean43 = inflater40.finished();
        byte[] byteArray50 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater40.setInput(byteArray50);
        inflater36.setInput(byteArray50);
        int int53 = inflater32.inflate(byteArray50);
        inflater9.setInput(byteArray50, (int) (byte) 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        inflater0.setDictionary(byteArray50);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(true);
        inflater1.end();
        int int3 = inflater1.getRemaining();
        boolean boolean4 = inflater1.finished();
        int int5 = inflater1.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long6 = inflater1.getBytesRead();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater0.setInput(byteArray10);
        inflater0.end();
        int int13 = inflater0.getRemaining();
        java.util.zip.Inflater inflater14 = new java.util.zip.Inflater();
        boolean boolean15 = inflater14.finished();
        int int16 = inflater14.getRemaining();
        boolean boolean17 = inflater14.finished();
        int int18 = inflater14.getAdler();
        java.util.zip.Inflater inflater19 = new java.util.zip.Inflater();
        boolean boolean20 = inflater19.finished();
        int int21 = inflater19.getRemaining();
        inflater19.end();
        boolean boolean23 = inflater19.needsInput();
        java.util.zip.Inflater inflater24 = new java.util.zip.Inflater();
        byte[] byteArray26 = new byte[] { (byte) 1 };
        int int27 = inflater24.inflate(byteArray26);
        inflater19.setInput(byteArray26);
        int int29 = inflater14.inflate(byteArray26);
        inflater0.setInput(byteArray26);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int31 = inflater0.getAdler();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        boolean boolean4 = inflater0.finished();
        inflater0.end();
        inflater0.end();
        boolean boolean7 = inflater0.needsInput();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        boolean boolean9 = inflater8.finished();
        int int10 = inflater8.getRemaining();
        boolean boolean11 = inflater8.needsDictionary();
        boolean boolean12 = inflater8.needsInput();
        int int13 = inflater8.getRemaining();
        inflater8.reset();
        boolean boolean15 = inflater8.needsDictionary();
        int int16 = inflater8.getTotalIn();
        java.util.zip.Inflater inflater17 = new java.util.zip.Inflater();
        boolean boolean18 = inflater17.finished();
        int int19 = inflater17.getRemaining();
        boolean boolean20 = inflater17.needsDictionary();
        boolean boolean21 = inflater17.needsInput();
        int int22 = inflater17.getRemaining();
        inflater17.reset();
        java.util.zip.Inflater inflater24 = new java.util.zip.Inflater();
        boolean boolean25 = inflater24.finished();
        int int26 = inflater24.getRemaining();
        boolean boolean27 = inflater24.needsDictionary();
        boolean boolean28 = inflater24.needsInput();
        int int29 = inflater24.getRemaining();
        inflater24.reset();
        java.util.zip.Inflater inflater31 = new java.util.zip.Inflater();
        boolean boolean32 = inflater31.finished();
        int int33 = inflater31.getRemaining();
        boolean boolean34 = inflater31.finished();
        byte[] byteArray41 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater31.setInput(byteArray41);
        inflater24.setInput(byteArray41);
        int int46 = inflater17.inflate(byteArray41, 0, (int) (byte) 0);
        int int47 = inflater8.inflate(byteArray41);
        inflater0.setInput(byteArray41);
        java.util.zip.Inflater inflater50 = new java.util.zip.Inflater(true);
        int int51 = inflater50.getRemaining();
        long long52 = inflater50.getBytesRead();
        java.util.zip.Inflater inflater53 = new java.util.zip.Inflater();
        byte[] byteArray55 = new byte[] { (byte) 1 };
        int int56 = inflater53.inflate(byteArray55);
        int int57 = inflater50.inflate(byteArray55);
        inflater0.setInput(byteArray55);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int59 = inflater0.getAdler();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        int int4 = inflater0.getAdler();
        inflater0.reset();
        long long6 = inflater0.getBytesWritten();
        inflater0.end();
        boolean boolean8 = inflater0.needsInput();
        java.util.zip.Inflater inflater9 = new java.util.zip.Inflater();
        boolean boolean10 = inflater9.needsDictionary();
        int int11 = inflater9.getTotalOut();
        int int12 = inflater9.getTotalOut();
        long long13 = inflater9.getBytesWritten();
        java.util.zip.Inflater inflater14 = new java.util.zip.Inflater();
        boolean boolean15 = inflater14.finished();
        int int16 = inflater14.getRemaining();
        boolean boolean17 = inflater14.needsDictionary();
        boolean boolean18 = inflater14.needsInput();
        int int19 = inflater14.getRemaining();
        java.util.zip.Inflater inflater20 = new java.util.zip.Inflater();
        boolean boolean21 = inflater20.finished();
        int int22 = inflater20.getRemaining();
        boolean boolean23 = inflater20.finished();
        byte[] byteArray30 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater20.setInput(byteArray30);
        int int32 = inflater14.inflate(byteArray30);
        java.util.zip.Inflater inflater33 = new java.util.zip.Inflater();
        boolean boolean34 = inflater33.finished();
        int int35 = inflater33.getRemaining();
        boolean boolean36 = inflater33.finished();
        java.util.zip.Inflater inflater37 = new java.util.zip.Inflater();
        boolean boolean38 = inflater37.finished();
        int int39 = inflater37.getRemaining();
        boolean boolean40 = inflater37.finished();
        byte[] byteArray47 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater37.setInput(byteArray47);
        inflater33.setInput(byteArray47);
        inflater14.setInput(byteArray47);
        int int51 = inflater9.inflate(byteArray47);
        inflater0.setInput(byteArray47, (int) (byte) 0, (int) (byte) 0);
        java.util.zip.Inflater inflater56 = new java.util.zip.Inflater(true);
        int int57 = inflater56.getRemaining();
        long long58 = inflater56.getBytesRead();
        java.util.zip.Inflater inflater59 = new java.util.zip.Inflater();
        byte[] byteArray61 = new byte[] { (byte) 1 };
        int int62 = inflater59.inflate(byteArray61);
        int int63 = inflater56.inflate(byteArray61);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.setDictionary(byteArray61);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater0.setInput(byteArray10);
        inflater0.end();
        int int13 = inflater0.getRemaining();
        java.util.zip.Inflater inflater15 = new java.util.zip.Inflater(true);
        int int16 = inflater15.getRemaining();
        long long17 = inflater15.getBytesRead();
        int int18 = inflater15.getTotalIn();
        long long19 = inflater15.getBytesWritten();
        int int20 = inflater15.getTotalIn();
        java.util.zip.Inflater inflater21 = new java.util.zip.Inflater();
        byte[] byteArray23 = new byte[] { (byte) 1 };
        int int24 = inflater21.inflate(byteArray23);
        inflater21.reset();
        java.util.zip.Inflater inflater26 = new java.util.zip.Inflater();
        byte[] byteArray28 = new byte[] { (byte) 1 };
        int int29 = inflater26.inflate(byteArray28);
        int int30 = inflater26.getTotalIn();
        java.util.zip.Inflater inflater31 = new java.util.zip.Inflater();
        byte[] byteArray33 = new byte[] { (byte) 1 };
        int int34 = inflater31.inflate(byteArray33);
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int40 = inflater31.inflate(byteArray39);
        int int41 = inflater26.inflate(byteArray39);
        inflater21.setInput(byteArray39);
        int int43 = inflater15.inflate(byteArray39);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int44 = inflater0.inflate(byteArray39);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.end();
        boolean boolean6 = inflater0.needsDictionary();
        boolean boolean7 = inflater0.needsInput();
        boolean boolean8 = inflater0.needsDictionary();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int9 = inflater0.getTotalIn();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        long long4 = inflater0.getBytesRead();
        boolean boolean5 = inflater0.finished();
        long long6 = inflater0.getBytesRead();
        boolean boolean7 = inflater0.needsDictionary();
        int int8 = inflater0.getRemaining();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int10 = inflater0.getAdler();
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        long long4 = inflater0.getBytesRead();
        boolean boolean5 = inflater0.finished();
        long long6 = inflater0.getBytesRead();
        boolean boolean7 = inflater0.needsDictionary();
        int int8 = inflater0.getRemaining();
        inflater0.end();
        int int10 = inflater0.getRemaining();
        boolean boolean11 = inflater0.finished();
        boolean boolean12 = inflater0.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long13 = inflater0.getBytesWritten();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        boolean boolean4 = inflater0.finished();
        inflater0.end();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        boolean boolean9 = inflater6.finished();
        long long10 = inflater6.getBytesRead();
        inflater6.reset();
        java.util.zip.Inflater inflater12 = new java.util.zip.Inflater();
        boolean boolean13 = inflater12.finished();
        int int14 = inflater12.getRemaining();
        boolean boolean15 = inflater12.needsDictionary();
        boolean boolean16 = inflater12.needsInput();
        boolean boolean17 = inflater12.needsDictionary();
        boolean boolean18 = inflater12.needsDictionary();
        java.util.zip.Inflater inflater19 = new java.util.zip.Inflater();
        boolean boolean20 = inflater19.finished();
        int int21 = inflater19.getRemaining();
        boolean boolean22 = inflater19.finished();
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater19.setInput(byteArray29);
        int int31 = inflater12.inflate(byteArray29);
        int int32 = inflater6.inflate(byteArray29);
        java.util.zip.Inflater inflater33 = new java.util.zip.Inflater();
        boolean boolean34 = inflater33.finished();
        int int35 = inflater33.getRemaining();
        boolean boolean36 = inflater33.finished();
        int int37 = inflater33.getAdler();
        java.util.zip.Inflater inflater38 = new java.util.zip.Inflater();
        boolean boolean39 = inflater38.finished();
        int int40 = inflater38.getRemaining();
        inflater38.end();
        boolean boolean42 = inflater38.needsInput();
        java.util.zip.Inflater inflater43 = new java.util.zip.Inflater();
        byte[] byteArray45 = new byte[] { (byte) 1 };
        int int46 = inflater43.inflate(byteArray45);
        inflater38.setInput(byteArray45);
        int int48 = inflater33.inflate(byteArray45);
        inflater6.setInput(byteArray45);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.setDictionary(byteArray45);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.reset();
        int int6 = inflater0.getRemaining();
        inflater0.end();
        int int8 = inflater0.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int9 = inflater0.getAdler();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        int int4 = inflater0.getAdler();
        inflater0.reset();
        long long6 = inflater0.getBytesWritten();
        inflater0.end();
        boolean boolean8 = inflater0.needsInput();
        java.util.zip.Inflater inflater9 = new java.util.zip.Inflater();
        boolean boolean10 = inflater9.finished();
        int int11 = inflater9.getRemaining();
        boolean boolean12 = inflater9.finished();
        long long13 = inflater9.getBytesRead();
        int int14 = inflater9.getTotalOut();
        int int15 = inflater9.getAdler();
        java.util.zip.Inflater inflater17 = new java.util.zip.Inflater(true);
        int int18 = inflater17.getRemaining();
        long long19 = inflater17.getBytesRead();
        java.util.zip.Inflater inflater20 = new java.util.zip.Inflater();
        byte[] byteArray22 = new byte[] { (byte) 1 };
        int int23 = inflater20.inflate(byteArray22);
        int int24 = inflater17.inflate(byteArray22);
        int int27 = inflater9.inflate(byteArray22, (int) (short) 1, (int) (short) 0);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int28 = inflater0.inflate(byteArray22);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        int int4 = inflater0.getAdler();
        int int5 = inflater0.getAdler();
        inflater0.end();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int8 = inflater0.getTotalIn();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        int int3 = inflater0.getTotalOut();
        inflater0.reset();
        boolean boolean5 = inflater0.needsInput();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        boolean boolean9 = inflater6.needsDictionary();
        long long10 = inflater6.getBytesRead();
        boolean boolean11 = inflater6.needsDictionary();
        java.util.zip.Inflater inflater12 = new java.util.zip.Inflater();
        byte[] byteArray14 = new byte[] { (byte) 1 };
        int int15 = inflater12.inflate(byteArray14);
        long long16 = inflater12.getBytesWritten();
        inflater12.reset();
        long long18 = inflater12.getBytesWritten();
        java.util.zip.Inflater inflater19 = new java.util.zip.Inflater();
        boolean boolean20 = inflater19.finished();
        int int21 = inflater19.getRemaining();
        boolean boolean22 = inflater19.needsDictionary();
        boolean boolean23 = inflater19.needsInput();
        int int24 = inflater19.getRemaining();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        boolean boolean26 = inflater25.finished();
        int int27 = inflater25.getRemaining();
        boolean boolean28 = inflater25.finished();
        byte[] byteArray35 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater25.setInput(byteArray35);
        int int37 = inflater19.inflate(byteArray35);
        inflater12.setInput(byteArray35);
        inflater6.setInput(byteArray35);
        int int40 = inflater0.inflate(byteArray35);
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int42 = inflater0.getAdler();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        boolean boolean4 = inflater0.finished();
        inflater0.end();
        boolean boolean6 = inflater0.finished();
        boolean boolean7 = inflater0.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int8 = inflater0.getTotalIn();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        int int3 = inflater0.getTotalOut();
        inflater0.reset();
        long long5 = inflater0.getBytesRead();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long7 = inflater0.getBytesWritten();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater0.setInput(byteArray10);
        boolean boolean12 = inflater0.needsDictionary();
        boolean boolean13 = inflater0.needsInput();
        inflater0.reset();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        int int2 = inflater0.getTotalOut();
        int int3 = inflater0.getTotalOut();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getTotalIn();
        int int6 = inflater0.getTotalIn();
        inflater0.end();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        boolean boolean9 = inflater8.finished();
        int int10 = inflater8.getRemaining();
        boolean boolean11 = inflater8.needsDictionary();
        boolean boolean12 = inflater8.needsInput();
        int int13 = inflater8.getRemaining();
        inflater8.reset();
        java.util.zip.Inflater inflater15 = new java.util.zip.Inflater();
        boolean boolean16 = inflater15.finished();
        int int17 = inflater15.getRemaining();
        boolean boolean18 = inflater15.finished();
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater15.setInput(byteArray25);
        inflater8.setInput(byteArray25);
        int int28 = inflater8.getTotalOut();
        boolean boolean29 = inflater8.finished();
        java.util.zip.Inflater inflater30 = new java.util.zip.Inflater();
        boolean boolean31 = inflater30.finished();
        int int32 = inflater30.getRemaining();
        boolean boolean33 = inflater30.finished();
        int int34 = inflater30.getAdler();
        int int35 = inflater30.getAdler();
        java.util.zip.Inflater inflater36 = new java.util.zip.Inflater();
        boolean boolean37 = inflater36.finished();
        int int38 = inflater36.getRemaining();
        boolean boolean39 = inflater36.finished();
        byte[] byteArray46 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater36.setInput(byteArray46);
        boolean boolean48 = inflater36.needsDictionary();
        int int49 = inflater36.getRemaining();
        long long50 = inflater36.getBytesWritten();
        java.util.zip.Inflater inflater51 = new java.util.zip.Inflater();
        boolean boolean52 = inflater51.finished();
        int int53 = inflater51.getRemaining();
        boolean boolean54 = inflater51.finished();
        java.util.zip.Inflater inflater55 = new java.util.zip.Inflater();
        boolean boolean56 = inflater55.finished();
        int int57 = inflater55.getRemaining();
        boolean boolean58 = inflater55.finished();
        byte[] byteArray65 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater55.setInput(byteArray65);
        inflater51.setInput(byteArray65);
        inflater36.setInput(byteArray65);
        inflater30.setInput(byteArray65);
        inflater8.setInput(byteArray65);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        inflater0.setDictionary(byteArray65);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getTotalIn();
        long long5 = inflater0.getBytesWritten();
        int int6 = inflater0.getAdler();
        inflater0.end();
        int int8 = inflater0.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(true);
        inflater1.end();
        boolean boolean3 = inflater1.finished();
        java.util.zip.Inflater inflater4 = new java.util.zip.Inflater();
        boolean boolean5 = inflater4.finished();
        int int6 = inflater4.getRemaining();
        boolean boolean7 = inflater4.needsDictionary();
        boolean boolean8 = inflater4.needsInput();
        boolean boolean9 = inflater4.needsDictionary();
        boolean boolean10 = inflater4.finished();
        int int11 = inflater4.getTotalIn();
        int int12 = inflater4.getRemaining();
        long long13 = inflater4.getBytesWritten();
        int int14 = inflater4.getTotalOut();
        java.util.zip.Inflater inflater15 = new java.util.zip.Inflater();
        boolean boolean16 = inflater15.finished();
        int int17 = inflater15.getRemaining();
        inflater15.end();
        java.util.zip.Inflater inflater19 = new java.util.zip.Inflater();
        boolean boolean20 = inflater19.finished();
        int int21 = inflater19.getRemaining();
        boolean boolean22 = inflater19.finished();
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater19.setInput(byteArray29);
        inflater15.setInput(byteArray29);
        int int32 = inflater4.inflate(byteArray29);
        inflater1.setInput(byteArray29);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long34 = inflater1.getBytesRead();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        boolean boolean21 = inflater0.finished();
        int int22 = inflater0.getRemaining();
        inflater0.end();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        boolean boolean4 = inflater0.finished();
        inflater0.reset();
        boolean boolean6 = inflater0.needsDictionary();
        boolean boolean7 = inflater0.needsDictionary();
        inflater0.end();
        java.util.zip.Inflater inflater9 = new java.util.zip.Inflater();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        int int12 = inflater9.inflate(byteArray11);
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int18 = inflater9.inflate(byteArray17);
        boolean boolean19 = inflater9.needsInput();
        boolean boolean20 = inflater9.needsDictionary();
        java.util.zip.Inflater inflater21 = new java.util.zip.Inflater();
        boolean boolean22 = inflater21.finished();
        int int23 = inflater21.getRemaining();
        boolean boolean24 = inflater21.needsDictionary();
        long long25 = inflater21.getBytesRead();
        boolean boolean26 = inflater21.needsInput();
        java.util.zip.Inflater inflater27 = new java.util.zip.Inflater();
        byte[] byteArray29 = new byte[] { (byte) 1 };
        int int30 = inflater27.inflate(byteArray29);
        long long31 = inflater27.getBytesWritten();
        inflater27.reset();
        long long33 = inflater27.getBytesWritten();
        java.util.zip.Inflater inflater34 = new java.util.zip.Inflater();
        boolean boolean35 = inflater34.finished();
        int int36 = inflater34.getRemaining();
        boolean boolean37 = inflater34.needsDictionary();
        boolean boolean38 = inflater34.needsInput();
        int int39 = inflater34.getRemaining();
        java.util.zip.Inflater inflater40 = new java.util.zip.Inflater();
        boolean boolean41 = inflater40.finished();
        int int42 = inflater40.getRemaining();
        boolean boolean43 = inflater40.finished();
        byte[] byteArray50 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater40.setInput(byteArray50);
        int int52 = inflater34.inflate(byteArray50);
        inflater27.setInput(byteArray50);
        int int54 = inflater21.inflate(byteArray50);
        inflater9.setInput(byteArray50, 0, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int58 = inflater0.inflate(byteArray50);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getTotalIn();
        long long5 = inflater0.getBytesWritten();
        long long6 = inflater0.getBytesRead();
        long long7 = inflater0.getBytesRead();
        int int8 = inflater0.getTotalOut();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int10 = inflater0.getAdler();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        int int4 = inflater0.getAdler();
        int int5 = inflater0.getAdler();
        long long6 = inflater0.getBytesWritten();
        long long7 = inflater0.getBytesRead();
        inflater0.end();
        boolean boolean9 = inflater0.needsDictionary();
        java.util.zip.Inflater inflater10 = new java.util.zip.Inflater();
        byte[] byteArray12 = new byte[] { (byte) 1 };
        int int13 = inflater10.inflate(byteArray12);
        inflater10.reset();
        java.util.zip.Inflater inflater15 = new java.util.zip.Inflater();
        byte[] byteArray17 = new byte[] { (byte) 1 };
        int int18 = inflater15.inflate(byteArray17);
        long long19 = inflater15.getBytesWritten();
        inflater15.reset();
        long long21 = inflater15.getBytesWritten();
        java.util.zip.Inflater inflater22 = new java.util.zip.Inflater();
        boolean boolean23 = inflater22.finished();
        int int24 = inflater22.getRemaining();
        boolean boolean25 = inflater22.needsDictionary();
        boolean boolean26 = inflater22.needsInput();
        int int27 = inflater22.getRemaining();
        java.util.zip.Inflater inflater28 = new java.util.zip.Inflater();
        boolean boolean29 = inflater28.finished();
        int int30 = inflater28.getRemaining();
        boolean boolean31 = inflater28.finished();
        byte[] byteArray38 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater28.setInput(byteArray38);
        int int40 = inflater22.inflate(byteArray38);
        inflater15.setInput(byteArray38);
        inflater10.setInput(byteArray38);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int43 = inflater0.inflate(byteArray38);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        boolean boolean9 = inflater6.finished();
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater6.setInput(byteArray16);
        int int18 = inflater0.inflate(byteArray16);
        java.util.zip.Inflater inflater19 = new java.util.zip.Inflater();
        boolean boolean20 = inflater19.finished();
        int int21 = inflater19.getRemaining();
        boolean boolean22 = inflater19.finished();
        java.util.zip.Inflater inflater23 = new java.util.zip.Inflater();
        boolean boolean24 = inflater23.finished();
        int int25 = inflater23.getRemaining();
        boolean boolean26 = inflater23.finished();
        byte[] byteArray33 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater23.setInput(byteArray33);
        inflater19.setInput(byteArray33);
        inflater0.setInput(byteArray33);
        long long37 = inflater0.getBytesRead();
        inflater0.end();
        boolean boolean39 = inflater0.needsInput();
        inflater0.end();
        int int41 = inflater0.getRemaining();
        boolean boolean42 = inflater0.finished();
        java.util.zip.Inflater inflater43 = new java.util.zip.Inflater();
        byte[] byteArray45 = new byte[] { (byte) 1 };
        int int46 = inflater43.inflate(byteArray45);
        long long47 = inflater43.getBytesWritten();
        boolean boolean48 = inflater43.needsInput();
        boolean boolean49 = inflater43.finished();
        java.util.zip.Inflater inflater50 = new java.util.zip.Inflater();
        boolean boolean51 = inflater50.finished();
        int int52 = inflater50.getRemaining();
        boolean boolean53 = inflater50.finished();
        byte[] byteArray60 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater50.setInput(byteArray60);
        inflater43.setInput(byteArray60);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.setDictionary(byteArray60);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(true);
        inflater1.end();
        boolean boolean3 = inflater1.finished();
        java.util.zip.Inflater inflater4 = new java.util.zip.Inflater();
        boolean boolean5 = inflater4.finished();
        int int6 = inflater4.getRemaining();
        boolean boolean7 = inflater4.needsDictionary();
        boolean boolean8 = inflater4.needsInput();
        boolean boolean9 = inflater4.needsDictionary();
        boolean boolean10 = inflater4.finished();
        int int11 = inflater4.getTotalIn();
        int int12 = inflater4.getRemaining();
        long long13 = inflater4.getBytesWritten();
        int int14 = inflater4.getTotalOut();
        java.util.zip.Inflater inflater15 = new java.util.zip.Inflater();
        boolean boolean16 = inflater15.finished();
        int int17 = inflater15.getRemaining();
        inflater15.end();
        java.util.zip.Inflater inflater19 = new java.util.zip.Inflater();
        boolean boolean20 = inflater19.finished();
        int int21 = inflater19.getRemaining();
        boolean boolean22 = inflater19.finished();
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater19.setInput(byteArray29);
        inflater15.setInput(byteArray29);
        int int32 = inflater4.inflate(byteArray29);
        inflater1.setInput(byteArray29);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater1.reset();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(true);
        inflater1.end();
        boolean boolean3 = inflater1.finished();
        java.util.zip.Inflater inflater4 = new java.util.zip.Inflater();
        boolean boolean5 = inflater4.finished();
        int int6 = inflater4.getRemaining();
        boolean boolean7 = inflater4.needsDictionary();
        boolean boolean8 = inflater4.needsInput();
        boolean boolean9 = inflater4.needsDictionary();
        boolean boolean10 = inflater4.finished();
        int int11 = inflater4.getTotalIn();
        int int12 = inflater4.getRemaining();
        long long13 = inflater4.getBytesWritten();
        int int14 = inflater4.getTotalOut();
        java.util.zip.Inflater inflater15 = new java.util.zip.Inflater();
        boolean boolean16 = inflater15.finished();
        int int17 = inflater15.getRemaining();
        inflater15.end();
        java.util.zip.Inflater inflater19 = new java.util.zip.Inflater();
        boolean boolean20 = inflater19.finished();
        int int21 = inflater19.getRemaining();
        boolean boolean22 = inflater19.finished();
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater19.setInput(byteArray29);
        inflater15.setInput(byteArray29);
        int int32 = inflater4.inflate(byteArray29);
        inflater1.setInput(byteArray29);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int34 = inflater1.getTotalOut();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.end();
        boolean boolean6 = inflater0.needsDictionary();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long7 = inflater0.getBytesWritten();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsDictionary();
        inflater0.end();
        boolean boolean7 = inflater0.needsInput();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        inflater8.reset();
        boolean boolean10 = inflater8.needsInput();
        boolean boolean11 = inflater8.needsDictionary();
        inflater8.end();
        inflater8.end();
        java.util.zip.Inflater inflater14 = new java.util.zip.Inflater();
        byte[] byteArray16 = new byte[] { (byte) 1 };
        int int17 = inflater14.inflate(byteArray16);
        int int18 = inflater14.getAdler();
        boolean boolean19 = inflater14.finished();
        java.util.zip.Inflater inflater20 = new java.util.zip.Inflater();
        byte[] byteArray22 = new byte[] { (byte) 1 };
        int int23 = inflater20.inflate(byteArray22);
        inflater20.reset();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        byte[] byteArray27 = new byte[] { (byte) 1 };
        int int28 = inflater25.inflate(byteArray27);
        long long29 = inflater25.getBytesWritten();
        inflater25.reset();
        long long31 = inflater25.getBytesWritten();
        java.util.zip.Inflater inflater32 = new java.util.zip.Inflater();
        boolean boolean33 = inflater32.finished();
        int int34 = inflater32.getRemaining();
        boolean boolean35 = inflater32.needsDictionary();
        boolean boolean36 = inflater32.needsInput();
        int int37 = inflater32.getRemaining();
        java.util.zip.Inflater inflater38 = new java.util.zip.Inflater();
        boolean boolean39 = inflater38.finished();
        int int40 = inflater38.getRemaining();
        boolean boolean41 = inflater38.finished();
        byte[] byteArray48 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater38.setInput(byteArray48);
        int int50 = inflater32.inflate(byteArray48);
        inflater25.setInput(byteArray48);
        inflater20.setInput(byteArray48);
        inflater14.setInput(byteArray48, (int) (byte) 0, 1);
        inflater8.setInput(byteArray48, 4, (int) (short) 0);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int59 = inflater0.inflate(byteArray48);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsDictionary();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long7 = inflater0.getBytesRead();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.reset();
        long long6 = inflater0.getBytesWritten();
        int int7 = inflater0.getTotalIn();
        boolean boolean8 = inflater0.needsInput();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long10 = inflater0.getBytesRead();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        boolean boolean4 = inflater0.finished();
        inflater0.end();
        inflater0.end();
        boolean boolean7 = inflater0.needsInput();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        boolean boolean9 = inflater8.finished();
        int int10 = inflater8.getRemaining();
        boolean boolean11 = inflater8.needsDictionary();
        boolean boolean12 = inflater8.needsInput();
        int int13 = inflater8.getRemaining();
        java.util.zip.Inflater inflater14 = new java.util.zip.Inflater();
        boolean boolean15 = inflater14.finished();
        int int16 = inflater14.getRemaining();
        boolean boolean17 = inflater14.finished();
        byte[] byteArray24 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater14.setInput(byteArray24);
        int int26 = inflater8.inflate(byteArray24);
        boolean boolean27 = inflater8.finished();
        int int28 = inflater8.getAdler();
        boolean boolean29 = inflater8.finished();
        int int30 = inflater8.getAdler();
        boolean boolean31 = inflater8.needsInput();
        java.util.zip.Inflater inflater32 = new java.util.zip.Inflater();
        byte[] byteArray34 = new byte[] { (byte) 1 };
        int int35 = inflater32.inflate(byteArray34);
        int int36 = inflater32.getTotalIn();
        java.util.zip.Inflater inflater37 = new java.util.zip.Inflater();
        byte[] byteArray39 = new byte[] { (byte) 1 };
        int int40 = inflater37.inflate(byteArray39);
        byte[] byteArray45 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int46 = inflater37.inflate(byteArray45);
        int int47 = inflater32.inflate(byteArray45);
        int int48 = inflater8.inflate(byteArray45);
        inflater0.setInput(byteArray45, (int) (byte) 0, (int) (short) 1);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int52 = inflater0.getAdler();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        int int4 = inflater0.getAdler();
        int int5 = inflater0.getAdler();
        boolean boolean6 = inflater0.finished();
        int int7 = inflater0.getTotalIn();
        int int8 = inflater0.getTotalOut();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long10 = inflater0.getBytesRead();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        int int4 = inflater0.getAdler();
        boolean boolean5 = inflater0.finished();
        long long6 = inflater0.getBytesWritten();
        long long7 = inflater0.getBytesRead();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int9 = inflater0.getAdler();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        boolean boolean21 = inflater0.finished();
        int int22 = inflater0.getRemaining();
        inflater0.end();
        java.util.zip.Inflater inflater24 = new java.util.zip.Inflater();
        boolean boolean25 = inflater24.needsDictionary();
        int int26 = inflater24.getTotalOut();
        long long27 = inflater24.getBytesWritten();
        boolean boolean28 = inflater24.needsInput();
        java.util.zip.Inflater inflater29 = new java.util.zip.Inflater();
        boolean boolean30 = inflater29.finished();
        int int31 = inflater29.getRemaining();
        boolean boolean32 = inflater29.needsDictionary();
        boolean boolean33 = inflater29.needsInput();
        long long34 = inflater29.getBytesWritten();
        java.util.zip.Inflater inflater36 = new java.util.zip.Inflater(true);
        int int37 = inflater36.getRemaining();
        long long38 = inflater36.getBytesRead();
        java.util.zip.Inflater inflater39 = new java.util.zip.Inflater();
        boolean boolean40 = inflater39.finished();
        int int41 = inflater39.getRemaining();
        inflater39.end();
        java.util.zip.Inflater inflater43 = new java.util.zip.Inflater();
        boolean boolean44 = inflater43.finished();
        int int45 = inflater43.getRemaining();
        boolean boolean46 = inflater43.finished();
        byte[] byteArray53 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater43.setInput(byteArray53);
        inflater39.setInput(byteArray53);
        inflater36.setInput(byteArray53, (int) (byte) 1, (int) (short) 1);
        int int59 = inflater29.inflate(byteArray53);
        int int60 = inflater24.inflate(byteArray53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int61 = inflater0.inflate(byteArray53);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        boolean boolean21 = inflater0.needsDictionary();
        long long22 = inflater0.getBytesWritten();
        int int23 = inflater0.getRemaining();
        int int24 = inflater0.getRemaining();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        byte[] byteArray27 = new byte[] { (byte) 1 };
        int int28 = inflater25.inflate(byteArray27);
        boolean boolean29 = inflater25.finished();
        inflater25.end();
        inflater25.end();
        boolean boolean32 = inflater25.needsDictionary();
        java.util.zip.Inflater inflater33 = new java.util.zip.Inflater();
        boolean boolean34 = inflater33.finished();
        int int35 = inflater33.getRemaining();
        boolean boolean36 = inflater33.needsInput();
        java.util.zip.Inflater inflater37 = new java.util.zip.Inflater();
        boolean boolean38 = inflater37.finished();
        int int39 = inflater37.getRemaining();
        boolean boolean40 = inflater37.finished();
        byte[] byteArray47 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater37.setInput(byteArray47);
        inflater33.setInput(byteArray47);
        inflater25.setInput(byteArray47);
        inflater0.setInput(byteArray47);
        int int52 = inflater0.getRemaining();
        boolean boolean53 = inflater0.needsInput();
        long long54 = inflater0.getBytesRead();
        boolean boolean55 = inflater0.needsDictionary();
        inflater0.reset();
        inflater0.end();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long59 = inflater0.getBytesRead();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        int int2 = inflater0.getTotalOut();
        int int3 = inflater0.getTotalOut();
        int int4 = inflater0.getAdler();
        boolean boolean5 = inflater0.needsDictionary();
        int int6 = inflater0.getTotalOut();
        int int7 = inflater0.getTotalIn();
        long long8 = inflater0.getBytesRead();
        boolean boolean9 = inflater0.finished();
        inflater0.end();
        int int11 = inflater0.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long12 = inflater0.getBytesWritten();
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.end();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        inflater6.end();
        java.util.zip.Inflater inflater10 = new java.util.zip.Inflater();
        boolean boolean11 = inflater10.finished();
        int int12 = inflater10.getRemaining();
        boolean boolean13 = inflater10.finished();
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater10.setInput(byteArray20);
        inflater6.setInput(byteArray20);
        inflater0.setInput(byteArray20);
        boolean boolean24 = inflater0.needsDictionary();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        byte[] byteArray27 = new byte[] { (byte) 1 };
        int int28 = inflater25.inflate(byteArray27);
        int int29 = inflater25.getTotalIn();
        long long30 = inflater25.getBytesWritten();
        int int31 = inflater25.getTotalIn();
        boolean boolean32 = inflater25.needsDictionary();
        int int33 = inflater25.getAdler();
        inflater25.end();
        java.util.zip.Inflater inflater36 = new java.util.zip.Inflater(true);
        int int37 = inflater36.getRemaining();
        long long38 = inflater36.getBytesRead();
        int int39 = inflater36.getTotalIn();
        long long40 = inflater36.getBytesWritten();
        int int41 = inflater36.getTotalIn();
        java.util.zip.Inflater inflater42 = new java.util.zip.Inflater();
        byte[] byteArray44 = new byte[] { (byte) 1 };
        int int45 = inflater42.inflate(byteArray44);
        inflater42.reset();
        java.util.zip.Inflater inflater47 = new java.util.zip.Inflater();
        byte[] byteArray49 = new byte[] { (byte) 1 };
        int int50 = inflater47.inflate(byteArray49);
        int int51 = inflater47.getTotalIn();
        java.util.zip.Inflater inflater52 = new java.util.zip.Inflater();
        byte[] byteArray54 = new byte[] { (byte) 1 };
        int int55 = inflater52.inflate(byteArray54);
        byte[] byteArray60 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int61 = inflater52.inflate(byteArray60);
        int int62 = inflater47.inflate(byteArray60);
        inflater42.setInput(byteArray60);
        int int64 = inflater36.inflate(byteArray60);
        inflater25.setInput(byteArray60);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int66 = inflater0.inflate(byteArray60);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int22 = inflater0.getAdler();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.end();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        inflater6.end();
        java.util.zip.Inflater inflater10 = new java.util.zip.Inflater();
        boolean boolean11 = inflater10.finished();
        int int12 = inflater10.getRemaining();
        boolean boolean13 = inflater10.finished();
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater10.setInput(byteArray20);
        inflater6.setInput(byteArray20);
        inflater0.setInput(byteArray20);
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int25 = inflater0.getTotalOut();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        inflater0.reset();
        inflater0.end();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int5 = inflater0.getAdler();
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        boolean boolean9 = inflater6.finished();
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater6.setInput(byteArray16);
        int int18 = inflater0.inflate(byteArray16);
        java.util.zip.Inflater inflater19 = new java.util.zip.Inflater();
        boolean boolean20 = inflater19.finished();
        int int21 = inflater19.getRemaining();
        boolean boolean22 = inflater19.finished();
        java.util.zip.Inflater inflater23 = new java.util.zip.Inflater();
        boolean boolean24 = inflater23.finished();
        int int25 = inflater23.getRemaining();
        boolean boolean26 = inflater23.finished();
        byte[] byteArray33 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater23.setInput(byteArray33);
        inflater19.setInput(byteArray33);
        inflater0.setInput(byteArray33);
        long long37 = inflater0.getBytesRead();
        inflater0.end();
        boolean boolean39 = inflater0.needsInput();
        inflater0.end();
        int int41 = inflater0.getRemaining();
        boolean boolean42 = inflater0.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        int int3 = inflater0.getTotalOut();
        inflater0.reset();
        boolean boolean5 = inflater0.needsInput();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        int int8 = inflater5.inflate(byteArray7);
        inflater0.setInput(byteArray7);
        int int10 = inflater0.getRemaining();
        int int11 = inflater0.getRemaining();
        boolean boolean12 = inflater0.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int13 = inflater0.getTotalIn();
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getAdler();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        boolean boolean6 = inflater5.finished();
        int int7 = inflater5.getRemaining();
        boolean boolean8 = inflater5.needsInput();
        java.util.zip.Inflater inflater9 = new java.util.zip.Inflater();
        boolean boolean10 = inflater9.finished();
        int int11 = inflater9.getRemaining();
        boolean boolean12 = inflater9.finished();
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater9.setInput(byteArray19);
        inflater5.setInput(byteArray19);
        inflater0.setInput(byteArray19);
        boolean boolean23 = inflater0.needsInput();
        int int24 = inflater0.getAdler();
        int int25 = inflater0.getTotalIn();
        int int26 = inflater0.getAdler();
        inflater0.end();
        java.util.zip.Inflater inflater28 = new java.util.zip.Inflater();
        boolean boolean29 = inflater28.needsDictionary();
        inflater28.reset();
        java.util.zip.Inflater inflater31 = new java.util.zip.Inflater();
        boolean boolean32 = inflater31.finished();
        int int33 = inflater31.getRemaining();
        boolean boolean34 = inflater31.finished();
        long long35 = inflater31.getBytesRead();
        int int36 = inflater31.getTotalOut();
        int int37 = inflater31.getAdler();
        java.util.zip.Inflater inflater39 = new java.util.zip.Inflater(true);
        int int40 = inflater39.getRemaining();
        long long41 = inflater39.getBytesRead();
        java.util.zip.Inflater inflater42 = new java.util.zip.Inflater();
        byte[] byteArray44 = new byte[] { (byte) 1 };
        int int45 = inflater42.inflate(byteArray44);
        int int46 = inflater39.inflate(byteArray44);
        int int49 = inflater31.inflate(byteArray44, (int) (short) 1, (int) (short) 0);
        inflater28.setInput(byteArray44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int51 = inflater0.inflate(byteArray44);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getTotalIn();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        int int8 = inflater5.inflate(byteArray7);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int14 = inflater5.inflate(byteArray13);
        int int15 = inflater0.inflate(byteArray13);
        boolean boolean16 = inflater0.finished();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(true);
        int int2 = inflater1.getRemaining();
        long long3 = inflater1.getBytesRead();
        java.util.zip.Inflater inflater4 = new java.util.zip.Inflater();
        boolean boolean5 = inflater4.finished();
        int int6 = inflater4.getRemaining();
        inflater4.end();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        boolean boolean9 = inflater8.finished();
        int int10 = inflater8.getRemaining();
        boolean boolean11 = inflater8.finished();
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater8.setInput(byteArray18);
        inflater4.setInput(byteArray18);
        inflater1.setInput(byteArray18, (int) (byte) 1, (int) (short) 1);
        int int24 = inflater1.getTotalIn();
        int int25 = inflater1.getRemaining();
        int int26 = inflater1.getAdler();
        inflater1.end();
        inflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int29 = inflater1.getTotalOut();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        int int4 = inflater0.getAdler();
        inflater0.reset();
        long long6 = inflater0.getBytesWritten();
        inflater0.end();
        boolean boolean8 = inflater0.needsInput();
        java.util.zip.Inflater inflater9 = new java.util.zip.Inflater();
        boolean boolean10 = inflater9.needsDictionary();
        int int11 = inflater9.getTotalOut();
        int int12 = inflater9.getTotalOut();
        long long13 = inflater9.getBytesWritten();
        java.util.zip.Inflater inflater14 = new java.util.zip.Inflater();
        boolean boolean15 = inflater14.finished();
        int int16 = inflater14.getRemaining();
        boolean boolean17 = inflater14.needsDictionary();
        boolean boolean18 = inflater14.needsInput();
        int int19 = inflater14.getRemaining();
        java.util.zip.Inflater inflater20 = new java.util.zip.Inflater();
        boolean boolean21 = inflater20.finished();
        int int22 = inflater20.getRemaining();
        boolean boolean23 = inflater20.finished();
        byte[] byteArray30 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater20.setInput(byteArray30);
        int int32 = inflater14.inflate(byteArray30);
        java.util.zip.Inflater inflater33 = new java.util.zip.Inflater();
        boolean boolean34 = inflater33.finished();
        int int35 = inflater33.getRemaining();
        boolean boolean36 = inflater33.finished();
        java.util.zip.Inflater inflater37 = new java.util.zip.Inflater();
        boolean boolean38 = inflater37.finished();
        int int39 = inflater37.getRemaining();
        boolean boolean40 = inflater37.finished();
        byte[] byteArray47 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater37.setInput(byteArray47);
        inflater33.setInput(byteArray47);
        inflater14.setInput(byteArray47);
        int int51 = inflater9.inflate(byteArray47);
        inflater0.setInput(byteArray47, (int) (byte) 0, (int) (byte) 0);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long55 = inflater0.getBytesRead();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int9 = inflater0.inflate(byteArray8);
        boolean boolean10 = inflater0.needsInput();
        boolean boolean11 = inflater0.needsDictionary();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long13 = inflater0.getBytesRead();
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        boolean boolean4 = inflater0.finished();
        int int5 = inflater0.getRemaining();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        byte[] byteArray8 = new byte[] { (byte) 1 };
        int int9 = inflater6.inflate(byteArray8);
        int int10 = inflater6.getAdler();
        boolean boolean11 = inflater6.finished();
        long long12 = inflater6.getBytesWritten();
        java.util.zip.Inflater inflater13 = new java.util.zip.Inflater();
        boolean boolean14 = inflater13.finished();
        boolean boolean15 = inflater13.needsInput();
        boolean boolean16 = inflater13.needsInput();
        java.util.zip.Inflater inflater17 = new java.util.zip.Inflater();
        boolean boolean18 = inflater17.finished();
        int int19 = inflater17.getRemaining();
        boolean boolean20 = inflater17.needsDictionary();
        long long21 = inflater17.getBytesRead();
        boolean boolean22 = inflater17.needsDictionary();
        java.util.zip.Inflater inflater23 = new java.util.zip.Inflater();
        byte[] byteArray25 = new byte[] { (byte) 1 };
        int int26 = inflater23.inflate(byteArray25);
        long long27 = inflater23.getBytesWritten();
        inflater23.reset();
        long long29 = inflater23.getBytesWritten();
        java.util.zip.Inflater inflater30 = new java.util.zip.Inflater();
        boolean boolean31 = inflater30.finished();
        int int32 = inflater30.getRemaining();
        boolean boolean33 = inflater30.needsDictionary();
        boolean boolean34 = inflater30.needsInput();
        int int35 = inflater30.getRemaining();
        java.util.zip.Inflater inflater36 = new java.util.zip.Inflater();
        boolean boolean37 = inflater36.finished();
        int int38 = inflater36.getRemaining();
        boolean boolean39 = inflater36.finished();
        byte[] byteArray46 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater36.setInput(byteArray46);
        int int48 = inflater30.inflate(byteArray46);
        inflater23.setInput(byteArray46);
        inflater17.setInput(byteArray46);
        int int51 = inflater13.inflate(byteArray46);
        int int52 = inflater6.inflate(byteArray46);
        inflater0.setInput(byteArray46);
        inflater0.end();
        java.util.zip.Inflater inflater55 = new java.util.zip.Inflater();
        boolean boolean56 = inflater55.finished();
        int int57 = inflater55.getRemaining();
        boolean boolean58 = inflater55.needsDictionary();
        boolean boolean59 = inflater55.needsInput();
        int int60 = inflater55.getRemaining();
        inflater55.reset();
        boolean boolean62 = inflater55.needsInput();
        int int63 = inflater55.getRemaining();
        java.util.zip.Inflater inflater64 = new java.util.zip.Inflater();
        boolean boolean65 = inflater64.finished();
        int int66 = inflater64.getRemaining();
        boolean boolean67 = inflater64.needsInput();
        java.util.zip.Inflater inflater68 = new java.util.zip.Inflater();
        boolean boolean69 = inflater68.finished();
        int int70 = inflater68.getRemaining();
        boolean boolean71 = inflater68.finished();
        byte[] byteArray78 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater68.setInput(byteArray78);
        inflater64.setInput(byteArray78);
        inflater55.setInput(byteArray78);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int82 = inflater0.inflate(byteArray78);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(false);
        int int2 = inflater1.getTotalIn();
        boolean boolean3 = inflater1.finished();
        int int4 = inflater1.getAdler();
        inflater1.end();
        boolean boolean6 = inflater1.needsDictionary();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int7 = inflater1.getTotalOut();
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        int int4 = inflater0.getAdler();
        boolean boolean5 = inflater0.finished();
        long long6 = inflater0.getBytesWritten();
        long long7 = inflater0.getBytesRead();
        boolean boolean8 = inflater0.needsInput();
        java.util.zip.Inflater inflater9 = new java.util.zip.Inflater();
        boolean boolean10 = inflater9.finished();
        int int11 = inflater9.getRemaining();
        boolean boolean12 = inflater9.needsDictionary();
        boolean boolean13 = inflater9.needsInput();
        int int14 = inflater9.getRemaining();
        inflater9.reset();
        java.util.zip.Inflater inflater16 = new java.util.zip.Inflater();
        boolean boolean17 = inflater16.finished();
        int int18 = inflater16.getRemaining();
        boolean boolean19 = inflater16.finished();
        byte[] byteArray26 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater16.setInput(byteArray26);
        inflater9.setInput(byteArray26);
        int int29 = inflater9.getRemaining();
        boolean boolean30 = inflater9.finished();
        inflater9.reset();
        int int32 = inflater9.getAdler();
        java.util.zip.Inflater inflater33 = new java.util.zip.Inflater();
        byte[] byteArray35 = new byte[] { (byte) 1 };
        int int36 = inflater33.inflate(byteArray35);
        int int37 = inflater33.getTotalIn();
        java.util.zip.Inflater inflater38 = new java.util.zip.Inflater();
        byte[] byteArray40 = new byte[] { (byte) 1 };
        int int41 = inflater38.inflate(byteArray40);
        byte[] byteArray46 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int47 = inflater38.inflate(byteArray46);
        int int48 = inflater33.inflate(byteArray46);
        int int49 = inflater33.getTotalOut();
        int int50 = inflater33.getTotalOut();
        long long51 = inflater33.getBytesRead();
        java.util.zip.Inflater inflater52 = new java.util.zip.Inflater();
        boolean boolean53 = inflater52.finished();
        int int54 = inflater52.getRemaining();
        boolean boolean55 = inflater52.finished();
        long long56 = inflater52.getBytesRead();
        boolean boolean57 = inflater52.finished();
        long long58 = inflater52.getBytesRead();
        boolean boolean59 = inflater52.needsDictionary();
        boolean boolean60 = inflater52.needsDictionary();
        java.util.zip.Inflater inflater61 = new java.util.zip.Inflater();
        boolean boolean62 = inflater61.needsDictionary();
        int int63 = inflater61.getTotalOut();
        int int64 = inflater61.getTotalOut();
        boolean boolean65 = inflater61.needsInput();
        java.util.zip.Inflater inflater66 = new java.util.zip.Inflater();
        byte[] byteArray68 = new byte[] { (byte) 1 };
        int int69 = inflater66.inflate(byteArray68);
        inflater66.reset();
        java.util.zip.Inflater inflater71 = new java.util.zip.Inflater();
        byte[] byteArray73 = new byte[] { (byte) 1 };
        int int74 = inflater71.inflate(byteArray73);
        int int75 = inflater71.getTotalIn();
        java.util.zip.Inflater inflater76 = new java.util.zip.Inflater();
        byte[] byteArray78 = new byte[] { (byte) 1 };
        int int79 = inflater76.inflate(byteArray78);
        byte[] byteArray84 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int85 = inflater76.inflate(byteArray84);
        int int86 = inflater71.inflate(byteArray84);
        inflater66.setInput(byteArray84);
        inflater61.setInput(byteArray84);
        int int89 = inflater52.inflate(byteArray84);
        inflater33.setInput(byteArray84);
        int int91 = inflater9.inflate(byteArray84);
        int int92 = inflater0.inflate(byteArray84);
        int int93 = inflater0.getAdler();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int95 = inflater0.getAdler();
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getTotalIn();
        int int5 = inflater0.getTotalIn();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        boolean boolean9 = inflater6.finished();
        long long10 = inflater6.getBytesRead();
        boolean boolean11 = inflater6.finished();
        long long12 = inflater6.getBytesRead();
        boolean boolean13 = inflater6.needsDictionary();
        boolean boolean14 = inflater6.needsDictionary();
        java.util.zip.Inflater inflater15 = new java.util.zip.Inflater();
        boolean boolean16 = inflater15.needsDictionary();
        int int17 = inflater15.getTotalOut();
        int int18 = inflater15.getTotalOut();
        boolean boolean19 = inflater15.needsInput();
        java.util.zip.Inflater inflater20 = new java.util.zip.Inflater();
        byte[] byteArray22 = new byte[] { (byte) 1 };
        int int23 = inflater20.inflate(byteArray22);
        inflater20.reset();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        byte[] byteArray27 = new byte[] { (byte) 1 };
        int int28 = inflater25.inflate(byteArray27);
        int int29 = inflater25.getTotalIn();
        java.util.zip.Inflater inflater30 = new java.util.zip.Inflater();
        byte[] byteArray32 = new byte[] { (byte) 1 };
        int int33 = inflater30.inflate(byteArray32);
        byte[] byteArray38 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int39 = inflater30.inflate(byteArray38);
        int int40 = inflater25.inflate(byteArray38);
        inflater20.setInput(byteArray38);
        inflater15.setInput(byteArray38);
        int int43 = inflater6.inflate(byteArray38);
        inflater0.setInput(byteArray38);
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int46 = inflater0.getAdler();
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsInput();
        boolean boolean6 = inflater0.finished();
        boolean boolean7 = inflater0.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int8 = inflater0.getAdler();
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getTotalIn();
        int int6 = inflater0.getTotalIn();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int8 = inflater0.getTotalOut();
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        long long4 = inflater0.getBytesRead();
        boolean boolean5 = inflater0.finished();
        long long6 = inflater0.getBytesRead();
        boolean boolean7 = inflater0.needsDictionary();
        int int8 = inflater0.getRemaining();
        inflater0.end();
        int int10 = inflater0.getRemaining();
        boolean boolean11 = inflater0.finished();
        boolean boolean12 = inflater0.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long13 = inflater0.getBytesRead();
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        long long4 = inflater0.getBytesRead();
        boolean boolean5 = inflater0.finished();
        long long6 = inflater0.getBytesRead();
        long long7 = inflater0.getBytesWritten();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(true);
        int int2 = inflater1.getRemaining();
        long long3 = inflater1.getBytesRead();
        int int4 = inflater1.getTotalIn();
        int int5 = inflater1.getRemaining();
        boolean boolean6 = inflater1.needsInput();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.needsDictionary();
        int int9 = inflater7.getTotalOut();
        int int10 = inflater7.getTotalOut();
        int int11 = inflater7.getAdler();
        boolean boolean12 = inflater7.needsDictionary();
        int int13 = inflater7.getTotalOut();
        java.util.zip.Inflater inflater14 = new java.util.zip.Inflater();
        byte[] byteArray16 = new byte[] { (byte) 1 };
        int int17 = inflater14.inflate(byteArray16);
        boolean boolean18 = inflater14.finished();
        inflater14.end();
        inflater14.end();
        boolean boolean21 = inflater14.needsInput();
        java.util.zip.Inflater inflater22 = new java.util.zip.Inflater();
        boolean boolean23 = inflater22.finished();
        int int24 = inflater22.getRemaining();
        boolean boolean25 = inflater22.needsDictionary();
        boolean boolean26 = inflater22.needsInput();
        int int27 = inflater22.getRemaining();
        inflater22.reset();
        boolean boolean29 = inflater22.needsDictionary();
        int int30 = inflater22.getTotalIn();
        java.util.zip.Inflater inflater31 = new java.util.zip.Inflater();
        boolean boolean32 = inflater31.finished();
        int int33 = inflater31.getRemaining();
        boolean boolean34 = inflater31.needsDictionary();
        boolean boolean35 = inflater31.needsInput();
        int int36 = inflater31.getRemaining();
        inflater31.reset();
        java.util.zip.Inflater inflater38 = new java.util.zip.Inflater();
        boolean boolean39 = inflater38.finished();
        int int40 = inflater38.getRemaining();
        boolean boolean41 = inflater38.needsDictionary();
        boolean boolean42 = inflater38.needsInput();
        int int43 = inflater38.getRemaining();
        inflater38.reset();
        java.util.zip.Inflater inflater45 = new java.util.zip.Inflater();
        boolean boolean46 = inflater45.finished();
        int int47 = inflater45.getRemaining();
        boolean boolean48 = inflater45.finished();
        byte[] byteArray55 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater45.setInput(byteArray55);
        inflater38.setInput(byteArray55);
        int int60 = inflater31.inflate(byteArray55, 0, (int) (byte) 0);
        int int61 = inflater22.inflate(byteArray55);
        inflater14.setInput(byteArray55);
        int int65 = inflater7.inflate(byteArray55, 0, (int) (byte) 0);
        inflater1.setDictionary(byteArray55);
        long long67 = inflater1.getBytesRead();
        inflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int69 = inflater1.getAdler();
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        int int4 = inflater0.getAdler();
        inflater0.reset();
        long long6 = inflater0.getBytesWritten();
        inflater0.end();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        boolean boolean9 = inflater8.finished();
        int int10 = inflater8.getRemaining();
        boolean boolean11 = inflater8.needsDictionary();
        boolean boolean12 = inflater8.needsInput();
        int int13 = inflater8.getRemaining();
        java.util.zip.Inflater inflater14 = new java.util.zip.Inflater();
        boolean boolean15 = inflater14.finished();
        int int16 = inflater14.getRemaining();
        boolean boolean17 = inflater14.finished();
        byte[] byteArray24 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater14.setInput(byteArray24);
        int int26 = inflater8.inflate(byteArray24);
        boolean boolean27 = inflater8.finished();
        int int28 = inflater8.getTotalOut();
        java.util.zip.Inflater inflater29 = new java.util.zip.Inflater();
        boolean boolean30 = inflater29.finished();
        int int31 = inflater29.getRemaining();
        boolean boolean32 = inflater29.needsDictionary();
        long long33 = inflater29.getBytesRead();
        boolean boolean34 = inflater29.needsDictionary();
        java.util.zip.Inflater inflater35 = new java.util.zip.Inflater();
        byte[] byteArray37 = new byte[] { (byte) 1 };
        int int38 = inflater35.inflate(byteArray37);
        long long39 = inflater35.getBytesWritten();
        inflater35.reset();
        long long41 = inflater35.getBytesWritten();
        java.util.zip.Inflater inflater42 = new java.util.zip.Inflater();
        boolean boolean43 = inflater42.finished();
        int int44 = inflater42.getRemaining();
        boolean boolean45 = inflater42.needsDictionary();
        boolean boolean46 = inflater42.needsInput();
        int int47 = inflater42.getRemaining();
        java.util.zip.Inflater inflater48 = new java.util.zip.Inflater();
        boolean boolean49 = inflater48.finished();
        int int50 = inflater48.getRemaining();
        boolean boolean51 = inflater48.finished();
        byte[] byteArray58 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater48.setInput(byteArray58);
        int int60 = inflater42.inflate(byteArray58);
        inflater35.setInput(byteArray58);
        inflater29.setInput(byteArray58);
        int int63 = inflater8.inflate(byteArray58);
        java.util.zip.Inflater inflater64 = new java.util.zip.Inflater();
        boolean boolean65 = inflater64.finished();
        int int66 = inflater64.getRemaining();
        boolean boolean67 = inflater64.needsInput();
        java.util.zip.Inflater inflater68 = new java.util.zip.Inflater();
        boolean boolean69 = inflater68.finished();
        int int70 = inflater68.getRemaining();
        boolean boolean71 = inflater68.finished();
        byte[] byteArray78 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater68.setInput(byteArray78);
        inflater64.setInput(byteArray78);
        int int81 = inflater8.inflate(byteArray78);
        inflater0.setInput(byteArray78);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int83 = inflater0.getTotalIn();
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        boolean boolean20 = inflater0.finished();
        inflater0.end();
        boolean boolean22 = inflater0.finished();
        java.util.zip.Inflater inflater23 = new java.util.zip.Inflater();
        byte[] byteArray25 = new byte[] { (byte) 1 };
        int int26 = inflater23.inflate(byteArray25);
        inflater23.reset();
        long long28 = inflater23.getBytesWritten();
        java.util.zip.Inflater inflater29 = new java.util.zip.Inflater();
        byte[] byteArray31 = new byte[] { (byte) 1 };
        int int32 = inflater29.inflate(byteArray31);
        long long33 = inflater29.getBytesWritten();
        boolean boolean34 = inflater29.needsInput();
        int int35 = inflater29.getRemaining();
        int int36 = inflater29.getRemaining();
        java.util.zip.Inflater inflater37 = new java.util.zip.Inflater();
        boolean boolean38 = inflater37.finished();
        int int39 = inflater37.getRemaining();
        boolean boolean40 = inflater37.finished();
        java.util.zip.Inflater inflater41 = new java.util.zip.Inflater();
        boolean boolean42 = inflater41.finished();
        int int43 = inflater41.getRemaining();
        boolean boolean44 = inflater41.finished();
        byte[] byteArray51 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater41.setInput(byteArray51);
        inflater37.setInput(byteArray51);
        inflater29.setInput(byteArray51, (int) (byte) 1, (int) (byte) 0);
        inflater23.setInput(byteArray51);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int58 = inflater0.inflate(byteArray51);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        boolean boolean4 = inflater0.finished();
        int int5 = inflater0.getRemaining();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        byte[] byteArray8 = new byte[] { (byte) 1 };
        int int9 = inflater6.inflate(byteArray8);
        inflater6.reset();
        java.util.zip.Inflater inflater11 = new java.util.zip.Inflater();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        int int14 = inflater11.inflate(byteArray13);
        int int15 = inflater11.getTotalIn();
        java.util.zip.Inflater inflater16 = new java.util.zip.Inflater();
        byte[] byteArray18 = new byte[] { (byte) 1 };
        int int19 = inflater16.inflate(byteArray18);
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int25 = inflater16.inflate(byteArray24);
        int int26 = inflater11.inflate(byteArray24);
        inflater6.setInput(byteArray24);
        inflater0.setInput(byteArray24);
        int int29 = inflater0.getTotalIn();
        long long30 = inflater0.getBytesWritten();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsDictionary();
        boolean boolean6 = inflater0.needsDictionary();
        boolean boolean7 = inflater0.needsDictionary();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        boolean boolean9 = inflater8.needsDictionary();
        int int10 = inflater8.getTotalOut();
        int int11 = inflater8.getTotalOut();
        boolean boolean12 = inflater8.needsInput();
        java.util.zip.Inflater inflater13 = new java.util.zip.Inflater();
        byte[] byteArray15 = new byte[] { (byte) 1 };
        int int16 = inflater13.inflate(byteArray15);
        inflater13.reset();
        java.util.zip.Inflater inflater18 = new java.util.zip.Inflater();
        byte[] byteArray20 = new byte[] { (byte) 1 };
        int int21 = inflater18.inflate(byteArray20);
        int int22 = inflater18.getTotalIn();
        java.util.zip.Inflater inflater23 = new java.util.zip.Inflater();
        byte[] byteArray25 = new byte[] { (byte) 1 };
        int int26 = inflater23.inflate(byteArray25);
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int32 = inflater23.inflate(byteArray31);
        int int33 = inflater18.inflate(byteArray31);
        inflater13.setInput(byteArray31);
        inflater8.setInput(byteArray31);
        inflater0.setInput(byteArray31);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int37 = inflater0.getAdler();
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        int int5 = inflater0.getRemaining();
        int int6 = inflater0.getTotalOut();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long8 = inflater0.getBytesWritten();
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        boolean boolean4 = inflater0.finished();
        inflater0.end();
        inflater0.end();
        boolean boolean7 = inflater0.needsInput();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        boolean boolean9 = inflater8.finished();
        int int10 = inflater8.getRemaining();
        boolean boolean11 = inflater8.needsDictionary();
        boolean boolean12 = inflater8.needsInput();
        int int13 = inflater8.getRemaining();
        java.util.zip.Inflater inflater14 = new java.util.zip.Inflater();
        boolean boolean15 = inflater14.finished();
        int int16 = inflater14.getRemaining();
        boolean boolean17 = inflater14.finished();
        byte[] byteArray24 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater14.setInput(byteArray24);
        int int26 = inflater8.inflate(byteArray24);
        boolean boolean27 = inflater8.finished();
        int int28 = inflater8.getAdler();
        boolean boolean29 = inflater8.finished();
        int int30 = inflater8.getAdler();
        boolean boolean31 = inflater8.needsInput();
        java.util.zip.Inflater inflater32 = new java.util.zip.Inflater();
        byte[] byteArray34 = new byte[] { (byte) 1 };
        int int35 = inflater32.inflate(byteArray34);
        int int36 = inflater32.getTotalIn();
        java.util.zip.Inflater inflater37 = new java.util.zip.Inflater();
        byte[] byteArray39 = new byte[] { (byte) 1 };
        int int40 = inflater37.inflate(byteArray39);
        byte[] byteArray45 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int46 = inflater37.inflate(byteArray45);
        int int47 = inflater32.inflate(byteArray45);
        int int48 = inflater8.inflate(byteArray45);
        inflater0.setInput(byteArray45, (int) (byte) 0, (int) (short) 1);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        boolean boolean21 = inflater0.needsDictionary();
        long long22 = inflater0.getBytesWritten();
        int int23 = inflater0.getRemaining();
        int int24 = inflater0.getRemaining();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        byte[] byteArray27 = new byte[] { (byte) 1 };
        int int28 = inflater25.inflate(byteArray27);
        boolean boolean29 = inflater25.finished();
        inflater25.end();
        inflater25.end();
        boolean boolean32 = inflater25.needsDictionary();
        java.util.zip.Inflater inflater33 = new java.util.zip.Inflater();
        boolean boolean34 = inflater33.finished();
        int int35 = inflater33.getRemaining();
        boolean boolean36 = inflater33.needsInput();
        java.util.zip.Inflater inflater37 = new java.util.zip.Inflater();
        boolean boolean38 = inflater37.finished();
        int int39 = inflater37.getRemaining();
        boolean boolean40 = inflater37.finished();
        byte[] byteArray47 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater37.setInput(byteArray47);
        inflater33.setInput(byteArray47);
        inflater25.setInput(byteArray47);
        inflater0.setInput(byteArray47);
        int int52 = inflater0.getRemaining();
        boolean boolean53 = inflater0.needsInput();
        inflater0.end();
        inflater0.end();
        java.util.zip.Inflater inflater57 = new java.util.zip.Inflater(true);
        java.util.zip.Inflater inflater58 = new java.util.zip.Inflater();
        byte[] byteArray60 = new byte[] { (byte) 1 };
        int int61 = inflater58.inflate(byteArray60);
        inflater58.reset();
        java.util.zip.Inflater inflater63 = new java.util.zip.Inflater();
        byte[] byteArray65 = new byte[] { (byte) 1 };
        int int66 = inflater63.inflate(byteArray65);
        long long67 = inflater63.getBytesWritten();
        inflater63.reset();
        long long69 = inflater63.getBytesWritten();
        java.util.zip.Inflater inflater70 = new java.util.zip.Inflater();
        boolean boolean71 = inflater70.finished();
        int int72 = inflater70.getRemaining();
        boolean boolean73 = inflater70.needsDictionary();
        boolean boolean74 = inflater70.needsInput();
        int int75 = inflater70.getRemaining();
        java.util.zip.Inflater inflater76 = new java.util.zip.Inflater();
        boolean boolean77 = inflater76.finished();
        int int78 = inflater76.getRemaining();
        boolean boolean79 = inflater76.finished();
        byte[] byteArray86 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater76.setInput(byteArray86);
        int int88 = inflater70.inflate(byteArray86);
        inflater63.setInput(byteArray86);
        inflater58.setInput(byteArray86);
        inflater57.setDictionary(byteArray86);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int92 = inflater0.inflate(byteArray86);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        boolean boolean21 = inflater0.finished();
        int int22 = inflater0.getRemaining();
        inflater0.end();
        int int24 = inflater0.getRemaining();
        int int25 = inflater0.getRemaining();
        java.util.zip.Inflater inflater26 = new java.util.zip.Inflater();
        boolean boolean27 = inflater26.finished();
        int int28 = inflater26.getRemaining();
        boolean boolean29 = inflater26.needsDictionary();
        long long30 = inflater26.getBytesRead();
        boolean boolean31 = inflater26.needsInput();
        int int32 = inflater26.getTotalOut();
        long long33 = inflater26.getBytesRead();
        java.util.zip.Inflater inflater34 = new java.util.zip.Inflater();
        boolean boolean35 = inflater34.finished();
        int int36 = inflater34.getRemaining();
        boolean boolean37 = inflater34.needsDictionary();
        boolean boolean38 = inflater34.needsInput();
        int int39 = inflater34.getRemaining();
        inflater34.reset();
        java.util.zip.Inflater inflater41 = new java.util.zip.Inflater();
        boolean boolean42 = inflater41.finished();
        int int43 = inflater41.getRemaining();
        boolean boolean44 = inflater41.finished();
        byte[] byteArray51 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater41.setInput(byteArray51);
        inflater34.setInput(byteArray51);
        int int56 = inflater26.inflate(byteArray51, 1, (int) (short) 1);
        java.util.zip.Inflater inflater57 = new java.util.zip.Inflater();
        boolean boolean58 = inflater57.finished();
        int int59 = inflater57.getRemaining();
        boolean boolean60 = inflater57.finished();
        int int61 = inflater57.getAdler();
        int int62 = inflater57.getAdler();
        int int63 = inflater57.getAdler();
        int int64 = inflater57.getTotalOut();
        inflater57.reset();
        java.util.zip.Inflater inflater66 = new java.util.zip.Inflater();
        boolean boolean67 = inflater66.needsDictionary();
        java.util.zip.Inflater inflater68 = new java.util.zip.Inflater();
        boolean boolean69 = inflater68.finished();
        int int70 = inflater68.getRemaining();
        boolean boolean71 = inflater68.needsDictionary();
        boolean boolean72 = inflater68.needsInput();
        int int73 = inflater68.getRemaining();
        inflater68.reset();
        java.util.zip.Inflater inflater75 = new java.util.zip.Inflater();
        boolean boolean76 = inflater75.finished();
        int int77 = inflater75.getRemaining();
        boolean boolean78 = inflater75.finished();
        byte[] byteArray85 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater75.setInput(byteArray85);
        inflater68.setInput(byteArray85);
        inflater66.setInput(byteArray85);
        inflater57.setInput(byteArray85, (int) (byte) 0, 0);
        int int92 = inflater26.inflate(byteArray85);
        inflater0.setInput(byteArray85);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int94 = inflater0.getTotalOut();
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        int int4 = inflater0.getRemaining();
        boolean boolean5 = inflater0.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long6 = inflater0.getBytesWritten();
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.end();
        boolean boolean6 = inflater0.needsDictionary();
        boolean boolean7 = inflater0.needsInput();
        boolean boolean8 = inflater0.needsDictionary();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long9 = inflater0.getBytesRead();
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        boolean boolean6 = inflater5.finished();
        int int7 = inflater5.getRemaining();
        boolean boolean8 = inflater5.needsDictionary();
        long long9 = inflater5.getBytesRead();
        boolean boolean10 = inflater5.needsInput();
        java.util.zip.Inflater inflater11 = new java.util.zip.Inflater();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        int int14 = inflater11.inflate(byteArray13);
        long long15 = inflater11.getBytesWritten();
        inflater11.reset();
        long long17 = inflater11.getBytesWritten();
        java.util.zip.Inflater inflater18 = new java.util.zip.Inflater();
        boolean boolean19 = inflater18.finished();
        int int20 = inflater18.getRemaining();
        boolean boolean21 = inflater18.needsDictionary();
        boolean boolean22 = inflater18.needsInput();
        int int23 = inflater18.getRemaining();
        java.util.zip.Inflater inflater24 = new java.util.zip.Inflater();
        boolean boolean25 = inflater24.finished();
        int int26 = inflater24.getRemaining();
        boolean boolean27 = inflater24.finished();
        byte[] byteArray34 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater24.setInput(byteArray34);
        int int36 = inflater18.inflate(byteArray34);
        inflater11.setInput(byteArray34);
        int int38 = inflater5.inflate(byteArray34);
        inflater0.setInput(byteArray34);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long40 = inflater0.getBytesWritten();
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        int int2 = inflater0.getTotalOut();
        int int3 = inflater0.getTotalOut();
        int int4 = inflater0.getAdler();
        inflater0.reset();
        long long6 = inflater0.getBytesWritten();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long8 = inflater0.getBytesWritten();
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getAdler();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        boolean boolean6 = inflater5.finished();
        int int7 = inflater5.getRemaining();
        boolean boolean8 = inflater5.needsInput();
        java.util.zip.Inflater inflater9 = new java.util.zip.Inflater();
        boolean boolean10 = inflater9.finished();
        int int11 = inflater9.getRemaining();
        boolean boolean12 = inflater9.finished();
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater9.setInput(byteArray19);
        inflater5.setInput(byteArray19);
        inflater0.setInput(byteArray19);
        boolean boolean23 = inflater0.needsInput();
        int int24 = inflater0.getAdler();
        int int25 = inflater0.getTotalIn();
        int int26 = inflater0.getAdler();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int28 = inflater0.getTotalOut();
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        inflater0.end();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsDictionary();
        int int5 = inflater0.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int6 = inflater0.getTotalOut();
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getAdler();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        boolean boolean6 = inflater5.finished();
        int int7 = inflater5.getRemaining();
        boolean boolean8 = inflater5.needsInput();
        java.util.zip.Inflater inflater9 = new java.util.zip.Inflater();
        boolean boolean10 = inflater9.finished();
        int int11 = inflater9.getRemaining();
        boolean boolean12 = inflater9.finished();
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater9.setInput(byteArray19);
        inflater5.setInput(byteArray19);
        inflater0.setInput(byteArray19);
        boolean boolean23 = inflater0.needsInput();
        int int24 = inflater0.getAdler();
        int int25 = inflater0.getTotalIn();
        int int26 = inflater0.getAdler();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater0.setInput(byteArray10);
        boolean boolean12 = inflater0.needsDictionary();
        boolean boolean13 = inflater0.needsInput();
        int int14 = inflater0.getRemaining();
        inflater0.end();
        java.util.zip.Inflater inflater16 = new java.util.zip.Inflater();
        byte[] byteArray18 = new byte[] { (byte) 1 };
        int int19 = inflater16.inflate(byteArray18);
        int int20 = inflater16.getTotalOut();
        java.util.zip.Inflater inflater21 = new java.util.zip.Inflater();
        byte[] byteArray23 = new byte[] { (byte) 1 };
        int int24 = inflater21.inflate(byteArray23);
        int int25 = inflater21.getTotalIn();
        long long26 = inflater21.getBytesWritten();
        int int27 = inflater21.getTotalIn();
        boolean boolean28 = inflater21.needsDictionary();
        int int29 = inflater21.getAdler();
        java.util.zip.Inflater inflater30 = new java.util.zip.Inflater();
        boolean boolean31 = inflater30.finished();
        int int32 = inflater30.getRemaining();
        inflater30.end();
        boolean boolean34 = inflater30.needsInput();
        java.util.zip.Inflater inflater35 = new java.util.zip.Inflater();
        boolean boolean36 = inflater35.finished();
        int int37 = inflater35.getRemaining();
        boolean boolean38 = inflater35.needsDictionary();
        long long39 = inflater35.getBytesRead();
        boolean boolean40 = inflater35.needsInput();
        java.util.zip.Inflater inflater41 = new java.util.zip.Inflater();
        byte[] byteArray43 = new byte[] { (byte) 1 };
        int int44 = inflater41.inflate(byteArray43);
        long long45 = inflater41.getBytesWritten();
        inflater41.reset();
        long long47 = inflater41.getBytesWritten();
        java.util.zip.Inflater inflater48 = new java.util.zip.Inflater();
        boolean boolean49 = inflater48.finished();
        int int50 = inflater48.getRemaining();
        boolean boolean51 = inflater48.needsDictionary();
        boolean boolean52 = inflater48.needsInput();
        int int53 = inflater48.getRemaining();
        java.util.zip.Inflater inflater54 = new java.util.zip.Inflater();
        boolean boolean55 = inflater54.finished();
        int int56 = inflater54.getRemaining();
        boolean boolean57 = inflater54.finished();
        byte[] byteArray64 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater54.setInput(byteArray64);
        int int66 = inflater48.inflate(byteArray64);
        inflater41.setInput(byteArray64);
        int int68 = inflater35.inflate(byteArray64);
        inflater30.setInput(byteArray64);
        int int70 = inflater21.inflate(byteArray64);
        java.util.zip.Inflater inflater71 = new java.util.zip.Inflater();
        byte[] byteArray73 = new byte[] { (byte) 1 };
        int int74 = inflater71.inflate(byteArray73);
        int int75 = inflater71.getAdler();
        java.util.zip.Inflater inflater76 = new java.util.zip.Inflater();
        boolean boolean77 = inflater76.finished();
        int int78 = inflater76.getRemaining();
        boolean boolean79 = inflater76.needsInput();
        java.util.zip.Inflater inflater80 = new java.util.zip.Inflater();
        boolean boolean81 = inflater80.finished();
        int int82 = inflater80.getRemaining();
        boolean boolean83 = inflater80.finished();
        byte[] byteArray90 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater80.setInput(byteArray90);
        inflater76.setInput(byteArray90);
        inflater71.setInput(byteArray90);
        int int94 = inflater21.inflate(byteArray90);
        inflater16.setInput(byteArray90);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int96 = inflater0.inflate(byteArray90);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        long long4 = inflater0.getBytesRead();
        boolean boolean5 = inflater0.needsInput();
        int int6 = inflater0.getTotalOut();
        long long7 = inflater0.getBytesRead();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        boolean boolean9 = inflater8.finished();
        int int10 = inflater8.getRemaining();
        boolean boolean11 = inflater8.needsDictionary();
        boolean boolean12 = inflater8.needsInput();
        int int13 = inflater8.getRemaining();
        inflater8.reset();
        java.util.zip.Inflater inflater15 = new java.util.zip.Inflater();
        boolean boolean16 = inflater15.finished();
        int int17 = inflater15.getRemaining();
        boolean boolean18 = inflater15.finished();
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater15.setInput(byteArray25);
        inflater8.setInput(byteArray25);
        int int30 = inflater0.inflate(byteArray25, 1, (int) (short) 1);
        long long31 = inflater0.getBytesRead();
        inflater0.end();
        java.util.zip.Inflater inflater33 = new java.util.zip.Inflater();
        boolean boolean34 = inflater33.finished();
        int int35 = inflater33.getRemaining();
        boolean boolean36 = inflater33.needsDictionary();
        boolean boolean37 = inflater33.needsInput();
        int int38 = inflater33.getRemaining();
        java.util.zip.Inflater inflater39 = new java.util.zip.Inflater();
        boolean boolean40 = inflater39.finished();
        int int41 = inflater39.getRemaining();
        boolean boolean42 = inflater39.finished();
        byte[] byteArray49 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater39.setInput(byteArray49);
        int int51 = inflater33.inflate(byteArray49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        inflater0.setDictionary(byteArray49);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsDictionary();
        inflater0.end();
        boolean boolean7 = inflater0.needsInput();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        boolean boolean9 = inflater8.finished();
        int int10 = inflater8.getRemaining();
        boolean boolean11 = inflater8.needsDictionary();
        boolean boolean12 = inflater8.needsInput();
        int int13 = inflater8.getRemaining();
        inflater8.reset();
        java.util.zip.Inflater inflater15 = new java.util.zip.Inflater();
        boolean boolean16 = inflater15.finished();
        int int17 = inflater15.getRemaining();
        boolean boolean18 = inflater15.finished();
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater15.setInput(byteArray25);
        inflater8.setInput(byteArray25);
        int int28 = inflater8.getTotalOut();
        boolean boolean29 = inflater8.needsDictionary();
        long long30 = inflater8.getBytesWritten();
        int int31 = inflater8.getRemaining();
        int int32 = inflater8.getRemaining();
        java.util.zip.Inflater inflater33 = new java.util.zip.Inflater();
        byte[] byteArray35 = new byte[] { (byte) 1 };
        int int36 = inflater33.inflate(byteArray35);
        boolean boolean37 = inflater33.finished();
        inflater33.end();
        inflater33.end();
        boolean boolean40 = inflater33.needsDictionary();
        java.util.zip.Inflater inflater41 = new java.util.zip.Inflater();
        boolean boolean42 = inflater41.finished();
        int int43 = inflater41.getRemaining();
        boolean boolean44 = inflater41.needsInput();
        java.util.zip.Inflater inflater45 = new java.util.zip.Inflater();
        boolean boolean46 = inflater45.finished();
        int int47 = inflater45.getRemaining();
        boolean boolean48 = inflater45.finished();
        byte[] byteArray55 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater45.setInput(byteArray55);
        inflater41.setInput(byteArray55);
        inflater33.setInput(byteArray55);
        inflater8.setInput(byteArray55);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int60 = inflater0.inflate(byteArray55);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.reset();
        int int6 = inflater0.getRemaining();
        inflater0.reset();
        int int8 = inflater0.getTotalOut();
        int int9 = inflater0.getRemaining();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long11 = inflater0.getBytesRead();
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        long long4 = inflater0.getBytesRead();
        boolean boolean5 = inflater0.finished();
        long long6 = inflater0.getBytesRead();
        boolean boolean7 = inflater0.needsDictionary();
        int int8 = inflater0.getRemaining();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        int int2 = inflater0.getTotalOut();
        int int3 = inflater0.getTotalOut();
        long long4 = inflater0.getBytesWritten();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        boolean boolean6 = inflater5.finished();
        int int7 = inflater5.getRemaining();
        boolean boolean8 = inflater5.needsDictionary();
        long long9 = inflater5.getBytesRead();
        boolean boolean10 = inflater5.needsDictionary();
        java.util.zip.Inflater inflater11 = new java.util.zip.Inflater();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        int int14 = inflater11.inflate(byteArray13);
        long long15 = inflater11.getBytesWritten();
        inflater11.reset();
        long long17 = inflater11.getBytesWritten();
        java.util.zip.Inflater inflater18 = new java.util.zip.Inflater();
        boolean boolean19 = inflater18.finished();
        int int20 = inflater18.getRemaining();
        boolean boolean21 = inflater18.needsDictionary();
        boolean boolean22 = inflater18.needsInput();
        int int23 = inflater18.getRemaining();
        java.util.zip.Inflater inflater24 = new java.util.zip.Inflater();
        boolean boolean25 = inflater24.finished();
        int int26 = inflater24.getRemaining();
        boolean boolean27 = inflater24.finished();
        byte[] byteArray34 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater24.setInput(byteArray34);
        int int36 = inflater18.inflate(byteArray34);
        inflater11.setInput(byteArray34);
        inflater5.setInput(byteArray34);
        int int39 = inflater0.inflate(byteArray34);
        int int40 = inflater0.getTotalOut();
        int int41 = inflater0.getTotalIn();
        java.util.zip.Inflater inflater42 = new java.util.zip.Inflater();
        byte[] byteArray44 = new byte[] { (byte) 1 };
        int int45 = inflater42.inflate(byteArray44);
        inflater42.reset();
        java.util.zip.Inflater inflater47 = new java.util.zip.Inflater();
        byte[] byteArray49 = new byte[] { (byte) 1 };
        int int50 = inflater47.inflate(byteArray49);
        int int51 = inflater47.getTotalIn();
        java.util.zip.Inflater inflater52 = new java.util.zip.Inflater();
        byte[] byteArray54 = new byte[] { (byte) 1 };
        int int55 = inflater52.inflate(byteArray54);
        byte[] byteArray60 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int61 = inflater52.inflate(byteArray60);
        int int62 = inflater47.inflate(byteArray60);
        inflater42.setInput(byteArray60);
        int int64 = inflater0.inflate(byteArray60);
        int int65 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean67 = inflater0.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.end();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        inflater6.end();
        java.util.zip.Inflater inflater10 = new java.util.zip.Inflater();
        boolean boolean11 = inflater10.finished();
        int int12 = inflater10.getRemaining();
        boolean boolean13 = inflater10.finished();
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater10.setInput(byteArray20);
        inflater6.setInput(byteArray20);
        inflater0.setInput(byteArray20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int24 = inflater0.getTotalOut();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        boolean boolean21 = inflater0.needsDictionary();
        long long22 = inflater0.getBytesWritten();
        boolean boolean23 = inflater0.needsDictionary();
        long long24 = inflater0.getBytesWritten();
        boolean boolean25 = inflater0.needsInput();
        inflater0.end();
        java.util.zip.Inflater inflater27 = new java.util.zip.Inflater();
        boolean boolean28 = inflater27.finished();
        int int29 = inflater27.getRemaining();
        boolean boolean30 = inflater27.needsDictionary();
        long long31 = inflater27.getBytesRead();
        boolean boolean32 = inflater27.needsInput();
        java.util.zip.Inflater inflater33 = new java.util.zip.Inflater();
        byte[] byteArray35 = new byte[] { (byte) 1 };
        int int36 = inflater33.inflate(byteArray35);
        long long37 = inflater33.getBytesWritten();
        inflater33.reset();
        long long39 = inflater33.getBytesWritten();
        java.util.zip.Inflater inflater40 = new java.util.zip.Inflater();
        boolean boolean41 = inflater40.finished();
        int int42 = inflater40.getRemaining();
        boolean boolean43 = inflater40.needsDictionary();
        boolean boolean44 = inflater40.needsInput();
        int int45 = inflater40.getRemaining();
        java.util.zip.Inflater inflater46 = new java.util.zip.Inflater();
        boolean boolean47 = inflater46.finished();
        int int48 = inflater46.getRemaining();
        boolean boolean49 = inflater46.finished();
        byte[] byteArray56 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater46.setInput(byteArray56);
        int int58 = inflater40.inflate(byteArray56);
        inflater33.setInput(byteArray56);
        int int60 = inflater27.inflate(byteArray56);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int61 = inflater0.inflate(byteArray56);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        long long4 = inflater0.getBytesRead();
        boolean boolean5 = inflater0.finished();
        long long6 = inflater0.getBytesRead();
        boolean boolean7 = inflater0.needsDictionary();
        int int8 = inflater0.getRemaining();
        inflater0.end();
        int int10 = inflater0.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int11 = inflater0.getAdler();
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        int int4 = inflater0.getRemaining();
        long long5 = inflater0.getBytesWritten();
        boolean boolean6 = inflater0.finished();
        boolean boolean7 = inflater0.needsDictionary();
        boolean boolean8 = inflater0.finished();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getTotalIn();
        int int5 = inflater0.getAdler();
        int int6 = inflater0.getTotalIn();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int8 = inflater0.getAdler();
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        inflater0.end();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsDictionary();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long5 = inflater0.getBytesWritten();
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater0.setInput(byteArray10);
        inflater0.end();
        int int13 = inflater0.getRemaining();
        java.util.zip.Inflater inflater14 = new java.util.zip.Inflater();
        boolean boolean15 = inflater14.finished();
        int int16 = inflater14.getRemaining();
        int int17 = inflater14.getTotalOut();
        inflater14.reset();
        boolean boolean19 = inflater14.needsInput();
        java.util.zip.Inflater inflater20 = new java.util.zip.Inflater();
        boolean boolean21 = inflater20.finished();
        int int22 = inflater20.getRemaining();
        boolean boolean23 = inflater20.needsDictionary();
        long long24 = inflater20.getBytesRead();
        boolean boolean25 = inflater20.needsDictionary();
        java.util.zip.Inflater inflater26 = new java.util.zip.Inflater();
        byte[] byteArray28 = new byte[] { (byte) 1 };
        int int29 = inflater26.inflate(byteArray28);
        long long30 = inflater26.getBytesWritten();
        inflater26.reset();
        long long32 = inflater26.getBytesWritten();
        java.util.zip.Inflater inflater33 = new java.util.zip.Inflater();
        boolean boolean34 = inflater33.finished();
        int int35 = inflater33.getRemaining();
        boolean boolean36 = inflater33.needsDictionary();
        boolean boolean37 = inflater33.needsInput();
        int int38 = inflater33.getRemaining();
        java.util.zip.Inflater inflater39 = new java.util.zip.Inflater();
        boolean boolean40 = inflater39.finished();
        int int41 = inflater39.getRemaining();
        boolean boolean42 = inflater39.finished();
        byte[] byteArray49 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater39.setInput(byteArray49);
        int int51 = inflater33.inflate(byteArray49);
        inflater26.setInput(byteArray49);
        inflater20.setInput(byteArray49);
        int int54 = inflater14.inflate(byteArray49);
        inflater0.setInput(byteArray49, 1, (int) (byte) 0);
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long59 = inflater0.getBytesRead();
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        boolean boolean4 = inflater0.finished();
        inflater0.reset();
        boolean boolean6 = inflater0.needsDictionary();
        long long7 = inflater0.getBytesRead();
        inflater0.end();
        java.util.zip.Inflater inflater9 = new java.util.zip.Inflater();
        boolean boolean10 = inflater9.finished();
        int int11 = inflater9.getRemaining();
        boolean boolean12 = inflater9.needsDictionary();
        boolean boolean13 = inflater9.needsInput();
        boolean boolean14 = inflater9.needsDictionary();
        boolean boolean15 = inflater9.finished();
        int int16 = inflater9.getTotalIn();
        int int17 = inflater9.getRemaining();
        int int18 = inflater9.getAdler();
        int int19 = inflater9.getAdler();
        java.util.zip.Inflater inflater20 = new java.util.zip.Inflater();
        boolean boolean21 = inflater20.finished();
        int int22 = inflater20.getRemaining();
        int int23 = inflater20.getTotalOut();
        inflater20.reset();
        boolean boolean25 = inflater20.needsInput();
        int int26 = inflater20.getRemaining();
        boolean boolean27 = inflater20.finished();
        java.util.zip.Inflater inflater28 = new java.util.zip.Inflater();
        byte[] byteArray30 = new byte[] { (byte) 1 };
        int int31 = inflater28.inflate(byteArray30);
        boolean boolean32 = inflater28.finished();
        inflater28.end();
        inflater28.end();
        boolean boolean35 = inflater28.needsDictionary();
        java.util.zip.Inflater inflater36 = new java.util.zip.Inflater();
        boolean boolean37 = inflater36.finished();
        int int38 = inflater36.getRemaining();
        boolean boolean39 = inflater36.needsInput();
        java.util.zip.Inflater inflater40 = new java.util.zip.Inflater();
        boolean boolean41 = inflater40.finished();
        int int42 = inflater40.getRemaining();
        boolean boolean43 = inflater40.finished();
        byte[] byteArray50 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater40.setInput(byteArray50);
        inflater36.setInput(byteArray50);
        inflater28.setInput(byteArray50);
        int int56 = inflater20.inflate(byteArray50, 6, (int) (short) 0);
        int int57 = inflater9.inflate(byteArray50);
        inflater0.setInput(byteArray50, 4, (int) (short) 1);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long61 = inflater0.getBytesWritten();
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        int int3 = inflater0.getTotalOut();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1 };
        inflater0.setInput(byteArray6);
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        long long4 = inflater0.getBytesRead();
        boolean boolean5 = inflater0.needsInput();
        boolean boolean6 = inflater0.finished();
        boolean boolean7 = inflater0.needsInput();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        boolean boolean9 = inflater8.finished();
        int int10 = inflater8.getRemaining();
        boolean boolean11 = inflater8.needsDictionary();
        boolean boolean12 = inflater8.needsInput();
        int int13 = inflater8.getRemaining();
        java.util.zip.Inflater inflater14 = new java.util.zip.Inflater();
        boolean boolean15 = inflater14.finished();
        int int16 = inflater14.getRemaining();
        boolean boolean17 = inflater14.finished();
        byte[] byteArray24 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater14.setInput(byteArray24);
        int int26 = inflater8.inflate(byteArray24);
        boolean boolean27 = inflater8.finished();
        int int28 = inflater8.getAdler();
        boolean boolean29 = inflater8.finished();
        int int30 = inflater8.getAdler();
        boolean boolean31 = inflater8.needsInput();
        java.util.zip.Inflater inflater32 = new java.util.zip.Inflater();
        byte[] byteArray34 = new byte[] { (byte) 1 };
        int int35 = inflater32.inflate(byteArray34);
        int int36 = inflater32.getTotalIn();
        java.util.zip.Inflater inflater37 = new java.util.zip.Inflater();
        byte[] byteArray39 = new byte[] { (byte) 1 };
        int int40 = inflater37.inflate(byteArray39);
        byte[] byteArray45 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int46 = inflater37.inflate(byteArray45);
        int int47 = inflater32.inflate(byteArray45);
        int int48 = inflater8.inflate(byteArray45);
        inflater0.setInput(byteArray45);
        int int50 = inflater0.getAdler();
        long long51 = inflater0.getBytesWritten();
        long long52 = inflater0.getBytesWritten();
        long long53 = inflater0.getBytesWritten();
        boolean boolean54 = inflater0.needsDictionary();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        long long4 = inflater0.getBytesRead();
        boolean boolean5 = inflater0.needsInput();
        int int6 = inflater0.getTotalOut();
        long long7 = inflater0.getBytesRead();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        boolean boolean9 = inflater8.finished();
        int int10 = inflater8.getRemaining();
        boolean boolean11 = inflater8.needsDictionary();
        boolean boolean12 = inflater8.needsInput();
        int int13 = inflater8.getRemaining();
        inflater8.reset();
        java.util.zip.Inflater inflater15 = new java.util.zip.Inflater();
        boolean boolean16 = inflater15.finished();
        int int17 = inflater15.getRemaining();
        boolean boolean18 = inflater15.finished();
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater15.setInput(byteArray25);
        inflater8.setInput(byteArray25);
        int int30 = inflater0.inflate(byteArray25, 1, (int) (short) 1);
        int int31 = inflater0.getTotalIn();
        boolean boolean32 = inflater0.needsDictionary();
        int int33 = inflater0.getAdler();
        int int34 = inflater0.getRemaining();
        inflater0.end();
        java.util.zip.Inflater inflater36 = new java.util.zip.Inflater();
        boolean boolean37 = inflater36.finished();
        boolean boolean38 = inflater36.needsInput();
        long long39 = inflater36.getBytesWritten();
        java.util.zip.Inflater inflater40 = new java.util.zip.Inflater();
        boolean boolean41 = inflater40.finished();
        int int42 = inflater40.getRemaining();
        boolean boolean43 = inflater40.finished();
        int int44 = inflater40.getAdler();
        inflater40.reset();
        boolean boolean46 = inflater40.needsInput();
        java.util.zip.Inflater inflater47 = new java.util.zip.Inflater();
        boolean boolean48 = inflater47.finished();
        int int49 = inflater47.getRemaining();
        inflater47.end();
        boolean boolean51 = inflater47.needsInput();
        java.util.zip.Inflater inflater52 = new java.util.zip.Inflater();
        boolean boolean53 = inflater52.finished();
        int int54 = inflater52.getRemaining();
        boolean boolean55 = inflater52.needsDictionary();
        long long56 = inflater52.getBytesRead();
        boolean boolean57 = inflater52.needsInput();
        java.util.zip.Inflater inflater58 = new java.util.zip.Inflater();
        byte[] byteArray60 = new byte[] { (byte) 1 };
        int int61 = inflater58.inflate(byteArray60);
        long long62 = inflater58.getBytesWritten();
        inflater58.reset();
        long long64 = inflater58.getBytesWritten();
        java.util.zip.Inflater inflater65 = new java.util.zip.Inflater();
        boolean boolean66 = inflater65.finished();
        int int67 = inflater65.getRemaining();
        boolean boolean68 = inflater65.needsDictionary();
        boolean boolean69 = inflater65.needsInput();
        int int70 = inflater65.getRemaining();
        java.util.zip.Inflater inflater71 = new java.util.zip.Inflater();
        boolean boolean72 = inflater71.finished();
        int int73 = inflater71.getRemaining();
        boolean boolean74 = inflater71.finished();
        byte[] byteArray81 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater71.setInput(byteArray81);
        int int83 = inflater65.inflate(byteArray81);
        inflater58.setInput(byteArray81);
        int int85 = inflater52.inflate(byteArray81);
        inflater47.setInput(byteArray81);
        inflater40.setInput(byteArray81);
        int int88 = inflater36.inflate(byteArray81);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int89 = inflater0.inflate(byteArray81);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.reset();
        long long6 = inflater0.getBytesWritten();
        inflater0.end();
        inflater0.end();
        boolean boolean9 = inflater0.needsInput();
        boolean boolean10 = inflater0.needsDictionary();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getTotalIn();
        long long5 = inflater0.getBytesWritten();
        int int6 = inflater0.getTotalIn();
        boolean boolean7 = inflater0.needsDictionary();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long9 = inflater0.getBytesWritten();
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.end();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        inflater6.end();
        java.util.zip.Inflater inflater10 = new java.util.zip.Inflater();
        boolean boolean11 = inflater10.finished();
        int int12 = inflater10.getRemaining();
        boolean boolean13 = inflater10.finished();
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater10.setInput(byteArray20);
        inflater6.setInput(byteArray20);
        inflater0.setInput(byteArray20);
        boolean boolean24 = inflater0.needsDictionary();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int25 = inflater0.getTotalIn();
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        boolean boolean21 = inflater0.needsDictionary();
        long long22 = inflater0.getBytesWritten();
        int int23 = inflater0.getRemaining();
        int int24 = inflater0.getRemaining();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        byte[] byteArray27 = new byte[] { (byte) 1 };
        int int28 = inflater25.inflate(byteArray27);
        boolean boolean29 = inflater25.finished();
        inflater25.end();
        inflater25.end();
        boolean boolean32 = inflater25.needsDictionary();
        java.util.zip.Inflater inflater33 = new java.util.zip.Inflater();
        boolean boolean34 = inflater33.finished();
        int int35 = inflater33.getRemaining();
        boolean boolean36 = inflater33.needsInput();
        java.util.zip.Inflater inflater37 = new java.util.zip.Inflater();
        boolean boolean38 = inflater37.finished();
        int int39 = inflater37.getRemaining();
        boolean boolean40 = inflater37.finished();
        byte[] byteArray47 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater37.setInput(byteArray47);
        inflater33.setInput(byteArray47);
        inflater25.setInput(byteArray47);
        inflater0.setInput(byteArray47);
        int int52 = inflater0.getRemaining();
        long long53 = inflater0.getBytesRead();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int55 = inflater0.getTotalIn();
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        int int3 = inflater0.getTotalOut();
        inflater0.reset();
        long long5 = inflater0.getBytesWritten();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        boolean boolean8 = inflater6.needsInput();
        boolean boolean9 = inflater6.needsInput();
        java.util.zip.Inflater inflater10 = new java.util.zip.Inflater();
        boolean boolean11 = inflater10.finished();
        int int12 = inflater10.getRemaining();
        boolean boolean13 = inflater10.needsDictionary();
        long long14 = inflater10.getBytesRead();
        boolean boolean15 = inflater10.needsDictionary();
        java.util.zip.Inflater inflater16 = new java.util.zip.Inflater();
        byte[] byteArray18 = new byte[] { (byte) 1 };
        int int19 = inflater16.inflate(byteArray18);
        long long20 = inflater16.getBytesWritten();
        inflater16.reset();
        long long22 = inflater16.getBytesWritten();
        java.util.zip.Inflater inflater23 = new java.util.zip.Inflater();
        boolean boolean24 = inflater23.finished();
        int int25 = inflater23.getRemaining();
        boolean boolean26 = inflater23.needsDictionary();
        boolean boolean27 = inflater23.needsInput();
        int int28 = inflater23.getRemaining();
        java.util.zip.Inflater inflater29 = new java.util.zip.Inflater();
        boolean boolean30 = inflater29.finished();
        int int31 = inflater29.getRemaining();
        boolean boolean32 = inflater29.finished();
        byte[] byteArray39 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater29.setInput(byteArray39);
        int int41 = inflater23.inflate(byteArray39);
        inflater16.setInput(byteArray39);
        inflater10.setInput(byteArray39);
        int int44 = inflater6.inflate(byteArray39);
        int int45 = inflater0.inflate(byteArray39);
        boolean boolean46 = inflater0.needsInput();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int48 = inflater0.getAdler();
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        int int4 = inflater0.getRemaining();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        boolean boolean6 = inflater5.finished();
        int int7 = inflater5.getRemaining();
        boolean boolean8 = inflater5.needsDictionary();
        boolean boolean9 = inflater5.needsInput();
        int int10 = inflater5.getTotalOut();
        long long11 = inflater5.getBytesWritten();
        boolean boolean12 = inflater5.finished();
        java.util.zip.Inflater inflater14 = new java.util.zip.Inflater(true);
        int int15 = inflater14.getRemaining();
        long long16 = inflater14.getBytesRead();
        boolean boolean17 = inflater14.needsInput();
        inflater14.reset();
        long long19 = inflater14.getBytesRead();
        java.util.zip.Inflater inflater20 = new java.util.zip.Inflater();
        byte[] byteArray22 = new byte[] { (byte) 1 };
        int int23 = inflater20.inflate(byteArray22);
        boolean boolean24 = inflater20.finished();
        inflater20.end();
        inflater20.end();
        boolean boolean27 = inflater20.needsInput();
        java.util.zip.Inflater inflater28 = new java.util.zip.Inflater();
        boolean boolean29 = inflater28.finished();
        int int30 = inflater28.getRemaining();
        boolean boolean31 = inflater28.needsDictionary();
        boolean boolean32 = inflater28.needsInput();
        int int33 = inflater28.getRemaining();
        java.util.zip.Inflater inflater34 = new java.util.zip.Inflater();
        boolean boolean35 = inflater34.finished();
        int int36 = inflater34.getRemaining();
        boolean boolean37 = inflater34.finished();
        byte[] byteArray44 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater34.setInput(byteArray44);
        int int46 = inflater28.inflate(byteArray44);
        boolean boolean47 = inflater28.finished();
        int int48 = inflater28.getAdler();
        boolean boolean49 = inflater28.finished();
        int int50 = inflater28.getAdler();
        boolean boolean51 = inflater28.needsInput();
        java.util.zip.Inflater inflater52 = new java.util.zip.Inflater();
        byte[] byteArray54 = new byte[] { (byte) 1 };
        int int55 = inflater52.inflate(byteArray54);
        int int56 = inflater52.getTotalIn();
        java.util.zip.Inflater inflater57 = new java.util.zip.Inflater();
        byte[] byteArray59 = new byte[] { (byte) 1 };
        int int60 = inflater57.inflate(byteArray59);
        byte[] byteArray65 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int66 = inflater57.inflate(byteArray65);
        int int67 = inflater52.inflate(byteArray65);
        int int68 = inflater28.inflate(byteArray65);
        inflater20.setInput(byteArray65, (int) (byte) 0, (int) (short) 1);
        inflater14.setDictionary(byteArray65);
        java.util.zip.Inflater inflater73 = new java.util.zip.Inflater();
        boolean boolean74 = inflater73.finished();
        int int75 = inflater73.getRemaining();
        boolean boolean76 = inflater73.needsDictionary();
        boolean boolean77 = inflater73.needsInput();
        int int78 = inflater73.getRemaining();
        inflater73.reset();
        java.util.zip.Inflater inflater80 = new java.util.zip.Inflater();
        boolean boolean81 = inflater80.finished();
        int int82 = inflater80.getRemaining();
        boolean boolean83 = inflater80.finished();
        byte[] byteArray90 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater80.setInput(byteArray90);
        inflater73.setInput(byteArray90);
        inflater14.setInput(byteArray90);
        int int94 = inflater5.inflate(byteArray90);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int95 = inflater0.inflate(byteArray90);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        boolean boolean7 = inflater0.needsDictionary();
        int int8 = inflater0.getTotalIn();
        boolean boolean9 = inflater0.finished();
        inflater0.end();
        boolean boolean11 = inflater0.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long12 = inflater0.getBytesWritten();
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        int int3 = inflater0.getTotalOut();
        inflater0.reset();
        boolean boolean5 = inflater0.needsInput();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        boolean boolean9 = inflater6.needsDictionary();
        long long10 = inflater6.getBytesRead();
        boolean boolean11 = inflater6.needsDictionary();
        java.util.zip.Inflater inflater12 = new java.util.zip.Inflater();
        byte[] byteArray14 = new byte[] { (byte) 1 };
        int int15 = inflater12.inflate(byteArray14);
        long long16 = inflater12.getBytesWritten();
        inflater12.reset();
        long long18 = inflater12.getBytesWritten();
        java.util.zip.Inflater inflater19 = new java.util.zip.Inflater();
        boolean boolean20 = inflater19.finished();
        int int21 = inflater19.getRemaining();
        boolean boolean22 = inflater19.needsDictionary();
        boolean boolean23 = inflater19.needsInput();
        int int24 = inflater19.getRemaining();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        boolean boolean26 = inflater25.finished();
        int int27 = inflater25.getRemaining();
        boolean boolean28 = inflater25.finished();
        byte[] byteArray35 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater25.setInput(byteArray35);
        int int37 = inflater19.inflate(byteArray35);
        inflater12.setInput(byteArray35);
        inflater6.setInput(byteArray35);
        int int40 = inflater0.inflate(byteArray35);
        inflater0.end();
        inflater0.end();
        boolean boolean43 = inflater0.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int44 = inflater0.getTotalIn();
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(true);
        int int2 = inflater1.getRemaining();
        long long3 = inflater1.getBytesRead();
        java.util.zip.Inflater inflater4 = new java.util.zip.Inflater();
        boolean boolean5 = inflater4.finished();
        int int6 = inflater4.getRemaining();
        inflater4.end();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        boolean boolean9 = inflater8.finished();
        int int10 = inflater8.getRemaining();
        boolean boolean11 = inflater8.finished();
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater8.setInput(byteArray18);
        inflater4.setInput(byteArray18);
        inflater1.setInput(byteArray18, (int) (byte) 1, (int) (short) 1);
        int int24 = inflater1.getTotalIn();
        int int25 = inflater1.getRemaining();
        int int26 = inflater1.getAdler();
        inflater1.end();
        inflater1.end();
        boolean boolean29 = inflater1.finished();
        java.util.zip.Inflater inflater30 = new java.util.zip.Inflater();
        boolean boolean31 = inflater30.finished();
        int int32 = inflater30.getRemaining();
        boolean boolean33 = inflater30.needsDictionary();
        java.util.zip.Inflater inflater34 = new java.util.zip.Inflater();
        boolean boolean35 = inflater34.finished();
        int int36 = inflater34.getRemaining();
        inflater34.end();
        java.util.zip.Inflater inflater38 = new java.util.zip.Inflater();
        boolean boolean39 = inflater38.finished();
        int int40 = inflater38.getRemaining();
        boolean boolean41 = inflater38.finished();
        byte[] byteArray48 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater38.setInput(byteArray48);
        inflater34.setInput(byteArray48);
        int int51 = inflater30.inflate(byteArray48);
        inflater1.setInput(byteArray48);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater1.reset();
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        boolean boolean21 = inflater0.needsDictionary();
        long long22 = inflater0.getBytesWritten();
        int int23 = inflater0.getRemaining();
        int int24 = inflater0.getRemaining();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        byte[] byteArray27 = new byte[] { (byte) 1 };
        int int28 = inflater25.inflate(byteArray27);
        boolean boolean29 = inflater25.finished();
        inflater25.end();
        inflater25.end();
        boolean boolean32 = inflater25.needsDictionary();
        java.util.zip.Inflater inflater33 = new java.util.zip.Inflater();
        boolean boolean34 = inflater33.finished();
        int int35 = inflater33.getRemaining();
        boolean boolean36 = inflater33.needsInput();
        java.util.zip.Inflater inflater37 = new java.util.zip.Inflater();
        boolean boolean38 = inflater37.finished();
        int int39 = inflater37.getRemaining();
        boolean boolean40 = inflater37.finished();
        byte[] byteArray47 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater37.setInput(byteArray47);
        inflater33.setInput(byteArray47);
        inflater25.setInput(byteArray47);
        inflater0.setInput(byteArray47);
        int int52 = inflater0.getRemaining();
        long long53 = inflater0.getBytesRead();
        inflater0.end();
        boolean boolean55 = inflater0.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long56 = inflater0.getBytesWritten();
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsDictionary();
        inflater0.end();
        boolean boolean7 = inflater0.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long8 = inflater0.getBytesRead();
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getTotalIn();
        int int5 = inflater0.getTotalIn();
        int int6 = inflater0.getRemaining();
        boolean boolean7 = inflater0.needsInput();
        int int8 = inflater0.getAdler();
        int int9 = inflater0.getTotalOut();
        int int10 = inflater0.getRemaining();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int12 = inflater0.getAdler();
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        inflater0.reset();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        int int8 = inflater5.inflate(byteArray7);
        int int9 = inflater5.getTotalIn();
        java.util.zip.Inflater inflater10 = new java.util.zip.Inflater();
        byte[] byteArray12 = new byte[] { (byte) 1 };
        int int13 = inflater10.inflate(byteArray12);
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int19 = inflater10.inflate(byteArray18);
        int int20 = inflater5.inflate(byteArray18);
        inflater0.setInput(byteArray18);
        boolean boolean22 = inflater0.needsDictionary();
        boolean boolean23 = inflater0.finished();
        long long24 = inflater0.getBytesRead();
        long long25 = inflater0.getBytesRead();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int27 = inflater0.getTotalOut();
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        int int4 = inflater0.getAdler();
        inflater0.reset();
        long long6 = inflater0.getBytesWritten();
        inflater0.end();
        boolean boolean8 = inflater0.needsInput();
        java.util.zip.Inflater inflater9 = new java.util.zip.Inflater();
        boolean boolean10 = inflater9.needsDictionary();
        int int11 = inflater9.getTotalOut();
        int int12 = inflater9.getTotalOut();
        long long13 = inflater9.getBytesWritten();
        java.util.zip.Inflater inflater14 = new java.util.zip.Inflater();
        boolean boolean15 = inflater14.finished();
        int int16 = inflater14.getRemaining();
        boolean boolean17 = inflater14.needsDictionary();
        boolean boolean18 = inflater14.needsInput();
        int int19 = inflater14.getRemaining();
        java.util.zip.Inflater inflater20 = new java.util.zip.Inflater();
        boolean boolean21 = inflater20.finished();
        int int22 = inflater20.getRemaining();
        boolean boolean23 = inflater20.finished();
        byte[] byteArray30 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater20.setInput(byteArray30);
        int int32 = inflater14.inflate(byteArray30);
        java.util.zip.Inflater inflater33 = new java.util.zip.Inflater();
        boolean boolean34 = inflater33.finished();
        int int35 = inflater33.getRemaining();
        boolean boolean36 = inflater33.finished();
        java.util.zip.Inflater inflater37 = new java.util.zip.Inflater();
        boolean boolean38 = inflater37.finished();
        int int39 = inflater37.getRemaining();
        boolean boolean40 = inflater37.finished();
        byte[] byteArray47 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater37.setInput(byteArray47);
        inflater33.setInput(byteArray47);
        inflater14.setInput(byteArray47);
        int int51 = inflater9.inflate(byteArray47);
        inflater0.setInput(byteArray47, (int) (byte) 0, (int) (byte) 0);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int55 = inflater0.getTotalOut();
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(true);
        int int2 = inflater1.getRemaining();
        long long3 = inflater1.getBytesRead();
        java.util.zip.Inflater inflater4 = new java.util.zip.Inflater();
        byte[] byteArray6 = new byte[] { (byte) 1 };
        int int7 = inflater4.inflate(byteArray6);
        int int8 = inflater1.inflate(byteArray6);
        inflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int10 = inflater1.getTotalIn();
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        boolean boolean20 = inflater0.finished();
        inflater0.end();
        int int22 = inflater0.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        boolean boolean6 = inflater5.finished();
        int int7 = inflater5.getRemaining();
        boolean boolean8 = inflater5.needsDictionary();
        long long9 = inflater5.getBytesRead();
        boolean boolean10 = inflater5.needsInput();
        java.util.zip.Inflater inflater11 = new java.util.zip.Inflater();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        int int14 = inflater11.inflate(byteArray13);
        long long15 = inflater11.getBytesWritten();
        inflater11.reset();
        long long17 = inflater11.getBytesWritten();
        java.util.zip.Inflater inflater18 = new java.util.zip.Inflater();
        boolean boolean19 = inflater18.finished();
        int int20 = inflater18.getRemaining();
        boolean boolean21 = inflater18.needsDictionary();
        boolean boolean22 = inflater18.needsInput();
        int int23 = inflater18.getRemaining();
        java.util.zip.Inflater inflater24 = new java.util.zip.Inflater();
        boolean boolean25 = inflater24.finished();
        int int26 = inflater24.getRemaining();
        boolean boolean27 = inflater24.finished();
        byte[] byteArray34 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater24.setInput(byteArray34);
        int int36 = inflater18.inflate(byteArray34);
        inflater11.setInput(byteArray34);
        int int38 = inflater5.inflate(byteArray34);
        inflater0.setInput(byteArray34);
        int int40 = inflater0.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        boolean boolean21 = inflater0.needsDictionary();
        int int22 = inflater0.getTotalOut();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        inflater0.end();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        int int4 = inflater0.getRemaining();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater(true);
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        byte[] byteArray9 = new byte[] { (byte) 1 };
        int int10 = inflater7.inflate(byteArray9);
        inflater7.reset();
        java.util.zip.Inflater inflater12 = new java.util.zip.Inflater();
        byte[] byteArray14 = new byte[] { (byte) 1 };
        int int15 = inflater12.inflate(byteArray14);
        long long16 = inflater12.getBytesWritten();
        inflater12.reset();
        long long18 = inflater12.getBytesWritten();
        java.util.zip.Inflater inflater19 = new java.util.zip.Inflater();
        boolean boolean20 = inflater19.finished();
        int int21 = inflater19.getRemaining();
        boolean boolean22 = inflater19.needsDictionary();
        boolean boolean23 = inflater19.needsInput();
        int int24 = inflater19.getRemaining();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        boolean boolean26 = inflater25.finished();
        int int27 = inflater25.getRemaining();
        boolean boolean28 = inflater25.finished();
        byte[] byteArray35 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater25.setInput(byteArray35);
        int int37 = inflater19.inflate(byteArray35);
        inflater12.setInput(byteArray35);
        inflater7.setInput(byteArray35);
        inflater6.setDictionary(byteArray35);
        inflater0.setInput(byteArray35);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long42 = inflater0.getBytesWritten();
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        long long4 = inflater0.getBytesRead();
        boolean boolean5 = inflater0.finished();
        inflater0.reset();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int8 = inflater0.getTotalIn();
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getRemaining();
        boolean boolean21 = inflater0.finished();
        inflater0.end();
        int int23 = inflater0.getRemaining();
        java.util.zip.Inflater inflater24 = new java.util.zip.Inflater();
        byte[] byteArray26 = new byte[] { (byte) 1 };
        int int27 = inflater24.inflate(byteArray26);
        long long28 = inflater24.getBytesWritten();
        inflater24.reset();
        java.util.zip.Inflater inflater30 = new java.util.zip.Inflater();
        boolean boolean31 = inflater30.finished();
        int int32 = inflater30.getRemaining();
        boolean boolean33 = inflater30.finished();
        byte[] byteArray40 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater30.setInput(byteArray40);
        inflater30.end();
        int int43 = inflater30.getRemaining();
        java.util.zip.Inflater inflater44 = new java.util.zip.Inflater();
        boolean boolean45 = inflater44.finished();
        int int46 = inflater44.getRemaining();
        int int47 = inflater44.getTotalOut();
        inflater44.reset();
        boolean boolean49 = inflater44.needsInput();
        java.util.zip.Inflater inflater50 = new java.util.zip.Inflater();
        boolean boolean51 = inflater50.finished();
        int int52 = inflater50.getRemaining();
        boolean boolean53 = inflater50.needsDictionary();
        long long54 = inflater50.getBytesRead();
        boolean boolean55 = inflater50.needsDictionary();
        java.util.zip.Inflater inflater56 = new java.util.zip.Inflater();
        byte[] byteArray58 = new byte[] { (byte) 1 };
        int int59 = inflater56.inflate(byteArray58);
        long long60 = inflater56.getBytesWritten();
        inflater56.reset();
        long long62 = inflater56.getBytesWritten();
        java.util.zip.Inflater inflater63 = new java.util.zip.Inflater();
        boolean boolean64 = inflater63.finished();
        int int65 = inflater63.getRemaining();
        boolean boolean66 = inflater63.needsDictionary();
        boolean boolean67 = inflater63.needsInput();
        int int68 = inflater63.getRemaining();
        java.util.zip.Inflater inflater69 = new java.util.zip.Inflater();
        boolean boolean70 = inflater69.finished();
        int int71 = inflater69.getRemaining();
        boolean boolean72 = inflater69.finished();
        byte[] byteArray79 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater69.setInput(byteArray79);
        int int81 = inflater63.inflate(byteArray79);
        inflater56.setInput(byteArray79);
        inflater50.setInput(byteArray79);
        int int84 = inflater44.inflate(byteArray79);
        inflater30.setInput(byteArray79, 1, (int) (byte) 0);
        int int88 = inflater24.inflate(byteArray79);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int89 = inflater0.inflate(byteArray79);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        boolean boolean9 = inflater6.finished();
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater6.setInput(byteArray16);
        int int18 = inflater0.inflate(byteArray16);
        java.util.zip.Inflater inflater19 = new java.util.zip.Inflater();
        boolean boolean20 = inflater19.finished();
        int int21 = inflater19.getRemaining();
        boolean boolean22 = inflater19.finished();
        java.util.zip.Inflater inflater23 = new java.util.zip.Inflater();
        boolean boolean24 = inflater23.finished();
        int int25 = inflater23.getRemaining();
        boolean boolean26 = inflater23.finished();
        byte[] byteArray33 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater23.setInput(byteArray33);
        inflater19.setInput(byteArray33);
        inflater0.setInput(byteArray33);
        long long37 = inflater0.getBytesRead();
        inflater0.end();
        boolean boolean39 = inflater0.needsInput();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int41 = inflater0.getAdler();
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        boolean boolean9 = inflater6.finished();
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater6.setInput(byteArray16);
        int int18 = inflater0.inflate(byteArray16);
        boolean boolean19 = inflater0.finished();
        int int20 = inflater0.getTotalOut();
        java.util.zip.Inflater inflater21 = new java.util.zip.Inflater();
        boolean boolean22 = inflater21.finished();
        int int23 = inflater21.getRemaining();
        boolean boolean24 = inflater21.needsDictionary();
        long long25 = inflater21.getBytesRead();
        boolean boolean26 = inflater21.needsDictionary();
        java.util.zip.Inflater inflater27 = new java.util.zip.Inflater();
        byte[] byteArray29 = new byte[] { (byte) 1 };
        int int30 = inflater27.inflate(byteArray29);
        long long31 = inflater27.getBytesWritten();
        inflater27.reset();
        long long33 = inflater27.getBytesWritten();
        java.util.zip.Inflater inflater34 = new java.util.zip.Inflater();
        boolean boolean35 = inflater34.finished();
        int int36 = inflater34.getRemaining();
        boolean boolean37 = inflater34.needsDictionary();
        boolean boolean38 = inflater34.needsInput();
        int int39 = inflater34.getRemaining();
        java.util.zip.Inflater inflater40 = new java.util.zip.Inflater();
        boolean boolean41 = inflater40.finished();
        int int42 = inflater40.getRemaining();
        boolean boolean43 = inflater40.finished();
        byte[] byteArray50 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater40.setInput(byteArray50);
        int int52 = inflater34.inflate(byteArray50);
        inflater27.setInput(byteArray50);
        inflater21.setInput(byteArray50);
        int int55 = inflater0.inflate(byteArray50);
        java.util.zip.Inflater inflater56 = new java.util.zip.Inflater();
        boolean boolean57 = inflater56.finished();
        int int58 = inflater56.getRemaining();
        boolean boolean59 = inflater56.needsInput();
        java.util.zip.Inflater inflater60 = new java.util.zip.Inflater();
        boolean boolean61 = inflater60.finished();
        int int62 = inflater60.getRemaining();
        boolean boolean63 = inflater60.finished();
        byte[] byteArray70 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater60.setInput(byteArray70);
        inflater56.setInput(byteArray70);
        int int73 = inflater0.inflate(byteArray70);
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int75 = inflater0.getTotalOut();
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        long long4 = inflater0.getBytesRead();
        boolean boolean5 = inflater0.needsInput();
        int int6 = inflater0.getTotalOut();
        long long7 = inflater0.getBytesRead();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        boolean boolean9 = inflater8.finished();
        int int10 = inflater8.getRemaining();
        boolean boolean11 = inflater8.needsDictionary();
        boolean boolean12 = inflater8.needsInput();
        int int13 = inflater8.getRemaining();
        inflater8.reset();
        java.util.zip.Inflater inflater15 = new java.util.zip.Inflater();
        boolean boolean16 = inflater15.finished();
        int int17 = inflater15.getRemaining();
        boolean boolean18 = inflater15.finished();
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater15.setInput(byteArray25);
        inflater8.setInput(byteArray25);
        int int30 = inflater0.inflate(byteArray25, 1, (int) (short) 1);
        int int31 = inflater0.getTotalIn();
        boolean boolean32 = inflater0.needsDictionary();
        int int33 = inflater0.getAdler();
        int int34 = inflater0.getRemaining();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long36 = inflater0.getBytesRead();
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getTotalIn();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        int int8 = inflater5.inflate(byteArray7);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int14 = inflater5.inflate(byteArray13);
        int int15 = inflater0.inflate(byteArray13);
        boolean boolean16 = inflater0.finished();
        inflater0.end();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long19 = inflater0.getBytesRead();
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        boolean boolean21 = inflater0.needsDictionary();
        long long22 = inflater0.getBytesWritten();
        int int23 = inflater0.getRemaining();
        int int24 = inflater0.getRemaining();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        byte[] byteArray27 = new byte[] { (byte) 1 };
        int int28 = inflater25.inflate(byteArray27);
        boolean boolean29 = inflater25.finished();
        inflater25.end();
        inflater25.end();
        boolean boolean32 = inflater25.needsDictionary();
        java.util.zip.Inflater inflater33 = new java.util.zip.Inflater();
        boolean boolean34 = inflater33.finished();
        int int35 = inflater33.getRemaining();
        boolean boolean36 = inflater33.needsInput();
        java.util.zip.Inflater inflater37 = new java.util.zip.Inflater();
        boolean boolean38 = inflater37.finished();
        int int39 = inflater37.getRemaining();
        boolean boolean40 = inflater37.finished();
        byte[] byteArray47 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater37.setInput(byteArray47);
        inflater33.setInput(byteArray47);
        inflater25.setInput(byteArray47);
        inflater0.setInput(byteArray47);
        int int52 = inflater0.getRemaining();
        boolean boolean53 = inflater0.needsInput();
        inflater0.end();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        int int2 = inflater0.getTotalOut();
        int int3 = inflater0.getTotalOut();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getTotalIn();
        int int6 = inflater0.getTotalIn();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int8 = inflater0.getTotalIn();
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater0.setInput(byteArray10);
        inflater0.end();
        int int13 = inflater0.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int14 = inflater0.getAdler();
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.reset();
        long long6 = inflater0.getBytesWritten();
        int int7 = inflater0.getTotalIn();
        boolean boolean8 = inflater0.needsDictionary();
        int int9 = inflater0.getTotalIn();
        long long10 = inflater0.getBytesWritten();
        inflater0.end();
        int int12 = inflater0.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int13 = inflater0.getTotalOut();
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsDictionary();
        boolean boolean6 = inflater0.needsDictionary();
        boolean boolean7 = inflater0.needsInput();
        inflater0.end();
        boolean boolean9 = inflater0.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int10 = inflater0.getAdler();
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        inflater0.reset();
        long long5 = inflater0.getBytesWritten();
        boolean boolean6 = inflater0.needsInput();
        int int7 = inflater0.getRemaining();
        boolean boolean8 = inflater0.needsInput();
        boolean boolean9 = inflater0.needsDictionary();
        int int10 = inflater0.getAdler();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getTotalIn();
        int int5 = inflater0.getTotalOut();
        boolean boolean6 = inflater0.needsInput();
        int int7 = inflater0.getTotalOut();
        inflater0.reset();
        inflater0.end();
        boolean boolean10 = inflater0.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int11 = inflater0.getAdler();
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        boolean boolean2 = inflater0.needsInput();
        boolean boolean3 = inflater0.needsInput();
        inflater0.end();
        inflater0.end();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        boolean boolean9 = inflater6.needsDictionary();
        boolean boolean10 = inflater6.needsInput();
        boolean boolean11 = inflater6.needsDictionary();
        boolean boolean12 = inflater6.finished();
        int int13 = inflater6.getTotalIn();
        int int14 = inflater6.getRemaining();
        long long15 = inflater6.getBytesWritten();
        java.util.zip.Inflater inflater16 = new java.util.zip.Inflater();
        byte[] byteArray18 = new byte[] { (byte) 1 };
        int int19 = inflater16.inflate(byteArray18);
        int int20 = inflater16.getTotalIn();
        long long21 = inflater16.getBytesWritten();
        int int22 = inflater16.getTotalIn();
        int int23 = inflater16.getTotalOut();
        int int24 = inflater16.getTotalOut();
        boolean boolean25 = inflater16.needsDictionary();
        int int26 = inflater16.getTotalOut();
        long long27 = inflater16.getBytesRead();
        java.util.zip.Inflater inflater28 = new java.util.zip.Inflater();
        boolean boolean29 = inflater28.finished();
        int int30 = inflater28.getRemaining();
        boolean boolean31 = inflater28.finished();
        int int32 = inflater28.getAdler();
        int int33 = inflater28.getAdler();
        long long34 = inflater28.getBytesWritten();
        long long35 = inflater28.getBytesRead();
        java.util.zip.Inflater inflater36 = new java.util.zip.Inflater();
        byte[] byteArray38 = new byte[] { (byte) 1 };
        int int39 = inflater36.inflate(byteArray38);
        int int40 = inflater36.getAdler();
        java.util.zip.Inflater inflater41 = new java.util.zip.Inflater();
        boolean boolean42 = inflater41.finished();
        int int43 = inflater41.getRemaining();
        boolean boolean44 = inflater41.finished();
        long long45 = inflater41.getBytesRead();
        boolean boolean46 = inflater41.finished();
        long long47 = inflater41.getBytesRead();
        boolean boolean48 = inflater41.needsDictionary();
        boolean boolean49 = inflater41.needsDictionary();
        java.util.zip.Inflater inflater50 = new java.util.zip.Inflater();
        boolean boolean51 = inflater50.needsDictionary();
        int int52 = inflater50.getTotalOut();
        int int53 = inflater50.getTotalOut();
        boolean boolean54 = inflater50.needsInput();
        java.util.zip.Inflater inflater55 = new java.util.zip.Inflater();
        byte[] byteArray57 = new byte[] { (byte) 1 };
        int int58 = inflater55.inflate(byteArray57);
        inflater55.reset();
        java.util.zip.Inflater inflater60 = new java.util.zip.Inflater();
        byte[] byteArray62 = new byte[] { (byte) 1 };
        int int63 = inflater60.inflate(byteArray62);
        int int64 = inflater60.getTotalIn();
        java.util.zip.Inflater inflater65 = new java.util.zip.Inflater();
        byte[] byteArray67 = new byte[] { (byte) 1 };
        int int68 = inflater65.inflate(byteArray67);
        byte[] byteArray73 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int74 = inflater65.inflate(byteArray73);
        int int75 = inflater60.inflate(byteArray73);
        inflater55.setInput(byteArray73);
        inflater50.setInput(byteArray73);
        int int78 = inflater41.inflate(byteArray73);
        inflater36.setInput(byteArray73);
        int int80 = inflater28.inflate(byteArray73);
        inflater16.setInput(byteArray73);
        int int82 = inflater6.inflate(byteArray73);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int83 = inflater0.inflate(byteArray73);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsDictionary();
        boolean boolean6 = inflater0.needsDictionary();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long8 = inflater0.getBytesWritten();
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        boolean boolean4 = inflater0.finished();
        int int5 = inflater0.getRemaining();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        byte[] byteArray8 = new byte[] { (byte) 1 };
        int int9 = inflater6.inflate(byteArray8);
        int int10 = inflater6.getAdler();
        boolean boolean11 = inflater6.finished();
        long long12 = inflater6.getBytesWritten();
        java.util.zip.Inflater inflater13 = new java.util.zip.Inflater();
        boolean boolean14 = inflater13.finished();
        boolean boolean15 = inflater13.needsInput();
        boolean boolean16 = inflater13.needsInput();
        java.util.zip.Inflater inflater17 = new java.util.zip.Inflater();
        boolean boolean18 = inflater17.finished();
        int int19 = inflater17.getRemaining();
        boolean boolean20 = inflater17.needsDictionary();
        long long21 = inflater17.getBytesRead();
        boolean boolean22 = inflater17.needsDictionary();
        java.util.zip.Inflater inflater23 = new java.util.zip.Inflater();
        byte[] byteArray25 = new byte[] { (byte) 1 };
        int int26 = inflater23.inflate(byteArray25);
        long long27 = inflater23.getBytesWritten();
        inflater23.reset();
        long long29 = inflater23.getBytesWritten();
        java.util.zip.Inflater inflater30 = new java.util.zip.Inflater();
        boolean boolean31 = inflater30.finished();
        int int32 = inflater30.getRemaining();
        boolean boolean33 = inflater30.needsDictionary();
        boolean boolean34 = inflater30.needsInput();
        int int35 = inflater30.getRemaining();
        java.util.zip.Inflater inflater36 = new java.util.zip.Inflater();
        boolean boolean37 = inflater36.finished();
        int int38 = inflater36.getRemaining();
        boolean boolean39 = inflater36.finished();
        byte[] byteArray46 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater36.setInput(byteArray46);
        int int48 = inflater30.inflate(byteArray46);
        inflater23.setInput(byteArray46);
        inflater17.setInput(byteArray46);
        int int51 = inflater13.inflate(byteArray46);
        int int52 = inflater6.inflate(byteArray46);
        inflater0.setInput(byteArray46);
        inflater0.reset();
        inflater0.end();
        java.util.zip.Inflater inflater56 = new java.util.zip.Inflater();
        boolean boolean57 = inflater56.finished();
        int int58 = inflater56.getRemaining();
        boolean boolean59 = inflater56.needsDictionary();
        boolean boolean60 = inflater56.needsInput();
        boolean boolean61 = inflater56.needsDictionary();
        int int62 = inflater56.getRemaining();
        boolean boolean63 = inflater56.needsDictionary();
        java.util.zip.Inflater inflater64 = new java.util.zip.Inflater();
        boolean boolean65 = inflater64.finished();
        int int66 = inflater64.getRemaining();
        boolean boolean67 = inflater64.finished();
        long long68 = inflater64.getBytesRead();
        boolean boolean69 = inflater64.finished();
        long long70 = inflater64.getBytesRead();
        boolean boolean71 = inflater64.needsDictionary();
        boolean boolean72 = inflater64.needsDictionary();
        java.util.zip.Inflater inflater73 = new java.util.zip.Inflater();
        byte[] byteArray75 = new byte[] { (byte) 1 };
        int int76 = inflater73.inflate(byteArray75);
        long long77 = inflater73.getBytesWritten();
        boolean boolean78 = inflater73.needsInput();
        boolean boolean79 = inflater73.finished();
        java.util.zip.Inflater inflater80 = new java.util.zip.Inflater();
        boolean boolean81 = inflater80.finished();
        int int82 = inflater80.getRemaining();
        boolean boolean83 = inflater80.finished();
        byte[] byteArray90 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater80.setInput(byteArray90);
        inflater73.setInput(byteArray90);
        int int93 = inflater64.inflate(byteArray90);
        int int94 = inflater56.inflate(byteArray90);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        inflater0.setDictionary(byteArray90);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        boolean boolean2 = inflater0.needsInput();
        long long3 = inflater0.getBytesWritten();
        java.util.zip.Inflater inflater4 = new java.util.zip.Inflater();
        boolean boolean5 = inflater4.finished();
        int int6 = inflater4.getRemaining();
        boolean boolean7 = inflater4.finished();
        int int8 = inflater4.getAdler();
        inflater4.reset();
        boolean boolean10 = inflater4.needsInput();
        java.util.zip.Inflater inflater11 = new java.util.zip.Inflater();
        boolean boolean12 = inflater11.finished();
        int int13 = inflater11.getRemaining();
        inflater11.end();
        boolean boolean15 = inflater11.needsInput();
        java.util.zip.Inflater inflater16 = new java.util.zip.Inflater();
        boolean boolean17 = inflater16.finished();
        int int18 = inflater16.getRemaining();
        boolean boolean19 = inflater16.needsDictionary();
        long long20 = inflater16.getBytesRead();
        boolean boolean21 = inflater16.needsInput();
        java.util.zip.Inflater inflater22 = new java.util.zip.Inflater();
        byte[] byteArray24 = new byte[] { (byte) 1 };
        int int25 = inflater22.inflate(byteArray24);
        long long26 = inflater22.getBytesWritten();
        inflater22.reset();
        long long28 = inflater22.getBytesWritten();
        java.util.zip.Inflater inflater29 = new java.util.zip.Inflater();
        boolean boolean30 = inflater29.finished();
        int int31 = inflater29.getRemaining();
        boolean boolean32 = inflater29.needsDictionary();
        boolean boolean33 = inflater29.needsInput();
        int int34 = inflater29.getRemaining();
        java.util.zip.Inflater inflater35 = new java.util.zip.Inflater();
        boolean boolean36 = inflater35.finished();
        int int37 = inflater35.getRemaining();
        boolean boolean38 = inflater35.finished();
        byte[] byteArray45 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater35.setInput(byteArray45);
        int int47 = inflater29.inflate(byteArray45);
        inflater22.setInput(byteArray45);
        int int49 = inflater16.inflate(byteArray45);
        inflater11.setInput(byteArray45);
        inflater4.setInput(byteArray45);
        int int52 = inflater0.inflate(byteArray45);
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long54 = inflater0.getBytesRead();
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        int int2 = inflater0.getTotalOut();
        int int3 = inflater0.getTotalOut();
        int int4 = inflater0.getTotalIn();
        boolean boolean5 = inflater0.needsDictionary();
        int int6 = inflater0.getAdler();
        long long7 = inflater0.getBytesRead();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int9 = inflater0.getTotalOut();
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsDictionary();
        boolean boolean6 = inflater0.needsDictionary();
        int int7 = inflater0.getTotalOut();
        inflater0.reset();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int10 = inflater0.getAdler();
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        int int3 = inflater0.getTotalOut();
        inflater0.reset();
        boolean boolean5 = inflater0.needsInput();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        boolean boolean9 = inflater6.needsDictionary();
        long long10 = inflater6.getBytesRead();
        boolean boolean11 = inflater6.needsDictionary();
        java.util.zip.Inflater inflater12 = new java.util.zip.Inflater();
        byte[] byteArray14 = new byte[] { (byte) 1 };
        int int15 = inflater12.inflate(byteArray14);
        long long16 = inflater12.getBytesWritten();
        inflater12.reset();
        long long18 = inflater12.getBytesWritten();
        java.util.zip.Inflater inflater19 = new java.util.zip.Inflater();
        boolean boolean20 = inflater19.finished();
        int int21 = inflater19.getRemaining();
        boolean boolean22 = inflater19.needsDictionary();
        boolean boolean23 = inflater19.needsInput();
        int int24 = inflater19.getRemaining();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        boolean boolean26 = inflater25.finished();
        int int27 = inflater25.getRemaining();
        boolean boolean28 = inflater25.finished();
        byte[] byteArray35 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater25.setInput(byteArray35);
        int int37 = inflater19.inflate(byteArray35);
        inflater12.setInput(byteArray35);
        inflater6.setInput(byteArray35);
        int int40 = inflater0.inflate(byteArray35);
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        long long4 = inflater0.getBytesRead();
        boolean boolean5 = inflater0.finished();
        long long6 = inflater0.getBytesRead();
        boolean boolean7 = inflater0.needsDictionary();
        int int8 = inflater0.getRemaining();
        inflater0.end();
        int int10 = inflater0.getRemaining();
        boolean boolean11 = inflater0.finished();
        boolean boolean12 = inflater0.finished();
        boolean boolean13 = inflater0.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int14 = inflater0.getTotalIn();
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        boolean boolean4 = inflater0.finished();
        int int5 = inflater0.getRemaining();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        byte[] byteArray8 = new byte[] { (byte) 1 };
        int int9 = inflater6.inflate(byteArray8);
        int int10 = inflater6.getAdler();
        boolean boolean11 = inflater6.finished();
        long long12 = inflater6.getBytesWritten();
        java.util.zip.Inflater inflater13 = new java.util.zip.Inflater();
        boolean boolean14 = inflater13.finished();
        boolean boolean15 = inflater13.needsInput();
        boolean boolean16 = inflater13.needsInput();
        java.util.zip.Inflater inflater17 = new java.util.zip.Inflater();
        boolean boolean18 = inflater17.finished();
        int int19 = inflater17.getRemaining();
        boolean boolean20 = inflater17.needsDictionary();
        long long21 = inflater17.getBytesRead();
        boolean boolean22 = inflater17.needsDictionary();
        java.util.zip.Inflater inflater23 = new java.util.zip.Inflater();
        byte[] byteArray25 = new byte[] { (byte) 1 };
        int int26 = inflater23.inflate(byteArray25);
        long long27 = inflater23.getBytesWritten();
        inflater23.reset();
        long long29 = inflater23.getBytesWritten();
        java.util.zip.Inflater inflater30 = new java.util.zip.Inflater();
        boolean boolean31 = inflater30.finished();
        int int32 = inflater30.getRemaining();
        boolean boolean33 = inflater30.needsDictionary();
        boolean boolean34 = inflater30.needsInput();
        int int35 = inflater30.getRemaining();
        java.util.zip.Inflater inflater36 = new java.util.zip.Inflater();
        boolean boolean37 = inflater36.finished();
        int int38 = inflater36.getRemaining();
        boolean boolean39 = inflater36.finished();
        byte[] byteArray46 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater36.setInput(byteArray46);
        int int48 = inflater30.inflate(byteArray46);
        inflater23.setInput(byteArray46);
        inflater17.setInput(byteArray46);
        int int51 = inflater13.inflate(byteArray46);
        int int52 = inflater6.inflate(byteArray46);
        inflater0.setInput(byteArray46);
        inflater0.reset();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long56 = inflater0.getBytesRead();
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getAdler();
        boolean boolean5 = inflater0.finished();
        long long6 = inflater0.getBytesWritten();
        inflater0.end();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        boolean boolean9 = inflater8.finished();
        int int10 = inflater8.getRemaining();
        int int11 = inflater8.getTotalOut();
        inflater8.reset();
        boolean boolean13 = inflater8.needsInput();
        long long14 = inflater8.getBytesRead();
        int int15 = inflater8.getTotalOut();
        java.util.zip.Inflater inflater16 = new java.util.zip.Inflater();
        boolean boolean17 = inflater16.finished();
        int int18 = inflater16.getRemaining();
        boolean boolean19 = inflater16.needsDictionary();
        boolean boolean20 = inflater16.needsInput();
        int int21 = inflater16.getRemaining();
        java.util.zip.Inflater inflater22 = new java.util.zip.Inflater();
        boolean boolean23 = inflater22.finished();
        int int24 = inflater22.getRemaining();
        boolean boolean25 = inflater22.finished();
        byte[] byteArray32 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater22.setInput(byteArray32);
        int int34 = inflater16.inflate(byteArray32);
        boolean boolean35 = inflater16.finished();
        int int36 = inflater16.getTotalIn();
        java.util.zip.Inflater inflater37 = new java.util.zip.Inflater();
        boolean boolean38 = inflater37.finished();
        int int39 = inflater37.getRemaining();
        boolean boolean40 = inflater37.needsDictionary();
        boolean boolean41 = inflater37.needsInput();
        int int42 = inflater37.getRemaining();
        inflater37.reset();
        boolean boolean44 = inflater37.needsDictionary();
        int int45 = inflater37.getTotalIn();
        java.util.zip.Inflater inflater46 = new java.util.zip.Inflater();
        boolean boolean47 = inflater46.finished();
        int int48 = inflater46.getRemaining();
        boolean boolean49 = inflater46.needsDictionary();
        boolean boolean50 = inflater46.needsInput();
        int int51 = inflater46.getRemaining();
        inflater46.reset();
        java.util.zip.Inflater inflater53 = new java.util.zip.Inflater();
        boolean boolean54 = inflater53.finished();
        int int55 = inflater53.getRemaining();
        boolean boolean56 = inflater53.needsDictionary();
        boolean boolean57 = inflater53.needsInput();
        int int58 = inflater53.getRemaining();
        inflater53.reset();
        java.util.zip.Inflater inflater60 = new java.util.zip.Inflater();
        boolean boolean61 = inflater60.finished();
        int int62 = inflater60.getRemaining();
        boolean boolean63 = inflater60.finished();
        byte[] byteArray70 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater60.setInput(byteArray70);
        inflater53.setInput(byteArray70);
        int int75 = inflater46.inflate(byteArray70, 0, (int) (byte) 0);
        int int76 = inflater37.inflate(byteArray70);
        int int77 = inflater16.inflate(byteArray70);
        int int78 = inflater8.inflate(byteArray70);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int79 = inflater0.inflate(byteArray70);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsDictionary();
        inflater0.reset();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int8 = inflater0.getAdler();
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        inflater0.reset();
        long long5 = inflater0.getBytesWritten();
        int int6 = inflater0.getRemaining();
        inflater0.reset();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long9 = inflater0.getBytesRead();
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        java.util.zip.Inflater inflater4 = new java.util.zip.Inflater();
        boolean boolean5 = inflater4.finished();
        int int6 = inflater4.getRemaining();
        boolean boolean7 = inflater4.finished();
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater4.setInput(byteArray14);
        inflater0.setInput(byteArray14);
        boolean boolean17 = inflater0.needsDictionary();
        boolean boolean18 = inflater0.finished();
        int int19 = inflater0.getRemaining();
        java.util.zip.Inflater inflater20 = new java.util.zip.Inflater();
        byte[] byteArray22 = new byte[] { (byte) 1 };
        int int23 = inflater20.inflate(byteArray22);
        long long24 = inflater20.getBytesWritten();
        inflater20.reset();
        int int26 = inflater20.getRemaining();
        inflater20.reset();
        int int28 = inflater20.getTotalOut();
        int int29 = inflater20.getRemaining();
        inflater20.end();
        java.util.zip.Inflater inflater31 = new java.util.zip.Inflater();
        boolean boolean32 = inflater31.needsDictionary();
        inflater31.reset();
        java.util.zip.Inflater inflater34 = new java.util.zip.Inflater();
        boolean boolean35 = inflater34.finished();
        int int36 = inflater34.getRemaining();
        boolean boolean37 = inflater34.finished();
        long long38 = inflater34.getBytesRead();
        int int39 = inflater34.getTotalOut();
        int int40 = inflater34.getAdler();
        java.util.zip.Inflater inflater42 = new java.util.zip.Inflater(true);
        int int43 = inflater42.getRemaining();
        long long44 = inflater42.getBytesRead();
        java.util.zip.Inflater inflater45 = new java.util.zip.Inflater();
        byte[] byteArray47 = new byte[] { (byte) 1 };
        int int48 = inflater45.inflate(byteArray47);
        int int49 = inflater42.inflate(byteArray47);
        int int52 = inflater34.inflate(byteArray47, (int) (short) 1, (int) (short) 0);
        inflater31.setInput(byteArray47);
        inflater20.setInput(byteArray47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        inflater0.setDictionary(byteArray47);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getTotalIn();
        int int5 = inflater0.getTotalOut();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long7 = inflater0.getBytesWritten();
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        int int2 = inflater0.getTotalOut();
        int int3 = inflater0.getTotalOut();
        int int4 = inflater0.getTotalIn();
        long long5 = inflater0.getBytesWritten();
        boolean boolean6 = inflater0.needsInput();
        long long7 = inflater0.getBytesWritten();
        int int8 = inflater0.getTotalOut();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long10 = inflater0.getBytesRead();
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(true);
        inflater1.end();
        java.util.zip.Inflater inflater3 = new java.util.zip.Inflater();
        boolean boolean4 = inflater3.finished();
        int int5 = inflater3.getRemaining();
        boolean boolean6 = inflater3.needsDictionary();
        boolean boolean7 = inflater3.needsInput();
        int int8 = inflater3.getRemaining();
        inflater3.reset();
        java.util.zip.Inflater inflater10 = new java.util.zip.Inflater();
        boolean boolean11 = inflater10.finished();
        int int12 = inflater10.getRemaining();
        boolean boolean13 = inflater10.finished();
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater10.setInput(byteArray20);
        inflater3.setInput(byteArray20);
        inflater1.setInput(byteArray20);
        int int24 = inflater1.getRemaining();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        byte[] byteArray27 = new byte[] { (byte) 1 };
        int int28 = inflater25.inflate(byteArray27);
        byte[] byteArray33 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int34 = inflater25.inflate(byteArray33);
        boolean boolean35 = inflater25.finished();
        long long36 = inflater25.getBytesWritten();
        boolean boolean37 = inflater25.needsInput();
        java.util.zip.Inflater inflater38 = new java.util.zip.Inflater();
        boolean boolean39 = inflater38.needsDictionary();
        int int40 = inflater38.getTotalOut();
        int int41 = inflater38.getAdler();
        int int42 = inflater38.getTotalIn();
        int int43 = inflater38.getAdler();
        int int44 = inflater38.getRemaining();
        java.util.zip.Inflater inflater45 = new java.util.zip.Inflater();
        boolean boolean46 = inflater45.needsDictionary();
        int int47 = inflater45.getTotalOut();
        int int48 = inflater45.getTotalOut();
        long long49 = inflater45.getBytesWritten();
        java.util.zip.Inflater inflater50 = new java.util.zip.Inflater();
        boolean boolean51 = inflater50.finished();
        int int52 = inflater50.getRemaining();
        boolean boolean53 = inflater50.needsDictionary();
        long long54 = inflater50.getBytesRead();
        boolean boolean55 = inflater50.needsDictionary();
        java.util.zip.Inflater inflater56 = new java.util.zip.Inflater();
        byte[] byteArray58 = new byte[] { (byte) 1 };
        int int59 = inflater56.inflate(byteArray58);
        long long60 = inflater56.getBytesWritten();
        inflater56.reset();
        long long62 = inflater56.getBytesWritten();
        java.util.zip.Inflater inflater63 = new java.util.zip.Inflater();
        boolean boolean64 = inflater63.finished();
        int int65 = inflater63.getRemaining();
        boolean boolean66 = inflater63.needsDictionary();
        boolean boolean67 = inflater63.needsInput();
        int int68 = inflater63.getRemaining();
        java.util.zip.Inflater inflater69 = new java.util.zip.Inflater();
        boolean boolean70 = inflater69.finished();
        int int71 = inflater69.getRemaining();
        boolean boolean72 = inflater69.finished();
        byte[] byteArray79 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater69.setInput(byteArray79);
        int int81 = inflater63.inflate(byteArray79);
        inflater56.setInput(byteArray79);
        inflater50.setInput(byteArray79);
        int int84 = inflater45.inflate(byteArray79);
        int int85 = inflater38.inflate(byteArray79);
        int int86 = inflater25.inflate(byteArray79);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        inflater1.setDictionary(byteArray79);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        boolean boolean21 = inflater0.finished();
        inflater0.reset();
        java.util.zip.Inflater inflater23 = new java.util.zip.Inflater();
        boolean boolean24 = inflater23.needsDictionary();
        int int25 = inflater23.getTotalOut();
        boolean boolean26 = inflater23.finished();
        boolean boolean27 = inflater23.needsDictionary();
        java.util.zip.Inflater inflater28 = new java.util.zip.Inflater();
        boolean boolean29 = inflater28.finished();
        boolean boolean30 = inflater28.needsInput();
        boolean boolean31 = inflater28.needsInput();
        java.util.zip.Inflater inflater32 = new java.util.zip.Inflater();
        boolean boolean33 = inflater32.finished();
        int int34 = inflater32.getRemaining();
        boolean boolean35 = inflater32.needsDictionary();
        long long36 = inflater32.getBytesRead();
        boolean boolean37 = inflater32.needsDictionary();
        java.util.zip.Inflater inflater38 = new java.util.zip.Inflater();
        byte[] byteArray40 = new byte[] { (byte) 1 };
        int int41 = inflater38.inflate(byteArray40);
        long long42 = inflater38.getBytesWritten();
        inflater38.reset();
        long long44 = inflater38.getBytesWritten();
        java.util.zip.Inflater inflater45 = new java.util.zip.Inflater();
        boolean boolean46 = inflater45.finished();
        int int47 = inflater45.getRemaining();
        boolean boolean48 = inflater45.needsDictionary();
        boolean boolean49 = inflater45.needsInput();
        int int50 = inflater45.getRemaining();
        java.util.zip.Inflater inflater51 = new java.util.zip.Inflater();
        boolean boolean52 = inflater51.finished();
        int int53 = inflater51.getRemaining();
        boolean boolean54 = inflater51.finished();
        byte[] byteArray61 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater51.setInput(byteArray61);
        int int63 = inflater45.inflate(byteArray61);
        inflater38.setInput(byteArray61);
        inflater32.setInput(byteArray61);
        int int66 = inflater28.inflate(byteArray61);
        int int67 = inflater23.inflate(byteArray61);
        inflater0.setInput(byteArray61);
        int int69 = inflater0.getAdler();
        int int70 = inflater0.getAdler();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long72 = inflater0.getBytesRead();
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getAdler();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        boolean boolean6 = inflater5.finished();
        int int7 = inflater5.getRemaining();
        boolean boolean8 = inflater5.needsInput();
        java.util.zip.Inflater inflater9 = new java.util.zip.Inflater();
        boolean boolean10 = inflater9.finished();
        int int11 = inflater9.getRemaining();
        boolean boolean12 = inflater9.finished();
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater9.setInput(byteArray19);
        inflater5.setInput(byteArray19);
        inflater0.setInput(byteArray19);
        boolean boolean23 = inflater0.needsInput();
        boolean boolean24 = inflater0.finished();
        inflater0.end();
        java.util.zip.Inflater inflater26 = new java.util.zip.Inflater();
        boolean boolean27 = inflater26.finished();
        int int28 = inflater26.getRemaining();
        int int29 = inflater26.getTotalOut();
        byte[] byteArray32 = new byte[] { (byte) -1, (byte) -1 };
        inflater26.setInput(byteArray32);
        inflater26.reset();
        boolean boolean35 = inflater26.finished();
        java.util.zip.Inflater inflater37 = new java.util.zip.Inflater(true);
        java.util.zip.Inflater inflater38 = new java.util.zip.Inflater();
        byte[] byteArray40 = new byte[] { (byte) 1 };
        int int41 = inflater38.inflate(byteArray40);
        inflater38.reset();
        java.util.zip.Inflater inflater43 = new java.util.zip.Inflater();
        byte[] byteArray45 = new byte[] { (byte) 1 };
        int int46 = inflater43.inflate(byteArray45);
        long long47 = inflater43.getBytesWritten();
        inflater43.reset();
        long long49 = inflater43.getBytesWritten();
        java.util.zip.Inflater inflater50 = new java.util.zip.Inflater();
        boolean boolean51 = inflater50.finished();
        int int52 = inflater50.getRemaining();
        boolean boolean53 = inflater50.needsDictionary();
        boolean boolean54 = inflater50.needsInput();
        int int55 = inflater50.getRemaining();
        java.util.zip.Inflater inflater56 = new java.util.zip.Inflater();
        boolean boolean57 = inflater56.finished();
        int int58 = inflater56.getRemaining();
        boolean boolean59 = inflater56.finished();
        byte[] byteArray66 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater56.setInput(byteArray66);
        int int68 = inflater50.inflate(byteArray66);
        inflater43.setInput(byteArray66);
        inflater38.setInput(byteArray66);
        inflater37.setDictionary(byteArray66);
        int int72 = inflater26.inflate(byteArray66);
        inflater0.setInput(byteArray66);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        inflater0.reset();
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(false);
        int int2 = inflater1.getAdler();
        long long3 = inflater1.getBytesWritten();
        inflater1.end();
        boolean boolean5 = inflater1.needsDictionary();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int6 = inflater1.getTotalIn();
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        boolean boolean4 = inflater0.finished();
        int int5 = inflater0.getRemaining();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        byte[] byteArray8 = new byte[] { (byte) 1 };
        int int9 = inflater6.inflate(byteArray8);
        inflater6.reset();
        java.util.zip.Inflater inflater11 = new java.util.zip.Inflater();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        int int14 = inflater11.inflate(byteArray13);
        int int15 = inflater11.getTotalIn();
        java.util.zip.Inflater inflater16 = new java.util.zip.Inflater();
        byte[] byteArray18 = new byte[] { (byte) 1 };
        int int19 = inflater16.inflate(byteArray18);
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int25 = inflater16.inflate(byteArray24);
        int int26 = inflater11.inflate(byteArray24);
        inflater6.setInput(byteArray24);
        inflater0.setInput(byteArray24);
        long long29 = inflater0.getBytesWritten();
        int int30 = inflater0.getTotalOut();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int32 = inflater0.getAdler();
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsDictionary();
        boolean boolean6 = inflater0.finished();
        int int7 = inflater0.getTotalIn();
        int int8 = inflater0.getRemaining();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long10 = inflater0.getBytesRead();
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        int int8 = inflater5.inflate(byteArray7);
        inflater0.setInput(byteArray7);
        int int10 = inflater0.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int11 = inflater0.getAdler();
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        long long4 = inflater0.getBytesRead();
        boolean boolean5 = inflater0.needsInput();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        byte[] byteArray8 = new byte[] { (byte) 1 };
        int int9 = inflater6.inflate(byteArray8);
        long long10 = inflater6.getBytesWritten();
        inflater6.reset();
        long long12 = inflater6.getBytesWritten();
        java.util.zip.Inflater inflater13 = new java.util.zip.Inflater();
        boolean boolean14 = inflater13.finished();
        int int15 = inflater13.getRemaining();
        boolean boolean16 = inflater13.needsDictionary();
        boolean boolean17 = inflater13.needsInput();
        int int18 = inflater13.getRemaining();
        java.util.zip.Inflater inflater19 = new java.util.zip.Inflater();
        boolean boolean20 = inflater19.finished();
        int int21 = inflater19.getRemaining();
        boolean boolean22 = inflater19.finished();
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater19.setInput(byteArray29);
        int int31 = inflater13.inflate(byteArray29);
        inflater6.setInput(byteArray29);
        int int33 = inflater0.inflate(byteArray29);
        boolean boolean34 = inflater0.finished();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long36 = inflater0.getBytesRead();
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(true);
        int int2 = inflater1.getRemaining();
        long long3 = inflater1.getBytesRead();
        java.util.zip.Inflater inflater4 = new java.util.zip.Inflater();
        byte[] byteArray6 = new byte[] { (byte) 1 };
        int int7 = inflater4.inflate(byteArray6);
        int int8 = inflater1.inflate(byteArray6);
        int int9 = inflater1.getAdler();
        java.util.zip.Inflater inflater10 = new java.util.zip.Inflater();
        byte[] byteArray12 = new byte[] { (byte) 1 };
        int int13 = inflater10.inflate(byteArray12);
        int int14 = inflater10.getTotalIn();
        int int15 = inflater10.getTotalIn();
        java.util.zip.Inflater inflater16 = new java.util.zip.Inflater();
        boolean boolean17 = inflater16.finished();
        int int18 = inflater16.getRemaining();
        boolean boolean19 = inflater16.finished();
        long long20 = inflater16.getBytesRead();
        boolean boolean21 = inflater16.finished();
        long long22 = inflater16.getBytesRead();
        boolean boolean23 = inflater16.needsDictionary();
        boolean boolean24 = inflater16.needsDictionary();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        boolean boolean26 = inflater25.needsDictionary();
        int int27 = inflater25.getTotalOut();
        int int28 = inflater25.getTotalOut();
        boolean boolean29 = inflater25.needsInput();
        java.util.zip.Inflater inflater30 = new java.util.zip.Inflater();
        byte[] byteArray32 = new byte[] { (byte) 1 };
        int int33 = inflater30.inflate(byteArray32);
        inflater30.reset();
        java.util.zip.Inflater inflater35 = new java.util.zip.Inflater();
        byte[] byteArray37 = new byte[] { (byte) 1 };
        int int38 = inflater35.inflate(byteArray37);
        int int39 = inflater35.getTotalIn();
        java.util.zip.Inflater inflater40 = new java.util.zip.Inflater();
        byte[] byteArray42 = new byte[] { (byte) 1 };
        int int43 = inflater40.inflate(byteArray42);
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int49 = inflater40.inflate(byteArray48);
        int int50 = inflater35.inflate(byteArray48);
        inflater30.setInput(byteArray48);
        inflater25.setInput(byteArray48);
        int int53 = inflater16.inflate(byteArray48);
        inflater10.setInput(byteArray48);
        inflater1.setDictionary(byteArray48);
        int int56 = inflater1.getAdler();
        long long57 = inflater1.getBytesWritten();
        inflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int59 = inflater1.getAdler();
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.reset();
        int int6 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean8 = inflater0.needsDictionary();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int9 = inflater0.getTotalIn();
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(true);
        inflater1.end();
        int int3 = inflater1.getRemaining();
        boolean boolean4 = inflater1.finished();
        int int5 = inflater1.getRemaining();
        inflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long7 = inflater1.getBytesRead();
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        boolean boolean21 = inflater0.needsDictionary();
        long long22 = inflater0.getBytesWritten();
        boolean boolean23 = inflater0.needsDictionary();
        long long24 = inflater0.getBytesWritten();
        boolean boolean25 = inflater0.needsInput();
        inflater0.end();
        java.util.zip.Inflater inflater27 = new java.util.zip.Inflater();
        boolean boolean28 = inflater27.finished();
        int int29 = inflater27.getRemaining();
        boolean boolean30 = inflater27.needsDictionary();
        boolean boolean31 = inflater27.needsInput();
        int int32 = inflater27.getRemaining();
        inflater27.reset();
        boolean boolean34 = inflater27.needsDictionary();
        int int35 = inflater27.getTotalOut();
        java.util.zip.Inflater inflater36 = new java.util.zip.Inflater();
        byte[] byteArray38 = new byte[] { (byte) 1 };
        int int39 = inflater36.inflate(byteArray38);
        boolean boolean40 = inflater36.finished();
        inflater36.end();
        inflater36.end();
        boolean boolean43 = inflater36.needsInput();
        java.util.zip.Inflater inflater44 = new java.util.zip.Inflater();
        boolean boolean45 = inflater44.finished();
        int int46 = inflater44.getRemaining();
        boolean boolean47 = inflater44.needsDictionary();
        boolean boolean48 = inflater44.needsInput();
        int int49 = inflater44.getRemaining();
        java.util.zip.Inflater inflater50 = new java.util.zip.Inflater();
        boolean boolean51 = inflater50.finished();
        int int52 = inflater50.getRemaining();
        boolean boolean53 = inflater50.finished();
        byte[] byteArray60 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater50.setInput(byteArray60);
        int int62 = inflater44.inflate(byteArray60);
        boolean boolean63 = inflater44.finished();
        int int64 = inflater44.getAdler();
        boolean boolean65 = inflater44.finished();
        int int66 = inflater44.getAdler();
        boolean boolean67 = inflater44.needsInput();
        java.util.zip.Inflater inflater68 = new java.util.zip.Inflater();
        byte[] byteArray70 = new byte[] { (byte) 1 };
        int int71 = inflater68.inflate(byteArray70);
        int int72 = inflater68.getTotalIn();
        java.util.zip.Inflater inflater73 = new java.util.zip.Inflater();
        byte[] byteArray75 = new byte[] { (byte) 1 };
        int int76 = inflater73.inflate(byteArray75);
        byte[] byteArray81 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int82 = inflater73.inflate(byteArray81);
        int int83 = inflater68.inflate(byteArray81);
        int int84 = inflater44.inflate(byteArray81);
        inflater36.setInput(byteArray81, (int) (byte) 0, (int) (short) 1);
        int int88 = inflater27.inflate(byteArray81);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int89 = inflater0.inflate(byteArray81);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getRemaining();
        boolean boolean21 = inflater0.finished();
        inflater0.end();
        inflater0.end();
        boolean boolean24 = inflater0.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsDictionary();
        inflater0.reset();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long8 = inflater0.getBytesWritten();
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsDictionary();
        boolean boolean6 = inflater0.needsDictionary();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long7 = inflater0.getBytesRead();
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int9 = inflater0.inflate(byteArray8);
        int int10 = inflater0.getTotalIn();
        int int11 = inflater0.getRemaining();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int13 = inflater0.getTotalOut();
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater0.setInput(byteArray10);
        boolean boolean12 = inflater0.needsInput();
        boolean boolean13 = inflater0.needsDictionary();
        boolean boolean14 = inflater0.needsInput();
        inflater0.reset();
        long long16 = inflater0.getBytesRead();
        long long17 = inflater0.getBytesWritten();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int19 = inflater0.getTotalOut();
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        int int2 = inflater0.getTotalOut();
        int int3 = inflater0.getTotalOut();
        int int4 = inflater0.getAdler();
        boolean boolean5 = inflater0.needsDictionary();
        int int6 = inflater0.getTotalOut();
        int int7 = inflater0.getTotalOut();
        boolean boolean8 = inflater0.needsInput();
        int int9 = inflater0.getTotalIn();
        int int10 = inflater0.getRemaining();
        inflater0.reset();
        boolean boolean12 = inflater0.finished();
        inflater0.end();
        boolean boolean14 = inflater0.finished();
        java.util.zip.Inflater inflater15 = new java.util.zip.Inflater();
        boolean boolean16 = inflater15.finished();
        int int17 = inflater15.getRemaining();
        boolean boolean18 = inflater15.needsDictionary();
        long long19 = inflater15.getBytesRead();
        boolean boolean20 = inflater15.needsInput();
        int int21 = inflater15.getTotalOut();
        long long22 = inflater15.getBytesWritten();
        java.util.zip.Inflater inflater23 = new java.util.zip.Inflater();
        boolean boolean24 = inflater23.finished();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        byte[] byteArray27 = new byte[] { (byte) 1 };
        int int28 = inflater25.inflate(byteArray27);
        int int29 = inflater25.getTotalIn();
        java.util.zip.Inflater inflater30 = new java.util.zip.Inflater();
        boolean boolean31 = inflater30.finished();
        int int32 = inflater30.getRemaining();
        inflater30.end();
        boolean boolean34 = inflater30.needsInput();
        java.util.zip.Inflater inflater35 = new java.util.zip.Inflater();
        byte[] byteArray37 = new byte[] { (byte) 1 };
        int int38 = inflater35.inflate(byteArray37);
        inflater30.setInput(byteArray37);
        inflater25.setInput(byteArray37);
        inflater23.setInput(byteArray37);
        int int42 = inflater15.inflate(byteArray37);
        int int43 = inflater15.getAdler();
        java.util.zip.Inflater inflater44 = new java.util.zip.Inflater();
        boolean boolean45 = inflater44.finished();
        int int46 = inflater44.getRemaining();
        boolean boolean47 = inflater44.finished();
        long long48 = inflater44.getBytesRead();
        boolean boolean49 = inflater44.finished();
        long long50 = inflater44.getBytesRead();
        boolean boolean51 = inflater44.needsDictionary();
        boolean boolean52 = inflater44.needsDictionary();
        java.util.zip.Inflater inflater53 = new java.util.zip.Inflater();
        byte[] byteArray55 = new byte[] { (byte) 1 };
        int int56 = inflater53.inflate(byteArray55);
        long long57 = inflater53.getBytesWritten();
        boolean boolean58 = inflater53.needsInput();
        boolean boolean59 = inflater53.finished();
        java.util.zip.Inflater inflater60 = new java.util.zip.Inflater();
        boolean boolean61 = inflater60.finished();
        int int62 = inflater60.getRemaining();
        boolean boolean63 = inflater60.finished();
        byte[] byteArray70 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater60.setInput(byteArray70);
        inflater53.setInput(byteArray70);
        int int73 = inflater44.inflate(byteArray70);
        int int74 = inflater15.inflate(byteArray70);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int75 = inflater0.inflate(byteArray70);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        boolean boolean4 = inflater0.finished();
        inflater0.end();
        inflater0.end();
        boolean boolean7 = inflater0.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long8 = inflater0.getBytesWritten();
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsInput();
        boolean boolean6 = inflater0.finished();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        int int10 = inflater7.getTotalOut();
        inflater7.reset();
        boolean boolean12 = inflater7.needsInput();
        long long13 = inflater7.getBytesRead();
        int int14 = inflater7.getTotalOut();
        java.util.zip.Inflater inflater15 = new java.util.zip.Inflater();
        boolean boolean16 = inflater15.needsDictionary();
        int int17 = inflater15.getTotalOut();
        boolean boolean18 = inflater15.finished();
        boolean boolean19 = inflater15.needsDictionary();
        java.util.zip.Inflater inflater20 = new java.util.zip.Inflater();
        boolean boolean21 = inflater20.finished();
        boolean boolean22 = inflater20.needsInput();
        boolean boolean23 = inflater20.needsInput();
        java.util.zip.Inflater inflater24 = new java.util.zip.Inflater();
        boolean boolean25 = inflater24.finished();
        int int26 = inflater24.getRemaining();
        boolean boolean27 = inflater24.needsDictionary();
        long long28 = inflater24.getBytesRead();
        boolean boolean29 = inflater24.needsDictionary();
        java.util.zip.Inflater inflater30 = new java.util.zip.Inflater();
        byte[] byteArray32 = new byte[] { (byte) 1 };
        int int33 = inflater30.inflate(byteArray32);
        long long34 = inflater30.getBytesWritten();
        inflater30.reset();
        long long36 = inflater30.getBytesWritten();
        java.util.zip.Inflater inflater37 = new java.util.zip.Inflater();
        boolean boolean38 = inflater37.finished();
        int int39 = inflater37.getRemaining();
        boolean boolean40 = inflater37.needsDictionary();
        boolean boolean41 = inflater37.needsInput();
        int int42 = inflater37.getRemaining();
        java.util.zip.Inflater inflater43 = new java.util.zip.Inflater();
        boolean boolean44 = inflater43.finished();
        int int45 = inflater43.getRemaining();
        boolean boolean46 = inflater43.finished();
        byte[] byteArray53 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater43.setInput(byteArray53);
        int int55 = inflater37.inflate(byteArray53);
        inflater30.setInput(byteArray53);
        inflater24.setInput(byteArray53);
        int int58 = inflater20.inflate(byteArray53);
        int int59 = inflater15.inflate(byteArray53);
        inflater7.setInput(byteArray53);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.setDictionary(byteArray53);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsDictionary();
        boolean boolean6 = inflater0.finished();
        int int7 = inflater0.getTotalIn();
        int int8 = inflater0.getRemaining();
        long long9 = inflater0.getBytesWritten();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int11 = inflater0.getTotalIn();
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        boolean boolean21 = inflater0.finished();
        int int22 = inflater0.getRemaining();
        inflater0.end();
        int int24 = inflater0.getRemaining();
        int int25 = inflater0.getRemaining();
        java.util.zip.Inflater inflater26 = new java.util.zip.Inflater();
        boolean boolean27 = inflater26.finished();
        int int28 = inflater26.getRemaining();
        boolean boolean29 = inflater26.needsDictionary();
        long long30 = inflater26.getBytesRead();
        boolean boolean31 = inflater26.needsInput();
        int int32 = inflater26.getTotalOut();
        long long33 = inflater26.getBytesRead();
        java.util.zip.Inflater inflater34 = new java.util.zip.Inflater();
        boolean boolean35 = inflater34.finished();
        int int36 = inflater34.getRemaining();
        boolean boolean37 = inflater34.needsDictionary();
        boolean boolean38 = inflater34.needsInput();
        int int39 = inflater34.getRemaining();
        inflater34.reset();
        java.util.zip.Inflater inflater41 = new java.util.zip.Inflater();
        boolean boolean42 = inflater41.finished();
        int int43 = inflater41.getRemaining();
        boolean boolean44 = inflater41.finished();
        byte[] byteArray51 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater41.setInput(byteArray51);
        inflater34.setInput(byteArray51);
        int int56 = inflater26.inflate(byteArray51, 1, (int) (short) 1);
        java.util.zip.Inflater inflater57 = new java.util.zip.Inflater();
        boolean boolean58 = inflater57.finished();
        int int59 = inflater57.getRemaining();
        boolean boolean60 = inflater57.finished();
        int int61 = inflater57.getAdler();
        int int62 = inflater57.getAdler();
        int int63 = inflater57.getAdler();
        int int64 = inflater57.getTotalOut();
        inflater57.reset();
        java.util.zip.Inflater inflater66 = new java.util.zip.Inflater();
        boolean boolean67 = inflater66.needsDictionary();
        java.util.zip.Inflater inflater68 = new java.util.zip.Inflater();
        boolean boolean69 = inflater68.finished();
        int int70 = inflater68.getRemaining();
        boolean boolean71 = inflater68.needsDictionary();
        boolean boolean72 = inflater68.needsInput();
        int int73 = inflater68.getRemaining();
        inflater68.reset();
        java.util.zip.Inflater inflater75 = new java.util.zip.Inflater();
        boolean boolean76 = inflater75.finished();
        int int77 = inflater75.getRemaining();
        boolean boolean78 = inflater75.finished();
        byte[] byteArray85 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater75.setInput(byteArray85);
        inflater68.setInput(byteArray85);
        inflater66.setInput(byteArray85);
        inflater57.setInput(byteArray85, (int) (byte) 0, 0);
        int int92 = inflater26.inflate(byteArray85);
        inflater0.setInput(byteArray85);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int94 = inflater0.getTotalIn();
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        inflater0.reset();
        inflater0.end();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int5 = inflater0.getTotalIn();
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(true);
        inflater1.end();
        int int3 = inflater1.getRemaining();
        boolean boolean4 = inflater1.finished();
        boolean boolean5 = inflater1.needsDictionary();
        boolean boolean6 = inflater1.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater1.reset();
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.reset();
        long long6 = inflater0.getBytesWritten();
        int int7 = inflater0.getTotalIn();
        boolean boolean8 = inflater0.needsDictionary();
        int int9 = inflater0.getTotalIn();
        long long10 = inflater0.getBytesWritten();
        inflater0.end();
        int int12 = inflater0.getRemaining();
        java.util.zip.Inflater inflater13 = new java.util.zip.Inflater();
        byte[] byteArray15 = new byte[] { (byte) 1 };
        int int16 = inflater13.inflate(byteArray15);
        inflater13.reset();
        long long18 = inflater13.getBytesWritten();
        boolean boolean19 = inflater13.needsInput();
        boolean boolean20 = inflater13.finished();
        int int21 = inflater13.getTotalOut();
        java.util.zip.Inflater inflater23 = new java.util.zip.Inflater(true);
        int int24 = inflater23.getRemaining();
        long long25 = inflater23.getBytesRead();
        int int26 = inflater23.getTotalIn();
        int int27 = inflater23.getRemaining();
        inflater23.reset();
        boolean boolean29 = inflater23.finished();
        java.util.zip.Inflater inflater30 = new java.util.zip.Inflater();
        boolean boolean31 = inflater30.needsDictionary();
        int int32 = inflater30.getTotalOut();
        long long33 = inflater30.getBytesWritten();
        boolean boolean34 = inflater30.needsInput();
        java.util.zip.Inflater inflater35 = new java.util.zip.Inflater();
        boolean boolean36 = inflater35.finished();
        int int37 = inflater35.getRemaining();
        boolean boolean38 = inflater35.needsDictionary();
        boolean boolean39 = inflater35.needsInput();
        long long40 = inflater35.getBytesWritten();
        java.util.zip.Inflater inflater42 = new java.util.zip.Inflater(true);
        int int43 = inflater42.getRemaining();
        long long44 = inflater42.getBytesRead();
        java.util.zip.Inflater inflater45 = new java.util.zip.Inflater();
        boolean boolean46 = inflater45.finished();
        int int47 = inflater45.getRemaining();
        inflater45.end();
        java.util.zip.Inflater inflater49 = new java.util.zip.Inflater();
        boolean boolean50 = inflater49.finished();
        int int51 = inflater49.getRemaining();
        boolean boolean52 = inflater49.finished();
        byte[] byteArray59 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater49.setInput(byteArray59);
        inflater45.setInput(byteArray59);
        inflater42.setInput(byteArray59, (int) (byte) 1, (int) (short) 1);
        int int65 = inflater35.inflate(byteArray59);
        int int66 = inflater30.inflate(byteArray59);
        inflater23.setDictionary(byteArray59);
        inflater13.setInput(byteArray59);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int69 = inflater0.inflate(byteArray59);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        int int2 = inflater0.getTotalOut();
        int int3 = inflater0.getTotalOut();
        long long4 = inflater0.getBytesWritten();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        boolean boolean6 = inflater5.finished();
        int int7 = inflater5.getRemaining();
        boolean boolean8 = inflater5.needsDictionary();
        long long9 = inflater5.getBytesRead();
        boolean boolean10 = inflater5.needsDictionary();
        java.util.zip.Inflater inflater11 = new java.util.zip.Inflater();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        int int14 = inflater11.inflate(byteArray13);
        long long15 = inflater11.getBytesWritten();
        inflater11.reset();
        long long17 = inflater11.getBytesWritten();
        java.util.zip.Inflater inflater18 = new java.util.zip.Inflater();
        boolean boolean19 = inflater18.finished();
        int int20 = inflater18.getRemaining();
        boolean boolean21 = inflater18.needsDictionary();
        boolean boolean22 = inflater18.needsInput();
        int int23 = inflater18.getRemaining();
        java.util.zip.Inflater inflater24 = new java.util.zip.Inflater();
        boolean boolean25 = inflater24.finished();
        int int26 = inflater24.getRemaining();
        boolean boolean27 = inflater24.finished();
        byte[] byteArray34 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater24.setInput(byteArray34);
        int int36 = inflater18.inflate(byteArray34);
        inflater11.setInput(byteArray34);
        inflater5.setInput(byteArray34);
        int int39 = inflater0.inflate(byteArray34);
        int int40 = inflater0.getTotalOut();
        int int41 = inflater0.getTotalIn();
        java.util.zip.Inflater inflater42 = new java.util.zip.Inflater();
        byte[] byteArray44 = new byte[] { (byte) 1 };
        int int45 = inflater42.inflate(byteArray44);
        inflater42.reset();
        java.util.zip.Inflater inflater47 = new java.util.zip.Inflater();
        byte[] byteArray49 = new byte[] { (byte) 1 };
        int int50 = inflater47.inflate(byteArray49);
        int int51 = inflater47.getTotalIn();
        java.util.zip.Inflater inflater52 = new java.util.zip.Inflater();
        byte[] byteArray54 = new byte[] { (byte) 1 };
        int int55 = inflater52.inflate(byteArray54);
        byte[] byteArray60 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int61 = inflater52.inflate(byteArray60);
        int int62 = inflater47.inflate(byteArray60);
        inflater42.setInput(byteArray60);
        int int64 = inflater0.inflate(byteArray60);
        int int65 = inflater0.getRemaining();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int67 = inflater0.getAdler();
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        inflater0.reset();
        boolean boolean2 = inflater0.needsInput();
        inflater0.end();
        boolean boolean4 = inflater0.needsDictionary();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsInput();
        boolean boolean6 = inflater0.finished();
        int int7 = inflater0.getRemaining();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        boolean boolean9 = inflater8.finished();
        int int10 = inflater8.getRemaining();
        int int11 = inflater8.getTotalOut();
        inflater8.reset();
        boolean boolean13 = inflater8.needsInput();
        long long14 = inflater8.getBytesRead();
        int int15 = inflater8.getTotalOut();
        java.util.zip.Inflater inflater16 = new java.util.zip.Inflater();
        boolean boolean17 = inflater16.finished();
        int int18 = inflater16.getRemaining();
        boolean boolean19 = inflater16.needsDictionary();
        boolean boolean20 = inflater16.needsInput();
        int int21 = inflater16.getRemaining();
        java.util.zip.Inflater inflater22 = new java.util.zip.Inflater();
        boolean boolean23 = inflater22.finished();
        int int24 = inflater22.getRemaining();
        boolean boolean25 = inflater22.finished();
        byte[] byteArray32 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater22.setInput(byteArray32);
        int int34 = inflater16.inflate(byteArray32);
        boolean boolean35 = inflater16.finished();
        int int36 = inflater16.getTotalIn();
        java.util.zip.Inflater inflater37 = new java.util.zip.Inflater();
        boolean boolean38 = inflater37.finished();
        int int39 = inflater37.getRemaining();
        boolean boolean40 = inflater37.needsDictionary();
        boolean boolean41 = inflater37.needsInput();
        int int42 = inflater37.getRemaining();
        inflater37.reset();
        boolean boolean44 = inflater37.needsDictionary();
        int int45 = inflater37.getTotalIn();
        java.util.zip.Inflater inflater46 = new java.util.zip.Inflater();
        boolean boolean47 = inflater46.finished();
        int int48 = inflater46.getRemaining();
        boolean boolean49 = inflater46.needsDictionary();
        boolean boolean50 = inflater46.needsInput();
        int int51 = inflater46.getRemaining();
        inflater46.reset();
        java.util.zip.Inflater inflater53 = new java.util.zip.Inflater();
        boolean boolean54 = inflater53.finished();
        int int55 = inflater53.getRemaining();
        boolean boolean56 = inflater53.needsDictionary();
        boolean boolean57 = inflater53.needsInput();
        int int58 = inflater53.getRemaining();
        inflater53.reset();
        java.util.zip.Inflater inflater60 = new java.util.zip.Inflater();
        boolean boolean61 = inflater60.finished();
        int int62 = inflater60.getRemaining();
        boolean boolean63 = inflater60.finished();
        byte[] byteArray70 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater60.setInput(byteArray70);
        inflater53.setInput(byteArray70);
        int int75 = inflater46.inflate(byteArray70, 0, (int) (byte) 0);
        int int76 = inflater37.inflate(byteArray70);
        int int77 = inflater16.inflate(byteArray70);
        int int78 = inflater8.inflate(byteArray70);
        inflater0.setInput(byteArray70);
        boolean boolean80 = inflater0.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long81 = inflater0.getBytesWritten();
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsDictionary();
        boolean boolean6 = inflater0.finished();
        int int7 = inflater0.getTotalIn();
        int int8 = inflater0.getRemaining();
        long long9 = inflater0.getBytesWritten();
        inflater0.end();
        java.util.zip.Inflater inflater11 = new java.util.zip.Inflater();
        boolean boolean12 = inflater11.finished();
        int int13 = inflater11.getRemaining();
        boolean boolean14 = inflater11.needsDictionary();
        int int15 = inflater11.getRemaining();
        long long16 = inflater11.getBytesWritten();
        java.util.zip.Inflater inflater17 = new java.util.zip.Inflater();
        boolean boolean18 = inflater17.needsDictionary();
        int int19 = inflater17.getTotalOut();
        long long20 = inflater17.getBytesWritten();
        boolean boolean21 = inflater17.needsInput();
        java.util.zip.Inflater inflater22 = new java.util.zip.Inflater();
        boolean boolean23 = inflater22.finished();
        int int24 = inflater22.getRemaining();
        boolean boolean25 = inflater22.needsDictionary();
        boolean boolean26 = inflater22.needsInput();
        long long27 = inflater22.getBytesWritten();
        java.util.zip.Inflater inflater29 = new java.util.zip.Inflater(true);
        int int30 = inflater29.getRemaining();
        long long31 = inflater29.getBytesRead();
        java.util.zip.Inflater inflater32 = new java.util.zip.Inflater();
        boolean boolean33 = inflater32.finished();
        int int34 = inflater32.getRemaining();
        inflater32.end();
        java.util.zip.Inflater inflater36 = new java.util.zip.Inflater();
        boolean boolean37 = inflater36.finished();
        int int38 = inflater36.getRemaining();
        boolean boolean39 = inflater36.finished();
        byte[] byteArray46 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater36.setInput(byteArray46);
        inflater32.setInput(byteArray46);
        inflater29.setInput(byteArray46, (int) (byte) 1, (int) (short) 1);
        int int52 = inflater22.inflate(byteArray46);
        int int53 = inflater17.inflate(byteArray46);
        int int54 = inflater11.inflate(byteArray46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int55 = inflater0.inflate(byteArray46);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        boolean boolean21 = inflater0.finished();
        int int22 = inflater0.getRemaining();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int24 = inflater0.getTotalOut();
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        boolean boolean20 = inflater0.finished();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long22 = inflater0.getBytesWritten();
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(true);
        int int2 = inflater1.getRemaining();
        long long3 = inflater1.getBytesRead();
        java.util.zip.Inflater inflater4 = new java.util.zip.Inflater();
        boolean boolean5 = inflater4.finished();
        int int6 = inflater4.getRemaining();
        inflater4.end();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        boolean boolean9 = inflater8.finished();
        int int10 = inflater8.getRemaining();
        boolean boolean11 = inflater8.finished();
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater8.setInput(byteArray18);
        inflater4.setInput(byteArray18);
        inflater1.setInput(byteArray18, (int) (byte) 1, (int) (short) 1);
        int int24 = inflater1.getTotalIn();
        int int25 = inflater1.getRemaining();
        int int26 = inflater1.getAdler();
        inflater1.end();
        inflater1.end();
        boolean boolean29 = inflater1.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long30 = inflater1.getBytesWritten();
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(true);
        int int2 = inflater1.getRemaining();
        long long3 = inflater1.getBytesRead();
        java.util.zip.Inflater inflater4 = new java.util.zip.Inflater();
        byte[] byteArray6 = new byte[] { (byte) 1 };
        int int7 = inflater4.inflate(byteArray6);
        int int8 = inflater1.inflate(byteArray6);
        int int9 = inflater1.getAdler();
        int int10 = inflater1.getTotalIn();
        long long11 = inflater1.getBytesRead();
        boolean boolean12 = inflater1.finished();
        inflater1.end();
        java.util.zip.Inflater inflater14 = new java.util.zip.Inflater();
        boolean boolean15 = inflater14.finished();
        int int16 = inflater14.getRemaining();
        boolean boolean17 = inflater14.finished();
        int int18 = inflater14.getAdler();
        int int19 = inflater14.getAdler();
        long long20 = inflater14.getBytesWritten();
        long long21 = inflater14.getBytesRead();
        java.util.zip.Inflater inflater22 = new java.util.zip.Inflater();
        byte[] byteArray24 = new byte[] { (byte) 1 };
        int int25 = inflater22.inflate(byteArray24);
        int int26 = inflater22.getAdler();
        java.util.zip.Inflater inflater27 = new java.util.zip.Inflater();
        boolean boolean28 = inflater27.finished();
        int int29 = inflater27.getRemaining();
        boolean boolean30 = inflater27.finished();
        long long31 = inflater27.getBytesRead();
        boolean boolean32 = inflater27.finished();
        long long33 = inflater27.getBytesRead();
        boolean boolean34 = inflater27.needsDictionary();
        boolean boolean35 = inflater27.needsDictionary();
        java.util.zip.Inflater inflater36 = new java.util.zip.Inflater();
        boolean boolean37 = inflater36.needsDictionary();
        int int38 = inflater36.getTotalOut();
        int int39 = inflater36.getTotalOut();
        boolean boolean40 = inflater36.needsInput();
        java.util.zip.Inflater inflater41 = new java.util.zip.Inflater();
        byte[] byteArray43 = new byte[] { (byte) 1 };
        int int44 = inflater41.inflate(byteArray43);
        inflater41.reset();
        java.util.zip.Inflater inflater46 = new java.util.zip.Inflater();
        byte[] byteArray48 = new byte[] { (byte) 1 };
        int int49 = inflater46.inflate(byteArray48);
        int int50 = inflater46.getTotalIn();
        java.util.zip.Inflater inflater51 = new java.util.zip.Inflater();
        byte[] byteArray53 = new byte[] { (byte) 1 };
        int int54 = inflater51.inflate(byteArray53);
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int60 = inflater51.inflate(byteArray59);
        int int61 = inflater46.inflate(byteArray59);
        inflater41.setInput(byteArray59);
        inflater36.setInput(byteArray59);
        int int64 = inflater27.inflate(byteArray59);
        inflater22.setInput(byteArray59);
        int int66 = inflater14.inflate(byteArray59);
        java.util.zip.Inflater inflater67 = new java.util.zip.Inflater();
        byte[] byteArray69 = new byte[] { (byte) 1 };
        int int70 = inflater67.inflate(byteArray69);
        long long71 = inflater67.getBytesWritten();
        inflater67.reset();
        long long73 = inflater67.getBytesWritten();
        java.util.zip.Inflater inflater74 = new java.util.zip.Inflater();
        boolean boolean75 = inflater74.finished();
        int int76 = inflater74.getRemaining();
        boolean boolean77 = inflater74.needsDictionary();
        boolean boolean78 = inflater74.needsInput();
        int int79 = inflater74.getRemaining();
        java.util.zip.Inflater inflater80 = new java.util.zip.Inflater();
        boolean boolean81 = inflater80.finished();
        int int82 = inflater80.getRemaining();
        boolean boolean83 = inflater80.finished();
        byte[] byteArray90 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater80.setInput(byteArray90);
        int int92 = inflater74.inflate(byteArray90);
        inflater67.setInput(byteArray90);
        int int94 = inflater14.inflate(byteArray90);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int95 = inflater1.inflate(byteArray90);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long22 = inflater0.getBytesRead();
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getTotalIn();
        int int5 = inflater0.getAdler();
        int int6 = inflater0.getTotalIn();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int8 = inflater0.getTotalIn();
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        int int4 = inflater0.getAdler();
        int int5 = inflater0.getAdler();
        boolean boolean6 = inflater0.needsDictionary();
        boolean boolean7 = inflater0.finished();
        boolean boolean8 = inflater0.needsInput();
        java.util.zip.Inflater inflater9 = new java.util.zip.Inflater();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        int int12 = inflater9.inflate(byteArray11);
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int18 = inflater9.inflate(byteArray17);
        boolean boolean19 = inflater9.finished();
        int int20 = inflater9.getTotalOut();
        java.util.zip.Inflater inflater21 = new java.util.zip.Inflater();
        byte[] byteArray23 = new byte[] { (byte) 1 };
        int int24 = inflater21.inflate(byteArray23);
        long long25 = inflater21.getBytesWritten();
        boolean boolean26 = inflater21.needsInput();
        int int27 = inflater21.getRemaining();
        int int28 = inflater21.getAdler();
        java.util.zip.Inflater inflater29 = new java.util.zip.Inflater();
        boolean boolean30 = inflater29.finished();
        int int31 = inflater29.getRemaining();
        boolean boolean32 = inflater29.needsDictionary();
        long long33 = inflater29.getBytesRead();
        long long34 = inflater29.getBytesWritten();
        boolean boolean35 = inflater29.finished();
        java.util.zip.Inflater inflater36 = new java.util.zip.Inflater();
        byte[] byteArray38 = new byte[] { (byte) 1 };
        int int39 = inflater36.inflate(byteArray38);
        boolean boolean40 = inflater36.finished();
        int int41 = inflater36.getRemaining();
        java.util.zip.Inflater inflater42 = new java.util.zip.Inflater();
        byte[] byteArray44 = new byte[] { (byte) 1 };
        int int45 = inflater42.inflate(byteArray44);
        inflater42.reset();
        java.util.zip.Inflater inflater47 = new java.util.zip.Inflater();
        byte[] byteArray49 = new byte[] { (byte) 1 };
        int int50 = inflater47.inflate(byteArray49);
        int int51 = inflater47.getTotalIn();
        java.util.zip.Inflater inflater52 = new java.util.zip.Inflater();
        byte[] byteArray54 = new byte[] { (byte) 1 };
        int int55 = inflater52.inflate(byteArray54);
        byte[] byteArray60 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int61 = inflater52.inflate(byteArray60);
        int int62 = inflater47.inflate(byteArray60);
        inflater42.setInput(byteArray60);
        inflater36.setInput(byteArray60);
        int int65 = inflater29.inflate(byteArray60);
        int int66 = inflater21.inflate(byteArray60);
        int int67 = inflater9.inflate(byteArray60);
        int int68 = inflater0.inflate(byteArray60);
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long70 = inflater0.getBytesWritten();
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int9 = inflater0.inflate(byteArray8);
        boolean boolean10 = inflater0.needsInput();
        boolean boolean11 = inflater0.finished();
        inflater0.end();
        java.util.zip.Inflater inflater13 = new java.util.zip.Inflater();
        boolean boolean14 = inflater13.finished();
        int int15 = inflater13.getRemaining();
        java.util.zip.Inflater inflater16 = new java.util.zip.Inflater();
        byte[] byteArray18 = new byte[] { (byte) 1 };
        int int19 = inflater16.inflate(byteArray18);
        inflater16.reset();
        java.util.zip.Inflater inflater21 = new java.util.zip.Inflater();
        byte[] byteArray23 = new byte[] { (byte) 1 };
        int int24 = inflater21.inflate(byteArray23);
        long long25 = inflater21.getBytesWritten();
        inflater21.reset();
        long long27 = inflater21.getBytesWritten();
        java.util.zip.Inflater inflater28 = new java.util.zip.Inflater();
        boolean boolean29 = inflater28.finished();
        int int30 = inflater28.getRemaining();
        boolean boolean31 = inflater28.needsDictionary();
        boolean boolean32 = inflater28.needsInput();
        int int33 = inflater28.getRemaining();
        java.util.zip.Inflater inflater34 = new java.util.zip.Inflater();
        boolean boolean35 = inflater34.finished();
        int int36 = inflater34.getRemaining();
        boolean boolean37 = inflater34.finished();
        byte[] byteArray44 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater34.setInput(byteArray44);
        int int46 = inflater28.inflate(byteArray44);
        inflater21.setInput(byteArray44);
        inflater16.setInput(byteArray44);
        int int49 = inflater13.inflate(byteArray44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int50 = inflater0.inflate(byteArray44);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        long long4 = inflater0.getBytesRead();
        boolean boolean5 = inflater0.finished();
        long long6 = inflater0.getBytesRead();
        boolean boolean7 = inflater0.needsDictionary();
        boolean boolean8 = inflater0.needsDictionary();
        java.util.zip.Inflater inflater9 = new java.util.zip.Inflater();
        boolean boolean10 = inflater9.needsDictionary();
        int int11 = inflater9.getTotalOut();
        int int12 = inflater9.getTotalOut();
        boolean boolean13 = inflater9.needsInput();
        java.util.zip.Inflater inflater14 = new java.util.zip.Inflater();
        byte[] byteArray16 = new byte[] { (byte) 1 };
        int int17 = inflater14.inflate(byteArray16);
        inflater14.reset();
        java.util.zip.Inflater inflater19 = new java.util.zip.Inflater();
        byte[] byteArray21 = new byte[] { (byte) 1 };
        int int22 = inflater19.inflate(byteArray21);
        int int23 = inflater19.getTotalIn();
        java.util.zip.Inflater inflater24 = new java.util.zip.Inflater();
        byte[] byteArray26 = new byte[] { (byte) 1 };
        int int27 = inflater24.inflate(byteArray26);
        byte[] byteArray32 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int33 = inflater24.inflate(byteArray32);
        int int34 = inflater19.inflate(byteArray32);
        inflater14.setInput(byteArray32);
        inflater9.setInput(byteArray32);
        int int37 = inflater0.inflate(byteArray32);
        inflater0.reset();
        int int39 = inflater0.getTotalOut();
        boolean boolean40 = inflater0.needsDictionary();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int42 = inflater0.getTotalOut();
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(true);
        int int2 = inflater1.getRemaining();
        long long3 = inflater1.getBytesRead();
        int int4 = inflater1.getTotalIn();
        long long5 = inflater1.getBytesWritten();
        long long6 = inflater1.getBytesWritten();
        inflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int8 = inflater1.getAdler();
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        inflater0.end();
        boolean boolean22 = inflater0.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long23 = inflater0.getBytesWritten();
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        inflater0.reset();
        boolean boolean5 = inflater0.needsInput();
        int int6 = inflater0.getAdler();
        inflater0.end();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        boolean boolean9 = inflater8.finished();
        int int10 = inflater8.getRemaining();
        int int11 = inflater8.getTotalOut();
        inflater8.reset();
        boolean boolean13 = inflater8.needsInput();
        long long14 = inflater8.getBytesRead();
        int int15 = inflater8.getTotalOut();
        java.util.zip.Inflater inflater16 = new java.util.zip.Inflater();
        boolean boolean17 = inflater16.finished();
        int int18 = inflater16.getRemaining();
        boolean boolean19 = inflater16.needsDictionary();
        boolean boolean20 = inflater16.needsInput();
        int int21 = inflater16.getRemaining();
        java.util.zip.Inflater inflater22 = new java.util.zip.Inflater();
        boolean boolean23 = inflater22.finished();
        int int24 = inflater22.getRemaining();
        boolean boolean25 = inflater22.finished();
        byte[] byteArray32 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater22.setInput(byteArray32);
        int int34 = inflater16.inflate(byteArray32);
        boolean boolean35 = inflater16.finished();
        int int36 = inflater16.getTotalIn();
        java.util.zip.Inflater inflater37 = new java.util.zip.Inflater();
        boolean boolean38 = inflater37.finished();
        int int39 = inflater37.getRemaining();
        boolean boolean40 = inflater37.needsDictionary();
        boolean boolean41 = inflater37.needsInput();
        int int42 = inflater37.getRemaining();
        inflater37.reset();
        boolean boolean44 = inflater37.needsDictionary();
        int int45 = inflater37.getTotalIn();
        java.util.zip.Inflater inflater46 = new java.util.zip.Inflater();
        boolean boolean47 = inflater46.finished();
        int int48 = inflater46.getRemaining();
        boolean boolean49 = inflater46.needsDictionary();
        boolean boolean50 = inflater46.needsInput();
        int int51 = inflater46.getRemaining();
        inflater46.reset();
        java.util.zip.Inflater inflater53 = new java.util.zip.Inflater();
        boolean boolean54 = inflater53.finished();
        int int55 = inflater53.getRemaining();
        boolean boolean56 = inflater53.needsDictionary();
        boolean boolean57 = inflater53.needsInput();
        int int58 = inflater53.getRemaining();
        inflater53.reset();
        java.util.zip.Inflater inflater60 = new java.util.zip.Inflater();
        boolean boolean61 = inflater60.finished();
        int int62 = inflater60.getRemaining();
        boolean boolean63 = inflater60.finished();
        byte[] byteArray70 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater60.setInput(byteArray70);
        inflater53.setInput(byteArray70);
        int int75 = inflater46.inflate(byteArray70, 0, (int) (byte) 0);
        int int76 = inflater37.inflate(byteArray70);
        int int77 = inflater16.inflate(byteArray70);
        int int78 = inflater8.inflate(byteArray70);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        inflater0.setDictionary(byteArray70);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        int int2 = inflater0.getTotalOut();
        int int3 = inflater0.getTotalOut();
        long long4 = inflater0.getBytesWritten();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        boolean boolean6 = inflater5.finished();
        int int7 = inflater5.getRemaining();
        boolean boolean8 = inflater5.needsDictionary();
        long long9 = inflater5.getBytesRead();
        boolean boolean10 = inflater5.needsDictionary();
        java.util.zip.Inflater inflater11 = new java.util.zip.Inflater();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        int int14 = inflater11.inflate(byteArray13);
        long long15 = inflater11.getBytesWritten();
        inflater11.reset();
        long long17 = inflater11.getBytesWritten();
        java.util.zip.Inflater inflater18 = new java.util.zip.Inflater();
        boolean boolean19 = inflater18.finished();
        int int20 = inflater18.getRemaining();
        boolean boolean21 = inflater18.needsDictionary();
        boolean boolean22 = inflater18.needsInput();
        int int23 = inflater18.getRemaining();
        java.util.zip.Inflater inflater24 = new java.util.zip.Inflater();
        boolean boolean25 = inflater24.finished();
        int int26 = inflater24.getRemaining();
        boolean boolean27 = inflater24.finished();
        byte[] byteArray34 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater24.setInput(byteArray34);
        int int36 = inflater18.inflate(byteArray34);
        inflater11.setInput(byteArray34);
        inflater5.setInput(byteArray34);
        int int39 = inflater0.inflate(byteArray34);
        int int40 = inflater0.getTotalOut();
        int int41 = inflater0.getTotalIn();
        java.util.zip.Inflater inflater42 = new java.util.zip.Inflater();
        byte[] byteArray44 = new byte[] { (byte) 1 };
        int int45 = inflater42.inflate(byteArray44);
        inflater42.reset();
        java.util.zip.Inflater inflater47 = new java.util.zip.Inflater();
        byte[] byteArray49 = new byte[] { (byte) 1 };
        int int50 = inflater47.inflate(byteArray49);
        int int51 = inflater47.getTotalIn();
        java.util.zip.Inflater inflater52 = new java.util.zip.Inflater();
        byte[] byteArray54 = new byte[] { (byte) 1 };
        int int55 = inflater52.inflate(byteArray54);
        byte[] byteArray60 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int61 = inflater52.inflate(byteArray60);
        int int62 = inflater47.inflate(byteArray60);
        inflater42.setInput(byteArray60);
        int int64 = inflater0.inflate(byteArray60);
        int int65 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean67 = inflater0.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int68 = inflater0.getTotalOut();
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        int int4 = inflater0.getAdler();
        int int5 = inflater0.getAdler();
        boolean boolean6 = inflater0.finished();
        int int7 = inflater0.getTotalIn();
        int int8 = inflater0.getTotalOut();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int10 = inflater0.getTotalIn();
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        int int4 = inflater0.getAdler();
        inflater0.reset();
        long long6 = inflater0.getBytesWritten();
        inflater0.end();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        boolean boolean9 = inflater8.finished();
        int int10 = inflater8.getRemaining();
        boolean boolean11 = inflater8.needsDictionary();
        boolean boolean12 = inflater8.needsInput();
        int int13 = inflater8.getRemaining();
        java.util.zip.Inflater inflater14 = new java.util.zip.Inflater();
        boolean boolean15 = inflater14.finished();
        int int16 = inflater14.getRemaining();
        boolean boolean17 = inflater14.finished();
        byte[] byteArray24 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater14.setInput(byteArray24);
        int int26 = inflater8.inflate(byteArray24);
        boolean boolean27 = inflater8.finished();
        int int28 = inflater8.getTotalOut();
        java.util.zip.Inflater inflater29 = new java.util.zip.Inflater();
        boolean boolean30 = inflater29.finished();
        int int31 = inflater29.getRemaining();
        boolean boolean32 = inflater29.needsDictionary();
        long long33 = inflater29.getBytesRead();
        boolean boolean34 = inflater29.needsDictionary();
        java.util.zip.Inflater inflater35 = new java.util.zip.Inflater();
        byte[] byteArray37 = new byte[] { (byte) 1 };
        int int38 = inflater35.inflate(byteArray37);
        long long39 = inflater35.getBytesWritten();
        inflater35.reset();
        long long41 = inflater35.getBytesWritten();
        java.util.zip.Inflater inflater42 = new java.util.zip.Inflater();
        boolean boolean43 = inflater42.finished();
        int int44 = inflater42.getRemaining();
        boolean boolean45 = inflater42.needsDictionary();
        boolean boolean46 = inflater42.needsInput();
        int int47 = inflater42.getRemaining();
        java.util.zip.Inflater inflater48 = new java.util.zip.Inflater();
        boolean boolean49 = inflater48.finished();
        int int50 = inflater48.getRemaining();
        boolean boolean51 = inflater48.finished();
        byte[] byteArray58 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater48.setInput(byteArray58);
        int int60 = inflater42.inflate(byteArray58);
        inflater35.setInput(byteArray58);
        inflater29.setInput(byteArray58);
        int int63 = inflater8.inflate(byteArray58);
        java.util.zip.Inflater inflater64 = new java.util.zip.Inflater();
        boolean boolean65 = inflater64.finished();
        int int66 = inflater64.getRemaining();
        boolean boolean67 = inflater64.needsInput();
        java.util.zip.Inflater inflater68 = new java.util.zip.Inflater();
        boolean boolean69 = inflater68.finished();
        int int70 = inflater68.getRemaining();
        boolean boolean71 = inflater68.finished();
        byte[] byteArray78 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater68.setInput(byteArray78);
        inflater64.setInput(byteArray78);
        int int81 = inflater8.inflate(byteArray78);
        inflater0.setInput(byteArray78);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        inflater0.reset();
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        int int4 = inflater0.getAdler();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        boolean boolean6 = inflater5.finished();
        int int7 = inflater5.getRemaining();
        inflater5.end();
        boolean boolean9 = inflater5.needsInput();
        java.util.zip.Inflater inflater10 = new java.util.zip.Inflater();
        byte[] byteArray12 = new byte[] { (byte) 1 };
        int int13 = inflater10.inflate(byteArray12);
        inflater5.setInput(byteArray12);
        int int15 = inflater0.inflate(byteArray12);
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long17 = inflater0.getBytesWritten();
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(true);
        inflater1.end();
        int int3 = inflater1.getRemaining();
        boolean boolean4 = inflater1.finished();
        int int5 = inflater1.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int6 = inflater1.getTotalOut();
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        long long4 = inflater0.getBytesRead();
        boolean boolean5 = inflater0.needsDictionary();
        int int6 = inflater0.getAdler();
        long long7 = inflater0.getBytesRead();
        int int8 = inflater0.getAdler();
        inflater0.reset();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long11 = inflater0.getBytesRead();
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        int int4 = inflater0.getAdler();
        int int5 = inflater0.getAdler();
        boolean boolean6 = inflater0.needsDictionary();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int8 = inflater0.getTotalIn();
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        boolean boolean4 = inflater0.finished();
        inflater0.end();
        inflater0.end();
        boolean boolean7 = inflater0.needsInput();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        boolean boolean9 = inflater8.finished();
        int int10 = inflater8.getRemaining();
        boolean boolean11 = inflater8.needsDictionary();
        boolean boolean12 = inflater8.needsInput();
        int int13 = inflater8.getRemaining();
        inflater8.reset();
        boolean boolean15 = inflater8.needsDictionary();
        int int16 = inflater8.getTotalIn();
        java.util.zip.Inflater inflater17 = new java.util.zip.Inflater();
        boolean boolean18 = inflater17.finished();
        int int19 = inflater17.getRemaining();
        boolean boolean20 = inflater17.needsDictionary();
        boolean boolean21 = inflater17.needsInput();
        int int22 = inflater17.getRemaining();
        inflater17.reset();
        java.util.zip.Inflater inflater24 = new java.util.zip.Inflater();
        boolean boolean25 = inflater24.finished();
        int int26 = inflater24.getRemaining();
        boolean boolean27 = inflater24.needsDictionary();
        boolean boolean28 = inflater24.needsInput();
        int int29 = inflater24.getRemaining();
        inflater24.reset();
        java.util.zip.Inflater inflater31 = new java.util.zip.Inflater();
        boolean boolean32 = inflater31.finished();
        int int33 = inflater31.getRemaining();
        boolean boolean34 = inflater31.finished();
        byte[] byteArray41 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater31.setInput(byteArray41);
        inflater24.setInput(byteArray41);
        int int46 = inflater17.inflate(byteArray41, 0, (int) (byte) 0);
        int int47 = inflater8.inflate(byteArray41);
        inflater0.setInput(byteArray41);
        java.util.zip.Inflater inflater50 = new java.util.zip.Inflater(true);
        int int51 = inflater50.getRemaining();
        long long52 = inflater50.getBytesRead();
        java.util.zip.Inflater inflater53 = new java.util.zip.Inflater();
        byte[] byteArray55 = new byte[] { (byte) 1 };
        int int56 = inflater53.inflate(byteArray55);
        int int57 = inflater50.inflate(byteArray55);
        inflater0.setInput(byteArray55);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater0.setInput(byteArray10);
        inflater0.end();
        int int13 = inflater0.getRemaining();
        java.util.zip.Inflater inflater14 = new java.util.zip.Inflater();
        boolean boolean15 = inflater14.finished();
        int int16 = inflater14.getRemaining();
        boolean boolean17 = inflater14.needsDictionary();
        boolean boolean18 = inflater14.needsInput();
        int int19 = inflater14.getRemaining();
        int int20 = inflater14.getTotalOut();
        java.util.zip.Inflater inflater21 = new java.util.zip.Inflater();
        boolean boolean22 = inflater21.finished();
        int int23 = inflater21.getRemaining();
        boolean boolean24 = inflater21.needsDictionary();
        boolean boolean25 = inflater21.needsInput();
        int int26 = inflater21.getRemaining();
        inflater21.reset();
        java.util.zip.Inflater inflater28 = new java.util.zip.Inflater();
        boolean boolean29 = inflater28.finished();
        int int30 = inflater28.getRemaining();
        boolean boolean31 = inflater28.finished();
        byte[] byteArray38 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater28.setInput(byteArray38);
        inflater21.setInput(byteArray38);
        int int41 = inflater21.getTotalOut();
        boolean boolean42 = inflater21.needsDictionary();
        long long43 = inflater21.getBytesWritten();
        java.util.zip.Inflater inflater44 = new java.util.zip.Inflater();
        boolean boolean45 = inflater44.needsDictionary();
        int int46 = inflater44.getTotalOut();
        int int47 = inflater44.getTotalOut();
        long long48 = inflater44.getBytesWritten();
        java.util.zip.Inflater inflater49 = new java.util.zip.Inflater();
        boolean boolean50 = inflater49.finished();
        int int51 = inflater49.getRemaining();
        boolean boolean52 = inflater49.needsDictionary();
        long long53 = inflater49.getBytesRead();
        boolean boolean54 = inflater49.needsDictionary();
        java.util.zip.Inflater inflater55 = new java.util.zip.Inflater();
        byte[] byteArray57 = new byte[] { (byte) 1 };
        int int58 = inflater55.inflate(byteArray57);
        long long59 = inflater55.getBytesWritten();
        inflater55.reset();
        long long61 = inflater55.getBytesWritten();
        java.util.zip.Inflater inflater62 = new java.util.zip.Inflater();
        boolean boolean63 = inflater62.finished();
        int int64 = inflater62.getRemaining();
        boolean boolean65 = inflater62.needsDictionary();
        boolean boolean66 = inflater62.needsInput();
        int int67 = inflater62.getRemaining();
        java.util.zip.Inflater inflater68 = new java.util.zip.Inflater();
        boolean boolean69 = inflater68.finished();
        int int70 = inflater68.getRemaining();
        boolean boolean71 = inflater68.finished();
        byte[] byteArray78 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater68.setInput(byteArray78);
        int int80 = inflater62.inflate(byteArray78);
        inflater55.setInput(byteArray78);
        inflater49.setInput(byteArray78);
        int int83 = inflater44.inflate(byteArray78);
        inflater21.setInput(byteArray78);
        int int87 = inflater14.inflate(byteArray78, 0, (int) (short) 1);
        inflater0.setInput(byteArray78);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int89 = inflater0.getTotalOut();
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        boolean boolean20 = inflater0.finished();
        inflater0.end();
        boolean boolean22 = inflater0.needsDictionary();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int23 = inflater0.getTotalIn();
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        int int2 = inflater0.getTotalOut();
        int int3 = inflater0.getTotalOut();
        int int4 = inflater0.getAdler();
        boolean boolean5 = inflater0.needsDictionary();
        int int6 = inflater0.getTotalOut();
        int int7 = inflater0.getTotalOut();
        boolean boolean8 = inflater0.needsInput();
        int int9 = inflater0.getTotalIn();
        int int10 = inflater0.getRemaining();
        inflater0.reset();
        boolean boolean12 = inflater0.finished();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        int int2 = inflater0.getTotalOut();
        int int3 = inflater0.getAdler();
        int int4 = inflater0.getTotalIn();
        int int5 = inflater0.getAdler();
        int int6 = inflater0.getRemaining();
        int int7 = inflater0.getTotalOut();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int9 = inflater0.getAdler();
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        boolean boolean20 = inflater0.finished();
        inflater0.end();
        int int22 = inflater0.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int23 = inflater0.getTotalOut();
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getTotalIn();
        long long5 = inflater0.getBytesWritten();
        int int6 = inflater0.getTotalIn();
        boolean boolean7 = inflater0.needsDictionary();
        int int8 = inflater0.getAdler();
        int int9 = inflater0.getTotalOut();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int11 = inflater0.getTotalIn();
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        long long4 = inflater0.getBytesRead();
        boolean boolean5 = inflater0.finished();
        long long6 = inflater0.getBytesRead();
        long long7 = inflater0.getBytesWritten();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int9 = inflater0.getTotalOut();
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        int int4 = inflater0.getAdler();
        int int5 = inflater0.getAdler();
        int int6 = inflater0.getAdler();
        int int7 = inflater0.getTotalOut();
        boolean boolean8 = inflater0.needsInput();
        inflater0.end();
        java.util.zip.Inflater inflater10 = new java.util.zip.Inflater();
        boolean boolean11 = inflater10.needsDictionary();
        int int12 = inflater10.getTotalOut();
        int int13 = inflater10.getTotalOut();
        int int14 = inflater10.getAdler();
        boolean boolean15 = inflater10.needsDictionary();
        int int16 = inflater10.getTotalOut();
        int int17 = inflater10.getTotalOut();
        boolean boolean18 = inflater10.needsInput();
        int int19 = inflater10.getRemaining();
        int int20 = inflater10.getAdler();
        java.util.zip.Inflater inflater21 = new java.util.zip.Inflater();
        boolean boolean22 = inflater21.finished();
        int int23 = inflater21.getRemaining();
        boolean boolean24 = inflater21.finished();
        byte[] byteArray31 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater21.setInput(byteArray31);
        inflater21.end();
        int int34 = inflater21.getRemaining();
        java.util.zip.Inflater inflater35 = new java.util.zip.Inflater();
        boolean boolean36 = inflater35.finished();
        int int37 = inflater35.getRemaining();
        boolean boolean38 = inflater35.finished();
        int int39 = inflater35.getAdler();
        java.util.zip.Inflater inflater40 = new java.util.zip.Inflater();
        boolean boolean41 = inflater40.finished();
        int int42 = inflater40.getRemaining();
        inflater40.end();
        boolean boolean44 = inflater40.needsInput();
        java.util.zip.Inflater inflater45 = new java.util.zip.Inflater();
        byte[] byteArray47 = new byte[] { (byte) 1 };
        int int48 = inflater45.inflate(byteArray47);
        inflater40.setInput(byteArray47);
        int int50 = inflater35.inflate(byteArray47);
        inflater21.setInput(byteArray47);
        int int52 = inflater10.inflate(byteArray47);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int55 = inflater0.inflate(byteArray47, (int) (byte) 1, 0);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsDictionary();
        boolean boolean6 = inflater0.needsDictionary();
        boolean boolean7 = inflater0.needsInput();
        inflater0.end();
        java.util.zip.Inflater inflater9 = new java.util.zip.Inflater();
        boolean boolean10 = inflater9.finished();
        int int11 = inflater9.getRemaining();
        boolean boolean12 = inflater9.needsDictionary();
        boolean boolean13 = inflater9.needsInput();
        int int14 = inflater9.getRemaining();
        java.util.zip.Inflater inflater15 = new java.util.zip.Inflater();
        boolean boolean16 = inflater15.finished();
        int int17 = inflater15.getRemaining();
        boolean boolean18 = inflater15.finished();
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater15.setInput(byteArray25);
        int int27 = inflater9.inflate(byteArray25);
        boolean boolean28 = inflater9.finished();
        int int29 = inflater9.getTotalOut();
        boolean boolean30 = inflater9.needsInput();
        java.util.zip.Inflater inflater31 = new java.util.zip.Inflater();
        boolean boolean32 = inflater31.finished();
        int int33 = inflater31.getRemaining();
        boolean boolean34 = inflater31.finished();
        int int35 = inflater31.getAdler();
        int int36 = inflater31.getAdler();
        long long37 = inflater31.getBytesWritten();
        long long38 = inflater31.getBytesRead();
        boolean boolean39 = inflater31.finished();
        java.util.zip.Inflater inflater40 = new java.util.zip.Inflater();
        boolean boolean41 = inflater40.finished();
        int int42 = inflater40.getRemaining();
        boolean boolean43 = inflater40.finished();
        byte[] byteArray50 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater40.setInput(byteArray50);
        int int52 = inflater31.inflate(byteArray50);
        inflater9.setInput(byteArray50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int56 = inflater0.inflate(byteArray50, (int) (byte) 1, (int) (short) 1);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        long long4 = inflater0.getBytesRead();
        boolean boolean5 = inflater0.needsInput();
        boolean boolean6 = inflater0.finished();
        boolean boolean7 = inflater0.needsInput();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        boolean boolean9 = inflater8.finished();
        int int10 = inflater8.getRemaining();
        boolean boolean11 = inflater8.needsDictionary();
        boolean boolean12 = inflater8.needsInput();
        int int13 = inflater8.getRemaining();
        java.util.zip.Inflater inflater14 = new java.util.zip.Inflater();
        boolean boolean15 = inflater14.finished();
        int int16 = inflater14.getRemaining();
        boolean boolean17 = inflater14.finished();
        byte[] byteArray24 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater14.setInput(byteArray24);
        int int26 = inflater8.inflate(byteArray24);
        boolean boolean27 = inflater8.finished();
        int int28 = inflater8.getAdler();
        boolean boolean29 = inflater8.finished();
        int int30 = inflater8.getAdler();
        boolean boolean31 = inflater8.needsInput();
        java.util.zip.Inflater inflater32 = new java.util.zip.Inflater();
        byte[] byteArray34 = new byte[] { (byte) 1 };
        int int35 = inflater32.inflate(byteArray34);
        int int36 = inflater32.getTotalIn();
        java.util.zip.Inflater inflater37 = new java.util.zip.Inflater();
        byte[] byteArray39 = new byte[] { (byte) 1 };
        int int40 = inflater37.inflate(byteArray39);
        byte[] byteArray45 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int46 = inflater37.inflate(byteArray45);
        int int47 = inflater32.inflate(byteArray45);
        int int48 = inflater8.inflate(byteArray45);
        inflater0.setInput(byteArray45);
        int int50 = inflater0.getAdler();
        long long51 = inflater0.getBytesWritten();
        long long52 = inflater0.getBytesWritten();
        long long53 = inflater0.getBytesWritten();
        boolean boolean54 = inflater0.needsDictionary();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int56 = inflater0.getTotalIn();
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        boolean boolean7 = inflater0.needsDictionary();
        int int8 = inflater0.getTotalIn();
        boolean boolean9 = inflater0.finished();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int11 = inflater0.getTotalOut();
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getTotalIn();
        long long5 = inflater0.getBytesWritten();
        int int6 = inflater0.getTotalIn();
        boolean boolean7 = inflater0.needsDictionary();
        int int8 = inflater0.getAdler();
        java.util.zip.Inflater inflater9 = new java.util.zip.Inflater();
        boolean boolean10 = inflater9.finished();
        int int11 = inflater9.getRemaining();
        inflater9.end();
        boolean boolean13 = inflater9.needsInput();
        java.util.zip.Inflater inflater14 = new java.util.zip.Inflater();
        boolean boolean15 = inflater14.finished();
        int int16 = inflater14.getRemaining();
        boolean boolean17 = inflater14.needsDictionary();
        long long18 = inflater14.getBytesRead();
        boolean boolean19 = inflater14.needsInput();
        java.util.zip.Inflater inflater20 = new java.util.zip.Inflater();
        byte[] byteArray22 = new byte[] { (byte) 1 };
        int int23 = inflater20.inflate(byteArray22);
        long long24 = inflater20.getBytesWritten();
        inflater20.reset();
        long long26 = inflater20.getBytesWritten();
        java.util.zip.Inflater inflater27 = new java.util.zip.Inflater();
        boolean boolean28 = inflater27.finished();
        int int29 = inflater27.getRemaining();
        boolean boolean30 = inflater27.needsDictionary();
        boolean boolean31 = inflater27.needsInput();
        int int32 = inflater27.getRemaining();
        java.util.zip.Inflater inflater33 = new java.util.zip.Inflater();
        boolean boolean34 = inflater33.finished();
        int int35 = inflater33.getRemaining();
        boolean boolean36 = inflater33.finished();
        byte[] byteArray43 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater33.setInput(byteArray43);
        int int45 = inflater27.inflate(byteArray43);
        inflater20.setInput(byteArray43);
        int int47 = inflater14.inflate(byteArray43);
        inflater9.setInput(byteArray43);
        int int49 = inflater0.inflate(byteArray43);
        int int50 = inflater0.getTotalIn();
        int int51 = inflater0.getAdler();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int53 = inflater0.getTotalIn();
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        boolean boolean7 = inflater0.needsInput();
        boolean boolean8 = inflater0.needsInput();
        long long9 = inflater0.getBytesWritten();
        inflater0.end();
        java.util.zip.Inflater inflater12 = new java.util.zip.Inflater(true);
        int int13 = inflater12.getRemaining();
        long long14 = inflater12.getBytesRead();
        java.util.zip.Inflater inflater15 = new java.util.zip.Inflater();
        byte[] byteArray17 = new byte[] { (byte) 1 };
        int int18 = inflater15.inflate(byteArray17);
        int int19 = inflater12.inflate(byteArray17);
        boolean boolean20 = inflater12.needsInput();
        boolean boolean21 = inflater12.needsDictionary();
        java.util.zip.Inflater inflater23 = new java.util.zip.Inflater(false);
        int int24 = inflater23.getTotalIn();
        boolean boolean25 = inflater23.finished();
        boolean boolean26 = inflater23.needsDictionary();
        java.util.zip.Inflater inflater27 = new java.util.zip.Inflater();
        boolean boolean28 = inflater27.finished();
        int int29 = inflater27.getRemaining();
        boolean boolean30 = inflater27.finished();
        long long31 = inflater27.getBytesRead();
        inflater27.reset();
        java.util.zip.Inflater inflater33 = new java.util.zip.Inflater();
        boolean boolean34 = inflater33.finished();
        int int35 = inflater33.getRemaining();
        boolean boolean36 = inflater33.needsDictionary();
        boolean boolean37 = inflater33.needsInput();
        boolean boolean38 = inflater33.needsDictionary();
        boolean boolean39 = inflater33.needsDictionary();
        java.util.zip.Inflater inflater40 = new java.util.zip.Inflater();
        boolean boolean41 = inflater40.finished();
        int int42 = inflater40.getRemaining();
        boolean boolean43 = inflater40.finished();
        byte[] byteArray50 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater40.setInput(byteArray50);
        int int52 = inflater33.inflate(byteArray50);
        int int53 = inflater27.inflate(byteArray50);
        inflater23.setInput(byteArray50, (int) (byte) 0, 0);
        inflater12.setInput(byteArray50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        inflater0.setDictionary(byteArray50);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        boolean boolean9 = inflater6.finished();
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater6.setInput(byteArray16);
        int int18 = inflater0.inflate(byteArray16);
        boolean boolean19 = inflater0.finished();
        int int20 = inflater0.getTotalOut();
        java.util.zip.Inflater inflater21 = new java.util.zip.Inflater();
        boolean boolean22 = inflater21.finished();
        int int23 = inflater21.getRemaining();
        boolean boolean24 = inflater21.needsDictionary();
        long long25 = inflater21.getBytesRead();
        boolean boolean26 = inflater21.needsDictionary();
        java.util.zip.Inflater inflater27 = new java.util.zip.Inflater();
        byte[] byteArray29 = new byte[] { (byte) 1 };
        int int30 = inflater27.inflate(byteArray29);
        long long31 = inflater27.getBytesWritten();
        inflater27.reset();
        long long33 = inflater27.getBytesWritten();
        java.util.zip.Inflater inflater34 = new java.util.zip.Inflater();
        boolean boolean35 = inflater34.finished();
        int int36 = inflater34.getRemaining();
        boolean boolean37 = inflater34.needsDictionary();
        boolean boolean38 = inflater34.needsInput();
        int int39 = inflater34.getRemaining();
        java.util.zip.Inflater inflater40 = new java.util.zip.Inflater();
        boolean boolean41 = inflater40.finished();
        int int42 = inflater40.getRemaining();
        boolean boolean43 = inflater40.finished();
        byte[] byteArray50 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater40.setInput(byteArray50);
        int int52 = inflater34.inflate(byteArray50);
        inflater27.setInput(byteArray50);
        inflater21.setInput(byteArray50);
        int int55 = inflater0.inflate(byteArray50);
        long long56 = inflater0.getBytesRead();
        inflater0.end();
        boolean boolean58 = inflater0.needsDictionary();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long59 = inflater0.getBytesRead();
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        int int2 = inflater0.getTotalOut();
        int int3 = inflater0.getTotalOut();
        long long4 = inflater0.getBytesWritten();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        boolean boolean6 = inflater5.finished();
        int int7 = inflater5.getRemaining();
        boolean boolean8 = inflater5.needsDictionary();
        long long9 = inflater5.getBytesRead();
        boolean boolean10 = inflater5.needsDictionary();
        java.util.zip.Inflater inflater11 = new java.util.zip.Inflater();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        int int14 = inflater11.inflate(byteArray13);
        long long15 = inflater11.getBytesWritten();
        inflater11.reset();
        long long17 = inflater11.getBytesWritten();
        java.util.zip.Inflater inflater18 = new java.util.zip.Inflater();
        boolean boolean19 = inflater18.finished();
        int int20 = inflater18.getRemaining();
        boolean boolean21 = inflater18.needsDictionary();
        boolean boolean22 = inflater18.needsInput();
        int int23 = inflater18.getRemaining();
        java.util.zip.Inflater inflater24 = new java.util.zip.Inflater();
        boolean boolean25 = inflater24.finished();
        int int26 = inflater24.getRemaining();
        boolean boolean27 = inflater24.finished();
        byte[] byteArray34 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater24.setInput(byteArray34);
        int int36 = inflater18.inflate(byteArray34);
        inflater11.setInput(byteArray34);
        inflater5.setInput(byteArray34);
        int int39 = inflater0.inflate(byteArray34);
        int int40 = inflater0.getRemaining();
        int int41 = inflater0.getTotalIn();
        java.util.zip.Inflater inflater42 = new java.util.zip.Inflater();
        byte[] byteArray44 = new byte[] { (byte) 1 };
        int int45 = inflater42.inflate(byteArray44);
        inflater42.reset();
        java.util.zip.Inflater inflater47 = new java.util.zip.Inflater();
        byte[] byteArray49 = new byte[] { (byte) 1 };
        int int50 = inflater47.inflate(byteArray49);
        long long51 = inflater47.getBytesWritten();
        inflater47.reset();
        long long53 = inflater47.getBytesWritten();
        java.util.zip.Inflater inflater54 = new java.util.zip.Inflater();
        boolean boolean55 = inflater54.finished();
        int int56 = inflater54.getRemaining();
        boolean boolean57 = inflater54.needsDictionary();
        boolean boolean58 = inflater54.needsInput();
        int int59 = inflater54.getRemaining();
        java.util.zip.Inflater inflater60 = new java.util.zip.Inflater();
        boolean boolean61 = inflater60.finished();
        int int62 = inflater60.getRemaining();
        boolean boolean63 = inflater60.finished();
        byte[] byteArray70 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater60.setInput(byteArray70);
        int int72 = inflater54.inflate(byteArray70);
        inflater47.setInput(byteArray70);
        inflater42.setInput(byteArray70);
        int int75 = inflater0.inflate(byteArray70);
        boolean boolean76 = inflater0.needsInput();
        long long77 = inflater0.getBytesRead();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long79 = inflater0.getBytesRead();
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        int int2 = inflater0.getTotalOut();
        int int3 = inflater0.getAdler();
        int int4 = inflater0.getTotalIn();
        int int5 = inflater0.getAdler();
        int int6 = inflater0.getRemaining();
        inflater0.end();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        boolean boolean9 = inflater8.finished();
        int int10 = inflater8.getRemaining();
        boolean boolean11 = inflater8.needsDictionary();
        java.util.zip.Inflater inflater12 = new java.util.zip.Inflater();
        boolean boolean13 = inflater12.finished();
        int int14 = inflater12.getRemaining();
        inflater12.end();
        java.util.zip.Inflater inflater16 = new java.util.zip.Inflater();
        boolean boolean17 = inflater16.finished();
        int int18 = inflater16.getRemaining();
        boolean boolean19 = inflater16.finished();
        byte[] byteArray26 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater16.setInput(byteArray26);
        inflater12.setInput(byteArray26);
        int int29 = inflater8.inflate(byteArray26);
        boolean boolean30 = inflater8.needsDictionary();
        long long31 = inflater8.getBytesRead();
        int int32 = inflater8.getRemaining();
        java.util.zip.Inflater inflater33 = new java.util.zip.Inflater();
        boolean boolean34 = inflater33.finished();
        int int35 = inflater33.getRemaining();
        boolean boolean36 = inflater33.finished();
        java.util.zip.Inflater inflater37 = new java.util.zip.Inflater();
        boolean boolean38 = inflater37.finished();
        int int39 = inflater37.getRemaining();
        boolean boolean40 = inflater37.finished();
        byte[] byteArray47 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater37.setInput(byteArray47);
        inflater33.setInput(byteArray47);
        inflater8.setInput(byteArray47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        inflater0.setDictionary(byteArray47);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(true);
        int int2 = inflater1.getRemaining();
        long long3 = inflater1.getBytesRead();
        java.util.zip.Inflater inflater4 = new java.util.zip.Inflater();
        boolean boolean5 = inflater4.finished();
        int int6 = inflater4.getRemaining();
        inflater4.end();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        boolean boolean9 = inflater8.finished();
        int int10 = inflater8.getRemaining();
        boolean boolean11 = inflater8.finished();
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater8.setInput(byteArray18);
        inflater4.setInput(byteArray18);
        inflater1.setInput(byteArray18, (int) (byte) 1, (int) (short) 1);
        int int24 = inflater1.getTotalIn();
        int int25 = inflater1.getRemaining();
        int int26 = inflater1.getAdler();
        inflater1.end();
        inflater1.end();
        boolean boolean29 = inflater1.finished();
        java.util.zip.Inflater inflater30 = new java.util.zip.Inflater();
        boolean boolean31 = inflater30.finished();
        int int32 = inflater30.getRemaining();
        boolean boolean33 = inflater30.needsDictionary();
        java.util.zip.Inflater inflater34 = new java.util.zip.Inflater();
        boolean boolean35 = inflater34.finished();
        int int36 = inflater34.getRemaining();
        inflater34.end();
        java.util.zip.Inflater inflater38 = new java.util.zip.Inflater();
        boolean boolean39 = inflater38.finished();
        int int40 = inflater38.getRemaining();
        boolean boolean41 = inflater38.finished();
        byte[] byteArray48 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater38.setInput(byteArray48);
        inflater34.setInput(byteArray48);
        int int51 = inflater30.inflate(byteArray48);
        inflater1.setInput(byteArray48);
        java.util.zip.Inflater inflater53 = new java.util.zip.Inflater();
        boolean boolean54 = inflater53.finished();
        int int55 = inflater53.getRemaining();
        boolean boolean56 = inflater53.needsDictionary();
        long long57 = inflater53.getBytesRead();
        boolean boolean58 = inflater53.needsInput();
        int int59 = inflater53.getTotalOut();
        long long60 = inflater53.getBytesWritten();
        java.util.zip.Inflater inflater61 = new java.util.zip.Inflater();
        byte[] byteArray63 = new byte[] { (byte) 1 };
        int int64 = inflater61.inflate(byteArray63);
        boolean boolean65 = inflater61.finished();
        int int66 = inflater61.getRemaining();
        java.util.zip.Inflater inflater67 = new java.util.zip.Inflater();
        boolean boolean68 = inflater67.finished();
        java.util.zip.Inflater inflater69 = new java.util.zip.Inflater();
        byte[] byteArray71 = new byte[] { (byte) 1 };
        int int72 = inflater69.inflate(byteArray71);
        int int73 = inflater69.getTotalIn();
        java.util.zip.Inflater inflater74 = new java.util.zip.Inflater();
        boolean boolean75 = inflater74.finished();
        int int76 = inflater74.getRemaining();
        inflater74.end();
        boolean boolean78 = inflater74.needsInput();
        java.util.zip.Inflater inflater79 = new java.util.zip.Inflater();
        byte[] byteArray81 = new byte[] { (byte) 1 };
        int int82 = inflater79.inflate(byteArray81);
        inflater74.setInput(byteArray81);
        inflater69.setInput(byteArray81);
        inflater67.setInput(byteArray81);
        int int86 = inflater61.inflate(byteArray81);
        inflater53.setInput(byteArray81);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater1.setDictionary(byteArray81);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.end();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        inflater6.end();
        java.util.zip.Inflater inflater10 = new java.util.zip.Inflater();
        boolean boolean11 = inflater10.finished();
        int int12 = inflater10.getRemaining();
        boolean boolean13 = inflater10.finished();
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater10.setInput(byteArray20);
        inflater6.setInput(byteArray20);
        inflater0.setInput(byteArray20);
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsDictionary();
        boolean boolean6 = inflater0.needsDictionary();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        int int19 = inflater0.inflate(byteArray17);
        int int20 = inflater0.getTotalOut();
        boolean boolean21 = inflater0.finished();
        int int22 = inflater0.getTotalOut();
        inflater0.end();
        boolean boolean24 = inflater0.finished();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        boolean boolean26 = inflater25.finished();
        int int27 = inflater25.getRemaining();
        boolean boolean28 = inflater25.needsDictionary();
        int int29 = inflater25.getRemaining();
        long long30 = inflater25.getBytesWritten();
        boolean boolean31 = inflater25.finished();
        java.util.zip.Inflater inflater32 = new java.util.zip.Inflater();
        byte[] byteArray34 = new byte[] { (byte) 1 };
        int int35 = inflater32.inflate(byteArray34);
        int int36 = inflater32.getTotalIn();
        java.util.zip.Inflater inflater37 = new java.util.zip.Inflater();
        byte[] byteArray39 = new byte[] { (byte) 1 };
        int int40 = inflater37.inflate(byteArray39);
        byte[] byteArray45 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int46 = inflater37.inflate(byteArray45);
        int int47 = inflater32.inflate(byteArray45);
        int int48 = inflater32.getTotalOut();
        long long49 = inflater32.getBytesRead();
        java.util.zip.Inflater inflater50 = new java.util.zip.Inflater();
        boolean boolean51 = inflater50.finished();
        int int52 = inflater50.getRemaining();
        boolean boolean53 = inflater50.finished();
        byte[] byteArray60 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater50.setInput(byteArray60);
        int int62 = inflater32.inflate(byteArray60);
        int int63 = inflater25.inflate(byteArray60);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.setDictionary(byteArray60);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        boolean boolean9 = inflater6.finished();
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater6.setInput(byteArray16);
        int int18 = inflater0.inflate(byteArray16);
        boolean boolean19 = inflater0.finished();
        int int20 = inflater0.getAdler();
        boolean boolean21 = inflater0.finished();
        int int22 = inflater0.getAdler();
        boolean boolean23 = inflater0.needsInput();
        int int24 = inflater0.getRemaining();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getTotalIn();
        long long5 = inflater0.getBytesWritten();
        int int6 = inflater0.getTotalIn();
        boolean boolean7 = inflater0.needsDictionary();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        inflater0.reset();
        inflater0.end();
        java.util.zip.Inflater inflater4 = new java.util.zip.Inflater();
        byte[] byteArray6 = new byte[] { (byte) 1 };
        int int7 = inflater4.inflate(byteArray6);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int13 = inflater4.inflate(byteArray12);
        boolean boolean14 = inflater4.finished();
        long long15 = inflater4.getBytesRead();
        int int16 = inflater4.getRemaining();
        int int17 = inflater4.getAdler();
        java.util.zip.Inflater inflater19 = new java.util.zip.Inflater(true);
        inflater19.end();
        java.util.zip.Inflater inflater21 = new java.util.zip.Inflater();
        boolean boolean22 = inflater21.finished();
        int int23 = inflater21.getRemaining();
        boolean boolean24 = inflater21.needsDictionary();
        boolean boolean25 = inflater21.needsInput();
        int int26 = inflater21.getRemaining();
        inflater21.reset();
        java.util.zip.Inflater inflater28 = new java.util.zip.Inflater();
        boolean boolean29 = inflater28.finished();
        int int30 = inflater28.getRemaining();
        boolean boolean31 = inflater28.finished();
        byte[] byteArray38 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater28.setInput(byteArray38);
        inflater21.setInput(byteArray38);
        inflater19.setInput(byteArray38);
        int int42 = inflater4.inflate(byteArray38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int43 = inflater0.inflate(byteArray38);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(true);
        inflater1.end();
        boolean boolean3 = inflater1.finished();
        java.util.zip.Inflater inflater4 = new java.util.zip.Inflater();
        boolean boolean5 = inflater4.finished();
        int int6 = inflater4.getRemaining();
        boolean boolean7 = inflater4.needsDictionary();
        boolean boolean8 = inflater4.needsInput();
        boolean boolean9 = inflater4.needsDictionary();
        boolean boolean10 = inflater4.finished();
        int int11 = inflater4.getTotalIn();
        int int12 = inflater4.getRemaining();
        long long13 = inflater4.getBytesWritten();
        int int14 = inflater4.getTotalOut();
        java.util.zip.Inflater inflater15 = new java.util.zip.Inflater();
        boolean boolean16 = inflater15.finished();
        int int17 = inflater15.getRemaining();
        inflater15.end();
        java.util.zip.Inflater inflater19 = new java.util.zip.Inflater();
        boolean boolean20 = inflater19.finished();
        int int21 = inflater19.getRemaining();
        boolean boolean22 = inflater19.finished();
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater19.setInput(byteArray29);
        inflater15.setInput(byteArray29);
        int int32 = inflater4.inflate(byteArray29);
        inflater1.setInput(byteArray29);
        inflater1.end();
        java.util.zip.Inflater inflater35 = new java.util.zip.Inflater();
        boolean boolean36 = inflater35.finished();
        int int37 = inflater35.getRemaining();
        boolean boolean38 = inflater35.finished();
        int int39 = inflater35.getAdler();
        inflater35.reset();
        boolean boolean41 = inflater35.needsInput();
        java.util.zip.Inflater inflater42 = new java.util.zip.Inflater();
        boolean boolean43 = inflater42.finished();
        int int44 = inflater42.getRemaining();
        inflater42.end();
        boolean boolean46 = inflater42.needsInput();
        java.util.zip.Inflater inflater47 = new java.util.zip.Inflater();
        boolean boolean48 = inflater47.finished();
        int int49 = inflater47.getRemaining();
        boolean boolean50 = inflater47.needsDictionary();
        long long51 = inflater47.getBytesRead();
        boolean boolean52 = inflater47.needsInput();
        java.util.zip.Inflater inflater53 = new java.util.zip.Inflater();
        byte[] byteArray55 = new byte[] { (byte) 1 };
        int int56 = inflater53.inflate(byteArray55);
        long long57 = inflater53.getBytesWritten();
        inflater53.reset();
        long long59 = inflater53.getBytesWritten();
        java.util.zip.Inflater inflater60 = new java.util.zip.Inflater();
        boolean boolean61 = inflater60.finished();
        int int62 = inflater60.getRemaining();
        boolean boolean63 = inflater60.needsDictionary();
        boolean boolean64 = inflater60.needsInput();
        int int65 = inflater60.getRemaining();
        java.util.zip.Inflater inflater66 = new java.util.zip.Inflater();
        boolean boolean67 = inflater66.finished();
        int int68 = inflater66.getRemaining();
        boolean boolean69 = inflater66.finished();
        byte[] byteArray76 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater66.setInput(byteArray76);
        int int78 = inflater60.inflate(byteArray76);
        inflater53.setInput(byteArray76);
        int int80 = inflater47.inflate(byteArray76);
        inflater42.setInput(byteArray76);
        inflater35.setInput(byteArray76);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int85 = inflater1.inflate(byteArray76, 0, 0);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        int int4 = inflater0.getRemaining();
        int int5 = inflater0.getRemaining();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        byte[] byteArray8 = new byte[] { (byte) 1 };
        int int9 = inflater6.inflate(byteArray8);
        long long10 = inflater6.getBytesWritten();
        inflater6.reset();
        int int12 = inflater6.getRemaining();
        inflater6.reset();
        int int14 = inflater6.getTotalOut();
        int int15 = inflater6.getRemaining();
        inflater6.end();
        java.util.zip.Inflater inflater17 = new java.util.zip.Inflater();
        boolean boolean18 = inflater17.needsDictionary();
        inflater17.reset();
        java.util.zip.Inflater inflater20 = new java.util.zip.Inflater();
        boolean boolean21 = inflater20.finished();
        int int22 = inflater20.getRemaining();
        boolean boolean23 = inflater20.finished();
        long long24 = inflater20.getBytesRead();
        int int25 = inflater20.getTotalOut();
        int int26 = inflater20.getAdler();
        java.util.zip.Inflater inflater28 = new java.util.zip.Inflater(true);
        int int29 = inflater28.getRemaining();
        long long30 = inflater28.getBytesRead();
        java.util.zip.Inflater inflater31 = new java.util.zip.Inflater();
        byte[] byteArray33 = new byte[] { (byte) 1 };
        int int34 = inflater31.inflate(byteArray33);
        int int35 = inflater28.inflate(byteArray33);
        int int38 = inflater20.inflate(byteArray33, (int) (short) 1, (int) (short) 0);
        inflater17.setInput(byteArray33);
        inflater6.setInput(byteArray33);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.setDictionary(byteArray33);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        boolean boolean7 = inflater0.needsInput();
        int int8 = inflater0.getRemaining();
        int int9 = inflater0.getTotalOut();
        inflater0.end();
        java.util.zip.Inflater inflater11 = new java.util.zip.Inflater();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        int int14 = inflater11.inflate(byteArray13);
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int20 = inflater11.inflate(byteArray19);
        boolean boolean21 = inflater11.needsInput();
        boolean boolean22 = inflater11.needsDictionary();
        int int23 = inflater11.getTotalOut();
        java.util.zip.Inflater inflater24 = new java.util.zip.Inflater();
        boolean boolean25 = inflater24.finished();
        int int26 = inflater24.getRemaining();
        boolean boolean27 = inflater24.needsDictionary();
        boolean boolean28 = inflater24.needsInput();
        int int29 = inflater24.getRemaining();
        java.util.zip.Inflater inflater30 = new java.util.zip.Inflater();
        boolean boolean31 = inflater30.finished();
        int int32 = inflater30.getRemaining();
        boolean boolean33 = inflater30.finished();
        byte[] byteArray40 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater30.setInput(byteArray40);
        int int42 = inflater24.inflate(byteArray40);
        boolean boolean43 = inflater24.finished();
        int int44 = inflater24.getTotalOut();
        java.util.zip.Inflater inflater45 = new java.util.zip.Inflater();
        boolean boolean46 = inflater45.finished();
        int int47 = inflater45.getRemaining();
        boolean boolean48 = inflater45.needsDictionary();
        long long49 = inflater45.getBytesRead();
        boolean boolean50 = inflater45.needsDictionary();
        java.util.zip.Inflater inflater51 = new java.util.zip.Inflater();
        byte[] byteArray53 = new byte[] { (byte) 1 };
        int int54 = inflater51.inflate(byteArray53);
        long long55 = inflater51.getBytesWritten();
        inflater51.reset();
        long long57 = inflater51.getBytesWritten();
        java.util.zip.Inflater inflater58 = new java.util.zip.Inflater();
        boolean boolean59 = inflater58.finished();
        int int60 = inflater58.getRemaining();
        boolean boolean61 = inflater58.needsDictionary();
        boolean boolean62 = inflater58.needsInput();
        int int63 = inflater58.getRemaining();
        java.util.zip.Inflater inflater64 = new java.util.zip.Inflater();
        boolean boolean65 = inflater64.finished();
        int int66 = inflater64.getRemaining();
        boolean boolean67 = inflater64.finished();
        byte[] byteArray74 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater64.setInput(byteArray74);
        int int76 = inflater58.inflate(byteArray74);
        inflater51.setInput(byteArray74);
        inflater45.setInput(byteArray74);
        int int79 = inflater24.inflate(byteArray74);
        int int80 = inflater11.inflate(byteArray74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        inflater0.setDictionary(byteArray74);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        inflater0.reset();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        int int8 = inflater5.inflate(byteArray7);
        int int9 = inflater5.getTotalIn();
        java.util.zip.Inflater inflater10 = new java.util.zip.Inflater();
        byte[] byteArray12 = new byte[] { (byte) 1 };
        int int13 = inflater10.inflate(byteArray12);
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int19 = inflater10.inflate(byteArray18);
        int int20 = inflater5.inflate(byteArray18);
        inflater0.setInput(byteArray18);
        boolean boolean22 = inflater0.needsDictionary();
        long long23 = inflater0.getBytesWritten();
        int int24 = inflater0.getTotalOut();
        long long25 = inflater0.getBytesRead();
        int int26 = inflater0.getRemaining();
        boolean boolean27 = inflater0.needsInput();
        long long28 = inflater0.getBytesRead();
        inflater0.end();
        java.util.zip.Inflater inflater31 = new java.util.zip.Inflater(true);
        int int32 = inflater31.getRemaining();
        long long33 = inflater31.getBytesRead();
        java.util.zip.Inflater inflater34 = new java.util.zip.Inflater();
        byte[] byteArray36 = new byte[] { (byte) 1 };
        int int37 = inflater34.inflate(byteArray36);
        int int38 = inflater31.inflate(byteArray36);
        boolean boolean39 = inflater31.needsInput();
        boolean boolean40 = inflater31.needsDictionary();
        java.util.zip.Inflater inflater42 = new java.util.zip.Inflater(false);
        int int43 = inflater42.getTotalIn();
        boolean boolean44 = inflater42.finished();
        boolean boolean45 = inflater42.needsDictionary();
        java.util.zip.Inflater inflater46 = new java.util.zip.Inflater();
        boolean boolean47 = inflater46.finished();
        int int48 = inflater46.getRemaining();
        boolean boolean49 = inflater46.finished();
        long long50 = inflater46.getBytesRead();
        inflater46.reset();
        java.util.zip.Inflater inflater52 = new java.util.zip.Inflater();
        boolean boolean53 = inflater52.finished();
        int int54 = inflater52.getRemaining();
        boolean boolean55 = inflater52.needsDictionary();
        boolean boolean56 = inflater52.needsInput();
        boolean boolean57 = inflater52.needsDictionary();
        boolean boolean58 = inflater52.needsDictionary();
        java.util.zip.Inflater inflater59 = new java.util.zip.Inflater();
        boolean boolean60 = inflater59.finished();
        int int61 = inflater59.getRemaining();
        boolean boolean62 = inflater59.finished();
        byte[] byteArray69 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater59.setInput(byteArray69);
        int int71 = inflater52.inflate(byteArray69);
        int int72 = inflater46.inflate(byteArray69);
        inflater42.setInput(byteArray69, (int) (byte) 0, 0);
        inflater31.setInput(byteArray69);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int77 = inflater0.inflate(byteArray69);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        boolean boolean4 = inflater0.finished();
        inflater0.end();
        boolean boolean6 = inflater0.finished();
        boolean boolean7 = inflater0.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int8 = inflater0.getTotalOut();
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        boolean boolean2 = inflater0.needsInput();
        inflater0.end();
        java.util.zip.Inflater inflater4 = new java.util.zip.Inflater();
        boolean boolean5 = inflater4.finished();
        int int6 = inflater4.getRemaining();
        boolean boolean7 = inflater4.finished();
        long long8 = inflater4.getBytesRead();
        boolean boolean9 = inflater4.finished();
        long long10 = inflater4.getBytesRead();
        boolean boolean11 = inflater4.needsDictionary();
        boolean boolean12 = inflater4.needsDictionary();
        java.util.zip.Inflater inflater13 = new java.util.zip.Inflater();
        boolean boolean14 = inflater13.needsDictionary();
        int int15 = inflater13.getTotalOut();
        int int16 = inflater13.getTotalOut();
        boolean boolean17 = inflater13.needsInput();
        java.util.zip.Inflater inflater18 = new java.util.zip.Inflater();
        byte[] byteArray20 = new byte[] { (byte) 1 };
        int int21 = inflater18.inflate(byteArray20);
        inflater18.reset();
        java.util.zip.Inflater inflater23 = new java.util.zip.Inflater();
        byte[] byteArray25 = new byte[] { (byte) 1 };
        int int26 = inflater23.inflate(byteArray25);
        int int27 = inflater23.getTotalIn();
        java.util.zip.Inflater inflater28 = new java.util.zip.Inflater();
        byte[] byteArray30 = new byte[] { (byte) 1 };
        int int31 = inflater28.inflate(byteArray30);
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int37 = inflater28.inflate(byteArray36);
        int int38 = inflater23.inflate(byteArray36);
        inflater18.setInput(byteArray36);
        inflater13.setInput(byteArray36);
        int int41 = inflater4.inflate(byteArray36);
        inflater4.reset();
        java.util.zip.Inflater inflater43 = new java.util.zip.Inflater();
        byte[] byteArray45 = new byte[] { (byte) 1 };
        int int46 = inflater43.inflate(byteArray45);
        int int47 = inflater43.getAdler();
        boolean boolean48 = inflater43.finished();
        long long49 = inflater43.getBytesWritten();
        java.util.zip.Inflater inflater50 = new java.util.zip.Inflater();
        boolean boolean51 = inflater50.finished();
        boolean boolean52 = inflater50.needsInput();
        boolean boolean53 = inflater50.needsInput();
        java.util.zip.Inflater inflater54 = new java.util.zip.Inflater();
        boolean boolean55 = inflater54.finished();
        int int56 = inflater54.getRemaining();
        boolean boolean57 = inflater54.needsDictionary();
        long long58 = inflater54.getBytesRead();
        boolean boolean59 = inflater54.needsDictionary();
        java.util.zip.Inflater inflater60 = new java.util.zip.Inflater();
        byte[] byteArray62 = new byte[] { (byte) 1 };
        int int63 = inflater60.inflate(byteArray62);
        long long64 = inflater60.getBytesWritten();
        inflater60.reset();
        long long66 = inflater60.getBytesWritten();
        java.util.zip.Inflater inflater67 = new java.util.zip.Inflater();
        boolean boolean68 = inflater67.finished();
        int int69 = inflater67.getRemaining();
        boolean boolean70 = inflater67.needsDictionary();
        boolean boolean71 = inflater67.needsInput();
        int int72 = inflater67.getRemaining();
        java.util.zip.Inflater inflater73 = new java.util.zip.Inflater();
        boolean boolean74 = inflater73.finished();
        int int75 = inflater73.getRemaining();
        boolean boolean76 = inflater73.finished();
        byte[] byteArray83 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater73.setInput(byteArray83);
        int int85 = inflater67.inflate(byteArray83);
        inflater60.setInput(byteArray83);
        inflater54.setInput(byteArray83);
        int int88 = inflater50.inflate(byteArray83);
        int int89 = inflater43.inflate(byteArray83);
        int int90 = inflater4.inflate(byteArray83);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        inflater0.setDictionary(byteArray83);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        int int2 = inflater0.getTotalOut();
        int int3 = inflater0.getTotalOut();
        long long4 = inflater0.getBytesWritten();
        int int5 = inflater0.getAdler();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long7 = inflater0.getBytesWritten();
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        long long4 = inflater0.getBytesRead();
        boolean boolean5 = inflater0.finished();
        long long6 = inflater0.getBytesRead();
        long long7 = inflater0.getBytesWritten();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long9 = inflater0.getBytesRead();
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        boolean boolean4 = inflater0.finished();
        inflater0.end();
        inflater0.end();
        boolean boolean7 = inflater0.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int8 = inflater0.getTotalOut();
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        boolean boolean4 = inflater0.finished();
        inflater0.reset();
        boolean boolean6 = inflater0.needsDictionary();
        long long7 = inflater0.getBytesRead();
        inflater0.end();
        java.util.zip.Inflater inflater9 = new java.util.zip.Inflater();
        inflater9.reset();
        boolean boolean11 = inflater9.needsInput();
        int int12 = inflater9.getTotalIn();
        int int13 = inflater9.getRemaining();
        java.util.zip.Inflater inflater14 = new java.util.zip.Inflater();
        byte[] byteArray16 = new byte[] { (byte) 1 };
        int int17 = inflater14.inflate(byteArray16);
        inflater14.reset();
        long long19 = inflater14.getBytesWritten();
        boolean boolean20 = inflater14.needsInput();
        boolean boolean21 = inflater14.finished();
        int int22 = inflater14.getTotalOut();
        boolean boolean23 = inflater14.needsInput();
        boolean boolean24 = inflater14.needsInput();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        boolean boolean26 = inflater25.finished();
        int int27 = inflater25.getRemaining();
        boolean boolean28 = inflater25.needsDictionary();
        boolean boolean29 = inflater25.needsInput();
        int int30 = inflater25.getRemaining();
        inflater25.reset();
        java.util.zip.Inflater inflater32 = new java.util.zip.Inflater();
        boolean boolean33 = inflater32.finished();
        int int34 = inflater32.getRemaining();
        boolean boolean35 = inflater32.needsDictionary();
        boolean boolean36 = inflater32.needsInput();
        int int37 = inflater32.getRemaining();
        inflater32.reset();
        java.util.zip.Inflater inflater39 = new java.util.zip.Inflater();
        boolean boolean40 = inflater39.finished();
        int int41 = inflater39.getRemaining();
        boolean boolean42 = inflater39.finished();
        byte[] byteArray49 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater39.setInput(byteArray49);
        inflater32.setInput(byteArray49);
        int int54 = inflater25.inflate(byteArray49, 0, (int) (byte) 0);
        inflater14.setInput(byteArray49);
        int int56 = inflater9.inflate(byteArray49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int57 = inflater0.inflate(byteArray49);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(true);
        int int2 = inflater1.getRemaining();
        long long3 = inflater1.getBytesRead();
        java.util.zip.Inflater inflater4 = new java.util.zip.Inflater();
        byte[] byteArray6 = new byte[] { (byte) 1 };
        int int7 = inflater4.inflate(byteArray6);
        int int8 = inflater1.inflate(byteArray6);
        int int9 = inflater1.getAdler();
        int int10 = inflater1.getTotalIn();
        long long11 = inflater1.getBytesRead();
        boolean boolean12 = inflater1.needsDictionary();
        inflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long14 = inflater1.getBytesRead();
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(false);
        int int2 = inflater1.getAdler();
        boolean boolean3 = inflater1.needsDictionary();
        int int4 = inflater1.getTotalOut();
        boolean boolean5 = inflater1.finished();
        boolean boolean6 = inflater1.needsDictionary();
        inflater1.end();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        boolean boolean9 = inflater8.finished();
        int int10 = inflater8.getRemaining();
        boolean boolean11 = inflater8.needsDictionary();
        boolean boolean12 = inflater8.needsInput();
        int int13 = inflater8.getRemaining();
        java.util.zip.Inflater inflater14 = new java.util.zip.Inflater();
        boolean boolean15 = inflater14.finished();
        int int16 = inflater14.getRemaining();
        boolean boolean17 = inflater14.finished();
        byte[] byteArray24 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater14.setInput(byteArray24);
        int int26 = inflater8.inflate(byteArray24);
        boolean boolean27 = inflater8.finished();
        int int28 = inflater8.getAdler();
        boolean boolean29 = inflater8.finished();
        int int30 = inflater8.getAdler();
        boolean boolean31 = inflater8.needsInput();
        java.util.zip.Inflater inflater32 = new java.util.zip.Inflater();
        byte[] byteArray34 = new byte[] { (byte) 1 };
        int int35 = inflater32.inflate(byteArray34);
        int int36 = inflater32.getTotalIn();
        java.util.zip.Inflater inflater37 = new java.util.zip.Inflater();
        byte[] byteArray39 = new byte[] { (byte) 1 };
        int int40 = inflater37.inflate(byteArray39);
        byte[] byteArray45 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int46 = inflater37.inflate(byteArray45);
        int int47 = inflater32.inflate(byteArray45);
        int int48 = inflater8.inflate(byteArray45);
        long long49 = inflater8.getBytesRead();
        int int50 = inflater8.getTotalIn();
        long long51 = inflater8.getBytesRead();
        java.util.zip.Inflater inflater53 = new java.util.zip.Inflater(false);
        boolean boolean54 = inflater53.finished();
        java.util.zip.Inflater inflater55 = new java.util.zip.Inflater();
        byte[] byteArray57 = new byte[] { (byte) 1 };
        int int58 = inflater55.inflate(byteArray57);
        int int59 = inflater55.getTotalIn();
        int int60 = inflater55.getTotalIn();
        int int61 = inflater55.getRemaining();
        boolean boolean62 = inflater55.needsInput();
        int int63 = inflater55.getAdler();
        int int64 = inflater55.getTotalOut();
        java.util.zip.Inflater inflater65 = new java.util.zip.Inflater();
        boolean boolean66 = inflater65.finished();
        int int67 = inflater65.getRemaining();
        boolean boolean68 = inflater65.finished();
        int int69 = inflater65.getAdler();
        java.util.zip.Inflater inflater70 = new java.util.zip.Inflater();
        boolean boolean71 = inflater70.finished();
        int int72 = inflater70.getRemaining();
        inflater70.end();
        boolean boolean74 = inflater70.needsInput();
        java.util.zip.Inflater inflater75 = new java.util.zip.Inflater();
        byte[] byteArray77 = new byte[] { (byte) 1 };
        int int78 = inflater75.inflate(byteArray77);
        inflater70.setInput(byteArray77);
        int int80 = inflater65.inflate(byteArray77);
        inflater55.setInput(byteArray77);
        inflater53.setInput(byteArray77);
        int int83 = inflater8.inflate(byteArray77);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater1.setDictionary(byteArray77);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        int int8 = inflater5.inflate(byteArray7);
        inflater0.setInput(byteArray7);
        int int10 = inflater0.getRemaining();
        boolean boolean11 = inflater0.needsDictionary();
        int int12 = inflater0.getRemaining();
        java.util.zip.Inflater inflater14 = new java.util.zip.Inflater(true);
        int int15 = inflater14.getRemaining();
        long long16 = inflater14.getBytesRead();
        java.util.zip.Inflater inflater17 = new java.util.zip.Inflater();
        byte[] byteArray19 = new byte[] { (byte) 1 };
        int int20 = inflater17.inflate(byteArray19);
        int int21 = inflater14.inflate(byteArray19);
        inflater14.end();
        int int23 = inflater14.getRemaining();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater(true);
        boolean boolean26 = inflater25.needsDictionary();
        java.util.zip.Inflater inflater27 = new java.util.zip.Inflater();
        boolean boolean28 = inflater27.finished();
        int int29 = inflater27.getRemaining();
        boolean boolean30 = inflater27.needsDictionary();
        boolean boolean31 = inflater27.needsInput();
        int int32 = inflater27.getRemaining();
        java.util.zip.Inflater inflater33 = new java.util.zip.Inflater();
        boolean boolean34 = inflater33.finished();
        int int35 = inflater33.getRemaining();
        boolean boolean36 = inflater33.finished();
        byte[] byteArray43 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater33.setInput(byteArray43);
        int int45 = inflater27.inflate(byteArray43);
        boolean boolean46 = inflater27.finished();
        int int47 = inflater27.getAdler();
        boolean boolean48 = inflater27.finished();
        int int49 = inflater27.getAdler();
        java.util.zip.Inflater inflater50 = new java.util.zip.Inflater();
        boolean boolean51 = inflater50.finished();
        int int52 = inflater50.getRemaining();
        boolean boolean53 = inflater50.needsDictionary();
        boolean boolean54 = inflater50.needsInput();
        int int55 = inflater50.getRemaining();
        inflater50.reset();
        java.util.zip.Inflater inflater57 = new java.util.zip.Inflater();
        boolean boolean58 = inflater57.finished();
        int int59 = inflater57.getRemaining();
        boolean boolean60 = inflater57.finished();
        byte[] byteArray67 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater57.setInput(byteArray67);
        inflater50.setInput(byteArray67);
        int int70 = inflater27.inflate(byteArray67);
        int int71 = inflater25.inflate(byteArray67);
        inflater14.setInput(byteArray67);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int73 = inflater0.inflate(byteArray67);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        int int3 = inflater0.getTotalOut();
        inflater0.reset();
        boolean boolean5 = inflater0.needsInput();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        boolean boolean9 = inflater6.needsDictionary();
        long long10 = inflater6.getBytesRead();
        boolean boolean11 = inflater6.needsDictionary();
        java.util.zip.Inflater inflater12 = new java.util.zip.Inflater();
        byte[] byteArray14 = new byte[] { (byte) 1 };
        int int15 = inflater12.inflate(byteArray14);
        long long16 = inflater12.getBytesWritten();
        inflater12.reset();
        long long18 = inflater12.getBytesWritten();
        java.util.zip.Inflater inflater19 = new java.util.zip.Inflater();
        boolean boolean20 = inflater19.finished();
        int int21 = inflater19.getRemaining();
        boolean boolean22 = inflater19.needsDictionary();
        boolean boolean23 = inflater19.needsInput();
        int int24 = inflater19.getRemaining();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        boolean boolean26 = inflater25.finished();
        int int27 = inflater25.getRemaining();
        boolean boolean28 = inflater25.finished();
        byte[] byteArray35 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater25.setInput(byteArray35);
        int int37 = inflater19.inflate(byteArray35);
        inflater12.setInput(byteArray35);
        inflater6.setInput(byteArray35);
        int int40 = inflater0.inflate(byteArray35);
        inflater0.end();
        inflater0.end();
        boolean boolean43 = inflater0.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        int int4 = inflater0.getAdler();
        int int5 = inflater0.getAdler();
        boolean boolean6 = inflater0.needsDictionary();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(true);
        int int2 = inflater1.getRemaining();
        long long3 = inflater1.getBytesRead();
        java.util.zip.Inflater inflater4 = new java.util.zip.Inflater();
        boolean boolean5 = inflater4.finished();
        int int6 = inflater4.getRemaining();
        inflater4.end();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        boolean boolean9 = inflater8.finished();
        int int10 = inflater8.getRemaining();
        boolean boolean11 = inflater8.finished();
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater8.setInput(byteArray18);
        inflater4.setInput(byteArray18);
        inflater1.setInput(byteArray18, (int) (byte) 1, (int) (short) 1);
        int int24 = inflater1.getTotalIn();
        boolean boolean25 = inflater1.finished();
        boolean boolean26 = inflater1.needsDictionary();
        inflater1.end();
        boolean boolean28 = inflater1.finished();
        java.util.zip.Inflater inflater29 = new java.util.zip.Inflater();
        inflater29.end();
        int int31 = inflater29.getRemaining();
        inflater29.end();
        int int33 = inflater29.getRemaining();
        java.util.zip.Inflater inflater35 = new java.util.zip.Inflater(true);
        java.util.zip.Inflater inflater36 = new java.util.zip.Inflater();
        byte[] byteArray38 = new byte[] { (byte) 1 };
        int int39 = inflater36.inflate(byteArray38);
        inflater36.reset();
        java.util.zip.Inflater inflater41 = new java.util.zip.Inflater();
        byte[] byteArray43 = new byte[] { (byte) 1 };
        int int44 = inflater41.inflate(byteArray43);
        long long45 = inflater41.getBytesWritten();
        inflater41.reset();
        long long47 = inflater41.getBytesWritten();
        java.util.zip.Inflater inflater48 = new java.util.zip.Inflater();
        boolean boolean49 = inflater48.finished();
        int int50 = inflater48.getRemaining();
        boolean boolean51 = inflater48.needsDictionary();
        boolean boolean52 = inflater48.needsInput();
        int int53 = inflater48.getRemaining();
        java.util.zip.Inflater inflater54 = new java.util.zip.Inflater();
        boolean boolean55 = inflater54.finished();
        int int56 = inflater54.getRemaining();
        boolean boolean57 = inflater54.finished();
        byte[] byteArray64 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater54.setInput(byteArray64);
        int int66 = inflater48.inflate(byteArray64);
        inflater41.setInput(byteArray64);
        inflater36.setInput(byteArray64);
        inflater35.setDictionary(byteArray64);
        inflater29.setInput(byteArray64);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater1.setDictionary(byteArray64);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        boolean boolean5 = inflater0.needsInput();
        inflater0.end();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        int int11 = inflater7.getAdler();
        boolean boolean12 = inflater7.finished();
        long long13 = inflater7.getBytesWritten();
        long long14 = inflater7.getBytesRead();
        boolean boolean15 = inflater7.needsInput();
        long long16 = inflater7.getBytesRead();
        boolean boolean17 = inflater7.finished();
        java.util.zip.Inflater inflater19 = new java.util.zip.Inflater(true);
        int int20 = inflater19.getRemaining();
        long long21 = inflater19.getBytesRead();
        java.util.zip.Inflater inflater22 = new java.util.zip.Inflater();
        byte[] byteArray24 = new byte[] { (byte) 1 };
        int int25 = inflater22.inflate(byteArray24);
        int int26 = inflater19.inflate(byteArray24);
        int int27 = inflater7.inflate(byteArray24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int28 = inflater0.inflate(byteArray24);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        int int8 = inflater5.inflate(byteArray7);
        inflater0.setInput(byteArray7);
        int int10 = inflater0.getRemaining();
        boolean boolean11 = inflater0.needsDictionary();
        inflater0.end();
        boolean boolean13 = inflater0.needsInput();
        int int14 = inflater0.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long15 = inflater0.getBytesRead();
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        int int4 = inflater0.getAdler();
        int int5 = inflater0.getAdler();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        boolean boolean9 = inflater6.finished();
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater6.setInput(byteArray16);
        boolean boolean18 = inflater6.needsDictionary();
        int int19 = inflater6.getRemaining();
        long long20 = inflater6.getBytesWritten();
        java.util.zip.Inflater inflater21 = new java.util.zip.Inflater();
        boolean boolean22 = inflater21.finished();
        int int23 = inflater21.getRemaining();
        boolean boolean24 = inflater21.finished();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        boolean boolean26 = inflater25.finished();
        int int27 = inflater25.getRemaining();
        boolean boolean28 = inflater25.finished();
        byte[] byteArray35 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater25.setInput(byteArray35);
        inflater21.setInput(byteArray35);
        inflater6.setInput(byteArray35);
        inflater0.setInput(byteArray35);
        int int40 = inflater0.getTotalOut();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long42 = inflater0.getBytesRead();
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getTotalIn();
        long long5 = inflater0.getBytesWritten();
        int int6 = inflater0.getAdler();
        inflater0.end();
        int int8 = inflater0.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int9 = inflater0.getTotalIn();
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        boolean boolean20 = inflater0.finished();
        inflater0.end();
        inflater0.end();
        int int23 = inflater0.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long24 = inflater0.getBytesWritten();
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        long long4 = inflater0.getBytesRead();
        boolean boolean5 = inflater0.needsDictionary();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        byte[] byteArray8 = new byte[] { (byte) 1 };
        int int9 = inflater6.inflate(byteArray8);
        long long10 = inflater6.getBytesWritten();
        inflater6.reset();
        long long12 = inflater6.getBytesWritten();
        java.util.zip.Inflater inflater13 = new java.util.zip.Inflater();
        boolean boolean14 = inflater13.finished();
        int int15 = inflater13.getRemaining();
        boolean boolean16 = inflater13.needsDictionary();
        boolean boolean17 = inflater13.needsInput();
        int int18 = inflater13.getRemaining();
        java.util.zip.Inflater inflater19 = new java.util.zip.Inflater();
        boolean boolean20 = inflater19.finished();
        int int21 = inflater19.getRemaining();
        boolean boolean22 = inflater19.finished();
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater19.setInput(byteArray29);
        int int31 = inflater13.inflate(byteArray29);
        inflater6.setInput(byteArray29);
        inflater0.setInput(byteArray29);
        boolean boolean34 = inflater0.needsInput();
        inflater0.end();
        boolean boolean36 = inflater0.needsDictionary();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        int int4 = inflater0.getAdler();
        int int5 = inflater0.getAdler();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        boolean boolean9 = inflater6.finished();
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater6.setInput(byteArray16);
        boolean boolean18 = inflater6.needsDictionary();
        int int19 = inflater6.getRemaining();
        long long20 = inflater6.getBytesWritten();
        java.util.zip.Inflater inflater21 = new java.util.zip.Inflater();
        boolean boolean22 = inflater21.finished();
        int int23 = inflater21.getRemaining();
        boolean boolean24 = inflater21.finished();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        boolean boolean26 = inflater25.finished();
        int int27 = inflater25.getRemaining();
        boolean boolean28 = inflater25.finished();
        byte[] byteArray35 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater25.setInput(byteArray35);
        inflater21.setInput(byteArray35);
        inflater6.setInput(byteArray35);
        inflater0.setInput(byteArray35);
        int int40 = inflater0.getTotalOut();
        inflater0.end();
        boolean boolean42 = inflater0.needsDictionary();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long43 = inflater0.getBytesRead();
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsInput();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int7 = inflater0.getAdler();
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        inflater0.reset();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater0.setInput(byteArray10);
        inflater0.end();
        int int13 = inflater0.getRemaining();
        java.util.zip.Inflater inflater14 = new java.util.zip.Inflater();
        boolean boolean15 = inflater14.finished();
        int int16 = inflater14.getRemaining();
        boolean boolean17 = inflater14.needsDictionary();
        boolean boolean18 = inflater14.needsInput();
        int int19 = inflater14.getRemaining();
        int int20 = inflater14.getTotalOut();
        java.util.zip.Inflater inflater21 = new java.util.zip.Inflater();
        boolean boolean22 = inflater21.finished();
        int int23 = inflater21.getRemaining();
        boolean boolean24 = inflater21.needsDictionary();
        boolean boolean25 = inflater21.needsInput();
        int int26 = inflater21.getRemaining();
        inflater21.reset();
        java.util.zip.Inflater inflater28 = new java.util.zip.Inflater();
        boolean boolean29 = inflater28.finished();
        int int30 = inflater28.getRemaining();
        boolean boolean31 = inflater28.finished();
        byte[] byteArray38 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater28.setInput(byteArray38);
        inflater21.setInput(byteArray38);
        int int41 = inflater21.getTotalOut();
        boolean boolean42 = inflater21.needsDictionary();
        long long43 = inflater21.getBytesWritten();
        java.util.zip.Inflater inflater44 = new java.util.zip.Inflater();
        boolean boolean45 = inflater44.needsDictionary();
        int int46 = inflater44.getTotalOut();
        int int47 = inflater44.getTotalOut();
        long long48 = inflater44.getBytesWritten();
        java.util.zip.Inflater inflater49 = new java.util.zip.Inflater();
        boolean boolean50 = inflater49.finished();
        int int51 = inflater49.getRemaining();
        boolean boolean52 = inflater49.needsDictionary();
        long long53 = inflater49.getBytesRead();
        boolean boolean54 = inflater49.needsDictionary();
        java.util.zip.Inflater inflater55 = new java.util.zip.Inflater();
        byte[] byteArray57 = new byte[] { (byte) 1 };
        int int58 = inflater55.inflate(byteArray57);
        long long59 = inflater55.getBytesWritten();
        inflater55.reset();
        long long61 = inflater55.getBytesWritten();
        java.util.zip.Inflater inflater62 = new java.util.zip.Inflater();
        boolean boolean63 = inflater62.finished();
        int int64 = inflater62.getRemaining();
        boolean boolean65 = inflater62.needsDictionary();
        boolean boolean66 = inflater62.needsInput();
        int int67 = inflater62.getRemaining();
        java.util.zip.Inflater inflater68 = new java.util.zip.Inflater();
        boolean boolean69 = inflater68.finished();
        int int70 = inflater68.getRemaining();
        boolean boolean71 = inflater68.finished();
        byte[] byteArray78 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater68.setInput(byteArray78);
        int int80 = inflater62.inflate(byteArray78);
        inflater55.setInput(byteArray78);
        inflater49.setInput(byteArray78);
        int int83 = inflater44.inflate(byteArray78);
        inflater21.setInput(byteArray78);
        int int87 = inflater14.inflate(byteArray78, 0, (int) (short) 1);
        inflater0.setInput(byteArray78);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        boolean boolean4 = inflater0.finished();
        inflater0.end();
        boolean boolean6 = inflater0.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long7 = inflater0.getBytesRead();
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        int int8 = inflater5.inflate(byteArray7);
        inflater0.setInput(byteArray7);
        int int10 = inflater0.getRemaining();
        boolean boolean11 = inflater0.needsDictionary();
        inflater0.end();
        boolean boolean13 = inflater0.needsInput();
        int int14 = inflater0.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int15 = inflater0.getTotalOut();
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test461");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        boolean boolean6 = inflater5.finished();
        int int7 = inflater5.getRemaining();
        boolean boolean8 = inflater5.needsDictionary();
        long long9 = inflater5.getBytesRead();
        boolean boolean10 = inflater5.needsInput();
        java.util.zip.Inflater inflater11 = new java.util.zip.Inflater();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        int int14 = inflater11.inflate(byteArray13);
        long long15 = inflater11.getBytesWritten();
        inflater11.reset();
        long long17 = inflater11.getBytesWritten();
        java.util.zip.Inflater inflater18 = new java.util.zip.Inflater();
        boolean boolean19 = inflater18.finished();
        int int20 = inflater18.getRemaining();
        boolean boolean21 = inflater18.needsDictionary();
        boolean boolean22 = inflater18.needsInput();
        int int23 = inflater18.getRemaining();
        java.util.zip.Inflater inflater24 = new java.util.zip.Inflater();
        boolean boolean25 = inflater24.finished();
        int int26 = inflater24.getRemaining();
        boolean boolean27 = inflater24.finished();
        byte[] byteArray34 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater24.setInput(byteArray34);
        int int36 = inflater18.inflate(byteArray34);
        inflater11.setInput(byteArray34);
        int int38 = inflater5.inflate(byteArray34);
        inflater0.setInput(byteArray34);
        boolean boolean40 = inflater0.finished();
        java.util.zip.Inflater inflater41 = new java.util.zip.Inflater();
        boolean boolean42 = inflater41.finished();
        int int43 = inflater41.getRemaining();
        int int44 = inflater41.getTotalOut();
        inflater41.reset();
        boolean boolean46 = inflater41.needsInput();
        int int47 = inflater41.getRemaining();
        boolean boolean48 = inflater41.finished();
        int int49 = inflater41.getTotalOut();
        java.util.zip.Inflater inflater50 = new java.util.zip.Inflater();
        byte[] byteArray52 = new byte[] { (byte) 1 };
        int int53 = inflater50.inflate(byteArray52);
        int int54 = inflater50.getTotalOut();
        boolean boolean55 = inflater50.needsInput();
        java.util.zip.Inflater inflater56 = new java.util.zip.Inflater();
        boolean boolean57 = inflater56.finished();
        int int58 = inflater56.getRemaining();
        inflater56.end();
        java.util.zip.Inflater inflater60 = new java.util.zip.Inflater();
        boolean boolean61 = inflater60.finished();
        int int62 = inflater60.getRemaining();
        boolean boolean63 = inflater60.finished();
        byte[] byteArray70 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater60.setInput(byteArray70);
        inflater56.setInput(byteArray70);
        inflater50.setInput(byteArray70);
        int int74 = inflater41.inflate(byteArray70);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.setDictionary(byteArray70);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        boolean boolean21 = inflater0.needsDictionary();
        long long22 = inflater0.getBytesWritten();
        boolean boolean23 = inflater0.needsDictionary();
        long long24 = inflater0.getBytesWritten();
        boolean boolean25 = inflater0.needsInput();
        inflater0.end();
        boolean boolean27 = inflater0.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long28 = inflater0.getBytesRead();
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getTotalIn();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        boolean boolean6 = inflater5.finished();
        int int7 = inflater5.getRemaining();
        inflater5.end();
        boolean boolean9 = inflater5.needsInput();
        java.util.zip.Inflater inflater10 = new java.util.zip.Inflater();
        byte[] byteArray12 = new byte[] { (byte) 1 };
        int int13 = inflater10.inflate(byteArray12);
        inflater5.setInput(byteArray12);
        inflater0.setInput(byteArray12);
        boolean boolean16 = inflater0.needsInput();
        boolean boolean17 = inflater0.finished();
        int int18 = inflater0.getTotalIn();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int20 = inflater0.getAdler();
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int9 = inflater0.inflate(byteArray8);
        int int10 = inflater0.getTotalIn();
        int int11 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean13 = inflater0.needsDictionary();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long14 = inflater0.getBytesRead();
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        int int3 = inflater0.getTotalOut();
        inflater0.reset();
        boolean boolean5 = inflater0.needsInput();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        boolean boolean9 = inflater6.needsDictionary();
        long long10 = inflater6.getBytesRead();
        boolean boolean11 = inflater6.needsDictionary();
        java.util.zip.Inflater inflater12 = new java.util.zip.Inflater();
        byte[] byteArray14 = new byte[] { (byte) 1 };
        int int15 = inflater12.inflate(byteArray14);
        long long16 = inflater12.getBytesWritten();
        inflater12.reset();
        long long18 = inflater12.getBytesWritten();
        java.util.zip.Inflater inflater19 = new java.util.zip.Inflater();
        boolean boolean20 = inflater19.finished();
        int int21 = inflater19.getRemaining();
        boolean boolean22 = inflater19.needsDictionary();
        boolean boolean23 = inflater19.needsInput();
        int int24 = inflater19.getRemaining();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        boolean boolean26 = inflater25.finished();
        int int27 = inflater25.getRemaining();
        boolean boolean28 = inflater25.finished();
        byte[] byteArray35 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater25.setInput(byteArray35);
        int int37 = inflater19.inflate(byteArray35);
        inflater12.setInput(byteArray35);
        inflater6.setInput(byteArray35);
        int int40 = inflater0.inflate(byteArray35);
        inflater0.end();
        inflater0.end();
        boolean boolean43 = inflater0.needsInput();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int45 = inflater0.getAdler();
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test466");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        boolean boolean6 = inflater5.finished();
        int int7 = inflater5.getRemaining();
        boolean boolean8 = inflater5.needsDictionary();
        long long9 = inflater5.getBytesRead();
        boolean boolean10 = inflater5.needsInput();
        java.util.zip.Inflater inflater11 = new java.util.zip.Inflater();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        int int14 = inflater11.inflate(byteArray13);
        long long15 = inflater11.getBytesWritten();
        inflater11.reset();
        long long17 = inflater11.getBytesWritten();
        java.util.zip.Inflater inflater18 = new java.util.zip.Inflater();
        boolean boolean19 = inflater18.finished();
        int int20 = inflater18.getRemaining();
        boolean boolean21 = inflater18.needsDictionary();
        boolean boolean22 = inflater18.needsInput();
        int int23 = inflater18.getRemaining();
        java.util.zip.Inflater inflater24 = new java.util.zip.Inflater();
        boolean boolean25 = inflater24.finished();
        int int26 = inflater24.getRemaining();
        boolean boolean27 = inflater24.finished();
        byte[] byteArray34 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater24.setInput(byteArray34);
        int int36 = inflater18.inflate(byteArray34);
        inflater11.setInput(byteArray34);
        int int38 = inflater5.inflate(byteArray34);
        inflater0.setInput(byteArray34);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int40 = inflater0.getTotalOut();
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test467");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        boolean boolean21 = inflater0.finished();
        inflater0.reset();
        int int23 = inflater0.getTotalOut();
        boolean boolean24 = inflater0.needsInput();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test468");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(true);
        inflater1.end();
        int int3 = inflater1.getRemaining();
        boolean boolean4 = inflater1.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long5 = inflater1.getBytesRead();
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test469");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        boolean boolean20 = inflater0.finished();
        inflater0.end();
        inflater0.end();
        int int23 = inflater0.getRemaining();
        boolean boolean24 = inflater0.finished();
        boolean boolean25 = inflater0.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int26 = inflater0.getTotalOut();
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test470");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        int int4 = inflater0.getRemaining();
        int int5 = inflater0.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int6 = inflater0.getTotalIn();
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test471");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        int int2 = inflater0.getTotalOut();
        int int3 = inflater0.getTotalOut();
        long long4 = inflater0.getBytesWritten();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        boolean boolean6 = inflater5.finished();
        int int7 = inflater5.getRemaining();
        boolean boolean8 = inflater5.needsDictionary();
        long long9 = inflater5.getBytesRead();
        boolean boolean10 = inflater5.needsDictionary();
        java.util.zip.Inflater inflater11 = new java.util.zip.Inflater();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        int int14 = inflater11.inflate(byteArray13);
        long long15 = inflater11.getBytesWritten();
        inflater11.reset();
        long long17 = inflater11.getBytesWritten();
        java.util.zip.Inflater inflater18 = new java.util.zip.Inflater();
        boolean boolean19 = inflater18.finished();
        int int20 = inflater18.getRemaining();
        boolean boolean21 = inflater18.needsDictionary();
        boolean boolean22 = inflater18.needsInput();
        int int23 = inflater18.getRemaining();
        java.util.zip.Inflater inflater24 = new java.util.zip.Inflater();
        boolean boolean25 = inflater24.finished();
        int int26 = inflater24.getRemaining();
        boolean boolean27 = inflater24.finished();
        byte[] byteArray34 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater24.setInput(byteArray34);
        int int36 = inflater18.inflate(byteArray34);
        inflater11.setInput(byteArray34);
        inflater5.setInput(byteArray34);
        int int39 = inflater0.inflate(byteArray34);
        int int40 = inflater0.getTotalOut();
        int int41 = inflater0.getTotalIn();
        java.util.zip.Inflater inflater42 = new java.util.zip.Inflater();
        byte[] byteArray44 = new byte[] { (byte) 1 };
        int int45 = inflater42.inflate(byteArray44);
        inflater42.reset();
        java.util.zip.Inflater inflater47 = new java.util.zip.Inflater();
        byte[] byteArray49 = new byte[] { (byte) 1 };
        int int50 = inflater47.inflate(byteArray49);
        int int51 = inflater47.getTotalIn();
        java.util.zip.Inflater inflater52 = new java.util.zip.Inflater();
        byte[] byteArray54 = new byte[] { (byte) 1 };
        int int55 = inflater52.inflate(byteArray54);
        byte[] byteArray60 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int61 = inflater52.inflate(byteArray60);
        int int62 = inflater47.inflate(byteArray60);
        inflater42.setInput(byteArray60);
        int int64 = inflater0.inflate(byteArray60);
        int int65 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean67 = inflater0.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long68 = inflater0.getBytesWritten();
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test472");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        int int2 = inflater0.getTotalOut();
        int int3 = inflater0.getTotalOut();
        long long4 = inflater0.getBytesWritten();
        int int5 = inflater0.getAdler();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int7 = inflater0.getAdler();
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test473");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getTotalOut();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        int int8 = inflater5.inflate(byteArray7);
        int int9 = inflater5.getTotalIn();
        long long10 = inflater5.getBytesWritten();
        int int11 = inflater5.getTotalIn();
        boolean boolean12 = inflater5.needsDictionary();
        int int13 = inflater5.getAdler();
        java.util.zip.Inflater inflater14 = new java.util.zip.Inflater();
        boolean boolean15 = inflater14.finished();
        int int16 = inflater14.getRemaining();
        inflater14.end();
        boolean boolean18 = inflater14.needsInput();
        java.util.zip.Inflater inflater19 = new java.util.zip.Inflater();
        boolean boolean20 = inflater19.finished();
        int int21 = inflater19.getRemaining();
        boolean boolean22 = inflater19.needsDictionary();
        long long23 = inflater19.getBytesRead();
        boolean boolean24 = inflater19.needsInput();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        byte[] byteArray27 = new byte[] { (byte) 1 };
        int int28 = inflater25.inflate(byteArray27);
        long long29 = inflater25.getBytesWritten();
        inflater25.reset();
        long long31 = inflater25.getBytesWritten();
        java.util.zip.Inflater inflater32 = new java.util.zip.Inflater();
        boolean boolean33 = inflater32.finished();
        int int34 = inflater32.getRemaining();
        boolean boolean35 = inflater32.needsDictionary();
        boolean boolean36 = inflater32.needsInput();
        int int37 = inflater32.getRemaining();
        java.util.zip.Inflater inflater38 = new java.util.zip.Inflater();
        boolean boolean39 = inflater38.finished();
        int int40 = inflater38.getRemaining();
        boolean boolean41 = inflater38.finished();
        byte[] byteArray48 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater38.setInput(byteArray48);
        int int50 = inflater32.inflate(byteArray48);
        inflater25.setInput(byteArray48);
        int int52 = inflater19.inflate(byteArray48);
        inflater14.setInput(byteArray48);
        int int54 = inflater5.inflate(byteArray48);
        java.util.zip.Inflater inflater55 = new java.util.zip.Inflater();
        byte[] byteArray57 = new byte[] { (byte) 1 };
        int int58 = inflater55.inflate(byteArray57);
        int int59 = inflater55.getAdler();
        java.util.zip.Inflater inflater60 = new java.util.zip.Inflater();
        boolean boolean61 = inflater60.finished();
        int int62 = inflater60.getRemaining();
        boolean boolean63 = inflater60.needsInput();
        java.util.zip.Inflater inflater64 = new java.util.zip.Inflater();
        boolean boolean65 = inflater64.finished();
        int int66 = inflater64.getRemaining();
        boolean boolean67 = inflater64.finished();
        byte[] byteArray74 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater64.setInput(byteArray74);
        inflater60.setInput(byteArray74);
        inflater55.setInput(byteArray74);
        int int78 = inflater5.inflate(byteArray74);
        inflater0.setInput(byteArray74);
        boolean boolean80 = inflater0.needsInput();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int82 = inflater0.getAdler();
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test474");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        inflater0.reset();
        boolean boolean2 = inflater0.needsInput();
        inflater0.end();
        boolean boolean4 = inflater0.needsDictionary();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        int int8 = inflater5.inflate(byteArray7);
        int int9 = inflater5.getTotalIn();
        int int10 = inflater5.getTotalOut();
        int int11 = inflater5.getAdler();
        java.util.zip.Inflater inflater12 = new java.util.zip.Inflater();
        byte[] byteArray14 = new byte[] { (byte) 1 };
        int int15 = inflater12.inflate(byteArray14);
        int int16 = inflater12.getTotalIn();
        java.util.zip.Inflater inflater17 = new java.util.zip.Inflater();
        boolean boolean18 = inflater17.finished();
        int int19 = inflater17.getRemaining();
        inflater17.end();
        boolean boolean21 = inflater17.needsInput();
        java.util.zip.Inflater inflater22 = new java.util.zip.Inflater();
        byte[] byteArray24 = new byte[] { (byte) 1 };
        int int25 = inflater22.inflate(byteArray24);
        inflater17.setInput(byteArray24);
        inflater12.setInput(byteArray24);
        java.util.zip.Inflater inflater28 = new java.util.zip.Inflater();
        byte[] byteArray30 = new byte[] { (byte) 1 };
        int int31 = inflater28.inflate(byteArray30);
        int int32 = inflater28.getTotalIn();
        java.util.zip.Inflater inflater33 = new java.util.zip.Inflater();
        byte[] byteArray35 = new byte[] { (byte) 1 };
        int int36 = inflater33.inflate(byteArray35);
        byte[] byteArray41 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int42 = inflater33.inflate(byteArray41);
        int int43 = inflater28.inflate(byteArray41);
        int int44 = inflater28.getTotalOut();
        int int45 = inflater28.getTotalOut();
        long long46 = inflater28.getBytesRead();
        java.util.zip.Inflater inflater47 = new java.util.zip.Inflater();
        boolean boolean48 = inflater47.finished();
        int int49 = inflater47.getRemaining();
        boolean boolean50 = inflater47.finished();
        long long51 = inflater47.getBytesRead();
        boolean boolean52 = inflater47.finished();
        long long53 = inflater47.getBytesRead();
        boolean boolean54 = inflater47.needsDictionary();
        boolean boolean55 = inflater47.needsDictionary();
        java.util.zip.Inflater inflater56 = new java.util.zip.Inflater();
        boolean boolean57 = inflater56.needsDictionary();
        int int58 = inflater56.getTotalOut();
        int int59 = inflater56.getTotalOut();
        boolean boolean60 = inflater56.needsInput();
        java.util.zip.Inflater inflater61 = new java.util.zip.Inflater();
        byte[] byteArray63 = new byte[] { (byte) 1 };
        int int64 = inflater61.inflate(byteArray63);
        inflater61.reset();
        java.util.zip.Inflater inflater66 = new java.util.zip.Inflater();
        byte[] byteArray68 = new byte[] { (byte) 1 };
        int int69 = inflater66.inflate(byteArray68);
        int int70 = inflater66.getTotalIn();
        java.util.zip.Inflater inflater71 = new java.util.zip.Inflater();
        byte[] byteArray73 = new byte[] { (byte) 1 };
        int int74 = inflater71.inflate(byteArray73);
        byte[] byteArray79 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int80 = inflater71.inflate(byteArray79);
        int int81 = inflater66.inflate(byteArray79);
        inflater61.setInput(byteArray79);
        inflater56.setInput(byteArray79);
        int int84 = inflater47.inflate(byteArray79);
        inflater28.setInput(byteArray79);
        inflater12.setInput(byteArray79);
        int int87 = inflater5.inflate(byteArray79);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int88 = inflater0.inflate(byteArray79);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test475");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        boolean boolean21 = inflater0.needsDictionary();
        long long22 = inflater0.getBytesWritten();
        int int23 = inflater0.getRemaining();
        int int24 = inflater0.getRemaining();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        byte[] byteArray27 = new byte[] { (byte) 1 };
        int int28 = inflater25.inflate(byteArray27);
        boolean boolean29 = inflater25.finished();
        inflater25.end();
        inflater25.end();
        boolean boolean32 = inflater25.needsDictionary();
        java.util.zip.Inflater inflater33 = new java.util.zip.Inflater();
        boolean boolean34 = inflater33.finished();
        int int35 = inflater33.getRemaining();
        boolean boolean36 = inflater33.needsInput();
        java.util.zip.Inflater inflater37 = new java.util.zip.Inflater();
        boolean boolean38 = inflater37.finished();
        int int39 = inflater37.getRemaining();
        boolean boolean40 = inflater37.finished();
        byte[] byteArray47 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater37.setInput(byteArray47);
        inflater33.setInput(byteArray47);
        inflater25.setInput(byteArray47);
        inflater0.setInput(byteArray47);
        int int52 = inflater0.getRemaining();
        boolean boolean53 = inflater0.needsInput();
        long long54 = inflater0.getBytesRead();
        boolean boolean55 = inflater0.needsDictionary();
        inflater0.reset();
        inflater0.end();
        java.util.zip.Inflater inflater58 = new java.util.zip.Inflater();
        boolean boolean59 = inflater58.finished();
        int int60 = inflater58.getRemaining();
        boolean boolean61 = inflater58.needsDictionary();
        long long62 = inflater58.getBytesRead();
        boolean boolean63 = inflater58.needsDictionary();
        int int64 = inflater58.getAdler();
        long long65 = inflater58.getBytesRead();
        boolean boolean66 = inflater58.needsDictionary();
        java.util.zip.Inflater inflater67 = new java.util.zip.Inflater();
        boolean boolean68 = inflater67.finished();
        int int69 = inflater67.getRemaining();
        boolean boolean70 = inflater67.needsDictionary();
        long long71 = inflater67.getBytesRead();
        boolean boolean72 = inflater67.needsInput();
        int int73 = inflater67.getTotalOut();
        long long74 = inflater67.getBytesRead();
        java.util.zip.Inflater inflater75 = new java.util.zip.Inflater();
        boolean boolean76 = inflater75.finished();
        int int77 = inflater75.getRemaining();
        boolean boolean78 = inflater75.needsDictionary();
        boolean boolean79 = inflater75.needsInput();
        int int80 = inflater75.getRemaining();
        inflater75.reset();
        java.util.zip.Inflater inflater82 = new java.util.zip.Inflater();
        boolean boolean83 = inflater82.finished();
        int int84 = inflater82.getRemaining();
        boolean boolean85 = inflater82.finished();
        byte[] byteArray92 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater82.setInput(byteArray92);
        inflater75.setInput(byteArray92);
        int int97 = inflater67.inflate(byteArray92, 1, (int) (short) 1);
        inflater58.setInput(byteArray92);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.setDictionary(byteArray92);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test476");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        int int8 = inflater5.inflate(byteArray7);
        inflater0.setInput(byteArray7);
        int int10 = inflater0.getRemaining();
        int int11 = inflater0.getRemaining();
        boolean boolean12 = inflater0.finished();
        inflater0.end();
        inflater0.end();
        java.util.zip.Inflater inflater15 = new java.util.zip.Inflater();
        byte[] byteArray17 = new byte[] { (byte) 1 };
        int int18 = inflater15.inflate(byteArray17);
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int24 = inflater15.inflate(byteArray23);
        boolean boolean25 = inflater15.finished();
        int int26 = inflater15.getTotalOut();
        java.util.zip.Inflater inflater27 = new java.util.zip.Inflater();
        byte[] byteArray29 = new byte[] { (byte) 1 };
        int int30 = inflater27.inflate(byteArray29);
        long long31 = inflater27.getBytesWritten();
        boolean boolean32 = inflater27.needsInput();
        int int33 = inflater27.getRemaining();
        int int34 = inflater27.getAdler();
        java.util.zip.Inflater inflater35 = new java.util.zip.Inflater();
        boolean boolean36 = inflater35.finished();
        int int37 = inflater35.getRemaining();
        boolean boolean38 = inflater35.needsDictionary();
        long long39 = inflater35.getBytesRead();
        long long40 = inflater35.getBytesWritten();
        boolean boolean41 = inflater35.finished();
        java.util.zip.Inflater inflater42 = new java.util.zip.Inflater();
        byte[] byteArray44 = new byte[] { (byte) 1 };
        int int45 = inflater42.inflate(byteArray44);
        boolean boolean46 = inflater42.finished();
        int int47 = inflater42.getRemaining();
        java.util.zip.Inflater inflater48 = new java.util.zip.Inflater();
        byte[] byteArray50 = new byte[] { (byte) 1 };
        int int51 = inflater48.inflate(byteArray50);
        inflater48.reset();
        java.util.zip.Inflater inflater53 = new java.util.zip.Inflater();
        byte[] byteArray55 = new byte[] { (byte) 1 };
        int int56 = inflater53.inflate(byteArray55);
        int int57 = inflater53.getTotalIn();
        java.util.zip.Inflater inflater58 = new java.util.zip.Inflater();
        byte[] byteArray60 = new byte[] { (byte) 1 };
        int int61 = inflater58.inflate(byteArray60);
        byte[] byteArray66 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int67 = inflater58.inflate(byteArray66);
        int int68 = inflater53.inflate(byteArray66);
        inflater48.setInput(byteArray66);
        inflater42.setInput(byteArray66);
        int int71 = inflater35.inflate(byteArray66);
        int int72 = inflater27.inflate(byteArray66);
        int int73 = inflater15.inflate(byteArray66);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.setDictionary(byteArray66);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test477");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        boolean boolean21 = inflater0.needsDictionary();
        long long22 = inflater0.getBytesWritten();
        boolean boolean23 = inflater0.needsDictionary();
        long long24 = inflater0.getBytesWritten();
        boolean boolean25 = inflater0.needsInput();
        inflater0.end();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long28 = inflater0.getBytesRead();
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test478");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        boolean boolean21 = inflater0.needsDictionary();
        long long22 = inflater0.getBytesWritten();
        int int23 = inflater0.getTotalOut();
        inflater0.end();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        boolean boolean26 = inflater25.finished();
        int int27 = inflater25.getRemaining();
        inflater25.end();
        boolean boolean29 = inflater25.needsInput();
        boolean boolean30 = inflater25.needsDictionary();
        boolean boolean31 = inflater25.needsDictionary();
        java.util.zip.Inflater inflater32 = new java.util.zip.Inflater();
        boolean boolean33 = inflater32.needsDictionary();
        int int34 = inflater32.getTotalOut();
        int int35 = inflater32.getTotalOut();
        long long36 = inflater32.getBytesWritten();
        java.util.zip.Inflater inflater37 = new java.util.zip.Inflater();
        boolean boolean38 = inflater37.finished();
        int int39 = inflater37.getRemaining();
        boolean boolean40 = inflater37.needsDictionary();
        boolean boolean41 = inflater37.needsInput();
        int int42 = inflater37.getRemaining();
        java.util.zip.Inflater inflater43 = new java.util.zip.Inflater();
        boolean boolean44 = inflater43.finished();
        int int45 = inflater43.getRemaining();
        boolean boolean46 = inflater43.finished();
        byte[] byteArray53 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater43.setInput(byteArray53);
        int int55 = inflater37.inflate(byteArray53);
        boolean boolean56 = inflater37.finished();
        int int57 = inflater37.getAdler();
        boolean boolean58 = inflater37.finished();
        java.util.zip.Inflater inflater59 = new java.util.zip.Inflater();
        boolean boolean60 = inflater59.finished();
        int int61 = inflater59.getRemaining();
        boolean boolean62 = inflater59.needsDictionary();
        long long63 = inflater59.getBytesRead();
        boolean boolean64 = inflater59.needsDictionary();
        java.util.zip.Inflater inflater65 = new java.util.zip.Inflater();
        byte[] byteArray67 = new byte[] { (byte) 1 };
        int int68 = inflater65.inflate(byteArray67);
        long long69 = inflater65.getBytesWritten();
        inflater65.reset();
        long long71 = inflater65.getBytesWritten();
        java.util.zip.Inflater inflater72 = new java.util.zip.Inflater();
        boolean boolean73 = inflater72.finished();
        int int74 = inflater72.getRemaining();
        boolean boolean75 = inflater72.needsDictionary();
        boolean boolean76 = inflater72.needsInput();
        int int77 = inflater72.getRemaining();
        java.util.zip.Inflater inflater78 = new java.util.zip.Inflater();
        boolean boolean79 = inflater78.finished();
        int int80 = inflater78.getRemaining();
        boolean boolean81 = inflater78.finished();
        byte[] byteArray88 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater78.setInput(byteArray88);
        int int90 = inflater72.inflate(byteArray88);
        inflater65.setInput(byteArray88);
        inflater59.setInput(byteArray88);
        inflater37.setInput(byteArray88);
        inflater32.setInput(byteArray88);
        inflater25.setInput(byteArray88);
        inflater0.setInput(byteArray88);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long97 = inflater0.getBytesRead();
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test479");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater0.setInput(byteArray10);
        boolean boolean12 = inflater0.needsInput();
        boolean boolean13 = inflater0.needsDictionary();
        boolean boolean14 = inflater0.needsInput();
        inflater0.reset();
        long long16 = inflater0.getBytesWritten();
        inflater0.end();
        int int18 = inflater0.getRemaining();
        boolean boolean19 = inflater0.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long20 = inflater0.getBytesWritten();
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test480");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.reset();
        long long6 = inflater0.getBytesWritten();
        inflater0.end();
        inflater0.end();
        int int9 = inflater0.getRemaining();
        inflater0.end();
        java.util.zip.Inflater inflater11 = new java.util.zip.Inflater();
        boolean boolean12 = inflater11.finished();
        int int13 = inflater11.getRemaining();
        boolean boolean14 = inflater11.finished();
        byte[] byteArray21 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater11.setInput(byteArray21);
        boolean boolean23 = inflater11.needsInput();
        boolean boolean24 = inflater11.needsDictionary();
        boolean boolean25 = inflater11.needsInput();
        inflater11.reset();
        java.util.zip.Inflater inflater27 = new java.util.zip.Inflater();
        boolean boolean28 = inflater27.finished();
        int int29 = inflater27.getRemaining();
        boolean boolean30 = inflater27.finished();
        java.util.zip.Inflater inflater31 = new java.util.zip.Inflater();
        boolean boolean32 = inflater31.finished();
        int int33 = inflater31.getRemaining();
        boolean boolean34 = inflater31.finished();
        byte[] byteArray41 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater31.setInput(byteArray41);
        inflater27.setInput(byteArray41);
        int int44 = inflater27.getAdler();
        java.util.zip.Inflater inflater45 = new java.util.zip.Inflater();
        byte[] byteArray47 = new byte[] { (byte) 1 };
        int int48 = inflater45.inflate(byteArray47);
        boolean boolean49 = inflater45.finished();
        int int50 = inflater45.getRemaining();
        java.util.zip.Inflater inflater51 = new java.util.zip.Inflater();
        byte[] byteArray53 = new byte[] { (byte) 1 };
        int int54 = inflater51.inflate(byteArray53);
        inflater51.reset();
        java.util.zip.Inflater inflater56 = new java.util.zip.Inflater();
        byte[] byteArray58 = new byte[] { (byte) 1 };
        int int59 = inflater56.inflate(byteArray58);
        int int60 = inflater56.getTotalIn();
        java.util.zip.Inflater inflater61 = new java.util.zip.Inflater();
        byte[] byteArray63 = new byte[] { (byte) 1 };
        int int64 = inflater61.inflate(byteArray63);
        byte[] byteArray69 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int70 = inflater61.inflate(byteArray69);
        int int71 = inflater56.inflate(byteArray69);
        inflater51.setInput(byteArray69);
        inflater45.setInput(byteArray69);
        inflater27.setInput(byteArray69);
        inflater11.setInput(byteArray69);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int76 = inflater0.inflate(byteArray69);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test481");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        boolean boolean21 = inflater0.needsDictionary();
        long long22 = inflater0.getBytesWritten();
        int int23 = inflater0.getRemaining();
        int int24 = inflater0.getRemaining();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        byte[] byteArray27 = new byte[] { (byte) 1 };
        int int28 = inflater25.inflate(byteArray27);
        boolean boolean29 = inflater25.finished();
        inflater25.end();
        inflater25.end();
        boolean boolean32 = inflater25.needsDictionary();
        java.util.zip.Inflater inflater33 = new java.util.zip.Inflater();
        boolean boolean34 = inflater33.finished();
        int int35 = inflater33.getRemaining();
        boolean boolean36 = inflater33.needsInput();
        java.util.zip.Inflater inflater37 = new java.util.zip.Inflater();
        boolean boolean38 = inflater37.finished();
        int int39 = inflater37.getRemaining();
        boolean boolean40 = inflater37.finished();
        byte[] byteArray47 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater37.setInput(byteArray47);
        inflater33.setInput(byteArray47);
        inflater25.setInput(byteArray47);
        inflater0.setInput(byteArray47);
        int int52 = inflater0.getRemaining();
        boolean boolean53 = inflater0.needsInput();
        long long54 = inflater0.getBytesRead();
        boolean boolean55 = inflater0.needsDictionary();
        inflater0.reset();
        inflater0.end();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int59 = inflater0.getAdler();
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test482");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(true);
        inflater1.end();
        boolean boolean3 = inflater1.needsInput();
        java.util.zip.Inflater inflater4 = new java.util.zip.Inflater();
        boolean boolean5 = inflater4.finished();
        int int6 = inflater4.getRemaining();
        boolean boolean7 = inflater4.needsDictionary();
        boolean boolean8 = inflater4.needsInput();
        int int9 = inflater4.getRemaining();
        java.util.zip.Inflater inflater10 = new java.util.zip.Inflater();
        boolean boolean11 = inflater10.finished();
        int int12 = inflater10.getRemaining();
        boolean boolean13 = inflater10.finished();
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater10.setInput(byteArray20);
        int int22 = inflater4.inflate(byteArray20);
        boolean boolean23 = inflater4.finished();
        int int24 = inflater4.getAdler();
        boolean boolean25 = inflater4.finished();
        int int26 = inflater4.getAdler();
        boolean boolean27 = inflater4.needsInput();
        java.util.zip.Inflater inflater28 = new java.util.zip.Inflater();
        byte[] byteArray30 = new byte[] { (byte) 1 };
        int int31 = inflater28.inflate(byteArray30);
        int int32 = inflater28.getTotalIn();
        java.util.zip.Inflater inflater33 = new java.util.zip.Inflater();
        byte[] byteArray35 = new byte[] { (byte) 1 };
        int int36 = inflater33.inflate(byteArray35);
        byte[] byteArray41 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int42 = inflater33.inflate(byteArray41);
        int int43 = inflater28.inflate(byteArray41);
        int int44 = inflater4.inflate(byteArray41);
        inflater1.setInput(byteArray41);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int46 = inflater1.getTotalIn();
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test483");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(false);
        int int2 = inflater1.getTotalIn();
        boolean boolean3 = inflater1.finished();
        boolean boolean4 = inflater1.needsDictionary();
        boolean boolean5 = inflater1.finished();
        boolean boolean6 = inflater1.needsInput();
        boolean boolean7 = inflater1.needsInput();
        inflater1.end();
        java.util.zip.Inflater inflater9 = new java.util.zip.Inflater();
        boolean boolean10 = inflater9.finished();
        int int11 = inflater9.getRemaining();
        boolean boolean12 = inflater9.finished();
        long long13 = inflater9.getBytesRead();
        int int14 = inflater9.getTotalOut();
        int int15 = inflater9.getAdler();
        java.util.zip.Inflater inflater17 = new java.util.zip.Inflater(true);
        int int18 = inflater17.getRemaining();
        long long19 = inflater17.getBytesRead();
        java.util.zip.Inflater inflater20 = new java.util.zip.Inflater();
        byte[] byteArray22 = new byte[] { (byte) 1 };
        int int23 = inflater20.inflate(byteArray22);
        int int24 = inflater17.inflate(byteArray22);
        int int27 = inflater9.inflate(byteArray22, (int) (short) 1, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        inflater1.setDictionary(byteArray22);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test484");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        int int2 = inflater0.getTotalOut();
        int int3 = inflater0.getAdler();
        int int4 = inflater0.getTotalIn();
        int int5 = inflater0.getAdler();
        int int6 = inflater0.getRemaining();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test485");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        java.util.zip.Inflater inflater4 = new java.util.zip.Inflater();
        boolean boolean5 = inflater4.finished();
        int int6 = inflater4.getRemaining();
        boolean boolean7 = inflater4.finished();
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater4.setInput(byteArray14);
        inflater0.setInput(byteArray14);
        boolean boolean17 = inflater0.needsDictionary();
        boolean boolean18 = inflater0.finished();
        java.util.zip.Inflater inflater19 = new java.util.zip.Inflater();
        boolean boolean20 = inflater19.needsDictionary();
        int int21 = inflater19.getTotalOut();
        int int22 = inflater19.getTotalOut();
        int int23 = inflater19.getAdler();
        boolean boolean24 = inflater19.needsDictionary();
        int int25 = inflater19.getTotalOut();
        java.util.zip.Inflater inflater26 = new java.util.zip.Inflater();
        byte[] byteArray28 = new byte[] { (byte) 1 };
        int int29 = inflater26.inflate(byteArray28);
        boolean boolean30 = inflater26.finished();
        inflater26.end();
        inflater26.end();
        boolean boolean33 = inflater26.needsInput();
        java.util.zip.Inflater inflater34 = new java.util.zip.Inflater();
        boolean boolean35 = inflater34.finished();
        int int36 = inflater34.getRemaining();
        boolean boolean37 = inflater34.needsDictionary();
        boolean boolean38 = inflater34.needsInput();
        int int39 = inflater34.getRemaining();
        inflater34.reset();
        boolean boolean41 = inflater34.needsDictionary();
        int int42 = inflater34.getTotalIn();
        java.util.zip.Inflater inflater43 = new java.util.zip.Inflater();
        boolean boolean44 = inflater43.finished();
        int int45 = inflater43.getRemaining();
        boolean boolean46 = inflater43.needsDictionary();
        boolean boolean47 = inflater43.needsInput();
        int int48 = inflater43.getRemaining();
        inflater43.reset();
        java.util.zip.Inflater inflater50 = new java.util.zip.Inflater();
        boolean boolean51 = inflater50.finished();
        int int52 = inflater50.getRemaining();
        boolean boolean53 = inflater50.needsDictionary();
        boolean boolean54 = inflater50.needsInput();
        int int55 = inflater50.getRemaining();
        inflater50.reset();
        java.util.zip.Inflater inflater57 = new java.util.zip.Inflater();
        boolean boolean58 = inflater57.finished();
        int int59 = inflater57.getRemaining();
        boolean boolean60 = inflater57.finished();
        byte[] byteArray67 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater57.setInput(byteArray67);
        inflater50.setInput(byteArray67);
        int int72 = inflater43.inflate(byteArray67, 0, (int) (byte) 0);
        int int73 = inflater34.inflate(byteArray67);
        inflater26.setInput(byteArray67);
        int int77 = inflater19.inflate(byteArray67, 0, (int) (byte) 0);
        inflater0.setInput(byteArray67);
        boolean boolean79 = inflater0.needsDictionary();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test486");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        int int2 = inflater0.getTotalOut();
        int int3 = inflater0.getTotalOut();
        int int4 = inflater0.getTotalIn();
        boolean boolean5 = inflater0.needsDictionary();
        int int6 = inflater0.getAdler();
        long long7 = inflater0.getBytesRead();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test487");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        int int4 = inflater0.getTotalIn();
        boolean boolean5 = inflater0.needsInput();
        int int6 = inflater0.getTotalOut();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long8 = inflater0.getBytesRead();
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test488");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        long long4 = inflater0.getBytesRead();
        int int5 = inflater0.getTotalOut();
        int int6 = inflater0.getAdler();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        long long11 = inflater7.getBytesRead();
        int int12 = inflater7.getTotalOut();
        int int13 = inflater7.getAdler();
        java.util.zip.Inflater inflater15 = new java.util.zip.Inflater(true);
        int int16 = inflater15.getRemaining();
        long long17 = inflater15.getBytesRead();
        java.util.zip.Inflater inflater18 = new java.util.zip.Inflater();
        byte[] byteArray20 = new byte[] { (byte) 1 };
        int int21 = inflater18.inflate(byteArray20);
        int int22 = inflater15.inflate(byteArray20);
        int int25 = inflater7.inflate(byteArray20, (int) (short) 1, (int) (short) 0);
        inflater0.setInput(byteArray20);
        boolean boolean27 = inflater0.finished();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int29 = inflater0.getAdler();
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test489");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        boolean boolean4 = inflater0.finished();
        inflater0.end();
        boolean boolean6 = inflater0.needsDictionary();
        inflater0.end();
        java.util.zip.Inflater inflater9 = new java.util.zip.Inflater(false);
        int int10 = inflater9.getTotalIn();
        boolean boolean11 = inflater9.finished();
        boolean boolean12 = inflater9.needsDictionary();
        boolean boolean13 = inflater9.finished();
        boolean boolean14 = inflater9.needsInput();
        boolean boolean15 = inflater9.needsInput();
        int int16 = inflater9.getAdler();
        int int17 = inflater9.getRemaining();
        java.util.zip.Inflater inflater18 = new java.util.zip.Inflater();
        boolean boolean19 = inflater18.finished();
        int int20 = inflater18.getRemaining();
        int int21 = inflater18.getTotalOut();
        byte[] byteArray24 = new byte[] { (byte) -1, (byte) -1 };
        inflater18.setInput(byteArray24);
        inflater18.reset();
        boolean boolean27 = inflater18.finished();
        java.util.zip.Inflater inflater29 = new java.util.zip.Inflater(true);
        java.util.zip.Inflater inflater30 = new java.util.zip.Inflater();
        byte[] byteArray32 = new byte[] { (byte) 1 };
        int int33 = inflater30.inflate(byteArray32);
        inflater30.reset();
        java.util.zip.Inflater inflater35 = new java.util.zip.Inflater();
        byte[] byteArray37 = new byte[] { (byte) 1 };
        int int38 = inflater35.inflate(byteArray37);
        long long39 = inflater35.getBytesWritten();
        inflater35.reset();
        long long41 = inflater35.getBytesWritten();
        java.util.zip.Inflater inflater42 = new java.util.zip.Inflater();
        boolean boolean43 = inflater42.finished();
        int int44 = inflater42.getRemaining();
        boolean boolean45 = inflater42.needsDictionary();
        boolean boolean46 = inflater42.needsInput();
        int int47 = inflater42.getRemaining();
        java.util.zip.Inflater inflater48 = new java.util.zip.Inflater();
        boolean boolean49 = inflater48.finished();
        int int50 = inflater48.getRemaining();
        boolean boolean51 = inflater48.finished();
        byte[] byteArray58 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater48.setInput(byteArray58);
        int int60 = inflater42.inflate(byteArray58);
        inflater35.setInput(byteArray58);
        inflater30.setInput(byteArray58);
        inflater29.setDictionary(byteArray58);
        int int64 = inflater18.inflate(byteArray58);
        int int65 = inflater9.inflate(byteArray58);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.setDictionary(byteArray58);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test490");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(false);
        int int2 = inflater1.getAdler();
        boolean boolean3 = inflater1.finished();
        boolean boolean4 = inflater1.needsDictionary();
        inflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater1.reset();
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test491");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        java.util.zip.Inflater inflater5 = new java.util.zip.Inflater();
        boolean boolean6 = inflater5.finished();
        int int7 = inflater5.getRemaining();
        boolean boolean8 = inflater5.needsDictionary();
        long long9 = inflater5.getBytesRead();
        boolean boolean10 = inflater5.needsInput();
        java.util.zip.Inflater inflater11 = new java.util.zip.Inflater();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        int int14 = inflater11.inflate(byteArray13);
        long long15 = inflater11.getBytesWritten();
        inflater11.reset();
        long long17 = inflater11.getBytesWritten();
        java.util.zip.Inflater inflater18 = new java.util.zip.Inflater();
        boolean boolean19 = inflater18.finished();
        int int20 = inflater18.getRemaining();
        boolean boolean21 = inflater18.needsDictionary();
        boolean boolean22 = inflater18.needsInput();
        int int23 = inflater18.getRemaining();
        java.util.zip.Inflater inflater24 = new java.util.zip.Inflater();
        boolean boolean25 = inflater24.finished();
        int int26 = inflater24.getRemaining();
        boolean boolean27 = inflater24.finished();
        byte[] byteArray34 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater24.setInput(byteArray34);
        int int36 = inflater18.inflate(byteArray34);
        inflater11.setInput(byteArray34);
        int int38 = inflater5.inflate(byteArray34);
        inflater0.setInput(byteArray34);
        java.util.zip.Inflater inflater40 = new java.util.zip.Inflater();
        byte[] byteArray42 = new byte[] { (byte) 1 };
        int int43 = inflater40.inflate(byteArray42);
        inflater0.setInput(byteArray42);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test492");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        inflater0.reset();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.finished();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater7.setInput(byteArray17);
        inflater0.setInput(byteArray17);
        int int20 = inflater0.getTotalOut();
        boolean boolean21 = inflater0.needsDictionary();
        long long22 = inflater0.getBytesWritten();
        int int23 = inflater0.getRemaining();
        int int24 = inflater0.getRemaining();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        byte[] byteArray27 = new byte[] { (byte) 1 };
        int int28 = inflater25.inflate(byteArray27);
        boolean boolean29 = inflater25.finished();
        inflater25.end();
        inflater25.end();
        boolean boolean32 = inflater25.needsDictionary();
        java.util.zip.Inflater inflater33 = new java.util.zip.Inflater();
        boolean boolean34 = inflater33.finished();
        int int35 = inflater33.getRemaining();
        boolean boolean36 = inflater33.needsInput();
        java.util.zip.Inflater inflater37 = new java.util.zip.Inflater();
        boolean boolean38 = inflater37.finished();
        int int39 = inflater37.getRemaining();
        boolean boolean40 = inflater37.finished();
        byte[] byteArray47 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater37.setInput(byteArray47);
        inflater33.setInput(byteArray47);
        inflater25.setInput(byteArray47);
        inflater0.setInput(byteArray47);
        int int52 = inflater0.getRemaining();
        boolean boolean53 = inflater0.needsInput();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int55 = inflater0.getTotalIn();
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test493");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        int int2 = inflater0.getTotalOut();
        int int3 = inflater0.getTotalOut();
        long long4 = inflater0.getBytesWritten();
        int int5 = inflater0.getAdler();
        inflater0.end();
        int int7 = inflater0.getRemaining();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        boolean boolean9 = inflater8.needsDictionary();
        int int10 = inflater8.getTotalOut();
        boolean boolean11 = inflater8.finished();
        boolean boolean12 = inflater8.needsDictionary();
        java.util.zip.Inflater inflater13 = new java.util.zip.Inflater();
        boolean boolean14 = inflater13.finished();
        int int15 = inflater13.getRemaining();
        inflater13.end();
        boolean boolean17 = inflater13.needsInput();
        java.util.zip.Inflater inflater18 = new java.util.zip.Inflater();
        byte[] byteArray20 = new byte[] { (byte) 1 };
        int int21 = inflater18.inflate(byteArray20);
        inflater13.setInput(byteArray20);
        inflater8.setInput(byteArray20);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int24 = inflater0.inflate(byteArray20);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test494");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsDictionary();
        int int6 = inflater0.getRemaining();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        byte[] byteArray9 = new byte[] { (byte) 1 };
        int int10 = inflater7.inflate(byteArray9);
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int16 = inflater7.inflate(byteArray15);
        boolean boolean17 = inflater7.needsInput();
        boolean boolean18 = inflater7.finished();
        int int19 = inflater7.getRemaining();
        long long20 = inflater7.getBytesWritten();
        long long21 = inflater7.getBytesRead();
        java.util.zip.Inflater inflater22 = new java.util.zip.Inflater();
        byte[] byteArray24 = new byte[] { (byte) 1 };
        int int25 = inflater22.inflate(byteArray24);
        long long26 = inflater22.getBytesWritten();
        boolean boolean27 = inflater22.needsInput();
        int int28 = inflater22.getRemaining();
        int int29 = inflater22.getAdler();
        java.util.zip.Inflater inflater30 = new java.util.zip.Inflater();
        boolean boolean31 = inflater30.finished();
        int int32 = inflater30.getRemaining();
        boolean boolean33 = inflater30.needsDictionary();
        long long34 = inflater30.getBytesRead();
        long long35 = inflater30.getBytesWritten();
        boolean boolean36 = inflater30.finished();
        java.util.zip.Inflater inflater37 = new java.util.zip.Inflater();
        byte[] byteArray39 = new byte[] { (byte) 1 };
        int int40 = inflater37.inflate(byteArray39);
        boolean boolean41 = inflater37.finished();
        int int42 = inflater37.getRemaining();
        java.util.zip.Inflater inflater43 = new java.util.zip.Inflater();
        byte[] byteArray45 = new byte[] { (byte) 1 };
        int int46 = inflater43.inflate(byteArray45);
        inflater43.reset();
        java.util.zip.Inflater inflater48 = new java.util.zip.Inflater();
        byte[] byteArray50 = new byte[] { (byte) 1 };
        int int51 = inflater48.inflate(byteArray50);
        int int52 = inflater48.getTotalIn();
        java.util.zip.Inflater inflater53 = new java.util.zip.Inflater();
        byte[] byteArray55 = new byte[] { (byte) 1 };
        int int56 = inflater53.inflate(byteArray55);
        byte[] byteArray61 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int62 = inflater53.inflate(byteArray61);
        int int63 = inflater48.inflate(byteArray61);
        inflater43.setInput(byteArray61);
        inflater37.setInput(byteArray61);
        int int66 = inflater30.inflate(byteArray61);
        int int67 = inflater22.inflate(byteArray61);
        inflater7.setInput(byteArray61);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.setDictionary(byteArray61, (int) (byte) 1, 2);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test495");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        int int3 = inflater0.getTotalOut();
        inflater0.reset();
        boolean boolean5 = inflater0.needsInput();
        long long6 = inflater0.getBytesRead();
        boolean boolean7 = inflater0.finished();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int9 = inflater0.getTotalOut();
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test496");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getTotalIn();
        int int5 = inflater0.getAdler();
        int int6 = inflater0.getTotalIn();
        inflater0.end();
        int int8 = inflater0.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long9 = inflater0.getBytesRead();
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test497");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        inflater0.end();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        int int4 = inflater0.getRemaining();
        boolean boolean5 = inflater0.needsDictionary();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int6 = inflater0.getAdler();
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test498");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.reset();
        long long6 = inflater0.getBytesWritten();
        int int7 = inflater0.getTotalIn();
        boolean boolean8 = inflater0.needsDictionary();
        int int9 = inflater0.getTotalOut();
        inflater0.reset();
        long long11 = inflater0.getBytesWritten();
        int int12 = inflater0.getTotalOut();
        inflater0.reset();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int15 = inflater0.getAdler();
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test499");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getTotalIn();
        long long5 = inflater0.getBytesWritten();
        int int6 = inflater0.getAdler();
        int int7 = inflater0.getAdler();
        boolean boolean8 = inflater0.needsInput();
        inflater0.reset();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int11 = inflater0.getTotalIn();
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test500");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.needsDictionary();
        boolean boolean4 = inflater0.needsInput();
        int int5 = inflater0.getRemaining();
        java.util.zip.Inflater inflater6 = new java.util.zip.Inflater();
        boolean boolean7 = inflater6.finished();
        int int8 = inflater6.getRemaining();
        boolean boolean9 = inflater6.finished();
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater6.setInput(byteArray16);
        int int18 = inflater0.inflate(byteArray16);
        boolean boolean19 = inflater0.finished();
        int int20 = inflater0.getTotalIn();
        int int21 = inflater0.getTotalOut();
        int int22 = inflater0.getAdler();
        boolean boolean23 = inflater0.needsDictionary();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }
}

