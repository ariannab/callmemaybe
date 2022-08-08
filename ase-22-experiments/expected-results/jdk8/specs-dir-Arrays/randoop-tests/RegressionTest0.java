import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(strArray4, (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(35) > toIndex(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean10 = java.util.Arrays.equals(byteArray5, byteArray9);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        long[] longArray6 = new long[] { (byte) -1, ' ', 100L, 100, '4', (short) 0 };
        java.util.function.LongBinaryOperator longBinaryOperator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(longArray6, 10, 0, longBinaryOperator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1, 32, 100, 100, 52, 0]");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(doubleArray0, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        double[] doubleArray0 = new double[] {};
        java.lang.String str1 = java.util.Arrays.toString(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        int int3 = java.util.Arrays.binarySearch(byteArray1, (byte) 1);
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 100, (byte) -1, (byte) 0 };
        boolean boolean11 = java.util.Arrays.equals(byteArray1, byteArray10);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, 10, 10, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        int int3 = java.util.Arrays.binarySearch(byteArray1, (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(byteArray1, (int) (short) -1, 0, (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        double[] doubleArray4 = new double[] { 'a', 10.0d, 100, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(doubleArray4, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, 10.0, 100.0, 1.0]");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(shortArray0, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray3, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream9 = java.util.Arrays.stream(intArray3, (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(32) > fence(10)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        long[] longArray1 = new long[] { (-3) };
        long[] longArray8 = new long[] { 1, (-1), (short) 1, (-3), 0L, (byte) 0 };
        boolean boolean9 = java.util.Arrays.equals(longArray1, longArray8);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[-3]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[1, -1, 1, -3, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        double[] doubleArray1 = new double[] { (short) 0 };
        java.util.function.IntToDoubleFunction intToDoubleFunction2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(doubleArray1, intToDoubleFunction2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0]");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        int[] intArray2 = new int[] { (-3), (short) -1 };
        java.util.function.IntUnaryOperator intUnaryOperator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSetAll(intArray2, intUnaryOperator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-3, -1]");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        double[] doubleArray5 = new double[] { 0.0f, '#', 10.0f, 1.0f, '#' };
        double[] doubleArray12 = new double[] { 'a', 100.0d, 10L, '4', (byte) -1, 100.0d };
        boolean boolean13 = java.util.Arrays.equals(doubleArray5, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 35.0, 10.0, 1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 100.0, 10.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        long[] longArray5 = new long[] { (byte) 1, 100, (byte) 1, 10, (short) 0 };
        java.lang.String str6 = java.util.Arrays.toString(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[1, 100, 1, 10, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[1, 100, 1, 10, 0]" + "'", str6, "[1, 100, 1, 10, 0]");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray3, (int) (byte) 0, (int) (byte) 1);
        java.lang.String str7 = java.util.Arrays.toString(intArray3);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]" + "'", str7, "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream6 = java.util.Arrays.stream(intArray1, 2, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(2) > fence(1)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        boolean[] booleanArray0 = new boolean[] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray3 = java.util.Arrays.copyOfRange(booleanArray0, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        int int3 = java.util.Arrays.binarySearch(byteArray1, (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(byteArray1, (-3), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = java.util.Arrays.copyOfRange(intArray3, (-1), (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1 > -2");
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
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(byteArray3, (int) (short) 1, 0, (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(1) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, -1, 1]");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        double[] doubleArray2 = new double[] { '4', 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(doubleArray2, (-1), 2, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[52.0, 1.0]");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(intArray3, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        short[] shortArray5 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray11 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray17 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray23 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray29 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray35 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[][] shortArray36 = new short[][] { shortArray5, shortArray11, shortArray17, shortArray23, shortArray29, shortArray35 };
        java.util.Spliterator<short[]> shortArraySpliterator37 = java.util.Arrays.spliterator(shortArray36);
        java.lang.String str38 = java.util.Arrays.deepToString((java.lang.Object[]) shortArray36);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray35), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertNotNull(shortArraySpliterator37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[[0, 1, 1, 100, 1], [0, 1, 1, 100, 1], [0, 1, 1, 100, 1], [0, 1, 1, 100, 1], [0, 1, 1, 100, 1], [0, 1, 1, 100, 1]]" + "'", str38, "[[0, 1, 1, 100, 1], [0, 1, 1, 100, 1], [0, 1, 1, 100, 1], [0, 1, 1, 100, 1], [0, 1, 1, 100, 1], [0, 1, 1, 100, 1]]");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        long[] longArray0 = new long[] {};
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray3 = java.util.Arrays.copyOfRange(longArray0, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100 > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]" };
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]" };
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "hi!", "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]" };
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "hi!", "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]" };
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "hi!", "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]" };
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "hi!", "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]" };
        java.lang.CharSequence[][] charSequenceArray18 = new java.lang.CharSequence[][] { charSequenceArray2, charSequenceArray5, charSequenceArray8, charSequenceArray11, charSequenceArray14, charSequenceArray17 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator<java.lang.CharSequence[]> charSequenceArraySpliterator21 = java.util.Arrays.spliterator(charSequenceArray18, 5, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertNotNull(charSequenceArray14);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertNotNull(charSequenceArray18);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.parallelSort(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(byteArray4, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(97) > toIndex(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(longArray7, (int) (short) 100, 0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        long[] longArray1 = new long[] { ' ' };
        java.util.stream.LongStream longStream2 = java.util.Arrays.stream(longArray1);
        long[] longArray6 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream7 = java.util.Arrays.stream(longArray6);
        java.util.Arrays.fill(longArray6, (long) (byte) 10);
        boolean boolean10 = java.util.Arrays.equals(longArray1, longArray6);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[32]");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
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
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream23 = java.util.Arrays.stream(charSequenceArray22);
        java.util.stream.BaseStream[] baseStreamArray25 = new java.util.stream.BaseStream[6];
        @SuppressWarnings("unchecked")
        java.util.stream.BaseStream<java.lang.CharSequence, java.util.stream.Stream<java.lang.CharSequence>>[] charSequenceBaseStreamArray26 = (java.util.stream.BaseStream<java.lang.CharSequence, java.util.stream.Stream<java.lang.CharSequence>>[]) baseStreamArray25;
        charSequenceBaseStreamArray26[0] = charSequenceStream3;
        charSequenceBaseStreamArray26[1] = charSequenceStream7;
        charSequenceBaseStreamArray26[2] = charSequenceStream11;
        charSequenceBaseStreamArray26[3] = charSequenceStream15;
        charSequenceBaseStreamArray26[4] = charSequenceStream19;
        charSequenceBaseStreamArray26[5] = charSequenceStream23;
        java.lang.CharSequence[] charSequenceArray41 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream42 = java.util.Arrays.stream(charSequenceArray41);
        java.lang.CharSequence[] charSequenceArray45 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream46 = java.util.Arrays.stream(charSequenceArray45);
        java.lang.CharSequence[] charSequenceArray49 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream50 = java.util.Arrays.stream(charSequenceArray49);
        java.lang.CharSequence[] charSequenceArray53 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream54 = java.util.Arrays.stream(charSequenceArray53);
        java.lang.CharSequence[] charSequenceArray57 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream58 = java.util.Arrays.stream(charSequenceArray57);
        java.lang.CharSequence[] charSequenceArray61 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream62 = java.util.Arrays.stream(charSequenceArray61);
        java.util.stream.BaseStream[] baseStreamArray64 = new java.util.stream.BaseStream[6];
        @SuppressWarnings("unchecked")
        java.util.stream.BaseStream<java.lang.CharSequence, java.util.stream.Stream<java.lang.CharSequence>>[] charSequenceBaseStreamArray65 = (java.util.stream.BaseStream<java.lang.CharSequence, java.util.stream.Stream<java.lang.CharSequence>>[]) baseStreamArray64;
        charSequenceBaseStreamArray65[0] = charSequenceStream42;
        charSequenceBaseStreamArray65[1] = charSequenceStream46;
        charSequenceBaseStreamArray65[2] = charSequenceStream50;
        charSequenceBaseStreamArray65[3] = charSequenceStream54;
        charSequenceBaseStreamArray65[4] = charSequenceStream58;
        charSequenceBaseStreamArray65[5] = charSequenceStream62;
        java.util.stream.BaseStream[][] baseStreamArray79 = new java.util.stream.BaseStream[2][];
        @SuppressWarnings("unchecked")
        java.util.stream.BaseStream<java.lang.CharSequence, java.util.stream.Stream<java.lang.CharSequence>>[][] charSequenceBaseStreamArray80 = (java.util.stream.BaseStream<java.lang.CharSequence, java.util.stream.Stream<java.lang.CharSequence>>[][]) baseStreamArray79;
        charSequenceBaseStreamArray80[0] = charSequenceBaseStreamArray26;
        charSequenceBaseStreamArray80[1] = charSequenceBaseStreamArray65;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.BaseStream<java.lang.CharSequence, java.util.stream.Stream<java.lang.CharSequence>>[][] charSequenceBaseStreamArray87 = java.util.Arrays.copyOfRange(charSequenceBaseStreamArray80, 5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(charSequenceArray22);
        org.junit.Assert.assertNotNull(charSequenceStream23);
        org.junit.Assert.assertNotNull(baseStreamArray25);
        org.junit.Assert.assertNotNull(charSequenceBaseStreamArray26);
        org.junit.Assert.assertNotNull(charSequenceArray41);
        org.junit.Assert.assertNotNull(charSequenceStream42);
        org.junit.Assert.assertNotNull(charSequenceArray45);
        org.junit.Assert.assertNotNull(charSequenceStream46);
        org.junit.Assert.assertNotNull(charSequenceArray49);
        org.junit.Assert.assertNotNull(charSequenceStream50);
        org.junit.Assert.assertNotNull(charSequenceArray53);
        org.junit.Assert.assertNotNull(charSequenceStream54);
        org.junit.Assert.assertNotNull(charSequenceArray57);
        org.junit.Assert.assertNotNull(charSequenceStream58);
        org.junit.Assert.assertNotNull(charSequenceArray61);
        org.junit.Assert.assertNotNull(charSequenceStream62);
        org.junit.Assert.assertNotNull(baseStreamArray64);
        org.junit.Assert.assertNotNull(charSequenceBaseStreamArray65);
        org.junit.Assert.assertNotNull(baseStreamArray79);
        org.junit.Assert.assertNotNull(charSequenceBaseStreamArray80);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray3, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfInt ofInt9 = java.util.Arrays.spliterator(intArray3, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        long[] longArray11 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream12 = java.util.Arrays.stream(longArray11);
        boolean boolean13 = java.util.Arrays.equals(longArray3, longArray11);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.function.IntUnaryOperator intUnaryOperator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(intArray3, intUnaryOperator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        long[] longArray11 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream12 = java.util.Arrays.stream(longArray11);
        boolean boolean13 = java.util.Arrays.equals(longArray7, longArray11);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        double[] doubleArray4 = new double[] { 0, (byte) 0, 1L, 5 };
        java.util.function.DoubleBinaryOperator doubleBinaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(doubleArray4, doubleBinaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 0.0, 1.0, 5.0]");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = java.util.Arrays.binarySearch(intArray1, 100, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        int int3 = java.util.Arrays.binarySearch(byteArray1, (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(byteArray1, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream3 = java.util.Arrays.stream(charSequenceArray2);
        long[] longArray5 = new long[] { ' ' };
        java.util.stream.LongStream longStream6 = java.util.Arrays.stream(longArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = java.util.Arrays.binarySearch((java.lang.Object[]) charSequenceArray2, (java.lang.Object) longArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [J cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertNotNull(charSequenceStream3);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[32]");
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Spliterator.OfInt ofInt8 = java.util.Arrays.spliterator(intArray3);
        java.util.function.IntUnaryOperator intUnaryOperator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSetAll(intArray3, intUnaryOperator9);
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
        org.junit.Assert.assertNotNull(ofInt8);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.function.LongBinaryOperator longBinaryOperator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(longArray3, (int) ' ', (int) ' ', longBinaryOperator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray3, (int) (byte) 0, (int) (byte) 1);
        java.util.function.IntUnaryOperator intUnaryOperator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(intArray3, intUnaryOperator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.lang.String str8 = java.util.Arrays.toString(longArray7);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[3, 1, 0, 0, 0, 0, 0, 0, 0]" + "'", str8, "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        long[] longArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfLong ofLong3 = java.util.Arrays.spliterator(longArray0, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        long[] longArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(longArray0, (-1), (int) (byte) 1, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.parallelSort(longArray3);
        java.util.function.LongBinaryOperator longBinaryOperator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(longArray3, (int) (short) 100, (-1), longBinaryOperator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        boolean[] booleanArray4 = new boolean[] { false, true, true, false };
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray7 = java.util.Arrays.copyOfRange(booleanArray4, 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1 > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, true, false]");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(strArray2, 100, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(-3)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        boolean[] booleanArray6 = new boolean[] { false, false, true, true, false, true };
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray9 = java.util.Arrays.copyOfRange(booleanArray6, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10 > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, false, true, true, false, true]");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray2, 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10 > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        int int3 = java.util.Arrays.binarySearch(byteArray1, (byte) 1);
        java.lang.String str4 = java.util.Arrays.toString(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[-1]" + "'", str4, "[-1]");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.parallelSort(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(longArray3, 10, (int) (short) -1, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(10) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.fill(byteArray4, (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(byteArray4, 2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1]");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = java.util.Arrays.copyOfRange(intArray1, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int int7 = java.util.Arrays.binarySearch(byteArray3, (int) (short) 100, 5, (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(5)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 100, 100]");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        long[] longArray0 = new long[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(longArray0, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Spliterator.OfLong ofLong7 = java.util.Arrays.spliterator(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = java.util.Arrays.binarySearch(longArray3, (int) (short) 10, (int) (byte) 0, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(10) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(ofLong7);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.lang.AutoCloseable[] autoCloseableArray0 = new java.lang.AutoCloseable[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator<java.lang.AutoCloseable> autoCloseableSpliterator3 = java.util.Arrays.spliterator(autoCloseableArray0, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(autoCloseableArray0);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        float[] floatArray6 = new float[] { 1L, 100.0f, (short) 0, 0.0f, 1L, 7 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(floatArray6, (int) (byte) 100, (int) (short) 10, (float) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 100.0, 0.0, 0.0, 1.0, 7.0]");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = java.util.Arrays.copyOfRange(doubleArray4, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10 > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        short[] shortArray0 = new short[] {};
        short[][] shortArray1 = new short[][] { shortArray0 };
        short[] shortArray2 = new short[] {};
        short[][] shortArray3 = new short[][] { shortArray2 };
        short[] shortArray4 = new short[] {};
        short[][] shortArray5 = new short[][] { shortArray4 };
        short[] shortArray6 = new short[] {};
        short[][] shortArray7 = new short[][] { shortArray6 };
        short[] shortArray8 = new short[] {};
        short[][] shortArray9 = new short[][] { shortArray8 };
        short[] shortArray10 = new short[] {};
        short[][] shortArray11 = new short[][] { shortArray10 };
        short[][][] shortArray12 = new short[][][] { shortArray1, shortArray3, shortArray5, shortArray7, shortArray9, shortArray11 };
        // The following exception was thrown during execution in test generation
        try {
            short[][][] shortArray15 = java.util.Arrays.copyOfRange(shortArray12, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 32 > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[]");
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[]");
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[]");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[]");
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(shortArray12);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.sort(floatArray3);
        float[] floatArray8 = java.util.Arrays.copyOf(floatArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(floatArray8, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        java.util.function.IntUnaryOperator intUnaryOperator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(intArray3, intUnaryOperator10);
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
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream3 = java.util.Arrays.stream(charSequenceArray2);
        java.lang.Class<?> wildcardClass4 = charSequenceArray2.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertNotNull(charSequenceStream3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        double[] doubleArray2 = new double[] { '#', 10L };
        java.util.function.DoubleBinaryOperator doubleBinaryOperator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(doubleArray2, doubleBinaryOperator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[35.0, 10.0]");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(charArray4, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a 4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a 4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a,  , 4, a]");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        long[] longArray6 = new long[] { 2, (short) 10, 0L, (-3), '#', (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream9 = java.util.Arrays.stream(longArray6, (int) (byte) 10, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(10) > fence(-2)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[2, 10, 0, -3, 35, 0]");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        short[] shortArray5 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray11 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray17 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray23 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray29 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray35 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[][] shortArray36 = new short[][] { shortArray5, shortArray11, shortArray17, shortArray23, shortArray29, shortArray35 };
        java.util.Spliterator<short[]> shortArraySpliterator37 = java.util.Arrays.spliterator(shortArray36);
        java.lang.Object[] objArray38 = null;
        boolean boolean39 = java.util.Arrays.deepEquals((java.lang.Object[]) shortArray36, objArray38);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray35), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertNotNull(shortArraySpliterator37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = new long[] { 7, 3 };
        boolean boolean8 = java.util.Arrays.equals(longArray3, longArray7);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[7, 3]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(intArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = new double[] { (short) 10, 10.0f };
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray7, (int) (short) 100);
        int int13 = java.util.Arrays.binarySearch(doubleArray9, 5, 10, (double) (byte) 0);
        boolean boolean14 = java.util.Arrays.equals(doubleArray2, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.lang.String str4 = java.util.Arrays.toString(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[100]" + "'", str4, "[100]");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray6 = java.util.Arrays.copyOf(longArray3, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.util.Arrays.binarySearch(intArray0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        int int3 = java.util.Arrays.binarySearch(byteArray1, (byte) 1);
        byte[] byteArray5 = java.util.Arrays.copyOf(byteArray1, (int) (short) 0);
        byte[] byteArray7 = new byte[] { (byte) 1 };
        byte[] byteArray10 = java.util.Arrays.copyOfRange(byteArray7, (int) (short) 1, 2);
        boolean boolean11 = java.util.Arrays.equals(byteArray1, byteArray10);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray3, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(intArray3, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream3 = java.util.Arrays.stream(charSequenceArray2);
        java.lang.Class<?> wildcardClass4 = charSequenceArray2.getClass();
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream8 = java.util.Arrays.stream(charSequenceArray7);
        java.lang.Class<?> wildcardClass9 = charSequenceArray7.getClass();
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream13 = java.util.Arrays.stream(charSequenceArray12);
        java.lang.Class<?> wildcardClass14 = charSequenceArray12.getClass();
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream18 = java.util.Arrays.stream(charSequenceArray17);
        java.lang.Class<?> wildcardClass19 = charSequenceArray17.getClass();
        java.lang.Class[] classArray21 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray22 = (java.lang.Class<?>[]) classArray21;
        wildcardClassArray22[0] = wildcardClass4;
        wildcardClassArray22[1] = wildcardClass9;
        wildcardClassArray22[2] = wildcardClass14;
        wildcardClassArray22[3] = wildcardClass19;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator<java.lang.Class<?>> wildcardClassSpliterator33 = java.util.Arrays.spliterator(wildcardClassArray22, (-3), (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertNotNull(charSequenceStream3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(charSequenceStream8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(charSequenceStream13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertNotNull(charSequenceStream18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        boolean[] booleanArray2 = new boolean[] { true, true };
        boolean[] booleanArray9 = new boolean[] { true, true, false, false, true, true };
        boolean boolean10 = java.util.Arrays.equals(booleanArray2, booleanArray9);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[true, true]");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[true, true, false, false, true, true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = new double[] { (short) 10, 10.0f };
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray7, (int) (short) 100);
        boolean boolean10 = java.util.Arrays.equals(doubleArray4, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        boolean[] booleanArray6 = new boolean[] { false, false, true, true, true, false };
        java.lang.String str7 = java.util.Arrays.toString(booleanArray6);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, false, true, true, true, false]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[false, false, true, true, true, false]" + "'", str7, "[false, false, true, true, true, false]");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream3 = java.util.Arrays.stream(charSequenceArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort((java.lang.Object[]) charSequenceArray2, (-2), 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertNotNull(charSequenceStream3);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        int int7 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        int int9 = java.util.Arrays.binarySearch(floatArray3, (float) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray12 = java.util.Arrays.copyOfRange(floatArray3, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100 > 1");
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
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray2);
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = java.util.Arrays.binarySearch((java.lang.Object[]) strArray2, 5, (int) (short) 1, obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(5) > toIndex(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        short[] shortArray5 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray11 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray17 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray23 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray29 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray35 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[][] shortArray36 = new short[][] { shortArray5, shortArray11, shortArray17, shortArray23, shortArray29, shortArray35 };
        java.util.Spliterator<short[]> shortArraySpliterator37 = java.util.Arrays.spliterator(shortArray36);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort((java.lang.Object[]) shortArray36, (int) '#', 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(35) > toIndex(5)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray35), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertNotNull(shortArraySpliterator37);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = java.util.Arrays.binarySearch(floatArray3, (-1), (int) (short) -1, (float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.stream.IntStream intStream4 = java.util.Arrays.stream(intArray3);
        int[] intArray6 = new int[] { 100 };
        int[] intArray8 = java.util.Arrays.copyOf(intArray6, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray8, (int) (byte) 0, (int) (byte) 1);
        java.util.Spliterator.OfInt ofInt14 = java.util.Arrays.spliterator(intArray8, (int) (byte) 1, 10);
        double[] doubleArray20 = new double[] { (short) 10, 10.0f };
        double[] doubleArray22 = java.util.Arrays.copyOf(doubleArray20, (int) (short) 100);
        int int26 = java.util.Arrays.binarySearch(doubleArray22, 5, 10, (double) (byte) 0);
        java.lang.Object[] objArray27 = new java.lang.Object[] { intArray3, intArray8, '#', 7, 0L, (byte) 0 };
        byte[] byteArray31 = new byte[] { (byte) 1 };
        byte[] byteArray34 = java.util.Arrays.copyOfRange(byteArray31, (int) (short) 1, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = java.util.Arrays.binarySearch(objArray27, 7, 7, (java.lang.Object) byteArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofInt14);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 7 + "'", int26 == 7);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0], [100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0], #, 7, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[1]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[0]");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.lang.String str5 = java.util.Arrays.toString(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[10.0, 10.0]" + "'", str5, "[10.0, 10.0]");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.sort(floatArray3);
        float[] floatArray8 = java.util.Arrays.copyOf(floatArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray10 = java.util.Arrays.copyOf(floatArray8, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(doubleArray4, (-2), 0, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray3, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfInt ofInt9 = java.util.Arrays.spliterator(intArray3, (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(10) > fence(1)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        short[] shortArray6 = new short[] { (short) 1, (byte) 0, (byte) 0, (byte) 100, (byte) 0, (short) 100 };
        int int8 = java.util.Arrays.binarySearch(shortArray6, (short) (byte) 100);
        short[] shortArray9 = new short[] {};
        int int11 = java.util.Arrays.binarySearch(shortArray9, (short) 1);
        boolean boolean12 = java.util.Arrays.equals(shortArray6, shortArray9);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[1, 0, 0, 100, 0, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        double[] doubleArray2 = new double[] { 10, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(doubleArray2, 1, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(1) > toIndex(-2)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 1.0]");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        float[] floatArray6 = new float[] { 100L, (short) 1, (-2), '4', (-2), (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(floatArray6, (int) ' ', (int) (short) 100, (float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[100.0, 1.0, -2.0, 52.0, -2.0, 10.0]");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        short[] shortArray6 = new short[] { (byte) -1, (byte) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
        java.util.Arrays.parallelSort(shortArray6);
        short[] shortArray9 = new short[] { (byte) 100 };
        boolean boolean10 = java.util.Arrays.equals(shortArray6, shortArray9);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        java.util.Arrays.sort(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray13 = java.util.Arrays.copyOf(charArray4, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , 4, a, a]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        java.util.Arrays.sort(doubleArray4);
        java.lang.String str10 = java.util.Arrays.toString(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0]" + "'", str10, "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0]");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        byte[] byteArray0 = null;
        java.lang.String str1 = java.util.Arrays.toString(byteArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null" + "'", str1, "null");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 32 > 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a 4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a 4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a,  , 4, a]");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfLong ofLong10 = java.util.Arrays.spliterator(longArray7, (int) '4', 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(52) > fence(5)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray10 = java.util.Arrays.copyOfRange(longArray3, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(shortArray0, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
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
        float[] floatArray27 = new float[] { (-1), (short) -1, '4' };
        int int29 = java.util.Arrays.binarySearch(floatArray27, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = java.util.Arrays.binarySearch((java.lang.Object[]) charSequenceBaseStreamArray14, (java.lang.Object) floatArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.stream.ReferencePipeline$Head cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[-1.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-3) + "'", int29 == (-3));
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.parallelSort(floatArray3);
        java.util.Arrays.fill(floatArray3, (float) ' ');
        java.lang.String str9 = java.util.Arrays.toString(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[32.0, 32.0, 32.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[32.0, 32.0, 32.0]" + "'", str9, "[32.0, 32.0, 32.0]");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = java.util.Arrays.copyOfRange(doubleArray7, 5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 5 > -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong8 = java.util.Arrays.spliterator(longArray7);
        java.util.function.IntToLongFunction intToLongFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(longArray7, intToLongFunction9);
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
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(doubleArray4, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(10) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        byte[] byteArray3 = new byte[] { (byte) 0 };
        byte[] byteArray5 = new byte[] { (byte) 0 };
        byte[][] byteArray6 = new byte[][] { byteArray1, byteArray3, byteArray5 };
        java.util.stream.Stream<byte[]> byteArrayStream7 = java.util.Arrays.stream(byteArray6);
        short[] shortArray13 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray19 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray25 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray31 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray37 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray43 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[][] shortArray44 = new short[][] { shortArray13, shortArray19, shortArray25, shortArray31, shortArray37, shortArray43 };
        java.util.Spliterator<short[]> shortArraySpliterator45 = java.util.Arrays.spliterator(shortArray44);
        boolean boolean46 = java.util.Arrays.equals((java.lang.Object[]) byteArray6, (java.lang.Object[]) shortArray44);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArrayStream7);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray25), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray31), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray37), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray43), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertNotNull(shortArraySpliterator45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(shortArray0, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.fill(byteArray4, (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = java.util.Arrays.binarySearch(byteArray4, (int) 'a', (int) '4', (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(97) > toIndex(52)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1]");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        short[] shortArray1 = new short[] {};
        int int3 = java.util.Arrays.binarySearch(shortArray1, (short) 1);
        java.util.Arrays.fill(shortArray1, (short) -1);
        java.util.Arrays.fill(shortArray1, (short) 10);
        long[] longArray13 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream14 = java.util.Arrays.stream(longArray13);
        java.util.Arrays.fill(longArray13, (long) (byte) 10);
        int int18 = java.util.Arrays.binarySearch(longArray13, (-1L));
        long[] longArray21 = java.util.Arrays.copyOfRange(longArray13, 0, (int) (byte) 0);
        int[] intArray23 = new int[] { 100 };
        int[] intArray25 = java.util.Arrays.copyOf(intArray23, (int) (short) 100);
        java.util.stream.IntStream intStream26 = java.util.Arrays.stream(intArray25);
        java.lang.Object[] objArray27 = new java.lang.Object[] { (-1.0d), (short) 10, 10.0f, "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", longArray13, intArray25 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(objArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to java.lang.Short");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intStream26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[-1.0, 10, 10.0, [100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0], [10, 10, 10], [100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]]");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        java.lang.String str9 = java.util.Arrays.toString(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[10, 10, 10]" + "'", str9, "[10, 10, 10]");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.lang.Object[] objArray0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(objArray0, 3, (int) 'a', (java.lang.Object) strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.stream.LongStream longStream7 = java.util.Arrays.stream(longArray3);
        java.lang.String str8 = java.util.Arrays.toString(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[10, 10, 10]" + "'", str8, "[10, 10, 10]");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator<java.lang.String> strSpliterator6 = java.util.Arrays.spliterator(strArray2, (-101), 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        java.util.Spliterator.OfDouble ofDouble10 = java.util.Arrays.spliterator(doubleArray7, 10, (int) '#');
        java.util.function.DoubleBinaryOperator doubleBinaryOperator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(doubleArray7, (int) (byte) 1, (-3), doubleBinaryOperator13);
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
        org.junit.Assert.assertNotNull(ofDouble10);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        short[] shortArray5 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray11 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray17 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray23 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray29 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray35 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[][] shortArray36 = new short[][] { shortArray5, shortArray11, shortArray17, shortArray23, shortArray29, shortArray35 };
        java.util.Spliterator<short[]> shortArraySpliterator37 = java.util.Arrays.spliterator(shortArray36);
        float[] floatArray43 = new float[] { (-1), (short) -1, '4' };
        int int45 = java.util.Arrays.binarySearch(floatArray43, 0.0f);
        java.util.Arrays.sort(floatArray43);
        // The following exception was thrown during execution in test generation
        try {
            int int47 = java.util.Arrays.binarySearch((java.lang.Object[]) shortArray36, (int) (short) -1, (int) (byte) 10, (java.lang.Object) floatArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray35), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertNotNull(shortArraySpliterator37);
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray43), "[-1.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-3) + "'", int45 == (-3));
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        double[] doubleArray0 = null;
        java.util.function.DoubleBinaryOperator doubleBinaryOperator1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(doubleArray0, doubleBinaryOperator1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(doubleArray4, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) 100);
        short[] shortArray6 = java.util.Arrays.copyOf(shortArray0, (int) (short) 0);
        short[] shortArray7 = new short[] {};
        int int9 = java.util.Arrays.binarySearch(shortArray7, (short) 1);
        int int11 = java.util.Arrays.binarySearch(shortArray7, (short) 100);
        short[] shortArray13 = java.util.Arrays.copyOf(shortArray7, (int) (short) 0);
        boolean boolean14 = java.util.Arrays.equals(shortArray0, shortArray7);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[]");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        double[] doubleArray6 = new double[] { (-101), 100, (-101), 7, (short) -1, 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(doubleArray6, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(10) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-101.0, 100.0, -101.0, 7.0, -1.0, 1.0]");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray11 = java.util.Arrays.copyOfRange(longArray3, (int) (short) 100, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100 > 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        java.lang.Class<?> wildcardClass7 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(strArray2, 3, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(3) > toIndex(2)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        long[] longArray5 = new long[] { 5, (-2), 0, (short) 1, 100 };
        java.util.function.IntToLongFunction intToLongFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(longArray5, intToLongFunction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[5, -2, 0, 1, 100]");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        int int12 = java.util.Arrays.binarySearch(charArray10, 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java.util.Arrays.binarySearch(charArray10, (int) ' ', (int) '4', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 52");
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
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.sort(floatArray3);
        float[] floatArray8 = java.util.Arrays.copyOf(floatArray3, 0);
        float[] floatArray12 = new float[] { 0.0f, (byte) 0, (short) 1 };
        java.util.Arrays.sort(floatArray12);
        boolean boolean14 = java.util.Arrays.equals(floatArray8, floatArray12);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[0.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        int[] intArray9 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        java.lang.Class<?> wildcardClass10 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        int int3 = java.util.Arrays.binarySearch(byteArray1, (byte) 1);
        byte[] byteArray5 = java.util.Arrays.copyOf(byteArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(byteArray1, (-1), (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(-1) > toIndex(-2)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        int[] intArray9 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        int int11 = java.util.Arrays.binarySearch(intArray3, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(intArray3, 5, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(5) > toIndex(3)");
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-101) + "'", int11 == (-101));
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        short[] shortArray6 = new short[] { (byte) -1, (byte) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
        java.util.Arrays.parallelSort(shortArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = java.util.Arrays.binarySearch(shortArray6, (int) 'a', (int) (byte) 0, (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(97) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(booleanArray7, 0, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.fill(longArray3, (long) '4');
        java.util.function.IntToLongFunction intToLongFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(longArray3, intToLongFunction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[52, 52, 52]");
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        boolean[] booleanArray0 = new boolean[] {};
        boolean[] booleanArray6 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray8 = java.util.Arrays.copyOf(booleanArray6, (int) '4');
        boolean boolean9 = java.util.Arrays.equals(booleanArray0, booleanArray8);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(intArray1, (-101), 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.parallelSort(floatArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = java.util.Arrays.binarySearch(floatArray3, (-1), (int) (short) 0, (float) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
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
        byte[] byteArray25 = new byte[] { (byte) 0 };
        byte[] byteArray27 = new byte[] { (byte) 0 };
        byte[] byteArray29 = new byte[] { (byte) 0 };
        byte[][] byteArray30 = new byte[][] { byteArray25, byteArray27, byteArray29 };
        java.util.stream.Stream<byte[]> byteArrayStream31 = java.util.Arrays.stream(byteArray30);
        boolean boolean32 = java.util.Arrays.equals((java.lang.Object[]) charSequenceBaseStreamArray14, (java.lang.Object[]) byteArray30);
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertNotNull(charSequenceStream3);
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertNotNull(charSequenceStream7);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(charSequenceStream11);
        org.junit.Assert.assertNotNull(baseStreamArray13);
        org.junit.Assert.assertNotNull(charSequenceBaseStreamArray14);
        org.junit.Assert.assertNotNull(charSequenceBaseStreamStream23);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertNotNull(byteArrayStream31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.function.IntToLongFunction intToLongFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSetAll(longArray7, intToLongFunction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        byte[] byteArray3 = new byte[] { (byte) 0 };
        byte[] byteArray5 = new byte[] { (byte) 0 };
        byte[][] byteArray6 = new byte[][] { byteArray1, byteArray3, byteArray5 };
        java.util.stream.Stream<byte[]> byteArrayStream7 = java.util.Arrays.stream(byteArray6);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray10);
        boolean boolean12 = java.util.Arrays.equals((java.lang.Object[]) byteArray6, (java.lang.Object[]) strArray10);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArrayStream7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        boolean[] booleanArray0 = new boolean[] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray2 = java.util.Arrays.copyOf(booleanArray0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 10, (byte) 1 };
        byte[][] byteArray4 = new byte[][] { byteArray3 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator<byte[]> byteArraySpliterator7 = java.util.Arrays.spliterator(byteArray4, (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(0) > fence(-1)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 10, 1]");
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray3, (int) (byte) 0, (int) (byte) 1);
        java.util.Spliterator.OfInt ofInt9 = java.util.Arrays.spliterator(intArray3, (int) (byte) 1, 10);
        java.util.function.IntBinaryOperator intBinaryOperator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(intArray3, intBinaryOperator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofInt9);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
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
        java.lang.String str24 = java.util.Arrays.deepToString((java.lang.Object[]) charSequenceBaseStreamArray14);
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertNotNull(charSequenceStream3);
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertNotNull(charSequenceStream7);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(charSequenceStream11);
        org.junit.Assert.assertNotNull(baseStreamArray13);
        org.junit.Assert.assertNotNull(charSequenceBaseStreamArray14);
        org.junit.Assert.assertNotNull(charSequenceBaseStreamStream23);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        int int3 = java.util.Arrays.binarySearch(byteArray1, (byte) 1);
        byte[] byteArray5 = java.util.Arrays.copyOf(byteArray1, (int) (short) 0);
        java.lang.String str6 = java.util.Arrays.toString(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[-1]" + "'", str6, "[-1]");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.function.LongBinaryOperator longBinaryOperator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(longArray3, (int) (short) 0, (-101), longBinaryOperator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(doubleArray7, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        float[] floatArray6 = new float[] { 1, (short) -1, '#', 0, 0L, (byte) 100 };
        java.lang.String str7 = java.util.Arrays.toString(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, -1.0, 35.0, 0.0, 0.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[1.0, -1.0, 35.0, 0.0, 0.0, 100.0]" + "'", str7, "[1.0, -1.0, 35.0, 0.0, 0.0, 100.0]");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        java.util.Spliterator.OfDouble ofDouble10 = java.util.Arrays.spliterator(doubleArray7, 10, (int) '#');
        java.util.function.DoubleBinaryOperator doubleBinaryOperator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(doubleArray7, doubleBinaryOperator11);
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
        org.junit.Assert.assertNotNull(ofDouble10);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(shortArray0, (-3), (int) (byte) 0, (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray3, (int) (byte) 0, (int) (byte) 1);
        java.util.Spliterator.OfInt ofInt9 = java.util.Arrays.spliterator(intArray3, (int) (byte) 1, 10);
        int int11 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 10);
        java.util.function.IntUnaryOperator intUnaryOperator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(intArray3, intUnaryOperator12);
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
        org.junit.Assert.assertNotNull(ofInt9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-101) + "'", int11 == (-101));
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.fill(longArray3, (long) '4');
        int int10 = java.util.Arrays.binarySearch(longArray3, 0L);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray13 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) -1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[52, 52, 52]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.fill(longArray3, (long) '4');
        int int10 = java.util.Arrays.binarySearch(longArray3, 0L);
        java.lang.String str11 = java.util.Arrays.toString(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[52, 52, 52]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[52, 52, 52]" + "'", str11, "[52, 52, 52]");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray13 = new double[] { 1.0f, 100, 100.0f, 0.0f, 1.0f };
        boolean boolean14 = java.util.Arrays.equals(doubleArray4, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        long[] longArray11 = java.util.Arrays.copyOfRange(longArray3, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray14 = java.util.Arrays.copyOfRange(longArray11, (int) (byte) 1, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1 > -2");
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
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        boolean[] booleanArray10 = java.util.Arrays.copyOfRange(booleanArray7, (int) (short) 10, (int) '#');
        boolean[] booleanArray16 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray18 = java.util.Arrays.copyOf(booleanArray16, (int) '4');
        boolean[] booleanArray20 = java.util.Arrays.copyOf(booleanArray18, 2);
        boolean boolean21 = java.util.Arrays.equals(booleanArray10, booleanArray18);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[false, false]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        java.util.Arrays.fill(charArray4, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(charArray4, 7, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        boolean[] booleanArray0 = new boolean[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(booleanArray0, 4, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(4) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
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
        java.lang.String str34 = java.util.Arrays.deepToString((java.lang.Object[]) charSequenceStreamArray22);
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
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        boolean[] booleanArray9 = java.util.Arrays.copyOf(booleanArray7, 2);
        boolean[] booleanArray11 = java.util.Arrays.copyOf(booleanArray7, (int) (short) 0);
        boolean[] booleanArray17 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray19 = java.util.Arrays.copyOf(booleanArray17, (int) '4');
        boolean[] booleanArray21 = java.util.Arrays.copyOf(booleanArray19, 2);
        boolean boolean22 = java.util.Arrays.equals(booleanArray11, booleanArray19);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false, false]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.lang.Object[] objArray0 = null;
        java.lang.String str1 = java.util.Arrays.deepToString(objArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null" + "'", str1, "null");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        boolean[] booleanArray9 = java.util.Arrays.copyOf(booleanArray7, 2);
        boolean[] booleanArray11 = java.util.Arrays.copyOf(booleanArray7, (int) (short) 0);
        java.lang.String str12 = java.util.Arrays.toString(booleanArray7);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]" + "'", str12, "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        int[] intArray6 = new int[] { '4', (short) 0, '4', (byte) 100, (-3), (byte) -1 };
        java.util.Arrays.fill(intArray6, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = java.util.Arrays.binarySearch(intArray6, (int) (short) 10, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10, 10, 10, 10, 10]");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        boolean[] booleanArray5 = new boolean[] { true, false, true, true, false };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(booleanArray5, (int) '#', 3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(35) > toIndex(3)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[true, false, true, true, false]");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.util.Arrays.binarySearch(doubleArray0, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        short[] shortArray6 = new short[] { (byte) 100, (short) 0, (byte) 10, (short) -1, (byte) 1, (byte) 0 };
        java.util.Arrays.parallelSort(shortArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(shortArray6, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 0, 0, 1, 10, 100]");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = java.util.Arrays.binarySearch((java.lang.Object[]) strArray2, 5, 100, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 100 };
        java.util.Arrays.sort(byteArray2);
        int int7 = java.util.Arrays.binarySearch(byteArray2, (int) (byte) 0, 0, (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(byteArray2, 10, 1, (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(10) > toIndex(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 100]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        byte[] byteArray6 = java.util.Arrays.copyOf(byteArray1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(byteArray1, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        java.util.Arrays.parallelSort(charArray4);
        java.lang.String str12 = java.util.Arrays.toString(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , 4, a, a]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ , 4, a, a]" + "'", str12, "[ , 4, a, a]");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        float[] floatArray3 = new float[] { 0.0f, (byte) 0, (short) 1 };
        java.util.Arrays.sort(floatArray3);
        java.lang.String str5 = java.util.Arrays.toString(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 0.0, 1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0.0, 0.0, 1.0]" + "'", str5, "[0.0, 0.0, 1.0]");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        double[] doubleArray14 = java.util.Arrays.copyOfRange(doubleArray11, 2, 100);
        double[] doubleArray17 = new double[] { (short) 10, 10.0f };
        double[] doubleArray19 = java.util.Arrays.copyOf(doubleArray17, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream20 = java.util.Arrays.stream(doubleArray19);
        java.util.Arrays.fill(doubleArray19, (double) (short) -1);
        boolean boolean23 = java.util.Arrays.equals(doubleArray11, doubleArray19);
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
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.stream.IntStream intStream4 = java.util.Arrays.stream(intArray3);
        java.lang.String str5 = java.util.Arrays.toString(intArray3);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]" + "'", str5, "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        java.util.Arrays.sort(doubleArray4);
        double[] doubleArray10 = null;
        boolean boolean11 = java.util.Arrays.equals(doubleArray4, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(shortArray0, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        int int7 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        int int9 = java.util.Arrays.binarySearch(floatArray3, (float) (byte) 10);
        java.lang.String str10 = java.util.Arrays.toString(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-3) + "'", int7 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[-1.0, -1.0, 52.0]" + "'", str10, "[-1.0, -1.0, 52.0]");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort((java.lang.Object[]) charSequenceStreamArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.stream.ReferencePipeline$Head cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        byte[] byteArray6 = java.util.Arrays.copyOf(byteArray4, (int) (byte) 0);
        java.lang.String str7 = java.util.Arrays.toString(byteArray4);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0]" + "'", str7, "[0]");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        java.util.Arrays.parallelSort(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray14 = java.util.Arrays.copyOfRange(charArray4, (int) ' ', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 32 > 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , 4, a, a]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray4, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(charArray4, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4, 4, 4]");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        java.util.Arrays.sort(doubleArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream12 = java.util.Arrays.stream(doubleArray4, (int) (byte) -1, (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        java.util.Arrays.fill(charArray4, '4');
        java.lang.String str13 = java.util.Arrays.toString(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[4, 4, 4, 4]" + "'", str13, "[4, 4, 4, 4]");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        byte[] byteArray3 = new byte[] { (byte) 0 };
        byte[] byteArray5 = new byte[] { (byte) 0 };
        byte[][] byteArray6 = new byte[][] { byteArray1, byteArray3, byteArray5 };
        java.util.stream.Stream<byte[]> byteArrayStream7 = java.util.Arrays.stream(byteArray6);
        java.lang.String str8 = java.util.Arrays.deepToString((java.lang.Object[]) byteArray6);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArrayStream7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[[0], [0], [0]]" + "'", str8, "[[0], [0], [0]]");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.parallelSort(floatArray3);
        java.util.Arrays.fill(floatArray3, (float) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(floatArray3, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[32.0, 32.0, 32.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        int[] intArray0 = new int[] {};
        java.util.stream.IntStream intStream1 = java.util.Arrays.stream(intArray0);
        java.util.function.IntUnaryOperator intUnaryOperator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(intArray0, intUnaryOperator2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intStream1);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator7 = java.util.Arrays.spliterator((java.lang.CharSequence[]) strArray2, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfLong ofLong9 = java.util.Arrays.spliterator(longArray3, (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 100, 100]");
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        java.lang.String str7 = java.util.Arrays.toString(byteArray4);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0]" + "'", str7, "[0]");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        float[] floatArray1 = new float[] { (-1L) };
        int int3 = java.util.Arrays.binarySearch(floatArray1, (float) (short) -1);
        java.util.Arrays.sort(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(floatArray1, (int) (byte) 0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.parallelSort(floatArray3);
        int int8 = java.util.Arrays.binarySearch(floatArray3, (float) 10L);
        float[] floatArray12 = new float[] { (-1), (short) -1, '4' };
        int int14 = java.util.Arrays.binarySearch(floatArray12, 0.0f);
        java.util.Arrays.sort(floatArray12);
        float[] floatArray17 = java.util.Arrays.copyOf(floatArray12, 0);
        java.util.Arrays.fill(floatArray12, (-1.0f));
        boolean boolean20 = java.util.Arrays.equals(floatArray3, floatArray12);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-3) + "'", int8 == (-3));
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[-1.0, -1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3) + "'", int14 == (-3));
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        int[] intArray5 = new int[] { '4', 5, (-101), 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream8 = java.util.Arrays.stream(intArray5, (-2), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 5, -101, 0, 100]");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        float[] floatArray1 = new float[] { (short) 100 };
        float[] floatArray3 = new float[] { (short) 100 };
        float[] floatArray5 = new float[] { (short) 100 };
        float[] floatArray7 = new float[] { (short) 100 };
        float[][] floatArray8 = new float[][] { floatArray1, floatArray3, floatArray5, floatArray7 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator<float[]> floatArraySpliterator11 = java.util.Arrays.spliterator(floatArray8, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[100.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[100.0]");
        org.junit.Assert.assertNotNull(floatArray8);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.fill(byteArray4, (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(byteArray4, (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1]");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.sort(floatArray3);
        float[] floatArray8 = java.util.Arrays.copyOf(floatArray3, 0);
        java.util.Arrays.fill(floatArray3, (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray13 = java.util.Arrays.copyOfRange(floatArray3, 5, (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 5 > -11");
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
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream10 = java.util.Arrays.stream(doubleArray4, (int) (short) 100, (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(100) > fence(-11)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        boolean[] booleanArray10 = java.util.Arrays.copyOfRange(booleanArray7, (int) (short) 10, (int) '#');
        boolean[] booleanArray16 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray18 = java.util.Arrays.copyOf(booleanArray16, (int) '4');
        boolean[] booleanArray20 = java.util.Arrays.copyOf(booleanArray18, 2);
        boolean boolean21 = java.util.Arrays.equals(booleanArray10, booleanArray20);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[false, false]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        java.util.Arrays.fill(charArray4, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(charArray4, (-1), (int) (short) 1, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        short[] shortArray6 = new short[] { (byte) -1, (short) 10, (byte) 0, (byte) 100, (short) 0, (byte) 1 };
        short[] shortArray9 = new short[] { (short) 10, (short) 1 };
        java.util.Arrays.fill(shortArray9, (short) (byte) 1);
        boolean boolean12 = java.util.Arrays.equals(shortArray6, shortArray9);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 10, 0, 100, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 100 };
        java.util.Arrays.sort(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = java.util.Arrays.binarySearch(byteArray2, (int) (short) -1, (-101), (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(-1) > toIndex(-101)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 100]");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        float[] floatArray1 = new float[] { (-1L) };
        int int3 = java.util.Arrays.binarySearch(floatArray1, (float) (short) -1);
        java.util.Arrays.sort(floatArray1);
        java.util.Arrays.fill(floatArray1, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(floatArray1, (-101), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -101");
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
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(charArray10, (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a 4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a 4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a,  , 4, a]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        float[] floatArray1 = new float[] { (-1L) };
        int int3 = java.util.Arrays.binarySearch(floatArray1, (float) (short) -1);
        java.util.Arrays.sort(floatArray1);
        java.util.Arrays.fill(floatArray1, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(floatArray1, (int) ' ', (-11), (float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(32) > toIndex(-11)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray4, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(charArray4, (int) (short) 100, (int) (byte) 1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4, 4, 4]");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        int[] intArray9 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        int int11 = java.util.Arrays.binarySearch(intArray3, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(intArray3, 5, (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(5) > toIndex(-1)");
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-101) + "'", int11 == (-101));
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        long[] longArray0 = new long[] {};
        int int2 = java.util.Arrays.binarySearch(longArray0, (long) '#');
        java.util.function.LongBinaryOperator longBinaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(longArray0, (int) (byte) 100, (int) (short) 100, longBinaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        long[] longArray1 = new long[] { ' ' };
        java.util.stream.LongStream longStream2 = java.util.Arrays.stream(longArray1);
        java.util.Arrays.fill(longArray1, (long) (-101));
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(longArray1, (int) '#', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(35) > toIndex(4)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[-101]");
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray12 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray12, (int) (byte) 1, 3);
        boolean boolean16 = java.util.Arrays.equals(charArray4, charArray12);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a 4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a 4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a,  , 4, a]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a 4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a 4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a,  , 4, a]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        short[] shortArray1 = new short[] { (short) 1 };
        java.util.Arrays.parallelSort(shortArray1, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(shortArray1, 10, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(10) > toIndex(-2)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        long[] longArray1 = new long[] { ' ' };
        java.util.stream.LongStream longStream2 = java.util.Arrays.stream(longArray1);
        java.util.Arrays.fill(longArray1, (long) (-101));
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray7 = java.util.Arrays.copyOfRange(longArray1, 5, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 5 > -4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[-101]");
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        java.util.function.IntBinaryOperator intBinaryOperator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(intArray3, 5, 0, intBinaryOperator12);
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
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        java.util.Arrays.sort(doubleArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfDouble ofDouble12 = java.util.Arrays.spliterator(doubleArray4, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(97) > fence(0)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.parallelSort(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(charArray4, (int) (short) -1, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(-1) > toIndex(-4)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , 4, a, a]");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.sort(floatArray3);
        float[] floatArray8 = java.util.Arrays.copyOf(floatArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(floatArray3, (int) (byte) 0, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-4)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong8 = java.util.Arrays.spliterator(longArray7);
        java.util.Arrays.parallelSort(longArray7);
        int int13 = java.util.Arrays.binarySearch(longArray7, 1, 4, (long) 3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfLong ofLong16 = java.util.Arrays.spliterator(longArray7, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
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
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(shortArray0, (-2), (int) (byte) -1);
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
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        int[] intArray9 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        int int11 = java.util.Arrays.binarySearch(intArray3, (int) 'a');
        java.util.Spliterator.OfInt ofInt12 = java.util.Arrays.spliterator(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream15 = java.util.Arrays.stream(intArray3, (int) 'a', (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(97) > fence(-101)");
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
        org.junit.Assert.assertNotNull(ofInt12);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.parallelSort(floatArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = java.util.Arrays.binarySearch(floatArray3, 7, (-101), (float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(7) > toIndex(-101)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream3 = java.util.Arrays.stream(charSequenceArray2);
        java.lang.String str4 = java.util.Arrays.deepToString((java.lang.Object[]) charSequenceArray2);
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertNotNull(charSequenceStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[hi!, ]" + "'", str4, "[hi!, ]");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray10 = new double[] { (short) 10, 10.0f };
        double[] doubleArray12 = java.util.Arrays.copyOf(doubleArray10, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream13 = java.util.Arrays.stream(doubleArray12);
        boolean boolean14 = java.util.Arrays.equals(doubleArray4, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        char[] charArray15 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray15, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray15, '#');
        boolean boolean21 = java.util.Arrays.equals(charArray10, charArray15);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a 4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a 4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a,  , 4, a]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[#, #, #, #]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        short[] shortArray6 = new short[] { (byte) -1, (byte) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
        java.util.Arrays.parallelSort(shortArray6);
        java.util.Arrays.sort(shortArray6);
        short[] shortArray10 = java.util.Arrays.copyOf(shortArray6, 100);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray13 = java.util.Arrays.copyOfRange(shortArray6, (int) '4', (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 52 > -11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(intArray3, (int) (byte) 100, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(7)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        short[] shortArray6 = new short[] { (short) 1, (byte) 100, (byte) -1, (short) 0, (byte) 10, (byte) 10 };
        short[] shortArray13 = new short[] { (short) 1, (byte) 100, (byte) -1, (short) 0, (byte) 10, (byte) 10 };
        short[][] shortArray14 = new short[][] { shortArray6, shortArray13 };
        java.util.List<short[]> shortArrayList15 = java.util.Arrays.asList(shortArray14);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = java.util.Arrays.binarySearch((java.lang.Object[]) shortArray14, (java.lang.Object) "[-1.0, -1.0, 52.0]");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [S cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[1, 100, -1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[1, 100, -1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(shortArrayList15);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.fill(intArray3, (int) (short) 1);
        java.util.function.IntUnaryOperator intUnaryOperator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSetAll(intArray3, intUnaryOperator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        java.util.Spliterator.OfDouble ofDouble11 = java.util.Arrays.spliterator(doubleArray4, (int) '4', 100);
        int int15 = java.util.Arrays.binarySearch(doubleArray4, (int) (byte) 10, (int) (byte) 10, (double) (byte) 100);
        java.util.function.IntToDoubleFunction intToDoubleFunction16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(doubleArray4, intToDoubleFunction16);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-11) + "'", int15 == (-11));
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        byte[] byteArray6 = java.util.Arrays.copyOf(byteArray1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(byteArray6, (int) 'a', (-11), (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(97) > toIndex(-11)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        java.util.function.IntUnaryOperator intUnaryOperator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSetAll(intArray3, intUnaryOperator10);
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
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        int int7 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        int int9 = java.util.Arrays.binarySearch(floatArray3, (float) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray12 = java.util.Arrays.copyOfRange(floatArray3, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100 > -1");
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
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        int[] intArray9 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        int int11 = java.util.Arrays.binarySearch(intArray3, (int) 'a');
        java.lang.Class<?> wildcardClass12 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-101) + "'", int11 == (-101));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.function.IntToLongFunction intToLongFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(longArray3, intToLongFunction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        int[] intArray9 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        int int11 = java.util.Arrays.binarySearch(intArray3, (int) 'a');
        java.util.function.IntBinaryOperator intBinaryOperator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(intArray3, 3, (int) (short) 100, intBinaryOperator14);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-101) + "'", int11 == (-101));
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int11 = java.util.Arrays.binarySearch(doubleArray4, (int) '4', (int) '#', (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(52) > toIndex(35)");
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
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(byteArray3, (-11), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 1, 1]");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(intArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        char[] charArray15 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray15, (int) (byte) 1, 3);
        char[] charArray21 = java.util.Arrays.copyOfRange(charArray15, (int) (byte) 0, (int) (byte) 0);
        boolean boolean22 = java.util.Arrays.equals(charArray10, charArray21);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a 4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a 4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a,  , 4, a]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "a 4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "a 4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[a,  , 4, a]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.util.List<java.lang.reflect.Type> typeList1 = java.util.Arrays.asList(typeArray0);
        java.lang.String str2 = java.util.Arrays.deepToString((java.lang.Object[]) typeArray0);
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(typeList1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        java.lang.String str8 = java.util.Arrays.toString(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]" + "'", str8, "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(doubleArray11, (-2), (int) (short) 1, (double) 10.0f);
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
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int6 = java.util.Arrays.binarySearch(doubleArray2, (double) (short) -1);
        java.util.Arrays.sort(doubleArray2);
        java.lang.String str8 = java.util.Arrays.toString(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[10.0, 10.0]" + "'", str8, "[10.0, 10.0]");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        java.util.Spliterator.OfDouble ofDouble11 = java.util.Arrays.spliterator(doubleArray4, (int) '4', 100);
        java.util.function.IntToDoubleFunction intToDoubleFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSetAll(doubleArray4, intToDoubleFunction12);
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
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        java.util.Spliterator.OfDouble ofDouble11 = java.util.Arrays.spliterator(doubleArray4, (int) '4', 100);
        double[] doubleArray14 = java.util.Arrays.copyOfRange(doubleArray4, 0, (int) (byte) 100);
        java.lang.String str15 = java.util.Arrays.toString(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertNotNull(ofDouble11);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]" + "'", str15, "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        int[] intArray6 = new int[] { '4', (short) 0, '4', (byte) 100, (-3), (byte) -1 };
        java.util.Arrays.fill(intArray6, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(intArray6, (int) ' ', 5, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(32) > toIndex(5)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10, 10, 10, 10, 10]");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        int int6 = java.util.Arrays.binarySearch(byteArray1, (byte) 0);
        java.util.Arrays.parallelSort(byteArray1);
        java.lang.String str8 = java.util.Arrays.toString(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[1]" + "'", str8, "[1]");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int[] intArray11 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray11);
        int[] intArray14 = new int[] { 100 };
        int[] intArray16 = java.util.Arrays.copyOf(intArray14, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray14);
        java.util.Arrays.fill(intArray14, 5);
        java.util.Arrays.fill(intArray14, (-3));
        boolean boolean22 = java.util.Arrays.equals(intArray11, intArray14);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-3]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        java.util.Spliterator.OfDouble ofDouble11 = java.util.Arrays.spliterator(doubleArray4, (int) '4', 100);
        double[] doubleArray14 = java.util.Arrays.copyOfRange(doubleArray4, 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(doubleArray14, 3, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(3) > toIndex(1)");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.parallelSort(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream10 = java.util.Arrays.stream(longArray3, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(35) > fence(-1)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        java.util.Arrays.parallelSort(longArray3);
        int int11 = java.util.Arrays.binarySearch(longArray3, (long) 2);
        java.util.function.LongBinaryOperator longBinaryOperator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(longArray3, (int) (byte) 1, (int) (short) -1, longBinaryOperator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) 100);
        java.util.Arrays.parallelSort(shortArray0);
        short[] shortArray12 = new short[] { (byte) -1, (byte) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
        java.util.Arrays.parallelSort(shortArray12);
        java.util.Arrays.sort(shortArray12);
        short[] shortArray16 = java.util.Arrays.copyOf(shortArray12, 100);
        java.util.Arrays.sort(shortArray16);
        boolean boolean18 = java.util.Arrays.equals(shortArray0, shortArray16);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[-1, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Spliterator.OfInt ofInt8 = java.util.Arrays.spliterator(intArray3);
        java.util.Arrays.sort(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfInt ofInt12 = java.util.Arrays.spliterator(intArray3, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(100) > fence(-1)");
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
        org.junit.Assert.assertNotNull(ofInt8);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int[] intArray11 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        java.lang.String str12 = java.util.Arrays.toString(intArray11);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]" + "'", str12, "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong8 = java.util.Arrays.spliterator(longArray7);
        java.util.Arrays.parallelSort(longArray7);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[0, 0, 0, 0, 0, 0, 0, 1, 3]");
        org.junit.Assert.assertNotNull(ofLong8);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(doubleArray2, (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        long[] longArray9 = java.util.Arrays.copyOf(longArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray12 = java.util.Arrays.copyOfRange(longArray3, (int) (short) 10, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10 > -100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[]");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        boolean[] booleanArray10 = java.util.Arrays.copyOfRange(booleanArray7, (int) (short) 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray13 = java.util.Arrays.copyOfRange(booleanArray7, (-101), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(intArray0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(doubleArray0, (-2), 0, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
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
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray37);
        java.util.Arrays.parallelSort(strArray37);
        java.util.Arrays.sort((java.lang.Object[]) strArray37);
        boolean boolean41 = java.util.Arrays.equals((java.lang.Object[]) charSequenceStreamArray22, (java.lang.Object[]) strArray37);
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
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.parallelSort(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = java.util.Arrays.binarySearch(byteArray4, 7, (int) 'a', (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray1);
        java.util.Arrays.fill(intArray1, 5);
        java.lang.Class<?> wildcardClass7 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[5]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        byte[] byteArray6 = java.util.Arrays.copyOf(byteArray1, (int) ' ');
        java.lang.String str7 = java.util.Arrays.toString(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[1]" + "'", str7, "[1]");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        java.util.function.IntToDoubleFunction intToDoubleFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(doubleArray9, intToDoubleFunction12);
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
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = new double[] { (short) 10, 10.0f };
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray7, (int) (short) 100);
        double[] doubleArray12 = java.util.Arrays.copyOfRange(doubleArray9, 2, (int) 'a');
        double[] doubleArray14 = java.util.Arrays.copyOf(doubleArray9, (int) 'a');
        boolean boolean15 = java.util.Arrays.equals(doubleArray4, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        double[] doubleArray14 = java.util.Arrays.copyOfRange(doubleArray11, 2, 100);
        double[] doubleArray16 = java.util.Arrays.copyOf(doubleArray11, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = java.util.Arrays.copyOfRange(doubleArray11, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 32 > 0");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(doubleArray4, (int) (short) 10, (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(10) > toIndex(-101)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        int int7 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        int int9 = java.util.Arrays.binarySearch(floatArray3, (float) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(floatArray3, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
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
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.sort(floatArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(floatArray3, (int) (short) 0, 10, (float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        int int7 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray10 = java.util.Arrays.copyOfRange(floatArray3, (int) '4', (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 52 > -100");
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
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.function.LongBinaryOperator longBinaryOperator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(longArray3, (int) (byte) 10, 0, longBinaryOperator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        short[] shortArray3 = new short[] { (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(shortArray3, 5, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(5) > toIndex(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[-1, -1, 100]");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        double[] doubleArray14 = java.util.Arrays.copyOfRange(doubleArray11, 2, 100);
        double[] doubleArray16 = java.util.Arrays.copyOf(doubleArray11, (int) '#');
        double[] doubleArray17 = new double[] {};
        boolean boolean18 = java.util.Arrays.equals(doubleArray16, doubleArray17);
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
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray1);
        java.util.Arrays.fill(intArray1, 5);
        java.util.Arrays.fill(intArray1, (-3));
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfInt ofInt11 = java.util.Arrays.spliterator(intArray1, 5, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(5) > fence(1)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-3]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        boolean[] booleanArray9 = java.util.Arrays.copyOf(booleanArray7, 2);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray12 = java.util.Arrays.copyOfRange(booleanArray9, (-101), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false]");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        boolean[] booleanArray10 = java.util.Arrays.copyOfRange(booleanArray7, (int) (short) 0, (int) '#');
        java.lang.String str11 = java.util.Arrays.toString(booleanArray7);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]" + "'", str11, "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        int[] intArray6 = new int[] { '4', (short) 0, '4', (byte) 100, (-3), (byte) -1 };
        java.util.Arrays.fill(intArray6, (int) (byte) 10);
        java.util.stream.IntStream intStream9 = java.util.Arrays.stream(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = java.util.Arrays.copyOfRange(intArray6, (-11), (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10, 10, 10, 10, 10]");
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Arrays.sort(longArray7, 3, 3);
        java.util.function.LongBinaryOperator longBinaryOperator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(longArray7, longBinaryOperator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        short[] shortArray5 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray11 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray17 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray23 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray29 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray35 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[][] shortArray36 = new short[][] { shortArray5, shortArray11, shortArray17, shortArray23, shortArray29, shortArray35 };
        java.util.Spliterator<short[]> shortArraySpliterator37 = java.util.Arrays.spliterator(shortArray36);
        java.util.Spliterator[] spliteratorArray39 = new java.util.Spliterator[1];
        @SuppressWarnings("unchecked")
        java.util.Spliterator<short[]>[] shortArraySpliteratorArray40 = (java.util.Spliterator<short[]>[]) spliteratorArray39;
        shortArraySpliteratorArray40[0] = shortArraySpliterator37;
        java.util.stream.Stream<java.util.Spliterator<short[]>> shortArraySpliteratorStream43 = java.util.Arrays.stream(shortArraySpliteratorArray40);
        double[] doubleArray46 = new double[] { (short) 10, 10.0f };
        double[] doubleArray48 = java.util.Arrays.copyOf(doubleArray46, (int) (short) 100);
        double[] doubleArray51 = java.util.Arrays.copyOfRange(doubleArray48, 2, (int) 'a');
        java.util.Spliterator.OfDouble ofDouble54 = java.util.Arrays.spliterator(doubleArray51, 10, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill((java.lang.Object[]) shortArraySpliteratorArray40, (java.lang.Object) doubleArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: [D");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray35), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertNotNull(shortArraySpliterator37);
        org.junit.Assert.assertNotNull(spliteratorArray39);
        org.junit.Assert.assertNotNull(shortArraySpliteratorArray40);
        org.junit.Assert.assertNotNull(shortArraySpliteratorStream43);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(ofDouble54);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Arrays.sort(longArray7, 3, 3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfLong ofLong13 = java.util.Arrays.spliterator(longArray7, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        java.util.Spliterator.OfDouble ofDouble11 = java.util.Arrays.spliterator(doubleArray4, (int) '4', 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfDouble ofDouble14 = java.util.Arrays.spliterator(doubleArray4, (int) (byte) -1, 0);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertNotNull(ofDouble11);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.parallelSort(floatArray3);
        int int8 = java.util.Arrays.binarySearch(floatArray3, (float) 10L);
        java.util.Arrays.sort(floatArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(floatArray3, (int) (byte) 100, (int) (short) 10, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(10)");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        int int6 = java.util.Arrays.binarySearch(byteArray1, (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = java.util.Arrays.copyOfRange(byteArray1, (-2), 0);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.parallelSort(charArray4);
        java.lang.String str9 = java.util.Arrays.toString(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , 4, a, a]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ , 4, a, a]" + "'", str9, "[ , 4, a, a]");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        float[] floatArray3 = new float[] { 0.0f, (byte) 0, (short) 1 };
        java.util.Arrays.sort(floatArray3);
        float[] floatArray6 = java.util.Arrays.copyOf(floatArray3, 2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(floatArray3, (-5), (int) (byte) 10, (float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[0.0, 0.0]");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        short[] shortArray6 = new short[] { (byte) -1, (byte) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
        java.util.Arrays.parallelSort(shortArray6);
        java.util.Arrays.sort(shortArray6);
        short[] shortArray10 = java.util.Arrays.copyOf(shortArray6, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(shortArray10, (-100), 7, (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        float[] floatArray3 = new float[] { (-1L), 10.0f, 2 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(floatArray3, (int) (short) 100, (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(-5)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, 10.0, 2.0]");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill((java.lang.Object[]) charSequenceBaseStreamArray14, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.Double");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
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
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray3, (int) (byte) 0, (int) (byte) 1);
        int[] intArray8 = new int[] { 100 };
        int[] intArray10 = java.util.Arrays.copyOf(intArray8, (int) (short) 100);
        int int14 = java.util.Arrays.binarySearch(intArray10, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray10, 3);
        int[] intArray18 = java.util.Arrays.copyOf(intArray10, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray18);
        boolean boolean20 = java.util.Arrays.equals(intArray3, intArray18);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        java.util.function.IntToDoubleFunction intToDoubleFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(doubleArray9, intToDoubleFunction10);
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
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream3 = java.util.Arrays.stream(charSequenceArray2);
        java.util.stream.Stream<java.lang.Object> objStream4 = java.util.Arrays.stream((java.lang.Object[]) charSequenceArray2);
        java.lang.String str5 = java.util.Arrays.deepToString((java.lang.Object[]) charSequenceArray2);
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertNotNull(charSequenceStream3);
        org.junit.Assert.assertNotNull(objStream4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[hi!, ]" + "'", str5, "[hi!, ]");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        double[] doubleArray14 = java.util.Arrays.copyOfRange(doubleArray11, 2, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(doubleArray11, (-4), (-2), (double) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -4");
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
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.fill(longArray3, (long) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(longArray3, 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(35)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[52, 52, 52]");
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.parallelSort(floatArray3);
        java.lang.String str7 = java.util.Arrays.toString(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[-1.0, -1.0, 52.0]" + "'", str7, "[-1.0, -1.0, 52.0]");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        java.util.Arrays.parallelSort(longArray3);
        int int11 = java.util.Arrays.binarySearch(longArray3, (long) 2);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = java.util.Arrays.binarySearch(longArray3, (-2), 0, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -2");
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
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        java.util.Arrays.sort(doubleArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(doubleArray4, (int) (short) -1, (-2), (double) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(-1) > toIndex(-2)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(intArray0, (-3), 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        boolean[] booleanArray10 = java.util.Arrays.copyOfRange(booleanArray7, (int) (short) 10, (int) '#');
        java.lang.String str11 = java.util.Arrays.toString(booleanArray10);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]" + "'", str11, "[false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        java.util.Arrays.parallelSort(longArray3);
        int int11 = java.util.Arrays.binarySearch(longArray3, (long) 2);
        java.util.Arrays.fill(longArray3, (long) (-5));
        java.util.Arrays.sort(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(longArray3, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream11 = java.util.Arrays.stream(doubleArray4, 3, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(3) > fence(-1)");
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
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        double[] doubleArray14 = java.util.Arrays.copyOfRange(doubleArray11, 2, 100);
        double[] doubleArray16 = java.util.Arrays.copyOf(doubleArray11, (int) '#');
        java.util.function.IntToDoubleFunction intToDoubleFunction17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(doubleArray11, intToDoubleFunction17);
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
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        double[] doubleArray14 = java.util.Arrays.copyOfRange(doubleArray11, 2, 100);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = java.util.Arrays.copyOfRange(doubleArray14, (int) (byte) 10, (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10 > -5");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        int int3 = java.util.Arrays.binarySearch(byteArray1, (byte) 1);
        byte[] byteArray5 = java.util.Arrays.copyOf(byteArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = java.util.Arrays.binarySearch(byteArray1, 3, (int) (short) -1, (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(3) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        boolean[] booleanArray10 = java.util.Arrays.copyOfRange(booleanArray7, (int) (short) 0, (int) '#');
        java.util.Arrays.fill(booleanArray7, true);
        boolean[] booleanArray18 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray20 = java.util.Arrays.copyOf(booleanArray18, (int) '4');
        boolean[] booleanArray23 = java.util.Arrays.copyOfRange(booleanArray20, (int) (short) 0, (int) '#');
        boolean boolean24 = java.util.Arrays.equals(booleanArray7, booleanArray20);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 0 };
        java.util.Arrays.parallelSort(byteArray6);
        byte[] byteArray9 = new byte[] { (byte) -1 };
        int int11 = java.util.Arrays.binarySearch(byteArray9, (byte) 1);
        byte[] byteArray13 = java.util.Arrays.copyOf(byteArray9, (int) (short) 0);
        boolean boolean14 = java.util.Arrays.equals(byteArray6, byteArray9);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 0, 1, 1, 10]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream37 = java.util.Arrays.stream(charSequenceArray36);
        java.lang.CharSequence[] charSequenceArray40 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream41 = java.util.Arrays.stream(charSequenceArray40);
        java.lang.CharSequence[] charSequenceArray44 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream45 = java.util.Arrays.stream(charSequenceArray44);
        java.lang.CharSequence[] charSequenceArray48 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream49 = java.util.Arrays.stream(charSequenceArray48);
        java.lang.CharSequence[] charSequenceArray52 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream53 = java.util.Arrays.stream(charSequenceArray52);
        java.util.stream.Stream[] streamArray55 = new java.util.stream.Stream[5];
        @SuppressWarnings("unchecked")
        java.util.stream.Stream<java.lang.CharSequence>[] charSequenceStreamArray56 = (java.util.stream.Stream<java.lang.CharSequence>[]) streamArray55;
        charSequenceStreamArray56[0] = charSequenceStream37;
        charSequenceStreamArray56[1] = charSequenceStream41;
        charSequenceStreamArray56[2] = charSequenceStream45;
        charSequenceStreamArray56[3] = charSequenceStream49;
        charSequenceStreamArray56[4] = charSequenceStream53;
        java.util.List<java.util.stream.Stream<java.lang.CharSequence>> charSequenceStreamList67 = java.util.Arrays.asList(charSequenceStreamArray56);
        java.lang.Iterable[] iterableArray69 = new java.lang.Iterable[2];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.stream.Stream<java.lang.CharSequence>>[] charSequenceStreamIterableArray70 = (java.lang.Iterable<java.util.stream.Stream<java.lang.CharSequence>>[]) iterableArray69;
        charSequenceStreamIterableArray70[0] = charSequenceStreamList33;
        charSequenceStreamIterableArray70[1] = charSequenceStreamList67;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<java.lang.Iterable<java.util.stream.Stream<java.lang.CharSequence>>> charSequenceStreamIterableStream77 = java.util.Arrays.stream(charSequenceStreamIterableArray70, (-101), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(charSequenceArray36);
        org.junit.Assert.assertNotNull(charSequenceStream37);
        org.junit.Assert.assertNotNull(charSequenceArray40);
        org.junit.Assert.assertNotNull(charSequenceStream41);
        org.junit.Assert.assertNotNull(charSequenceArray44);
        org.junit.Assert.assertNotNull(charSequenceStream45);
        org.junit.Assert.assertNotNull(charSequenceArray48);
        org.junit.Assert.assertNotNull(charSequenceStream49);
        org.junit.Assert.assertNotNull(charSequenceArray52);
        org.junit.Assert.assertNotNull(charSequenceStream53);
        org.junit.Assert.assertNotNull(streamArray55);
        org.junit.Assert.assertNotNull(charSequenceStreamArray56);
        org.junit.Assert.assertNotNull(charSequenceStreamList67);
        org.junit.Assert.assertNotNull(iterableArray69);
        org.junit.Assert.assertNotNull(charSequenceStreamIterableArray70);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        int int6 = java.util.Arrays.binarySearch(byteArray1, (byte) 0);
        java.util.Arrays.parallelSort(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(byteArray1, (-4), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) 0);
        int int8 = java.util.Arrays.binarySearch(longArray3, (long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream11 = java.util.Arrays.stream(longArray3, (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(35) > fence(1)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-4) + "'", int8 == (-4));
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        int[] intArray6 = new int[] { '4', (short) 0, '4', (byte) 100, (-3), (byte) -1 };
        java.util.Arrays.fill(intArray6, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(intArray6, 0, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10, 10, 10, 10, 10]");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        byte[] byteArray3 = new byte[] { (byte) 0 };
        byte[] byteArray5 = new byte[] { (byte) 0 };
        byte[][] byteArray6 = new byte[][] { byteArray1, byteArray3, byteArray5 };
        java.util.stream.Stream<byte[]> byteArrayStream7 = java.util.Arrays.stream(byteArray6);
        java.util.stream.Stream<byte[]> byteArrayStream8 = java.util.Arrays.stream(byteArray6);
        java.lang.String str9 = java.util.Arrays.deepToString((java.lang.Object[]) byteArray6);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArrayStream7);
        org.junit.Assert.assertNotNull(byteArrayStream8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[[0], [0], [0]]" + "'", str9, "[[0], [0], [0]]");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        java.util.Arrays.fill(shortArray0, (short) -1);
        java.util.Arrays.fill(shortArray0, (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(shortArray0, (int) '4', (int) (byte) 100, (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
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
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        char[] charArray2 = new char[] { 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(charArray2, 2, (-1), '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(2) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[a, #]");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.sort((java.lang.Object[]) strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(strArray2, 100, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(-100)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 100 };
        java.util.Arrays.sort(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(byteArray2, (int) (short) -1, (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(-1) > toIndex(-11)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 100]");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        short[] shortArray6 = new short[] { (short) 1, (byte) 0, (byte) 0, (byte) 100, (byte) 0, (short) 100 };
        int int8 = java.util.Arrays.binarySearch(shortArray6, (short) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(shortArray6, (int) (short) 100, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(-2)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[1, 0, 0, 100, 0, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        long[] longArray9 = java.util.Arrays.copyOf(longArray7, (int) '#');
        java.util.Arrays.fill(longArray9, (long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(longArray9, (int) (byte) 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(2)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100]");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream5 = java.util.Arrays.stream(doubleArray4);
        java.util.function.DoubleBinaryOperator doubleBinaryOperator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(doubleArray4, (-6), (int) (short) 10, doubleBinaryOperator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = java.util.Arrays.binarySearch(charArray4, 4, 3, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(4) > toIndex(3)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a 4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a 4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a,  , 4, a]");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        byte[] byteArray3 = new byte[] { (byte) 0 };
        byte[] byteArray5 = new byte[] { (byte) 0 };
        byte[][] byteArray6 = new byte[][] { byteArray1, byteArray3, byteArray5 };
        java.util.stream.Stream<byte[]> byteArrayStream7 = java.util.Arrays.stream(byteArray6);
        java.util.stream.Stream<byte[]> byteArrayStream8 = java.util.Arrays.stream(byteArray6);
        short[] shortArray11 = new short[] {};
        int int13 = java.util.Arrays.binarySearch(shortArray11, (short) 1);
        java.util.Arrays.fill(shortArray11, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill((java.lang.Object[]) byteArray6, (int) (short) 100, (int) (byte) -1, (java.lang.Object) shortArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArrayStream7);
        org.junit.Assert.assertNotNull(byteArrayStream8);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        java.util.Spliterator.OfDouble ofDouble11 = java.util.Arrays.spliterator(doubleArray4, (int) '4', 100);
        double[] doubleArray14 = java.util.Arrays.copyOfRange(doubleArray4, 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = java.util.Arrays.copyOfRange(doubleArray14, 0, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 0 > -3");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        double[] doubleArray4 = new double[] { (byte) 100, 10.0d, 10.0d, (-3) };
        double[] doubleArray9 = new double[] { (byte) 100, 10.0d, 10.0d, (-3) };
        double[] doubleArray14 = new double[] { (byte) 100, 10.0d, 10.0d, (-3) };
        double[] doubleArray19 = new double[] { (byte) 100, 10.0d, 10.0d, (-3) };
        double[][] doubleArray20 = new double[][] { doubleArray4, doubleArray9, doubleArray14, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<double[]> doubleArrayStream23 = java.util.Arrays.stream(doubleArray20, 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(10) > fence(-1)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0, 10.0, 10.0, -3.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 10.0, 10.0, -3.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 10.0, 10.0, -3.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 10.0, 10.0, -3.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        byte[] byteArray3 = new byte[] { (byte) 0 };
        byte[] byteArray5 = new byte[] { (byte) 0 };
        byte[][] byteArray6 = new byte[][] { byteArray1, byteArray3, byteArray5 };
        java.util.stream.Stream<byte[]> byteArrayStream7 = java.util.Arrays.stream(byteArray6);
        java.util.stream.Stream<byte[]> byteArrayStream8 = java.util.Arrays.stream(byteArray6);
        java.lang.String str9 = java.util.Arrays.toString((java.lang.Object[]) byteArray6);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArrayStream7);
        org.junit.Assert.assertNotNull(byteArrayStream8);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        double[] doubleArray14 = java.util.Arrays.copyOfRange(doubleArray11, 2, 100);
        double[] doubleArray16 = java.util.Arrays.copyOf(doubleArray11, (int) '#');
        java.util.Spliterator.OfDouble ofDouble17 = java.util.Arrays.spliterator(doubleArray11);
        java.lang.String str18 = java.util.Arrays.toString(doubleArray11);
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
        org.junit.Assert.assertNotNull(ofDouble17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]" + "'", str18, "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        byte[] byteArray6 = java.util.Arrays.copyOf(byteArray1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(byteArray6, (int) 'a', 3, (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(97) > toIndex(3)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.parallelSort(floatArray3);
        java.util.Arrays.fill(floatArray3, (float) ' ');
        float[] floatArray12 = new float[] { (-1), (short) -1, '4' };
        int int14 = java.util.Arrays.binarySearch(floatArray12, 0.0f);
        java.util.Arrays.parallelSort(floatArray12);
        int int17 = java.util.Arrays.binarySearch(floatArray12, (float) 10L);
        boolean boolean18 = java.util.Arrays.equals(floatArray3, floatArray12);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[32.0, 32.0, 32.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[-1.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3) + "'", int14 == (-3));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-3) + "'", int17 == (-3));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray13 = java.util.Arrays.copyOfRange(charArray10, 3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a 4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a 4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a,  , 4, a]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        float[] floatArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(floatArray0, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(doubleArray9, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
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
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        short[] shortArray6 = new short[] { (byte) -1, (byte) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
        java.util.Arrays.parallelSort(shortArray6);
        java.util.Arrays.sort(shortArray6);
        java.util.Arrays.parallelSort(shortArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(shortArray6, 4, (-2), (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(4) > toIndex(-2)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        boolean[] booleanArray10 = java.util.Arrays.copyOfRange(booleanArray7, (int) (short) 10, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(booleanArray10, 5, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        java.util.Spliterator.OfDouble ofDouble11 = java.util.Arrays.spliterator(doubleArray4, (int) '4', 100);
        double[] doubleArray14 = java.util.Arrays.copyOfRange(doubleArray4, 0, (int) (byte) 100);
        java.util.function.IntToDoubleFunction intToDoubleFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(doubleArray4, intToDoubleFunction15);
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
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int6 = java.util.Arrays.binarySearch(doubleArray4, (double) 3);
        java.util.function.DoubleBinaryOperator doubleBinaryOperator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(doubleArray4, 3, (int) ' ', doubleBinaryOperator9);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-101) + "'", int6 == (-101));
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray4, '#');
        char[] charArray11 = java.util.Arrays.copyOf(charArray4, (int) (byte) 1);
        char[] charArray13 = java.util.Arrays.copyOf(charArray4, 5);
        java.lang.String str14 = java.util.Arrays.toString(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "####\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "####\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, #, #, #, \000]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[#, #, #, #]" + "'", str14, "[#, #, #, #]");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
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
        long[] longArray37 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream38 = java.util.Arrays.stream(longArray37);
        java.util.Arrays.fill(longArray37, (long) (byte) 10);
        int int42 = java.util.Arrays.binarySearch(longArray37, (-1L));
        java.util.Arrays.parallelSort(longArray37);
        java.util.stream.LongStream longStream46 = java.util.Arrays.stream(longArray37, (int) (byte) 1, (int) (short) 1);
        int int48 = java.util.Arrays.binarySearch(longArray37, 0L);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = java.util.Arrays.binarySearch((java.lang.Object[]) charSequenceStreamArray22, (java.lang.Object) longArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.stream.ReferencePipeline$Head cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertNotNull(charSequenceArray14);
        org.junit.Assert.assertNotNull(charSequenceStream15);
        org.junit.Assert.assertNotNull(charSequenceArray18);
        org.junit.Assert.assertNotNull(charSequenceStream19);
        org.junit.Assert.assertNotNull(streamArray21);
        org.junit.Assert.assertNotNull(charSequenceStreamArray22);
        org.junit.Assert.assertNotNull(charSequenceStreamList33);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(longStream46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        char[] charArray3 = new char[] { 'a', '#', 'a' };
        char[][] charArray4 = new char[][] { charArray3 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<char[]> charArrayStream7 = java.util.Arrays.stream(charArray4, (-3), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #, a]");
        org.junit.Assert.assertNotNull(charArray4);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        int int6 = java.util.Arrays.binarySearch(byteArray1, (byte) 0);
        java.util.Arrays.parallelSort(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(byteArray1, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        float[] floatArray1 = new float[] { (-1L) };
        int int3 = java.util.Arrays.binarySearch(floatArray1, (float) (short) -1);
        java.util.Arrays.sort(floatArray1);
        java.util.Arrays.fill(floatArray1, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(floatArray1, (int) (short) 1, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(1) > toIndex(-4)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong8 = java.util.Arrays.spliterator(longArray7);
        java.util.function.IntToLongFunction intToLongFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSetAll(longArray7, intToLongFunction9);
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
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int[] intArray11 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(intArray11, (-100), 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -100");
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
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        int[] intArray6 = new int[] { (-101), (short) 100, 2, (-3), (-4), (-100) };
        java.util.Spliterator.OfInt ofInt7 = java.util.Arrays.spliterator(intArray6);
        java.util.function.IntUnaryOperator intUnaryOperator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(intArray6, intUnaryOperator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-101, 100, 2, -3, -4, -100]");
        org.junit.Assert.assertNotNull(ofInt7);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        java.util.Arrays.parallelSort(longArray3);
        java.util.stream.LongStream longStream12 = java.util.Arrays.stream(longArray3, (int) (byte) 1, (int) (short) 1);
        int int14 = java.util.Arrays.binarySearch(longArray3, 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(longArray3, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
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
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        long[] longArray11 = java.util.Arrays.copyOfRange(longArray3, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(longArray3, 0, 4, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 4");
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
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        java.util.Arrays.fill(shortArray0, (short) -1);
        short[] shortArray6 = java.util.Arrays.copyOf(shortArray0, 7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(shortArray6, 10, (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(10) > toIndex(-6)");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        long[] longArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray2 = java.util.Arrays.copyOf(longArray0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.parallelSort(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = java.util.Arrays.binarySearch(byteArray4, 0, (-5), (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-5)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        long[] longArray0 = null;
        java.util.function.IntToLongFunction intToLongFunction1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(longArray0, intToLongFunction1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        java.util.Spliterator.OfDouble ofDouble11 = java.util.Arrays.spliterator(doubleArray4, (int) '4', 100);
        double[] doubleArray14 = java.util.Arrays.copyOfRange(doubleArray4, 0, (int) (byte) 100);
        java.util.Arrays.parallelSort(doubleArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(doubleArray4, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(52) > toIndex(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertNotNull(ofDouble11);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        int int3 = java.util.Arrays.binarySearch(byteArray1, (byte) 1);
        byte[] byteArray5 = java.util.Arrays.copyOf(byteArray1, (int) (short) 0);
        byte[] byteArray7 = new byte[] { (byte) 1 };
        byte[] byteArray10 = java.util.Arrays.copyOfRange(byteArray7, (int) (short) 1, 2);
        java.util.Arrays.sort(byteArray7);
        java.util.Arrays.sort(byteArray7, (int) (byte) 0, (int) (short) 1);
        boolean boolean15 = java.util.Arrays.equals(byteArray5, byteArray7);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(charArray4, (-101), (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a 4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a 4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a,  , 4, a]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        boolean[] booleanArray2 = new boolean[] { true, true };
        java.util.Arrays.fill(booleanArray2, false);
        java.lang.String str5 = java.util.Arrays.toString(booleanArray2);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[false, false]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[false, false]" + "'", str5, "[false, false]");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int int11 = java.util.Arrays.binarySearch(intArray3, 1);
        java.util.Spliterator.OfInt ofInt12 = java.util.Arrays.spliterator(intArray3);
        java.util.function.IntUnaryOperator intUnaryOperator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSetAll(intArray3, intUnaryOperator13);
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
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfDouble ofDouble7 = java.util.Arrays.spliterator(doubleArray4, (-4), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        java.util.Arrays.parallelSort(shortArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(shortArray0, (-2), (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(-2) > toIndex(-3)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 100 };
        java.util.Arrays.sort(byteArray2);
        int int7 = java.util.Arrays.binarySearch(byteArray2, (int) (byte) 0, 0, (byte) 1);
        java.lang.String str8 = java.util.Arrays.toString(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 100]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        java.util.Arrays.parallelSort(longArray3);
        int int11 = java.util.Arrays.binarySearch(longArray3, (long) 2);
        java.util.Arrays.fill(longArray3, (long) (-5));
        int int15 = java.util.Arrays.binarySearch(longArray3, (long) (-2));
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(longArray3, (int) (byte) 1, 4, (long) (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-5, -5, -5]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        boolean[] booleanArray0 = new boolean[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(booleanArray0, (-2), 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        int int7 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        int int9 = java.util.Arrays.binarySearch(floatArray3, (float) (byte) 10);
        java.util.Arrays.sort(floatArray3);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray13 = java.util.Arrays.copyOfRange(floatArray3, (int) (short) -1, (int) (byte) 1);
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
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int[] intArray11 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        java.util.function.IntUnaryOperator intUnaryOperator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(intArray11, intUnaryOperator12);
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
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        java.util.Spliterator.OfDouble ofDouble10 = java.util.Arrays.spliterator(doubleArray7, 10, (int) '#');
        int int12 = java.util.Arrays.binarySearch(doubleArray7, (double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = java.util.Arrays.copyOfRange(doubleArray7, 100, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100 > 4");
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
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        short[] shortArray3 = new short[] { (short) 100, (byte) 10, (short) 0 };
        short[] shortArray6 = new short[] { (short) 10, (short) 1 };
        java.util.Arrays.fill(shortArray6, (short) (byte) 1);
        boolean boolean9 = java.util.Arrays.equals(shortArray3, shortArray6);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[100, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfLong ofLong9 = java.util.Arrays.spliterator(longArray3, 4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(4) > fence(0)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray4, '#');
        char[] charArray11 = java.util.Arrays.copyOf(charArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = java.util.Arrays.binarySearch(charArray11, 3, (-7), '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(3) > toIndex(-7)");
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
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        char[] charArray0 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(charArray0, 4, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.util.List<java.lang.reflect.Type> typeList1 = java.util.Arrays.asList(typeArray0);
        long[] longArray5 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream6 = java.util.Arrays.stream(longArray5);
        long[] longArray9 = java.util.Arrays.copyOfRange(longArray5, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong10 = java.util.Arrays.spliterator(longArray9);
        java.util.Arrays.fill((java.lang.Object[]) typeArray0, (java.lang.Object) ofLong10);
        byte[] byteArray15 = new byte[] { (byte) -1 };
        int int17 = java.util.Arrays.binarySearch(byteArray15, (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill((java.lang.Object[]) typeArray0, (-5), (int) (short) 10, (java.lang.Object) int17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(typeList1);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        long[] longArray1 = new long[] { ' ' };
        java.util.stream.LongStream longStream2 = java.util.Arrays.stream(longArray1);
        java.util.Arrays.fill(longArray1, (long) (-101));
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(longArray1, (int) (short) 100, 7, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(7)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[-101]");
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong8 = java.util.Arrays.spliterator(longArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfLong ofLong11 = java.util.Arrays.spliterator(longArray7, (-100), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -100");
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
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        int int7 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        int int9 = java.util.Arrays.binarySearch(floatArray3, (float) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray12 = java.util.Arrays.copyOfRange(floatArray3, 7, 100);
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
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = java.util.Arrays.binarySearch(intArray1, (int) '#', (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(35) > toIndex(10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.parallelSort(byteArray4);
        java.lang.String str6 = java.util.Arrays.toString(byteArray4);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[0]" + "'", str6, "[0]");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int11 = java.util.Arrays.binarySearch(doubleArray4, (-4), (int) '#', (double) (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -4");
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
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        java.util.Arrays.fill(doubleArray9, (double) 0.0f);
        java.util.function.IntToDoubleFunction intToDoubleFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(doubleArray9, intToDoubleFunction14);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) 1 };
        java.util.Arrays.fill(byteArray6, (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(byteArray6, 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, -1, -1, -1]");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        float[] floatArray0 = null;
        java.lang.String str1 = java.util.Arrays.toString(floatArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null" + "'", str1, "null");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        java.util.Arrays.parallelSort(longArray3);
        int int11 = java.util.Arrays.binarySearch(longArray3, (long) 2);
        java.util.Arrays.fill(longArray3, (long) (-5));
        int int15 = java.util.Arrays.binarySearch(longArray3, (long) (-2));
        java.util.function.IntToLongFunction intToLongFunction16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(longArray3, intToLongFunction16);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray3, (int) (byte) 0, (int) (byte) 1);
        java.util.Spliterator.OfInt ofInt7 = java.util.Arrays.spliterator(intArray3);
        int[] intArray8 = null;
        boolean boolean9 = java.util.Arrays.equals(intArray3, intArray8);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofInt7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int[] intArray11 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        int[] intArray13 = java.util.Arrays.copyOf(intArray3, 1);
        int[] intArray16 = java.util.Arrays.copyOfRange(intArray13, (int) (short) 0, 100);
        java.util.function.IntUnaryOperator intUnaryOperator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSetAll(intArray13, intUnaryOperator17);
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[3]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        int int3 = java.util.Arrays.binarySearch(byteArray1, (byte) 1);
        byte[] byteArray5 = java.util.Arrays.copyOf(byteArray1, (int) (short) 0);
        java.lang.Class<?> wildcardClass6 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = java.util.Arrays.binarySearch(charArray4, (int) '#', (-3), '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(35) > toIndex(-3)");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int int11 = java.util.Arrays.binarySearch(intArray3, 1);
        java.util.Spliterator.OfInt ofInt12 = java.util.Arrays.spliterator(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java.util.Arrays.binarySearch(intArray3, (-5), 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -5");
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(ofInt12);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong8 = java.util.Arrays.spliterator(longArray7);
        long[] longArray10 = java.util.Arrays.copyOf(longArray7, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray13 = java.util.Arrays.copyOfRange(longArray10, (int) ' ', (int) (short) 100);
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
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[3]");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        double[] doubleArray14 = java.util.Arrays.copyOfRange(doubleArray11, 2, 100);
        double[] doubleArray16 = java.util.Arrays.copyOf(doubleArray11, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream19 = java.util.Arrays.stream(doubleArray16, 2, (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(2) > fence(-11)");
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
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.sort(intArray3);
        int int10 = java.util.Arrays.binarySearch(intArray3, 5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfInt ofInt13 = java.util.Arrays.spliterator(intArray3, 100, (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(100) > fence(-6)");
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
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        byte[] byteArray8 = java.util.Arrays.copyOf(byteArray4, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(byteArray8, 3, (-3), (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(3) > toIndex(-3)");
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
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) 100);
        java.util.Arrays.sort(shortArray0);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray8 = java.util.Arrays.copyOfRange(shortArray0, (-7), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        float[] floatArray1 = new float[] { (-1L) };
        int int3 = java.util.Arrays.binarySearch(floatArray1, (float) (short) -1);
        java.lang.String str4 = java.util.Arrays.toString(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[-1.0]" + "'", str4, "[-1.0]");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        byte[] byteArray3 = new byte[] { (byte) 0 };
        byte[] byteArray5 = new byte[] { (byte) 0 };
        byte[][] byteArray6 = new byte[][] { byteArray1, byteArray3, byteArray5 };
        java.util.stream.Stream<byte[]> byteArrayStream7 = java.util.Arrays.stream(byteArray6);
        java.util.List<byte[]> byteArrayList8 = java.util.Arrays.asList(byteArray6);
        long[] longArray12 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream13 = java.util.Arrays.stream(longArray12);
        java.util.Arrays.fill(longArray12, (long) (byte) 10);
        java.util.Spliterator.OfLong ofLong16 = java.util.Arrays.spliterator(longArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = java.util.Arrays.binarySearch((java.lang.Object[]) byteArray6, (java.lang.Object) ofLong16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [B cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArrayStream7);
        org.junit.Assert.assertNotNull(byteArrayList8);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(ofLong16);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        short[] shortArray5 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray11 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray17 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray23 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray29 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray35 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[][] shortArray36 = new short[][] { shortArray5, shortArray11, shortArray17, shortArray23, shortArray29, shortArray35 };
        java.util.Spliterator<short[]> shortArraySpliterator37 = java.util.Arrays.spliterator(shortArray36);
        byte[] byteArray40 = new byte[] { (byte) 0, (byte) 100 };
        java.util.Arrays.sort(byteArray40);
        int int45 = java.util.Arrays.binarySearch(byteArray40, (int) (byte) 0, 0, (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = java.util.Arrays.binarySearch((java.lang.Object[]) shortArray36, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [S cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray35), "[0, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertNotNull(shortArraySpliterator37);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[0, 100]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        int[] intArray0 = new int[] {};
        java.util.stream.IntStream intStream1 = java.util.Arrays.stream(intArray0);
        int[] intArray3 = new int[] { 100 };
        int[] intArray5 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray5, (int) (byte) 0, (int) (byte) 1);
        java.util.Spliterator.OfInt ofInt9 = java.util.Arrays.spliterator(intArray5);
        boolean boolean10 = java.util.Arrays.equals(intArray0, intArray5);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        byte[] byteArray8 = java.util.Arrays.copyOf(byteArray4, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = java.util.Arrays.binarySearch(byteArray4, (int) '4', (int) (short) 100, (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.fill(intArray3, (int) (short) 1);
        java.util.Arrays.fill(intArray3, (int) ' ', (int) (short) 100, 0);
        int[] intArray12 = java.util.Arrays.copyOfRange(intArray3, 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java.util.Arrays.binarySearch(intArray12, 0, (-100), 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-100)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfDouble ofDouble10 = java.util.Arrays.spliterator(doubleArray7, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(100) > fence(0)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        float[] floatArray5 = new float[] { 0, (-4), 10, 3, (-3) };
        int int7 = java.util.Arrays.binarySearch(floatArray5, 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(floatArray5, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -4.0, 10.0, 3.0, -3.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-6) + "'", int7 == (-6));
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        java.util.Arrays.fill(shortArray0, (short) -1);
        java.util.Arrays.fill(shortArray0, (short) -1);
        short[] shortArray13 = new short[] { (short) 1, (byte) 0, (byte) 0, (byte) 100, (byte) 0, (short) 100 };
        int int15 = java.util.Arrays.binarySearch(shortArray13, (short) (byte) 100);
        boolean boolean16 = java.util.Arrays.equals(shortArray0, shortArray13);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[1, 0, 0, 100, 0, 100]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        boolean[] booleanArray10 = java.util.Arrays.copyOfRange(booleanArray7, (int) (short) 0, (int) '#');
        java.util.Arrays.fill(booleanArray7, true);
        boolean[] booleanArray13 = null;
        boolean boolean14 = java.util.Arrays.equals(booleanArray7, booleanArray13);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        java.util.Spliterator.OfDouble ofDouble11 = java.util.Arrays.spliterator(doubleArray4, (int) '4', 100);
        int int15 = java.util.Arrays.binarySearch(doubleArray4, (int) (byte) 10, (int) (byte) 10, (double) (byte) 100);
        java.util.function.IntToDoubleFunction intToDoubleFunction16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSetAll(doubleArray4, intToDoubleFunction16);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-11) + "'", int15 == (-11));
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        boolean[] booleanArray10 = java.util.Arrays.copyOfRange(booleanArray7, (int) (short) 10, (int) '#');
        java.util.Arrays.fill(booleanArray7, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray14 = java.util.Arrays.copyOf(booleanArray7, (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        java.util.Arrays.parallelSort(longArray3);
        java.util.stream.LongStream longStream12 = java.util.Arrays.stream(longArray3, (int) (byte) 1, (int) (short) 1);
        int int14 = java.util.Arrays.binarySearch(longArray3, 0L);
        java.util.stream.LongStream longStream15 = java.util.Arrays.stream(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(longArray3, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(32) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(longStream15);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = java.util.Arrays.binarySearch(byteArray4, (-1), (int) (short) 100, (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        java.util.Arrays.parallelSort(longArray3);
        java.util.stream.LongStream longStream12 = java.util.Arrays.stream(longArray3, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfLong ofLong15 = java.util.Arrays.spliterator(longArray3, 7, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
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
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        byte[] byteArray3 = new byte[] { (byte) 0 };
        byte[] byteArray5 = new byte[] { (byte) 0 };
        byte[][] byteArray6 = new byte[][] { byteArray1, byteArray3, byteArray5 };
        java.util.stream.Stream<byte[]> byteArrayStream7 = java.util.Arrays.stream(byteArray6);
        java.util.List<byte[]> byteArrayList8 = java.util.Arrays.asList(byteArray6);
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream12 = java.util.Arrays.stream(charSequenceArray11);
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream16 = java.util.Arrays.stream(charSequenceArray15);
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream20 = java.util.Arrays.stream(charSequenceArray19);
        java.util.stream.BaseStream[] baseStreamArray22 = new java.util.stream.BaseStream[3];
        @SuppressWarnings("unchecked")
        java.util.stream.BaseStream<java.lang.CharSequence, java.util.stream.Stream<java.lang.CharSequence>>[] charSequenceBaseStreamArray23 = (java.util.stream.BaseStream<java.lang.CharSequence, java.util.stream.Stream<java.lang.CharSequence>>[]) baseStreamArray22;
        charSequenceBaseStreamArray23[0] = charSequenceStream12;
        charSequenceBaseStreamArray23[1] = charSequenceStream16;
        charSequenceBaseStreamArray23[2] = charSequenceStream20;
        java.util.stream.Stream<java.util.stream.BaseStream<java.lang.CharSequence, java.util.stream.Stream<java.lang.CharSequence>>> charSequenceBaseStreamStream32 = java.util.Arrays.stream(charSequenceBaseStreamArray23, (int) (byte) 0, (int) (byte) 0);
        boolean boolean33 = java.util.Arrays.deepEquals((java.lang.Object[]) byteArray6, (java.lang.Object[]) charSequenceBaseStreamArray23);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArrayStream7);
        org.junit.Assert.assertNotNull(byteArrayList8);
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertNotNull(charSequenceStream12);
        org.junit.Assert.assertNotNull(charSequenceArray15);
        org.junit.Assert.assertNotNull(charSequenceStream16);
        org.junit.Assert.assertNotNull(charSequenceArray19);
        org.junit.Assert.assertNotNull(charSequenceStream20);
        org.junit.Assert.assertNotNull(baseStreamArray22);
        org.junit.Assert.assertNotNull(charSequenceBaseStreamArray23);
        org.junit.Assert.assertNotNull(charSequenceBaseStreamStream32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.parallelSort(floatArray3);
        java.util.Arrays.fill(floatArray3, (float) ' ');
        float[] floatArray12 = new float[] { (-1), (short) -1, '4' };
        int int14 = java.util.Arrays.binarySearch(floatArray12, 0.0f);
        java.util.Arrays.sort(floatArray12);
        float[] floatArray17 = java.util.Arrays.copyOf(floatArray12, 0);
        java.util.Arrays.fill(floatArray12, (-1.0f));
        boolean boolean20 = java.util.Arrays.equals(floatArray3, floatArray12);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[32.0, 32.0, 32.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[-1.0, -1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3) + "'", int14 == (-3));
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        short[] shortArray6 = new short[] { (byte) -1, (byte) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
        java.util.Arrays.parallelSort(shortArray6);
        java.util.Arrays.sort(shortArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(shortArray6, (-7), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(strArray2, 4, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(4) > toIndex(-3)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        java.util.Arrays.fill(shortArray0, (short) -1);
        java.util.Arrays.fill(shortArray0, (short) 10);
        short[] shortArray7 = new short[] {};
        int int9 = java.util.Arrays.binarySearch(shortArray7, (short) 1);
        java.util.Arrays.fill(shortArray7, (short) (byte) -1);
        boolean boolean12 = java.util.Arrays.equals(shortArray0, shortArray7);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        long[] longArray9 = java.util.Arrays.copyOf(longArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(longArray3, (-7), 7, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[]");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        byte[] byteArray6 = java.util.Arrays.copyOf(byteArray4, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = java.util.Arrays.binarySearch(byteArray4, (int) (byte) 10, 100, (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        java.util.Spliterator.OfDouble ofDouble11 = java.util.Arrays.spliterator(doubleArray4, (int) '4', 100);
        int int15 = java.util.Arrays.binarySearch(doubleArray4, (int) (byte) 10, (int) (byte) 10, (double) (byte) 100);
        java.util.function.DoubleBinaryOperator doubleBinaryOperator18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(doubleArray4, (int) 'a', 0, doubleBinaryOperator18);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-11) + "'", int15 == (-11));
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        boolean[] booleanArray10 = java.util.Arrays.copyOfRange(booleanArray7, (int) (short) 10, (int) '#');
        boolean[] booleanArray16 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray18 = java.util.Arrays.copyOf(booleanArray16, (int) '4');
        boolean[] booleanArray21 = java.util.Arrays.copyOfRange(booleanArray18, (int) (short) 10, (int) '#');
        boolean boolean22 = java.util.Arrays.equals(booleanArray7, booleanArray21);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        int[] intArray0 = null;
        java.util.function.IntUnaryOperator intUnaryOperator1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSetAll(intArray0, intUnaryOperator1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int6 = java.util.Arrays.binarySearch(doubleArray2, (double) (short) -1);
        java.util.Arrays.sort(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(doubleArray2, (-3), 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream5 = java.util.Arrays.stream(doubleArray4);
        java.util.Arrays.fill(doubleArray4, (double) (short) -1);
        java.util.Spliterator.OfDouble ofDouble8 = java.util.Arrays.spliterator(doubleArray4);
        java.util.Spliterator.OfDouble[] ofDoubleArray9 = new java.util.Spliterator.OfDouble[] { ofDouble8 };
        java.util.List<java.util.Spliterator.OfDouble> ofDoubleList10 = java.util.Arrays.asList(ofDoubleArray9);
        java.lang.Class<?> wildcardClass11 = ofDoubleList10.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(ofDouble8);
        org.junit.Assert.assertNotNull(ofDoubleArray9);
        org.junit.Assert.assertNotNull(ofDoubleList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        boolean[] booleanArray10 = java.util.Arrays.copyOfRange(booleanArray7, (int) (short) 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(booleanArray7, (-3), (-3), false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.util.List<java.lang.reflect.Type> typeList1 = java.util.Arrays.asList(typeArray0);
        long[] longArray5 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream6 = java.util.Arrays.stream(longArray5);
        long[] longArray9 = java.util.Arrays.copyOfRange(longArray5, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong10 = java.util.Arrays.spliterator(longArray9);
        java.util.Arrays.fill((java.lang.Object[]) typeArray0, (java.lang.Object) ofLong10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort((java.lang.Object[]) typeArray0, (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(typeList1);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofLong10);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) 100);
        short[] shortArray6 = java.util.Arrays.copyOf(shortArray0, (int) (short) 0);
        java.util.Arrays.parallelSort(shortArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(shortArray0, (int) (byte) -1, (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(-1) > toIndex(-101)");
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
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        long[] longArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(longArray0, (-4), 4, (long) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        byte[] byteArray3 = new byte[] { (byte) 0 };
        byte[] byteArray5 = new byte[] { (byte) 0 };
        byte[][] byteArray6 = new byte[][] { byteArray1, byteArray3, byteArray5 };
        java.util.stream.Stream<byte[]> byteArrayStream7 = java.util.Arrays.stream(byteArray6);
        java.util.List<byte[]> byteArrayList8 = java.util.Arrays.asList(byteArray6);
        long[] longArray12 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream13 = java.util.Arrays.stream(longArray12);
        java.util.Arrays.fill(longArray12, (long) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java.util.Arrays.binarySearch((java.lang.Object[]) byteArray6, (java.lang.Object) longArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [B cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArrayStream7);
        org.junit.Assert.assertNotNull(byteArrayList8);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(longStream13);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        int[] intArray6 = new int[] { (-101), (short) 100, 2, (-3), (-4), (-100) };
        java.util.Spliterator.OfInt ofInt7 = java.util.Arrays.spliterator(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream10 = java.util.Arrays.stream(intArray6, (int) (short) 10, (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(10) > fence(-11)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-101, 100, 2, -3, -4, -100]");
        org.junit.Assert.assertNotNull(ofInt7);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        int int7 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        int int9 = java.util.Arrays.binarySearch(floatArray3, (float) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(floatArray3, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(1) > toIndex(-1)");
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
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Spliterator.OfLong ofLong7 = java.util.Arrays.spliterator(longArray3);
        java.util.function.LongBinaryOperator longBinaryOperator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(longArray3, (int) (byte) 100, (int) '#', longBinaryOperator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(ofLong7);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        byte[] byteArray3 = new byte[] { (byte) 0 };
        byte[] byteArray5 = new byte[] { (byte) 0 };
        byte[][] byteArray6 = new byte[][] { byteArray1, byteArray3, byteArray5 };
        java.util.stream.Stream<byte[]> byteArrayStream7 = java.util.Arrays.stream(byteArray6);
        java.util.stream.Stream<byte[]> byteArrayStream8 = java.util.Arrays.stream(byteArray6);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray11);
        boolean boolean13 = java.util.Arrays.deepEquals((java.lang.Object[]) byteArray6, (java.lang.Object[]) strArray11);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArrayStream7);
        org.junit.Assert.assertNotNull(byteArrayStream8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        java.util.Arrays.parallelSort(shortArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = java.util.Arrays.binarySearch(shortArray0, (int) (short) 10, (int) (short) -1, (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(10) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        short[] shortArray6 = new short[] { (byte) -1, (byte) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
        java.util.Arrays.parallelSort(shortArray6);
        java.util.Arrays.sort(shortArray6);
        short[] shortArray10 = java.util.Arrays.copyOf(shortArray6, 100);
        int int12 = java.util.Arrays.binarySearch(shortArray6, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray14 = java.util.Arrays.copyOf(shortArray6, (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-7) + "'", int12 == (-7));
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int int11 = java.util.Arrays.binarySearch(intArray3, 1);
        int[] intArray14 = java.util.Arrays.copyOfRange(intArray3, (int) (short) 100, (int) (short) 100);
        java.util.function.IntBinaryOperator intBinaryOperator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(intArray3, (-5), (int) 'a', intBinaryOperator17);
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
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = java.util.Arrays.binarySearch(longArray7, (-101), (int) '4', (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -101");
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
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        short[] shortArray6 = new short[] { (byte) -1, (byte) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
        java.util.Arrays.parallelSort(shortArray6);
        short[] shortArray14 = new short[] { (byte) -1, (byte) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
        java.util.Arrays.parallelSort(shortArray14);
        java.util.Arrays.sort(shortArray14);
        short[] shortArray18 = java.util.Arrays.copyOf(shortArray14, 100);
        int int20 = java.util.Arrays.binarySearch(shortArray14, (short) (byte) 1);
        boolean boolean21 = java.util.Arrays.equals(shortArray6, shortArray14);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[-1, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-7) + "'", int20 == (-7));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        long[] longArray4 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream5 = java.util.Arrays.stream(longArray4);
        java.util.Arrays.fill(longArray4, (long) (byte) 10);
        int int9 = java.util.Arrays.binarySearch(longArray4, (-1L));
        java.util.Arrays.parallelSort(longArray4);
        java.util.stream.LongStream longStream13 = java.util.Arrays.stream(longArray4, (int) (byte) 1, (int) (short) 1);
        int int15 = java.util.Arrays.binarySearch(longArray4, 0L);
        java.util.stream.LongStream longStream16 = java.util.Arrays.stream(longArray4);
        java.lang.Object[] objArray17 = new java.lang.Object[] { '#', longArray4 };
        java.lang.Object[] objArray18 = null;
        boolean boolean19 = java.util.Arrays.deepEquals(objArray17, objArray18);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(longStream16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[#, [10, 10, 10]]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = java.util.Arrays.binarySearch(charArray10, 10, 0, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(10) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        java.util.Arrays.parallelSort(longArray3);
        int int11 = java.util.Arrays.binarySearch(longArray3, (long) 2);
        java.util.Arrays.fill(longArray3, (long) (-5));
        java.util.Arrays.sort(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(longArray3, (-5), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = java.util.Arrays.binarySearch(charArray0, (int) (short) 1, (int) (short) -1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int[] intArray11 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfInt ofInt14 = java.util.Arrays.spliterator(intArray3, 4, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(4) > fence(-1)");
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
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        int int3 = java.util.Arrays.binarySearch(byteArray1, (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(byteArray1, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(52) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        java.util.Arrays.parallelSort(longArray3);
        int int11 = java.util.Arrays.binarySearch(longArray3, (long) 2);
        int int13 = java.util.Arrays.binarySearch(longArray3, (long) (-3));
        java.util.stream.LongStream longStream14 = java.util.Arrays.stream(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java.util.Arrays.binarySearch(longArray3, 1, 0, (long) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(1) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(longStream14);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        double[] doubleArray14 = java.util.Arrays.copyOfRange(doubleArray11, 2, 100);
        double[] doubleArray16 = java.util.Arrays.copyOf(doubleArray11, (int) '#');
        java.util.Spliterator.OfDouble ofDouble17 = java.util.Arrays.spliterator(doubleArray11);
        double[] doubleArray21 = new double[] { 10, (short) 100, 0.0f };
        java.util.Arrays.sort(doubleArray21);
        boolean boolean23 = java.util.Arrays.equals(doubleArray11, doubleArray21);
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
        org.junit.Assert.assertNotNull(ofDouble17);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.lang.Object[] objArray0 = null;
        byte[] byteArray2 = new byte[] { (byte) 0 };
        byte[] byteArray4 = new byte[] { (byte) 0 };
        byte[] byteArray6 = new byte[] { (byte) 0 };
        byte[][] byteArray7 = new byte[][] { byteArray2, byteArray4, byteArray6 };
        java.util.stream.Stream<byte[]> byteArrayStream8 = java.util.Arrays.stream(byteArray7);
        boolean boolean9 = java.util.Arrays.equals(objArray0, (java.lang.Object[]) byteArray7);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(byteArrayStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        boolean[] booleanArray3 = new boolean[] { true, false, true };
        boolean[] booleanArray9 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray11 = java.util.Arrays.copyOf(booleanArray9, (int) '4');
        boolean[] booleanArray14 = java.util.Arrays.copyOfRange(booleanArray11, (int) (short) 10, (int) '#');
        java.util.Arrays.fill(booleanArray11, true);
        boolean boolean17 = java.util.Arrays.equals(booleanArray3, booleanArray11);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true]");
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        java.util.Arrays.parallelSort(longArray3);
        int int11 = java.util.Arrays.binarySearch(longArray3, (long) 2);
        java.util.Arrays.fill(longArray3, (long) (-5));
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(longArray3, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        boolean[] booleanArray10 = java.util.Arrays.copyOfRange(booleanArray7, (int) (short) 10, (int) '#');
        java.util.Arrays.fill(booleanArray7, true);
        boolean[] booleanArray18 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray20 = java.util.Arrays.copyOf(booleanArray18, (int) '4');
        boolean boolean21 = java.util.Arrays.equals(booleanArray7, booleanArray18);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream5 = java.util.Arrays.stream(doubleArray4);
        java.util.Arrays.fill(doubleArray4, (double) (short) -1);
        java.util.function.DoubleBinaryOperator doubleBinaryOperator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(doubleArray4, 1, (int) (short) 10, doubleBinaryOperator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray1);
        java.util.Arrays.fill(intArray1, 5);
        java.lang.String str7 = java.util.Arrays.toString(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[5]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[5]" + "'", str7, "[5]");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray10 = new double[] { (short) 10, 10.0f };
        double[] doubleArray12 = java.util.Arrays.copyOf(doubleArray10, (int) (short) 100);
        int int16 = java.util.Arrays.binarySearch(doubleArray12, 5, 10, (double) (byte) 0);
        java.util.Spliterator.OfDouble ofDouble19 = java.util.Arrays.spliterator(doubleArray12, (int) '4', 100);
        double[] doubleArray22 = java.util.Arrays.copyOfRange(doubleArray12, 0, (int) (byte) 100);
        boolean boolean23 = java.util.Arrays.equals(doubleArray4, doubleArray22);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertNotNull(ofDouble19);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        long[] longArray11 = java.util.Arrays.copyOfRange(longArray3, 0, (int) (byte) 0);
        java.lang.String str12 = java.util.Arrays.toString(longArray11);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        java.util.Arrays.parallelSort(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfLong ofLong12 = java.util.Arrays.spliterator(longArray3, (-101), (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.util.List<java.lang.reflect.Type> typeList1 = java.util.Arrays.asList(typeArray0);
        long[] longArray5 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream6 = java.util.Arrays.stream(longArray5);
        long[] longArray9 = java.util.Arrays.copyOfRange(longArray5, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong10 = java.util.Arrays.spliterator(longArray9);
        java.util.Arrays.fill((java.lang.Object[]) typeArray0, (java.lang.Object) ofLong10);
        java.lang.Object[] objArray13 = new java.lang.Object[] { "[0, 100]" };
        java.util.Arrays.fill(objArray13, (java.lang.Object) "[hi!, ]");
        boolean boolean16 = java.util.Arrays.equals((java.lang.Object[]) typeArray0, objArray13);
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(typeList1);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[[hi!, ]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[[hi!, ]]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        float[] floatArray3 = new float[] { 0.0f, (byte) 0, (short) 1 };
        java.util.Arrays.sort(floatArray3);
        float[] floatArray6 = java.util.Arrays.copyOf(floatArray3, 2);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray9 = java.util.Arrays.copyOfRange(floatArray6, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[0.0, 0.0]");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(charArray0, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.util.List<java.lang.reflect.Type> typeList1 = java.util.Arrays.asList(typeArray0);
        long[] longArray5 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream6 = java.util.Arrays.stream(longArray5);
        long[] longArray9 = java.util.Arrays.copyOfRange(longArray5, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong10 = java.util.Arrays.spliterator(longArray9);
        java.util.Arrays.fill((java.lang.Object[]) typeArray0, (java.lang.Object) ofLong10);
        java.util.Arrays.sort((java.lang.Object[]) typeArray0);
        java.lang.String str13 = java.util.Arrays.deepToString((java.lang.Object[]) typeArray0);
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(typeList1);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(shortArray0, (int) '#', 4, (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(35) > toIndex(4)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0]", "[-1]" };
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = java.util.Arrays.binarySearch((java.lang.Object[]) strArray2, (-4), (-6), obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(-4) > toIndex(-6)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray2 = java.util.Arrays.copyOf(shortArray0, (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        long[] longArray9 = java.util.Arrays.copyOf(longArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray12 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 0, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 0 > -4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[]");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
        int[] intArray27 = new int[] { 100 };
        int[] intArray29 = java.util.Arrays.copyOf(intArray27, (int) (short) 100);
        int int33 = java.util.Arrays.binarySearch(intArray29, (int) (byte) 1, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill((java.lang.Object[]) charSequenceBaseStreamArray14, (int) 'a', (int) (byte) 0, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(97) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray2 = java.util.Arrays.copyOf(doubleArray0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        boolean[] booleanArray0 = new boolean[] {};
        java.lang.String str1 = java.util.Arrays.toString(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Arrays.parallelSort(longArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = java.util.Arrays.binarySearch(longArray7, 0, (int) (short) -1, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
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
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.parallelSort(charArray4);
        char[] charArray13 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray13, (int) (byte) 1, 3);
        char[] charArray19 = java.util.Arrays.copyOfRange(charArray13, (int) (byte) 0, (int) (byte) 0);
        java.util.Arrays.parallelSort(charArray13);
        boolean boolean21 = java.util.Arrays.equals(charArray4, charArray13);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , 4, a, a]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4, a, a]");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.sort(floatArray3);
        float[] floatArray8 = java.util.Arrays.copyOf(floatArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = java.util.Arrays.binarySearch(floatArray3, 3, 4, 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray3 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray4 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray5 = new java.lang.reflect.Type[][] { typeArray0, typeArray1, typeArray2, typeArray3, typeArray4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type[][] typeArray7 = java.util.Arrays.copyOf(typeArray5, (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray5);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) 0);
        int int8 = java.util.Arrays.binarySearch(longArray3, (long) (byte) 100);
        java.util.function.IntToLongFunction intToLongFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(longArray3, intToLongFunction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-4) + "'", int8 == (-4));
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.parallelSort(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(longArray3, (int) 'a', (int) (byte) 0, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(97) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        boolean[] booleanArray9 = java.util.Arrays.copyOf(booleanArray7, 2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(booleanArray9, (int) '#', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(35) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false]");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        java.util.Spliterator.OfDouble ofDouble10 = java.util.Arrays.spliterator(doubleArray7, 10, (int) '#');
        int int12 = java.util.Arrays.binarySearch(doubleArray7, (double) (-1));
        java.util.Arrays.sort(doubleArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfDouble ofDouble16 = java.util.Arrays.spliterator(doubleArray7, (-4), (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(-4) > fence(-11)");
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
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0]", "[-1]" };
        java.util.Arrays.parallelSort(strArray2);
        byte[] byteArray7 = new byte[] { (byte) 1 };
        byte[] byteArray10 = java.util.Arrays.copyOfRange(byteArray7, (int) (short) 1, 2);
        java.util.Arrays.parallelSort(byteArray10);
        java.util.Arrays.parallelSort(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill((java.lang.Object[]) strArray2, 0, 10, (java.lang.Object) byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0]");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        int int12 = java.util.Arrays.binarySearch(charArray10, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(charArray10, (-7), (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -7");
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
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        float[] floatArray5 = new float[] { 0, (-4), 10, 3, (-3) };
        int int7 = java.util.Arrays.binarySearch(floatArray5, 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(floatArray5, (int) (byte) -1, (int) '4', (float) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -4.0, 10.0, 3.0, -3.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-6) + "'", int7 == (-6));
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        java.util.Arrays.sort(doubleArray4);
        java.util.function.IntToDoubleFunction intToDoubleFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(doubleArray4, intToDoubleFunction10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray2);
        float[] floatArray7 = new float[] { (-1), (short) -1, '4' };
        int int9 = java.util.Arrays.binarySearch(floatArray7, 0.0f);
        java.util.Arrays.parallelSort(floatArray7);
        int int12 = java.util.Arrays.binarySearch(floatArray7, (float) 10L);
        java.util.Arrays.sort(floatArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = java.util.Arrays.binarySearch((java.lang.Object[]) strArray2, (java.lang.Object) floatArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [F cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int[] intArray11 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(intArray11, (int) (byte) 1, (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(1) > toIndex(-101)");
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
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(shortArray0, (int) '4', (-101), (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(52) > toIndex(-101)");
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
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.util.List<java.lang.reflect.Type> typeList1 = java.util.Arrays.asList(typeArray0);
        java.lang.String[] strArray8 = new java.lang.String[] { "[0, 100]", "[false, false]", "[0.0, 0.0, 1.0]", "[3, 1, 0, 0, 0, 0, 0, 0, 0]", "[32.0, 32.0, 32.0]", "[100]" };
        java.util.Arrays.parallelSort(strArray8, (int) (short) 0, 4);
        boolean boolean12 = java.util.Arrays.equals((java.lang.Object[]) typeArray0, (java.lang.Object[]) strArray8);
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(typeList1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong8 = java.util.Arrays.spliterator(longArray7);
        java.util.Arrays.parallelSort(longArray7);
        java.lang.String str10 = java.util.Arrays.toString(longArray7);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[0, 0, 0, 0, 0, 0, 0, 1, 3]");
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0, 0, 0, 0, 0, 0, 0, 1, 3]" + "'", str10, "[0, 0, 0, 0, 0, 0, 0, 1, 3]");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.parallelSort(charArray4);
        java.util.Arrays.sort(charArray4);
        int int11 = java.util.Arrays.binarySearch(charArray4, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(charArray4, (int) (byte) 0, 5, 'a');
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) 0);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray9 = java.util.Arrays.copyOfRange(longArray3, (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.sort(floatArray3);
        float[] floatArray8 = java.util.Arrays.copyOf(floatArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(floatArray8, 4, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int int11 = java.util.Arrays.binarySearch(intArray3, 1);
        java.util.function.IntUnaryOperator intUnaryOperator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSetAll(intArray3, intUnaryOperator12);
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
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.lang.String str5 = java.util.Arrays.deepToString((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[, hi!]" + "'", str5, "[, hi!]");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfDouble ofDouble1 = java.util.Arrays.spliterator(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Arrays.sort(longArray7, 3, 3);
        java.util.function.LongBinaryOperator longBinaryOperator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(longArray7, (int) (short) 100, 0, longBinaryOperator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        float[] floatArray3 = new float[] { 0.0f, (byte) 0, (short) 1 };
        java.util.Arrays.sort(floatArray3);
        float[] floatArray6 = java.util.Arrays.copyOf(floatArray3, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = java.util.Arrays.binarySearch(floatArray3, (int) (byte) 1, (-6), (float) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(1) > toIndex(-6)");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = java.util.Arrays.binarySearch(floatArray3, (int) (short) 100, 3, (float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(3)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        long[] longArray3 = new long[] { (short) 100, (short) 100, (-100) };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(longArray3, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 100, -100]");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(intArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        java.util.function.DoubleBinaryOperator doubleBinaryOperator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(doubleArray9, doubleBinaryOperator10);
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
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Spliterator.OfInt ofInt8 = java.util.Arrays.spliterator(intArray3);
        java.util.Arrays.parallelSort(intArray3, 0, 7);
        java.util.function.IntBinaryOperator intBinaryOperator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(intArray3, (int) (short) 0, 100, intBinaryOperator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        long[] longArray9 = java.util.Arrays.copyOf(longArray7, (int) '#');
        java.util.function.LongBinaryOperator longBinaryOperator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(longArray7, longBinaryOperator10);
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
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream1 = java.util.Arrays.stream(intArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.sort(floatArray3);
        float[] floatArray8 = java.util.Arrays.copyOf(floatArray3, 0);
        java.lang.String str9 = java.util.Arrays.toString(floatArray8);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        java.util.Arrays.fill(shortArray0, (short) (byte) -1);
        short[] shortArray6 = java.util.Arrays.copyOf(shortArray0, 5);
        java.lang.String str7 = java.util.Arrays.toString(shortArray6);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0, 0, 0, 0]" + "'", str7, "[0, 0, 0, 0, 0]");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        int int3 = java.util.Arrays.binarySearch(byteArray1, (byte) 1);
        byte[] byteArray5 = new byte[] { (byte) 1 };
        byte[] byteArray8 = java.util.Arrays.copyOfRange(byteArray5, (int) (short) 1, 2);
        java.util.Arrays.fill(byteArray8, (byte) -1);
        int int12 = java.util.Arrays.binarySearch(byteArray8, (byte) 1);
        java.util.Arrays.parallelSort(byteArray8);
        boolean boolean14 = java.util.Arrays.equals(byteArray1, byteArray8);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        java.util.Arrays.sort(doubleArray4);
        java.util.Arrays.sort(doubleArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream12 = java.util.Arrays.stream(doubleArray4, 2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(2) > fence(-1)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        java.util.Spliterator.OfDouble ofDouble10 = java.util.Arrays.spliterator(doubleArray7, 10, (int) '#');
        java.util.function.IntToDoubleFunction intToDoubleFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(doubleArray7, intToDoubleFunction11);
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
        org.junit.Assert.assertNotNull(ofDouble10);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (long) (-7));
        long[] longArray12 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream13 = java.util.Arrays.stream(longArray12);
        long[] longArray16 = java.util.Arrays.copyOfRange(longArray12, (int) (byte) 1, 10);
        long[] longArray18 = java.util.Arrays.copyOf(longArray16, (int) '#');
        boolean boolean19 = java.util.Arrays.equals(longArray3, longArray16);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.parallelSort(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = java.util.Arrays.binarySearch(byteArray4, (int) (byte) 100, (-2), (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(-2)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        int int7 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray10 = java.util.Arrays.copyOfRange(floatArray3, (-101), 10);
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
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(doubleArray4, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(97) > toIndex(1)");
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
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        float[] floatArray1 = new float[] { (-1L) };
        int int3 = java.util.Arrays.binarySearch(floatArray1, (float) (short) -1);
        java.util.Arrays.sort(floatArray1);
        java.util.Arrays.sort(floatArray1);
        java.lang.String str6 = java.util.Arrays.toString(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[-1.0]" + "'", str6, "[-1.0]");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.util.List<java.lang.reflect.Type> typeList1 = java.util.Arrays.asList(typeArray0);
        long[] longArray5 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream6 = java.util.Arrays.stream(longArray5);
        long[] longArray9 = java.util.Arrays.copyOfRange(longArray5, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong10 = java.util.Arrays.spliterator(longArray9);
        java.util.Arrays.fill((java.lang.Object[]) typeArray0, (java.lang.Object) ofLong10);
        java.util.Arrays.sort((java.lang.Object[]) typeArray0);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray15);
        java.util.Arrays.parallelSort(strArray15);
        java.util.Arrays.sort((java.lang.Object[]) strArray15);
        boolean boolean19 = java.util.Arrays.deepEquals((java.lang.Object[]) typeArray0, (java.lang.Object[]) strArray15);
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(typeList1);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        short[][][] shortArray0 = new short[][][] {};
        java.util.Spliterator<short[][]> shortArraySpliterator1 = java.util.Arrays.spliterator(shortArray0);
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream5 = java.util.Arrays.stream(charSequenceArray4);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream9 = java.util.Arrays.stream(charSequenceArray8);
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream13 = java.util.Arrays.stream(charSequenceArray12);
        java.util.stream.BaseStream[] baseStreamArray15 = new java.util.stream.BaseStream[3];
        @SuppressWarnings("unchecked")
        java.util.stream.BaseStream<java.lang.CharSequence, java.util.stream.Stream<java.lang.CharSequence>>[] charSequenceBaseStreamArray16 = (java.util.stream.BaseStream<java.lang.CharSequence, java.util.stream.Stream<java.lang.CharSequence>>[]) baseStreamArray15;
        charSequenceBaseStreamArray16[0] = charSequenceStream5;
        charSequenceBaseStreamArray16[1] = charSequenceStream9;
        charSequenceBaseStreamArray16[2] = charSequenceStream13;
        java.util.stream.Stream<java.util.stream.BaseStream<java.lang.CharSequence, java.util.stream.Stream<java.lang.CharSequence>>> charSequenceBaseStreamStream25 = java.util.Arrays.stream(charSequenceBaseStreamArray16, (int) (byte) 0, (int) (byte) 0);
        boolean boolean26 = java.util.Arrays.equals((java.lang.Object[]) shortArray0, (java.lang.Object[]) charSequenceBaseStreamArray16);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertNotNull(shortArraySpliterator1);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceStream5);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(charSequenceStream9);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(charSequenceStream13);
        org.junit.Assert.assertNotNull(baseStreamArray15);
        org.junit.Assert.assertNotNull(charSequenceBaseStreamArray16);
        org.junit.Assert.assertNotNull(charSequenceBaseStreamStream25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(shortArray0, (-101), 4);
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
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream5 = java.util.Arrays.stream(doubleArray4);
        java.util.Arrays.fill(doubleArray4, (double) (short) -1);
        java.util.Spliterator.OfDouble ofDouble8 = java.util.Arrays.spliterator(doubleArray4);
        java.lang.String str9 = java.util.Arrays.toString(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(ofDouble8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[-1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0]" + "'", str9, "[-1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0]");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        java.util.Arrays.parallelSort(longArray3);
        java.util.stream.LongStream longStream12 = java.util.Arrays.stream(longArray3, (int) (byte) 1, (int) (short) 1);
        int int14 = java.util.Arrays.binarySearch(longArray3, 0L);
        java.util.function.LongBinaryOperator longBinaryOperator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(longArray3, (int) (short) 1, 0, longBinaryOperator17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        long[] longArray1 = new long[] { ' ' };
        java.util.stream.LongStream longStream2 = java.util.Arrays.stream(longArray1);
        java.util.Arrays.parallelSort(longArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(longArray1, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(52) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[32]");
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        double[] doubleArray14 = java.util.Arrays.copyOfRange(doubleArray11, 2, 100);
        java.util.function.IntToDoubleFunction intToDoubleFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSetAll(doubleArray11, intToDoubleFunction15);
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
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        java.util.Arrays.fill(doubleArray9, (double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = java.util.Arrays.binarySearch(doubleArray9, (-1), (int) 'a', (double) 3);
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
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.sort(intArray3);
        int int10 = java.util.Arrays.binarySearch(intArray3, 5);
        int[] intArray12 = new int[] { 100 };
        int[] intArray14 = java.util.Arrays.copyOf(intArray12, (int) (short) 100);
        int int18 = java.util.Arrays.binarySearch(intArray14, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray14, 3);
        int int22 = java.util.Arrays.binarySearch(intArray14, 1);
        boolean boolean23 = java.util.Arrays.equals(intArray3, intArray14);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-100) + "'", int10 == (-100));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Spliterator.OfInt ofInt8 = java.util.Arrays.spliterator(intArray3);
        java.util.Arrays.sort(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(intArray3, (-11), (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -11");
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
        org.junit.Assert.assertNotNull(ofInt8);
    }
}

