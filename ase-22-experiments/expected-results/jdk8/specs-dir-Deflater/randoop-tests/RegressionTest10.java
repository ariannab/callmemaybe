import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(3, true);
        int int3 = deflater2.getAdler();
        deflater2.setStrategy(0);
        long long6 = deflater2.getBytesRead();
        int int7 = deflater2.getTotalOut();
        boolean boolean8 = deflater2.needsInput();
        int int9 = deflater2.getTotalIn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
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
        int int21 = deflater1.getTotalIn();
        long long22 = deflater1.getBytesWritten();
        java.util.zip.Deflater deflater24 = new java.util.zip.Deflater((int) (byte) 1);
        deflater24.reset();
        java.util.zip.Deflater deflater27 = new java.util.zip.Deflater((int) (byte) 1);
        deflater27.reset();
        int int29 = deflater27.getTotalIn();
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater27.setInput(byteArray36);
        deflater24.setInput(byteArray36);
        deflater24.setLevel((int) (byte) -1);
        deflater24.finish();
        int int42 = deflater24.getTotalOut();
        long long43 = deflater24.getBytesWritten();
        deflater24.finish();
        deflater24.reset();
        java.util.zip.Deflater deflater47 = new java.util.zip.Deflater((int) (byte) 1);
        long long48 = deflater47.getBytesWritten();
        int int49 = deflater47.getTotalOut();
        long long50 = deflater47.getBytesWritten();
        java.util.zip.Deflater deflater52 = new java.util.zip.Deflater((int) (byte) 1);
        deflater52.reset();
        deflater52.reset();
        java.util.zip.Deflater deflater56 = new java.util.zip.Deflater((int) (byte) 1);
        deflater56.reset();
        int int58 = deflater56.getTotalIn();
        byte[] byteArray65 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater56.setInput(byteArray65);
        deflater52.setDictionary(byteArray65);
        deflater47.setDictionary(byteArray65);
        deflater24.setDictionary(byteArray65);
        // The following exception was thrown during execution in test generation
        try {
            deflater1.setDictionary(byteArray65, 1, 87360012);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[1, 1, 10, -1, -1, 1]");
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
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
        java.util.zip.Deflater deflater27 = new java.util.zip.Deflater((int) (short) -1, false);
        java.util.zip.Deflater deflater29 = new java.util.zip.Deflater((int) (byte) 1);
        deflater29.reset();
        int int31 = deflater29.getAdler();
        java.util.zip.Deflater deflater33 = new java.util.zip.Deflater((int) (byte) 1);
        deflater33.reset();
        int int35 = deflater33.getTotalIn();
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater33.setInput(byteArray42);
        deflater29.setInput(byteArray42, 0, 0);
        int int47 = deflater27.deflate(byteArray42);
        deflater1.setInput(byteArray42);
        deflater1.reset();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
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
        boolean boolean21 = deflater2.finished();
        int int22 = deflater2.getAdler();
        long long23 = deflater2.getBytesRead();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        int int6 = deflater4.getTotalIn();
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater4.setInput(byteArray13);
        deflater1.setInput(byteArray13);
        deflater1.setLevel((int) (byte) -1);
        long long18 = deflater1.getBytesWritten();
        long long19 = deflater1.getBytesWritten();
        int int20 = deflater1.getTotalOut();
        deflater1.setStrategy(0);
        long long23 = deflater1.getBytesRead();
        int int24 = deflater1.getAdler();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
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
        deflater1.finish();
        java.lang.Class<?> wildcardClass70 = deflater1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
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
        long long19 = deflater1.getBytesRead();
        deflater1.setLevel((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 87360012 + "'", int17 == 87360012);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 87360012 + "'", int18 == 87360012);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        deflater1.reset();
        long long14 = deflater1.getBytesRead();
        boolean boolean15 = deflater1.needsInput();
        java.util.zip.Deflater deflater18 = new java.util.zip.Deflater((int) (byte) 0, false);
        boolean boolean19 = deflater18.needsInput();
        int int20 = deflater18.getTotalIn();
        java.util.zip.Deflater deflater23 = new java.util.zip.Deflater((int) (short) -1, false);
        long long24 = deflater23.getBytesWritten();
        java.util.zip.Deflater deflater26 = new java.util.zip.Deflater((int) (byte) 1);
        deflater26.reset();
        int int28 = deflater26.getTotalIn();
        byte[] byteArray35 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater26.setInput(byteArray35);
        deflater23.setDictionary(byteArray35);
        boolean boolean38 = deflater23.needsInput();
        java.util.zip.Deflater deflater41 = new java.util.zip.Deflater((int) (short) -1, false);
        java.util.zip.Deflater deflater43 = new java.util.zip.Deflater((int) (byte) 1);
        deflater43.reset();
        int int45 = deflater43.getAdler();
        java.util.zip.Deflater deflater47 = new java.util.zip.Deflater((int) (byte) 1);
        deflater47.reset();
        int int49 = deflater47.getTotalIn();
        byte[] byteArray56 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater47.setInput(byteArray56);
        deflater43.setInput(byteArray56, 0, 0);
        int int61 = deflater41.deflate(byteArray56);
        deflater23.setInput(byteArray56);
        deflater18.setDictionary(byteArray56);
        int int64 = deflater1.deflate(byteArray56);
        int int65 = deflater1.getAdler();
        java.lang.Class<?> wildcardClass66 = deflater1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (byte) 0, false);
        boolean boolean3 = deflater2.needsInput();
        long long4 = deflater2.getBytesWritten();
        deflater2.setStrategy(0);
        java.util.zip.Deflater deflater9 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater11 = new java.util.zip.Deflater((int) (byte) 1);
        deflater11.reset();
        java.util.zip.Deflater deflater14 = new java.util.zip.Deflater((int) (byte) 1);
        deflater14.reset();
        int int16 = deflater14.getTotalIn();
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater14.setInput(byteArray23);
        deflater11.setInput(byteArray23);
        deflater9.setInput(byteArray23);
        deflater9.setStrategy(0);
        boolean boolean29 = deflater9.needsInput();
        java.util.zip.Deflater deflater32 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater34 = new java.util.zip.Deflater((int) (byte) 1);
        deflater34.reset();
        java.util.zip.Deflater deflater37 = new java.util.zip.Deflater((int) (byte) 1);
        deflater37.reset();
        int int39 = deflater37.getTotalIn();
        byte[] byteArray46 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater37.setInput(byteArray46);
        deflater34.setInput(byteArray46);
        deflater32.setInput(byteArray46);
        deflater9.setInput(byteArray46);
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
        deflater9.setInput(byteArray72);
        deflater2.setDictionary(byteArray72);
        int int78 = deflater2.getAdler();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 118882828 + "'", int78 == 118882828);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        deflater1.finish();
        int int6 = deflater1.getTotalOut();
        int int7 = deflater1.getTotalOut();
        int int8 = deflater1.getTotalOut();
        int int9 = deflater1.getTotalOut();
        java.lang.Class<?> wildcardClass10 = deflater1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
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
        boolean boolean49 = deflater1.needsInput();
        deflater1.finish();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
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
        int int29 = deflater2.getTotalIn();
        boolean boolean30 = deflater2.needsInput();
        boolean boolean31 = deflater2.finished();
        deflater2.reset();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        int int3 = deflater1.getTotalOut();
        long long4 = deflater1.getBytesWritten();
        int int5 = deflater1.getAdler();
        deflater1.end();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
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
        java.util.zip.Deflater deflater63 = new java.util.zip.Deflater((int) (byte) 1);
        deflater63.reset();
        int int65 = deflater63.getTotalIn();
        deflater63.finish();
        java.util.zip.Deflater deflater68 = new java.util.zip.Deflater((int) (byte) 1);
        deflater68.reset();
        int int70 = deflater68.getTotalIn();
        byte[] byteArray77 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater68.setInput(byteArray77);
        deflater63.setInput(byteArray77);
        deflater1.setInput(byteArray77);
        int int81 = deflater1.getTotalOut();
        int int82 = deflater1.getTotalOut();
        int int83 = deflater1.getTotalOut();
        deflater1.reset();
        deflater1.reset();
        deflater1.setLevel(6);
        deflater1.setStrategy((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[120, 1, 99, 100, -28, -6]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 6 + "'", int58 == 6);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray77), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
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
        deflater2.reset();
        boolean boolean71 = deflater2.finished();
        deflater2.setLevel(8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (byte) -1, true);
        int int3 = deflater2.getTotalOut();
        deflater2.end();
        deflater2.end();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        deflater1.setLevel((int) (short) 1);
        deflater1.setLevel((int) (byte) 1);
        boolean boolean10 = deflater1.finished();
        deflater1.setLevel(2);
        deflater1.setLevel(0);
        deflater1.setStrategy((int) (short) 1);
        boolean boolean17 = deflater1.needsInput();
        java.util.zip.Deflater deflater19 = new java.util.zip.Deflater((int) (byte) 1);
        deflater19.reset();
        java.util.zip.Deflater deflater22 = new java.util.zip.Deflater((int) (byte) 1);
        deflater22.reset();
        int int24 = deflater22.getTotalIn();
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater22.setInput(byteArray31);
        deflater19.setInput(byteArray31);
        deflater19.setLevel((int) (byte) -1);
        deflater19.finish();
        java.util.zip.Deflater deflater38 = new java.util.zip.Deflater((int) (byte) 1);
        long long39 = deflater38.getBytesWritten();
        int int40 = deflater38.getTotalOut();
        long long41 = deflater38.getBytesWritten();
        java.util.zip.Deflater deflater43 = new java.util.zip.Deflater((int) (byte) 1);
        deflater43.reset();
        deflater43.reset();
        java.util.zip.Deflater deflater47 = new java.util.zip.Deflater((int) (byte) 1);
        deflater47.reset();
        int int49 = deflater47.getTotalIn();
        byte[] byteArray56 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater47.setInput(byteArray56);
        deflater43.setDictionary(byteArray56);
        deflater38.setDictionary(byteArray56);
        deflater19.setDictionary(byteArray56, 3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int65 = deflater1.deflate(byteArray56, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[1, 1, 10, -1, -1, 1]");
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
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
        long long25 = deflater2.getBytesWritten();
        boolean boolean26 = deflater2.needsInput();
        long long27 = deflater2.getBytesWritten();
        deflater2.end();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        deflater1.reset();
        int int15 = deflater1.getAdler();
        long long16 = deflater1.getBytesRead();
        int int17 = deflater1.getAdler();
        int int18 = deflater1.getTotalIn();
        java.lang.Class<?> wildcardClass19 = deflater1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
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
        long long41 = deflater1.getBytesRead();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        deflater1.setLevel((int) (short) 1);
        boolean boolean8 = deflater1.needsInput();
        int int9 = deflater1.getAdler();
        long long10 = deflater1.getBytesWritten();
        int int11 = deflater1.getTotalIn();
        java.util.zip.Deflater deflater14 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater16 = new java.util.zip.Deflater((int) (byte) 1);
        deflater16.reset();
        java.util.zip.Deflater deflater19 = new java.util.zip.Deflater((int) (byte) 1);
        deflater19.reset();
        int int21 = deflater19.getTotalIn();
        byte[] byteArray28 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater19.setInput(byteArray28);
        deflater16.setInput(byteArray28);
        deflater14.setInput(byteArray28);
        deflater14.setStrategy(0);
        boolean boolean34 = deflater14.needsInput();
        long long35 = deflater14.getBytesWritten();
        long long36 = deflater14.getBytesRead();
        long long37 = deflater14.getBytesWritten();
        boolean boolean38 = deflater14.needsInput();
        long long39 = deflater14.getBytesWritten();
        java.util.zip.Deflater deflater41 = new java.util.zip.Deflater((int) (byte) 1);
        deflater41.reset();
        int int43 = deflater41.getTotalIn();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater41.setInput(byteArray50);
        int int52 = deflater14.deflate(byteArray50);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = deflater1.deflate(byteArray50, 100, 87360012, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        long long3 = deflater2.getBytesWritten();
        boolean boolean4 = deflater2.needsInput();
        boolean boolean5 = deflater2.needsInput();
        deflater2.finish();
        long long7 = deflater2.getBytesRead();
        java.util.zip.Deflater deflater9 = new java.util.zip.Deflater((int) (byte) 1);
        long long10 = deflater9.getBytesWritten();
        int int11 = deflater9.getTotalOut();
        long long12 = deflater9.getBytesWritten();
        deflater9.reset();
        deflater9.reset();
        java.util.zip.Deflater deflater16 = new java.util.zip.Deflater((int) (byte) 1);
        deflater16.reset();
        int int18 = deflater16.getTotalIn();
        int int19 = deflater16.getTotalIn();
        int int20 = deflater16.getTotalIn();
        long long21 = deflater16.getBytesWritten();
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
        deflater23.reset();
        deflater23.reset();
        java.util.zip.Deflater deflater50 = new java.util.zip.Deflater((int) (byte) 1);
        long long51 = deflater50.getBytesWritten();
        int int52 = deflater50.getTotalOut();
        long long53 = deflater50.getBytesWritten();
        java.util.zip.Deflater deflater55 = new java.util.zip.Deflater((int) (byte) 1);
        deflater55.reset();
        deflater55.reset();
        java.util.zip.Deflater deflater59 = new java.util.zip.Deflater((int) (byte) 1);
        deflater59.reset();
        int int61 = deflater59.getTotalIn();
        byte[] byteArray68 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater59.setInput(byteArray68);
        deflater55.setDictionary(byteArray68);
        deflater50.setDictionary(byteArray68);
        deflater23.setInput(byteArray68);
        deflater16.setDictionary(byteArray68, 2, (int) (short) 0);
        int int76 = deflater9.deflate(byteArray68);
        // The following exception was thrown during execution in test generation
        try {
            int int80 = deflater2.deflate(byteArray68, 9, 48693373, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        int int6 = deflater4.getTotalIn();
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater4.setInput(byteArray13);
        deflater1.setInput(byteArray13);
        deflater1.setLevel((int) (byte) -1);
        deflater1.setLevel(0);
        boolean boolean20 = deflater1.finished();
        deflater1.setStrategy((int) (short) 1);
        java.util.zip.Deflater deflater24 = new java.util.zip.Deflater((int) (byte) -1);
        boolean boolean25 = deflater24.finished();
        deflater24.reset();
        boolean boolean27 = deflater24.finished();
        int int28 = deflater24.getAdler();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getTotalIn();
        int int33 = deflater30.getTotalIn();
        deflater30.finish();
        deflater30.reset();
        java.util.zip.Deflater deflater37 = new java.util.zip.Deflater((int) (byte) 1);
        deflater37.reset();
        int int39 = deflater37.getTotalIn();
        byte[] byteArray46 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater37.setInput(byteArray46);
        deflater30.setInput(byteArray46);
        long long49 = deflater30.getBytesWritten();
        deflater30.reset();
        int int51 = deflater30.getAdler();
        java.util.zip.Deflater deflater53 = new java.util.zip.Deflater((int) (byte) 1);
        deflater53.reset();
        deflater53.reset();
        java.util.zip.Deflater deflater57 = new java.util.zip.Deflater((int) (byte) 1);
        deflater57.reset();
        int int59 = deflater57.getTotalIn();
        byte[] byteArray66 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater57.setInput(byteArray66);
        deflater53.setDictionary(byteArray66);
        deflater30.setInput(byteArray66, 3, 3);
        deflater24.setDictionary(byteArray66);
        // The following exception was thrown during execution in test generation
        try {
            int int76 = deflater1.deflate(byteArray66, (int) 'a', (int) (byte) -1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[1, 1, 10, -1, -1, 1]");
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        long long3 = deflater1.getBytesWritten();
        long long4 = deflater1.getBytesWritten();
        boolean boolean5 = deflater1.finished();
        boolean boolean6 = deflater1.finished();
        int int7 = deflater1.getTotalIn();
        deflater1.reset();
        int int9 = deflater1.getAdler();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
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
        int int19 = deflater1.getTotalIn();
        deflater1.end();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
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
        deflater1.setLevel((int) (short) 0);
        deflater1.reset();
        long long61 = deflater1.getBytesWritten();
        long long62 = deflater1.getBytesWritten();
        boolean boolean63 = deflater1.needsInput();
        deflater1.finish();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[120, 1, 99, 100, -28, -6]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 6 + "'", int55 == 6);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 6 + "'", int57 == 6);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
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
        int int59 = deflater1.getAdler();
        deflater1.finish();
        long long61 = deflater1.getBytesRead();
        int int62 = deflater1.getTotalOut();
        boolean boolean63 = deflater1.finished();
        java.util.zip.Deflater deflater65 = new java.util.zip.Deflater((int) (byte) 1);
        deflater65.reset();
        int int67 = deflater65.getTotalIn();
        int int68 = deflater65.getTotalIn();
        int int69 = deflater65.getTotalIn();
        long long70 = deflater65.getBytesWritten();
        int int71 = deflater65.getTotalOut();
        long long72 = deflater65.getBytesWritten();
        java.util.zip.Deflater deflater75 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater77 = new java.util.zip.Deflater((int) (byte) 1);
        deflater77.reset();
        java.util.zip.Deflater deflater80 = new java.util.zip.Deflater((int) (byte) 1);
        deflater80.reset();
        int int82 = deflater80.getTotalIn();
        byte[] byteArray89 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater80.setInput(byteArray89);
        deflater77.setInput(byteArray89);
        deflater75.setInput(byteArray89);
        int int93 = deflater65.deflate(byteArray89);
        // The following exception was thrown during execution in test generation
        try {
            deflater1.setDictionary(byteArray89, (int) '4', 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[120, 1, 99, 100, -28, -6]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 6 + "'", int55 == 6);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 6 + "'", int57 == 6);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 6 + "'", int58 == 6);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 87360012 + "'", int59 == 87360012);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 6L + "'", long61 == 6L);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 6 + "'", int62 == 6);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray89), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesRead();
        long long3 = deflater1.getBytesRead();
        boolean boolean4 = deflater1.finished();
        long long5 = deflater1.getBytesWritten();
        deflater1.end();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
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
        deflater1.finish();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 118882828 + "'", int62 == 118882828);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
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
        deflater1.reset();
        java.util.zip.Deflater deflater60 = new java.util.zip.Deflater((int) (short) -1, false);
        long long61 = deflater60.getBytesWritten();
        java.util.zip.Deflater deflater63 = new java.util.zip.Deflater((int) (byte) 1);
        deflater63.reset();
        int int65 = deflater63.getTotalIn();
        byte[] byteArray72 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater63.setInput(byteArray72);
        deflater60.setDictionary(byteArray72);
        int int75 = deflater1.deflate(byteArray72);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 87360012 + "'", int54 == 87360012);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
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
        int int26 = deflater2.getTotalOut();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
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
        deflater1.setLevel(2);
        deflater1.finish();
        long long51 = deflater1.getBytesWritten();
        boolean boolean52 = deflater1.needsInput();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater(0);
        long long2 = deflater1.getBytesWritten();
        deflater1.setStrategy((int) (byte) 1);
        long long5 = deflater1.getBytesRead();
        deflater1.finish();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(2, true);
        long long3 = deflater2.getBytesRead();
        int int4 = deflater2.getAdler();
        deflater2.reset();
        int int6 = deflater2.getAdler();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
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
        int int69 = deflater1.getAdler();
        long long70 = deflater1.getBytesRead();
        deflater1.end();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 118882828 + "'", int62 == 118882828);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 118882828 + "'", int69 == 118882828);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
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
        deflater1.setStrategy(2);
        int int19 = deflater1.getTotalOut();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
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
        deflater1.setLevel(8);
        deflater1.reset();
        byte[] byteArray65 = new byte[] { (byte) 10, (byte) 100, (byte) 1 };
        deflater1.setDictionary(byteArray65);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[120, 1, 99, 100, -28, -6]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 6 + "'", int55 == 6);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 6 + "'", int57 == 6);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[10, 100, 1]");
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
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
        deflater2.reset();
        boolean boolean71 = deflater2.finished();
        byte[] byteArray72 = null;
        // The following exception was thrown during execution in test generation
        try {
            deflater2.setInput(byteArray72, 100, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (byte) -1, true);
        int int3 = deflater2.getTotalOut();
        deflater2.setLevel((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        int int13 = deflater1.getTotalIn();
        deflater1.reset();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        deflater1.reset();
        long long14 = deflater1.getBytesRead();
        boolean boolean15 = deflater1.needsInput();
        deflater1.reset();
        int int17 = deflater1.getTotalOut();
        deflater1.finish();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
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
        long long20 = deflater1.getBytesWritten();
        int int21 = deflater1.getTotalIn();
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
        deflater24.setStrategy(0);
        boolean boolean44 = deflater24.needsInput();
        java.util.zip.Deflater deflater47 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater49 = new java.util.zip.Deflater((int) (byte) 1);
        deflater49.reset();
        java.util.zip.Deflater deflater52 = new java.util.zip.Deflater((int) (byte) 1);
        deflater52.reset();
        int int54 = deflater52.getTotalIn();
        byte[] byteArray61 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater52.setInput(byteArray61);
        deflater49.setInput(byteArray61);
        deflater47.setInput(byteArray61);
        deflater24.setInput(byteArray61);
        java.util.zip.Deflater deflater67 = new java.util.zip.Deflater((int) (byte) 1);
        deflater67.reset();
        int int69 = deflater67.getTotalIn();
        byte[] byteArray76 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater67.setInput(byteArray76);
        deflater67.finish();
        long long79 = deflater67.getBytesRead();
        deflater67.reset();
        byte[] byteArray87 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater67.setInput(byteArray87, (int) (short) 0, (int) (short) 1);
        deflater24.setInput(byteArray87);
        int int92 = deflater1.deflate(byteArray87);
        long long93 = deflater1.getBytesRead();
        int int94 = deflater1.getAdler();
        long long95 = deflater1.getBytesWritten();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 0L + "'", long79 == 0L);
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray87), "[120, 1, 99, 100, -28, -6]");
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 6 + "'", int92 == 6);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 6L + "'", long93 == 6L);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 87360012 + "'", int94 == 87360012);
        org.junit.Assert.assertTrue("'" + long95 + "' != '" + 6L + "'", long95 == 6L);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
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
        int int25 = deflater2.getAdler();
        boolean boolean26 = deflater2.finished();
        int int27 = deflater2.getAdler();
        deflater2.finish();
        long long29 = deflater2.getBytesRead();
        java.util.zip.Deflater deflater32 = new java.util.zip.Deflater((int) (short) -1, true);
        deflater32.setLevel((-1));
        boolean boolean35 = deflater32.needsInput();
        deflater32.finish();
        deflater32.reset();
        java.util.zip.Deflater deflater39 = new java.util.zip.Deflater((int) (byte) 1);
        deflater39.reset();
        int int41 = deflater39.getTotalIn();
        int int42 = deflater39.getTotalIn();
        deflater39.reset();
        java.util.zip.Deflater deflater45 = new java.util.zip.Deflater((int) (byte) 1);
        deflater45.reset();
        int int47 = deflater45.getTotalIn();
        byte[] byteArray54 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater45.setInput(byteArray54);
        int int56 = deflater45.getAdler();
        java.util.zip.Deflater deflater59 = new java.util.zip.Deflater((int) (short) -1, false);
        int int60 = deflater59.getTotalIn();
        int int61 = deflater59.getTotalIn();
        boolean boolean62 = deflater59.finished();
        java.util.zip.Deflater deflater64 = new java.util.zip.Deflater((int) (byte) 1);
        deflater64.reset();
        int int66 = deflater64.getAdler();
        java.util.zip.Deflater deflater68 = new java.util.zip.Deflater((int) (byte) 1);
        deflater68.reset();
        int int70 = deflater68.getTotalIn();
        byte[] byteArray77 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater68.setInput(byteArray77);
        deflater64.setInput(byteArray77, 0, 0);
        int int82 = deflater59.deflate(byteArray77);
        int int85 = deflater45.deflate(byteArray77, 0, (int) (short) 0);
        int int86 = deflater39.deflate(byteArray77);
        int int87 = deflater32.deflate(byteArray77);
        // The following exception was thrown during execution in test generation
        try {
            deflater2.setDictionary(byteArray77, 118882828, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray77), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        long long3 = deflater1.getBytesWritten();
        deflater1.setLevel((int) (byte) 0);
        deflater1.reset();
        deflater1.reset();
        int int8 = deflater1.getAdler();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        int int6 = deflater4.getTotalIn();
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater4.setInput(byteArray13);
        deflater1.setInput(byteArray13);
        deflater1.setLevel((int) (byte) -1);
        deflater1.finish();
        int int19 = deflater1.getTotalIn();
        deflater1.reset();
        long long21 = deflater1.getBytesWritten();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
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
        java.lang.Class<?> wildcardClass69 = deflater1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater(0);
        int int2 = deflater1.getAdler();
        boolean boolean3 = deflater1.needsInput();
        int int4 = deflater1.getTotalOut();
        long long5 = deflater1.getBytesRead();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
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
        java.util.zip.Deflater deflater63 = new java.util.zip.Deflater((int) (byte) 1);
        deflater63.reset();
        int int65 = deflater63.getTotalIn();
        deflater63.finish();
        java.util.zip.Deflater deflater68 = new java.util.zip.Deflater((int) (byte) 1);
        deflater68.reset();
        int int70 = deflater68.getTotalIn();
        byte[] byteArray77 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater68.setInput(byteArray77);
        deflater63.setInput(byteArray77);
        deflater1.setInput(byteArray77);
        int int81 = deflater1.getTotalOut();
        int int82 = deflater1.getTotalOut();
        int int83 = deflater1.getTotalOut();
        deflater1.finish();
        int int85 = deflater1.getTotalOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[120, 1, 99, 100, -28, -6]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 6 + "'", int58 == 6);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray77), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(6, false);
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 0, false);
        boolean boolean6 = deflater5.needsInput();
        long long7 = deflater5.getBytesWritten();
        java.util.zip.Deflater deflater9 = new java.util.zip.Deflater((int) (byte) 1);
        deflater9.reset();
        int int11 = deflater9.getTotalIn();
        int int12 = deflater9.getTotalIn();
        int int13 = deflater9.getTotalIn();
        long long14 = deflater9.getBytesWritten();
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
        deflater16.reset();
        deflater16.reset();
        java.util.zip.Deflater deflater43 = new java.util.zip.Deflater((int) (byte) 1);
        long long44 = deflater43.getBytesWritten();
        int int45 = deflater43.getTotalOut();
        long long46 = deflater43.getBytesWritten();
        java.util.zip.Deflater deflater48 = new java.util.zip.Deflater((int) (byte) 1);
        deflater48.reset();
        deflater48.reset();
        java.util.zip.Deflater deflater52 = new java.util.zip.Deflater((int) (byte) 1);
        deflater52.reset();
        int int54 = deflater52.getTotalIn();
        byte[] byteArray61 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater52.setInput(byteArray61);
        deflater48.setDictionary(byteArray61);
        deflater43.setDictionary(byteArray61);
        deflater16.setInput(byteArray61);
        deflater9.setDictionary(byteArray61, 2, (int) (short) 0);
        deflater5.setInput(byteArray61);
        int int70 = deflater2.deflate(byteArray61);
        deflater2.reset();
        deflater2.reset();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
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
        java.util.zip.Deflater deflater21 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater23 = new java.util.zip.Deflater((int) (byte) 1);
        deflater23.reset();
        java.util.zip.Deflater deflater26 = new java.util.zip.Deflater((int) (byte) 1);
        deflater26.reset();
        int int28 = deflater26.getTotalIn();
        byte[] byteArray35 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater26.setInput(byteArray35);
        deflater23.setInput(byteArray35);
        deflater21.setInput(byteArray35);
        deflater21.setStrategy(0);
        boolean boolean41 = deflater21.needsInput();
        java.util.zip.Deflater deflater44 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater46 = new java.util.zip.Deflater((int) (byte) 1);
        deflater46.reset();
        java.util.zip.Deflater deflater49 = new java.util.zip.Deflater((int) (byte) 1);
        deflater49.reset();
        int int51 = deflater49.getTotalIn();
        byte[] byteArray58 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater49.setInput(byteArray58);
        deflater46.setInput(byteArray58);
        deflater44.setInput(byteArray58);
        deflater21.setInput(byteArray58);
        deflater5.setDictionary(byteArray58);
        int int64 = deflater1.deflate(byteArray58);
        long long65 = deflater1.getBytesRead();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        long long3 = deflater1.getBytesWritten();
        long long4 = deflater1.getBytesWritten();
        boolean boolean5 = deflater1.finished();
        boolean boolean6 = deflater1.finished();
        int int7 = deflater1.getTotalIn();
        deflater1.reset();
        long long9 = deflater1.getBytesRead();
        deflater1.finish();
        int int11 = deflater1.getTotalIn();
        long long12 = deflater1.getBytesRead();
        int int13 = deflater1.getTotalOut();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
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
        long long19 = deflater1.getBytesRead();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(2, true);
        long long3 = deflater2.getBytesRead();
        long long4 = deflater2.getBytesWritten();
        java.util.zip.Deflater deflater6 = new java.util.zip.Deflater((int) (byte) 1);
        deflater6.reset();
        int int8 = deflater6.getTotalIn();
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater6.setInput(byteArray15);
        deflater6.finish();
        long long18 = deflater6.getBytesRead();
        deflater6.reset();
        int int20 = deflater6.getAdler();
        boolean boolean21 = deflater6.needsInput();
        int int22 = deflater6.getTotalIn();
        deflater6.reset();
        int int24 = deflater6.getAdler();
        long long25 = deflater6.getBytesWritten();
        java.util.zip.Deflater deflater27 = new java.util.zip.Deflater((int) (byte) 1);
        long long28 = deflater27.getBytesWritten();
        long long29 = deflater27.getBytesWritten();
        deflater27.setLevel((int) (byte) 0);
        deflater27.reset();
        java.util.zip.Deflater deflater35 = new java.util.zip.Deflater((int) (short) -1, false);
        long long36 = deflater35.getBytesWritten();
        java.util.zip.Deflater deflater38 = new java.util.zip.Deflater((int) (byte) 1);
        deflater38.reset();
        int int40 = deflater38.getTotalIn();
        byte[] byteArray47 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater38.setInput(byteArray47);
        deflater35.setDictionary(byteArray47);
        deflater27.setInput(byteArray47);
        deflater6.setInput(byteArray47);
        deflater2.setDictionary(byteArray47);
        int int53 = deflater2.getTotalIn();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
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
        deflater1.finish();
        long long57 = deflater1.getBytesWritten();
        deflater1.setLevel(1);
        long long60 = deflater1.getBytesWritten();
        long long61 = deflater1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            deflater1.setLevel(411894807);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid compression level");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
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
        deflater2.setStrategy((int) (short) 1);
        int int73 = deflater2.getTotalOut();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
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
        long long20 = deflater1.getBytesWritten();
        deflater1.reset();
        int int22 = deflater1.getAdler();
        java.util.zip.Deflater deflater24 = new java.util.zip.Deflater((int) (byte) 1);
        deflater24.reset();
        deflater24.reset();
        java.util.zip.Deflater deflater28 = new java.util.zip.Deflater((int) (byte) 1);
        deflater28.reset();
        int int30 = deflater28.getTotalIn();
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater28.setInput(byteArray37);
        deflater24.setDictionary(byteArray37);
        deflater1.setInput(byteArray37, 3, 3);
        long long43 = deflater1.getBytesWritten();
        deflater1.finish();
        deflater1.reset();
        boolean boolean46 = deflater1.finished();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        java.util.zip.Deflater deflater0 = new java.util.zip.Deflater();
        deflater0.end();
        deflater0.setLevel((int) (short) 1);
        java.util.zip.Deflater deflater6 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater8 = new java.util.zip.Deflater((int) (byte) 1);
        deflater8.reset();
        java.util.zip.Deflater deflater11 = new java.util.zip.Deflater((int) (byte) 1);
        deflater11.reset();
        int int13 = deflater11.getTotalIn();
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater11.setInput(byteArray20);
        deflater8.setInput(byteArray20);
        deflater6.setInput(byteArray20);
        deflater6.setStrategy(0);
        boolean boolean26 = deflater6.needsInput();
        long long27 = deflater6.getBytesWritten();
        long long28 = deflater6.getBytesRead();
        long long29 = deflater6.getBytesWritten();
        boolean boolean30 = deflater6.needsInput();
        long long31 = deflater6.getBytesWritten();
        java.util.zip.Deflater deflater33 = new java.util.zip.Deflater((int) (byte) 1);
        deflater33.reset();
        int int35 = deflater33.getTotalIn();
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater33.setInput(byteArray42);
        int int44 = deflater6.deflate(byteArray42);
        deflater0.setInput(byteArray42);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        deflater1.finish();
        deflater1.reset();
        boolean boolean7 = deflater1.finished();
        deflater1.reset();
        // The following exception was thrown during execution in test generation
        try {
            deflater1.setLevel(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid compression level");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
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
        int int23 = deflater2.getTotalIn();
        int int24 = deflater2.getAdler();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        int int2 = deflater1.getTotalOut();
        int int3 = deflater1.getAdler();
        java.util.zip.Deflater deflater6 = new java.util.zip.Deflater((int) (short) 0, true);
        boolean boolean7 = deflater6.needsInput();
        long long8 = deflater6.getBytesWritten();
        int int9 = deflater6.getTotalOut();
        java.util.zip.Deflater deflater12 = new java.util.zip.Deflater((int) (short) 1, false);
        int int13 = deflater12.getAdler();
        java.util.zip.Deflater deflater16 = new java.util.zip.Deflater((int) (short) -1, false);
        int int17 = deflater16.getTotalIn();
        int int18 = deflater16.getTotalIn();
        boolean boolean19 = deflater16.finished();
        deflater16.end();
        deflater16.setLevel((int) (short) -1);
        java.util.zip.Deflater deflater24 = new java.util.zip.Deflater((int) (byte) 1);
        deflater24.reset();
        int int26 = deflater24.getTotalIn();
        byte[] byteArray33 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater24.setInput(byteArray33);
        deflater24.finish();
        long long36 = deflater24.getBytesRead();
        deflater24.reset();
        int int38 = deflater24.getTotalIn();
        deflater24.finish();
        java.util.zip.Deflater deflater42 = new java.util.zip.Deflater(3, true);
        int int43 = deflater42.getAdler();
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
        deflater42.setDictionary(byteArray86);
        deflater24.setInput(byteArray86);
        deflater16.setInput(byteArray86);
        int int95 = deflater12.deflate(byteArray86);
        int int96 = deflater6.deflate(byteArray86);
        int int97 = deflater1.deflate(byteArray86);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray86), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater(0);
        int int2 = deflater1.getAdler();
        boolean boolean3 = deflater1.needsInput();
        boolean boolean4 = deflater1.finished();
        boolean boolean5 = deflater1.needsInput();
        long long6 = deflater1.getBytesWritten();
        deflater1.end();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
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
        boolean boolean91 = deflater2.needsInput();
        int int92 = deflater2.getTotalIn();
        long long93 = deflater2.getBytesRead();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray85), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 6 + "'", int92 == 6);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 6L + "'", long93 == 6L);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (byte) 0, false);
        boolean boolean3 = deflater2.needsInput();
        long long4 = deflater2.getBytesWritten();
        deflater2.finish();
        boolean boolean6 = deflater2.needsInput();
        java.util.zip.Deflater deflater9 = new java.util.zip.Deflater((int) (byte) 0, false);
        boolean boolean10 = deflater9.needsInput();
        int int11 = deflater9.getTotalOut();
        java.util.zip.Deflater deflater13 = new java.util.zip.Deflater((int) (byte) 1);
        long long14 = deflater13.getBytesWritten();
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
        deflater13.setInput(byteArray51);
        deflater9.setDictionary(byteArray51);
        deflater2.setDictionary(byteArray51);
        long long59 = deflater2.getBytesWritten();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
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
        long long11 = deflater1.getBytesWritten();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) 1, true);
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((-1));
        boolean boolean5 = deflater4.finished();
        int int6 = deflater4.getAdler();
        java.util.zip.Deflater deflater9 = new java.util.zip.Deflater((-1), true);
        long long10 = deflater9.getBytesWritten();
        deflater9.setLevel(2);
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
        deflater9.setInput(byteArray49);
        long long55 = deflater9.getBytesRead();
        java.util.zip.Deflater deflater57 = new java.util.zip.Deflater((int) (byte) 1);
        deflater57.reset();
        deflater57.reset();
        java.util.zip.Deflater deflater61 = new java.util.zip.Deflater((int) (byte) 1);
        deflater61.reset();
        int int63 = deflater61.getTotalIn();
        byte[] byteArray70 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater61.setInput(byteArray70);
        deflater57.setDictionary(byteArray70);
        deflater9.setInput(byteArray70);
        deflater4.setDictionary(byteArray70);
        // The following exception was thrown during execution in test generation
        try {
            deflater2.setDictionary(byteArray70, 3, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[1, 1, 10, -1, -1, 1]");
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        deflater2.finish();
        long long4 = deflater2.getBytesRead();
        int int5 = deflater2.getTotalIn();
        int int6 = deflater2.getAdler();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        deflater1.reset();
        boolean boolean5 = deflater1.finished();
        int int6 = deflater1.getTotalOut();
        boolean boolean7 = deflater1.finished();
        long long8 = deflater1.getBytesRead();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (byte) 1, true);
        int int3 = deflater2.getTotalOut();
        boolean boolean4 = deflater2.needsInput();
        deflater2.setStrategy(0);
        java.util.zip.Deflater deflater8 = new java.util.zip.Deflater((int) (byte) 1);
        deflater8.reset();
        int int10 = deflater8.getTotalIn();
        int int11 = deflater8.getTotalIn();
        deflater8.finish();
        deflater8.reset();
        java.util.zip.Deflater deflater15 = new java.util.zip.Deflater((int) (byte) 1);
        deflater15.reset();
        int int17 = deflater15.getTotalIn();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater15.setInput(byteArray24);
        deflater8.setInput(byteArray24);
        deflater8.finish();
        int int28 = deflater8.getAdler();
        int int29 = deflater8.getTotalIn();
        int int30 = deflater8.getAdler();
        java.util.zip.Deflater deflater32 = new java.util.zip.Deflater((int) (byte) 1);
        deflater32.reset();
        deflater32.reset();
        long long35 = deflater32.getBytesWritten();
        java.util.zip.Deflater deflater37 = new java.util.zip.Deflater((int) (byte) 1);
        deflater37.reset();
        int int39 = deflater37.getTotalIn();
        deflater37.finish();
        int int41 = deflater37.getTotalOut();
        java.util.zip.Deflater deflater43 = new java.util.zip.Deflater((int) (byte) 1);
        deflater43.reset();
        int int45 = deflater43.getTotalIn();
        deflater43.finish();
        long long47 = deflater43.getBytesWritten();
        java.util.zip.Deflater deflater49 = new java.util.zip.Deflater((int) (byte) 1);
        long long50 = deflater49.getBytesRead();
        long long51 = deflater49.getBytesRead();
        long long52 = deflater49.getBytesWritten();
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
        deflater49.setInput(byteArray74);
        deflater43.setInput(byteArray74);
        deflater37.setDictionary(byteArray74);
        int int81 = deflater32.deflate(byteArray74);
        deflater8.setInput(byteArray74);
        int int85 = deflater2.deflate(byteArray74, 2, 2);
        int int86 = deflater2.getTotalOut();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        long long3 = deflater1.getBytesWritten();
        long long4 = deflater1.getBytesWritten();
        boolean boolean5 = deflater1.finished();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        int int10 = deflater7.getTotalIn();
        deflater7.finish();
        int int12 = deflater7.getTotalOut();
        boolean boolean13 = deflater7.finished();
        java.util.zip.Deflater deflater15 = new java.util.zip.Deflater((int) (byte) 1);
        deflater15.reset();
        deflater15.reset();
        java.util.zip.Deflater deflater19 = new java.util.zip.Deflater((int) (byte) 1);
        deflater19.reset();
        int int21 = deflater19.getTotalIn();
        byte[] byteArray28 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater19.setInput(byteArray28);
        deflater15.setDictionary(byteArray28);
        int int31 = deflater15.getAdler();
        int int32 = deflater15.getAdler();
        deflater15.reset();
        java.util.zip.Deflater deflater35 = new java.util.zip.Deflater((int) (byte) 1);
        long long36 = deflater35.getBytesWritten();
        long long37 = deflater35.getBytesWritten();
        java.util.zip.Deflater deflater39 = new java.util.zip.Deflater((int) (byte) 1);
        deflater39.reset();
        int int41 = deflater39.getTotalIn();
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater39.setInput(byteArray48);
        deflater39.finish();
        long long51 = deflater39.getBytesRead();
        deflater39.reset();
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
        deflater39.setDictionary(byteArray74);
        deflater35.setInput(byteArray74);
        deflater15.setInput(byteArray74);
        int int81 = deflater7.deflate(byteArray74);
        int int82 = deflater1.deflate(byteArray74);
        long long83 = deflater1.getBytesWritten();
        deflater1.setStrategy(0);
        deflater1.finish();
        long long87 = deflater1.getBytesRead();
        deflater1.finish();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 87360012 + "'", int31 == 87360012);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 87360012 + "'", int32 == 87360012);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[120, 1, 3, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 6 + "'", int81 == 6);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 0L + "'", long87 == 0L);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
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
        boolean boolean67 = deflater1.finished();
        int int68 = deflater1.getAdler();
        int int69 = deflater1.getAdler();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((-1));
        deflater1.reset();
        long long3 = deflater1.getBytesWritten();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) 1);
        deflater5.reset();
        int int7 = deflater5.getTotalIn();
        int int8 = deflater5.getTotalIn();
        int int9 = deflater5.getTotalIn();
        long long10 = deflater5.getBytesWritten();
        java.util.zip.Deflater deflater12 = new java.util.zip.Deflater((int) (byte) 1);
        deflater12.reset();
        int int14 = deflater12.getTotalIn();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater12.setInput(byteArray21);
        deflater12.finish();
        long long24 = deflater12.getBytesRead();
        deflater12.reset();
        byte[] byteArray32 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater12.setInput(byteArray32, (int) (short) 0, (int) (short) 1);
        deflater12.reset();
        deflater12.reset();
        java.util.zip.Deflater deflater39 = new java.util.zip.Deflater((int) (byte) 1);
        long long40 = deflater39.getBytesWritten();
        int int41 = deflater39.getTotalOut();
        long long42 = deflater39.getBytesWritten();
        java.util.zip.Deflater deflater44 = new java.util.zip.Deflater((int) (byte) 1);
        deflater44.reset();
        deflater44.reset();
        java.util.zip.Deflater deflater48 = new java.util.zip.Deflater((int) (byte) 1);
        deflater48.reset();
        int int50 = deflater48.getTotalIn();
        byte[] byteArray57 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater48.setInput(byteArray57);
        deflater44.setDictionary(byteArray57);
        deflater39.setDictionary(byteArray57);
        deflater12.setInput(byteArray57);
        deflater5.setDictionary(byteArray57, 2, (int) (short) 0);
        int int65 = deflater1.deflate(byteArray57);
        byte[] byteArray66 = null;
        // The following exception was thrown during execution in test generation
        try {
            deflater1.setDictionary(byteArray66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(3, true);
        deflater2.reset();
        deflater2.setStrategy(0);
        deflater2.finish();
        boolean boolean7 = deflater2.finished();
        boolean boolean8 = deflater2.needsInput();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        deflater1.finish();
        int int5 = deflater1.getTotalIn();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        deflater7.finish();
        long long11 = deflater7.getBytesRead();
        java.util.zip.Deflater deflater13 = new java.util.zip.Deflater((int) (byte) 1);
        deflater13.reset();
        int int15 = deflater13.getTotalIn();
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater13.setInput(byteArray22);
        deflater13.reset();
        boolean boolean25 = deflater13.needsInput();
        java.util.zip.Deflater deflater27 = new java.util.zip.Deflater((int) (byte) 1);
        deflater27.reset();
        int int29 = deflater27.getTotalIn();
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater27.setInput(byteArray36);
        int int38 = deflater13.deflate(byteArray36);
        int int39 = deflater7.deflate(byteArray36);
        int int40 = deflater1.deflate(byteArray36);
        boolean boolean41 = deflater1.needsInput();
        deflater1.reset();
        int int43 = deflater1.getTotalOut();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[120, 1, 3, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 6 + "'", int39 == 6);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 6 + "'", int40 == 6);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(3, true);
        int int3 = deflater2.getAdler();
        deflater2.setStrategy(0);
        int int6 = deflater2.getTotalOut();
        int int7 = deflater2.getTotalIn();
        java.util.zip.Deflater deflater9 = new java.util.zip.Deflater((int) (byte) 1);
        deflater9.reset();
        int int11 = deflater9.getTotalIn();
        int int12 = deflater9.getTotalIn();
        deflater9.finish();
        deflater9.reset();
        java.util.zip.Deflater deflater16 = new java.util.zip.Deflater((int) (byte) 1);
        deflater16.reset();
        int int18 = deflater16.getTotalIn();
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater16.setInput(byteArray25);
        deflater9.setInput(byteArray25);
        deflater9.finish();
        int int29 = deflater9.getAdler();
        java.util.zip.Deflater deflater31 = new java.util.zip.Deflater((int) (byte) 1);
        deflater31.reset();
        int int33 = deflater31.getTotalIn();
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater31.setInput(byteArray40);
        deflater31.finish();
        long long43 = deflater31.getBytesRead();
        deflater31.reset();
        java.util.zip.Deflater deflater47 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater49 = new java.util.zip.Deflater((int) (byte) 1);
        deflater49.reset();
        java.util.zip.Deflater deflater52 = new java.util.zip.Deflater((int) (byte) 1);
        deflater52.reset();
        int int54 = deflater52.getTotalIn();
        byte[] byteArray61 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater52.setInput(byteArray61);
        deflater49.setInput(byteArray61);
        deflater47.setInput(byteArray61);
        deflater47.setStrategy(0);
        boolean boolean67 = deflater47.needsInput();
        java.util.zip.Deflater deflater70 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater72 = new java.util.zip.Deflater((int) (byte) 1);
        deflater72.reset();
        java.util.zip.Deflater deflater75 = new java.util.zip.Deflater((int) (byte) 1);
        deflater75.reset();
        int int77 = deflater75.getTotalIn();
        byte[] byteArray84 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater75.setInput(byteArray84);
        deflater72.setInput(byteArray84);
        deflater70.setInput(byteArray84);
        deflater47.setInput(byteArray84);
        deflater31.setDictionary(byteArray84);
        deflater9.setDictionary(byteArray84);
        int int91 = deflater2.deflate(byteArray84);
        deflater2.reset();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray84), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        int int6 = deflater4.getTotalIn();
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater4.setInput(byteArray13);
        deflater1.setInput(byteArray13);
        int int16 = deflater1.getTotalIn();
        long long17 = deflater1.getBytesWritten();
        deflater1.setStrategy(0);
        int int20 = deflater1.getTotalOut();
        deflater1.reset();
        int int22 = deflater1.getTotalIn();
        int int23 = deflater1.getTotalOut();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        int int6 = deflater4.getTotalIn();
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater4.setInput(byteArray13);
        deflater1.setInput(byteArray13);
        deflater1.setLevel((int) (byte) -1);
        long long18 = deflater1.getBytesWritten();
        long long19 = deflater1.getBytesWritten();
        java.util.zip.Deflater deflater21 = new java.util.zip.Deflater((int) (byte) 1);
        deflater21.reset();
        int int23 = deflater21.getTotalIn();
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater21.setInput(byteArray30);
        int int32 = deflater21.getAdler();
        boolean boolean33 = deflater21.needsInput();
        long long34 = deflater21.getBytesWritten();
        deflater21.finish();
        long long36 = deflater21.getBytesRead();
        deflater21.finish();
        java.util.zip.Deflater deflater39 = new java.util.zip.Deflater((int) (byte) 1);
        long long40 = deflater39.getBytesWritten();
        int int41 = deflater39.getTotalIn();
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
        int int83 = deflater39.deflate(byteArray78);
        deflater21.setDictionary(byteArray78);
        int int85 = deflater1.deflate(byteArray78);
        long long86 = deflater1.getBytesWritten();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 0L + "'", long86 == 0L);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(1, true);
        int int3 = deflater2.getAdler();
        boolean boolean4 = deflater2.finished();
        long long5 = deflater2.getBytesWritten();
        int int6 = deflater2.getTotalOut();
        int int7 = deflater2.getAdler();
        int int8 = deflater2.getTotalIn();
        int int9 = deflater2.getAdler();
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
        // The following exception was thrown during execution in test generation
        try {
            int int53 = deflater2.deflate(byteArray46, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[1, 1, -1, -1, 1, 10]");
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
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
        boolean boolean18 = deflater1.finished();
        long long19 = deflater1.getBytesRead();
        boolean boolean20 = deflater1.needsInput();
        int int21 = deflater1.getTotalOut();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((-1));
        boolean boolean2 = deflater1.finished();
        int int3 = deflater1.getAdler();
        boolean boolean4 = deflater1.finished();
        int int5 = deflater1.getTotalOut();
        long long6 = deflater1.getBytesRead();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
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
        deflater1.reset();
        long long58 = deflater1.getBytesRead();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 87360012 + "'", int54 == 87360012);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
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
        int int45 = deflater1.getTotalOut();
        int int46 = deflater1.getTotalOut();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
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
        int int54 = deflater2.getAdler();
        int int55 = deflater2.getTotalIn();
        java.util.zip.Deflater deflater58 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater60 = new java.util.zip.Deflater((int) (byte) 1);
        deflater60.reset();
        java.util.zip.Deflater deflater63 = new java.util.zip.Deflater((int) (byte) 1);
        deflater63.reset();
        int int65 = deflater63.getTotalIn();
        byte[] byteArray72 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater63.setInput(byteArray72);
        deflater60.setInput(byteArray72);
        deflater58.setInput(byteArray72);
        boolean boolean76 = deflater58.finished();
        boolean boolean77 = deflater58.finished();
        boolean boolean78 = deflater58.needsInput();
        java.util.zip.Deflater deflater80 = new java.util.zip.Deflater((int) (byte) 1);
        deflater80.reset();
        int int82 = deflater80.getAdler();
        java.util.zip.Deflater deflater84 = new java.util.zip.Deflater((int) (byte) 1);
        deflater84.reset();
        int int86 = deflater84.getTotalIn();
        byte[] byteArray93 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater84.setInput(byteArray93);
        deflater80.setInput(byteArray93);
        deflater58.setDictionary(byteArray93);
        deflater2.setInput(byteArray93);
        deflater2.reset();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 118882828 + "'", int54 == 118882828);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNotNull(byteArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray93), "[1, 1, 10, -1, -1, 1]");
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        int int6 = deflater4.getTotalIn();
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater4.setInput(byteArray13);
        deflater1.setInput(byteArray13);
        deflater1.setLevel((int) (byte) -1);
        deflater1.setLevel(0);
        boolean boolean20 = deflater1.finished();
        int int21 = deflater1.getAdler();
        int int22 = deflater1.getTotalIn();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        deflater1.reset();
        boolean boolean14 = deflater1.needsInput();
        boolean boolean15 = deflater1.needsInput();
        int int16 = deflater1.getTotalIn();
        int int17 = deflater1.getTotalOut();
        int int18 = deflater1.getTotalOut();
        java.util.zip.Deflater deflater20 = new java.util.zip.Deflater((int) (byte) 1);
        deflater20.reset();
        int int22 = deflater20.getTotalIn();
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater20.setInput(byteArray29);
        int int31 = deflater20.getAdler();
        deflater20.reset();
        java.util.zip.Deflater deflater35 = new java.util.zip.Deflater(1, true);
        boolean boolean36 = deflater35.needsInput();
        int int37 = deflater35.getAdler();
        deflater35.reset();
        byte[] byteArray45 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) 1 };
        deflater35.setInput(byteArray45, 1, 0);
        deflater20.setDictionary(byteArray45);
        int int50 = deflater1.deflate(byteArray45);
        int int51 = deflater1.getTotalOut();
        deflater1.setStrategy(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(1, true);
        boolean boolean3 = deflater2.needsInput();
        int int4 = deflater2.getTotalOut();
        deflater2.finish();
        long long6 = deflater2.getBytesWritten();
        java.util.zip.Deflater deflater8 = new java.util.zip.Deflater((int) (byte) -1);
        boolean boolean9 = deflater8.finished();
        java.util.zip.Deflater deflater11 = new java.util.zip.Deflater((int) (byte) 1);
        deflater11.reset();
        int int13 = deflater11.getTotalIn();
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater11.setInput(byteArray20);
        deflater11.finish();
        long long23 = deflater11.getBytesRead();
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
        int int65 = deflater11.deflate(byteArray60);
        int int68 = deflater8.deflate(byteArray60, (int) (byte) 1, 2);
        java.util.zip.Deflater deflater70 = new java.util.zip.Deflater((int) (byte) 1);
        deflater70.reset();
        int int72 = deflater70.getTotalIn();
        deflater70.finish();
        java.util.zip.Deflater deflater75 = new java.util.zip.Deflater((int) (byte) 1);
        deflater75.reset();
        int int77 = deflater75.getTotalIn();
        byte[] byteArray84 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater75.setInput(byteArray84);
        deflater70.setInput(byteArray84);
        deflater8.setInput(byteArray84);
        deflater2.setInput(byteArray84);
        int int89 = deflater2.getTotalOut();
        deflater2.reset();
        deflater2.end();
        deflater2.finish();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[120, 1, 99, 100, -28, -6]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 6 + "'", int65 == 6);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray84), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
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
        int int49 = deflater2.getTotalIn();
        boolean boolean50 = deflater2.needsInput();
        boolean boolean51 = deflater2.finished();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), false);
        deflater2.setLevel(6);
        int int5 = deflater2.getTotalIn();
        int int6 = deflater2.getTotalOut();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((-1));
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater();
        deflater2.reset();
        long long4 = deflater2.getBytesRead();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (short) -1, false);
        long long8 = deflater7.getBytesWritten();
        java.util.zip.Deflater deflater10 = new java.util.zip.Deflater((int) (byte) 1);
        deflater10.reset();
        int int12 = deflater10.getTotalIn();
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater10.setInput(byteArray19);
        deflater7.setDictionary(byteArray19);
        int int22 = deflater7.getTotalOut();
        boolean boolean23 = deflater7.needsInput();
        java.util.zip.Deflater deflater26 = new java.util.zip.Deflater((-1), true);
        deflater26.finish();
        deflater26.finish();
        boolean boolean29 = deflater26.finished();
        deflater26.finish();
        java.util.zip.Deflater deflater31 = new java.util.zip.Deflater();
        deflater31.reset();
        long long33 = deflater31.getBytesWritten();
        int int34 = deflater31.getTotalIn();
        byte[] byteArray37 = new byte[] { (byte) 0, (byte) 1 };
        deflater31.setInput(byteArray37);
        deflater26.setInput(byteArray37);
        deflater7.setDictionary(byteArray37);
        int int41 = deflater2.deflate(byteArray37);
        // The following exception was thrown during execution in test generation
        try {
            deflater1.setInput(byteArray37, 10, 139789087);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        deflater1.reset();
        int int15 = deflater1.getAdler();
        long long16 = deflater1.getBytesRead();
        deflater1.finish();
        int int18 = deflater1.getAdler();
        int int19 = deflater1.getTotalIn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        long long13 = deflater1.getBytesRead();
        deflater1.reset();
        int int15 = deflater1.getTotalIn();
        int int16 = deflater1.getTotalIn();
        deflater1.setStrategy((int) (byte) 1);
        long long19 = deflater1.getBytesRead();
        java.util.zip.Deflater deflater22 = new java.util.zip.Deflater(1, true);
        deflater22.finish();
        deflater22.finish();
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
        long long45 = deflater26.getBytesWritten();
        deflater26.reset();
        int int47 = deflater26.getAdler();
        java.util.zip.Deflater deflater49 = new java.util.zip.Deflater((int) (byte) 1);
        deflater49.reset();
        deflater49.reset();
        java.util.zip.Deflater deflater53 = new java.util.zip.Deflater((int) (byte) 1);
        deflater53.reset();
        int int55 = deflater53.getTotalIn();
        byte[] byteArray62 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater53.setInput(byteArray62);
        deflater49.setDictionary(byteArray62);
        deflater26.setInput(byteArray62, 3, 3);
        int int68 = deflater22.deflate(byteArray62);
        int int71 = deflater1.deflate(byteArray62, 3, (int) (byte) 1);
        boolean boolean72 = deflater1.needsInput();
        deflater1.reset();
        int int74 = deflater1.getTotalOut();
        // The following exception was thrown during execution in test generation
        try {
            deflater1.setLevel((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid compression level");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[3, 0, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2 + "'", int68 == 2);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (short) -1);
        int int2 = deflater1.getTotalOut();
        boolean boolean3 = deflater1.needsInput();
        long long4 = deflater1.getBytesWritten();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getAdler();
        java.util.zip.Deflater deflater6 = new java.util.zip.Deflater(1, true);
        boolean boolean7 = deflater6.needsInput();
        int int8 = deflater6.getTotalOut();
        deflater6.finish();
        long long10 = deflater6.getBytesWritten();
        java.util.zip.Deflater deflater12 = new java.util.zip.Deflater((int) (byte) -1);
        boolean boolean13 = deflater12.finished();
        java.util.zip.Deflater deflater15 = new java.util.zip.Deflater((int) (byte) 1);
        deflater15.reset();
        int int17 = deflater15.getTotalIn();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater15.setInput(byteArray24);
        deflater15.finish();
        long long27 = deflater15.getBytesRead();
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
        int int69 = deflater15.deflate(byteArray64);
        int int72 = deflater12.deflate(byteArray64, (int) (byte) 1, 2);
        java.util.zip.Deflater deflater74 = new java.util.zip.Deflater((int) (byte) 1);
        deflater74.reset();
        int int76 = deflater74.getTotalIn();
        deflater74.finish();
        java.util.zip.Deflater deflater79 = new java.util.zip.Deflater((int) (byte) 1);
        deflater79.reset();
        int int81 = deflater79.getTotalIn();
        byte[] byteArray88 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater79.setInput(byteArray88);
        deflater74.setInput(byteArray88);
        deflater12.setInput(byteArray88);
        deflater6.setInput(byteArray88);
        deflater1.setDictionary(byteArray88);
        // The following exception was thrown during execution in test generation
        try {
            deflater1.setStrategy((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[120, 1, 99, 100, -28, -6]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 6 + "'", int69 == 6);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray88), "[1, 1, 10, -1, -1, 1]");
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
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
        boolean boolean19 = deflater1.finished();
        int int20 = deflater1.getAdler();
        // The following exception was thrown during execution in test generation
        try {
            deflater1.setLevel(87360012);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid compression level");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        int int3 = deflater1.getTotalOut();
        long long4 = deflater1.getBytesWritten();
        deflater1.reset();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        long long8 = deflater7.getBytesWritten();
        java.util.zip.Deflater deflater10 = new java.util.zip.Deflater((int) (byte) 1);
        deflater10.reset();
        int int12 = deflater10.getTotalIn();
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater10.setInput(byteArray19);
        deflater10.finish();
        long long22 = deflater10.getBytesRead();
        deflater10.reset();
        java.util.zip.Deflater deflater25 = new java.util.zip.Deflater((int) (byte) 1);
        deflater25.reset();
        int int27 = deflater25.getTotalIn();
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater25.setInput(byteArray34);
        deflater25.finish();
        long long37 = deflater25.getBytesRead();
        deflater25.reset();
        byte[] byteArray45 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater25.setInput(byteArray45, (int) (short) 0, (int) (short) 1);
        deflater10.setDictionary(byteArray45);
        deflater7.setInput(byteArray45);
        deflater1.setInput(byteArray45);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[1, 1, -1, -1, 1, 10]");
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        deflater1.reset();
        boolean boolean5 = deflater1.finished();
        int int6 = deflater1.getTotalOut();
        deflater1.reset();
        int int8 = deflater1.getTotalIn();
        deflater1.finish();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.reset();
        java.util.zip.Deflater deflater14 = new java.util.zip.Deflater((int) (byte) 1);
        deflater14.reset();
        deflater14.reset();
        deflater14.reset();
        java.util.zip.Deflater deflater19 = new java.util.zip.Deflater((int) (byte) 1);
        deflater19.reset();
        deflater19.reset();
        java.util.zip.Deflater deflater23 = new java.util.zip.Deflater((int) (byte) 1);
        deflater23.reset();
        int int25 = deflater23.getTotalIn();
        byte[] byteArray32 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater23.setInput(byteArray32);
        deflater19.setDictionary(byteArray32);
        int int35 = deflater14.deflate(byteArray32);
        deflater1.setDictionary(byteArray32);
        java.util.zip.Deflater deflater38 = new java.util.zip.Deflater((int) (byte) 1);
        deflater38.reset();
        int int40 = deflater38.getTotalIn();
        byte[] byteArray47 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater38.setInput(byteArray47);
        deflater38.finish();
        long long50 = deflater38.getBytesRead();
        deflater38.reset();
        java.util.zip.Deflater deflater53 = new java.util.zip.Deflater((int) (byte) 1);
        deflater53.reset();
        int int55 = deflater53.getTotalIn();
        byte[] byteArray62 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater53.setInput(byteArray62);
        deflater53.finish();
        long long65 = deflater53.getBytesRead();
        deflater53.reset();
        byte[] byteArray73 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater53.setInput(byteArray73, (int) (short) 0, (int) (short) 1);
        int int77 = deflater38.deflate(byteArray73);
        // The following exception was thrown during execution in test generation
        try {
            int int80 = deflater1.deflate(byteArray73, (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalOut();
        long long6 = deflater1.getBytesRead();
        int int7 = deflater1.getTotalIn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
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
        deflater1.setStrategy((int) (short) 1);
        java.util.zip.Deflater deflater24 = new java.util.zip.Deflater((int) (byte) 0, false);
        boolean boolean25 = deflater24.needsInput();
        int int26 = deflater24.getTotalOut();
        int int27 = deflater24.getTotalIn();
        deflater24.finish();
        long long29 = deflater24.getBytesRead();
        long long30 = deflater24.getBytesRead();
        java.util.zip.Deflater deflater33 = new java.util.zip.Deflater((-1), true);
        long long34 = deflater33.getBytesWritten();
        deflater33.setLevel(2);
        java.util.zip.Deflater deflater38 = new java.util.zip.Deflater((int) (byte) 1);
        deflater38.reset();
        int int40 = deflater38.getTotalIn();
        byte[] byteArray47 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater38.setInput(byteArray47);
        deflater38.finish();
        long long50 = deflater38.getBytesRead();
        deflater38.reset();
        java.util.zip.Deflater deflater53 = new java.util.zip.Deflater((int) (byte) 1);
        deflater53.reset();
        int int55 = deflater53.getTotalIn();
        byte[] byteArray62 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater53.setInput(byteArray62);
        deflater53.finish();
        long long65 = deflater53.getBytesRead();
        deflater53.reset();
        byte[] byteArray73 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater53.setInput(byteArray73, (int) (short) 0, (int) (short) 1);
        deflater38.setDictionary(byteArray73);
        deflater33.setInput(byteArray73);
        int int79 = deflater24.deflate(byteArray73);
        // The following exception was thrown during execution in test generation
        try {
            deflater1.setInput(byteArray73, (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[120, 1, 1, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 6 + "'", int79 == 6);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
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
        deflater1.setLevel((int) (short) 0);
        deflater1.reset();
        boolean boolean61 = deflater1.needsInput();
        boolean boolean62 = deflater1.needsInput();
        deflater1.end();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[120, 1, 99, 100, -28, -6]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 6 + "'", int55 == 6);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 6 + "'", int57 == 6);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
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
        int int91 = deflater2.getTotalOut();
        int int92 = deflater2.getAdler();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray85), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
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
        deflater2.reset();
        deflater2.reset();
        long long95 = deflater2.getBytesRead();
        deflater2.finish();
        deflater2.reset();
        int int98 = deflater2.getTotalOut();
        int int99 = deflater2.getTotalOut();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray85), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + long95 + "' != '" + 0L + "'", long95 == 0L);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 0 + "'", int99 == 0);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        deflater1.reset();
        boolean boolean5 = deflater1.finished();
        java.util.zip.Deflater deflater8 = new java.util.zip.Deflater(3, true);
        int int9 = deflater8.getAdler();
        java.util.zip.Deflater deflater12 = new java.util.zip.Deflater((-1), true);
        long long13 = deflater12.getBytesWritten();
        deflater12.setLevel(2);
        java.util.zip.Deflater deflater17 = new java.util.zip.Deflater((int) (byte) 1);
        deflater17.reset();
        int int19 = deflater17.getTotalIn();
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater17.setInput(byteArray26);
        deflater17.finish();
        long long29 = deflater17.getBytesRead();
        deflater17.reset();
        java.util.zip.Deflater deflater32 = new java.util.zip.Deflater((int) (byte) 1);
        deflater32.reset();
        int int34 = deflater32.getTotalIn();
        byte[] byteArray41 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater32.setInput(byteArray41);
        deflater32.finish();
        long long44 = deflater32.getBytesRead();
        deflater32.reset();
        byte[] byteArray52 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater32.setInput(byteArray52, (int) (short) 0, (int) (short) 1);
        deflater17.setDictionary(byteArray52);
        deflater12.setInput(byteArray52);
        deflater8.setDictionary(byteArray52);
        int int59 = deflater1.deflate(byteArray52);
        long long60 = deflater1.getBytesWritten();
        deflater1.setLevel((int) (byte) 1);
        int int63 = deflater1.getTotalIn();
        deflater1.finish();
        java.util.zip.Deflater deflater67 = new java.util.zip.Deflater((int) (short) -1, false);
        int int68 = deflater67.getTotalIn();
        int int69 = deflater67.getTotalIn();
        boolean boolean70 = deflater67.finished();
        deflater67.end();
        deflater67.setLevel((int) (short) -1);
        deflater67.end();
        boolean boolean75 = deflater67.finished();
        java.util.zip.Deflater deflater76 = new java.util.zip.Deflater();
        deflater76.reset();
        long long78 = deflater76.getBytesWritten();
        int int79 = deflater76.getTotalIn();
        byte[] byteArray82 = new byte[] { (byte) 0, (byte) 1 };
        deflater76.setInput(byteArray82);
        deflater67.setInput(byteArray82);
        int int85 = deflater1.deflate(byteArray82);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray82), "[120, 1]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 2 + "'", int85 == 2);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
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
        long long20 = deflater1.getBytesWritten();
        deflater1.reset();
        int int22 = deflater1.getAdler();
        int int23 = deflater1.getTotalIn();
        deflater1.reset();
        long long25 = deflater1.getBytesRead();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) -1);
        boolean boolean2 = deflater1.finished();
        deflater1.reset();
        boolean boolean4 = deflater1.finished();
        java.util.zip.Deflater deflater6 = new java.util.zip.Deflater((int) (byte) 1);
        deflater6.reset();
        int int8 = deflater6.getTotalIn();
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater6.setInput(byteArray15);
        deflater6.reset();
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
        deflater6.setInput(byteArray39);
        int int44 = deflater1.deflate(byteArray39);
        java.util.zip.Deflater deflater47 = new java.util.zip.Deflater(1, true);
        boolean boolean48 = deflater47.needsInput();
        int int49 = deflater47.getAdler();
        deflater47.reset();
        byte[] byteArray57 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) 1 };
        deflater47.setInput(byteArray57, 1, 0);
        deflater1.setDictionary(byteArray57);
        long long62 = deflater1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            deflater1.setStrategy((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(3, true);
        deflater2.reset();
        deflater2.setStrategy(0);
        int int6 = deflater2.getAdler();
        int int7 = deflater2.getTotalOut();
        java.util.zip.Deflater deflater9 = new java.util.zip.Deflater((int) (byte) 1);
        deflater9.reset();
        int int11 = deflater9.getTotalIn();
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater9.setInput(byteArray18);
        deflater9.reset();
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
        deflater9.setInput(byteArray42);
        boolean boolean47 = deflater9.finished();
        deflater9.finish();
        java.util.zip.Deflater deflater50 = new java.util.zip.Deflater((int) (byte) 1);
        deflater50.reset();
        int int52 = deflater50.getTotalIn();
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater50.setInput(byteArray59);
        int int61 = deflater9.deflate(byteArray59);
        deflater2.setDictionary(byteArray59);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[120, 1, 99, 100, -4, -1]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 6 + "'", int61 == 6);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (byte) 0, false);
        boolean boolean3 = deflater2.needsInput();
        int int4 = deflater2.getTotalOut();
        int int5 = deflater2.getTotalOut();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        int int10 = deflater7.getTotalIn();
        int int11 = deflater7.getTotalIn();
        long long12 = deflater7.getBytesWritten();
        int int13 = deflater7.getTotalOut();
        long long14 = deflater7.getBytesWritten();
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
        int int35 = deflater7.deflate(byteArray31);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = deflater2.deflate(byteArray31, 48693373, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        java.util.zip.Deflater deflater0 = new java.util.zip.Deflater();
        deflater0.reset();
        long long2 = deflater0.getBytesWritten();
        int int3 = deflater0.getTotalIn();
        java.util.zip.Deflater deflater5 = new java.util.zip.Deflater((int) (byte) -1);
        boolean boolean6 = deflater5.finished();
        java.util.zip.Deflater deflater8 = new java.util.zip.Deflater((int) (byte) 1);
        deflater8.reset();
        int int10 = deflater8.getTotalIn();
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater8.setInput(byteArray17);
        deflater8.finish();
        long long20 = deflater8.getBytesRead();
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
        int int62 = deflater8.deflate(byteArray57);
        int int65 = deflater5.deflate(byteArray57, (int) (byte) 1, 2);
        int int68 = deflater0.deflate(byteArray57, 0, 1);
        int int69 = deflater0.getTotalOut();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[120, 1, 99, 100, -28, -6]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 6 + "'", int62 == 6);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(3, true);
        deflater2.reset();
        deflater2.setStrategy(0);
        deflater2.end();
        deflater2.end();
        java.util.zip.Deflater deflater9 = new java.util.zip.Deflater((int) (byte) 1);
        deflater9.reset();
        int int11 = deflater9.getTotalIn();
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater9.setInput(byteArray18);
        deflater9.finish();
        long long21 = deflater9.getBytesRead();
        deflater9.reset();
        int int23 = deflater9.getTotalIn();
        deflater9.finish();
        java.util.zip.Deflater deflater27 = new java.util.zip.Deflater(3, true);
        int int28 = deflater27.getAdler();
        java.util.zip.Deflater deflater31 = new java.util.zip.Deflater((-1), true);
        long long32 = deflater31.getBytesWritten();
        deflater31.setLevel(2);
        java.util.zip.Deflater deflater36 = new java.util.zip.Deflater((int) (byte) 1);
        deflater36.reset();
        int int38 = deflater36.getTotalIn();
        byte[] byteArray45 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater36.setInput(byteArray45);
        deflater36.finish();
        long long48 = deflater36.getBytesRead();
        deflater36.reset();
        java.util.zip.Deflater deflater51 = new java.util.zip.Deflater((int) (byte) 1);
        deflater51.reset();
        int int53 = deflater51.getTotalIn();
        byte[] byteArray60 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater51.setInput(byteArray60);
        deflater51.finish();
        long long63 = deflater51.getBytesRead();
        deflater51.reset();
        byte[] byteArray71 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater51.setInput(byteArray71, (int) (short) 0, (int) (short) 1);
        deflater36.setDictionary(byteArray71);
        deflater31.setInput(byteArray71);
        deflater27.setDictionary(byteArray71);
        deflater9.setInput(byteArray71);
        // The following exception was thrown during execution in test generation
        try {
            deflater2.setInput(byteArray71, 10, 131074);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[1, 1, -1, -1, 1, 10]");
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        int int12 = deflater1.getAdler();
        boolean boolean13 = deflater1.needsInput();
        long long14 = deflater1.getBytesWritten();
        deflater1.finish();
        int int16 = deflater1.getAdler();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        int int6 = deflater4.getTotalIn();
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater4.setInput(byteArray13);
        deflater1.setInput(byteArray13);
        deflater1.setLevel((int) (byte) -1);
        deflater1.finish();
        int int19 = deflater1.getTotalOut();
        deflater1.reset();
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
        deflater23.end();
        java.util.zip.Deflater deflater46 = new java.util.zip.Deflater((int) (byte) 1);
        long long47 = deflater46.getBytesWritten();
        int int48 = deflater46.getTotalIn();
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
        int int90 = deflater46.deflate(byteArray85);
        deflater23.setInput(byteArray85);
        deflater1.setInput(byteArray85);
        int int93 = deflater1.getAdler();
        int int94 = deflater1.getTotalIn();
        int int95 = deflater1.getAdler();
        int int96 = deflater1.getAdler();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray85), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 1 + "'", int93 == 1);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 1 + "'", int95 == 1);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 1 + "'", int96 == 1);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) -1);
        boolean boolean2 = deflater1.finished();
        deflater1.finish();
        long long4 = deflater1.getBytesRead();
        long long5 = deflater1.getBytesWritten();
        deflater1.end();
        java.util.zip.Deflater deflater9 = new java.util.zip.Deflater((int) (byte) 0, false);
        boolean boolean10 = deflater9.needsInput();
        int int11 = deflater9.getTotalIn();
        long long12 = deflater9.getBytesRead();
        deflater9.finish();
        java.util.zip.Deflater deflater15 = new java.util.zip.Deflater((int) (byte) 1);
        long long16 = deflater15.getBytesWritten();
        int int17 = deflater15.getTotalOut();
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
        deflater15.setDictionary(byteArray54);
        deflater9.setDictionary(byteArray54);
        // The following exception was thrown during execution in test generation
        try {
            deflater1.setDictionary(byteArray54, 87360012, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[1, 1, -1, -1, 1, 10]");
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
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
        int int18 = deflater4.getAdler();
        boolean boolean19 = deflater4.needsInput();
        int int20 = deflater4.getTotalIn();
        int int21 = deflater4.getTotalIn();
        java.util.zip.Deflater deflater23 = new java.util.zip.Deflater((int) (byte) 1);
        deflater23.reset();
        int int25 = deflater23.getTotalIn();
        byte[] byteArray32 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater23.setInput(byteArray32);
        deflater23.finish();
        long long35 = deflater23.getBytesRead();
        deflater23.reset();
        java.util.zip.Deflater deflater38 = new java.util.zip.Deflater((int) (byte) 1);
        deflater38.reset();
        int int40 = deflater38.getTotalIn();
        byte[] byteArray47 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater38.setInput(byteArray47);
        deflater38.finish();
        long long50 = deflater38.getBytesRead();
        deflater38.reset();
        byte[] byteArray58 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater38.setInput(byteArray58, (int) (short) 0, (int) (short) 1);
        int int62 = deflater23.deflate(byteArray58);
        deflater4.setDictionary(byteArray58);
        deflater1.setInput(byteArray58);
        long long65 = deflater1.getBytesWritten();
        long long66 = deflater1.getBytesWritten();
        int int67 = deflater1.getAdler();
        int int68 = deflater1.getTotalIn();
        java.lang.Class<?> wildcardClass69 = deflater1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(1, true);
        boolean boolean3 = deflater2.needsInput();
        java.util.zip.Deflater deflater6 = new java.util.zip.Deflater((int) (short) -1, true);
        deflater6.setLevel((-1));
        boolean boolean9 = deflater6.needsInput();
        deflater6.setLevel(0);
        java.util.zip.Deflater deflater14 = new java.util.zip.Deflater(3, true);
        int int15 = deflater14.getAdler();
        java.util.zip.Deflater deflater18 = new java.util.zip.Deflater((-1), true);
        long long19 = deflater18.getBytesWritten();
        deflater18.setLevel(2);
        java.util.zip.Deflater deflater23 = new java.util.zip.Deflater((int) (byte) 1);
        deflater23.reset();
        int int25 = deflater23.getTotalIn();
        byte[] byteArray32 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater23.setInput(byteArray32);
        deflater23.finish();
        long long35 = deflater23.getBytesRead();
        deflater23.reset();
        java.util.zip.Deflater deflater38 = new java.util.zip.Deflater((int) (byte) 1);
        deflater38.reset();
        int int40 = deflater38.getTotalIn();
        byte[] byteArray47 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater38.setInput(byteArray47);
        deflater38.finish();
        long long50 = deflater38.getBytesRead();
        deflater38.reset();
        byte[] byteArray58 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater38.setInput(byteArray58, (int) (short) 0, (int) (short) 1);
        deflater23.setDictionary(byteArray58);
        deflater18.setInput(byteArray58);
        deflater14.setDictionary(byteArray58);
        int int68 = deflater6.deflate(byteArray58, 6, (int) (short) 0, 0);
        int int69 = deflater2.deflate(byteArray58);
        int int70 = deflater2.getTotalIn();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
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
        long long64 = deflater1.getBytesRead();
        int int65 = deflater1.getTotalOut();
        deflater1.reset();
        long long67 = deflater1.getBytesWritten();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 118882828 + "'", int62 == 118882828);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
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
        int int22 = deflater1.getTotalIn();
        int int23 = deflater1.getAdler();
        java.util.zip.Deflater deflater25 = new java.util.zip.Deflater((int) (byte) 1);
        deflater25.reset();
        deflater25.reset();
        long long28 = deflater25.getBytesWritten();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getTotalIn();
        deflater30.finish();
        int int34 = deflater30.getTotalOut();
        java.util.zip.Deflater deflater36 = new java.util.zip.Deflater((int) (byte) 1);
        deflater36.reset();
        int int38 = deflater36.getTotalIn();
        deflater36.finish();
        long long40 = deflater36.getBytesWritten();
        java.util.zip.Deflater deflater42 = new java.util.zip.Deflater((int) (byte) 1);
        long long43 = deflater42.getBytesRead();
        long long44 = deflater42.getBytesRead();
        long long45 = deflater42.getBytesWritten();
        java.util.zip.Deflater deflater47 = new java.util.zip.Deflater((int) (byte) 1);
        deflater47.reset();
        int int49 = deflater47.getTotalIn();
        byte[] byteArray56 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater47.setInput(byteArray56);
        deflater47.finish();
        long long59 = deflater47.getBytesRead();
        deflater47.reset();
        byte[] byteArray67 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater47.setInput(byteArray67, (int) (short) 0, (int) (short) 1);
        deflater42.setInput(byteArray67);
        deflater36.setInput(byteArray67);
        deflater30.setDictionary(byteArray67);
        int int74 = deflater25.deflate(byteArray67);
        deflater1.setInput(byteArray67);
        byte[] byteArray76 = null;
        // The following exception was thrown during execution in test generation
        try {
            deflater1.setDictionary(byteArray76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (short) -1, false);
        int int3 = deflater2.getTotalIn();
        long long4 = deflater2.getBytesRead();
        long long5 = deflater2.getBytesRead();
        deflater2.end();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        long long6 = deflater1.getBytesWritten();
        int int7 = deflater1.getTotalOut();
        int int8 = deflater1.getTotalIn();
        deflater1.setStrategy((int) (short) 0);
        java.util.zip.Deflater deflater13 = new java.util.zip.Deflater((int) (short) -1, false);
        long long14 = deflater13.getBytesWritten();
        java.util.zip.Deflater deflater16 = new java.util.zip.Deflater((int) (byte) 1);
        deflater16.reset();
        int int18 = deflater16.getTotalIn();
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater16.setInput(byteArray25);
        deflater13.setDictionary(byteArray25);
        int int28 = deflater13.getTotalOut();
        boolean boolean29 = deflater13.needsInput();
        java.util.zip.Deflater deflater32 = new java.util.zip.Deflater((-1), true);
        deflater32.finish();
        deflater32.finish();
        boolean boolean35 = deflater32.finished();
        deflater32.finish();
        java.util.zip.Deflater deflater37 = new java.util.zip.Deflater();
        deflater37.reset();
        long long39 = deflater37.getBytesWritten();
        int int40 = deflater37.getTotalIn();
        byte[] byteArray43 = new byte[] { (byte) 0, (byte) 1 };
        deflater37.setInput(byteArray43);
        deflater32.setInput(byteArray43);
        deflater13.setDictionary(byteArray43);
        deflater1.setInput(byteArray43);
        int int48 = deflater1.getAdler();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater(0);
        int int2 = deflater1.getAdler();
        boolean boolean3 = deflater1.needsInput();
        boolean boolean4 = deflater1.finished();
        boolean boolean5 = deflater1.finished();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((int) (byte) 1);
        deflater7.reset();
        int int9 = deflater7.getTotalIn();
        int int10 = deflater7.getTotalIn();
        deflater7.finish();
        deflater7.reset();
        boolean boolean13 = deflater7.finished();
        deflater7.finish();
        deflater7.finish();
        java.util.zip.Deflater deflater18 = new java.util.zip.Deflater((-1), true);
        int int19 = deflater18.getAdler();
        boolean boolean20 = deflater18.finished();
        deflater18.finish();
        deflater18.reset();
        java.util.zip.Deflater deflater24 = new java.util.zip.Deflater((int) (byte) 1);
        deflater24.reset();
        int int26 = deflater24.getTotalIn();
        deflater24.finish();
        long long28 = deflater24.getBytesWritten();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        long long31 = deflater30.getBytesRead();
        long long32 = deflater30.getBytesRead();
        long long33 = deflater30.getBytesWritten();
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
        deflater30.setInput(byteArray55);
        deflater24.setInput(byteArray55);
        deflater18.setDictionary(byteArray55);
        deflater7.setDictionary(byteArray55);
        deflater1.setInput(byteArray55);
        int int64 = deflater1.getAdler();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
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
        int int67 = deflater1.getTotalOut();
        long long68 = deflater1.getBytesWritten();
        int int69 = deflater1.getTotalIn();
        int int70 = deflater1.getAdler();
        boolean boolean71 = deflater1.needsInput();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        long long3 = deflater1.getBytesWritten();
        long long4 = deflater1.getBytesWritten();
        boolean boolean5 = deflater1.finished();
        boolean boolean6 = deflater1.finished();
        int int7 = deflater1.getTotalIn();
        deflater1.reset();
        java.util.zip.Deflater deflater11 = new java.util.zip.Deflater((int) (byte) 1, true);
        int int12 = deflater11.getAdler();
        java.util.zip.Deflater deflater14 = new java.util.zip.Deflater((-1));
        int int15 = deflater14.getTotalIn();
        boolean boolean16 = deflater14.finished();
        java.util.zip.Deflater deflater18 = new java.util.zip.Deflater((int) (byte) 1);
        deflater18.reset();
        deflater18.reset();
        deflater18.reset();
        java.util.zip.Deflater deflater23 = new java.util.zip.Deflater((int) (byte) 1);
        deflater23.reset();
        deflater23.reset();
        java.util.zip.Deflater deflater27 = new java.util.zip.Deflater((int) (byte) 1);
        deflater27.reset();
        int int29 = deflater27.getTotalIn();
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater27.setInput(byteArray36);
        deflater23.setDictionary(byteArray36);
        int int39 = deflater18.deflate(byteArray36);
        int int40 = deflater14.deflate(byteArray36);
        int int41 = deflater11.deflate(byteArray36);
        deflater1.setInput(byteArray36);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(1, true);
        boolean boolean3 = deflater2.needsInput();
        deflater2.end();
        boolean boolean5 = deflater2.finished();
        deflater2.end();
        boolean boolean7 = deflater2.needsInput();
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
        java.util.zip.Deflater deflater70 = new java.util.zip.Deflater();
        deflater70.reset();
        long long72 = deflater70.getBytesWritten();
        int int73 = deflater70.getTotalIn();
        byte[] byteArray76 = new byte[] { (byte) 0, (byte) 1 };
        deflater70.setInput(byteArray76);
        deflater9.setDictionary(byteArray76);
        // The following exception was thrown during execution in test generation
        try {
            int int82 = deflater2.deflate(byteArray76, 6, (int) (short) 100, 196610);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[120, 1, 99, 100, -28, -6]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 6 + "'", int66 == 6);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[0, 1]");
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
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
        int int48 = deflater2.getAdler();
        int int49 = deflater2.getTotalIn();
        int int50 = deflater2.getTotalOut();
        long long51 = deflater2.getBytesWritten();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
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
        deflater2.setLevel(3);
        deflater2.reset();
        deflater2.finish();
        // The following exception was thrown during execution in test generation
        try {
            deflater2.setStrategy(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        int int6 = deflater4.getTotalIn();
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater4.setInput(byteArray13);
        deflater1.setInput(byteArray13);
        deflater1.setLevel((int) (byte) -1);
        long long18 = deflater1.getBytesWritten();
        long long19 = deflater1.getBytesWritten();
        int int20 = deflater1.getTotalOut();
        deflater1.setStrategy(0);
        deflater1.setStrategy((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        deflater1.finish();
        deflater1.reset();
        boolean boolean7 = deflater1.finished();
        long long8 = deflater1.getBytesRead();
        java.util.zip.Deflater deflater11 = new java.util.zip.Deflater(2, true);
        int int12 = deflater11.getTotalIn();
        int int13 = deflater11.getTotalOut();
        java.util.zip.Deflater deflater15 = new java.util.zip.Deflater((int) (byte) 1);
        deflater15.reset();
        java.util.zip.Deflater deflater18 = new java.util.zip.Deflater((int) (byte) 1);
        deflater18.reset();
        int int20 = deflater18.getTotalIn();
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater18.setInput(byteArray27);
        deflater15.setInput(byteArray27);
        boolean boolean30 = deflater15.needsInput();
        java.util.zip.Deflater deflater32 = new java.util.zip.Deflater((int) (byte) 1);
        deflater32.reset();
        int int34 = deflater32.getTotalIn();
        byte[] byteArray41 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater32.setInput(byteArray41);
        deflater32.finish();
        long long44 = deflater32.getBytesRead();
        deflater32.reset();
        java.util.zip.Deflater deflater48 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater50 = new java.util.zip.Deflater((int) (byte) 1);
        deflater50.reset();
        java.util.zip.Deflater deflater53 = new java.util.zip.Deflater((int) (byte) 1);
        deflater53.reset();
        int int55 = deflater53.getTotalIn();
        byte[] byteArray62 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater53.setInput(byteArray62);
        deflater50.setInput(byteArray62);
        deflater48.setInput(byteArray62);
        deflater48.setStrategy(0);
        boolean boolean68 = deflater48.needsInput();
        java.util.zip.Deflater deflater71 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater73 = new java.util.zip.Deflater((int) (byte) 1);
        deflater73.reset();
        java.util.zip.Deflater deflater76 = new java.util.zip.Deflater((int) (byte) 1);
        deflater76.reset();
        int int78 = deflater76.getTotalIn();
        byte[] byteArray85 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater76.setInput(byteArray85);
        deflater73.setInput(byteArray85);
        deflater71.setInput(byteArray85);
        deflater48.setInput(byteArray85);
        deflater32.setDictionary(byteArray85);
        int int91 = deflater15.deflate(byteArray85);
        int int92 = deflater11.deflate(byteArray85);
        deflater1.setInput(byteArray85);
        deflater1.reset();
        boolean boolean95 = deflater1.needsInput();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray85), "[120, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 2 + "'", int91 == 2);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.reset();
        java.util.zip.Deflater deflater14 = new java.util.zip.Deflater((int) (byte) 1);
        deflater14.reset();
        deflater14.reset();
        deflater14.reset();
        java.util.zip.Deflater deflater19 = new java.util.zip.Deflater((int) (byte) 1);
        deflater19.reset();
        deflater19.reset();
        java.util.zip.Deflater deflater23 = new java.util.zip.Deflater((int) (byte) 1);
        deflater23.reset();
        int int25 = deflater23.getTotalIn();
        byte[] byteArray32 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater23.setInput(byteArray32);
        deflater19.setDictionary(byteArray32);
        int int35 = deflater14.deflate(byteArray32);
        deflater1.setDictionary(byteArray32);
        long long37 = deflater1.getBytesWritten();
        long long38 = deflater1.getBytesWritten();
        deflater1.reset();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
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
        int int61 = deflater1.getTotalOut();
        // The following exception was thrown during execution in test generation
        try {
            deflater1.setStrategy(118882828);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[120, 1, 99, 100, -28, -6]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 6 + "'", int55 == 6);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 6 + "'", int57 == 6);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 6 + "'", int58 == 6);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 6 + "'", int61 == 6);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) -1);
        boolean boolean2 = deflater1.finished();
        deflater1.finish();
        int int4 = deflater1.getTotalIn();
        java.util.zip.Deflater deflater7 = new java.util.zip.Deflater((-1), true);
        long long8 = deflater7.getBytesWritten();
        deflater7.setLevel(2);
        java.util.zip.Deflater deflater12 = new java.util.zip.Deflater((int) (byte) 1);
        deflater12.reset();
        int int14 = deflater12.getTotalIn();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater12.setInput(byteArray21);
        deflater12.finish();
        long long24 = deflater12.getBytesRead();
        deflater12.reset();
        java.util.zip.Deflater deflater27 = new java.util.zip.Deflater((int) (byte) 1);
        deflater27.reset();
        int int29 = deflater27.getTotalIn();
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater27.setInput(byteArray36);
        deflater27.finish();
        long long39 = deflater27.getBytesRead();
        deflater27.reset();
        byte[] byteArray47 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater27.setInput(byteArray47, (int) (short) 0, (int) (short) 1);
        deflater12.setDictionary(byteArray47);
        deflater7.setInput(byteArray47);
        int int53 = deflater1.deflate(byteArray47);
        int int54 = deflater1.getTotalOut();
        deflater1.reset();
        int int56 = deflater1.getTotalOut();
        java.lang.Class<?> wildcardClass57 = deflater1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[120, -100, 3, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 6 + "'", int53 == 6);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 6 + "'", int54 == 6);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        long long6 = deflater1.getBytesWritten();
        int int7 = deflater1.getTotalOut();
        deflater1.reset();
        int int9 = deflater1.getAdler();
        deflater1.reset();
        java.util.zip.Deflater deflater12 = new java.util.zip.Deflater((int) (byte) 1);
        deflater12.reset();
        int int14 = deflater12.getTotalIn();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater12.setInput(byteArray21);
        deflater12.finish();
        long long24 = deflater12.getBytesRead();
        deflater12.reset();
        byte[] byteArray32 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater12.setInput(byteArray32, (int) (short) 0, (int) (short) 1);
        boolean boolean36 = deflater12.needsInput();
        deflater12.reset();
        boolean boolean38 = deflater12.needsInput();
        java.util.zip.Deflater deflater41 = new java.util.zip.Deflater((int) (short) 1, false);
        java.util.zip.Deflater deflater44 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater46 = new java.util.zip.Deflater((int) (byte) 1);
        deflater46.reset();
        java.util.zip.Deflater deflater49 = new java.util.zip.Deflater((int) (byte) 1);
        deflater49.reset();
        int int51 = deflater49.getTotalIn();
        byte[] byteArray58 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater49.setInput(byteArray58);
        deflater46.setInput(byteArray58);
        deflater44.setInput(byteArray58);
        int int62 = deflater41.deflate(byteArray58);
        int int63 = deflater12.deflate(byteArray58);
        deflater12.finish();
        java.util.zip.Deflater deflater66 = new java.util.zip.Deflater((int) (byte) 1);
        deflater66.reset();
        java.util.zip.Deflater deflater69 = new java.util.zip.Deflater((int) (byte) 1);
        deflater69.reset();
        int int71 = deflater69.getTotalIn();
        byte[] byteArray78 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater69.setInput(byteArray78);
        deflater66.setInput(byteArray78);
        int int81 = deflater66.getTotalIn();
        long long82 = deflater66.getBytesWritten();
        java.util.zip.Deflater deflater84 = new java.util.zip.Deflater((int) (byte) 1);
        deflater84.reset();
        int int86 = deflater84.getTotalIn();
        byte[] byteArray93 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater84.setInput(byteArray93);
        deflater66.setDictionary(byteArray93);
        deflater12.setDictionary(byteArray93);
        deflater1.setDictionary(byteArray93);
        // The following exception was thrown during execution in test generation
        try {
            deflater1.setStrategy(196610);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNotNull(byteArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray93), "[1, 1, 10, -1, -1, 1]");
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
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
        deflater1.reset();
        int int57 = deflater1.getTotalOut();
        boolean boolean58 = deflater1.finished();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (byte) 1, false);
        deflater2.finish();
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
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
        boolean boolean11 = deflater1.finished();
        long long12 = deflater1.getBytesRead();
        deflater1.reset();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
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
        long long47 = deflater1.getBytesRead();
        int int48 = deflater1.getTotalIn();
        long long49 = deflater1.getBytesRead();
        long long50 = deflater1.getBytesRead();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater(0);
        long long2 = deflater1.getBytesWritten();
        deflater1.setStrategy((int) (byte) 1);
        long long5 = deflater1.getBytesRead();
        long long6 = deflater1.getBytesWritten();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
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
        int int56 = deflater1.getAdler();
        boolean boolean57 = deflater1.needsInput();
        deflater1.finish();
        deflater1.finish();
        deflater1.setLevel(6);
        deflater1.finish();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesWritten();
        long long3 = deflater1.getBytesWritten();
        deflater1.setLevel((int) (byte) 0);
        deflater1.reset();
        java.util.zip.Deflater deflater9 = new java.util.zip.Deflater((int) (short) -1, false);
        long long10 = deflater9.getBytesWritten();
        java.util.zip.Deflater deflater12 = new java.util.zip.Deflater((int) (byte) 1);
        deflater12.reset();
        int int14 = deflater12.getTotalIn();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater12.setInput(byteArray21);
        deflater9.setDictionary(byteArray21);
        deflater1.setInput(byteArray21);
        java.lang.Class<?> wildcardClass25 = deflater1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater(3, true);
        deflater2.reset();
        java.util.zip.Deflater deflater6 = new java.util.zip.Deflater((int) (byte) 0, false);
        boolean boolean7 = deflater6.needsInput();
        int int8 = deflater6.getTotalIn();
        long long9 = deflater6.getBytesRead();
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
        int int70 = deflater6.deflate(byteArray64);
        deflater2.setDictionary(byteArray64);
        boolean boolean72 = deflater2.finished();
        boolean boolean73 = deflater2.needsInput();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((-1), true);
        int int3 = deflater2.getAdler();
        boolean boolean4 = deflater2.finished();
        boolean boolean5 = deflater2.needsInput();
        long long6 = deflater2.getBytesRead();
        long long7 = deflater2.getBytesRead();
        int int8 = deflater2.getTotalIn();
        java.util.zip.Deflater deflater11 = new java.util.zip.Deflater((int) (byte) 1, true);
        int int12 = deflater11.getAdler();
        deflater11.setStrategy(0);
        int int15 = deflater11.getTotalIn();
        long long16 = deflater11.getBytesRead();
        long long17 = deflater11.getBytesWritten();
        java.util.zip.Deflater deflater19 = new java.util.zip.Deflater((int) (byte) 1);
        deflater19.reset();
        int int21 = deflater19.getTotalIn();
        int int22 = deflater19.getTotalIn();
        int int23 = deflater19.getTotalIn();
        deflater19.setLevel((int) (short) 1);
        int int26 = deflater19.getAdler();
        java.util.zip.Deflater deflater28 = new java.util.zip.Deflater((int) (byte) 1);
        deflater28.reset();
        int int30 = deflater28.getTotalIn();
        int int31 = deflater28.getTotalIn();
        int int32 = deflater28.getTotalIn();
        long long33 = deflater28.getBytesWritten();
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
        deflater35.reset();
        deflater35.reset();
        java.util.zip.Deflater deflater62 = new java.util.zip.Deflater((int) (byte) 1);
        long long63 = deflater62.getBytesWritten();
        int int64 = deflater62.getTotalOut();
        long long65 = deflater62.getBytesWritten();
        java.util.zip.Deflater deflater67 = new java.util.zip.Deflater((int) (byte) 1);
        deflater67.reset();
        deflater67.reset();
        java.util.zip.Deflater deflater71 = new java.util.zip.Deflater((int) (byte) 1);
        deflater71.reset();
        int int73 = deflater71.getTotalIn();
        byte[] byteArray80 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater71.setInput(byteArray80);
        deflater67.setDictionary(byteArray80);
        deflater62.setDictionary(byteArray80);
        deflater35.setInput(byteArray80);
        deflater28.setDictionary(byteArray80, 2, (int) (short) 0);
        deflater19.setInput(byteArray80);
        int int89 = deflater11.deflate(byteArray80);
        deflater2.setDictionary(byteArray80);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray80), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        java.util.zip.Deflater deflater0 = new java.util.zip.Deflater();
        deflater0.reset();
        long long2 = deflater0.getBytesWritten();
        int int3 = deflater0.getTotalIn();
        long long4 = deflater0.getBytesRead();
        long long5 = deflater0.getBytesRead();
        boolean boolean6 = deflater0.needsInput();
        boolean boolean7 = deflater0.needsInput();
        int int8 = deflater0.getTotalOut();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
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
        deflater1.setDictionary(byteArray41);
        int int46 = deflater1.getTotalOut();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
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
        int int19 = deflater1.getTotalIn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
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
        java.util.zip.Deflater deflater21 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater23 = new java.util.zip.Deflater((int) (byte) 1);
        deflater23.reset();
        java.util.zip.Deflater deflater26 = new java.util.zip.Deflater((int) (byte) 1);
        deflater26.reset();
        int int28 = deflater26.getTotalIn();
        byte[] byteArray35 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater26.setInput(byteArray35);
        deflater23.setInput(byteArray35);
        deflater21.setInput(byteArray35);
        deflater21.setStrategy(0);
        boolean boolean41 = deflater21.needsInput();
        java.util.zip.Deflater deflater44 = new java.util.zip.Deflater(3, true);
        java.util.zip.Deflater deflater46 = new java.util.zip.Deflater((int) (byte) 1);
        deflater46.reset();
        java.util.zip.Deflater deflater49 = new java.util.zip.Deflater((int) (byte) 1);
        deflater49.reset();
        int int51 = deflater49.getTotalIn();
        byte[] byteArray58 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater49.setInput(byteArray58);
        deflater46.setInput(byteArray58);
        deflater44.setInput(byteArray58);
        deflater21.setInput(byteArray58);
        deflater5.setDictionary(byteArray58);
        int int64 = deflater1.deflate(byteArray58);
        java.lang.Class<?> wildcardClass65 = byteArray58.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
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
        boolean boolean11 = deflater1.finished();
        java.util.zip.Deflater deflater14 = new java.util.zip.Deflater((int) (byte) 1, true);
        int int15 = deflater14.getAdler();
        java.util.zip.Deflater deflater17 = new java.util.zip.Deflater((-1));
        int int18 = deflater17.getTotalIn();
        boolean boolean19 = deflater17.finished();
        java.util.zip.Deflater deflater21 = new java.util.zip.Deflater((int) (byte) 1);
        deflater21.reset();
        deflater21.reset();
        deflater21.reset();
        java.util.zip.Deflater deflater26 = new java.util.zip.Deflater((int) (byte) 1);
        deflater26.reset();
        deflater26.reset();
        java.util.zip.Deflater deflater30 = new java.util.zip.Deflater((int) (byte) 1);
        deflater30.reset();
        int int32 = deflater30.getTotalIn();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater30.setInput(byteArray39);
        deflater26.setDictionary(byteArray39);
        int int42 = deflater21.deflate(byteArray39);
        int int43 = deflater17.deflate(byteArray39);
        int int44 = deflater14.deflate(byteArray39);
        int int45 = deflater1.deflate(byteArray39);
        java.util.zip.Deflater deflater48 = new java.util.zip.Deflater((int) (short) 1, false);
        java.util.zip.Deflater deflater51 = new java.util.zip.Deflater((int) (short) -1, false);
        long long52 = deflater51.getBytesWritten();
        java.util.zip.Deflater deflater54 = new java.util.zip.Deflater((int) (byte) 1);
        deflater54.reset();
        int int56 = deflater54.getTotalIn();
        byte[] byteArray63 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater54.setInput(byteArray63);
        deflater51.setDictionary(byteArray63);
        java.util.zip.Deflater deflater67 = new java.util.zip.Deflater((int) (byte) 1);
        deflater67.reset();
        int int69 = deflater67.getTotalIn();
        byte[] byteArray76 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater67.setInput(byteArray76);
        deflater67.reset();
        boolean boolean79 = deflater67.needsInput();
        java.util.zip.Deflater deflater81 = new java.util.zip.Deflater((int) (byte) 1);
        deflater81.reset();
        int int83 = deflater81.getTotalIn();
        byte[] byteArray90 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater81.setInput(byteArray90);
        int int92 = deflater67.deflate(byteArray90);
        int int95 = deflater51.deflate(byteArray90, (int) (short) 0, (int) (byte) 1);
        deflater48.setDictionary(byteArray90);
        deflater1.setDictionary(byteArray90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray90), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        java.util.zip.Deflater deflater2 = new java.util.zip.Deflater((int) (byte) 0, false);
        boolean boolean3 = deflater2.needsInput();
        long long4 = deflater2.getBytesWritten();
        boolean boolean5 = deflater2.finished();
        boolean boolean6 = deflater2.finished();
        deflater2.finish();
        int int8 = deflater2.getTotalOut();
        int int9 = deflater2.getAdler();
        deflater2.end();
        java.lang.Class<?> wildcardClass11 = deflater2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater1.setInput(byteArray10);
        deflater1.finish();
        deflater1.reset();
        long long14 = deflater1.getBytesRead();
        boolean boolean15 = deflater1.needsInput();
        deflater1.reset();
        deflater1.setLevel(6);
        // The following exception was thrown during execution in test generation
        try {
            deflater1.setStrategy(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
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
        long long64 = deflater1.getBytesRead();
        int int65 = deflater1.getTotalOut();
        int int66 = deflater1.getTotalOut();
        deflater1.finish();
        int int68 = deflater1.getAdler();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 118882828 + "'", int62 == 118882828);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 118882828 + "'", int68 == 118882828);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        deflater1.setLevel((int) (short) 1);
        deflater1.setLevel((int) (byte) 1);
        int int10 = deflater1.getTotalOut();
        long long11 = deflater1.getBytesRead();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
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
        long long98 = deflater1.getBytesWritten();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray81), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 0L + "'", long84 == 0L);
        org.junit.Assert.assertNotNull(byteArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray92), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + long98 + "' != '" + 0L + "'", long98 == 0L);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
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
        deflater2.setLevel(3);
        deflater2.reset();
        deflater2.setStrategy(0);
        deflater2.finish();
        boolean boolean56 = deflater2.needsInput();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        java.util.zip.Deflater deflater4 = new java.util.zip.Deflater((int) (byte) 1);
        deflater4.reset();
        int int6 = deflater4.getTotalIn();
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater4.setInput(byteArray13);
        deflater1.setInput(byteArray13);
        deflater1.setLevel((int) (byte) -1);
        deflater1.finish();
        int int19 = deflater1.getTotalIn();
        deflater1.reset();
        deflater1.end();
        java.util.zip.Deflater deflater23 = new java.util.zip.Deflater((int) (byte) 1);
        deflater23.reset();
        int int25 = deflater23.getTotalIn();
        deflater23.reset();
        boolean boolean27 = deflater23.finished();
        int int28 = deflater23.getTotalOut();
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
        deflater23.setDictionary(byteArray75);
        // The following exception was thrown during execution in test generation
        try {
            deflater1.setDictionary(byteArray75, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[1, 1, 10, -1, -1, 1]");
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        long long2 = deflater1.getBytesRead();
        long long3 = deflater1.getBytesRead();
        long long4 = deflater1.getBytesWritten();
        java.util.zip.Deflater deflater6 = new java.util.zip.Deflater((int) (byte) 1);
        deflater6.reset();
        int int8 = deflater6.getTotalIn();
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater6.setInput(byteArray15);
        deflater6.finish();
        long long18 = deflater6.getBytesRead();
        deflater6.reset();
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        deflater6.setInput(byteArray26, (int) (short) 0, (int) (short) 1);
        deflater1.setInput(byteArray26);
        deflater1.finish();
        long long32 = deflater1.getBytesRead();
        java.lang.Class<?> wildcardClass33 = deflater1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
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
        int int54 = deflater2.getAdler();
        int int55 = deflater2.getTotalIn();
        deflater2.finish();
        java.util.zip.Deflater deflater59 = new java.util.zip.Deflater((int) (short) -1, true);
        deflater59.setLevel((-1));
        boolean boolean62 = deflater59.needsInput();
        deflater59.finish();
        java.util.zip.Deflater deflater65 = new java.util.zip.Deflater((int) (byte) 1);
        deflater65.reset();
        int int67 = deflater65.getTotalIn();
        deflater65.reset();
        boolean boolean69 = deflater65.finished();
        int int70 = deflater65.getTotalOut();
        java.util.zip.Deflater deflater72 = new java.util.zip.Deflater((int) (byte) 1);
        deflater72.reset();
        int int74 = deflater72.getAdler();
        java.util.zip.Deflater deflater76 = new java.util.zip.Deflater((int) (byte) 1);
        deflater76.reset();
        int int78 = deflater76.getTotalIn();
        byte[] byteArray85 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        deflater76.setInput(byteArray85);
        deflater72.setInput(byteArray85);
        int int90 = deflater65.deflate(byteArray85, 0, 0);
        deflater59.setDictionary(byteArray85);
        int int95 = deflater2.deflate(byteArray85, 3, 1, 3);
        deflater2.reset();
        // The following exception was thrown during execution in test generation
        try {
            deflater2.setStrategy(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[1, 1, -1, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 118882828 + "'", int54 == 118882828);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray85), "[1, 1, 10, 120, -1, 1]");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 1 + "'", int95 == 1);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
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
        int int22 = deflater1.getTotalIn();
        long long23 = deflater1.getBytesWritten();
        boolean boolean24 = deflater1.needsInput();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, 1, 10, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) -1);
        int int2 = deflater1.getTotalOut();
        deflater1.setLevel(8);
        deflater1.reset();
        deflater1.finish();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        java.util.zip.Deflater deflater1 = new java.util.zip.Deflater((int) (byte) 1);
        deflater1.reset();
        int int3 = deflater1.getTotalIn();
        int int4 = deflater1.getTotalIn();
        int int5 = deflater1.getTotalIn();
        deflater1.setLevel((int) (short) 1);
        deflater1.setLevel((int) (byte) 1);
        boolean boolean10 = deflater1.finished();
        boolean boolean11 = deflater1.finished();
        int int12 = deflater1.getTotalOut();
        int int13 = deflater1.getAdler();
        int int14 = deflater1.getTotalOut();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }
}

