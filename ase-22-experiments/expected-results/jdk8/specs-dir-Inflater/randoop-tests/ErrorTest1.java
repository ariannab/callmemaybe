import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
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
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int40 = inflater0.getTotalOut();
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(true);
        int int2 = inflater1.getRemaining();
        long long3 = inflater1.getBytesRead();
        int int4 = inflater1.getTotalIn();
        boolean boolean5 = inflater1.needsDictionary();
        inflater1.end();
        java.util.zip.Inflater inflater7 = new java.util.zip.Inflater();
        boolean boolean8 = inflater7.finished();
        int int9 = inflater7.getRemaining();
        boolean boolean10 = inflater7.needsDictionary();
        boolean boolean11 = inflater7.needsInput();
        boolean boolean12 = inflater7.needsDictionary();
        boolean boolean13 = inflater7.needsDictionary();
        java.util.zip.Inflater inflater14 = new java.util.zip.Inflater();
        boolean boolean15 = inflater14.finished();
        int int16 = inflater14.getRemaining();
        boolean boolean17 = inflater14.finished();
        byte[] byteArray24 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater14.setInput(byteArray24);
        int int26 = inflater7.inflate(byteArray24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        inflater1.setDictionary(byteArray24, 6, (int) (byte) 0);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        int int2 = inflater0.getTotalOut();
        int int3 = inflater0.getTotalOut();
        long long4 = inflater0.getBytesWritten();
        boolean boolean5 = inflater0.needsInput();
        boolean boolean6 = inflater0.needsDictionary();
        boolean boolean7 = inflater0.needsInput();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        boolean boolean2 = inflater0.needsInput();
        boolean boolean3 = inflater0.needsInput();
        inflater0.end();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.reset();
        long long6 = inflater0.getBytesWritten();
        inflater0.end();
        inflater0.end();
        boolean boolean9 = inflater0.needsInput();
        java.util.zip.Inflater inflater10 = new java.util.zip.Inflater();
        boolean boolean11 = inflater10.finished();
        int int12 = inflater10.getRemaining();
        boolean boolean13 = inflater10.finished();
        int int14 = inflater10.getAdler();
        int int15 = inflater10.getAdler();
        long long16 = inflater10.getBytesWritten();
        long long17 = inflater10.getBytesRead();
        inflater10.reset();
        java.util.zip.Inflater inflater19 = new java.util.zip.Inflater();
        boolean boolean20 = inflater19.finished();
        int int21 = inflater19.getRemaining();
        int int22 = inflater19.getTotalOut();
        inflater19.reset();
        boolean boolean24 = inflater19.needsInput();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        boolean boolean26 = inflater25.finished();
        int int27 = inflater25.getRemaining();
        boolean boolean28 = inflater25.needsDictionary();
        long long29 = inflater25.getBytesRead();
        boolean boolean30 = inflater25.needsDictionary();
        java.util.zip.Inflater inflater31 = new java.util.zip.Inflater();
        byte[] byteArray33 = new byte[] { (byte) 1 };
        int int34 = inflater31.inflate(byteArray33);
        long long35 = inflater31.getBytesWritten();
        inflater31.reset();
        long long37 = inflater31.getBytesWritten();
        java.util.zip.Inflater inflater38 = new java.util.zip.Inflater();
        boolean boolean39 = inflater38.finished();
        int int40 = inflater38.getRemaining();
        boolean boolean41 = inflater38.needsDictionary();
        boolean boolean42 = inflater38.needsInput();
        int int43 = inflater38.getRemaining();
        java.util.zip.Inflater inflater44 = new java.util.zip.Inflater();
        boolean boolean45 = inflater44.finished();
        int int46 = inflater44.getRemaining();
        boolean boolean47 = inflater44.finished();
        byte[] byteArray54 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater44.setInput(byteArray54);
        int int56 = inflater38.inflate(byteArray54);
        inflater31.setInput(byteArray54);
        inflater25.setInput(byteArray54);
        int int59 = inflater19.inflate(byteArray54);
        long long60 = inflater19.getBytesWritten();
        int int61 = inflater19.getTotalOut();
        java.util.zip.Inflater inflater62 = new java.util.zip.Inflater();
        boolean boolean63 = inflater62.finished();
        int int64 = inflater62.getRemaining();
        boolean boolean65 = inflater62.finished();
        byte[] byteArray72 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater62.setInput(byteArray72);
        inflater62.end();
        int int75 = inflater62.getRemaining();
        java.util.zip.Inflater inflater76 = new java.util.zip.Inflater();
        boolean boolean77 = inflater76.finished();
        int int78 = inflater76.getRemaining();
        boolean boolean79 = inflater76.finished();
        int int80 = inflater76.getAdler();
        java.util.zip.Inflater inflater81 = new java.util.zip.Inflater();
        boolean boolean82 = inflater81.finished();
        int int83 = inflater81.getRemaining();
        inflater81.end();
        boolean boolean85 = inflater81.needsInput();
        java.util.zip.Inflater inflater86 = new java.util.zip.Inflater();
        byte[] byteArray88 = new byte[] { (byte) 1 };
        int int89 = inflater86.inflate(byteArray88);
        inflater81.setInput(byteArray88);
        int int91 = inflater76.inflate(byteArray88);
        inflater62.setInput(byteArray88);
        inflater19.setInput(byteArray88);
        int int94 = inflater10.inflate(byteArray88);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.setDictionary(byteArray88);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
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
        boolean boolean37 = inflater0.needsDictionary();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long38 = inflater0.getBytesWritten();
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(false);
        int int2 = inflater1.getAdler();
        long long3 = inflater1.getBytesWritten();
        inflater1.end();
        boolean boolean5 = inflater1.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long6 = inflater1.getBytesRead();
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
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
        inflater17.reset();
        long long24 = inflater17.getBytesWritten();
        long long25 = inflater17.getBytesWritten();
        java.util.zip.Inflater inflater26 = new java.util.zip.Inflater();
        byte[] byteArray28 = new byte[] { (byte) 1 };
        int int29 = inflater26.inflate(byteArray28);
        int int30 = inflater26.getAdler();
        boolean boolean31 = inflater26.finished();
        java.util.zip.Inflater inflater32 = new java.util.zip.Inflater();
        byte[] byteArray34 = new byte[] { (byte) 1 };
        int int35 = inflater32.inflate(byteArray34);
        inflater32.reset();
        java.util.zip.Inflater inflater37 = new java.util.zip.Inflater();
        byte[] byteArray39 = new byte[] { (byte) 1 };
        int int40 = inflater37.inflate(byteArray39);
        long long41 = inflater37.getBytesWritten();
        inflater37.reset();
        long long43 = inflater37.getBytesWritten();
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
        inflater37.setInput(byteArray60);
        inflater32.setInput(byteArray60);
        inflater26.setInput(byteArray60, (int) (byte) 0, 1);
        int int68 = inflater26.getTotalIn();
        java.util.zip.Inflater inflater69 = new java.util.zip.Inflater();
        byte[] byteArray71 = new byte[] { (byte) 1 };
        int int72 = inflater69.inflate(byteArray71);
        int int73 = inflater69.getTotalOut();
        boolean boolean74 = inflater69.needsInput();
        java.util.zip.Inflater inflater75 = new java.util.zip.Inflater();
        boolean boolean76 = inflater75.finished();
        int int77 = inflater75.getRemaining();
        inflater75.end();
        java.util.zip.Inflater inflater79 = new java.util.zip.Inflater();
        boolean boolean80 = inflater79.finished();
        int int81 = inflater79.getRemaining();
        boolean boolean82 = inflater79.finished();
        byte[] byteArray89 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater79.setInput(byteArray89);
        inflater75.setInput(byteArray89);
        inflater69.setInput(byteArray89);
        inflater26.setInput(byteArray89);
        inflater17.setInput(byteArray89);
        inflater0.setInput(byteArray89);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int96 = inflater0.getTotalOut();
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
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
        boolean boolean17 = inflater0.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int18 = inflater0.getTotalOut();
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
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
        long long54 = inflater0.getBytesWritten();
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getTotalIn();
        int int5 = inflater0.getTotalIn();
        int int6 = inflater0.getRemaining();
        boolean boolean7 = inflater0.needsInput();
        int int8 = inflater0.getAdler();
        int int9 = inflater0.getTotalOut();
        inflater0.end();
        java.util.zip.Inflater inflater11 = new java.util.zip.Inflater();
        boolean boolean12 = inflater11.finished();
        int int13 = inflater11.getRemaining();
        boolean boolean14 = inflater11.finished();
        java.util.zip.Inflater inflater15 = new java.util.zip.Inflater();
        boolean boolean16 = inflater15.finished();
        int int17 = inflater15.getRemaining();
        boolean boolean18 = inflater15.finished();
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater15.setInput(byteArray25);
        inflater11.setInput(byteArray25);
        inflater11.reset();
        java.util.zip.Inflater inflater29 = new java.util.zip.Inflater();
        boolean boolean30 = inflater29.finished();
        int int31 = inflater29.getRemaining();
        inflater29.end();
        boolean boolean33 = inflater29.needsInput();
        java.util.zip.Inflater inflater34 = new java.util.zip.Inflater();
        boolean boolean35 = inflater34.finished();
        int int36 = inflater34.getRemaining();
        boolean boolean37 = inflater34.needsDictionary();
        long long38 = inflater34.getBytesRead();
        boolean boolean39 = inflater34.needsInput();
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
        int int67 = inflater34.inflate(byteArray63);
        inflater29.setInput(byteArray63);
        inflater11.setInput(byteArray63);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.setDictionary(byteArray63);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
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
        int int22 = inflater0.getRemaining();
        long long23 = inflater0.getBytesWritten();
        boolean boolean24 = inflater0.finished();
        boolean boolean25 = inflater0.finished();
        inflater0.end();
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
        boolean boolean50 = inflater27.needsInput();
        java.util.zip.Inflater inflater51 = new java.util.zip.Inflater();
        byte[] byteArray53 = new byte[] { (byte) 1 };
        int int54 = inflater51.inflate(byteArray53);
        int int55 = inflater51.getTotalIn();
        java.util.zip.Inflater inflater56 = new java.util.zip.Inflater();
        byte[] byteArray58 = new byte[] { (byte) 1 };
        int int59 = inflater56.inflate(byteArray58);
        byte[] byteArray64 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int65 = inflater56.inflate(byteArray64);
        int int66 = inflater51.inflate(byteArray64);
        int int67 = inflater27.inflate(byteArray64);
        boolean boolean68 = inflater27.finished();
        java.util.zip.Inflater inflater69 = new java.util.zip.Inflater();
        byte[] byteArray71 = new byte[] { (byte) 1 };
        int int72 = inflater69.inflate(byteArray71);
        boolean boolean73 = inflater69.finished();
        int int74 = inflater69.getRemaining();
        java.util.zip.Inflater inflater75 = new java.util.zip.Inflater();
        byte[] byteArray77 = new byte[] { (byte) 1 };
        int int78 = inflater75.inflate(byteArray77);
        inflater75.reset();
        java.util.zip.Inflater inflater80 = new java.util.zip.Inflater();
        byte[] byteArray82 = new byte[] { (byte) 1 };
        int int83 = inflater80.inflate(byteArray82);
        int int84 = inflater80.getTotalIn();
        java.util.zip.Inflater inflater85 = new java.util.zip.Inflater();
        byte[] byteArray87 = new byte[] { (byte) 1 };
        int int88 = inflater85.inflate(byteArray87);
        byte[] byteArray93 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int94 = inflater85.inflate(byteArray93);
        int int95 = inflater80.inflate(byteArray93);
        inflater75.setInput(byteArray93);
        inflater69.setInput(byteArray93);
        int int98 = inflater27.inflate(byteArray93);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int99 = inflater0.inflate(byteArray93);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(false);
        int int2 = inflater1.getTotalIn();
        boolean boolean3 = inflater1.finished();
        boolean boolean4 = inflater1.needsDictionary();
        boolean boolean5 = inflater1.finished();
        int int6 = inflater1.getTotalOut();
        int int7 = inflater1.getRemaining();
        inflater1.end();
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
        boolean boolean30 = inflater9.needsDictionary();
        long long31 = inflater9.getBytesWritten();
        boolean boolean32 = inflater9.needsInput();
        int int33 = inflater9.getRemaining();
        java.util.zip.Inflater inflater34 = new java.util.zip.Inflater();
        boolean boolean35 = inflater34.finished();
        int int36 = inflater34.getRemaining();
        boolean boolean37 = inflater34.finished();
        long long38 = inflater34.getBytesRead();
        inflater34.reset();
        java.util.zip.Inflater inflater40 = new java.util.zip.Inflater();
        boolean boolean41 = inflater40.finished();
        int int42 = inflater40.getRemaining();
        boolean boolean43 = inflater40.needsDictionary();
        boolean boolean44 = inflater40.needsInput();
        boolean boolean45 = inflater40.needsDictionary();
        boolean boolean46 = inflater40.needsDictionary();
        java.util.zip.Inflater inflater47 = new java.util.zip.Inflater();
        boolean boolean48 = inflater47.finished();
        int int49 = inflater47.getRemaining();
        boolean boolean50 = inflater47.finished();
        byte[] byteArray57 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater47.setInput(byteArray57);
        int int59 = inflater40.inflate(byteArray57);
        int int60 = inflater34.inflate(byteArray57);
        java.util.zip.Inflater inflater61 = new java.util.zip.Inflater();
        byte[] byteArray63 = new byte[] { (byte) 1 };
        int int64 = inflater61.inflate(byteArray63);
        int int65 = inflater61.getAdler();
        java.util.zip.Inflater inflater66 = new java.util.zip.Inflater();
        boolean boolean67 = inflater66.finished();
        int int68 = inflater66.getRemaining();
        boolean boolean69 = inflater66.needsInput();
        java.util.zip.Inflater inflater70 = new java.util.zip.Inflater();
        boolean boolean71 = inflater70.finished();
        int int72 = inflater70.getRemaining();
        boolean boolean73 = inflater70.finished();
        byte[] byteArray80 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater70.setInput(byteArray80);
        inflater66.setInput(byteArray80);
        inflater61.setInput(byteArray80);
        inflater34.setInput(byteArray80);
        inflater9.setInput(byteArray80);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int86 = inflater1.inflate(byteArray80);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.needsDictionary();
        int int2 = inflater0.getTotalOut();
        int int3 = inflater0.getTotalOut();
        int int4 = inflater0.getTotalIn();
        boolean boolean5 = inflater0.needsDictionary();
        int int6 = inflater0.getAdler();
        long long7 = inflater0.getBytesRead();
        inflater0.end();
        java.util.zip.Inflater inflater9 = new java.util.zip.Inflater();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        int int12 = inflater9.inflate(byteArray11);
        long long13 = inflater9.getBytesWritten();
        inflater9.reset();
        long long15 = inflater9.getBytesWritten();
        int int16 = inflater9.getTotalIn();
        boolean boolean17 = inflater9.needsDictionary();
        int int18 = inflater9.getTotalOut();
        int int19 = inflater9.getTotalOut();
        boolean boolean20 = inflater9.needsInput();
        java.util.zip.Inflater inflater21 = new java.util.zip.Inflater();
        byte[] byteArray23 = new byte[] { (byte) 1 };
        int int24 = inflater21.inflate(byteArray23);
        int int25 = inflater21.getTotalIn();
        long long26 = inflater21.getBytesWritten();
        long long27 = inflater21.getBytesRead();
        int int28 = inflater21.getAdler();
        int int29 = inflater21.getTotalOut();
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
        inflater21.setInput(byteArray64);
        inflater9.setInput(byteArray64);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int72 = inflater0.inflate(byteArray64);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
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
        boolean boolean26 = inflater0.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int27 = inflater0.getAdler();
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
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
        boolean boolean17 = inflater0.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
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
        boolean boolean31 = inflater0.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long32 = inflater0.getBytesWritten();
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
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
        long long96 = inflater0.getBytesWritten();
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getTotalIn();
        long long5 = inflater0.getBytesWritten();
        int int6 = inflater0.getTotalOut();
        inflater0.end();
        java.util.zip.Inflater inflater8 = new java.util.zip.Inflater();
        boolean boolean9 = inflater8.finished();
        boolean boolean10 = inflater8.needsInput();
        long long11 = inflater8.getBytesWritten();
        java.util.zip.Inflater inflater12 = new java.util.zip.Inflater();
        boolean boolean13 = inflater12.finished();
        int int14 = inflater12.getRemaining();
        boolean boolean15 = inflater12.finished();
        long long16 = inflater12.getBytesRead();
        inflater12.reset();
        java.util.zip.Inflater inflater18 = new java.util.zip.Inflater();
        boolean boolean19 = inflater18.finished();
        int int20 = inflater18.getRemaining();
        boolean boolean21 = inflater18.needsDictionary();
        boolean boolean22 = inflater18.needsInput();
        boolean boolean23 = inflater18.needsDictionary();
        boolean boolean24 = inflater18.needsDictionary();
        java.util.zip.Inflater inflater25 = new java.util.zip.Inflater();
        boolean boolean26 = inflater25.finished();
        int int27 = inflater25.getRemaining();
        boolean boolean28 = inflater25.finished();
        byte[] byteArray35 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater25.setInput(byteArray35);
        int int37 = inflater18.inflate(byteArray35);
        int int38 = inflater12.inflate(byteArray35);
        int int39 = inflater8.inflate(byteArray35);
        inflater0.setInput(byteArray35, 6, 0);
        java.util.zip.Inflater inflater43 = new java.util.zip.Inflater();
        boolean boolean44 = inflater43.finished();
        int int45 = inflater43.getRemaining();
        int int46 = inflater43.getTotalOut();
        inflater43.reset();
        long long48 = inflater43.getBytesWritten();
        java.util.zip.Inflater inflater49 = new java.util.zip.Inflater();
        boolean boolean50 = inflater49.finished();
        boolean boolean51 = inflater49.needsInput();
        boolean boolean52 = inflater49.needsInput();
        java.util.zip.Inflater inflater53 = new java.util.zip.Inflater();
        boolean boolean54 = inflater53.finished();
        int int55 = inflater53.getRemaining();
        boolean boolean56 = inflater53.needsDictionary();
        long long57 = inflater53.getBytesRead();
        boolean boolean58 = inflater53.needsDictionary();
        java.util.zip.Inflater inflater59 = new java.util.zip.Inflater();
        byte[] byteArray61 = new byte[] { (byte) 1 };
        int int62 = inflater59.inflate(byteArray61);
        long long63 = inflater59.getBytesWritten();
        inflater59.reset();
        long long65 = inflater59.getBytesWritten();
        java.util.zip.Inflater inflater66 = new java.util.zip.Inflater();
        boolean boolean67 = inflater66.finished();
        int int68 = inflater66.getRemaining();
        boolean boolean69 = inflater66.needsDictionary();
        boolean boolean70 = inflater66.needsInput();
        int int71 = inflater66.getRemaining();
        java.util.zip.Inflater inflater72 = new java.util.zip.Inflater();
        boolean boolean73 = inflater72.finished();
        int int74 = inflater72.getRemaining();
        boolean boolean75 = inflater72.finished();
        byte[] byteArray82 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater72.setInput(byteArray82);
        int int84 = inflater66.inflate(byteArray82);
        inflater59.setInput(byteArray82);
        inflater53.setInput(byteArray82);
        int int87 = inflater49.inflate(byteArray82);
        int int88 = inflater43.inflate(byteArray82);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        inflater0.setDictionary(byteArray82);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        inflater0.end();
        boolean boolean4 = inflater0.needsInput();
        boolean boolean5 = inflater0.needsDictionary();
        boolean boolean6 = inflater0.needsDictionary();
        boolean boolean7 = inflater0.needsInput();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int8 = inflater0.getTotalIn();
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(true);
        int int2 = inflater1.getRemaining();
        long long3 = inflater1.getBytesRead();
        int int4 = inflater1.getTotalIn();
        long long5 = inflater1.getBytesWritten();
        int int6 = inflater1.getTotalIn();
        boolean boolean7 = inflater1.needsDictionary();
        inflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater1.reset();
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
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
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int23 = inflater0.getTotalOut();
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
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
        int int22 = inflater0.getTotalOut();
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
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
        long long13 = inflater0.getBytesRead();
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.end();
        boolean boolean6 = inflater0.needsDictionary();
        inflater0.end();
        int int8 = inflater0.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long9 = inflater0.getBytesWritten();
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int6 = inflater0.getAdler();
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
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
        java.util.zip.Inflater inflater10 = new java.util.zip.Inflater();
        boolean boolean11 = inflater10.finished();
        int int12 = inflater10.getRemaining();
        boolean boolean13 = inflater10.needsDictionary();
        long long14 = inflater10.getBytesRead();
        boolean boolean15 = inflater10.needsInput();
        boolean boolean16 = inflater10.finished();
        boolean boolean17 = inflater10.needsInput();
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
        int int38 = inflater18.getAdler();
        boolean boolean39 = inflater18.finished();
        int int40 = inflater18.getAdler();
        boolean boolean41 = inflater18.needsInput();
        java.util.zip.Inflater inflater42 = new java.util.zip.Inflater();
        byte[] byteArray44 = new byte[] { (byte) 1 };
        int int45 = inflater42.inflate(byteArray44);
        int int46 = inflater42.getTotalIn();
        java.util.zip.Inflater inflater47 = new java.util.zip.Inflater();
        byte[] byteArray49 = new byte[] { (byte) 1 };
        int int50 = inflater47.inflate(byteArray49);
        byte[] byteArray55 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int56 = inflater47.inflate(byteArray55);
        int int57 = inflater42.inflate(byteArray55);
        int int58 = inflater18.inflate(byteArray55);
        inflater10.setInput(byteArray55);
        inflater0.setInput(byteArray55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        inflater0.reset();
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
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
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long35 = inflater1.getBytesWritten();
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
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
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int80 = inflater0.getTotalIn();
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(true);
        int int2 = inflater1.getRemaining();
        long long3 = inflater1.getBytesRead();
        java.util.zip.Inflater inflater4 = new java.util.zip.Inflater();
        byte[] byteArray6 = new byte[] { (byte) 1 };
        int int7 = inflater4.inflate(byteArray6);
        int int8 = inflater1.inflate(byteArray6);
        long long9 = inflater1.getBytesWritten();
        inflater1.end();
        java.util.zip.Inflater inflater11 = new java.util.zip.Inflater();
        boolean boolean12 = inflater11.finished();
        int int13 = inflater11.getRemaining();
        boolean boolean14 = inflater11.needsDictionary();
        boolean boolean15 = inflater11.needsInput();
        int int16 = inflater11.getRemaining();
        inflater11.reset();
        java.util.zip.Inflater inflater18 = new java.util.zip.Inflater();
        boolean boolean19 = inflater18.finished();
        int int20 = inflater18.getRemaining();
        boolean boolean21 = inflater18.finished();
        byte[] byteArray28 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater18.setInput(byteArray28);
        inflater11.setInput(byteArray28);
        int int31 = inflater11.getTotalOut();
        boolean boolean32 = inflater11.needsInput();
        boolean boolean33 = inflater11.needsInput();
        java.util.zip.Inflater inflater34 = new java.util.zip.Inflater();
        boolean boolean35 = inflater34.finished();
        int int36 = inflater34.getRemaining();
        boolean boolean37 = inflater34.needsDictionary();
        java.util.zip.Inflater inflater38 = new java.util.zip.Inflater();
        boolean boolean39 = inflater38.finished();
        int int40 = inflater38.getRemaining();
        inflater38.end();
        java.util.zip.Inflater inflater42 = new java.util.zip.Inflater();
        boolean boolean43 = inflater42.finished();
        int int44 = inflater42.getRemaining();
        boolean boolean45 = inflater42.finished();
        byte[] byteArray52 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater42.setInput(byteArray52);
        inflater38.setInput(byteArray52);
        int int55 = inflater34.inflate(byteArray52);
        inflater11.setInput(byteArray52, (int) (byte) 0, (int) (byte) 1);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int59 = inflater1.inflate(byteArray52);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(false);
        int int2 = inflater1.getAdler();
        boolean boolean3 = inflater1.finished();
        inflater1.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long5 = inflater1.getBytesWritten();
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
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
        long long13 = inflater0.getBytesWritten();
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
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
        java.util.zip.Inflater inflater10 = new java.util.zip.Inflater();
        boolean boolean11 = inflater10.finished();
        int int12 = inflater10.getRemaining();
        boolean boolean13 = inflater10.needsDictionary();
        long long14 = inflater10.getBytesRead();
        boolean boolean15 = inflater10.needsInput();
        boolean boolean16 = inflater10.finished();
        boolean boolean17 = inflater10.needsInput();
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
        int int38 = inflater18.getAdler();
        boolean boolean39 = inflater18.finished();
        int int40 = inflater18.getAdler();
        boolean boolean41 = inflater18.needsInput();
        java.util.zip.Inflater inflater42 = new java.util.zip.Inflater();
        byte[] byteArray44 = new byte[] { (byte) 1 };
        int int45 = inflater42.inflate(byteArray44);
        int int46 = inflater42.getTotalIn();
        java.util.zip.Inflater inflater47 = new java.util.zip.Inflater();
        byte[] byteArray49 = new byte[] { (byte) 1 };
        int int50 = inflater47.inflate(byteArray49);
        byte[] byteArray55 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        int int56 = inflater47.inflate(byteArray55);
        int int57 = inflater42.inflate(byteArray55);
        int int58 = inflater18.inflate(byteArray55);
        inflater10.setInput(byteArray55);
        inflater0.setInput(byteArray55);
        java.util.zip.Inflater inflater61 = new java.util.zip.Inflater();
        byte[] byteArray63 = new byte[] { (byte) 1 };
        int int64 = inflater61.inflate(byteArray63);
        int int65 = inflater61.getTotalIn();
        boolean boolean66 = inflater61.needsDictionary();
        long long67 = inflater61.getBytesRead();
        java.util.zip.Inflater inflater68 = new java.util.zip.Inflater();
        boolean boolean69 = inflater68.finished();
        java.util.zip.Inflater inflater70 = new java.util.zip.Inflater();
        byte[] byteArray72 = new byte[] { (byte) 1 };
        int int73 = inflater70.inflate(byteArray72);
        int int74 = inflater70.getTotalIn();
        java.util.zip.Inflater inflater75 = new java.util.zip.Inflater();
        boolean boolean76 = inflater75.finished();
        int int77 = inflater75.getRemaining();
        inflater75.end();
        boolean boolean79 = inflater75.needsInput();
        java.util.zip.Inflater inflater80 = new java.util.zip.Inflater();
        byte[] byteArray82 = new byte[] { (byte) 1 };
        int int83 = inflater80.inflate(byteArray82);
        inflater75.setInput(byteArray82);
        inflater70.setInput(byteArray82);
        inflater68.setInput(byteArray82);
        int int87 = inflater61.inflate(byteArray82);
        inflater0.setInput(byteArray82, 0, 0);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long91 = inflater0.getBytesWritten();
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
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
        int int23 = inflater0.getAdler();
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(false);
        int int2 = inflater1.getTotalIn();
        boolean boolean3 = inflater1.finished();
        boolean boolean4 = inflater1.needsDictionary();
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
        inflater1.setInput(byteArray28, (int) (byte) 0, 0);
        inflater1.end();
        boolean boolean36 = inflater1.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        long long37 = inflater1.getBytesRead();
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        boolean boolean1 = inflater0.finished();
        int int2 = inflater0.getRemaining();
        boolean boolean3 = inflater0.finished();
        long long4 = inflater0.getBytesRead();
        boolean boolean5 = inflater0.finished();
        inflater0.reset();
        inflater0.end();
        boolean boolean8 = inflater0.finished();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int9 = inflater0.getTotalOut();
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
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
        long long42 = inflater0.getBytesWritten();
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
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
        boolean boolean11 = inflater8.finished();
        int int12 = inflater8.getAdler();
        int int13 = inflater8.getAdler();
        int int14 = inflater8.getAdler();
        boolean boolean15 = inflater8.needsDictionary();
        java.util.zip.Inflater inflater16 = new java.util.zip.Inflater();
        boolean boolean17 = inflater16.finished();
        int int18 = inflater16.getRemaining();
        int int19 = inflater16.getTotalOut();
        inflater16.reset();
        boolean boolean21 = inflater16.needsDictionary();
        java.util.zip.Inflater inflater22 = new java.util.zip.Inflater();
        boolean boolean23 = inflater22.finished();
        int int24 = inflater22.getRemaining();
        boolean boolean25 = inflater22.finished();
        int int26 = inflater22.getAdler();
        int int27 = inflater22.getAdler();
        int int28 = inflater22.getAdler();
        int int29 = inflater22.getTotalOut();
        inflater22.reset();
        boolean boolean31 = inflater22.needsDictionary();
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
        inflater22.setInput(byteArray44);
        inflater16.setInput(byteArray44);
        int int50 = inflater8.inflate(byteArray44);
        inflater0.setInput(byteArray44);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int52 = inflater0.getAdler();
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        java.util.zip.Inflater inflater1 = new java.util.zip.Inflater(false);
        int int2 = inflater1.getAdler();
        long long3 = inflater1.getBytesWritten();
        inflater1.end();
        boolean boolean5 = inflater1.needsDictionary();
        int int6 = inflater1.getRemaining();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int7 = inflater1.getAdler();
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.end();
        boolean boolean6 = inflater0.needsDictionary();
        boolean boolean7 = inflater0.needsInput();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int9 = inflater0.getAdler();
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.reset();
        long long6 = inflater0.getBytesWritten();
        inflater0.reset();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        int int4 = inflater0.getAdler();
        boolean boolean5 = inflater0.finished();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int7 = inflater0.getAdler();
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
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
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int54 = inflater0.getTotalOut();
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
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
        boolean boolean38 = inflater0.needsDictionary();
        int int39 = inflater0.getTotalOut();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int41 = inflater0.getAdler();
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.reset();
        long long6 = inflater0.getBytesWritten();
        inflater0.reset();
        inflater0.reset();
        long long9 = inflater0.getBytesRead();
        inflater0.end();
        boolean boolean11 = inflater0.finished();
        java.util.zip.Inflater inflater12 = new java.util.zip.Inflater();
        boolean boolean13 = inflater12.finished();
        int int14 = inflater12.getRemaining();
        boolean boolean15 = inflater12.needsDictionary();
        boolean boolean16 = inflater12.needsInput();
        int int17 = inflater12.getRemaining();
        inflater12.reset();
        boolean boolean19 = inflater12.needsDictionary();
        int int20 = inflater12.getTotalIn();
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
        inflater12.setInput(byteArray72);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.setDictionary(byteArray72);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        java.util.zip.Inflater inflater0 = new java.util.zip.Inflater();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        int int3 = inflater0.inflate(byteArray2);
        long long4 = inflater0.getBytesWritten();
        inflater0.end();
        boolean boolean6 = inflater0.needsDictionary();
        boolean boolean7 = inflater0.needsInput();
        boolean boolean8 = inflater0.needsDictionary();
        inflater0.end();
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.reset();
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
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
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        int int58 = inflater0.getTotalIn();
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
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
        int int13 = inflater0.getTotalIn();
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
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
        long long24 = inflater0.getBytesWritten();
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
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
        boolean boolean27 = inflater26.finished();
        int int28 = inflater26.getRemaining();
        int int29 = inflater26.getTotalOut();
        inflater26.reset();
        long long31 = inflater26.getBytesWritten();
        int int32 = inflater26.getAdler();
        java.util.zip.Inflater inflater34 = new java.util.zip.Inflater(false);
        int int35 = inflater34.getTotalIn();
        boolean boolean36 = inflater34.finished();
        boolean boolean37 = inflater34.needsDictionary();
        java.util.zip.Inflater inflater38 = new java.util.zip.Inflater();
        boolean boolean39 = inflater38.finished();
        int int40 = inflater38.getRemaining();
        boolean boolean41 = inflater38.finished();
        long long42 = inflater38.getBytesRead();
        inflater38.reset();
        java.util.zip.Inflater inflater44 = new java.util.zip.Inflater();
        boolean boolean45 = inflater44.finished();
        int int46 = inflater44.getRemaining();
        boolean boolean47 = inflater44.needsDictionary();
        boolean boolean48 = inflater44.needsInput();
        boolean boolean49 = inflater44.needsDictionary();
        boolean boolean50 = inflater44.needsDictionary();
        java.util.zip.Inflater inflater51 = new java.util.zip.Inflater();
        boolean boolean52 = inflater51.finished();
        int int53 = inflater51.getRemaining();
        boolean boolean54 = inflater51.finished();
        byte[] byteArray61 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        inflater51.setInput(byteArray61);
        int int63 = inflater44.inflate(byteArray61);
        int int64 = inflater38.inflate(byteArray61);
        inflater34.setInput(byteArray61, (int) (byte) 0, 0);
        int int70 = inflater26.inflate(byteArray61, 1, 0);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Closes the decompressor and discards any unprocessed input. This method should be called when the decompressor is no longer being used, but will also be called automatically by the finalize() method. Once this method is called, the behavior of the Inflater object is undefined. "*/
        inflater0.setDictionary(byteArray61);
    }
}

