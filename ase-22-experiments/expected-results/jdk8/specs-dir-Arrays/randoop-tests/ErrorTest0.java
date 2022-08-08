import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.parallelSort(strArray2);
        java.util.Arrays.sort((java.lang.Object[]) strArray2);
        java.io.Serializable[] serializableArray7 = java.util.Arrays.copyOf((java.io.Serializable[]) strArray2, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Arrays.sort((java.lang.Object[]) serializableArray7);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray4 = java.util.Arrays.copyOf((java.lang.Class<?>[]) classArray1, 3);
        java.util.stream.Stream<java.lang.Class<?>> wildcardClassStream7 = java.util.Arrays.stream(wildcardClassArray4, (int) (short) 1, 1);
        java.util.Spliterator<java.lang.reflect.AnnotatedElement> annotatedElementSpliterator8 = java.util.Arrays.spliterator((java.lang.reflect.AnnotatedElement[]) wildcardClassArray4);
        int[] intArray10 = new int[] { 100 };
        int[] intArray12 = java.util.Arrays.copyOf(intArray10, (int) (short) 100);
        int int16 = java.util.Arrays.binarySearch(intArray12, (int) (byte) 1, 10, 0);
        int[] intArray18 = java.util.Arrays.copyOf(intArray12, (int) (short) 100);
        java.util.Spliterator.OfInt ofInt19 = java.util.Arrays.spliterator(intArray18);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        int int20 = java.util.Arrays.binarySearch((java.lang.Object[]) wildcardClassArray4, (java.lang.Object) ofInt19);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = java.util.Arrays.copyOf(intArray1, (int) (short) 100);
        int int7 = java.util.Arrays.binarySearch(intArray3, (int) (byte) 1, 10, 0);
        int[] intArray9 = java.util.Arrays.copyOf(intArray3, (int) (short) 100);
        java.lang.Class<?> wildcardClass10 = intArray9.getClass();
        java.lang.reflect.Type[] typeArray11 = new java.lang.reflect.Type[] { wildcardClass10 };
        java.lang.reflect.Type[] typeArray13 = java.util.Arrays.copyOf(typeArray11, 2);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        java.util.Arrays.sort((java.lang.Object[]) typeArray13);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray4 = java.util.Arrays.copyOf((java.lang.Class<?>[]) classArray1, 3);
        java.util.stream.Stream<java.lang.Class<?>> wildcardClassStream7 = java.util.Arrays.stream(wildcardClassArray4, (int) (short) 1, 1);
        java.util.Spliterator<java.lang.reflect.AnnotatedElement> annotatedElementSpliterator8 = java.util.Arrays.spliterator((java.lang.reflect.AnnotatedElement[]) wildcardClassArray4);
        long[] longArray12 = new long[] { (byte) 100, 3, 1L };
        java.util.stream.LongStream longStream13 = java.util.Arrays.stream(longArray12);
        java.util.Arrays.fill(longArray12, (long) (byte) 10);
        int int17 = java.util.Arrays.binarySearch(longArray12, (-1L));
        java.util.Arrays.parallelSort(longArray12);
        java.util.stream.LongStream longStream21 = java.util.Arrays.stream(longArray12, (int) (byte) 1, (int) (short) 1);
        int int23 = java.util.Arrays.binarySearch(longArray12, 0L);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        int int24 = java.util.Arrays.binarySearch((java.lang.Object[]) wildcardClassArray4, (java.lang.Object) longArray12);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        char[] charArray3 = new char[] { ' ', '4', 'a' };
        char[] charArray7 = new char[] { ' ', '4', 'a' };
        char[][] charArray8 = new char[][] { charArray3, charArray7 };
        java.util.stream.Stream<char[]> charArrayStream9 = java.util.Arrays.stream(charArray8);
        java.util.List<char[]> charArrayList10 = java.util.Arrays.asList(charArray8);
        char[][] charArray12 = java.util.Arrays.copyOf(charArray8, (int) (short) 10);
        float[] floatArray16 = new float[] { (-1), (short) -1, '4' };
        int int18 = java.util.Arrays.binarySearch(floatArray16, 0.0f);
        java.util.Arrays.parallelSort(floatArray16);
        java.util.Arrays.fill(floatArray16, (float) ' ');
        float[] floatArray23 = java.util.Arrays.copyOf(floatArray16, (int) (byte) 1);
        java.util.Arrays.fill(floatArray23, (float) 17);
        float[] floatArray27 = java.util.Arrays.copyOf(floatArray23, (int) (short) 100);
        /* during test generation this statement threw an exception of type java.lang.NullPointerException in error
		but CMM Protocol violated too: 
		"Searches the specified array of longs for the specified value using the binary search algorithm.  The array must be sorted (as by the {@link #sort(long[])} method) prior to making this call.  If it is not sorted, the results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which one will be found. "*/
        int int28 = java.util.Arrays.binarySearch((java.lang.Object[]) charArray12, (java.lang.Object) (short) 100);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray4 = java.util.Arrays.copyOf((java.lang.Class<?>[]) classArray1, 3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Arrays.sort((java.lang.Object[]) wildcardClassArray4);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray4 = java.util.Arrays.copyOf((java.lang.Class<?>[]) classArray1, 3);
        java.io.Serializable[] serializableArray7 = java.util.Arrays.copyOfRange((java.io.Serializable[]) wildcardClassArray4, (int) (short) 0, (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Arrays.sort((java.lang.Object[]) serializableArray7);
    }
}

