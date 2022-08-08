import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

    public static boolean debug = false;

    @Test
    public void test7001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7001");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.parallelSort(charArray4);
        java.util.Arrays.sort(charArray4);
        int int11 = java.util.Arrays.binarySearch(charArray4, 'a');
        java.util.Arrays.parallelSort(charArray4);
        java.util.Arrays.parallelSort(charArray4);
        java.util.Arrays.sort(charArray4);
        java.util.Arrays.sort(charArray4);
        int int17 = java.util.Arrays.binarySearch(charArray4, 'a');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , 4, a, a]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test7002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7002");
        float[] floatArray1 = new float[] { (-1L) };
        int int3 = java.util.Arrays.binarySearch(floatArray1, (float) (short) -1);
        java.util.Arrays.sort(floatArray1);
        java.util.Arrays.sort(floatArray1);
        int int7 = java.util.Arrays.binarySearch(floatArray1, 0.0f);
        java.util.Arrays.parallelSort(floatArray1);
        java.util.Arrays.sort(floatArray1);
        java.util.Arrays.parallelSort(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
    }

    @Test
    public void test7003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7003");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        long[] longArray9 = java.util.Arrays.copyOf(longArray7, 17);
        java.util.Arrays.sort(longArray7);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[0, 0, 0, 0, 0, 0, 0, 1, 3]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test7004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7004");
        float[] floatArray4 = new float[] { 100.0f, (short) 0, (short) 10, (-99) };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(floatArray4, (-100), (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 0.0, 10.0, -99.0]");
    }

    @Test
    public void test7005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7005");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream5 = java.util.Arrays.stream(doubleArray4);
        java.util.Arrays.parallelSort(doubleArray4);
        java.util.Spliterator.OfDouble ofDouble7 = java.util.Arrays.spliterator(doubleArray4);
        java.util.Spliterator.OfDouble ofDouble8 = java.util.Arrays.spliterator(doubleArray4);
        java.util.function.DoubleBinaryOperator doubleBinaryOperator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(doubleArray4, doubleBinaryOperator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(ofDouble7);
        org.junit.Assert.assertNotNull(ofDouble8);
    }

    @Test
    public void test7006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7006");
        double[] doubleArray4 = new double[] { 3, 0.0f, (short) 0, (-4) };
        java.util.Arrays.fill(doubleArray4, (double) (byte) 0);
        java.util.Arrays.parallelSort(doubleArray4);
        java.util.stream.DoubleStream doubleStream8 = java.util.Arrays.stream(doubleArray4);
        double[] doubleArray11 = java.util.Arrays.copyOfRange(doubleArray4, 0, 100);
        int int13 = java.util.Arrays.binarySearch(doubleArray4, (double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(doubleArray4, (int) 'a', (-53), (double) 29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(97) > toIndex(-53)");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test7007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7007");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong8 = java.util.Arrays.spliterator(longArray7);
        java.util.Arrays.parallelSort(longArray7);
        int int11 = java.util.Arrays.binarySearch(longArray7, (long) (byte) 1);
        java.util.Spliterator.OfLong ofLong12 = java.util.Arrays.spliterator(longArray7);
        java.util.Arrays.parallelSort(longArray7);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[0, 0, 0, 0, 0, 0, 0, 1, 3]");
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertNotNull(ofLong12);
    }

    @Test
    public void test7008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7008");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        long[] longArray9 = java.util.Arrays.copyOf(longArray7, (int) '#');
        java.util.Arrays.fill(longArray9, (long) (byte) 100);
        long[] longArray13 = java.util.Arrays.copyOf(longArray9, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(longArray13, (-99), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -99");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[]");
    }

    @Test
    public void test7009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7009");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        java.util.Arrays.parallelSort(charArray4);
        int int13 = java.util.Arrays.binarySearch(charArray4, 'a');
        char[] charArray16 = java.util.Arrays.copyOfRange(charArray4, (int) (short) 0, (int) ' ');
        char[] charArray18 = java.util.Arrays.copyOf(charArray16, (int) (short) 0);
        java.util.Arrays.parallelSort(charArray18);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray22 = java.util.Arrays.copyOfRange(charArray18, (-50), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[]");
    }

    @Test
    public void test7010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7010");
        float[] floatArray1 = new float[] { 17 };
        float[] floatArray3 = java.util.Arrays.copyOf(floatArray1, 7);
        float[] floatArray5 = java.util.Arrays.copyOf(floatArray1, 6);
        java.util.Arrays.parallelSort(floatArray5);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[17.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[17.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, 0.0, 0.0, 0.0, 0.0, 17.0]");
    }

    @Test
    public void test7011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7011");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int6 = java.util.Arrays.binarySearch(doubleArray4, (double) 3);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, (double) 100.0f);
        double[] doubleArray11 = java.util.Arrays.copyOfRange(doubleArray4, 3, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream14 = java.util.Arrays.stream(doubleArray11, (-100), (-33));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-101) + "'", int6 == (-101));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-101) + "'", int8 == (-101));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test7012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7012");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        long[] longArray4 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream5 = java.util.Arrays.stream(longArray4);
        java.util.Arrays.fill(longArray4, (long) (byte) 10);
        java.util.Arrays.fill(longArray4, (long) '4');
        int int11 = java.util.Arrays.binarySearch(longArray4, 0L);
        java.util.Arrays.sort(longArray4);
        int int14 = java.util.Arrays.binarySearch(longArray4, (long) 'a');
        java.util.Arrays.fill(objArray0, (java.lang.Object) 'a');
        short[] shortArray18 = new short[] {};
        int int20 = java.util.Arrays.binarySearch(shortArray18, (short) 1);
        int int22 = java.util.Arrays.binarySearch(shortArray18, (short) 100);
        short[] shortArray24 = java.util.Arrays.copyOf(shortArray18, (int) '#');
        java.util.Arrays.fill(shortArray18, (short) 10);
        short[] shortArray28 = java.util.Arrays.copyOf(shortArray18, 4);
        java.util.Arrays.fill(shortArray18, (short) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = java.util.Arrays.binarySearch(objArray0, (-50), 49, (java.lang.Object) shortArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[52, 52, 52]");
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-4) + "'", int14 == (-4));
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray28), "[0, 0, 0, 0]");
    }

    @Test
    public void test7013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7013");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        java.util.Spliterator.OfDouble ofDouble11 = java.util.Arrays.spliterator(doubleArray4, (int) '4', 100);
        double[] doubleArray13 = java.util.Arrays.copyOf(doubleArray4, 0);
        int int15 = java.util.Arrays.binarySearch(doubleArray13, (double) (-53));
        java.util.Arrays.sort(doubleArray13);
        java.util.Arrays.sort(doubleArray13);
        java.util.stream.DoubleStream doubleStream18 = java.util.Arrays.stream(doubleArray13);
        java.util.function.DoubleBinaryOperator doubleBinaryOperator19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(doubleArray13, doubleBinaryOperator19);
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
        org.junit.Assert.assertNotNull(ofDouble11);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(doubleStream18);
    }

    @Test
    public void test7014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7014");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong8 = java.util.Arrays.spliterator(longArray7);
        long[] longArray10 = java.util.Arrays.copyOf(longArray7, (int) (byte) 1);
        long[] longArray12 = java.util.Arrays.copyOf(longArray7, 0);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray15 = java.util.Arrays.copyOfRange(longArray12, (-7), (-96));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -7 > -96");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[3]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[]");
    }

    @Test
    public void test7015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7015");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.parallelSort(floatArray3);
        java.util.Arrays.fill(floatArray3, (float) ' ');
        java.util.Arrays.parallelSort(floatArray3);
        float[] floatArray11 = java.util.Arrays.copyOf(floatArray3, 17);
        int int13 = java.util.Arrays.binarySearch(floatArray3, (float) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(floatArray3, 2, (-2), (float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(2) > toIndex(-2)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[32.0, 32.0, 32.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[32.0, 32.0, 32.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test7016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7016");
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
        long[] longArray21 = java.util.Arrays.copyOf(longArray3, 7);
        java.util.Arrays.fill(longArray3, (long) (-53));
        java.util.Arrays.parallelSort(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(longArray3, 100, 17, (long) 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(17)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-53, -53, -53]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(longStream17);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[1]");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[1, 1, 1, 0, 0, 0, 0]");
    }

    @Test
    public void test7017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7017");
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
        long[] longArray21 = java.util.Arrays.copyOf(longArray3, 7);
        java.util.Arrays.fill(longArray3, (long) (-53));
        java.util.Arrays.parallelSort(longArray3);
        java.util.Arrays.sort(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(longArray3, (int) ' ', (-18), (long) (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(32) > toIndex(-18)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-53, -53, -53]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(longStream17);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[1]");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[1, 1, 1, 0, 0, 0, 0]");
    }

    @Test
    public void test7018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7018");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, 0L);
        java.util.Arrays.parallelSort(longArray3);
        int int9 = java.util.Arrays.binarySearch(longArray3, 100L);
        java.util.stream.LongStream longStream10 = java.util.Arrays.stream(longArray3);
        long[] longArray12 = java.util.Arrays.copyOf(longArray3, (int) '4');
        java.util.stream.LongStream longStream13 = java.util.Arrays.stream(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(longArray3, (int) ' ', (-96));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(32) > toIndex(-96)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(longStream13);
    }

    @Test
    public void test7019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7019");
        short[][] shortArray0 = new short[][] {};
        short[][] shortArray2 = java.util.Arrays.copyOf(shortArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            short[][] shortArray4 = java.util.Arrays.copyOf(shortArray0, (-36));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertNotNull(shortArray2);
    }

    @Test
    public void test7020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7020");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        double[] doubleArray14 = java.util.Arrays.copyOfRange(doubleArray11, 2, 100);
        double[] doubleArray16 = java.util.Arrays.copyOf(doubleArray11, (int) '#');
        java.util.Spliterator.OfDouble ofDouble17 = java.util.Arrays.spliterator(doubleArray11);
        java.util.Spliterator.OfDouble ofDouble18 = java.util.Arrays.spliterator(doubleArray11);
        java.util.Arrays.parallelSort(doubleArray11);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray22 = java.util.Arrays.copyOfRange(doubleArray11, 10, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10 > 7");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(ofDouble17);
        org.junit.Assert.assertNotNull(ofDouble18);
    }

    @Test
    public void test7021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7021");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(intArray3, 4, (-101), 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(4) > toIndex(-101)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test7022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7022");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.fill(longArray3, (long) '4');
        int int10 = java.util.Arrays.binarySearch(longArray3, 0L);
        int int12 = java.util.Arrays.binarySearch(longArray3, (long) (byte) -1);
        java.util.Arrays.fill(longArray3, 0L);
        java.util.function.IntToLongFunction intToLongFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(longArray3, intToLongFunction15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test7023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7023");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        java.util.Spliterator.OfDouble ofDouble11 = java.util.Arrays.spliterator(doubleArray4, (int) '4', 100);
        java.lang.String str12 = java.util.Arrays.toString(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertNotNull(ofDouble11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]" + "'", str12, "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test7024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7024");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        java.util.Arrays.fill(shortArray0, (short) -1);
        java.util.Arrays.sort(shortArray0);
        java.util.Arrays.sort(shortArray0);
        java.util.Arrays.parallelSort(shortArray0);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7025");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int[] intArray11 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        int[] intArray13 = java.util.Arrays.copyOf(intArray3, 1);
        int[] intArray16 = java.util.Arrays.copyOfRange(intArray13, (int) (short) 0, 100);
        int int18 = java.util.Arrays.binarySearch(intArray13, (-96));
        java.util.Arrays.parallelSort(intArray13);
        java.util.Arrays.fill(intArray13, (-4));
        java.util.stream.IntStream intStream22 = java.util.Arrays.stream(intArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(intArray13, 99, 6, (-53));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(99) > toIndex(6)");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-4]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intStream22);
    }

    @Test
    public void test7026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7026");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 0 };
        java.util.Arrays.parallelSort(byteArray6);
        byte[] byteArray9 = java.util.Arrays.copyOf(byteArray6, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = java.util.Arrays.copyOfRange(byteArray9, 6, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 6 > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 0, 1, 1, 10]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, -1, 0, 1, 1, 10, 0, 0, 0, 0]");
    }

    @Test
    public void test7027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7027");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        byte[] byteArray9 = java.util.Arrays.copyOf(byteArray4, (int) '#');
        java.util.Arrays.parallelSort(byteArray9);
        java.util.Arrays.fill(byteArray9, (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(byteArray9, (-6), (int) (short) -1, (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]");
    }

    @Test
    public void test7028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7028");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.parallelSort(charArray4);
        java.util.Arrays.sort(charArray4);
        int int11 = java.util.Arrays.binarySearch(charArray4, 'a');
        java.util.Arrays.parallelSort(charArray4);
        java.util.Arrays.parallelSort(charArray4);
        java.util.Arrays.parallelSort(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , 4, a, a]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test7029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7029");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray3, (int) (byte) 0, (int) (byte) 1);
        java.util.Spliterator.OfInt ofInt7 = java.util.Arrays.spliterator(intArray3);
        java.util.stream.IntStream intStream8 = java.util.Arrays.stream(intArray3);
        java.util.stream.IntStream intStream11 = java.util.Arrays.stream(intArray3, 0, 3);
        java.util.stream.IntStream intStream12 = java.util.Arrays.stream(intArray3);
        java.util.Arrays.sort(intArray3);
        java.lang.String str14 = java.util.Arrays.toString(intArray3);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(ofInt7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100]" + "'", str14, "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100]");
    }

    @Test
    public void test7030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7030");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.lang.reflect.Type[][] typeArray5 = new java.lang.reflect.Type[][] {};
        java.util.stream.Stream<java.lang.reflect.Type[]> typeArrayStream6 = java.util.Arrays.stream(typeArray5);
        java.util.Arrays.fill((java.lang.Object[]) typeArray5, (java.lang.Object) "[a, a, a, a]");
        java.util.Arrays.fill((java.lang.Object[]) strArray2, (java.lang.Object) "[a, a, a, a]");
        java.util.List<java.lang.String> strList10 = java.util.Arrays.asList(strArray2);
        java.util.List<java.lang.Comparable<java.lang.String>> strComparableList11 = java.util.Arrays.asList((java.lang.Comparable<java.lang.String>[]) strArray2);
        java.util.stream.Stream<java.io.Serializable> serializableStream12 = java.util.Arrays.stream((java.io.Serializable[]) strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(strArray2, (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(typeArrayStream6);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strComparableList11);
        org.junit.Assert.assertNotNull(serializableStream12);
    }

    @Test
    public void test7031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7031");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        java.util.Arrays.parallelSort(charArray4);
        int int13 = java.util.Arrays.binarySearch(charArray4, 'a');
        char[] charArray16 = java.util.Arrays.copyOfRange(charArray4, (int) (short) 0, (int) ' ');
        java.util.Arrays.sort(charArray4);
        char[] charArray19 = java.util.Arrays.copyOf(charArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = java.util.Arrays.binarySearch(charArray19, (-2), 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
    }

    @Test
    public void test7032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7032");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.fill(intArray3, (-5));
        java.util.Arrays.parallelSort(intArray3);
        java.util.Spliterator.OfInt ofInt9 = java.util.Arrays.spliterator(intArray3, 0, 0);
        java.util.Spliterator.OfInt ofInt10 = java.util.Arrays.spliterator(intArray3);
        java.lang.String str11 = java.util.Arrays.toString(intArray3);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5]");
        org.junit.Assert.assertNotNull(ofInt9);
        org.junit.Assert.assertNotNull(ofInt10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[-5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5]" + "'", str11, "[-5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5]");
    }

    @Test
    public void test7033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7033");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(intArray0, 15, (-4), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7034");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        java.util.Arrays.parallelSort(longArray3);
        java.util.stream.LongStream longStream12 = java.util.Arrays.stream(longArray3, (int) (byte) 1, (int) (short) 1);
        int int14 = java.util.Arrays.binarySearch(longArray3, 0L);
        long[] longArray16 = java.util.Arrays.copyOf(longArray3, (int) ' ');
        long[] longArray19 = java.util.Arrays.copyOfRange(longArray16, 0, 4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfLong ofLong22 = java.util.Arrays.spliterator(longArray16, (int) '#', (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(35) > fence(-9)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[10, 10, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[10, 10, 10, 0]");
    }

    @Test
    public void test7035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7035");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.fill(intArray3, (-5));
        java.util.Arrays.fill(intArray3, 49);
        int[] intArray9 = java.util.Arrays.copyOf(intArray3, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfInt ofInt12 = java.util.Arrays.spliterator(intArray9, (-36), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -36");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[49, 49, 49, 49, 49, 49, 49, 49, 49, 49]");
    }

    @Test
    public void test7036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7036");
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
        java.util.Arrays.fill(floatArray3, 1.0f);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[1.0, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-4) + "'", int14 == (-4));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[100.0, 100.0, 100.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test7037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7037");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        java.util.Arrays.parallelSort(longArray3);
        int int11 = java.util.Arrays.binarySearch(longArray3, (long) 2);
        java.util.Arrays.fill(longArray3, (long) (-5));
        java.util.function.LongBinaryOperator longBinaryOperator16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(longArray3, (-1), 3, longBinaryOperator16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-5, -5, -5]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test7038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7038");
        float[] floatArray1 = new float[] { 17 };
        float[] floatArray3 = java.util.Arrays.copyOf(floatArray1, 7);
        java.util.Arrays.fill(floatArray3, (float) (-2));
        float[] floatArray7 = java.util.Arrays.copyOf(floatArray3, 3);
        java.util.Arrays.fill(floatArray7, (float) 10);
        java.util.Arrays.sort(floatArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(floatArray7, (-5), 49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[17.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-2.0, -2.0, -2.0, -2.0, -2.0, -2.0, -2.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[10.0, 10.0, 10.0]");
    }

    @Test
    public void test7039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7039");
        java.util.stream.LongStream[] longStreamArray0 = new java.util.stream.LongStream[] {};
        java.util.stream.LongStream[] longStreamArray1 = new java.util.stream.LongStream[] {};
        java.util.stream.LongStream[] longStreamArray2 = new java.util.stream.LongStream[] {};
        java.util.stream.LongStream[] longStreamArray3 = new java.util.stream.LongStream[] {};
        java.util.stream.LongStream[] longStreamArray4 = new java.util.stream.LongStream[] {};
        java.util.stream.LongStream[] longStreamArray5 = new java.util.stream.LongStream[] {};
        java.util.stream.LongStream[][] longStreamArray6 = new java.util.stream.LongStream[][] { longStreamArray0, longStreamArray1, longStreamArray2, longStreamArray3, longStreamArray4, longStreamArray5 };
        java.util.stream.LongStream[] longStreamArray7 = new java.util.stream.LongStream[] {};
        java.util.stream.LongStream[] longStreamArray8 = new java.util.stream.LongStream[] {};
        java.util.stream.LongStream[] longStreamArray9 = new java.util.stream.LongStream[] {};
        java.util.stream.LongStream[] longStreamArray10 = new java.util.stream.LongStream[] {};
        java.util.stream.LongStream[] longStreamArray11 = new java.util.stream.LongStream[] {};
        java.util.stream.LongStream[] longStreamArray12 = new java.util.stream.LongStream[] {};
        java.util.stream.LongStream[][] longStreamArray13 = new java.util.stream.LongStream[][] { longStreamArray7, longStreamArray8, longStreamArray9, longStreamArray10, longStreamArray11, longStreamArray12 };
        java.util.stream.LongStream[] longStreamArray14 = new java.util.stream.LongStream[] {};
        java.util.stream.LongStream[] longStreamArray15 = new java.util.stream.LongStream[] {};
        java.util.stream.LongStream[] longStreamArray16 = new java.util.stream.LongStream[] {};
        java.util.stream.LongStream[] longStreamArray17 = new java.util.stream.LongStream[] {};
        java.util.stream.LongStream[] longStreamArray18 = new java.util.stream.LongStream[] {};
        java.util.stream.LongStream[] longStreamArray19 = new java.util.stream.LongStream[] {};
        java.util.stream.LongStream[][] longStreamArray20 = new java.util.stream.LongStream[][] { longStreamArray14, longStreamArray15, longStreamArray16, longStreamArray17, longStreamArray18, longStreamArray19 };
        java.util.stream.LongStream[][][] longStreamArray21 = new java.util.stream.LongStream[][][] { longStreamArray6, longStreamArray13, longStreamArray20 };
        java.util.Spliterator<java.util.stream.LongStream[][]> longStreamArraySpliterator22 = java.util.Arrays.spliterator(longStreamArray21);
        java.util.Spliterator<java.util.stream.LongStream[][]> longStreamArraySpliterator23 = java.util.Arrays.spliterator(longStreamArray21);
        java.lang.Object[][][] objArray26 = java.util.Arrays.copyOfRange((java.lang.Object[][][]) longStreamArray21, 0, 0);
        long[] longArray30 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream31 = java.util.Arrays.stream(longArray30);
        java.util.Arrays.fill(longArray30, (long) (byte) 10);
        int int35 = java.util.Arrays.binarySearch(longArray30, (-1L));
        java.util.Arrays.parallelSort(longArray30);
        java.util.stream.LongStream longStream39 = java.util.Arrays.stream(longArray30, (int) (byte) 1, (int) (short) 1);
        int int41 = java.util.Arrays.binarySearch(longArray30, 0L);
        java.util.Arrays.fill(longArray30, (long) (byte) 1);
        java.util.stream.LongStream longStream44 = java.util.Arrays.stream(longArray30);
        long[] longArray46 = java.util.Arrays.copyOf(longArray30, (int) (short) 1);
        long[] longArray48 = java.util.Arrays.copyOf(longArray30, 7);
        java.util.Spliterator.OfLong ofLong49 = java.util.Arrays.spliterator(longArray30);
        java.util.Arrays.fill((java.lang.Object[]) objArray26, (java.lang.Object) longArray30);
        org.junit.Assert.assertNotNull(longStreamArray0);
        org.junit.Assert.assertNotNull(longStreamArray1);
        org.junit.Assert.assertNotNull(longStreamArray2);
        org.junit.Assert.assertNotNull(longStreamArray3);
        org.junit.Assert.assertNotNull(longStreamArray4);
        org.junit.Assert.assertNotNull(longStreamArray5);
        org.junit.Assert.assertNotNull(longStreamArray6);
        org.junit.Assert.assertNotNull(longStreamArray7);
        org.junit.Assert.assertNotNull(longStreamArray8);
        org.junit.Assert.assertNotNull(longStreamArray9);
        org.junit.Assert.assertNotNull(longStreamArray10);
        org.junit.Assert.assertNotNull(longStreamArray11);
        org.junit.Assert.assertNotNull(longStreamArray12);
        org.junit.Assert.assertNotNull(longStreamArray13);
        org.junit.Assert.assertNotNull(longStreamArray14);
        org.junit.Assert.assertNotNull(longStreamArray15);
        org.junit.Assert.assertNotNull(longStreamArray16);
        org.junit.Assert.assertNotNull(longStreamArray17);
        org.junit.Assert.assertNotNull(longStreamArray18);
        org.junit.Assert.assertNotNull(longStreamArray19);
        org.junit.Assert.assertNotNull(longStreamArray20);
        org.junit.Assert.assertNotNull(longStreamArray21);
        org.junit.Assert.assertNotNull(longStreamArraySpliterator22);
        org.junit.Assert.assertNotNull(longStreamArraySpliterator23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(longStream31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(longStream39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(longStream44);
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[1]");
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[1, 1, 1, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofLong49);
    }

    @Test
    public void test7040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7040");
        long[][][][][] longArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long[][][][][] longArray2 = java.util.Arrays.copyOf(longArray0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7041");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray4, '#');
        char[] charArray11 = java.util.Arrays.copyOf(charArray4, (int) (byte) 1);
        java.util.Arrays.parallelSort(charArray11);
        int int14 = java.util.Arrays.binarySearch(charArray11, 'a');
        int int16 = java.util.Arrays.binarySearch(charArray11, 'a');
        java.util.Arrays.parallelSort(charArray11);
        int int19 = java.util.Arrays.binarySearch(charArray11, ' ');
        int int21 = java.util.Arrays.binarySearch(charArray11, 'a');
        char[] charArray26 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray26, (int) (byte) 1, 3);
        java.util.Arrays.sort(charArray26);
        java.util.Arrays.parallelSort(charArray26);
        java.util.Arrays.sort(charArray26);
        boolean boolean33 = java.util.Arrays.equals(charArray11, charArray26);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2) + "'", int14 == (-2));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " 4aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " 4aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , 4, a, a]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test7042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7042");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        java.util.Arrays.parallelSort(charArray4);
        char[] charArray12 = null;
        boolean boolean13 = java.util.Arrays.equals(charArray4, charArray12);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , 4, a, a]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test7043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7043");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        java.util.Arrays.parallelSort(longArray3);
        java.util.stream.LongStream longStream12 = java.util.Arrays.stream(longArray3, (int) (byte) 1, (int) (short) 1);
        int int14 = java.util.Arrays.binarySearch(longArray3, 0L);
        long[] longArray16 = java.util.Arrays.copyOf(longArray3, (int) ' ');
        java.util.Arrays.fill(longArray3, (long) (-2));
        java.util.Arrays.parallelSort(longArray3);
        java.util.stream.LongStream longStream20 = java.util.Arrays.stream(longArray3);
        java.util.stream.LongStream longStream21 = java.util.Arrays.stream(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfLong ofLong24 = java.util.Arrays.spliterator(longArray3, (int) '4', 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(52) > fence(6)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-2, -2, -2]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[10, 10, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(longStream20);
        org.junit.Assert.assertNotNull(longStream21);
    }

    @Test
    public void test7044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7044");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream3 = java.util.Arrays.stream(doubleArray0, (-50), (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7045");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        long[] longArray9 = java.util.Arrays.copyOf(longArray7, (int) '#');
        java.util.function.IntToLongFunction intToLongFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(longArray7, intToLongFunction10);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test7046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7046");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.parallelSort(floatArray3);
        java.util.Arrays.fill(floatArray3, (float) ' ');
        java.util.Arrays.parallelSort(floatArray3);
        float[] floatArray11 = java.util.Arrays.copyOf(floatArray3, 17);
        int int13 = java.util.Arrays.binarySearch(floatArray3, (float) (short) -1);
        java.util.Arrays.fill(floatArray3, (float) (byte) 10);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[32.0, 32.0, 32.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test7047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7047");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) 100);
        java.util.Arrays.sort(shortArray0);
        java.util.Arrays.sort(shortArray0);
        java.util.Arrays.fill(shortArray0, (int) (short) 0, 0, (short) 100);
        short[] shortArray12 = java.util.Arrays.copyOf(shortArray0, (int) (short) 0);
        java.util.Arrays.sort(shortArray12);
        java.lang.String str14 = java.util.Arrays.toString(shortArray12);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test7048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7048");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.util.Arrays.fill(doubleArray4, (double) (-6));
        int int10 = java.util.Arrays.binarySearch(doubleArray4, 0, 2, (double) (-2));
        java.util.Spliterator.OfDouble ofDouble11 = java.util.Arrays.spliterator(doubleArray4);
        java.util.stream.DoubleStream doubleStream14 = java.util.Arrays.stream(doubleArray4, 10, (int) (short) 100);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0, -6.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-3) + "'", int10 == (-3));
        org.junit.Assert.assertNotNull(ofDouble11);
        org.junit.Assert.assertNotNull(doubleStream14);
    }

    @Test
    public void test7049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7049");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.sort(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(byteArray4, (-6), (-99));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(-6) > toIndex(-99)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
    }

    @Test
    public void test7050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7050");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.fill(intArray3, (int) (short) 1);
        java.util.Arrays.fill(intArray3, (int) ' ', (int) (short) 100, 0);
        int[] intArray12 = java.util.Arrays.copyOfRange(intArray3, 0, (int) '4');
        java.util.Arrays.fill(intArray12, (-3));
        java.util.Spliterator.OfInt ofInt17 = java.util.Arrays.spliterator(intArray12, 7, (int) '4');
        java.util.Arrays.sort(intArray12, 0, 3);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3]");
        org.junit.Assert.assertNotNull(ofInt17);
    }

    @Test
    public void test7051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7051");
        double[] doubleArray4 = new double[] { 3, 0.0f, (short) 0, (-4) };
        java.util.Arrays.fill(doubleArray4, (double) (byte) 0);
        java.util.Arrays.parallelSort(doubleArray4);
        java.util.stream.DoubleStream doubleStream8 = java.util.Arrays.stream(doubleArray4);
        java.util.function.DoubleBinaryOperator doubleBinaryOperator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(doubleArray4, (int) (short) -1, 0, doubleBinaryOperator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleStream8);
    }

    @Test
    public void test7052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7052");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        java.util.Spliterator.OfDouble ofDouble10 = java.util.Arrays.spliterator(doubleArray7, 10, (int) '#');
        int int12 = java.util.Arrays.binarySearch(doubleArray7, (double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(doubleArray7, (-9), (-71));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(-9) > toIndex(-71)");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test7053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7053");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 100 };
        java.util.Arrays.sort(byteArray2);
        int int7 = java.util.Arrays.binarySearch(byteArray2, (int) (byte) 0, 0, (byte) 1);
        byte[] byteArray9 = java.util.Arrays.copyOf(byteArray2, 2);
        int int11 = java.util.Arrays.binarySearch(byteArray2, (byte) 100);
        java.util.Arrays.fill(byteArray2, 0, 0, (byte) 0);
        java.util.Arrays.parallelSort(byteArray2);
        java.util.Arrays.fill(byteArray2, (byte) 100);
        int int20 = java.util.Arrays.binarySearch(byteArray2, (byte) 0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test7054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7054");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.parallelSort(charArray4);
        int int10 = java.util.Arrays.binarySearch(charArray4, 'a');
        java.util.Arrays.parallelSort(charArray4, 0, 3);
        java.util.Arrays.sort(charArray4);
        java.util.Arrays.fill(charArray4, '#');
        int int18 = java.util.Arrays.binarySearch(charArray4, ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java.util.Arrays.binarySearch(charArray4, (-53), (-96), '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(-53) > toIndex(-96)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test7055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7055");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong8 = java.util.Arrays.spliterator(longArray7);
        long[] longArray10 = java.util.Arrays.copyOf(longArray7, (int) (byte) 1);
        long[] longArray12 = java.util.Arrays.copyOf(longArray7, 0);
        long[] longArray14 = java.util.Arrays.copyOf(longArray12, (int) (short) 10);
        java.util.Spliterator.OfLong ofLong17 = java.util.Arrays.spliterator(longArray14, 0, 7);
        java.util.function.LongBinaryOperator longBinaryOperator18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(longArray14, longBinaryOperator18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[3]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[]");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofLong17);
    }

    @Test
    public void test7056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7056");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray1);
        java.util.Arrays.fill(intArray1, 5);
        java.util.Arrays.fill(intArray1, (int) '#');
        int[] intArray10 = java.util.Arrays.copyOf(intArray1, 4);
        java.util.Spliterator.OfInt ofInt11 = java.util.Arrays.spliterator(intArray1);
        java.util.Spliterator.OfInt ofInt12 = java.util.Arrays.spliterator(intArray1);
        int[] intArray14 = java.util.Arrays.copyOf(intArray1, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java.util.Arrays.binarySearch(intArray1, (-36), 3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -36");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[35]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofInt11);
        org.junit.Assert.assertNotNull(ofInt12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test7057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7057");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int[] intArray11 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        int int13 = java.util.Arrays.binarySearch(intArray11, (int) (short) 0);
        int[] intArray15 = java.util.Arrays.copyOf(intArray11, (int) (byte) 1);
        java.util.Arrays.parallelSort(intArray15);
        java.util.Arrays.fill(intArray15, (int) (short) 100);
        java.util.Arrays.sort(intArray15);
        java.util.Arrays.parallelSort(intArray15);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100]");
    }

    @Test
    public void test7058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7058");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        double[] doubleArray13 = java.util.Arrays.copyOf(doubleArray9, (int) 'a');
        double[] doubleArray15 = java.util.Arrays.copyOf(doubleArray13, (int) (byte) 1);
        java.util.Arrays.parallelSort(doubleArray15);
        java.util.Arrays.parallelSort(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0]");
    }

    @Test
    public void test7059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7059");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream5 = java.util.Arrays.stream(doubleArray2);
        double[] doubleArray7 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 0);
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray2, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = java.util.Arrays.binarySearch(doubleArray2, 5, 0, (double) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(5) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test7060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7060");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        java.util.Arrays.parallelSort(charArray4);
        int int13 = java.util.Arrays.binarySearch(charArray4, 'a');
        char[] charArray16 = java.util.Arrays.copyOfRange(charArray4, (int) (short) 0, (int) ' ');
        char[] charArray18 = java.util.Arrays.copyOf(charArray16, (int) (short) 0);
        java.util.Arrays.parallelSort(charArray18);
        char[] charArray21 = java.util.Arrays.copyOf(charArray18, 17);
        java.util.Arrays.parallelSort(charArray18);
        java.util.Arrays.parallelSort(charArray18);
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
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test7061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7061");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.sort(byteArray1);
        int int7 = java.util.Arrays.binarySearch(byteArray1, (byte) -1);
        int int9 = java.util.Arrays.binarySearch(byteArray1, (byte) 10);
        byte[] byteArray12 = java.util.Arrays.copyOfRange(byteArray1, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(byteArray1, 10, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(10) > toIndex(-2)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1]");
    }

    @Test
    public void test7062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7062");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong8 = java.util.Arrays.spliterator(longArray7);
        long[] longArray10 = java.util.Arrays.copyOf(longArray7, (int) (byte) 1);
        long[] longArray12 = java.util.Arrays.copyOf(longArray10, 100);
        java.util.Arrays.parallelSort(longArray12);
        int int15 = java.util.Arrays.binarySearch(longArray12, 0L);
        int int17 = java.util.Arrays.binarySearch(longArray12, (long) (short) -1);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[3]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test7063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7063");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.parallelSort(charArray4);
        java.util.Arrays.sort(charArray4);
        int int11 = java.util.Arrays.binarySearch(charArray4, 'a');
        java.util.Arrays.parallelSort(charArray4);
        int int14 = java.util.Arrays.binarySearch(charArray4, 'a');
        java.util.Arrays.fill(charArray4, 'a');
        char[] charArray18 = java.util.Arrays.copyOf(charArray4, 49);
        java.util.Arrays.fill(charArray4, '#');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "aaaa\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "aaaa\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[a, a, a, a, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test7064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7064");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        java.util.Arrays.parallelSort(longArray3);
        int int11 = java.util.Arrays.binarySearch(longArray3, (long) 2);
        int int13 = java.util.Arrays.binarySearch(longArray3, (long) (-3));
        java.util.stream.LongStream longStream14 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) 0);
        long[] longArray19 = java.util.Arrays.copyOfRange(longArray3, 3, (int) (byte) 10);
        java.util.Arrays.sort(longArray3);
        long[] longArray24 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream25 = java.util.Arrays.stream(longArray24);
        java.util.Arrays.fill(longArray24, (long) (byte) 10);
        java.util.stream.LongStream longStream28 = java.util.Arrays.stream(longArray24);
        java.util.Arrays.sort(longArray24);
        long[] longArray31 = java.util.Arrays.copyOf(longArray24, (int) (byte) 100);
        int int33 = java.util.Arrays.binarySearch(longArray31, (long) (-32));
        boolean boolean34 = java.util.Arrays.equals(longArray3, longArray31);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream25);
        org.junit.Assert.assertNotNull(longStream28);
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[10, 10, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test7065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7065");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.sort(intArray3);
        int int10 = java.util.Arrays.binarySearch(intArray3, 5);
        java.util.Spliterator.OfInt ofInt11 = java.util.Arrays.spliterator(intArray3);
        int int13 = java.util.Arrays.binarySearch(intArray3, 17);
        java.util.stream.IntStream intStream16 = java.util.Arrays.stream(intArray3, 2, (int) (byte) 10);
        int int18 = java.util.Arrays.binarySearch(intArray3, 100);
        java.util.Arrays.parallelSort(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = java.util.Arrays.binarySearch(intArray3, 0, (-9), (-71));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-9)");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(ofInt11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-100) + "'", int13 == (-100));
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
    }

    @Test
    public void test7066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7066");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) (byte) 100);
        short[] shortArray6 = java.util.Arrays.copyOf(shortArray0, 1);
        short[] shortArray8 = java.util.Arrays.copyOf(shortArray6, (int) '4');
        java.util.Arrays.fill(shortArray6, (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(shortArray6, 100, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(99)");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10]");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test7067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7067");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        java.util.Arrays.parallelSort(charArray4);
        int int13 = java.util.Arrays.binarySearch(charArray4, 'a');
        char[] charArray16 = java.util.Arrays.copyOfRange(charArray4, (int) (short) 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java.util.Arrays.binarySearch(charArray16, 49, 98, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 98");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    }

    @Test
    public void test7068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7068");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) (byte) 100);
        short[] shortArray6 = java.util.Arrays.copyOf(shortArray0, 1);
        short[] shortArray8 = java.util.Arrays.copyOf(shortArray6, (int) (byte) 100);
        java.util.Arrays.sort(shortArray6);
        java.util.Arrays.parallelSort(shortArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(shortArray6, (-2), (int) '#', (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -2");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test7069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7069");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray4, '#');
        char[] charArray11 = java.util.Arrays.copyOf(charArray4, (int) (byte) 1);
        char[] charArray13 = java.util.Arrays.copyOf(charArray4, 5);
        java.util.Arrays.fill(charArray13, 'a');
        java.util.Arrays.sort(charArray13);
        java.util.Arrays.sort(charArray13);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray20 = java.util.Arrays.copyOfRange(charArray13, (-53), 30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "aaaaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "aaaaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, a, a, a, a]");
    }

    @Test
    public void test7070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7070");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        int int12 = java.util.Arrays.binarySearch(charArray10, 'a');
        java.util.Arrays.sort(charArray10);
        java.util.Arrays.sort(charArray10);
        java.util.Arrays.sort(charArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(charArray10, (-96), (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -96");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a 4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a 4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a,  , 4, a]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test7071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7071");
        short[] shortArray6 = new short[] { (byte) -1, (byte) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
        java.util.Arrays.parallelSort(shortArray6);
        java.util.Arrays.sort(shortArray6);
        short[] shortArray10 = java.util.Arrays.copyOf(shortArray6, 100);
        java.util.Arrays.sort(shortArray10);
        int int13 = java.util.Arrays.binarySearch(shortArray10, (short) (byte) -1);
        java.util.Arrays.sort(shortArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(shortArray10, (int) 'a', (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(97) > toIndex(-8)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test7072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7072");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfLong ofLong24 = java.util.Arrays.spliterator(longArray19, 7, (-18));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(7) > fence(-18)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test7073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7073");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.fill(intArray3, (int) (short) 1);
        java.util.Arrays.fill(intArray3, (int) ' ', (int) (short) 100, 0);
        int[] intArray12 = java.util.Arrays.copyOfRange(intArray3, 0, (int) '4');
        java.util.Arrays.sort(intArray3);
        java.util.stream.IntStream intStream14 = java.util.Arrays.stream(intArray3);
        java.util.Arrays.parallelSort(intArray3);
        java.util.Spliterator.OfInt ofInt16 = java.util.Arrays.spliterator(intArray3);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertNotNull(ofInt16);
    }

    @Test
    public void test7074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7074");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        int int12 = java.util.Arrays.binarySearch(charArray10, '#');
        char[] charArray14 = java.util.Arrays.copyOf(charArray10, 99);
        int int16 = java.util.Arrays.binarySearch(charArray14, ' ');
        java.lang.String str17 = java.util.Arrays.toString(charArray14);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a 4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a 4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a,  , 4, a]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-100) + "'", int16 == (-100));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]" + "'", str17, "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test7075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7075");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        long[] longArray11 = java.util.Arrays.copyOfRange(longArray3, 0, (int) (byte) 0);
        java.util.Spliterator.OfLong ofLong12 = java.util.Arrays.spliterator(longArray11);
        long[] longArray14 = java.util.Arrays.copyOf(longArray11, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream17 = java.util.Arrays.stream(longArray14, 0, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 49");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(ofLong12);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test7076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7076");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        java.util.Arrays.parallelSort(charArray4);
        int int13 = java.util.Arrays.binarySearch(charArray4, 'a');
        char[] charArray16 = java.util.Arrays.copyOfRange(charArray4, (int) (short) 0, (int) ' ');
        char[] charArray18 = java.util.Arrays.copyOf(charArray16, (int) (short) 0);
        java.util.Arrays.sort(charArray18);
        int int21 = java.util.Arrays.binarySearch(charArray18, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(charArray18, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(32)");
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
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test7077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7077");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray3, (int) (byte) 0, (int) (byte) 1);
        java.util.Arrays.sort(intArray3);
        java.util.Arrays.parallelSort(intArray3);
        java.util.stream.IntStream intStream9 = java.util.Arrays.stream(intArray3);
        int int11 = java.util.Arrays.binarySearch(intArray3, 5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream14 = java.util.Arrays.stream(intArray3, (-6), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-100) + "'", int11 == (-100));
    }

    @Test
    public void test7078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7078");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) 100);
        java.util.Arrays.sort(shortArray0);
        java.util.Arrays.sort(shortArray0);
        java.util.Arrays.fill(shortArray0, (int) (short) 0, 0, (short) 100);
        short[] shortArray12 = java.util.Arrays.copyOf(shortArray0, (int) (short) 0);
        int int14 = java.util.Arrays.binarySearch(shortArray0, (short) 100);
        java.util.Arrays.fill(shortArray0, (short) (byte) 0);
        java.util.Arrays.sort(shortArray0);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test7079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7079");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream5 = java.util.Arrays.stream(doubleArray2);
        double[] doubleArray7 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 0);
        java.util.Spliterator.OfDouble ofDouble8 = java.util.Arrays.spliterator(doubleArray2);
        java.util.Arrays.fill(doubleArray2, (double) (-2));
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-2.0, -2.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertNotNull(ofDouble8);
    }

    @Test
    public void test7080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7080");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) 1 };
        java.util.Arrays.fill(byteArray6, (byte) -1);
        int int10 = java.util.Arrays.binarySearch(byteArray6, (byte) -1);
        int int12 = java.util.Arrays.binarySearch(byteArray6, (byte) -1);
        java.util.Arrays.parallelSort(byteArray6);
        java.util.Arrays.parallelSort(byteArray6);
        java.util.Arrays.fill(byteArray6, (byte) -1);
        int int18 = java.util.Arrays.binarySearch(byteArray6, (byte) -1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test7081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7081");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray4, '#');
        char[] charArray11 = java.util.Arrays.copyOf(charArray4, (int) (byte) 1);
        char[] charArray13 = java.util.Arrays.copyOf(charArray4, 5);
        java.util.Arrays.fill(charArray13, 'a');
        java.util.Arrays.sort(charArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(charArray13, (int) '#', 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(35) > toIndex(5)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "aaaaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "aaaaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, a, a, a, a]");
    }

    @Test
    public void test7082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7082");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        int[] intArray9 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        java.lang.Class<?> wildcardClass10 = intArray9.getClass();
        java.lang.reflect.Type[] typeArray11 = new java.lang.reflect.Type[] { wildcardClass10 };
        java.lang.reflect.Type[] typeArray13 = java.util.Arrays.copyOf(typeArray11, 2);
        java.util.Arrays.sort((java.lang.Object[]) typeArray11);
        java.util.stream.Stream<java.lang.reflect.Type> typeStream15 = java.util.Arrays.stream(typeArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort((java.lang.Object[]) typeArray11, (-3), 15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -3");
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
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeStream15);
    }

    @Test
    public void test7083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7083");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.parallelSort(charArray4);
        int int10 = java.util.Arrays.binarySearch(charArray4, 'a');
        java.util.Arrays.parallelSort(charArray4, 0, 3);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray16 = java.util.Arrays.copyOfRange(charArray4, (-7), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , 4, a, a]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test7084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7084");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.parallelSort(longArray3);
        int int9 = java.util.Arrays.binarySearch(longArray3, (long) (-4));
        java.util.stream.LongStream longStream10 = java.util.Arrays.stream(longArray3);
        long[] longArray14 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream15 = java.util.Arrays.stream(longArray14);
        java.util.Arrays.fill(longArray14, (long) (byte) 10);
        int int19 = java.util.Arrays.binarySearch(longArray14, (-1L));
        java.util.Arrays.parallelSort(longArray14);
        java.util.stream.LongStream longStream23 = java.util.Arrays.stream(longArray14, (int) (byte) 1, (int) (short) 1);
        int int25 = java.util.Arrays.binarySearch(longArray14, 0L);
        java.util.stream.LongStream longStream26 = java.util.Arrays.stream(longArray14);
        long[] longArray28 = new long[] { ' ' };
        java.util.stream.LongStream longStream29 = java.util.Arrays.stream(longArray28);
        long[] longArray33 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream34 = java.util.Arrays.stream(longArray33);
        java.util.Arrays.fill(longArray33, (long) (byte) 10);
        int int38 = java.util.Arrays.binarySearch(longArray33, (-1L));
        java.util.Arrays.parallelSort(longArray33);
        java.util.stream.LongStream longStream42 = java.util.Arrays.stream(longArray33, (int) (byte) 1, (int) (short) 1);
        java.util.stream.LongStream[] longStreamArray43 = new java.util.stream.LongStream[] { longStream10, longStream26, longStream29, longStream42 };
        java.util.stream.Stream<java.util.stream.LongStream> longStreamStream44 = java.util.Arrays.stream(longStreamArray43);
        java.util.Spliterator<java.util.stream.LongStream> longStreamSpliterator45 = java.util.Arrays.spliterator(longStreamArray43);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator<java.util.stream.LongStream> longStreamSpliterator48 = java.util.Arrays.spliterator(longStreamArray43, 49, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(49) > fence(-10)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(longStream23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(longStream26);
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[32]");
        org.junit.Assert.assertNotNull(longStream29);
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(longStream42);
        org.junit.Assert.assertNotNull(longStreamArray43);
        org.junit.Assert.assertNotNull(longStreamStream44);
        org.junit.Assert.assertNotNull(longStreamSpliterator45);
    }

    @Test
    public void test7085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7085");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.fill(intArray3, (-5));
        java.util.Arrays.fill(intArray3, 49);
        java.util.Arrays.fill(intArray3, (int) (byte) 0, 4, (int) '#');
        java.util.Spliterator.OfInt ofInt12 = java.util.Arrays.spliterator(intArray3);
        int int14 = java.util.Arrays.binarySearch(intArray3, (-11));
        java.util.function.IntUnaryOperator intUnaryOperator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(intArray3, intUnaryOperator15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, 35, 35, 35, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49]");
        org.junit.Assert.assertNotNull(ofInt12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test7086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7086");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.lang.Class<?> wildcardClass8 = longArray7.getClass();
        java.lang.Iterable[] iterableArray10 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.stream.Stream<java.lang.CharSequence>>[] charSequenceStreamIterableArray11 = (java.lang.Iterable<java.util.stream.Stream<java.lang.CharSequence>>[]) iterableArray10;
        java.util.stream.Stream<java.lang.Iterable<java.util.stream.Stream<java.lang.CharSequence>>> charSequenceStreamIterableStream12 = java.util.Arrays.stream((java.lang.Iterable<java.util.stream.Stream<java.lang.CharSequence>>[]) iterableArray10);
        java.util.Spliterator<java.lang.Iterable<java.util.stream.Stream<java.lang.CharSequence>>> charSequenceStreamIterableSpliterator13 = java.util.Arrays.spliterator((java.lang.Iterable<java.util.stream.Stream<java.lang.CharSequence>>[]) iterableArray10);
        java.lang.Class<?> wildcardClass14 = iterableArray10.getClass();
        int[] intArray16 = new int[] { 100 };
        int[] intArray18 = java.util.Arrays.copyOf(intArray16, (int) (short) 100);
        int int22 = java.util.Arrays.binarySearch(intArray18, (int) (byte) 1, 10, 0);
        int[] intArray24 = java.util.Arrays.copyOf(intArray18, (int) (short) 100);
        java.lang.Class<?> wildcardClass25 = intArray24.getClass();
        java.lang.reflect.Type[] typeArray26 = new java.lang.reflect.Type[] { wildcardClass25 };
        java.lang.reflect.Type[] typeArray28 = java.util.Arrays.copyOf(typeArray26, 2);
        java.lang.Class<?> wildcardClass29 = typeArray26.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[3];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass8;
        wildcardClassArray32[1] = wildcardClass14;
        wildcardClassArray32[2] = wildcardClass29;
        long[] longArray42 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream43 = java.util.Arrays.stream(longArray42);
        long[] longArray46 = java.util.Arrays.copyOfRange(longArray42, (int) (byte) 1, 10);
        java.lang.Class<?> wildcardClass47 = longArray46.getClass();
        java.lang.Iterable[] iterableArray49 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.stream.Stream<java.lang.CharSequence>>[] charSequenceStreamIterableArray50 = (java.lang.Iterable<java.util.stream.Stream<java.lang.CharSequence>>[]) iterableArray49;
        java.util.stream.Stream<java.lang.Iterable<java.util.stream.Stream<java.lang.CharSequence>>> charSequenceStreamIterableStream51 = java.util.Arrays.stream((java.lang.Iterable<java.util.stream.Stream<java.lang.CharSequence>>[]) iterableArray49);
        java.util.Spliterator<java.lang.Iterable<java.util.stream.Stream<java.lang.CharSequence>>> charSequenceStreamIterableSpliterator52 = java.util.Arrays.spliterator((java.lang.Iterable<java.util.stream.Stream<java.lang.CharSequence>>[]) iterableArray49);
        java.lang.Class<?> wildcardClass53 = iterableArray49.getClass();
        int[] intArray55 = new int[] { 100 };
        int[] intArray57 = java.util.Arrays.copyOf(intArray55, (int) (short) 100);
        int int61 = java.util.Arrays.binarySearch(intArray57, (int) (byte) 1, 10, 0);
        int[] intArray63 = java.util.Arrays.copyOf(intArray57, (int) (short) 100);
        java.lang.Class<?> wildcardClass64 = intArray63.getClass();
        java.lang.reflect.Type[] typeArray65 = new java.lang.reflect.Type[] { wildcardClass64 };
        java.lang.reflect.Type[] typeArray67 = java.util.Arrays.copyOf(typeArray65, 2);
        java.lang.Class<?> wildcardClass68 = typeArray65.getClass();
        java.lang.Class[] classArray70 = new java.lang.Class[3];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray71 = (java.lang.Class<?>[]) classArray70;
        wildcardClassArray71[0] = wildcardClass47;
        wildcardClassArray71[1] = wildcardClass53;
        wildcardClassArray71[2] = wildcardClass68;
        java.lang.Class[][] classArray79 = new java.lang.Class[2][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray80 = (java.lang.Class<?>[][]) classArray79;
        wildcardClassArray80[0] = wildcardClassArray32;
        wildcardClassArray80[1] = wildcardClassArray71;
        java.util.Spliterator<java.lang.Class<?>[]> wildcardClassArraySpliterator85 = java.util.Arrays.spliterator(wildcardClassArray80);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(iterableArray10);
        org.junit.Assert.assertNotNull(charSequenceStreamIterableArray11);
        org.junit.Assert.assertNotNull(charSequenceStreamIterableStream12);
        org.junit.Assert.assertNotNull(charSequenceStreamIterableSpliterator13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream43);
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(iterableArray49);
        org.junit.Assert.assertNotNull(charSequenceStreamIterableArray50);
        org.junit.Assert.assertNotNull(charSequenceStreamIterableStream51);
        org.junit.Assert.assertNotNull(charSequenceStreamIterableSpliterator52);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[100]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 5 + "'", int61 == 5);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(classArray70);
        org.junit.Assert.assertNotNull(wildcardClassArray71);
        org.junit.Assert.assertNotNull(classArray79);
        org.junit.Assert.assertNotNull(wildcardClassArray80);
        org.junit.Assert.assertNotNull(wildcardClassArraySpliterator85);
    }

    @Test
    public void test7087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7087");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Arrays.parallelSort(longArray7);
        java.util.Spliterator.OfLong ofLong9 = java.util.Arrays.spliterator(longArray7);
        java.lang.String str10 = java.util.Arrays.toString(longArray7);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[0, 0, 0, 0, 0, 0, 0, 1, 3]");
        org.junit.Assert.assertNotNull(ofLong9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0, 0, 0, 0, 0, 0, 0, 1, 3]" + "'", str10, "[0, 0, 0, 0, 0, 0, 0, 1, 3]");
    }

    @Test
    public void test7088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7088");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        byte[] byteArray6 = java.util.Arrays.copyOf(byteArray1, (int) ' ');
        java.util.Arrays.sort(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(byteArray6, (-7), 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1]");
    }

    @Test
    public void test7089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7089");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        byte[] byteArray9 = java.util.Arrays.copyOf(byteArray4, (int) '#');
        byte[] byteArray12 = java.util.Arrays.copyOfRange(byteArray4, 1, 7);
        int int14 = java.util.Arrays.binarySearch(byteArray4, (byte) 100);
        byte[] byteArray16 = java.util.Arrays.copyOf(byteArray4, 5);
        byte[] byteArray18 = java.util.Arrays.copyOf(byteArray4, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(byteArray18, (-5), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2) + "'", int14 == (-2));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
    }

    @Test
    public void test7090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7090");
        long[][][][] longArray0 = new long[][][][] {};
        long[][][][] longArray2 = java.util.Arrays.copyOf(longArray0, 4);
        java.util.Spliterator<long[][][]> longArraySpliterator3 = java.util.Arrays.spliterator(longArray0);
        java.util.Spliterator<java.lang.Object[][]> objArraySpliterator4 = java.util.Arrays.spliterator((java.lang.Object[][][]) longArray0);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertNotNull(longArraySpliterator3);
        org.junit.Assert.assertNotNull(objArraySpliterator4);
    }

    @Test
    public void test7091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7091");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.fill(intArray3, (int) (short) 1);
        java.util.Arrays.fill(intArray3, (int) ' ', (int) (short) 100, 0);
        java.util.Spliterator.OfInt ofInt12 = java.util.Arrays.spliterator(intArray3, 4, 100);
        int int14 = java.util.Arrays.binarySearch(intArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = java.util.Arrays.copyOf(intArray3, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofInt12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
    }

    @Test
    public void test7092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7092");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.stream.LongStream longStream7 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.sort(longArray3);
        long[] longArray10 = java.util.Arrays.copyOf(longArray3, (int) (byte) 100);
        int int12 = java.util.Arrays.binarySearch(longArray10, (long) (-32));
        java.util.stream.LongStream longStream13 = java.util.Arrays.stream(longArray10);
        java.util.stream.LongStream longStream14 = java.util.Arrays.stream(longArray10);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[10, 10, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(longStream14);
    }

    @Test
    public void test7093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7093");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong8 = java.util.Arrays.spliterator(longArray7);
        java.util.Arrays.parallelSort(longArray7);
        java.util.Arrays.sort(longArray7);
        java.util.Arrays.parallelSort(longArray7);
        java.util.Arrays.sort(longArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java.util.Arrays.binarySearch(longArray7, (int) (byte) -1, (-3), (long) (-32));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(-1) > toIndex(-3)");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test7094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7094");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong8 = java.util.Arrays.spliterator(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray11 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) -1, 30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofLong8);
    }

    @Test
    public void test7095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7095");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.lang.reflect.Type[][] typeArray5 = new java.lang.reflect.Type[][] {};
        java.util.stream.Stream<java.lang.reflect.Type[]> typeArrayStream6 = java.util.Arrays.stream(typeArray5);
        java.util.Arrays.fill((java.lang.Object[]) typeArray5, (java.lang.Object) "[a, a, a, a]");
        java.util.Arrays.fill((java.lang.Object[]) strArray2, (java.lang.Object) "[a, a, a, a]");
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        double[] doubleArray16 = new double[] { (short) 10, 10.0f };
        double[] doubleArray18 = java.util.Arrays.copyOf(doubleArray16, (int) (short) 100);
        double[] doubleArray21 = java.util.Arrays.copyOfRange(doubleArray18, 2, (int) 'a');
        java.util.Arrays.sort(doubleArray18);
        java.util.Arrays.sort(doubleArray18);
        int int27 = java.util.Arrays.binarySearch(doubleArray18, 1, (int) (short) 10, (double) (-50));
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill((java.lang.Object[]) strArray2, (int) ' ', (-10), (java.lang.Object) int27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(32) > toIndex(-10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(typeArrayStream6);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2) + "'", int27 == (-2));
    }

    @Test
    public void test7096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7096");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) (byte) 100);
        short[] shortArray6 = java.util.Arrays.copyOf(shortArray0, 1);
        java.util.Arrays.sort(shortArray0);
        java.util.Arrays.fill(shortArray0, (short) -1);
        short[] shortArray11 = java.util.Arrays.copyOf(shortArray0, 100);
        java.lang.String str12 = java.util.Arrays.toString(shortArray0);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test7097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7097");
        java.util.Spliterator.OfDouble[][] ofDoubleArray0 = new java.util.Spliterator.OfDouble[][] {};
        java.util.stream.Stream<java.util.Spliterator.OfDouble[]> ofDoubleArrayStream1 = java.util.Arrays.stream(ofDoubleArray0);
        double[] doubleArray4 = new double[] { (short) 10, 10.0f };
        double[] doubleArray6 = java.util.Arrays.copyOf(doubleArray4, (int) (short) 100);
        double[] doubleArray9 = java.util.Arrays.copyOfRange(doubleArray6, 2, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray6, (int) 'a');
        double[] doubleArray13 = java.util.Arrays.copyOf(doubleArray11, 10);
        double[] doubleArray16 = java.util.Arrays.copyOfRange(doubleArray13, 2, 100);
        double[] doubleArray18 = java.util.Arrays.copyOf(doubleArray13, (int) '#');
        int int20 = java.util.Arrays.binarySearch(doubleArray18, (double) (short) 100);
        double[] doubleArray22 = java.util.Arrays.copyOf(doubleArray18, (int) (short) 0);
        java.util.Arrays.sort(doubleArray18);
        int int24 = java.util.Arrays.binarySearch((java.lang.Object[]) ofDoubleArray0, (java.lang.Object) doubleArray18);
        java.util.Arrays.sort(doubleArray18);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray28 = java.util.Arrays.copyOfRange(doubleArray18, (-99), (-53));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(ofDoubleArray0);
        org.junit.Assert.assertNotNull(ofDoubleArrayStream1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-36) + "'", int20 == (-36));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test7098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7098");
        java.lang.Object[] objArray0 = null;
        java.lang.String[][] strArray1 = new java.lang.String[][] {};
        java.lang.String[][] strArray2 = new java.lang.String[][] {};
        java.lang.String[][][] strArray3 = new java.lang.String[][][] { strArray1, strArray2 };
        java.lang.String[][][] strArray5 = java.util.Arrays.copyOf(strArray3, 0);
        java.util.Spliterator<java.lang.CharSequence[][]> charSequenceArraySpliterator6 = java.util.Arrays.spliterator((java.lang.CharSequence[][][]) strArray3);
        boolean boolean7 = java.util.Arrays.equals(objArray0, (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(charSequenceArraySpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test7099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7099");
        float[] floatArray0 = null;
        float[] floatArray2 = new float[] { (-1L) };
        int int4 = java.util.Arrays.binarySearch(floatArray2, (float) (short) -1);
        java.util.Arrays.sort(floatArray2);
        float[] floatArray7 = java.util.Arrays.copyOf(floatArray2, 100);
        boolean boolean8 = java.util.Arrays.equals(floatArray0, floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test7100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7100");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0]", "[-1]" };
        java.util.Arrays.parallelSort(strArray2);
        float[] floatArray9 = new float[] { (-1), (short) -1, '4' };
        int int11 = java.util.Arrays.binarySearch(floatArray9, 0.0f);
        java.util.Arrays.parallelSort(floatArray9);
        java.util.Arrays.fill(floatArray9, (float) ' ');
        float[] floatArray16 = java.util.Arrays.copyOf(floatArray9, (int) (byte) 1);
        int int18 = java.util.Arrays.binarySearch(floatArray9, 0.0f);
        int int22 = java.util.Arrays.binarySearch(floatArray9, 0, 0, (float) (-96));
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill((java.lang.Object[]) strArray2, (-9), (-3), (java.lang.Object) int22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[32.0, 32.0, 32.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-3) + "'", int11 == (-3));
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[32.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test7101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7101");
        long[] longArray1 = new long[] { ' ' };
        java.util.stream.LongStream longStream2 = java.util.Arrays.stream(longArray1);
        java.util.Arrays.fill(longArray1, (long) (-101));
        java.util.Arrays.sort(longArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(longArray1, 15, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(15) > toIndex(-10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[-101]");
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test7102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7102");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        int[] intArray9 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        java.util.Spliterator.OfInt ofInt10 = java.util.Arrays.spliterator(intArray9);
        java.util.Arrays.sort(intArray9);
        java.util.Arrays.fill(intArray9, (int) (byte) -1);
        int int15 = java.util.Arrays.binarySearch(intArray9, (-8));
        int int19 = java.util.Arrays.binarySearch(intArray9, (int) (byte) 0, 10, (int) '#');
        java.util.stream.IntStream intStream20 = java.util.Arrays.stream(intArray9);
        java.util.Arrays.fill(intArray9, 0);
        java.util.stream.IntStream intStream23 = java.util.Arrays.stream(intArray9);
        java.util.stream.IntStream intStream24 = java.util.Arrays.stream(intArray9);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofInt10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-11) + "'", int19 == (-11));
        org.junit.Assert.assertNotNull(intStream20);
        org.junit.Assert.assertNotNull(intStream23);
        org.junit.Assert.assertNotNull(intStream24);
    }

    @Test
    public void test7103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7103");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        double[] doubleArray14 = java.util.Arrays.copyOfRange(doubleArray11, 2, 100);
        double[] doubleArray16 = java.util.Arrays.copyOf(doubleArray11, (int) '#');
        java.util.Spliterator.OfDouble ofDouble17 = java.util.Arrays.spliterator(doubleArray11);
        java.util.Arrays.fill(doubleArray11, 0.0d);
        java.util.Spliterator.OfDouble ofDouble20 = java.util.Arrays.spliterator(doubleArray11);
        java.util.Arrays.sort(doubleArray11, (int) (short) 10, (int) (short) 10);
        java.util.function.IntToDoubleFunction intToDoubleFunction24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSetAll(doubleArray11, intToDoubleFunction24);
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
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(ofDouble17);
        org.junit.Assert.assertNotNull(ofDouble20);
    }

    @Test
    public void test7104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7104");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        int int6 = java.util.Arrays.binarySearch(byteArray1, (byte) 0);
        java.util.Arrays.parallelSort(byteArray1);
        int int9 = java.util.Arrays.binarySearch(byteArray1, (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = java.util.Arrays.copyOfRange(byteArray1, (-4), (-30));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -4 > -30");
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
    public void test7105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7105");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        long[] longArray11 = java.util.Arrays.copyOfRange(longArray3, 0, (int) (byte) 0);
        java.util.Spliterator.OfLong ofLong12 = java.util.Arrays.spliterator(longArray11);
        long[] longArray14 = java.util.Arrays.copyOf(longArray11, 10);
        java.util.Arrays.sort(longArray14);
        int int17 = java.util.Arrays.binarySearch(longArray14, (long) 30);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream20 = java.util.Arrays.stream(longArray14, (-8), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(ofLong12);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-11) + "'", int17 == (-11));
    }

    @Test
    public void test7106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7106");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        java.util.Arrays.fill(shortArray0, (short) (byte) -1);
        java.util.Arrays.parallelSort(shortArray0);
        short[] shortArray7 = java.util.Arrays.copyOf(shortArray0, 98);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test7107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7107");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        byte[] byteArray6 = java.util.Arrays.copyOf(byteArray1, (int) ' ');
        java.util.Arrays.sort(byteArray6);
        byte[] byteArray9 = java.util.Arrays.copyOf(byteArray6, 5);
        byte[] byteArray11 = java.util.Arrays.copyOf(byteArray9, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = java.util.Arrays.binarySearch(byteArray11, 3, 99, (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 99");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
    }

    @Test
    public void test7108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7108");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        int int5 = java.util.Arrays.binarySearch(byteArray3, (byte) 0);
        int int7 = java.util.Arrays.binarySearch(byteArray3, (byte) 0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-3) + "'", int7 == (-3));
    }

    @Test
    public void test7109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7109");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.fill(intArray3, (int) (short) 1);
        java.util.Arrays.fill(intArray3, (int) ' ', (int) (short) 100, 0);
        int int11 = java.util.Arrays.binarySearch(intArray3, 2);
        java.util.Arrays.sort(intArray3);
        java.util.function.IntUnaryOperator intUnaryOperator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(intArray3, intUnaryOperator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-101) + "'", int11 == (-101));
    }

    @Test
    public void test7110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7110");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.parallelSort(floatArray3);
        java.util.Arrays.fill(floatArray3, (float) ' ');
        float[] floatArray10 = java.util.Arrays.copyOf(floatArray3, (int) (byte) 1);
        java.util.Arrays.fill(floatArray10, (float) 17);
        float[] floatArray14 = java.util.Arrays.copyOf(floatArray10, (int) (short) 100);
        int int18 = java.util.Arrays.binarySearch(floatArray14, (int) (byte) 10, 10, (float) (-6));
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[32.0, 32.0, 32.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[17.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[17.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-11) + "'", int18 == (-11));
    }

    @Test
    public void test7111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7111");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) (byte) 100);
        short[] shortArray6 = java.util.Arrays.copyOf(shortArray0, 1);
        short[] shortArray8 = java.util.Arrays.copyOf(shortArray6, (int) (byte) 100);
        short[] shortArray11 = java.util.Arrays.copyOfRange(shortArray8, 1, (int) (short) 100);
        short[] shortArray14 = java.util.Arrays.copyOfRange(shortArray8, (int) (short) 100, (int) (byte) 100);
        java.util.Arrays.parallelSort(shortArray8);
        java.util.Arrays.sort(shortArray8, 5, 7);
        java.util.Arrays.parallelSort(shortArray8, 0, 49);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0]");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[]");
    }

    @Test
    public void test7112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7112");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.util.Spliterator.OfDouble ofDouble5 = java.util.Arrays.spliterator(doubleArray2);
        java.util.Arrays.sort(doubleArray2);
        java.util.Arrays.sort(doubleArray2);
        java.util.Arrays.sort(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(ofDouble5);
    }

    @Test
    public void test7113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7113");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream5 = java.util.Arrays.stream(doubleArray4);
        java.util.Arrays.fill(doubleArray4, (double) (short) -1);
        java.util.Spliterator.OfDouble ofDouble8 = java.util.Arrays.spliterator(doubleArray4);
        java.util.Arrays.parallelSort(doubleArray4);
        java.util.Arrays.parallelSort(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(ofDouble8);
    }

    @Test
    public void test7114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7114");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.fill(intArray3, (int) (short) 1);
        java.util.Arrays.fill(intArray3, (int) ' ', (int) (short) 100, 0);
        int[] intArray12 = java.util.Arrays.copyOfRange(intArray3, 0, (int) '4');
        java.util.Arrays.fill(intArray12, (-3));
        java.util.stream.IntStream intStream17 = java.util.Arrays.stream(intArray12, 15, (int) '#');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3]");
        org.junit.Assert.assertNotNull(intStream17);
    }

    @Test
    public void test7115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7115");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int[] intArray11 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        java.util.Arrays.sort(intArray11);
        int[] intArray15 = java.util.Arrays.copyOfRange(intArray11, 0, 100);
        int[] intArray17 = java.util.Arrays.copyOf(intArray11, (int) (short) 100);
        java.util.Spliterator.OfInt ofInt18 = java.util.Arrays.spliterator(intArray17);
        java.util.Spliterator.OfInt ofInt21 = java.util.Arrays.spliterator(intArray17, (int) (byte) 0, 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertNotNull(ofInt18);
        org.junit.Assert.assertNotNull(ofInt21);
    }

    @Test
    public void test7116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7116");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        int[] intArray9 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        java.util.Spliterator.OfInt ofInt10 = java.util.Arrays.spliterator(intArray9);
        java.util.Arrays.sort(intArray9);
        java.util.Arrays.fill(intArray9, (int) (byte) -1);
        int int15 = java.util.Arrays.binarySearch(intArray9, (-8));
        java.util.Arrays.fill(intArray9, 5);
        java.lang.Class<?> wildcardClass18 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]");
        org.junit.Assert.assertNotNull(ofInt10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7117");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        java.util.Arrays.parallelSort(longArray3);
        java.util.stream.LongStream longStream12 = java.util.Arrays.stream(longArray3, (int) (byte) 1, (int) (short) 1);
        int int14 = java.util.Arrays.binarySearch(longArray3, 0L);
        long[] longArray16 = java.util.Arrays.copyOf(longArray3, (int) ' ');
        long[] longArray19 = java.util.Arrays.copyOfRange(longArray16, 0, 4);
        java.lang.String str20 = java.util.Arrays.toString(longArray16);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[10, 10, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[10, 10, 10, 0]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[10, 10, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]" + "'", str20, "[10, 10, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test7118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7118");
        double[] doubleArray3 = new double[] { 10, (short) 100, 0.0f };
        java.util.Arrays.sort(doubleArray3);
        java.util.Arrays.sort(doubleArray3);
        java.util.stream.DoubleStream doubleStream6 = java.util.Arrays.stream(doubleArray3);
        java.util.function.IntToDoubleFunction intToDoubleFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSetAll(doubleArray3, intToDoubleFunction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test7119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7119");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        boolean[] booleanArray9 = java.util.Arrays.copyOf(booleanArray7, 2);
        boolean[] booleanArray12 = java.util.Arrays.copyOfRange(booleanArray7, (int) '4', (int) 'a');
        boolean[] booleanArray14 = java.util.Arrays.copyOf(booleanArray12, (int) (short) 10);
        boolean[] booleanArray16 = java.util.Arrays.copyOf(booleanArray14, 99);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false]");
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
    }

    @Test
    public void test7120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7120");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        int[] intArray9 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        int int11 = java.util.Arrays.binarySearch(intArray3, (int) 'a');
        java.util.Spliterator.OfInt ofInt12 = java.util.Arrays.spliterator(intArray3);
        java.util.Spliterator.OfInt ofInt13 = java.util.Arrays.spliterator(intArray3);
        java.util.Arrays.fill(intArray3, 0);
        java.util.Arrays.parallelSort(intArray3);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-101) + "'", int11 == (-101));
        org.junit.Assert.assertNotNull(ofInt12);
        org.junit.Assert.assertNotNull(ofInt13);
    }

    @Test
    public void test7121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7121");
        java.lang.Object[] objArray0 = null;
        boolean[] booleanArray6 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray8 = java.util.Arrays.copyOf(booleanArray6, (int) '4');
        boolean[] booleanArray11 = java.util.Arrays.copyOfRange(booleanArray8, (int) (short) 10, (int) '#');
        boolean[] booleanArray13 = java.util.Arrays.copyOf(booleanArray8, (int) (short) 1);
        boolean[] booleanArray15 = java.util.Arrays.copyOf(booleanArray13, 99);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(objArray0, (java.lang.Object) booleanArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
    }

    @Test
    public void test7122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7122");
        boolean[] booleanArray2 = new boolean[] { true, false };
        boolean[] booleanArray5 = java.util.Arrays.copyOfRange(booleanArray2, (int) (byte) 0, (int) (byte) 0);
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, 7);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[true, false]");
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, false, false, false, false, false]");
    }

    @Test
    public void test7123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7123");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0]", "[-1]" };
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.sort((java.lang.Object[]) strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(strArray2, 15, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(15) > toIndex(-4)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test7124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7124");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        int[] intArray9 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        java.util.Spliterator.OfInt ofInt10 = java.util.Arrays.spliterator(intArray9);
        java.util.Arrays.sort(intArray9);
        java.lang.String str12 = java.util.Arrays.toString(intArray9);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(ofInt10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100]" + "'", str12, "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100]");
    }

    @Test
    public void test7125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7125");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        double[] doubleArray10 = java.util.Arrays.copyOf(doubleArray4, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfDouble ofDouble13 = java.util.Arrays.spliterator(doubleArray10, (-6), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test7126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7126");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.sort(byteArray1);
        java.util.Arrays.parallelSort(byteArray1);
        byte[] byteArray8 = java.util.Arrays.copyOf(byteArray1, (int) (short) 10);
        byte[] byteArray10 = java.util.Arrays.copyOf(byteArray1, (int) (short) 0);
        java.util.Arrays.sort(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
    }

    @Test
    public void test7127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7127");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int[] intArray11 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        int[] intArray13 = java.util.Arrays.copyOf(intArray3, 1);
        int[] intArray16 = java.util.Arrays.copyOfRange(intArray13, (int) (short) 0, 100);
        int int20 = java.util.Arrays.binarySearch(intArray16, 0, 100, (int) ' ');
        int int22 = java.util.Arrays.binarySearch(intArray16, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = java.util.Arrays.copyOfRange(intArray16, (int) 'a', 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 97 > 7");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[3]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-101) + "'", int20 == (-101));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 49 + "'", int22 == 49);
    }

    @Test
    public void test7128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7128");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray4, '#');
        char[] charArray11 = java.util.Arrays.copyOf(charArray4, (int) (byte) 1);
        java.util.Arrays.parallelSort(charArray11);
        int int14 = java.util.Arrays.binarySearch(charArray11, 'a');
        java.lang.String str15 = java.util.Arrays.toString(charArray11);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2) + "'", int14 == (-2));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[#]" + "'", str15, "[#]");
    }

    @Test
    public void test7129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7129");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        java.util.stream.DoubleStream doubleStream12 = java.util.Arrays.stream(doubleArray11);
        java.util.function.DoubleBinaryOperator doubleBinaryOperator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(doubleArray11, 10, (-7), doubleBinaryOperator15);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleStream12);
    }

    @Test
    public void test7130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7130");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        int int7 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        int int9 = java.util.Arrays.binarySearch(floatArray3, (float) (short) 0);
        int int13 = java.util.Arrays.binarySearch(floatArray3, 2, 3, (float) 0);
        java.util.Arrays.fill(floatArray3, (float) ' ');
        int int17 = java.util.Arrays.binarySearch(floatArray3, (float) 10L);
        java.util.Arrays.parallelSort(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[32.0, 32.0, 32.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-3) + "'", int7 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-3) + "'", int13 == (-3));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test7131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7131");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray1);
        java.util.Arrays.fill(intArray1, 5);
        java.util.Arrays.fill(intArray1, (-3));
        java.util.Arrays.parallelSort(intArray1);
        int[] intArray11 = java.util.Arrays.copyOf(intArray1, 3);
        java.util.Arrays.parallelSort(intArray11);
        java.util.Arrays.fill(intArray11, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-3]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0]");
    }

    @Test
    public void test7132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7132");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.lang.reflect.Type[][] typeArray5 = new java.lang.reflect.Type[][] {};
        java.util.stream.Stream<java.lang.reflect.Type[]> typeArrayStream6 = java.util.Arrays.stream(typeArray5);
        java.util.Arrays.fill((java.lang.Object[]) typeArray5, (java.lang.Object) "[a, a, a, a]");
        java.util.Arrays.fill((java.lang.Object[]) strArray2, (java.lang.Object) "[a, a, a, a]");
        java.util.Arrays.parallelSort(strArray2);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = java.util.Arrays.spliterator((java.lang.Comparable<java.lang.String>[]) strArray2);
        java.lang.CharSequence[] charSequenceArray13 = java.util.Arrays.copyOf((java.lang.CharSequence[]) strArray2, 99);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(typeArrayStream6);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(charSequenceArray13);
    }

    @Test
    public void test7133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7133");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 10, (byte) 0 };
        int int7 = java.util.Arrays.binarySearch(byteArray5, (byte) 0);
        java.util.Arrays.sort(byteArray5);
        int int12 = java.util.Arrays.binarySearch(byteArray5, 4, 5, (byte) 1);
        byte[] byteArray14 = new byte[] { (byte) 1 };
        byte[] byteArray17 = java.util.Arrays.copyOfRange(byteArray14, (int) (short) 1, 2);
        java.util.Arrays.sort(byteArray14);
        int int20 = java.util.Arrays.binarySearch(byteArray14, (byte) -1);
        java.util.Arrays.fill(byteArray14, (byte) 10);
        int int24 = java.util.Arrays.binarySearch(byteArray14, (byte) 10);
        byte[] byteArray26 = java.util.Arrays.copyOf(byteArray14, 5);
        int int28 = java.util.Arrays.binarySearch(byteArray26, (byte) 100);
        boolean boolean29 = java.util.Arrays.equals(byteArray5, byteArray26);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-4) + "'", int7 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-5) + "'", int12 == (-5));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[10, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-6) + "'", int28 == (-6));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test7134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7134");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) (byte) 100);
        short[] shortArray6 = java.util.Arrays.copyOf(shortArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray9 = java.util.Arrays.copyOfRange(shortArray0, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100 > -1");
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
    public void test7135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7135");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.sort(byteArray1);
        int int7 = java.util.Arrays.binarySearch(byteArray1, (byte) -1);
        byte[] byteArray9 = java.util.Arrays.copyOf(byteArray1, 0);
        java.util.Arrays.fill(byteArray1, (byte) -1);
        java.lang.String str12 = java.util.Arrays.toString(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[-1]" + "'", str12, "[-1]");
    }

    @Test
    public void test7136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7136");
        boolean[] booleanArray2 = new boolean[] { true, false };
        boolean[] booleanArray5 = java.util.Arrays.copyOfRange(booleanArray2, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(booleanArray5, (-53), 15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -53");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[true, false]");
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[]");
    }

    @Test
    public void test7137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7137");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong8 = java.util.Arrays.spliterator(longArray7);
        java.util.Arrays.parallelSort(longArray7);
        int int11 = java.util.Arrays.binarySearch(longArray7, (long) (byte) 1);
        java.util.Spliterator.OfLong ofLong12 = java.util.Arrays.spliterator(longArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java.util.Arrays.binarySearch(longArray7, (-18), 49, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -18");
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertNotNull(ofLong12);
    }

    @Test
    public void test7138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7138");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.parallelSort(floatArray3);
        int int8 = java.util.Arrays.binarySearch(floatArray3, (float) 10L);
        java.util.Arrays.sort(floatArray3);
        java.util.Arrays.sort(floatArray3);
        float[] floatArray13 = java.util.Arrays.copyOfRange(floatArray3, 0, 99);
        java.util.Arrays.sort(floatArray3);
        float[] floatArray18 = new float[] { (-1), (short) -1, '4' };
        int int20 = java.util.Arrays.binarySearch(floatArray18, 0.0f);
        int int22 = java.util.Arrays.binarySearch(floatArray18, 0.0f);
        int int24 = java.util.Arrays.binarySearch(floatArray18, (float) (byte) 10);
        java.util.Arrays.sort(floatArray18);
        java.util.Arrays.parallelSort(floatArray18);
        java.util.Arrays.parallelSort(floatArray18);
        boolean boolean28 = java.util.Arrays.equals(floatArray3, floatArray18);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-3) + "'", int8 == (-3));
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[-1.0, -1.0, 52.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[-1.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-3) + "'", int20 == (-3));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-3) + "'", int22 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test7139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7139");
        java.lang.String[] strArray6 = new java.lang.String[] { "[0, 100]", "[false, false]", "[0.0, 0.0, 1.0]", "[3, 1, 0, 0, 0, 0, 0, 0, 0]", "[32.0, 32.0, 32.0]", "[100]" };
        java.util.Arrays.parallelSort(strArray6, (int) (short) 0, 4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(strArray6, (-2), 30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test7140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7140");
        short[] shortArray6 = new short[] { (byte) -1, (byte) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
        java.util.Arrays.parallelSort(shortArray6);
        java.util.Arrays.sort(shortArray6);
        short[] shortArray10 = java.util.Arrays.copyOf(shortArray6, 100);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray13 = java.util.Arrays.copyOfRange(shortArray10, (int) (byte) 100, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100 > 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test7141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7141");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong8 = java.util.Arrays.spliterator(longArray7);
        long[] longArray10 = java.util.Arrays.copyOf(longArray7, (int) (byte) 1);
        long[] longArray12 = java.util.Arrays.copyOf(longArray7, 0);
        int int14 = java.util.Arrays.binarySearch(longArray7, (long) 3);
        java.util.Arrays.parallelSort(longArray7);
        java.util.Arrays.sort(longArray7);
        java.util.Spliterator.OfLong ofLong17 = java.util.Arrays.spliterator(longArray7);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[0, 0, 0, 0, 0, 0, 0, 1, 3]");
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[3]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-10) + "'", int14 == (-10));
        org.junit.Assert.assertNotNull(ofLong17);
    }

    @Test
    public void test7142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7142");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray4, '#');
        char[] charArray11 = java.util.Arrays.copyOf(charArray4, (int) (byte) 1);
        char[] charArray13 = java.util.Arrays.copyOf(charArray4, 5);
        java.util.Arrays.fill(charArray13, 'a');
        int int17 = java.util.Arrays.binarySearch(charArray13, 'a');
        int int19 = java.util.Arrays.binarySearch(charArray13, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(charArray13, 100, (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(-5)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "aaaaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "aaaaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, a, a, a, a]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test7143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7143");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) 10, (byte) 1 };
        java.util.Arrays.sort(byteArray6);
        byte[] byteArray9 = java.util.Arrays.copyOf(byteArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(byteArray6, 5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 0, 1, 10, 100]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1]");
    }

    @Test
    public void test7144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7144");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        java.util.Spliterator.OfDouble ofDouble10 = java.util.Arrays.spliterator(doubleArray7, 10, (int) '#');
        int int12 = java.util.Arrays.binarySearch(doubleArray7, (double) (-1));
        java.util.Arrays.sort(doubleArray7);
        int int15 = java.util.Arrays.binarySearch(doubleArray7, (double) 6);
        double[] doubleArray18 = java.util.Arrays.copyOfRange(doubleArray7, 4, 5);
        java.util.Arrays.parallelSort(doubleArray7, (int) (byte) 1, (int) '#');
        int int23 = java.util.Arrays.binarySearch(doubleArray7, (double) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream26 = java.util.Arrays.stream(doubleArray7, (int) (byte) -1, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
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
        org.junit.Assert.assertNotNull(ofDouble10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-96) + "'", int23 == (-96));
    }

    @Test
    public void test7145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7145");
        short[] shortArray6 = new short[] { (short) 100, (short) 1, (byte) 10, (byte) 1, (short) -1, (short) 1 };
        java.util.Arrays.parallelSort(shortArray6);
        short[] shortArray10 = java.util.Arrays.copyOfRange(shortArray6, 0, (int) ' ');
        int int12 = java.util.Arrays.binarySearch(shortArray6, (short) -1);
        java.util.Arrays.parallelSort(shortArray6);
        int int15 = java.util.Arrays.binarySearch(shortArray6, (short) -1);
        java.util.Arrays.parallelSort(shortArray6);
        java.util.Arrays.fill(shortArray6, (short) 1);
        java.lang.String str19 = java.util.Arrays.toString(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[1, 1, 1, 1, 1, 1]");
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[-1, 1, 1, 1, 10, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[1, 1, 1, 1, 1, 1]" + "'", str19, "[1, 1, 1, 1, 1, 1]");
    }

    @Test
    public void test7146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7146");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.sort(intArray3);
        int int10 = java.util.Arrays.binarySearch(intArray3, 5);
        java.util.Spliterator.OfInt ofInt11 = java.util.Arrays.spliterator(intArray3);
        int int13 = java.util.Arrays.binarySearch(intArray3, 17);
        java.util.stream.IntStream intStream16 = java.util.Arrays.stream(intArray3, 2, (int) (byte) 10);
        java.util.stream.IntStream intStream19 = java.util.Arrays.stream(intArray3, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = java.util.Arrays.copyOf(intArray3, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
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
        org.junit.Assert.assertNotNull(ofInt11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-100) + "'", int13 == (-100));
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNotNull(intStream19);
    }

    @Test
    public void test7147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7147");
        float[] floatArray1 = new float[] { (-1L) };
        int int3 = java.util.Arrays.binarySearch(floatArray1, (float) (short) -1);
        java.util.Arrays.sort(floatArray1);
        java.util.Arrays.fill(floatArray1, (float) 2);
        float[] floatArray8 = java.util.Arrays.copyOf(floatArray1, (int) (byte) 100);
        java.util.Arrays.sort(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[2.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[2.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test7148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7148");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray1);
        java.util.Spliterator.OfInt ofInt5 = java.util.Arrays.spliterator(intArray1);
        java.util.Arrays.fill(intArray1, 2);
        java.util.Arrays.parallelSort(intArray1);
        java.lang.String str9 = java.util.Arrays.toString(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[2]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofInt5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[2]" + "'", str9, "[2]");
    }

    @Test
    public void test7149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7149");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        byte[] byteArray9 = java.util.Arrays.copyOf(byteArray4, (int) '#');
        java.util.Arrays.sort(byteArray9);
        java.util.Arrays.fill(byteArray9, (byte) 1);
        byte[] byteArray14 = java.util.Arrays.copyOf(byteArray9, 49);
        int int16 = java.util.Arrays.binarySearch(byteArray9, (byte) 0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test7150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7150");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.parallelSort(charArray4);
        int int10 = java.util.Arrays.binarySearch(charArray4, 'a');
        java.util.Arrays.parallelSort(charArray4, 0, 3);
        java.util.Arrays.parallelSort(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(charArray4, (int) (byte) 1, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , 4, a, a]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test7151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7151");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
    }

    @Test
    public void test7152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7152");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray3, (int) (byte) 0, (int) (byte) 1);
        java.util.Spliterator.OfInt ofInt9 = java.util.Arrays.spliterator(intArray3, (int) (byte) 1, 10);
        int int11 = java.util.Arrays.binarySearch(intArray3, 1);
        java.util.Arrays.parallelSort(intArray3);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(ofInt9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-101) + "'", int11 == (-101));
    }

    @Test
    public void test7153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7153");
        byte[] byteArray0 = null;
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 100 };
        java.util.Arrays.sort(byteArray3);
        int int8 = java.util.Arrays.binarySearch(byteArray3, (int) (byte) 0, 0, (byte) 1);
        byte[] byteArray10 = java.util.Arrays.copyOf(byteArray3, 2);
        int int12 = java.util.Arrays.binarySearch(byteArray3, (byte) 100);
        boolean boolean13 = java.util.Arrays.equals(byteArray0, byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 100]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test7154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7154");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        boolean[] booleanArray9 = java.util.Arrays.copyOf(booleanArray5, 2);
        java.util.Arrays.fill(booleanArray5, true);
        java.util.Arrays.fill(booleanArray5, true);
        java.util.Arrays.fill(booleanArray5, true);
        java.lang.String str16 = java.util.Arrays.toString(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[true, true, true, true, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[true, true, true, true, true]" + "'", str16, "[true, true, true, true, true]");
    }

    @Test
    public void test7155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7155");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 100 };
        java.util.Arrays.sort(byteArray2);
        int int7 = java.util.Arrays.binarySearch(byteArray2, (int) (byte) 0, 0, (byte) 1);
        java.util.Arrays.fill(byteArray2, (byte) -1);
        java.util.Arrays.sort(byteArray2);
        java.util.Arrays.sort(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(byteArray2, (int) (byte) 100, 17, (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(17)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test7156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7156");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int[] intArray11 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        int[] intArray13 = java.util.Arrays.copyOf(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(intArray13, (-4), (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(-4) > toIndex(-6)");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[3]");
    }

    @Test
    public void test7157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7157");
        short[] shortArray6 = new short[] { (byte) -1, (byte) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
        java.util.Arrays.parallelSort(shortArray6);
        java.util.Arrays.sort(shortArray6);
        short[] shortArray10 = java.util.Arrays.copyOf(shortArray6, 100);
        java.util.Arrays.sort(shortArray10);
        int int13 = java.util.Arrays.binarySearch(shortArray10, (short) (byte) -1);
        java.util.Arrays.sort(shortArray10);
        java.util.Arrays.fill(shortArray10, (short) (byte) 100);
        java.util.Arrays.parallelSort(shortArray10);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test7158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7158");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray3, (int) (byte) 0, (int) (byte) 1);
        java.util.Spliterator.OfInt ofInt7 = java.util.Arrays.spliterator(intArray3);
        java.util.stream.IntStream intStream8 = java.util.Arrays.stream(intArray3);
        java.util.stream.IntStream intStream11 = java.util.Arrays.stream(intArray3, 0, 3);
        java.util.Spliterator.OfInt ofInt12 = java.util.Arrays.spliterator(intArray3);
        int[] intArray14 = new int[] { 100 };
        int[] intArray16 = java.util.Arrays.copyOf(intArray14, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray16, (int) (byte) 0, (int) (byte) 1);
        java.util.Spliterator.OfInt ofInt22 = java.util.Arrays.spliterator(intArray16, (int) (byte) 1, 10);
        int[] intArray24 = new int[] { 100 };
        int[] intArray26 = java.util.Arrays.copyOf(intArray24, (int) (short) 100);
        int int30 = java.util.Arrays.binarySearch(intArray26, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray26, 3);
        int[] intArray34 = java.util.Arrays.copyOf(intArray26, (int) (short) 100);
        int[] intArray36 = java.util.Arrays.copyOf(intArray26, 1);
        int[] intArray39 = java.util.Arrays.copyOfRange(intArray36, (int) (short) 0, 100);
        int int43 = java.util.Arrays.binarySearch(intArray39, 0, 100, (int) ' ');
        int int45 = java.util.Arrays.binarySearch(intArray39, 0);
        java.util.Spliterator.OfInt ofInt46 = java.util.Arrays.spliterator(intArray39);
        int[] intArray48 = new int[] { 100 };
        int[] intArray50 = java.util.Arrays.copyOf(intArray48, (int) (short) 100);
        int int54 = java.util.Arrays.binarySearch(intArray50, (int) (byte) 1, 10, 0);
        int[] intArray56 = java.util.Arrays.copyOf(intArray50, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray56);
        int[] intArray59 = java.util.Arrays.copyOf(intArray56, (int) (byte) 10);
        java.util.Spliterator.OfInt ofInt60 = java.util.Arrays.spliterator(intArray59);
        int int62 = java.util.Arrays.binarySearch(intArray59, 5);
        java.util.Spliterator.OfInt ofInt63 = java.util.Arrays.spliterator(intArray59);
        int[] intArray65 = new int[] { 100 };
        int[] intArray67 = java.util.Arrays.copyOf(intArray65, (int) (short) 100);
        java.util.Arrays.fill(intArray67, (-5));
        int int71 = java.util.Arrays.binarySearch(intArray67, (-6));
        java.util.Arrays.sort(intArray67, 10, 10);
        java.util.Spliterator.OfInt ofInt75 = java.util.Arrays.spliterator(intArray67);
        int int77 = java.util.Arrays.binarySearch(intArray67, (int) 'a');
        java.util.Spliterator.OfInt ofInt78 = java.util.Arrays.spliterator(intArray67);
        java.util.Spliterator.OfInt[] ofIntArray79 = new java.util.Spliterator.OfInt[] { ofInt12, ofInt22, ofInt46, ofInt63, ofInt78 };
        java.util.Spliterator.OfInt[][] ofIntArray80 = new java.util.Spliterator.OfInt[][] { ofIntArray79 };
        java.util.stream.Stream<java.util.Spliterator.OfInt[]> ofIntArrayStream81 = java.util.Arrays.stream(ofIntArray80);
        java.util.Arrays.sort((java.lang.Object[]) ofIntArray80);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofInt7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertNotNull(ofInt12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofInt22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[3]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-101) + "'", int43 == (-101));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 49 + "'", int45 == 49);
        org.junit.Assert.assertNotNull(ofInt46);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 5 + "'", int54 == 5);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofInt60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-11) + "'", int62 == (-11));
        org.junit.Assert.assertNotNull(ofInt63);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[100]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[-5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(ofInt75);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-101) + "'", int77 == (-101));
        org.junit.Assert.assertNotNull(ofInt78);
        org.junit.Assert.assertNotNull(ofIntArray79);
        org.junit.Assert.assertNotNull(ofIntArray80);
        org.junit.Assert.assertNotNull(ofIntArrayStream81);
    }

    @Test
    public void test7159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7159");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.parallelSort(charArray4);
        java.util.Arrays.sort(charArray4);
        int int11 = java.util.Arrays.binarySearch(charArray4, 'a');
        java.util.Arrays.parallelSort(charArray4);
        int int14 = java.util.Arrays.binarySearch(charArray4, 'a');
        int int16 = java.util.Arrays.binarySearch(charArray4, 'a');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , 4, a, a]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test7160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7160");
        short[][][][][][][] shortArray0 = new short[][][][][][][] {};
        short[][][][][][][] shortArray1 = new short[][][][][][][] {};
        short[][][][][][][] shortArray2 = new short[][][][][][][] {};
        short[][][][][][][] shortArray3 = new short[][][][][][][] {};
        short[][][][][][][] shortArray4 = new short[][][][][][][] {};
        short[][][][][][][] shortArray5 = new short[][][][][][][] {};
        short[][][][][][][][] shortArray6 = new short[][][][][][][][] { shortArray0, shortArray1, shortArray2, shortArray3, shortArray4, shortArray5 };
        short[][][][][][][][][] shortArray7 = new short[][][][][][][][][] { shortArray6 };
        short[][][][][][][][][] shortArray10 = java.util.Arrays.copyOfRange(shortArray7, 0, (int) '#');
        java.util.stream.Stream<short[][][][][][][][]> shortArrayStream11 = java.util.Arrays.stream(shortArray10);
        boolean[] booleanArray19 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray21 = java.util.Arrays.copyOf(booleanArray19, (int) '4');
        boolean[] booleanArray23 = java.util.Arrays.copyOf(booleanArray21, 2);
        java.util.Arrays.fill(booleanArray21, true);
        boolean[] booleanArray27 = java.util.Arrays.copyOf(booleanArray21, (int) (byte) 0);
        java.util.Arrays.fill(booleanArray21, false);
        boolean[] booleanArray31 = java.util.Arrays.copyOf(booleanArray21, 7);
        boolean[] booleanArray34 = java.util.Arrays.copyOfRange(booleanArray31, (int) (byte) 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill((java.lang.Object[]) shortArray10, (int) (byte) 0, 6, (java.lang.Object) booleanArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: [Z");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(shortArrayStream11);
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, false]");
        org.junit.Assert.assertNotNull(booleanArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray27), "[]");
        org.junit.Assert.assertNotNull(booleanArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray31), "[false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray34), "[false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
    }

    @Test
    public void test7161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7161");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        boolean[] booleanArray10 = java.util.Arrays.copyOfRange(booleanArray7, (int) (short) 10, (int) '#');
        boolean[] booleanArray12 = java.util.Arrays.copyOf(booleanArray7, (int) (short) 1);
        java.util.Arrays.fill(booleanArray12, true);
        boolean[] booleanArray17 = java.util.Arrays.copyOfRange(booleanArray12, (int) (byte) 1, 2);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[false]");
    }

    @Test
    public void test7162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7162");
        short[] shortArray6 = new short[] { (byte) -1, (byte) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
        java.util.Arrays.parallelSort(shortArray6);
        java.util.Arrays.sort(shortArray6);
        java.util.Arrays.parallelSort(shortArray6);
        short[] shortArray12 = java.util.Arrays.copyOfRange(shortArray6, 1, (int) 'a');
        java.lang.String str13 = java.util.Arrays.toString(shortArray12);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]" + "'", str13, "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test7163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7163");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int int11 = java.util.Arrays.binarySearch(intArray3, 1);
        java.util.Spliterator.OfInt ofInt12 = java.util.Arrays.spliterator(intArray3);
        java.util.Spliterator.OfInt ofInt15 = java.util.Arrays.spliterator(intArray3, (int) (short) 0, 0);
        java.util.stream.IntStream intStream18 = java.util.Arrays.stream(intArray3, 0, 0);
        java.lang.String str19 = java.util.Arrays.toString(intArray3);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(ofInt12);
        org.junit.Assert.assertNotNull(ofInt15);
        org.junit.Assert.assertNotNull(intStream18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]" + "'", str19, "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
    }

    @Test
    public void test7164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7164");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        double[] doubleArray14 = java.util.Arrays.copyOfRange(doubleArray11, 2, 100);
        double[] doubleArray16 = java.util.Arrays.copyOf(doubleArray11, (int) '#');
        int int18 = java.util.Arrays.binarySearch(doubleArray11, 0.0d);
        java.util.Spliterator.OfDouble ofDouble19 = java.util.Arrays.spliterator(doubleArray11);
        java.util.stream.DoubleStream doubleStream20 = java.util.Arrays.stream(doubleArray11);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray23 = java.util.Arrays.copyOfRange(doubleArray11, (-36), 98);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(ofDouble19);
        org.junit.Assert.assertNotNull(doubleStream20);
    }

    @Test
    public void test7165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7165");
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
        long[] longArray21 = java.util.Arrays.copyOf(longArray3, 7);
        java.util.Arrays.parallelSort(longArray21);
        int int24 = java.util.Arrays.binarySearch(longArray21, 1L);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[0, 0, 0, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
    }

    @Test
    public void test7166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7166");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) 100);
        java.util.Arrays.sort(shortArray0);
        java.util.Arrays.sort(shortArray0);
        java.util.Arrays.fill(shortArray0, (int) (short) 0, 0, (short) 100);
        short[] shortArray12 = java.util.Arrays.copyOf(shortArray0, (int) (short) 0);
        int int14 = java.util.Arrays.binarySearch(shortArray0, (short) 100);
        java.util.Arrays.fill(shortArray0, (short) (byte) 0);
        short[] shortArray18 = java.util.Arrays.copyOf(shortArray0, (int) '4');
        java.util.Arrays.parallelSort(shortArray0);
        java.util.Arrays.fill(shortArray0, (short) 1);
        java.lang.String str22 = java.util.Arrays.toString(shortArray0);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
    }

    @Test
    public void test7167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7167");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        byte[] byteArray6 = java.util.Arrays.copyOf(byteArray1, (int) ' ');
        java.util.Arrays.fill(byteArray1, (byte) 10);
        java.util.Arrays.fill(byteArray1, (byte) 1);
        int int12 = java.util.Arrays.binarySearch(byteArray1, (byte) -1);
        java.util.Arrays.parallelSort(byteArray1);
        java.util.Arrays.fill(byteArray1, (byte) 1);
        java.lang.String str16 = java.util.Arrays.toString(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[1]" + "'", str16, "[1]");
    }

    @Test
    public void test7168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7168");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        int int7 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        int int9 = java.util.Arrays.binarySearch(floatArray3, (float) (short) 0);
        int int13 = java.util.Arrays.binarySearch(floatArray3, 2, 3, (float) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(floatArray3, 2, (-50));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(2) > toIndex(-50)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-3) + "'", int7 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-3) + "'", int13 == (-3));
    }

    @Test
    public void test7169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7169");
        java.util.Spliterator.OfInt[][][] ofIntArray0 = new java.util.Spliterator.OfInt[][][] {};
        java.util.Spliterator<java.util.Spliterator.OfInt[][]> ofIntArraySpliterator1 = java.util.Arrays.spliterator(ofIntArray0);
        org.junit.Assert.assertNotNull(ofIntArray0);
        org.junit.Assert.assertNotNull(ofIntArraySpliterator1);
    }

    @Test
    public void test7170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7170");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        double[] doubleArray14 = java.util.Arrays.copyOfRange(doubleArray11, 2, 100);
        double[] doubleArray16 = java.util.Arrays.copyOf(doubleArray11, (int) '#');
        java.util.Arrays.sort(doubleArray11);
        java.util.Arrays.fill(doubleArray11, (double) 4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfDouble ofDouble22 = java.util.Arrays.spliterator(doubleArray11, (int) (byte) 100, (-53));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(100) > fence(-53)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test7171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7171");
        java.lang.reflect.Type[][] typeArray0 = new java.lang.reflect.Type[][] {};
        java.util.stream.Stream<java.lang.reflect.Type[]> typeArrayStream1 = java.util.Arrays.stream(typeArray0);
        java.util.Arrays.fill((java.lang.Object[]) typeArray0, (java.lang.Object) "[a, a, a, a]");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort((java.lang.Object[]) typeArray0, (-3), (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(-3) > toIndex(-6)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(typeArrayStream1);
    }

    @Test
    public void test7172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7172");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.fill(longArray3, (long) '4');
        int int10 = java.util.Arrays.binarySearch(longArray3, 0L);
        int int12 = java.util.Arrays.binarySearch(longArray3, (long) (byte) -1);
        java.util.Arrays.parallelSort(longArray3);
        java.util.Arrays.sort(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream17 = java.util.Arrays.stream(longArray3, 29, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[52, 52, 52]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test7173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7173");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int[] intArray11 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        int[] intArray13 = java.util.Arrays.copyOf(intArray3, 1);
        java.util.Spliterator.OfInt ofInt16 = java.util.Arrays.spliterator(intArray3, 2, (int) 'a');
        java.util.Arrays.sort(intArray3);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[3]");
        org.junit.Assert.assertNotNull(ofInt16);
    }

    @Test
    public void test7174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7174");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        int[][] intArray9 = new int[][] { intArray5, intArray6, intArray7, intArray8 };
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        int[][] intArray14 = new int[][] { intArray10, intArray11, intArray12, intArray13 };
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        int[][] intArray19 = new int[][] { intArray15, intArray16, intArray17, intArray18 };
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        int[][] intArray24 = new int[][] { intArray20, intArray21, intArray22, intArray23 };
        int[][][] intArray25 = new int[][][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        int[][][] intArray27 = java.util.Arrays.copyOf(intArray25, (int) (short) 1);
        int[] intArray28 = new int[] {};
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        int[][] intArray32 = new int[][] { intArray28, intArray29, intArray30, intArray31 };
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        int[][] intArray37 = new int[][] { intArray33, intArray34, intArray35, intArray36 };
        int[] intArray38 = new int[] {};
        int[] intArray39 = new int[] {};
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        int[][] intArray42 = new int[][] { intArray38, intArray39, intArray40, intArray41 };
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        int[] intArray45 = new int[] {};
        int[] intArray46 = new int[] {};
        int[][] intArray47 = new int[][] { intArray43, intArray44, intArray45, intArray46 };
        int[] intArray48 = new int[] {};
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        int[] intArray51 = new int[] {};
        int[][] intArray52 = new int[][] { intArray48, intArray49, intArray50, intArray51 };
        int[][][] intArray53 = new int[][][] { intArray32, intArray37, intArray42, intArray47, intArray52 };
        int[][][] intArray55 = java.util.Arrays.copyOf(intArray53, (int) (short) 1);
        boolean boolean56 = java.util.Arrays.deepEquals((java.lang.Object[]) intArray25, (java.lang.Object[]) intArray53);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test7175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7175");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        int int7 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        int int9 = java.util.Arrays.binarySearch(floatArray3, (float) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray12 = java.util.Arrays.copyOfRange(floatArray3, 5, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-3) + "'", int7 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
    }

    @Test
    public void test7176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7176");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        java.util.Arrays.fill(shortArray0, (short) (byte) -1);
        java.util.Arrays.parallelSort(shortArray0);
        java.util.Arrays.parallelSort(shortArray0);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7177");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int[] intArray11 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        int int13 = java.util.Arrays.binarySearch(intArray11, (int) (short) 0);
        int[] intArray15 = java.util.Arrays.copyOf(intArray11, (int) (byte) 1);
        java.util.Arrays.parallelSort(intArray15);
        int[] intArray19 = java.util.Arrays.copyOfRange(intArray15, 0, 1);
        java.util.function.IntUnaryOperator intUnaryOperator20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(intArray15, intUnaryOperator20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[3]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[3]");
    }

    @Test
    public void test7178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7178");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.fill(longArray3, (long) '4');
        java.util.Arrays.parallelSort(longArray3);
        java.util.stream.LongStream longStream10 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.parallelSort(longArray3);
        int int13 = java.util.Arrays.binarySearch(longArray3, (long) (-53));
        java.util.function.IntToLongFunction intToLongFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(longArray3, intToLongFunction14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[52, 52, 52]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test7179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7179");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        int int7 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        int int9 = java.util.Arrays.binarySearch(floatArray3, (float) (short) 0);
        int int13 = java.util.Arrays.binarySearch(floatArray3, 2, 3, (float) 0);
        java.util.Arrays.fill(floatArray3, (float) ' ');
        int int17 = java.util.Arrays.binarySearch(floatArray3, (float) (byte) 10);
        java.util.Arrays.parallelSort(floatArray3);
        java.util.Arrays.fill(floatArray3, 1.0f);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[1.0, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-3) + "'", int7 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-3) + "'", int13 == (-3));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test7180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7180");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) 1 };
        java.util.Arrays.fill(byteArray6, (byte) -1);
        int int10 = java.util.Arrays.binarySearch(byteArray6, (byte) -1);
        int int12 = java.util.Arrays.binarySearch(byteArray6, (byte) -1);
        java.util.Arrays.fill(byteArray6, (byte) 10);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 10, 10, 10, 10]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test7181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7181");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray4, '#');
        java.util.Arrays.sort(charArray4);
        java.util.Arrays.parallelSort(charArray4);
        java.util.Arrays.parallelSort(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
    }

    @Test
    public void test7182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7182");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) 100);
        java.util.Arrays.sort(shortArray0);
        java.util.Arrays.sort(shortArray0);
        java.util.Arrays.fill(shortArray0, (int) (short) 0, 0, (short) 100);
        short[] shortArray12 = java.util.Arrays.copyOf(shortArray0, (int) (short) 0);
        int int14 = java.util.Arrays.binarySearch(shortArray0, (short) 100);
        java.util.Arrays.fill(shortArray0, (short) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray18 = java.util.Arrays.copyOf(shortArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test7183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7183");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int int11 = java.util.Arrays.binarySearch(intArray3, 1);
        java.util.Spliterator.OfInt ofInt12 = java.util.Arrays.spliterator(intArray3);
        int[] intArray14 = java.util.Arrays.copyOf(intArray3, 99);
        java.util.function.IntBinaryOperator intBinaryOperator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(intArray3, intBinaryOperator15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(ofInt12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
    }

    @Test
    public void test7184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7184");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        byte[] byteArray8 = java.util.Arrays.copyOf(byteArray4, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(byteArray4, (-100), 100, (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test7185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7185");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        int int8 = java.util.Arrays.binarySearch(byteArray4, (byte) 10);
        byte[] byteArray10 = java.util.Arrays.copyOf(byteArray4, (int) (short) 1);
        byte[] byteArray12 = java.util.Arrays.copyOf(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(byteArray4, (-5), (-50));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(-5) > toIndex(-50)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
    }

    @Test
    public void test7186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7186");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream5 = java.util.Arrays.stream(doubleArray4);
        java.util.Arrays.fill(doubleArray4, (double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(doubleArray4, 49, (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(49) > toIndex(-101)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
    }

    @Test
    public void test7187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7187");
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
        long[] longArray21 = java.util.Arrays.copyOf(longArray3, 7);
        java.util.Arrays.fill(longArray3, (long) (-53));
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray26 = java.util.Arrays.copyOfRange(longArray3, (-2), (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -2 > -5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-53, -53, -53]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(longStream17);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[1]");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[1, 1, 1, 0, 0, 0, 0]");
    }

    @Test
    public void test7188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7188");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0]", "[-1]" };
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        char[] charArray12 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray12, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray12, '#');
        java.util.Arrays.sort(charArray12);
        java.util.Arrays.sort(charArray12);
        java.util.Arrays.parallelSort(charArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = java.util.Arrays.binarySearch((java.lang.Object[]) strArray2, 0, 29, (java.lang.Object) charArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 29");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, #, #, #]");
    }

    @Test
    public void test7189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7189");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray3, (int) (byte) 0, (int) (byte) 1);
        java.util.stream.IntStream intStream7 = java.util.Arrays.stream(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = java.util.Arrays.binarySearch(intArray3, 100, (-2), 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(-2)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test7190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7190");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) 100);
        short[] shortArray6 = java.util.Arrays.copyOf(shortArray0, (int) '#');
        int int8 = java.util.Arrays.binarySearch(shortArray6, (short) (byte) 0);
        java.util.Arrays.sort(shortArray6);
        java.lang.String str10 = java.util.Arrays.toString(shortArray6);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 17 + "'", int8 == 17);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]" + "'", str10, "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test7191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7191");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        java.util.Arrays.parallelSort(longArray3);
        java.util.stream.LongStream longStream12 = java.util.Arrays.stream(longArray3, (int) (byte) 1, (int) (short) 1);
        int int14 = java.util.Arrays.binarySearch(longArray3, 0L);
        long[] longArray16 = java.util.Arrays.copyOf(longArray3, (int) ' ');
        java.util.Arrays.fill(longArray3, (long) (-2));
        java.util.Arrays.parallelSort(longArray3);
        java.util.stream.LongStream longStream20 = java.util.Arrays.stream(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(longArray3, (int) (byte) -1, (-100), (long) (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(-1) > toIndex(-100)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-2, -2, -2]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[10, 10, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(longStream20);
    }

    @Test
    public void test7192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7192");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        boolean[] booleanArray10 = java.util.Arrays.copyOfRange(booleanArray7, (int) (short) 10, (int) '#');
        boolean[] booleanArray12 = java.util.Arrays.copyOf(booleanArray10, 5);
        boolean[] booleanArray14 = java.util.Arrays.copyOf(booleanArray10, 6);
        java.lang.String str15 = java.util.Arrays.toString(booleanArray14);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[false, false, false, false, false, false]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[false, false, false, false, false, false]" + "'", str15, "[false, false, false, false, false, false]");
    }

    @Test
    public void test7193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7193");
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
        byte[] byteArray73 = new byte[] { (byte) 1 };
        byte[] byteArray76 = java.util.Arrays.copyOfRange(byteArray73, (int) (short) 1, 2);
        java.util.Arrays.sort(byteArray73);
        java.util.Arrays.sort(byteArray73, (int) (byte) 0, (int) (short) 1);
        java.util.Arrays.fill(byteArray73, (byte) 10);
        int int84 = java.util.Arrays.binarySearch(byteArray73, (byte) 1);
        int int86 = java.util.Arrays.binarySearch(byteArray73, (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill((java.lang.Object[]) intOfPrimitiveArray71, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.Byte");
        } catch (java.lang.ArrayStoreException e) {
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
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[10]");
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[0]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
    }

    @Test
    public void test7194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7194");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        int int7 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        int int9 = java.util.Arrays.binarySearch(floatArray3, (float) (short) 0);
        int int11 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.fill(floatArray3, (float) (byte) 100);
        java.util.Arrays.fill(floatArray3, (float) (-4));
        java.util.Arrays.sort(floatArray3, 0, 1);
        float[] floatArray20 = java.util.Arrays.copyOf(floatArray3, (int) (short) 0);
        float[] floatArray22 = java.util.Arrays.copyOf(floatArray3, (int) (short) 10);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-4.0, -4.0, -4.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-3) + "'", int7 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-3) + "'", int11 == (-3));
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[-4.0, -4.0, -4.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test7195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7195");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        double[] doubleArray14 = java.util.Arrays.copyOfRange(doubleArray11, 2, 100);
        double[] doubleArray16 = java.util.Arrays.copyOf(doubleArray11, (int) '#');
        java.util.Spliterator.OfDouble ofDouble17 = java.util.Arrays.spliterator(doubleArray11);
        java.util.Arrays.parallelSort(doubleArray11);
        java.util.Arrays.sort(doubleArray11);
        java.util.stream.DoubleStream doubleStream20 = java.util.Arrays.stream(doubleArray11);
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
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(ofDouble17);
        org.junit.Assert.assertNotNull(doubleStream20);
    }

    @Test
    public void test7196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7196");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong8 = java.util.Arrays.spliterator(longArray7);
        java.util.Arrays.parallelSort(longArray7);
        int int11 = java.util.Arrays.binarySearch(longArray7, (long) (byte) 1);
        java.util.Arrays.sort(longArray7);
        int int14 = java.util.Arrays.binarySearch(longArray7, (long) (short) 0);
        long[] longArray16 = java.util.Arrays.copyOf(longArray7, (int) '#');
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[0, 0, 0, 0, 0, 0, 0, 1, 3]");
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[0, 0, 0, 0, 0, 0, 0, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test7197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7197");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        byte[] byteArray9 = java.util.Arrays.copyOf(byteArray4, (int) '#');
        byte[] byteArray12 = java.util.Arrays.copyOfRange(byteArray4, 1, 7);
        int int14 = java.util.Arrays.binarySearch(byteArray4, (byte) 100);
        byte[] byteArray16 = java.util.Arrays.copyOf(byteArray4, 5);
        int int18 = java.util.Arrays.binarySearch(byteArray4, (byte) 100);
        java.util.Arrays.fill(byteArray4, (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray23 = java.util.Arrays.copyOfRange(byteArray4, (-36), 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2) + "'", int14 == (-2));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
    }

    @Test
    public void test7198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7198");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong8 = java.util.Arrays.spliterator(longArray7);
        long[] longArray10 = java.util.Arrays.copyOf(longArray7, (int) (byte) 1);
        long[] longArray12 = java.util.Arrays.copyOf(longArray7, 0);
        long[] longArray14 = java.util.Arrays.copyOf(longArray12, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java.util.Arrays.binarySearch(longArray12, (-5), 100, (long) 29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[3]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[]");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test7199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7199");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        java.util.Arrays.fill(booleanArray5, true);
        boolean[] booleanArray11 = java.util.Arrays.copyOf(booleanArray5, 15);
        boolean[] booleanArray13 = java.util.Arrays.copyOf(booleanArray5, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(booleanArray13, (int) (byte) 1, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(1) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[true, true, true, true, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[true, true, true, true, true, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[true, true, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
    }

    @Test
    public void test7200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7200");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.fill(intArray3, (-5));
        java.util.Arrays.fill(intArray3, 49);
        java.util.Arrays.fill(intArray3, (int) (byte) 0, 4, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfInt ofInt14 = java.util.Arrays.spliterator(intArray3, 1, (-30));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(1) > fence(-30)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, 35, 35, 35, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49]");
    }

    @Test
    public void test7201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7201");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.parallelSort(charArray4);
        java.util.Arrays.sort(charArray4);
        int int11 = java.util.Arrays.binarySearch(charArray4, 'a');
        java.util.Arrays.parallelSort(charArray4);
        java.util.Arrays.fill(charArray4, '#');
        java.util.Arrays.sort(charArray4);
        java.util.Arrays.parallelSort(charArray4);
        int int18 = java.util.Arrays.binarySearch(charArray4, '4');
        java.util.Arrays.fill(charArray4, '#');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-5) + "'", int18 == (-5));
    }

    @Test
    public void test7202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7202");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray4 = java.util.Arrays.copyOf((java.lang.Class<?>[]) classArray1, 3);
        int[] intArray10 = new int[] { 'a', 49, '#', (-100), 6 };
        int[][] intArray11 = new int[][] { intArray10 };
        java.util.stream.Stream<int[]> intArrayStream12 = java.util.Arrays.stream(intArray11);
        java.util.Spliterator<int[]> intArraySpliterator13 = java.util.Arrays.spliterator(intArray11);
        java.util.stream.Stream<int[]> intArrayStream16 = java.util.Arrays.stream(intArray11, 0, (int) (byte) 0);
        boolean boolean17 = java.util.Arrays.deepEquals((java.lang.Object[]) classArray1, (java.lang.Object[]) intArray11);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 49, 35, -100, 6]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArrayStream12);
        org.junit.Assert.assertNotNull(intArraySpliterator13);
        org.junit.Assert.assertNotNull(intArrayStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test7203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7203");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        java.util.Arrays.fill(shortArray0, (short) -1);
        short[] shortArray6 = java.util.Arrays.copyOf(shortArray0, 7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(shortArray6, (-100), (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test7204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7204");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        boolean[] booleanArray9 = java.util.Arrays.copyOf(booleanArray7, 2);
        boolean[] booleanArray12 = java.util.Arrays.copyOfRange(booleanArray7, (int) '4', (int) 'a');
        java.lang.String str13 = java.util.Arrays.toString(booleanArray7);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false]");
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]" + "'", str13, "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
    }

    @Test
    public void test7205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7205");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream5 = java.util.Arrays.stream(doubleArray4);
        java.util.Arrays.parallelSort(doubleArray4);
        java.util.Arrays.parallelSort(doubleArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(doubleArray4, 7, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(7) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
    }

    @Test
    public void test7206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7206");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.util.Arrays.sort(doubleArray4);
        java.util.Arrays.fill(doubleArray4, (double) 4);
        java.util.Arrays.fill(doubleArray4, (double) 6);
        java.util.function.IntToDoubleFunction intToDoubleFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(doubleArray4, intToDoubleFunction10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0]");
    }

    @Test
    public void test7207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7207");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 10, (byte) 0 };
        int int7 = java.util.Arrays.binarySearch(byteArray5, (byte) 0);
        java.util.Arrays.sort(byteArray5);
        java.util.Arrays.sort(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = java.util.Arrays.copyOf(byteArray5, (-96));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-4) + "'", int7 == (-4));
    }

    @Test
    public void test7208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7208");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.fill(intArray3, (int) (short) 1);
        java.util.Arrays.fill(intArray3, (int) ' ', (int) (short) 100, 0);
        int[] intArray12 = java.util.Arrays.copyOfRange(intArray3, 0, (int) '4');
        java.util.Arrays.fill(intArray12, (-3));
        java.util.Spliterator.OfInt ofInt17 = java.util.Arrays.spliterator(intArray12, 7, (int) '4');
        java.util.function.IntBinaryOperator intBinaryOperator20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(intArray12, (int) (byte) 1, 0, intBinaryOperator20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3]");
        org.junit.Assert.assertNotNull(ofInt17);
    }

    @Test
    public void test7209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7209");
        char[] charArray3 = new char[] { '#', 'a', '#' };
        char[] charArray5 = java.util.Arrays.copyOf(charArray3, 100);
        java.util.Arrays.sort(charArray3);
        java.util.Arrays.parallelSort(charArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = java.util.Arrays.binarySearch(charArray3, 15, (-11), '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(15) > toIndex(-11)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "##a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "##a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, #, a]");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a#\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a#\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a, #, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test7210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7210");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        long[] longArray9 = java.util.Arrays.copyOf(longArray3, 0);
        java.util.Arrays.sort(longArray3);
        long[] longArray13 = java.util.Arrays.copyOfRange(longArray3, 0, 7);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[1, 3, 100]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[1, 3, 100, 0, 0, 0, 0]");
    }

    @Test
    public void test7211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7211");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.sort(intArray3);
        int int10 = java.util.Arrays.binarySearch(intArray3, 5);
        java.util.Spliterator.OfInt ofInt11 = java.util.Arrays.spliterator(intArray3);
        java.util.function.IntBinaryOperator intBinaryOperator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(intArray3, intBinaryOperator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(ofInt11);
    }

    @Test
    public void test7212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7212");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 100 };
        java.util.Arrays.sort(byteArray2);
        int int7 = java.util.Arrays.binarySearch(byteArray2, (int) (byte) 0, 0, (byte) 1);
        java.util.Arrays.fill(byteArray2, (byte) -1);
        int int11 = java.util.Arrays.binarySearch(byteArray2, (byte) 100);
        java.util.Arrays.sort(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(byteArray2, 4, (-33));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(4) > toIndex(-33)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-3) + "'", int11 == (-3));
    }

    @Test
    public void test7213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7213");
        float[] floatArray1 = new float[] { (-1L) };
        int int3 = java.util.Arrays.binarySearch(floatArray1, (float) (short) -1);
        java.util.Arrays.sort(floatArray1);
        float[] floatArray6 = java.util.Arrays.copyOf(floatArray1, (int) (short) 1);
        java.util.Arrays.fill(floatArray1, (float) 17);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[17.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0]");
    }

    @Test
    public void test7214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7214");
        char[] charArray3 = new char[] { ' ', '4', 'a' };
        char[] charArray7 = new char[] { ' ', '4', 'a' };
        char[][] charArray8 = new char[][] { charArray3, charArray7 };
        java.util.stream.Stream<char[]> charArrayStream9 = java.util.Arrays.stream(charArray8);
        java.util.List<char[]> charArrayList10 = java.util.Arrays.asList(charArray8);
        short[] shortArray19 = new short[] { (byte) -1, (short) 100, (byte) 1, (short) 0, (byte) 100, (byte) 100 };
        short[] shortArray21 = java.util.Arrays.copyOf(shortArray19, (int) (byte) 0);
        java.util.Arrays.parallelSort(shortArray19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill((java.lang.Object[]) charArray8, (-9), (-10), (java.lang.Object) shortArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(-9) > toIndex(-10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " 4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " 4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , 4, a]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " 4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " 4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , 4, a]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArrayStream9);
        org.junit.Assert.assertNotNull(charArrayList10);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[-1, 0, 1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[]");
    }

    @Test
    public void test7215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7215");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        java.util.Arrays.parallelSort(longArray3);
        int int11 = java.util.Arrays.binarySearch(longArray3, (long) 2);
        java.util.Arrays.fill(longArray3, (long) (-5));
        int int15 = java.util.Arrays.binarySearch(longArray3, (long) (-2));
        java.util.Arrays.parallelSort(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream21 = java.util.Arrays.stream(longArray3, 0, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
    }

    @Test
    public void test7216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7216");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) 100);
        short[] shortArray6 = java.util.Arrays.copyOf(shortArray0, (int) (short) 0);
        short[] shortArray8 = java.util.Arrays.copyOf(shortArray0, 17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(shortArray0, (-18), (-99));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(-18) > toIndex(-99)");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[]");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test7217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7217");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int[] intArray11 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        int[] intArray13 = java.util.Arrays.copyOf(intArray3, 1);
        java.util.Arrays.parallelSort(intArray3, 7, (int) (byte) 100);
        java.util.Arrays.fill(intArray3, (int) (byte) -1);
        java.util.Arrays.fill(intArray3, 6);
        int int22 = java.util.Arrays.binarySearch(intArray3, (-8));
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[3]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test7218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7218");
        float[] floatArray1 = new float[] { (-1L) };
        int int3 = java.util.Arrays.binarySearch(floatArray1, (float) (short) -1);
        java.util.Arrays.sort(floatArray1);
        java.util.Arrays.fill(floatArray1, (float) 2);
        java.util.Arrays.fill(floatArray1, (float) (byte) 100);
        float[] floatArray10 = java.util.Arrays.copyOf(floatArray1, (int) (byte) 1);
        float[] floatArray12 = new float[] { (-1L) };
        int int14 = java.util.Arrays.binarySearch(floatArray12, (float) (short) -1);
        java.util.Arrays.sort(floatArray12);
        float[] floatArray17 = java.util.Arrays.copyOf(floatArray12, (int) (short) 1);
        java.util.Arrays.parallelSort(floatArray12);
        boolean boolean19 = java.util.Arrays.equals(floatArray10, floatArray12);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[100.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test7219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7219");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        java.util.Spliterator.OfDouble ofDouble10 = java.util.Arrays.spliterator(doubleArray7, 10, (int) '#');
        int int12 = java.util.Arrays.binarySearch(doubleArray7, (double) (-1));
        int int14 = java.util.Arrays.binarySearch(doubleArray7, (double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream17 = java.util.Arrays.stream(doubleArray7, 17, 100);
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
        org.junit.Assert.assertNotNull(ofDouble10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-96) + "'", int14 == (-96));
    }

    @Test
    public void test7220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7220");
        java.lang.Object[] objArray0 = null;
        float[] floatArray4 = new float[] { (-1), (short) -1, '4' };
        int int6 = java.util.Arrays.binarySearch(floatArray4, 0.0f);
        java.util.Arrays.parallelSort(floatArray4);
        java.util.Arrays.fill(floatArray4, (float) ' ');
        java.util.Arrays.fill(floatArray4, 0, 0, (float) (-4));
        int int15 = java.util.Arrays.binarySearch(floatArray4, 100.0f);
        java.util.Arrays.fill(floatArray4, (float) (byte) 100);
        java.util.Arrays.sort(floatArray4);
        java.util.Arrays.parallelSort(floatArray4);
        float[] floatArray21 = java.util.Arrays.copyOf(floatArray4, 17);
        java.util.Arrays.sort(floatArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = java.util.Arrays.binarySearch(objArray0, (java.lang.Object) floatArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[100.0, 100.0, 100.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test7221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7221");
        long[] longArray0 = new long[] {};
        int int2 = java.util.Arrays.binarySearch(longArray0, (long) '#');
        java.util.Arrays.sort(longArray0);
        java.util.Arrays.fill(longArray0, (long) (-5));
        java.util.Arrays.parallelSort(longArray0);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7222");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int[] intArray11 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        java.util.Arrays.sort(intArray11);
        int[] intArray15 = java.util.Arrays.copyOfRange(intArray11, 0, 100);
        int int17 = java.util.Arrays.binarySearch(intArray11, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream20 = java.util.Arrays.stream(intArray11, (-32), 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -32");
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
    public void test7223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7223");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        double[] doubleArray14 = java.util.Arrays.copyOfRange(doubleArray11, 2, 100);
        java.util.Arrays.sort(doubleArray14);
        int int17 = java.util.Arrays.binarySearch(doubleArray14, (double) 100);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-99) + "'", int17 == (-99));
    }

    @Test
    public void test7224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7224");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray1);
        java.util.Arrays.fill(intArray1, 5);
        java.util.Arrays.fill(intArray1, (-3));
        java.util.Arrays.parallelSort(intArray1);
        int[] intArray11 = java.util.Arrays.copyOf(intArray1, 3);
        java.util.Spliterator.OfInt ofInt12 = java.util.Arrays.spliterator(intArray1);
        java.util.function.IntUnaryOperator intUnaryOperator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(intArray1, intUnaryOperator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-3]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-3, 0, 0]");
        org.junit.Assert.assertNotNull(ofInt12);
    }

    @Test
    public void test7225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7225");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        int[] intArray9 = java.util.Arrays.copyOf(intArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
    }

    @Test
    public void test7226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7226");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        java.util.stream.DoubleStream doubleStream12 = java.util.Arrays.stream(doubleArray9);
        int int14 = java.util.Arrays.binarySearch(doubleArray9, (double) (-8));
        java.util.function.IntToDoubleFunction intToDoubleFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(doubleArray9, intToDoubleFunction15);
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
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test7227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7227");
        short[] shortArray2 = new short[] { (short) 10, (short) 1 };
        java.util.Arrays.fill(shortArray2, (short) (byte) 1);
        java.util.Arrays.parallelSort(shortArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(shortArray2, (-100), 98, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[1, 1]");
    }

    @Test
    public void test7228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7228");
        float[] floatArray1 = new float[] { (-1L) };
        int int3 = java.util.Arrays.binarySearch(floatArray1, (float) (short) -1);
        java.util.Arrays.sort(floatArray1);
        float[] floatArray6 = java.util.Arrays.copyOf(floatArray1, 5);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray9 = java.util.Arrays.copyOfRange(floatArray1, (int) (short) 10, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10 > -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test7229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7229");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray4, '#');
        char[] charArray11 = java.util.Arrays.copyOf(charArray4, 0);
        int int13 = java.util.Arrays.binarySearch(charArray11, '4');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test7230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7230");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        double[] doubleArray14 = java.util.Arrays.copyOfRange(doubleArray11, 2, 100);
        double[] doubleArray16 = java.util.Arrays.copyOf(doubleArray11, (int) '#');
        java.util.stream.DoubleStream doubleStream17 = java.util.Arrays.stream(doubleArray11);
        double[] doubleArray19 = java.util.Arrays.copyOf(doubleArray11, 17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfDouble ofDouble22 = java.util.Arrays.spliterator(doubleArray19, (-10), 49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleStream17);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test7231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7231");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.fill(longArray3, (long) '4');
        java.util.Arrays.parallelSort(longArray3);
        java.util.stream.LongStream longStream10 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.parallelSort(longArray3);
        java.util.Arrays.sort(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[52, 52, 52]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream10);
    }

    @Test
    public void test7232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7232");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.fill(intArray3, (int) (short) 1);
        java.util.Arrays.fill(intArray3, (int) ' ', (int) (short) 100, 0);
        java.util.Spliterator.OfInt ofInt12 = java.util.Arrays.spliterator(intArray3, 4, 100);
        int int14 = java.util.Arrays.binarySearch(intArray3, (-9));
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofInt12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test7233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7233");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) 100);
        short[] shortArray6 = java.util.Arrays.copyOf(shortArray0, (int) '#');
        java.util.Arrays.fill(shortArray0, (short) 10);
        java.util.Arrays.parallelSort(shortArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(shortArray0, (-71), (-5), (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -71");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test7234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7234");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray3, (int) (byte) 0, (int) (byte) 1);
        java.util.Spliterator.OfInt ofInt7 = java.util.Arrays.spliterator(intArray3);
        java.util.stream.IntStream intStream8 = java.util.Arrays.stream(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = java.util.Arrays.copyOfRange(intArray3, 30, (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 30 > -101");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofInt7);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test7235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7235");
        long[] longArray1 = new long[] { ' ' };
        java.util.stream.LongStream longStream2 = java.util.Arrays.stream(longArray1);
        java.util.Arrays.fill(longArray1, (long) (-101));
        java.util.Spliterator.OfLong ofLong7 = java.util.Arrays.spliterator(longArray1, 0, (int) (short) 1);
        java.util.function.LongBinaryOperator longBinaryOperator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(longArray1, 49, 49, longBinaryOperator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[-101]");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(ofLong7);
    }

    @Test
    public void test7236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7236");
        java.util.Spliterator.OfDouble[][][][] ofDoubleArray0 = new java.util.Spliterator.OfDouble[][][][] {};
        java.util.Spliterator<java.util.Spliterator.OfDouble[][][]> ofDoubleArraySpliterator1 = java.util.Arrays.spliterator(ofDoubleArray0);
        org.junit.Assert.assertNotNull(ofDoubleArray0);
        org.junit.Assert.assertNotNull(ofDoubleArraySpliterator1);
    }

    @Test
    public void test7237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7237");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        java.util.Arrays.fill(shortArray0, (short) -1);
        java.util.Arrays.fill(shortArray0, (short) 10);
        java.util.Arrays.fill(shortArray0, (short) 10);
        java.util.Arrays.sort(shortArray0);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray12 = java.util.Arrays.copyOfRange(shortArray0, 4, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7238");
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
        java.util.stream.Stream<double[][]> doubleArrayStream92 = java.util.Arrays.stream(doubleArray90);
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
        org.junit.Assert.assertNotNull(doubleArrayStream92);
    }

    @Test
    public void test7239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7239");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        int[] intArray9 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        java.util.stream.IntStream intStream10 = java.util.Arrays.stream(intArray9);
        java.util.function.IntUnaryOperator intUnaryOperator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSetAll(intArray9, intUnaryOperator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(intStream10);
    }

    @Test
    public void test7240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7240");
        long[] longArray1 = new long[] { ' ' };
        java.util.stream.LongStream longStream2 = java.util.Arrays.stream(longArray1);
        java.util.Arrays.fill(longArray1, (long) (-101));
        java.util.stream.LongStream longStream5 = java.util.Arrays.stream(longArray1);
        java.util.Arrays.fill(longArray1, (long) (short) 1);
        java.util.stream.LongStream longStream8 = java.util.Arrays.stream(longArray1);
        java.util.Arrays.sort(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[1]");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test7241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7241");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(intArray3, (int) (short) 1, (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(1) > toIndex(-101)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
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
    }

    @Test
    public void test7242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7242");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, 0L);
        java.util.Arrays.parallelSort(longArray3);
        int int9 = java.util.Arrays.binarySearch(longArray3, 100L);
        java.util.stream.LongStream longStream10 = java.util.Arrays.stream(longArray3);
        long[] longArray12 = java.util.Arrays.copyOf(longArray3, (int) '4');
        int int14 = java.util.Arrays.binarySearch(longArray12, (long) 5);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-53) + "'", int14 == (-53));
    }

    @Test
    public void test7243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7243");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        float[] floatArray7 = java.util.Arrays.copyOf(floatArray3, (int) ' ');
        float[] floatArray9 = java.util.Arrays.copyOf(floatArray7, 49);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, -1.0, 52.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[-1.0, -1.0, 52.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test7244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7244");
        long[] longArray1 = new long[] { ' ' };
        java.util.stream.LongStream longStream2 = java.util.Arrays.stream(longArray1);
        java.util.Arrays.fill(longArray1, (long) (-101));
        java.util.stream.LongStream longStream5 = java.util.Arrays.stream(longArray1);
        java.util.Arrays.parallelSort(longArray1);
        int int8 = java.util.Arrays.binarySearch(longArray1, (long) (short) -1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[-101]");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
    }

    @Test
    public void test7245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7245");
        long[][][][] longArray0 = new long[][][][] {};
        long[][][][] longArray2 = java.util.Arrays.copyOf(longArray0, 4);
        double[] doubleArray7 = new double[] { (short) 10, 10.0f };
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray7, (int) (short) 100);
        double[] doubleArray12 = java.util.Arrays.copyOfRange(doubleArray9, 2, (int) 'a');
        java.util.Spliterator.OfDouble ofDouble15 = java.util.Arrays.spliterator(doubleArray12, 10, (int) '#');
        int int17 = java.util.Arrays.binarySearch(doubleArray12, (double) (-1));
        java.util.Arrays.sort(doubleArray12);
        int int20 = java.util.Arrays.binarySearch(doubleArray12, (double) 6);
        double[] doubleArray22 = java.util.Arrays.copyOf(doubleArray12, (int) ' ');
        java.util.Arrays.fill(doubleArray12, (double) (short) 1);
        java.util.stream.DoubleStream doubleStream25 = java.util.Arrays.stream(doubleArray12);
        java.util.Arrays.fill(doubleArray12, (double) 49);
        java.util.stream.DoubleStream doubleStream28 = java.util.Arrays.stream(doubleArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = java.util.Arrays.binarySearch((java.lang.Object[]) longArray2, (int) ' ', (-33), (java.lang.Object) doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(32) > toIndex(-33)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0]");
        org.junit.Assert.assertNotNull(ofDouble15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-96) + "'", int20 == (-96));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleStream25);
        org.junit.Assert.assertNotNull(doubleStream28);
    }

    @Test
    public void test7246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7246");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) 100);
        short[] shortArray6 = java.util.Arrays.copyOf(shortArray0, (int) (short) 0);
        java.util.Arrays.parallelSort(shortArray0);
        java.util.Arrays.fill(shortArray0, (short) (byte) 1);
        short[] shortArray10 = new short[] {};
        int int12 = java.util.Arrays.binarySearch(shortArray10, (short) 1);
        int int14 = java.util.Arrays.binarySearch(shortArray10, (short) 100);
        short[] shortArray16 = java.util.Arrays.copyOf(shortArray10, (int) (short) 0);
        short[] shortArray18 = java.util.Arrays.copyOf(shortArray10, 17);
        boolean boolean19 = java.util.Arrays.equals(shortArray0, shortArray18);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[]");
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[]");
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test7247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7247");
        int[] intArray6 = new int[] { '4', (short) 0, '4', (byte) 100, (-3), (byte) -1 };
        java.util.Arrays.fill(intArray6, (int) (byte) 10);
        java.util.stream.IntStream intStream9 = java.util.Arrays.stream(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = java.util.Arrays.copyOfRange(intArray6, 29, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 29 > -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10, 10, 10, 10, 10]");
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test7248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7248");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.sort(byteArray4);
        byte[] byteArray8 = java.util.Arrays.copyOf(byteArray4, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = java.util.Arrays.copyOfRange(byteArray8, 98, (-50));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 98 > -50");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test7249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7249");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong8 = java.util.Arrays.spliterator(longArray7);
        java.util.Arrays.parallelSort(longArray7);
        int int13 = java.util.Arrays.binarySearch(longArray7, 1, 4, (long) 3);
        long[] longArray15 = java.util.Arrays.copyOf(longArray7, (int) 'a');
        java.util.function.LongBinaryOperator longBinaryOperator16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(longArray7, longBinaryOperator16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[0, 0, 0, 0, 0, 0, 0, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test7250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7250");
        short[] shortArray6 = new short[] { (byte) -1, (byte) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
        java.util.Arrays.parallelSort(shortArray6);
        java.util.Arrays.sort(shortArray6);
        java.util.Arrays.parallelSort(shortArray6);
        short[] shortArray12 = java.util.Arrays.copyOfRange(shortArray6, 1, (int) 'a');
        java.util.Arrays.fill(shortArray12, (short) 100);
        java.util.Arrays.parallelSort(shortArray12);
        java.util.Arrays.fill(shortArray12, (short) 0);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test7251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7251");
        float[] floatArray1 = new float[] { (-1L) };
        int int3 = java.util.Arrays.binarySearch(floatArray1, (float) (short) -1);
        java.util.Arrays.sort(floatArray1);
        java.util.Arrays.fill(floatArray1, 0.0f);
        java.util.Arrays.parallelSort(floatArray1);
        java.util.Arrays.parallelSort(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(floatArray1, (int) (short) 10, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 15");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test7252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7252");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong8 = java.util.Arrays.spliterator(longArray7);
        long[] longArray10 = java.util.Arrays.copyOf(longArray7, (int) (byte) 1);
        long[] longArray12 = java.util.Arrays.copyOf(longArray7, 0);
        java.util.Arrays.fill(longArray12, (long) 17);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java.util.Arrays.binarySearch(longArray12, 0, 7, (long) (-99));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[3]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[]");
    }

    @Test
    public void test7253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7253");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) 100);
        short[] shortArray6 = java.util.Arrays.copyOf(shortArray0, (int) (short) 0);
        int int10 = java.util.Arrays.binarySearch(shortArray6, (int) (short) 0, (int) (byte) 0, (short) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(shortArray6, 100, (int) (short) 0, (short) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(0)");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test7254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7254");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        int[] intArray9 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray9);
        int[] intArray12 = java.util.Arrays.copyOf(intArray9, (int) (byte) 10);
        java.util.Arrays.parallelSort(intArray9);
        int[] intArray15 = new int[] { 100 };
        int[] intArray17 = java.util.Arrays.copyOf(intArray15, (int) (short) 100);
        int int21 = java.util.Arrays.binarySearch(intArray17, (int) (byte) 1, 10, 0);
        java.util.Spliterator.OfInt ofInt22 = java.util.Arrays.spliterator(intArray17);
        java.util.Arrays.parallelSort(intArray17, 0, 7);
        int int27 = java.util.Arrays.binarySearch(intArray17, 3);
        boolean boolean28 = java.util.Arrays.equals(intArray9, intArray17);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(ofInt22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-101) + "'", int27 == (-101));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test7255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7255");
        java.lang.String[][][][] strArray0 = new java.lang.String[][][][] {};
        java.lang.String[][][][] strArray1 = new java.lang.String[][][][] {};
        java.lang.String[][][][] strArray2 = new java.lang.String[][][][] {};
        java.lang.String[][][][] strArray3 = new java.lang.String[][][][] {};
        java.lang.String[][][][] strArray4 = new java.lang.String[][][][] {};
        java.lang.String[][][][][] strArray5 = new java.lang.String[][][][][] { strArray0, strArray1, strArray2, strArray3, strArray4 };
        java.util.Spliterator<java.lang.String[][][][]> strArraySpliterator6 = java.util.Arrays.spliterator(strArray5);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArraySpliterator6);
    }

    @Test
    public void test7256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7256");
        char[] charArray3 = new char[] { '#', 'a', '#' };
        char[] charArray5 = java.util.Arrays.copyOf(charArray3, 100);
        java.util.Arrays.sort(charArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(charArray3, 1, (-33));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(1) > toIndex(-33)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "##a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "##a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, #, a]");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a#\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a#\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a, #, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test7257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7257");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        boolean[] booleanArray10 = java.util.Arrays.copyOfRange(booleanArray7, (int) (short) 0, (int) '#');
        java.util.Arrays.fill(booleanArray7, true);
        boolean[] booleanArray14 = java.util.Arrays.copyOf(booleanArray7, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(booleanArray7, 17, 5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(17) > toIndex(5)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[]");
    }

    @Test
    public void test7258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7258");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        int[][] intArray9 = new int[][] { intArray5, intArray6, intArray7, intArray8 };
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        int[][] intArray14 = new int[][] { intArray10, intArray11, intArray12, intArray13 };
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        int[][] intArray19 = new int[][] { intArray15, intArray16, intArray17, intArray18 };
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        int[][] intArray24 = new int[][] { intArray20, intArray21, intArray22, intArray23 };
        int[][][] intArray25 = new int[][][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        int[][][] intArray27 = java.util.Arrays.copyOf(intArray25, (int) (short) 1);
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream31 = java.util.Arrays.stream(charSequenceArray30);
        java.lang.CharSequence[] charSequenceArray34 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream35 = java.util.Arrays.stream(charSequenceArray34);
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream39 = java.util.Arrays.stream(charSequenceArray38);
        java.lang.CharSequence[] charSequenceArray42 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream43 = java.util.Arrays.stream(charSequenceArray42);
        java.lang.CharSequence[] charSequenceArray46 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream47 = java.util.Arrays.stream(charSequenceArray46);
        java.util.stream.Stream[] streamArray49 = new java.util.stream.Stream[5];
        @SuppressWarnings("unchecked")
        java.util.stream.Stream<java.lang.CharSequence>[] charSequenceStreamArray50 = (java.util.stream.Stream<java.lang.CharSequence>[]) streamArray49;
        charSequenceStreamArray50[0] = charSequenceStream31;
        charSequenceStreamArray50[1] = charSequenceStream35;
        charSequenceStreamArray50[2] = charSequenceStream39;
        charSequenceStreamArray50[3] = charSequenceStream43;
        charSequenceStreamArray50[4] = charSequenceStream47;
        java.util.List<java.util.stream.Stream<java.lang.CharSequence>> charSequenceStreamList61 = java.util.Arrays.asList(charSequenceStreamArray50);
        java.util.stream.Stream<java.lang.AutoCloseable> autoCloseableStream62 = java.util.Arrays.stream((java.lang.AutoCloseable[]) charSequenceStreamArray50);
        java.util.stream.Stream<java.lang.CharSequence>[] charSequenceStreamArray64 = java.util.Arrays.copyOf(charSequenceStreamArray50, 3);
        java.util.List<java.util.stream.BaseStream<java.lang.CharSequence, java.util.stream.Stream<java.lang.CharSequence>>> charSequenceBaseStreamList65 = java.util.Arrays.asList((java.util.stream.BaseStream<java.lang.CharSequence, java.util.stream.Stream<java.lang.CharSequence>>[]) charSequenceStreamArray64);
        // The following exception was thrown during execution in test generation
        try {
            int int66 = java.util.Arrays.binarySearch((java.lang.Object[]) intArray27, (java.lang.Object) charSequenceStreamArray64);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [[I cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(charSequenceArray30);
        org.junit.Assert.assertNotNull(charSequenceStream31);
        org.junit.Assert.assertNotNull(charSequenceArray34);
        org.junit.Assert.assertNotNull(charSequenceStream35);
        org.junit.Assert.assertNotNull(charSequenceArray38);
        org.junit.Assert.assertNotNull(charSequenceStream39);
        org.junit.Assert.assertNotNull(charSequenceArray42);
        org.junit.Assert.assertNotNull(charSequenceStream43);
        org.junit.Assert.assertNotNull(charSequenceArray46);
        org.junit.Assert.assertNotNull(charSequenceStream47);
        org.junit.Assert.assertNotNull(streamArray49);
        org.junit.Assert.assertNotNull(charSequenceStreamArray50);
        org.junit.Assert.assertNotNull(charSequenceStreamList61);
        org.junit.Assert.assertNotNull(autoCloseableStream62);
        org.junit.Assert.assertNotNull(charSequenceStreamArray64);
        org.junit.Assert.assertNotNull(charSequenceBaseStreamList65);
    }

    @Test
    public void test7259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7259");
        java.util.stream.DoubleStream[][] doubleStreamArray0 = new java.util.stream.DoubleStream[][] {};
        java.util.stream.Stream<java.util.stream.DoubleStream[]> doubleStreamArrayStream1 = java.util.Arrays.stream(doubleStreamArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<java.util.stream.DoubleStream[]> doubleStreamArrayStream4 = java.util.Arrays.stream(doubleStreamArray0, (-99), 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -99");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStreamArray0);
        org.junit.Assert.assertNotNull(doubleStreamArrayStream1);
    }

    @Test
    public void test7260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7260");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        int int8 = java.util.Arrays.binarySearch(byteArray4, (byte) 10);
        byte[] byteArray10 = java.util.Arrays.copyOf(byteArray4, (int) (short) 1);
        byte[] byteArray12 = java.util.Arrays.copyOf(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(byteArray4, (-7), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
    }

    @Test
    public void test7261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7261");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        int int8 = java.util.Arrays.binarySearch(byteArray4, (byte) 10);
        byte[] byteArray10 = java.util.Arrays.copyOf(byteArray4, (int) (short) 1);
        byte[] byteArray12 = java.util.Arrays.copyOf(byteArray4, (int) (short) 0);
        int int14 = java.util.Arrays.binarySearch(byteArray4, (byte) 100);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2) + "'", int14 == (-2));
    }

    @Test
    public void test7262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7262");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray4, '#');
        char[] charArray11 = java.util.Arrays.copyOf(charArray4, (int) (byte) 1);
        char[] charArray13 = java.util.Arrays.copyOf(charArray4, 5);
        java.util.Arrays.fill(charArray13, 'a');
        java.util.Arrays.sort(charArray13);
        java.util.Arrays.fill(charArray13, '#');
        int int20 = java.util.Arrays.binarySearch(charArray13, ' ');
        java.util.Arrays.parallelSort(charArray13);
        int int23 = java.util.Arrays.binarySearch(charArray13, 'a');
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-6) + "'", int23 == (-6));
    }

    @Test
    public void test7263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7263");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        java.util.Arrays.sort(doubleArray4);
        java.util.Arrays.fill(doubleArray4, (double) (short) 100);
        double[] doubleArray14 = new double[] { (short) 10, 10.0f };
        double[] doubleArray16 = java.util.Arrays.copyOf(doubleArray14, (int) (short) 100);
        double[] doubleArray19 = java.util.Arrays.copyOfRange(doubleArray16, 2, (int) 'a');
        double[] doubleArray21 = java.util.Arrays.copyOf(doubleArray16, (int) 'a');
        java.util.Spliterator.OfDouble ofDouble22 = java.util.Arrays.spliterator(doubleArray21);
        java.util.Arrays.parallelSort(doubleArray21);
        java.util.stream.DoubleStream doubleStream24 = java.util.Arrays.stream(doubleArray21);
        boolean boolean25 = java.util.Arrays.equals(doubleArray4, doubleArray21);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(ofDouble22);
        org.junit.Assert.assertNotNull(doubleStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test7264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7264");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        boolean[] booleanArray9 = java.util.Arrays.copyOf(booleanArray7, 2);
        java.util.Arrays.fill(booleanArray7, true);
        boolean[] booleanArray13 = java.util.Arrays.copyOf(booleanArray7, (int) (byte) 0);
        java.util.Arrays.fill(booleanArray7, true);
        java.util.Arrays.fill(booleanArray7, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray20 = java.util.Arrays.copyOfRange(booleanArray7, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true]");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[]");
    }

    @Test
    public void test7265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7265");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        int[] intArray9 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray9);
        int[] intArray12 = java.util.Arrays.copyOf(intArray9, (int) (byte) 10);
        java.util.Spliterator.OfInt ofInt13 = java.util.Arrays.spliterator(intArray9);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofInt13);
    }

    @Test
    public void test7266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7266");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray4, '#');
        char[] charArray11 = java.util.Arrays.copyOf(charArray4, (int) (byte) 1);
        char[] charArray13 = java.util.Arrays.copyOf(charArray4, 5);
        java.util.Arrays.fill(charArray13, 'a');
        java.util.Arrays.sort(charArray13);
        java.util.Arrays.fill(charArray13, '#');
        java.util.Arrays.fill(charArray13, ' ');
        char[] charArray22 = java.util.Arrays.copyOf(charArray13, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray25 = java.util.Arrays.copyOfRange(charArray13, 4, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 4 > -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "     ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "     ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ ,  ,  ,  ,  ]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[ ]");
    }

    @Test
    public void test7267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7267");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream3 = java.util.Arrays.stream(charSequenceArray2);
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream7 = java.util.Arrays.stream(charSequenceArray6);
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream11 = java.util.Arrays.stream(charSequenceArray10);
        java.util.stream.BaseStream[] baseStreamArray13 = new java.util.stream.BaseStream[3];
        @SuppressWarnings("unchecked")
        java.util.stream.BaseStream<java.lang.CharSequence, java.util.stream.Stream<java.lang.CharSequence>>[] charSequenceBaseStreamArray14 = (java.util.stream.BaseStream<java.lang.CharSequence, java.util.stream.Stream<java.lang.CharSequence>>[]) baseStreamArray13;
        charSequenceBaseStreamArray14[0] = charSequenceStream3;
        charSequenceBaseStreamArray14[1] = charSequenceStream7;
        charSequenceBaseStreamArray14[2] = charSequenceStream11;
        java.util.stream.Stream<java.util.stream.BaseStream<java.lang.CharSequence, java.util.stream.Stream<java.lang.CharSequence>>> charSequenceBaseStreamStream23 = java.util.Arrays.stream(charSequenceBaseStreamArray14, (int) (byte) 0, (int) (byte) 0);
        java.lang.AutoCloseable[] autoCloseableArray26 = java.util.Arrays.copyOfRange((java.lang.AutoCloseable[]) charSequenceBaseStreamArray14, (int) (short) 0, 7);
        java.lang.String str27 = java.util.Arrays.toString((java.lang.Object[]) charSequenceBaseStreamArray14);
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertNotNull(charSequenceStream3);
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertNotNull(charSequenceStream7);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(charSequenceStream11);
        org.junit.Assert.assertNotNull(baseStreamArray13);
        org.junit.Assert.assertNotNull(charSequenceBaseStreamArray14);
        org.junit.Assert.assertNotNull(charSequenceBaseStreamStream23);
        org.junit.Assert.assertNotNull(autoCloseableArray26);
    }

    @Test
    public void test7268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7268");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        java.util.Arrays.fill(doubleArray4, (double) 10);
        java.util.Arrays.sort(doubleArray4);
        int int14 = java.util.Arrays.binarySearch(doubleArray4, (double) (-53));
        int int18 = java.util.Arrays.binarySearch(doubleArray4, 1, 2, (double) 3);
        double[] doubleArray20 = java.util.Arrays.copyOf(doubleArray4, 4);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 10.0, 10.0, 10.0]");
    }

    @Test
    public void test7269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7269");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.sort(intArray3);
        int[] intArray10 = java.util.Arrays.copyOf(intArray3, 17);
        java.util.Spliterator.OfInt ofInt13 = java.util.Arrays.spliterator(intArray3, 3, 30);
        java.util.Spliterator.OfInt ofInt16 = java.util.Arrays.spliterator(intArray3, 0, 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofInt13);
        org.junit.Assert.assertNotNull(ofInt16);
    }

    @Test
    public void test7270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7270");
        boolean[] booleanArray2 = new boolean[] { true, true };
        java.util.Arrays.fill(booleanArray2, false);
        boolean[] booleanArray6 = java.util.Arrays.copyOf(booleanArray2, 0);
        java.util.Arrays.fill(booleanArray2, false);
        boolean[] booleanArray10 = java.util.Arrays.copyOf(booleanArray2, 0);
        boolean[] booleanArray16 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray18 = java.util.Arrays.copyOf(booleanArray16, (int) '4');
        boolean[] booleanArray20 = java.util.Arrays.copyOf(booleanArray18, 2);
        java.util.Arrays.fill(booleanArray18, true);
        boolean[] booleanArray24 = java.util.Arrays.copyOf(booleanArray18, (int) (byte) 0);
        boolean boolean25 = java.util.Arrays.equals(booleanArray10, booleanArray24);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[false, false]");
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[]");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true]");
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[false, false]");
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test7271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7271");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        java.util.Spliterator.OfDouble ofDouble10 = java.util.Arrays.spliterator(doubleArray9);
        double[] doubleArray12 = java.util.Arrays.copyOf(doubleArray9, 0);
        java.util.Arrays.parallelSort(doubleArray12);
        java.util.Arrays.sort(doubleArray12);
        java.util.function.IntToDoubleFunction intToDoubleFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSetAll(doubleArray12, intToDoubleFunction15);
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
        org.junit.Assert.assertNotNull(ofDouble10);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
    }

    @Test
    public void test7272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7272");
        long[] longArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(longArray0, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7273");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        long[] longArray11 = java.util.Arrays.copyOfRange(longArray3, 0, (int) (byte) 0);
        java.util.Spliterator.OfLong ofLong12 = java.util.Arrays.spliterator(longArray11);
        long[] longArray14 = java.util.Arrays.copyOf(longArray11, 10);
        java.util.Arrays.sort(longArray14);
        java.util.Arrays.fill(longArray14, (long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = java.util.Arrays.binarySearch(longArray14, 10, 2, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(10) > toIndex(2)");
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
        org.junit.Assert.assertNotNull(ofLong12);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[-1, -1, -1, -1, -1, -1, -1, -1, -1, -1]");
    }

    @Test
    public void test7274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7274");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Spliterator.OfInt ofInt8 = java.util.Arrays.spliterator(intArray3);
        java.util.Arrays.parallelSort(intArray3, 0, 7);
        int int13 = java.util.Arrays.binarySearch(intArray3, 3);
        int int17 = java.util.Arrays.binarySearch(intArray3, 0, (int) '#', (int) (short) 100);
        java.util.Arrays.sort(intArray3);
        java.util.stream.IntStream intStream21 = java.util.Arrays.stream(intArray3, 17, 99);
        java.util.Spliterator.OfInt ofInt22 = java.util.Arrays.spliterator(intArray3);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(ofInt8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-101) + "'", int13 == (-101));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-36) + "'", int17 == (-36));
        org.junit.Assert.assertNotNull(intStream21);
        org.junit.Assert.assertNotNull(ofInt22);
    }

    @Test
    public void test7275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7275");
        java.util.stream.LongStream[][] longStreamArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator<java.util.stream.LongStream[]> longStreamArraySpliterator3 = java.util.Arrays.spliterator(longStreamArray0, 4, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7276");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) (byte) 100);
        java.util.Arrays.fill(shortArray0, (short) 0);
        java.util.Arrays.fill(shortArray0, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(shortArray0, 6, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(6) > toIndex(-8)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test7277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7277");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Spliterator.OfInt ofInt8 = java.util.Arrays.spliterator(intArray3);
        java.util.Arrays.parallelSort(intArray3, 0, 7);
        int int13 = java.util.Arrays.binarySearch(intArray3, 3);
        java.util.stream.IntStream intStream14 = java.util.Arrays.stream(intArray3);
        int int16 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1);
        int[] intArray18 = java.util.Arrays.copyOf(intArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(intArray18, (-9), (-5), 15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[]");
    }

    @Test
    public void test7278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7278");
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
        java.util.Arrays.parallelSort(floatArray7);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertNotNull(shortArrayStream1);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4) + "'", int18 == (-4));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test7279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7279");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream3 = java.util.Arrays.stream(charSequenceArray2);
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream7 = java.util.Arrays.stream(charSequenceArray6);
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream11 = java.util.Arrays.stream(charSequenceArray10);
        java.util.stream.BaseStream[] baseStreamArray13 = new java.util.stream.BaseStream[3];
        @SuppressWarnings("unchecked")
        java.util.stream.BaseStream<java.lang.CharSequence, java.util.stream.Stream<java.lang.CharSequence>>[] charSequenceBaseStreamArray14 = (java.util.stream.BaseStream<java.lang.CharSequence, java.util.stream.Stream<java.lang.CharSequence>>[]) baseStreamArray13;
        charSequenceBaseStreamArray14[0] = charSequenceStream3;
        charSequenceBaseStreamArray14[1] = charSequenceStream7;
        charSequenceBaseStreamArray14[2] = charSequenceStream11;
        java.util.stream.Stream<java.util.stream.BaseStream<java.lang.CharSequence, java.util.stream.Stream<java.lang.CharSequence>>> charSequenceBaseStreamStream23 = java.util.Arrays.stream(charSequenceBaseStreamArray14, (int) (byte) 0, (int) (byte) 0);
        java.lang.AutoCloseable[] autoCloseableArray26 = java.util.Arrays.copyOfRange((java.lang.AutoCloseable[]) charSequenceBaseStreamArray14, (int) (short) 0, 7);
        long[] longArray30 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream31 = java.util.Arrays.stream(longArray30);
        java.util.Arrays.fill(longArray30, 0L);
        long[] longArray35 = java.util.Arrays.copyOf(longArray30, 1);
        int int37 = java.util.Arrays.binarySearch(longArray35, (long) 99);
        int int39 = java.util.Arrays.binarySearch(longArray35, (long) (-6));
        java.util.Arrays.parallelSort(longArray35);
        java.util.Arrays.sort(longArray35);
        java.util.Spliterator.OfLong ofLong42 = java.util.Arrays.spliterator(longArray35);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill((java.lang.Object[]) autoCloseableArray26, (java.lang.Object) longArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: [J");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertNotNull(charSequenceStream3);
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertNotNull(charSequenceStream7);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(charSequenceStream11);
        org.junit.Assert.assertNotNull(baseStreamArray13);
        org.junit.Assert.assertNotNull(charSequenceBaseStreamArray14);
        org.junit.Assert.assertNotNull(charSequenceBaseStreamStream23);
        org.junit.Assert.assertNotNull(autoCloseableArray26);
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(longStream31);
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2) + "'", int37 == (-2));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(ofLong42);
    }

    @Test
    public void test7280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7280");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        boolean[] booleanArray10 = java.util.Arrays.copyOfRange(booleanArray7, (int) (short) 10, (int) '#');
        boolean[] booleanArray12 = java.util.Arrays.copyOf(booleanArray7, (int) (short) 1);
        boolean[] booleanArray14 = java.util.Arrays.copyOf(booleanArray7, 6);
        java.util.Arrays.fill(booleanArray14, true);
        java.util.Arrays.fill(booleanArray14, true);
        boolean[] booleanArray20 = java.util.Arrays.copyOf(booleanArray14, 0);
        java.util.Arrays.fill(booleanArray14, true);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false]");
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, true, true, true, true, true]");
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[]");
    }

    @Test
    public void test7281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7281");
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
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(serializableArray7);
    }

    @Test
    public void test7282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7282");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        int int9 = java.util.Arrays.binarySearch(intArray3, 1);
        int[] intArray12 = java.util.Arrays.copyOfRange(intArray3, 0, 5);
        int[] intArray14 = new int[] { 100 };
        int[] intArray16 = java.util.Arrays.copyOf(intArray14, (int) (short) 100);
        int int20 = java.util.Arrays.binarySearch(intArray16, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray16, 3);
        int[] intArray24 = java.util.Arrays.copyOf(intArray16, (int) (short) 100);
        int[] intArray26 = java.util.Arrays.copyOf(intArray16, 1);
        int[] intArray29 = java.util.Arrays.copyOfRange(intArray26, (int) (short) 0, 100);
        java.util.Spliterator.OfInt ofInt30 = java.util.Arrays.spliterator(intArray29);
        boolean boolean31 = java.util.Arrays.equals(intArray3, intArray29);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-101) + "'", int9 == (-101));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[3]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofInt30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test7283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7283");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        java.util.Arrays.parallelSort(doubleArray7);
        double[] doubleArray11 = new double[] { (short) 10, 10.0f };
        double[] doubleArray13 = java.util.Arrays.copyOf(doubleArray11, (int) (short) 100);
        double[] doubleArray16 = java.util.Arrays.copyOfRange(doubleArray13, 2, (int) 'a');
        double[] doubleArray18 = java.util.Arrays.copyOf(doubleArray13, (int) 'a');
        java.util.Arrays.parallelSort(doubleArray18);
        boolean boolean20 = java.util.Arrays.equals(doubleArray7, doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test7284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7284");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray3, (int) (byte) 0, (int) (byte) 1);
        java.util.Spliterator.OfInt ofInt9 = java.util.Arrays.spliterator(intArray3, (int) (byte) 1, 10);
        java.util.stream.IntStream intStream10 = java.util.Arrays.stream(intArray3);
        int int12 = java.util.Arrays.binarySearch(intArray3, 5);
        int[] intArray14 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        int[] intArray16 = java.util.Arrays.copyOf(intArray14, (int) '#');
        java.util.stream.IntStream intStream17 = java.util.Arrays.stream(intArray16);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofInt9);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-101) + "'", int12 == (-101));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intStream17);
    }

    @Test
    public void test7285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7285");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.parallelSort(floatArray3);
        int int8 = java.util.Arrays.binarySearch(floatArray3, (float) 10L);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = java.util.Arrays.binarySearch(floatArray3, (-71), 3, (float) (-32));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -71");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-3) + "'", int8 == (-3));
    }

    @Test
    public void test7286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7286");
        short[] shortArray6 = new short[] { (byte) -1, (byte) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
        java.util.Arrays.parallelSort(shortArray6);
        java.util.Arrays.sort(shortArray6);
        short[] shortArray10 = java.util.Arrays.copyOf(shortArray6, 100);
        java.util.Arrays.sort(shortArray10);
        int int13 = java.util.Arrays.binarySearch(shortArray10, (short) (byte) -1);
        java.util.Arrays.sort(shortArray10, 0, (int) ' ');
        short[] shortArray19 = java.util.Arrays.copyOfRange(shortArray10, (int) (short) 1, 17);
        java.util.Arrays.sort(shortArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(shortArray10, (-101), 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test7287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7287");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        java.util.Arrays.parallelSort(longArray3);
        java.util.stream.LongStream longStream12 = java.util.Arrays.stream(longArray3, (int) (byte) 1, (int) (short) 1);
        java.util.stream.LongStream longStream13 = java.util.Arrays.stream(longArray3);
        long[] longArray17 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream18 = java.util.Arrays.stream(longArray17);
        long[] longArray21 = java.util.Arrays.copyOfRange(longArray17, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong22 = java.util.Arrays.spliterator(longArray21);
        java.util.Arrays.parallelSort(longArray21);
        int int27 = java.util.Arrays.binarySearch(longArray21, 1, 4, (long) 3);
        java.util.stream.LongStream longStream28 = java.util.Arrays.stream(longArray21);
        long[] longArray32 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream33 = java.util.Arrays.stream(longArray32);
        long[] longArray36 = java.util.Arrays.copyOfRange(longArray32, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong37 = java.util.Arrays.spliterator(longArray36);
        java.util.Arrays.parallelSort(longArray36);
        int int42 = java.util.Arrays.binarySearch(longArray36, 1, 4, (long) 3);
        java.util.stream.LongStream longStream43 = java.util.Arrays.stream(longArray36);
        long[] longArray47 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream48 = java.util.Arrays.stream(longArray47);
        java.util.Arrays.fill(longArray47, (long) (byte) 10);
        java.util.Arrays.fill(longArray47, (long) '4');
        int int54 = java.util.Arrays.binarySearch(longArray47, 0L);
        java.util.stream.LongStream longStream55 = java.util.Arrays.stream(longArray47);
        long[] longArray56 = new long[] {};
        int int58 = java.util.Arrays.binarySearch(longArray56, (long) '#');
        java.util.Arrays.sort(longArray56);
        java.util.stream.LongStream longStream60 = java.util.Arrays.stream(longArray56);
        java.lang.Object[] objArray62 = new java.lang.Object[] { "[0, 100]" };
        java.util.Arrays.fill(objArray62, (java.lang.Object) "[hi!, ]");
        long[] longArray70 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream71 = java.util.Arrays.stream(longArray70);
        java.util.Arrays.fill(objArray62, 0, 0, (java.lang.Object) longStream71);
        java.util.stream.LongStream[] longStreamArray73 = new java.util.stream.LongStream[] { longStream13, longStream28, longStream43, longStream55, longStream60, longStream71 };
        java.util.stream.LongStream[][] longStreamArray74 = new java.util.stream.LongStream[][] { longStreamArray73 };
        java.util.List<java.util.stream.LongStream[]> longStreamArrayList75 = java.util.Arrays.asList(longStreamArray74);
        java.util.List<java.util.stream.LongStream[]> longStreamArrayList76 = java.util.Arrays.asList(longStreamArray74);
        java.util.Arrays.sort((java.lang.Object[]) longStreamArray74);
        java.util.stream.Stream<java.lang.AutoCloseable[]> autoCloseableArrayStream78 = java.util.Arrays.stream((java.lang.AutoCloseable[][]) longStreamArray74);
        java.lang.String str79 = java.util.Arrays.toString((java.lang.Object[]) longStreamArray74);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream18);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[0, 0, 0, 0, 0, 0, 0, 1, 3]");
        org.junit.Assert.assertNotNull(ofLong22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-5) + "'", int27 == (-5));
        org.junit.Assert.assertNotNull(longStream28);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream33);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[0, 0, 0, 0, 0, 0, 0, 1, 3]");
        org.junit.Assert.assertNotNull(ofLong37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-5) + "'", int42 == (-5));
        org.junit.Assert.assertNotNull(longStream43);
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[52, 52, 52]");
        org.junit.Assert.assertNotNull(longStream48);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(longStream55);
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(longStream60);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[[hi!, ]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[[hi!, ]]");
        org.junit.Assert.assertNotNull(longArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray70), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream71);
        org.junit.Assert.assertNotNull(longStreamArray73);
        org.junit.Assert.assertNotNull(longStreamArray74);
        org.junit.Assert.assertNotNull(longStreamArrayList75);
        org.junit.Assert.assertNotNull(longStreamArrayList76);
        org.junit.Assert.assertNotNull(autoCloseableArrayStream78);
    }

    @Test
    public void test7288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7288");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) (byte) 100);
        short[] shortArray6 = java.util.Arrays.copyOf(shortArray0, 1);
        java.util.Arrays.fill(shortArray6, (short) 10);
        java.util.Arrays.fill(shortArray6, (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(shortArray6, (-9), 7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -9");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1]");
    }

    @Test
    public void test7289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7289");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.parallelSort(charArray4);
        java.util.Arrays.sort(charArray4);
        int int11 = java.util.Arrays.binarySearch(charArray4, 'a');
        java.util.Arrays.parallelSort(charArray4);
        java.util.Arrays.fill(charArray4, '#');
        java.util.Arrays.sort(charArray4);
        char[] charArray18 = java.util.Arrays.copyOfRange(charArray4, 0, 10);
        java.util.Arrays.fill(charArray4, ' ');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "    ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "    ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "####\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "####\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[#, #, #, #, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test7290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7290");
        int[] intArray6 = new int[] { '4', (short) 0, '4', (byte) 100, (-3), (byte) -1 };
        java.util.Arrays.fill(intArray6, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(intArray6, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(52) > toIndex(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10, 10, 10, 10, 10]");
    }

    @Test
    public void test7291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7291");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) (byte) 100);
        short[] shortArray6 = java.util.Arrays.copyOf(shortArray0, 1);
        short[] shortArray8 = java.util.Arrays.copyOf(shortArray6, (int) (byte) 100);
        java.util.Arrays.sort(shortArray6);
        int int11 = java.util.Arrays.binarySearch(shortArray6, (short) (byte) -1);
        int int13 = java.util.Arrays.binarySearch(shortArray6, (short) -1);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0]");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test7292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7292");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) 1 };
        java.util.Arrays.fill(byteArray6, (byte) -1);
        java.util.Arrays.sort(byteArray6);
        int int11 = java.util.Arrays.binarySearch(byteArray6, (byte) 100);
        int int13 = java.util.Arrays.binarySearch(byteArray6, (byte) 1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-7) + "'", int11 == (-7));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-7) + "'", int13 == (-7));
    }

    @Test
    public void test7293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7293");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray3, (int) (byte) 0, (int) (byte) 1);
        java.util.Spliterator.OfInt ofInt7 = java.util.Arrays.spliterator(intArray3);
        java.util.stream.IntStream intStream8 = java.util.Arrays.stream(intArray3);
        java.util.Arrays.sort(intArray3);
        java.util.Arrays.sort(intArray3, 2, (int) 'a');
        java.util.stream.IntStream intStream15 = java.util.Arrays.stream(intArray3, (int) (short) 10, (int) '#');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(ofInt7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(intStream15);
    }

    @Test
    public void test7294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7294");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray4, '#');
        int int11 = java.util.Arrays.binarySearch(charArray4, '4');
        int int13 = java.util.Arrays.binarySearch(charArray4, ' ');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-5) + "'", int11 == (-5));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test7295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7295");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.sort(floatArray3);
        java.util.Arrays.parallelSort(floatArray3);
        java.util.Arrays.parallelSort(floatArray3);
        java.util.Arrays.sort(floatArray3);
        java.util.Arrays.sort(floatArray3);
        float[] floatArray12 = new float[] { (-1L) };
        int int14 = java.util.Arrays.binarySearch(floatArray12, (float) (short) -1);
        java.util.Arrays.sort(floatArray12);
        float[] floatArray17 = java.util.Arrays.copyOf(floatArray12, 5);
        float[] floatArray19 = java.util.Arrays.copyOf(floatArray12, 1);
        java.util.Arrays.sort(floatArray12);
        boolean boolean21 = java.util.Arrays.equals(floatArray3, floatArray12);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[-1.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test7296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7296");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { (short) 10, 10.0f };
        double[] doubleArray5 = java.util.Arrays.copyOf(doubleArray3, (int) (short) 100);
        int int9 = java.util.Arrays.binarySearch(doubleArray5, 5, 10, (double) (byte) 0);
        java.util.Arrays.sort(doubleArray5);
        java.util.Arrays.sort(doubleArray5);
        boolean boolean12 = java.util.Arrays.equals(doubleArray0, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7297");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray4, '#');
        java.util.Arrays.sort(charArray4);
        int int12 = java.util.Arrays.binarySearch(charArray4, 'a');
        int int14 = java.util.Arrays.binarySearch(charArray4, '4');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-5) + "'", int12 == (-5));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-5) + "'", int14 == (-5));
    }

    @Test
    public void test7298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7298");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        double[] doubleArray14 = java.util.Arrays.copyOfRange(doubleArray11, 2, 100);
        double[] doubleArray16 = java.util.Arrays.copyOf(doubleArray11, (int) '#');
        java.util.Arrays.fill(doubleArray16, (double) 49);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(doubleArray16, (-2), 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0, 49.0]");
    }

    @Test
    public void test7299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7299");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.lang.reflect.Type[][] typeArray5 = new java.lang.reflect.Type[][] {};
        java.util.stream.Stream<java.lang.reflect.Type[]> typeArrayStream6 = java.util.Arrays.stream(typeArray5);
        java.util.Arrays.fill((java.lang.Object[]) typeArray5, (java.lang.Object) "[a, a, a, a]");
        java.util.Arrays.fill((java.lang.Object[]) strArray2, (java.lang.Object) "[a, a, a, a]");
        java.util.List<java.lang.String> strList10 = java.util.Arrays.asList(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.sort((java.lang.Object[]) strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(typeArrayStream6);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test7300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7300");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong8 = java.util.Arrays.spliterator(longArray7);
        java.util.Arrays.parallelSort(longArray7);
        java.util.Arrays.sort(longArray7);
        java.util.Arrays.parallelSort(longArray7);
        long[] longArray13 = java.util.Arrays.copyOf(longArray7, 5);
        java.util.Arrays.parallelSort(longArray13);
        java.util.function.LongBinaryOperator longBinaryOperator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(longArray13, longBinaryOperator15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[0, 0, 0, 0, 0, 0, 0, 1, 3]");
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[0, 0, 0, 0, 0]");
    }

    @Test
    public void test7301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7301");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        long[] longArray9 = java.util.Arrays.copyOf(longArray3, 0);
        java.util.Spliterator.OfLong ofLong10 = java.util.Arrays.spliterator(longArray3);
        java.util.Arrays.sort(longArray3);
        java.lang.String str12 = java.util.Arrays.toString(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[1, 3, 100]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[]");
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[1, 3, 100]" + "'", str12, "[1, 3, 100]");
    }

    @Test
    public void test7302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7302");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int[] intArray11 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        int[] intArray13 = java.util.Arrays.copyOf(intArray3, 1);
        int[] intArray16 = java.util.Arrays.copyOfRange(intArray13, (int) (short) 0, 100);
        int int18 = java.util.Arrays.binarySearch(intArray13, (-96));
        java.util.Arrays.parallelSort(intArray13);
        java.util.Arrays.parallelSort(intArray13);
        int[] intArray22 = new int[] { 100 };
        int[] intArray24 = java.util.Arrays.copyOf(intArray22, (int) (short) 100);
        int int28 = java.util.Arrays.binarySearch(intArray24, (int) (byte) 1, 10, 0);
        int[] intArray30 = java.util.Arrays.copyOf(intArray24, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray30);
        int[] intArray33 = java.util.Arrays.copyOf(intArray30, 99);
        boolean boolean34 = java.util.Arrays.equals(intArray13, intArray30);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[3]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test7303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7303");
        long[] longArray0 = new long[] {};
        int int2 = java.util.Arrays.binarySearch(longArray0, (long) '#');
        java.util.Arrays.sort(longArray0);
        java.util.Arrays.fill(longArray0, (long) (-5));
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(longArray0, (int) '4', (int) 'a', (long) 15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7304");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int6 = java.util.Arrays.binarySearch(doubleArray4, (double) 3);
        java.util.Arrays.sort(doubleArray4);
        java.util.Arrays.sort(doubleArray4);
        int int10 = java.util.Arrays.binarySearch(doubleArray4, (double) (-8));
        java.util.stream.DoubleStream doubleStream11 = java.util.Arrays.stream(doubleArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(doubleArray4, (int) (byte) 100, (int) (short) 1, (double) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-101) + "'", int6 == (-101));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(doubleStream11);
    }

    @Test
    public void test7305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7305");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream5 = java.util.Arrays.stream(doubleArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(doubleArray4, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
    }

    @Test
    public void test7306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7306");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) (byte) 100);
        java.util.Arrays.parallelSort(shortArray0);
        int int7 = java.util.Arrays.binarySearch(shortArray0, (short) (byte) -1);
        java.util.Arrays.fill(shortArray0, (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(shortArray0, (-6), 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test7307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7307");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.sort(floatArray3);
        float[] floatArray8 = java.util.Arrays.copyOf(floatArray3, 0);
        java.util.Arrays.fill(floatArray3, (-1.0f));
        java.util.Arrays.parallelSort(floatArray3);
        java.util.Arrays.sort(floatArray3);
        float[] floatArray14 = java.util.Arrays.copyOf(floatArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java.util.Arrays.binarySearch(floatArray3, (int) (short) 100, 0, (float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, -1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[-1.0]");
    }

    @Test
    public void test7308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7308");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        byte[] byteArray6 = java.util.Arrays.copyOf(byteArray1, (int) ' ');
        java.util.Arrays.fill(byteArray1, (byte) 10);
        byte[] byteArray11 = java.util.Arrays.copyOfRange(byteArray1, 0, 5);
        byte[] byteArray14 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(byteArray1, (-53), (-96), (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(-53) > toIndex(-96)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
    }

    @Test
    public void test7309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7309");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.fill(longArray3, (long) '4');
        int int10 = java.util.Arrays.binarySearch(longArray3, 0L);
        java.util.stream.LongStream longStream11 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, 1L);
        int int15 = java.util.Arrays.binarySearch(longArray3, (long) 100);
        java.util.Arrays.parallelSort(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
    }

    @Test
    public void test7310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7310");
        int[] intArray0 = new int[] {};
        java.util.stream.IntStream intStream1 = java.util.Arrays.stream(intArray0);
        java.util.Arrays.parallelSort(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = java.util.Arrays.binarySearch(intArray0, 0, (-4), 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-4)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intStream1);
    }

    @Test
    public void test7311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7311");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        double[] doubleArray14 = java.util.Arrays.copyOfRange(doubleArray11, 2, 100);
        double[] doubleArray16 = java.util.Arrays.copyOf(doubleArray11, (int) '#');
        java.util.stream.DoubleStream doubleStream17 = java.util.Arrays.stream(doubleArray11);
        double[] doubleArray19 = java.util.Arrays.copyOf(doubleArray11, 17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfDouble ofDouble22 = java.util.Arrays.spliterator(doubleArray19, (-33), (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -33");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleStream17);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test7312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7312");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int[] intArray11 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        int[] intArray13 = java.util.Arrays.copyOf(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfInt ofInt16 = java.util.Arrays.spliterator(intArray13, 3, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(3) > fence(-3)");
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[3]");
    }

    @Test
    public void test7313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7313");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.fill(intArray3, (int) (short) 1);
        java.util.Arrays.fill(intArray3, (int) ' ', (int) (short) 100, 0);
        java.util.Spliterator.OfInt ofInt12 = java.util.Arrays.spliterator(intArray3, 4, 100);
        int int14 = java.util.Arrays.binarySearch(intArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java.util.Arrays.binarySearch(intArray3, (int) (byte) -1, (int) (short) 100, (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofInt12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
    }

    @Test
    public void test7314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7314");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        byte[] byteArray9 = java.util.Arrays.copyOf(byteArray4, (int) '#');
        byte[] byteArray12 = java.util.Arrays.copyOfRange(byteArray4, 1, 7);
        int int14 = java.util.Arrays.binarySearch(byteArray4, (byte) 100);
        byte[] byteArray16 = java.util.Arrays.copyOf(byteArray4, 5);
        byte[] byteArray18 = java.util.Arrays.copyOf(byteArray4, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java.util.Arrays.binarySearch(byteArray18, (int) 'a', (-10), (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(97) > toIndex(-10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2) + "'", int14 == (-2));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
    }

    @Test
    public void test7315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7315");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        int[] intArray9 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray9);
        int[] intArray12 = java.util.Arrays.copyOf(intArray9, (int) (byte) 10);
        int int14 = java.util.Arrays.binarySearch(intArray12, 99);
        java.util.Arrays.parallelSort(intArray12);
        java.util.Spliterator.OfInt ofInt16 = java.util.Arrays.spliterator(intArray12);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-11) + "'", int14 == (-11));
        org.junit.Assert.assertNotNull(ofInt16);
    }

    @Test
    public void test7316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7316");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        long[] longArray10 = java.util.Arrays.copyOf(longArray3, 0);
        int int12 = java.util.Arrays.binarySearch(longArray3, (long) (-5));
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test7317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7317");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        java.util.Arrays.parallelSort(longArray3);
        java.util.stream.LongStream longStream12 = java.util.Arrays.stream(longArray3, (int) (byte) 1, (int) (short) 1);
        int int14 = java.util.Arrays.binarySearch(longArray3, 0L);
        java.util.Arrays.fill(longArray3, (long) (byte) 1);
        java.util.stream.LongStream longStream17 = java.util.Arrays.stream(longArray3);
        java.util.Spliterator.OfLong ofLong18 = java.util.Arrays.spliterator(longArray3);
        java.util.stream.LongStream longStream19 = java.util.Arrays.stream(longArray3);
        java.util.function.LongBinaryOperator longBinaryOperator20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(longArray3, longBinaryOperator20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(longStream17);
        org.junit.Assert.assertNotNull(ofLong18);
        org.junit.Assert.assertNotNull(longStream19);
    }

    @Test
    public void test7318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7318");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream5 = java.util.Arrays.stream(doubleArray4);
        java.util.Arrays.fill(doubleArray4, (double) (short) -1);
        double[] doubleArray10 = new double[] { (short) 10, 10.0f };
        double[] doubleArray12 = java.util.Arrays.copyOf(doubleArray10, (int) (short) 100);
        double[] doubleArray15 = java.util.Arrays.copyOfRange(doubleArray12, 2, (int) 'a');
        double[] doubleArray17 = java.util.Arrays.copyOf(doubleArray12, (int) 'a');
        java.util.Arrays.sort(doubleArray17);
        java.util.Arrays.fill(doubleArray17, 0.0d);
        java.util.stream.DoubleStream doubleStream21 = java.util.Arrays.stream(doubleArray17);
        java.util.stream.DoubleStream doubleStream24 = java.util.Arrays.stream(doubleArray17, 0, 0);
        double[] doubleArray27 = java.util.Arrays.copyOfRange(doubleArray17, 10, (int) (short) 10);
        boolean boolean28 = java.util.Arrays.equals(doubleArray4, doubleArray17);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleStream21);
        org.junit.Assert.assertNotNull(doubleStream24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test7319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7319");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Spliterator.OfLong ofLong5 = java.util.Arrays.spliterator(longArray3);
        long[] longArray9 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream10 = java.util.Arrays.stream(longArray9);
        java.util.Arrays.fill(longArray9, (long) (byte) 10);
        java.util.Arrays.fill(longArray9, (long) '4');
        int int16 = java.util.Arrays.binarySearch(longArray9, 0L);
        java.util.stream.LongStream longStream17 = java.util.Arrays.stream(longArray9);
        long[] longArray19 = java.util.Arrays.copyOf(longArray9, 3);
        boolean boolean20 = java.util.Arrays.equals(longArray3, longArray19);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(ofLong5);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[52, 52, 52]");
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(longStream17);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[52, 52, 52]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test7320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7320");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream5 = java.util.Arrays.stream(doubleArray4);
        java.util.Arrays.fill(doubleArray4, (double) (short) -1);
        java.util.Spliterator.OfDouble ofDouble8 = java.util.Arrays.spliterator(doubleArray4);
        java.util.Arrays.parallelSort(doubleArray4);
        java.util.stream.DoubleStream doubleStream10 = java.util.Arrays.stream(doubleArray4);
        java.util.function.DoubleBinaryOperator doubleBinaryOperator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(doubleArray4, (-10), (int) (byte) 10, doubleBinaryOperator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(ofDouble8);
        org.junit.Assert.assertNotNull(doubleStream10);
    }

    @Test
    public void test7321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7321");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray1);
        java.util.Arrays.fill(intArray1, 5);
        java.util.Arrays.fill(intArray1, (int) '#');
        int[] intArray10 = java.util.Arrays.copyOf(intArray1, 4);
        java.util.stream.IntStream intStream13 = java.util.Arrays.stream(intArray10, (int) (byte) 0, 0);
        int[] intArray16 = java.util.Arrays.copyOfRange(intArray10, 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[35]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
    }

    @Test
    public void test7322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7322");
        float[] floatArray1 = new float[] { (-1L) };
        int int3 = java.util.Arrays.binarySearch(floatArray1, (float) (short) -1);
        java.util.Arrays.sort(floatArray1);
        java.util.Arrays.fill(floatArray1, 0.0f);
        java.util.Arrays.fill(floatArray1, (float) 100L);
        java.util.Arrays.fill(floatArray1, 10.0f);
        java.util.Arrays.parallelSort(floatArray1, 0, 0);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test7323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7323");
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
    public void test7324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7324");
        double[] doubleArray4 = new double[] { 3, 0.0f, (short) 0, (-4) };
        java.util.Arrays.fill(doubleArray4, (double) (byte) 0);
        java.util.Spliterator.OfDouble ofDouble7 = java.util.Arrays.spliterator(doubleArray4);
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) '4');
        java.util.Spliterator.OfDouble ofDouble10 = java.util.Arrays.spliterator(doubleArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(doubleArray9, 6, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(6) > toIndex(-9)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(ofDouble7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(ofDouble10);
    }

    @Test
    public void test7325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7325");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        double[] doubleArray14 = java.util.Arrays.copyOfRange(doubleArray11, 2, 100);
        double[] doubleArray16 = java.util.Arrays.copyOf(doubleArray11, (int) '#');
        java.util.Spliterator.OfDouble ofDouble17 = java.util.Arrays.spliterator(doubleArray11);
        int int19 = java.util.Arrays.binarySearch(doubleArray11, (double) (byte) -1);
        java.util.Arrays.fill(doubleArray11, 1.0d);
        java.util.Arrays.fill(doubleArray11, (double) (-8));
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(ofDouble17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test7326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7326");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.sort((java.lang.Object[]) strArray2);
        java.util.Arrays.parallelSort(strArray2);
        boolean[] booleanArray9 = new boolean[] { true, true };
        java.util.Arrays.fill(booleanArray9, false);
        boolean[] booleanArray13 = java.util.Arrays.copyOf(booleanArray9, 0);
        java.util.Arrays.fill(booleanArray9, false);
        boolean[] booleanArray17 = java.util.Arrays.copyOf(booleanArray9, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java.util.Arrays.binarySearch((java.lang.Object[]) strArray2, (java.lang.Object) booleanArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Z cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[]");
    }

    @Test
    public void test7327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7327");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        byte[] byteArray8 = java.util.Arrays.copyOf(byteArray4, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(byteArray8, (-7), (-99));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(-7) > toIndex(-99)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test7328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7328");
        float[] floatArray3 = new float[] { 0.0f, (byte) 0, (short) 1 };
        java.util.Arrays.sort(floatArray3);
        float[] floatArray6 = java.util.Arrays.copyOf(floatArray3, 2);
        java.util.Arrays.parallelSort(floatArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = java.util.Arrays.binarySearch(floatArray3, (-4), 7, (float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[0.0, 0.0]");
    }

    @Test
    public void test7329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7329");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.fill(longArray3, (long) '4');
        java.util.Arrays.parallelSort(longArray3);
        java.util.stream.LongStream longStream10 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.parallelSort(longArray3);
        int int13 = java.util.Arrays.binarySearch(longArray3, (long) (-53));
        long[] longArray15 = java.util.Arrays.copyOf(longArray3, 0);
        java.util.Arrays.fill(longArray3, (long) 5);
        java.util.Arrays.parallelSort(longArray3);
        java.util.function.IntToLongFunction intToLongFunction19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSetAll(longArray3, intToLongFunction19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[5, 5, 5]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[]");
    }

    @Test
    public void test7330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7330");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray1);
        java.util.Arrays.fill(intArray1, 5);
        java.util.Arrays.fill(intArray1, (-3));
        java.util.Arrays.parallelSort(intArray1);
        java.util.Arrays.sort(intArray1);
        java.util.Arrays.parallelSort(intArray1);
        int[] intArray13 = java.util.Arrays.copyOf(intArray1, 2);
        int int15 = java.util.Arrays.binarySearch(intArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfInt ofInt18 = java.util.Arrays.spliterator(intArray1, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(10) > fence(-1)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-3]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-3, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
    }

    @Test
    public void test7331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7331");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        java.util.Arrays.fill(doubleArray4, 3, 7, (double) ' ');
        java.util.Arrays.parallelSort(doubleArray4);
        java.util.Arrays.fill(doubleArray4, 0.0d);
        int int16 = java.util.Arrays.binarySearch(doubleArray4, (double) (-1.0f));
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test7332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7332");
        char[] charArray3 = new char[] { '#', 'a', '#' };
        char[] charArray5 = java.util.Arrays.copyOf(charArray3, 100);
        java.util.Arrays.fill(charArray3, 'a');
        char[] charArray9 = java.util.Arrays.copyOf(charArray3, 29);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray12 = java.util.Arrays.copyOfRange(charArray9, (int) '4', (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 52 > -8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, a, a]");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a#\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a#\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a, #, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "aaa\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "aaa\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, a, a, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test7333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7333");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) 100);
        java.util.Arrays.sort(shortArray0);
        java.util.Arrays.sort(shortArray0);
        java.util.Arrays.fill(shortArray0, (int) (short) 0, 0, (short) 100);
        short[] shortArray12 = java.util.Arrays.copyOf(shortArray0, (int) (short) 0);
        int int14 = java.util.Arrays.binarySearch(shortArray0, (short) 100);
        java.util.Arrays.fill(shortArray0, (short) (byte) 0);
        short[] shortArray18 = java.util.Arrays.copyOf(shortArray0, (int) '4');
        int int20 = java.util.Arrays.binarySearch(shortArray18, (short) (byte) 10);
        java.util.Arrays.parallelSort(shortArray18);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray24 = java.util.Arrays.copyOfRange(shortArray18, (-5), (-33));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -5 > -33");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-53) + "'", int20 == (-53));
    }

    @Test
    public void test7334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7334");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.sort(byteArray1);
        int int7 = java.util.Arrays.binarySearch(byteArray1, (byte) -1);
        int int9 = java.util.Arrays.binarySearch(byteArray1, (byte) 10);
        java.util.Arrays.fill(byteArray1, (byte) -1);
        java.util.Arrays.fill(byteArray1, (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = java.util.Arrays.copyOfRange(byteArray1, 29, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
    }

    @Test
    public void test7335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7335");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        int int3 = java.util.Arrays.binarySearch(byteArray1, (byte) 1);
        byte[] byteArray5 = java.util.Arrays.copyOf(byteArray1, (int) (short) 0);
        java.util.Arrays.fill(byteArray5, (byte) 100);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
    }

    @Test
    public void test7336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7336");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, 0L);
        java.util.Arrays.parallelSort(longArray3);
        java.util.Arrays.fill(longArray3, (long) '#');
        java.util.Arrays.fill(longArray3, 0L);
        java.util.Spliterator.OfLong ofLong12 = java.util.Arrays.spliterator(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(ofLong12);
    }

    @Test
    public void test7337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7337");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int[] intArray11 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray11);
        java.util.Arrays.fill(intArray11, 6);
        int int16 = java.util.Arrays.binarySearch(intArray11, (-36));
        java.util.Spliterator.OfInt ofInt17 = java.util.Arrays.spliterator(intArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(intArray11, (-99), (-18));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -99");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(ofInt17);
    }

    @Test
    public void test7338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7338");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong8 = java.util.Arrays.spliterator(longArray7);
        long[] longArray10 = java.util.Arrays.copyOf(longArray7, (int) (byte) 1);
        long[] longArray12 = java.util.Arrays.copyOf(longArray7, 0);
        long[] longArray14 = java.util.Arrays.copyOf(longArray12, (int) (short) 10);
        java.util.Arrays.fill(longArray12, 100L);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[3]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[]");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test7339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7339");
        float[] floatArray1 = new float[] { (-1L) };
        int int3 = java.util.Arrays.binarySearch(floatArray1, (float) (short) -1);
        java.util.Arrays.sort(floatArray1);
        float[] floatArray6 = java.util.Arrays.copyOf(floatArray1, (int) (short) 1);
        java.util.Arrays.parallelSort(floatArray1);
        int int9 = java.util.Arrays.binarySearch(floatArray1, (float) (-32));
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(floatArray1, 2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(2) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test7340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7340");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        int int7 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(floatArray3, 5, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(5) > toIndex(4)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-3) + "'", int7 == (-3));
    }

    @Test
    public void test7341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7341");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream5 = java.util.Arrays.stream(doubleArray4);
        java.util.Arrays.parallelSort(doubleArray4);
        java.util.Spliterator.OfDouble ofDouble7 = java.util.Arrays.spliterator(doubleArray4);
        java.util.stream.DoubleStream doubleStream8 = java.util.Arrays.stream(doubleArray4);
        double[] doubleArray10 = java.util.Arrays.copyOf(doubleArray4, 10);
        java.util.Arrays.sort(doubleArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = java.util.Arrays.binarySearch(doubleArray4, (-1), 1, (double) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(ofDouble7);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test7342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7342");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.sort(intArray3);
        int[] intArray10 = java.util.Arrays.copyOf(intArray3, 17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfInt ofInt13 = java.util.Arrays.spliterator(intArray3, (-50), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -50");
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
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test7343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7343");
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
        java.util.Arrays.sort(floatArray3);
        java.util.Arrays.fill(floatArray3, (float) 7);
        java.util.Arrays.sort(floatArray3);
        java.lang.String str25 = java.util.Arrays.toString(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[7.0, 7.0, 7.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-4) + "'", int14 == (-4));
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[100.0, 100.0, 100.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[7.0, 7.0, 7.0]" + "'", str25, "[7.0, 7.0, 7.0]");
    }

    @Test
    public void test7344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7344");
        long[] longArray0 = new long[] {};
        long[] longArray2 = java.util.Arrays.copyOf(longArray0, 17);
        java.util.stream.LongStream longStream3 = java.util.Arrays.stream(longArray0);
        long[] longArray7 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream8 = java.util.Arrays.stream(longArray7);
        long[] longArray11 = java.util.Arrays.copyOfRange(longArray7, (int) (byte) 1, 10);
        long[] longArray13 = java.util.Arrays.copyOf(longArray11, (int) '#');
        java.util.Arrays.fill(longArray13, (long) (byte) 100);
        java.util.Spliterator.OfLong ofLong16 = java.util.Arrays.spliterator(longArray13);
        java.util.Arrays.parallelSort(longArray13, (int) (byte) 0, (int) (short) 1);
        boolean boolean20 = java.util.Arrays.equals(longArray0, longArray13);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100]");
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test7345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7345");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        byte[] byteArray9 = java.util.Arrays.copyOf(byteArray4, (int) '#');
        java.util.Arrays.sort(byteArray9);
        java.util.Arrays.fill(byteArray9, (byte) 1);
        byte[] byteArray14 = java.util.Arrays.copyOf(byteArray9, 49);
        java.util.Arrays.parallelSort(byteArray9);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test7346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7346");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream5 = java.util.Arrays.stream(doubleArray4);
        java.util.Arrays.fill(doubleArray4, (double) (short) -1);
        java.util.Spliterator.OfDouble ofDouble8 = java.util.Arrays.spliterator(doubleArray4);
        java.util.Arrays.parallelSort(doubleArray4);
        java.util.Arrays.fill(doubleArray4, (double) (-8));
        java.util.stream.DoubleStream doubleStream12 = java.util.Arrays.stream(doubleArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream15 = java.util.Arrays.stream(doubleArray4, (int) (byte) -1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0, -8.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(ofDouble8);
        org.junit.Assert.assertNotNull(doubleStream12);
    }

    @Test
    public void test7347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7347");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray4 = java.util.Arrays.copyOf((java.lang.Class<?>[]) classArray1, 3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort((java.lang.Object[]) wildcardClassArray4, (-9), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
    }

    @Test
    public void test7348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7348");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        int int12 = java.util.Arrays.binarySearch(charArray10, 'a');
        java.util.Arrays.sort(charArray10);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray15 = java.util.Arrays.copyOf(charArray10, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a 4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a 4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a,  , 4, a]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test7349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7349");
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
        java.util.Arrays.fill(floatArray20, (float) (-11));
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-4) + "'", int14 == (-4));
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[-11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0, -11.0]");
    }

    @Test
    public void test7350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7350");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray4, '#');
        char[] charArray11 = java.util.Arrays.copyOf(charArray4, (int) (byte) 1);
        char[] charArray13 = java.util.Arrays.copyOf(charArray4, 5);
        java.util.Arrays.fill(charArray13, 'a');
        java.util.Arrays.sort(charArray13);
        java.util.Arrays.fill(charArray13, '#');
        char[] charArray21 = java.util.Arrays.copyOfRange(charArray13, 0, 17);
        char[] charArray23 = java.util.Arrays.copyOf(charArray21, (int) (short) 1);
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
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[#]");
    }
}

