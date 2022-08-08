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
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long7 = deflater2.getBytesWritten();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.reset();
        deflater1.end();
        byte[] byteArray15 = new byte[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deflater1.setDictionary(byteArray15);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        deflater1.finish();
        int int5 = deflater1.getTotalIn();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long7 = deflater1.getBytesRead();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int7 = deflater2.getTotalOut();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater1.reset();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        deflater1.finish();
        deflater1.reset();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long8 = deflater1.getBytesRead();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        long long3 = deflater1.getBytesWritten();
        deflater1.end();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (short) -1, false);
        java.util.zip.Deflater deflater9 = new java.util.zip.Deflater((int) (byte) 1);
        deflater9.reset();
        int int11 = deflater9.getAdler();
        java.util.zip.Deflater deflater13 = new java.util.zip.Deflater((int) (byte) 1);
        deflater13.reset();
        int int15 = deflater13.getTotalIn();
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater13.setInput(byteArray22);
        deflater9.setInput(byteArray22, 0, 0);
        int int27 = deflater7.deflate(byteArray22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deflater1.setDictionary(byteArray22);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        deflater1.finish();
        deflater1.reset();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int8 = deflater1.getTotalIn();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        deflater2.end();
        boolean boolean7 = deflater2.needsInput();
        deflater2.end();
        java.util.zip.Deflater deflater11 = new java.util.zip.Deflater((-1), true);
        long long12 = deflater11.getBytesWritten();
        deflater11.setLevel(2);
        java.util.zip.Deflater deflater16 = new java.util.zip.Deflater((int) (byte) 1);
        deflater16.reset();
        int int18 = deflater16.getTotalIn();
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater16.setInput(byteArray25);
        deflater16.finish();
        long long28 = deflater16.getBytesRead();
        deflater16.reset();
        java.util.zip.Deflater deflater31 = new java.util.zip.Deflater((int) (byte) 1);
        deflater31.reset();
        int int33 = deflater31.getTotalIn();
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater31.setInput(byteArray40);
        deflater31.finish();
        long long43 = deflater31.getBytesRead();
        deflater31.reset();
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater31.setInput(byteArray51, (int) (short) 0, (int) (short) 1);
        deflater16.setDictionary(byteArray51);
        deflater11.setInput(byteArray51);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int60 = deflater2.deflate(byteArray51, (int) (byte) 0, 6, (int) (short) 0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        int int6 = deflater4.getAdler();
        java.util.zip.Deflater deflater8 = new java.util.zip.Deflater((int) (byte) 1);
        deflater8.reset();
        int int10 = deflater8.getTotalIn();
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater8.setInput(byteArray17);
        deflater4.setInput(byteArray17, 0, 0);
        int int22 = deflater2.deflate(byteArray17);
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int24 = deflater2.getTotalIn();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        deflater2.end();
        boolean boolean7 = deflater2.needsInput();
        deflater2.end();
        deflater2.end();
        java.util.zip.Deflater deflater11 = new java.util.zip.Deflater((int) (byte) -1);
        boolean boolean12 = deflater11.finished();
        java.util.zip.Deflater deflater14 = new java.util.zip.Deflater((int) (byte) 1);
        deflater14.reset();
        int int16 = deflater14.getTotalIn();
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater14.setInput(byteArray23);
        deflater14.finish();
        long long26 = deflater14.getBytesRead();
        java.util.zip.Deflater deflater28 = new java.util.zip.Deflater((int) (byte) 1);
        deflater28.reset();
        int int30 = deflater28.getTotalIn();
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater28.setInput(byteArray37);
        deflater28.finish();
        long long40 = deflater28.getBytesRead();
        deflater28.reset();
        java.util.zip.Deflater deflater43 = new java.util.zip.Deflater((int) (byte) 1);
        deflater43.reset();
        int int45 = deflater43.getTotalIn();
        byte[] byteArray52 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater43.setInput(byteArray52);
        deflater43.finish();
        long long55 = deflater43.getBytesRead();
        deflater43.reset();
        byte[] byteArray63 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater43.setInput(byteArray63, (int) (short) 0, (int) (short) 1);
        deflater28.setDictionary(byteArray63);
        int int68 = deflater14.deflate(byteArray63);
        int int71 = deflater11.deflate(byteArray63, (int) (byte) 1, 2);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater2.setDictionary(byteArray63);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        deflater1.reset();
        java.util.zip.Deflater deflater17 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater19 = new java.util.zip.Deflater((int) (byte) 1);
        deflater19.reset();
        java.util.zip.Deflater deflater22 = new java.util.zip.Deflater((int) (byte) 1);
        deflater22.reset();
        int int24 = deflater22.getTotalIn();
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater22.setInput(byteArray31);
        deflater19.setInput(byteArray31);
        deflater17.setInput(byteArray31);
        deflater17.setStrategy(0);
        boolean boolean37 = deflater17.needsInput();
        java.util.zip.Deflater deflater40 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater42 = new java.util.zip.Deflater((int) (byte) 1);
        deflater42.reset();
        java.util.zip.Deflater deflater45 = new java.util.zip.Deflater((int) (byte) 1);
        deflater45.reset();
        int int47 = deflater45.getTotalIn();
        byte[] byteArray54 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater45.setInput(byteArray54);
        deflater42.setInput(byteArray54);
        deflater40.setInput(byteArray54);
        deflater17.setInput(byteArray54);
        deflater1.setDictionary(byteArray54);
        int int60 = deflater1.getAdler();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int62 = deflater1.getAdler();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        deflater2.end();
        boolean boolean7 = deflater2.needsInput();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int9 = deflater2.getTotalOut();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        java.util.zip.Deflater deflater0 = new java.util.zip.Deflater();
        deflater0.end();
        deflater0.setLevel((int) (short) 1);
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        long long6 = deflater5.getBytesWritten();
        int int7 = deflater5.getTotalOut();
        java.util.zip.Deflater deflater9 = new java.util.zip.Deflater((int) (byte) 1);
        deflater9.reset();
        int int11 = deflater9.getTotalIn();
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater9.setInput(byteArray18);
        deflater9.finish();
        long long21 = deflater9.getBytesRead();
        deflater9.reset();
        java.util.zip.Deflater deflater24 = new java.util.zip.Deflater((int) (byte) 1);
        deflater24.reset();
        int int26 = deflater24.getTotalIn();
        byte[] byteArray33 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater24.setInput(byteArray33);
        deflater24.finish();
        long long36 = deflater24.getBytesRead();
        deflater24.reset();
        byte[] byteArray44 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater24.setInput(byteArray44, (int) (short) 0, (int) (short) 1);
        deflater9.setDictionary(byteArray44);
        deflater5.setDictionary(byteArray44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int50 = deflater0.deflate(byteArray44);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater7.setInput(byteArray16);
        deflater4.setInput(byteArray16);
        deflater2.setInput(byteArray16);
        deflater2.setStrategy(0);
        boolean boolean22 = deflater2.needsInput();
        java.util.zip.Deflater deflater25 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater27 = new java.util.zip.Deflater((int) (byte) 1);
        deflater27.reset();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getTotalIn();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater30.setInput(byteArray39);
        deflater27.setInput(byteArray39);
        deflater25.setInput(byteArray39);
        deflater2.setInput(byteArray39);
        java.util.zip.Deflater deflater45 = new java.util.zip.Deflater((int) (byte) 1);
        deflater45.reset();
        int int47 = deflater45.getTotalIn();
        byte[] byteArray54 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater45.setInput(byteArray54);
        deflater45.finish();
        long long57 = deflater45.getBytesRead();
        deflater45.reset();
        byte[] byteArray65 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater45.setInput(byteArray65, (int) (short) 0, (int) (short) 1);
        deflater2.setInput(byteArray65);
        int int70 = deflater2.getTotalOut();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int72 = deflater2.getTotalOut();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        long long6 = deflater1.getBytesWritten();
        int int7 = deflater1.getTotalOut();
        int int8 = deflater1.getAdler();
        long long9 = deflater1.getBytesWritten();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater1.reset();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        int int3 = deflater2.getTotalIn();
        int int4 = deflater2.getTotalIn();
        boolean boolean5 = deflater2.finished();
        deflater2.end();
        deflater2.setLevel((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long9 = deflater2.getBytesWritten();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        int int3 = deflater2.getTotalIn();
        int int4 = deflater2.getTotalIn();
        boolean boolean5 = deflater2.finished();
        deflater2.end();
        deflater2.setLevel((int) (short) -1);
        deflater2.end();
        boolean boolean10 = deflater2.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int11 = deflater2.getAdler();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        deflater1.finish();
        int int5 = deflater1.getTotalOut();
        boolean boolean6 = deflater1.needsInput();
        long long7 = deflater1.getBytesRead();
        deflater1.reset();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater1.reset();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        long long6 = deflater1.getBytesWritten();
        int int7 = deflater1.getTotalOut();
        int int8 = deflater1.getAdler();
        long long9 = deflater1.getBytesWritten();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int11 = deflater1.getTotalOut();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        java.util.zip.Deflater deflater15 = new java.util.zip.Deflater((int) (byte) 1);
        deflater15.reset();
        int int17 = deflater15.getTotalIn();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater15.setInput(byteArray24);
        deflater15.finish();
        long long27 = deflater15.getBytesRead();
        deflater15.reset();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getTotalIn();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater30.setInput(byteArray39);
        deflater30.finish();
        long long42 = deflater30.getBytesRead();
        deflater30.reset();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater30.setInput(byteArray50, (int) (short) 0, (int) (short) 1);
        deflater15.setDictionary(byteArray50);
        int int55 = deflater1.deflate(byteArray50);
        boolean boolean56 = deflater1.finished();
        int int57 = deflater1.getTotalIn();
        int int58 = deflater1.getTotalIn();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long60 = deflater1.getBytesRead();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        deflater2.end();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int8 = deflater2.getAdler();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        deflater1.reset();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater1.setInput(byteArray21, (int) (short) 0, (int) (short) 1);
        deflater1.reset();
        deflater1.end();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int28 = deflater1.getAdler();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        int int3 = deflater2.getTotalIn();
        int int4 = deflater2.getTotalIn();
        boolean boolean5 = deflater2.finished();
        deflater2.end();
        deflater2.setLevel((int) (short) -1);
        deflater2.end();
        boolean boolean10 = deflater2.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater2.reset();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        deflater2.end();
        boolean boolean7 = deflater2.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long8 = deflater2.getBytesRead();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        java.util.zip.Deflater deflater0 = new java.util.zip.Deflater();
        deflater0.reset();
        long long2 = deflater0.getBytesWritten();
        int int3 = deflater0.getTotalIn();
        deflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int5 = deflater0.getTotalOut();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        int int3 = deflater2.getTotalIn();
        int int4 = deflater2.getTotalIn();
        boolean boolean5 = deflater2.finished();
        deflater2.end();
        deflater2.setLevel((int) (short) -1);
        deflater2.end();
        boolean boolean10 = deflater2.needsInput();
        java.util.zip.Deflater deflater13 = new java.util.zip.Deflater((-1), true);
        long long14 = deflater13.getBytesWritten();
        deflater13.setLevel(2);
        java.util.zip.Deflater deflater18 = new java.util.zip.Deflater((int) (byte) 1);
        deflater18.reset();
        int int20 = deflater18.getTotalIn();
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater18.setInput(byteArray27);
        deflater18.finish();
        long long30 = deflater18.getBytesRead();
        deflater18.reset();
        java.util.zip.Deflater deflater33 = new java.util.zip.Deflater((int) (byte) 1);
        deflater33.reset();
        int int35 = deflater33.getTotalIn();
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater33.setInput(byteArray42);
        deflater33.finish();
        long long45 = deflater33.getBytesRead();
        deflater33.reset();
        byte[] byteArray53 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater33.setInput(byteArray53, (int) (short) 0, (int) (short) 1);
        deflater18.setDictionary(byteArray53);
        deflater13.setInput(byteArray53);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int62 = deflater2.deflate(byteArray53, 3, (int) (short) 0, (int) ' ');
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        deflater2.end();
        deflater2.end();
        deflater2.setLevel((int) (byte) -1);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int10 = deflater2.getTotalOut();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        java.util.zip.Deflater deflater0 = new java.util.zip.Deflater();
        deflater0.end();
        deflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long3 = deflater0.getBytesRead();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        deflater1.reset();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater1.setDictionary(byteArray14);
        long long17 = deflater1.getBytesRead();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int19 = deflater1.getTotalOut();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        deflater1.reset();
        boolean boolean5 = deflater1.finished();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int7 = deflater1.getAdler();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        java.util.zip.Deflater deflater0 = new java.util.zip.Deflater();
        deflater0.end();
        deflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long3 = deflater0.getBytesWritten();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getAdler();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater1.setInput(byteArray14, 0, 0);
        deflater1.end();
        boolean boolean20 = deflater1.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int21 = deflater1.getTotalIn();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        long long3 = deflater1.getBytesWritten();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int5 = deflater1.getTotalIn();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        deflater1.end();
        boolean boolean7 = deflater1.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long8 = deflater1.getBytesRead();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.reset();
        java.util.zip.Deflater deflater14 = new java.util.zip.Deflater((int) (byte) 1);
        deflater14.reset();
        int int16 = deflater14.getTotalIn();
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater14.setInput(byteArray23);
        deflater14.finish();
        long long26 = deflater14.getBytesRead();
        deflater14.reset();
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater14.setInput(byteArray34, (int) (short) 0, (int) (short) 1);
        deflater1.setInput(byteArray34);
        boolean boolean39 = deflater1.finished();
        deflater1.finish();
        java.util.zip.Deflater deflater42 = new java.util.zip.Deflater((int) (byte) 1);
        deflater42.reset();
        int int44 = deflater42.getTotalIn();
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater42.setInput(byteArray51);
        int int53 = deflater1.deflate(byteArray51);
        deflater1.finish();
        long long55 = deflater1.getBytesWritten();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater1.reset();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater7.setInput(byteArray16);
        deflater7.finish();
        long long19 = deflater7.getBytesRead();
        deflater7.reset();
        java.util.zip.Deflater deflater22 = new java.util.zip.Deflater((int) (byte) 1);
        deflater22.reset();
        int int24 = deflater22.getTotalIn();
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater22.setInput(byteArray31);
        deflater22.finish();
        long long34 = deflater22.getBytesRead();
        deflater22.reset();
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater22.setInput(byteArray42, (int) (short) 0, (int) (short) 1);
        deflater7.setDictionary(byteArray42);
        deflater2.setInput(byteArray42);
        long long48 = deflater2.getBytesWritten();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long50 = deflater2.getBytesWritten();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        int int6 = deflater4.getTotalIn();
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater4.setInput(byteArray13);
        deflater1.setInput(byteArray13);
        deflater1.setLevel((int) (byte) -1);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int19 = deflater1.getTotalOut();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        deflater1.finish();
        int int5 = deflater1.getTotalIn();
        deflater1.end();
        deflater1.setStrategy((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long9 = deflater1.getBytesWritten();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        int int6 = deflater4.getTotalIn();
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater4.setInput(byteArray13);
        deflater4.finish();
        long long16 = deflater4.getBytesRead();
        deflater4.reset();
        java.util.zip.Deflater deflater19 = new java.util.zip.Deflater((int) (byte) 1);
        deflater19.reset();
        int int21 = deflater19.getTotalIn();
        byte[] byteArray28 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater19.setInput(byteArray28);
        deflater19.finish();
        long long31 = deflater19.getBytesRead();
        deflater19.reset();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater19.setInput(byteArray39, (int) (short) 0, (int) (short) 1);
        deflater4.setDictionary(byteArray39);
        deflater1.setInput(byteArray39);
        deflater1.end();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int47 = deflater1.getAdler();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        java.util.zip.Deflater deflater15 = new java.util.zip.Deflater((int) (byte) 1);
        deflater15.reset();
        int int17 = deflater15.getTotalIn();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater15.setInput(byteArray24);
        deflater15.finish();
        long long27 = deflater15.getBytesRead();
        deflater15.reset();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getTotalIn();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater30.setInput(byteArray39);
        deflater30.finish();
        long long42 = deflater30.getBytesRead();
        deflater30.reset();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater30.setInput(byteArray50, (int) (short) 0, (int) (short) 1);
        deflater15.setDictionary(byteArray50);
        int int55 = deflater1.deflate(byteArray50);
        deflater1.setLevel(3);
        deflater1.end();
        deflater1.setStrategy((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int61 = deflater1.getTotalOut();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        deflater1.finish();
        int int5 = deflater1.getTotalOut();
        boolean boolean6 = deflater1.needsInput();
        long long7 = deflater1.getBytesRead();
        deflater1.finish();
        java.util.zip.Deflater deflater10 = new java.util.zip.Deflater((int) (byte) -1);
        java.util.zip.Deflater deflater12 = new java.util.zip.Deflater((int) (byte) 1);
        deflater12.reset();
        java.util.zip.Deflater deflater15 = new java.util.zip.Deflater((int) (byte) 1);
        deflater15.reset();
        int int17 = deflater15.getTotalIn();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater15.setInput(byteArray24);
        deflater12.setInput(byteArray24);
        boolean boolean27 = deflater12.needsInput();
        java.util.zip.Deflater deflater29 = new java.util.zip.Deflater((int) (byte) 1);
        deflater29.reset();
        int int31 = deflater29.getTotalIn();
        byte[] byteArray38 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater29.setInput(byteArray38);
        deflater29.finish();
        long long41 = deflater29.getBytesRead();
        deflater29.reset();
        java.util.zip.Deflater deflater45 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater47 = new java.util.zip.Deflater((int) (byte) 1);
        deflater47.reset();
        java.util.zip.Deflater deflater50 = new java.util.zip.Deflater((int) (byte) 1);
        deflater50.reset();
        int int52 = deflater50.getTotalIn();
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater50.setInput(byteArray59);
        deflater47.setInput(byteArray59);
        deflater45.setInput(byteArray59);
        deflater45.setStrategy(0);
        boolean boolean65 = deflater45.needsInput();
        java.util.zip.Deflater deflater68 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater70 = new java.util.zip.Deflater((int) (byte) 1);
        deflater70.reset();
        java.util.zip.Deflater deflater73 = new java.util.zip.Deflater((int) (byte) 1);
        deflater73.reset();
        int int75 = deflater73.getTotalIn();
        byte[] byteArray82 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater73.setInput(byteArray82);
        deflater70.setInput(byteArray82);
        deflater68.setInput(byteArray82);
        deflater45.setInput(byteArray82);
        deflater29.setDictionary(byteArray82);
        int int88 = deflater12.deflate(byteArray82);
        int int89 = deflater10.deflate(byteArray82);
        deflater1.setDictionary(byteArray82);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int92 = deflater1.getAdler();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        deflater1.reset();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater1.setInput(byteArray21, (int) (short) 0, (int) (short) 1);
        deflater1.reset();
        deflater1.reset();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long28 = deflater1.getBytesWritten();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        deflater2.end();
        boolean boolean7 = deflater2.needsInput();
        deflater2.setLevel(6);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long10 = deflater2.getBytesWritten();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        java.util.zip.Deflater deflater0 = new java.util.zip.Deflater();
        deflater0.end();
        deflater0.end();
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        int int6 = deflater4.getTotalIn();
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater4.setInput(byteArray13);
        deflater4.finish();
        long long16 = deflater4.getBytesRead();
        deflater4.reset();
        int int18 = deflater4.getAdler();
        boolean boolean19 = deflater4.needsInput();
        java.util.zip.Deflater deflater21 = new java.util.zip.Deflater((int) (byte) 1);
        deflater21.reset();
        int int23 = deflater21.getTotalIn();
        java.util.zip.Deflater deflater25 = new java.util.zip.Deflater((int) (byte) 1);
        deflater25.reset();
        int int27 = deflater25.getTotalIn();
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater25.setInput(byteArray34);
        deflater25.finish();
        long long37 = deflater25.getBytesRead();
        deflater25.reset();
        java.util.zip.Deflater deflater41 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater43 = new java.util.zip.Deflater((int) (byte) 1);
        deflater43.reset();
        java.util.zip.Deflater deflater46 = new java.util.zip.Deflater((int) (byte) 1);
        deflater46.reset();
        int int48 = deflater46.getTotalIn();
        byte[] byteArray55 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater46.setInput(byteArray55);
        deflater43.setInput(byteArray55);
        deflater41.setInput(byteArray55);
        deflater41.setStrategy(0);
        boolean boolean61 = deflater41.needsInput();
        java.util.zip.Deflater deflater64 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater66 = new java.util.zip.Deflater((int) (byte) 1);
        deflater66.reset();
        java.util.zip.Deflater deflater69 = new java.util.zip.Deflater((int) (byte) 1);
        deflater69.reset();
        int int71 = deflater69.getTotalIn();
        byte[] byteArray78 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater69.setInput(byteArray78);
        deflater66.setInput(byteArray78);
        deflater64.setInput(byteArray78);
        deflater41.setInput(byteArray78);
        deflater25.setDictionary(byteArray78);
        int int84 = deflater21.deflate(byteArray78);
        int int85 = deflater4.deflate(byteArray78);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater0.setDictionary(byteArray78);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(1, true);
        boolean boolean3 = deflater2.needsInput();
        deflater2.end();
        java.util.zip.Deflater deflater6 = new java.util.zip.Deflater((int) (byte) 1);
        deflater6.reset();
        int int8 = deflater6.getTotalIn();
        deflater6.finish();
        int int10 = deflater6.getTotalOut();
        boolean boolean11 = deflater6.needsInput();
        long long12 = deflater6.getBytesRead();
        deflater6.finish();
        java.util.zip.Deflater deflater15 = new java.util.zip.Deflater((int) (byte) -1);
        java.util.zip.Deflater deflater17 = new java.util.zip.Deflater((int) (byte) 1);
        deflater17.reset();
        java.util.zip.Deflater deflater20 = new java.util.zip.Deflater((int) (byte) 1);
        deflater20.reset();
        int int22 = deflater20.getTotalIn();
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater20.setInput(byteArray29);
        deflater17.setInput(byteArray29);
        boolean boolean32 = deflater17.needsInput();
        java.util.zip.Deflater deflater34 = new java.util.zip.Deflater((int) (byte) 1);
        deflater34.reset();
        int int36 = deflater34.getTotalIn();
        byte[] byteArray43 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater34.setInput(byteArray43);
        deflater34.finish();
        long long46 = deflater34.getBytesRead();
        deflater34.reset();
        java.util.zip.Deflater deflater50 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater52 = new java.util.zip.Deflater((int) (byte) 1);
        deflater52.reset();
        java.util.zip.Deflater deflater55 = new java.util.zip.Deflater((int) (byte) 1);
        deflater55.reset();
        int int57 = deflater55.getTotalIn();
        byte[] byteArray64 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater55.setInput(byteArray64);
        deflater52.setInput(byteArray64);
        deflater50.setInput(byteArray64);
        deflater50.setStrategy(0);
        boolean boolean70 = deflater50.needsInput();
        java.util.zip.Deflater deflater73 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater75 = new java.util.zip.Deflater((int) (byte) 1);
        deflater75.reset();
        java.util.zip.Deflater deflater78 = new java.util.zip.Deflater((int) (byte) 1);
        deflater78.reset();
        int int80 = deflater78.getTotalIn();
        byte[] byteArray87 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater78.setInput(byteArray87);
        deflater75.setInput(byteArray87);
        deflater73.setInput(byteArray87);
        deflater50.setInput(byteArray87);
        deflater34.setDictionary(byteArray87);
        int int93 = deflater17.deflate(byteArray87);
        int int94 = deflater15.deflate(byteArray87);
        deflater6.setDictionary(byteArray87);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deflater2.setDictionary(byteArray87);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater5.finish();
        long long17 = deflater5.getBytesRead();
        deflater5.reset();
        java.util.zip.Deflater deflater20 = new java.util.zip.Deflater((int) (byte) 1);
        deflater20.reset();
        int int22 = deflater20.getTotalIn();
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater20.setInput(byteArray29);
        deflater20.finish();
        long long32 = deflater20.getBytesRead();
        deflater20.reset();
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater20.setInput(byteArray40, (int) (short) 0, (int) (short) 1);
        deflater5.setDictionary(byteArray40);
        deflater1.setInput(byteArray40);
        deflater1.end();
        boolean boolean47 = deflater1.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int48 = deflater1.getAdler();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        java.util.zip.Deflater deflater0 = new java.util.zip.Deflater();
        deflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int2 = deflater0.getTotalIn();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        int int3 = deflater2.getTotalIn();
        int int4 = deflater2.getTotalIn();
        boolean boolean5 = deflater2.finished();
        deflater2.end();
        deflater2.setLevel((int) (short) -1);
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater2.reset();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater9 = new java.util.zip.Deflater((int) (byte) 1);
        deflater9.reset();
        java.util.zip.Deflater deflater12 = new java.util.zip.Deflater((int) (byte) 1);
        deflater12.reset();
        int int14 = deflater12.getTotalIn();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater12.setInput(byteArray21);
        deflater9.setInput(byteArray21);
        deflater7.setInput(byteArray21);
        deflater7.setStrategy(0);
        boolean boolean27 = deflater7.needsInput();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater32 = new java.util.zip.Deflater((int) (byte) 1);
        deflater32.reset();
        java.util.zip.Deflater deflater35 = new java.util.zip.Deflater((int) (byte) 1);
        deflater35.reset();
        int int37 = deflater35.getTotalIn();
        byte[] byteArray44 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater35.setInput(byteArray44);
        deflater32.setInput(byteArray44);
        deflater30.setInput(byteArray44);
        deflater7.setInput(byteArray44);
        java.util.zip.Deflater deflater50 = new java.util.zip.Deflater((int) (byte) 1);
        deflater50.reset();
        int int52 = deflater50.getTotalIn();
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater50.setInput(byteArray59);
        deflater50.finish();
        long long62 = deflater50.getBytesRead();
        deflater50.reset();
        byte[] byteArray70 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater50.setInput(byteArray70, (int) (short) 0, (int) (short) 1);
        deflater7.setInput(byteArray70);
        int int75 = deflater1.deflate(byteArray70);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater1.reset();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater7.setInput(byteArray16);
        deflater7.finish();
        long long19 = deflater7.getBytesRead();
        deflater7.reset();
        java.util.zip.Deflater deflater22 = new java.util.zip.Deflater((int) (byte) 1);
        deflater22.reset();
        int int24 = deflater22.getTotalIn();
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater22.setInput(byteArray31);
        deflater22.finish();
        long long34 = deflater22.getBytesRead();
        deflater22.reset();
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater22.setInput(byteArray42, (int) (short) 0, (int) (short) 1);
        deflater7.setDictionary(byteArray42);
        deflater2.setInput(byteArray42);
        int int48 = deflater2.getTotalIn();
        deflater2.reset();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long51 = deflater2.getBytesWritten();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getAdler();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater1.setInput(byteArray14, 0, 0);
        int int19 = deflater1.getTotalIn();
        deflater1.end();
        java.util.zip.Deflater deflater22 = new java.util.zip.Deflater((int) (byte) 1);
        deflater22.reset();
        int int24 = deflater22.getTotalIn();
        int int25 = deflater22.getTotalIn();
        java.util.zip.Deflater deflater28 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        java.util.zip.Deflater deflater33 = new java.util.zip.Deflater((int) (byte) 1);
        deflater33.reset();
        int int35 = deflater33.getTotalIn();
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater33.setInput(byteArray42);
        deflater30.setInput(byteArray42);
        deflater28.setInput(byteArray42);
        deflater28.setStrategy(0);
        boolean boolean48 = deflater28.needsInput();
        java.util.zip.Deflater deflater51 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater53 = new java.util.zip.Deflater((int) (byte) 1);
        deflater53.reset();
        java.util.zip.Deflater deflater56 = new java.util.zip.Deflater((int) (byte) 1);
        deflater56.reset();
        int int58 = deflater56.getTotalIn();
        byte[] byteArray65 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater56.setInput(byteArray65);
        deflater53.setInput(byteArray65);
        deflater51.setInput(byteArray65);
        deflater28.setInput(byteArray65);
        java.util.zip.Deflater deflater71 = new java.util.zip.Deflater((int) (byte) 1);
        deflater71.reset();
        int int73 = deflater71.getTotalIn();
        byte[] byteArray80 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater71.setInput(byteArray80);
        deflater71.finish();
        long long83 = deflater71.getBytesRead();
        deflater71.reset();
        byte[] byteArray91 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater71.setInput(byteArray91, (int) (short) 0, (int) (short) 1);
        deflater28.setInput(byteArray91);
        int int96 = deflater22.deflate(byteArray91);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deflater1.setDictionary(byteArray91);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getAdler();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater1.setInput(byteArray14, 0, 0);
        deflater1.end();
        boolean boolean20 = deflater1.needsInput();
        boolean boolean21 = deflater1.finished();
        java.util.zip.Deflater deflater24 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater26 = new java.util.zip.Deflater((int) (byte) 1);
        deflater26.reset();
        java.util.zip.Deflater deflater29 = new java.util.zip.Deflater((int) (byte) 1);
        deflater29.reset();
        int int31 = deflater29.getTotalIn();
        byte[] byteArray38 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater29.setInput(byteArray38);
        deflater26.setInput(byteArray38);
        deflater24.setInput(byteArray38);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int45 = deflater1.deflate(byteArray38, (int) (byte) 0, 0, (int) '#');
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater7.setInput(byteArray16);
        deflater7.finish();
        long long19 = deflater7.getBytesRead();
        deflater7.reset();
        java.util.zip.Deflater deflater22 = new java.util.zip.Deflater((int) (byte) 1);
        deflater22.reset();
        int int24 = deflater22.getTotalIn();
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater22.setInput(byteArray31);
        deflater22.finish();
        long long34 = deflater22.getBytesRead();
        deflater22.reset();
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater22.setInput(byteArray42, (int) (short) 0, (int) (short) 1);
        deflater7.setDictionary(byteArray42);
        deflater2.setInput(byteArray42);
        boolean boolean48 = deflater2.finished();
        deflater2.end();
        boolean boolean50 = deflater2.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater2.reset();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) -1);
        boolean boolean2 = deflater1.finished();
        deflater1.finish();
        deflater1.end();
        boolean boolean5 = deflater1.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int6 = deflater1.getTotalOut();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        int int6 = deflater4.getTotalIn();
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater4.setInput(byteArray13);
        deflater1.setInput(byteArray13);
        int int16 = deflater1.getTotalIn();
        deflater1.reset();
        long long18 = deflater1.getBytesWritten();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long20 = deflater1.getBytesWritten();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        int int6 = deflater4.getAdler();
        java.util.zip.Deflater deflater8 = new java.util.zip.Deflater((int) (byte) 1);
        deflater8.reset();
        int int10 = deflater8.getTotalIn();
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater8.setInput(byteArray17);
        deflater4.setInput(byteArray17, 0, 0);
        int int22 = deflater2.deflate(byteArray17);
        deflater2.end();
        java.util.zip.Deflater deflater25 = new java.util.zip.Deflater((int) (byte) 1);
        long long26 = deflater25.getBytesWritten();
        int int27 = deflater25.getTotalIn();
        java.util.zip.Deflater deflater29 = new java.util.zip.Deflater((int) (byte) 1);
        deflater29.reset();
        int int31 = deflater29.getTotalIn();
        byte[] byteArray38 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater29.setInput(byteArray38);
        deflater29.finish();
        long long41 = deflater29.getBytesRead();
        deflater29.reset();
        java.util.zip.Deflater deflater44 = new java.util.zip.Deflater((int) (byte) 1);
        deflater44.reset();
        int int46 = deflater44.getTotalIn();
        byte[] byteArray53 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater44.setInput(byteArray53);
        deflater44.finish();
        long long56 = deflater44.getBytesRead();
        deflater44.reset();
        byte[] byteArray64 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater44.setInput(byteArray64, (int) (short) 0, (int) (short) 1);
        deflater29.setDictionary(byteArray64);
        int int69 = deflater25.deflate(byteArray64);
        deflater2.setInput(byteArray64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int71 = deflater2.getTotalOut();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        int int3 = deflater2.getTotalIn();
        int int4 = deflater2.getTotalIn();
        boolean boolean5 = deflater2.finished();
        deflater2.end();
        deflater2.finish();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int8 = deflater2.getTotalOut();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        java.util.zip.Deflater deflater0 = new java.util.zip.Deflater();
        deflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int2 = deflater0.getAdler();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        deflater2.end();
        deflater2.end();
        java.util.zip.Deflater deflater9 = new java.util.zip.Deflater((int) (byte) 1);
        deflater9.reset();
        java.util.zip.Deflater deflater12 = new java.util.zip.Deflater((int) (byte) 1);
        deflater12.reset();
        int int14 = deflater12.getTotalIn();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater12.setInput(byteArray21);
        deflater9.setInput(byteArray21);
        int int24 = deflater9.getTotalIn();
        int int25 = deflater9.getTotalOut();
        java.util.zip.Deflater deflater27 = new java.util.zip.Deflater((int) (byte) 1);
        deflater27.reset();
        int int29 = deflater27.getTotalIn();
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater27.setInput(byteArray36);
        deflater27.finish();
        long long39 = deflater27.getBytesRead();
        deflater27.reset();
        int int41 = deflater27.getAdler();
        boolean boolean42 = deflater27.needsInput();
        int int43 = deflater27.getTotalIn();
        int int44 = deflater27.getTotalIn();
        java.util.zip.Deflater deflater46 = new java.util.zip.Deflater((int) (byte) 1);
        deflater46.reset();
        int int48 = deflater46.getTotalIn();
        byte[] byteArray55 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater46.setInput(byteArray55);
        deflater46.finish();
        long long58 = deflater46.getBytesRead();
        deflater46.reset();
        java.util.zip.Deflater deflater61 = new java.util.zip.Deflater((int) (byte) 1);
        deflater61.reset();
        int int63 = deflater61.getTotalIn();
        byte[] byteArray70 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater61.setInput(byteArray70);
        deflater61.finish();
        long long73 = deflater61.getBytesRead();
        deflater61.reset();
        byte[] byteArray81 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater61.setInput(byteArray81, (int) (short) 0, (int) (short) 1);
        int int85 = deflater46.deflate(byteArray81);
        deflater27.setDictionary(byteArray81);
        deflater9.setInput(byteArray81);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater2.setDictionary(byteArray81);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        deflater1.finish();
        int int5 = deflater1.getTotalIn();
        deflater1.end();
        deflater1.setStrategy((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = deflater1.getTotalOut();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        deflater1.finish();
        int int5 = deflater1.getTotalIn();
        deflater1.end();
        java.util.zip.Deflater deflater8 = new java.util.zip.Deflater((int) (byte) 1);
        deflater8.reset();
        int int10 = deflater8.getTotalIn();
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater8.setInput(byteArray17);
        deflater8.finish();
        long long20 = deflater8.getBytesRead();
        deflater8.reset();
        int int22 = deflater8.getAdler();
        byte[] byteArray24 = new byte[] { (byte) 10 };
        deflater8.setDictionary(byteArray24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deflater1.setDictionary(byteArray24);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        java.util.zip.Deflater deflater15 = new java.util.zip.Deflater((int) (byte) 1);
        deflater15.reset();
        int int17 = deflater15.getTotalIn();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater15.setInput(byteArray24);
        deflater15.finish();
        long long27 = deflater15.getBytesRead();
        deflater15.reset();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getTotalIn();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater30.setInput(byteArray39);
        deflater30.finish();
        long long42 = deflater30.getBytesRead();
        deflater30.reset();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater30.setInput(byteArray50, (int) (short) 0, (int) (short) 1);
        deflater15.setDictionary(byteArray50);
        int int55 = deflater1.deflate(byteArray50);
        deflater1.setLevel(3);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long59 = deflater1.getBytesRead();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        int int6 = deflater4.getAdler();
        java.util.zip.Deflater deflater8 = new java.util.zip.Deflater((int) (byte) 1);
        deflater8.reset();
        int int10 = deflater8.getTotalIn();
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater8.setInput(byteArray17);
        deflater4.setInput(byteArray17, 0, 0);
        int int22 = deflater2.deflate(byteArray17);
        deflater2.reset();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long25 = deflater2.getBytesRead();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        int int3 = deflater1.getTotalOut();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater5.finish();
        long long17 = deflater5.getBytesRead();
        deflater5.reset();
        java.util.zip.Deflater deflater20 = new java.util.zip.Deflater((int) (byte) 1);
        deflater20.reset();
        int int22 = deflater20.getTotalIn();
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater20.setInput(byteArray29);
        deflater20.finish();
        long long32 = deflater20.getBytesRead();
        deflater20.reset();
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater20.setInput(byteArray40, (int) (short) 0, (int) (short) 1);
        deflater5.setDictionary(byteArray40);
        deflater1.setDictionary(byteArray40);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int47 = deflater1.getAdler();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.reset();
        java.util.zip.Deflater deflater14 = new java.util.zip.Deflater((int) (byte) 1);
        deflater14.reset();
        int int16 = deflater14.getTotalIn();
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater14.setInput(byteArray23);
        deflater14.finish();
        long long26 = deflater14.getBytesRead();
        deflater14.reset();
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater14.setInput(byteArray34, (int) (short) 0, (int) (short) 1);
        deflater1.setInput(byteArray34);
        boolean boolean39 = deflater1.finished();
        deflater1.finish();
        java.util.zip.Deflater deflater42 = new java.util.zip.Deflater((int) (byte) 1);
        deflater42.reset();
        int int44 = deflater42.getTotalIn();
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater42.setInput(byteArray51);
        int int53 = deflater1.deflate(byteArray51);
        deflater1.finish();
        long long55 = deflater1.getBytesWritten();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int57 = deflater1.getTotalIn();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        long long6 = deflater1.getBytesWritten();
        int int7 = deflater1.getTotalOut();
        int int8 = deflater1.getAdler();
        long long9 = deflater1.getBytesWritten();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long11 = deflater1.getBytesWritten();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater5.finish();
        long long17 = deflater5.getBytesRead();
        deflater5.reset();
        java.util.zip.Deflater deflater20 = new java.util.zip.Deflater((int) (byte) 1);
        deflater20.reset();
        int int22 = deflater20.getTotalIn();
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater20.setInput(byteArray29);
        deflater20.finish();
        long long32 = deflater20.getBytesRead();
        deflater20.reset();
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater20.setInput(byteArray40, (int) (short) 0, (int) (short) 1);
        deflater5.setDictionary(byteArray40);
        deflater1.setInput(byteArray40);
        deflater1.end();
        boolean boolean47 = deflater1.needsInput();
        boolean boolean48 = deflater1.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long49 = deflater1.getBytesWritten();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        long long6 = deflater1.getBytesWritten();
        int int7 = deflater1.getTotalOut();
        int int8 = deflater1.getAdler();
        long long9 = deflater1.getBytesWritten();
        deflater1.end();
        boolean boolean11 = deflater1.finished();
        java.util.zip.Deflater deflater13 = new java.util.zip.Deflater((int) (byte) 1);
        deflater13.reset();
        int int15 = deflater13.getTotalIn();
        int int16 = deflater13.getTotalIn();
        int int17 = deflater13.getTotalIn();
        int int18 = deflater13.getTotalOut();
        deflater13.finish();
        java.util.zip.Deflater deflater21 = new java.util.zip.Deflater((int) (byte) 1);
        deflater21.reset();
        int int23 = deflater21.getTotalIn();
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater21.setInput(byteArray30);
        deflater21.finish();
        long long33 = deflater21.getBytesRead();
        deflater21.reset();
        int int35 = deflater21.getAdler();
        byte[] byteArray37 = new byte[] { (byte) 10 };
        deflater21.setDictionary(byteArray37);
        deflater13.setDictionary(byteArray37);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater1.setDictionary(byteArray37);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        int int3 = deflater2.getTotalIn();
        int int4 = deflater2.getTotalIn();
        boolean boolean5 = deflater2.finished();
        deflater2.end();
        deflater2.setLevel((int) (short) -1);
        deflater2.end();
        boolean boolean10 = deflater2.finished();
        java.util.zip.Deflater deflater13 = new java.util.zip.Deflater((int) (short) -1, false);
        deflater13.finish();
        java.util.zip.Deflater deflater16 = new java.util.zip.Deflater((int) (byte) 1);
        long long17 = deflater16.getBytesWritten();
        int int18 = deflater16.getTotalOut();
        long long19 = deflater16.getBytesWritten();
        deflater16.reset();
        deflater16.reset();
        java.util.zip.Deflater deflater23 = new java.util.zip.Deflater((int) (byte) 1);
        deflater23.reset();
        int int25 = deflater23.getTotalIn();
        int int26 = deflater23.getTotalIn();
        int int27 = deflater23.getTotalIn();
        long long28 = deflater23.getBytesWritten();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getTotalIn();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater30.setInput(byteArray39);
        deflater30.finish();
        long long42 = deflater30.getBytesRead();
        deflater30.reset();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater30.setInput(byteArray50, (int) (short) 0, (int) (short) 1);
        deflater30.reset();
        deflater30.reset();
        java.util.zip.Deflater deflater57 = new java.util.zip.Deflater((int) (byte) 1);
        long long58 = deflater57.getBytesWritten();
        int int59 = deflater57.getTotalOut();
        long long60 = deflater57.getBytesWritten();
        java.util.zip.Deflater deflater62 = new java.util.zip.Deflater((int) (byte) 1);
        deflater62.reset();
        deflater62.reset();
        java.util.zip.Deflater deflater66 = new java.util.zip.Deflater((int) (byte) 1);
        deflater66.reset();
        int int68 = deflater66.getTotalIn();
        byte[] byteArray75 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater66.setInput(byteArray75);
        deflater62.setDictionary(byteArray75);
        deflater57.setDictionary(byteArray75);
        deflater30.setInput(byteArray75);
        deflater23.setDictionary(byteArray75, 2, (int) (short) 0);
        int int83 = deflater16.deflate(byteArray75);
        int int84 = deflater13.deflate(byteArray75);
        deflater2.setInput(byteArray75);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int86 = deflater2.getAdler();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        deflater1.finish();
        deflater1.reset();
        deflater1.end();
        boolean boolean8 = deflater1.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater1.reset();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        int int3 = deflater2.getTotalIn();
        int int4 = deflater2.getTotalIn();
        boolean boolean5 = deflater2.finished();
        deflater2.end();
        deflater2.setLevel((int) (short) -1);
        java.util.zip.Deflater deflater10 = new java.util.zip.Deflater((int) (byte) 1);
        deflater10.reset();
        int int12 = deflater10.getTotalIn();
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater10.setInput(byteArray19);
        deflater10.finish();
        long long22 = deflater10.getBytesRead();
        deflater10.reset();
        int int24 = deflater10.getTotalIn();
        deflater10.finish();
        java.util.zip.Deflater deflater28 = new java.util.zip.Deflater(3, true);
        int int29 = deflater28.getAdler();
        java.util.zip.Deflater deflater32 = new java.util.zip.Deflater((-1), true);
        long long33 = deflater32.getBytesWritten();
        deflater32.setLevel(2);
        java.util.zip.Deflater deflater37 = new java.util.zip.Deflater((int) (byte) 1);
        deflater37.reset();
        int int39 = deflater37.getTotalIn();
        byte[] byteArray46 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater37.setInput(byteArray46);
        deflater37.finish();
        long long49 = deflater37.getBytesRead();
        deflater37.reset();
        java.util.zip.Deflater deflater52 = new java.util.zip.Deflater((int) (byte) 1);
        deflater52.reset();
        int int54 = deflater52.getTotalIn();
        byte[] byteArray61 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater52.setInput(byteArray61);
        deflater52.finish();
        long long64 = deflater52.getBytesRead();
        deflater52.reset();
        byte[] byteArray72 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater52.setInput(byteArray72, (int) (short) 0, (int) (short) 1);
        deflater37.setDictionary(byteArray72);
        deflater32.setInput(byteArray72);
        deflater28.setDictionary(byteArray72);
        deflater10.setInput(byteArray72);
        deflater2.setInput(byteArray72);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long81 = deflater2.getBytesWritten();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        long long3 = deflater1.getBytesWritten();
        deflater1.setLevel((int) (byte) 0);
        deflater1.reset();
        deflater1.end();
        deflater1.finish();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater1.reset();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        java.util.zip.Deflater deflater15 = new java.util.zip.Deflater((int) (byte) 1);
        deflater15.reset();
        int int17 = deflater15.getTotalIn();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater15.setInput(byteArray24);
        deflater15.finish();
        long long27 = deflater15.getBytesRead();
        deflater15.reset();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getTotalIn();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater30.setInput(byteArray39);
        deflater30.finish();
        long long42 = deflater30.getBytesRead();
        deflater30.reset();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater30.setInput(byteArray50, (int) (short) 0, (int) (short) 1);
        deflater15.setDictionary(byteArray50);
        int int55 = deflater1.deflate(byteArray50);
        deflater1.setLevel(3);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int59 = deflater1.getTotalIn();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 0);
        long long2 = deflater1.getBytesRead();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater1.reset();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        int int12 = deflater1.getAdler();
        boolean boolean13 = deflater1.finished();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int15 = deflater1.getTotalIn();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        int int6 = deflater1.getTotalOut();
        deflater1.finish();
        int int8 = deflater1.getAdler();
        deflater1.end();
        deflater1.setLevel(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long12 = deflater1.getBytesRead();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        int int3 = deflater2.getTotalIn();
        int int4 = deflater2.getTotalIn();
        boolean boolean5 = deflater2.finished();
        deflater2.end();
        deflater2.setLevel((int) (short) -1);
        deflater2.end();
        deflater2.end();
        java.util.zip.Deflater deflater12 = new java.util.zip.Deflater((int) (byte) 1);
        deflater12.reset();
        int int14 = deflater12.getTotalIn();
        deflater12.finish();
        int int16 = deflater12.getTotalOut();
        boolean boolean17 = deflater12.finished();
        java.util.zip.Deflater deflater19 = new java.util.zip.Deflater((int) (byte) 1);
        long long20 = deflater19.getBytesWritten();
        int int21 = deflater19.getTotalOut();
        long long22 = deflater19.getBytesWritten();
        deflater19.reset();
        deflater19.reset();
        java.util.zip.Deflater deflater26 = new java.util.zip.Deflater((int) (byte) 1);
        deflater26.reset();
        int int28 = deflater26.getTotalIn();
        int int29 = deflater26.getTotalIn();
        int int30 = deflater26.getTotalIn();
        long long31 = deflater26.getBytesWritten();
        java.util.zip.Deflater deflater33 = new java.util.zip.Deflater((int) (byte) 1);
        deflater33.reset();
        int int35 = deflater33.getTotalIn();
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater33.setInput(byteArray42);
        deflater33.finish();
        long long45 = deflater33.getBytesRead();
        deflater33.reset();
        byte[] byteArray53 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater33.setInput(byteArray53, (int) (short) 0, (int) (short) 1);
        deflater33.reset();
        deflater33.reset();
        java.util.zip.Deflater deflater60 = new java.util.zip.Deflater((int) (byte) 1);
        long long61 = deflater60.getBytesWritten();
        int int62 = deflater60.getTotalOut();
        long long63 = deflater60.getBytesWritten();
        java.util.zip.Deflater deflater65 = new java.util.zip.Deflater((int) (byte) 1);
        deflater65.reset();
        deflater65.reset();
        java.util.zip.Deflater deflater69 = new java.util.zip.Deflater((int) (byte) 1);
        deflater69.reset();
        int int71 = deflater69.getTotalIn();
        byte[] byteArray78 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater69.setInput(byteArray78);
        deflater65.setDictionary(byteArray78);
        deflater60.setDictionary(byteArray78);
        deflater33.setInput(byteArray78);
        deflater26.setDictionary(byteArray78, 2, (int) (short) 0);
        int int86 = deflater19.deflate(byteArray78);
        deflater12.setDictionary(byteArray78);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater2.setDictionary(byteArray78);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater7.setInput(byteArray16);
        deflater7.finish();
        long long19 = deflater7.getBytesRead();
        deflater7.reset();
        java.util.zip.Deflater deflater22 = new java.util.zip.Deflater((int) (byte) 1);
        deflater22.reset();
        int int24 = deflater22.getTotalIn();
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater22.setInput(byteArray31);
        deflater22.finish();
        long long34 = deflater22.getBytesRead();
        deflater22.reset();
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater22.setInput(byteArray42, (int) (short) 0, (int) (short) 1);
        deflater7.setDictionary(byteArray42);
        deflater2.setInput(byteArray42);
        boolean boolean48 = deflater2.finished();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int50 = deflater2.getAdler();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        deflater1.reset();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater1.setInput(byteArray21, (int) (short) 0, (int) (short) 1);
        deflater1.reset();
        deflater1.reset();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int28 = deflater1.getAdler();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        deflater1.reset();
        boolean boolean5 = deflater1.finished();
        deflater1.end();
        deflater1.setStrategy(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = deflater1.getTotalIn();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater5.finish();
        long long17 = deflater5.getBytesRead();
        deflater5.reset();
        java.util.zip.Deflater deflater20 = new java.util.zip.Deflater((int) (byte) 1);
        deflater20.reset();
        int int22 = deflater20.getTotalIn();
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater20.setInput(byteArray29);
        deflater20.finish();
        long long32 = deflater20.getBytesRead();
        deflater20.reset();
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater20.setInput(byteArray40, (int) (short) 0, (int) (short) 1);
        deflater5.setDictionary(byteArray40);
        deflater1.setInput(byteArray40);
        deflater1.end();
        boolean boolean47 = deflater1.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long48 = deflater1.getBytesWritten();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        deflater2.end();
        java.util.zip.Deflater deflater8 = new java.util.zip.Deflater((int) (byte) 1);
        long long9 = deflater8.getBytesRead();
        deflater8.finish();
        int int11 = deflater8.getAdler();
        long long12 = deflater8.getBytesRead();
        java.util.zip.Deflater deflater14 = new java.util.zip.Deflater((int) (byte) 1);
        deflater14.reset();
        int int16 = deflater14.getTotalIn();
        int int17 = deflater14.getTotalIn();
        deflater14.finish();
        deflater14.reset();
        java.util.zip.Deflater deflater21 = new java.util.zip.Deflater((int) (byte) 1);
        deflater21.reset();
        int int23 = deflater21.getTotalIn();
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater21.setInput(byteArray30);
        deflater14.setInput(byteArray30);
        deflater14.finish();
        int int34 = deflater14.getAdler();
        int int35 = deflater14.getTotalIn();
        java.util.zip.Deflater deflater38 = new java.util.zip.Deflater((-1), true);
        long long39 = deflater38.getBytesWritten();
        deflater38.setLevel(2);
        java.util.zip.Deflater deflater43 = new java.util.zip.Deflater((int) (byte) 1);
        deflater43.reset();
        int int45 = deflater43.getTotalIn();
        byte[] byteArray52 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater43.setInput(byteArray52);
        deflater43.finish();
        long long55 = deflater43.getBytesRead();
        deflater43.reset();
        java.util.zip.Deflater deflater58 = new java.util.zip.Deflater((int) (byte) 1);
        deflater58.reset();
        int int60 = deflater58.getTotalIn();
        byte[] byteArray67 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater58.setInput(byteArray67);
        deflater58.finish();
        long long70 = deflater58.getBytesRead();
        deflater58.reset();
        byte[] byteArray78 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater58.setInput(byteArray78, (int) (short) 0, (int) (short) 1);
        deflater43.setDictionary(byteArray78);
        deflater38.setInput(byteArray78);
        deflater14.setDictionary(byteArray78);
        deflater8.setInput(byteArray78, 6, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int88 = deflater2.deflate(byteArray78);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        int int3 = deflater2.getTotalIn();
        int int4 = deflater2.getTotalIn();
        boolean boolean5 = deflater2.finished();
        deflater2.end();
        deflater2.setLevel((int) (short) -1);
        deflater2.end();
        boolean boolean10 = deflater2.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long11 = deflater2.getBytesRead();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        int int3 = deflater2.getTotalIn();
        int int4 = deflater2.getTotalIn();
        boolean boolean5 = deflater2.finished();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        long long8 = deflater7.getBytesWritten();
        int int9 = deflater7.getTotalIn();
        java.util.zip.Deflater deflater11 = new java.util.zip.Deflater((int) (byte) 1);
        deflater11.reset();
        int int13 = deflater11.getTotalIn();
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater11.setInput(byteArray20);
        deflater11.finish();
        long long23 = deflater11.getBytesRead();
        deflater11.reset();
        java.util.zip.Deflater deflater26 = new java.util.zip.Deflater((int) (byte) 1);
        deflater26.reset();
        int int28 = deflater26.getTotalIn();
        byte[] byteArray35 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater26.setInput(byteArray35);
        deflater26.finish();
        long long38 = deflater26.getBytesRead();
        deflater26.reset();
        byte[] byteArray46 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater26.setInput(byteArray46, (int) (short) 0, (int) (short) 1);
        deflater11.setDictionary(byteArray46);
        int int51 = deflater7.deflate(byteArray46);
        deflater2.setDictionary(byteArray46);
        int int53 = deflater2.getTotalIn();
        deflater2.finish();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long56 = deflater2.getBytesWritten();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.reset();
        java.util.zip.Deflater deflater14 = new java.util.zip.Deflater((int) (byte) 1);
        deflater14.reset();
        int int16 = deflater14.getTotalIn();
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater14.setInput(byteArray23);
        deflater14.finish();
        long long26 = deflater14.getBytesRead();
        deflater14.reset();
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater14.setInput(byteArray34, (int) (short) 0, (int) (short) 1);
        deflater1.setInput(byteArray34);
        boolean boolean39 = deflater1.finished();
        long long40 = deflater1.getBytesWritten();
        deflater1.end();
        java.util.zip.Deflater deflater43 = new java.util.zip.Deflater((int) (byte) 1);
        deflater43.reset();
        int int45 = deflater43.getTotalIn();
        byte[] byteArray52 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater43.setInput(byteArray52);
        deflater43.finish();
        long long55 = deflater43.getBytesRead();
        deflater43.reset();
        int int57 = deflater43.getAdler();
        boolean boolean58 = deflater43.needsInput();
        int int59 = deflater43.getTotalIn();
        deflater43.reset();
        int int61 = deflater43.getAdler();
        java.util.zip.Deflater deflater63 = new java.util.zip.Deflater((int) (byte) 1);
        deflater63.reset();
        deflater63.reset();
        java.util.zip.Deflater deflater67 = new java.util.zip.Deflater((int) (byte) 1);
        deflater67.reset();
        int int69 = deflater67.getTotalIn();
        byte[] byteArray76 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater67.setInput(byteArray76);
        deflater63.setDictionary(byteArray76);
        deflater43.setInput(byteArray76);
        deflater1.setInput(byteArray76);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int81 = deflater1.getTotalOut();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        int int3 = deflater2.getTotalIn();
        int int4 = deflater2.getTotalIn();
        boolean boolean5 = deflater2.finished();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        long long8 = deflater7.getBytesWritten();
        int int9 = deflater7.getTotalIn();
        java.util.zip.Deflater deflater11 = new java.util.zip.Deflater((int) (byte) 1);
        deflater11.reset();
        int int13 = deflater11.getTotalIn();
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater11.setInput(byteArray20);
        deflater11.finish();
        long long23 = deflater11.getBytesRead();
        deflater11.reset();
        java.util.zip.Deflater deflater26 = new java.util.zip.Deflater((int) (byte) 1);
        deflater26.reset();
        int int28 = deflater26.getTotalIn();
        byte[] byteArray35 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater26.setInput(byteArray35);
        deflater26.finish();
        long long38 = deflater26.getBytesRead();
        deflater26.reset();
        byte[] byteArray46 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater26.setInput(byteArray46, (int) (short) 0, (int) (short) 1);
        deflater11.setDictionary(byteArray46);
        int int51 = deflater7.deflate(byteArray46);
        deflater2.setDictionary(byteArray46);
        int int53 = deflater2.getTotalIn();
        deflater2.finish();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long56 = deflater2.getBytesRead();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(6, false);
        deflater2.end();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) -1);
        int int6 = deflater5.getTotalOut();
        int int7 = deflater5.getAdler();
        java.util.zip.Deflater deflater9 = new java.util.zip.Deflater((int) (byte) 1);
        deflater9.reset();
        int int11 = deflater9.getTotalIn();
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater9.setInput(byteArray18);
        deflater9.finish();
        long long21 = deflater9.getBytesRead();
        deflater9.reset();
        int int23 = deflater9.getAdler();
        boolean boolean24 = deflater9.needsInput();
        int int25 = deflater9.getTotalIn();
        int int26 = deflater9.getTotalIn();
        java.util.zip.Deflater deflater28 = new java.util.zip.Deflater((int) (byte) 1);
        deflater28.reset();
        int int30 = deflater28.getTotalIn();
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater28.setInput(byteArray37);
        deflater28.finish();
        long long40 = deflater28.getBytesRead();
        deflater28.reset();
        java.util.zip.Deflater deflater43 = new java.util.zip.Deflater((int) (byte) 1);
        deflater43.reset();
        int int45 = deflater43.getTotalIn();
        byte[] byteArray52 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater43.setInput(byteArray52);
        deflater43.finish();
        long long55 = deflater43.getBytesRead();
        deflater43.reset();
        byte[] byteArray63 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater43.setInput(byteArray63, (int) (short) 0, (int) (short) 1);
        int int67 = deflater28.deflate(byteArray63);
        deflater9.setDictionary(byteArray63);
        int int69 = deflater5.deflate(byteArray63);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int70 = deflater2.deflate(byteArray63);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        deflater1.finish();
        int int6 = deflater1.getTotalOut();
        int int7 = deflater1.getTotalOut();
        long long8 = deflater1.getBytesWritten();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int10 = deflater1.getAdler();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) -1);
        boolean boolean2 = deflater1.finished();
        deflater1.finish();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int5 = deflater1.getTotalOut();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        java.util.zip.Deflater deflater16 = new java.util.zip.Deflater((-1), true);
        long long17 = deflater16.getBytesWritten();
        deflater16.setLevel(2);
        java.util.zip.Deflater deflater21 = new java.util.zip.Deflater((int) (byte) 1);
        deflater21.reset();
        int int23 = deflater21.getTotalIn();
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater21.setInput(byteArray30);
        deflater21.finish();
        long long33 = deflater21.getBytesRead();
        deflater21.reset();
        java.util.zip.Deflater deflater36 = new java.util.zip.Deflater((int) (byte) 1);
        deflater36.reset();
        int int38 = deflater36.getTotalIn();
        byte[] byteArray45 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater36.setInput(byteArray45);
        deflater36.finish();
        long long48 = deflater36.getBytesRead();
        deflater36.reset();
        byte[] byteArray56 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater36.setInput(byteArray56, (int) (short) 0, (int) (short) 1);
        deflater21.setDictionary(byteArray56);
        deflater16.setInput(byteArray56);
        deflater1.setInput(byteArray56, 3, 1);
        boolean boolean65 = deflater1.finished();
        int int66 = deflater1.getTotalOut();
        deflater1.reset();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long69 = deflater1.getBytesWritten();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        deflater1.reset();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater1.setInput(byteArray21, (int) (short) 0, (int) (short) 1);
        deflater1.reset();
        deflater1.end();
        deflater1.end();
        deflater1.finish();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long29 = deflater1.getBytesRead();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        long long3 = deflater1.getBytesWritten();
        deflater1.end();
        boolean boolean5 = deflater1.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int6 = deflater1.getAdler();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater7.setInput(byteArray16);
        deflater7.finish();
        long long19 = deflater7.getBytesRead();
        deflater7.reset();
        java.util.zip.Deflater deflater22 = new java.util.zip.Deflater((int) (byte) 1);
        deflater22.reset();
        int int24 = deflater22.getTotalIn();
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater22.setInput(byteArray31);
        deflater22.finish();
        long long34 = deflater22.getBytesRead();
        deflater22.reset();
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater22.setInput(byteArray42, (int) (short) 0, (int) (short) 1);
        deflater7.setDictionary(byteArray42);
        deflater2.setInput(byteArray42);
        boolean boolean48 = deflater2.finished();
        deflater2.end();
        boolean boolean50 = deflater2.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int51 = deflater2.getTotalIn();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        java.util.zip.Deflater deflater15 = new java.util.zip.Deflater((int) (byte) 1);
        deflater15.reset();
        int int17 = deflater15.getTotalIn();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater15.setInput(byteArray24);
        deflater15.finish();
        long long27 = deflater15.getBytesRead();
        deflater15.reset();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getTotalIn();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater30.setInput(byteArray39);
        deflater30.finish();
        long long42 = deflater30.getBytesRead();
        deflater30.reset();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater30.setInput(byteArray50, (int) (short) 0, (int) (short) 1);
        deflater15.setDictionary(byteArray50);
        int int55 = deflater1.deflate(byteArray50);
        boolean boolean56 = deflater1.finished();
        int int57 = deflater1.getTotalIn();
        int int58 = deflater1.getTotalIn();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int60 = deflater1.getTotalOut();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        java.util.zip.Deflater deflater15 = new java.util.zip.Deflater((int) (byte) 1);
        deflater15.reset();
        int int17 = deflater15.getTotalIn();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater15.setInput(byteArray24);
        deflater15.finish();
        long long27 = deflater15.getBytesRead();
        deflater15.reset();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getTotalIn();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater30.setInput(byteArray39);
        deflater30.finish();
        long long42 = deflater30.getBytesRead();
        deflater30.reset();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater30.setInput(byteArray50, (int) (short) 0, (int) (short) 1);
        deflater15.setDictionary(byteArray50);
        int int55 = deflater1.deflate(byteArray50);
        deflater1.setLevel(3);
        deflater1.end();
        deflater1.setLevel((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int61 = deflater1.getAdler();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        deflater1.reset();
        deflater1.end();
        java.util.zip.Deflater deflater17 = new java.util.zip.Deflater((int) (byte) 1);
        deflater17.reset();
        int int19 = deflater17.getTotalIn();
        int int20 = deflater17.getTotalIn();
        deflater17.finish();
        deflater17.reset();
        boolean boolean23 = deflater17.finished();
        long long24 = deflater17.getBytesRead();
        long long25 = deflater17.getBytesWritten();
        java.util.zip.Deflater deflater27 = new java.util.zip.Deflater((int) (byte) 1);
        deflater27.reset();
        int int29 = deflater27.getTotalIn();
        java.util.zip.Deflater deflater31 = new java.util.zip.Deflater((int) (byte) 1);
        deflater31.reset();
        int int33 = deflater31.getTotalIn();
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater31.setInput(byteArray40);
        deflater31.finish();
        long long43 = deflater31.getBytesRead();
        deflater31.reset();
        java.util.zip.Deflater deflater46 = new java.util.zip.Deflater((int) (byte) 1);
        deflater46.reset();
        int int48 = deflater46.getTotalIn();
        byte[] byteArray55 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater46.setInput(byteArray55);
        deflater46.finish();
        long long58 = deflater46.getBytesRead();
        deflater46.reset();
        byte[] byteArray66 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater46.setInput(byteArray66, (int) (short) 0, (int) (short) 1);
        deflater31.setDictionary(byteArray66);
        deflater27.setInput(byteArray66);
        deflater17.setInput(byteArray66);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deflater1.setDictionary(byteArray66);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        deflater1.reset();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater1.setInput(byteArray21, (int) (short) 0, (int) (short) 1);
        deflater1.reset();
        deflater1.end();
        java.util.zip.Deflater deflater28 = new java.util.zip.Deflater((int) (byte) 1);
        deflater28.reset();
        int int30 = deflater28.getTotalIn();
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater28.setInput(byteArray37);
        deflater28.reset();
        java.util.zip.Deflater deflater41 = new java.util.zip.Deflater((int) (byte) 1);
        deflater41.reset();
        int int43 = deflater41.getTotalIn();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater41.setInput(byteArray50);
        deflater41.finish();
        long long53 = deflater41.getBytesRead();
        deflater41.reset();
        byte[] byteArray61 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater41.setInput(byteArray61, (int) (short) 0, (int) (short) 1);
        deflater28.setInput(byteArray61);
        boolean boolean66 = deflater28.finished();
        deflater28.finish();
        java.util.zip.Deflater deflater69 = new java.util.zip.Deflater((int) (byte) 1);
        deflater69.reset();
        int int71 = deflater69.getTotalIn();
        byte[] byteArray78 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater69.setInput(byteArray78);
        int int80 = deflater28.deflate(byteArray78);
        deflater1.setInput(byteArray78);
        boolean boolean82 = deflater1.needsInput();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long83 = deflater1.getBytesRead();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        int int3 = deflater2.getTotalIn();
        int int4 = deflater2.getTotalIn();
        boolean boolean5 = deflater2.finished();
        deflater2.end();
        deflater2.setLevel((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long9 = deflater2.getBytesRead();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        deflater1.finish();
        int int5 = deflater1.getTotalIn();
        deflater1.end();
        deflater1.setStrategy((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long9 = deflater1.getBytesRead();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        deflater1.reset();
        boolean boolean5 = deflater1.finished();
        deflater1.end();
        java.util.zip.Deflater deflater8 = new java.util.zip.Deflater((int) (byte) 1);
        deflater8.reset();
        java.util.zip.Deflater deflater11 = new java.util.zip.Deflater((int) (byte) 1);
        deflater11.reset();
        int int13 = deflater11.getTotalIn();
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater11.setInput(byteArray20);
        deflater8.setInput(byteArray20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int26 = deflater1.deflate(byteArray20, (int) (byte) 0, (int) (short) 1, 87360012);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        int int3 = deflater2.getTotalIn();
        int int4 = deflater2.getTotalIn();
        boolean boolean5 = deflater2.finished();
        deflater2.end();
        deflater2.setLevel((int) (short) -1);
        deflater2.end();
        boolean boolean10 = deflater2.finished();
        java.util.zip.Deflater deflater13 = new java.util.zip.Deflater((int) (short) -1, false);
        deflater13.finish();
        java.util.zip.Deflater deflater16 = new java.util.zip.Deflater((int) (byte) 1);
        long long17 = deflater16.getBytesWritten();
        int int18 = deflater16.getTotalOut();
        long long19 = deflater16.getBytesWritten();
        deflater16.reset();
        deflater16.reset();
        java.util.zip.Deflater deflater23 = new java.util.zip.Deflater((int) (byte) 1);
        deflater23.reset();
        int int25 = deflater23.getTotalIn();
        int int26 = deflater23.getTotalIn();
        int int27 = deflater23.getTotalIn();
        long long28 = deflater23.getBytesWritten();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getTotalIn();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater30.setInput(byteArray39);
        deflater30.finish();
        long long42 = deflater30.getBytesRead();
        deflater30.reset();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater30.setInput(byteArray50, (int) (short) 0, (int) (short) 1);
        deflater30.reset();
        deflater30.reset();
        java.util.zip.Deflater deflater57 = new java.util.zip.Deflater((int) (byte) 1);
        long long58 = deflater57.getBytesWritten();
        int int59 = deflater57.getTotalOut();
        long long60 = deflater57.getBytesWritten();
        java.util.zip.Deflater deflater62 = new java.util.zip.Deflater((int) (byte) 1);
        deflater62.reset();
        deflater62.reset();
        java.util.zip.Deflater deflater66 = new java.util.zip.Deflater((int) (byte) 1);
        deflater66.reset();
        int int68 = deflater66.getTotalIn();
        byte[] byteArray75 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater66.setInput(byteArray75);
        deflater62.setDictionary(byteArray75);
        deflater57.setDictionary(byteArray75);
        deflater30.setInput(byteArray75);
        deflater23.setDictionary(byteArray75, 2, (int) (short) 0);
        int int83 = deflater16.deflate(byteArray75);
        int int84 = deflater13.deflate(byteArray75);
        deflater2.setInput(byteArray75);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int86 = deflater2.getTotalOut();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        int int6 = deflater4.getTotalIn();
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater4.setInput(byteArray13);
        deflater4.finish();
        long long16 = deflater4.getBytesRead();
        deflater4.reset();
        java.util.zip.Deflater deflater19 = new java.util.zip.Deflater((int) (byte) 1);
        deflater19.reset();
        int int21 = deflater19.getTotalIn();
        byte[] byteArray28 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater19.setInput(byteArray28);
        deflater19.finish();
        long long31 = deflater19.getBytesRead();
        deflater19.reset();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater19.setInput(byteArray39, (int) (short) 0, (int) (short) 1);
        deflater4.setDictionary(byteArray39);
        deflater1.setInput(byteArray39);
        deflater1.end();
        deflater1.end();
        deflater1.setLevel(0);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int49 = deflater1.getAdler();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        deflater1.finish();
        deflater1.reset();
        java.util.zip.Deflater deflater8 = new java.util.zip.Deflater((int) (byte) 1);
        deflater8.reset();
        int int10 = deflater8.getTotalIn();
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater8.setInput(byteArray17);
        deflater1.setInput(byteArray17);
        deflater1.finish();
        int int21 = deflater1.getAdler();
        deflater1.setLevel((int) (byte) 1);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int25 = deflater1.getAdler();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        deflater2.end();
        boolean boolean7 = deflater2.needsInput();
        deflater2.end();
        deflater2.setLevel(2);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long11 = deflater2.getBytesWritten();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        deflater1.reset();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater1.setInput(byteArray21, (int) (short) 0, (int) (short) 1);
        deflater1.reset();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long27 = deflater1.getBytesRead();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) -1);
        boolean boolean2 = deflater1.finished();
        deflater1.finish();
        int int4 = deflater1.getTotalIn();
        deflater1.end();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater(0);
        java.util.zip.Deflater deflater10 = new java.util.zip.Deflater((-1), true);
        long long11 = deflater10.getBytesWritten();
        deflater10.setLevel(2);
        java.util.zip.Deflater deflater15 = new java.util.zip.Deflater((int) (byte) 1);
        deflater15.reset();
        int int17 = deflater15.getTotalIn();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater15.setInput(byteArray24);
        deflater15.finish();
        long long27 = deflater15.getBytesRead();
        deflater15.reset();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getTotalIn();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater30.setInput(byteArray39);
        deflater30.finish();
        long long42 = deflater30.getBytesRead();
        deflater30.reset();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater30.setInput(byteArray50, (int) (short) 0, (int) (short) 1);
        deflater15.setDictionary(byteArray50);
        deflater10.setInput(byteArray50);
        long long56 = deflater10.getBytesRead();
        java.util.zip.Deflater deflater58 = new java.util.zip.Deflater((int) (byte) 1);
        deflater58.reset();
        deflater58.reset();
        java.util.zip.Deflater deflater62 = new java.util.zip.Deflater((int) (byte) 1);
        deflater62.reset();
        int int64 = deflater62.getTotalIn();
        byte[] byteArray71 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater62.setInput(byteArray71);
        deflater58.setDictionary(byteArray71);
        deflater10.setInput(byteArray71);
        deflater7.setDictionary(byteArray71, 1, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int78 = deflater1.deflate(byteArray71);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(0, false);
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long4 = deflater2.getBytesRead();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater7.setInput(byteArray16);
        deflater7.finish();
        long long19 = deflater7.getBytesRead();
        deflater7.reset();
        java.util.zip.Deflater deflater22 = new java.util.zip.Deflater((int) (byte) 1);
        deflater22.reset();
        int int24 = deflater22.getTotalIn();
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater22.setInput(byteArray31);
        deflater22.finish();
        long long34 = deflater22.getBytesRead();
        deflater22.reset();
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater22.setInput(byteArray42, (int) (short) 0, (int) (short) 1);
        deflater7.setDictionary(byteArray42);
        deflater2.setInput(byteArray42);
        int int48 = deflater2.getTotalIn();
        deflater2.reset();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int51 = deflater2.getAdler();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        int int3 = deflater2.getTotalIn();
        int int4 = deflater2.getTotalIn();
        boolean boolean5 = deflater2.finished();
        deflater2.end();
        deflater2.setLevel((int) (short) -1);
        deflater2.end();
        boolean boolean10 = deflater2.finished();
        java.util.zip.Deflater deflater12 = new java.util.zip.Deflater(0);
        java.util.zip.Deflater deflater15 = new java.util.zip.Deflater((-1), true);
        long long16 = deflater15.getBytesWritten();
        deflater15.setLevel(2);
        java.util.zip.Deflater deflater20 = new java.util.zip.Deflater((int) (byte) 1);
        deflater20.reset();
        int int22 = deflater20.getTotalIn();
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater20.setInput(byteArray29);
        deflater20.finish();
        long long32 = deflater20.getBytesRead();
        deflater20.reset();
        java.util.zip.Deflater deflater35 = new java.util.zip.Deflater((int) (byte) 1);
        deflater35.reset();
        int int37 = deflater35.getTotalIn();
        byte[] byteArray44 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater35.setInput(byteArray44);
        deflater35.finish();
        long long47 = deflater35.getBytesRead();
        deflater35.reset();
        byte[] byteArray55 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater35.setInput(byteArray55, (int) (short) 0, (int) (short) 1);
        deflater20.setDictionary(byteArray55);
        deflater15.setInput(byteArray55);
        long long61 = deflater15.getBytesRead();
        java.util.zip.Deflater deflater63 = new java.util.zip.Deflater((int) (byte) 1);
        deflater63.reset();
        deflater63.reset();
        java.util.zip.Deflater deflater67 = new java.util.zip.Deflater((int) (byte) 1);
        deflater67.reset();
        int int69 = deflater67.getTotalIn();
        byte[] byteArray76 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater67.setInput(byteArray76);
        deflater63.setDictionary(byteArray76);
        deflater15.setInput(byteArray76);
        deflater12.setDictionary(byteArray76, 1, (int) (byte) 1);
        deflater2.setInput(byteArray76);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int84 = deflater2.getAdler();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        java.util.zip.Deflater deflater15 = new java.util.zip.Deflater((int) (byte) 1);
        deflater15.reset();
        int int17 = deflater15.getTotalIn();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater15.setInput(byteArray24);
        deflater15.finish();
        long long27 = deflater15.getBytesRead();
        deflater15.reset();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getTotalIn();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater30.setInput(byteArray39);
        deflater30.finish();
        long long42 = deflater30.getBytesRead();
        deflater30.reset();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater30.setInput(byteArray50, (int) (short) 0, (int) (short) 1);
        deflater15.setDictionary(byteArray50);
        int int55 = deflater1.deflate(byteArray50);
        deflater1.setLevel(3);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long59 = deflater1.getBytesWritten();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater7.setInput(byteArray16);
        deflater7.finish();
        long long19 = deflater7.getBytesRead();
        deflater7.reset();
        java.util.zip.Deflater deflater22 = new java.util.zip.Deflater((int) (byte) 1);
        deflater22.reset();
        int int24 = deflater22.getTotalIn();
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater22.setInput(byteArray31);
        deflater22.finish();
        long long34 = deflater22.getBytesRead();
        deflater22.reset();
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater22.setInput(byteArray42, (int) (short) 0, (int) (short) 1);
        deflater7.setDictionary(byteArray42);
        deflater2.setInput(byteArray42);
        int int48 = deflater2.getTotalIn();
        boolean boolean49 = deflater2.needsInput();
        deflater2.end();
        boolean boolean51 = deflater2.needsInput();
        java.util.zip.Deflater deflater54 = new java.util.zip.Deflater((int) (short) -1, false);
        long long55 = deflater54.getBytesWritten();
        java.util.zip.Deflater deflater57 = new java.util.zip.Deflater((int) (byte) 1);
        deflater57.reset();
        int int59 = deflater57.getTotalIn();
        byte[] byteArray66 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater57.setInput(byteArray66);
        deflater54.setDictionary(byteArray66);
        java.util.zip.Deflater deflater70 = new java.util.zip.Deflater((int) (byte) 1);
        deflater70.reset();
        int int72 = deflater70.getTotalIn();
        byte[] byteArray79 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater70.setInput(byteArray79);
        deflater70.reset();
        boolean boolean82 = deflater70.needsInput();
        java.util.zip.Deflater deflater84 = new java.util.zip.Deflater((int) (byte) 1);
        deflater84.reset();
        int int86 = deflater84.getTotalIn();
        byte[] byteArray93 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater84.setInput(byteArray93);
        int int95 = deflater70.deflate(byteArray93);
        int int98 = deflater54.deflate(byteArray93, (int) (short) 0, (int) (byte) 1);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater2.setDictionary(byteArray93);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        int int6 = deflater4.getTotalIn();
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater4.setInput(byteArray13);
        deflater1.setInput(byteArray13);
        deflater1.setLevel((int) (byte) -1);
        deflater1.end();
        boolean boolean19 = deflater1.needsInput();
        java.util.zip.Deflater deflater22 = new java.util.zip.Deflater(3, true);
        int int23 = deflater22.getAdler();
        java.util.zip.Deflater deflater26 = new java.util.zip.Deflater((-1), true);
        long long27 = deflater26.getBytesWritten();
        deflater26.setLevel(2);
        java.util.zip.Deflater deflater31 = new java.util.zip.Deflater((int) (byte) 1);
        deflater31.reset();
        int int33 = deflater31.getTotalIn();
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater31.setInput(byteArray40);
        deflater31.finish();
        long long43 = deflater31.getBytesRead();
        deflater31.reset();
        java.util.zip.Deflater deflater46 = new java.util.zip.Deflater((int) (byte) 1);
        deflater46.reset();
        int int48 = deflater46.getTotalIn();
        byte[] byteArray55 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater46.setInput(byteArray55);
        deflater46.finish();
        long long58 = deflater46.getBytesRead();
        deflater46.reset();
        byte[] byteArray66 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater46.setInput(byteArray66, (int) (short) 0, (int) (short) 1);
        deflater31.setDictionary(byteArray66);
        deflater26.setInput(byteArray66);
        deflater22.setDictionary(byteArray66);
        deflater1.setInput(byteArray66);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int74 = deflater1.getTotalIn();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        int int3 = deflater1.getTotalIn();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater5.finish();
        long long17 = deflater5.getBytesRead();
        deflater5.reset();
        java.util.zip.Deflater deflater20 = new java.util.zip.Deflater((int) (byte) 1);
        deflater20.reset();
        int int22 = deflater20.getTotalIn();
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater20.setInput(byteArray29);
        deflater20.finish();
        long long32 = deflater20.getBytesRead();
        deflater20.reset();
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater20.setInput(byteArray40, (int) (short) 0, (int) (short) 1);
        deflater5.setDictionary(byteArray40);
        int int45 = deflater1.deflate(byteArray40);
        long long46 = deflater1.getBytesWritten();
        int int47 = deflater1.getTotalOut();
        int int48 = deflater1.getAdler();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long50 = deflater1.getBytesRead();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        int int3 = deflater2.getTotalIn();
        int int4 = deflater2.getTotalIn();
        boolean boolean5 = deflater2.finished();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long7 = deflater2.getBytesRead();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getAdler();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater1.setInput(byteArray14, 0, 0);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int20 = deflater1.getTotalOut();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.reset();
        java.util.zip.Deflater deflater14 = new java.util.zip.Deflater((int) (byte) 1);
        deflater14.reset();
        int int16 = deflater14.getTotalIn();
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater14.setInput(byteArray23);
        deflater14.finish();
        long long26 = deflater14.getBytesRead();
        deflater14.reset();
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater14.setInput(byteArray34, (int) (short) 0, (int) (short) 1);
        deflater1.setInput(byteArray34);
        boolean boolean39 = deflater1.finished();
        deflater1.finish();
        java.util.zip.Deflater deflater42 = new java.util.zip.Deflater((int) (byte) 1);
        deflater42.reset();
        int int44 = deflater42.getTotalIn();
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater42.setInput(byteArray51);
        int int53 = deflater1.deflate(byteArray51);
        deflater1.finish();
        int int55 = deflater1.getTotalOut();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater1.reset();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getAdler();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater1.setInput(byteArray14, 0, 0);
        int int19 = deflater1.getTotalIn();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long21 = deflater1.getBytesRead();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        int int3 = deflater1.getTotalOut();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater5.finish();
        long long17 = deflater5.getBytesRead();
        deflater5.reset();
        java.util.zip.Deflater deflater20 = new java.util.zip.Deflater((int) (byte) 1);
        deflater20.reset();
        int int22 = deflater20.getTotalIn();
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater20.setInput(byteArray29);
        deflater20.finish();
        long long32 = deflater20.getBytesRead();
        deflater20.reset();
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater20.setInput(byteArray40, (int) (short) 0, (int) (short) 1);
        deflater5.setDictionary(byteArray40);
        deflater1.setDictionary(byteArray40);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long47 = deflater1.getBytesRead();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater9 = new java.util.zip.Deflater((int) (byte) 1);
        deflater9.reset();
        java.util.zip.Deflater deflater12 = new java.util.zip.Deflater((int) (byte) 1);
        deflater12.reset();
        int int14 = deflater12.getTotalIn();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater12.setInput(byteArray21);
        deflater9.setInput(byteArray21);
        deflater7.setInput(byteArray21);
        deflater7.setStrategy(0);
        boolean boolean27 = deflater7.needsInput();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater32 = new java.util.zip.Deflater((int) (byte) 1);
        deflater32.reset();
        java.util.zip.Deflater deflater35 = new java.util.zip.Deflater((int) (byte) 1);
        deflater35.reset();
        int int37 = deflater35.getTotalIn();
        byte[] byteArray44 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater35.setInput(byteArray44);
        deflater32.setInput(byteArray44);
        deflater30.setInput(byteArray44);
        deflater7.setInput(byteArray44);
        java.util.zip.Deflater deflater50 = new java.util.zip.Deflater((int) (byte) 1);
        deflater50.reset();
        int int52 = deflater50.getTotalIn();
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater50.setInput(byteArray59);
        deflater50.finish();
        long long62 = deflater50.getBytesRead();
        deflater50.reset();
        byte[] byteArray70 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater50.setInput(byteArray70, (int) (short) 0, (int) (short) 1);
        deflater7.setInput(byteArray70);
        int int75 = deflater1.deflate(byteArray70);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int77 = deflater1.getAdler();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) -1);
        boolean boolean2 = deflater1.finished();
        deflater1.finish();
        deflater1.end();
        deflater1.setLevel(8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = deflater1.getTotalOut();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        int int3 = deflater1.getTotalOut();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater5.finish();
        long long17 = deflater5.getBytesRead();
        deflater5.reset();
        java.util.zip.Deflater deflater20 = new java.util.zip.Deflater((int) (byte) 1);
        deflater20.reset();
        int int22 = deflater20.getTotalIn();
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater20.setInput(byteArray29);
        deflater20.finish();
        long long32 = deflater20.getBytesRead();
        deflater20.reset();
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater20.setInput(byteArray40, (int) (short) 0, (int) (short) 1);
        deflater5.setDictionary(byteArray40);
        deflater1.setDictionary(byteArray40);
        deflater1.end();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int48 = deflater1.getTotalIn();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater7.setInput(byteArray16);
        deflater7.finish();
        long long19 = deflater7.getBytesRead();
        deflater7.reset();
        java.util.zip.Deflater deflater22 = new java.util.zip.Deflater((int) (byte) 1);
        deflater22.reset();
        int int24 = deflater22.getTotalIn();
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater22.setInput(byteArray31);
        deflater22.finish();
        long long34 = deflater22.getBytesRead();
        deflater22.reset();
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater22.setInput(byteArray42, (int) (short) 0, (int) (short) 1);
        deflater7.setDictionary(byteArray42);
        deflater2.setInput(byteArray42);
        int int48 = deflater2.getTotalIn();
        boolean boolean49 = deflater2.needsInput();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long51 = deflater2.getBytesRead();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        deflater1.reset();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater1.setInput(byteArray21, (int) (short) 0, (int) (short) 1);
        deflater1.reset();
        deflater1.reset();
        deflater1.end();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater1.reset();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        deflater2.end();
        boolean boolean7 = deflater2.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int8 = deflater2.getAdler();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(3, true);
        deflater2.reset();
        deflater2.setStrategy(0);
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int7 = deflater2.getAdler();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        java.util.zip.Deflater deflater0 = new java.util.zip.Deflater();
        deflater0.reset();
        long long2 = deflater0.getBytesWritten();
        int int3 = deflater0.getTotalIn();
        deflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long5 = deflater0.getBytesWritten();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        deflater1.reset();
        boolean boolean5 = deflater1.finished();
        int int6 = deflater1.getTotalOut();
        java.util.zip.Deflater deflater8 = new java.util.zip.Deflater((int) (byte) 1);
        deflater8.reset();
        int int10 = deflater8.getAdler();
        java.util.zip.Deflater deflater12 = new java.util.zip.Deflater((int) (byte) 1);
        deflater12.reset();
        int int14 = deflater12.getTotalIn();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater12.setInput(byteArray21);
        deflater8.setInput(byteArray21);
        int int26 = deflater1.deflate(byteArray21, 0, 0);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int28 = deflater1.getTotalIn();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        int int3 = deflater2.getTotalIn();
        int int4 = deflater2.getTotalIn();
        boolean boolean5 = deflater2.finished();
        deflater2.end();
        deflater2.setLevel((int) (short) -1);
        deflater2.end();
        boolean boolean10 = deflater2.needsInput();
        deflater2.finish();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater2.reset();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        deflater1.reset();
        boolean boolean5 = deflater1.finished();
        int int6 = deflater1.getTotalOut();
        java.util.zip.Deflater deflater8 = new java.util.zip.Deflater((int) (byte) 1);
        deflater8.reset();
        int int10 = deflater8.getAdler();
        java.util.zip.Deflater deflater12 = new java.util.zip.Deflater((int) (byte) 1);
        deflater12.reset();
        int int14 = deflater12.getTotalIn();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater12.setInput(byteArray21);
        deflater8.setInput(byteArray21);
        int int26 = deflater1.deflate(byteArray21, 0, 0);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int28 = deflater1.getAdler();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater7.setInput(byteArray16);
        deflater4.setInput(byteArray16);
        deflater2.setInput(byteArray16);
        deflater2.setStrategy(0);
        boolean boolean22 = deflater2.needsInput();
        java.util.zip.Deflater deflater25 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater27 = new java.util.zip.Deflater((int) (byte) 1);
        deflater27.reset();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getTotalIn();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater30.setInput(byteArray39);
        deflater27.setInput(byteArray39);
        deflater25.setInput(byteArray39);
        deflater2.setInput(byteArray39);
        java.util.zip.Deflater deflater45 = new java.util.zip.Deflater((int) (byte) 1);
        deflater45.reset();
        int int47 = deflater45.getTotalIn();
        byte[] byteArray54 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater45.setInput(byteArray54);
        deflater45.finish();
        long long57 = deflater45.getBytesRead();
        deflater45.reset();
        byte[] byteArray65 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater45.setInput(byteArray65, (int) (short) 0, (int) (short) 1);
        deflater2.setInput(byteArray65);
        int int70 = deflater2.getTotalOut();
        deflater2.end();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int73 = deflater2.getTotalOut();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater(3);
        deflater1.end();
        deflater1.finish();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int4 = deflater1.getTotalIn();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        long long3 = deflater1.getBytesWritten();
        deflater1.setLevel((int) (byte) 0);
        deflater1.reset();
        deflater1.end();
        deflater1.finish();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int9 = deflater1.getAdler();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(3, true);
        deflater2.reset();
        deflater2.setStrategy(0);
        deflater2.end();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int8 = deflater2.getTotalIn();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        deflater2.end();
        deflater2.end();
        deflater2.setLevel((int) (byte) -1);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int10 = deflater2.getTotalIn();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        java.util.zip.Deflater deflater0 = new java.util.zip.Deflater();
        deflater0.end();
        deflater0.end();
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        int int6 = deflater4.getTotalIn();
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater4.setInput(byteArray13);
        deflater4.finish();
        long long16 = deflater4.getBytesRead();
        deflater4.reset();
        java.util.zip.Deflater deflater19 = new java.util.zip.Deflater((int) (byte) 1);
        deflater19.reset();
        int int21 = deflater19.getTotalIn();
        byte[] byteArray28 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater19.setInput(byteArray28);
        deflater19.finish();
        long long31 = deflater19.getBytesRead();
        deflater19.reset();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater19.setInput(byteArray39, (int) (short) 0, (int) (short) 1);
        int int43 = deflater4.deflate(byteArray39);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int47 = deflater0.deflate(byteArray39, 0, 2, (int) (byte) 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        deflater1.finish();
        deflater1.reset();
        deflater1.end();
        deflater1.setLevel((int) (byte) -1);
        java.util.zip.Deflater deflater11 = new java.util.zip.Deflater((int) (byte) 1);
        deflater11.reset();
        int int13 = deflater11.getTotalIn();
        int int14 = deflater11.getTotalIn();
        int int15 = deflater11.getTotalIn();
        long long16 = deflater11.getBytesWritten();
        int int17 = deflater11.getTotalOut();
        int int18 = deflater11.getAdler();
        long long19 = deflater11.getBytesWritten();
        boolean boolean20 = deflater11.finished();
        boolean boolean21 = deflater11.needsInput();
        int int22 = deflater11.getAdler();
        int int23 = deflater11.getTotalIn();
        java.util.zip.Deflater deflater26 = new java.util.zip.Deflater((int) (short) -1, false);
        deflater26.finish();
        java.util.zip.Deflater deflater29 = new java.util.zip.Deflater((int) (byte) 1);
        long long30 = deflater29.getBytesWritten();
        int int31 = deflater29.getTotalOut();
        long long32 = deflater29.getBytesWritten();
        deflater29.reset();
        deflater29.reset();
        java.util.zip.Deflater deflater36 = new java.util.zip.Deflater((int) (byte) 1);
        deflater36.reset();
        int int38 = deflater36.getTotalIn();
        int int39 = deflater36.getTotalIn();
        int int40 = deflater36.getTotalIn();
        long long41 = deflater36.getBytesWritten();
        java.util.zip.Deflater deflater43 = new java.util.zip.Deflater((int) (byte) 1);
        deflater43.reset();
        int int45 = deflater43.getTotalIn();
        byte[] byteArray52 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater43.setInput(byteArray52);
        deflater43.finish();
        long long55 = deflater43.getBytesRead();
        deflater43.reset();
        byte[] byteArray63 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater43.setInput(byteArray63, (int) (short) 0, (int) (short) 1);
        deflater43.reset();
        deflater43.reset();
        java.util.zip.Deflater deflater70 = new java.util.zip.Deflater((int) (byte) 1);
        long long71 = deflater70.getBytesWritten();
        int int72 = deflater70.getTotalOut();
        long long73 = deflater70.getBytesWritten();
        java.util.zip.Deflater deflater75 = new java.util.zip.Deflater((int) (byte) 1);
        deflater75.reset();
        deflater75.reset();
        java.util.zip.Deflater deflater79 = new java.util.zip.Deflater((int) (byte) 1);
        deflater79.reset();
        int int81 = deflater79.getTotalIn();
        byte[] byteArray88 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater79.setInput(byteArray88);
        deflater75.setDictionary(byteArray88);
        deflater70.setDictionary(byteArray88);
        deflater43.setInput(byteArray88);
        deflater36.setDictionary(byteArray88, 2, (int) (short) 0);
        int int96 = deflater29.deflate(byteArray88);
        int int97 = deflater26.deflate(byteArray88);
        deflater11.setDictionary(byteArray88);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deflater1.setDictionary(byteArray88);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater(3);
        deflater1.end();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (short) -1, false);
        long long6 = deflater5.getBytesWritten();
        java.util.zip.Deflater deflater8 = new java.util.zip.Deflater((int) (byte) 1);
        deflater8.reset();
        int int10 = deflater8.getTotalIn();
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater8.setInput(byteArray17);
        deflater5.setDictionary(byteArray17);
        boolean boolean20 = deflater5.needsInput();
        java.util.zip.Deflater deflater23 = new java.util.zip.Deflater((int) (short) -1, false);
        java.util.zip.Deflater deflater25 = new java.util.zip.Deflater((int) (byte) 1);
        deflater25.reset();
        int int27 = deflater25.getAdler();
        java.util.zip.Deflater deflater29 = new java.util.zip.Deflater((int) (byte) 1);
        deflater29.reset();
        int int31 = deflater29.getTotalIn();
        byte[] byteArray38 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater29.setInput(byteArray38);
        deflater25.setInput(byteArray38, 0, 0);
        int int43 = deflater23.deflate(byteArray38);
        deflater5.setInput(byteArray38);
        int int45 = deflater5.getAdler();
        java.util.zip.Deflater deflater47 = new java.util.zip.Deflater((int) (byte) 1);
        long long48 = deflater47.getBytesWritten();
        java.util.zip.Deflater deflater50 = new java.util.zip.Deflater((int) (byte) 1);
        deflater50.reset();
        int int52 = deflater50.getTotalIn();
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater50.setInput(byteArray59);
        deflater50.finish();
        long long62 = deflater50.getBytesRead();
        deflater50.reset();
        java.util.zip.Deflater deflater65 = new java.util.zip.Deflater((int) (byte) 1);
        deflater65.reset();
        int int67 = deflater65.getTotalIn();
        byte[] byteArray74 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater65.setInput(byteArray74);
        deflater65.finish();
        long long77 = deflater65.getBytesRead();
        deflater65.reset();
        byte[] byteArray85 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater65.setInput(byteArray85, (int) (short) 0, (int) (short) 1);
        deflater50.setDictionary(byteArray85);
        deflater47.setInput(byteArray85);
        deflater5.setDictionary(byteArray85);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deflater1.setDictionary(byteArray85);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        int int6 = deflater4.getAdler();
        java.util.zip.Deflater deflater8 = new java.util.zip.Deflater((int) (byte) 1);
        deflater8.reset();
        int int10 = deflater8.getTotalIn();
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater8.setInput(byteArray17);
        deflater4.setInput(byteArray17, 0, 0);
        int int22 = deflater2.deflate(byteArray17);
        deflater2.reset();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater2.reset();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater7.setInput(byteArray16);
        deflater7.finish();
        long long19 = deflater7.getBytesRead();
        deflater7.reset();
        java.util.zip.Deflater deflater22 = new java.util.zip.Deflater((int) (byte) 1);
        deflater22.reset();
        int int24 = deflater22.getTotalIn();
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater22.setInput(byteArray31);
        deflater22.finish();
        long long34 = deflater22.getBytesRead();
        deflater22.reset();
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater22.setInput(byteArray42, (int) (short) 0, (int) (short) 1);
        deflater7.setDictionary(byteArray42);
        deflater2.setInput(byteArray42);
        int int48 = deflater2.getTotalIn();
        boolean boolean49 = deflater2.needsInput();
        deflater2.end();
        deflater2.finish();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long52 = deflater2.getBytesWritten();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        long long6 = deflater1.getBytesWritten();
        int int7 = deflater1.getTotalOut();
        int int8 = deflater1.getAdler();
        long long9 = deflater1.getBytesWritten();
        boolean boolean10 = deflater1.finished();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater1.reset();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.reset();
        deflater1.end();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int15 = deflater1.getTotalIn();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        int int6 = deflater4.getTotalIn();
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater4.setInput(byteArray13);
        deflater1.setInput(byteArray13);
        deflater1.end();
        java.util.zip.Deflater deflater18 = new java.util.zip.Deflater((int) (byte) 1);
        deflater18.reset();
        int int20 = deflater18.getTotalIn();
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater18.setInput(byteArray27);
        int int29 = deflater18.getAdler();
        java.util.zip.Deflater deflater31 = new java.util.zip.Deflater((int) (byte) 1);
        deflater31.reset();
        int int33 = deflater31.getTotalIn();
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater31.setInput(byteArray40);
        deflater31.finish();
        long long43 = deflater31.getBytesRead();
        java.util.zip.Deflater deflater46 = new java.util.zip.Deflater((-1), true);
        long long47 = deflater46.getBytesWritten();
        deflater46.setLevel(2);
        java.util.zip.Deflater deflater51 = new java.util.zip.Deflater((int) (byte) 1);
        deflater51.reset();
        int int53 = deflater51.getTotalIn();
        byte[] byteArray60 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater51.setInput(byteArray60);
        deflater51.finish();
        long long63 = deflater51.getBytesRead();
        deflater51.reset();
        java.util.zip.Deflater deflater66 = new java.util.zip.Deflater((int) (byte) 1);
        deflater66.reset();
        int int68 = deflater66.getTotalIn();
        byte[] byteArray75 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater66.setInput(byteArray75);
        deflater66.finish();
        long long78 = deflater66.getBytesRead();
        deflater66.reset();
        byte[] byteArray86 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater66.setInput(byteArray86, (int) (short) 0, (int) (short) 1);
        deflater51.setDictionary(byteArray86);
        deflater46.setInput(byteArray86);
        deflater31.setInput(byteArray86, 3, 1);
        int int95 = deflater18.deflate(byteArray86);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deflater1.setDictionary(byteArray86);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(2, true);
        long long3 = deflater2.getBytesRead();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long5 = deflater2.getBytesWritten();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, true);
        deflater2.setLevel((-1));
        boolean boolean5 = deflater2.needsInput();
        deflater2.finish();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long8 = deflater2.getBytesRead();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        java.util.zip.Deflater deflater15 = new java.util.zip.Deflater((int) (byte) 1);
        deflater15.reset();
        int int17 = deflater15.getTotalIn();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater15.setInput(byteArray24);
        deflater15.finish();
        long long27 = deflater15.getBytesRead();
        deflater15.reset();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getTotalIn();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater30.setInput(byteArray39);
        deflater30.finish();
        long long42 = deflater30.getBytesRead();
        deflater30.reset();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater30.setInput(byteArray50, (int) (short) 0, (int) (short) 1);
        deflater15.setDictionary(byteArray50);
        int int55 = deflater1.deflate(byteArray50);
        deflater1.setLevel(3);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int59 = deflater1.getTotalOut();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater(0);
        int int2 = deflater1.getAdler();
        boolean boolean3 = deflater1.needsInput();
        boolean boolean4 = deflater1.finished();
        long long5 = deflater1.getBytesRead();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int7 = deflater1.getAdler();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        java.util.zip.Deflater deflater16 = new java.util.zip.Deflater((-1), true);
        long long17 = deflater16.getBytesWritten();
        deflater16.setLevel(2);
        java.util.zip.Deflater deflater21 = new java.util.zip.Deflater((int) (byte) 1);
        deflater21.reset();
        int int23 = deflater21.getTotalIn();
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater21.setInput(byteArray30);
        deflater21.finish();
        long long33 = deflater21.getBytesRead();
        deflater21.reset();
        java.util.zip.Deflater deflater36 = new java.util.zip.Deflater((int) (byte) 1);
        deflater36.reset();
        int int38 = deflater36.getTotalIn();
        byte[] byteArray45 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater36.setInput(byteArray45);
        deflater36.finish();
        long long48 = deflater36.getBytesRead();
        deflater36.reset();
        byte[] byteArray56 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater36.setInput(byteArray56, (int) (short) 0, (int) (short) 1);
        deflater21.setDictionary(byteArray56);
        deflater16.setInput(byteArray56);
        deflater1.setInput(byteArray56, 3, 1);
        boolean boolean65 = deflater1.finished();
        int int66 = deflater1.getTotalOut();
        deflater1.reset();
        int int68 = deflater1.getAdler();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater1.reset();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        int int6 = deflater4.getAdler();
        java.util.zip.Deflater deflater8 = new java.util.zip.Deflater((int) (byte) 1);
        deflater8.reset();
        int int10 = deflater8.getTotalIn();
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater8.setInput(byteArray17);
        deflater4.setInput(byteArray17, 0, 0);
        int int22 = deflater2.deflate(byteArray17);
        deflater2.reset();
        boolean boolean24 = deflater2.needsInput();
        long long25 = deflater2.getBytesWritten();
        deflater2.end();
        java.util.zip.Deflater deflater28 = new java.util.zip.Deflater((int) (byte) 0);
        deflater28.setStrategy((int) (short) 0);
        java.util.zip.Deflater deflater32 = new java.util.zip.Deflater((int) (byte) 1);
        deflater32.reset();
        int int34 = deflater32.getTotalIn();
        int int35 = deflater32.getTotalIn();
        deflater32.finish();
        deflater32.reset();
        java.util.zip.Deflater deflater39 = new java.util.zip.Deflater((int) (byte) 1);
        deflater39.reset();
        int int41 = deflater39.getTotalIn();
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater39.setInput(byteArray48);
        deflater32.setInput(byteArray48);
        long long51 = deflater32.getBytesWritten();
        deflater32.reset();
        int int53 = deflater32.getAdler();
        java.util.zip.Deflater deflater55 = new java.util.zip.Deflater((int) (byte) 1);
        deflater55.reset();
        deflater55.reset();
        java.util.zip.Deflater deflater59 = new java.util.zip.Deflater((int) (byte) 1);
        deflater59.reset();
        int int61 = deflater59.getTotalIn();
        byte[] byteArray68 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater59.setInput(byteArray68);
        deflater55.setDictionary(byteArray68);
        deflater32.setInput(byteArray68, 3, 3);
        int int74 = deflater28.deflate(byteArray68);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deflater2.setDictionary(byteArray68);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(1, true);
        boolean boolean3 = deflater2.needsInput();
        deflater2.end();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (short) -1, false);
        long long8 = deflater7.getBytesWritten();
        java.util.zip.Deflater deflater10 = new java.util.zip.Deflater((int) (byte) 1);
        deflater10.reset();
        int int12 = deflater10.getTotalIn();
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater10.setInput(byteArray19);
        deflater7.setDictionary(byteArray19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int22 = deflater2.deflate(byteArray19);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, true);
        deflater2.setLevel((-1));
        boolean boolean5 = deflater2.needsInput();
        deflater2.finish();
        deflater2.end();
        deflater2.end();
        java.util.zip.Deflater deflater10 = new java.util.zip.Deflater((int) (byte) 1);
        deflater10.reset();
        int int12 = deflater10.getAdler();
        java.util.zip.Deflater deflater14 = new java.util.zip.Deflater((int) (byte) 1);
        deflater14.reset();
        int int16 = deflater14.getTotalIn();
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater14.setInput(byteArray23);
        deflater10.setInput(byteArray23);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int26 = deflater2.deflate(byteArray23);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        deflater1.reset();
        boolean boolean5 = deflater1.finished();
        deflater1.end();
        deflater1.setLevel((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = deflater1.getTotalIn();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        deflater1.finish();
        int int5 = deflater1.getTotalOut();
        boolean boolean6 = deflater1.needsInput();
        long long7 = deflater1.getBytesRead();
        deflater1.finish();
        deflater1.setLevel(9);
        deflater1.end();
        java.util.zip.Deflater deflater13 = new java.util.zip.Deflater((int) (byte) 1);
        deflater13.reset();
        int int15 = deflater13.getTotalIn();
        int int16 = deflater13.getTotalIn();
        int int17 = deflater13.getTotalIn();
        deflater13.setLevel((int) (short) 1);
        int int20 = deflater13.getAdler();
        boolean boolean21 = deflater13.needsInput();
        java.util.zip.Deflater deflater23 = new java.util.zip.Deflater((int) (byte) 1);
        long long24 = deflater23.getBytesWritten();
        int int25 = deflater23.getTotalOut();
        long long26 = deflater23.getBytesWritten();
        java.util.zip.Deflater deflater28 = new java.util.zip.Deflater((int) (byte) 1);
        deflater28.reset();
        deflater28.reset();
        java.util.zip.Deflater deflater32 = new java.util.zip.Deflater((int) (byte) 1);
        deflater32.reset();
        int int34 = deflater32.getTotalIn();
        byte[] byteArray41 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater32.setInput(byteArray41);
        deflater28.setDictionary(byteArray41);
        deflater23.setDictionary(byteArray41);
        int int47 = deflater13.deflate(byteArray41, 2, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int48 = deflater1.deflate(byteArray41);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.reset();
        java.util.zip.Deflater deflater14 = new java.util.zip.Deflater((int) (byte) 1);
        deflater14.reset();
        int int16 = deflater14.getTotalIn();
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater14.setInput(byteArray23);
        deflater14.finish();
        long long26 = deflater14.getBytesRead();
        deflater14.reset();
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater14.setInput(byteArray34, (int) (short) 0, (int) (short) 1);
        deflater1.setInput(byteArray34);
        boolean boolean39 = deflater1.finished();
        deflater1.finish();
        java.util.zip.Deflater deflater42 = new java.util.zip.Deflater((int) (byte) 1);
        deflater42.reset();
        int int44 = deflater42.getTotalIn();
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater42.setInput(byteArray51);
        int int53 = deflater1.deflate(byteArray51);
        deflater1.finish();
        long long55 = deflater1.getBytesWritten();
        deflater1.end();
        boolean boolean57 = deflater1.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int58 = deflater1.getAdler();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        int int3 = deflater1.getTotalOut();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater5.finish();
        long long17 = deflater5.getBytesRead();
        deflater5.reset();
        java.util.zip.Deflater deflater20 = new java.util.zip.Deflater((int) (byte) 1);
        deflater20.reset();
        int int22 = deflater20.getTotalIn();
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater20.setInput(byteArray29);
        deflater20.finish();
        long long32 = deflater20.getBytesRead();
        deflater20.reset();
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater20.setInput(byteArray40, (int) (short) 0, (int) (short) 1);
        deflater5.setDictionary(byteArray40);
        deflater1.setDictionary(byteArray40);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int47 = deflater1.getTotalIn();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        int int3 = deflater1.getTotalIn();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater5.finish();
        long long17 = deflater5.getBytesRead();
        deflater5.reset();
        java.util.zip.Deflater deflater20 = new java.util.zip.Deflater((int) (byte) 1);
        deflater20.reset();
        int int22 = deflater20.getTotalIn();
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater20.setInput(byteArray29);
        deflater20.finish();
        long long32 = deflater20.getBytesRead();
        deflater20.reset();
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater20.setInput(byteArray40, (int) (short) 0, (int) (short) 1);
        deflater5.setDictionary(byteArray40);
        int int45 = deflater1.deflate(byteArray40);
        long long46 = deflater1.getBytesWritten();
        deflater1.reset();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int49 = deflater1.getTotalIn();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        int int6 = deflater4.getTotalIn();
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater4.setInput(byteArray13);
        deflater1.setInput(byteArray13);
        int int16 = deflater1.getTotalIn();
        deflater1.reset();
        long long18 = deflater1.getBytesWritten();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater1.reset();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        int int3 = deflater2.getAdler();
        boolean boolean4 = deflater2.finished();
        deflater2.finish();
        deflater2.reset();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long8 = deflater2.getBytesRead();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        deflater1.reset();
        int int15 = deflater1.getAdler();
        boolean boolean16 = deflater1.needsInput();
        int int17 = deflater1.getTotalIn();
        deflater1.reset();
        int int19 = deflater1.getAdler();
        java.util.zip.Deflater deflater21 = new java.util.zip.Deflater((int) (byte) 1);
        deflater21.reset();
        deflater21.reset();
        java.util.zip.Deflater deflater25 = new java.util.zip.Deflater((int) (byte) 1);
        deflater25.reset();
        int int27 = deflater25.getTotalIn();
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater25.setInput(byteArray34);
        deflater21.setDictionary(byteArray34);
        deflater1.setInput(byteArray34);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int39 = deflater1.getAdler();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        deflater1.finish();
        int int5 = deflater1.getTotalOut();
        boolean boolean6 = deflater1.needsInput();
        long long7 = deflater1.getBytesRead();
        deflater1.finish();
        deflater1.setLevel(9);
        deflater1.end();
        boolean boolean12 = deflater1.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int13 = deflater1.getAdler();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        long long3 = deflater1.getBytesWritten();
        deflater1.setLevel((int) (byte) 0);
        deflater1.reset();
        int int7 = deflater1.getTotalIn();
        deflater1.setLevel(1);
        long long10 = deflater1.getBytesRead();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long12 = deflater1.getBytesRead();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        long long3 = deflater1.getBytesWritten();
        long long4 = deflater1.getBytesWritten();
        int int5 = deflater1.getTotalOut();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long7 = deflater1.getBytesRead();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        int int3 = deflater2.getTotalIn();
        int int4 = deflater2.getTotalIn();
        boolean boolean5 = deflater2.finished();
        deflater2.end();
        deflater2.setLevel((int) (short) -1);
        deflater2.end();
        boolean boolean10 = deflater2.finished();
        boolean boolean11 = deflater2.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int12 = deflater2.getTotalOut();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        int int3 = deflater1.getTotalIn();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater5.finish();
        long long17 = deflater5.getBytesRead();
        deflater5.reset();
        java.util.zip.Deflater deflater20 = new java.util.zip.Deflater((int) (byte) 1);
        deflater20.reset();
        int int22 = deflater20.getTotalIn();
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater20.setInput(byteArray29);
        deflater20.finish();
        long long32 = deflater20.getBytesRead();
        deflater20.reset();
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater20.setInput(byteArray40, (int) (short) 0, (int) (short) 1);
        deflater5.setDictionary(byteArray40);
        int int45 = deflater1.deflate(byteArray40);
        long long46 = deflater1.getBytesWritten();
        deflater1.reset();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int49 = deflater1.getAdler();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater7.setInput(byteArray16);
        deflater7.finish();
        long long19 = deflater7.getBytesRead();
        deflater7.reset();
        java.util.zip.Deflater deflater22 = new java.util.zip.Deflater((int) (byte) 1);
        deflater22.reset();
        int int24 = deflater22.getTotalIn();
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater22.setInput(byteArray31);
        deflater22.finish();
        long long34 = deflater22.getBytesRead();
        deflater22.reset();
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater22.setInput(byteArray42, (int) (short) 0, (int) (short) 1);
        deflater7.setDictionary(byteArray42);
        deflater2.setInput(byteArray42);
        deflater2.end();
        boolean boolean49 = deflater2.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int50 = deflater2.getTotalOut();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        java.util.zip.Deflater deflater15 = new java.util.zip.Deflater((int) (byte) 1);
        deflater15.reset();
        int int17 = deflater15.getTotalIn();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater15.setInput(byteArray24);
        deflater15.finish();
        long long27 = deflater15.getBytesRead();
        deflater15.reset();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getTotalIn();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater30.setInput(byteArray39);
        deflater30.finish();
        long long42 = deflater30.getBytesRead();
        deflater30.reset();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater30.setInput(byteArray50, (int) (short) 0, (int) (short) 1);
        deflater15.setDictionary(byteArray50);
        int int55 = deflater1.deflate(byteArray50);
        boolean boolean56 = deflater1.finished();
        int int57 = deflater1.getTotalIn();
        int int58 = deflater1.getTotalIn();
        deflater1.end();
        deflater1.finish();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int61 = deflater1.getTotalIn();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater5.finish();
        long long17 = deflater5.getBytesRead();
        deflater5.reset();
        java.util.zip.Deflater deflater20 = new java.util.zip.Deflater((int) (byte) 1);
        deflater20.reset();
        int int22 = deflater20.getTotalIn();
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater20.setInput(byteArray29);
        deflater20.finish();
        long long32 = deflater20.getBytesRead();
        deflater20.reset();
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater20.setInput(byteArray40, (int) (short) 0, (int) (short) 1);
        deflater5.setDictionary(byteArray40);
        deflater1.setInput(byteArray40);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int47 = deflater1.getAdler();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(1, true);
        boolean boolean3 = deflater2.needsInput();
        deflater2.reset();
        deflater2.end();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater2.reset();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater7.setInput(byteArray16);
        deflater4.setInput(byteArray16);
        deflater2.setInput(byteArray16);
        deflater2.setStrategy(0);
        boolean boolean22 = deflater2.needsInput();
        java.util.zip.Deflater deflater25 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater27 = new java.util.zip.Deflater((int) (byte) 1);
        deflater27.reset();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getTotalIn();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater30.setInput(byteArray39);
        deflater27.setInput(byteArray39);
        deflater25.setInput(byteArray39);
        deflater2.setInput(byteArray39);
        java.util.zip.Deflater deflater45 = new java.util.zip.Deflater((int) (byte) 1);
        deflater45.reset();
        int int47 = deflater45.getTotalIn();
        byte[] byteArray54 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater45.setInput(byteArray54);
        deflater45.finish();
        long long57 = deflater45.getBytesRead();
        deflater45.reset();
        byte[] byteArray65 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater45.setInput(byteArray65, (int) (short) 0, (int) (short) 1);
        deflater2.setInput(byteArray65);
        int int70 = deflater2.getTotalOut();
        deflater2.end();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long73 = deflater2.getBytesRead();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        deflater1.reset();
        boolean boolean5 = deflater1.finished();
        deflater1.end();
        deflater1.setStrategy(1);
        java.util.zip.Deflater deflater10 = new java.util.zip.Deflater((int) (byte) 1);
        deflater10.reset();
        int int12 = deflater10.getAdler();
        java.util.zip.Deflater deflater14 = new java.util.zip.Deflater((int) (byte) 1);
        deflater14.reset();
        int int16 = deflater14.getTotalIn();
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater14.setInput(byteArray23);
        deflater10.setInput(byteArray23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deflater1.setDictionary(byteArray23);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        deflater1.finish();
        int int6 = deflater1.getTotalOut();
        boolean boolean7 = deflater1.finished();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater1.reset();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.reset();
        deflater1.end();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int15 = deflater1.getAdler();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        deflater1.reset();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater1.setDictionary(byteArray14);
        int int17 = deflater1.getAdler();
        int int18 = deflater1.getAdler();
        boolean boolean19 = deflater1.needsInput();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int21 = deflater1.getTotalIn();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        deflater1.finish();
        java.util.zip.Deflater deflater6 = new java.util.zip.Deflater((int) (byte) 1);
        deflater6.reset();
        int int8 = deflater6.getTotalIn();
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater6.setInput(byteArray15);
        deflater1.setInput(byteArray15);
        int int18 = deflater1.getAdler();
        deflater1.reset();
        long long20 = deflater1.getBytesRead();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int22 = deflater1.getTotalOut();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(1, true);
        boolean boolean3 = deflater2.needsInput();
        deflater2.end();
        boolean boolean5 = deflater2.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int6 = deflater2.getTotalIn();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        deflater2.finish();
        long long7 = deflater2.getBytesRead();
        deflater2.end();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int10 = deflater2.getTotalOut();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(1, true);
        boolean boolean3 = deflater2.needsInput();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int5 = deflater2.getAdler();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        deflater1.reset();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater1.setInput(byteArray21, (int) (short) 0, (int) (short) 1);
        deflater1.reset();
        java.util.zip.Deflater deflater27 = new java.util.zip.Deflater((int) (byte) -1);
        boolean boolean28 = deflater27.finished();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getTotalIn();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater30.setInput(byteArray39);
        deflater30.finish();
        long long42 = deflater30.getBytesRead();
        java.util.zip.Deflater deflater44 = new java.util.zip.Deflater((int) (byte) 1);
        deflater44.reset();
        int int46 = deflater44.getTotalIn();
        byte[] byteArray53 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater44.setInput(byteArray53);
        deflater44.finish();
        long long56 = deflater44.getBytesRead();
        deflater44.reset();
        java.util.zip.Deflater deflater59 = new java.util.zip.Deflater((int) (byte) 1);
        deflater59.reset();
        int int61 = deflater59.getTotalIn();
        byte[] byteArray68 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater59.setInput(byteArray68);
        deflater59.finish();
        long long71 = deflater59.getBytesRead();
        deflater59.reset();
        byte[] byteArray79 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater59.setInput(byteArray79, (int) (short) 0, (int) (short) 1);
        deflater44.setDictionary(byteArray79);
        int int84 = deflater30.deflate(byteArray79);
        int int87 = deflater27.deflate(byteArray79, (int) (byte) 1, 2);
        int int88 = deflater1.deflate(byteArray79);
        deflater1.reset();
        deflater1.end();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int92 = deflater1.getAdler();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        int int3 = deflater2.getAdler();
        boolean boolean4 = deflater2.finished();
        deflater2.finish();
        deflater2.reset();
        deflater2.end();
        java.util.zip.Deflater deflater10 = new java.util.zip.Deflater((int) (short) -1, false);
        java.util.zip.Deflater deflater13 = new java.util.zip.Deflater(2, true);
        int int14 = deflater13.getTotalIn();
        int int15 = deflater13.getTotalOut();
        java.util.zip.Deflater deflater17 = new java.util.zip.Deflater((int) (byte) 1);
        deflater17.reset();
        java.util.zip.Deflater deflater20 = new java.util.zip.Deflater((int) (byte) 1);
        deflater20.reset();
        int int22 = deflater20.getTotalIn();
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater20.setInput(byteArray29);
        deflater17.setInput(byteArray29);
        boolean boolean32 = deflater17.needsInput();
        java.util.zip.Deflater deflater34 = new java.util.zip.Deflater((int) (byte) 1);
        deflater34.reset();
        int int36 = deflater34.getTotalIn();
        byte[] byteArray43 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater34.setInput(byteArray43);
        deflater34.finish();
        long long46 = deflater34.getBytesRead();
        deflater34.reset();
        java.util.zip.Deflater deflater50 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater52 = new java.util.zip.Deflater((int) (byte) 1);
        deflater52.reset();
        java.util.zip.Deflater deflater55 = new java.util.zip.Deflater((int) (byte) 1);
        deflater55.reset();
        int int57 = deflater55.getTotalIn();
        byte[] byteArray64 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater55.setInput(byteArray64);
        deflater52.setInput(byteArray64);
        deflater50.setInput(byteArray64);
        deflater50.setStrategy(0);
        boolean boolean70 = deflater50.needsInput();
        java.util.zip.Deflater deflater73 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater75 = new java.util.zip.Deflater((int) (byte) 1);
        deflater75.reset();
        java.util.zip.Deflater deflater78 = new java.util.zip.Deflater((int) (byte) 1);
        deflater78.reset();
        int int80 = deflater78.getTotalIn();
        byte[] byteArray87 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater78.setInput(byteArray87);
        deflater75.setInput(byteArray87);
        deflater73.setInput(byteArray87);
        deflater50.setInput(byteArray87);
        deflater34.setDictionary(byteArray87);
        int int93 = deflater17.deflate(byteArray87);
        int int94 = deflater13.deflate(byteArray87);
        int int95 = deflater10.deflate(byteArray87);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int99 = deflater2.deflate(byteArray87, 2, (int) (byte) 0, 87360012);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        long long6 = deflater1.getBytesWritten();
        int int7 = deflater1.getTotalOut();
        int int8 = deflater1.getAdler();
        long long9 = deflater1.getBytesWritten();
        deflater1.end();
        deflater1.finish();
        deflater1.finish();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater1.reset();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        deflater1.reset();
        long long4 = deflater1.getBytesWritten();
        java.util.zip.Deflater deflater6 = new java.util.zip.Deflater((int) (byte) 1);
        deflater6.reset();
        int int8 = deflater6.getTotalIn();
        deflater6.finish();
        int int10 = deflater6.getTotalOut();
        java.util.zip.Deflater deflater12 = new java.util.zip.Deflater((int) (byte) 1);
        deflater12.reset();
        int int14 = deflater12.getTotalIn();
        deflater12.finish();
        long long16 = deflater12.getBytesWritten();
        java.util.zip.Deflater deflater18 = new java.util.zip.Deflater((int) (byte) 1);
        long long19 = deflater18.getBytesRead();
        long long20 = deflater18.getBytesRead();
        long long21 = deflater18.getBytesWritten();
        java.util.zip.Deflater deflater23 = new java.util.zip.Deflater((int) (byte) 1);
        deflater23.reset();
        int int25 = deflater23.getTotalIn();
        byte[] byteArray32 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater23.setInput(byteArray32);
        deflater23.finish();
        long long35 = deflater23.getBytesRead();
        deflater23.reset();
        byte[] byteArray43 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater23.setInput(byteArray43, (int) (short) 0, (int) (short) 1);
        deflater18.setInput(byteArray43);
        deflater12.setInput(byteArray43);
        deflater6.setDictionary(byteArray43);
        int int50 = deflater1.deflate(byteArray43);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int52 = deflater1.getTotalIn();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.reset();
        java.util.zip.Deflater deflater14 = new java.util.zip.Deflater((int) (byte) 1);
        deflater14.reset();
        int int16 = deflater14.getTotalIn();
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater14.setInput(byteArray23);
        deflater14.finish();
        long long26 = deflater14.getBytesRead();
        deflater14.reset();
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater14.setInput(byteArray34, (int) (short) 0, (int) (short) 1);
        deflater1.setInput(byteArray34);
        boolean boolean39 = deflater1.finished();
        deflater1.finish();
        java.util.zip.Deflater deflater42 = new java.util.zip.Deflater((int) (byte) 1);
        deflater42.reset();
        int int44 = deflater42.getTotalIn();
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater42.setInput(byteArray51);
        int int53 = deflater1.deflate(byteArray51);
        deflater1.finish();
        long long55 = deflater1.getBytesWritten();
        deflater1.end();
        boolean boolean57 = deflater1.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long58 = deflater1.getBytesWritten();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater7.setInput(byteArray16);
        deflater7.finish();
        long long19 = deflater7.getBytesRead();
        deflater7.reset();
        java.util.zip.Deflater deflater22 = new java.util.zip.Deflater((int) (byte) 1);
        deflater22.reset();
        int int24 = deflater22.getTotalIn();
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater22.setInput(byteArray31);
        deflater22.finish();
        long long34 = deflater22.getBytesRead();
        deflater22.reset();
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater22.setInput(byteArray42, (int) (short) 0, (int) (short) 1);
        deflater7.setDictionary(byteArray42);
        deflater2.setInput(byteArray42);
        boolean boolean48 = deflater2.finished();
        deflater2.end();
        boolean boolean50 = deflater2.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater2.reset();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        deflater1.finish();
        java.util.zip.Deflater deflater6 = new java.util.zip.Deflater((int) (byte) 1);
        deflater6.reset();
        int int8 = deflater6.getTotalIn();
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater6.setInput(byteArray15);
        deflater1.setInput(byteArray15);
        int int18 = deflater1.getAdler();
        deflater1.reset();
        long long20 = deflater1.getBytesRead();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long22 = deflater1.getBytesWritten();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        deflater1.reset();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater1.setInput(byteArray21, (int) (short) 0, (int) (short) 1);
        deflater1.reset();
        deflater1.end();
        deflater1.end();
        deflater1.finish();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        long long31 = deflater30.getBytesWritten();
        java.util.zip.Deflater deflater33 = new java.util.zip.Deflater((int) (byte) 1);
        deflater33.reset();
        int int35 = deflater33.getTotalIn();
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater33.setInput(byteArray42);
        deflater33.finish();
        long long45 = deflater33.getBytesRead();
        deflater33.reset();
        java.util.zip.Deflater deflater48 = new java.util.zip.Deflater((int) (byte) 1);
        deflater48.reset();
        int int50 = deflater48.getTotalIn();
        byte[] byteArray57 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater48.setInput(byteArray57);
        deflater48.finish();
        long long60 = deflater48.getBytesRead();
        deflater48.reset();
        byte[] byteArray68 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater48.setInput(byteArray68, (int) (short) 0, (int) (short) 1);
        deflater33.setDictionary(byteArray68);
        deflater30.setInput(byteArray68);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater1.setDictionary(byteArray68);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) -1);
        boolean boolean2 = deflater1.finished();
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        int int6 = deflater4.getTotalIn();
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater4.setInput(byteArray13);
        deflater4.finish();
        long long16 = deflater4.getBytesRead();
        java.util.zip.Deflater deflater18 = new java.util.zip.Deflater((int) (byte) 1);
        deflater18.reset();
        int int20 = deflater18.getTotalIn();
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater18.setInput(byteArray27);
        deflater18.finish();
        long long30 = deflater18.getBytesRead();
        deflater18.reset();
        java.util.zip.Deflater deflater33 = new java.util.zip.Deflater((int) (byte) 1);
        deflater33.reset();
        int int35 = deflater33.getTotalIn();
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater33.setInput(byteArray42);
        deflater33.finish();
        long long45 = deflater33.getBytesRead();
        deflater33.reset();
        byte[] byteArray53 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater33.setInput(byteArray53, (int) (short) 0, (int) (short) 1);
        deflater18.setDictionary(byteArray53);
        int int58 = deflater4.deflate(byteArray53);
        int int61 = deflater1.deflate(byteArray53, (int) (byte) 1, 2);
        deflater1.setStrategy((int) (byte) 1);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int65 = deflater1.getAdler();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(0, false);
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int4 = deflater2.getTotalIn();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        long long3 = deflater1.getBytesWritten();
        deflater1.end();
        boolean boolean5 = deflater1.finished();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater7.setInput(byteArray16);
        deflater7.finish();
        long long19 = deflater7.getBytesRead();
        java.util.zip.Deflater deflater21 = new java.util.zip.Deflater((int) (byte) 1);
        deflater21.reset();
        int int23 = deflater21.getTotalIn();
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater21.setInput(byteArray30);
        deflater21.finish();
        long long33 = deflater21.getBytesRead();
        deflater21.reset();
        java.util.zip.Deflater deflater36 = new java.util.zip.Deflater((int) (byte) 1);
        deflater36.reset();
        int int38 = deflater36.getTotalIn();
        byte[] byteArray45 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater36.setInput(byteArray45);
        deflater36.finish();
        long long48 = deflater36.getBytesRead();
        deflater36.reset();
        byte[] byteArray56 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater36.setInput(byteArray56, (int) (short) 0, (int) (short) 1);
        deflater21.setDictionary(byteArray56);
        int int61 = deflater7.deflate(byteArray56);
        boolean boolean62 = deflater7.finished();
        int int63 = deflater7.getTotalIn();
        int int64 = deflater7.getTotalIn();
        java.util.zip.Deflater deflater66 = new java.util.zip.Deflater((int) (byte) 1);
        deflater66.reset();
        int int68 = deflater66.getTotalIn();
        byte[] byteArray75 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater66.setInput(byteArray75);
        deflater66.finish();
        long long78 = deflater66.getBytesRead();
        deflater66.reset();
        byte[] byteArray86 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater66.setInput(byteArray86, (int) (short) 0, (int) (short) 1);
        int int90 = deflater7.deflate(byteArray86);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater1.setDictionary(byteArray86);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        deflater1.reset();
        long long4 = deflater1.getBytesWritten();
        java.util.zip.Deflater deflater6 = new java.util.zip.Deflater((int) (byte) 1);
        deflater6.reset();
        int int8 = deflater6.getTotalIn();
        deflater6.finish();
        int int10 = deflater6.getTotalOut();
        java.util.zip.Deflater deflater12 = new java.util.zip.Deflater((int) (byte) 1);
        deflater12.reset();
        int int14 = deflater12.getTotalIn();
        deflater12.finish();
        long long16 = deflater12.getBytesWritten();
        java.util.zip.Deflater deflater18 = new java.util.zip.Deflater((int) (byte) 1);
        long long19 = deflater18.getBytesRead();
        long long20 = deflater18.getBytesRead();
        long long21 = deflater18.getBytesWritten();
        java.util.zip.Deflater deflater23 = new java.util.zip.Deflater((int) (byte) 1);
        deflater23.reset();
        int int25 = deflater23.getTotalIn();
        byte[] byteArray32 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater23.setInput(byteArray32);
        deflater23.finish();
        long long35 = deflater23.getBytesRead();
        deflater23.reset();
        byte[] byteArray43 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater23.setInput(byteArray43, (int) (short) 0, (int) (short) 1);
        deflater18.setInput(byteArray43);
        deflater12.setInput(byteArray43);
        deflater6.setDictionary(byteArray43);
        int int50 = deflater1.deflate(byteArray43);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int52 = deflater1.getAdler();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        int int3 = deflater2.getTotalIn();
        int int4 = deflater2.getTotalIn();
        boolean boolean5 = deflater2.finished();
        deflater2.end();
        deflater2.setStrategy(1);
        java.util.zip.Deflater deflater10 = new java.util.zip.Deflater((int) (byte) 1);
        deflater10.reset();
        int int12 = deflater10.getAdler();
        java.util.zip.Deflater deflater14 = new java.util.zip.Deflater((int) (byte) 1);
        deflater14.reset();
        int int16 = deflater14.getTotalIn();
        int int17 = deflater14.getTotalIn();
        deflater14.finish();
        deflater14.reset();
        boolean boolean20 = deflater14.finished();
        long long21 = deflater14.getBytesRead();
        long long22 = deflater14.getBytesWritten();
        java.util.zip.Deflater deflater24 = new java.util.zip.Deflater((int) (byte) 1);
        deflater24.reset();
        int int26 = deflater24.getTotalIn();
        java.util.zip.Deflater deflater28 = new java.util.zip.Deflater((int) (byte) 1);
        deflater28.reset();
        int int30 = deflater28.getTotalIn();
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater28.setInput(byteArray37);
        deflater28.finish();
        long long40 = deflater28.getBytesRead();
        deflater28.reset();
        java.util.zip.Deflater deflater43 = new java.util.zip.Deflater((int) (byte) 1);
        deflater43.reset();
        int int45 = deflater43.getTotalIn();
        byte[] byteArray52 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater43.setInput(byteArray52);
        deflater43.finish();
        long long55 = deflater43.getBytesRead();
        deflater43.reset();
        byte[] byteArray63 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater43.setInput(byteArray63, (int) (short) 0, (int) (short) 1);
        deflater28.setDictionary(byteArray63);
        deflater24.setInput(byteArray63);
        deflater14.setInput(byteArray63);
        int int70 = deflater10.deflate(byteArray63);
        java.util.zip.Deflater deflater73 = new java.util.zip.Deflater((-1), true);
        deflater73.finish();
        deflater73.finish();
        boolean boolean76 = deflater73.finished();
        java.util.zip.Deflater deflater79 = new java.util.zip.Deflater((int) (short) -1, false);
        long long80 = deflater79.getBytesWritten();
        java.util.zip.Deflater deflater82 = new java.util.zip.Deflater((int) (byte) 1);
        deflater82.reset();
        int int84 = deflater82.getTotalIn();
        byte[] byteArray91 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater82.setInput(byteArray91);
        deflater79.setDictionary(byteArray91);
        deflater73.setInput(byteArray91);
        deflater10.setDictionary(byteArray91);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deflater2.setDictionary(byteArray91);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        java.util.zip.Deflater deflater15 = new java.util.zip.Deflater((int) (byte) 1);
        deflater15.reset();
        int int17 = deflater15.getTotalIn();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater15.setInput(byteArray24);
        deflater15.finish();
        long long27 = deflater15.getBytesRead();
        deflater15.reset();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getTotalIn();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater30.setInput(byteArray39);
        deflater30.finish();
        long long42 = deflater30.getBytesRead();
        deflater30.reset();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater30.setInput(byteArray50, (int) (short) 0, (int) (short) 1);
        deflater15.setDictionary(byteArray50);
        int int55 = deflater1.deflate(byteArray50);
        boolean boolean56 = deflater1.finished();
        int int57 = deflater1.getTotalIn();
        int int58 = deflater1.getTotalIn();
        deflater1.setLevel((int) (short) 0);
        deflater1.reset();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int63 = deflater1.getTotalIn();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        deflater2.end();
        boolean boolean7 = deflater2.needsInput();
        deflater2.end();
        deflater2.setLevel(2);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int11 = deflater2.getTotalOut();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        deflater1.reset();
        int int15 = deflater1.getAdler();
        boolean boolean16 = deflater1.needsInput();
        int int17 = deflater1.getTotalIn();
        deflater1.reset();
        int int19 = deflater1.getAdler();
        java.util.zip.Deflater deflater21 = new java.util.zip.Deflater((int) (byte) 1);
        deflater21.reset();
        deflater21.reset();
        java.util.zip.Deflater deflater25 = new java.util.zip.Deflater((int) (byte) 1);
        deflater25.reset();
        int int27 = deflater25.getTotalIn();
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater25.setInput(byteArray34);
        deflater21.setDictionary(byteArray34);
        deflater1.setInput(byteArray34);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int39 = deflater1.getTotalOut();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        java.util.zip.Deflater deflater0 = new java.util.zip.Deflater();
        deflater0.end();
        deflater0.setLevel((int) (short) 1);
        boolean boolean4 = deflater0.needsInput();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deflater0.reset();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater(9);
        java.util.zip.Deflater deflater3 = new java.util.zip.Deflater((int) (byte) 1);
        long long4 = deflater3.getBytesWritten();
        long long5 = deflater3.getBytesWritten();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) -1);
        boolean boolean8 = deflater7.finished();
        java.util.zip.Deflater deflater10 = new java.util.zip.Deflater((int) (byte) 1);
        deflater10.reset();
        int int12 = deflater10.getTotalIn();
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater10.setInput(byteArray19);
        deflater10.finish();
        long long22 = deflater10.getBytesRead();
        java.util.zip.Deflater deflater24 = new java.util.zip.Deflater((int) (byte) 1);
        deflater24.reset();
        int int26 = deflater24.getTotalIn();
        byte[] byteArray33 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater24.setInput(byteArray33);
        deflater24.finish();
        long long36 = deflater24.getBytesRead();
        deflater24.reset();
        java.util.zip.Deflater deflater39 = new java.util.zip.Deflater((int) (byte) 1);
        deflater39.reset();
        int int41 = deflater39.getTotalIn();
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater39.setInput(byteArray48);
        deflater39.finish();
        long long51 = deflater39.getBytesRead();
        deflater39.reset();
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater39.setInput(byteArray59, (int) (short) 0, (int) (short) 1);
        deflater24.setDictionary(byteArray59);
        int int64 = deflater10.deflate(byteArray59);
        int int67 = deflater7.deflate(byteArray59, (int) (byte) 1, 2);
        java.util.zip.Deflater deflater69 = new java.util.zip.Deflater((int) (byte) 1);
        deflater69.reset();
        int int71 = deflater69.getTotalIn();
        deflater69.finish();
        java.util.zip.Deflater deflater74 = new java.util.zip.Deflater((int) (byte) 1);
        deflater74.reset();
        int int76 = deflater74.getTotalIn();
        byte[] byteArray83 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater74.setInput(byteArray83);
        deflater69.setInput(byteArray83);
        deflater7.setInput(byteArray83);
        int int87 = deflater3.deflate(byteArray83);
        int int88 = deflater1.deflate(byteArray83);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater1.reset();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater7.setInput(byteArray16);
        deflater7.finish();
        long long19 = deflater7.getBytesRead();
        deflater7.reset();
        java.util.zip.Deflater deflater22 = new java.util.zip.Deflater((int) (byte) 1);
        deflater22.reset();
        int int24 = deflater22.getTotalIn();
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater22.setInput(byteArray31);
        deflater22.finish();
        long long34 = deflater22.getBytesRead();
        deflater22.reset();
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater22.setInput(byteArray42, (int) (short) 0, (int) (short) 1);
        deflater7.setDictionary(byteArray42);
        deflater2.setInput(byteArray42);
        int int48 = deflater2.getTotalIn();
        deflater2.reset();
        deflater2.end();
        boolean boolean51 = deflater2.finished();
        deflater2.setLevel((int) (byte) 1);
        boolean boolean54 = deflater2.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int55 = deflater2.getAdler();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        long long3 = deflater1.getBytesWritten();
        deflater1.setLevel((int) (byte) 0);
        deflater1.reset();
        int int7 = deflater1.getTotalIn();
        int int8 = deflater1.getTotalIn();
        int int9 = deflater1.getTotalOut();
        deflater1.setStrategy((int) (short) 0);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater1.reset();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        int int3 = deflater2.getTotalIn();
        int int4 = deflater2.getTotalIn();
        boolean boolean5 = deflater2.finished();
        deflater2.end();
        deflater2.setLevel((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = deflater2.getAdler();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getAdler();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater1.setInput(byteArray14, 0, 0);
        java.util.zip.Deflater deflater20 = new java.util.zip.Deflater((int) (byte) 1);
        int int21 = deflater20.getTotalOut();
        int int22 = deflater20.getTotalOut();
        java.util.zip.Deflater deflater24 = new java.util.zip.Deflater((int) (byte) 1);
        deflater24.reset();
        int int26 = deflater24.getTotalIn();
        byte[] byteArray33 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater24.setInput(byteArray33);
        deflater24.finish();
        long long36 = deflater24.getBytesRead();
        deflater24.reset();
        byte[] byteArray44 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater24.setInput(byteArray44, (int) (short) 0, (int) (short) 1);
        java.util.zip.Deflater deflater50 = new java.util.zip.Deflater((int) (short) -1, false);
        java.util.zip.Deflater deflater52 = new java.util.zip.Deflater((int) (byte) 1);
        deflater52.reset();
        int int54 = deflater52.getAdler();
        java.util.zip.Deflater deflater56 = new java.util.zip.Deflater((int) (byte) 1);
        deflater56.reset();
        int int58 = deflater56.getTotalIn();
        byte[] byteArray65 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater56.setInput(byteArray65);
        deflater52.setInput(byteArray65, 0, 0);
        int int70 = deflater50.deflate(byteArray65);
        deflater24.setInput(byteArray65);
        deflater20.setDictionary(byteArray65);
        deflater1.setInput(byteArray65);
        long long74 = deflater1.getBytesRead();
        deflater1.end();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater1.reset();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        deflater1.reset();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater1.setDictionary(byteArray14);
        long long17 = deflater1.getBytesRead();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long19 = deflater1.getBytesRead();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        deflater1.end();
        boolean boolean7 = deflater1.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int8 = deflater1.getTotalIn();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        deflater1.finish();
        java.util.zip.Deflater deflater6 = new java.util.zip.Deflater((int) (byte) 1);
        deflater6.reset();
        int int8 = deflater6.getTotalIn();
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater6.setInput(byteArray15);
        deflater1.setInput(byteArray15);
        int int18 = deflater1.getAdler();
        deflater1.reset();
        long long20 = deflater1.getBytesRead();
        deflater1.end();
        java.util.zip.Deflater deflater23 = new java.util.zip.Deflater((int) (byte) 1);
        long long24 = deflater23.getBytesWritten();
        int int25 = deflater23.getTotalIn();
        java.util.zip.Deflater deflater27 = new java.util.zip.Deflater((int) (byte) 1);
        deflater27.reset();
        int int29 = deflater27.getTotalIn();
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater27.setInput(byteArray36);
        deflater27.finish();
        long long39 = deflater27.getBytesRead();
        deflater27.reset();
        java.util.zip.Deflater deflater42 = new java.util.zip.Deflater((int) (byte) 1);
        deflater42.reset();
        int int44 = deflater42.getTotalIn();
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater42.setInput(byteArray51);
        deflater42.finish();
        long long54 = deflater42.getBytesRead();
        deflater42.reset();
        byte[] byteArray62 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater42.setInput(byteArray62, (int) (short) 0, (int) (short) 1);
        deflater27.setDictionary(byteArray62);
        int int67 = deflater23.deflate(byteArray62);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deflater1.setDictionary(byteArray62);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        java.util.zip.Deflater deflater16 = new java.util.zip.Deflater((-1), true);
        long long17 = deflater16.getBytesWritten();
        deflater16.setLevel(2);
        java.util.zip.Deflater deflater21 = new java.util.zip.Deflater((int) (byte) 1);
        deflater21.reset();
        int int23 = deflater21.getTotalIn();
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater21.setInput(byteArray30);
        deflater21.finish();
        long long33 = deflater21.getBytesRead();
        deflater21.reset();
        java.util.zip.Deflater deflater36 = new java.util.zip.Deflater((int) (byte) 1);
        deflater36.reset();
        int int38 = deflater36.getTotalIn();
        byte[] byteArray45 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater36.setInput(byteArray45);
        deflater36.finish();
        long long48 = deflater36.getBytesRead();
        deflater36.reset();
        byte[] byteArray56 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater36.setInput(byteArray56, (int) (short) 0, (int) (short) 1);
        deflater21.setDictionary(byteArray56);
        deflater16.setInput(byteArray56);
        deflater1.setInput(byteArray56, 3, 1);
        boolean boolean65 = deflater1.finished();
        int int66 = deflater1.getTotalOut();
        deflater1.reset();
        int int68 = deflater1.getAdler();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long70 = deflater1.getBytesRead();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        java.util.zip.Deflater deflater15 = new java.util.zip.Deflater((int) (byte) 1);
        deflater15.reset();
        int int17 = deflater15.getTotalIn();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater15.setInput(byteArray24);
        deflater15.finish();
        long long27 = deflater15.getBytesRead();
        deflater15.reset();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getTotalIn();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater30.setInput(byteArray39);
        deflater30.finish();
        long long42 = deflater30.getBytesRead();
        deflater30.reset();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater30.setInput(byteArray50, (int) (short) 0, (int) (short) 1);
        deflater15.setDictionary(byteArray50);
        int int55 = deflater1.deflate(byteArray50);
        deflater1.setLevel(3);
        deflater1.end();
        deflater1.finish();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int60 = deflater1.getTotalOut();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        long long3 = deflater1.getBytesWritten();
        deflater1.setLevel((int) (byte) 0);
        deflater1.reset();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int8 = deflater1.getTotalIn();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        long long6 = deflater1.getBytesWritten();
        int int7 = deflater1.getTotalOut();
        int int8 = deflater1.getTotalIn();
        long long9 = deflater1.getBytesRead();
        deflater1.end();
        java.util.zip.Deflater deflater13 = new java.util.zip.Deflater((int) (short) -1, false);
        java.util.zip.Deflater deflater15 = new java.util.zip.Deflater((int) (byte) 1);
        deflater15.reset();
        int int17 = deflater15.getAdler();
        java.util.zip.Deflater deflater19 = new java.util.zip.Deflater((int) (byte) 1);
        deflater19.reset();
        int int21 = deflater19.getTotalIn();
        byte[] byteArray28 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater19.setInput(byteArray28);
        deflater15.setInput(byteArray28, 0, 0);
        int int33 = deflater13.deflate(byteArray28);
        deflater13.end();
        java.util.zip.Deflater deflater36 = new java.util.zip.Deflater((int) (byte) 1);
        long long37 = deflater36.getBytesWritten();
        int int38 = deflater36.getTotalIn();
        java.util.zip.Deflater deflater40 = new java.util.zip.Deflater((int) (byte) 1);
        deflater40.reset();
        int int42 = deflater40.getTotalIn();
        byte[] byteArray49 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater40.setInput(byteArray49);
        deflater40.finish();
        long long52 = deflater40.getBytesRead();
        deflater40.reset();
        java.util.zip.Deflater deflater55 = new java.util.zip.Deflater((int) (byte) 1);
        deflater55.reset();
        int int57 = deflater55.getTotalIn();
        byte[] byteArray64 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater55.setInput(byteArray64);
        deflater55.finish();
        long long67 = deflater55.getBytesRead();
        deflater55.reset();
        byte[] byteArray75 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater55.setInput(byteArray75, (int) (short) 0, (int) (short) 1);
        deflater40.setDictionary(byteArray75);
        int int80 = deflater36.deflate(byteArray75);
        deflater13.setInput(byteArray75);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int82 = deflater1.deflate(byteArray75);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        java.util.zip.Deflater deflater15 = new java.util.zip.Deflater((int) (byte) 1);
        deflater15.reset();
        int int17 = deflater15.getTotalIn();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater15.setInput(byteArray24);
        deflater15.finish();
        long long27 = deflater15.getBytesRead();
        deflater15.reset();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getTotalIn();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater30.setInput(byteArray39);
        deflater30.finish();
        long long42 = deflater30.getBytesRead();
        deflater30.reset();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater30.setInput(byteArray50, (int) (short) 0, (int) (short) 1);
        deflater15.setDictionary(byteArray50);
        int int55 = deflater1.deflate(byteArray50);
        boolean boolean56 = deflater1.finished();
        int int57 = deflater1.getTotalIn();
        int int58 = deflater1.getTotalIn();
        deflater1.end();
        boolean boolean60 = deflater1.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long61 = deflater1.getBytesRead();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        java.util.zip.Deflater deflater15 = new java.util.zip.Deflater((int) (byte) 1);
        deflater15.reset();
        int int17 = deflater15.getTotalIn();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater15.setInput(byteArray24);
        deflater15.finish();
        long long27 = deflater15.getBytesRead();
        deflater15.reset();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getTotalIn();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater30.setInput(byteArray39);
        deflater30.finish();
        long long42 = deflater30.getBytesRead();
        deflater30.reset();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater30.setInput(byteArray50, (int) (short) 0, (int) (short) 1);
        deflater15.setDictionary(byteArray50);
        int int55 = deflater1.deflate(byteArray50);
        deflater1.setLevel(3);
        deflater1.end();
        deflater1.finish();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int60 = deflater1.getTotalIn();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(1, true);
        deflater2.finish();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        long long6 = deflater5.getBytesWritten();
        long long7 = deflater5.getBytesWritten();
        java.util.zip.Deflater deflater9 = new java.util.zip.Deflater((int) (byte) -1);
        boolean boolean10 = deflater9.finished();
        java.util.zip.Deflater deflater12 = new java.util.zip.Deflater((int) (byte) 1);
        deflater12.reset();
        int int14 = deflater12.getTotalIn();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater12.setInput(byteArray21);
        deflater12.finish();
        long long24 = deflater12.getBytesRead();
        java.util.zip.Deflater deflater26 = new java.util.zip.Deflater((int) (byte) 1);
        deflater26.reset();
        int int28 = deflater26.getTotalIn();
        byte[] byteArray35 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater26.setInput(byteArray35);
        deflater26.finish();
        long long38 = deflater26.getBytesRead();
        deflater26.reset();
        java.util.zip.Deflater deflater41 = new java.util.zip.Deflater((int) (byte) 1);
        deflater41.reset();
        int int43 = deflater41.getTotalIn();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater41.setInput(byteArray50);
        deflater41.finish();
        long long53 = deflater41.getBytesRead();
        deflater41.reset();
        byte[] byteArray61 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater41.setInput(byteArray61, (int) (short) 0, (int) (short) 1);
        deflater26.setDictionary(byteArray61);
        int int66 = deflater12.deflate(byteArray61);
        int int69 = deflater9.deflate(byteArray61, (int) (byte) 1, 2);
        java.util.zip.Deflater deflater71 = new java.util.zip.Deflater((int) (byte) 1);
        deflater71.reset();
        int int73 = deflater71.getTotalIn();
        deflater71.finish();
        java.util.zip.Deflater deflater76 = new java.util.zip.Deflater((int) (byte) 1);
        deflater76.reset();
        int int78 = deflater76.getTotalIn();
        byte[] byteArray85 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater76.setInput(byteArray85);
        deflater71.setInput(byteArray85);
        deflater9.setInput(byteArray85);
        int int89 = deflater5.deflate(byteArray85);
        deflater2.setInput(byteArray85);
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater2.reset();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((-1));
        deflater1.reset();
        int int3 = deflater1.getTotalOut();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long5 = deflater1.getBytesWritten();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        long long6 = deflater1.getBytesWritten();
        int int7 = deflater1.getTotalOut();
        int int8 = deflater1.getAdler();
        deflater1.end();
        java.util.zip.Deflater deflater11 = new java.util.zip.Deflater((int) (byte) 1);
        long long12 = deflater11.getBytesWritten();
        long long13 = deflater11.getBytesWritten();
        long long14 = deflater11.getBytesWritten();
        java.util.zip.Deflater deflater17 = new java.util.zip.Deflater((int) (short) -1, false);
        deflater17.finish();
        boolean boolean19 = deflater17.finished();
        deflater17.setLevel(8);
        java.util.zip.Deflater deflater23 = new java.util.zip.Deflater((int) (byte) 1);
        deflater23.reset();
        int int25 = deflater23.getTotalIn();
        byte[] byteArray32 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater23.setInput(byteArray32);
        deflater23.finish();
        long long35 = deflater23.getBytesRead();
        deflater23.reset();
        int int37 = deflater23.getTotalIn();
        deflater23.finish();
        java.util.zip.Deflater deflater41 = new java.util.zip.Deflater(3, true);
        int int42 = deflater41.getAdler();
        java.util.zip.Deflater deflater45 = new java.util.zip.Deflater((-1), true);
        long long46 = deflater45.getBytesWritten();
        deflater45.setLevel(2);
        java.util.zip.Deflater deflater50 = new java.util.zip.Deflater((int) (byte) 1);
        deflater50.reset();
        int int52 = deflater50.getTotalIn();
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater50.setInput(byteArray59);
        deflater50.finish();
        long long62 = deflater50.getBytesRead();
        deflater50.reset();
        java.util.zip.Deflater deflater65 = new java.util.zip.Deflater((int) (byte) 1);
        deflater65.reset();
        int int67 = deflater65.getTotalIn();
        byte[] byteArray74 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater65.setInput(byteArray74);
        deflater65.finish();
        long long77 = deflater65.getBytesRead();
        deflater65.reset();
        byte[] byteArray85 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater65.setInput(byteArray85, (int) (short) 0, (int) (short) 1);
        deflater50.setDictionary(byteArray85);
        deflater45.setInput(byteArray85);
        deflater41.setDictionary(byteArray85);
        deflater23.setInput(byteArray85);
        deflater17.setInput(byteArray85, 0, 3);
        deflater11.setInput(byteArray85);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int97 = deflater1.deflate(byteArray85);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.reset();
        java.util.zip.Deflater deflater14 = new java.util.zip.Deflater((int) (byte) 1);
        deflater14.reset();
        int int16 = deflater14.getTotalIn();
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater14.setInput(byteArray23);
        deflater14.finish();
        long long26 = deflater14.getBytesRead();
        deflater14.reset();
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater14.setInput(byteArray34, (int) (short) 0, (int) (short) 1);
        deflater1.setInput(byteArray34);
        boolean boolean39 = deflater1.finished();
        long long40 = deflater1.getBytesRead();
        deflater1.setStrategy(0);
        deflater1.reset();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int45 = deflater1.getTotalOut();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) -1);
        boolean boolean2 = deflater1.finished();
        deflater1.finish();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long5 = deflater1.getBytesRead();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        long long6 = deflater1.getBytesWritten();
        int int7 = deflater1.getTotalOut();
        boolean boolean8 = deflater1.needsInput();
        java.util.zip.Deflater deflater10 = new java.util.zip.Deflater((int) (byte) 1);
        long long11 = deflater10.getBytesWritten();
        int int12 = deflater10.getTotalIn();
        java.util.zip.Deflater deflater14 = new java.util.zip.Deflater((int) (byte) 1);
        deflater14.reset();
        int int16 = deflater14.getTotalIn();
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater14.setInput(byteArray23);
        deflater14.finish();
        long long26 = deflater14.getBytesRead();
        deflater14.reset();
        java.util.zip.Deflater deflater29 = new java.util.zip.Deflater((int) (byte) 1);
        deflater29.reset();
        int int31 = deflater29.getTotalIn();
        byte[] byteArray38 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater29.setInput(byteArray38);
        deflater29.finish();
        long long41 = deflater29.getBytesRead();
        deflater29.reset();
        byte[] byteArray49 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater29.setInput(byteArray49, (int) (short) 0, (int) (short) 1);
        deflater14.setDictionary(byteArray49);
        int int54 = deflater10.deflate(byteArray49);
        deflater1.setInput(byteArray49);
        deflater1.end();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int58 = deflater1.getAdler();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) 1, false);
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int4 = deflater2.getTotalIn();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        boolean boolean4 = deflater1.finished();
        int int5 = deflater1.getTotalOut();
        int int6 = deflater1.getAdler();
        deflater1.finish();
        boolean boolean8 = deflater1.finished();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int10 = deflater1.getTotalOut();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.reset();
        java.util.zip.Deflater deflater14 = new java.util.zip.Deflater((int) (byte) 1);
        deflater14.reset();
        int int16 = deflater14.getTotalIn();
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater14.setInput(byteArray23);
        deflater14.finish();
        long long26 = deflater14.getBytesRead();
        deflater14.reset();
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater14.setInput(byteArray34, (int) (short) 0, (int) (short) 1);
        deflater1.setInput(byteArray34);
        boolean boolean39 = deflater1.finished();
        deflater1.finish();
        java.util.zip.Deflater deflater42 = new java.util.zip.Deflater((int) (byte) 1);
        deflater42.reset();
        int int44 = deflater42.getTotalIn();
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater42.setInput(byteArray51);
        int int53 = deflater1.deflate(byteArray51);
        deflater1.finish();
        long long55 = deflater1.getBytesWritten();
        deflater1.end();
        boolean boolean57 = deflater1.needsInput();
        boolean boolean58 = deflater1.needsInput();
        java.util.zip.Deflater deflater61 = new java.util.zip.Deflater(3, true);
        deflater61.reset();
        deflater61.setStrategy(0);
        int int65 = deflater61.getAdler();
        deflater61.setLevel(2);
        java.util.zip.Deflater deflater69 = new java.util.zip.Deflater((int) (byte) 1);
        deflater69.reset();
        int int71 = deflater69.getTotalIn();
        byte[] byteArray78 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater69.setInput(byteArray78);
        deflater69.finish();
        long long81 = deflater69.getBytesRead();
        deflater69.reset();
        byte[] byteArray89 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater69.setInput(byteArray89, (int) (short) 0, (int) (short) 1);
        int int93 = deflater61.deflate(byteArray89);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater1.setDictionary(byteArray89);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        deflater1.finish();
        deflater1.reset();
        deflater1.end();
        boolean boolean8 = deflater1.needsInput();
        java.util.zip.Deflater deflater10 = new java.util.zip.Deflater((int) (byte) 1);
        deflater10.reset();
        int int12 = deflater10.getAdler();
        java.util.zip.Deflater deflater14 = new java.util.zip.Deflater((int) (byte) 1);
        deflater14.reset();
        int int16 = deflater14.getTotalIn();
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater14.setInput(byteArray23);
        deflater10.setInput(byteArray23, 0, 0);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int28 = deflater1.deflate(byteArray23);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(1, true);
        boolean boolean3 = deflater2.needsInput();
        deflater2.reset();
        deflater2.end();
        deflater2.end();
        java.util.zip.Deflater deflater8 = new java.util.zip.Deflater((int) (byte) 1);
        deflater8.reset();
        java.util.zip.Deflater deflater11 = new java.util.zip.Deflater((int) (byte) 1);
        deflater11.reset();
        int int13 = deflater11.getTotalIn();
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater11.setInput(byteArray20);
        deflater8.setInput(byteArray20);
        int int23 = deflater8.getTotalIn();
        int int24 = deflater8.getTotalOut();
        java.util.zip.Deflater deflater26 = new java.util.zip.Deflater((int) (byte) 1);
        deflater26.reset();
        int int28 = deflater26.getTotalIn();
        byte[] byteArray35 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater26.setInput(byteArray35);
        deflater26.finish();
        long long38 = deflater26.getBytesRead();
        deflater26.reset();
        int int40 = deflater26.getAdler();
        boolean boolean41 = deflater26.needsInput();
        int int42 = deflater26.getTotalIn();
        int int43 = deflater26.getTotalIn();
        java.util.zip.Deflater deflater45 = new java.util.zip.Deflater((int) (byte) 1);
        deflater45.reset();
        int int47 = deflater45.getTotalIn();
        byte[] byteArray54 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater45.setInput(byteArray54);
        deflater45.finish();
        long long57 = deflater45.getBytesRead();
        deflater45.reset();
        java.util.zip.Deflater deflater60 = new java.util.zip.Deflater((int) (byte) 1);
        deflater60.reset();
        int int62 = deflater60.getTotalIn();
        byte[] byteArray69 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater60.setInput(byteArray69);
        deflater60.finish();
        long long72 = deflater60.getBytesRead();
        deflater60.reset();
        byte[] byteArray80 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater60.setInput(byteArray80, (int) (short) 0, (int) (short) 1);
        int int84 = deflater45.deflate(byteArray80);
        deflater26.setDictionary(byteArray80);
        deflater8.setInput(byteArray80);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater2.setDictionary(byteArray80);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        int int2 = deflater1.getTotalOut();
        int int3 = deflater1.getTotalOut();
        long long4 = deflater1.getBytesWritten();
        deflater1.end();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        deflater7.finish();
        java.util.zip.Deflater deflater12 = new java.util.zip.Deflater((int) (byte) 1);
        deflater12.reset();
        int int14 = deflater12.getTotalIn();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater12.setInput(byteArray21);
        deflater7.setInput(byteArray21);
        int int24 = deflater7.getAdler();
        deflater7.reset();
        long long26 = deflater7.getBytesWritten();
        int int27 = deflater7.getTotalOut();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater(1, true);
        boolean boolean31 = deflater30.needsInput();
        long long32 = deflater30.getBytesWritten();
        java.util.zip.Deflater deflater34 = new java.util.zip.Deflater((int) (byte) 1);
        deflater34.reset();
        int int36 = deflater34.getTotalIn();
        int int37 = deflater34.getTotalIn();
        deflater34.finish();
        deflater34.reset();
        boolean boolean40 = deflater34.finished();
        long long41 = deflater34.getBytesRead();
        long long42 = deflater34.getBytesWritten();
        java.util.zip.Deflater deflater44 = new java.util.zip.Deflater((int) (byte) 1);
        deflater44.reset();
        int int46 = deflater44.getTotalIn();
        java.util.zip.Deflater deflater48 = new java.util.zip.Deflater((int) (byte) 1);
        deflater48.reset();
        int int50 = deflater48.getTotalIn();
        byte[] byteArray57 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater48.setInput(byteArray57);
        deflater48.finish();
        long long60 = deflater48.getBytesRead();
        deflater48.reset();
        java.util.zip.Deflater deflater63 = new java.util.zip.Deflater((int) (byte) 1);
        deflater63.reset();
        int int65 = deflater63.getTotalIn();
        byte[] byteArray72 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater63.setInput(byteArray72);
        deflater63.finish();
        long long75 = deflater63.getBytesRead();
        deflater63.reset();
        byte[] byteArray83 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater63.setInput(byteArray83, (int) (short) 0, (int) (short) 1);
        deflater48.setDictionary(byteArray83);
        deflater44.setInput(byteArray83);
        deflater34.setInput(byteArray83);
        deflater30.setDictionary(byteArray83, 2, (int) (byte) 1);
        deflater7.setInput(byteArray83);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deflater1.setDictionary(byteArray83);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater7.setInput(byteArray16);
        deflater7.finish();
        long long19 = deflater7.getBytesRead();
        deflater7.reset();
        java.util.zip.Deflater deflater22 = new java.util.zip.Deflater((int) (byte) 1);
        deflater22.reset();
        int int24 = deflater22.getTotalIn();
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater22.setInput(byteArray31);
        deflater22.finish();
        long long34 = deflater22.getBytesRead();
        deflater22.reset();
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater22.setInput(byteArray42, (int) (short) 0, (int) (short) 1);
        deflater7.setDictionary(byteArray42);
        deflater2.setInput(byteArray42);
        int int48 = deflater2.getTotalIn();
        deflater2.reset();
        deflater2.end();
        boolean boolean51 = deflater2.finished();
        deflater2.setLevel((int) (byte) 1);
        boolean boolean54 = deflater2.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater2.reset();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        deflater2.end();
        deflater2.end();
        java.util.zip.Deflater deflater10 = new java.util.zip.Deflater((int) (short) -1, false);
        long long11 = deflater10.getBytesWritten();
        java.util.zip.Deflater deflater13 = new java.util.zip.Deflater((int) (byte) 1);
        deflater13.reset();
        int int15 = deflater13.getTotalIn();
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater13.setInput(byteArray22);
        deflater10.setDictionary(byteArray22);
        boolean boolean25 = deflater10.needsInput();
        java.util.zip.Deflater deflater28 = new java.util.zip.Deflater((int) (short) -1, false);
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getAdler();
        java.util.zip.Deflater deflater34 = new java.util.zip.Deflater((int) (byte) 1);
        deflater34.reset();
        int int36 = deflater34.getTotalIn();
        byte[] byteArray43 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater34.setInput(byteArray43);
        deflater30.setInput(byteArray43, 0, 0);
        int int48 = deflater28.deflate(byteArray43);
        deflater10.setInput(byteArray43);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int50 = deflater2.deflate(byteArray43);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getAdler();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater1.setInput(byteArray14, 0, 0);
        long long19 = deflater1.getBytesRead();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long21 = deflater1.getBytesRead();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        int int6 = deflater4.getTotalIn();
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater4.setInput(byteArray13);
        deflater4.finish();
        long long16 = deflater4.getBytesRead();
        deflater4.reset();
        java.util.zip.Deflater deflater19 = new java.util.zip.Deflater((int) (byte) 1);
        deflater19.reset();
        int int21 = deflater19.getTotalIn();
        byte[] byteArray28 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater19.setInput(byteArray28);
        deflater19.finish();
        long long31 = deflater19.getBytesRead();
        deflater19.reset();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater19.setInput(byteArray39, (int) (short) 0, (int) (short) 1);
        deflater4.setDictionary(byteArray39);
        deflater1.setInput(byteArray39);
        deflater1.end();
        deflater1.end();
        deflater1.setLevel(0);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int49 = deflater1.getTotalIn();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(1, true);
        boolean boolean3 = deflater2.needsInput();
        deflater2.end();
        boolean boolean5 = deflater2.finished();
        deflater2.end();
        boolean boolean7 = deflater2.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long8 = deflater2.getBytesWritten();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        deflater1.reset();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater1.setInput(byteArray21, (int) (short) 0, (int) (short) 1);
        deflater1.reset();
        deflater1.reset();
        java.util.zip.Deflater deflater28 = new java.util.zip.Deflater((int) (byte) 1);
        long long29 = deflater28.getBytesWritten();
        int int30 = deflater28.getTotalOut();
        long long31 = deflater28.getBytesWritten();
        java.util.zip.Deflater deflater33 = new java.util.zip.Deflater((int) (byte) 1);
        deflater33.reset();
        deflater33.reset();
        java.util.zip.Deflater deflater37 = new java.util.zip.Deflater((int) (byte) 1);
        deflater37.reset();
        int int39 = deflater37.getTotalIn();
        byte[] byteArray46 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater37.setInput(byteArray46);
        deflater33.setDictionary(byteArray46);
        deflater28.setDictionary(byteArray46);
        deflater1.setInput(byteArray46);
        deflater1.finish();
        deflater1.setLevel((int) (byte) 0);
        deflater1.reset();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int56 = deflater1.getTotalIn();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        deflater1.finish();
        int int6 = deflater1.getTotalOut();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int8 = deflater1.getAdler();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(3, true);
        deflater2.reset();
        deflater2.end();
        deflater2.finish();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int6 = deflater2.getTotalOut();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater7.setInput(byteArray16);
        deflater4.setInput(byteArray16);
        deflater2.setInput(byteArray16);
        deflater2.setStrategy(0);
        boolean boolean22 = deflater2.needsInput();
        java.util.zip.Deflater deflater25 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater27 = new java.util.zip.Deflater((int) (byte) 1);
        deflater27.reset();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getTotalIn();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater30.setInput(byteArray39);
        deflater27.setInput(byteArray39);
        deflater25.setInput(byteArray39);
        deflater2.setInput(byteArray39);
        java.util.zip.Deflater deflater45 = new java.util.zip.Deflater((int) (byte) 1);
        deflater45.reset();
        int int47 = deflater45.getTotalIn();
        byte[] byteArray54 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater45.setInput(byteArray54);
        deflater45.finish();
        long long57 = deflater45.getBytesRead();
        deflater45.reset();
        byte[] byteArray65 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater45.setInput(byteArray65, (int) (short) 0, (int) (short) 1);
        deflater2.setInput(byteArray65);
        int int70 = deflater2.getTotalOut();
        deflater2.end();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater2.reset();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        deflater1.reset();
        int int15 = deflater1.getAdler();
        boolean boolean16 = deflater1.needsInput();
        int int17 = deflater1.getTotalIn();
        deflater1.end();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int20 = deflater1.getTotalIn();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater7.setInput(byteArray16);
        deflater7.finish();
        long long19 = deflater7.getBytesRead();
        deflater7.reset();
        java.util.zip.Deflater deflater22 = new java.util.zip.Deflater((int) (byte) 1);
        deflater22.reset();
        int int24 = deflater22.getTotalIn();
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater22.setInput(byteArray31);
        deflater22.finish();
        long long34 = deflater22.getBytesRead();
        deflater22.reset();
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater22.setInput(byteArray42, (int) (short) 0, (int) (short) 1);
        deflater7.setDictionary(byteArray42);
        deflater2.setInput(byteArray42);
        int int48 = deflater2.getTotalIn();
        boolean boolean49 = deflater2.needsInput();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long51 = deflater2.getBytesWritten();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        java.util.zip.Deflater deflater15 = new java.util.zip.Deflater((int) (byte) 1);
        deflater15.reset();
        int int17 = deflater15.getTotalIn();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater15.setInput(byteArray24);
        deflater15.finish();
        long long27 = deflater15.getBytesRead();
        deflater15.reset();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getTotalIn();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater30.setInput(byteArray39);
        deflater30.finish();
        long long42 = deflater30.getBytesRead();
        deflater30.reset();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater30.setInput(byteArray50, (int) (short) 0, (int) (short) 1);
        deflater15.setDictionary(byteArray50);
        int int55 = deflater1.deflate(byteArray50);
        deflater1.setLevel(3);
        deflater1.end();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater1.reset();
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        int int2 = deflater1.getTotalOut();
        int int3 = deflater1.getTotalOut();
        java.util.zip.Deflater deflater6 = new java.util.zip.Deflater((int) (short) -1, false);
        java.util.zip.Deflater deflater8 = new java.util.zip.Deflater((int) (byte) 1);
        deflater8.reset();
        int int10 = deflater8.getAdler();
        java.util.zip.Deflater deflater12 = new java.util.zip.Deflater((int) (byte) 1);
        deflater12.reset();
        int int14 = deflater12.getTotalIn();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater12.setInput(byteArray21);
        deflater8.setInput(byteArray21, 0, 0);
        int int26 = deflater6.deflate(byteArray21);
        deflater6.end();
        java.util.zip.Deflater deflater29 = new java.util.zip.Deflater((int) (byte) 1);
        long long30 = deflater29.getBytesWritten();
        int int31 = deflater29.getTotalIn();
        java.util.zip.Deflater deflater33 = new java.util.zip.Deflater((int) (byte) 1);
        deflater33.reset();
        int int35 = deflater33.getTotalIn();
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater33.setInput(byteArray42);
        deflater33.finish();
        long long45 = deflater33.getBytesRead();
        deflater33.reset();
        java.util.zip.Deflater deflater48 = new java.util.zip.Deflater((int) (byte) 1);
        deflater48.reset();
        int int50 = deflater48.getTotalIn();
        byte[] byteArray57 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater48.setInput(byteArray57);
        deflater48.finish();
        long long60 = deflater48.getBytesRead();
        deflater48.reset();
        byte[] byteArray68 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater48.setInput(byteArray68, (int) (short) 0, (int) (short) 1);
        deflater33.setDictionary(byteArray68);
        int int73 = deflater29.deflate(byteArray68);
        deflater6.setInput(byteArray68);
        int int75 = deflater1.deflate(byteArray68);
        deflater1.finish();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int78 = deflater1.getAdler();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        deflater1.reset();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater1.setInput(byteArray21, (int) (short) 0, (int) (short) 1);
        deflater1.reset();
        deflater1.end();
        java.util.zip.Deflater deflater28 = new java.util.zip.Deflater((int) (byte) 1);
        deflater28.reset();
        int int30 = deflater28.getTotalIn();
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater28.setInput(byteArray37);
        deflater28.reset();
        java.util.zip.Deflater deflater41 = new java.util.zip.Deflater((int) (byte) 1);
        deflater41.reset();
        int int43 = deflater41.getTotalIn();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater41.setInput(byteArray50);
        deflater41.finish();
        long long53 = deflater41.getBytesRead();
        deflater41.reset();
        byte[] byteArray61 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater41.setInput(byteArray61, (int) (short) 0, (int) (short) 1);
        deflater28.setInput(byteArray61);
        boolean boolean66 = deflater28.finished();
        deflater28.finish();
        java.util.zip.Deflater deflater69 = new java.util.zip.Deflater((int) (byte) 1);
        deflater69.reset();
        int int71 = deflater69.getTotalIn();
        byte[] byteArray78 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater69.setInput(byteArray78);
        int int80 = deflater28.deflate(byteArray78);
        deflater1.setInput(byteArray78);
        boolean boolean82 = deflater1.needsInput();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deflater1.reset();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        deflater2.finish();
        deflater2.finish();
        boolean boolean5 = deflater2.finished();
        deflater2.finish();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int8 = deflater2.getTotalOut();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        deflater2.end();
        boolean boolean7 = deflater2.needsInput();
        deflater2.setLevel(6);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int10 = deflater2.getTotalIn();
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(1, true);
        boolean boolean3 = deflater2.needsInput();
        deflater2.reset();
        deflater2.end();
        deflater2.end();
        boolean boolean7 = deflater2.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int8 = deflater2.getAdler();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) -1);
        boolean boolean2 = deflater1.finished();
        deflater1.finish();
        int int4 = deflater1.getTotalIn();
        deflater1.end();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        java.util.zip.Deflater deflater11 = new java.util.zip.Deflater((int) (byte) 1);
        deflater11.reset();
        int int13 = deflater11.getTotalIn();
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater11.setInput(byteArray20);
        deflater11.finish();
        long long23 = deflater11.getBytesRead();
        deflater11.reset();
        java.util.zip.Deflater deflater27 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater29 = new java.util.zip.Deflater((int) (byte) 1);
        deflater29.reset();
        java.util.zip.Deflater deflater32 = new java.util.zip.Deflater((int) (byte) 1);
        deflater32.reset();
        int int34 = deflater32.getTotalIn();
        byte[] byteArray41 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater32.setInput(byteArray41);
        deflater29.setInput(byteArray41);
        deflater27.setInput(byteArray41);
        deflater27.setStrategy(0);
        boolean boolean47 = deflater27.needsInput();
        java.util.zip.Deflater deflater50 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater52 = new java.util.zip.Deflater((int) (byte) 1);
        deflater52.reset();
        java.util.zip.Deflater deflater55 = new java.util.zip.Deflater((int) (byte) 1);
        deflater55.reset();
        int int57 = deflater55.getTotalIn();
        byte[] byteArray64 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater55.setInput(byteArray64);
        deflater52.setInput(byteArray64);
        deflater50.setInput(byteArray64);
        deflater27.setInput(byteArray64);
        deflater11.setDictionary(byteArray64);
        int int70 = deflater7.deflate(byteArray64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deflater1.setDictionary(byteArray64);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater(9);
        java.util.zip.Deflater deflater3 = new java.util.zip.Deflater((int) (byte) 1);
        long long4 = deflater3.getBytesWritten();
        long long5 = deflater3.getBytesWritten();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) -1);
        boolean boolean8 = deflater7.finished();
        java.util.zip.Deflater deflater10 = new java.util.zip.Deflater((int) (byte) 1);
        deflater10.reset();
        int int12 = deflater10.getTotalIn();
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater10.setInput(byteArray19);
        deflater10.finish();
        long long22 = deflater10.getBytesRead();
        java.util.zip.Deflater deflater24 = new java.util.zip.Deflater((int) (byte) 1);
        deflater24.reset();
        int int26 = deflater24.getTotalIn();
        byte[] byteArray33 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater24.setInput(byteArray33);
        deflater24.finish();
        long long36 = deflater24.getBytesRead();
        deflater24.reset();
        java.util.zip.Deflater deflater39 = new java.util.zip.Deflater((int) (byte) 1);
        deflater39.reset();
        int int41 = deflater39.getTotalIn();
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater39.setInput(byteArray48);
        deflater39.finish();
        long long51 = deflater39.getBytesRead();
        deflater39.reset();
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater39.setInput(byteArray59, (int) (short) 0, (int) (short) 1);
        deflater24.setDictionary(byteArray59);
        int int64 = deflater10.deflate(byteArray59);
        int int67 = deflater7.deflate(byteArray59, (int) (byte) 1, 2);
        java.util.zip.Deflater deflater69 = new java.util.zip.Deflater((int) (byte) 1);
        deflater69.reset();
        int int71 = deflater69.getTotalIn();
        deflater69.finish();
        java.util.zip.Deflater deflater74 = new java.util.zip.Deflater((int) (byte) 1);
        deflater74.reset();
        int int76 = deflater74.getTotalIn();
        byte[] byteArray83 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater74.setInput(byteArray83);
        deflater69.setInput(byteArray83);
        deflater7.setInput(byteArray83);
        int int87 = deflater3.deflate(byteArray83);
        int int88 = deflater1.deflate(byteArray83);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long90 = deflater1.getBytesRead();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        deflater1.finish();
        java.util.zip.Deflater deflater6 = new java.util.zip.Deflater((int) (byte) 1);
        deflater6.reset();
        int int8 = deflater6.getTotalIn();
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater6.setInput(byteArray15);
        deflater1.setInput(byteArray15);
        int int18 = deflater1.getAdler();
        boolean boolean19 = deflater1.needsInput();
        deflater1.setStrategy(0);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int23 = deflater1.getTotalIn();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        int int6 = deflater4.getAdler();
        java.util.zip.Deflater deflater8 = new java.util.zip.Deflater((int) (byte) 1);
        deflater8.reset();
        int int10 = deflater8.getTotalIn();
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater8.setInput(byteArray17);
        deflater4.setInput(byteArray17, 0, 0);
        int int22 = deflater2.deflate(byteArray17);
        deflater2.end();
        java.util.zip.Deflater deflater25 = new java.util.zip.Deflater((int) (byte) 1);
        long long26 = deflater25.getBytesWritten();
        int int27 = deflater25.getTotalIn();
        java.util.zip.Deflater deflater29 = new java.util.zip.Deflater((int) (byte) 1);
        deflater29.reset();
        int int31 = deflater29.getTotalIn();
        byte[] byteArray38 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater29.setInput(byteArray38);
        deflater29.finish();
        long long41 = deflater29.getBytesRead();
        deflater29.reset();
        java.util.zip.Deflater deflater44 = new java.util.zip.Deflater((int) (byte) 1);
        deflater44.reset();
        int int46 = deflater44.getTotalIn();
        byte[] byteArray53 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater44.setInput(byteArray53);
        deflater44.finish();
        long long56 = deflater44.getBytesRead();
        deflater44.reset();
        byte[] byteArray64 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater44.setInput(byteArray64, (int) (short) 0, (int) (short) 1);
        deflater29.setDictionary(byteArray64);
        int int69 = deflater25.deflate(byteArray64);
        deflater2.setInput(byteArray64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long71 = deflater2.getBytesWritten();
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        int int2 = deflater1.getTotalOut();
        int int3 = deflater1.getTotalOut();
        long long4 = deflater1.getBytesWritten();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int6 = deflater1.getAdler();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        deflater1.finish();
        deflater1.reset();
        deflater1.end();
        java.util.zip.Deflater deflater10 = new java.util.zip.Deflater((int) (short) -1, false);
        long long11 = deflater10.getBytesWritten();
        java.util.zip.Deflater deflater13 = new java.util.zip.Deflater((int) (byte) 1);
        deflater13.reset();
        int int15 = deflater13.getTotalIn();
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater13.setInput(byteArray22);
        deflater10.setDictionary(byteArray22);
        boolean boolean25 = deflater10.needsInput();
        java.util.zip.Deflater deflater28 = new java.util.zip.Deflater((int) (short) -1, false);
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getAdler();
        java.util.zip.Deflater deflater34 = new java.util.zip.Deflater((int) (byte) 1);
        deflater34.reset();
        int int36 = deflater34.getTotalIn();
        byte[] byteArray43 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater34.setInput(byteArray43);
        deflater30.setInput(byteArray43, 0, 0);
        int int48 = deflater28.deflate(byteArray43);
        deflater10.setInput(byteArray43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int50 = deflater1.deflate(byteArray43);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) 0, true);
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long4 = deflater2.getBytesWritten();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater9 = new java.util.zip.Deflater((int) (byte) 1);
        deflater9.reset();
        java.util.zip.Deflater deflater12 = new java.util.zip.Deflater((int) (byte) 1);
        deflater12.reset();
        int int14 = deflater12.getTotalIn();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater12.setInput(byteArray21);
        deflater9.setInput(byteArray21);
        deflater7.setInput(byteArray21);
        deflater7.setStrategy(0);
        boolean boolean27 = deflater7.needsInput();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater32 = new java.util.zip.Deflater((int) (byte) 1);
        deflater32.reset();
        java.util.zip.Deflater deflater35 = new java.util.zip.Deflater((int) (byte) 1);
        deflater35.reset();
        int int37 = deflater35.getTotalIn();
        byte[] byteArray44 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater35.setInput(byteArray44);
        deflater32.setInput(byteArray44);
        deflater30.setInput(byteArray44);
        deflater7.setInput(byteArray44);
        java.util.zip.Deflater deflater50 = new java.util.zip.Deflater((int) (byte) 1);
        deflater50.reset();
        int int52 = deflater50.getTotalIn();
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater50.setInput(byteArray59);
        deflater50.finish();
        long long62 = deflater50.getBytesRead();
        deflater50.reset();
        byte[] byteArray70 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater50.setInput(byteArray70, (int) (short) 0, (int) (short) 1);
        deflater7.setInput(byteArray70);
        int int75 = deflater1.deflate(byteArray70);
        deflater1.end();
        boolean boolean77 = deflater1.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int78 = deflater1.getAdler();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        deflater1.reset();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater1.setInput(byteArray21, (int) (short) 0, (int) (short) 1);
        deflater1.reset();
        deflater1.end();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long28 = deflater1.getBytesWritten();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        int int6 = deflater4.getAdler();
        java.util.zip.Deflater deflater8 = new java.util.zip.Deflater((int) (byte) 1);
        deflater8.reset();
        int int10 = deflater8.getTotalIn();
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater8.setInput(byteArray17);
        deflater4.setInput(byteArray17, 0, 0);
        int int22 = deflater2.deflate(byteArray17);
        deflater2.reset();
        boolean boolean24 = deflater2.needsInput();
        long long25 = deflater2.getBytesWritten();
        deflater2.end();
        boolean boolean27 = deflater2.finished();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long29 = deflater2.getBytesRead();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater7.setInput(byteArray16);
        deflater7.finish();
        long long19 = deflater7.getBytesRead();
        deflater7.reset();
        java.util.zip.Deflater deflater22 = new java.util.zip.Deflater((int) (byte) 1);
        deflater22.reset();
        int int24 = deflater22.getTotalIn();
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater22.setInput(byteArray31);
        deflater22.finish();
        long long34 = deflater22.getBytesRead();
        deflater22.reset();
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater22.setInput(byteArray42, (int) (short) 0, (int) (short) 1);
        deflater7.setDictionary(byteArray42);
        deflater2.setInput(byteArray42);
        deflater2.end();
        boolean boolean49 = deflater2.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long50 = deflater2.getBytesRead();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        java.util.zip.Deflater deflater15 = new java.util.zip.Deflater((int) (byte) 1);
        deflater15.reset();
        int int17 = deflater15.getTotalIn();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater15.setInput(byteArray24);
        deflater15.finish();
        long long27 = deflater15.getBytesRead();
        deflater15.reset();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getTotalIn();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater30.setInput(byteArray39);
        deflater30.finish();
        long long42 = deflater30.getBytesRead();
        deflater30.reset();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater30.setInput(byteArray50, (int) (short) 0, (int) (short) 1);
        deflater15.setDictionary(byteArray50);
        int int55 = deflater1.deflate(byteArray50);
        deflater1.setLevel(3);
        deflater1.end();
        deflater1.setStrategy((int) (short) 0);
        boolean boolean61 = deflater1.finished();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int62 = deflater1.getTotalIn();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        java.util.zip.Deflater deflater16 = new java.util.zip.Deflater((-1), true);
        long long17 = deflater16.getBytesWritten();
        deflater16.setLevel(2);
        java.util.zip.Deflater deflater21 = new java.util.zip.Deflater((int) (byte) 1);
        deflater21.reset();
        int int23 = deflater21.getTotalIn();
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater21.setInput(byteArray30);
        deflater21.finish();
        long long33 = deflater21.getBytesRead();
        deflater21.reset();
        java.util.zip.Deflater deflater36 = new java.util.zip.Deflater((int) (byte) 1);
        deflater36.reset();
        int int38 = deflater36.getTotalIn();
        byte[] byteArray45 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater36.setInput(byteArray45);
        deflater36.finish();
        long long48 = deflater36.getBytesRead();
        deflater36.reset();
        byte[] byteArray56 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater36.setInput(byteArray56, (int) (short) 0, (int) (short) 1);
        deflater21.setDictionary(byteArray56);
        deflater16.setInput(byteArray56);
        deflater1.setInput(byteArray56, 3, 1);
        boolean boolean65 = deflater1.finished();
        int int66 = deflater1.getTotalOut();
        deflater1.reset();
        boolean boolean68 = deflater1.needsInput();
        long long69 = deflater1.getBytesRead();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int71 = deflater1.getTotalIn();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        deflater2.finish();
        long long7 = deflater2.getBytesRead();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int9 = deflater2.getTotalIn();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        java.util.zip.Deflater deflater15 = new java.util.zip.Deflater((int) (byte) 1);
        deflater15.reset();
        int int17 = deflater15.getTotalIn();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater15.setInput(byteArray24);
        deflater15.finish();
        long long27 = deflater15.getBytesRead();
        deflater15.reset();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getTotalIn();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater30.setInput(byteArray39);
        deflater30.finish();
        long long42 = deflater30.getBytesRead();
        deflater30.reset();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater30.setInput(byteArray50, (int) (short) 0, (int) (short) 1);
        deflater15.setDictionary(byteArray50);
        int int55 = deflater1.deflate(byteArray50);
        deflater1.setLevel(3);
        deflater1.end();
        deflater1.setLevel((int) (byte) -1);
        deflater1.setStrategy((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long63 = deflater1.getBytesRead();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        int int3 = deflater1.getTotalOut();
        deflater1.end();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater();
        deflater5.reset();
        long long7 = deflater5.getBytesWritten();
        int int8 = deflater5.getTotalIn();
        java.util.zip.Deflater deflater10 = new java.util.zip.Deflater((int) (byte) -1);
        boolean boolean11 = deflater10.finished();
        java.util.zip.Deflater deflater13 = new java.util.zip.Deflater((int) (byte) 1);
        deflater13.reset();
        int int15 = deflater13.getTotalIn();
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater13.setInput(byteArray22);
        deflater13.finish();
        long long25 = deflater13.getBytesRead();
        java.util.zip.Deflater deflater27 = new java.util.zip.Deflater((int) (byte) 1);
        deflater27.reset();
        int int29 = deflater27.getTotalIn();
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater27.setInput(byteArray36);
        deflater27.finish();
        long long39 = deflater27.getBytesRead();
        deflater27.reset();
        java.util.zip.Deflater deflater42 = new java.util.zip.Deflater((int) (byte) 1);
        deflater42.reset();
        int int44 = deflater42.getTotalIn();
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater42.setInput(byteArray51);
        deflater42.finish();
        long long54 = deflater42.getBytesRead();
        deflater42.reset();
        byte[] byteArray62 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater42.setInput(byteArray62, (int) (short) 0, (int) (short) 1);
        deflater27.setDictionary(byteArray62);
        int int67 = deflater13.deflate(byteArray62);
        int int70 = deflater10.deflate(byteArray62, (int) (byte) 1, 2);
        int int73 = deflater5.deflate(byteArray62, 0, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deflater1.setDictionary(byteArray62);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        deflater1.end();
        boolean boolean7 = deflater1.needsInput();
        deflater1.finish();
        java.util.zip.Deflater deflater10 = new java.util.zip.Deflater((int) (byte) 1);
        deflater10.reset();
        int int12 = deflater10.getTotalIn();
        int int13 = deflater10.getTotalIn();
        int int14 = deflater10.getTotalIn();
        deflater10.setLevel((int) (short) 1);
        deflater10.setLevel((int) (byte) 1);
        boolean boolean19 = deflater10.finished();
        java.util.zip.Deflater deflater22 = new java.util.zip.Deflater((int) (short) -1, false);
        int int23 = deflater22.getTotalIn();
        int int24 = deflater22.getTotalIn();
        boolean boolean25 = deflater22.finished();
        java.util.zip.Deflater deflater27 = new java.util.zip.Deflater((int) (byte) 1);
        long long28 = deflater27.getBytesWritten();
        int int29 = deflater27.getTotalIn();
        java.util.zip.Deflater deflater31 = new java.util.zip.Deflater((int) (byte) 1);
        deflater31.reset();
        int int33 = deflater31.getTotalIn();
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater31.setInput(byteArray40);
        deflater31.finish();
        long long43 = deflater31.getBytesRead();
        deflater31.reset();
        java.util.zip.Deflater deflater46 = new java.util.zip.Deflater((int) (byte) 1);
        deflater46.reset();
        int int48 = deflater46.getTotalIn();
        byte[] byteArray55 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater46.setInput(byteArray55);
        deflater46.finish();
        long long58 = deflater46.getBytesRead();
        deflater46.reset();
        byte[] byteArray66 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater46.setInput(byteArray66, (int) (short) 0, (int) (short) 1);
        deflater31.setDictionary(byteArray66);
        int int71 = deflater27.deflate(byteArray66);
        deflater22.setDictionary(byteArray66);
        int int73 = deflater10.deflate(byteArray66);
        deflater1.setInput(byteArray66);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int75 = deflater1.getTotalIn();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        deflater1.finish();
        int int6 = deflater1.getTotalOut();
        boolean boolean7 = deflater1.finished();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int9 = deflater1.getTotalOut();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.reset();
        java.util.zip.Deflater deflater14 = new java.util.zip.Deflater((int) (byte) 1);
        deflater14.reset();
        int int16 = deflater14.getTotalIn();
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater14.setInput(byteArray23);
        deflater14.finish();
        long long26 = deflater14.getBytesRead();
        deflater14.reset();
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater14.setInput(byteArray34, (int) (short) 0, (int) (short) 1);
        deflater1.setInput(byteArray34);
        boolean boolean39 = deflater1.finished();
        deflater1.finish();
        java.util.zip.Deflater deflater42 = new java.util.zip.Deflater((int) (byte) 1);
        deflater42.reset();
        int int44 = deflater42.getTotalIn();
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater42.setInput(byteArray51);
        int int53 = deflater1.deflate(byteArray51);
        deflater1.finish();
        long long55 = deflater1.getBytesWritten();
        deflater1.end();
        boolean boolean57 = deflater1.needsInput();
        boolean boolean58 = deflater1.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long59 = deflater1.getBytesRead();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(1, true);
        boolean boolean3 = deflater2.needsInput();
        deflater2.end();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int6 = deflater2.getTotalOut();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        deflater1.finish();
        deflater1.reset();
        deflater1.end();
        boolean boolean8 = deflater1.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int9 = deflater1.getTotalOut();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (byte) 0, false);
        boolean boolean3 = deflater2.needsInput();
        long long4 = deflater2.getBytesWritten();
        deflater2.end();
        java.util.zip.Deflater deflater8 = new java.util.zip.Deflater((int) (short) -1, false);
        int int9 = deflater8.getTotalIn();
        int int10 = deflater8.getTotalIn();
        boolean boolean11 = deflater8.finished();
        deflater8.end();
        deflater8.setLevel((int) (short) -1);
        deflater8.end();
        boolean boolean16 = deflater8.finished();
        java.util.zip.Deflater deflater18 = new java.util.zip.Deflater(0);
        java.util.zip.Deflater deflater21 = new java.util.zip.Deflater((-1), true);
        long long22 = deflater21.getBytesWritten();
        deflater21.setLevel(2);
        java.util.zip.Deflater deflater26 = new java.util.zip.Deflater((int) (byte) 1);
        deflater26.reset();
        int int28 = deflater26.getTotalIn();
        byte[] byteArray35 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater26.setInput(byteArray35);
        deflater26.finish();
        long long38 = deflater26.getBytesRead();
        deflater26.reset();
        java.util.zip.Deflater deflater41 = new java.util.zip.Deflater((int) (byte) 1);
        deflater41.reset();
        int int43 = deflater41.getTotalIn();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater41.setInput(byteArray50);
        deflater41.finish();
        long long53 = deflater41.getBytesRead();
        deflater41.reset();
        byte[] byteArray61 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater41.setInput(byteArray61, (int) (short) 0, (int) (short) 1);
        deflater26.setDictionary(byteArray61);
        deflater21.setInput(byteArray61);
        long long67 = deflater21.getBytesRead();
        java.util.zip.Deflater deflater69 = new java.util.zip.Deflater((int) (byte) 1);
        deflater69.reset();
        deflater69.reset();
        java.util.zip.Deflater deflater73 = new java.util.zip.Deflater((int) (byte) 1);
        deflater73.reset();
        int int75 = deflater73.getTotalIn();
        byte[] byteArray82 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater73.setInput(byteArray82);
        deflater69.setDictionary(byteArray82);
        deflater21.setInput(byteArray82);
        deflater18.setDictionary(byteArray82, 1, (int) (byte) 1);
        deflater8.setInput(byteArray82);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int90 = deflater2.deflate(byteArray82);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 0);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long3 = deflater1.getBytesRead();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        int int6 = deflater4.getTotalIn();
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater4.setInput(byteArray13);
        deflater4.finish();
        long long16 = deflater4.getBytesRead();
        deflater4.reset();
        java.util.zip.Deflater deflater19 = new java.util.zip.Deflater((int) (byte) 1);
        deflater19.reset();
        int int21 = deflater19.getTotalIn();
        byte[] byteArray28 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater19.setInput(byteArray28);
        deflater19.finish();
        long long31 = deflater19.getBytesRead();
        deflater19.reset();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater19.setInput(byteArray39, (int) (short) 0, (int) (short) 1);
        deflater4.setDictionary(byteArray39);
        deflater1.setInput(byteArray39);
        deflater1.end();
        deflater1.end();
        deflater1.setLevel((int) (short) 1);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long49 = deflater1.getBytesRead();
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        deflater1.reset();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater1.setDictionary(byteArray14);
        int int17 = deflater1.getAdler();
        int int18 = deflater1.getAdler();
        boolean boolean19 = deflater1.needsInput();
        deflater1.end();
        boolean boolean21 = deflater1.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int22 = deflater1.getAdler();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        java.util.zip.Deflater deflater0 = new java.util.zip.Deflater();
        deflater0.end();
        deflater0.end();
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        int int6 = deflater4.getTotalIn();
        int int7 = deflater4.getTotalIn();
        deflater4.finish();
        deflater4.reset();
        boolean boolean10 = deflater4.finished();
        java.util.zip.Deflater deflater12 = new java.util.zip.Deflater((int) (byte) 1);
        deflater12.reset();
        int int14 = deflater12.getTotalIn();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater12.setInput(byteArray21);
        deflater12.finish();
        long long24 = deflater12.getBytesRead();
        deflater12.reset();
        int int26 = deflater12.getAdler();
        boolean boolean27 = deflater12.needsInput();
        java.util.zip.Deflater deflater29 = new java.util.zip.Deflater((int) (byte) 1);
        deflater29.reset();
        int int31 = deflater29.getTotalIn();
        java.util.zip.Deflater deflater33 = new java.util.zip.Deflater((int) (byte) 1);
        deflater33.reset();
        int int35 = deflater33.getTotalIn();
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater33.setInput(byteArray42);
        deflater33.finish();
        long long45 = deflater33.getBytesRead();
        deflater33.reset();
        java.util.zip.Deflater deflater49 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater51 = new java.util.zip.Deflater((int) (byte) 1);
        deflater51.reset();
        java.util.zip.Deflater deflater54 = new java.util.zip.Deflater((int) (byte) 1);
        deflater54.reset();
        int int56 = deflater54.getTotalIn();
        byte[] byteArray63 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater54.setInput(byteArray63);
        deflater51.setInput(byteArray63);
        deflater49.setInput(byteArray63);
        deflater49.setStrategy(0);
        boolean boolean69 = deflater49.needsInput();
        java.util.zip.Deflater deflater72 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater74 = new java.util.zip.Deflater((int) (byte) 1);
        deflater74.reset();
        java.util.zip.Deflater deflater77 = new java.util.zip.Deflater((int) (byte) 1);
        deflater77.reset();
        int int79 = deflater77.getTotalIn();
        byte[] byteArray86 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater77.setInput(byteArray86);
        deflater74.setInput(byteArray86);
        deflater72.setInput(byteArray86);
        deflater49.setInput(byteArray86);
        deflater33.setDictionary(byteArray86);
        int int92 = deflater29.deflate(byteArray86);
        int int93 = deflater12.deflate(byteArray86);
        int int94 = deflater4.deflate(byteArray86);
        deflater0.setInput(byteArray86);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long96 = deflater0.getBytesRead();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        long long6 = deflater1.getBytesWritten();
        int int7 = deflater1.getTotalOut();
        int int8 = deflater1.getAdler();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int10 = deflater1.getAdler();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        java.util.zip.Deflater deflater0 = new java.util.zip.Deflater();
        deflater0.end();
        deflater0.setLevel((int) (short) 1);
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater5.finish();
        long long17 = deflater5.getBytesRead();
        deflater5.reset();
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater5.setInput(byteArray25, (int) (short) 0, (int) (short) 1);
        deflater5.reset();
        deflater5.end();
        java.util.zip.Deflater deflater32 = new java.util.zip.Deflater((int) (byte) 1);
        deflater32.reset();
        int int34 = deflater32.getTotalIn();
        byte[] byteArray41 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater32.setInput(byteArray41);
        deflater32.reset();
        java.util.zip.Deflater deflater45 = new java.util.zip.Deflater((int) (byte) 1);
        deflater45.reset();
        int int47 = deflater45.getTotalIn();
        byte[] byteArray54 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater45.setInput(byteArray54);
        deflater45.finish();
        long long57 = deflater45.getBytesRead();
        deflater45.reset();
        byte[] byteArray65 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater45.setInput(byteArray65, (int) (short) 0, (int) (short) 1);
        deflater32.setInput(byteArray65);
        boolean boolean70 = deflater32.finished();
        deflater32.finish();
        java.util.zip.Deflater deflater73 = new java.util.zip.Deflater((int) (byte) 1);
        deflater73.reset();
        int int75 = deflater73.getTotalIn();
        byte[] byteArray82 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater73.setInput(byteArray82);
        int int84 = deflater32.deflate(byteArray82);
        deflater5.setInput(byteArray82);
        deflater0.setInput(byteArray82);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int87 = deflater0.getTotalIn();
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater7.setInput(byteArray16);
        deflater4.setInput(byteArray16);
        deflater2.setInput(byteArray16);
        java.util.zip.Deflater deflater22 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater24 = new java.util.zip.Deflater((int) (byte) 1);
        deflater24.reset();
        java.util.zip.Deflater deflater27 = new java.util.zip.Deflater((int) (byte) 1);
        deflater27.reset();
        int int29 = deflater27.getTotalIn();
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater27.setInput(byteArray36);
        deflater24.setInput(byteArray36);
        deflater22.setInput(byteArray36);
        deflater22.setStrategy(0);
        boolean boolean42 = deflater22.needsInput();
        java.util.zip.Deflater deflater45 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater47 = new java.util.zip.Deflater((int) (byte) 1);
        deflater47.reset();
        java.util.zip.Deflater deflater50 = new java.util.zip.Deflater((int) (byte) 1);
        deflater50.reset();
        int int52 = deflater50.getTotalIn();
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater50.setInput(byteArray59);
        deflater47.setInput(byteArray59);
        deflater45.setInput(byteArray59);
        deflater22.setInput(byteArray59);
        java.util.zip.Deflater deflater65 = new java.util.zip.Deflater((int) (byte) 1);
        deflater65.reset();
        int int67 = deflater65.getTotalIn();
        byte[] byteArray74 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater65.setInput(byteArray74);
        deflater65.finish();
        long long77 = deflater65.getBytesRead();
        deflater65.reset();
        byte[] byteArray85 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater65.setInput(byteArray85, (int) (short) 0, (int) (short) 1);
        deflater22.setInput(byteArray85);
        int int90 = deflater2.deflate(byteArray85);
        deflater2.setStrategy((int) (short) 1);
        int int93 = deflater2.getTotalIn();
        boolean boolean94 = deflater2.needsInput();
        deflater2.end();
        boolean boolean96 = deflater2.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater2.reset();
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        deflater2.end();
        boolean boolean7 = deflater2.needsInput();
        deflater2.end();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int10 = deflater2.getTotalIn();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        boolean boolean4 = deflater2.needsInput();
        int int5 = deflater2.getTotalIn();
        int int6 = deflater2.getTotalOut();
        java.util.zip.Deflater deflater8 = new java.util.zip.Deflater((int) (byte) 1);
        deflater8.reset();
        int int10 = deflater8.getTotalIn();
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater8.setInput(byteArray17);
        deflater8.reset();
        java.util.zip.Deflater deflater21 = new java.util.zip.Deflater((int) (byte) 1);
        deflater21.reset();
        int int23 = deflater21.getTotalIn();
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater21.setInput(byteArray30);
        deflater21.finish();
        long long33 = deflater21.getBytesRead();
        deflater21.reset();
        byte[] byteArray41 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater21.setInput(byteArray41, (int) (short) 0, (int) (short) 1);
        deflater8.setInput(byteArray41);
        boolean boolean46 = deflater8.finished();
        long long47 = deflater8.getBytesRead();
        deflater8.setStrategy(0);
        deflater8.setLevel((-1));
        java.util.zip.Deflater deflater53 = new java.util.zip.Deflater((int) (byte) 1);
        deflater53.reset();
        int int55 = deflater53.getTotalIn();
        int int56 = deflater53.getTotalIn();
        deflater53.finish();
        deflater53.reset();
        java.util.zip.Deflater deflater60 = new java.util.zip.Deflater((int) (byte) 1);
        deflater60.reset();
        int int62 = deflater60.getTotalIn();
        byte[] byteArray69 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater60.setInput(byteArray69);
        deflater53.setInput(byteArray69);
        int int72 = deflater8.deflate(byteArray69);
        deflater2.setInput(byteArray69, 6, 0);
        long long76 = deflater2.getBytesWritten();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int78 = deflater2.getTotalIn();
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        java.util.zip.Deflater deflater15 = new java.util.zip.Deflater((-1), true);
        long long16 = deflater15.getBytesWritten();
        deflater15.setLevel(2);
        java.util.zip.Deflater deflater20 = new java.util.zip.Deflater((int) (byte) 1);
        deflater20.reset();
        int int22 = deflater20.getTotalIn();
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater20.setInput(byteArray29);
        deflater20.finish();
        long long32 = deflater20.getBytesRead();
        deflater20.reset();
        java.util.zip.Deflater deflater35 = new java.util.zip.Deflater((int) (byte) 1);
        deflater35.reset();
        int int37 = deflater35.getTotalIn();
        byte[] byteArray44 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater35.setInput(byteArray44);
        deflater35.finish();
        long long47 = deflater35.getBytesRead();
        deflater35.reset();
        byte[] byteArray55 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater35.setInput(byteArray55, (int) (short) 0, (int) (short) 1);
        deflater20.setDictionary(byteArray55);
        deflater15.setInput(byteArray55);
        deflater1.setDictionary(byteArray55);
        int int62 = deflater1.getAdler();
        deflater1.finish();
        deflater1.setLevel(6);
        boolean boolean66 = deflater1.needsInput();
        int int67 = deflater1.getTotalIn();
        long long68 = deflater1.getBytesWritten();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater1.reset();
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        deflater2.end();
        deflater2.end();
        deflater2.setLevel((int) (byte) -1);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater2.reset();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater(0);
        long long2 = deflater1.getBytesWritten();
        deflater1.setStrategy((int) (byte) 1);
        long long5 = deflater1.getBytesRead();
        deflater1.end();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long8 = deflater1.getBytesWritten();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        deflater1.reset();
        java.util.zip.Deflater deflater16 = new java.util.zip.Deflater((int) (byte) 1);
        deflater16.reset();
        int int18 = deflater16.getTotalIn();
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater16.setInput(byteArray25);
        deflater16.finish();
        long long28 = deflater16.getBytesRead();
        deflater16.reset();
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater16.setInput(byteArray36, (int) (short) 0, (int) (short) 1);
        deflater1.setDictionary(byteArray36);
        long long41 = deflater1.getBytesRead();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int43 = deflater1.getAdler();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater7.setInput(byteArray16);
        deflater4.setInput(byteArray16);
        deflater2.setInput(byteArray16);
        java.util.zip.Deflater deflater22 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater24 = new java.util.zip.Deflater((int) (byte) 1);
        deflater24.reset();
        java.util.zip.Deflater deflater27 = new java.util.zip.Deflater((int) (byte) 1);
        deflater27.reset();
        int int29 = deflater27.getTotalIn();
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater27.setInput(byteArray36);
        deflater24.setInput(byteArray36);
        deflater22.setInput(byteArray36);
        deflater22.setStrategy(0);
        boolean boolean42 = deflater22.needsInput();
        java.util.zip.Deflater deflater45 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater47 = new java.util.zip.Deflater((int) (byte) 1);
        deflater47.reset();
        java.util.zip.Deflater deflater50 = new java.util.zip.Deflater((int) (byte) 1);
        deflater50.reset();
        int int52 = deflater50.getTotalIn();
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater50.setInput(byteArray59);
        deflater47.setInput(byteArray59);
        deflater45.setInput(byteArray59);
        deflater22.setInput(byteArray59);
        java.util.zip.Deflater deflater65 = new java.util.zip.Deflater((int) (byte) 1);
        deflater65.reset();
        int int67 = deflater65.getTotalIn();
        byte[] byteArray74 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater65.setInput(byteArray74);
        deflater65.finish();
        long long77 = deflater65.getBytesRead();
        deflater65.reset();
        byte[] byteArray85 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater65.setInput(byteArray85, (int) (short) 0, (int) (short) 1);
        deflater22.setInput(byteArray85);
        int int90 = deflater2.deflate(byteArray85);
        boolean boolean91 = deflater2.finished();
        int int92 = deflater2.getTotalIn();
        int int93 = deflater2.getTotalOut();
        deflater2.end();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int96 = deflater2.getTotalOut();
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        deflater1.finish();
        deflater1.reset();
        java.util.zip.Deflater deflater8 = new java.util.zip.Deflater((int) (byte) 1);
        deflater8.reset();
        int int10 = deflater8.getTotalIn();
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater8.setInput(byteArray17);
        deflater1.setInput(byteArray17);
        deflater1.finish();
        int int21 = deflater1.getAdler();
        long long22 = deflater1.getBytesWritten();
        deflater1.finish();
        deflater1.end();
        java.util.zip.Deflater deflater26 = new java.util.zip.Deflater((int) (byte) 1);
        deflater26.reset();
        int int28 = deflater26.getTotalIn();
        int int29 = deflater26.getTotalIn();
        deflater26.finish();
        deflater26.reset();
        java.util.zip.Deflater deflater33 = new java.util.zip.Deflater((int) (byte) 1);
        deflater33.reset();
        int int35 = deflater33.getTotalIn();
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater33.setInput(byteArray42);
        deflater26.setInput(byteArray42);
        deflater26.finish();
        int int46 = deflater26.getAdler();
        long long47 = deflater26.getBytesWritten();
        deflater26.finish();
        java.util.zip.Deflater deflater50 = new java.util.zip.Deflater((int) (byte) -1);
        boolean boolean51 = deflater50.finished();
        deflater50.reset();
        boolean boolean53 = deflater50.finished();
        java.util.zip.Deflater deflater55 = new java.util.zip.Deflater((int) (byte) 1);
        deflater55.reset();
        int int57 = deflater55.getTotalIn();
        byte[] byteArray64 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater55.setInput(byteArray64);
        deflater55.reset();
        java.util.zip.Deflater deflater68 = new java.util.zip.Deflater((int) (byte) 1);
        deflater68.reset();
        int int70 = deflater68.getTotalIn();
        byte[] byteArray77 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater68.setInput(byteArray77);
        deflater68.finish();
        long long80 = deflater68.getBytesRead();
        deflater68.reset();
        byte[] byteArray88 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater68.setInput(byteArray88, (int) (short) 0, (int) (short) 1);
        deflater55.setInput(byteArray88);
        int int93 = deflater50.deflate(byteArray88);
        deflater26.setDictionary(byteArray88);
        deflater1.setInput(byteArray88, 6, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long98 = deflater1.getBytesWritten();
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(1, true);
        int int3 = deflater2.getAdler();
        boolean boolean4 = deflater2.finished();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int6 = deflater2.getTotalOut();
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        deflater1.reset();
        boolean boolean5 = deflater1.finished();
        deflater1.end();
        deflater1.setStrategy(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long9 = deflater1.getBytesWritten();
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        deflater1.finish();
        java.util.zip.Deflater deflater6 = new java.util.zip.Deflater((int) (byte) 1);
        deflater6.reset();
        int int8 = deflater6.getTotalIn();
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater6.setInput(byteArray15);
        deflater1.setInput(byteArray15);
        int int18 = deflater1.getAdler();
        deflater1.reset();
        long long20 = deflater1.getBytesRead();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int22 = deflater1.getAdler();
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater7.setInput(byteArray16);
        deflater7.finish();
        long long19 = deflater7.getBytesRead();
        deflater7.reset();
        java.util.zip.Deflater deflater22 = new java.util.zip.Deflater((int) (byte) 1);
        deflater22.reset();
        int int24 = deflater22.getTotalIn();
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater22.setInput(byteArray31);
        deflater22.finish();
        long long34 = deflater22.getBytesRead();
        deflater22.reset();
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater22.setInput(byteArray42, (int) (short) 0, (int) (short) 1);
        deflater7.setDictionary(byteArray42);
        deflater2.setInput(byteArray42);
        int int48 = deflater2.getTotalIn();
        deflater2.reset();
        deflater2.end();
        boolean boolean51 = deflater2.finished();
        deflater2.setLevel((int) (byte) 1);
        boolean boolean54 = deflater2.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int55 = deflater2.getAdler();
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 0);
        deflater1.end();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (short) -1, false);
        int int6 = deflater5.getTotalIn();
        int int7 = deflater5.getTotalIn();
        boolean boolean8 = deflater5.finished();
        java.util.zip.Deflater deflater10 = new java.util.zip.Deflater((int) (byte) 1);
        long long11 = deflater10.getBytesWritten();
        int int12 = deflater10.getTotalIn();
        java.util.zip.Deflater deflater14 = new java.util.zip.Deflater((int) (byte) 1);
        deflater14.reset();
        int int16 = deflater14.getTotalIn();
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater14.setInput(byteArray23);
        deflater14.finish();
        long long26 = deflater14.getBytesRead();
        deflater14.reset();
        java.util.zip.Deflater deflater29 = new java.util.zip.Deflater((int) (byte) 1);
        deflater29.reset();
        int int31 = deflater29.getTotalIn();
        byte[] byteArray38 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater29.setInput(byteArray38);
        deflater29.finish();
        long long41 = deflater29.getBytesRead();
        deflater29.reset();
        byte[] byteArray49 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater29.setInput(byteArray49, (int) (short) 0, (int) (short) 1);
        deflater14.setDictionary(byteArray49);
        int int54 = deflater10.deflate(byteArray49);
        deflater5.setDictionary(byteArray49);
        int int56 = deflater5.getTotalIn();
        int int57 = deflater5.getAdler();
        int int58 = deflater5.getTotalIn();
        deflater5.finish();
        java.util.zip.Deflater deflater62 = new java.util.zip.Deflater((int) (short) -1, true);
        deflater62.setLevel((-1));
        boolean boolean65 = deflater62.needsInput();
        deflater62.finish();
        java.util.zip.Deflater deflater68 = new java.util.zip.Deflater((int) (byte) 1);
        deflater68.reset();
        int int70 = deflater68.getTotalIn();
        deflater68.reset();
        boolean boolean72 = deflater68.finished();
        int int73 = deflater68.getTotalOut();
        java.util.zip.Deflater deflater75 = new java.util.zip.Deflater((int) (byte) 1);
        deflater75.reset();
        int int77 = deflater75.getAdler();
        java.util.zip.Deflater deflater79 = new java.util.zip.Deflater((int) (byte) 1);
        deflater79.reset();
        int int81 = deflater79.getTotalIn();
        byte[] byteArray88 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater79.setInput(byteArray88);
        deflater75.setInput(byteArray88);
        int int93 = deflater68.deflate(byteArray88, 0, 0);
        deflater62.setDictionary(byteArray88);
        int int98 = deflater5.deflate(byteArray88, 3, 1, 3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int99 = deflater1.deflate(byteArray88);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        long long6 = deflater1.getBytesWritten();
        int int7 = deflater1.getTotalOut();
        int int8 = deflater1.getAdler();
        long long9 = deflater1.getBytesWritten();
        deflater1.end();
        deflater1.finish();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long12 = deflater1.getBytesWritten();
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater7.setInput(byteArray16);
        deflater4.setInput(byteArray16);
        deflater2.setInput(byteArray16);
        deflater2.setStrategy(0);
        boolean boolean22 = deflater2.needsInput();
        long long23 = deflater2.getBytesWritten();
        long long24 = deflater2.getBytesRead();
        deflater2.setLevel(1);
        long long27 = deflater2.getBytesWritten();
        boolean boolean28 = deflater2.needsInput();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long30 = deflater2.getBytesRead();
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater7.setInput(byteArray16);
        deflater7.finish();
        long long19 = deflater7.getBytesRead();
        deflater7.reset();
        java.util.zip.Deflater deflater22 = new java.util.zip.Deflater((int) (byte) 1);
        deflater22.reset();
        int int24 = deflater22.getTotalIn();
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater22.setInput(byteArray31);
        deflater22.finish();
        long long34 = deflater22.getBytesRead();
        deflater22.reset();
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater22.setInput(byteArray42, (int) (short) 0, (int) (short) 1);
        deflater7.setDictionary(byteArray42);
        deflater2.setInput(byteArray42);
        deflater2.end();
        boolean boolean49 = deflater2.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater2.reset();
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater(0);
        long long2 = deflater1.getBytesWritten();
        deflater1.setStrategy((int) (byte) 1);
        long long5 = deflater1.getBytesRead();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long7 = deflater1.getBytesRead();
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        int int3 = deflater2.getTotalIn();
        int int4 = deflater2.getTotalIn();
        boolean boolean5 = deflater2.finished();
        deflater2.end();
        deflater2.setLevel((int) (short) -1);
        deflater2.end();
        boolean boolean10 = deflater2.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int11 = deflater2.getTotalIn();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        deflater1.reset();
        int int15 = deflater1.getTotalIn();
        deflater1.finish();
        java.util.zip.Deflater deflater19 = new java.util.zip.Deflater(3, true);
        int int20 = deflater19.getAdler();
        deflater19.setStrategy(0);
        int int23 = deflater19.getTotalOut();
        java.util.zip.Deflater deflater25 = new java.util.zip.Deflater((int) (byte) 1);
        long long26 = deflater25.getBytesWritten();
        java.util.zip.Deflater deflater28 = new java.util.zip.Deflater((int) (byte) 1);
        deflater28.reset();
        int int30 = deflater28.getTotalIn();
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater28.setInput(byteArray37);
        deflater28.finish();
        long long40 = deflater28.getBytesRead();
        deflater28.reset();
        int int42 = deflater28.getAdler();
        boolean boolean43 = deflater28.needsInput();
        int int44 = deflater28.getTotalIn();
        int int45 = deflater28.getTotalIn();
        java.util.zip.Deflater deflater47 = new java.util.zip.Deflater((int) (byte) 1);
        deflater47.reset();
        int int49 = deflater47.getTotalIn();
        byte[] byteArray56 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater47.setInput(byteArray56);
        deflater47.finish();
        long long59 = deflater47.getBytesRead();
        deflater47.reset();
        java.util.zip.Deflater deflater62 = new java.util.zip.Deflater((int) (byte) 1);
        deflater62.reset();
        int int64 = deflater62.getTotalIn();
        byte[] byteArray71 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater62.setInput(byteArray71);
        deflater62.finish();
        long long74 = deflater62.getBytesRead();
        deflater62.reset();
        byte[] byteArray82 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater62.setInput(byteArray82, (int) (short) 0, (int) (short) 1);
        int int86 = deflater47.deflate(byteArray82);
        deflater28.setDictionary(byteArray82);
        deflater25.setInput(byteArray82);
        int int91 = deflater19.deflate(byteArray82, (int) (byte) 1, 3);
        int int92 = deflater1.deflate(byteArray82);
        deflater1.setStrategy(0);
        deflater1.end();
        deflater1.setLevel(9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int98 = deflater1.getTotalOut();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getAdler();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater1.setInput(byteArray14, 0, 0);
        deflater1.end();
        boolean boolean20 = deflater1.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long21 = deflater1.getBytesWritten();
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        deflater1.reset();
        boolean boolean5 = deflater1.finished();
        deflater1.end();
        deflater1.setLevel((-1));
        deflater1.end();
        deflater1.end();
        deflater1.finish();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long12 = deflater1.getBytesRead();
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        java.util.zip.Deflater deflater15 = new java.util.zip.Deflater((int) (byte) 1);
        deflater15.reset();
        int int17 = deflater15.getTotalIn();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater15.setInput(byteArray24);
        deflater15.finish();
        long long27 = deflater15.getBytesRead();
        deflater15.reset();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getTotalIn();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater30.setInput(byteArray39);
        deflater30.finish();
        long long42 = deflater30.getBytesRead();
        deflater30.reset();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater30.setInput(byteArray50, (int) (short) 0, (int) (short) 1);
        deflater15.setDictionary(byteArray50);
        int int55 = deflater1.deflate(byteArray50);
        deflater1.setLevel(3);
        deflater1.setStrategy(2);
        deflater1.reset();
        deflater1.end();
        boolean boolean62 = deflater1.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long63 = deflater1.getBytesRead();
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        int int2 = deflater1.getTotalOut();
        int int3 = deflater1.getTotalOut();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater5.finish();
        long long17 = deflater5.getBytesRead();
        deflater5.reset();
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater5.setInput(byteArray25, (int) (short) 0, (int) (short) 1);
        java.util.zip.Deflater deflater31 = new java.util.zip.Deflater((int) (short) -1, false);
        java.util.zip.Deflater deflater33 = new java.util.zip.Deflater((int) (byte) 1);
        deflater33.reset();
        int int35 = deflater33.getAdler();
        java.util.zip.Deflater deflater37 = new java.util.zip.Deflater((int) (byte) 1);
        deflater37.reset();
        int int39 = deflater37.getTotalIn();
        byte[] byteArray46 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater37.setInput(byteArray46);
        deflater33.setInput(byteArray46, 0, 0);
        int int51 = deflater31.deflate(byteArray46);
        deflater5.setInput(byteArray46);
        deflater1.setDictionary(byteArray46);
        int int54 = deflater1.getAdler();
        deflater1.reset();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int57 = deflater1.getTotalIn();
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        java.util.zip.Deflater deflater15 = new java.util.zip.Deflater((int) (byte) 1);
        deflater15.reset();
        int int17 = deflater15.getTotalIn();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater15.setInput(byteArray24);
        deflater15.finish();
        long long27 = deflater15.getBytesRead();
        deflater15.reset();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getTotalIn();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater30.setInput(byteArray39);
        deflater30.finish();
        long long42 = deflater30.getBytesRead();
        deflater30.reset();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater30.setInput(byteArray50, (int) (short) 0, (int) (short) 1);
        deflater15.setDictionary(byteArray50);
        int int55 = deflater1.deflate(byteArray50);
        deflater1.setLevel(3);
        deflater1.end();
        deflater1.setStrategy((int) (short) 0);
        boolean boolean61 = deflater1.needsInput();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long62 = deflater1.getBytesRead();
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        long long3 = deflater2.getBytesWritten();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater2.setDictionary(byteArray14);
        boolean boolean17 = deflater2.needsInput();
        int int18 = deflater2.getAdler();
        deflater2.end();
        deflater2.finish();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int21 = deflater2.getAdler();
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        int int6 = deflater4.getAdler();
        java.util.zip.Deflater deflater8 = new java.util.zip.Deflater((int) (byte) 1);
        deflater8.reset();
        int int10 = deflater8.getTotalIn();
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater8.setInput(byteArray17);
        deflater4.setInput(byteArray17, 0, 0);
        int int22 = deflater2.deflate(byteArray17);
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long24 = deflater2.getBytesWritten();
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        deflater1.reset();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater1.setDictionary(byteArray14);
        int int17 = deflater1.getAdler();
        int int18 = deflater1.getAdler();
        boolean boolean19 = deflater1.needsInput();
        deflater1.end();
        boolean boolean21 = deflater1.finished();
        java.util.zip.Deflater deflater24 = new java.util.zip.Deflater(1, true);
        deflater24.finish();
        deflater24.finish();
        java.util.zip.Deflater deflater28 = new java.util.zip.Deflater((int) (byte) 1);
        deflater28.reset();
        int int30 = deflater28.getTotalIn();
        int int31 = deflater28.getTotalIn();
        deflater28.finish();
        deflater28.reset();
        java.util.zip.Deflater deflater35 = new java.util.zip.Deflater((int) (byte) 1);
        deflater35.reset();
        int int37 = deflater35.getTotalIn();
        byte[] byteArray44 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater35.setInput(byteArray44);
        deflater28.setInput(byteArray44);
        long long47 = deflater28.getBytesWritten();
        deflater28.reset();
        int int49 = deflater28.getAdler();
        java.util.zip.Deflater deflater51 = new java.util.zip.Deflater((int) (byte) 1);
        deflater51.reset();
        deflater51.reset();
        java.util.zip.Deflater deflater55 = new java.util.zip.Deflater((int) (byte) 1);
        deflater55.reset();
        int int57 = deflater55.getTotalIn();
        byte[] byteArray64 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater55.setInput(byteArray64);
        deflater51.setDictionary(byteArray64);
        deflater28.setInput(byteArray64, 3, 3);
        int int70 = deflater24.deflate(byteArray64);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int71 = deflater1.deflate(byteArray64);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        int int3 = deflater2.getTotalIn();
        int int4 = deflater2.getTotalIn();
        boolean boolean5 = deflater2.finished();
        deflater2.end();
        deflater2.setStrategy(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = deflater2.getTotalOut();
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        long long3 = deflater1.getBytesWritten();
        deflater1.setLevel((int) (byte) 0);
        deflater1.reset();
        deflater1.end();
        deflater1.finish();
        deflater1.setStrategy(1);
        boolean boolean11 = deflater1.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int12 = deflater1.getAdler();
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        java.util.zip.Deflater deflater15 = new java.util.zip.Deflater((int) (byte) 1);
        deflater15.reset();
        int int17 = deflater15.getTotalIn();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater15.setInput(byteArray24);
        deflater15.finish();
        long long27 = deflater15.getBytesRead();
        deflater15.reset();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getTotalIn();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater30.setInput(byteArray39);
        deflater30.finish();
        long long42 = deflater30.getBytesRead();
        deflater30.reset();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater30.setInput(byteArray50, (int) (short) 0, (int) (short) 1);
        deflater15.setDictionary(byteArray50);
        int int55 = deflater1.deflate(byteArray50);
        deflater1.setLevel(3);
        deflater1.end();
        deflater1.setStrategy((int) (short) 0);
        boolean boolean61 = deflater1.finished();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater1.reset();
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        java.util.zip.Deflater deflater14 = new java.util.zip.Deflater((int) (byte) 1);
        deflater14.reset();
        java.util.zip.Deflater deflater17 = new java.util.zip.Deflater((int) (byte) 1);
        deflater17.reset();
        int int19 = deflater17.getTotalIn();
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater17.setInput(byteArray26);
        deflater14.setInput(byteArray26);
        deflater14.setLevel((int) (byte) -1);
        java.util.zip.Deflater deflater32 = new java.util.zip.Deflater((int) (byte) 1);
        deflater32.reset();
        int int34 = deflater32.getTotalIn();
        byte[] byteArray41 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater32.setInput(byteArray41);
        deflater32.finish();
        long long44 = deflater32.getBytesRead();
        java.util.zip.Deflater deflater46 = new java.util.zip.Deflater((int) (byte) 1);
        deflater46.reset();
        int int48 = deflater46.getTotalIn();
        byte[] byteArray55 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater46.setInput(byteArray55);
        deflater46.finish();
        long long58 = deflater46.getBytesRead();
        deflater46.reset();
        java.util.zip.Deflater deflater61 = new java.util.zip.Deflater((int) (byte) 1);
        deflater61.reset();
        int int63 = deflater61.getTotalIn();
        byte[] byteArray70 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater61.setInput(byteArray70);
        deflater61.finish();
        long long73 = deflater61.getBytesRead();
        deflater61.reset();
        byte[] byteArray81 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater61.setInput(byteArray81, (int) (short) 0, (int) (short) 1);
        deflater46.setDictionary(byteArray81);
        int int86 = deflater32.deflate(byteArray81);
        deflater14.setInput(byteArray81);
        deflater1.setInput(byteArray81);
        boolean boolean89 = deflater1.finished();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater1.reset();
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (byte) 0, false);
        boolean boolean3 = deflater2.needsInput();
        int int4 = deflater2.getTotalIn();
        long long5 = deflater2.getBytesRead();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int7 = deflater2.getAdler();
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        long long3 = deflater2.getBytesWritten();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater2.setDictionary(byteArray14);
        int int17 = deflater2.getTotalOut();
        boolean boolean18 = deflater2.needsInput();
        java.util.zip.Deflater deflater21 = new java.util.zip.Deflater((-1), true);
        deflater21.finish();
        deflater21.finish();
        boolean boolean24 = deflater21.finished();
        deflater21.finish();
        java.util.zip.Deflater deflater26 = new java.util.zip.Deflater();
        deflater26.reset();
        long long28 = deflater26.getBytesWritten();
        int int29 = deflater26.getTotalIn();
        byte[] byteArray32 = new byte[] { (byte) 0, (byte) 1 };
        deflater26.setInput(byteArray32);
        deflater21.setInput(byteArray32);
        deflater2.setDictionary(byteArray32);
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int37 = deflater2.getAdler();
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        deflater1.finish();
        deflater1.reset();
        java.util.zip.Deflater deflater8 = new java.util.zip.Deflater((int) (byte) 1);
        deflater8.reset();
        int int10 = deflater8.getTotalIn();
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater8.setInput(byteArray17);
        deflater1.setInput(byteArray17);
        deflater1.finish();
        int int21 = deflater1.getAdler();
        long long22 = deflater1.getBytesWritten();
        deflater1.finish();
        deflater1.end();
        java.util.zip.Deflater deflater26 = new java.util.zip.Deflater((int) (byte) 1);
        deflater26.reset();
        int int28 = deflater26.getTotalIn();
        int int29 = deflater26.getTotalIn();
        deflater26.finish();
        deflater26.reset();
        java.util.zip.Deflater deflater33 = new java.util.zip.Deflater((int) (byte) 1);
        deflater33.reset();
        int int35 = deflater33.getTotalIn();
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater33.setInput(byteArray42);
        deflater26.setInput(byteArray42);
        deflater26.finish();
        int int46 = deflater26.getAdler();
        long long47 = deflater26.getBytesWritten();
        deflater26.finish();
        java.util.zip.Deflater deflater50 = new java.util.zip.Deflater((int) (byte) -1);
        boolean boolean51 = deflater50.finished();
        deflater50.reset();
        boolean boolean53 = deflater50.finished();
        java.util.zip.Deflater deflater55 = new java.util.zip.Deflater((int) (byte) 1);
        deflater55.reset();
        int int57 = deflater55.getTotalIn();
        byte[] byteArray64 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater55.setInput(byteArray64);
        deflater55.reset();
        java.util.zip.Deflater deflater68 = new java.util.zip.Deflater((int) (byte) 1);
        deflater68.reset();
        int int70 = deflater68.getTotalIn();
        byte[] byteArray77 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater68.setInput(byteArray77);
        deflater68.finish();
        long long80 = deflater68.getBytesRead();
        deflater68.reset();
        byte[] byteArray88 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater68.setInput(byteArray88, (int) (short) 0, (int) (short) 1);
        deflater55.setInput(byteArray88);
        int int93 = deflater50.deflate(byteArray88);
        deflater26.setDictionary(byteArray88);
        deflater1.setInput(byteArray88, 6, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long98 = deflater1.getBytesRead();
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.reset();
        java.util.zip.Deflater deflater14 = new java.util.zip.Deflater((int) (byte) 1);
        deflater14.reset();
        int int16 = deflater14.getTotalIn();
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater14.setInput(byteArray23);
        deflater14.finish();
        long long26 = deflater14.getBytesRead();
        deflater14.reset();
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater14.setInput(byteArray34, (int) (short) 0, (int) (short) 1);
        deflater1.setInput(byteArray34);
        boolean boolean39 = deflater1.finished();
        deflater1.finish();
        java.util.zip.Deflater deflater42 = new java.util.zip.Deflater((int) (byte) 1);
        deflater42.reset();
        int int44 = deflater42.getTotalIn();
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater42.setInput(byteArray51);
        int int53 = deflater1.deflate(byteArray51);
        deflater1.finish();
        long long55 = deflater1.getBytesWritten();
        deflater1.end();
        boolean boolean57 = deflater1.needsInput();
        boolean boolean58 = deflater1.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int59 = deflater1.getTotalOut();
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        long long3 = deflater1.getBytesWritten();
        deflater1.setLevel((int) (byte) 0);
        deflater1.reset();
        deflater1.end();
        deflater1.finish();
        deflater1.finish();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater1.reset();
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        deflater2.end();
        boolean boolean7 = deflater2.needsInput();
        deflater2.end();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int10 = deflater2.getAdler();
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater(9);
        java.util.zip.Deflater deflater3 = new java.util.zip.Deflater((int) (byte) 1);
        long long4 = deflater3.getBytesWritten();
        long long5 = deflater3.getBytesWritten();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) -1);
        boolean boolean8 = deflater7.finished();
        java.util.zip.Deflater deflater10 = new java.util.zip.Deflater((int) (byte) 1);
        deflater10.reset();
        int int12 = deflater10.getTotalIn();
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater10.setInput(byteArray19);
        deflater10.finish();
        long long22 = deflater10.getBytesRead();
        java.util.zip.Deflater deflater24 = new java.util.zip.Deflater((int) (byte) 1);
        deflater24.reset();
        int int26 = deflater24.getTotalIn();
        byte[] byteArray33 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater24.setInput(byteArray33);
        deflater24.finish();
        long long36 = deflater24.getBytesRead();
        deflater24.reset();
        java.util.zip.Deflater deflater39 = new java.util.zip.Deflater((int) (byte) 1);
        deflater39.reset();
        int int41 = deflater39.getTotalIn();
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater39.setInput(byteArray48);
        deflater39.finish();
        long long51 = deflater39.getBytesRead();
        deflater39.reset();
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater39.setInput(byteArray59, (int) (short) 0, (int) (short) 1);
        deflater24.setDictionary(byteArray59);
        int int64 = deflater10.deflate(byteArray59);
        int int67 = deflater7.deflate(byteArray59, (int) (byte) 1, 2);
        java.util.zip.Deflater deflater69 = new java.util.zip.Deflater((int) (byte) 1);
        deflater69.reset();
        int int71 = deflater69.getTotalIn();
        deflater69.finish();
        java.util.zip.Deflater deflater74 = new java.util.zip.Deflater((int) (byte) 1);
        deflater74.reset();
        int int76 = deflater74.getTotalIn();
        byte[] byteArray83 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater74.setInput(byteArray83);
        deflater69.setInput(byteArray83);
        deflater7.setInput(byteArray83);
        int int87 = deflater3.deflate(byteArray83);
        int int88 = deflater1.deflate(byteArray83);
        deflater1.end();
        deflater1.finish();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long91 = deflater1.getBytesRead();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        long long6 = deflater1.getBytesWritten();
        int int7 = deflater1.getTotalOut();
        int int8 = deflater1.getAdler();
        long long9 = deflater1.getBytesWritten();
        deflater1.end();
        deflater1.finish();
        boolean boolean12 = deflater1.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long13 = deflater1.getBytesRead();
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        long long3 = deflater2.getBytesWritten();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater2.setDictionary(byteArray14);
        boolean boolean17 = deflater2.needsInput();
        int int18 = deflater2.getAdler();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater2.reset();
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        deflater1.reset();
        int int15 = deflater1.getAdler();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int17 = deflater1.getTotalOut();
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        long long6 = deflater1.getBytesWritten();
        int int7 = deflater1.getTotalOut();
        int int8 = deflater1.getTotalIn();
        long long9 = deflater1.getBytesRead();
        deflater1.reset();
        int int11 = deflater1.getAdler();
        deflater1.end();
        java.util.zip.Deflater deflater13 = new java.util.zip.Deflater();
        deflater13.reset();
        long long15 = deflater13.getBytesWritten();
        int int16 = deflater13.getTotalIn();
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 1 };
        deflater13.setInput(byteArray19);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int21 = deflater1.deflate(byteArray19);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (byte) 0, false);
        boolean boolean3 = deflater2.needsInput();
        int int4 = deflater2.getTotalOut();
        int int5 = deflater2.getTotalIn();
        deflater2.finish();
        int int7 = deflater2.getTotalOut();
        long long8 = deflater2.getBytesRead();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater2.reset();
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        deflater1.reset();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater1.setInput(byteArray21, (int) (short) 0, (int) (short) 1);
        deflater1.reset();
        deflater1.reset();
        deflater1.end();
        deflater1.end();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int30 = deflater1.getTotalIn();
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater7.setInput(byteArray16);
        deflater4.setInput(byteArray16);
        deflater2.setInput(byteArray16);
        java.util.zip.Deflater deflater22 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater24 = new java.util.zip.Deflater((int) (byte) 1);
        deflater24.reset();
        java.util.zip.Deflater deflater27 = new java.util.zip.Deflater((int) (byte) 1);
        deflater27.reset();
        int int29 = deflater27.getTotalIn();
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater27.setInput(byteArray36);
        deflater24.setInput(byteArray36);
        deflater22.setInput(byteArray36);
        deflater22.setStrategy(0);
        boolean boolean42 = deflater22.needsInput();
        java.util.zip.Deflater deflater45 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater47 = new java.util.zip.Deflater((int) (byte) 1);
        deflater47.reset();
        java.util.zip.Deflater deflater50 = new java.util.zip.Deflater((int) (byte) 1);
        deflater50.reset();
        int int52 = deflater50.getTotalIn();
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater50.setInput(byteArray59);
        deflater47.setInput(byteArray59);
        deflater45.setInput(byteArray59);
        deflater22.setInput(byteArray59);
        java.util.zip.Deflater deflater65 = new java.util.zip.Deflater((int) (byte) 1);
        deflater65.reset();
        int int67 = deflater65.getTotalIn();
        byte[] byteArray74 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater65.setInput(byteArray74);
        deflater65.finish();
        long long77 = deflater65.getBytesRead();
        deflater65.reset();
        byte[] byteArray85 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater65.setInput(byteArray85, (int) (short) 0, (int) (short) 1);
        deflater22.setInput(byteArray85);
        int int90 = deflater2.deflate(byteArray85);
        boolean boolean91 = deflater2.finished();
        int int92 = deflater2.getTotalIn();
        int int93 = deflater2.getTotalOut();
        deflater2.end();
        boolean boolean95 = deflater2.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long96 = deflater2.getBytesRead();
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getAdler();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        int int8 = deflater5.getTotalIn();
        deflater5.finish();
        deflater5.reset();
        boolean boolean11 = deflater5.finished();
        long long12 = deflater5.getBytesRead();
        long long13 = deflater5.getBytesWritten();
        java.util.zip.Deflater deflater15 = new java.util.zip.Deflater((int) (byte) 1);
        deflater15.reset();
        int int17 = deflater15.getTotalIn();
        java.util.zip.Deflater deflater19 = new java.util.zip.Deflater((int) (byte) 1);
        deflater19.reset();
        int int21 = deflater19.getTotalIn();
        byte[] byteArray28 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater19.setInput(byteArray28);
        deflater19.finish();
        long long31 = deflater19.getBytesRead();
        deflater19.reset();
        java.util.zip.Deflater deflater34 = new java.util.zip.Deflater((int) (byte) 1);
        deflater34.reset();
        int int36 = deflater34.getTotalIn();
        byte[] byteArray43 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater34.setInput(byteArray43);
        deflater34.finish();
        long long46 = deflater34.getBytesRead();
        deflater34.reset();
        byte[] byteArray54 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater34.setInput(byteArray54, (int) (short) 0, (int) (short) 1);
        deflater19.setDictionary(byteArray54);
        deflater15.setInput(byteArray54);
        deflater5.setInput(byteArray54);
        int int61 = deflater1.deflate(byteArray54);
        deflater1.end();
        java.util.zip.Deflater deflater65 = new java.util.zip.Deflater((int) (short) 1, false);
        java.util.zip.Deflater deflater68 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater70 = new java.util.zip.Deflater((int) (byte) 1);
        deflater70.reset();
        java.util.zip.Deflater deflater73 = new java.util.zip.Deflater((int) (byte) 1);
        deflater73.reset();
        int int75 = deflater73.getTotalIn();
        byte[] byteArray82 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater73.setInput(byteArray82);
        deflater70.setInput(byteArray82);
        deflater68.setInput(byteArray82);
        int int86 = deflater65.deflate(byteArray82);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int87 = deflater1.deflate(byteArray82);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        long long6 = deflater1.getBytesWritten();
        int int7 = deflater1.getTotalOut();
        int int8 = deflater1.getAdler();
        long long9 = deflater1.getBytesWritten();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long11 = deflater1.getBytesRead();
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        deflater1.reset();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater1.setInput(byteArray21, (int) (short) 0, (int) (short) 1);
        deflater1.reset();
        deflater1.reset();
        java.util.zip.Deflater deflater28 = new java.util.zip.Deflater((int) (byte) 1);
        long long29 = deflater28.getBytesWritten();
        int int30 = deflater28.getTotalOut();
        long long31 = deflater28.getBytesWritten();
        java.util.zip.Deflater deflater33 = new java.util.zip.Deflater((int) (byte) 1);
        deflater33.reset();
        deflater33.reset();
        java.util.zip.Deflater deflater37 = new java.util.zip.Deflater((int) (byte) 1);
        deflater37.reset();
        int int39 = deflater37.getTotalIn();
        byte[] byteArray46 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater37.setInput(byteArray46);
        deflater33.setDictionary(byteArray46);
        deflater28.setDictionary(byteArray46);
        deflater1.setInput(byteArray46);
        boolean boolean51 = deflater1.needsInput();
        long long52 = deflater1.getBytesRead();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int54 = deflater1.getTotalIn();
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        deflater1.reset();
        boolean boolean5 = deflater1.finished();
        deflater1.end();
        deflater1.setLevel((-1));
        deflater1.end();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int11 = deflater1.getTotalIn();
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        int int3 = deflater2.getTotalIn();
        int int4 = deflater2.getTotalIn();
        boolean boolean5 = deflater2.finished();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        long long8 = deflater7.getBytesWritten();
        int int9 = deflater7.getTotalIn();
        java.util.zip.Deflater deflater11 = new java.util.zip.Deflater((int) (byte) 1);
        deflater11.reset();
        int int13 = deflater11.getTotalIn();
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater11.setInput(byteArray20);
        deflater11.finish();
        long long23 = deflater11.getBytesRead();
        deflater11.reset();
        java.util.zip.Deflater deflater26 = new java.util.zip.Deflater((int) (byte) 1);
        deflater26.reset();
        int int28 = deflater26.getTotalIn();
        byte[] byteArray35 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater26.setInput(byteArray35);
        deflater26.finish();
        long long38 = deflater26.getBytesRead();
        deflater26.reset();
        byte[] byteArray46 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater26.setInput(byteArray46, (int) (short) 0, (int) (short) 1);
        deflater11.setDictionary(byteArray46);
        int int51 = deflater7.deflate(byteArray46);
        deflater2.setDictionary(byteArray46);
        int int53 = deflater2.getTotalIn();
        deflater2.finish();
        boolean boolean55 = deflater2.needsInput();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater2.reset();
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater(0);
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((-1), true);
        long long5 = deflater4.getBytesWritten();
        deflater4.setLevel(2);
        java.util.zip.Deflater deflater9 = new java.util.zip.Deflater((int) (byte) 1);
        deflater9.reset();
        int int11 = deflater9.getTotalIn();
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater9.setInput(byteArray18);
        deflater9.finish();
        long long21 = deflater9.getBytesRead();
        deflater9.reset();
        java.util.zip.Deflater deflater24 = new java.util.zip.Deflater((int) (byte) 1);
        deflater24.reset();
        int int26 = deflater24.getTotalIn();
        byte[] byteArray33 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater24.setInput(byteArray33);
        deflater24.finish();
        long long36 = deflater24.getBytesRead();
        deflater24.reset();
        byte[] byteArray44 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater24.setInput(byteArray44, (int) (short) 0, (int) (short) 1);
        deflater9.setDictionary(byteArray44);
        deflater4.setInput(byteArray44);
        long long50 = deflater4.getBytesRead();
        java.util.zip.Deflater deflater52 = new java.util.zip.Deflater((int) (byte) 1);
        deflater52.reset();
        deflater52.reset();
        java.util.zip.Deflater deflater56 = new java.util.zip.Deflater((int) (byte) 1);
        deflater56.reset();
        int int58 = deflater56.getTotalIn();
        byte[] byteArray65 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater56.setInput(byteArray65);
        deflater52.setDictionary(byteArray65);
        deflater4.setInput(byteArray65);
        deflater1.setDictionary(byteArray65, 1, (int) (byte) 1);
        long long72 = deflater1.getBytesWritten();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater1.reset();
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        java.util.zip.Deflater deflater16 = new java.util.zip.Deflater((-1), true);
        long long17 = deflater16.getBytesWritten();
        deflater16.setLevel(2);
        java.util.zip.Deflater deflater21 = new java.util.zip.Deflater((int) (byte) 1);
        deflater21.reset();
        int int23 = deflater21.getTotalIn();
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater21.setInput(byteArray30);
        deflater21.finish();
        long long33 = deflater21.getBytesRead();
        deflater21.reset();
        java.util.zip.Deflater deflater36 = new java.util.zip.Deflater((int) (byte) 1);
        deflater36.reset();
        int int38 = deflater36.getTotalIn();
        byte[] byteArray45 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater36.setInput(byteArray45);
        deflater36.finish();
        long long48 = deflater36.getBytesRead();
        deflater36.reset();
        byte[] byteArray56 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater36.setInput(byteArray56, (int) (short) 0, (int) (short) 1);
        deflater21.setDictionary(byteArray56);
        deflater16.setInput(byteArray56);
        deflater1.setInput(byteArray56, 3, 1);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long66 = deflater1.getBytesWritten();
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        int int3 = deflater2.getTotalIn();
        int int4 = deflater2.getTotalIn();
        boolean boolean5 = deflater2.finished();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        long long8 = deflater7.getBytesWritten();
        int int9 = deflater7.getTotalIn();
        java.util.zip.Deflater deflater11 = new java.util.zip.Deflater((int) (byte) 1);
        deflater11.reset();
        int int13 = deflater11.getTotalIn();
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater11.setInput(byteArray20);
        deflater11.finish();
        long long23 = deflater11.getBytesRead();
        deflater11.reset();
        java.util.zip.Deflater deflater26 = new java.util.zip.Deflater((int) (byte) 1);
        deflater26.reset();
        int int28 = deflater26.getTotalIn();
        byte[] byteArray35 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater26.setInput(byteArray35);
        deflater26.finish();
        long long38 = deflater26.getBytesRead();
        deflater26.reset();
        byte[] byteArray46 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater26.setInput(byteArray46, (int) (short) 0, (int) (short) 1);
        deflater11.setDictionary(byteArray46);
        int int51 = deflater7.deflate(byteArray46);
        deflater2.setDictionary(byteArray46);
        int int53 = deflater2.getTotalIn();
        deflater2.finish();
        boolean boolean55 = deflater2.needsInput();
        deflater2.end();
        deflater2.setStrategy(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deflater2.reset();
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        java.util.zip.Deflater deflater0 = new java.util.zip.Deflater();
        deflater0.end();
        deflater0.end();
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        int int6 = deflater4.getTotalIn();
        int int7 = deflater4.getTotalIn();
        deflater4.finish();
        deflater4.reset();
        boolean boolean10 = deflater4.finished();
        java.util.zip.Deflater deflater12 = new java.util.zip.Deflater((int) (byte) 1);
        deflater12.reset();
        int int14 = deflater12.getTotalIn();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater12.setInput(byteArray21);
        deflater12.finish();
        long long24 = deflater12.getBytesRead();
        deflater12.reset();
        int int26 = deflater12.getAdler();
        boolean boolean27 = deflater12.needsInput();
        java.util.zip.Deflater deflater29 = new java.util.zip.Deflater((int) (byte) 1);
        deflater29.reset();
        int int31 = deflater29.getTotalIn();
        java.util.zip.Deflater deflater33 = new java.util.zip.Deflater((int) (byte) 1);
        deflater33.reset();
        int int35 = deflater33.getTotalIn();
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater33.setInput(byteArray42);
        deflater33.finish();
        long long45 = deflater33.getBytesRead();
        deflater33.reset();
        java.util.zip.Deflater deflater49 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater51 = new java.util.zip.Deflater((int) (byte) 1);
        deflater51.reset();
        java.util.zip.Deflater deflater54 = new java.util.zip.Deflater((int) (byte) 1);
        deflater54.reset();
        int int56 = deflater54.getTotalIn();
        byte[] byteArray63 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater54.setInput(byteArray63);
        deflater51.setInput(byteArray63);
        deflater49.setInput(byteArray63);
        deflater49.setStrategy(0);
        boolean boolean69 = deflater49.needsInput();
        java.util.zip.Deflater deflater72 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater74 = new java.util.zip.Deflater((int) (byte) 1);
        deflater74.reset();
        java.util.zip.Deflater deflater77 = new java.util.zip.Deflater((int) (byte) 1);
        deflater77.reset();
        int int79 = deflater77.getTotalIn();
        byte[] byteArray86 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater77.setInput(byteArray86);
        deflater74.setInput(byteArray86);
        deflater72.setInput(byteArray86);
        deflater49.setInput(byteArray86);
        deflater33.setDictionary(byteArray86);
        int int92 = deflater29.deflate(byteArray86);
        int int93 = deflater12.deflate(byteArray86);
        int int94 = deflater4.deflate(byteArray86);
        deflater0.setInput(byteArray86);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater0.reset();
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        int int3 = deflater1.getTotalOut();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater5.finish();
        long long17 = deflater5.getBytesRead();
        deflater5.reset();
        java.util.zip.Deflater deflater20 = new java.util.zip.Deflater((int) (byte) 1);
        deflater20.reset();
        int int22 = deflater20.getTotalIn();
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater20.setInput(byteArray29);
        deflater20.finish();
        long long32 = deflater20.getBytesRead();
        deflater20.reset();
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater20.setInput(byteArray40, (int) (short) 0, (int) (short) 1);
        deflater5.setDictionary(byteArray40);
        deflater1.setDictionary(byteArray40);
        deflater1.end();
        deflater1.end();
        deflater1.setStrategy(0);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int50 = deflater1.getAdler();
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        int int3 = deflater1.getTotalIn();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater5.finish();
        long long17 = deflater5.getBytesRead();
        deflater5.reset();
        java.util.zip.Deflater deflater20 = new java.util.zip.Deflater((int) (byte) 1);
        deflater20.reset();
        int int22 = deflater20.getTotalIn();
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater20.setInput(byteArray29);
        deflater20.finish();
        long long32 = deflater20.getBytesRead();
        deflater20.reset();
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater20.setInput(byteArray40, (int) (short) 0, (int) (short) 1);
        deflater5.setDictionary(byteArray40);
        int int45 = deflater1.deflate(byteArray40);
        boolean boolean46 = deflater1.needsInput();
        int int47 = deflater1.getAdler();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int49 = deflater1.getAdler();
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        int int2 = deflater1.getTotalOut();
        int int3 = deflater1.getTotalOut();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater5.finish();
        long long17 = deflater5.getBytesRead();
        deflater5.reset();
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater5.setInput(byteArray25, (int) (short) 0, (int) (short) 1);
        java.util.zip.Deflater deflater31 = new java.util.zip.Deflater((int) (short) -1, false);
        java.util.zip.Deflater deflater33 = new java.util.zip.Deflater((int) (byte) 1);
        deflater33.reset();
        int int35 = deflater33.getAdler();
        java.util.zip.Deflater deflater37 = new java.util.zip.Deflater((int) (byte) 1);
        deflater37.reset();
        int int39 = deflater37.getTotalIn();
        byte[] byteArray46 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater37.setInput(byteArray46);
        deflater33.setInput(byteArray46, 0, 0);
        int int51 = deflater31.deflate(byteArray46);
        deflater5.setInput(byteArray46);
        deflater1.setDictionary(byteArray46);
        int int54 = deflater1.getAdler();
        long long55 = deflater1.getBytesRead();
        int int56 = deflater1.getTotalIn();
        int int57 = deflater1.getAdler();
        deflater1.end();
        boolean boolean59 = deflater1.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long60 = deflater1.getBytesWritten();
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater7.setInput(byteArray16);
        deflater4.setInput(byteArray16);
        deflater2.setInput(byteArray16);
        boolean boolean20 = deflater2.finished();
        byte[] byteArray27 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10, (byte) 1 };
        int int28 = deflater2.deflate(byteArray27);
        long long29 = deflater2.getBytesRead();
        deflater2.end();
        java.util.zip.Deflater deflater32 = new java.util.zip.Deflater((int) (byte) 1);
        deflater32.reset();
        java.util.zip.Deflater deflater35 = new java.util.zip.Deflater((int) (byte) 1);
        deflater35.reset();
        int int37 = deflater35.getTotalIn();
        byte[] byteArray44 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater35.setInput(byteArray44);
        deflater32.setInput(byteArray44);
        int int47 = deflater32.getTotalIn();
        long long48 = deflater32.getBytesWritten();
        java.util.zip.Deflater deflater50 = new java.util.zip.Deflater((int) (byte) 1);
        deflater50.reset();
        int int52 = deflater50.getTotalIn();
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater50.setInput(byteArray59);
        deflater32.setDictionary(byteArray59);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deflater2.setDictionary(byteArray59);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        long long6 = deflater1.getBytesWritten();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int8 = deflater1.getTotalOut();
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getAdler();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater1.setInput(byteArray14, 0, 0);
        deflater1.end();
        deflater1.finish();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int21 = deflater1.getTotalOut();
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        int int3 = deflater1.getTotalOut();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater5.finish();
        long long17 = deflater5.getBytesRead();
        deflater5.reset();
        java.util.zip.Deflater deflater20 = new java.util.zip.Deflater((int) (byte) 1);
        deflater20.reset();
        int int22 = deflater20.getTotalIn();
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater20.setInput(byteArray29);
        deflater20.finish();
        long long32 = deflater20.getBytesRead();
        deflater20.reset();
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater20.setInput(byteArray40, (int) (short) 0, (int) (short) 1);
        deflater5.setDictionary(byteArray40);
        deflater1.setDictionary(byteArray40);
        deflater1.end();
        boolean boolean47 = deflater1.finished();
        boolean boolean48 = deflater1.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater1.reset();
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        int int3 = deflater2.getTotalIn();
        int int4 = deflater2.getTotalIn();
        boolean boolean5 = deflater2.finished();
        deflater2.end();
        deflater2.setLevel((int) (short) -1);
        deflater2.end();
        boolean boolean10 = deflater2.needsInput();
        deflater2.finish();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long12 = deflater2.getBytesWritten();
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(1, true);
        boolean boolean3 = deflater2.needsInput();
        deflater2.reset();
        deflater2.finish();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long7 = deflater2.getBytesWritten();
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(0, false);
        deflater2.end();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int5 = deflater2.getAdler();
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        java.util.zip.Deflater deflater16 = new java.util.zip.Deflater((-1), true);
        long long17 = deflater16.getBytesWritten();
        deflater16.setLevel(2);
        java.util.zip.Deflater deflater21 = new java.util.zip.Deflater((int) (byte) 1);
        deflater21.reset();
        int int23 = deflater21.getTotalIn();
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater21.setInput(byteArray30);
        deflater21.finish();
        long long33 = deflater21.getBytesRead();
        deflater21.reset();
        java.util.zip.Deflater deflater36 = new java.util.zip.Deflater((int) (byte) 1);
        deflater36.reset();
        int int38 = deflater36.getTotalIn();
        byte[] byteArray45 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater36.setInput(byteArray45);
        deflater36.finish();
        long long48 = deflater36.getBytesRead();
        deflater36.reset();
        byte[] byteArray56 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater36.setInput(byteArray56, (int) (short) 0, (int) (short) 1);
        deflater21.setDictionary(byteArray56);
        deflater16.setInput(byteArray56);
        deflater1.setInput(byteArray56, 3, 1);
        boolean boolean65 = deflater1.finished();
        int int66 = deflater1.getTotalOut();
        deflater1.reset();
        deflater1.reset();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int70 = deflater1.getAdler();
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        deflater1.finish();
        int int6 = deflater1.getTotalOut();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int8 = deflater1.getTotalIn();
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        boolean boolean4 = deflater1.finished();
        int int5 = deflater1.getTotalOut();
        int int6 = deflater1.getAdler();
        deflater1.finish();
        boolean boolean8 = deflater1.finished();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater1.reset();
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        deflater2.end();
        boolean boolean7 = deflater2.needsInput();
        deflater2.setLevel(6);
        deflater2.finish();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int11 = deflater2.getTotalIn();
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        deflater1.finish();
        deflater1.reset();
        java.util.zip.Deflater deflater8 = new java.util.zip.Deflater((int) (byte) 1);
        deflater8.reset();
        int int10 = deflater8.getTotalIn();
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater8.setInput(byteArray17);
        deflater1.setInput(byteArray17);
        deflater1.finish();
        int int21 = deflater1.getAdler();
        boolean boolean22 = deflater1.finished();
        boolean boolean23 = deflater1.needsInput();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int25 = deflater1.getAdler();
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater7.setInput(byteArray16);
        deflater7.finish();
        long long19 = deflater7.getBytesRead();
        deflater7.reset();
        java.util.zip.Deflater deflater22 = new java.util.zip.Deflater((int) (byte) 1);
        deflater22.reset();
        int int24 = deflater22.getTotalIn();
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater22.setInput(byteArray31);
        deflater22.finish();
        long long34 = deflater22.getBytesRead();
        deflater22.reset();
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater22.setInput(byteArray42, (int) (short) 0, (int) (short) 1);
        deflater7.setDictionary(byteArray42);
        deflater2.setInput(byteArray42);
        boolean boolean48 = deflater2.finished();
        deflater2.end();
        java.util.zip.Deflater deflater51 = new java.util.zip.Deflater((int) (byte) 1);
        deflater51.reset();
        int int53 = deflater51.getTotalIn();
        byte[] byteArray60 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater51.setInput(byteArray60);
        deflater51.finish();
        java.util.zip.Deflater deflater65 = new java.util.zip.Deflater((int) (short) -1, false);
        java.util.zip.Deflater deflater67 = new java.util.zip.Deflater((int) (byte) 1);
        deflater67.reset();
        int int69 = deflater67.getAdler();
        java.util.zip.Deflater deflater71 = new java.util.zip.Deflater((int) (byte) 1);
        deflater71.reset();
        int int73 = deflater71.getTotalIn();
        byte[] byteArray80 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater71.setInput(byteArray80);
        deflater67.setInput(byteArray80, 0, 0);
        int int85 = deflater65.deflate(byteArray80);
        deflater51.setDictionary(byteArray80, (int) (byte) 0, 2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deflater2.setDictionary(byteArray80);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) 1, false);
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater2.reset();
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater7.setInput(byteArray16);
        deflater7.finish();
        long long19 = deflater7.getBytesRead();
        deflater7.reset();
        java.util.zip.Deflater deflater22 = new java.util.zip.Deflater((int) (byte) 1);
        deflater22.reset();
        int int24 = deflater22.getTotalIn();
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater22.setInput(byteArray31);
        deflater22.finish();
        long long34 = deflater22.getBytesRead();
        deflater22.reset();
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater22.setInput(byteArray42, (int) (short) 0, (int) (short) 1);
        deflater7.setDictionary(byteArray42);
        deflater2.setInput(byteArray42);
        int int48 = deflater2.getTotalIn();
        boolean boolean49 = deflater2.needsInput();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int51 = deflater2.getAdler();
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        long long3 = deflater1.getBytesWritten();
        long long4 = deflater1.getBytesWritten();
        int int5 = deflater1.getTotalOut();
        deflater1.setLevel(0);
        deflater1.setLevel((int) (byte) 0);
        java.util.zip.Deflater deflater11 = new java.util.zip.Deflater((int) (byte) 1);
        deflater11.reset();
        int int13 = deflater11.getTotalIn();
        int int14 = deflater11.getTotalIn();
        deflater11.finish();
        deflater11.reset();
        java.util.zip.Deflater deflater18 = new java.util.zip.Deflater((int) (byte) 1);
        deflater18.reset();
        int int20 = deflater18.getTotalIn();
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater18.setInput(byteArray27);
        deflater11.setInput(byteArray27);
        long long30 = deflater11.getBytesWritten();
        deflater11.reset();
        int int32 = deflater11.getAdler();
        java.util.zip.Deflater deflater34 = new java.util.zip.Deflater((int) (byte) 1);
        deflater34.reset();
        int int36 = deflater34.getTotalIn();
        byte[] byteArray43 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater34.setInput(byteArray43);
        deflater34.finish();
        long long46 = deflater34.getBytesRead();
        deflater34.reset();
        int int48 = deflater34.getAdler();
        byte[] byteArray50 = new byte[] { (byte) 10 };
        deflater34.setDictionary(byteArray50);
        deflater11.setDictionary(byteArray50);
        deflater1.setInput(byteArray50);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int55 = deflater1.getTotalIn();
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        deflater1.finish();
        int int5 = deflater1.getTotalIn();
        deflater1.end();
        deflater1.end();
        java.util.zip.Deflater deflater10 = new java.util.zip.Deflater(1, true);
        boolean boolean11 = deflater10.needsInput();
        deflater10.setStrategy((int) (short) 1);
        int int14 = deflater10.getTotalIn();
        java.util.zip.Deflater deflater17 = new java.util.zip.Deflater(3, true);
        int int18 = deflater17.getAdler();
        deflater17.setStrategy(0);
        int int21 = deflater17.getTotalOut();
        java.util.zip.Deflater deflater23 = new java.util.zip.Deflater((int) (byte) 1);
        long long24 = deflater23.getBytesWritten();
        java.util.zip.Deflater deflater26 = new java.util.zip.Deflater((int) (byte) 1);
        deflater26.reset();
        int int28 = deflater26.getTotalIn();
        byte[] byteArray35 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater26.setInput(byteArray35);
        deflater26.finish();
        long long38 = deflater26.getBytesRead();
        deflater26.reset();
        int int40 = deflater26.getAdler();
        boolean boolean41 = deflater26.needsInput();
        int int42 = deflater26.getTotalIn();
        int int43 = deflater26.getTotalIn();
        java.util.zip.Deflater deflater45 = new java.util.zip.Deflater((int) (byte) 1);
        deflater45.reset();
        int int47 = deflater45.getTotalIn();
        byte[] byteArray54 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater45.setInput(byteArray54);
        deflater45.finish();
        long long57 = deflater45.getBytesRead();
        deflater45.reset();
        java.util.zip.Deflater deflater60 = new java.util.zip.Deflater((int) (byte) 1);
        deflater60.reset();
        int int62 = deflater60.getTotalIn();
        byte[] byteArray69 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater60.setInput(byteArray69);
        deflater60.finish();
        long long72 = deflater60.getBytesRead();
        deflater60.reset();
        byte[] byteArray80 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater60.setInput(byteArray80, (int) (short) 0, (int) (short) 1);
        int int84 = deflater45.deflate(byteArray80);
        deflater26.setDictionary(byteArray80);
        deflater23.setInput(byteArray80);
        int int89 = deflater17.deflate(byteArray80, (int) (byte) 1, 3);
        deflater10.setDictionary(byteArray80);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int91 = deflater1.deflate(byteArray80);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        deflater1.reset();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater1.setInput(byteArray21, (int) (short) 0, (int) (short) 1);
        boolean boolean25 = deflater1.needsInput();
        deflater1.finish();
        boolean boolean27 = deflater1.needsInput();
        deflater1.end();
        deflater1.setLevel(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int31 = deflater1.getAdler();
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(2, true);
        int int3 = deflater2.getTotalIn();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int5 = deflater2.getAdler();
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater7.setInput(byteArray16);
        deflater4.setInput(byteArray16);
        deflater2.setInput(byteArray16);
        deflater2.setStrategy(0);
        boolean boolean22 = deflater2.needsInput();
        java.util.zip.Deflater deflater25 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater27 = new java.util.zip.Deflater((int) (byte) 1);
        deflater27.reset();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getTotalIn();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater30.setInput(byteArray39);
        deflater27.setInput(byteArray39);
        deflater25.setInput(byteArray39);
        deflater2.setInput(byteArray39);
        java.util.zip.Deflater deflater45 = new java.util.zip.Deflater((int) (byte) 1);
        deflater45.reset();
        int int47 = deflater45.getTotalIn();
        byte[] byteArray54 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater45.setInput(byteArray54);
        deflater45.finish();
        long long57 = deflater45.getBytesRead();
        deflater45.reset();
        byte[] byteArray65 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater45.setInput(byteArray65, (int) (short) 0, (int) (short) 1);
        deflater2.setInput(byteArray65);
        int int70 = deflater2.getTotalOut();
        deflater2.end();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int73 = deflater2.getAdler();
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        deflater1.finish();
        java.util.zip.Deflater deflater6 = new java.util.zip.Deflater((int) (byte) 1);
        deflater6.reset();
        int int8 = deflater6.getTotalIn();
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater6.setInput(byteArray15);
        deflater1.setInput(byteArray15);
        int int18 = deflater1.getTotalIn();
        int int19 = deflater1.getTotalOut();
        java.util.zip.Deflater deflater21 = new java.util.zip.Deflater((int) (byte) 1);
        deflater21.reset();
        int int23 = deflater21.getTotalIn();
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater21.setInput(byteArray30);
        deflater21.reset();
        java.util.zip.Deflater deflater34 = new java.util.zip.Deflater((int) (byte) 1);
        deflater34.reset();
        int int36 = deflater34.getTotalIn();
        byte[] byteArray43 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater34.setInput(byteArray43);
        deflater34.finish();
        long long46 = deflater34.getBytesRead();
        deflater34.reset();
        byte[] byteArray54 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater34.setInput(byteArray54, (int) (short) 0, (int) (short) 1);
        deflater21.setInput(byteArray54);
        deflater1.setDictionary(byteArray54);
        int int60 = deflater1.getAdler();
        deflater1.finish();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long63 = deflater1.getBytesRead();
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        deflater1.setLevel((int) (short) 1);
        boolean boolean8 = deflater1.needsInput();
        int int9 = deflater1.getAdler();
        java.util.zip.Deflater deflater12 = new java.util.zip.Deflater(1, true);
        boolean boolean13 = deflater12.needsInput();
        int int14 = deflater12.getTotalOut();
        deflater12.finish();
        java.util.zip.Deflater deflater17 = new java.util.zip.Deflater((int) (byte) 1);
        deflater17.reset();
        java.util.zip.Deflater deflater20 = new java.util.zip.Deflater((int) (byte) 1);
        deflater20.reset();
        int int22 = deflater20.getTotalIn();
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater20.setInput(byteArray29);
        deflater17.setInput(byteArray29);
        boolean boolean32 = deflater17.needsInput();
        java.util.zip.Deflater deflater34 = new java.util.zip.Deflater((int) (byte) 1);
        deflater34.reset();
        int int36 = deflater34.getTotalIn();
        byte[] byteArray43 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater34.setInput(byteArray43);
        deflater34.finish();
        long long46 = deflater34.getBytesRead();
        deflater34.reset();
        java.util.zip.Deflater deflater50 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater52 = new java.util.zip.Deflater((int) (byte) 1);
        deflater52.reset();
        java.util.zip.Deflater deflater55 = new java.util.zip.Deflater((int) (byte) 1);
        deflater55.reset();
        int int57 = deflater55.getTotalIn();
        byte[] byteArray64 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater55.setInput(byteArray64);
        deflater52.setInput(byteArray64);
        deflater50.setInput(byteArray64);
        deflater50.setStrategy(0);
        boolean boolean70 = deflater50.needsInput();
        java.util.zip.Deflater deflater73 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater75 = new java.util.zip.Deflater((int) (byte) 1);
        deflater75.reset();
        java.util.zip.Deflater deflater78 = new java.util.zip.Deflater((int) (byte) 1);
        deflater78.reset();
        int int80 = deflater78.getTotalIn();
        byte[] byteArray87 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater78.setInput(byteArray87);
        deflater75.setInput(byteArray87);
        deflater73.setInput(byteArray87);
        deflater50.setInput(byteArray87);
        deflater34.setDictionary(byteArray87);
        int int93 = deflater17.deflate(byteArray87);
        deflater12.setDictionary(byteArray87);
        deflater1.setDictionary(byteArray87, (int) (short) 0, (int) (short) 1);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int99 = deflater1.getTotalOut();
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        long long6 = deflater1.getBytesWritten();
        int int7 = deflater1.getTotalOut();
        int int8 = deflater1.getAdler();
        long long9 = deflater1.getBytesWritten();
        boolean boolean10 = deflater1.finished();
        boolean boolean11 = deflater1.needsInput();
        int int12 = deflater1.getAdler();
        int int13 = deflater1.getTotalIn();
        long long14 = deflater1.getBytesRead();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int16 = deflater1.getTotalIn();
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalOut();
        long long5 = deflater1.getBytesRead();
        boolean boolean6 = deflater1.finished();
        java.util.zip.Deflater deflater8 = new java.util.zip.Deflater((-1));
        boolean boolean9 = deflater8.finished();
        java.util.zip.Deflater deflater11 = new java.util.zip.Deflater((int) (byte) 1);
        deflater11.reset();
        java.util.zip.Deflater deflater14 = new java.util.zip.Deflater((int) (byte) 1);
        deflater14.reset();
        int int16 = deflater14.getTotalIn();
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater14.setInput(byteArray23);
        deflater11.setInput(byteArray23);
        int int26 = deflater11.getTotalIn();
        java.util.zip.Deflater deflater28 = new java.util.zip.Deflater((int) (byte) 1);
        long long29 = deflater28.getBytesRead();
        long long30 = deflater28.getBytesRead();
        java.util.zip.Deflater deflater32 = new java.util.zip.Deflater((int) (byte) 1);
        deflater32.reset();
        int int34 = deflater32.getTotalIn();
        byte[] byteArray41 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater32.setInput(byteArray41);
        deflater32.finish();
        long long44 = deflater32.getBytesRead();
        deflater32.reset();
        int int46 = deflater32.getAdler();
        boolean boolean47 = deflater32.needsInput();
        int int48 = deflater32.getTotalIn();
        int int49 = deflater32.getTotalIn();
        java.util.zip.Deflater deflater51 = new java.util.zip.Deflater((int) (byte) 1);
        deflater51.reset();
        int int53 = deflater51.getTotalIn();
        byte[] byteArray60 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater51.setInput(byteArray60);
        deflater51.finish();
        long long63 = deflater51.getBytesRead();
        deflater51.reset();
        java.util.zip.Deflater deflater66 = new java.util.zip.Deflater((int) (byte) 1);
        deflater66.reset();
        int int68 = deflater66.getTotalIn();
        byte[] byteArray75 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater66.setInput(byteArray75);
        deflater66.finish();
        long long78 = deflater66.getBytesRead();
        deflater66.reset();
        byte[] byteArray86 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater66.setInput(byteArray86, (int) (short) 0, (int) (short) 1);
        int int90 = deflater51.deflate(byteArray86);
        deflater32.setDictionary(byteArray86);
        deflater28.setInput(byteArray86);
        deflater11.setDictionary(byteArray86);
        deflater8.setDictionary(byteArray86);
        deflater1.setInput(byteArray86);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long97 = deflater1.getBytesWritten();
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalOut();
        long long5 = deflater1.getBytesRead();
        boolean boolean6 = deflater1.finished();
        java.util.zip.Deflater deflater8 = new java.util.zip.Deflater((-1));
        boolean boolean9 = deflater8.finished();
        java.util.zip.Deflater deflater11 = new java.util.zip.Deflater((int) (byte) 1);
        deflater11.reset();
        java.util.zip.Deflater deflater14 = new java.util.zip.Deflater((int) (byte) 1);
        deflater14.reset();
        int int16 = deflater14.getTotalIn();
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater14.setInput(byteArray23);
        deflater11.setInput(byteArray23);
        int int26 = deflater11.getTotalIn();
        java.util.zip.Deflater deflater28 = new java.util.zip.Deflater((int) (byte) 1);
        long long29 = deflater28.getBytesRead();
        long long30 = deflater28.getBytesRead();
        java.util.zip.Deflater deflater32 = new java.util.zip.Deflater((int) (byte) 1);
        deflater32.reset();
        int int34 = deflater32.getTotalIn();
        byte[] byteArray41 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater32.setInput(byteArray41);
        deflater32.finish();
        long long44 = deflater32.getBytesRead();
        deflater32.reset();
        int int46 = deflater32.getAdler();
        boolean boolean47 = deflater32.needsInput();
        int int48 = deflater32.getTotalIn();
        int int49 = deflater32.getTotalIn();
        java.util.zip.Deflater deflater51 = new java.util.zip.Deflater((int) (byte) 1);
        deflater51.reset();
        int int53 = deflater51.getTotalIn();
        byte[] byteArray60 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater51.setInput(byteArray60);
        deflater51.finish();
        long long63 = deflater51.getBytesRead();
        deflater51.reset();
        java.util.zip.Deflater deflater66 = new java.util.zip.Deflater((int) (byte) 1);
        deflater66.reset();
        int int68 = deflater66.getTotalIn();
        byte[] byteArray75 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater66.setInput(byteArray75);
        deflater66.finish();
        long long78 = deflater66.getBytesRead();
        deflater66.reset();
        byte[] byteArray86 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater66.setInput(byteArray86, (int) (short) 0, (int) (short) 1);
        int int90 = deflater51.deflate(byteArray86);
        deflater32.setDictionary(byteArray86);
        deflater28.setInput(byteArray86);
        deflater11.setDictionary(byteArray86);
        deflater8.setDictionary(byteArray86);
        deflater1.setInput(byteArray86);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long97 = deflater1.getBytesRead();
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesRead();
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater7.setInput(byteArray16);
        deflater4.setInput(byteArray16);
        deflater1.setDictionary(byteArray16);
        deflater1.reset();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long22 = deflater1.getBytesWritten();
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        deflater1.reset();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater1.setDictionary(byteArray14);
        long long17 = deflater1.getBytesRead();
        int int18 = deflater1.getTotalOut();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int20 = deflater1.getAdler();
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        deflater2.end();
        boolean boolean7 = deflater2.needsInput();
        java.util.zip.Deflater deflater10 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater12 = new java.util.zip.Deflater((int) (byte) 1);
        deflater12.reset();
        java.util.zip.Deflater deflater15 = new java.util.zip.Deflater((int) (byte) 1);
        deflater15.reset();
        int int17 = deflater15.getTotalIn();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater15.setInput(byteArray24);
        deflater12.setInput(byteArray24);
        deflater10.setInput(byteArray24);
        boolean boolean28 = deflater10.finished();
        boolean boolean29 = deflater10.finished();
        boolean boolean30 = deflater10.needsInput();
        java.util.zip.Deflater deflater32 = new java.util.zip.Deflater((int) (byte) 1);
        deflater32.reset();
        int int34 = deflater32.getAdler();
        java.util.zip.Deflater deflater36 = new java.util.zip.Deflater((int) (byte) 1);
        deflater36.reset();
        int int38 = deflater36.getTotalIn();
        byte[] byteArray45 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater36.setInput(byteArray45);
        deflater32.setInput(byteArray45);
        deflater10.setDictionary(byteArray45);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int49 = deflater2.deflate(byteArray45);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        long long3 = deflater1.getBytesWritten();
        deflater1.end();
        boolean boolean5 = deflater1.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int6 = deflater1.getTotalIn();
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        deflater1.reset();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater1.setInput(byteArray21, (int) (short) 0, (int) (short) 1);
        deflater1.reset();
        deflater1.reset();
        boolean boolean27 = deflater1.finished();
        java.util.zip.Deflater deflater29 = new java.util.zip.Deflater((-1));
        int int30 = deflater29.getTotalIn();
        boolean boolean31 = deflater29.finished();
        java.util.zip.Deflater deflater33 = new java.util.zip.Deflater((int) (byte) 1);
        deflater33.reset();
        deflater33.reset();
        deflater33.reset();
        java.util.zip.Deflater deflater38 = new java.util.zip.Deflater((int) (byte) 1);
        deflater38.reset();
        deflater38.reset();
        java.util.zip.Deflater deflater42 = new java.util.zip.Deflater((int) (byte) 1);
        deflater42.reset();
        int int44 = deflater42.getTotalIn();
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater42.setInput(byteArray51);
        deflater38.setDictionary(byteArray51);
        int int54 = deflater33.deflate(byteArray51);
        int int55 = deflater29.deflate(byteArray51);
        int int56 = deflater1.deflate(byteArray51);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int58 = deflater1.getAdler();
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        int int3 = deflater2.getTotalIn();
        int int4 = deflater2.getTotalIn();
        boolean boolean5 = deflater2.finished();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        long long8 = deflater7.getBytesWritten();
        int int9 = deflater7.getTotalIn();
        java.util.zip.Deflater deflater11 = new java.util.zip.Deflater((int) (byte) 1);
        deflater11.reset();
        int int13 = deflater11.getTotalIn();
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater11.setInput(byteArray20);
        deflater11.finish();
        long long23 = deflater11.getBytesRead();
        deflater11.reset();
        java.util.zip.Deflater deflater26 = new java.util.zip.Deflater((int) (byte) 1);
        deflater26.reset();
        int int28 = deflater26.getTotalIn();
        byte[] byteArray35 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater26.setInput(byteArray35);
        deflater26.finish();
        long long38 = deflater26.getBytesRead();
        deflater26.reset();
        byte[] byteArray46 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater26.setInput(byteArray46, (int) (short) 0, (int) (short) 1);
        deflater11.setDictionary(byteArray46);
        int int51 = deflater7.deflate(byteArray46);
        deflater2.setDictionary(byteArray46);
        int int53 = deflater2.getTotalIn();
        deflater2.finish();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int56 = deflater2.getTotalOut();
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(1, true);
        boolean boolean3 = deflater2.needsInput();
        int int4 = deflater2.getTotalOut();
        deflater2.finish();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        java.util.zip.Deflater deflater10 = new java.util.zip.Deflater((int) (byte) 1);
        deflater10.reset();
        int int12 = deflater10.getTotalIn();
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater10.setInput(byteArray19);
        deflater7.setInput(byteArray19);
        boolean boolean22 = deflater7.needsInput();
        java.util.zip.Deflater deflater24 = new java.util.zip.Deflater((int) (byte) 1);
        deflater24.reset();
        int int26 = deflater24.getTotalIn();
        byte[] byteArray33 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater24.setInput(byteArray33);
        deflater24.finish();
        long long36 = deflater24.getBytesRead();
        deflater24.reset();
        java.util.zip.Deflater deflater40 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater42 = new java.util.zip.Deflater((int) (byte) 1);
        deflater42.reset();
        java.util.zip.Deflater deflater45 = new java.util.zip.Deflater((int) (byte) 1);
        deflater45.reset();
        int int47 = deflater45.getTotalIn();
        byte[] byteArray54 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater45.setInput(byteArray54);
        deflater42.setInput(byteArray54);
        deflater40.setInput(byteArray54);
        deflater40.setStrategy(0);
        boolean boolean60 = deflater40.needsInput();
        java.util.zip.Deflater deflater63 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater65 = new java.util.zip.Deflater((int) (byte) 1);
        deflater65.reset();
        java.util.zip.Deflater deflater68 = new java.util.zip.Deflater((int) (byte) 1);
        deflater68.reset();
        int int70 = deflater68.getTotalIn();
        byte[] byteArray77 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater68.setInput(byteArray77);
        deflater65.setInput(byteArray77);
        deflater63.setInput(byteArray77);
        deflater40.setInput(byteArray77);
        deflater24.setDictionary(byteArray77);
        int int83 = deflater7.deflate(byteArray77);
        deflater2.setDictionary(byteArray77);
        boolean boolean85 = deflater2.finished();
        boolean boolean86 = deflater2.needsInput();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater2.reset();
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        deflater1.reset();
        boolean boolean5 = deflater1.finished();
        deflater1.end();
        deflater1.setStrategy(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = deflater1.getTotalOut();
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (byte) 0, false);
        boolean boolean3 = deflater2.needsInput();
        long long4 = deflater2.getBytesWritten();
        deflater2.end();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long7 = deflater2.getBytesWritten();
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) 0, true);
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int4 = deflater2.getAdler();
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        int int6 = deflater4.getTotalIn();
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater4.setInput(byteArray13);
        deflater1.setInput(byteArray13);
        boolean boolean16 = deflater1.needsInput();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater1.reset();
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(1, true);
        deflater2.finish();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        deflater5.reset();
        java.util.zip.Deflater deflater9 = new java.util.zip.Deflater((int) (byte) 1);
        deflater9.reset();
        int int11 = deflater9.getTotalIn();
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater9.setInput(byteArray18);
        deflater5.setDictionary(byteArray18);
        int int21 = deflater5.getAdler();
        int int22 = deflater5.getAdler();
        deflater5.reset();
        java.util.zip.Deflater deflater25 = new java.util.zip.Deflater((int) (byte) 1);
        long long26 = deflater25.getBytesWritten();
        long long27 = deflater25.getBytesWritten();
        java.util.zip.Deflater deflater29 = new java.util.zip.Deflater((int) (byte) 1);
        deflater29.reset();
        int int31 = deflater29.getTotalIn();
        byte[] byteArray38 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater29.setInput(byteArray38);
        deflater29.finish();
        long long41 = deflater29.getBytesRead();
        deflater29.reset();
        java.util.zip.Deflater deflater44 = new java.util.zip.Deflater((int) (byte) 1);
        deflater44.reset();
        int int46 = deflater44.getTotalIn();
        byte[] byteArray53 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater44.setInput(byteArray53);
        deflater44.finish();
        long long56 = deflater44.getBytesRead();
        deflater44.reset();
        byte[] byteArray64 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater44.setInput(byteArray64, (int) (short) 0, (int) (short) 1);
        deflater29.setDictionary(byteArray64);
        deflater25.setInput(byteArray64);
        deflater5.setInput(byteArray64);
        int int71 = deflater2.deflate(byteArray64);
        int int72 = deflater2.getTotalIn();
        long long73 = deflater2.getBytesRead();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int75 = deflater2.getTotalIn();
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (byte) 0, false);
        boolean boolean3 = deflater2.needsInput();
        int int4 = deflater2.getTotalIn();
        long long5 = deflater2.getBytesRead();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long7 = deflater2.getBytesWritten();
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater7.setInput(byteArray16);
        deflater4.setInput(byteArray16);
        deflater2.setInput(byteArray16);
        deflater2.setStrategy(0);
        boolean boolean22 = deflater2.needsInput();
        deflater2.finish();
        deflater2.reset();
        long long25 = deflater2.getBytesRead();
        long long26 = deflater2.getBytesWritten();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int28 = deflater2.getTotalOut();
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        long long6 = deflater1.getBytesWritten();
        int int7 = deflater1.getTotalOut();
        int int8 = deflater1.getAdler();
        long long9 = deflater1.getBytesWritten();
        deflater1.end();
        deflater1.finish();
        deflater1.finish();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int13 = deflater1.getTotalOut();
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(3, true);
        deflater2.reset();
        deflater2.setStrategy(0);
        int int6 = deflater2.getAdler();
        deflater2.end();
        java.util.zip.Deflater deflater10 = new java.util.zip.Deflater((-1), true);
        int int11 = deflater10.getAdler();
        boolean boolean12 = deflater10.finished();
        boolean boolean13 = deflater10.needsInput();
        boolean boolean14 = deflater10.needsInput();
        java.util.zip.Deflater deflater16 = new java.util.zip.Deflater((int) (byte) 1);
        deflater16.reset();
        int int18 = deflater16.getTotalIn();
        deflater16.reset();
        boolean boolean20 = deflater16.finished();
        int int21 = deflater16.getTotalOut();
        java.util.zip.Deflater deflater23 = new java.util.zip.Deflater((int) (byte) 1);
        deflater23.reset();
        int int25 = deflater23.getAdler();
        java.util.zip.Deflater deflater27 = new java.util.zip.Deflater((int) (byte) 1);
        deflater27.reset();
        int int29 = deflater27.getTotalIn();
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater27.setInput(byteArray36);
        deflater23.setInput(byteArray36);
        int int41 = deflater16.deflate(byteArray36, 0, 0);
        deflater10.setDictionary(byteArray36, 3, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deflater2.setDictionary(byteArray36);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        deflater1.finish();
        int int5 = deflater1.getTotalOut();
        boolean boolean6 = deflater1.needsInput();
        long long7 = deflater1.getBytesRead();
        deflater1.finish();
        deflater1.setLevel(9);
        deflater1.end();
        boolean boolean12 = deflater1.finished();
        java.util.zip.Deflater deflater14 = new java.util.zip.Deflater((int) (byte) 1);
        deflater14.reset();
        int int16 = deflater14.getTotalIn();
        int int17 = deflater14.getTotalIn();
        deflater14.finish();
        deflater14.reset();
        boolean boolean20 = deflater14.finished();
        deflater14.finish();
        deflater14.setLevel(6);
        java.util.zip.Deflater deflater26 = new java.util.zip.Deflater((int) (short) -1, false);
        deflater26.finish();
        java.util.zip.Deflater deflater29 = new java.util.zip.Deflater((int) (byte) 1);
        long long30 = deflater29.getBytesWritten();
        int int31 = deflater29.getTotalOut();
        long long32 = deflater29.getBytesWritten();
        deflater29.reset();
        deflater29.reset();
        java.util.zip.Deflater deflater36 = new java.util.zip.Deflater((int) (byte) 1);
        deflater36.reset();
        int int38 = deflater36.getTotalIn();
        int int39 = deflater36.getTotalIn();
        int int40 = deflater36.getTotalIn();
        long long41 = deflater36.getBytesWritten();
        java.util.zip.Deflater deflater43 = new java.util.zip.Deflater((int) (byte) 1);
        deflater43.reset();
        int int45 = deflater43.getTotalIn();
        byte[] byteArray52 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater43.setInput(byteArray52);
        deflater43.finish();
        long long55 = deflater43.getBytesRead();
        deflater43.reset();
        byte[] byteArray63 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater43.setInput(byteArray63, (int) (short) 0, (int) (short) 1);
        deflater43.reset();
        deflater43.reset();
        java.util.zip.Deflater deflater70 = new java.util.zip.Deflater((int) (byte) 1);
        long long71 = deflater70.getBytesWritten();
        int int72 = deflater70.getTotalOut();
        long long73 = deflater70.getBytesWritten();
        java.util.zip.Deflater deflater75 = new java.util.zip.Deflater((int) (byte) 1);
        deflater75.reset();
        deflater75.reset();
        java.util.zip.Deflater deflater79 = new java.util.zip.Deflater((int) (byte) 1);
        deflater79.reset();
        int int81 = deflater79.getTotalIn();
        byte[] byteArray88 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater79.setInput(byteArray88);
        deflater75.setDictionary(byteArray88);
        deflater70.setDictionary(byteArray88);
        deflater43.setInput(byteArray88);
        deflater36.setDictionary(byteArray88, 2, (int) (short) 0);
        int int96 = deflater29.deflate(byteArray88);
        int int97 = deflater26.deflate(byteArray88);
        deflater14.setDictionary(byteArray88);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater1.setDictionary(byteArray88);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        long long6 = deflater1.getBytesWritten();
        int int7 = deflater1.getTotalOut();
        boolean boolean8 = deflater1.needsInput();
        int int9 = deflater1.getAdler();
        deflater1.end();
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deflater1.setDictionary(byteArray13);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(1, true);
        boolean boolean3 = deflater2.needsInput();
        deflater2.reset();
        deflater2.end();
        java.util.zip.Deflater deflater8 = new java.util.zip.Deflater((-1), true);
        long long9 = deflater8.getBytesWritten();
        deflater8.setLevel(2);
        deflater8.end();
        boolean boolean13 = deflater8.needsInput();
        deflater8.setLevel(6);
        deflater8.end();
        java.util.zip.Deflater deflater19 = new java.util.zip.Deflater((int) (byte) 0, false);
        boolean boolean20 = deflater19.needsInput();
        int int21 = deflater19.getTotalOut();
        int int22 = deflater19.getTotalIn();
        java.util.zip.Deflater deflater23 = new java.util.zip.Deflater();
        deflater23.reset();
        long long25 = deflater23.getBytesWritten();
        int int26 = deflater23.getTotalIn();
        java.util.zip.Deflater deflater28 = new java.util.zip.Deflater((int) (byte) -1);
        boolean boolean29 = deflater28.finished();
        java.util.zip.Deflater deflater31 = new java.util.zip.Deflater((int) (byte) 1);
        deflater31.reset();
        int int33 = deflater31.getTotalIn();
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater31.setInput(byteArray40);
        deflater31.finish();
        long long43 = deflater31.getBytesRead();
        java.util.zip.Deflater deflater45 = new java.util.zip.Deflater((int) (byte) 1);
        deflater45.reset();
        int int47 = deflater45.getTotalIn();
        byte[] byteArray54 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater45.setInput(byteArray54);
        deflater45.finish();
        long long57 = deflater45.getBytesRead();
        deflater45.reset();
        java.util.zip.Deflater deflater60 = new java.util.zip.Deflater((int) (byte) 1);
        deflater60.reset();
        int int62 = deflater60.getTotalIn();
        byte[] byteArray69 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater60.setInput(byteArray69);
        deflater60.finish();
        long long72 = deflater60.getBytesRead();
        deflater60.reset();
        byte[] byteArray80 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater60.setInput(byteArray80, (int) (short) 0, (int) (short) 1);
        deflater45.setDictionary(byteArray80);
        int int85 = deflater31.deflate(byteArray80);
        int int88 = deflater28.deflate(byteArray80, (int) (byte) 1, 2);
        int int91 = deflater23.deflate(byteArray80, 0, 1);
        deflater19.setInput(byteArray80);
        deflater8.setInput(byteArray80);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int94 = deflater2.deflate(byteArray80);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.reset();
        java.util.zip.Deflater deflater14 = new java.util.zip.Deflater((int) (byte) 1);
        deflater14.reset();
        int int16 = deflater14.getTotalIn();
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater14.setInput(byteArray23);
        deflater14.finish();
        long long26 = deflater14.getBytesRead();
        deflater14.reset();
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater14.setInput(byteArray34, (int) (short) 0, (int) (short) 1);
        deflater1.setInput(byteArray34);
        boolean boolean39 = deflater1.finished();
        deflater1.finish();
        int int41 = deflater1.getTotalIn();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int43 = deflater1.getTotalOut();
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        deflater1.finish();
        int int6 = deflater1.getTotalOut();
        int int7 = deflater1.getTotalOut();
        long long8 = deflater1.getBytesWritten();
        deflater1.end();
        deflater1.finish();
        java.util.zip.Deflater deflater12 = new java.util.zip.Deflater((int) (byte) 1);
        deflater12.reset();
        int int14 = deflater12.getTotalIn();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater12.setInput(byteArray21);
        deflater12.finish();
        long long24 = deflater12.getBytesRead();
        deflater12.reset();
        int int26 = deflater12.getTotalIn();
        int int27 = deflater12.getTotalIn();
        deflater12.setStrategy((int) (byte) 1);
        long long30 = deflater12.getBytesRead();
        long long31 = deflater12.getBytesWritten();
        java.util.zip.Deflater deflater33 = new java.util.zip.Deflater((int) (byte) 1);
        deflater33.reset();
        int int35 = deflater33.getTotalIn();
        int int36 = deflater33.getTotalIn();
        java.util.zip.Deflater deflater38 = new java.util.zip.Deflater((int) (byte) 1);
        deflater38.reset();
        java.util.zip.Deflater deflater41 = new java.util.zip.Deflater((int) (byte) 1);
        deflater41.reset();
        int int43 = deflater41.getTotalIn();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater41.setInput(byteArray50);
        deflater38.setInput(byteArray50);
        int int53 = deflater33.deflate(byteArray50);
        deflater12.setDictionary(byteArray50);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int55 = deflater1.deflate(byteArray50);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        deflater1.setLevel((int) (short) 1);
        deflater1.setLevel((int) (byte) 1);
        boolean boolean10 = deflater1.finished();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long12 = deflater1.getBytesRead();
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 0);
        long long2 = deflater1.getBytesRead();
        deflater1.end();
        boolean boolean4 = deflater1.needsInput();
        java.util.zip.Deflater deflater6 = new java.util.zip.Deflater((int) (byte) 1);
        deflater6.reset();
        int int8 = deflater6.getTotalIn();
        int int9 = deflater6.getTotalIn();
        int int10 = deflater6.getTotalIn();
        deflater6.setLevel((int) (short) 1);
        deflater6.setLevel((int) (byte) 1);
        boolean boolean15 = deflater6.finished();
        java.util.zip.Deflater deflater17 = new java.util.zip.Deflater((int) (byte) 1);
        long long18 = deflater17.getBytesWritten();
        int int19 = deflater17.getTotalOut();
        long long20 = deflater17.getBytesWritten();
        deflater17.reset();
        deflater17.reset();
        java.util.zip.Deflater deflater24 = new java.util.zip.Deflater((int) (byte) 1);
        deflater24.reset();
        int int26 = deflater24.getTotalIn();
        int int27 = deflater24.getTotalIn();
        int int28 = deflater24.getTotalIn();
        long long29 = deflater24.getBytesWritten();
        java.util.zip.Deflater deflater31 = new java.util.zip.Deflater((int) (byte) 1);
        deflater31.reset();
        int int33 = deflater31.getTotalIn();
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater31.setInput(byteArray40);
        deflater31.finish();
        long long43 = deflater31.getBytesRead();
        deflater31.reset();
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater31.setInput(byteArray51, (int) (short) 0, (int) (short) 1);
        deflater31.reset();
        deflater31.reset();
        java.util.zip.Deflater deflater58 = new java.util.zip.Deflater((int) (byte) 1);
        long long59 = deflater58.getBytesWritten();
        int int60 = deflater58.getTotalOut();
        long long61 = deflater58.getBytesWritten();
        java.util.zip.Deflater deflater63 = new java.util.zip.Deflater((int) (byte) 1);
        deflater63.reset();
        deflater63.reset();
        java.util.zip.Deflater deflater67 = new java.util.zip.Deflater((int) (byte) 1);
        deflater67.reset();
        int int69 = deflater67.getTotalIn();
        byte[] byteArray76 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater67.setInput(byteArray76);
        deflater63.setDictionary(byteArray76);
        deflater58.setDictionary(byteArray76);
        deflater31.setInput(byteArray76);
        deflater24.setDictionary(byteArray76, 2, (int) (short) 0);
        int int84 = deflater17.deflate(byteArray76);
        deflater6.setInput(byteArray76);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int89 = deflater1.deflate(byteArray76, (int) (short) 1, (int) (short) 0, (int) (short) -1);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        int int3 = deflater1.getTotalIn();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater5.finish();
        long long17 = deflater5.getBytesRead();
        deflater5.reset();
        java.util.zip.Deflater deflater20 = new java.util.zip.Deflater((int) (byte) 1);
        deflater20.reset();
        int int22 = deflater20.getTotalIn();
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater20.setInput(byteArray29);
        deflater20.finish();
        long long32 = deflater20.getBytesRead();
        deflater20.reset();
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater20.setInput(byteArray40, (int) (short) 0, (int) (short) 1);
        deflater5.setDictionary(byteArray40);
        int int45 = deflater1.deflate(byteArray40);
        int int46 = deflater1.getTotalIn();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long48 = deflater1.getBytesWritten();
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater(3);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater1.reset();
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        deflater1.finish();
        int int5 = deflater1.getTotalOut();
        boolean boolean6 = deflater1.needsInput();
        long long7 = deflater1.getBytesRead();
        java.util.zip.Deflater deflater9 = new java.util.zip.Deflater((int) (byte) 1);
        deflater9.reset();
        int int11 = deflater9.getTotalIn();
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater9.setInput(byteArray18);
        deflater9.finish();
        java.util.zip.Deflater deflater23 = new java.util.zip.Deflater((-1), true);
        long long24 = deflater23.getBytesWritten();
        deflater23.setLevel(2);
        java.util.zip.Deflater deflater28 = new java.util.zip.Deflater((int) (byte) 1);
        deflater28.reset();
        int int30 = deflater28.getTotalIn();
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater28.setInput(byteArray37);
        deflater28.finish();
        long long40 = deflater28.getBytesRead();
        deflater28.reset();
        java.util.zip.Deflater deflater43 = new java.util.zip.Deflater((int) (byte) 1);
        deflater43.reset();
        int int45 = deflater43.getTotalIn();
        byte[] byteArray52 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater43.setInput(byteArray52);
        deflater43.finish();
        long long55 = deflater43.getBytesRead();
        deflater43.reset();
        byte[] byteArray63 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater43.setInput(byteArray63, (int) (short) 0, (int) (short) 1);
        deflater28.setDictionary(byteArray63);
        deflater23.setInput(byteArray63);
        deflater9.setDictionary(byteArray63);
        boolean boolean70 = deflater9.finished();
        java.util.zip.Deflater deflater72 = new java.util.zip.Deflater((int) (byte) 1);
        deflater72.reset();
        int int74 = deflater72.getTotalIn();
        byte[] byteArray81 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater72.setInput(byteArray81);
        deflater72.finish();
        long long84 = deflater72.getBytesRead();
        deflater72.reset();
        byte[] byteArray92 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater72.setInput(byteArray92, (int) (short) 0, (int) (short) 1);
        deflater9.setInput(byteArray92);
        deflater1.setDictionary(byteArray92);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater1.reset();
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        deflater1.reset();
        boolean boolean5 = deflater1.finished();
        deflater1.end();
        deflater1.setLevel((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long9 = deflater1.getBytesRead();
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        long long6 = deflater1.getBytesWritten();
        int int7 = deflater1.getTotalOut();
        int int8 = deflater1.getTotalIn();
        long long9 = deflater1.getBytesRead();
        deflater1.reset();
        long long11 = deflater1.getBytesRead();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater1.reset();
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        java.util.zip.Deflater deflater15 = new java.util.zip.Deflater((int) (byte) 1);
        deflater15.reset();
        int int17 = deflater15.getTotalIn();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater15.setInput(byteArray24);
        deflater15.finish();
        long long27 = deflater15.getBytesRead();
        deflater15.reset();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getTotalIn();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater30.setInput(byteArray39);
        deflater30.finish();
        long long42 = deflater30.getBytesRead();
        deflater30.reset();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater30.setInput(byteArray50, (int) (short) 0, (int) (short) 1);
        deflater15.setDictionary(byteArray50);
        int int55 = deflater1.deflate(byteArray50);
        deflater1.setLevel(3);
        deflater1.setStrategy(2);
        deflater1.reset();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int62 = deflater1.getTotalOut();
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater7.setInput(byteArray16);
        deflater4.setInput(byteArray16);
        deflater2.setInput(byteArray16);
        deflater2.setStrategy(0);
        boolean boolean22 = deflater2.needsInput();
        java.util.zip.Deflater deflater25 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater27 = new java.util.zip.Deflater((int) (byte) 1);
        deflater27.reset();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getTotalIn();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater30.setInput(byteArray39);
        deflater27.setInput(byteArray39);
        deflater25.setInput(byteArray39);
        deflater2.setInput(byteArray39);
        java.util.zip.Deflater deflater45 = new java.util.zip.Deflater((int) (byte) 1);
        deflater45.reset();
        int int47 = deflater45.getTotalIn();
        byte[] byteArray54 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater45.setInput(byteArray54);
        deflater45.finish();
        long long57 = deflater45.getBytesRead();
        deflater45.reset();
        byte[] byteArray65 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater45.setInput(byteArray65, (int) (short) 0, (int) (short) 1);
        deflater2.setInput(byteArray65);
        int int70 = deflater2.getTotalOut();
        deflater2.end();
        deflater2.end();
        deflater2.setLevel(9);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long75 = deflater2.getBytesWritten();
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        java.util.zip.Deflater deflater15 = new java.util.zip.Deflater((int) (byte) 1);
        deflater15.reset();
        int int17 = deflater15.getTotalIn();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater15.setInput(byteArray24);
        deflater15.finish();
        long long27 = deflater15.getBytesRead();
        deflater15.reset();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getTotalIn();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater30.setInput(byteArray39);
        deflater30.finish();
        long long42 = deflater30.getBytesRead();
        deflater30.reset();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater30.setInput(byteArray50, (int) (short) 0, (int) (short) 1);
        deflater15.setDictionary(byteArray50);
        int int55 = deflater1.deflate(byteArray50);
        boolean boolean56 = deflater1.finished();
        int int57 = deflater1.getTotalIn();
        deflater1.finish();
        deflater1.reset();
        long long60 = deflater1.getBytesWritten();
        long long61 = deflater1.getBytesRead();
        int int62 = deflater1.getAdler();
        int int63 = deflater1.getTotalIn();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long65 = deflater1.getBytesRead();
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesRead();
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater7.setInput(byteArray16);
        deflater4.setInput(byteArray16);
        deflater1.setDictionary(byteArray16);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int21 = deflater1.getTotalOut();
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalOut();
        deflater1.setLevel(0);
        java.util.zip.Deflater deflater9 = new java.util.zip.Deflater(2, false);
        java.util.zip.Deflater deflater11 = new java.util.zip.Deflater((int) (byte) 1);
        deflater11.reset();
        int int13 = deflater11.getTotalIn();
        int int14 = deflater11.getTotalIn();
        deflater11.finish();
        deflater11.reset();
        java.util.zip.Deflater deflater18 = new java.util.zip.Deflater((int) (byte) 1);
        deflater18.reset();
        int int20 = deflater18.getTotalIn();
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater18.setInput(byteArray27);
        deflater11.setInput(byteArray27);
        deflater11.finish();
        int int31 = deflater11.getAdler();
        int int32 = deflater11.getTotalIn();
        java.util.zip.Deflater deflater35 = new java.util.zip.Deflater((-1), true);
        long long36 = deflater35.getBytesWritten();
        deflater35.setLevel(2);
        java.util.zip.Deflater deflater40 = new java.util.zip.Deflater((int) (byte) 1);
        deflater40.reset();
        int int42 = deflater40.getTotalIn();
        byte[] byteArray49 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater40.setInput(byteArray49);
        deflater40.finish();
        long long52 = deflater40.getBytesRead();
        deflater40.reset();
        java.util.zip.Deflater deflater55 = new java.util.zip.Deflater((int) (byte) 1);
        deflater55.reset();
        int int57 = deflater55.getTotalIn();
        byte[] byteArray64 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater55.setInput(byteArray64);
        deflater55.finish();
        long long67 = deflater55.getBytesRead();
        deflater55.reset();
        byte[] byteArray75 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater55.setInput(byteArray75, (int) (short) 0, (int) (short) 1);
        deflater40.setDictionary(byteArray75);
        deflater35.setInput(byteArray75);
        deflater11.setDictionary(byteArray75);
        deflater9.setInput(byteArray75);
        deflater1.setInput(byteArray75, 3, 0);
        long long86 = deflater1.getBytesRead();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long88 = deflater1.getBytesRead();
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (byte) -1, true);
        long long3 = deflater2.getBytesRead();
        long long4 = deflater2.getBytesRead();
        boolean boolean5 = deflater2.needsInput();
        int int6 = deflater2.getTotalIn();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int8 = deflater2.getTotalOut();
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getAdler();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater1.setInput(byteArray14, 0, 0);
        java.util.zip.Deflater deflater20 = new java.util.zip.Deflater((int) (byte) 1);
        int int21 = deflater20.getTotalOut();
        int int22 = deflater20.getTotalOut();
        java.util.zip.Deflater deflater24 = new java.util.zip.Deflater((int) (byte) 1);
        deflater24.reset();
        int int26 = deflater24.getTotalIn();
        byte[] byteArray33 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater24.setInput(byteArray33);
        deflater24.finish();
        long long36 = deflater24.getBytesRead();
        deflater24.reset();
        byte[] byteArray44 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater24.setInput(byteArray44, (int) (short) 0, (int) (short) 1);
        java.util.zip.Deflater deflater50 = new java.util.zip.Deflater((int) (short) -1, false);
        java.util.zip.Deflater deflater52 = new java.util.zip.Deflater((int) (byte) 1);
        deflater52.reset();
        int int54 = deflater52.getAdler();
        java.util.zip.Deflater deflater56 = new java.util.zip.Deflater((int) (byte) 1);
        deflater56.reset();
        int int58 = deflater56.getTotalIn();
        byte[] byteArray65 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater56.setInput(byteArray65);
        deflater52.setInput(byteArray65, 0, 0);
        int int70 = deflater50.deflate(byteArray65);
        deflater24.setInput(byteArray65);
        deflater20.setDictionary(byteArray65);
        deflater1.setInput(byteArray65);
        long long74 = deflater1.getBytesRead();
        long long75 = deflater1.getBytesRead();
        deflater1.setLevel(0);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int79 = deflater1.getTotalOut();
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        deflater1.end();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int5 = deflater1.getTotalIn();
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        deflater1.setLevel((int) (short) 1);
        deflater1.setLevel((int) (byte) 1);
        boolean boolean10 = deflater1.finished();
        java.util.zip.Deflater deflater13 = new java.util.zip.Deflater((int) (short) -1, false);
        int int14 = deflater13.getTotalIn();
        int int15 = deflater13.getTotalIn();
        boolean boolean16 = deflater13.finished();
        java.util.zip.Deflater deflater18 = new java.util.zip.Deflater((int) (byte) 1);
        long long19 = deflater18.getBytesWritten();
        int int20 = deflater18.getTotalIn();
        java.util.zip.Deflater deflater22 = new java.util.zip.Deflater((int) (byte) 1);
        deflater22.reset();
        int int24 = deflater22.getTotalIn();
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater22.setInput(byteArray31);
        deflater22.finish();
        long long34 = deflater22.getBytesRead();
        deflater22.reset();
        java.util.zip.Deflater deflater37 = new java.util.zip.Deflater((int) (byte) 1);
        deflater37.reset();
        int int39 = deflater37.getTotalIn();
        byte[] byteArray46 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater37.setInput(byteArray46);
        deflater37.finish();
        long long49 = deflater37.getBytesRead();
        deflater37.reset();
        byte[] byteArray57 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater37.setInput(byteArray57, (int) (short) 0, (int) (short) 1);
        deflater22.setDictionary(byteArray57);
        int int62 = deflater18.deflate(byteArray57);
        deflater13.setDictionary(byteArray57);
        int int64 = deflater1.deflate(byteArray57);
        int int65 = deflater1.getTotalIn();
        long long66 = deflater1.getBytesRead();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long68 = deflater1.getBytesRead();
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        deflater1.reset();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater1.setDictionary(byteArray14);
        int int17 = deflater1.getAdler();
        int int18 = deflater1.getAdler();
        boolean boolean19 = deflater1.needsInput();
        deflater1.end();
        boolean boolean21 = deflater1.finished();
        java.util.zip.Deflater deflater23 = new java.util.zip.Deflater((int) (short) -1);
        java.util.zip.Deflater deflater26 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater28 = new java.util.zip.Deflater((int) (byte) 1);
        deflater28.reset();
        java.util.zip.Deflater deflater31 = new java.util.zip.Deflater((int) (byte) 1);
        deflater31.reset();
        int int33 = deflater31.getTotalIn();
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater31.setInput(byteArray40);
        deflater28.setInput(byteArray40);
        deflater26.setInput(byteArray40);
        deflater26.setStrategy(0);
        boolean boolean46 = deflater26.needsInput();
        java.util.zip.Deflater deflater49 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater51 = new java.util.zip.Deflater((int) (byte) 1);
        deflater51.reset();
        java.util.zip.Deflater deflater54 = new java.util.zip.Deflater((int) (byte) 1);
        deflater54.reset();
        int int56 = deflater54.getTotalIn();
        byte[] byteArray63 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater54.setInput(byteArray63);
        deflater51.setInput(byteArray63);
        deflater49.setInput(byteArray63);
        deflater26.setInput(byteArray63);
        java.util.zip.Deflater deflater69 = new java.util.zip.Deflater((int) (byte) 1);
        deflater69.reset();
        int int71 = deflater69.getTotalIn();
        byte[] byteArray78 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater69.setInput(byteArray78);
        deflater69.finish();
        long long81 = deflater69.getBytesRead();
        deflater69.reset();
        byte[] byteArray89 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater69.setInput(byteArray89, (int) (short) 0, (int) (short) 1);
        deflater26.setInput(byteArray89);
        deflater23.setDictionary(byteArray89, 2, (int) (short) 1);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int97 = deflater1.deflate(byteArray89);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        deflater1.finish();
        int int6 = deflater1.getTotalOut();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int8 = deflater1.getTotalOut();
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.reset();
        deflater1.end();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int15 = deflater1.getTotalOut();
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(2, true);
        long long3 = deflater2.getBytesWritten();
        deflater2.end();
        java.util.zip.Deflater deflater6 = new java.util.zip.Deflater((int) (byte) 1);
        int int7 = deflater6.getTotalOut();
        int int8 = deflater6.getTotalOut();
        java.util.zip.Deflater deflater10 = new java.util.zip.Deflater((int) (byte) 1);
        deflater10.reset();
        int int12 = deflater10.getTotalIn();
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater10.setInput(byteArray19);
        deflater10.finish();
        long long22 = deflater10.getBytesRead();
        deflater10.reset();
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater10.setInput(byteArray30, (int) (short) 0, (int) (short) 1);
        java.util.zip.Deflater deflater36 = new java.util.zip.Deflater((int) (short) -1, false);
        java.util.zip.Deflater deflater38 = new java.util.zip.Deflater((int) (byte) 1);
        deflater38.reset();
        int int40 = deflater38.getAdler();
        java.util.zip.Deflater deflater42 = new java.util.zip.Deflater((int) (byte) 1);
        deflater42.reset();
        int int44 = deflater42.getTotalIn();
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater42.setInput(byteArray51);
        deflater38.setInput(byteArray51, 0, 0);
        int int56 = deflater36.deflate(byteArray51);
        deflater10.setInput(byteArray51);
        deflater6.setDictionary(byteArray51);
        int int59 = deflater6.getAdler();
        deflater6.reset();
        deflater6.setLevel((int) (byte) -1);
        int int63 = deflater6.getTotalIn();
        java.util.zip.Deflater deflater65 = new java.util.zip.Deflater((int) (byte) 1);
        long long66 = deflater65.getBytesRead();
        java.util.zip.Deflater deflater68 = new java.util.zip.Deflater((int) (byte) 1);
        deflater68.reset();
        java.util.zip.Deflater deflater71 = new java.util.zip.Deflater((int) (byte) 1);
        deflater71.reset();
        int int73 = deflater71.getTotalIn();
        byte[] byteArray80 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater71.setInput(byteArray80);
        deflater68.setInput(byteArray80);
        deflater65.setDictionary(byteArray80);
        int int84 = deflater6.deflate(byteArray80);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deflater2.setDictionary(byteArray80);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(3, true);
        deflater2.reset();
        deflater2.setStrategy(0);
        int int6 = deflater2.getAdler();
        deflater2.end();
        java.util.zip.Deflater deflater9 = new java.util.zip.Deflater((int) (byte) 1);
        deflater9.reset();
        int int11 = deflater9.getTotalIn();
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater9.setInput(byteArray18);
        deflater9.finish();
        long long21 = deflater9.getBytesRead();
        deflater9.reset();
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater9.setInput(byteArray29, (int) (short) 0, (int) (short) 1);
        deflater9.reset();
        deflater9.reset();
        boolean boolean35 = deflater9.finished();
        long long36 = deflater9.getBytesRead();
        int int37 = deflater9.getAdler();
        java.util.zip.Deflater deflater40 = new java.util.zip.Deflater((-1), true);
        deflater40.finish();
        deflater40.finish();
        boolean boolean43 = deflater40.finished();
        java.util.zip.Deflater deflater46 = new java.util.zip.Deflater((int) (short) -1, false);
        long long47 = deflater46.getBytesWritten();
        java.util.zip.Deflater deflater49 = new java.util.zip.Deflater((int) (byte) 1);
        deflater49.reset();
        int int51 = deflater49.getTotalIn();
        byte[] byteArray58 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater49.setInput(byteArray58);
        deflater46.setDictionary(byteArray58);
        deflater40.setInput(byteArray58);
        deflater9.setDictionary(byteArray58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int63 = deflater2.deflate(byteArray58);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        int int6 = deflater4.getAdler();
        java.util.zip.Deflater deflater8 = new java.util.zip.Deflater((int) (byte) 1);
        deflater8.reset();
        int int10 = deflater8.getTotalIn();
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater8.setInput(byteArray17);
        deflater4.setInput(byteArray17, 0, 0);
        int int22 = deflater2.deflate(byteArray17);
        deflater2.end();
        java.util.zip.Deflater deflater25 = new java.util.zip.Deflater((int) (byte) 1);
        long long26 = deflater25.getBytesWritten();
        int int27 = deflater25.getTotalIn();
        java.util.zip.Deflater deflater29 = new java.util.zip.Deflater((int) (byte) 1);
        deflater29.reset();
        int int31 = deflater29.getTotalIn();
        byte[] byteArray38 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater29.setInput(byteArray38);
        deflater29.finish();
        long long41 = deflater29.getBytesRead();
        deflater29.reset();
        java.util.zip.Deflater deflater44 = new java.util.zip.Deflater((int) (byte) 1);
        deflater44.reset();
        int int46 = deflater44.getTotalIn();
        byte[] byteArray53 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater44.setInput(byteArray53);
        deflater44.finish();
        long long56 = deflater44.getBytesRead();
        deflater44.reset();
        byte[] byteArray64 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater44.setInput(byteArray64, (int) (short) 0, (int) (short) 1);
        deflater29.setDictionary(byteArray64);
        int int69 = deflater25.deflate(byteArray64);
        deflater2.setInput(byteArray64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deflater2.reset();
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.reset();
        java.util.zip.Deflater deflater14 = new java.util.zip.Deflater((int) (byte) 1);
        deflater14.reset();
        int int16 = deflater14.getTotalIn();
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater14.setInput(byteArray23);
        deflater14.finish();
        long long26 = deflater14.getBytesRead();
        deflater14.reset();
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater14.setInput(byteArray34, (int) (short) 0, (int) (short) 1);
        deflater1.setInput(byteArray34);
        boolean boolean39 = deflater1.finished();
        long long40 = deflater1.getBytesWritten();
        deflater1.end();
        boolean boolean42 = deflater1.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long43 = deflater1.getBytesWritten();
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        deflater2.end();
        boolean boolean7 = deflater2.needsInput();
        deflater2.end();
        boolean boolean9 = deflater2.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int10 = deflater2.getTotalIn();
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        deflater1.finish();
        deflater1.reset();
        deflater1.end();
        boolean boolean8 = deflater1.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long9 = deflater1.getBytesRead();
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        deflater1.reset();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater1.setDictionary(byteArray14);
        int int17 = deflater1.getAdler();
        int int18 = deflater1.getAdler();
        deflater1.reset();
        java.util.zip.Deflater deflater21 = new java.util.zip.Deflater((int) (byte) 1);
        long long22 = deflater21.getBytesWritten();
        long long23 = deflater21.getBytesWritten();
        java.util.zip.Deflater deflater25 = new java.util.zip.Deflater((int) (byte) 1);
        deflater25.reset();
        int int27 = deflater25.getTotalIn();
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater25.setInput(byteArray34);
        deflater25.finish();
        long long37 = deflater25.getBytesRead();
        deflater25.reset();
        java.util.zip.Deflater deflater40 = new java.util.zip.Deflater((int) (byte) 1);
        deflater40.reset();
        int int42 = deflater40.getTotalIn();
        byte[] byteArray49 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater40.setInput(byteArray49);
        deflater40.finish();
        long long52 = deflater40.getBytesRead();
        deflater40.reset();
        byte[] byteArray60 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater40.setInput(byteArray60, (int) (short) 0, (int) (short) 1);
        deflater25.setDictionary(byteArray60);
        deflater21.setInput(byteArray60);
        deflater1.setInput(byteArray60);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int68 = deflater1.getTotalOut();
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        int int3 = deflater2.getTotalIn();
        int int4 = deflater2.getTotalIn();
        boolean boolean5 = deflater2.finished();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        long long8 = deflater7.getBytesWritten();
        int int9 = deflater7.getTotalIn();
        java.util.zip.Deflater deflater11 = new java.util.zip.Deflater((int) (byte) 1);
        deflater11.reset();
        int int13 = deflater11.getTotalIn();
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater11.setInput(byteArray20);
        deflater11.finish();
        long long23 = deflater11.getBytesRead();
        deflater11.reset();
        java.util.zip.Deflater deflater26 = new java.util.zip.Deflater((int) (byte) 1);
        deflater26.reset();
        int int28 = deflater26.getTotalIn();
        byte[] byteArray35 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater26.setInput(byteArray35);
        deflater26.finish();
        long long38 = deflater26.getBytesRead();
        deflater26.reset();
        byte[] byteArray46 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater26.setInput(byteArray46, (int) (short) 0, (int) (short) 1);
        deflater11.setDictionary(byteArray46);
        int int51 = deflater7.deflate(byteArray46);
        deflater2.setDictionary(byteArray46);
        int int53 = deflater2.getTotalIn();
        deflater2.finish();
        boolean boolean55 = deflater2.needsInput();
        deflater2.end();
        deflater2.setLevel(8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int59 = deflater2.getTotalIn();
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, true);
        deflater2.setLevel((-1));
        boolean boolean5 = deflater2.needsInput();
        deflater2.finish();
        deflater2.end();
        deflater2.end();
        java.util.zip.Deflater deflater11 = new java.util.zip.Deflater(0, false);
        java.util.zip.Deflater deflater13 = new java.util.zip.Deflater((int) (byte) 1);
        int int14 = deflater13.getTotalOut();
        int int15 = deflater13.getTotalOut();
        java.util.zip.Deflater deflater17 = new java.util.zip.Deflater((int) (byte) 1);
        deflater17.reset();
        int int19 = deflater17.getTotalIn();
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater17.setInput(byteArray26);
        deflater17.finish();
        long long29 = deflater17.getBytesRead();
        deflater17.reset();
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater17.setInput(byteArray37, (int) (short) 0, (int) (short) 1);
        java.util.zip.Deflater deflater43 = new java.util.zip.Deflater((int) (short) -1, false);
        java.util.zip.Deflater deflater45 = new java.util.zip.Deflater((int) (byte) 1);
        deflater45.reset();
        int int47 = deflater45.getAdler();
        java.util.zip.Deflater deflater49 = new java.util.zip.Deflater((int) (byte) 1);
        deflater49.reset();
        int int51 = deflater49.getTotalIn();
        byte[] byteArray58 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater49.setInput(byteArray58);
        deflater45.setInput(byteArray58, 0, 0);
        int int63 = deflater43.deflate(byteArray58);
        deflater17.setInput(byteArray58);
        deflater13.setDictionary(byteArray58);
        int int66 = deflater13.getAdler();
        deflater13.reset();
        deflater13.setLevel((int) (byte) -1);
        int int70 = deflater13.getTotalIn();
        java.util.zip.Deflater deflater72 = new java.util.zip.Deflater((int) (byte) 1);
        long long73 = deflater72.getBytesRead();
        java.util.zip.Deflater deflater75 = new java.util.zip.Deflater((int) (byte) 1);
        deflater75.reset();
        java.util.zip.Deflater deflater78 = new java.util.zip.Deflater((int) (byte) 1);
        deflater78.reset();
        int int80 = deflater78.getTotalIn();
        byte[] byteArray87 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater78.setInput(byteArray87);
        deflater75.setInput(byteArray87);
        deflater72.setDictionary(byteArray87);
        int int91 = deflater13.deflate(byteArray87);
        deflater11.setDictionary(byteArray87);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater2.setDictionary(byteArray87);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(1, true);
        boolean boolean3 = deflater2.needsInput();
        deflater2.reset();
        deflater2.end();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int7 = deflater2.getAdler();
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        long long6 = deflater1.getBytesWritten();
        int int7 = deflater1.getTotalOut();
        int int8 = deflater1.getAdler();
        long long9 = deflater1.getBytesWritten();
        boolean boolean10 = deflater1.finished();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long12 = deflater1.getBytesWritten();
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        long long6 = deflater1.getBytesWritten();
        int int7 = deflater1.getTotalOut();
        int int8 = deflater1.getAdler();
        deflater1.end();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long11 = deflater1.getBytesWritten();
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        int int3 = deflater2.getTotalIn();
        int int4 = deflater2.getTotalIn();
        boolean boolean5 = deflater2.finished();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        long long8 = deflater7.getBytesWritten();
        int int9 = deflater7.getTotalIn();
        java.util.zip.Deflater deflater11 = new java.util.zip.Deflater((int) (byte) 1);
        deflater11.reset();
        int int13 = deflater11.getTotalIn();
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater11.setInput(byteArray20);
        deflater11.finish();
        long long23 = deflater11.getBytesRead();
        deflater11.reset();
        java.util.zip.Deflater deflater26 = new java.util.zip.Deflater((int) (byte) 1);
        deflater26.reset();
        int int28 = deflater26.getTotalIn();
        byte[] byteArray35 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater26.setInput(byteArray35);
        deflater26.finish();
        long long38 = deflater26.getBytesRead();
        deflater26.reset();
        byte[] byteArray46 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater26.setInput(byteArray46, (int) (short) 0, (int) (short) 1);
        deflater11.setDictionary(byteArray46);
        int int51 = deflater7.deflate(byteArray46);
        deflater2.setDictionary(byteArray46);
        int int53 = deflater2.getTotalIn();
        deflater2.finish();
        boolean boolean55 = deflater2.needsInput();
        deflater2.end();
        deflater2.setStrategy(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int59 = deflater2.getTotalIn();
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        deflater1.finish();
        deflater1.reset();
        boolean boolean7 = deflater1.finished();
        deflater1.finish();
        deflater1.finish();
        long long10 = deflater1.getBytesWritten();
        int int11 = deflater1.getTotalIn();
        long long12 = deflater1.getBytesRead();
        long long13 = deflater1.getBytesWritten();
        deflater1.end();
        deflater1.finish();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater1.reset();
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) -1);
        boolean boolean2 = deflater1.finished();
        deflater1.finish();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater5.finish();
        long long17 = deflater5.getBytesRead();
        deflater5.reset();
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater5.setInput(byteArray25, (int) (short) 0, (int) (short) 1);
        deflater5.reset();
        java.util.zip.Deflater deflater31 = new java.util.zip.Deflater((int) (byte) -1);
        boolean boolean32 = deflater31.finished();
        java.util.zip.Deflater deflater34 = new java.util.zip.Deflater((int) (byte) 1);
        deflater34.reset();
        int int36 = deflater34.getTotalIn();
        byte[] byteArray43 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater34.setInput(byteArray43);
        deflater34.finish();
        long long46 = deflater34.getBytesRead();
        java.util.zip.Deflater deflater48 = new java.util.zip.Deflater((int) (byte) 1);
        deflater48.reset();
        int int50 = deflater48.getTotalIn();
        byte[] byteArray57 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater48.setInput(byteArray57);
        deflater48.finish();
        long long60 = deflater48.getBytesRead();
        deflater48.reset();
        java.util.zip.Deflater deflater63 = new java.util.zip.Deflater((int) (byte) 1);
        deflater63.reset();
        int int65 = deflater63.getTotalIn();
        byte[] byteArray72 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater63.setInput(byteArray72);
        deflater63.finish();
        long long75 = deflater63.getBytesRead();
        deflater63.reset();
        byte[] byteArray83 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater63.setInput(byteArray83, (int) (short) 0, (int) (short) 1);
        deflater48.setDictionary(byteArray83);
        int int88 = deflater34.deflate(byteArray83);
        int int91 = deflater31.deflate(byteArray83, (int) (byte) 1, 2);
        int int92 = deflater5.deflate(byteArray83);
        deflater1.setDictionary(byteArray83, 0, 1);
        deflater1.finish();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long98 = deflater1.getBytesRead();
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        deflater1.reset();
        int int15 = deflater1.getTotalIn();
        deflater1.finish();
        java.util.zip.Deflater deflater19 = new java.util.zip.Deflater(3, true);
        int int20 = deflater19.getAdler();
        deflater19.setStrategy(0);
        int int23 = deflater19.getTotalOut();
        java.util.zip.Deflater deflater25 = new java.util.zip.Deflater((int) (byte) 1);
        long long26 = deflater25.getBytesWritten();
        java.util.zip.Deflater deflater28 = new java.util.zip.Deflater((int) (byte) 1);
        deflater28.reset();
        int int30 = deflater28.getTotalIn();
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater28.setInput(byteArray37);
        deflater28.finish();
        long long40 = deflater28.getBytesRead();
        deflater28.reset();
        int int42 = deflater28.getAdler();
        boolean boolean43 = deflater28.needsInput();
        int int44 = deflater28.getTotalIn();
        int int45 = deflater28.getTotalIn();
        java.util.zip.Deflater deflater47 = new java.util.zip.Deflater((int) (byte) 1);
        deflater47.reset();
        int int49 = deflater47.getTotalIn();
        byte[] byteArray56 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater47.setInput(byteArray56);
        deflater47.finish();
        long long59 = deflater47.getBytesRead();
        deflater47.reset();
        java.util.zip.Deflater deflater62 = new java.util.zip.Deflater((int) (byte) 1);
        deflater62.reset();
        int int64 = deflater62.getTotalIn();
        byte[] byteArray71 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater62.setInput(byteArray71);
        deflater62.finish();
        long long74 = deflater62.getBytesRead();
        deflater62.reset();
        byte[] byteArray82 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater62.setInput(byteArray82, (int) (short) 0, (int) (short) 1);
        int int86 = deflater47.deflate(byteArray82);
        deflater28.setDictionary(byteArray82);
        deflater25.setInput(byteArray82);
        int int91 = deflater19.deflate(byteArray82, (int) (byte) 1, 3);
        int int92 = deflater1.deflate(byteArray82);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater1.reset();
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        long long3 = deflater1.getBytesRead();
        deflater1.end();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (short) 1, false);
        int int8 = deflater7.getAdler();
        int int9 = deflater7.getTotalIn();
        java.util.zip.Deflater deflater11 = new java.util.zip.Deflater((int) (byte) 1);
        deflater11.reset();
        int int13 = deflater11.getTotalIn();
        int int14 = deflater11.getTotalIn();
        int int15 = deflater11.getTotalIn();
        int int16 = deflater11.getTotalOut();
        java.util.zip.Deflater deflater18 = new java.util.zip.Deflater((int) (byte) 1);
        deflater18.reset();
        int int20 = deflater18.getTotalIn();
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater18.setInput(byteArray27);
        int int29 = deflater18.getAdler();
        java.util.zip.Deflater deflater32 = new java.util.zip.Deflater((int) (short) -1, false);
        int int33 = deflater32.getTotalIn();
        int int34 = deflater32.getTotalIn();
        boolean boolean35 = deflater32.finished();
        java.util.zip.Deflater deflater37 = new java.util.zip.Deflater((int) (byte) 1);
        deflater37.reset();
        int int39 = deflater37.getAdler();
        java.util.zip.Deflater deflater41 = new java.util.zip.Deflater((int) (byte) 1);
        deflater41.reset();
        int int43 = deflater41.getTotalIn();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater41.setInput(byteArray50);
        deflater37.setInput(byteArray50, 0, 0);
        int int55 = deflater32.deflate(byteArray50);
        int int58 = deflater18.deflate(byteArray50, 0, (int) (short) 0);
        deflater11.setInput(byteArray50, 0, 2);
        deflater7.setDictionary(byteArray50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int63 = deflater1.deflate(byteArray50);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        int int6 = deflater4.getAdler();
        java.util.zip.Deflater deflater8 = new java.util.zip.Deflater((int) (byte) 1);
        deflater8.reset();
        int int10 = deflater8.getTotalIn();
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater8.setInput(byteArray17);
        deflater4.setInput(byteArray17, 0, 0);
        int int22 = deflater2.deflate(byteArray17);
        deflater2.end();
        java.util.zip.Deflater deflater25 = new java.util.zip.Deflater((int) (byte) 1);
        long long26 = deflater25.getBytesWritten();
        int int27 = deflater25.getTotalIn();
        java.util.zip.Deflater deflater29 = new java.util.zip.Deflater((int) (byte) 1);
        deflater29.reset();
        int int31 = deflater29.getTotalIn();
        byte[] byteArray38 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater29.setInput(byteArray38);
        deflater29.finish();
        long long41 = deflater29.getBytesRead();
        deflater29.reset();
        java.util.zip.Deflater deflater44 = new java.util.zip.Deflater((int) (byte) 1);
        deflater44.reset();
        int int46 = deflater44.getTotalIn();
        byte[] byteArray53 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater44.setInput(byteArray53);
        deflater44.finish();
        long long56 = deflater44.getBytesRead();
        deflater44.reset();
        byte[] byteArray64 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater44.setInput(byteArray64, (int) (short) 0, (int) (short) 1);
        deflater29.setDictionary(byteArray64);
        int int69 = deflater25.deflate(byteArray64);
        deflater2.setInput(byteArray64);
        boolean boolean71 = deflater2.finished();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int72 = deflater2.getAdler();
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater7.setInput(byteArray16);
        deflater4.setInput(byteArray16);
        deflater2.setInput(byteArray16);
        java.util.zip.Deflater deflater22 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater24 = new java.util.zip.Deflater((int) (byte) 1);
        deflater24.reset();
        java.util.zip.Deflater deflater27 = new java.util.zip.Deflater((int) (byte) 1);
        deflater27.reset();
        int int29 = deflater27.getTotalIn();
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater27.setInput(byteArray36);
        deflater24.setInput(byteArray36);
        deflater22.setInput(byteArray36);
        deflater22.setStrategy(0);
        boolean boolean42 = deflater22.needsInput();
        java.util.zip.Deflater deflater45 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater47 = new java.util.zip.Deflater((int) (byte) 1);
        deflater47.reset();
        java.util.zip.Deflater deflater50 = new java.util.zip.Deflater((int) (byte) 1);
        deflater50.reset();
        int int52 = deflater50.getTotalIn();
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater50.setInput(byteArray59);
        deflater47.setInput(byteArray59);
        deflater45.setInput(byteArray59);
        deflater22.setInput(byteArray59);
        java.util.zip.Deflater deflater65 = new java.util.zip.Deflater((int) (byte) 1);
        deflater65.reset();
        int int67 = deflater65.getTotalIn();
        byte[] byteArray74 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater65.setInput(byteArray74);
        deflater65.finish();
        long long77 = deflater65.getBytesRead();
        deflater65.reset();
        byte[] byteArray85 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater65.setInput(byteArray85, (int) (short) 0, (int) (short) 1);
        deflater22.setInput(byteArray85);
        int int90 = deflater2.deflate(byteArray85);
        long long91 = deflater2.getBytesRead();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int93 = deflater2.getAdler();
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater(0);
        long long2 = deflater1.getBytesWritten();
        deflater1.finish();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int5 = deflater1.getTotalOut();
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        deflater1.reset();
        boolean boolean5 = deflater1.finished();
        deflater1.end();
        deflater1.setLevel((-1));
        deflater1.end();
        deflater1.end();
        deflater1.finish();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long12 = deflater1.getBytesWritten();
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(6, false);
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long4 = deflater2.getBytesRead();
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater(0);
        long long2 = deflater1.getBytesWritten();
        long long3 = deflater1.getBytesWritten();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int5 = deflater1.getTotalIn();
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        int int3 = deflater1.getTotalOut();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater5.finish();
        long long17 = deflater5.getBytesRead();
        deflater5.reset();
        java.util.zip.Deflater deflater20 = new java.util.zip.Deflater((int) (byte) 1);
        deflater20.reset();
        int int22 = deflater20.getTotalIn();
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater20.setInput(byteArray29);
        deflater20.finish();
        long long32 = deflater20.getBytesRead();
        deflater20.reset();
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater20.setInput(byteArray40, (int) (short) 0, (int) (short) 1);
        deflater5.setDictionary(byteArray40);
        deflater1.setDictionary(byteArray40);
        deflater1.end();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int48 = deflater1.getTotalOut();
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        java.util.zip.Deflater deflater15 = new java.util.zip.Deflater((int) (byte) 1);
        deflater15.reset();
        int int17 = deflater15.getTotalIn();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater15.setInput(byteArray24);
        deflater15.finish();
        long long27 = deflater15.getBytesRead();
        deflater15.reset();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getTotalIn();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater30.setInput(byteArray39);
        deflater30.finish();
        long long42 = deflater30.getBytesRead();
        deflater30.reset();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater30.setInput(byteArray50, (int) (short) 0, (int) (short) 1);
        deflater15.setDictionary(byteArray50);
        int int55 = deflater1.deflate(byteArray50);
        boolean boolean56 = deflater1.finished();
        int int57 = deflater1.getTotalIn();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int59 = deflater1.getTotalOut();
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, true);
        deflater2.setLevel((-1));
        boolean boolean5 = deflater2.needsInput();
        deflater2.finish();
        deflater2.end();
        deflater2.end();
        java.util.zip.Deflater deflater10 = new java.util.zip.Deflater((int) (byte) 1);
        deflater10.reset();
        int int12 = deflater10.getTotalIn();
        int int13 = deflater10.getTotalIn();
        int int14 = deflater10.getTotalIn();
        int int15 = deflater10.getTotalOut();
        java.util.zip.Deflater deflater18 = new java.util.zip.Deflater(2, false);
        java.util.zip.Deflater deflater20 = new java.util.zip.Deflater((int) (byte) 1);
        deflater20.reset();
        int int22 = deflater20.getTotalIn();
        int int23 = deflater20.getTotalIn();
        deflater20.finish();
        deflater20.reset();
        java.util.zip.Deflater deflater27 = new java.util.zip.Deflater((int) (byte) 1);
        deflater27.reset();
        int int29 = deflater27.getTotalIn();
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater27.setInput(byteArray36);
        deflater20.setInput(byteArray36);
        deflater20.finish();
        int int40 = deflater20.getAdler();
        int int41 = deflater20.getTotalIn();
        java.util.zip.Deflater deflater44 = new java.util.zip.Deflater((-1), true);
        long long45 = deflater44.getBytesWritten();
        deflater44.setLevel(2);
        java.util.zip.Deflater deflater49 = new java.util.zip.Deflater((int) (byte) 1);
        deflater49.reset();
        int int51 = deflater49.getTotalIn();
        byte[] byteArray58 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater49.setInput(byteArray58);
        deflater49.finish();
        long long61 = deflater49.getBytesRead();
        deflater49.reset();
        java.util.zip.Deflater deflater64 = new java.util.zip.Deflater((int) (byte) 1);
        deflater64.reset();
        int int66 = deflater64.getTotalIn();
        byte[] byteArray73 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater64.setInput(byteArray73);
        deflater64.finish();
        long long76 = deflater64.getBytesRead();
        deflater64.reset();
        byte[] byteArray84 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater64.setInput(byteArray84, (int) (short) 0, (int) (short) 1);
        deflater49.setDictionary(byteArray84);
        deflater44.setInput(byteArray84);
        deflater20.setDictionary(byteArray84);
        deflater18.setInput(byteArray84);
        int int92 = deflater10.deflate(byteArray84);
        deflater2.setInput(byteArray84, 0, (int) (byte) 1);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long96 = deflater2.getBytesWritten();
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(3, true);
        deflater2.reset();
        deflater2.end();
        deflater2.finish();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long6 = deflater2.getBytesWritten();
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        java.util.zip.Deflater deflater0 = new java.util.zip.Deflater();
        deflater0.end();
        deflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater0.reset();
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        long long6 = deflater1.getBytesWritten();
        int int7 = deflater1.getTotalOut();
        long long8 = deflater1.getBytesWritten();
        java.util.zip.Deflater deflater11 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater13 = new java.util.zip.Deflater((int) (byte) 1);
        deflater13.reset();
        java.util.zip.Deflater deflater16 = new java.util.zip.Deflater((int) (byte) 1);
        deflater16.reset();
        int int18 = deflater16.getTotalIn();
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater16.setInput(byteArray25);
        deflater13.setInput(byteArray25);
        deflater11.setInput(byteArray25);
        int int29 = deflater1.deflate(byteArray25);
        boolean boolean30 = deflater1.finished();
        int int31 = deflater1.getTotalIn();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long33 = deflater1.getBytesWritten();
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        long long6 = deflater1.getBytesWritten();
        int int7 = deflater1.getTotalOut();
        int int8 = deflater1.getAdler();
        deflater1.end();
        java.util.zip.Deflater deflater12 = new java.util.zip.Deflater((int) (short) -1, false);
        deflater12.finish();
        boolean boolean14 = deflater12.finished();
        deflater12.setLevel(8);
        java.util.zip.Deflater deflater18 = new java.util.zip.Deflater((int) (byte) 1);
        deflater18.reset();
        int int20 = deflater18.getTotalIn();
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater18.setInput(byteArray27);
        deflater18.finish();
        long long30 = deflater18.getBytesRead();
        deflater18.reset();
        int int32 = deflater18.getTotalIn();
        deflater18.finish();
        java.util.zip.Deflater deflater36 = new java.util.zip.Deflater(3, true);
        int int37 = deflater36.getAdler();
        java.util.zip.Deflater deflater40 = new java.util.zip.Deflater((-1), true);
        long long41 = deflater40.getBytesWritten();
        deflater40.setLevel(2);
        java.util.zip.Deflater deflater45 = new java.util.zip.Deflater((int) (byte) 1);
        deflater45.reset();
        int int47 = deflater45.getTotalIn();
        byte[] byteArray54 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater45.setInput(byteArray54);
        deflater45.finish();
        long long57 = deflater45.getBytesRead();
        deflater45.reset();
        java.util.zip.Deflater deflater60 = new java.util.zip.Deflater((int) (byte) 1);
        deflater60.reset();
        int int62 = deflater60.getTotalIn();
        byte[] byteArray69 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater60.setInput(byteArray69);
        deflater60.finish();
        long long72 = deflater60.getBytesRead();
        deflater60.reset();
        byte[] byteArray80 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater60.setInput(byteArray80, (int) (short) 0, (int) (short) 1);
        deflater45.setDictionary(byteArray80);
        deflater40.setInput(byteArray80);
        deflater36.setDictionary(byteArray80);
        deflater18.setInput(byteArray80);
        deflater12.setInput(byteArray80, 0, 3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deflater1.setDictionary(byteArray80);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        long long3 = deflater1.getBytesWritten();
        deflater1.setLevel((int) (byte) 0);
        deflater1.reset();
        int int7 = deflater1.getTotalIn();
        int int8 = deflater1.getTotalIn();
        int int9 = deflater1.getTotalOut();
        deflater1.setStrategy((int) (short) 0);
        deflater1.end();
        deflater1.setLevel((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deflater1.reset();
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        deflater1.reset();
        java.util.zip.Deflater deflater17 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater19 = new java.util.zip.Deflater((int) (byte) 1);
        deflater19.reset();
        java.util.zip.Deflater deflater22 = new java.util.zip.Deflater((int) (byte) 1);
        deflater22.reset();
        int int24 = deflater22.getTotalIn();
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater22.setInput(byteArray31);
        deflater19.setInput(byteArray31);
        deflater17.setInput(byteArray31);
        deflater17.setStrategy(0);
        boolean boolean37 = deflater17.needsInput();
        java.util.zip.Deflater deflater40 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater42 = new java.util.zip.Deflater((int) (byte) 1);
        deflater42.reset();
        java.util.zip.Deflater deflater45 = new java.util.zip.Deflater((int) (byte) 1);
        deflater45.reset();
        int int47 = deflater45.getTotalIn();
        byte[] byteArray54 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater45.setInput(byteArray54);
        deflater42.setInput(byteArray54);
        deflater40.setInput(byteArray54);
        deflater17.setInput(byteArray54);
        deflater1.setDictionary(byteArray54);
        int int60 = deflater1.getTotalOut();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long62 = deflater1.getBytesRead();
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        long long3 = deflater1.getBytesWritten();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater5.finish();
        long long17 = deflater5.getBytesRead();
        deflater5.reset();
        java.util.zip.Deflater deflater20 = new java.util.zip.Deflater((int) (byte) 1);
        deflater20.reset();
        int int22 = deflater20.getTotalIn();
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater20.setInput(byteArray29);
        deflater20.finish();
        long long32 = deflater20.getBytesRead();
        deflater20.reset();
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater20.setInput(byteArray40, (int) (short) 0, (int) (short) 1);
        deflater5.setDictionary(byteArray40);
        deflater1.setInput(byteArray40);
        int int46 = deflater1.getTotalIn();
        deflater1.end();
        java.util.zip.Deflater deflater49 = new java.util.zip.Deflater((int) (byte) 1);
        deflater49.reset();
        int int51 = deflater49.getTotalIn();
        deflater49.finish();
        int int53 = deflater49.getTotalIn();
        int int54 = deflater49.getAdler();
        boolean boolean55 = deflater49.finished();
        java.util.zip.Deflater deflater57 = new java.util.zip.Deflater((int) (byte) 1);
        deflater57.reset();
        deflater57.reset();
        java.util.zip.Deflater deflater61 = new java.util.zip.Deflater((int) (byte) 1);
        deflater61.reset();
        int int63 = deflater61.getTotalIn();
        byte[] byteArray70 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater61.setInput(byteArray70);
        deflater57.setDictionary(byteArray70);
        int int73 = deflater49.deflate(byteArray70);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deflater1.setDictionary(byteArray70);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(3, true);
        deflater2.reset();
        deflater2.end();
        deflater2.finish();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater7.setInput(byteArray16);
        deflater7.finish();
        long long19 = deflater7.getBytesRead();
        java.util.zip.Deflater deflater21 = new java.util.zip.Deflater((int) (byte) 1);
        deflater21.reset();
        int int23 = deflater21.getTotalIn();
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater21.setInput(byteArray30);
        deflater21.finish();
        long long33 = deflater21.getBytesRead();
        deflater21.reset();
        java.util.zip.Deflater deflater36 = new java.util.zip.Deflater((int) (byte) 1);
        deflater36.reset();
        int int38 = deflater36.getTotalIn();
        byte[] byteArray45 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater36.setInput(byteArray45);
        deflater36.finish();
        long long48 = deflater36.getBytesRead();
        deflater36.reset();
        byte[] byteArray56 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater36.setInput(byteArray56, (int) (short) 0, (int) (short) 1);
        deflater21.setDictionary(byteArray56);
        int int61 = deflater7.deflate(byteArray56);
        boolean boolean62 = deflater7.finished();
        int int63 = deflater7.getTotalIn();
        int int64 = deflater7.getTotalIn();
        java.util.zip.Deflater deflater66 = new java.util.zip.Deflater((int) (byte) 1);
        deflater66.reset();
        int int68 = deflater66.getTotalIn();
        byte[] byteArray75 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater66.setInput(byteArray75);
        deflater66.finish();
        long long78 = deflater66.getBytesRead();
        deflater66.reset();
        byte[] byteArray86 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater66.setInput(byteArray86, (int) (short) 0, (int) (short) 1);
        int int90 = deflater7.deflate(byteArray86);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int91 = deflater2.deflate(byteArray86);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater(0);
        long long2 = deflater1.getBytesWritten();
        deflater1.finish();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int5 = deflater1.getTotalIn();
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        deflater1.reset();
        int int15 = deflater1.getAdler();
        boolean boolean16 = deflater1.needsInput();
        java.util.zip.Deflater deflater18 = new java.util.zip.Deflater((int) (byte) 1);
        deflater18.reset();
        int int20 = deflater18.getTotalIn();
        java.util.zip.Deflater deflater22 = new java.util.zip.Deflater((int) (byte) 1);
        deflater22.reset();
        int int24 = deflater22.getTotalIn();
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater22.setInput(byteArray31);
        deflater22.finish();
        long long34 = deflater22.getBytesRead();
        deflater22.reset();
        java.util.zip.Deflater deflater38 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater40 = new java.util.zip.Deflater((int) (byte) 1);
        deflater40.reset();
        java.util.zip.Deflater deflater43 = new java.util.zip.Deflater((int) (byte) 1);
        deflater43.reset();
        int int45 = deflater43.getTotalIn();
        byte[] byteArray52 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater43.setInput(byteArray52);
        deflater40.setInput(byteArray52);
        deflater38.setInput(byteArray52);
        deflater38.setStrategy(0);
        boolean boolean58 = deflater38.needsInput();
        java.util.zip.Deflater deflater61 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater63 = new java.util.zip.Deflater((int) (byte) 1);
        deflater63.reset();
        java.util.zip.Deflater deflater66 = new java.util.zip.Deflater((int) (byte) 1);
        deflater66.reset();
        int int68 = deflater66.getTotalIn();
        byte[] byteArray75 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater66.setInput(byteArray75);
        deflater63.setInput(byteArray75);
        deflater61.setInput(byteArray75);
        deflater38.setInput(byteArray75);
        deflater22.setDictionary(byteArray75);
        int int81 = deflater18.deflate(byteArray75);
        int int82 = deflater1.deflate(byteArray75);
        long long83 = deflater1.getBytesRead();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long85 = deflater1.getBytesWritten();
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getAdler();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater5.setInput(byteArray14);
        deflater1.setInput(byteArray14, 0, 0);
        long long19 = deflater1.getBytesRead();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int21 = deflater1.getTotalIn();
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        deflater1.reset();
        boolean boolean5 = deflater1.finished();
        int int6 = deflater1.getTotalOut();
        java.util.zip.Deflater deflater8 = new java.util.zip.Deflater((int) (byte) 1);
        deflater8.reset();
        int int10 = deflater8.getAdler();
        java.util.zip.Deflater deflater12 = new java.util.zip.Deflater((int) (byte) 1);
        deflater12.reset();
        int int14 = deflater12.getTotalIn();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater12.setInput(byteArray21);
        deflater8.setInput(byteArray21);
        int int26 = deflater1.deflate(byteArray21, 0, 0);
        deflater1.end();
        deflater1.finish();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long29 = deflater1.getBytesWritten();
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        int int6 = deflater4.getTotalIn();
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater4.setInput(byteArray13);
        deflater4.finish();
        long long16 = deflater4.getBytesRead();
        deflater4.reset();
        java.util.zip.Deflater deflater19 = new java.util.zip.Deflater((int) (byte) 1);
        deflater19.reset();
        int int21 = deflater19.getTotalIn();
        byte[] byteArray28 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater19.setInput(byteArray28);
        deflater19.finish();
        long long31 = deflater19.getBytesRead();
        deflater19.reset();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater19.setInput(byteArray39, (int) (short) 0, (int) (short) 1);
        deflater4.setDictionary(byteArray39);
        deflater1.setInput(byteArray39);
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long46 = deflater1.getBytesWritten();
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        deflater1.reset();
        int int15 = deflater1.getAdler();
        boolean boolean16 = deflater1.needsInput();
        int int17 = deflater1.getTotalIn();
        int int18 = deflater1.getTotalIn();
        deflater1.reset();
        long long20 = deflater1.getBytesRead();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long22 = deflater1.getBytesRead();
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long4 = deflater1.getBytesWritten();
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, true);
        deflater2.setLevel((-1));
        boolean boolean5 = deflater2.needsInput();
        deflater2.finish();
        deflater2.end();
        java.util.zip.Deflater deflater9 = new java.util.zip.Deflater((int) (byte) 1);
        deflater9.reset();
        int int11 = deflater9.getTotalIn();
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater9.setInput(byteArray18);
        deflater9.finish();
        boolean boolean21 = deflater9.finished();
        long long22 = deflater9.getBytesWritten();
        java.util.zip.Deflater deflater24 = new java.util.zip.Deflater((int) (byte) 1);
        deflater24.reset();
        int int26 = deflater24.getTotalIn();
        int int27 = deflater24.getTotalIn();
        deflater24.finish();
        deflater24.reset();
        boolean boolean30 = deflater24.finished();
        deflater24.reset();
        java.util.zip.Deflater deflater34 = new java.util.zip.Deflater((int) (short) -1, false);
        int int35 = deflater34.getTotalIn();
        int int36 = deflater34.getTotalIn();
        boolean boolean37 = deflater34.finished();
        java.util.zip.Deflater deflater39 = new java.util.zip.Deflater((int) (byte) 1);
        deflater39.reset();
        int int41 = deflater39.getAdler();
        java.util.zip.Deflater deflater43 = new java.util.zip.Deflater((int) (byte) 1);
        deflater43.reset();
        int int45 = deflater43.getTotalIn();
        byte[] byteArray52 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater43.setInput(byteArray52);
        deflater39.setInput(byteArray52, 0, 0);
        int int57 = deflater34.deflate(byteArray52);
        deflater24.setDictionary(byteArray52);
        int int59 = deflater9.deflate(byteArray52);
        deflater2.setInput(byteArray52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int61 = deflater2.getTotalIn();
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        deflater1.setLevel((int) (short) 1);
        boolean boolean8 = deflater1.needsInput();
        int int9 = deflater1.getTotalIn();
        int int10 = deflater1.getTotalIn();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int12 = deflater1.getAdler();
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) 0, true);
        boolean boolean3 = deflater2.needsInput();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        int int8 = deflater5.getTotalIn();
        java.util.zip.Deflater deflater11 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater13 = new java.util.zip.Deflater((int) (byte) 1);
        deflater13.reset();
        java.util.zip.Deflater deflater16 = new java.util.zip.Deflater((int) (byte) 1);
        deflater16.reset();
        int int18 = deflater16.getTotalIn();
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater16.setInput(byteArray25);
        deflater13.setInput(byteArray25);
        deflater11.setInput(byteArray25);
        deflater11.setStrategy(0);
        boolean boolean31 = deflater11.needsInput();
        java.util.zip.Deflater deflater34 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater36 = new java.util.zip.Deflater((int) (byte) 1);
        deflater36.reset();
        java.util.zip.Deflater deflater39 = new java.util.zip.Deflater((int) (byte) 1);
        deflater39.reset();
        int int41 = deflater39.getTotalIn();
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater39.setInput(byteArray48);
        deflater36.setInput(byteArray48);
        deflater34.setInput(byteArray48);
        deflater11.setInput(byteArray48);
        java.util.zip.Deflater deflater54 = new java.util.zip.Deflater((int) (byte) 1);
        deflater54.reset();
        int int56 = deflater54.getTotalIn();
        byte[] byteArray63 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater54.setInput(byteArray63);
        deflater54.finish();
        long long66 = deflater54.getBytesRead();
        deflater54.reset();
        byte[] byteArray74 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater54.setInput(byteArray74, (int) (short) 0, (int) (short) 1);
        deflater11.setInput(byteArray74);
        int int79 = deflater5.deflate(byteArray74);
        deflater2.setInput(byteArray74);
        long long81 = deflater2.getBytesRead();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long83 = deflater2.getBytesRead();
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        int int6 = deflater4.getAdler();
        java.util.zip.Deflater deflater8 = new java.util.zip.Deflater((int) (byte) 1);
        deflater8.reset();
        int int10 = deflater8.getTotalIn();
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater8.setInput(byteArray17);
        deflater4.setInput(byteArray17, 0, 0);
        int int22 = deflater2.deflate(byteArray17);
        deflater2.reset();
        boolean boolean24 = deflater2.needsInput();
        long long25 = deflater2.getBytesWritten();
        deflater2.end();
        boolean boolean27 = deflater2.finished();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((-1), true);
        deflater30.finish();
        deflater30.finish();
        boolean boolean33 = deflater30.finished();
        deflater30.finish();
        java.util.zip.Deflater deflater35 = new java.util.zip.Deflater();
        deflater35.reset();
        long long37 = deflater35.getBytesWritten();
        int int38 = deflater35.getTotalIn();
        byte[] byteArray41 = new byte[] { (byte) 0, (byte) 1 };
        deflater35.setInput(byteArray41);
        deflater30.setInput(byteArray41);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater2.setDictionary(byteArray41);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        java.util.zip.Deflater deflater15 = new java.util.zip.Deflater((int) (byte) 1);
        deflater15.reset();
        int int17 = deflater15.getTotalIn();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater15.setInput(byteArray24);
        deflater15.finish();
        long long27 = deflater15.getBytesRead();
        deflater15.reset();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getTotalIn();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater30.setInput(byteArray39);
        deflater30.finish();
        long long42 = deflater30.getBytesRead();
        deflater30.reset();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater30.setInput(byteArray50, (int) (short) 0, (int) (short) 1);
        deflater15.setDictionary(byteArray50);
        int int55 = deflater1.deflate(byteArray50);
        boolean boolean56 = deflater1.finished();
        int int57 = deflater1.getTotalIn();
        deflater1.finish();
        int int59 = deflater1.getTotalOut();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long61 = deflater1.getBytesRead();
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getAdler();
        boolean boolean4 = deflater1.needsInput();
        long long5 = deflater1.getBytesRead();
        int int6 = deflater1.getAdler();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int8 = deflater1.getTotalIn();
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        int int2 = deflater1.getTotalOut();
        int int3 = deflater1.getTotalOut();
        long long4 = deflater1.getBytesWritten();
        deflater1.end();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        deflater7.finish();
        int int11 = deflater7.getTotalOut();
        boolean boolean12 = deflater7.needsInput();
        long long13 = deflater7.getBytesRead();
        long long14 = deflater7.getBytesWritten();
        boolean boolean15 = deflater7.finished();
        deflater7.reset();
        java.util.zip.Deflater deflater18 = new java.util.zip.Deflater((int) (byte) 1);
        deflater18.reset();
        int int20 = deflater18.getTotalIn();
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater18.setInput(byteArray27);
        deflater18.finish();
        long long30 = deflater18.getBytesRead();
        deflater18.reset();
        byte[] byteArray38 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater18.setInput(byteArray38, (int) (short) 0, (int) (short) 1);
        deflater18.reset();
        deflater18.reset();
        java.util.zip.Deflater deflater45 = new java.util.zip.Deflater((int) (byte) 1);
        long long46 = deflater45.getBytesWritten();
        int int47 = deflater45.getTotalOut();
        long long48 = deflater45.getBytesWritten();
        java.util.zip.Deflater deflater50 = new java.util.zip.Deflater((int) (byte) 1);
        deflater50.reset();
        deflater50.reset();
        java.util.zip.Deflater deflater54 = new java.util.zip.Deflater((int) (byte) 1);
        deflater54.reset();
        int int56 = deflater54.getTotalIn();
        byte[] byteArray63 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater54.setInput(byteArray63);
        deflater50.setDictionary(byteArray63);
        deflater45.setDictionary(byteArray63);
        deflater18.setInput(byteArray63);
        deflater7.setDictionary(byteArray63, 1, 3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deflater1.setDictionary(byteArray63);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater7.setInput(byteArray16);
        deflater4.setInput(byteArray16);
        deflater2.setInput(byteArray16);
        deflater2.setStrategy(0);
        boolean boolean22 = deflater2.needsInput();
        deflater2.finish();
        deflater2.reset();
        long long25 = deflater2.getBytesRead();
        deflater2.reset();
        boolean boolean27 = deflater2.finished();
        deflater2.end();
        boolean boolean29 = deflater2.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int30 = deflater2.getAdler();
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(3, true);
        int int3 = deflater2.getAdler();
        deflater2.setStrategy(0);
        java.util.zip.Deflater deflater8 = new java.util.zip.Deflater((int) (byte) 0, false);
        boolean boolean9 = deflater8.needsInput();
        java.util.zip.Deflater deflater12 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater14 = new java.util.zip.Deflater((int) (byte) 1);
        deflater14.reset();
        java.util.zip.Deflater deflater17 = new java.util.zip.Deflater((int) (byte) 1);
        deflater17.reset();
        int int19 = deflater17.getTotalIn();
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater17.setInput(byteArray26);
        deflater14.setInput(byteArray26);
        deflater12.setInput(byteArray26);
        deflater12.setStrategy(0);
        boolean boolean32 = deflater12.needsInput();
        java.util.zip.Deflater deflater35 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater37 = new java.util.zip.Deflater((int) (byte) 1);
        deflater37.reset();
        java.util.zip.Deflater deflater40 = new java.util.zip.Deflater((int) (byte) 1);
        deflater40.reset();
        int int42 = deflater40.getTotalIn();
        byte[] byteArray49 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater40.setInput(byteArray49);
        deflater37.setInput(byteArray49);
        deflater35.setInput(byteArray49);
        deflater12.setInput(byteArray49);
        java.util.zip.Deflater deflater55 = new java.util.zip.Deflater((int) (byte) 1);
        deflater55.reset();
        int int57 = deflater55.getTotalIn();
        byte[] byteArray64 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater55.setInput(byteArray64);
        deflater55.finish();
        long long67 = deflater55.getBytesRead();
        deflater55.reset();
        byte[] byteArray75 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater55.setInput(byteArray75, (int) (short) 0, (int) (short) 1);
        deflater12.setInput(byteArray75);
        int int80 = deflater8.deflate(byteArray75);
        deflater2.setInput(byteArray75, 2, 0);
        boolean boolean84 = deflater2.needsInput();
        long long85 = deflater2.getBytesWritten();
        deflater2.end();
        deflater2.finish();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long88 = deflater2.getBytesRead();
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(3, true);
        deflater2.reset();
        deflater2.setStrategy(0);
        deflater2.end();
        boolean boolean7 = deflater2.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int8 = deflater2.getTotalIn();
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        deflater1.finish();
        int int6 = deflater1.getTotalOut();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long8 = deflater1.getBytesRead();
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        int int3 = deflater2.getTotalIn();
        int int4 = deflater2.getTotalIn();
        boolean boolean5 = deflater2.finished();
        deflater2.end();
        deflater2.setLevel((int) (short) -1);
        deflater2.end();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long11 = deflater2.getBytesRead();
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(3, true);
        deflater2.reset();
        deflater2.end();
        deflater2.finish();
        boolean boolean6 = deflater2.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int7 = deflater2.getTotalIn();
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        int int12 = deflater1.getAdler();
        boolean boolean13 = deflater1.needsInput();
        long long14 = deflater1.getBytesWritten();
        deflater1.finish();
        deflater1.reset();
        deflater1.end();
        java.util.zip.Deflater deflater20 = new java.util.zip.Deflater((int) (short) -1, false);
        long long21 = deflater20.getBytesWritten();
        java.util.zip.Deflater deflater23 = new java.util.zip.Deflater((int) (byte) 1);
        deflater23.reset();
        int int25 = deflater23.getTotalIn();
        byte[] byteArray32 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater23.setInput(byteArray32);
        deflater20.setDictionary(byteArray32);
        int int35 = deflater20.getTotalOut();
        boolean boolean36 = deflater20.needsInput();
        java.util.zip.Deflater deflater39 = new java.util.zip.Deflater((-1), true);
        deflater39.finish();
        deflater39.finish();
        boolean boolean42 = deflater39.finished();
        deflater39.finish();
        java.util.zip.Deflater deflater44 = new java.util.zip.Deflater();
        deflater44.reset();
        long long46 = deflater44.getBytesWritten();
        int int47 = deflater44.getTotalIn();
        byte[] byteArray50 = new byte[] { (byte) 0, (byte) 1 };
        deflater44.setInput(byteArray50);
        deflater39.setInput(byteArray50);
        deflater20.setDictionary(byteArray50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int54 = deflater1.deflate(byteArray50);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        java.util.zip.Deflater deflater16 = new java.util.zip.Deflater((-1), true);
        long long17 = deflater16.getBytesWritten();
        deflater16.setLevel(2);
        java.util.zip.Deflater deflater21 = new java.util.zip.Deflater((int) (byte) 1);
        deflater21.reset();
        int int23 = deflater21.getTotalIn();
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater21.setInput(byteArray30);
        deflater21.finish();
        long long33 = deflater21.getBytesRead();
        deflater21.reset();
        java.util.zip.Deflater deflater36 = new java.util.zip.Deflater((int) (byte) 1);
        deflater36.reset();
        int int38 = deflater36.getTotalIn();
        byte[] byteArray45 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater36.setInput(byteArray45);
        deflater36.finish();
        long long48 = deflater36.getBytesRead();
        deflater36.reset();
        byte[] byteArray56 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater36.setInput(byteArray56, (int) (short) 0, (int) (short) 1);
        deflater21.setDictionary(byteArray56);
        deflater16.setInput(byteArray56);
        deflater1.setInput(byteArray56, 3, 1);
        deflater1.reset();
        deflater1.reset();
        long long67 = deflater1.getBytesRead();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long69 = deflater1.getBytesWritten();
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        deflater1.finish();
        deflater1.reset();
        java.util.zip.Deflater deflater8 = new java.util.zip.Deflater((int) (byte) 1);
        deflater8.reset();
        int int10 = deflater8.getTotalIn();
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater8.setInput(byteArray17);
        deflater1.setInput(byteArray17);
        deflater1.finish();
        int int21 = deflater1.getAdler();
        long long22 = deflater1.getBytesWritten();
        deflater1.finish();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int25 = deflater1.getTotalOut();
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        deflater2.setLevel(2);
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater7.setInput(byteArray16);
        deflater7.finish();
        long long19 = deflater7.getBytesRead();
        deflater7.reset();
        java.util.zip.Deflater deflater22 = new java.util.zip.Deflater((int) (byte) 1);
        deflater22.reset();
        int int24 = deflater22.getTotalIn();
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater22.setInput(byteArray31);
        deflater22.finish();
        long long34 = deflater22.getBytesRead();
        deflater22.reset();
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater22.setInput(byteArray42, (int) (short) 0, (int) (short) 1);
        deflater7.setDictionary(byteArray42);
        deflater2.setInput(byteArray42);
        int int48 = deflater2.getTotalIn();
        boolean boolean49 = deflater2.needsInput();
        deflater2.end();
        deflater2.finish();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int53 = deflater2.getTotalIn();
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.reset();
        java.util.zip.Deflater deflater14 = new java.util.zip.Deflater((int) (byte) 1);
        deflater14.reset();
        int int16 = deflater14.getTotalIn();
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater14.setInput(byteArray23);
        deflater14.finish();
        long long26 = deflater14.getBytesRead();
        deflater14.reset();
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater14.setInput(byteArray34, (int) (short) 0, (int) (short) 1);
        deflater1.setInput(byteArray34);
        boolean boolean39 = deflater1.finished();
        long long40 = deflater1.getBytesRead();
        deflater1.setStrategy(0);
        boolean boolean43 = deflater1.finished();
        int int44 = deflater1.getTotalOut();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int46 = deflater1.getAdler();
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        long long3 = deflater1.getBytesWritten();
        deflater1.setLevel((int) (byte) 0);
        deflater1.reset();
        int int7 = deflater1.getTotalIn();
        deflater1.setLevel(1);
        long long10 = deflater1.getBytesRead();
        deflater1.end();
        deflater1.finish();
        java.util.zip.Deflater deflater15 = new java.util.zip.Deflater((-1), true);
        long long16 = deflater15.getBytesWritten();
        deflater15.setLevel(2);
        java.util.zip.Deflater deflater19 = new java.util.zip.Deflater();
        deflater19.reset();
        long long21 = deflater19.getBytesWritten();
        int int22 = deflater19.getTotalIn();
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 1 };
        deflater19.setInput(byteArray25);
        java.util.zip.Deflater deflater29 = new java.util.zip.Deflater((-1), true);
        long long30 = deflater29.getBytesWritten();
        deflater29.setLevel(2);
        java.util.zip.Deflater deflater34 = new java.util.zip.Deflater((int) (byte) 1);
        deflater34.reset();
        int int36 = deflater34.getTotalIn();
        byte[] byteArray43 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater34.setInput(byteArray43);
        deflater34.finish();
        long long46 = deflater34.getBytesRead();
        deflater34.reset();
        java.util.zip.Deflater deflater49 = new java.util.zip.Deflater((int) (byte) 1);
        deflater49.reset();
        int int51 = deflater49.getTotalIn();
        byte[] byteArray58 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater49.setInput(byteArray58);
        deflater49.finish();
        long long61 = deflater49.getBytesRead();
        deflater49.reset();
        byte[] byteArray69 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater49.setInput(byteArray69, (int) (short) 0, (int) (short) 1);
        deflater34.setDictionary(byteArray69);
        deflater29.setInput(byteArray69);
        long long75 = deflater29.getBytesRead();
        java.util.zip.Deflater deflater77 = new java.util.zip.Deflater((int) (byte) 1);
        deflater77.reset();
        deflater77.reset();
        java.util.zip.Deflater deflater81 = new java.util.zip.Deflater((int) (byte) 1);
        deflater81.reset();
        int int83 = deflater81.getTotalIn();
        byte[] byteArray90 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater81.setInput(byteArray90);
        deflater77.setDictionary(byteArray90);
        deflater29.setInput(byteArray90);
        deflater19.setInput(byteArray90);
        deflater15.setInput(byteArray90);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int98 = deflater1.deflate(byteArray90, 0, (int) (short) 1);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        int int3 = deflater2.getAdler();
        boolean boolean4 = deflater2.finished();
        boolean boolean5 = deflater2.needsInput();
        boolean boolean6 = deflater2.needsInput();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        int int8 = deflater2.getTotalOut();
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        deflater1.reset();
        int int15 = deflater1.getTotalIn();
        deflater1.finish();
        java.util.zip.Deflater deflater19 = new java.util.zip.Deflater(3, true);
        int int20 = deflater19.getAdler();
        deflater19.setStrategy(0);
        int int23 = deflater19.getTotalOut();
        java.util.zip.Deflater deflater25 = new java.util.zip.Deflater((int) (byte) 1);
        long long26 = deflater25.getBytesWritten();
        java.util.zip.Deflater deflater28 = new java.util.zip.Deflater((int) (byte) 1);
        deflater28.reset();
        int int30 = deflater28.getTotalIn();
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater28.setInput(byteArray37);
        deflater28.finish();
        long long40 = deflater28.getBytesRead();
        deflater28.reset();
        int int42 = deflater28.getAdler();
        boolean boolean43 = deflater28.needsInput();
        int int44 = deflater28.getTotalIn();
        int int45 = deflater28.getTotalIn();
        java.util.zip.Deflater deflater47 = new java.util.zip.Deflater((int) (byte) 1);
        deflater47.reset();
        int int49 = deflater47.getTotalIn();
        byte[] byteArray56 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater47.setInput(byteArray56);
        deflater47.finish();
        long long59 = deflater47.getBytesRead();
        deflater47.reset();
        java.util.zip.Deflater deflater62 = new java.util.zip.Deflater((int) (byte) 1);
        deflater62.reset();
        int int64 = deflater62.getTotalIn();
        byte[] byteArray71 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater62.setInput(byteArray71);
        deflater62.finish();
        long long74 = deflater62.getBytesRead();
        deflater62.reset();
        byte[] byteArray82 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater62.setInput(byteArray82, (int) (short) 0, (int) (short) 1);
        int int86 = deflater47.deflate(byteArray82);
        deflater28.setDictionary(byteArray82);
        deflater25.setInput(byteArray82);
        int int91 = deflater19.deflate(byteArray82, (int) (byte) 1, 3);
        int int92 = deflater1.deflate(byteArray82);
        deflater1.setStrategy(0);
        deflater1.end();
        deflater1.setLevel(9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int98 = deflater1.getAdler();
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        deflater1.reset();
        long long4 = deflater1.getBytesWritten();
        java.util.zip.Deflater deflater6 = new java.util.zip.Deflater((int) (byte) 1);
        deflater6.reset();
        int int8 = deflater6.getTotalIn();
        deflater6.finish();
        int int10 = deflater6.getTotalOut();
        java.util.zip.Deflater deflater12 = new java.util.zip.Deflater((int) (byte) 1);
        deflater12.reset();
        int int14 = deflater12.getTotalIn();
        deflater12.finish();
        long long16 = deflater12.getBytesWritten();
        java.util.zip.Deflater deflater18 = new java.util.zip.Deflater((int) (byte) 1);
        long long19 = deflater18.getBytesRead();
        long long20 = deflater18.getBytesRead();
        long long21 = deflater18.getBytesWritten();
        java.util.zip.Deflater deflater23 = new java.util.zip.Deflater((int) (byte) 1);
        deflater23.reset();
        int int25 = deflater23.getTotalIn();
        byte[] byteArray32 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater23.setInput(byteArray32);
        deflater23.finish();
        long long35 = deflater23.getBytesRead();
        deflater23.reset();
        byte[] byteArray43 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater23.setInput(byteArray43, (int) (short) 0, (int) (short) 1);
        deflater18.setInput(byteArray43);
        deflater12.setInput(byteArray43);
        deflater6.setDictionary(byteArray43);
        int int50 = deflater1.deflate(byteArray43);
        deflater1.end();
        java.util.zip.Deflater deflater53 = new java.util.zip.Deflater((int) (byte) 1);
        deflater53.reset();
        int int55 = deflater53.getTotalIn();
        byte[] byteArray62 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater53.setInput(byteArray62);
        deflater53.finish();
        long long65 = deflater53.getBytesRead();
        deflater53.reset();
        java.util.zip.Deflater deflater68 = new java.util.zip.Deflater((int) (byte) 1);
        deflater68.reset();
        int int70 = deflater68.getTotalIn();
        byte[] byteArray77 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater68.setInput(byteArray77);
        deflater68.finish();
        long long80 = deflater68.getBytesRead();
        deflater68.reset();
        byte[] byteArray88 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater68.setInput(byteArray88, (int) (short) 0, (int) (short) 1);
        int int92 = deflater53.deflate(byteArray88);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deflater1.setDictionary(byteArray88, (int) (byte) 0, 0);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(1, true);
        boolean boolean3 = deflater2.needsInput();
        deflater2.end();
        boolean boolean5 = deflater2.finished();
        deflater2.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater2.reset();
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        java.util.zip.Deflater deflater15 = new java.util.zip.Deflater((int) (byte) 1);
        deflater15.reset();
        int int17 = deflater15.getTotalIn();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater15.setInput(byteArray24);
        deflater15.finish();
        long long27 = deflater15.getBytesRead();
        deflater15.reset();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getTotalIn();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater30.setInput(byteArray39);
        deflater30.finish();
        long long42 = deflater30.getBytesRead();
        deflater30.reset();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater30.setInput(byteArray50, (int) (short) 0, (int) (short) 1);
        deflater15.setDictionary(byteArray50);
        int int55 = deflater1.deflate(byteArray50);
        boolean boolean56 = deflater1.finished();
        int int57 = deflater1.getTotalIn();
        deflater1.finish();
        deflater1.reset();
        deflater1.end();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long62 = deflater1.getBytesRead();
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        deflater1.finish();
        deflater1.reset();
        boolean boolean7 = deflater1.finished();
        deflater1.finish();
        deflater1.finish();
        long long10 = deflater1.getBytesWritten();
        int int11 = deflater1.getTotalIn();
        long long12 = deflater1.getBytesRead();
        long long13 = deflater1.getBytesWritten();
        deflater1.end();
        deflater1.finish();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long16 = deflater1.getBytesWritten();
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesRead();
        long long3 = deflater1.getBytesRead();
        deflater1.reset();
        boolean boolean5 = deflater1.needsInput();
        deflater1.end();
        java.util.zip.Deflater deflater8 = new java.util.zip.Deflater((int) (byte) 1);
        deflater8.reset();
        int int10 = deflater8.getTotalIn();
        int int11 = deflater8.getTotalIn();
        deflater8.finish();
        int int13 = deflater8.getTotalOut();
        boolean boolean14 = deflater8.finished();
        java.util.zip.Deflater deflater16 = new java.util.zip.Deflater((int) (byte) 1);
        deflater16.reset();
        int int18 = deflater16.getTotalIn();
        deflater16.reset();
        boolean boolean20 = deflater16.finished();
        int int21 = deflater16.getTotalOut();
        java.util.zip.Deflater deflater23 = new java.util.zip.Deflater((int) (byte) 1);
        deflater23.reset();
        int int25 = deflater23.getAdler();
        java.util.zip.Deflater deflater27 = new java.util.zip.Deflater((int) (byte) 1);
        deflater27.reset();
        int int29 = deflater27.getTotalIn();
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater27.setInput(byteArray36);
        deflater23.setInput(byteArray36);
        int int41 = deflater16.deflate(byteArray36, 0, 0);
        deflater8.setDictionary(byteArray36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int45 = deflater1.deflate(byteArray36, (int) (short) 0, 0);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        long long6 = deflater1.getBytesWritten();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        deflater1.reset();
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        deflater1.reset();
        deflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the compressor and discards any unprocessed input. This method should be called when the compressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Deflater object is undefined. "*/
        long long16 = deflater1.getBytesWritten();
    }
}

