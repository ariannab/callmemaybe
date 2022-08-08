import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.function.IntBinaryOperator intBinaryOperator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(intArray3, intBinaryOperator8);
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
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray1);
        java.util.Arrays.fill(intArray1, 5);
        java.util.Arrays.fill(intArray1, (-3));
        java.util.Arrays.parallelSort(intArray1);
        int[] intArray11 = java.util.Arrays.copyOf(intArray1, 3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(intArray1, (-7), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-3]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-3, 0, 0]");
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        double[] doubleArray3 = new double[] { 10, (short) 100, 0.0f };
        java.util.Arrays.sort(doubleArray3);
        java.util.function.IntToDoubleFunction intToDoubleFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(doubleArray3, intToDoubleFunction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 10.0, 100.0]");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        java.util.function.DoubleBinaryOperator doubleBinaryOperator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(doubleArray9, 0, (int) ' ', doubleBinaryOperator14);
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
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        java.util.Arrays.parallelSort(shortArray0);
        short[] shortArray4 = new short[] {};
        int int6 = java.util.Arrays.binarySearch(shortArray4, (short) 1);
        java.util.Arrays.fill(shortArray4, (short) -1);
        short[] shortArray10 = java.util.Arrays.copyOf(shortArray4, 7);
        boolean boolean11 = java.util.Arrays.equals(shortArray0, shortArray4);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
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
        java.lang.Object obj37 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill((java.lang.Object[]) charSequenceStreamArray22, (int) (byte) 100, (-2), obj37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(-2)");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(autoCloseableStream34);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        float[] floatArray1 = new float[] { (-1L) };
        int int3 = java.util.Arrays.binarySearch(floatArray1, (float) (short) -1);
        java.util.Arrays.sort(floatArray1);
        java.util.Arrays.sort(floatArray1);
        int int7 = java.util.Arrays.binarySearch(floatArray1, 0.0f);
        java.util.Arrays.parallelSort(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(floatArray1, 5, (-6), (float) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(5) > toIndex(-6)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.fill(longArray3, (long) '4');
        java.util.Arrays.parallelSort(longArray3);
        java.util.stream.LongStream longStream10 = java.util.Arrays.stream(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(longArray3, (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[52, 52, 52]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream10);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream5 = java.util.Arrays.stream(doubleArray4);
        java.util.Arrays.fill(doubleArray4, (double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray2);
        java.util.Spliterator<java.lang.String> strSpliterator4 = java.util.Arrays.spliterator(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<java.io.Serializable> serializableStream7 = java.util.Arrays.stream((java.io.Serializable[]) strArray2, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(100) > fence(1)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSpliterator4);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.fill(intArray3, (int) (short) 1);
        java.util.Arrays.fill(intArray3, (int) ' ', (int) (short) 100, 0);
        int[] intArray12 = java.util.Arrays.copyOfRange(intArray3, 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream15 = java.util.Arrays.stream(intArray12, (-6), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray4, '#');
        char[] charArray11 = java.util.Arrays.copyOf(charArray4, (int) (byte) 1);
        char[] charArray13 = java.util.Arrays.copyOf(charArray4, 5);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray16 = java.util.Arrays.copyOfRange(charArray13, (-1), (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1 > -100");
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
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "####\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "####\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, #, #, #, \000]");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        boolean[] booleanArray10 = java.util.Arrays.copyOfRange(booleanArray7, (int) (short) 10, (int) '#');
        java.util.Arrays.fill(booleanArray7, true);
        java.util.Arrays.fill(booleanArray7, false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(booleanArray7, 100, 4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(4)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray4, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(charArray4, (-7), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        float[] floatArray3 = new float[] { 0.0f, (byte) 0, (short) 1 };
        java.util.Arrays.sort(floatArray3);
        float[] floatArray6 = java.util.Arrays.copyOf(floatArray3, 2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(floatArray6, 2, 0, (float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(2) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[0.0, 0.0]");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream5 = java.util.Arrays.stream(doubleArray4);
        java.util.Arrays.fill(doubleArray4, (double) (short) -1);
        java.util.Spliterator.OfDouble ofDouble8 = java.util.Arrays.spliterator(doubleArray4);
        java.util.Spliterator.OfDouble[] ofDoubleArray9 = new java.util.Spliterator.OfDouble[] { ofDouble8 };
        java.util.List<java.util.Spliterator.OfDouble> ofDoubleList10 = java.util.Arrays.asList(ofDoubleArray9);
        java.lang.String str11 = java.util.Arrays.deepToString((java.lang.Object[]) ofDoubleArray9);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(ofDouble8);
        org.junit.Assert.assertNotNull(ofDoubleArray9);
        org.junit.Assert.assertNotNull(ofDoubleList10);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray4, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(charArray4, (int) '#', (-96));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(35) > toIndex(-96)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, 0L);
        int int8 = java.util.Arrays.binarySearch(longArray3, (long) (-2));
        long[] longArray12 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream13 = java.util.Arrays.stream(longArray12);
        java.util.Arrays.fill(longArray12, (long) (byte) 10);
        java.util.Spliterator.OfLong ofLong16 = java.util.Arrays.spliterator(longArray12);
        java.util.Arrays.parallelSort(longArray12);
        boolean boolean18 = java.util.Arrays.equals(longArray3, longArray12);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        java.util.Arrays.fill(shortArray0, (short) -1);
        java.util.Arrays.fill(shortArray0, (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray9 = java.util.Arrays.copyOfRange(shortArray0, (-4), (int) (short) 0);
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
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.parallelSort(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray11 = java.util.Arrays.copyOfRange(charArray4, (int) (short) 100, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100 > 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , 4, a, a]");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        long[] longArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(longArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream5 = java.util.Arrays.stream(doubleArray4);
        java.util.Arrays.fill(doubleArray4, (double) (short) -1);
        java.util.function.DoubleBinaryOperator doubleBinaryOperator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(doubleArray4, (int) '4', (-2), doubleBinaryOperator10);
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
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.sort(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(byteArray1, (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int int11 = java.util.Arrays.binarySearch(intArray3, 1);
        int[] intArray14 = java.util.Arrays.copyOfRange(intArray3, (int) (short) 100, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(intArray14, (int) '4', (-100), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(52) > toIndex(-100)");
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.parallelSort(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray10 = java.util.Arrays.copyOfRange(longArray3, (int) (short) -1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.sort((java.lang.Object[]) strArray2);
        java.io.Serializable[] serializableArray7 = java.util.Arrays.copyOf((java.io.Serializable[]) strArray2, 100);
        short[] shortArray10 = new short[] {};
        int int12 = java.util.Arrays.binarySearch(shortArray10, (short) 1);
        java.util.Arrays.fill(shortArray10, (short) (byte) -1);
        short[] shortArray16 = java.util.Arrays.copyOf(shortArray10, 5);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = java.util.Arrays.binarySearch((java.lang.Object[]) serializableArray7, 1, 0, (java.lang.Object) shortArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(1) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(serializableArray7);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[0, 0, 0, 0, 0]");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0]", "[-1]" };
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray8);
        java.util.Arrays.parallelSort(strArray8);
        boolean boolean11 = java.util.Arrays.deepEquals((java.lang.Object[]) strArray2, (java.lang.Object[]) strArray8);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.fill(longArray3, (long) '4');
        int int10 = java.util.Arrays.binarySearch(longArray3, 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(longArray3, 4, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(4) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray13 = java.util.Arrays.copyOfRange(charArray10, (-100), 100);
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
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong8 = java.util.Arrays.spliterator(longArray7);
        long[] longArray10 = java.util.Arrays.copyOf(longArray7, (int) (byte) 1);
        long[] longArray12 = java.util.Arrays.copyOf(longArray10, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(longArray10, (-100), (int) (byte) 100, (long) (byte) 1);
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
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[3]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.util.function.IntToDoubleFunction intToDoubleFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(doubleArray4, intToDoubleFunction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int[] intArray11 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray11);
        java.util.stream.IntStream intStream15 = java.util.Arrays.stream(intArray11, 2, 5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(intArray11, (-100), (int) (short) -1, 0);
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
        org.junit.Assert.assertNotNull(intStream15);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream3 = java.util.Arrays.stream(charSequenceArray2);
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream7 = java.util.Arrays.stream(charSequenceArray6);
        java.util.stream.Stream[] streamArray9 = new java.util.stream.Stream[2];
        @SuppressWarnings("unchecked")
        java.util.stream.Stream<java.lang.CharSequence>[] charSequenceStreamArray10 = (java.util.stream.Stream<java.lang.CharSequence>[]) streamArray9;
        charSequenceStreamArray10[0] = charSequenceStream3;
        charSequenceStreamArray10[1] = charSequenceStream7;
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream18 = java.util.Arrays.stream(charSequenceArray17);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream22 = java.util.Arrays.stream(charSequenceArray21);
        java.util.stream.Stream[] streamArray24 = new java.util.stream.Stream[2];
        @SuppressWarnings("unchecked")
        java.util.stream.Stream<java.lang.CharSequence>[] charSequenceStreamArray25 = (java.util.stream.Stream<java.lang.CharSequence>[]) streamArray24;
        charSequenceStreamArray25[0] = charSequenceStream18;
        charSequenceStreamArray25[1] = charSequenceStream22;
        java.util.stream.Stream[][] streamArray31 = new java.util.stream.Stream[2][];
        @SuppressWarnings("unchecked")
        java.util.stream.Stream<java.lang.CharSequence>[][] charSequenceStreamArray32 = (java.util.stream.Stream<java.lang.CharSequence>[][]) streamArray31;
        charSequenceStreamArray32[0] = charSequenceStreamArray10;
        charSequenceStreamArray32[1] = charSequenceStreamArray25;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<java.util.stream.Stream<java.lang.CharSequence>[]> charSequenceStreamArrayStream39 = java.util.Arrays.stream(charSequenceStreamArray32, (-96), 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -96");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertNotNull(charSequenceStream3);
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertNotNull(charSequenceStream7);
        org.junit.Assert.assertNotNull(streamArray9);
        org.junit.Assert.assertNotNull(charSequenceStreamArray10);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertNotNull(charSequenceStream18);
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(charSequenceStream22);
        org.junit.Assert.assertNotNull(streamArray24);
        org.junit.Assert.assertNotNull(charSequenceStreamArray25);
        org.junit.Assert.assertNotNull(streamArray31);
        org.junit.Assert.assertNotNull(charSequenceStreamArray32);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        java.lang.String[] strArray6 = new java.lang.String[] { "[0, 100]", "[false, false]", "[0.0, 0.0, 1.0]", "[3, 1, 0, 0, 0, 0, 0, 0, 0]", "[32.0, 32.0, 32.0]", "[100]" };
        java.util.Arrays.parallelSort(strArray6, (int) (short) 0, 4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(strArray6, (-11), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        byte[] byteArray6 = java.util.Arrays.copyOf(byteArray1, (int) ' ');
        java.util.Arrays.fill(byteArray1, (byte) 10);
        java.util.Arrays.fill(byteArray1, (byte) 1);
        int int12 = java.util.Arrays.binarySearch(byteArray1, (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(byteArray1, (int) ' ', 7, (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(32) > toIndex(7)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.util.Arrays.fill(doubleArray4, (int) (byte) 1, (int) 'a', 10.0d);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.fill(longArray3, (long) '4');
        int int10 = java.util.Arrays.binarySearch(longArray3, 0L);
        java.util.Arrays.sort(longArray3);
        int int13 = java.util.Arrays.binarySearch(longArray3, (long) 'a');
        java.util.function.LongBinaryOperator longBinaryOperator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(longArray3, longBinaryOperator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[52, 52, 52]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-4) + "'", int13 == (-4));
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        int int12 = java.util.Arrays.binarySearch(charArray10, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(charArray10, 0, (int) (short) 10, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
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
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        byte[] byteArray3 = new byte[] { (byte) 0 };
        byte[] byteArray5 = new byte[] { (byte) 0 };
        byte[][] byteArray6 = new byte[][] { byteArray1, byteArray3, byteArray5 };
        java.util.stream.Stream<byte[]> byteArrayStream7 = java.util.Arrays.stream(byteArray6);
        java.util.List<byte[]> byteArrayList8 = java.util.Arrays.asList(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort((java.lang.Object[]) byteArray6, (int) (byte) 0, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-2)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
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
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int[] intArray11 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
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
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { (short) 10, 10.0f };
        double[] doubleArray5 = java.util.Arrays.copyOf(doubleArray3, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream6 = java.util.Arrays.stream(doubleArray5);
        boolean boolean7 = java.util.Arrays.equals(doubleArray0, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        java.util.Spliterator.OfDouble ofDouble11 = java.util.Arrays.spliterator(doubleArray4, (int) '4', 100);
        int int15 = java.util.Arrays.binarySearch(doubleArray4, (int) (byte) 10, (int) (byte) 10, (double) (byte) 100);
        int int17 = java.util.Arrays.binarySearch(doubleArray4, (double) 100L);
        java.util.Arrays.parallelSort(doubleArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java.util.Arrays.binarySearch(doubleArray4, 10, (int) (byte) 0, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(10) > toIndex(0)");
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-11) + "'", int15 == (-11));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-101) + "'", int17 == (-101));
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        java.util.Arrays.parallelSort(longArray3);
        java.util.function.LongBinaryOperator longBinaryOperator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(longArray3, 5, 7, longBinaryOperator12);
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
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.parallelSort(charArray4);
        java.util.Arrays.fill(charArray4, 'a');
        java.lang.String str11 = java.util.Arrays.toString(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "aaaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "aaaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, a, a, a]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[a, a, a, a]" + "'", str11, "[a, a, a, a]");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.fill(longArray3, (long) '4');
        java.util.Arrays.parallelSort(longArray3);
        java.util.function.IntToLongFunction intToLongFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSetAll(longArray3, intToLongFunction10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[52, 52, 52]");
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        float[] floatArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(floatArray0, (int) (byte) 10, 100, (float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.parallelSort(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = java.util.Arrays.copyOfRange(byteArray4, (-4), 17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        float[] floatArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray2 = java.util.Arrays.copyOf(floatArray0, (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (short) 100);
        java.util.function.LongBinaryOperator longBinaryOperator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(longArray3, (int) (byte) 1, 3, longBinaryOperator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 100, 100]");
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream5 = java.util.Arrays.stream(doubleArray4);
        java.util.function.DoubleBinaryOperator doubleBinaryOperator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(doubleArray4, 10, (-2), doubleBinaryOperator8);
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
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        long[] longArray3 = new long[] { 10, (-7), (-100) };
        java.util.Arrays.fill(longArray3, (long) (-11));
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray7 = java.util.Arrays.copyOf(longArray3, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-11, -11, -11]");
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        byte[] byteArray6 = java.util.Arrays.copyOf(byteArray4, (int) (byte) 0);
        byte[] byteArray8 = new byte[] { (byte) 1 };
        byte[] byteArray11 = java.util.Arrays.copyOfRange(byteArray8, (int) (short) 1, 2);
        java.util.Arrays.fill(byteArray11, (byte) -1);
        byte[] byteArray15 = java.util.Arrays.copyOf(byteArray11, (int) 'a');
        boolean boolean16 = java.util.Arrays.equals(byteArray4, byteArray11);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        java.io.Serializable[] serializableArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator<java.io.Serializable> serializableSpliterator1 = java.util.Arrays.spliterator(serializableArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        float[] floatArray3 = new float[] { 0.0f, (byte) 0, (short) 1 };
        java.util.Arrays.sort(floatArray3);
        float[] floatArray6 = java.util.Arrays.copyOf(floatArray3, 2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(floatArray6, (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(1) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[0.0, 0.0]");
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        java.util.Spliterator.OfDouble ofDouble11 = java.util.Arrays.spliterator(doubleArray4, (int) '4', 100);
        int int15 = java.util.Arrays.binarySearch(doubleArray4, (int) (byte) 10, (int) (byte) 10, (double) (byte) 100);
        int int17 = java.util.Arrays.binarySearch(doubleArray4, (double) 100L);
        java.util.function.IntToDoubleFunction intToDoubleFunction18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(doubleArray4, intToDoubleFunction18);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-101) + "'", int17 == (-101));
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int int11 = java.util.Arrays.binarySearch(intArray3, 1);
        java.util.Spliterator.OfInt ofInt12 = java.util.Arrays.spliterator(intArray3);
        java.util.Arrays.parallelSort(intArray3);
        java.util.function.IntBinaryOperator intBinaryOperator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(intArray3, intBinaryOperator14);
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
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        long[] longArray0 = new long[] {};
        int int2 = java.util.Arrays.binarySearch(longArray0, (long) '#');
        java.util.Arrays.sort(longArray0);
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray0);
        java.util.Arrays.fill(longArray0, 0L);
        java.util.function.IntToLongFunction intToLongFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(longArray0, intToLongFunction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        int[] intArray9 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        int int11 = java.util.Arrays.binarySearch(intArray3, (int) 'a');
        java.util.Spliterator.OfInt ofInt12 = java.util.Arrays.spliterator(intArray3);
        java.util.Spliterator.OfInt ofInt13 = java.util.Arrays.spliterator(intArray3);
        java.util.Arrays.fill(intArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(intArray3, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(10) > toIndex(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
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
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        long[] longArray0 = new long[] {};
        int int2 = java.util.Arrays.binarySearch(longArray0, (long) '#');
        java.util.Arrays.sort(longArray0);
        java.util.function.IntToLongFunction intToLongFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSetAll(longArray0, intToLongFunction4);
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
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = java.util.Arrays.binarySearch(byteArray4, 10, (-100), (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(10) > toIndex(-100)");
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
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 100 };
        java.util.Arrays.sort(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = java.util.Arrays.copyOfRange(byteArray2, 5, (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 5 > -7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 100]");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        java.lang.Object[] objArray1 = new java.lang.Object[] { "[0, 100]" };
        java.util.Arrays.fill(objArray1, (java.lang.Object) "[hi!, ]");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(objArray1, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[[hi!, ]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[[hi!, ]]");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray2);
        java.util.Spliterator<java.lang.String> strSpliterator4 = java.util.Arrays.spliterator(strArray2);
        long[] longArray8 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream9 = java.util.Arrays.stream(longArray8);
        java.util.Arrays.fill(longArray8, 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill((java.lang.Object[]) strArray2, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.Long");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSpliterator4);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(longStream9);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        long[] longArray11 = java.util.Arrays.copyOfRange(longArray3, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfLong ofLong14 = java.util.Arrays.spliterator(longArray11, (int) '4', (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(52) > fence(-100)");
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
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.sort((java.lang.Object[]) strArray2);
        java.io.Serializable[] serializableArray7 = java.util.Arrays.copyOf((java.io.Serializable[]) strArray2, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(strArray2, 2, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(2) > toIndex(-3)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(serializableArray7);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        boolean[] booleanArray10 = java.util.Arrays.copyOfRange(booleanArray7, (int) (short) 10, (int) '#');
        boolean[] booleanArray13 = java.util.Arrays.copyOfRange(booleanArray10, 3, (int) (byte) 100);
        boolean[] booleanArray19 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray21 = java.util.Arrays.copyOf(booleanArray19, (int) '4');
        boolean[] booleanArray23 = java.util.Arrays.copyOf(booleanArray21, 2);
        boolean boolean24 = java.util.Arrays.equals(booleanArray10, booleanArray21);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, false]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 100 };
        java.util.Arrays.sort(byteArray2);
        int int7 = java.util.Arrays.binarySearch(byteArray2, (int) (byte) 0, 0, (byte) 1);
        byte[] byteArray9 = java.util.Arrays.copyOf(byteArray2, 2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(byteArray9, (int) '4', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(52) > toIndex(2)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 100]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 100]");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) 1 };
        java.util.Arrays.fill(byteArray6, (byte) -1);
        int int10 = java.util.Arrays.binarySearch(byteArray6, (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = java.util.Arrays.binarySearch(byteArray6, 0, (int) ' ', (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = java.util.Arrays.binarySearch(intArray0, (int) (short) 0, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        float[] floatArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(floatArray0, (int) (short) 100, (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        long[] longArray0 = null;
        java.util.function.LongBinaryOperator longBinaryOperator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(longArray0, 5, 2, longBinaryOperator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        double[] doubleArray14 = java.util.Arrays.copyOfRange(doubleArray11, 2, 100);
        double[] doubleArray16 = java.util.Arrays.copyOf(doubleArray11, (int) '#');
        int int18 = java.util.Arrays.binarySearch(doubleArray11, 0.0d);
        java.util.Spliterator.OfDouble ofDouble19 = java.util.Arrays.spliterator(doubleArray11);
        java.util.function.IntToDoubleFunction intToDoubleFunction20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(doubleArray11, intToDoubleFunction20);
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
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(ofDouble19);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream5 = java.util.Arrays.stream(doubleArray4);
        double[] doubleArray8 = new double[] { (short) 10, 10.0f };
        double[] doubleArray10 = java.util.Arrays.copyOf(doubleArray8, (int) (short) 100);
        double[] doubleArray13 = java.util.Arrays.copyOfRange(doubleArray10, 2, (int) 'a');
        double[] doubleArray15 = java.util.Arrays.copyOf(doubleArray10, (int) 'a');
        double[] doubleArray17 = java.util.Arrays.copyOf(doubleArray15, 10);
        java.util.stream.DoubleStream doubleStream18 = java.util.Arrays.stream(doubleArray17);
        double[] doubleArray21 = new double[] { (short) 10, 10.0f };
        double[] doubleArray23 = java.util.Arrays.copyOf(doubleArray21, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream24 = java.util.Arrays.stream(doubleArray23);
        java.util.stream.DoubleStream[] doubleStreamArray25 = new java.util.stream.DoubleStream[] { doubleStream5, doubleStream18, doubleStream24 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<java.util.stream.DoubleStream> doubleStreamStream28 = java.util.Arrays.stream(doubleStreamArray25, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(52) > fence(10)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleStream24);
        org.junit.Assert.assertNotNull(doubleStreamArray25);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.stream.IntStream intStream4 = java.util.Arrays.stream(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(intArray3, 0, (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-11)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        short[] shortArray1 = new short[] { (short) 1 };
        java.util.Arrays.parallelSort(shortArray1, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(shortArray1, 1, (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(1) > toIndex(-7)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        java.util.Spliterator.OfDouble ofDouble11 = java.util.Arrays.spliterator(doubleArray4, (int) '4', 100);
        double[] doubleArray13 = java.util.Arrays.copyOf(doubleArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = java.util.Arrays.copyOf(doubleArray13, (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
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
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        java.util.Spliterator.OfDouble ofDouble11 = java.util.Arrays.spliterator(doubleArray4, (int) '4', 100);
        double[] doubleArray13 = java.util.Arrays.copyOf(doubleArray4, 0);
        java.util.function.IntToDoubleFunction intToDoubleFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(doubleArray4, intToDoubleFunction14);
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
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int6 = java.util.Arrays.binarySearch(doubleArray2, (double) (short) -1);
        java.util.Arrays.sort(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfDouble ofDouble10 = java.util.Arrays.spliterator(doubleArray2, (int) ' ', (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(32) > fence(-5)");
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
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) 100);
        short[] shortArray5 = new short[] {};
        int int7 = java.util.Arrays.binarySearch(shortArray5, (short) 1);
        int int9 = java.util.Arrays.binarySearch(shortArray5, (short) 100);
        short[] shortArray11 = java.util.Arrays.copyOf(shortArray5, (int) '#');
        int int13 = java.util.Arrays.binarySearch(shortArray11, (short) (byte) 0);
        boolean boolean14 = java.util.Arrays.equals(shortArray0, shortArray11);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 17 + "'", int13 == 17);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        long[] longArray9 = java.util.Arrays.copyOf(longArray7, (int) '#');
        java.util.Arrays.fill(longArray9, (long) (byte) 100);
        java.util.stream.LongStream longStream12 = java.util.Arrays.stream(longArray9);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray15 = java.util.Arrays.copyOfRange(longArray9, (int) '4', (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 52 > -101");
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
        org.junit.Assert.assertNotNull(longStream12);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray2);
        java.util.Spliterator<java.lang.String> strSpliterator4 = java.util.Arrays.spliterator(strArray2);
        int[] intArray8 = new int[] { 100 };
        int[] intArray10 = java.util.Arrays.copyOf(intArray8, (int) (short) 100);
        int int14 = java.util.Arrays.binarySearch(intArray10, (int) (byte) 1, 10, 0);
        int[] intArray16 = java.util.Arrays.copyOf(intArray10, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray16);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java.util.Arrays.binarySearch((java.lang.Object[]) strArray2, (-6), 4, (java.lang.Object) intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSpliterator4);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100]");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        java.util.Arrays.fill(shortArray0, (short) -1);
        short[] shortArray6 = java.util.Arrays.copyOf(shortArray0, 7);
        java.util.Arrays.parallelSort(shortArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = java.util.Arrays.binarySearch(shortArray0, 100, 2, (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(2)");
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
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        long[] longArray9 = java.util.Arrays.copyOf(longArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(longArray3, 17, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 52");
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
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        int[] intArray0 = new int[] {};
        java.util.stream.IntStream intStream1 = java.util.Arrays.stream(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream4 = java.util.Arrays.stream(intArray0, 0, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(0) > fence(-2)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intStream1);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) 100);
        short[] shortArray6 = java.util.Arrays.copyOf(shortArray0, (int) '#');
        int int8 = java.util.Arrays.binarySearch(shortArray6, (short) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray11 = java.util.Arrays.copyOfRange(shortArray6, (int) (byte) -1, (int) (byte) 0);
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
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 17 + "'", int8 == 17);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.parallelSort(floatArray3);
        java.util.Arrays.fill(floatArray3, (float) ' ');
        java.util.Arrays.fill(floatArray3, 0, 0, (float) (-4));
        java.lang.String str13 = java.util.Arrays.toString(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[32.0, 32.0, 32.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[32.0, 32.0, 32.0]" + "'", str13, "[32.0, 32.0, 32.0]");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        java.lang.Object[] objArray1 = new java.lang.Object[] { "[0, 100]" };
        java.util.Arrays.fill(objArray1, (java.lang.Object) "[hi!, ]");
        long[] longArray9 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream10 = java.util.Arrays.stream(longArray9);
        java.util.Arrays.fill(objArray1, 0, 0, (java.lang.Object) longStream10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(objArray1, 4, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(4) > toIndex(-100)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[[hi!, ]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[[hi!, ]]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream10);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.parallelSort(charArray4);
        java.util.Arrays.fill(charArray4, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(charArray4, 2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        java.util.Spliterator.OfDouble ofDouble11 = java.util.Arrays.spliterator(doubleArray4, (int) '4', 100);
        int int15 = java.util.Arrays.binarySearch(doubleArray4, (int) (byte) 10, (int) (byte) 10, (double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = java.util.Arrays.copyOf(doubleArray4, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
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
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.fill(byteArray4, (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = java.util.Arrays.copyOfRange(byteArray4, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1]");
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.parallelSort(charArray4);
        int int10 = java.util.Arrays.binarySearch(charArray4, 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int14 = java.util.Arrays.binarySearch(charArray4, (-3), (-4), '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(-3) > toIndex(-4)");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        long[] longArray0 = new long[] {};
        int int2 = java.util.Arrays.binarySearch(longArray0, (long) '#');
        java.util.Arrays.sort(longArray0);
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray0);
        java.util.function.IntToLongFunction intToLongFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSetAll(longArray0, intToLongFunction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.util.Arrays.binarySearch(doubleArray0, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(charArray0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfLong ofLong9 = java.util.Arrays.spliterator(longArray3, (-4), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray1);
        java.util.function.IntBinaryOperator intBinaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(intArray1, intBinaryOperator5);
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
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        boolean[] booleanArray10 = java.util.Arrays.copyOfRange(booleanArray7, (int) (short) 10, (int) '#');
        java.util.Arrays.fill(booleanArray7, true);
        java.lang.String str13 = java.util.Arrays.toString(booleanArray7);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true]" + "'", str13, "[true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true]");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        java.util.Spliterator.OfDouble ofDouble11 = java.util.Arrays.spliterator(doubleArray4, (int) '4', 100);
        int int15 = java.util.Arrays.binarySearch(doubleArray4, (int) (byte) 10, (int) (byte) 10, (double) (byte) 100);
        int int17 = java.util.Arrays.binarySearch(doubleArray4, (double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfDouble ofDouble20 = java.util.Arrays.spliterator(doubleArray4, (-7), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -7");
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-11) + "'", int15 == (-11));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-101) + "'", int17 == (-101));
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        int[] intArray9 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        java.util.Spliterator.OfInt ofInt10 = java.util.Arrays.spliterator(intArray9);
        java.util.Arrays.fill(intArray9, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfInt ofInt15 = java.util.Arrays.spliterator(intArray9, 100, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(100) > fence(4)");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52]");
        org.junit.Assert.assertNotNull(ofInt10);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        java.util.Arrays.parallelSort(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = java.util.Arrays.binarySearch(charArray4, (int) '4', 3, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(52) > toIndex(3)");
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
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        java.lang.Object[] objArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(objArray0, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        long[] longArray4 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream5 = java.util.Arrays.stream(longArray4);
        java.util.Arrays.fill(longArray4, (long) (byte) 10);
        java.util.Arrays.fill(longArray4, (long) '4');
        int int11 = java.util.Arrays.binarySearch(longArray4, 0L);
        java.util.Arrays.sort(longArray4);
        int int14 = java.util.Arrays.binarySearch(longArray4, (long) 'a');
        java.util.Arrays.fill(objArray0, (java.lang.Object) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<java.lang.Object> objStream18 = java.util.Arrays.stream(objArray0, 2, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 4");
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
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.parallelSort(floatArray3);
        java.util.Arrays.fill(floatArray3, (float) ' ');
        java.util.Arrays.fill(floatArray3, 0, 0, (float) (-4));
        int int14 = java.util.Arrays.binarySearch(floatArray3, 100.0f);
        java.util.Arrays.fill(floatArray3, (float) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(floatArray3, (-96), (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -96");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-4) + "'", int14 == (-4));
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        int int9 = java.util.Arrays.binarySearch(longArray3, (long) 100);
        java.lang.String str10 = java.util.Arrays.toString(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[100, 3, 1]" + "'", str10, "[100, 3, 1]");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        boolean[] booleanArray10 = java.util.Arrays.copyOfRange(booleanArray7, (int) (short) 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray12 = java.util.Arrays.copyOf(booleanArray7, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
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
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        int[] intArray9 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        java.lang.Class<?> wildcardClass10 = intArray9.getClass();
        java.lang.reflect.Type[] typeArray11 = new java.lang.reflect.Type[] { wildcardClass10 };
        java.lang.reflect.Type[] typeArray13 = java.util.Arrays.copyOf(typeArray11, 2);
        int[] intArray15 = new int[] { 100 };
        int[] intArray17 = java.util.Arrays.copyOf(intArray15, (int) (short) 100);
        int int21 = java.util.Arrays.binarySearch(intArray17, (int) (byte) 1, 10, 0);
        int[] intArray23 = java.util.Arrays.copyOf(intArray17, (int) (short) 100);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        java.lang.reflect.Type[] typeArray25 = new java.lang.reflect.Type[] { wildcardClass24 };
        java.lang.reflect.Type[] typeArray27 = java.util.Arrays.copyOf(typeArray25, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = java.util.Arrays.binarySearch((java.lang.Object[]) typeArray13, (java.lang.Object) typeArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray27);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.parallelSort(charArray4);
        java.util.Arrays.sort(charArray4);
        int int11 = java.util.Arrays.binarySearch(charArray4, 'a');
        char[] charArray16 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray16, (int) (byte) 1, 3);
        java.util.Arrays.parallelSort(charArray16);
        java.util.Arrays.sort(charArray16);
        int int23 = java.util.Arrays.binarySearch(charArray16, '#');
        boolean boolean24 = java.util.Arrays.equals(charArray4, charArray16);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , 4, a, a]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), " 4aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), " 4aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ , 4, a, a]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-2) + "'", int23 == (-2));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        boolean[] booleanArray2 = new boolean[] { true, true };
        java.util.Arrays.fill(booleanArray2, false);
        boolean[] booleanArray6 = java.util.Arrays.copyOf(booleanArray2, 0);
        java.util.Arrays.fill(booleanArray2, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray11 = java.util.Arrays.copyOfRange(booleanArray2, 17, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 17 > 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[false, false]");
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[]");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        long[] longArray11 = java.util.Arrays.copyOfRange(longArray3, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = java.util.Arrays.binarySearch(longArray11, 1, 100, (long) (byte) 0);
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
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[]");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray4, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(charArray4, (-101), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4, 4, 4]");
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream3 = java.util.Arrays.stream(charSequenceArray2);
        java.util.stream.Stream<java.lang.Object> objStream4 = java.util.Arrays.stream((java.lang.Object[]) charSequenceArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = java.util.Arrays.binarySearch((java.lang.Object[]) charSequenceArray2, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertNotNull(charSequenceStream3);
        org.junit.Assert.assertNotNull(objStream4);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.parallelSort(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray11 = java.util.Arrays.copyOfRange(charArray4, 0, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 0 > -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , 4, a, a]");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        int[] intArray9 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = java.util.Arrays.copyOfRange(intArray9, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100]");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(intArray0, (-11), (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray2 = java.util.Arrays.copyOf(doubleArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        float[] floatArray3 = new float[] { (short) 0, 10L, (-2) };
        float[] floatArray5 = java.util.Arrays.copyOf(floatArray3, (int) ' ');
        java.lang.String str6 = java.util.Arrays.toString(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 10.0, -2.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, 10.0, -2.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[0.0, 10.0, -2.0]" + "'", str6, "[0.0, 10.0, -2.0]");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray3, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfInt ofInt9 = java.util.Arrays.spliterator(intArray3, (-4), 7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        int int12 = java.util.Arrays.binarySearch(charArray10, 'a');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray15 = java.util.Arrays.copyOfRange(charArray10, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.sort(floatArray3);
        float[] floatArray8 = java.util.Arrays.copyOf(floatArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(floatArray3, 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(35)");
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
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray4, '#');
        java.util.Arrays.sort(charArray4);
        int int12 = java.util.Arrays.binarySearch(charArray4, 'a');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray15 = java.util.Arrays.copyOfRange(charArray4, (-4), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-5) + "'", int12 == (-5));
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.fill(byteArray4, (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(byteArray4, (-5), 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1]");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        float[] floatArray1 = new float[] { (-1L) };
        int int3 = java.util.Arrays.binarySearch(floatArray1, (float) (short) -1);
        java.util.Arrays.sort(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray7 = java.util.Arrays.copyOfRange(floatArray1, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = java.util.Arrays.binarySearch(charArray4, (-11), 5, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -11");
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
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Spliterator.OfInt ofInt8 = java.util.Arrays.spliterator(intArray3);
        java.util.Arrays.parallelSort(intArray3, 0, 7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(intArray3, (int) 'a', (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(97) > toIndex(-5)");
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
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(intArray3, (int) '4', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(52) > toIndex(3)");
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
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        java.util.Arrays.sort(doubleArray7);
        java.lang.String str9 = java.util.Arrays.toString(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]" + "'", str9, "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray4, '#');
        java.util.Arrays.sort(charArray4);
        java.util.Arrays.parallelSort(charArray4);
        char[] charArray16 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray16, (int) (byte) 1, 3);
        boolean boolean20 = java.util.Arrays.equals(charArray4, charArray16);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "a 4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "a 4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[a,  , 4, a]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, 0L);
        java.util.Arrays.parallelSort(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(longArray3, (-11), (int) '4', 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        float[] floatArray3 = new float[] { (-7), 1L, 7 };
        java.lang.String str4 = java.util.Arrays.toString(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-7.0, 1.0, 7.0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[-7.0, 1.0, 7.0]" + "'", str4, "[-7.0, 1.0, 7.0]");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        java.lang.Class<?>[][] wildcardClassArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?>[][] wildcardClassArray3 = java.util.Arrays.copyOfRange(wildcardClassArray0, 0, (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray3 = java.util.Arrays.copyOfRange(shortArray0, (int) (short) 0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        short[] shortArray6 = new short[] { (short) 100, (short) 1, (byte) 10, (byte) 1, (short) -1, (short) 1 };
        java.util.Arrays.parallelSort(shortArray6);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray9 = java.util.Arrays.copyOf(shortArray6, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 1, 1, 1, 10, 100]");
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        java.util.Arrays.sort(doubleArray11);
        java.util.Spliterator.OfDouble ofDouble15 = java.util.Arrays.spliterator(doubleArray11, 10, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfDouble ofDouble18 = java.util.Arrays.spliterator(doubleArray11, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 97");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(ofDouble15);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        float[] floatArray1 = new float[] { (-1L) };
        int int3 = java.util.Arrays.binarySearch(floatArray1, (float) (short) -1);
        java.util.Arrays.sort(floatArray1);
        java.util.Arrays.fill(floatArray1, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray9 = java.util.Arrays.copyOfRange(floatArray1, (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 52 > 35");
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
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray4, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(charArray4, 5, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(5) > toIndex(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        java.util.Arrays.sort(doubleArray4);
        java.util.Arrays.fill(doubleArray4, 7, (int) '#', (double) 7);
        java.lang.String str13 = java.util.Arrays.toString(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0]" + "'", str13, "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0]");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.fill(byteArray4, (byte) -1);
        byte[] byteArray8 = java.util.Arrays.copyOf(byteArray4, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int12 = java.util.Arrays.binarySearch(byteArray4, (int) (short) 1, (-96), (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(1) > toIndex(-96)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        int[] intArray9 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream12 = java.util.Arrays.stream(intArray3, (-101), (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -101");
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
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream5 = java.util.Arrays.stream(doubleArray4);
        java.util.Arrays.fill(doubleArray4, (double) (short) -1);
        java.util.Spliterator.OfDouble ofDouble8 = java.util.Arrays.spliterator(doubleArray4);
        java.util.Spliterator.OfDouble[] ofDoubleArray9 = new java.util.Spliterator.OfDouble[] { ofDouble8 };
        java.util.List<java.util.Spliterator.OfDouble> ofDoubleList10 = java.util.Arrays.asList(ofDoubleArray9);
        java.lang.Object[] objArray11 = null;
        boolean boolean12 = java.util.Arrays.deepEquals((java.lang.Object[]) ofDoubleArray9, objArray11);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(ofDouble8);
        org.junit.Assert.assertNotNull(ofDoubleArray9);
        org.junit.Assert.assertNotNull(ofDoubleList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        float[] floatArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(floatArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) 1 };
        java.util.Arrays.fill(byteArray6, (byte) -1);
        int int10 = java.util.Arrays.binarySearch(byteArray6, (byte) -1);
        java.util.Arrays.parallelSort(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(byteArray6, 0, (-96));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-96)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.fill(byteArray4, (byte) -1);
        int int8 = java.util.Arrays.binarySearch(byteArray4, (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(byteArray4, (int) (byte) 0, 100, (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.parallelSort(floatArray3);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray9 = java.util.Arrays.copyOfRange(floatArray3, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100 > 0");
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
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray2);
        java.lang.Object obj4 = null;
        java.util.Arrays.fill((java.lang.Object[]) strArray2, obj4);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable[] serializableArray7 = java.util.Arrays.copyOf((java.io.Serializable[]) strArray2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.fill(longArray3, (long) '4');
        java.util.Arrays.parallelSort(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfLong ofLong12 = java.util.Arrays.spliterator(longArray3, 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(10) > fence(0)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[52, 52, 52]");
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfInt ofInt6 = java.util.Arrays.spliterator(intArray1, (-100), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        short[] shortArray6 = new short[] { (byte) -1, (byte) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
        java.util.Arrays.parallelSort(shortArray6);
        java.util.Arrays.sort(shortArray6);
        short[] shortArray10 = java.util.Arrays.copyOf(shortArray6, 100);
        int int12 = java.util.Arrays.binarySearch(shortArray10, (short) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(shortArray10, (-96), 1, (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -96");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-101) + "'", int12 == (-101));
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        long[] longArray9 = java.util.Arrays.copyOf(longArray7, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int13 = java.util.Arrays.binarySearch(longArray9, (-36), (-5), (long) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -36");
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
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        int[] intArray9 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        int int11 = java.util.Arrays.binarySearch(intArray3, (int) 'a');
        java.util.Spliterator.OfInt ofInt12 = java.util.Arrays.spliterator(intArray3);
        java.util.Spliterator.OfInt ofInt13 = java.util.Arrays.spliterator(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(intArray3, (-100), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -100");
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
        org.junit.Assert.assertNotNull(ofInt13);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.fill(intArray3, (int) (short) 1);
        java.util.Arrays.fill(intArray3, (int) ' ', (int) (short) 100, 0);
        java.util.function.IntUnaryOperator intUnaryOperator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(intArray3, intUnaryOperator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        byte[] byteArray3 = new byte[] { (byte) 0 };
        byte[] byteArray5 = new byte[] { (byte) 0 };
        byte[][] byteArray6 = new byte[][] { byteArray1, byteArray3, byteArray5 };
        java.util.stream.Stream<byte[]> byteArrayStream7 = java.util.Arrays.stream(byteArray6);
        java.util.List<byte[]> byteArrayList8 = java.util.Arrays.asList(byteArray6);
        java.lang.String str9 = java.util.Arrays.toString((java.lang.Object[]) byteArray6);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArrayStream7);
        org.junit.Assert.assertNotNull(byteArrayList8);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        boolean[] booleanArray2 = new boolean[] { true, true };
        java.util.Arrays.fill(booleanArray2, false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(booleanArray2, (-2), (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[false, false]");
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.parallelSort(charArray4);
        java.util.Arrays.fill(charArray4, 'a');
        char[] charArray15 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray15, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray15, '#');
        char[] charArray22 = java.util.Arrays.copyOf(charArray15, (int) (byte) 1);
        boolean boolean23 = java.util.Arrays.equals(charArray4, charArray15);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "aaaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "aaaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, a, a, a]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[#, #, #, #]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Spliterator.OfInt ofInt8 = java.util.Arrays.spliterator(intArray3);
        java.util.Arrays.parallelSort(intArray3, 0, 7);
        int int13 = java.util.Arrays.binarySearch(intArray3, 3);
        java.util.function.IntBinaryOperator intBinaryOperator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(intArray3, intBinaryOperator14);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-101) + "'", int13 == (-101));
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray4, '#');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray11 = java.util.Arrays.copyOf(charArray4, (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        java.util.function.DoubleBinaryOperator doubleBinaryOperator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(doubleArray9, doubleBinaryOperator12);
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
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        java.lang.Object[] objArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = java.util.Arrays.binarySearch(objArray0, 5, (int) (byte) -1, (java.lang.Object) "[1, 100, 1, 10, 0]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.parallelSort(charArray4);
        java.util.Arrays.fill(charArray4, '#');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray13 = java.util.Arrays.copyOfRange(charArray4, 17, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 17 > 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        float[] floatArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = java.util.Arrays.binarySearch(floatArray0, 0, (int) (byte) -1, (float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(shortArray0, (-7), 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        java.util.Arrays.fill(doubleArray4, (double) 10);
        java.util.function.DoubleBinaryOperator doubleBinaryOperator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(doubleArray4, (int) (short) 0, (int) ' ', doubleBinaryOperator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        java.util.Spliterator.OfDouble ofDouble10 = java.util.Arrays.spliterator(doubleArray7, 10, (int) '#');
        double[] doubleArray11 = null;
        boolean boolean12 = java.util.Arrays.equals(doubleArray7, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(ofDouble10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.fill(byteArray4, (byte) -1);
        int int8 = java.util.Arrays.binarySearch(byteArray4, (byte) 1);
        java.lang.String str9 = java.util.Arrays.toString(byteArray4);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[-1]" + "'", str9, "[-1]");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        int[] intArray9 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        java.lang.Class<?> wildcardClass10 = intArray9.getClass();
        java.lang.reflect.Type[] typeArray11 = new java.lang.reflect.Type[] { wildcardClass10 };
        java.lang.reflect.Type[] typeArray13 = java.util.Arrays.copyOf(typeArray11, 2);
        java.lang.Class<?> wildcardClass14 = typeArray11.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        java.util.Arrays.fill(shortArray0, (short) (byte) -1);
        short[] shortArray6 = java.util.Arrays.copyOf(shortArray0, 5);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray9 = java.util.Arrays.copyOfRange(shortArray6, 10, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10 > 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 0, 0, 0]");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        float[] floatArray3 = new float[] { 0.0f, (byte) 0, (short) 1 };
        java.util.Arrays.sort(floatArray3);
        float[] floatArray6 = java.util.Arrays.copyOf(floatArray3, 2);
        java.lang.String str7 = java.util.Arrays.toString(floatArray6);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[0.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0.0, 0.0]" + "'", str7, "[0.0, 0.0]");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Spliterator.OfInt ofInt8 = java.util.Arrays.spliterator(intArray3);
        java.util.Arrays.parallelSort(intArray3, 0, 7);
        int int13 = java.util.Arrays.binarySearch(intArray3, 3);
        java.util.stream.IntStream intStream14 = java.util.Arrays.stream(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream17 = java.util.Arrays.stream(intArray3, (int) 'a', (-96));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(97) > fence(-96)");
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
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.fill(byteArray4, (byte) -1);
        int int8 = java.util.Arrays.binarySearch(byteArray4, (byte) 0);
        java.lang.String str9 = java.util.Arrays.toString(byteArray4);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[-1]" + "'", str9, "[-1]");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        short[] shortArray6 = new short[] { (byte) -1, (byte) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
        java.util.Arrays.parallelSort(shortArray6);
        java.util.Arrays.sort(shortArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(shortArray6, (int) (short) -1, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.sort((java.lang.Object[]) strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(strArray2, (int) (short) 1, (-36));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(1) > toIndex(-36)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int int11 = java.util.Arrays.binarySearch(intArray3, 1);
        java.util.Spliterator.OfInt ofInt12 = java.util.Arrays.spliterator(intArray3);
        java.util.function.IntBinaryOperator intBinaryOperator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(intArray3, (-4), 100, intBinaryOperator15);
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
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.util.List<java.lang.reflect.Type> typeList1 = java.util.Arrays.asList(typeArray0);
        long[] longArray5 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream6 = java.util.Arrays.stream(longArray5);
        long[] longArray9 = java.util.Arrays.copyOfRange(longArray5, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong10 = java.util.Arrays.spliterator(longArray9);
        java.util.Arrays.fill((java.lang.Object[]) typeArray0, (java.lang.Object) ofLong10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort((java.lang.Object[]) typeArray0, 4, (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(4) > toIndex(-11)");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        java.lang.Object[] objArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(objArray0, (-11), 17, (java.lang.Object) "[hi!, ]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        double[] doubleArray0 = null;
        java.util.function.IntToDoubleFunction intToDoubleFunction1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(doubleArray0, intToDoubleFunction1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        java.util.Arrays.sort(doubleArray4);
        java.lang.String str9 = java.util.Arrays.toString(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0]" + "'", str9, "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0]");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong8 = java.util.Arrays.spliterator(longArray7);
        long[] longArray10 = java.util.Arrays.copyOf(longArray7, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfLong ofLong13 = java.util.Arrays.spliterator(longArray7, (-96), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -96");
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
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        java.util.Arrays.fill(doubleArray9, (double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(doubleArray9, (-100), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -100");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        float[] floatArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(floatArray0, (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = java.util.Arrays.binarySearch(longArray3, 10, (-6), (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(10) > toIndex(-6)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = java.util.Arrays.binarySearch(charArray10, (int) (byte) 0, 17, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 17");
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
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.fill(longArray3, (long) '4');
        int int10 = java.util.Arrays.binarySearch(longArray3, 0L);
        java.util.Arrays.sort(longArray3);
        int int13 = java.util.Arrays.binarySearch(longArray3, (long) 'a');
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-4) + "'", int13 == (-4));
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(doubleArray4, (-96), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -96");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        short[] shortArray5 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray11 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray17 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray23 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray29 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[] shortArray35 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        short[][] shortArray36 = new short[][] { shortArray5, shortArray11, shortArray17, shortArray23, shortArray29, shortArray35 };
        java.util.Spliterator<short[]> shortArraySpliterator37 = java.util.Arrays.spliterator(shortArray36);
        int[] intArray41 = new int[] { 100 };
        int[] intArray43 = java.util.Arrays.copyOf(intArray41, (int) (short) 100);
        java.util.Arrays.fill(intArray43, (int) (short) 1);
        java.util.Arrays.fill(intArray43, (int) ' ', (int) (short) 100, 0);
        int[] intArray52 = java.util.Arrays.copyOfRange(intArray43, 0, (int) '4');
        java.util.Arrays.sort(intArray43);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill((java.lang.Object[]) shortArray36, (int) '4', (int) (short) -1, (java.lang.Object) intArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(52) > toIndex(-1)");
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
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = java.util.Arrays.copyOfRange(byteArray1, (-6), (-96));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -6 > -96");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, 0L);
        java.util.Arrays.parallelSort(longArray3);
        java.util.Arrays.fill(longArray3, (long) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfLong ofLong12 = java.util.Arrays.spliterator(longArray3, 10, (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(10) > fence(-6)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[35, 35, 35]");
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.stream.LongStream longStream7 = java.util.Arrays.stream(longArray3);
        java.util.function.IntToLongFunction intToLongFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSetAll(longArray3, intToLongFunction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        float[] floatArray5 = new float[] { 0, (-4), 10, 3, (-3) };
        int int7 = java.util.Arrays.binarySearch(floatArray5, 100.0f);
        int int9 = java.util.Arrays.binarySearch(floatArray5, (float) 5);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray11 = java.util.Arrays.copyOf(floatArray5, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -4.0, 10.0, 3.0, -3.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-6) + "'", int7 == (-6));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        java.util.Spliterator.OfDouble ofDouble10 = java.util.Arrays.spliterator(doubleArray7, 10, (int) '#');
        int int12 = java.util.Arrays.binarySearch(doubleArray7, (double) (-1));
        java.util.function.DoubleBinaryOperator doubleBinaryOperator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(doubleArray7, (int) '4', (int) ' ', doubleBinaryOperator15);
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
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
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
            int int19 = java.util.Arrays.binarySearch(longArray3, (int) '#', (-7), (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(35) > toIndex(-7)");
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
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        java.lang.reflect.Type[][] typeArray0 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray1 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray2 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray3 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray4 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray5 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][][] typeArray6 = new java.lang.reflect.Type[][][] { typeArray0, typeArray1, typeArray2, typeArray3, typeArray4, typeArray5 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator<java.lang.reflect.Type[][]> typeArraySpliterator9 = java.util.Arrays.spliterator(typeArray6, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(1) > fence(-1)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(typeArray6);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.fill(intArray3, (int) (short) 1);
        java.util.Arrays.fill(intArray3, (int) ' ', (int) (short) 100, 0);
        int[] intArray12 = java.util.Arrays.copyOfRange(intArray3, 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(intArray3, (-5), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong8 = java.util.Arrays.spliterator(longArray7);
        java.util.Arrays.parallelSort(longArray7);
        int int13 = java.util.Arrays.binarySearch(longArray7, 1, 4, (long) 3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream16 = java.util.Arrays.stream(longArray7, (-5), (-4));
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[0, 0, 0, 0, 0, 0, 0, 1, 3]");
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-5) + "'", int13 == (-5));
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong8 = java.util.Arrays.spliterator(longArray7);
        long[] longArray10 = java.util.Arrays.copyOf(longArray7, (int) (byte) 1);
        long[] longArray12 = java.util.Arrays.copyOf(longArray10, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java.util.Arrays.binarySearch(longArray10, (int) 'a', (int) (byte) 0, (long) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(97) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 0 };
        java.util.Arrays.parallelSort(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(byteArray6, 3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 0, 1, 1, 10]");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        boolean[] booleanArray9 = java.util.Arrays.copyOf(booleanArray5, 2);
        java.util.Arrays.fill(booleanArray9, false);
        boolean[] booleanArray14 = new boolean[] { true, false };
        boolean[] booleanArray17 = java.util.Arrays.copyOfRange(booleanArray14, (int) (byte) 0, (int) (byte) 0);
        boolean boolean18 = java.util.Arrays.equals(booleanArray9, booleanArray17);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false]");
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, false]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        int int7 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        int int9 = java.util.Arrays.binarySearch(floatArray3, (float) (byte) 10);
        java.util.Arrays.sort(floatArray3);
        java.util.Arrays.sort(floatArray3, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(floatArray3, (-36), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -36");
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
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.sort((java.lang.Object[]) strArray2);
        java.io.Serializable[] serializableArray7 = java.util.Arrays.copyOf((java.io.Serializable[]) strArray2, 100);
        java.util.Arrays.parallelSort(strArray2);
        double[] doubleArray13 = new double[] { (short) 10, 10.0f };
        double[] doubleArray15 = java.util.Arrays.copyOf(doubleArray13, (int) (short) 100);
        double[] doubleArray18 = java.util.Arrays.copyOfRange(doubleArray15, 2, (int) 'a');
        double[] doubleArray20 = java.util.Arrays.copyOf(doubleArray15, (int) 'a');
        double[] doubleArray22 = java.util.Arrays.copyOf(doubleArray20, 10);
        double[] doubleArray25 = java.util.Arrays.copyOfRange(doubleArray22, 2, 100);
        double[] doubleArray27 = java.util.Arrays.copyOf(doubleArray22, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int28 = java.util.Arrays.binarySearch((java.lang.Object[]) strArray2, (int) (byte) 10, 100, (java.lang.Object) doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(serializableArray7);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        float[] floatArray1 = new float[] { (-1L) };
        int int3 = java.util.Arrays.binarySearch(floatArray1, (float) (short) -1);
        java.util.Arrays.sort(floatArray1);
        java.util.Arrays.fill(floatArray1, 0.0f);
        java.util.Arrays.sort(floatArray1);
        java.util.Arrays.parallelSort(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(floatArray1, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
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
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray4, '#');
        char[] charArray11 = java.util.Arrays.copyOf(charArray4, (int) (byte) 1);
        char[] charArray13 = java.util.Arrays.copyOf(charArray4, 5);
        java.util.Arrays.fill(charArray13, 'a');
        java.util.Arrays.sort(charArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(charArray13, (-3), (int) (short) 100, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -3");
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
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        java.util.Arrays.parallelSort(longArray3);
        int int11 = java.util.Arrays.binarySearch(longArray3, (long) 2);
        int int13 = java.util.Arrays.binarySearch(longArray3, (long) (-3));
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream16 = java.util.Arrays.stream(longArray3, 100, (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(100) > fence(-7)");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.fill(longArray3, (long) '4');
        int int10 = java.util.Arrays.binarySearch(longArray3, 0L);
        java.util.Arrays.sort(longArray3);
        int int13 = java.util.Arrays.binarySearch(longArray3, (long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(longArray3, (-2), 0, (long) 17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[52, 52, 52]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-4) + "'", int13 == (-4));
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        char[] charArray0 = null;
        char[] charArray5 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray5, (int) (byte) 1, 3);
        java.util.Arrays.parallelSort(charArray5);
        java.util.Arrays.sort(charArray5);
        int int12 = java.util.Arrays.binarySearch(charArray5, 'a');
        boolean boolean13 = java.util.Arrays.equals(charArray0, charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " 4aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " 4aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , 4, a, a]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        java.util.Arrays.parallelSort(longArray3);
        int int11 = java.util.Arrays.binarySearch(longArray3, (long) 2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfLong ofLong14 = java.util.Arrays.spliterator(longArray3, 2, (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.parallelSort(charArray4);
        java.util.Arrays.sort(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray12 = java.util.Arrays.copyOfRange(charArray4, (-6), 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , 4, a, a]");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        long[] longArray9 = java.util.Arrays.copyOf(longArray7, (int) '#');
        java.util.function.IntToLongFunction intToLongFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSetAll(longArray9, intToLongFunction10);
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
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        double[] doubleArray3 = new double[] { 1.0d, (-1L), 3 };
        java.lang.String str4 = java.util.Arrays.toString(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, -1.0, 3.0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[1.0, -1.0, 3.0]" + "'", str4, "[1.0, -1.0, 3.0]");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        byte[] byteArray8 = java.util.Arrays.copyOf(byteArray4, 10);
        java.lang.String str9 = java.util.Arrays.toString(byteArray4);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0]" + "'", str9, "[0]");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
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
        java.util.List<java.util.Spliterator<short[]>> shortArraySpliteratorList44 = java.util.Arrays.asList(shortArraySpliteratorArray40);
        java.lang.reflect.Type[][] typeArray45 = new java.lang.reflect.Type[][] {};
        java.util.stream.Stream<java.lang.reflect.Type[]> typeArrayStream46 = java.util.Arrays.stream(typeArray45);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill((java.lang.Object[]) shortArraySpliteratorArray40, (java.lang.Object) typeArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: [[Ljava.lang.reflect.Type;");
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
        org.junit.Assert.assertNotNull(shortArraySpliteratorList44);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(typeArrayStream46);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.sort((java.lang.Object[]) strArray2);
        java.io.Serializable[] serializableArray7 = java.util.Arrays.copyOf((java.io.Serializable[]) strArray2, 100);
        java.util.Arrays.parallelSort(strArray2);
        long[] longArray12 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream13 = java.util.Arrays.stream(longArray12);
        java.util.Arrays.fill(longArray12, (long) (byte) 10);
        java.util.Arrays.fill(longArray12, (long) '4');
        java.util.Arrays.fill(longArray12, (long) (-36));
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill((java.lang.Object[]) strArray2, (java.lang.Object) longArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: [J");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(serializableArray7);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[-36, -36, -36]");
        org.junit.Assert.assertNotNull(longStream13);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        java.util.Arrays.sort(doubleArray4);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = java.util.Arrays.copyOfRange(doubleArray4, (-3), 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
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
        java.lang.reflect.Type[] typeArray24 = new java.lang.reflect.Type[] {};
        java.util.List<java.lang.reflect.Type> typeList25 = java.util.Arrays.asList(typeArray24);
        boolean boolean26 = java.util.Arrays.deepEquals((java.lang.Object[]) charSequenceBaseStreamArray14, (java.lang.Object[]) typeArray24);
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertNotNull(charSequenceStream3);
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertNotNull(charSequenceStream7);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(charSequenceStream11);
        org.junit.Assert.assertNotNull(baseStreamArray13);
        org.junit.Assert.assertNotNull(charSequenceBaseStreamArray14);
        org.junit.Assert.assertNotNull(charSequenceBaseStreamStream23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray4 = java.util.Arrays.copyOf((java.lang.Class<?>[]) classArray1, 3);
        double[] doubleArray9 = new double[] { (short) 10, 10.0f };
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, (int) (short) 100);
        double[] doubleArray14 = java.util.Arrays.copyOfRange(doubleArray11, 2, (int) 'a');
        double[] doubleArray16 = java.util.Arrays.copyOf(doubleArray11, (int) 'a');
        double[] doubleArray18 = java.util.Arrays.copyOf(doubleArray16, 10);
        double[] doubleArray21 = java.util.Arrays.copyOfRange(doubleArray18, 2, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill((java.lang.Object[]) classArray1, 17, 4, (java.lang.Object) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(17) > toIndex(4)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong8 = java.util.Arrays.spliterator(longArray7);
        long[] longArray10 = java.util.Arrays.copyOf(longArray7, (int) (byte) 1);
        java.util.stream.LongStream longStream11 = java.util.Arrays.stream(longArray10);
        long[] longArray15 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream16 = java.util.Arrays.stream(longArray15);
        long[] longArray19 = java.util.Arrays.copyOfRange(longArray15, (int) (byte) 1, 10);
        long[] longArray21 = java.util.Arrays.copyOf(longArray19, (int) '#');
        java.util.Arrays.fill(longArray21, (long) (byte) 100);
        java.util.stream.LongStream longStream24 = java.util.Arrays.stream(longArray21);
        boolean boolean25 = java.util.Arrays.equals(longArray10, longArray21);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[3]");
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream16);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100]");
        org.junit.Assert.assertNotNull(longStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        java.util.Arrays.fill(shortArray0, (short) -1);
        short[] shortArray6 = java.util.Arrays.copyOf(shortArray0, 7);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray9 = java.util.Arrays.copyOfRange(shortArray6, (-11), (-96));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -11 > -96");
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
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        java.util.Arrays.fill(shortArray0, (short) -1);
        short[] shortArray6 = java.util.Arrays.copyOf(shortArray0, 7);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray9 = java.util.Arrays.copyOfRange(shortArray6, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        java.util.Arrays.sort(doubleArray4);
        java.util.Arrays.fill(doubleArray4, 7, (int) '#', (double) 7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfDouble ofDouble15 = java.util.Arrays.spliterator(doubleArray4, (-53), (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(-53) > fence(-101)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray4, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(charArray4, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4, 4, 4]");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.parallelSort(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(longArray3, (int) (short) 1, (-36));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(1) > toIndex(-36)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        int[] intArray9 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(intArray9, (-100), (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -100");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100]");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        int[] intArray9 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        int int11 = java.util.Arrays.binarySearch(intArray3, (int) 'a');
        java.util.Arrays.parallelSort(intArray3);
        java.util.Arrays.parallelSort(intArray3);
        java.util.function.IntUnaryOperator intUnaryOperator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSetAll(intArray3, intUnaryOperator14);
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-101) + "'", int11 == (-101));
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        java.util.Arrays.sort(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(longArray3, (-11), 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -11");
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
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream9 = java.util.Arrays.stream(longArray3, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        short[] shortArray6 = new short[] { (byte) -1, (byte) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
        java.util.Arrays.parallelSort(shortArray6);
        java.util.Arrays.sort(shortArray6);
        short[] shortArray10 = java.util.Arrays.copyOf(shortArray6, 100);
        java.util.Arrays.sort(shortArray10);
        java.lang.String str12 = java.util.Arrays.toString(shortArray10);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]" + "'", str12, "[-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.fill(intArray3, (int) (short) 1);
        java.util.Arrays.fill(intArray3, (int) ' ', (int) (short) 100, 0);
        java.util.Spliterator.OfInt ofInt12 = java.util.Arrays.spliterator(intArray3, 4, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(intArray3, 0, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-4)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofInt12);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.sort(intArray3);
        java.util.stream.IntStream intStream9 = java.util.Arrays.stream(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = java.util.Arrays.binarySearch(intArray3, 3, (-96), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(3) > toIndex(-96)");
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
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.fill(longArray3, (long) '4');
        java.util.Arrays.parallelSort(longArray3);
        java.util.stream.LongStream longStream10 = java.util.Arrays.stream(longArray3);
        java.util.function.IntToLongFunction intToLongFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSetAll(longArray3, intToLongFunction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[52, 52, 52]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream10);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        int int3 = java.util.Arrays.binarySearch(byteArray1, (byte) 1);
        byte[] byteArray5 = java.util.Arrays.copyOf(byteArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(byteArray5, 100, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(5)");
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
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.util.Spliterator.OfDouble ofDouble5 = java.util.Arrays.spliterator(doubleArray2);
        java.util.Arrays.sort(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(doubleArray2, 4, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(4) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(ofDouble5);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = java.util.Arrays.binarySearch(intArray0, (-1), (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        long[] longArray3 = new long[] { 10, (-7), (-100) };
        java.util.Arrays.fill(longArray3, (long) (-11));
        // The following exception was thrown during execution in test generation
        try {
            int int9 = java.util.Arrays.binarySearch(longArray3, (int) (short) 10, 100, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-11, -11, -11]");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong8 = java.util.Arrays.spliterator(longArray7);
        long[] longArray10 = java.util.Arrays.copyOf(longArray7, (int) (byte) 1);
        java.util.function.IntToLongFunction intToLongFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSetAll(longArray10, intToLongFunction11);
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
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        java.util.Spliterator.OfDouble ofDouble11 = java.util.Arrays.spliterator(doubleArray4, (int) '4', 100);
        int int15 = java.util.Arrays.binarySearch(doubleArray4, (int) (byte) 10, (int) (byte) 10, (double) (byte) 100);
        int int17 = java.util.Arrays.binarySearch(doubleArray4, (double) 100L);
        java.util.function.DoubleBinaryOperator doubleBinaryOperator18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(doubleArray4, doubleBinaryOperator18);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-101) + "'", int17 == (-101));
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream5 = java.util.Arrays.stream(doubleArray4);
        double[] doubleArray8 = new double[] { (short) 10, 10.0f };
        double[] doubleArray10 = java.util.Arrays.copyOf(doubleArray8, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream11 = java.util.Arrays.stream(doubleArray10);
        double[] doubleArray14 = new double[] { (short) 10, 10.0f };
        double[] doubleArray16 = java.util.Arrays.copyOf(doubleArray14, (int) (short) 100);
        double[] doubleArray19 = java.util.Arrays.copyOfRange(doubleArray16, 2, (int) 'a');
        double[] doubleArray21 = java.util.Arrays.copyOf(doubleArray16, (int) 'a');
        double[] doubleArray23 = java.util.Arrays.copyOf(doubleArray21, 10);
        java.util.stream.DoubleStream doubleStream24 = java.util.Arrays.stream(doubleArray23);
        double[] doubleArray27 = new double[] { (short) 10, 10.0f };
        double[] doubleArray29 = java.util.Arrays.copyOf(doubleArray27, (int) (short) 100);
        double[] doubleArray32 = java.util.Arrays.copyOfRange(doubleArray29, 2, (int) 'a');
        double[] doubleArray34 = java.util.Arrays.copyOf(doubleArray29, (int) 'a');
        double[] doubleArray36 = java.util.Arrays.copyOf(doubleArray34, 10);
        java.util.stream.DoubleStream doubleStream37 = java.util.Arrays.stream(doubleArray36);
        java.util.stream.DoubleStream[] doubleStreamArray38 = new java.util.stream.DoubleStream[] { doubleStream5, doubleStream11, doubleStream24, doubleStream37 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator<java.util.stream.DoubleStream> doubleStreamSpliterator41 = java.util.Arrays.spliterator(doubleStreamArray38, (-53), 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -53");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleStream24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleStream37);
        org.junit.Assert.assertNotNull(doubleStreamArray38);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        double[] doubleArray1 = new double[] { (byte) 10 };
        java.lang.String str2 = java.util.Arrays.toString(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[10.0]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[10.0]" + "'", str2, "[10.0]");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.parallelSort(charArray4);
        java.util.Arrays.sort(charArray4);
        java.util.Arrays.fill(charArray4, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(charArray4, (int) '4', (-9), ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(52) > toIndex(-9)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "aaaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "aaaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, a, a, a]");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong8 = java.util.Arrays.spliterator(longArray7);
        long[] longArray10 = java.util.Arrays.copyOf(longArray7, (int) (byte) 1);
        java.util.function.LongBinaryOperator longBinaryOperator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(longArray10, longBinaryOperator11);
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
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.fill(longArray3, (long) '4');
        int int10 = java.util.Arrays.binarySearch(longArray3, 0L);
        java.util.Arrays.sort(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(longArray3, (-100), (int) (short) 100, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -100");
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
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.fill(byteArray4, (byte) -1);
        byte[] byteArray8 = java.util.Arrays.copyOf(byteArray4, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(byteArray4, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(10) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        java.util.Arrays.fill(shortArray0, (short) -1);
        java.util.Arrays.fill(shortArray0, (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray9 = java.util.Arrays.copyOfRange(shortArray0, (int) (short) 1, 100);
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
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Arrays.parallelSort(longArray7);
        long[] longArray12 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream13 = java.util.Arrays.stream(longArray12);
        java.util.Arrays.fill(longArray12, (long) (byte) 10);
        int int17 = java.util.Arrays.binarySearch(longArray12, (-1L));
        java.util.Arrays.parallelSort(longArray12);
        int int20 = java.util.Arrays.binarySearch(longArray12, (long) 2);
        java.util.Arrays.fill(longArray12, (long) (-5));
        int int24 = java.util.Arrays.binarySearch(longArray12, (long) (-2));
        java.util.Arrays.parallelSort(longArray12);
        boolean boolean26 = java.util.Arrays.equals(longArray7, longArray12);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[0, 0, 0, 0, 0, 0, 0, 1, 3]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[-5, -5, -5]");
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.sort(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(charArray4, (int) ' ', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(32) > toIndex(2)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , 4, a, a]");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
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
        java.util.List<java.util.Spliterator<short[]>> shortArraySpliteratorList44 = java.util.Arrays.asList(shortArraySpliteratorArray40);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort((java.lang.Object[]) shortArraySpliteratorArray40, (-6), 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(shortArraySpliteratorList44);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        java.util.Spliterator.OfDouble ofDouble10 = java.util.Arrays.spliterator(doubleArray7, 10, (int) '#');
        java.util.Arrays.fill(doubleArray7, (double) 2);
        java.lang.String str13 = java.util.Arrays.toString(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0]");
        org.junit.Assert.assertNotNull(ofDouble10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0]" + "'", str13, "[2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0]");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        int[] intArray6 = new int[] { '4', (short) 0, '4', (byte) 100, (-3), (byte) -1 };
        java.util.Arrays.fill(intArray6, (int) (byte) 10);
        java.util.Spliterator.OfInt ofInt9 = java.util.Arrays.spliterator(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream12 = java.util.Arrays.stream(intArray6, (-4), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10, 10, 10, 10, 10]");
        org.junit.Assert.assertNotNull(ofInt9);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.fill(intArray3, (int) (short) 1);
        java.util.Arrays.fill(intArray3, (int) ' ', (int) (short) 100, 0);
        int[] intArray12 = java.util.Arrays.copyOfRange(intArray3, 0, (int) '4');
        java.util.function.IntBinaryOperator intBinaryOperator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(intArray3, (int) (byte) 0, (int) (byte) 0, intBinaryOperator15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.sort(intArray3);
        int[] intArray9 = new int[] {};
        java.util.stream.IntStream intStream10 = java.util.Arrays.stream(intArray9);
        java.util.Arrays.sort(intArray9);
        boolean boolean12 = java.util.Arrays.equals(intArray3, intArray9);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(charArray0, (int) (byte) 0, (-1), 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.parallelSort(floatArray3);
        java.util.Arrays.fill(floatArray3, (float) ' ');
        java.util.Arrays.fill(floatArray3, 0, 0, (float) (-4));
        int int14 = java.util.Arrays.binarySearch(floatArray3, 100.0f);
        java.lang.String str15 = java.util.Arrays.toString(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[32.0, 32.0, 32.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-4) + "'", int14 == (-4));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[32.0, 32.0, 32.0]" + "'", str15, "[32.0, 32.0, 32.0]");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.parallelSort(floatArray3);
        java.util.Arrays.fill(floatArray3, (float) ' ');
        java.util.Arrays.fill(floatArray3, 1.0f);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[1.0, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream7 = java.util.Arrays.stream(longArray3, (-11), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, 0L);
        java.util.Arrays.parallelSort(longArray3);
        java.util.Arrays.fill(longArray3, (long) '#');
        java.util.Arrays.sort(longArray3);
        java.util.function.LongBinaryOperator longBinaryOperator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(longArray3, (-3), (int) (byte) 100, longBinaryOperator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[35, 35, 35]");
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        java.util.Arrays.parallelSort(longArray3);
        java.util.stream.LongStream longStream12 = java.util.Arrays.stream(longArray3, (int) (byte) 1, (int) (short) 1);
        int int14 = java.util.Arrays.binarySearch(longArray3, 0L);
        java.util.stream.LongStream longStream15 = java.util.Arrays.stream(longArray3);
        java.lang.String str16 = java.util.Arrays.toString(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[10, 10, 10]" + "'", str16, "[10, 10, 10]");
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        byte[] byteArray9 = java.util.Arrays.copyOf(byteArray4, (int) '#');
        byte[] byteArray12 = java.util.Arrays.copyOfRange(byteArray4, 1, 7);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java.util.Arrays.binarySearch(byteArray4, 0, (int) (short) -1, (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
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
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        short[] shortArray6 = new short[] { (byte) -1, (byte) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
        java.util.Arrays.parallelSort(shortArray6);
        java.util.Arrays.sort(shortArray6);
        short[] shortArray10 = java.util.Arrays.copyOf(shortArray6, 100);
        java.lang.String str11 = java.util.Arrays.toString(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[-1, 0, 0, 0, 0, 0]" + "'", str11, "[-1, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        long[] longArray0 = new long[] {};
        int int2 = java.util.Arrays.binarySearch(longArray0, (long) '#');
        java.util.Arrays.sort(longArray0);
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfLong ofLong7 = java.util.Arrays.spliterator(longArray0, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(100) > fence(-1)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.lang.String str6 = java.util.Arrays.deepToString((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[, hi!]" + "'", str6, "[, hi!]");
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        double[] doubleArray14 = java.util.Arrays.copyOfRange(doubleArray11, 2, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfDouble ofDouble17 = java.util.Arrays.spliterator(doubleArray14, 4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(4) > fence(0)");
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
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        java.util.Arrays.sort(doubleArray4);
        double[] doubleArray11 = new double[] { (short) 10, 10.0f };
        double[] doubleArray13 = java.util.Arrays.copyOf(doubleArray11, (int) (short) 100);
        double[] doubleArray16 = java.util.Arrays.copyOfRange(doubleArray13, 2, (int) 'a');
        double[] doubleArray18 = java.util.Arrays.copyOf(doubleArray13, (int) 'a');
        double[] doubleArray20 = java.util.Arrays.copyOf(doubleArray18, 10);
        double[] doubleArray23 = java.util.Arrays.copyOfRange(doubleArray20, 2, 100);
        double[] doubleArray25 = java.util.Arrays.copyOf(doubleArray20, (int) '#');
        int int27 = java.util.Arrays.binarySearch(doubleArray20, 0.0d);
        java.util.Spliterator.OfDouble ofDouble28 = java.util.Arrays.spliterator(doubleArray20);
        boolean boolean29 = java.util.Arrays.equals(doubleArray4, doubleArray20);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(ofDouble28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        float[] floatArray5 = new float[] { 0, (-4), 10, 3, (-3) };
        int int7 = java.util.Arrays.binarySearch(floatArray5, 100.0f);
        int int9 = java.util.Arrays.binarySearch(floatArray5, (float) 5);
        int int13 = java.util.Arrays.binarySearch(floatArray5, 0, 2, 100.0f);
        java.util.Arrays.fill(floatArray5, (int) (byte) 0, 4, (float) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(floatArray5, (-36), 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -36");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[32.0, 32.0, 32.0, 32.0, -3.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-6) + "'", int7 == (-6));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-3) + "'", int13 == (-3));
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        int[] intArray0 = new int[] {};
        java.util.stream.IntStream intStream1 = java.util.Arrays.stream(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = java.util.Arrays.binarySearch(intArray0, (int) '4', 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(52) > toIndex(0)");
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
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        boolean[] booleanArray10 = java.util.Arrays.copyOfRange(booleanArray7, (int) (short) 10, (int) '#');
        java.util.Arrays.fill(booleanArray7, true);
        java.util.Arrays.fill(booleanArray7, false);
        java.lang.String str15 = java.util.Arrays.toString(booleanArray7);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]" + "'", str15, "[false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0]", "[-1]" };
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(strArray2, (-96), (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -96");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.BaseStream<java.lang.CharSequence, java.util.stream.Stream<java.lang.CharSequence>>[] charSequenceBaseStreamArray37 = java.util.Arrays.copyOfRange((java.util.stream.BaseStream<java.lang.CharSequence, java.util.stream.Stream<java.lang.CharSequence>>[]) charSequenceStreamArray22, (int) (byte) 10, (int) (short) 100);
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
        org.junit.Assert.assertNotNull(streamArray21);
        org.junit.Assert.assertNotNull(charSequenceStreamArray22);
        org.junit.Assert.assertNotNull(charSequenceStreamList33);
        org.junit.Assert.assertNotNull(autoCloseableStream34);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) 100);
        java.util.Arrays.sort(shortArray0);
        java.util.Arrays.sort(shortArray0);
        int int8 = java.util.Arrays.binarySearch(shortArray0, (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = java.util.Arrays.binarySearch(shortArray0, 10, 0, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(10) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        short[] shortArray6 = new short[] { (byte) -1, (byte) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
        java.util.Arrays.parallelSort(shortArray6);
        java.util.Arrays.sort(shortArray6);
        short[] shortArray10 = java.util.Arrays.copyOf(shortArray6, 100);
        int int12 = java.util.Arrays.binarySearch(shortArray6, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(shortArray6, 1, (-96));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(1) > toIndex(-96)");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        int[] intArray9 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream13 = java.util.Arrays.stream(intArray9, (-36), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -36");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100]");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        java.util.Arrays.sort(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(charArray4, (-36), 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -36");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        short[] shortArray6 = new short[] { (byte) -1, (byte) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
        java.util.Arrays.parallelSort(shortArray6);
        java.util.Arrays.sort(shortArray6);
        short[] shortArray10 = java.util.Arrays.copyOf(shortArray6, 100);
        int int12 = java.util.Arrays.binarySearch(shortArray10, (short) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(shortArray10, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-101) + "'", int12 == (-101));
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        short[] shortArray6 = new short[] { (byte) 100, (short) 0, (byte) 10, (short) -1, (byte) 1, (byte) 0 };
        java.util.Arrays.parallelSort(shortArray6);
        java.util.Arrays.fill(shortArray6, (short) 10);
        short[] shortArray10 = new short[] {};
        int int12 = java.util.Arrays.binarySearch(shortArray10, (short) 1);
        int int14 = java.util.Arrays.binarySearch(shortArray10, (short) 100);
        short[] shortArray16 = java.util.Arrays.copyOf(shortArray10, (int) '#');
        boolean boolean17 = java.util.Arrays.equals(shortArray6, shortArray10);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, 10, 10, 10, 10, 10]");
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        java.lang.Object[] objArray0 = null;
        char[] charArray5 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray5, (int) (byte) 1, 3);
        java.util.Arrays.parallelSort(charArray5);
        java.util.Arrays.sort(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = java.util.Arrays.binarySearch(objArray0, (java.lang.Object) charArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " 4aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " 4aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , 4, a, a]");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        java.util.Arrays.sort(doubleArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(doubleArray7, (-3), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -3");
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
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray4, '#');
        java.util.Arrays.sort(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(charArray4, (int) (short) 0, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-9)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        long[] longArray4 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream5 = java.util.Arrays.stream(longArray4);
        java.util.Arrays.fill(longArray4, (long) (byte) 10);
        java.util.Arrays.fill(longArray4, (long) '4');
        int int11 = java.util.Arrays.binarySearch(longArray4, 0L);
        java.util.Arrays.sort(longArray4);
        int int14 = java.util.Arrays.binarySearch(longArray4, (long) 'a');
        java.util.Arrays.fill(objArray0, (java.lang.Object) 'a');
        java.lang.String str16 = java.util.Arrays.toString(objArray0);
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[52, 52, 52]");
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-4) + "'", int14 == (-4));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        java.util.Arrays.sort(longArray3);
        long[] longArray10 = new long[] {};
        int int12 = java.util.Arrays.binarySearch(longArray10, (long) '#');
        boolean boolean13 = java.util.Arrays.equals(longArray3, longArray10);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.sort(longArray3);
        java.util.stream.LongStream longStream8 = java.util.Arrays.stream(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfLong ofLong11 = java.util.Arrays.spliterator(longArray3, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(97) > fence(-1)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) 100);
        short[] shortArray6 = java.util.Arrays.copyOf(shortArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(shortArray0, (-2), 7);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[]");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        long[] longArray0 = new long[] {};
        int int2 = java.util.Arrays.binarySearch(longArray0, (long) '#');
        java.util.Arrays.sort(longArray0);
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfLong ofLong7 = java.util.Arrays.spliterator(longArray0, (int) (byte) 10, (-36));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(10) > fence(-36)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = java.util.Arrays.binarySearch(charArray0, 100, 100, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong8 = java.util.Arrays.spliterator(longArray7);
        long[] longArray10 = java.util.Arrays.copyOf(longArray7, (int) (byte) 1);
        long[] longArray12 = java.util.Arrays.copyOf(longArray10, 100);
        java.lang.String str13 = java.util.Arrays.toString(longArray12);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[3]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]" + "'", str13, "[3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        float[] floatArray1 = new float[] { (-1L) };
        int int3 = java.util.Arrays.binarySearch(floatArray1, (float) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(floatArray1, (int) '4', 0, (float) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(52) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        float[] floatArray5 = new float[] { 0, (-4), 10, 3, (-3) };
        int int7 = java.util.Arrays.binarySearch(floatArray5, 100.0f);
        int int9 = java.util.Arrays.binarySearch(floatArray5, (float) 5);
        int int13 = java.util.Arrays.binarySearch(floatArray5, 0, 2, 100.0f);
        float[] floatArray17 = new float[] { 0.0f, (byte) 0, (short) 1 };
        java.util.Arrays.sort(floatArray17);
        float[] floatArray20 = java.util.Arrays.copyOf(floatArray17, 2);
        boolean boolean21 = java.util.Arrays.equals(floatArray5, floatArray20);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -4.0, 10.0, 3.0, -3.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-6) + "'", int7 == (-6));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-3) + "'", int13 == (-3));
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[0.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
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
            java.util.Arrays.parallelPrefix(longArray3, (-3), 0, longBinaryOperator16);
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
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        int int7 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        int int9 = java.util.Arrays.binarySearch(floatArray3, (float) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray11 = java.util.Arrays.copyOf(floatArray3, (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
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
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        java.lang.Object[] objArray1 = new java.lang.Object[] { "[0, 100]" };
        java.util.Arrays.fill(objArray1, (java.lang.Object) "[hi!, ]");
        java.lang.reflect.Type[][] typeArray4 = new java.lang.reflect.Type[][] {};
        java.util.stream.Stream<java.lang.reflect.Type[]> typeArrayStream5 = java.util.Arrays.stream(typeArray4);
        boolean boolean6 = java.util.Arrays.deepEquals(objArray1, (java.lang.Object[]) typeArray4);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[[hi!, ]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[[hi!, ]]");
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArrayStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        short[] shortArray6 = new short[] { (byte) 100, (short) 0, (byte) 10, (short) -1, (byte) 1, (byte) 0 };
        java.util.Arrays.parallelSort(shortArray6);
        int int9 = java.util.Arrays.binarySearch(shortArray6, (short) -1);
        java.util.Arrays.fill(shortArray6, (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray13 = java.util.Arrays.copyOf(shortArray6, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, -1, -1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray3 = java.util.Arrays.copyOfRange(booleanArray0, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        java.util.Spliterator.OfDouble ofDouble10 = java.util.Arrays.spliterator(doubleArray7, 10, (int) '#');
        java.util.Arrays.fill(doubleArray7, (double) 2);
        java.util.function.IntToDoubleFunction intToDoubleFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSetAll(doubleArray7, intToDoubleFunction13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0]");
        org.junit.Assert.assertNotNull(ofDouble10);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) 100);
        java.util.Arrays.sort(shortArray0);
        int int7 = java.util.Arrays.binarySearch(shortArray0, (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = java.util.Arrays.binarySearch(shortArray0, (int) (byte) -1, 17, (short) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.fill(intArray3, (-5));
        java.util.Arrays.parallelSort(intArray3);
        java.util.Spliterator.OfInt ofInt9 = java.util.Arrays.spliterator(intArray3, 0, 0);
        int[] intArray11 = new int[] { 100 };
        int[] intArray13 = java.util.Arrays.copyOf(intArray11, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray11);
        java.util.Arrays.fill(intArray11, 5);
        java.util.Arrays.fill(intArray11, (-3));
        java.util.Arrays.parallelSort(intArray11);
        int[] intArray21 = java.util.Arrays.copyOf(intArray11, 3);
        java.util.Spliterator.OfInt ofInt22 = java.util.Arrays.spliterator(intArray11);
        int[] intArray29 = new int[] { '4', (short) 0, '4', (byte) 100, (-3), (byte) -1 };
        java.util.Arrays.fill(intArray29, (int) (byte) 10);
        java.util.Spliterator.OfInt ofInt32 = java.util.Arrays.spliterator(intArray29);
        int[] intArray34 = new int[] { 100 };
        int[] intArray36 = java.util.Arrays.copyOf(intArray34, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray34);
        java.util.Arrays.fill(intArray34, 5);
        java.util.Arrays.fill(intArray34, (-3));
        java.util.Arrays.parallelSort(intArray34);
        int[] intArray44 = java.util.Arrays.copyOf(intArray34, 3);
        java.util.Spliterator.OfInt ofInt45 = java.util.Arrays.spliterator(intArray34);
        int[] intArray47 = new int[] { 100 };
        int[] intArray49 = java.util.Arrays.copyOf(intArray47, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray49, (int) (byte) 0, (int) (byte) 1);
        java.util.Spliterator.OfInt ofInt53 = java.util.Arrays.spliterator(intArray49);
        int[] intArray55 = new int[] { 100 };
        int[] intArray57 = java.util.Arrays.copyOf(intArray55, (int) (short) 100);
        int int61 = java.util.Arrays.binarySearch(intArray57, (int) (byte) 1, 10, 0);
        int[] intArray63 = java.util.Arrays.copyOf(intArray57, (int) (short) 100);
        int int65 = java.util.Arrays.binarySearch(intArray57, (int) 'a');
        java.util.Spliterator.OfInt ofInt66 = java.util.Arrays.spliterator(intArray57);
        java.util.Spliterator.OfInt[] ofIntArray67 = new java.util.Spliterator.OfInt[] { ofInt9, ofInt22, ofInt32, ofInt45, ofInt53, ofInt66 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfInt[] ofIntArray70 = java.util.Arrays.copyOfRange(ofIntArray67, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10 > -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5]");
        org.junit.Assert.assertNotNull(ofInt9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-3]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-3, 0, 0]");
        org.junit.Assert.assertNotNull(ofInt22);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 10, 10, 10, 10, 10]");
        org.junit.Assert.assertNotNull(ofInt32);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-3]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[-3, 0, 0]");
        org.junit.Assert.assertNotNull(ofInt45);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[100]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
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
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.parallelSort(floatArray3);
        java.util.Arrays.fill(floatArray3, (float) ' ');
        float[] floatArray10 = java.util.Arrays.copyOf(floatArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(floatArray3, 7, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(7) > toIndex(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[32.0, 32.0, 32.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[32.0]");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        int[] intArray6 = new int[] { '4', (short) 0, '4', (byte) 100, (-3), (byte) -1 };
        java.util.Arrays.fill(intArray6, (int) (byte) 10);
        java.util.stream.IntStream intStream9 = java.util.Arrays.stream(intArray6);
        int int11 = java.util.Arrays.binarySearch(intArray6, 17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream14 = java.util.Arrays.stream(intArray6, (-5), (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(-5) > fence(-11)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10, 10, 10, 10, 10]");
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-7) + "'", int11 == (-7));
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        java.util.Spliterator.OfDouble ofDouble11 = java.util.Arrays.spliterator(doubleArray4, (int) '4', 100);
        int int15 = java.util.Arrays.binarySearch(doubleArray4, (int) (byte) 10, (int) (byte) 10, (double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = java.util.Arrays.copyOf(doubleArray4, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
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
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.parallelSort(floatArray3);
        java.util.Arrays.fill(floatArray3, (float) ' ');
        float[] floatArray10 = java.util.Arrays.copyOf(floatArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(floatArray3, 5, (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(5) > toIndex(-11)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[32.0, 32.0, 32.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[32.0]");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.fill(longArray3, (long) '4');
        java.util.function.LongBinaryOperator longBinaryOperator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(longArray3, (int) (byte) 0, (-36), longBinaryOperator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[52, 52, 52]");
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray2 = java.util.Arrays.copyOf(booleanArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) 100);
        java.util.Arrays.sort(shortArray0);
        java.util.Arrays.sort(shortArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(shortArray0, (int) '4', (int) (byte) 0, (short) (byte) -1);
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
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfInt ofInt1 = java.util.Arrays.spliterator(intArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(charArray0, (int) (short) 1, (-96), '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream5 = java.util.Arrays.stream(doubleArray4);
        java.util.Arrays.parallelSort(doubleArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream9 = java.util.Arrays.stream(doubleArray4, 3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(3) > fence(0)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        boolean[] booleanArray9 = java.util.Arrays.copyOf(booleanArray7, 2);
        boolean[] booleanArray11 = java.util.Arrays.copyOf(booleanArray7, (int) (short) 0);
        boolean[] booleanArray17 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray19 = java.util.Arrays.copyOf(booleanArray17, (int) '4');
        boolean[] booleanArray22 = java.util.Arrays.copyOfRange(booleanArray19, (int) (short) 10, (int) '#');
        java.util.Arrays.fill(booleanArray19, true);
        boolean boolean25 = java.util.Arrays.equals(booleanArray11, booleanArray19);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true]");
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        int int7 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        int int9 = java.util.Arrays.binarySearch(floatArray3, (float) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(floatArray3, 0, (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-101)");
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
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int6 = java.util.Arrays.binarySearch(doubleArray2, (double) (short) -1);
        java.util.Arrays.sort(doubleArray2);
        java.util.function.IntToDoubleFunction intToDoubleFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(doubleArray2, intToDoubleFunction8);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray4, '#');
        java.util.Arrays.sort(charArray4);
        char[] charArray11 = null;
        boolean boolean12 = java.util.Arrays.equals(charArray4, charArray11);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray4, '#');
        char[] charArray11 = java.util.Arrays.copyOf(charArray4, (int) (byte) 1);
        java.util.Arrays.parallelSort(charArray11);
        java.util.Arrays.sort(charArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(charArray11, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 97");
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
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        double[] doubleArray5 = new double[] { 10.0d, 0L, (-5), 100.0d, '4' };
        java.util.function.DoubleBinaryOperator doubleBinaryOperator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(doubleArray5, (-11), (-36), doubleBinaryOperator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 0.0, -5.0, 100.0, 52.0]");
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.fill(byteArray4, (byte) -1);
        byte[] byteArray8 = java.util.Arrays.copyOf(byteArray4, (int) 'a');
        java.util.Arrays.parallelSort(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = java.util.Arrays.binarySearch(byteArray8, 1, (int) (byte) 0, (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(1) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        boolean[] booleanArray9 = java.util.Arrays.copyOf(booleanArray7, 2);
        java.util.Arrays.fill(booleanArray7, true);
        boolean[] booleanArray13 = java.util.Arrays.copyOf(booleanArray7, (int) (byte) 0);
        java.lang.String str14 = java.util.Arrays.toString(booleanArray7);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true]");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true]" + "'", str14, "[true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true]");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        boolean[] booleanArray9 = java.util.Arrays.copyOf(booleanArray7, 2);
        java.util.Arrays.fill(booleanArray7, true);
        java.lang.String str12 = java.util.Arrays.toString(booleanArray7);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true]");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true]" + "'", str12, "[true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true]");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        java.util.function.DoubleBinaryOperator doubleBinaryOperator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(doubleArray4, doubleBinaryOperator10);
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
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        long[] longArray9 = java.util.Arrays.copyOf(longArray7, (int) '#');
        java.util.Arrays.fill(longArray9, (long) (byte) 100);
        java.util.stream.LongStream longStream12 = java.util.Arrays.stream(longArray9);
        int int14 = java.util.Arrays.binarySearch(longArray9, (long) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream17 = java.util.Arrays.stream(longArray9, (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
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
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100]");
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        java.util.Arrays.parallelSort(longArray3);
        int int11 = java.util.Arrays.binarySearch(longArray3, (long) 2);
        java.util.Arrays.fill(longArray3, (long) (-5));
        java.util.Arrays.sort(longArray3);
        java.util.Arrays.parallelSort(longArray3);
        java.util.function.IntToLongFunction intToLongFunction16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSetAll(longArray3, intToLongFunction16);
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
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        float[] floatArray3 = new float[] { 0.0f, (byte) 0, (short) 1 };
        java.util.Arrays.sort(floatArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(floatArray3, (-5), 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 0.0, 1.0]");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        float[] floatArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = java.util.Arrays.binarySearch(floatArray0, 17, (int) (byte) 1, (float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        java.util.Spliterator.OfDouble ofDouble10 = java.util.Arrays.spliterator(doubleArray7, 10, (int) '#');
        int int12 = java.util.Arrays.binarySearch(doubleArray7, (double) (-1));
        java.util.Arrays.sort(doubleArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(doubleArray7, (-3), (-2));
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
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(ofDouble10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.parallelSort(longArray3);
        int int9 = java.util.Arrays.binarySearch(longArray3, (long) (-4));
        java.lang.String str10 = java.util.Arrays.toString(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[10, 10, 10]" + "'", str10, "[10, 10, 10]");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        int int6 = java.util.Arrays.binarySearch(byteArray1, (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(byteArray1, (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 35");
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
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.fill(intArray3, (-5));
        java.util.Arrays.parallelSort(intArray3);
        java.util.function.IntBinaryOperator intBinaryOperator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(intArray3, intBinaryOperator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5]");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong8 = java.util.Arrays.spliterator(longArray7);
        long[] longArray10 = java.util.Arrays.copyOf(longArray7, (int) (byte) 1);
        long[] longArray12 = java.util.Arrays.copyOf(longArray10, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(longArray10, (-2), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -2");
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
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        int[] intArray6 = new int[] { '4', (short) 0, '4', (byte) 100, (-3), (byte) -1 };
        java.util.Arrays.fill(intArray6, (int) (byte) 10);
        java.util.stream.IntStream intStream9 = java.util.Arrays.stream(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(intArray6, (-100), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10, 10, 10, 10, 10]");
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        short[] shortArray6 = new short[] { (byte) 100, (short) 0, (byte) 10, (short) -1, (byte) 1, (byte) 0 };
        java.util.Arrays.parallelSort(shortArray6);
        int int9 = java.util.Arrays.binarySearch(shortArray6, (short) -1);
        java.util.Arrays.fill(shortArray6, (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(shortArray6, (int) 'a', (-36), (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(97) > toIndex(-36)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, -1, -1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        java.util.Arrays.fill(shortArray0, (short) (byte) -1);
        short[] shortArray6 = java.util.Arrays.copyOf(shortArray0, 5);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray9 = java.util.Arrays.copyOfRange(shortArray0, (-2), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 0, 0, 0]");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.parallelSort(floatArray3);
        int int8 = java.util.Arrays.binarySearch(floatArray3, (float) 10L);
        java.util.Arrays.sort(floatArray3);
        java.util.Arrays.fill(floatArray3, (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray13 = java.util.Arrays.copyOf(floatArray3, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, -1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-3) + "'", int8 == (-3));
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int[] intArray11 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray11);
        java.util.Arrays.sort(intArray11);
        java.lang.String str14 = java.util.Arrays.toString(intArray11);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]" + "'", str14, "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        char[] charArray0 = null;
        java.lang.String str1 = java.util.Arrays.toString(charArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null" + "'", str1, "null");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        java.util.Arrays.sort(doubleArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java.util.Arrays.binarySearch(doubleArray11, (-4), (int) ' ', (double) 1);
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
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0]");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.util.Spliterator.OfDouble ofDouble5 = java.util.Arrays.spliterator(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(doubleArray2, (int) '4', (-1), 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(52) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(ofDouble5);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        java.util.Spliterator.OfDouble ofDouble10 = java.util.Arrays.spliterator(doubleArray7, 10, (int) '#');
        int int12 = java.util.Arrays.binarySearch(doubleArray7, (double) (-1));
        java.util.Arrays.sort(doubleArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(doubleArray7, (int) (short) -1, (int) (short) 100, (double) (byte) 0);
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
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(booleanArray7, (int) (byte) 10, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(10) > toIndex(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        boolean[] booleanArray0 = new boolean[] {};
        boolean[] booleanArray1 = new boolean[] {};
        boolean[][] booleanArray2 = new boolean[][] { booleanArray0, booleanArray1 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<boolean[]> booleanArrayStream5 = java.util.Arrays.stream(booleanArray2, (-96), 7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -96");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[]");
        org.junit.Assert.assertNotNull(booleanArray2);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        java.util.Spliterator.OfDouble ofDouble11 = java.util.Arrays.spliterator(doubleArray4, (int) '4', 100);
        int int15 = java.util.Arrays.binarySearch(doubleArray4, (int) (byte) 10, (int) (byte) 10, (double) (byte) 100);
        int int17 = java.util.Arrays.binarySearch(doubleArray4, (double) 100L);
        java.lang.String str18 = java.util.Arrays.toString(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertNotNull(ofDouble11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-11) + "'", int15 == (-11));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-101) + "'", int17 == (-101));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]" + "'", str18, "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray2);
        byte[] byteArray7 = new byte[] { (byte) 1 };
        byte[] byteArray10 = java.util.Arrays.copyOfRange(byteArray7, (int) (short) 1, 2);
        java.util.Arrays.sort(byteArray7);
        java.util.Arrays.sort(byteArray7, (int) (byte) 0, (int) (short) 1);
        java.util.Arrays.fill(byteArray7, (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = java.util.Arrays.binarySearch((java.lang.Object[]) strArray2, 17, (int) ' ', (java.lang.Object) byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0]");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.parallelSort(longArray3);
        java.util.function.LongBinaryOperator longBinaryOperator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(longArray3, (int) (short) -1, (int) (byte) -1, longBinaryOperator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        java.util.Spliterator.OfDouble ofDouble11 = java.util.Arrays.spliterator(doubleArray4, (int) '4', 100);
        double[] doubleArray14 = java.util.Arrays.copyOfRange(doubleArray4, 0, (int) (byte) 100);
        java.util.function.DoubleBinaryOperator doubleBinaryOperator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(doubleArray4, (-96), (-6), doubleBinaryOperator17);
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
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        java.util.Arrays.fill(shortArray0, (short) -1);
        java.util.Arrays.fill(shortArray0, (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(shortArray0, (-5), (-11), (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(-5) > toIndex(-11)");
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
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong8 = java.util.Arrays.spliterator(longArray7);
        long[] longArray10 = java.util.Arrays.copyOf(longArray7, (int) (byte) 1);
        java.util.stream.LongStream longStream11 = java.util.Arrays.stream(longArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(longArray10, (-101), (-96));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -101");
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
        org.junit.Assert.assertNotNull(longStream11);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int[] intArray11 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        int[] intArray13 = java.util.Arrays.copyOf(intArray3, 1);
        java.util.Arrays.parallelSort(intArray3, 7, (int) (byte) 100);
        java.util.Arrays.parallelSort(intArray3);
        java.util.function.IntBinaryOperator intBinaryOperator20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(intArray3, (int) (byte) 0, (int) '4', intBinaryOperator20);
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
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(strArray2, (-6), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        int[] intArray9 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        java.util.function.IntUnaryOperator intUnaryOperator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.setAll(intArray9, intUnaryOperator10);
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
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(byteArray1, (-9), 5, (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream5 = java.util.Arrays.stream(doubleArray4);
        java.util.function.IntToDoubleFunction intToDoubleFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSetAll(doubleArray4, intToDoubleFunction6);
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
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        java.lang.Object[] objArray0 = null;
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        short[][] shortArray3 = new short[][] { shortArray1, shortArray2 };
        short[][][] shortArray4 = new short[][][] { shortArray3 };
        java.util.stream.Stream<short[][]> shortArrayStream5 = java.util.Arrays.stream(shortArray4);
        boolean boolean6 = java.util.Arrays.equals(objArray0, (java.lang.Object[]) shortArray4);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[]");
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[]");
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(shortArrayStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        java.util.Arrays.parallelSort(longArray3);
        java.util.stream.LongStream longStream12 = java.util.Arrays.stream(longArray3, (int) (byte) 1, (int) (short) 1);
        java.util.stream.LongStream longStream13 = java.util.Arrays.stream(longArray3);
        java.util.function.LongBinaryOperator longBinaryOperator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(longArray3, longBinaryOperator14);
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
        org.junit.Assert.assertNotNull(longStream13);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.stream.LongStream longStream7 = java.util.Arrays.stream(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(longArray3, (-3), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        java.util.Spliterator.OfDouble ofDouble10 = java.util.Arrays.spliterator(doubleArray7, 10, (int) '#');
        int int12 = java.util.Arrays.binarySearch(doubleArray7, (double) (-1));
        int int14 = java.util.Arrays.binarySearch(doubleArray7, (double) (short) 100);
        java.util.function.DoubleBinaryOperator doubleBinaryOperator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(doubleArray7, 10, 10, doubleBinaryOperator17);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-96) + "'", int14 == (-96));
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        byte[] byteArray9 = java.util.Arrays.copyOf(byteArray4, (int) '#');
        byte[] byteArray12 = java.util.Arrays.copyOfRange(byteArray4, 1, 7);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java.util.Arrays.binarySearch(byteArray12, (int) (short) 0, (-6), (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-6)");
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
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.sort((java.lang.Object[]) strArray2);
        java.io.Serializable[] serializableArray7 = java.util.Arrays.copyOf((java.io.Serializable[]) strArray2, 100);
        java.lang.String str8 = java.util.Arrays.toString((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(serializableArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[, hi!]" + "'", str8, "[, hi!]");
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray1);
        java.util.Arrays.sort(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(intArray1, (int) (short) 0, (-4), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-4)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        float[] floatArray1 = new float[] { (-1L) };
        int int3 = java.util.Arrays.binarySearch(floatArray1, (float) (short) -1);
        java.util.Arrays.sort(floatArray1);
        java.util.Arrays.fill(floatArray1, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray9 = java.util.Arrays.copyOfRange(floatArray1, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.sort(floatArray3);
        float[] floatArray8 = java.util.Arrays.copyOf(floatArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(floatArray8, (int) ' ', 2, (float) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(32) > toIndex(2)");
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
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray3, (int) (byte) 0, (int) (byte) 1);
        java.util.Spliterator.OfInt ofInt7 = java.util.Arrays.spliterator(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(intArray3, 10, (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(10) > toIndex(-11)");
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
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        java.util.Arrays.fill(shortArray0, (short) -1);
        java.util.Arrays.fill(shortArray0, (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(shortArray0, (-1), 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
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
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray4, '#');
        java.util.Arrays.sort(charArray4);
        java.util.Arrays.fill(charArray4, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(charArray4, 17, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "aaaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "aaaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, a, a, a]");
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        int[] intArray9 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        java.lang.Class<?> wildcardClass10 = intArray9.getClass();
        java.lang.reflect.Type[] typeArray11 = new java.lang.reflect.Type[] { wildcardClass10 };
        java.lang.reflect.Type[] typeArray13 = java.util.Arrays.copyOf(typeArray11, 2);
        double[] doubleArray16 = new double[] { (short) 10, 10.0f };
        double[] doubleArray18 = java.util.Arrays.copyOf(doubleArray16, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = java.util.Arrays.binarySearch((java.lang.Object[]) typeArray11, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int[] intArray11 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray11);
        java.lang.Class<?> wildcardClass13 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        short[] shortArray1 = new short[] { (short) -1 };
        short[] shortArray3 = new short[] { (short) -1 };
        short[] shortArray5 = new short[] { (short) -1 };
        short[] shortArray7 = new short[] { (short) -1 };
        short[] shortArray9 = new short[] { (short) -1 };
        short[][] shortArray10 = new short[][] { shortArray1, shortArray3, shortArray5, shortArray7, shortArray9 };
        short[] shortArray12 = new short[] { (short) -1 };
        short[] shortArray14 = new short[] { (short) -1 };
        short[] shortArray16 = new short[] { (short) -1 };
        short[] shortArray18 = new short[] { (short) -1 };
        short[] shortArray20 = new short[] { (short) -1 };
        short[][] shortArray21 = new short[][] { shortArray12, shortArray14, shortArray16, shortArray18, shortArray20 };
        short[] shortArray23 = new short[] { (short) -1 };
        short[] shortArray25 = new short[] { (short) -1 };
        short[] shortArray27 = new short[] { (short) -1 };
        short[] shortArray29 = new short[] { (short) -1 };
        short[] shortArray31 = new short[] { (short) -1 };
        short[][] shortArray32 = new short[][] { shortArray23, shortArray25, shortArray27, shortArray29, shortArray31 };
        short[] shortArray34 = new short[] { (short) -1 };
        short[] shortArray36 = new short[] { (short) -1 };
        short[] shortArray38 = new short[] { (short) -1 };
        short[] shortArray40 = new short[] { (short) -1 };
        short[] shortArray42 = new short[] { (short) -1 };
        short[][] shortArray43 = new short[][] { shortArray34, shortArray36, shortArray38, shortArray40, shortArray42 };
        short[][][] shortArray44 = new short[][][] { shortArray10, shortArray21, shortArray32, shortArray43 };
        short[] shortArray46 = new short[] { (short) -1 };
        short[] shortArray48 = new short[] { (short) -1 };
        short[] shortArray50 = new short[] { (short) -1 };
        short[] shortArray52 = new short[] { (short) -1 };
        short[] shortArray54 = new short[] { (short) -1 };
        short[][] shortArray55 = new short[][] { shortArray46, shortArray48, shortArray50, shortArray52, shortArray54 };
        short[] shortArray57 = new short[] { (short) -1 };
        short[] shortArray59 = new short[] { (short) -1 };
        short[] shortArray61 = new short[] { (short) -1 };
        short[] shortArray63 = new short[] { (short) -1 };
        short[] shortArray65 = new short[] { (short) -1 };
        short[][] shortArray66 = new short[][] { shortArray57, shortArray59, shortArray61, shortArray63, shortArray65 };
        short[] shortArray68 = new short[] { (short) -1 };
        short[] shortArray70 = new short[] { (short) -1 };
        short[] shortArray72 = new short[] { (short) -1 };
        short[] shortArray74 = new short[] { (short) -1 };
        short[] shortArray76 = new short[] { (short) -1 };
        short[][] shortArray77 = new short[][] { shortArray68, shortArray70, shortArray72, shortArray74, shortArray76 };
        short[] shortArray79 = new short[] { (short) -1 };
        short[] shortArray81 = new short[] { (short) -1 };
        short[] shortArray83 = new short[] { (short) -1 };
        short[] shortArray85 = new short[] { (short) -1 };
        short[] shortArray87 = new short[] { (short) -1 };
        short[][] shortArray88 = new short[][] { shortArray79, shortArray81, shortArray83, shortArray85, shortArray87 };
        short[][][] shortArray89 = new short[][][] { shortArray55, shortArray66, shortArray77, shortArray88 };
        short[][][][] shortArray90 = new short[][][][] { shortArray44, shortArray89 };
        java.util.Spliterator<short[][][]> shortArraySpliterator91 = java.util.Arrays.spliterator(shortArray90);
        // The following exception was thrown during execution in test generation
        try {
            short[][][][] shortArray94 = java.util.Arrays.copyOfRange(shortArray90, 5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 5 > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[-1]");
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1]");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[-1]");
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[-1]");
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[-1]");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[-1]");
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[-1]");
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[-1]");
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[-1]");
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[-1]");
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray25), "[-1]");
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[-1]");
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[-1]");
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray31), "[-1]");
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray34), "[-1]");
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray36), "[-1]");
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray38), "[-1]");
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray40), "[-1]");
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray42), "[-1]");
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray46), "[-1]");
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray48), "[-1]");
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray50), "[-1]");
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray52), "[-1]");
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray54), "[-1]");
        org.junit.Assert.assertNotNull(shortArray55);
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray57), "[-1]");
        org.junit.Assert.assertNotNull(shortArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray59), "[-1]");
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray61), "[-1]");
        org.junit.Assert.assertNotNull(shortArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray63), "[-1]");
        org.junit.Assert.assertNotNull(shortArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray65), "[-1]");
        org.junit.Assert.assertNotNull(shortArray66);
        org.junit.Assert.assertNotNull(shortArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray68), "[-1]");
        org.junit.Assert.assertNotNull(shortArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray70), "[-1]");
        org.junit.Assert.assertNotNull(shortArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray72), "[-1]");
        org.junit.Assert.assertNotNull(shortArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray74), "[-1]");
        org.junit.Assert.assertNotNull(shortArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray76), "[-1]");
        org.junit.Assert.assertNotNull(shortArray77);
        org.junit.Assert.assertNotNull(shortArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray79), "[-1]");
        org.junit.Assert.assertNotNull(shortArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray81), "[-1]");
        org.junit.Assert.assertNotNull(shortArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray83), "[-1]");
        org.junit.Assert.assertNotNull(shortArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray85), "[-1]");
        org.junit.Assert.assertNotNull(shortArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray87), "[-1]");
        org.junit.Assert.assertNotNull(shortArray88);
        org.junit.Assert.assertNotNull(shortArray89);
        org.junit.Assert.assertNotNull(shortArray90);
        org.junit.Assert.assertNotNull(shortArraySpliterator91);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray3 = java.util.Arrays.copyOfRange(booleanArray0, 4, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        java.util.Spliterator.OfDouble ofDouble11 = java.util.Arrays.spliterator(doubleArray4, (int) '4', 100);
        double[] doubleArray14 = java.util.Arrays.copyOfRange(doubleArray4, 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(doubleArray14, 0, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-4)");
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
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        java.util.Arrays.fill(doubleArray9, (double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(doubleArray9, (-96), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -96");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
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
            java.util.Arrays.fill(longArray3, (int) (short) 0, (-53), (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-53)");
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
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray1);
        java.lang.String str5 = java.util.Arrays.toString(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[100]" + "'", str5, "[100]");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        byte[] byteArray8 = java.util.Arrays.copyOf(byteArray4, 10);
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte[] byteArray13 = java.util.Arrays.copyOfRange(byteArray10, (int) (short) 1, 2);
        java.util.Arrays.sort(byteArray10);
        int int16 = java.util.Arrays.binarySearch(byteArray10, (byte) -1);
        int int18 = java.util.Arrays.binarySearch(byteArray10, (byte) 10);
        byte[] byteArray21 = java.util.Arrays.copyOfRange(byteArray10, (int) (byte) 0, 1);
        boolean boolean22 = java.util.Arrays.equals(byteArray8, byteArray21);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.sort(intArray3);
        java.util.stream.IntStream intStream9 = java.util.Arrays.stream(intArray3);
        java.lang.String str10 = java.util.Arrays.toString(intArray3);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100]" + "'", str10, "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100]");
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.fill(intArray3, (-5));
        int int7 = java.util.Arrays.binarySearch(intArray3, (-6));
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(intArray3, (int) (byte) 10, 3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(10) > toIndex(3)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        double[] doubleArray4 = new double[] { 3, 0.0f, (short) 0, (-4) };
        java.util.Arrays.fill(doubleArray4, (double) (byte) 0);
        java.lang.String str7 = java.util.Arrays.toString(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0.0, 0.0, 0.0, 0.0]" + "'", str7, "[0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        float[] floatArray1 = new float[] { (-1L) };
        int int3 = java.util.Arrays.binarySearch(floatArray1, (float) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(floatArray1, (-11), (int) (byte) 10, (float) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -11");
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
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        int int3 = java.util.Arrays.binarySearch(byteArray1, (byte) 1);
        byte[] byteArray5 = java.util.Arrays.copyOf(byteArray1, (int) (short) 0);
        java.lang.String str6 = java.util.Arrays.toString(byteArray5);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.fill(longArray3, (long) '4');
        int int10 = java.util.Arrays.binarySearch(longArray3, 0L);
        int int12 = java.util.Arrays.binarySearch(longArray3, (long) (byte) -1);
        java.util.function.LongBinaryOperator longBinaryOperator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(longArray3, (int) 'a', (-11), longBinaryOperator15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        int[] intArray0 = new int[] {};
        java.util.stream.IntStream intStream1 = java.util.Arrays.stream(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = java.util.Arrays.copyOf(intArray0, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intStream1);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Spliterator.OfInt ofInt8 = java.util.Arrays.spliterator(intArray3);
        java.lang.String str9 = java.util.Arrays.toString(intArray3);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(ofInt8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]" + "'", str9, "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        byte[] byteArray6 = java.util.Arrays.copyOf(byteArray4, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(byteArray4, 5, (int) (short) 10, (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        java.util.Arrays.sort(charArray4);
        char[] charArray16 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray16, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray16, '#');
        char[] charArray23 = java.util.Arrays.copyOf(charArray16, 0);
        boolean boolean24 = java.util.Arrays.equals(charArray4, charArray23);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " 4aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , 4, a, a]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, #, #]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream5 = java.util.Arrays.stream(doubleArray4);
        java.util.Arrays.fill(doubleArray4, (double) (short) -1);
        java.util.Spliterator.OfDouble ofDouble8 = java.util.Arrays.spliterator(doubleArray4);
        java.util.Spliterator.OfDouble[] ofDoubleArray9 = new java.util.Spliterator.OfDouble[] { ofDouble8 };
        java.util.List<java.util.Spliterator.OfDouble> ofDoubleList10 = java.util.Arrays.asList(ofDoubleArray9);
        java.util.Arrays.sort((java.lang.Object[]) ofDoubleArray9);
        int[] intArray13 = new int[] { 100 };
        int[] intArray15 = java.util.Arrays.copyOf(intArray13, (int) (short) 100);
        int int19 = java.util.Arrays.binarySearch(intArray15, (int) (byte) 1, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java.util.Arrays.binarySearch((java.lang.Object[]) ofDoubleArray9, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Spliterators$DoubleArraySpliterator cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(ofDouble8);
        org.junit.Assert.assertNotNull(ofDoubleArray9);
        org.junit.Assert.assertNotNull(ofDoubleList10);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong8 = java.util.Arrays.spliterator(longArray7);
        long[] longArray10 = java.util.Arrays.copyOf(longArray7, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(longArray10, 0, (int) (short) 10, (long) (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
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
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        java.util.Spliterator.OfDouble ofDouble10 = java.util.Arrays.spliterator(doubleArray7, 10, (int) '#');
        int int12 = java.util.Arrays.binarySearch(doubleArray7, (double) (-1));
        int int14 = java.util.Arrays.binarySearch(doubleArray7, (double) (short) 100);
        java.lang.String str15 = java.util.Arrays.toString(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(ofDouble10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-96) + "'", int14 == (-96));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]" + "'", str15, "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        java.util.Arrays.fill(doubleArray4, (double) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(doubleArray4, (-100), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray4, '#');
        java.util.Arrays.sort(charArray4);
        java.util.Arrays.parallelSort(charArray4);
        java.util.Arrays.sort(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java.util.Arrays.binarySearch(charArray4, (int) (short) 100, (-36), '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(-36)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) 100);
        short[] shortArray6 = java.util.Arrays.copyOf(shortArray0, (int) (short) 0);
        java.util.Arrays.parallelSort(shortArray0);
        java.util.Arrays.fill(shortArray0, (short) (byte) 1);
        java.lang.String str10 = java.util.Arrays.toString(shortArray0);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        java.util.Spliterator.OfDouble ofDouble11 = java.util.Arrays.spliterator(doubleArray4, (int) '4', 100);
        double[] doubleArray14 = java.util.Arrays.copyOfRange(doubleArray4, 0, (int) (byte) 100);
        double[] doubleArray17 = new double[] { (short) 10, 10.0f };
        double[] doubleArray19 = java.util.Arrays.copyOf(doubleArray17, (int) (short) 100);
        int int23 = java.util.Arrays.binarySearch(doubleArray19, 5, 10, (double) (byte) 0);
        java.util.Spliterator.OfDouble ofDouble26 = java.util.Arrays.spliterator(doubleArray19, (int) '4', 100);
        double[] doubleArray28 = java.util.Arrays.copyOf(doubleArray19, 0);
        boolean boolean29 = java.util.Arrays.equals(doubleArray14, doubleArray28);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertNotNull(ofDouble11);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 7 + "'", int23 == 7);
        org.junit.Assert.assertNotNull(ofDouble26);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        int[] intArray0 = null;
        java.util.function.IntBinaryOperator intBinaryOperator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(intArray0, 5, (int) (short) -1, intBinaryOperator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        int int12 = java.util.Arrays.binarySearch(charArray10, '4');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray15 = java.util.Arrays.copyOfRange(charArray10, (-96), (-36));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        java.lang.reflect.Type[][] typeArray0 = new java.lang.reflect.Type[][] {};
        java.util.stream.Stream<java.lang.reflect.Type[]> typeArrayStream1 = java.util.Arrays.stream(typeArray0);
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
        boolean boolean26 = java.util.Arrays.deepEquals((java.lang.Object[]) typeArray0, (java.lang.Object[]) charSequenceBaseStreamArray16);
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(typeArrayStream1);
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
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        boolean[] booleanArray9 = java.util.Arrays.copyOf(booleanArray7, 2);
        boolean[] booleanArray11 = java.util.Arrays.copyOf(booleanArray7, (int) (short) 0);
        java.lang.String str12 = java.util.Arrays.toString(booleanArray11);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        float[] floatArray1 = new float[] { (-1L) };
        int int3 = java.util.Arrays.binarySearch(floatArray1, (float) (short) -1);
        java.util.Arrays.sort(floatArray1);
        java.util.Arrays.sort(floatArray1);
        float[] floatArray9 = new float[] { (-1), (short) -1, '4' };
        int int11 = java.util.Arrays.binarySearch(floatArray9, 0.0f);
        java.util.Arrays.parallelSort(floatArray9);
        java.util.Arrays.fill(floatArray9, (float) ' ');
        java.util.Arrays.parallelSort(floatArray9);
        boolean boolean16 = java.util.Arrays.equals(floatArray1, floatArray9);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[32.0, 32.0, 32.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-3) + "'", int11 == (-3));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        java.util.Arrays.fill(doubleArray4, (double) 10);
        java.util.function.DoubleBinaryOperator doubleBinaryOperator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(doubleArray4, (int) 'a', 4, doubleBinaryOperator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        long[] longArray9 = java.util.Arrays.copyOf(longArray7, (int) '#');
        java.util.Arrays.fill(longArray9, (long) (byte) 100);
        java.util.stream.LongStream longStream12 = java.util.Arrays.stream(longArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(longArray9, (-5), (int) (short) 1, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -5");
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
        org.junit.Assert.assertNotNull(longStream12);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int[] intArray11 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray11);
        java.util.stream.IntStream intStream15 = java.util.Arrays.stream(intArray11, 2, 5);
        java.lang.Class<?> wildcardClass16 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.parallelSort(floatArray3);
        java.util.Arrays.fill(floatArray3, (float) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(floatArray3, (-96), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -96");
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
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.fill(byteArray4, (byte) -1);
        byte[] byteArray8 = java.util.Arrays.copyOf(byteArray4, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(byteArray8, (-9), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.parallelSort(longArray3);
        int int9 = java.util.Arrays.binarySearch(longArray3, (long) (-4));
        java.util.stream.LongStream longStream10 = java.util.Arrays.stream(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream13 = java.util.Arrays.stream(longArray3, (-101), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -101");
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
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray2);
        java.lang.Object obj4 = null;
        java.util.Arrays.fill((java.lang.Object[]) strArray2, obj4);
        double[] doubleArray8 = new double[] { (short) 10, 10.0f };
        double[] doubleArray10 = java.util.Arrays.copyOf(doubleArray8, (int) (short) 100);
        double[] doubleArray13 = java.util.Arrays.copyOfRange(doubleArray10, 2, (int) 'a');
        java.util.Arrays.fill(doubleArray10, 3, 7, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java.util.Arrays.binarySearch((java.lang.Object[]) strArray2, (java.lang.Object) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 10.0, 0.0, 32.0, 32.0, 32.0, 32.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0]", "[-1]" };
        java.util.Arrays.parallelSort(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort((java.lang.Object[]) strArray2, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        java.util.stream.DoubleStream doubleStream12 = java.util.Arrays.stream(doubleArray11);
        double[] doubleArray15 = new double[] { (short) 10, 10.0f };
        double[] doubleArray17 = java.util.Arrays.copyOf(doubleArray15, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream18 = java.util.Arrays.stream(doubleArray17);
        double[] doubleArray21 = new double[] { (short) 10, 10.0f };
        double[] doubleArray23 = java.util.Arrays.copyOf(doubleArray21, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream24 = java.util.Arrays.stream(doubleArray23);
        double[] doubleArray27 = new double[] { (short) 10, 10.0f };
        double[] doubleArray29 = java.util.Arrays.copyOf(doubleArray27, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream30 = java.util.Arrays.stream(doubleArray29);
        double[] doubleArray33 = new double[] { (short) 10, 10.0f };
        double[] doubleArray35 = java.util.Arrays.copyOf(doubleArray33, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream36 = java.util.Arrays.stream(doubleArray35);
        java.util.stream.DoubleStream[] doubleStreamArray37 = new java.util.stream.DoubleStream[] { doubleStream12, doubleStream18, doubleStream24, doubleStream30, doubleStream36 };
        java.util.Spliterator<java.util.stream.DoubleStream> doubleStreamSpliterator38 = java.util.Arrays.spliterator(doubleStreamArray37);
        java.lang.Object obj39 = null;
        java.util.Arrays.fill((java.lang.Object[]) doubleStreamArray37, obj39);
        java.lang.String str41 = java.util.Arrays.toString((java.lang.Object[]) doubleStreamArray37);
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
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleStream24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleStream30);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleStream36);
        org.junit.Assert.assertNotNull(doubleStreamArray37);
        org.junit.Assert.assertNotNull(doubleStreamSpliterator38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[null, null, null, null, null]" + "'", str41, "[null, null, null, null, null]");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.util.Spliterator.OfDouble ofDouble5 = java.util.Arrays.spliterator(doubleArray2);
        java.util.Arrays.sort(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = java.util.Arrays.copyOf(doubleArray2, (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(ofDouble5);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray12 = new double[] { (short) 10, 10.0f };
        double[] doubleArray14 = java.util.Arrays.copyOf(doubleArray12, (int) (short) 100);
        double[] doubleArray17 = java.util.Arrays.copyOfRange(doubleArray14, 2, (int) 'a');
        java.util.Spliterator.OfDouble ofDouble20 = java.util.Arrays.spliterator(doubleArray17, 10, (int) '#');
        int int22 = java.util.Arrays.binarySearch(doubleArray17, (double) (-1));
        java.util.Arrays.fill(doubleArray17, (double) 10L);
        boolean boolean25 = java.util.Arrays.equals(doubleArray9, doubleArray17);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(ofDouble20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.sort(longArray3);
        java.util.stream.LongStream longStream8 = java.util.Arrays.stream(longArray3);
        int[] intArray10 = new int[] { 100 };
        int[] intArray12 = java.util.Arrays.copyOf(intArray10, (int) (short) 100);
        int int16 = java.util.Arrays.binarySearch(intArray12, (int) (byte) 1, 10, 0);
        java.util.Spliterator.OfInt ofInt17 = java.util.Arrays.spliterator(intArray12);
        java.util.Arrays.parallelSort(intArray12, 0, 7);
        int int22 = java.util.Arrays.binarySearch(intArray12, 3);
        java.util.stream.IntStream intStream23 = java.util.Arrays.stream(intArray12);
        byte[] byteArray25 = new byte[] { (byte) 0 };
        byte[] byteArray27 = new byte[] { (byte) 0 };
        byte[] byteArray29 = new byte[] { (byte) 0 };
        byte[][] byteArray30 = new byte[][] { byteArray25, byteArray27, byteArray29 };
        java.util.stream.Stream<byte[]> byteArrayStream31 = java.util.Arrays.stream(byteArray30);
        java.lang.AutoCloseable[] autoCloseableArray32 = new java.lang.AutoCloseable[] { longStream8, intStream23, byteArrayStream31 };
        long[] longArray36 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream37 = java.util.Arrays.stream(longArray36);
        java.util.Arrays.fill(longArray36, (long) (byte) 10);
        java.util.Arrays.sort(longArray36);
        java.util.stream.LongStream longStream41 = java.util.Arrays.stream(longArray36);
        int[] intArray43 = new int[] { 100 };
        int[] intArray45 = java.util.Arrays.copyOf(intArray43, (int) (short) 100);
        int int49 = java.util.Arrays.binarySearch(intArray45, (int) (byte) 1, 10, 0);
        java.util.Spliterator.OfInt ofInt50 = java.util.Arrays.spliterator(intArray45);
        java.util.Arrays.parallelSort(intArray45, 0, 7);
        int int55 = java.util.Arrays.binarySearch(intArray45, 3);
        java.util.stream.IntStream intStream56 = java.util.Arrays.stream(intArray45);
        byte[] byteArray58 = new byte[] { (byte) 0 };
        byte[] byteArray60 = new byte[] { (byte) 0 };
        byte[] byteArray62 = new byte[] { (byte) 0 };
        byte[][] byteArray63 = new byte[][] { byteArray58, byteArray60, byteArray62 };
        java.util.stream.Stream<byte[]> byteArrayStream64 = java.util.Arrays.stream(byteArray63);
        java.lang.AutoCloseable[] autoCloseableArray65 = new java.lang.AutoCloseable[] { longStream41, intStream56, byteArrayStream64 };
        java.lang.AutoCloseable[][] autoCloseableArray66 = new java.lang.AutoCloseable[][] { autoCloseableArray32, autoCloseableArray65 };
        java.lang.AutoCloseable[][] autoCloseableArray68 = java.util.Arrays.copyOf(autoCloseableArray66, 0);
        java.lang.String str69 = java.util.Arrays.deepToString((java.lang.Object[]) autoCloseableArray66);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(ofInt17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-101) + "'", int22 == (-101));
        org.junit.Assert.assertNotNull(intStream23);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertNotNull(byteArrayStream31);
        org.junit.Assert.assertNotNull(autoCloseableArray32);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream37);
        org.junit.Assert.assertNotNull(longStream41);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[100]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 5 + "'", int49 == 5);
        org.junit.Assert.assertNotNull(ofInt50);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-101) + "'", int55 == (-101));
        org.junit.Assert.assertNotNull(intStream56);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[0]");
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[0]");
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[0]");
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertNotNull(byteArrayStream64);
        org.junit.Assert.assertNotNull(autoCloseableArray65);
        org.junit.Assert.assertNotNull(autoCloseableArray66);
        org.junit.Assert.assertNotNull(autoCloseableArray68);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        java.util.Arrays.parallelSort(longArray3);
        java.util.stream.LongStream longStream12 = java.util.Arrays.stream(longArray3, (int) (byte) 1, (int) (short) 1);
        java.util.stream.LongStream longStream13 = java.util.Arrays.stream(longArray3);
        long[] longArray17 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream18 = java.util.Arrays.stream(longArray17);
        java.util.Arrays.fill(longArray17, (long) (byte) 10);
        int int22 = java.util.Arrays.binarySearch(longArray17, (-1L));
        java.util.Arrays.parallelSort(longArray17);
        int int25 = java.util.Arrays.binarySearch(longArray17, (long) 2);
        int int27 = java.util.Arrays.binarySearch(longArray17, (long) (-3));
        boolean boolean28 = java.util.Arrays.equals(longArray3, longArray17);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.fill(longArray3, (long) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int12 = java.util.Arrays.binarySearch(longArray3, (-6), (-100), (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(-6) > toIndex(-100)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[52, 52, 52]");
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.parallelSort(floatArray3);
        java.util.Arrays.fill(floatArray3, (float) ' ');
        float[] floatArray10 = java.util.Arrays.copyOf(floatArray3, (int) (byte) 1);
        int int12 = java.util.Arrays.binarySearch(floatArray10, (float) 7);
        java.lang.String str13 = java.util.Arrays.toString(floatArray10);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[32.0, 32.0, 32.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[32.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[32.0]" + "'", str13, "[32.0]");
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        java.util.Arrays.parallelSort(longArray3);
        int int11 = java.util.Arrays.binarySearch(longArray3, (long) 2);
        java.util.Arrays.fill(longArray3, (long) (-5));
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(longArray3, 5, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(5) > toIndex(-9)");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.sort((java.lang.Object[]) strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(strArray2, (-1), (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(-1) > toIndex(-3)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        int int7 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        int int9 = java.util.Arrays.binarySearch(floatArray3, (float) (byte) 10);
        java.util.Arrays.sort(floatArray3);
        java.util.Arrays.sort(floatArray3, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray15 = java.util.Arrays.copyOf(floatArray3, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
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
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(shortArray0, (-6), (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        double[] doubleArray4 = new double[] { 3, 0.0f, (short) 0, (-4) };
        java.util.Arrays.fill(doubleArray4, (double) (byte) 0);
        java.util.function.DoubleBinaryOperator doubleBinaryOperator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(doubleArray4, (int) (byte) -1, (int) ' ', doubleBinaryOperator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, 0L);
        java.util.Arrays.parallelSort(longArray3);
        java.util.Arrays.fill(longArray3, (long) '#');
        java.lang.Class<?> wildcardClass10 = longArray3.getClass();
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[35, 35, 35]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        java.lang.reflect.Type[][][] typeArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.reflect.Type[][]> typeArrayList1 = java.util.Arrays.asList(typeArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray4, '#');
        char[] charArray11 = java.util.Arrays.copyOf(charArray4, (int) (byte) 1);
        java.util.Arrays.parallelSort(charArray11);
        java.util.Arrays.sort(charArray11);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray16 = java.util.Arrays.copyOfRange(charArray11, (-5), (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -5 > -100");
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
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.parallelSort(charArray4);
        java.util.Arrays.sort(charArray4);
        java.util.Arrays.fill(charArray4, 'a');
        java.util.Arrays.sort(charArray4);
        java.util.Arrays.fill(charArray4, (int) (short) 1, 4, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(charArray4, 4, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, 4, 4, 4]");
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.sort(longArray3);
        java.util.stream.LongStream longStream8 = java.util.Arrays.stream(longArray3);
        int[] intArray10 = new int[] { 100 };
        int[] intArray12 = java.util.Arrays.copyOf(intArray10, (int) (short) 100);
        int int16 = java.util.Arrays.binarySearch(intArray12, (int) (byte) 1, 10, 0);
        java.util.Spliterator.OfInt ofInt17 = java.util.Arrays.spliterator(intArray12);
        java.util.Arrays.parallelSort(intArray12, 0, 7);
        int int22 = java.util.Arrays.binarySearch(intArray12, 3);
        java.util.stream.IntStream intStream23 = java.util.Arrays.stream(intArray12);
        byte[] byteArray25 = new byte[] { (byte) 0 };
        byte[] byteArray27 = new byte[] { (byte) 0 };
        byte[] byteArray29 = new byte[] { (byte) 0 };
        byte[][] byteArray30 = new byte[][] { byteArray25, byteArray27, byteArray29 };
        java.util.stream.Stream<byte[]> byteArrayStream31 = java.util.Arrays.stream(byteArray30);
        java.lang.AutoCloseable[] autoCloseableArray32 = new java.lang.AutoCloseable[] { longStream8, intStream23, byteArrayStream31 };
        long[] longArray36 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream37 = java.util.Arrays.stream(longArray36);
        java.util.Arrays.fill(longArray36, (long) (byte) 10);
        java.util.Arrays.sort(longArray36);
        java.util.stream.LongStream longStream41 = java.util.Arrays.stream(longArray36);
        int[] intArray43 = new int[] { 100 };
        int[] intArray45 = java.util.Arrays.copyOf(intArray43, (int) (short) 100);
        int int49 = java.util.Arrays.binarySearch(intArray45, (int) (byte) 1, 10, 0);
        java.util.Spliterator.OfInt ofInt50 = java.util.Arrays.spliterator(intArray45);
        java.util.Arrays.parallelSort(intArray45, 0, 7);
        int int55 = java.util.Arrays.binarySearch(intArray45, 3);
        java.util.stream.IntStream intStream56 = java.util.Arrays.stream(intArray45);
        byte[] byteArray58 = new byte[] { (byte) 0 };
        byte[] byteArray60 = new byte[] { (byte) 0 };
        byte[] byteArray62 = new byte[] { (byte) 0 };
        byte[][] byteArray63 = new byte[][] { byteArray58, byteArray60, byteArray62 };
        java.util.stream.Stream<byte[]> byteArrayStream64 = java.util.Arrays.stream(byteArray63);
        java.lang.AutoCloseable[] autoCloseableArray65 = new java.lang.AutoCloseable[] { longStream41, intStream56, byteArrayStream64 };
        java.lang.AutoCloseable[][] autoCloseableArray66 = new java.lang.AutoCloseable[][] { autoCloseableArray32, autoCloseableArray65 };
        java.lang.AutoCloseable[][] autoCloseableArray68 = java.util.Arrays.copyOf(autoCloseableArray66, 0);
        byte[] byteArray70 = new byte[] { (byte) 0 };
        byte[] byteArray72 = new byte[] { (byte) 0 };
        byte[] byteArray74 = new byte[] { (byte) 0 };
        byte[][] byteArray75 = new byte[][] { byteArray70, byteArray72, byteArray74 };
        java.util.stream.Stream<byte[]> byteArrayStream76 = java.util.Arrays.stream(byteArray75);
        boolean boolean77 = java.util.Arrays.deepEquals((java.lang.Object[]) autoCloseableArray66, (java.lang.Object[]) byteArray75);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(ofInt17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-101) + "'", int22 == (-101));
        org.junit.Assert.assertNotNull(intStream23);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertNotNull(byteArrayStream31);
        org.junit.Assert.assertNotNull(autoCloseableArray32);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream37);
        org.junit.Assert.assertNotNull(longStream41);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[100]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 5 + "'", int49 == 5);
        org.junit.Assert.assertNotNull(ofInt50);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-101) + "'", int55 == (-101));
        org.junit.Assert.assertNotNull(intStream56);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[0]");
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[0]");
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[0]");
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertNotNull(byteArrayStream64);
        org.junit.Assert.assertNotNull(autoCloseableArray65);
        org.junit.Assert.assertNotNull(autoCloseableArray66);
        org.junit.Assert.assertNotNull(autoCloseableArray68);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[0]");
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[0]");
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[0]");
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertNotNull(byteArrayStream76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.sort(intArray3);
        int int10 = java.util.Arrays.binarySearch(intArray3, 5);
        java.util.function.IntBinaryOperator intBinaryOperator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(intArray3, (-7), (-11), intBinaryOperator13);
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
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        java.util.Spliterator.OfDouble ofDouble10 = java.util.Arrays.spliterator(doubleArray7, 10, (int) '#');
        int int12 = java.util.Arrays.binarySearch(doubleArray7, (double) (-1));
        java.util.Arrays.sort(doubleArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(doubleArray7, (-2), 7, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -2");
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
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        char[] charArray0 = null;
        char[] charArray5 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray5, (int) (byte) 1, 3);
        java.util.Arrays.parallelSort(charArray5);
        java.util.Arrays.sort(charArray5);
        int int12 = java.util.Arrays.binarySearch(charArray5, 'a');
        java.util.Arrays.parallelSort(charArray5);
        java.util.Arrays.fill(charArray5, '#');
        boolean boolean16 = java.util.Arrays.equals(charArray0, charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, #, #, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        float[] floatArray3 = new float[] { (short) 0, 10L, (-2) };
        float[] floatArray5 = java.util.Arrays.copyOf(floatArray3, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int9 = java.util.Arrays.binarySearch(floatArray3, 4, (-2), (float) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(4) > toIndex(-2)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 10.0, -2.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, 10.0, -2.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        double[] doubleArray14 = java.util.Arrays.copyOfRange(doubleArray11, 2, 100);
        java.util.Arrays.parallelSort(doubleArray11, (int) (short) 0, 10);
        java.util.function.IntToDoubleFunction intToDoubleFunction18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSetAll(doubleArray11, intToDoubleFunction18);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        java.util.Arrays.sort(doubleArray4);
        java.util.Arrays.sort(doubleArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(doubleArray4, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int[] intArray11 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray11);
        java.util.Arrays.sort(intArray11);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = java.util.Arrays.copyOf(intArray11, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
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
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray3, (int) (byte) 0, (int) (byte) 1);
        java.util.Spliterator.OfInt ofInt9 = java.util.Arrays.spliterator(intArray3, (int) (byte) 1, 10);
        java.util.function.IntUnaryOperator intUnaryOperator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSetAll(intArray3, intUnaryOperator10);
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
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        long[] longArray9 = java.util.Arrays.copyOf(longArray7, (int) '#');
        java.util.Arrays.fill(longArray9, (long) (byte) 100);
        java.util.stream.LongStream longStream12 = java.util.Arrays.stream(longArray9);
        int int14 = java.util.Arrays.binarySearch(longArray9, (long) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(longArray9, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
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
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100]");
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        byte[] byteArray8 = java.util.Arrays.copyOf(byteArray4, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(byteArray4, (int) (short) 1, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(1) > toIndex(-4)");
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
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray4, '#');
        char[] charArray11 = java.util.Arrays.copyOf(charArray4, (int) (byte) 1);
        char[] charArray13 = java.util.Arrays.copyOf(charArray4, 5);
        java.util.Arrays.fill(charArray13, 'a');
        java.util.Arrays.sort(charArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(charArray13, (int) (short) 100, (int) (byte) 100, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
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
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 100 };
        java.util.Arrays.sort(byteArray2);
        int int7 = java.util.Arrays.binarySearch(byteArray2, (int) (byte) 0, 0, (byte) 1);
        byte[] byteArray9 = java.util.Arrays.copyOf(byteArray2, 2);
        byte[] byteArray11 = new byte[] { (byte) 1 };
        byte[] byteArray14 = java.util.Arrays.copyOfRange(byteArray11, (int) (short) 1, 2);
        java.util.Arrays.fill(byteArray14, (byte) -1);
        boolean boolean17 = java.util.Arrays.equals(byteArray2, byteArray14);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 100]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 100]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        java.util.Spliterator.OfDouble ofDouble11 = java.util.Arrays.spliterator(doubleArray4, (int) '4', 100);
        int int15 = java.util.Arrays.binarySearch(doubleArray4, (int) (byte) 10, (int) (byte) 10, (double) (byte) 100);
        int int17 = java.util.Arrays.binarySearch(doubleArray4, (double) 100L);
        java.util.function.DoubleBinaryOperator doubleBinaryOperator20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(doubleArray4, (int) (short) 10, 1, doubleBinaryOperator20);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-101) + "'", int17 == (-101));
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0]", "[-1]" };
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.util.Spliterator<java.lang.String> strSpliterator7 = java.util.Arrays.spliterator(strArray2, 0, 1);
        long[] longArray13 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream14 = java.util.Arrays.stream(longArray13);
        long[] longArray17 = java.util.Arrays.copyOfRange(longArray13, (int) (byte) 1, 10);
        long[] longArray19 = java.util.Arrays.copyOf(longArray17, (int) '#');
        java.util.Arrays.fill(longArray19, (long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill((java.lang.Object[]) strArray2, 4, 0, (java.lang.Object) longArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(4) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSpliterator7);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100]");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        int int12 = java.util.Arrays.binarySearch(charArray10, '4');
        java.lang.String str13 = java.util.Arrays.toString(charArray10);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a 4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a 4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a,  , 4, a]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        double[] doubleArray14 = java.util.Arrays.copyOfRange(doubleArray11, 2, 100);
        double[] doubleArray16 = java.util.Arrays.copyOf(doubleArray11, (int) '#');
        int int18 = java.util.Arrays.binarySearch(doubleArray16, (double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(doubleArray16, (int) (short) 100, (-36), (double) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(-36)");
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
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-36) + "'", int18 == (-36));
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        java.util.Spliterator.OfDouble ofDouble10 = java.util.Arrays.spliterator(doubleArray7, 10, (int) '#');
        double[] doubleArray13 = new double[] { (short) 10, 10.0f };
        double[] doubleArray15 = java.util.Arrays.copyOf(doubleArray13, (int) (short) 100);
        int int17 = java.util.Arrays.binarySearch(doubleArray15, (double) 3);
        java.util.Arrays.sort(doubleArray15);
        boolean boolean19 = java.util.Arrays.equals(doubleArray7, doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(ofDouble10);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-101) + "'", int17 == (-101));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray4, '#');
        char[] charArray11 = java.util.Arrays.copyOf(charArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(charArray11, (int) (short) 100, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(7)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        int[] intArray0 = new int[] {};
        java.util.stream.IntStream intStream1 = java.util.Arrays.stream(intArray0);
        java.util.Arrays.parallelSort(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(intArray0, (-53), (int) (byte) -1, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -53");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intStream1);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        java.util.Arrays.fill(shortArray0, (short) (byte) -1);
        short[] shortArray6 = java.util.Arrays.copyOf(shortArray0, 5);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = java.util.Arrays.binarySearch(shortArray0, (int) (byte) -1, (-5), (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(-1) > toIndex(-5)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 0, 0, 0]");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        java.util.Arrays.fill(shortArray0, (short) (byte) -1);
        short[] shortArray6 = java.util.Arrays.copyOf(shortArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray8 = java.util.Arrays.copyOf(shortArray0, (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[]");
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        float[] floatArray1 = new float[] { (-1L) };
        int int3 = java.util.Arrays.binarySearch(floatArray1, (float) (short) -1);
        java.util.Arrays.sort(floatArray1);
        java.util.Arrays.sort(floatArray1);
        int int7 = java.util.Arrays.binarySearch(floatArray1, 0.0f);
        float[] floatArray10 = java.util.Arrays.copyOfRange(floatArray1, (int) (short) 1, (int) (byte) 100);
        java.util.Arrays.fill(floatArray1, (float) 3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(floatArray1, 5, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(5) > toIndex(2)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[3.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) 1 };
        java.util.Arrays.fill(byteArray6, (byte) -1);
        int int10 = java.util.Arrays.binarySearch(byteArray6, (byte) -1);
        java.util.Arrays.parallelSort(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(byteArray6, 10, 0, (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(10) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(shortArray0, 0, (-53));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        short[][][] shortArray0 = new short[][][] {};
        java.util.Spliterator<short[][]> shortArraySpliterator1 = java.util.Arrays.spliterator(shortArray0);
        int[] intArray5 = new int[] { 100 };
        int[] intArray7 = java.util.Arrays.copyOf(intArray5, (int) (short) 100);
        int int11 = java.util.Arrays.binarySearch(intArray7, (int) (byte) 1, 10, 0);
        int[] intArray13 = java.util.Arrays.copyOf(intArray7, (int) (short) 100);
        int int15 = java.util.Arrays.binarySearch(intArray7, (int) 'a');
        java.util.Spliterator.OfInt ofInt16 = java.util.Arrays.spliterator(intArray7);
        java.util.Spliterator.OfInt ofInt17 = java.util.Arrays.spliterator(intArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill((java.lang.Object[]) shortArray0, (int) (byte) 10, (int) (byte) 100, (java.lang.Object) ofInt17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertNotNull(shortArraySpliterator1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertNotNull(ofInt16);
        org.junit.Assert.assertNotNull(ofInt17);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        int int11 = java.util.Arrays.binarySearch(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream14 = java.util.Arrays.stream(intArray3, 100, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(100) > fence(4)");
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
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(charArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        java.util.Spliterator.OfDouble ofDouble11 = java.util.Arrays.spliterator(doubleArray4, (int) '4', 100);
        double[] doubleArray13 = java.util.Arrays.copyOf(doubleArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(doubleArray4, 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(35)");
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
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) 100);
        java.util.Arrays.sort(shortArray0);
        int int7 = java.util.Arrays.binarySearch(shortArray0, (short) 0);
        short[] shortArray8 = new short[] {};
        int int10 = java.util.Arrays.binarySearch(shortArray8, (short) 1);
        int int12 = java.util.Arrays.binarySearch(shortArray8, (short) 100);
        short[] shortArray14 = java.util.Arrays.copyOf(shortArray8, (int) '#');
        boolean boolean15 = java.util.Arrays.equals(shortArray0, shortArray8);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray1);
        java.util.Arrays.sort(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(intArray1, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        java.lang.reflect.Type[][] typeArray0 = new java.lang.reflect.Type[][] {};
        java.util.stream.Stream<java.lang.reflect.Type[]> typeArrayStream1 = java.util.Arrays.stream(typeArray0);
        short[] shortArray4 = new short[] {};
        int int6 = java.util.Arrays.binarySearch(shortArray4, (short) 1);
        int int8 = java.util.Arrays.binarySearch(shortArray4, (short) (byte) 100);
        java.util.Arrays.parallelSort(shortArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill((java.lang.Object[]) typeArray0, (int) (byte) 10, (-7), (java.lang.Object) shortArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(10) > toIndex(-7)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(typeArrayStream1);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int6 = java.util.Arrays.binarySearch(doubleArray2, (double) (short) -1);
        double[] doubleArray9 = new double[] { (short) 10, 10.0f };
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, (int) (short) 100);
        double[] doubleArray14 = java.util.Arrays.copyOfRange(doubleArray11, 2, (int) 'a');
        java.util.Spliterator.OfDouble ofDouble17 = java.util.Arrays.spliterator(doubleArray14, 10, (int) '#');
        int int19 = java.util.Arrays.binarySearch(doubleArray14, (double) (-1));
        java.util.Arrays.fill(doubleArray14, (double) 10L);
        boolean boolean22 = java.util.Arrays.equals(doubleArray2, doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(ofDouble17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        java.util.Arrays.parallelSort(charArray4);
        int int13 = java.util.Arrays.binarySearch(charArray4, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(charArray4, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
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
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        float[] floatArray5 = new float[] { 100, (-53), 100L, (-1), (-5) };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(floatArray5, 2, (-4), (float) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(2) > toIndex(-4)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[100.0, -53.0, 100.0, -1.0, -5.0]");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.parallelSort(floatArray3);
        java.util.Arrays.fill(floatArray3, (float) ' ');
        java.util.Arrays.fill(floatArray3, 0, 0, (float) (-4));
        int int14 = java.util.Arrays.binarySearch(floatArray3, 100.0f);
        java.util.Arrays.fill(floatArray3, (float) (byte) 100);
        java.util.Arrays.sort(floatArray3);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray19 = java.util.Arrays.copyOf(floatArray3, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-4) + "'", int14 == (-4));
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 0 };
        java.util.Arrays.parallelSort(byteArray6);
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 0 };
        java.util.Arrays.parallelSort(byteArray14);
        boolean boolean16 = java.util.Arrays.equals(byteArray6, byteArray14);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 0, 1, 1, 10]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -1, 0, 1, 1, 10]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) 100);
        short[] shortArray6 = java.util.Arrays.copyOf(shortArray0, (int) '#');
        int int8 = java.util.Arrays.binarySearch(shortArray6, (short) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(shortArray6, (-7), (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -7");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 17 + "'", int8 == 17);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream5 = java.util.Arrays.stream(doubleArray4);
        java.util.Arrays.parallelSort(doubleArray4);
        java.util.Spliterator.OfDouble ofDouble7 = java.util.Arrays.spliterator(doubleArray4);
        java.util.function.IntToDoubleFunction intToDoubleFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSetAll(doubleArray4, intToDoubleFunction8);
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
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
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
            int int18 = java.util.Arrays.binarySearch(longArray3, 1, (int) (byte) 0, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(1) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        long[] longArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream1 = java.util.Arrays.stream(longArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray1);
        java.util.Spliterator.OfInt ofInt5 = java.util.Arrays.spliterator(intArray1);
        java.util.Arrays.fill(intArray1, 2);
        java.util.function.IntBinaryOperator intBinaryOperator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(intArray1, (int) '#', 2, intBinaryOperator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[2]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(ofInt5);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        byte[] byteArray6 = java.util.Arrays.copyOf(byteArray1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(byteArray1, 2, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(2) > toIndex(-100)");
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
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
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
        long[] longArray29 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream30 = java.util.Arrays.stream(longArray29);
        long[] longArray33 = java.util.Arrays.copyOfRange(longArray29, (int) (byte) 1, 10);
        java.util.Arrays.fill(longArray29, (long) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill((java.lang.Object[]) charSequenceBaseStreamArray14, (int) (short) 0, (-36), (java.lang.Object) longArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-36)");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(longStream30);
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[3, 1, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        long[] longArray3 = new long[] { 10, (-7), (-100) };
        java.util.Arrays.fill(longArray3, (long) (-11));
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfLong ofLong8 = java.util.Arrays.spliterator(longArray3, (int) (byte) 1, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(1) > fence(-2)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-11, -11, -11]");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        java.lang.Class<?> wildcardClass8 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        int int8 = java.util.Arrays.binarySearch(longArray3, (-1L));
        java.util.Arrays.parallelSort(longArray3);
        int int11 = java.util.Arrays.binarySearch(longArray3, (long) 2);
        java.util.Arrays.fill(longArray3, (long) (-5));
        int int15 = java.util.Arrays.binarySearch(longArray3, (long) (-2));
        long[] longArray19 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream20 = java.util.Arrays.stream(longArray19);
        java.util.Arrays.fill(longArray19, (long) (byte) 10);
        int int24 = java.util.Arrays.binarySearch(longArray19, (-1L));
        java.util.Arrays.parallelSort(longArray19);
        java.util.stream.LongStream longStream28 = java.util.Arrays.stream(longArray19, (int) (byte) 1, (int) (short) 1);
        boolean boolean29 = java.util.Arrays.equals(longArray3, longArray19);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-5, -5, -5]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(longStream28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        boolean[] booleanArray10 = java.util.Arrays.copyOfRange(booleanArray7, (int) (short) 10, (int) '#');
        boolean[] booleanArray13 = java.util.Arrays.copyOfRange(booleanArray10, 3, (int) (byte) 100);
        boolean[] booleanArray16 = new boolean[] { true, false };
        boolean[] booleanArray19 = java.util.Arrays.copyOfRange(booleanArray16, (int) (byte) 0, (int) (byte) 0);
        boolean boolean20 = java.util.Arrays.equals(booleanArray10, booleanArray19);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[true, false]");
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        java.util.Arrays.parallelSort(byteArray4);
        byte[] byteArray9 = java.util.Arrays.copyOf(byteArray4, (int) '#');
        byte[] byteArray12 = java.util.Arrays.copyOfRange(byteArray4, 1, 7);
        int int14 = java.util.Arrays.binarySearch(byteArray4, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(byteArray4, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(52) > toIndex(10)");
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
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        java.lang.Object[] objArray1 = new java.lang.Object[] { "[0, 100]" };
        java.util.Arrays.fill(objArray1, (java.lang.Object) "[hi!, ]");
        java.lang.String str4 = java.util.Arrays.deepToString(objArray1);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[[hi!, ]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[[hi!, ]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[hi!, ]]" + "'", str4, "[[hi!, ]]");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.sort(longArray3);
        java.util.stream.LongStream longStream8 = java.util.Arrays.stream(longArray3);
        int[] intArray10 = new int[] { 100 };
        int[] intArray12 = java.util.Arrays.copyOf(intArray10, (int) (short) 100);
        int int16 = java.util.Arrays.binarySearch(intArray12, (int) (byte) 1, 10, 0);
        java.util.Spliterator.OfInt ofInt17 = java.util.Arrays.spliterator(intArray12);
        java.util.Arrays.parallelSort(intArray12, 0, 7);
        int int22 = java.util.Arrays.binarySearch(intArray12, 3);
        java.util.stream.IntStream intStream23 = java.util.Arrays.stream(intArray12);
        byte[] byteArray25 = new byte[] { (byte) 0 };
        byte[] byteArray27 = new byte[] { (byte) 0 };
        byte[] byteArray29 = new byte[] { (byte) 0 };
        byte[][] byteArray30 = new byte[][] { byteArray25, byteArray27, byteArray29 };
        java.util.stream.Stream<byte[]> byteArrayStream31 = java.util.Arrays.stream(byteArray30);
        java.lang.AutoCloseable[] autoCloseableArray32 = new java.lang.AutoCloseable[] { longStream8, intStream23, byteArrayStream31 };
        long[] longArray36 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream37 = java.util.Arrays.stream(longArray36);
        java.util.Arrays.fill(longArray36, (long) (byte) 10);
        java.util.Arrays.sort(longArray36);
        java.util.stream.LongStream longStream41 = java.util.Arrays.stream(longArray36);
        int[] intArray43 = new int[] { 100 };
        int[] intArray45 = java.util.Arrays.copyOf(intArray43, (int) (short) 100);
        int int49 = java.util.Arrays.binarySearch(intArray45, (int) (byte) 1, 10, 0);
        java.util.Spliterator.OfInt ofInt50 = java.util.Arrays.spliterator(intArray45);
        java.util.Arrays.parallelSort(intArray45, 0, 7);
        int int55 = java.util.Arrays.binarySearch(intArray45, 3);
        java.util.stream.IntStream intStream56 = java.util.Arrays.stream(intArray45);
        byte[] byteArray58 = new byte[] { (byte) 0 };
        byte[] byteArray60 = new byte[] { (byte) 0 };
        byte[] byteArray62 = new byte[] { (byte) 0 };
        byte[][] byteArray63 = new byte[][] { byteArray58, byteArray60, byteArray62 };
        java.util.stream.Stream<byte[]> byteArrayStream64 = java.util.Arrays.stream(byteArray63);
        java.lang.AutoCloseable[] autoCloseableArray65 = new java.lang.AutoCloseable[] { longStream41, intStream56, byteArrayStream64 };
        java.lang.AutoCloseable[][] autoCloseableArray66 = new java.lang.AutoCloseable[][] { autoCloseableArray32, autoCloseableArray65 };
        java.lang.AutoCloseable[][] autoCloseableArray68 = java.util.Arrays.copyOf(autoCloseableArray66, 0);
        java.lang.Object[][] objArray70 = java.util.Arrays.copyOf((java.lang.Object[][]) autoCloseableArray66, (int) '4');
        long[] longArray76 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream77 = java.util.Arrays.stream(longArray76);
        java.util.Arrays.fill(longArray76, (long) (byte) 10);
        int int81 = java.util.Arrays.binarySearch(longArray76, (-1L));
        java.util.Arrays.parallelSort(longArray76);
        int int84 = java.util.Arrays.binarySearch(longArray76, (long) 2);
        int int86 = java.util.Arrays.binarySearch(longArray76, (long) (-3));
        java.util.stream.LongStream longStream87 = java.util.Arrays.stream(longArray76);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill((java.lang.Object[]) autoCloseableArray66, (-5), (-2), (java.lang.Object) longStream87);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(ofInt17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-101) + "'", int22 == (-101));
        org.junit.Assert.assertNotNull(intStream23);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertNotNull(byteArrayStream31);
        org.junit.Assert.assertNotNull(autoCloseableArray32);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream37);
        org.junit.Assert.assertNotNull(longStream41);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[100]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 5 + "'", int49 == 5);
        org.junit.Assert.assertNotNull(ofInt50);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-101) + "'", int55 == (-101));
        org.junit.Assert.assertNotNull(intStream56);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[0]");
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[0]");
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[0]");
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertNotNull(byteArrayStream64);
        org.junit.Assert.assertNotNull(autoCloseableArray65);
        org.junit.Assert.assertNotNull(autoCloseableArray66);
        org.junit.Assert.assertNotNull(autoCloseableArray68);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream77);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertNotNull(longStream87);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        java.util.Arrays.parallelSort(charArray4);
        int int13 = java.util.Arrays.binarySearch(charArray4, 'a');
        char[] charArray16 = java.util.Arrays.copyOfRange(charArray4, (int) (short) 0, (int) ' ');
        char[] charArray21 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray21, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray21, '#');
        char[] charArray28 = java.util.Arrays.copyOf(charArray21, (int) (byte) 1);
        boolean boolean29 = java.util.Arrays.equals(charArray4, charArray28);
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
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[#, #, #, #]");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[#]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.sort(longArray3);
        java.util.stream.LongStream longStream8 = java.util.Arrays.stream(longArray3);
        int[] intArray10 = new int[] { 100 };
        int[] intArray12 = java.util.Arrays.copyOf(intArray10, (int) (short) 100);
        int int16 = java.util.Arrays.binarySearch(intArray12, (int) (byte) 1, 10, 0);
        java.util.Spliterator.OfInt ofInt17 = java.util.Arrays.spliterator(intArray12);
        java.util.Arrays.parallelSort(intArray12, 0, 7);
        int int22 = java.util.Arrays.binarySearch(intArray12, 3);
        java.util.stream.IntStream intStream23 = java.util.Arrays.stream(intArray12);
        byte[] byteArray25 = new byte[] { (byte) 0 };
        byte[] byteArray27 = new byte[] { (byte) 0 };
        byte[] byteArray29 = new byte[] { (byte) 0 };
        byte[][] byteArray30 = new byte[][] { byteArray25, byteArray27, byteArray29 };
        java.util.stream.Stream<byte[]> byteArrayStream31 = java.util.Arrays.stream(byteArray30);
        java.lang.AutoCloseable[] autoCloseableArray32 = new java.lang.AutoCloseable[] { longStream8, intStream23, byteArrayStream31 };
        long[] longArray36 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream37 = java.util.Arrays.stream(longArray36);
        java.util.Arrays.fill(longArray36, (long) (byte) 10);
        java.util.Arrays.sort(longArray36);
        java.util.stream.LongStream longStream41 = java.util.Arrays.stream(longArray36);
        int[] intArray43 = new int[] { 100 };
        int[] intArray45 = java.util.Arrays.copyOf(intArray43, (int) (short) 100);
        int int49 = java.util.Arrays.binarySearch(intArray45, (int) (byte) 1, 10, 0);
        java.util.Spliterator.OfInt ofInt50 = java.util.Arrays.spliterator(intArray45);
        java.util.Arrays.parallelSort(intArray45, 0, 7);
        int int55 = java.util.Arrays.binarySearch(intArray45, 3);
        java.util.stream.IntStream intStream56 = java.util.Arrays.stream(intArray45);
        byte[] byteArray58 = new byte[] { (byte) 0 };
        byte[] byteArray60 = new byte[] { (byte) 0 };
        byte[] byteArray62 = new byte[] { (byte) 0 };
        byte[][] byteArray63 = new byte[][] { byteArray58, byteArray60, byteArray62 };
        java.util.stream.Stream<byte[]> byteArrayStream64 = java.util.Arrays.stream(byteArray63);
        java.lang.AutoCloseable[] autoCloseableArray65 = new java.lang.AutoCloseable[] { longStream41, intStream56, byteArrayStream64 };
        java.lang.AutoCloseable[][] autoCloseableArray66 = new java.lang.AutoCloseable[][] { autoCloseableArray32, autoCloseableArray65 };
        java.lang.AutoCloseable[][] autoCloseableArray68 = java.util.Arrays.copyOf(autoCloseableArray66, 0);
        java.util.List<java.lang.Object[]> objArrayList69 = java.util.Arrays.asList((java.lang.Object[][]) autoCloseableArray68);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort((java.lang.Object[]) autoCloseableArray68, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(ofInt17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-101) + "'", int22 == (-101));
        org.junit.Assert.assertNotNull(intStream23);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertNotNull(byteArrayStream31);
        org.junit.Assert.assertNotNull(autoCloseableArray32);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream37);
        org.junit.Assert.assertNotNull(longStream41);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[100]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 5 + "'", int49 == 5);
        org.junit.Assert.assertNotNull(ofInt50);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-101) + "'", int55 == (-101));
        org.junit.Assert.assertNotNull(intStream56);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[0]");
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[0]");
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[0]");
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertNotNull(byteArrayStream64);
        org.junit.Assert.assertNotNull(autoCloseableArray65);
        org.junit.Assert.assertNotNull(autoCloseableArray66);
        org.junit.Assert.assertNotNull(autoCloseableArray68);
        org.junit.Assert.assertNotNull(objArrayList69);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.function.IntToLongFunction intToLongFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSetAll(longArray3, intToLongFunction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 3, 1]");
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        java.util.Spliterator.OfDouble ofDouble10 = java.util.Arrays.spliterator(doubleArray7, 10, (int) '#');
        java.util.Arrays.fill(doubleArray7, (double) 2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream15 = java.util.Arrays.stream(doubleArray7, (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(97) > fence(-1)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0]");
        org.junit.Assert.assertNotNull(ofDouble10);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        java.util.stream.DoubleStream doubleStream12 = java.util.Arrays.stream(doubleArray11);
        java.util.function.IntToDoubleFunction intToDoubleFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSetAll(doubleArray11, intToDoubleFunction13);
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
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(shortArray0, (-101), (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int8 = java.util.Arrays.binarySearch(doubleArray4, 5, 10, (double) (byte) 0);
        java.util.Spliterator.OfDouble ofDouble11 = java.util.Arrays.spliterator(doubleArray4, (int) '4', 100);
        int int15 = java.util.Arrays.binarySearch(doubleArray4, (int) (byte) 10, (int) (byte) 10, (double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = java.util.Arrays.copyOfRange(doubleArray4, (-96), (-2));
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertNotNull(ofDouble11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-11) + "'", int15 == (-11));
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray3, (int) (byte) 0, (int) (byte) 1);
        java.util.Spliterator.OfInt ofInt9 = java.util.Arrays.spliterator(intArray3, (int) (byte) 1, 10);
        int int11 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 10);
        java.util.stream.IntStream intStream12 = java.util.Arrays.stream(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(intArray3, (-96), (-9), (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -96");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(intStream12);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        java.util.Arrays.parallelSort(charArray4);
        int int13 = java.util.Arrays.binarySearch(charArray4, 'a');
        char[] charArray16 = java.util.Arrays.copyOfRange(charArray4, (int) (short) 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java.util.Arrays.binarySearch(charArray16, (-96), (-5), '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -96");
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
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        int int6 = java.util.Arrays.binarySearch(doubleArray2, (double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = java.util.Arrays.binarySearch(doubleArray2, (-2), (-3), (double) (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(-2) > toIndex(-3)");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Arrays.parallelSort(longArray7);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[0, 0, 0, 0, 0, 0, 0, 1, 3]");
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        java.util.Arrays.parallelSort(intArray3, (int) (byte) 0, (int) (byte) 1);
        java.util.Spliterator.OfInt ofInt7 = java.util.Arrays.spliterator(intArray3);
        java.util.stream.IntStream intStream8 = java.util.Arrays.stream(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = java.util.Arrays.copyOfRange(intArray3, (int) '4', (-96));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 52 > -96");
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
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        java.util.Arrays.sort(doubleArray4);
        java.util.Arrays.sort(doubleArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(doubleArray4, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        double[] doubleArray14 = java.util.Arrays.copyOfRange(doubleArray11, 2, 100);
        double[] doubleArray16 = java.util.Arrays.copyOf(doubleArray11, (int) '#');
        int int18 = java.util.Arrays.binarySearch(doubleArray11, 0.0d);
        java.util.Spliterator.OfDouble ofDouble19 = java.util.Arrays.spliterator(doubleArray11);
        java.util.function.DoubleBinaryOperator doubleBinaryOperator20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(doubleArray11, doubleBinaryOperator20);
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
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(ofDouble19);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream5 = java.util.Arrays.stream(doubleArray4);
        java.util.Arrays.parallelSort(doubleArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(doubleArray4, 49, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(49) > toIndex(-2)");
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
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        byte[] byteArray6 = java.util.Arrays.copyOf(byteArray1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(byteArray1, (int) (short) 10, (int) (byte) -1, (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(10) > toIndex(-1)");
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
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        boolean[] booleanArray9 = java.util.Arrays.copyOf(booleanArray7, 2);
        java.util.Arrays.fill(booleanArray7, true);
        boolean[] booleanArray13 = java.util.Arrays.copyOf(booleanArray7, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray16 = java.util.Arrays.copyOfRange(booleanArray13, (-100), (int) (byte) 1);
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
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.sort(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfInt ofInt11 = java.util.Arrays.spliterator(intArray3, (-36), (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -36");
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
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        long[] longArray7 = java.util.Arrays.copyOfRange(longArray3, (int) (byte) 1, 10);
        java.util.Spliterator.OfLong ofLong8 = java.util.Arrays.spliterator(longArray7);
        java.util.Arrays.parallelSort(longArray7);
        int int11 = java.util.Arrays.binarySearch(longArray7, (long) (byte) 1);
        java.util.function.LongBinaryOperator longBinaryOperator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(longArray7, (-7), (int) '4', longBinaryOperator14);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray4, '#');
        char[] charArray11 = java.util.Arrays.copyOf(charArray4, (int) (byte) 1);
        char[] charArray13 = java.util.Arrays.copyOf(charArray4, 5);
        java.util.Arrays.fill(charArray13, 'a');
        char[] charArray18 = java.util.Arrays.copyOfRange(charArray13, 0, (int) (short) 0);
        java.lang.String str19 = java.util.Arrays.toString(charArray18);
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
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        double[] doubleArray14 = java.util.Arrays.copyOfRange(doubleArray11, 2, 100);
        java.util.Arrays.parallelSort(doubleArray11, (int) (short) 0, 10);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0]" + "'", str18, "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 10.0]");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream3 = java.util.Arrays.stream(charSequenceArray2);
        java.util.stream.Stream<java.lang.Object> objStream4 = java.util.Arrays.stream((java.lang.Object[]) charSequenceArray2);
        java.lang.String str5 = java.util.Arrays.toString((java.lang.Object[]) charSequenceArray2);
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertNotNull(charSequenceStream3);
        org.junit.Assert.assertNotNull(objStream4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[hi!, ]" + "'", str5, "[hi!, ]");
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        short[] shortArray0 = new short[] {};
        int int2 = java.util.Arrays.binarySearch(shortArray0, (short) 1);
        int int4 = java.util.Arrays.binarySearch(shortArray0, (short) (byte) 100);
        short[] shortArray6 = java.util.Arrays.copyOf(shortArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(shortArray6, (int) '4', (int) (short) 0);
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
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0]", "[-1]" };
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.lang.String[] strArray8 = new java.lang.String[] { "[0]", "[-1]" };
        java.util.Arrays.parallelSort(strArray8);
        java.util.Arrays.parallelSort(strArray8);
        java.util.Spliterator<java.lang.String> strSpliterator13 = java.util.Arrays.spliterator(strArray8, 0, 1);
        boolean boolean14 = java.util.Arrays.equals((java.lang.Object[]) strArray2, (java.lang.Object[]) strArray8);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray7 = java.util.Arrays.copyOf(booleanArray5, (int) '4');
        boolean[] booleanArray10 = java.util.Arrays.copyOfRange(booleanArray7, (int) (short) 10, (int) '#');
        boolean[] booleanArray13 = java.util.Arrays.copyOfRange(booleanArray10, 3, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(booleanArray10, (-3), 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        java.util.Arrays.fill(charArray4, '#');
        java.util.Arrays.sort(charArray4);
        java.util.Arrays.fill(charArray4, 'a');
        java.util.Arrays.sort(charArray4);
        java.lang.Class<?> wildcardClass14 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "aaaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "aaaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, a, a, a]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray2);
        java.lang.Object obj4 = null;
        java.util.Arrays.fill((java.lang.Object[]) strArray2, obj4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(strArray2, 17, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 49");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        int int3 = java.util.Arrays.binarySearch(byteArray1, (byte) 1);
        byte[] byteArray5 = java.util.Arrays.copyOf(byteArray1, (int) (short) 0);
        byte[] byteArray7 = java.util.Arrays.copyOf(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(byteArray5, (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(32) > toIndex(10)");
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
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        short[] shortArray6 = new short[] { (byte) 100, (short) 0, (byte) 10, (short) -1, (byte) 1, (byte) 0 };
        java.util.Arrays.parallelSort(shortArray6);
        java.util.Arrays.fill(shortArray6, (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = java.util.Arrays.binarySearch(shortArray6, (-101), (-100), (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, 10, 10, 10, 10, 10]");
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = java.util.Arrays.copyOfRange(byteArray1, (int) (short) 1, 2);
        byte[] byteArray6 = java.util.Arrays.copyOf(byteArray1, (int) ' ');
        java.util.Arrays.fill(byteArray1, (byte) 10);
        java.util.Arrays.fill(byteArray1, (byte) 1);
        int int12 = java.util.Arrays.binarySearch(byteArray1, (byte) -1);
        java.util.Arrays.parallelSort(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(byteArray1, 7, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(7) > toIndex(-100)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        double[] doubleArray11 = java.util.Arrays.copyOf(doubleArray9, 10);
        java.util.stream.DoubleStream doubleStream12 = java.util.Arrays.stream(doubleArray11);
        double[] doubleArray15 = new double[] { (short) 10, 10.0f };
        double[] doubleArray17 = java.util.Arrays.copyOf(doubleArray15, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream18 = java.util.Arrays.stream(doubleArray17);
        double[] doubleArray21 = new double[] { (short) 10, 10.0f };
        double[] doubleArray23 = java.util.Arrays.copyOf(doubleArray21, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream24 = java.util.Arrays.stream(doubleArray23);
        double[] doubleArray27 = new double[] { (short) 10, 10.0f };
        double[] doubleArray29 = java.util.Arrays.copyOf(doubleArray27, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream30 = java.util.Arrays.stream(doubleArray29);
        double[] doubleArray33 = new double[] { (short) 10, 10.0f };
        double[] doubleArray35 = java.util.Arrays.copyOf(doubleArray33, (int) (short) 100);
        java.util.stream.DoubleStream doubleStream36 = java.util.Arrays.stream(doubleArray35);
        java.util.stream.DoubleStream[] doubleStreamArray37 = new java.util.stream.DoubleStream[] { doubleStream12, doubleStream18, doubleStream24, doubleStream30, doubleStream36 };
        java.util.Spliterator<java.util.stream.DoubleStream> doubleStreamSpliterator38 = java.util.Arrays.spliterator(doubleStreamArray37);
        java.lang.Object obj39 = null;
        java.util.Arrays.fill((java.lang.Object[]) doubleStreamArray37, obj39);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator<java.lang.AutoCloseable> autoCloseableSpliterator43 = java.util.Arrays.spliterator((java.lang.AutoCloseable[]) doubleStreamArray37, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(100) > fence(-1)");
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
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleStream24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleStream30);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleStream36);
        org.junit.Assert.assertNotNull(doubleStreamArray37);
        org.junit.Assert.assertNotNull(doubleStreamSpliterator38);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        long[] longArray1 = new long[] { ' ' };
        java.util.stream.LongStream longStream2 = java.util.Arrays.stream(longArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream5 = java.util.Arrays.stream(longArray1, (-36), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -36");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[32]");
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        java.util.Arrays.sort(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(charArray4, 7, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(7) > toIndex(-9)");
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
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        float[] floatArray3 = new float[] { (-1), (short) -1, '4' };
        int int5 = java.util.Arrays.binarySearch(floatArray3, 0.0f);
        java.util.Arrays.parallelSort(floatArray3);
        int int8 = java.util.Arrays.binarySearch(floatArray3, (float) 10L);
        java.util.Arrays.sort(floatArray3);
        float[] floatArray13 = new float[] { (-1), (short) -1, '4' };
        int int15 = java.util.Arrays.binarySearch(floatArray13, 0.0f);
        java.util.Arrays.parallelSort(floatArray13);
        java.util.Arrays.fill(floatArray13, (float) ' ');
        int int20 = java.util.Arrays.binarySearch(floatArray13, (-1.0f));
        boolean boolean21 = java.util.Arrays.equals(floatArray3, floatArray13);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-3) + "'", int8 == (-3));
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[32.0, 32.0, 32.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3) + "'", int15 == (-3));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        long[] longArray3 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream4 = java.util.Arrays.stream(longArray3);
        java.util.Arrays.fill(longArray3, (long) (byte) 10);
        java.util.Arrays.sort(longArray3);
        java.util.stream.LongStream longStream8 = java.util.Arrays.stream(longArray3);
        int[] intArray10 = new int[] { 100 };
        int[] intArray12 = java.util.Arrays.copyOf(intArray10, (int) (short) 100);
        int int16 = java.util.Arrays.binarySearch(intArray12, (int) (byte) 1, 10, 0);
        java.util.Spliterator.OfInt ofInt17 = java.util.Arrays.spliterator(intArray12);
        java.util.Arrays.parallelSort(intArray12, 0, 7);
        int int22 = java.util.Arrays.binarySearch(intArray12, 3);
        java.util.stream.IntStream intStream23 = java.util.Arrays.stream(intArray12);
        byte[] byteArray25 = new byte[] { (byte) 0 };
        byte[] byteArray27 = new byte[] { (byte) 0 };
        byte[] byteArray29 = new byte[] { (byte) 0 };
        byte[][] byteArray30 = new byte[][] { byteArray25, byteArray27, byteArray29 };
        java.util.stream.Stream<byte[]> byteArrayStream31 = java.util.Arrays.stream(byteArray30);
        java.lang.AutoCloseable[] autoCloseableArray32 = new java.lang.AutoCloseable[] { longStream8, intStream23, byteArrayStream31 };
        long[] longArray36 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream37 = java.util.Arrays.stream(longArray36);
        java.util.Arrays.fill(longArray36, (long) (byte) 10);
        java.util.Arrays.sort(longArray36);
        java.util.stream.LongStream longStream41 = java.util.Arrays.stream(longArray36);
        int[] intArray43 = new int[] { 100 };
        int[] intArray45 = java.util.Arrays.copyOf(intArray43, (int) (short) 100);
        int int49 = java.util.Arrays.binarySearch(intArray45, (int) (byte) 1, 10, 0);
        java.util.Spliterator.OfInt ofInt50 = java.util.Arrays.spliterator(intArray45);
        java.util.Arrays.parallelSort(intArray45, 0, 7);
        int int55 = java.util.Arrays.binarySearch(intArray45, 3);
        java.util.stream.IntStream intStream56 = java.util.Arrays.stream(intArray45);
        byte[] byteArray58 = new byte[] { (byte) 0 };
        byte[] byteArray60 = new byte[] { (byte) 0 };
        byte[] byteArray62 = new byte[] { (byte) 0 };
        byte[][] byteArray63 = new byte[][] { byteArray58, byteArray60, byteArray62 };
        java.util.stream.Stream<byte[]> byteArrayStream64 = java.util.Arrays.stream(byteArray63);
        java.lang.AutoCloseable[] autoCloseableArray65 = new java.lang.AutoCloseable[] { longStream41, intStream56, byteArrayStream64 };
        java.lang.AutoCloseable[][] autoCloseableArray66 = new java.lang.AutoCloseable[][] { autoCloseableArray32, autoCloseableArray65 };
        java.lang.AutoCloseable[][] autoCloseableArray68 = java.util.Arrays.copyOf(autoCloseableArray66, 0);
        java.util.List<java.lang.Object[]> objArrayList69 = java.util.Arrays.asList((java.lang.Object[][]) autoCloseableArray68);
        // The following exception was thrown during execution in test generation
        try {
            int int73 = java.util.Arrays.binarySearch((java.lang.Object[]) autoCloseableArray68, (-101), (-53), (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(ofInt17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-101) + "'", int22 == (-101));
        org.junit.Assert.assertNotNull(intStream23);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertNotNull(byteArrayStream31);
        org.junit.Assert.assertNotNull(autoCloseableArray32);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(longStream37);
        org.junit.Assert.assertNotNull(longStream41);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[100]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 5 + "'", int49 == 5);
        org.junit.Assert.assertNotNull(ofInt50);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-101) + "'", int55 == (-101));
        org.junit.Assert.assertNotNull(intStream56);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[0]");
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[0]");
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[0]");
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertNotNull(byteArrayStream64);
        org.junit.Assert.assertNotNull(autoCloseableArray65);
        org.junit.Assert.assertNotNull(autoCloseableArray66);
        org.junit.Assert.assertNotNull(autoCloseableArray68);
        org.junit.Assert.assertNotNull(objArrayList69);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        double[] doubleArray2 = new double[] { (short) 10, 10.0f };
        double[] doubleArray4 = java.util.Arrays.copyOf(doubleArray2, (int) (short) 100);
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray4, 2, (int) 'a');
        double[] doubleArray9 = java.util.Arrays.copyOf(doubleArray4, (int) 'a');
        java.util.Arrays.fill(doubleArray4, (double) 10);
        java.util.function.IntToDoubleFunction intToDoubleFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSetAll(doubleArray4, intToDoubleFunction12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        double[] doubleArray4 = new double[] { 3, 0.0f, (short) 0, (-4) };
        java.util.Arrays.fill(doubleArray4, (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = java.util.Arrays.binarySearch(doubleArray4, (int) (short) 0, (-3), (double) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-3)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        java.util.Arrays.fill(intArray3, 3);
        java.util.Spliterator.OfInt ofInt10 = java.util.Arrays.spliterator(intArray3);
        java.util.Arrays.parallelSort(intArray3);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(ofInt10);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator<java.lang.AutoCloseable> autoCloseableSpliterator47 = java.util.Arrays.spliterator((java.lang.AutoCloseable[]) longStreamArray43, (int) '4', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(52) > fence(2)");
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
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        float[] floatArray1 = new float[] { (-1L) };
        int int3 = java.util.Arrays.binarySearch(floatArray1, (float) (short) -1);
        java.util.Arrays.sort(floatArray1);
        java.util.Arrays.fill(floatArray1, 0.0f);
        java.util.Arrays.sort(floatArray1);
        java.lang.String str8 = java.util.Arrays.toString(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0.0]" + "'", str8, "[0.0]");
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        char[] charArray4 = new char[] { 'a', '4', ' ', 'a' };
        java.util.Arrays.parallelSort(charArray4, (int) (byte) 1, 3);
        char[] charArray10 = java.util.Arrays.copyOfRange(charArray4, (int) (byte) 0, (int) (byte) 0);
        int int12 = java.util.Arrays.binarySearch(charArray10, '#');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray15 = java.util.Arrays.copyOfRange(charArray10, (int) (short) 1, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
}

