import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 {

    public static boolean debug = false;

    @Test
    public void test8501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8501");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) (byte) 100);
        short[] shortArray6 = java.util.Arrays.copyOf(shortArray0, 1);
        java.util.Arrays.sort(shortArray0);
        java.util.Arrays.fill(shortArray0, (short) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(shortArray0, (int) '4', 0, (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(52) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0]");
    }

    @Test
    public void test8502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8502");
        long[] longArray1 = new long[] { ' ' };
        java.util.stream.LongStream longStream2 = java.util.Arrays.stream(longArray1);
        java.util.Arrays.fill(longArray1, (long) (-101));
        java.util.stream.LongStream longStream5 = java.util.Arrays.stream(longArray1);
        long[] longArray7 = java.util.Arrays.copyOf(longArray1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[-101]");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[-101]");
    }

    @Test
    public void test8503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8503");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.util.Arrays.fill(doubleArray4, (double) (-6));
        double[] doubleArray8 = java.util.Arrays.copyOf(doubleArray4, 100);
        java.lang.String str9 = java.util.Arrays.toString(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[-6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0]" + "'", str9, "[-6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0]");
    }

    @Test
    public void test8504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8504");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) (byte) 100);
        short[] shortArray6 = java.util.Arrays.copyOf(shortArray0, 1);
        short[] shortArray8 = java.util.Arrays.copyOf(shortArray0, (int) (byte) 10);
        short[] shortArray10 = java.util.Arrays.copyOf(shortArray0, 0);
        int int12 = java.util.Arrays.binarySearch(shortArray0, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(shortArray0, (-101), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0]");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test8505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8505");
        short[] shortArray6 = new short[] { (byte) 100, (short) 0, (byte) 10, (short) -1, (byte) 1, (byte) 0 };
        java.util.Arrays.parallelSort(shortArray6);
        int int9 = java.util.Arrays.binarySearch(shortArray6, (short) -1);
        java.util.Arrays.sort(shortArray6);
        short[] shortArray11 = new short[] {};
        int int13 = java.util.Arrays.binarySearch(shortArray11, (short) 1);
        int int15 = java.util.Arrays.binarySearch(shortArray11, (short) (byte) 100);
        short[] shortArray17 = java.util.Arrays.copyOf(shortArray11, 1);
        short[] shortArray19 = java.util.Arrays.copyOf(shortArray17, (int) (byte) 100);
        short[] shortArray22 = java.util.Arrays.copyOfRange(shortArray19, 1, (int) (short) 100);
        short[] shortArray25 = java.util.Arrays.copyOfRange(shortArray19, (int) (short) 100, (int) (byte) 100);
        short[] shortArray27 = java.util.Arrays.copyOf(shortArray25, 5);
        boolean boolean28 = java.util.Arrays.equals(shortArray6, shortArray25);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 0, 0, 1, 10, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[0]");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray25), "[]");
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test8506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8506");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        java.util.Arrays.fill(doubleArray4, (double) 10);
        java.util.Arrays.sort(doubleArray4);
        int int14 = java.util.Arrays.binarySearch(doubleArray4, (double) (-53));
        int int18 = java.util.Arrays.binarySearch(doubleArray4, 1, 2, (double) 3);
        double[] doubleArray20 = java.util.Arrays.copyOf(doubleArray4, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfDouble ofDouble23 = java.util.Arrays.spliterator(doubleArray4, (-6), 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
    }

    @Test
    public void test8507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8507");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.sort((java.lang.Object[]) strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.lang.String str7 = java.util.Arrays.deepToString((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[, hi!]" + "'", str7, "[, hi!]");
    }

    @Test
    public void test8508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8508");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.parallelSort(charArray4);
        java.util.Arrays.sort(charArray4);
        java.util.Arrays.fill(charArray4, 'a');
        char[] charArray16 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray16, (int) (byte) 1, 3);
        char[] charArray22 = java.util.Arrays.copyOfRange(charArray16, (int) (byte) 0, (int) (byte) 0);
        java.util.Arrays.fill(charArray16, '4');
        java.util.Arrays.parallelSort(charArray16);
        char[] charArray27 = java.util.Arrays.copyOf(charArray16, 30);
        boolean boolean28 = java.util.Arrays.equals(charArray4, charArray27);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "aaaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "aaaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, a, a, a]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[]");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "4444\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "4444\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[4, 4, 4, 4, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test8509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8509");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.sort(intArray3);
        int int10 = java.util.Arrays.binarySearch(intArray3, 5);
        java.util.Arrays.parallelSort(intArray3, (int) (short) 1, 10);
        java.util.Spliterator.OfInt ofInt14 = java.util.Arrays.spliterator(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream17 = java.util.Arrays.stream(intArray3, 30, (-71));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(30) > fence(-71)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-100) + "'", int10 == (-100));
        org.junit.Assert.assertNotNull(ofInt14);
    }

    @Test
    public void test8510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8510");
        double[] doubleArray6 = new double[] { (-96), (-10), (byte) -1, (-1L), (byte) -1, 1.0f };
        double[] doubleArray13 = new double[] { (-96), (-10), (byte) -1, (-1L), (byte) -1, 1.0f };
        double[][] doubleArray14 = new double[][] { doubleArray6, doubleArray13 };
        double[] doubleArray21 = new double[] { (-96), (-10), (byte) -1, (-1L), (byte) -1, 1.0f };
        double[] doubleArray28 = new double[] { (-96), (-10), (byte) -1, (-1L), (byte) -1, 1.0f };
        double[][] doubleArray29 = new double[][] { doubleArray21, doubleArray28 };
        double[] doubleArray36 = new double[] { (-96), (-10), (byte) -1, (-1L), (byte) -1, 1.0f };
        double[] doubleArray43 = new double[] { (-96), (-10), (byte) -1, (-1L), (byte) -1, 1.0f };
        double[][] doubleArray44 = new double[][] { doubleArray36, doubleArray43 };
        double[] doubleArray51 = new double[] { (-96), (-10), (byte) -1, (-1L), (byte) -1, 1.0f };
        double[] doubleArray58 = new double[] { (-96), (-10), (byte) -1, (-1L), (byte) -1, 1.0f };
        double[][] doubleArray59 = new double[][] { doubleArray51, doubleArray58 };
        double[] doubleArray66 = new double[] { (-96), (-10), (byte) -1, (-1L), (byte) -1, 1.0f };
        double[] doubleArray73 = new double[] { (-96), (-10), (byte) -1, (-1L), (byte) -1, 1.0f };
        double[][] doubleArray74 = new double[][] { doubleArray66, doubleArray73 };
        double[] doubleArray81 = new double[] { (-96), (-10), (byte) -1, (-1L), (byte) -1, 1.0f };
        double[] doubleArray88 = new double[] { (-96), (-10), (byte) -1, (-1L), (byte) -1, 1.0f };
        double[][] doubleArray89 = new double[][] { doubleArray81, doubleArray88 };
        double[][][] doubleArray90 = new double[][][] { doubleArray14, doubleArray29, doubleArray44, doubleArray59, doubleArray74, doubleArray89 };
        java.util.Spliterator<double[][]> doubleArraySpliterator91 = java.util.Arrays.spliterator(doubleArray90);
        java.lang.String str92 = java.util.Arrays.toString((java.lang.Object[]) doubleArray90);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-96.0, -10.0, -1.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-96.0, -10.0, -1.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-96.0, -10.0, -1.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-96.0, -10.0, -1.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-96.0, -10.0, -1.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-96.0, -10.0, -1.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-96.0, -10.0, -1.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-96.0, -10.0, -1.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[-96.0, -10.0, -1.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[-96.0, -10.0, -1.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[-96.0, -10.0, -1.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[-96.0, -10.0, -1.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertNotNull(doubleArraySpliterator91);
    }

    @Test
    public void test8511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8511");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Spliterator.OfInt ofInt8 = java.util.Arrays.spliterator(intArray3);
        java.util.stream.IntStream intStream9 = java.util.Arrays.stream(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(intArray3, (int) ' ', (-50));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(32) > toIndex(-50)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(ofInt8);
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test8512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8512");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.parallelSort(floatArray3);
        java.util.Arrays.fill(floatArray3, (float) ' ');
        java.util.Arrays.fill(floatArray3, 0, 0, (float) (-4));
        int int14 = java.util.Arrays.binarySearch(floatArray3, 100.0f);
        java.util.Arrays.fill(floatArray3, (float) (byte) 100);
        java.util.Arrays.sort(floatArray3);
        int int19 = java.util.Arrays.binarySearch(floatArray3, (float) (short) -1);
        int int21 = java.util.Arrays.binarySearch(floatArray3, (float) 6);
        float[] floatArray23 = java.util.Arrays.copyOf(floatArray3, 6);
        java.util.Arrays.sort(floatArray3);
        int int26 = java.util.Arrays.binarySearch(floatArray3, (float) 'a');
        java.util.Arrays.parallelSort(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-4) + "'", int14 == (-4));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[100.0, 100.0, 100.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test8513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8513");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray1);
        java.util.Arrays.fill(intArray1, 5);
        java.util.Arrays.fill(intArray1, (int) '#');
        int[] intArray10 = java.util.Arrays.copyOf(intArray1, 4);
        java.util.stream.IntStream intStream13 = java.util.Arrays.stream(intArray10, (int) (byte) 0, 0);
        java.util.Arrays.sort(intArray10);
        java.util.stream.IntStream intStream15 = java.util.Arrays.stream(intArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfInt ofInt18 = java.util.Arrays.spliterator(intArray10, (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(10) > fence(0)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[35]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 35]");
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertNotNull(intStream15);
    }

    @Test
    public void test8514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8514");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        int[] intArray9 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        int int11 = java.util.Arrays.binarySearch(intArray3, (int) 'a');
        int int13 = java.util.Arrays.binarySearch(intArray3, (int) (short) 1);
        int[] intArray15 = java.util.Arrays.copyOf(intArray3, 10);
        java.util.Arrays.fill(intArray3, 17);
        java.util.Arrays.parallelSort(intArray3, (int) (short) 0, (int) '4');
        java.util.stream.IntStream intStream21 = java.util.Arrays.stream(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = java.util.Arrays.copyOfRange(intArray3, 0, (-32));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 0 > -32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-101) + "'", int11 == (-101));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-101) + "'", int13 == (-101));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intStream21);
    }

    @Test
    public void test8515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8515");
        long[] longArray1 = new long[] { ' ' };
        java.util.stream.LongStream longStream2 = java.util.Arrays.stream(longArray1);
        java.util.Arrays.fill(longArray1, (long) (-101));
        java.util.Arrays.parallelSort(longArray1);
        long[] longArray7 = java.util.Arrays.copyOf(longArray1, (int) '4');
        java.util.Arrays.sort(longArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = java.util.Arrays.binarySearch(longArray7, (int) (short) 10, (-100), 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(10) > toIndex(-100)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[-101]");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[-101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test8516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8516");
        char[] charArray6 = new char[] { '4', '#', 'a', 'a', ' ', '#' };
        java.util.Arrays.fill(charArray6, 'a');
        char[] charArray13 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray13, (int) (byte) 1, 3);
        char[] charArray19 = java.util.Arrays.copyOfRange(charArray13, (int) (byte) 0, (int) (byte) 0);
        java.util.Arrays.parallelSort(charArray13);
        java.util.Arrays.fill(charArray13, ' ');
        java.util.Arrays.sort(charArray13);
        boolean boolean24 = java.util.Arrays.equals(charArray6, charArray13);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "aaaaaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "aaaaaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, a, a, a, a, a]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "    ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "    ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ ,  ,  ,  ]");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test8517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8517");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        java.util.Spliterator.OfDouble ofDouble11 = java.util.Arrays.spliterator(doubleArray4, (int) '4', 100);
        int int15 = java.util.Arrays.binarySearch(doubleArray4, (int) (byte) 10, (int) (byte) 10, (double) (byte) 100);
        int int17 = java.util.Arrays.binarySearch(doubleArray4, (double) 100L);
        java.util.Arrays.parallelSort(doubleArray4);
        java.util.Spliterator.OfDouble ofDouble21 = java.util.Arrays.spliterator(doubleArray4, 3, 5);
        int int23 = java.util.Arrays.binarySearch(doubleArray4, (double) (-53));
        java.util.Spliterator.OfDouble ofDouble24 = java.util.Arrays.spliterator(doubleArray4);
        java.util.Arrays.sort(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertNotNull(ofDouble11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-11) + "'", int15 == (-11));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-101) + "'", int17 == (-101));
        org.junit.Assert.assertNotNull(ofDouble21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(ofDouble24);
    }

    @Test
    public void test8518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8518");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream5 = java.util.Arrays.stream(doubleArray2);
        double[] doubleArray7 = java.util.Arrays.copyOf(doubleArray2, 99);
        java.util.function.DoubleBinaryOperator doubleBinaryOperator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(doubleArray7, (int) (byte) 0, (-50), doubleBinaryOperator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test8519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8519");
        java.lang.reflect.Type[][] typeArray0 = new java.lang.reflect.Type[][] {};
        java.util.stream.Stream<java.lang.reflect.Type[]> typeArrayStream1 = java.util.Arrays.stream(typeArray0);
        short[] shortArray2 = new short[] {};
        int int4 = java.util.Arrays.binarySearch(shortArray2, (short) 1);
        int int6 = java.util.Arrays.binarySearch(shortArray2, (short) (byte) 100);
        short[] shortArray8 = java.util.Arrays.copyOf(shortArray2, 1);
        java.util.Arrays.sort(shortArray2);
        int int10 = java.util.Arrays.binarySearch((java.lang.Object[]) typeArray0, (java.lang.Object) shortArray2);
        java.lang.String str11 = java.util.Arrays.toString(shortArray2);
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(typeArrayStream1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test8520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8520");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.parallelSort(charArray4);
        java.util.Arrays.fill(charArray4, '#');
        java.util.Arrays.sort(charArray4);
        char[] charArray13 = java.util.Arrays.copyOf(charArray4, (int) '#');
        int int15 = java.util.Arrays.binarySearch(charArray13, ' ');
        java.util.Arrays.sort(charArray13);
        java.util.Arrays.sort(charArray13);
        java.util.Arrays.fill(charArray13, 'a');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-36) + "'", int15 == (-36));
    }

    @Test
    public void test8521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8521");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        java.util.Arrays.fill(doubleArray11, (double) 0.0f);
        java.util.Spliterator.OfDouble ofDouble14 = java.util.Arrays.spliterator(doubleArray11);
        java.util.Arrays.parallelSort(doubleArray11);
        java.util.function.DoubleBinaryOperator doubleBinaryOperator16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(doubleArray11, doubleBinaryOperator16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(ofDouble14);
    }

    @Test
    public void test8522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8522");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 100 };
        java.util.Arrays.sort(byteArray2);
        byte[] byteArray5 = new byte[] { (byte) 1 };
        byte[] byteArray8 = java.util.Arrays.copyOfRange(byteArray5, (int) (short) 1, 2);
        java.util.Arrays.sort(byteArray5);
        java.util.Arrays.parallelSort(byteArray5);
        byte[] byteArray12 = java.util.Arrays.copyOf(byteArray5, (int) (short) 10);
        java.util.Arrays.fill(byteArray5, (byte) 10);
        java.util.Arrays.parallelSort(byteArray5);
        java.util.Arrays.parallelSort(byteArray5);
        boolean boolean17 = java.util.Arrays.equals(byteArray2, byteArray5);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test8523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8523");
        long[] longArray1 = new long[] { ' ' };
        java.util.stream.LongStream longStream2 = java.util.Arrays.stream(longArray1);
        java.util.Arrays.fill(longArray1, (long) (-101));
        java.util.stream.LongStream longStream5 = java.util.Arrays.stream(longArray1);
        java.util.Arrays.parallelSort(longArray1);
        long[] longArray8 = java.util.Arrays.copyOf(longArray1, 6);
        java.util.function.LongBinaryOperator longBinaryOperator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(longArray1, 49, (int) (byte) 100, longBinaryOperator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[-101]");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-101, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test8524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8524");
        float[] floatArray1 = new float[] { (-1L) };
        int int3 = java.util.Arrays.binarySearch(floatArray1, (float) (short) -1);
        java.util.Arrays.sort(floatArray1);
        java.util.Arrays.fill(floatArray1, (float) 2);
        int int8 = java.util.Arrays.binarySearch(floatArray1, (float) (-6));
        java.util.Arrays.parallelSort(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray12 = java.util.Arrays.copyOfRange(floatArray1, 6, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[2.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test8525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8525");
        short[] shortArray6 = new short[] { (byte) -1, (byte) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
        java.util.Arrays.parallelSort(shortArray6);
        java.util.Arrays.sort(shortArray6);
        short[] shortArray10 = java.util.Arrays.copyOf(shortArray6, 100);
        int int12 = java.util.Arrays.binarySearch(shortArray10, (short) (byte) 100);
        int int16 = java.util.Arrays.binarySearch(shortArray10, (int) (short) 0, (int) (byte) 0, (short) 100);
        java.util.Arrays.sort(shortArray10);
        int int19 = java.util.Arrays.binarySearch(shortArray10, (short) -1);
        java.util.Arrays.sort(shortArray10);
        short[] shortArray22 = java.util.Arrays.copyOf(shortArray10, 5);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-101) + "'", int12 == (-101));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[-1, 0, 0, 0, 0]");
    }

    @Test
    public void test8526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8526");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Spliterator.OfInt ofInt8 = java.util.Arrays.spliterator(intArray3);
        java.util.Arrays.parallelSort(intArray3, 0, 7);
        int int13 = java.util.Arrays.binarySearch(intArray3, 3);
        java.util.stream.IntStream intStream14 = java.util.Arrays.stream(intArray3);
        int int16 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1);
        int int18 = java.util.Arrays.binarySearch(intArray3, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(intArray3, (int) (short) 0, (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-101)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(ofInt8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-101) + "'", int13 == (-101));
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-101) + "'", int16 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-101) + "'", int18 == (-101));
    }

    @Test
    public void test8527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8527");
        short[] shortArray6 = new short[] { (byte) -1, (byte) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
        java.util.Arrays.parallelSort(shortArray6);
        java.util.Arrays.sort(shortArray6);
        java.util.Arrays.parallelSort(shortArray6);
        java.util.Arrays.parallelSort(shortArray6);
        short[] shortArray12 = java.util.Arrays.copyOf(shortArray6, 5);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray15 = java.util.Arrays.copyOfRange(shortArray6, (-96), (-33));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[-1, 0, 0, 0, 0]");
    }

    @Test
    public void test8528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8528");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        long[] longArray11 = java.util.Arrays.copyOfRange(longArray3, 0, (int) (byte) 0);
        java.util.Arrays.parallelSort(longArray11);
        int int14 = java.util.Arrays.binarySearch(longArray11, (long) (-53));
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray16 = java.util.Arrays.copyOf(longArray11, (-18));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test8529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8529");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.parallelSort(charArray4);
        int int10 = java.util.Arrays.binarySearch(charArray4, 'a');
        java.util.Arrays.sort(charArray4);
        int int13 = java.util.Arrays.binarySearch(charArray4, '4');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , 4, a, a]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test8530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8530");
        char[] charArray3 = new char[] { '#', 'a', '#' };
        char[] charArray5 = java.util.Arrays.copyOf(charArray3, 100);
        int int7 = java.util.Arrays.binarySearch(charArray5, 'a');
        java.util.Arrays.fill(charArray5, '#');
        char[] charArray11 = java.util.Arrays.copyOf(charArray5, 0);
        java.util.Arrays.fill(charArray11, 'a');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a, #]");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "####################################################################################################");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "####################################################################################################");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-101) + "'", int7 == (-101));
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[]");
    }

    @Test
    public void test8531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8531");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        int int6 = java.util.Arrays.binarySearch(byteArray1, (byte) 0);
        java.util.Arrays.parallelSort(byteArray1);
        int int9 = java.util.Arrays.binarySearch(byteArray1, (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(byteArray1, (int) (short) 1, (-53));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(1) > toIndex(-53)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test8532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8532");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.parallelSort(floatArray3);
        java.util.Arrays.fill(floatArray3, (float) ' ');
        java.util.Arrays.fill(floatArray3, 0, 0, (float) (-4));
        int int14 = java.util.Arrays.binarySearch(floatArray3, 100.0f);
        java.util.Arrays.fill(floatArray3, (float) (byte) 100);
        java.util.Arrays.sort(floatArray3);
        java.util.Arrays.parallelSort(floatArray3);
        float[] floatArray20 = java.util.Arrays.copyOf(floatArray3, 17);
        java.util.Arrays.parallelSort(floatArray20);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(floatArray20, (-50), (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(-50) > toIndex(-100)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-4) + "'", int14 == (-4));
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 100.0, 100.0, 100.0]");
    }

    @Test
    public void test8533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8533");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.fill(byteArray4, (byte) -1);
        java.util.Arrays.fill(byteArray4, (byte) 1);
        byte[] byteArray10 = java.util.Arrays.copyOf(byteArray4, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = java.util.Arrays.binarySearch(byteArray4, (-1), 1, (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test8534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8534");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) 100);
        short[] shortArray6 = java.util.Arrays.copyOf(shortArray0, (int) (short) 0);
        java.util.Arrays.parallelSort(shortArray0);
        java.util.Arrays.fill(shortArray0, (short) -1);
        short[] shortArray11 = java.util.Arrays.copyOf(shortArray0, (int) (byte) 10);
        java.util.Arrays.sort(shortArray11);
        int int14 = java.util.Arrays.binarySearch(shortArray11, (short) 100);
        java.util.Arrays.sort(shortArray11);
        java.util.Arrays.sort(shortArray11);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-11) + "'", int14 == (-11));
    }

    @Test
    public void test8535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8535");
        short[][][][][][][][] shortArray0 = new short[][][][][][][][] {};
        java.util.stream.Stream<short[][][][][][][]> shortArrayStream1 = java.util.Arrays.stream(shortArray0);
        float[] floatArray7 = new float[] { (-1), (short) -1, '4' };
        int int9 = java.util.Arrays.binarySearch(floatArray7, 0.0f);
        java.util.Arrays.parallelSort(floatArray7);
        java.util.Arrays.fill(floatArray7, (float) ' ');
        java.util.Arrays.fill(floatArray7, 0, 0, (float) (-4));
        int int18 = java.util.Arrays.binarySearch(floatArray7, 100.0f);
        java.util.Arrays.fill(floatArray7, (float) (byte) 100);
        java.util.Arrays.sort(floatArray7);
        int int23 = java.util.Arrays.binarySearch(floatArray7, (float) (short) -1);
        java.util.Arrays.fill((java.lang.Object[]) shortArray0, 0, 0, (java.lang.Object) floatArray7);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray27);
        java.util.Spliterator<java.lang.String> strSpliterator29 = java.util.Arrays.spliterator(strArray27);
        java.util.Arrays.fill((java.lang.Object[]) shortArray0, (java.lang.Object) strSpliterator29);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertNotNull(shortArrayStream1);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4) + "'", int18 == (-4));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strSpliterator29);
    }

    @Test
    public void test8536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8536");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        int[] intArray9 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        int int11 = java.util.Arrays.binarySearch(intArray3, (int) 'a');
        int int13 = java.util.Arrays.binarySearch(intArray3, (int) (short) 1);
        int[] intArray15 = java.util.Arrays.copyOf(intArray3, 10);
        java.util.Arrays.fill(intArray3, 17);
        java.util.Arrays.parallelSort(intArray3, (int) (short) 0, (int) '4');
        int int22 = java.util.Arrays.binarySearch(intArray3, 99);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-101) + "'", int11 == (-101));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-101) + "'", int13 == (-101));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-101) + "'", int22 == (-101));
    }

    @Test
    public void test8537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8537");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.sort(byteArray1);
        int int7 = java.util.Arrays.binarySearch(byteArray1, (byte) -1);
        byte[] byteArray9 = java.util.Arrays.copyOf(byteArray1, 0);
        java.util.Arrays.fill(byteArray1, (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(byteArray1, 99, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(99) > toIndex(15)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
    }

    @Test
    public void test8538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8538");
        short[][] shortArray0 = new short[][] {};
        short[][][] shortArray1 = new short[][][] { shortArray0 };
        short[][] shortArray2 = new short[][] {};
        short[][][] shortArray3 = new short[][][] { shortArray2 };
        short[][] shortArray4 = new short[][] {};
        short[][][] shortArray5 = new short[][][] { shortArray4 };
        short[][] shortArray6 = new short[][] {};
        short[][][] shortArray7 = new short[][][] { shortArray6 };
        short[][] shortArray8 = new short[][] {};
        short[][][] shortArray9 = new short[][][] { shortArray8 };
        short[][] shortArray10 = new short[][] {};
        short[][][] shortArray11 = new short[][][] { shortArray10 };
        short[][][][] shortArray12 = new short[][][][] { shortArray1, shortArray3, shortArray5, shortArray7, shortArray9, shortArray11 };
        java.util.Spliterator<short[][][]> shortArraySpliterator13 = java.util.Arrays.spliterator(shortArray12);
        java.lang.Class<?> wildcardClass14 = shortArraySpliterator13.getClass();
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(shortArraySpliterator13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test8539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8539");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream3 = java.util.Arrays.stream(charSequenceArray2);
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream7 = java.util.Arrays.stream(charSequenceArray6);
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream11 = java.util.Arrays.stream(charSequenceArray10);
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream15 = java.util.Arrays.stream(charSequenceArray14);
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream19 = java.util.Arrays.stream(charSequenceArray18);
        java.util.stream.Stream[] streamArray21 = new java.util.stream.Stream[5];
        @SuppressWarnings("unchecked")
        java.util.stream.Stream<java.lang.CharSequence>[] charSequenceStreamArray22 = (java.util.stream.Stream<java.lang.CharSequence>[]) streamArray21;
        charSequenceStreamArray22[0] = charSequenceStream3;
        charSequenceStreamArray22[1] = charSequenceStream7;
        charSequenceStreamArray22[2] = charSequenceStream11;
        charSequenceStreamArray22[3] = charSequenceStream15;
        charSequenceStreamArray22[4] = charSequenceStream19;
        java.util.List<java.util.stream.Stream<java.lang.CharSequence>> charSequenceStreamList33 = java.util.Arrays.asList(charSequenceStreamArray22);
        java.util.stream.Stream<java.lang.AutoCloseable> autoCloseableStream34 = java.util.Arrays.stream((java.lang.AutoCloseable[]) charSequenceStreamArray22);
        java.util.Spliterator<java.util.stream.BaseStream<java.lang.CharSequence, java.util.stream.Stream<java.lang.CharSequence>>> charSequenceBaseStreamSpliterator35 = java.util.Arrays.spliterator((java.util.stream.BaseStream<java.lang.CharSequence, java.util.stream.Stream<java.lang.CharSequence>>[]) charSequenceStreamArray22);
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertNotNull(charSequenceStream3);
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertNotNull(charSequenceStream7);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(charSequenceStream11);
        org.junit.Assert.assertNotNull(charSequenceArray14);
        org.junit.Assert.assertNotNull(charSequenceStream15);
        org.junit.Assert.assertNotNull(charSequenceArray18);
        org.junit.Assert.assertNotNull(charSequenceStream19);
        org.junit.Assert.assertNotNull(streamArray21);
        org.junit.Assert.assertNotNull(charSequenceStreamArray22);
        org.junit.Assert.assertNotNull(charSequenceStreamList33);
        org.junit.Assert.assertNotNull(autoCloseableStream34);
        org.junit.Assert.assertNotNull(charSequenceBaseStreamSpliterator35);
    }

    @Test
    public void test8540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8540");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.stream.LongStream longStream7 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.sort(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = java.util.Arrays.binarySearch(longArray3, 47, (-5), (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(47) > toIndex(-5)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test8541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8541");
        java.util.Spliterator.OfInt[][] ofIntArray0 = new java.util.Spliterator.OfInt[][] {};
        java.util.Spliterator.OfInt[][] ofIntArray1 = new java.util.Spliterator.OfInt[][] {};
        java.util.Spliterator.OfInt[][] ofIntArray2 = new java.util.Spliterator.OfInt[][] {};
        java.util.Spliterator.OfInt[][] ofIntArray3 = new java.util.Spliterator.OfInt[][] {};
        java.util.Spliterator.OfInt[][][] ofIntArray4 = new java.util.Spliterator.OfInt[][][] { ofIntArray0, ofIntArray1, ofIntArray2, ofIntArray3 };
        java.util.stream.Stream<java.util.Spliterator.OfInt[][]> ofIntArrayStream5 = java.util.Arrays.stream(ofIntArray4);
        java.util.Spliterator.OfInt[][][] ofIntArray7 = java.util.Arrays.copyOf(ofIntArray4, 0);
        org.junit.Assert.assertNotNull(ofIntArray0);
        org.junit.Assert.assertNotNull(ofIntArray1);
        org.junit.Assert.assertNotNull(ofIntArray2);
        org.junit.Assert.assertNotNull(ofIntArray3);
        org.junit.Assert.assertNotNull(ofIntArray4);
        org.junit.Assert.assertNotNull(ofIntArrayStream5);
        org.junit.Assert.assertNotNull(ofIntArray7);
    }

    @Test
    public void test8542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8542");
        int[] intArray6 = new int[] { '4', (short) 0, '4', (byte) 100, (-3), (byte) -1 };
        java.util.Arrays.fill(intArray6, (int) (byte) 10);
        java.util.Spliterator.OfInt ofInt9 = java.util.Arrays.spliterator(intArray6);
        int int11 = java.util.Arrays.binarySearch(intArray6, (int) '#');
        int int13 = java.util.Arrays.binarySearch(intArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = java.util.Arrays.binarySearch(intArray6, 10, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(10) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10, 10, 10, 10, 10]");
        org.junit.Assert.assertNotNull(ofInt9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-7) + "'", int11 == (-7));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test8543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8543");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        java.util.Spliterator.OfDouble ofDouble10 = java.util.Arrays.spliterator(doubleArray7, 10, (int) '#');
        int int12 = java.util.Arrays.binarySearch(doubleArray7, (double) (-1));
        java.util.Arrays.sort(doubleArray7);
        int int15 = java.util.Arrays.binarySearch(doubleArray7, (double) 6);
        double[] doubleArray18 = java.util.Arrays.copyOfRange(doubleArray7, 4, 5);
        java.util.Arrays.parallelSort(doubleArray7, (int) (byte) 1, (int) '#');
        java.util.Arrays.sort(doubleArray7);
        java.util.function.DoubleBinaryOperator doubleBinaryOperator25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(doubleArray7, (int) 'a', 4, doubleBinaryOperator25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(ofDouble10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0]");
    }

    @Test
    public void test8544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8544");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.sort(byteArray4);
        byte[] byteArray9 = java.util.Arrays.copyOf(byteArray4, 5);
        java.util.Arrays.fill(byteArray4, (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(byteArray4, 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(10) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 0, 0, 0]");
    }

    @Test
    public void test8545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8545");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(intArray0, 49, (-36), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8546");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.sort(intArray3);
        int int10 = java.util.Arrays.binarySearch(intArray3, 5);
        java.util.Spliterator.OfInt ofInt11 = java.util.Arrays.spliterator(intArray3);
        int int13 = java.util.Arrays.binarySearch(intArray3, 17);
        java.util.stream.IntStream intStream16 = java.util.Arrays.stream(intArray3, 2, (int) (byte) 10);
        java.util.stream.IntStream intStream19 = java.util.Arrays.stream(intArray3, (int) (byte) 0, 0);
        java.util.Arrays.fill(intArray3, 100);
        java.util.stream.IntStream intStream22 = java.util.Arrays.stream(intArray3);
        int[] intArray24 = java.util.Arrays.copyOf(intArray3, 49);
        java.util.Arrays.sort(intArray24);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-100) + "'", int10 == (-100));
        org.junit.Assert.assertNotNull(ofInt11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-100) + "'", int13 == (-100));
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNotNull(intStream19);
        org.junit.Assert.assertNotNull(intStream22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100]");
    }

    @Test
    public void test8547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8547");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        java.util.Spliterator.OfDouble ofDouble10 = java.util.Arrays.spliterator(doubleArray9);
        java.util.Arrays.sort(doubleArray9);
        java.util.Arrays.parallelSort(doubleArray9, (int) (short) 1, 3);
        double[] doubleArray16 = java.util.Arrays.copyOf(doubleArray9, (int) (byte) 100);
        double[] doubleArray18 = java.util.Arrays.copyOf(doubleArray9, 6);
        java.util.function.IntToDoubleFunction intToDoubleFunction19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(doubleArray18, intToDoubleFunction19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(ofDouble10);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test8548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8548");
        java.util.stream.Stream[][] streamArray1 = new java.util.stream.Stream[0][];
        @SuppressWarnings("unchecked")
        java.util.stream.Stream<java.lang.CharSequence>[][] charSequenceStreamArray2 = (java.util.stream.Stream<java.lang.CharSequence>[][]) streamArray1;
        java.util.stream.Stream<java.lang.CharSequence>[][] charSequenceStreamArray4 = java.util.Arrays.copyOf(charSequenceStreamArray2, 0);
        java.util.Spliterator<java.util.stream.BaseStream<java.lang.CharSequence, java.util.stream.Stream<java.lang.CharSequence>>[]> charSequenceBaseStreamArraySpliterator5 = java.util.Arrays.spliterator((java.util.stream.BaseStream<java.lang.CharSequence, java.util.stream.Stream<java.lang.CharSequence>>[][]) charSequenceStreamArray2);
        org.junit.Assert.assertNotNull(streamArray1);
        org.junit.Assert.assertNotNull(charSequenceStreamArray2);
        org.junit.Assert.assertNotNull(charSequenceStreamArray4);
        org.junit.Assert.assertNotNull(charSequenceBaseStreamArraySpliterator5);
    }

    @Test
    public void test8549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8549");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray3, (int) (byte) 0, (int) (byte) 1);
        java.util.Spliterator.OfInt ofInt9 = java.util.Arrays.spliterator(intArray3, (int) (byte) 1, 10);
        int[] intArray11 = new int[] { 100 };
        int[] intArray13 = java.util.Arrays.copyOf(intArray11, (int) (short) 100);
        int int17 = java.util.Arrays.binarySearch(intArray13, (int) (byte) 1, 10, 0);
        int[] intArray19 = java.util.Arrays.copyOf(intArray13, (int) (short) 100);
        int int21 = java.util.Arrays.binarySearch(intArray13, (int) 'a');
        java.util.Spliterator.OfInt ofInt22 = java.util.Arrays.spliterator(intArray13);
        int[] intArray24 = new int[] { 100 };
        int[] intArray26 = java.util.Arrays.copyOf(intArray24, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray26, (int) (byte) 0, (int) (byte) 1);
        java.util.Spliterator.OfInt ofInt30 = java.util.Arrays.spliterator(intArray26);
        int[] intArray32 = new int[] { 100 };
        int[] intArray34 = java.util.Arrays.copyOf(intArray32, (int) (short) 100);
        int int38 = java.util.Arrays.binarySearch(intArray34, (int) (byte) 1, 10, 0);
        int[] intArray40 = java.util.Arrays.copyOf(intArray34, (int) (short) 100);
        int int42 = java.util.Arrays.binarySearch(intArray34, (int) 'a');
        java.util.Spliterator.OfInt ofInt43 = java.util.Arrays.spliterator(intArray34);
        java.util.Spliterator.OfInt ofInt44 = java.util.Arrays.spliterator(intArray34);
        int[] intArray46 = new int[] { 100 };
        int[] intArray48 = java.util.Arrays.copyOf(intArray46, (int) (short) 100);
        int int52 = java.util.Arrays.binarySearch(intArray48, (int) (byte) 1, 10, 0);
        java.util.Spliterator.OfInt ofInt53 = java.util.Arrays.spliterator(intArray48);
        int[] intArray55 = new int[] { 100 };
        int[] intArray57 = java.util.Arrays.copyOf(intArray55, (int) (short) 100);
        int int61 = java.util.Arrays.binarySearch(intArray57, (int) (byte) 1, 10, 0);
        int[] intArray63 = java.util.Arrays.copyOf(intArray57, (int) (short) 100);
        int int65 = java.util.Arrays.binarySearch(intArray57, (int) 'a');
        java.util.Spliterator.OfInt ofInt66 = java.util.Arrays.spliterator(intArray57);
        java.util.Spliterator.OfInt[] ofIntArray67 = new java.util.Spliterator.OfInt[] { ofInt9, ofInt22, ofInt30, ofInt44, ofInt53, ofInt66 };
        java.util.stream.Stream<java.util.Spliterator.OfInt> ofIntStream68 = java.util.Arrays.stream(ofIntArray67);
        java.util.Spliterator<java.util.Spliterator.OfInt> ofIntSpliterator69 = java.util.Arrays.spliterator(ofIntArray67);
        java.util.Spliterator.OfPrimitive<java.lang.Integer, java.util.function.IntConsumer, java.util.Spliterator.OfInt>[] intOfPrimitiveArray71 = java.util.Arrays.copyOf((java.util.Spliterator.OfPrimitive<java.lang.Integer, java.util.function.IntConsumer, java.util.Spliterator.OfInt>[]) ofIntArray67, (int) (short) 10);
        java.util.List<java.util.Spliterator.OfPrimitive<java.lang.Integer, java.util.function.IntConsumer, java.util.Spliterator.OfInt>> intOfPrimitiveList72 = java.util.Arrays.asList((java.util.Spliterator.OfPrimitive<java.lang.Integer, java.util.function.IntConsumer, java.util.Spliterator.OfInt>[]) ofIntArray67);
        char[] charArray77 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray77, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray77, '#');
        java.util.Arrays.sort(charArray77);
        java.util.Arrays.fill(charArray77, 'a');
        java.util.Arrays.fill(charArray77, 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int88 = java.util.Arrays.binarySearch((java.lang.Object[]) ofIntArray67, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Spliterators$IntArraySpliterator cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofInt9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-101) + "'", int21 == (-101));
        org.junit.Assert.assertNotNull(ofInt22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofInt30);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 5 + "'", int38 == 5);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-101) + "'", int42 == (-101));
        org.junit.Assert.assertNotNull(ofInt43);
        org.junit.Assert.assertNotNull(ofInt44);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[100]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 5 + "'", int52 == 5);
        org.junit.Assert.assertNotNull(ofInt53);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[100]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 5 + "'", int61 == 5);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-101) + "'", int65 == (-101));
        org.junit.Assert.assertNotNull(ofInt66);
        org.junit.Assert.assertNotNull(ofIntArray67);
        org.junit.Assert.assertNotNull(ofIntStream68);
        org.junit.Assert.assertNotNull(ofIntSpliterator69);
        org.junit.Assert.assertNotNull(intOfPrimitiveArray71);
        org.junit.Assert.assertNotNull(intOfPrimitiveList72);
        org.junit.Assert.assertNotNull(charArray77);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray77), "aaaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray77), "aaaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray77), "[a, a, a, a]");
    }

    @Test
    public void test8550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8550");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        java.util.Arrays.parallelSort(longArray3);
        java.util.stream.LongStream longStream12 = java.util.Arrays.stream(longArray3, (int) (byte) 1, (int) (short) 1);
        int int14 = java.util.Arrays.binarySearch(longArray3, 0L);
        java.util.Arrays.fill(longArray3, (long) (byte) 1);
        java.util.stream.LongStream longStream17 = java.util.Arrays.stream(longArray3);
        long[] longArray19 = java.util.Arrays.copyOf(longArray3, (int) (short) 1);
        long[] longArray21 = java.util.Arrays.copyOf(longArray19, 100);
        java.util.Arrays.parallelSort(longArray21);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(longStream17);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[1]");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1]");
    }

    @Test
    public void test8551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8551");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.sort(byteArray1);
        int int7 = java.util.Arrays.binarySearch(byteArray1, (byte) -1);
        byte[] byteArray9 = java.util.Arrays.copyOf(byteArray1, 0);
        int int11 = java.util.Arrays.binarySearch(byteArray9, (byte) 0);
        java.util.Arrays.parallelSort(byteArray9);
        java.util.Arrays.parallelSort(byteArray9);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test8552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8552");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        int[] intArray9 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        int int11 = java.util.Arrays.binarySearch(intArray3, (int) 'a');
        int int13 = java.util.Arrays.binarySearch(intArray3, (int) (short) 1);
        int[] intArray15 = java.util.Arrays.copyOf(intArray3, 10);
        java.util.stream.IntStream intStream16 = java.util.Arrays.stream(intArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(intArray15, (-33), (int) (short) 10, (-30));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -33");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-101) + "'", int11 == (-101));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-101) + "'", int13 == (-101));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intStream16);
    }

    @Test
    public void test8553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8553");
        double[] doubleArray2 = new double[] { (-53), (-2) };
        int int4 = java.util.Arrays.binarySearch(doubleArray2, (double) (byte) 100);
        java.util.Spliterator.OfDouble ofDouble5 = java.util.Arrays.spliterator(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(doubleArray2, 3, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(3) > toIndex(-8)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-53.0, -2.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-3) + "'", int4 == (-3));
        org.junit.Assert.assertNotNull(ofDouble5);
    }

    @Test
    public void test8554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8554");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        double[] doubleArray14 = java.util.Arrays.copyOfRange(doubleArray11, 2, 100);
        int int16 = java.util.Arrays.binarySearch(doubleArray11, (double) 0);
        double[] doubleArray19 = java.util.Arrays.copyOfRange(doubleArray11, (int) (short) 0, (int) (short) 1);
        java.util.Arrays.parallelSort(doubleArray11, (int) (short) 0, 2);
        java.util.Arrays.sort(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0]");
    }

    @Test
    public void test8555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8555");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        long[] longArray11 = java.util.Arrays.copyOfRange(longArray3, 0, (int) (byte) 0);
        java.util.Arrays.parallelSort(longArray11);
        int int14 = java.util.Arrays.binarySearch(longArray11, (long) (-53));
        java.util.Arrays.fill(longArray11, 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(longArray11, (-8), (-53), (long) (-71));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(-8) > toIndex(-53)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test8556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8556");
        java.util.stream.IntStream[][] intStreamArray0 = new java.util.stream.IntStream[][] {};
        java.util.stream.IntStream[][] intStreamArray1 = new java.util.stream.IntStream[][] {};
        java.util.stream.IntStream[][] intStreamArray2 = new java.util.stream.IntStream[][] {};
        java.util.stream.IntStream[][] intStreamArray3 = new java.util.stream.IntStream[][] {};
        java.util.stream.IntStream[][] intStreamArray4 = new java.util.stream.IntStream[][] {};
        java.util.stream.IntStream[][][] intStreamArray5 = new java.util.stream.IntStream[][][] { intStreamArray0, intStreamArray1, intStreamArray2, intStreamArray3, intStreamArray4 };
        java.util.List<java.util.stream.IntStream[][]> intStreamArrayList6 = java.util.Arrays.asList(intStreamArray5);
        org.junit.Assert.assertNotNull(intStreamArray0);
        org.junit.Assert.assertNotNull(intStreamArray1);
        org.junit.Assert.assertNotNull(intStreamArray2);
        org.junit.Assert.assertNotNull(intStreamArray3);
        org.junit.Assert.assertNotNull(intStreamArray4);
        org.junit.Assert.assertNotNull(intStreamArray5);
        org.junit.Assert.assertNotNull(intStreamArrayList6);
    }

    @Test
    public void test8557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8557");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong8 = java.util.Arrays.spliterator(longArray7);
        java.util.Arrays.parallelSort(longArray7);
        java.util.Arrays.sort(longArray7);
        java.util.Arrays.parallelSort(longArray7);
        java.util.Arrays.fill(longArray7, (long) (-2));
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfLong ofLong16 = java.util.Arrays.spliterator(longArray7, (int) '4', (-18));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(52) > fence(-18)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[-2, -2, -2, -2, -2, -2, -2, -2, -2]");
        org.junit.Assert.assertNotNull(ofLong8);
    }

    @Test
    public void test8558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8558");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.fill(intArray3, (int) (short) 1);
        java.util.Arrays.fill(intArray3, (int) ' ', (int) (short) 100, 0);
        int[] intArray12 = java.util.Arrays.copyOfRange(intArray3, 0, (int) '4');
        java.util.Arrays.sort(intArray3);
        java.util.Arrays.sort(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java.util.Arrays.binarySearch(intArray3, (-98), (-98), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -98");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test8559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8559");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int[] intArray11 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        java.util.Arrays.sort(intArray11);
        int[] intArray15 = java.util.Arrays.copyOfRange(intArray11, 0, 100);
        java.util.stream.IntStream intStream16 = java.util.Arrays.stream(intArray11);
        int int18 = java.util.Arrays.binarySearch(intArray11, 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test8560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8560");
        short[] shortArray0 = new short[] {};
        short[] shortArray1 = new short[] {};
        short[][] shortArray2 = new short[][] { shortArray0, shortArray1 };
        short[][][] shortArray3 = new short[][][] { shortArray2 };
        java.util.stream.Stream<short[][]> shortArrayStream4 = java.util.Arrays.stream(shortArray3);
        long[] longArray8 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream9 = java.util.Arrays.stream(longArray8);
        java.util.Arrays.fill(longArray8, (long) (byte) 10);
        int int13 = java.util.Arrays.binarySearch(longArray8, (-1L));
        java.util.Arrays.parallelSort(longArray8);
        java.util.stream.LongStream longStream17 = java.util.Arrays.stream(longArray8, (int) (byte) 1, (int) (short) 1);
        int int19 = java.util.Arrays.binarySearch(longArray8, 0L);
        long[] longArray21 = java.util.Arrays.copyOf(longArray8, (int) ' ');
        long[] longArray23 = java.util.Arrays.copyOf(longArray21, 1);
        int int25 = java.util.Arrays.binarySearch(longArray23, 1L);
        int int27 = java.util.Arrays.binarySearch(longArray23, (long) 3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill((java.lang.Object[]) shortArray3, (java.lang.Object) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.Integer");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[]");
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArrayStream4);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(longStream17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[10, 10, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[10]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test8561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8561");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int[] intArray11 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        java.util.Arrays.sort(intArray11);
        int[] intArray15 = java.util.Arrays.copyOfRange(intArray11, 0, 100);
        int int17 = java.util.Arrays.binarySearch(intArray11, 0);
        java.util.Arrays.parallelSort(intArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(intArray11, (-97), 15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test8562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8562");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.sort(byteArray1);
        int int7 = java.util.Arrays.binarySearch(byteArray1, (byte) -1);
        int int9 = java.util.Arrays.binarySearch(byteArray1, (byte) 0);
        int int11 = java.util.Arrays.binarySearch(byteArray1, (byte) 10);
        byte[] byteArray13 = java.util.Arrays.copyOf(byteArray1, 17);
        java.util.Arrays.fill(byteArray1, (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = java.util.Arrays.binarySearch(byteArray1, 99, (-1), (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(99) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test8563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8563");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        java.util.Arrays.parallelSort(charArray4);
        int int13 = java.util.Arrays.binarySearch(charArray4, 'a');
        char[] charArray16 = java.util.Arrays.copyOfRange(charArray4, (int) (short) 0, (int) ' ');
        int int18 = java.util.Arrays.binarySearch(charArray4, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(charArray4, 29, (-33));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(29) > toIndex(-33)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , 4, a, a]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), " 4aa\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), " 4aa\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ , 4, a, a, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test8564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8564");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.parallelSort(floatArray3);
        java.util.Arrays.fill(floatArray3, (float) ' ');
        java.util.Arrays.fill(floatArray3, 0, 0, (float) (-4));
        int int14 = java.util.Arrays.binarySearch(floatArray3, 100.0f);
        java.util.Arrays.fill(floatArray3, (float) (byte) 100);
        java.util.Arrays.sort(floatArray3);
        java.util.Arrays.parallelSort(floatArray3);
        float[] floatArray20 = java.util.Arrays.copyOf(floatArray3, (int) '4');
        java.util.Arrays.fill(floatArray3, (float) 2);
        java.util.Arrays.fill(floatArray3, (float) 5);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray26 = java.util.Arrays.copyOf(floatArray3, (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[5.0, 5.0, 5.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-4) + "'", int14 == (-4));
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[100.0, 100.0, 100.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test8565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8565");
        long[] longArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(longArray0, 1, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8566");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray4, '#');
        char[] charArray11 = java.util.Arrays.copyOf(charArray4, (int) (byte) 1);
        char[] charArray13 = java.util.Arrays.copyOf(charArray4, 5);
        java.util.Arrays.fill(charArray13, 'a');
        java.util.Arrays.sort(charArray13);
        java.util.Arrays.fill(charArray13, '#');
        char[] charArray21 = java.util.Arrays.copyOfRange(charArray13, 0, 17);
        char[] charArray26 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray26, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray26, '#');
        java.util.Arrays.sort(charArray26);
        java.util.Arrays.parallelSort(charArray26);
        java.util.Arrays.sort(charArray26);
        boolean boolean35 = java.util.Arrays.equals(charArray13, charArray26);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, #, #, #, #]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "#####\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "#####\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[#, #, #, #, #, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[#, #, #, #]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test8567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8567");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        java.util.Spliterator.OfDouble ofDouble11 = java.util.Arrays.spliterator(doubleArray4, (int) '4', 100);
        double[] doubleArray13 = java.util.Arrays.copyOf(doubleArray4, 0);
        double[] doubleArray15 = java.util.Arrays.copyOf(doubleArray13, 2);
        java.util.Arrays.parallelSort(doubleArray13);
        java.util.Arrays.sort(doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertNotNull(ofDouble11);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 0.0]");
    }

    @Test
    public void test8568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8568");
        java.util.stream.DoubleStream[][] doubleStreamArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator<java.util.stream.DoubleStream[]> doubleStreamArraySpliterator3 = java.util.Arrays.spliterator(doubleStreamArray0, (int) '4', (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8569");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) (byte) 100);
        short[] shortArray6 = java.util.Arrays.copyOf(shortArray0, 1);
        short[] shortArray8 = java.util.Arrays.copyOf(shortArray6, (int) (byte) 100);
        java.util.Arrays.fill(shortArray6, (short) 100);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100]");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test8570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8570");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.sort(longArray3);
        java.util.Arrays.sort(longArray3);
        java.util.Arrays.fill(longArray3, (long) (-4));
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-4, -4, -4]");
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test8571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8571");
        java.lang.reflect.Type[][] typeArray0 = new java.lang.reflect.Type[][] {};
        java.util.stream.Stream<java.lang.reflect.Type[]> typeArrayStream1 = java.util.Arrays.stream(typeArray0);
        short[] shortArray2 = new short[] {};
        int int4 = java.util.Arrays.binarySearch(shortArray2, (short) 1);
        int int6 = java.util.Arrays.binarySearch(shortArray2, (short) (byte) 100);
        short[] shortArray8 = java.util.Arrays.copyOf(shortArray2, 1);
        java.util.Arrays.sort(shortArray2);
        int int10 = java.util.Arrays.binarySearch((java.lang.Object[]) typeArray0, (java.lang.Object) shortArray2);
        java.util.Arrays.fill(shortArray2, (short) 100);
        java.util.Arrays.fill(shortArray2, (short) (byte) 1);
        java.util.Arrays.parallelSort(shortArray2);
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(typeArrayStream1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test8572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8572");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.sort((java.lang.Object[]) strArray2);
        java.io.Serializable[] serializableArray7 = java.util.Arrays.copyOf((java.io.Serializable[]) strArray2, 100);
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.fill((java.lang.Object[]) strArray2, (java.lang.Object) "[17.0, 17.0]");
        java.util.Arrays.parallelSort(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(strArray2, (-98), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -98");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(serializableArray7);
    }

    @Test
    public void test8573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8573");
        float[] floatArray1 = new float[] { (-1L) };
        int int3 = java.util.Arrays.binarySearch(floatArray1, (float) (short) -1);
        java.util.Arrays.sort(floatArray1);
        java.util.Arrays.fill(floatArray1, (float) 100);
        java.util.Arrays.sort(floatArray1);
        float[] floatArray9 = java.util.Arrays.copyOf(floatArray1, (int) ' ');
        java.util.Arrays.fill(floatArray1, (float) 17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(floatArray1, (-97), (-53));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[17.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[100.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test8574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8574");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        byte[] byteArray8 = java.util.Arrays.copyOf(byteArray4, 10);
        java.util.Arrays.sort(byteArray8);
        java.util.Arrays.sort(byteArray8);
        byte[] byteArray12 = java.util.Arrays.copyOf(byteArray8, 1);
        java.util.Arrays.fill(byteArray8, (byte) -1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, -1, -1, -1, -1, -1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0]");
    }

    @Test
    public void test8575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8575");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray2);
        java.util.List<java.lang.Comparable<java.lang.String>> strComparableList4 = java.util.Arrays.asList((java.lang.Comparable<java.lang.String>[]) strArray2);
        float[] floatArray8 = new float[] { (-1), (short) -1, '4' };
        int int10 = java.util.Arrays.binarySearch(floatArray8, 0.0f);
        int int12 = java.util.Arrays.binarySearch(floatArray8, 0.0f);
        int int14 = java.util.Arrays.binarySearch(floatArray8, (float) (short) 0);
        int int16 = java.util.Arrays.binarySearch(floatArray8, 0.0f);
        float[] floatArray18 = java.util.Arrays.copyOf(floatArray8, (int) (byte) 0);
        int int20 = java.util.Arrays.binarySearch(floatArray18, (float) 17);
        java.util.Arrays.parallelSort(floatArray18);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java.util.Arrays.binarySearch((java.lang.Object[]) strArray2, (java.lang.Object) floatArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [F cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[-1.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-3) + "'", int10 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3) + "'", int14 == (-3));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-3) + "'", int16 == (-3));
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test8576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8576");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        double[] doubleArray10 = java.util.Arrays.copyOf(doubleArray4, (int) (short) 10);
        java.util.function.DoubleBinaryOperator doubleBinaryOperator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(doubleArray10, doubleBinaryOperator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test8577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8577");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.fill(longArray3, (long) '4');
        java.util.Arrays.parallelSort(longArray3);
        java.util.function.LongBinaryOperator longBinaryOperator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(longArray3, longBinaryOperator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[52, 52, 52]");
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test8578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8578");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        java.util.Arrays.sort(doubleArray7);
        java.util.stream.DoubleStream doubleStream9 = java.util.Arrays.stream(doubleArray7);
        int int11 = java.util.Arrays.binarySearch(doubleArray7, (double) 100L);
        java.util.Spliterator.OfDouble ofDouble12 = java.util.Arrays.spliterator(doubleArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(doubleArray7, 4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-96) + "'", int11 == (-96));
        org.junit.Assert.assertNotNull(ofDouble12);
    }

    @Test
    public void test8579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8579");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(booleanArray0, (-53), (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8580");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        int[] intArray9 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        java.util.Arrays.sort(intArray3);
        int[] intArray13 = java.util.Arrays.copyOfRange(intArray3, 0, (int) (byte) 10);
        java.util.stream.IntStream intStream16 = java.util.Arrays.stream(intArray3, (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intStream16);
    }

    @Test
    public void test8581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8581");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(shortArray0, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8582");
        double[] doubleArray4 = new double[] { 3, 0.0f, (short) 0, (-4) };
        java.util.Arrays.fill(doubleArray4, (double) (byte) 0);
        java.util.Arrays.parallelSort(doubleArray4);
        java.util.stream.DoubleStream doubleStream8 = java.util.Arrays.stream(doubleArray4);
        double[] doubleArray11 = java.util.Arrays.copyOfRange(doubleArray4, 0, 100);
        int int13 = java.util.Arrays.binarySearch(doubleArray4, (double) (byte) -1);
        java.util.stream.DoubleStream doubleStream14 = java.util.Arrays.stream(doubleArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(doubleArray4, (int) (short) 0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(doubleStream14);
    }

    @Test
    public void test8583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8583");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.sort(byteArray1);
        int int7 = java.util.Arrays.binarySearch(byteArray1, (byte) -1);
        java.util.Arrays.fill(byteArray1, (byte) 10);
        int int11 = java.util.Arrays.binarySearch(byteArray1, (byte) 10);
        byte[] byteArray13 = java.util.Arrays.copyOf(byteArray1, 5);
        byte[] byteArray15 = java.util.Arrays.copyOf(byteArray13, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(byteArray15, (-71), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -71");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10]");
    }

    @Test
    public void test8584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8584");
        short[] shortArray0 = new short[] {};
        short[] shortArray1 = new short[] {};
        short[][] shortArray2 = new short[][] { shortArray0, shortArray1 };
        short[][][] shortArray3 = new short[][][] { shortArray2 };
        java.util.stream.Stream<short[][]> shortArrayStream4 = java.util.Arrays.stream(shortArray3);
        java.util.List<short[][]> shortArrayList5 = java.util.Arrays.asList(shortArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort((java.lang.Object[]) shortArray3, (int) '4', (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(52) > toIndex(-6)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[]");
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArrayStream4);
        org.junit.Assert.assertNotNull(shortArrayList5);
    }

    @Test
    public void test8585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8585");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        float[] floatArray7 = java.util.Arrays.copyOf(floatArray3, (int) ' ');
        float[] floatArray9 = java.util.Arrays.copyOf(floatArray3, (int) (short) 1);
        java.util.Arrays.parallelSort(floatArray3);
        java.util.Arrays.fill(floatArray3, (float) (-101));
        java.util.Arrays.sort(floatArray3);
        java.util.Arrays.sort(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-101.0, -101.0, -101.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, -1.0, 52.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[-1.0]");
    }

    @Test
    public void test8586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8586");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray4, '#');
        char[] charArray11 = java.util.Arrays.copyOf(charArray4, 0);
        java.util.Arrays.sort(charArray4);
        java.util.Arrays.parallelSort(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[]");
    }

    @Test
    public void test8587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8587");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(intArray0, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8588");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 0, (byte) 100 };
        java.util.Arrays.fill(byteArray3, (byte) -1);
        byte[] byteArray7 = new byte[] { (byte) 1 };
        byte[] byteArray10 = java.util.Arrays.copyOfRange(byteArray7, (int) (short) 1, 2);
        java.util.Arrays.parallelSort(byteArray10);
        java.util.Arrays.parallelSort(byteArray10);
        java.util.Arrays.parallelSort(byteArray10);
        byte[] byteArray15 = java.util.Arrays.copyOf(byteArray10, (int) '#');
        byte[] byteArray18 = java.util.Arrays.copyOfRange(byteArray10, 1, 7);
        int int20 = java.util.Arrays.binarySearch(byteArray10, (byte) 100);
        byte[] byteArray22 = java.util.Arrays.copyOf(byteArray10, 5);
        byte[] byteArray24 = java.util.Arrays.copyOf(byteArray10, (int) (byte) 0);
        boolean boolean25 = java.util.Arrays.equals(byteArray3, byteArray24);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2) + "'", int20 == (-2));
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test8589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8589");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        java.util.Arrays.fill(doubleArray4, (double) 10);
        java.util.Arrays.sort(doubleArray4);
        java.util.Spliterator.OfDouble ofDouble13 = java.util.Arrays.spliterator(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(ofDouble13);
    }

    @Test
    public void test8590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8590");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        long[] longArray9 = java.util.Arrays.copyOf(longArray3, 0);
        java.util.Spliterator.OfLong ofLong10 = java.util.Arrays.spliterator(longArray3);
        java.util.Arrays.sort(longArray3);
        java.util.Arrays.parallelSort(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[1, 3, 100]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[]");
        org.junit.Assert.assertNotNull(ofLong10);
    }

    @Test
    public void test8591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8591");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) 100);
        java.util.Arrays.sort(shortArray0);
        java.util.Arrays.sort(shortArray0);
        java.util.Arrays.fill(shortArray0, (int) (short) 0, 0, (short) 100);
        short[] shortArray12 = java.util.Arrays.copyOf(shortArray0, (int) (short) 0);
        java.util.Arrays.fill(shortArray12, (short) 1);
        java.util.Arrays.parallelSort(shortArray12);
        java.util.Arrays.fill(shortArray12, (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(shortArray12, (-18), 100, (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[]");
    }

    @Test
    public void test8592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8592");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        boolean[] booleanArray10 = java.util.Arrays.copyOfRange(booleanArray7, (int) (short) 0, (int) '#');
        boolean[] booleanArray13 = java.util.Arrays.copyOfRange(booleanArray7, 2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, true, true, false, false, false, false, false]");
    }

    @Test
    public void test8593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8593");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.util.Arrays.sort(doubleArray4);
        java.util.Arrays.fill(doubleArray4, (double) 4);
        java.util.Arrays.fill(doubleArray4, (double) 6);
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray4, 0);
        java.util.Arrays.fill(doubleArray11, (double) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(doubleArray11, (-6), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
    }

    @Test
    public void test8594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8594");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        long[] longArray9 = java.util.Arrays.copyOf(longArray3, 0);
        java.util.Spliterator.OfLong ofLong10 = java.util.Arrays.spliterator(longArray3);
        java.util.function.LongBinaryOperator longBinaryOperator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(longArray3, (int) '4', 47, longBinaryOperator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[]");
        org.junit.Assert.assertNotNull(ofLong10);
    }

    @Test
    public void test8595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8595");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray3, (int) (byte) 0, (int) (byte) 1);
        java.util.Spliterator.OfInt ofInt7 = java.util.Arrays.spliterator(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = java.util.Arrays.copyOfRange(intArray3, (int) (byte) 10, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10 > 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofInt7);
    }

    @Test
    public void test8596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8596");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        int[] intArray9 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        int int11 = java.util.Arrays.binarySearch(intArray3, (int) 'a');
        java.util.Spliterator.OfInt ofInt12 = java.util.Arrays.spliterator(intArray3);
        java.util.Spliterator.OfInt ofInt13 = java.util.Arrays.spliterator(intArray3);
        java.util.Arrays.fill(intArray3, 17);
        int[] intArray17 = java.util.Arrays.copyOf(intArray3, 3);
        java.util.stream.IntStream intStream18 = java.util.Arrays.stream(intArray17);
        java.util.Arrays.parallelSort(intArray17);
        java.util.Arrays.fill(intArray17, 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-101) + "'", int11 == (-101));
        org.junit.Assert.assertNotNull(ofInt12);
        org.junit.Assert.assertNotNull(ofInt13);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intStream18);
    }

    @Test
    public void test8597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8597");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(charArray0, (-71), 15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8598");
        float[] floatArray1 = new float[] { (-1L) };
        int int3 = java.util.Arrays.binarySearch(floatArray1, (float) (short) -1);
        java.util.Arrays.sort(floatArray1);
        java.util.Arrays.sort(floatArray1);
        int int7 = java.util.Arrays.binarySearch(floatArray1, 0.0f);
        float[] floatArray10 = java.util.Arrays.copyOfRange(floatArray1, (int) (short) 1, (int) (byte) 100);
        int int12 = java.util.Arrays.binarySearch(floatArray10, (float) 6);
        int int14 = java.util.Arrays.binarySearch(floatArray10, (float) (-32));
        java.util.Arrays.parallelSort(floatArray10);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test8599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8599");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong8 = java.util.Arrays.spliterator(longArray7);
        java.util.Arrays.parallelSort(longArray7);
        int int13 = java.util.Arrays.binarySearch(longArray7, 1, 4, (long) 3);
        long[] longArray15 = java.util.Arrays.copyOf(longArray7, (int) 'a');
        java.util.Arrays.sort(longArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream19 = java.util.Arrays.stream(longArray15, (-2), (-33));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(-2) > fence(-33)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[0, 0, 0, 0, 0, 0, 0, 1, 3]");
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-5) + "'", int13 == (-5));
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 3]");
    }

    @Test
    public void test8600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8600");
        boolean[] booleanArray6 = new boolean[] { false, true, true, false, true, true };
        java.util.Arrays.fill(booleanArray6, false);
        java.util.Arrays.fill(booleanArray6, false);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, false, false, false, false, false]");
    }

    @Test
    public void test8601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8601");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int int11 = java.util.Arrays.binarySearch(intArray3, 1);
        java.util.Spliterator.OfInt ofInt12 = java.util.Arrays.spliterator(intArray3);
        int[] intArray14 = java.util.Arrays.copyOf(intArray3, 2);
        java.util.Spliterator.OfInt ofInt15 = java.util.Arrays.spliterator(intArray14);
        int int17 = java.util.Arrays.binarySearch(intArray14, (int) 'a');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(ofInt12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[3, 3]");
        org.junit.Assert.assertNotNull(ofInt15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-3) + "'", int17 == (-3));
    }

    @Test
    public void test8602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8602");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        byte[] byteArray8 = java.util.Arrays.copyOf(byteArray4, 10);
        java.util.Arrays.sort(byteArray8);
        java.util.Arrays.parallelSort(byteArray8);
        java.util.Arrays.sort(byteArray8);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }
}

