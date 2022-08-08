import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        int int2 = wildcardClassItor1.previousIndex();
        int int3 = wildcardClassItor1.nextIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.AnnotatedElement>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        int int7 = wildcardClassItor6.previousIndex();
        int int8 = wildcardClassItor6.previousIndex();
        boolean boolean9 = wildcardClassItor6.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor11 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor12 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor11.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor12);
        int int14 = wildcardClassItor12.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor15 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor12);
        wildcardClassItor10.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor15);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor17 = wildcardClassItor10.getListIterator();
        int int18 = wildcardClassItor10.previousIndex();
        boolean boolean19 = wildcardClassItor10.hasNext();
        wildcardClassItor6.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate21 = wildcardClassItor10.getPredicate();
        boolean boolean22 = wildcardClassItor10.hasPrevious();
        annotatedElementItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(wildcardPredicate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        boolean boolean3 = wildcardClassItor1.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor5.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor9.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        int int12 = wildcardClassItor10.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        wildcardClassItor8.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor15 = wildcardClassItor8.getListIterator();
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        int int18 = wildcardClassItor8.previousIndex();
        int int19 = wildcardClassItor8.nextIndex();
        int int20 = wildcardClassItor8.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Object> objItor21 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Object>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        java.lang.Class<?> wildcardClass22 = objItor21.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        int int1 = wildcardClassItor0.nextIndex();
        boolean boolean2 = wildcardClassItor0.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor3 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = wildcardClassItor3.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor3 = wildcardClassItor1.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor6);
        int int8 = wildcardClassItor6.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor6);
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor9);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor11 = wildcardClassItor4.getListIterator();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        boolean boolean14 = wildcardClassItor13.hasPrevious();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor15 = wildcardClassItor13.getListIterator();
        boolean boolean16 = wildcardClassItor13.hasNext();
        org.junit.Assert.assertNull(wildcardItor3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor3 = wildcardClassItor1.getListIterator();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor4 = wildcardClassItor1.getListIterator();
        int int5 = wildcardClassItor1.previousIndex();
        boolean boolean6 = wildcardClassItor1.hasPrevious();
        org.junit.Assert.assertNull(wildcardItor3);
        org.junit.Assert.assertNull(wildcardItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate1 = wildcardClassItor0.getPredicate();
        boolean boolean2 = wildcardClassItor0.hasNext();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate3 = wildcardClassItor0.getPredicate();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate4 = wildcardClassItor0.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.AnnotatedElement>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate6 = annotatedElementItor5.getPredicate();
        org.junit.Assert.assertNull(wildcardPredicate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardPredicate3);
        org.junit.Assert.assertNull(wildcardPredicate4);
        org.junit.Assert.assertNull(wildcardPredicate6);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate5 = wildcardClassItor4.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor6 = wildcardClassItor4.getListIterator();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor4.getListIterator();
        boolean boolean8 = wildcardClassItor4.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor9.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        boolean boolean12 = wildcardClassItor10.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor14 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor13.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor14);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor16 = wildcardClassItor14.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor17 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor18 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor19 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor18.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor19);
        int int21 = wildcardClassItor19.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor22 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor19);
        wildcardClassItor17.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor22);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor24 = wildcardClassItor17.getListIterator();
        wildcardClassItor14.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor17);
        wildcardClassItor10.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor17);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor27 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor17);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate28 = wildcardClassItor27.getPredicate();
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor27);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor30 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor27);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor31 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor32 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor31.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor32);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor34 = wildcardClassItor32.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor35 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor36 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor37 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor36.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor37);
        int int39 = wildcardClassItor37.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor40 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor37);
        wildcardClassItor35.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor40);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor42 = wildcardClassItor35.getListIterator();
        wildcardClassItor32.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor35);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor44 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor35);
        boolean boolean45 = wildcardClassItor44.hasPrevious();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor46 = wildcardClassItor44.getListIterator();
        wildcardClassItor27.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor44);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate48 = wildcardClassItor27.getPredicate();
        boolean boolean49 = wildcardClassItor27.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            wildcardClassItor27.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: FilterListIterator.remove() is not supported.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate5);
        org.junit.Assert.assertNotNull(wildcardItor6);
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardItor16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor24);
        org.junit.Assert.assertNull(wildcardPredicate28);
        org.junit.Assert.assertNull(wildcardItor34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardItor46);
        org.junit.Assert.assertNull(wildcardPredicate48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor0.getListIterator();
        int int8 = wildcardClassItor0.previousIndex();
        boolean boolean9 = wildcardClassItor0.hasNext();
        int int10 = wildcardClassItor0.nextIndex();
        boolean boolean11 = wildcardClassItor0.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor12 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor13 = wildcardClassItor0.getListIterator();
        int int14 = wildcardClassItor0.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor15 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor16 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor17 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor16.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor17);
        int int19 = wildcardClassItor17.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor20 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor17);
        wildcardClassItor15.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor20);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor22 = wildcardClassItor15.getListIterator();
        int int23 = wildcardClassItor15.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor24 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor25 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor24.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor25);
        int int27 = wildcardClassItor25.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor28 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor25);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate29 = wildcardClassItor28.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor30 = wildcardClassItor28.getListIterator();
        wildcardClassItor15.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor28);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor32 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor28);
        int int33 = wildcardClassItor32.nextIndex();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor32);
        int int35 = wildcardClassItor0.previousIndex();
        boolean boolean36 = wildcardClassItor0.hasPrevious();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate29);
        org.junit.Assert.assertNotNull(wildcardItor30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        int int2 = wildcardClassItor1.previousIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor3 = wildcardClassItor1.getListIterator();
        int int4 = wildcardClassItor1.nextIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate5 = wildcardClassItor1.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        boolean boolean7 = wildcardClassItor6.hasPrevious();
        boolean boolean8 = wildcardClassItor6.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = wildcardClassItor6.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(wildcardPredicate5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate5 = wildcardClassItor4.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor6 = wildcardClassItor4.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor7 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        int int10 = wildcardClassItor9.previousIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor11 = wildcardClassItor9.getListIterator();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate12 = wildcardClassItor9.getPredicate();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate13 = wildcardClassItor9.getPredicate();
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor9);
        boolean boolean15 = wildcardClassItor4.hasNext();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate5);
        org.junit.Assert.assertNotNull(wildcardItor6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor11);
        org.junit.Assert.assertNull(wildcardPredicate12);
        org.junit.Assert.assertNull(wildcardPredicate13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor0.getListIterator();
        int int8 = wildcardClassItor0.nextIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate5 = wildcardClassItor4.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor6 = wildcardClassItor4.getListIterator();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor4.getListIterator();
        boolean boolean8 = wildcardClassItor4.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor9.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        boolean boolean12 = wildcardClassItor10.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor14 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor13.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor14);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor16 = wildcardClassItor14.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor17 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor18 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor19 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor18.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor19);
        int int21 = wildcardClassItor19.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor22 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor19);
        wildcardClassItor17.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor22);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor24 = wildcardClassItor17.getListIterator();
        wildcardClassItor14.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor17);
        wildcardClassItor10.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor17);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor27 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor17);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate28 = wildcardClassItor27.getPredicate();
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor27);
        boolean boolean30 = wildcardClassItor4.hasPrevious();
        boolean boolean31 = wildcardClassItor4.hasNext();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor32 = wildcardClassItor4.getListIterator();
        boolean boolean33 = wildcardClassItor4.hasPrevious();
        boolean boolean34 = wildcardClassItor4.hasPrevious();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate5);
        org.junit.Assert.assertNotNull(wildcardItor6);
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardItor16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor24);
        org.junit.Assert.assertNull(wildcardPredicate28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardItor32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        int int1 = wildcardClassItor0.nextIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor2 = wildcardClassItor0.getListIterator();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate3 = wildcardClassItor0.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor4 = wildcardClassItor0.getListIterator();
        int int5 = wildcardClassItor0.previousIndex();
        boolean boolean6 = wildcardClassItor0.hasPrevious();
        int int7 = wildcardClassItor0.nextIndex();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(wildcardItor2);
        org.junit.Assert.assertNull(wildcardPredicate3);
        org.junit.Assert.assertNull(wildcardItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        boolean boolean5 = wildcardClassItor4.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor7 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor7.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        int int10 = wildcardClassItor8.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor11 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        boolean boolean12 = wildcardClassItor11.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.AnnotatedElement>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor11);
        int int14 = wildcardClassItor11.previousIndex();
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor11);
        boolean boolean16 = wildcardClassItor4.hasPrevious();
        int int17 = wildcardClassItor4.nextIndex();
        int int18 = wildcardClassItor4.nextIndex();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        boolean boolean2 = wildcardClassItor1.hasNext();
        boolean boolean3 = wildcardClassItor1.hasNext();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor0.getListIterator();
        boolean boolean8 = wildcardClassItor0.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate10 = wildcardClassItor0.getPredicate();
        boolean boolean11 = wildcardClassItor0.hasNext();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardPredicate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate4 = wildcardClassItor1.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor5 = wildcardClassItor1.getListIterator();
        boolean boolean6 = wildcardClassItor1.hasNext();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate7 = wildcardClassItor1.getPredicate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate4);
        org.junit.Assert.assertNull(wildcardItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardPredicate7);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        int int2 = wildcardClassItor1.previousIndex();
        int int3 = wildcardClassItor1.nextIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate4 = wildcardClassItor1.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor6 = wildcardClassItor5.getListIterator();
        boolean boolean7 = wildcardClassItor5.hasNext();
        java.lang.Class<?> wildcardClass8 = wildcardClassItor5.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(wildcardPredicate4);
        org.junit.Assert.assertNotNull(wildcardItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        int int2 = wildcardClassItor1.previousIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor3 = wildcardClassItor1.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        boolean boolean7 = wildcardClassItor5.hasPrevious();
        int int8 = wildcardClassItor5.nextIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor9 = wildcardClassItor5.getListIterator();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor11 = wildcardClassItor1.getListIterator();
        // The following exception was thrown during execution in test generation
        try {
            wildcardClassItor1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: FilterListIterator.remove() is not supported.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(wildcardItor9);
        org.junit.Assert.assertNotNull(wildcardItor11);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor5.getListIterator();
        boolean boolean8 = wildcardClassItor5.hasPrevious();
        boolean boolean9 = wildcardClassItor5.hasPrevious();
        boolean boolean10 = wildcardClassItor5.hasNext();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate11 = wildcardClassItor5.getPredicate();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(wildcardPredicate11);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor0.getListIterator();
        int int8 = wildcardClassItor0.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor9.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        int int12 = wildcardClassItor10.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate14 = wildcardClassItor13.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor15 = wildcardClassItor13.getListIterator();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor17 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        int int18 = wildcardClassItor17.nextIndex();
        boolean boolean19 = wildcardClassItor17.hasNext();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor20 = wildcardClassItor17.getListIterator();
        // The following exception was thrown during execution in test generation
        try {
            wildcardClassItor17.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: FilterListIterator.remove() is not supported.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate14);
        org.junit.Assert.assertNotNull(wildcardItor15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardItor20);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor5.getListIterator();
        boolean boolean8 = wildcardClassItor5.hasPrevious();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor9 = wildcardClassItor5.getListIterator();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardItor9);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor5 = wildcardClassItor4.getListIterator();
        int int6 = wildcardClassItor4.nextIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor4.getListIterator();
        boolean boolean8 = wildcardClassItor4.hasPrevious();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor9 = wildcardClassItor4.getListIterator();
        java.lang.Class<?> wildcardClass10 = wildcardItor9.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardItor9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        boolean boolean5 = wildcardClassItor4.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor7 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor7.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        int int10 = wildcardClassItor8.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor11 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        boolean boolean12 = wildcardClassItor11.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.AnnotatedElement>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor11);
        int int14 = wildcardClassItor11.previousIndex();
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor11);
        boolean boolean16 = wildcardClassItor11.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = wildcardClassItor11.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        int int2 = wildcardClassItor1.previousIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor3 = wildcardClassItor1.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor6 = wildcardClassItor5.getListIterator();
        int int7 = wildcardClassItor5.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor8.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor9);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor11 = wildcardClassItor9.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor12 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor14 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor13.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor14);
        int int16 = wildcardClassItor14.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor17 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor14);
        wildcardClassItor12.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor17);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor19 = wildcardClassItor12.getListIterator();
        wildcardClassItor9.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor12);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor21 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor12);
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor12);
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor12);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor24 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = wildcardClassItor24.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor3);
        org.junit.Assert.assertNotNull(wildcardItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(wildcardItor11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor19);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor0.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.Type> typeItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.Type>((java.util.ListIterator<java.lang.Class<?>>) wildcardItor7);
        int int9 = typeItor8.nextIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor11 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor12 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor11.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor12);
        int int14 = wildcardClassItor12.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor15 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor12);
        wildcardClassItor10.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor15);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor17 = wildcardClassItor10.getListIterator();
        int int18 = wildcardClassItor10.previousIndex();
        boolean boolean19 = wildcardClassItor10.hasNext();
        int int20 = wildcardClassItor10.nextIndex();
        typeItor8.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        int int22 = wildcardClassItor10.nextIndex();
        int int23 = wildcardClassItor10.nextIndex();
        // The following exception was thrown during execution in test generation
        try {
            wildcardClassItor10.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: FilterListIterator.remove() is not supported.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor0.getListIterator();
        int int8 = wildcardClassItor0.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate9 = wildcardClassItor0.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        int int11 = wildcardClassItor10.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate12 = wildcardClassItor10.getPredicate();
        int int13 = wildcardClassItor10.nextIndex();
        // The following exception was thrown during execution in test generation
        try {
            wildcardClassItor10.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: FilterListIterator.remove() is not supported.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor0.getListIterator();
        int int8 = wildcardClassItor0.previousIndex();
        boolean boolean9 = wildcardClassItor0.hasNext();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor10 = wildcardClassItor0.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor11 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor12 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor11.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor12);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor14 = wildcardClassItor12.getListIterator();
        boolean boolean15 = wildcardClassItor12.hasNext();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor12);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor17 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.AnnotatedElement>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = wildcardClassItor0.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardItor10);
        org.junit.Assert.assertNull(wildcardItor14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        boolean boolean5 = wildcardClassItor4.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate7 = wildcardClassItor6.getPredicate();
        // The following exception was thrown during execution in test generation
        try {
            wildcardClassItor6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: FilterListIterator.remove() is not supported.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardPredicate7);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        int int2 = wildcardClassItor1.previousIndex();
        int int3 = wildcardClassItor1.nextIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate4 = wildcardClassItor1.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor6 = wildcardClassItor5.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor7 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        int int8 = wildcardClassItor7.previousIndex();
        boolean boolean9 = wildcardClassItor7.hasPrevious();
        boolean boolean10 = wildcardClassItor7.hasPrevious();
        int int11 = wildcardClassItor7.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor12 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(wildcardPredicate4);
        org.junit.Assert.assertNotNull(wildcardItor6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor3 = wildcardClassItor1.getListIterator();
        boolean boolean4 = wildcardClassItor1.hasNext();
        boolean boolean5 = wildcardClassItor1.hasNext();
        boolean boolean6 = wildcardClassItor1.hasPrevious();
        org.junit.Assert.assertNull(wildcardItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor3 = wildcardClassItor1.getListIterator();
        boolean boolean4 = wildcardClassItor1.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int6 = wildcardClassItor1.nextIndex();
        org.junit.Assert.assertNull(wildcardItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor0.getListIterator();
        int int8 = wildcardClassItor0.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate9 = wildcardClassItor0.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        int int11 = wildcardClassItor10.previousIndex();
        int int12 = wildcardClassItor10.previousIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        int int2 = wildcardClassItor1.previousIndex();
        int int3 = wildcardClassItor1.nextIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor4 = wildcardClassItor1.getListIterator();
        boolean boolean5 = wildcardClassItor1.hasNext();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        boolean boolean5 = wildcardClassItor4.hasNext();
        int int6 = wildcardClassItor4.previousIndex();
        int int7 = wildcardClassItor4.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor8.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor9);
        boolean boolean11 = wildcardClassItor9.hasPrevious();
        int int12 = wildcardClassItor9.nextIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor14 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        int int15 = wildcardClassItor14.previousIndex();
        int int16 = wildcardClassItor14.nextIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor17 = wildcardClassItor14.getListIterator();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor18 = wildcardClassItor14.getListIterator();
        wildcardClassItor9.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardItor18);
        int int20 = wildcardClassItor9.previousIndex();
        boolean boolean21 = wildcardClassItor9.hasPrevious();
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor9);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor23 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor24 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor25 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor26 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor25.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor26);
        int int28 = wildcardClassItor26.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor29 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor26);
        wildcardClassItor24.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor29);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor31 = wildcardClassItor24.getListIterator();
        wildcardClassItor23.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardItor31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardItor17);
        org.junit.Assert.assertNotNull(wildcardItor18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor31);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor0.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.Type> typeItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.Type>((java.util.ListIterator<java.lang.Class<?>>) wildcardItor7);
        int int9 = typeItor8.nextIndex();
        int int10 = typeItor8.previousIndex();
        boolean boolean11 = typeItor8.hasNext();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate12 = typeItor8.getPredicate();
        int int13 = typeItor8.previousIndex();
        int int14 = typeItor8.nextIndex();
        boolean boolean15 = typeItor8.hasNext();
        boolean boolean16 = typeItor8.hasNext();
        boolean boolean17 = typeItor8.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            typeItor8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: FilterListIterator.remove() is not supported.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardPredicate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate4 = wildcardClassItor1.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        int int7 = wildcardClassItor5.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        int int10 = wildcardClassItor1.previousIndex();
        boolean boolean11 = wildcardClassItor1.hasNext();
        int int12 = wildcardClassItor1.previousIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = wildcardClassItor1.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        boolean boolean3 = wildcardClassItor1.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor5.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor9.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        int int12 = wildcardClassItor10.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        wildcardClassItor8.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor15 = wildcardClassItor8.getListIterator();
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor18 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate19 = wildcardClassItor8.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor20 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        // The following exception was thrown during execution in test generation
        try {
            wildcardClassItor20.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: FilterListIterator.remove() is not supported.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor15);
        org.junit.Assert.assertNull(wildcardPredicate19);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        boolean boolean3 = wildcardClassItor1.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor5.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor9.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        int int12 = wildcardClassItor10.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        wildcardClassItor8.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor15 = wildcardClassItor8.getListIterator();
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor18 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        boolean boolean19 = wildcardClassItor18.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor20 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor21 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor20.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor21);
        int int23 = wildcardClassItor21.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor24 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor21);
        boolean boolean25 = wildcardClassItor24.hasNext();
        int int26 = wildcardClassItor24.previousIndex();
        int int27 = wildcardClassItor24.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor28 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor29 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor28.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor29);
        boolean boolean31 = wildcardClassItor29.hasPrevious();
        int int32 = wildcardClassItor29.nextIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor33 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor34 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor33);
        int int35 = wildcardClassItor34.previousIndex();
        int int36 = wildcardClassItor34.nextIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor37 = wildcardClassItor34.getListIterator();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor38 = wildcardClassItor34.getListIterator();
        wildcardClassItor29.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardItor38);
        int int40 = wildcardClassItor29.previousIndex();
        boolean boolean41 = wildcardClassItor29.hasPrevious();
        wildcardClassItor24.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor29);
        wildcardClassItor18.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor29);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate44 = wildcardClassItor18.getPredicate();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardItor37);
        org.junit.Assert.assertNotNull(wildcardItor38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(wildcardPredicate44);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        int int2 = wildcardClassItor1.previousIndex();
        int int3 = wildcardClassItor1.previousIndex();
        boolean boolean4 = wildcardClassItor1.hasPrevious();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate5 = wildcardClassItor1.getPredicate();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate6 = wildcardClassItor1.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor7 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardPredicate5);
        org.junit.Assert.assertNull(wildcardPredicate6);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        int int2 = wildcardClassItor1.previousIndex();
        int int3 = wildcardClassItor1.nextIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate4 = wildcardClassItor1.getPredicate();
        int int5 = wildcardClassItor1.previousIndex();
        boolean boolean6 = wildcardClassItor1.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor7 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor7.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor10 = wildcardClassItor8.getListIterator();
        boolean boolean11 = wildcardClassItor8.hasNext();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        // The following exception was thrown during execution in test generation
        try {
            wildcardClassItor1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: FilterListIterator.remove() is not supported.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(wildcardPredicate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor0.getListIterator();
        int int8 = wildcardClassItor0.previousIndex();
        boolean boolean9 = wildcardClassItor0.hasNext();
        int int10 = wildcardClassItor0.nextIndex();
        boolean boolean11 = wildcardClassItor0.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor12 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor13 = wildcardClassItor12.getListIterator();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor14 = wildcardClassItor12.getListIterator();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate15 = wildcardClassItor12.getPredicate();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardItor13);
        org.junit.Assert.assertNotNull(wildcardItor14);
        org.junit.Assert.assertNull(wildcardPredicate15);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        boolean boolean3 = wildcardClassItor1.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor5.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor9.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        int int12 = wildcardClassItor10.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        wildcardClassItor8.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor15 = wildcardClassItor8.getListIterator();
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor18 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        int int19 = wildcardClassItor8.previousIndex();
        int int20 = wildcardClassItor8.nextIndex();
        int int21 = wildcardClassItor8.nextIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate22 = wildcardClassItor8.getPredicate();
        boolean boolean23 = wildcardClassItor8.hasNext();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(wildcardPredicate22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        boolean boolean5 = wildcardClassItor4.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.AnnotatedElement>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        int int7 = wildcardClassItor4.previousIndex();
        int int8 = wildcardClassItor4.nextIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor9 = wildcardClassItor4.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor11 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor10.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor11);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor13 = wildcardClassItor11.getListIterator();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor14 = wildcardClassItor11.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor15 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor16 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor15.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor16);
        boolean boolean18 = wildcardClassItor16.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor19 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor20 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor19.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor20);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor22 = wildcardClassItor20.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor23 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor24 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor25 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor24.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor25);
        int int27 = wildcardClassItor25.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor28 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor25);
        wildcardClassItor23.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor28);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor30 = wildcardClassItor23.getListIterator();
        wildcardClassItor20.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor23);
        wildcardClassItor16.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor23);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor33 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor23);
        int int34 = wildcardClassItor23.previousIndex();
        int int35 = wildcardClassItor23.nextIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor36 = wildcardClassItor23.getListIterator();
        wildcardClassItor11.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor23);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor38 = wildcardClassItor23.getListIterator();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor39 = wildcardClassItor23.getListIterator();
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor23);
        boolean boolean41 = wildcardClassItor23.hasPrevious();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardItor9);
        org.junit.Assert.assertNull(wildcardItor13);
        org.junit.Assert.assertNull(wildcardItor14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(wildcardItor22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(wildcardItor36);
        org.junit.Assert.assertNotNull(wildcardItor38);
        org.junit.Assert.assertNotNull(wildcardItor39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        boolean boolean3 = wildcardClassItor1.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor5.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor9.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        int int12 = wildcardClassItor10.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        wildcardClassItor8.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor15 = wildcardClassItor8.getListIterator();
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor18 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        int int19 = wildcardClassItor18.nextIndex();
        boolean boolean20 = wildcardClassItor18.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor21 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor22 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor21.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor22);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor24 = wildcardClassItor22.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor25 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor26 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor27 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor26.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor27);
        int int29 = wildcardClassItor27.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor30 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor27);
        wildcardClassItor25.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor30);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor32 = wildcardClassItor25.getListIterator();
        wildcardClassItor22.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor25);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor34 = wildcardClassItor25.getListIterator();
        wildcardClassItor18.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor25);
        boolean boolean36 = wildcardClassItor25.hasNext();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate37 = wildcardClassItor25.getPredicate();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(wildcardItor24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor32);
        org.junit.Assert.assertNotNull(wildcardItor34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(wildcardPredicate37);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        int int2 = wildcardClassItor1.previousIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor3 = wildcardClassItor1.getListIterator();
        int int4 = wildcardClassItor1.nextIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate5 = wildcardClassItor1.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        boolean boolean7 = wildcardClassItor6.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor6);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor11 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor10.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor11);
        boolean boolean13 = wildcardClassItor11.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor14 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor15 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor14.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor15);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor17 = wildcardClassItor15.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor18 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor19 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor20 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor19.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor20);
        int int22 = wildcardClassItor20.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor23 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor20);
        wildcardClassItor18.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor23);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor25 = wildcardClassItor18.getListIterator();
        wildcardClassItor15.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor18);
        wildcardClassItor11.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor18);
        int int28 = wildcardClassItor18.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor29 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor30 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor29.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor30);
        int int32 = wildcardClassItor30.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor33 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor30);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate34 = wildcardClassItor33.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor35 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor33);
        wildcardClassItor18.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor33);
        wildcardClassItor9.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(wildcardPredicate5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(wildcardItor17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate34);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate4 = wildcardClassItor1.getPredicate();
        boolean boolean5 = wildcardClassItor1.hasPrevious();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate6 = wildcardClassItor1.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor1.getListIterator();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor8 = wildcardClassItor1.getListIterator();
        boolean boolean9 = wildcardClassItor1.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor11 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor12 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor11.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor12);
        int int14 = wildcardClassItor12.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor15 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor12);
        wildcardClassItor10.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor15);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate17 = wildcardClassItor10.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor18 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor19 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor18.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor19);
        boolean boolean21 = wildcardClassItor19.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor22 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor23 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor22.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor23);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor25 = wildcardClassItor23.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor26 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor27 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor28 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor27.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor28);
        int int30 = wildcardClassItor28.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor31 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor28);
        wildcardClassItor26.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor31);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor33 = wildcardClassItor26.getListIterator();
        wildcardClassItor23.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor26);
        wildcardClassItor19.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor26);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor36 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor26);
        int int37 = wildcardClassItor26.previousIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor38 = wildcardClassItor26.getListIterator();
        wildcardClassItor10.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor26);
        int int40 = wildcardClassItor26.nextIndex();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor26);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor42 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor43 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor42.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor43);
        int int45 = wildcardClassItor43.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor46 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor43);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor47 = wildcardClassItor46.getListIterator();
        int int48 = wildcardClassItor46.nextIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor49 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor50 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor49);
        int int51 = wildcardClassItor50.previousIndex();
        int int52 = wildcardClassItor50.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate53 = wildcardClassItor50.getPredicate();
        wildcardClassItor46.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor50);
        int int55 = wildcardClassItor46.previousIndex();
        int int56 = wildcardClassItor46.previousIndex();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor46);
        boolean boolean58 = wildcardClassItor1.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor59 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor60 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor59.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor60);
        int int62 = wildcardClassItor60.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate63 = wildcardClassItor60.getPredicate();
        boolean boolean64 = wildcardClassItor60.hasPrevious();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate65 = wildcardClassItor60.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor66 = wildcardClassItor60.getListIterator();
        int int67 = wildcardClassItor60.nextIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor68 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor69 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor70 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor69.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor70);
        int int72 = wildcardClassItor70.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor73 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor70);
        wildcardClassItor68.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor73);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor75 = wildcardClassItor68.getListIterator();
        int int76 = wildcardClassItor68.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor77 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor78 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor77.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor78);
        int int80 = wildcardClassItor78.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor81 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor78);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate82 = wildcardClassItor81.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor83 = wildcardClassItor81.getListIterator();
        wildcardClassItor68.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor81);
        int int85 = wildcardClassItor81.nextIndex();
        boolean boolean86 = wildcardClassItor81.hasPrevious();
        wildcardClassItor60.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor81);
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor60);
        int int89 = wildcardClassItor1.nextIndex();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardPredicate6);
        org.junit.Assert.assertNull(wildcardItor7);
        org.junit.Assert.assertNull(wildcardItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(wildcardItor25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(wildcardPredicate65);
        org.junit.Assert.assertNull(wildcardItor66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate82);
        org.junit.Assert.assertNotNull(wildcardItor83);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor0.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.Type> typeItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.Type>((java.util.ListIterator<java.lang.Class<?>>) wildcardItor7);
        int int9 = typeItor8.nextIndex();
        int int10 = typeItor8.previousIndex();
        boolean boolean11 = typeItor8.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor12 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor12.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor15 = wildcardClassItor13.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor16 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor17 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor18 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor17.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor18);
        int int20 = wildcardClassItor18.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor21 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor18);
        wildcardClassItor16.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor21);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor23 = wildcardClassItor16.getListIterator();
        wildcardClassItor13.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor16);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor25 = wildcardClassItor16.getListIterator();
        typeItor8.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor16);
        int int27 = wildcardClassItor16.nextIndex();
        int int28 = wildcardClassItor16.nextIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor29 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardItor15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor23);
        org.junit.Assert.assertNotNull(wildcardItor25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor0.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.Type> typeItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.Type>((java.util.ListIterator<java.lang.Class<?>>) wildcardItor7);
        int int9 = typeItor8.nextIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor11 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor12 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor11.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor12);
        int int14 = wildcardClassItor12.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor15 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor12);
        wildcardClassItor10.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor15);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor17 = wildcardClassItor10.getListIterator();
        int int18 = wildcardClassItor10.previousIndex();
        boolean boolean19 = wildcardClassItor10.hasNext();
        int int20 = wildcardClassItor10.nextIndex();
        typeItor8.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        int int22 = typeItor8.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate23 = typeItor8.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor24 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor25 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor26 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor25.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor26);
        int int28 = wildcardClassItor26.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor29 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor26);
        wildcardClassItor24.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor29);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor31 = wildcardClassItor24.getListIterator();
        int int32 = wildcardClassItor24.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor33 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor34 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor33.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor34);
        int int36 = wildcardClassItor34.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor37 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor34);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate38 = wildcardClassItor37.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor39 = wildcardClassItor37.getListIterator();
        wildcardClassItor24.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor37);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor41 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor37);
        int int42 = wildcardClassItor41.nextIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.Type> typeItor43 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.Type>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor41);
        typeItor8.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor41);
        boolean boolean45 = wildcardClassItor41.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass46 = wildcardClassItor41.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate38);
        org.junit.Assert.assertNotNull(wildcardItor39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor3 = wildcardClassItor1.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor6);
        int int8 = wildcardClassItor6.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor6);
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor9);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor11 = wildcardClassItor4.getListIterator();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor13 = wildcardClassItor1.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor14 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor15 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor16 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor15.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor16);
        int int18 = wildcardClassItor16.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor19 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor16);
        wildcardClassItor14.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor19);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor21 = wildcardClassItor14.getListIterator();
        int int22 = wildcardClassItor14.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor23 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor24 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor23.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor24);
        int int26 = wildcardClassItor24.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor27 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor24);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate28 = wildcardClassItor27.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor29 = wildcardClassItor27.getListIterator();
        wildcardClassItor14.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor27);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor31 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor27);
        int int32 = wildcardClassItor31.nextIndex();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor31);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor34 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor35 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor34.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor35);
        int int37 = wildcardClassItor35.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate38 = wildcardClassItor35.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor39 = wildcardClassItor35.getListIterator();
        boolean boolean40 = wildcardClassItor35.hasNext();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor41 = wildcardClassItor35.getListIterator();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor42 = wildcardClassItor35.getListIterator();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate43 = wildcardClassItor35.getPredicate();
        boolean boolean44 = wildcardClassItor35.hasPrevious();
        boolean boolean45 = wildcardClassItor35.hasPrevious();
        wildcardClassItor31.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor35);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor47 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor48 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor47.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor48);
        int int50 = wildcardClassItor48.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor51 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor48);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor52 = wildcardClassItor48.getListIterator();
        int int53 = wildcardClassItor48.previousIndex();
        int int54 = wildcardClassItor48.previousIndex();
        boolean boolean55 = wildcardClassItor48.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor56 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor57 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor56);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor58 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor56);
        wildcardClassItor48.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor56);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor60 = wildcardClassItor48.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor61 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor48);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor62 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor48);
        wildcardClassItor31.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor62);
        boolean boolean64 = wildcardClassItor31.hasNext();
        org.junit.Assert.assertNull(wildcardItor3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor11);
        org.junit.Assert.assertNotNull(wildcardItor13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate28);
        org.junit.Assert.assertNotNull(wildcardItor29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate38);
        org.junit.Assert.assertNull(wildcardItor39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(wildcardItor41);
        org.junit.Assert.assertNull(wildcardItor42);
        org.junit.Assert.assertNull(wildcardPredicate43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNull(wildcardItor52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(wildcardItor60);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        int int2 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate3 = wildcardClassItor1.getPredicate();
        int int4 = wildcardClassItor1.nextIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate5 = wildcardClassItor4.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor6 = wildcardClassItor4.getListIterator();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor4.getListIterator();
        boolean boolean8 = wildcardClassItor4.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor9.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        boolean boolean12 = wildcardClassItor10.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor14 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor13.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor14);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor16 = wildcardClassItor14.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor17 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor18 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor19 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor18.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor19);
        int int21 = wildcardClassItor19.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor22 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor19);
        wildcardClassItor17.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor22);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor24 = wildcardClassItor17.getListIterator();
        wildcardClassItor14.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor17);
        wildcardClassItor10.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor17);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor27 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor17);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate28 = wildcardClassItor27.getPredicate();
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor27);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor30 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor27);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor31 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor32 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor31.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor32);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor34 = wildcardClassItor32.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor35 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor36 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor37 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor36.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor37);
        int int39 = wildcardClassItor37.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor40 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor37);
        wildcardClassItor35.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor40);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor42 = wildcardClassItor35.getListIterator();
        wildcardClassItor32.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor35);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor44 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor35);
        boolean boolean45 = wildcardClassItor44.hasPrevious();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor46 = wildcardClassItor44.getListIterator();
        wildcardClassItor27.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor44);
        boolean boolean48 = wildcardClassItor44.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            wildcardClassItor44.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: FilterListIterator.remove() is not supported.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate5);
        org.junit.Assert.assertNotNull(wildcardItor6);
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardItor16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor24);
        org.junit.Assert.assertNull(wildcardPredicate28);
        org.junit.Assert.assertNull(wildcardItor34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardItor46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        boolean boolean3 = wildcardClassItor1.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor5.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor9.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        int int12 = wildcardClassItor10.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        wildcardClassItor8.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor15 = wildcardClassItor8.getListIterator();
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor18 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate19 = wildcardClassItor8.getPredicate();
        boolean boolean20 = wildcardClassItor8.hasNext();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor21 = wildcardClassItor8.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor22 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.GenericDeclaration>((java.util.ListIterator<java.lang.Class<?>>) wildcardItor21);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor23 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardItor21);
        int int24 = wildcardClassItor23.previousIndex();
        boolean boolean25 = wildcardClassItor23.hasNext();
        java.lang.Class<?> wildcardClass26 = wildcardClassItor23.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor15);
        org.junit.Assert.assertNull(wildcardPredicate19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardItor21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        boolean boolean7 = wildcardClassItor5.hasNext();
        int int8 = wildcardClassItor5.previousIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = wildcardClassItor5.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        boolean boolean3 = wildcardClassItor1.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor5.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor9.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        int int12 = wildcardClassItor10.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        wildcardClassItor8.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor15 = wildcardClassItor8.getListIterator();
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor18 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate19 = wildcardClassItor18.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor20 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = wildcardClassItor18.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor15);
        org.junit.Assert.assertNull(wildcardPredicate19);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        boolean boolean5 = wildcardClassItor4.hasNext();
        int int6 = wildcardClassItor4.previousIndex();
        int int7 = wildcardClassItor4.previousIndex();
        boolean boolean8 = wildcardClassItor4.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.io.Serializable> serializableItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.io.Serializable>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        int int10 = serializableItor9.previousIndex();
        int int11 = serializableItor9.nextIndex();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        boolean boolean3 = wildcardClassItor1.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor5.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor9.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        int int12 = wildcardClassItor10.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        wildcardClassItor8.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor15 = wildcardClassItor8.getListIterator();
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor18 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        int int19 = wildcardClassItor18.nextIndex();
        boolean boolean20 = wildcardClassItor18.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor21 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor22 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor21.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor22);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor24 = wildcardClassItor22.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor25 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor26 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor27 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor26.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor27);
        int int29 = wildcardClassItor27.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor30 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor27);
        wildcardClassItor25.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor30);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor32 = wildcardClassItor25.getListIterator();
        wildcardClassItor22.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor25);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor34 = wildcardClassItor25.getListIterator();
        wildcardClassItor18.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor25);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor36 = wildcardClassItor25.getListIterator();
        int int37 = wildcardClassItor25.previousIndex();
        boolean boolean38 = wildcardClassItor25.hasPrevious();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(wildcardItor24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor32);
        org.junit.Assert.assertNotNull(wildcardItor34);
        org.junit.Assert.assertNotNull(wildcardItor36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate7 = wildcardClassItor0.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor8.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor9);
        boolean boolean11 = wildcardClassItor9.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor12 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor12.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor15 = wildcardClassItor13.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor16 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor17 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor18 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor17.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor18);
        int int20 = wildcardClassItor18.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor21 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor18);
        wildcardClassItor16.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor21);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor23 = wildcardClassItor16.getListIterator();
        wildcardClassItor13.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor16);
        wildcardClassItor9.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor16);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor26 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor16);
        int int27 = wildcardClassItor16.previousIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor28 = wildcardClassItor16.getListIterator();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass30 = wildcardClassItor16.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardItor15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor28);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate6 = wildcardClassItor5.getPredicate();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor9.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        int int12 = wildcardClassItor10.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        boolean boolean14 = wildcardClassItor13.hasNext();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate16 = wildcardClassItor13.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor17 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor18 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor17.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor18);
        boolean boolean20 = wildcardClassItor18.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor21 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor22 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor21.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor22);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor24 = wildcardClassItor22.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor25 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor26 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor27 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor26.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor27);
        int int29 = wildcardClassItor27.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor30 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor27);
        wildcardClassItor25.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor30);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor32 = wildcardClassItor25.getListIterator();
        wildcardClassItor22.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor25);
        wildcardClassItor18.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor25);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor35 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor25);
        int int36 = wildcardClassItor35.nextIndex();
        boolean boolean37 = wildcardClassItor35.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor38 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor39 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor38.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor39);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor41 = wildcardClassItor39.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor42 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor43 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor44 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor43.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor44);
        int int46 = wildcardClassItor44.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor47 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor44);
        wildcardClassItor42.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor47);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor49 = wildcardClassItor42.getListIterator();
        wildcardClassItor39.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor42);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor51 = wildcardClassItor42.getListIterator();
        wildcardClassItor35.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor42);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor53 = wildcardClassItor42.getListIterator();
        int int54 = wildcardClassItor42.nextIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor55 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor42);
        wildcardClassItor13.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor55);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardPredicate16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(wildcardItor24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(wildcardItor41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor49);
        org.junit.Assert.assertNotNull(wildcardItor51);
        org.junit.Assert.assertNotNull(wildcardItor53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate4 = wildcardClassItor1.getPredicate();
        boolean boolean5 = wildcardClassItor1.hasPrevious();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor6 = wildcardClassItor1.getListIterator();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor1.getListIterator();
        boolean boolean8 = wildcardClassItor1.hasPrevious();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor9 = wildcardClassItor1.getListIterator();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor10 = wildcardClassItor1.getListIterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardItor6);
        org.junit.Assert.assertNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardItor9);
        org.junit.Assert.assertNull(wildcardItor10);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor7 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor8.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor9);
        int int11 = wildcardClassItor9.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor12 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor9);
        wildcardClassItor7.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor12);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor14 = wildcardClassItor7.getListIterator();
        boolean boolean15 = wildcardClassItor7.hasPrevious();
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor7);
        boolean boolean17 = wildcardClassItor5.hasNext();
        boolean boolean18 = wildcardClassItor5.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor19 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate20 = wildcardClassItor5.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor21 = wildcardClassItor5.getListIterator();
        boolean boolean22 = wildcardClassItor5.hasNext();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor23 = wildcardClassItor5.getListIterator();
        boolean boolean24 = wildcardClassItor5.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor25 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor26 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor25.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor26);
        int int28 = wildcardClassItor26.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate29 = wildcardClassItor26.getPredicate();
        boolean boolean30 = wildcardClassItor26.hasPrevious();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate31 = wildcardClassItor26.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor32 = wildcardClassItor26.getListIterator();
        int int33 = wildcardClassItor26.nextIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor34 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor35 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor36 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor35.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor36);
        int int38 = wildcardClassItor36.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor39 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor36);
        wildcardClassItor34.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor39);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor41 = wildcardClassItor34.getListIterator();
        int int42 = wildcardClassItor34.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor43 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor44 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor43.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor44);
        int int46 = wildcardClassItor44.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor47 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor44);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate48 = wildcardClassItor47.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor49 = wildcardClassItor47.getListIterator();
        wildcardClassItor34.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor47);
        int int51 = wildcardClassItor47.nextIndex();
        boolean boolean52 = wildcardClassItor47.hasPrevious();
        wildcardClassItor26.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor47);
        int int54 = wildcardClassItor26.nextIndex();
        boolean boolean55 = wildcardClassItor26.hasPrevious();
        boolean boolean56 = wildcardClassItor26.hasNext();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate57 = wildcardClassItor26.getPredicate();
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor26);
        boolean boolean59 = wildcardClassItor26.hasPrevious();
        boolean boolean60 = wildcardClassItor26.hasNext();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(wildcardPredicate20);
        org.junit.Assert.assertNotNull(wildcardItor21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardItor23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(wildcardPredicate31);
        org.junit.Assert.assertNull(wildcardItor32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate48);
        org.junit.Assert.assertNotNull(wildcardItor49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(wildcardPredicate57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        int int4 = wildcardClassItor1.nextIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate6 = wildcardClassItor1.getPredicate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(wildcardPredicate6);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        int int1 = wildcardClassItor0.nextIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor2 = wildcardClassItor0.getListIterator();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate3 = wildcardClassItor0.getPredicate();
        // The following exception was thrown during execution in test generation
        try {
            wildcardClassItor0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: FilterListIterator.remove() is not supported.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(wildcardItor2);
        org.junit.Assert.assertNull(wildcardPredicate3);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor7 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor8.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor9);
        int int11 = wildcardClassItor9.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor12 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor9);
        wildcardClassItor7.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor12);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor14 = wildcardClassItor7.getListIterator();
        boolean boolean15 = wildcardClassItor7.hasPrevious();
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor7);
        boolean boolean17 = wildcardClassItor5.hasNext();
        boolean boolean18 = wildcardClassItor5.hasPrevious();
        boolean boolean19 = wildcardClassItor5.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor20 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor21 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor22 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor21.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor22);
        int int24 = wildcardClassItor22.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor25 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor22);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate26 = wildcardClassItor25.getPredicate();
        wildcardClassItor20.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor25);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor28 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor20);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor29 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor30 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor29.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor30);
        int int32 = wildcardClassItor30.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor33 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor30);
        boolean boolean34 = wildcardClassItor33.hasNext();
        wildcardClassItor20.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor33);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate36 = wildcardClassItor33.getPredicate();
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor33);
        int int38 = wildcardClassItor33.nextIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(wildcardPredicate36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate5 = wildcardClassItor4.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        int int7 = wildcardClassItor4.nextIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor8 = wildcardClassItor4.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor9);
        int int11 = wildcardClassItor10.previousIndex();
        int int12 = wildcardClassItor10.nextIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate13 = wildcardClassItor10.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor14 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        boolean boolean15 = wildcardClassItor14.hasNext();
        int int16 = wildcardClassItor14.nextIndex();
        boolean boolean17 = wildcardClassItor14.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor18 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor19 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor18.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor19);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor21 = wildcardClassItor19.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor22 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor23 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor24 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor23.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor24);
        int int26 = wildcardClassItor24.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor27 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor24);
        wildcardClassItor22.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor27);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor29 = wildcardClassItor22.getListIterator();
        wildcardClassItor19.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor22);
        boolean boolean31 = wildcardClassItor22.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor32 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor22);
        int int33 = wildcardClassItor32.previousIndex();
        wildcardClassItor14.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor32);
        int int35 = wildcardClassItor14.nextIndex();
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardItor8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(wildcardPredicate13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(wildcardItor21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate4 = wildcardClassItor1.getPredicate();
        boolean boolean5 = wildcardClassItor1.hasPrevious();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor6 = wildcardClassItor1.getListIterator();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor1.getListIterator();
        int int8 = wildcardClassItor1.nextIndex();
        boolean boolean9 = wildcardClassItor1.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor11 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        int int12 = wildcardClassItor11.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate13 = wildcardClassItor11.getPredicate();
        int int14 = wildcardClassItor11.previousIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor15 = wildcardClassItor11.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor16 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor17 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor16.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor17);
        boolean boolean19 = wildcardClassItor17.hasPrevious();
        int int20 = wildcardClassItor17.nextIndex();
        int int21 = wildcardClassItor17.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor22 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor17);
        wildcardClassItor11.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor17);
        int int24 = wildcardClassItor11.nextIndex();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor11);
        int int26 = wildcardClassItor11.previousIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass27 = wildcardClassItor11.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardItor6);
        org.junit.Assert.assertNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        boolean boolean3 = wildcardClassItor1.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor5.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor9.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        int int12 = wildcardClassItor10.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        wildcardClassItor8.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor15 = wildcardClassItor8.getListIterator();
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor18 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate19 = wildcardClassItor8.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor20 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor21 = wildcardClassItor8.getListIterator();
        boolean boolean22 = wildcardClassItor8.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = wildcardClassItor8.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor15);
        org.junit.Assert.assertNull(wildcardPredicate19);
        org.junit.Assert.assertNotNull(wildcardItor21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        int int2 = wildcardClassItor1.previousIndex();
        int int3 = wildcardClassItor1.nextIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate4 = wildcardClassItor1.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor6 = wildcardClassItor5.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor7 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        int int8 = wildcardClassItor7.previousIndex();
        boolean boolean9 = wildcardClassItor7.hasPrevious();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(wildcardPredicate4);
        org.junit.Assert.assertNotNull(wildcardItor6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        boolean boolean3 = wildcardClassItor1.hasPrevious();
        boolean boolean4 = wildcardClassItor1.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            wildcardClassItor1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: FilterListIterator.remove() is not supported.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor5 = wildcardClassItor1.getListIterator();
        java.util.ListIterator<java.lang.Class<?>> wildcardClassItor6 = null;
        wildcardClassItor1.setListIterator(wildcardClassItor6);
        boolean boolean8 = wildcardClassItor1.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = wildcardClassItor1.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(wildcardItor5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        boolean boolean5 = wildcardClassItor4.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor7 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor7.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        int int10 = wildcardClassItor8.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor11 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        boolean boolean12 = wildcardClassItor11.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.AnnotatedElement>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor11);
        int int14 = wildcardClassItor11.previousIndex();
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor11);
        int int16 = wildcardClassItor4.nextIndex();
        // The following exception was thrown during execution in test generation
        try {
            wildcardClassItor4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: FilterListIterator.remove() is not supported.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        boolean boolean3 = wildcardClassItor1.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor5.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor9.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        int int12 = wildcardClassItor10.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        wildcardClassItor8.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor15 = wildcardClassItor8.getListIterator();
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor18 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        int int19 = wildcardClassItor8.previousIndex();
        int int20 = wildcardClassItor8.nextIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor21 = wildcardClassItor8.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor22 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        boolean boolean23 = wildcardClassItor8.hasNext();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor24 = wildcardClassItor8.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor25 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardItor24);
        boolean boolean26 = wildcardClassItor25.hasPrevious();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardItor21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardItor24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        boolean boolean3 = wildcardClassItor1.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor5.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor9.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        int int12 = wildcardClassItor10.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        wildcardClassItor8.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor15 = wildcardClassItor8.getListIterator();
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor18 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        int int19 = wildcardClassItor8.previousIndex();
        int int20 = wildcardClassItor8.nextIndex();
        int int21 = wildcardClassItor8.nextIndex();
        int int22 = wildcardClassItor8.nextIndex();
        int int23 = wildcardClassItor8.nextIndex();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        int int2 = wildcardClassItor1.previousIndex();
        int int3 = wildcardClassItor1.previousIndex();
        boolean boolean4 = wildcardClassItor1.hasNext();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate5 = wildcardClassItor1.getPredicate();
        int int6 = wildcardClassItor1.nextIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate7 = wildcardClassItor1.getPredicate();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardPredicate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(wildcardPredicate7);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor3 = wildcardClassItor1.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor6);
        int int8 = wildcardClassItor6.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor6);
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor9);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor11 = wildcardClassItor4.getListIterator();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        boolean boolean13 = wildcardClassItor4.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor14 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor15 = wildcardClassItor4.getListIterator();
        java.lang.Class<?> wildcardClass16 = wildcardClassItor4.getClass();
        org.junit.Assert.assertNull(wildcardItor3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardItor15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Object> objItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Object>();
        int int1 = objItor0.nextIndex();
        boolean boolean2 = objItor0.hasPrevious();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate3 = objItor0.getPredicate();
        int int4 = objItor0.previousIndex();
        // The following exception was thrown during execution in test generation
        try {
            objItor0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: FilterListIterator.remove() is not supported.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardPredicate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate5 = wildcardClassItor4.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        int int7 = wildcardClassItor4.nextIndex();
        int int8 = wildcardClassItor4.previousIndex();
        int int9 = wildcardClassItor4.nextIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate11 = wildcardClassItor10.getPredicate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(wildcardPredicate11);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate4 = wildcardClassItor1.getPredicate();
        boolean boolean5 = wildcardClassItor1.hasPrevious();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate6 = wildcardClassItor1.getPredicate();
        int int7 = wildcardClassItor1.previousIndex();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardPredicate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor5 = wildcardClassItor1.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor7 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor6);
        int int8 = wildcardClassItor7.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate9 = wildcardClassItor7.getPredicate();
        int int10 = wildcardClassItor7.previousIndex();
        int int11 = wildcardClassItor7.previousIndex();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor7);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor14 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor15 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        boolean boolean16 = wildcardClassItor15.hasNext();
        int int17 = wildcardClassItor15.nextIndex();
        wildcardClassItor14.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = wildcardClassItor14.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(wildcardItor5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate1 = wildcardClassItor0.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.AnnotatedElement>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        int int3 = annotatedElementItor2.previousIndex();
        int int4 = annotatedElementItor2.nextIndex();
        org.junit.Assert.assertNull(wildcardPredicate1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor5 = wildcardClassItor1.getListIterator();
        int int6 = wildcardClassItor1.previousIndex();
        int int7 = wildcardClassItor1.previousIndex();
        boolean boolean8 = wildcardClassItor1.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor9);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor11 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor9);
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor9);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor13 = wildcardClassItor1.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor14 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor15 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor14);
        int int16 = wildcardClassItor14.previousIndex();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(wildcardItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardItor13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate4 = wildcardClassItor1.getPredicate();
        boolean boolean5 = wildcardClassItor1.hasPrevious();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor6 = wildcardClassItor1.getListIterator();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate7 = wildcardClassItor1.getPredicate();
        boolean boolean8 = wildcardClassItor1.hasPrevious();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardItor6);
        org.junit.Assert.assertNull(wildcardPredicate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor0.getListIterator();
        int int8 = wildcardClassItor0.previousIndex();
        boolean boolean9 = wildcardClassItor0.hasNext();
        int int10 = wildcardClassItor0.nextIndex();
        boolean boolean11 = wildcardClassItor0.hasPrevious();
        int int12 = wildcardClassItor0.previousIndex();
        boolean boolean13 = wildcardClassItor0.hasPrevious();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor0.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.Type> typeItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.Type>((java.util.ListIterator<java.lang.Class<?>>) wildcardItor7);
        int int9 = typeItor8.nextIndex();
        int int10 = typeItor8.previousIndex();
        boolean boolean11 = typeItor8.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor12 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor12.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor15 = wildcardClassItor13.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor16 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor17 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor18 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor17.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor18);
        int int20 = wildcardClassItor18.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor21 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor18);
        wildcardClassItor16.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor21);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor23 = wildcardClassItor16.getListIterator();
        wildcardClassItor13.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor16);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor25 = wildcardClassItor16.getListIterator();
        typeItor8.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor16);
        int int27 = wildcardClassItor16.nextIndex();
        int int28 = wildcardClassItor16.nextIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate29 = wildcardClassItor16.getPredicate();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardItor15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor23);
        org.junit.Assert.assertNotNull(wildcardItor25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(wildcardPredicate29);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor3 = wildcardClassItor1.getListIterator();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor4 = wildcardClassItor1.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor6);
        boolean boolean8 = wildcardClassItor6.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor9.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor12 = wildcardClassItor10.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor14 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor15 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor14.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor15);
        int int17 = wildcardClassItor15.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor18 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor15);
        wildcardClassItor13.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor18);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor20 = wildcardClassItor13.getListIterator();
        wildcardClassItor10.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        wildcardClassItor6.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor23 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        int int24 = wildcardClassItor13.previousIndex();
        int int25 = wildcardClassItor13.nextIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor26 = wildcardClassItor13.getListIterator();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor28 = wildcardClassItor13.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor29 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor30 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor29);
        int int31 = wildcardClassItor30.previousIndex();
        int int32 = wildcardClassItor30.nextIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate33 = wildcardClassItor30.getPredicate();
        boolean boolean34 = wildcardClassItor30.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor35 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor30);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor36 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor35);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor37 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor36);
        wildcardClassItor13.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor37);
        boolean boolean39 = wildcardClassItor13.hasPrevious();
        int int40 = wildcardClassItor13.nextIndex();
        org.junit.Assert.assertNull(wildcardItor3);
        org.junit.Assert.assertNull(wildcardItor4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardItor12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardItor26);
        org.junit.Assert.assertNotNull(wildcardItor28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(wildcardPredicate33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        int int2 = wildcardClassItor1.previousIndex();
        int int3 = wildcardClassItor1.nextIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate4 = wildcardClassItor1.getPredicate();
        boolean boolean5 = wildcardClassItor1.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        boolean boolean7 = wildcardClassItor1.hasNext();
        int int8 = wildcardClassItor1.previousIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(wildcardPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor3 = wildcardClassItor1.getListIterator();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor4 = wildcardClassItor1.getListIterator();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate5 = wildcardClassItor1.getPredicate();
        int int6 = wildcardClassItor1.nextIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor7 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor7.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        int int10 = wildcardClassItor8.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate11 = wildcardClassItor8.getPredicate();
        boolean boolean12 = wildcardClassItor8.hasPrevious();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor13 = wildcardClassItor8.getListIterator();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardItor13);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor15 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.GenericDeclaration>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor16 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor17 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor16.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor17);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor19 = wildcardClassItor17.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor20 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor21 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor22 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor21.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor22);
        int int24 = wildcardClassItor22.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor25 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor22);
        wildcardClassItor20.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor25);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor27 = wildcardClassItor20.getListIterator();
        wildcardClassItor17.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor20);
        boolean boolean29 = wildcardClassItor20.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor30 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor20);
        boolean boolean31 = wildcardClassItor30.hasPrevious();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor32 = wildcardClassItor30.getListIterator();
        int int33 = wildcardClassItor30.previousIndex();
        genericDeclarationItor15.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor30);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor35 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor36 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor35.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor36);
        int int38 = wildcardClassItor36.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor39 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor36);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor40 = wildcardClassItor36.getListIterator();
        int int41 = wildcardClassItor36.previousIndex();
        int int42 = wildcardClassItor36.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate43 = wildcardClassItor36.getPredicate();
        wildcardClassItor30.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor36);
        boolean boolean45 = wildcardClassItor36.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass46 = wildcardClassItor36.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertNull(wildcardItor3);
        org.junit.Assert.assertNull(wildcardItor4);
        org.junit.Assert.assertNull(wildcardPredicate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardItor13);
        org.junit.Assert.assertNull(wildcardItor19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardItor32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(wildcardItor40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor5 = wildcardClassItor4.getListIterator();
        int int6 = wildcardClassItor4.nextIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor4.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardItor7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardItor7);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Object> objItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Object>();
        int int1 = objItor0.nextIndex();
        boolean boolean2 = objItor0.hasPrevious();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate3 = objItor0.getPredicate();
        int int4 = objItor0.previousIndex();
        boolean boolean5 = objItor0.hasNext();
        int int6 = objItor0.nextIndex();
        // The following exception was thrown during execution in test generation
        try {
            objItor0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: FilterListIterator.remove() is not supported.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardPredicate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor3 = wildcardClassItor0.getListIterator();
        boolean boolean4 = wildcardClassItor0.hasPrevious();
        int int5 = wildcardClassItor0.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor7 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor6.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor7);
        int int9 = wildcardClassItor7.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor7);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate11 = wildcardClassItor10.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor12 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        int int13 = wildcardClassItor10.nextIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor14 = wildcardClassItor10.getListIterator();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor16 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        org.junit.Assert.assertNotNull(wildcardItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardItor14);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor0.getListIterator();
        int int8 = wildcardClassItor0.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor9.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        int int12 = wildcardClassItor10.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate14 = wildcardClassItor13.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor15 = wildcardClassItor13.getListIterator();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor17 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor18 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor19 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor18.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor19);
        int int21 = wildcardClassItor19.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor22 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor19);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate23 = wildcardClassItor22.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor24 = wildcardClassItor22.getListIterator();
        int int25 = wildcardClassItor22.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor26 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor22);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor27 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor28 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor27.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor28);
        boolean boolean30 = wildcardClassItor28.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor31 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor32 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor31.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor32);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor34 = wildcardClassItor32.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor35 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor36 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor37 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor36.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor37);
        int int39 = wildcardClassItor37.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor40 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor37);
        wildcardClassItor35.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor40);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor42 = wildcardClassItor35.getListIterator();
        wildcardClassItor32.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor35);
        wildcardClassItor28.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor35);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor45 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor35);
        int int46 = wildcardClassItor45.nextIndex();
        boolean boolean47 = wildcardClassItor45.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor48 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor49 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor48.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor49);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor51 = wildcardClassItor49.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor52 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor53 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor54 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor53.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor54);
        int int56 = wildcardClassItor54.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor57 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor54);
        wildcardClassItor52.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor57);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor59 = wildcardClassItor52.getListIterator();
        wildcardClassItor49.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor52);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor61 = wildcardClassItor52.getListIterator();
        wildcardClassItor45.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor52);
        wildcardClassItor22.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor52);
        wildcardClassItor13.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor22);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor65 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor66 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor65.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor66);
        boolean boolean68 = wildcardClassItor66.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor69 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor70 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor69.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor70);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor72 = wildcardClassItor70.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor73 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor74 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor75 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor74.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor75);
        int int77 = wildcardClassItor75.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor78 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor75);
        wildcardClassItor73.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor78);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor80 = wildcardClassItor73.getListIterator();
        wildcardClassItor70.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor73);
        wildcardClassItor66.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor73);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor83 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor73);
        int int84 = wildcardClassItor73.previousIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor85 = wildcardClassItor73.getListIterator();
        int int86 = wildcardClassItor73.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor87 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor73);
        wildcardClassItor22.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor73);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass89 = wildcardClassItor73.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate14);
        org.junit.Assert.assertNotNull(wildcardItor15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate23);
        org.junit.Assert.assertNotNull(wildcardItor24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(wildcardItor34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(wildcardItor51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor59);
        org.junit.Assert.assertNotNull(wildcardItor61);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(wildcardItor72);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor80);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        boolean boolean3 = wildcardClassItor1.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor5.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor9.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        int int12 = wildcardClassItor10.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        wildcardClassItor8.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor15 = wildcardClassItor8.getListIterator();
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor18 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        boolean boolean19 = wildcardClassItor18.hasPrevious();
        boolean boolean20 = wildcardClassItor18.hasPrevious();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate21 = wildcardClassItor18.getPredicate();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(wildcardPredicate21);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.Type> typeItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.Type>();
        boolean boolean1 = typeItor0.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor3 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor3.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        int int6 = wildcardClassItor4.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor7 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate8 = wildcardClassItor7.getPredicate();
        wildcardClassItor2.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor7);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor11 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor12 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor11.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor12);
        int int14 = wildcardClassItor12.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor15 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor12);
        boolean boolean16 = wildcardClassItor15.hasNext();
        wildcardClassItor2.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor15);
        typeItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor15);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor19 = wildcardClassItor15.getListIterator();
        int int20 = wildcardClassItor15.previousIndex();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardItor19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor0.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.Type> typeItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.Type>((java.util.ListIterator<java.lang.Class<?>>) wildcardItor7);
        int int9 = typeItor8.nextIndex();
        int int10 = typeItor8.previousIndex();
        boolean boolean11 = typeItor8.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor12 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor12.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor15 = wildcardClassItor13.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor16 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor17 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor18 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor17.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor18);
        int int20 = wildcardClassItor18.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor21 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor18);
        wildcardClassItor16.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor21);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor23 = wildcardClassItor16.getListIterator();
        wildcardClassItor13.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor16);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor25 = wildcardClassItor16.getListIterator();
        typeItor8.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor16);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor27 = wildcardClassItor16.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor28 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor29 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor30 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor29.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor30);
        int int32 = wildcardClassItor30.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor33 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor30);
        wildcardClassItor28.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor33);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor35 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor36 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor37 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor36.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor37);
        int int39 = wildcardClassItor37.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor40 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor37);
        wildcardClassItor35.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor40);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor42 = wildcardClassItor35.getListIterator();
        boolean boolean43 = wildcardClassItor35.hasPrevious();
        wildcardClassItor33.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor35);
        int int45 = wildcardClassItor35.nextIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor46 = wildcardClassItor35.getListIterator();
        wildcardClassItor16.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor35);
        int int48 = wildcardClassItor35.nextIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardItor15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor23);
        org.junit.Assert.assertNotNull(wildcardItor25);
        org.junit.Assert.assertNotNull(wildcardItor27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(wildcardItor46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor5 = wildcardClassItor1.getListIterator();
        int int6 = wildcardClassItor1.previousIndex();
        int int7 = wildcardClassItor1.previousIndex();
        boolean boolean8 = wildcardClassItor1.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor9);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor11 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor9);
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor9);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor13 = wildcardClassItor1.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor14 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int15 = wildcardClassItor14.nextIndex();
        // The following exception was thrown during execution in test generation
        try {
            wildcardClassItor14.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: FilterListIterator.remove() is not supported.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(wildcardItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardItor13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor0.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.Type> typeItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.Type>((java.util.ListIterator<java.lang.Class<?>>) wildcardItor7);
        int int9 = typeItor8.nextIndex();
        int int10 = typeItor8.previousIndex();
        boolean boolean11 = typeItor8.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor12 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor12.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor15 = wildcardClassItor13.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor16 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor17 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor18 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor17.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor18);
        int int20 = wildcardClassItor18.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor21 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor18);
        wildcardClassItor16.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor21);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor23 = wildcardClassItor16.getListIterator();
        wildcardClassItor13.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor16);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor25 = wildcardClassItor16.getListIterator();
        typeItor8.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor16);
        int int27 = wildcardClassItor16.nextIndex();
        int int28 = wildcardClassItor16.nextIndex();
        java.lang.Class<?> wildcardClass29 = wildcardClassItor16.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardItor15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor23);
        org.junit.Assert.assertNotNull(wildcardItor25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor3 = wildcardClassItor1.getListIterator();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor4 = wildcardClassItor1.getListIterator();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate5 = wildcardClassItor1.getPredicate();
        int int6 = wildcardClassItor1.nextIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor7 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor7.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        int int10 = wildcardClassItor8.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate11 = wildcardClassItor8.getPredicate();
        boolean boolean12 = wildcardClassItor8.hasPrevious();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor13 = wildcardClassItor8.getListIterator();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardItor13);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor15 = wildcardClassItor1.getListIterator();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor16 = wildcardClassItor1.getListIterator();
        org.junit.Assert.assertNull(wildcardItor3);
        org.junit.Assert.assertNull(wildcardItor4);
        org.junit.Assert.assertNull(wildcardPredicate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardItor13);
        org.junit.Assert.assertNull(wildcardItor15);
        org.junit.Assert.assertNull(wildcardItor16);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        boolean boolean2 = wildcardClassItor0.hasNext();
        boolean boolean3 = wildcardClassItor0.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.GenericDeclaration>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        int int5 = genericDeclarationItor4.previousIndex();
        int int6 = genericDeclarationItor4.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate7 = genericDeclarationItor4.getPredicate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate7);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor0.getListIterator();
        int int8 = wildcardClassItor0.previousIndex();
        boolean boolean9 = wildcardClassItor0.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor11 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor10.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor11);
        int int13 = wildcardClassItor11.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate14 = wildcardClassItor11.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor15 = wildcardClassItor11.getListIterator();
        boolean boolean16 = wildcardClassItor11.hasNext();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor17 = wildcardClassItor11.getListIterator();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate18 = wildcardClassItor11.getPredicate();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor11);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor20 = wildcardClassItor0.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.Type> typeItor21 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.Type>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        boolean boolean22 = wildcardClassItor0.hasPrevious();
        java.util.ListIterator<java.lang.Class<?>> wildcardClassItor23 = null;
        wildcardClassItor0.setListIterator(wildcardClassItor23);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate14);
        org.junit.Assert.assertNull(wildcardItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(wildcardItor17);
        org.junit.Assert.assertNull(wildcardPredicate18);
        org.junit.Assert.assertNotNull(wildcardItor20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        int int2 = wildcardClassItor1.previousIndex();
        int int3 = wildcardClassItor1.nextIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate4 = wildcardClassItor1.getPredicate();
        boolean boolean5 = wildcardClassItor1.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate7 = wildcardClassItor6.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor6);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor9 = wildcardClassItor8.getListIterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(wildcardPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardPredicate7);
        org.junit.Assert.assertNotNull(wildcardItor9);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor0.getListIterator();
        int int8 = wildcardClassItor0.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate9 = wildcardClassItor0.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor11 = wildcardClassItor10.getListIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = wildcardClassItor10.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate9);
        org.junit.Assert.assertNotNull(wildcardItor11);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        int int2 = wildcardClassItor1.previousIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor3 = wildcardClassItor1.getListIterator();
        int int4 = wildcardClassItor1.nextIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        int int7 = wildcardClassItor6.previousIndex();
        int int8 = wildcardClassItor6.nextIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor9 = wildcardClassItor6.getListIterator();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor10 = wildcardClassItor6.getListIterator();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor6);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor12 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor14 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor15 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor14.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor15);
        int int17 = wildcardClassItor15.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor18 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor15);
        wildcardClassItor13.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor18);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor20 = wildcardClassItor13.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.Type> typeItor21 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.Type>((java.util.ListIterator<java.lang.Class<?>>) wildcardItor20);
        int int22 = typeItor21.nextIndex();
        int int23 = typeItor21.previousIndex();
        boolean boolean24 = typeItor21.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor25 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor26 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor25.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor26);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor28 = wildcardClassItor26.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor29 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor30 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor31 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor30.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor31);
        int int33 = wildcardClassItor31.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor34 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor31);
        wildcardClassItor29.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor34);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor36 = wildcardClassItor29.getListIterator();
        wildcardClassItor26.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor29);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor38 = wildcardClassItor29.getListIterator();
        typeItor21.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor29);
        wildcardClassItor12.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor29);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor41 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor42 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor41.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor42);
        int int44 = wildcardClassItor42.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate45 = wildcardClassItor42.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor46 = wildcardClassItor42.getListIterator();
        boolean boolean47 = wildcardClassItor42.hasNext();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor48 = wildcardClassItor42.getListIterator();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor49 = wildcardClassItor42.getListIterator();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate50 = wildcardClassItor42.getPredicate();
        boolean boolean51 = wildcardClassItor42.hasPrevious();
        wildcardClassItor29.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor42);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor53 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor42);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardItor9);
        org.junit.Assert.assertNotNull(wildcardItor10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(wildcardItor28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor36);
        org.junit.Assert.assertNotNull(wildcardItor38);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate45);
        org.junit.Assert.assertNull(wildcardItor46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(wildcardItor48);
        org.junit.Assert.assertNull(wildcardItor49);
        org.junit.Assert.assertNull(wildcardPredicate50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate4 = wildcardClassItor1.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        int int7 = wildcardClassItor5.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        int int10 = wildcardClassItor1.nextIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Object> objItor11 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Object>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate12 = objItor11.getPredicate();
        int int13 = objItor11.nextIndex();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(wildcardPredicate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor5.getListIterator();
        boolean boolean8 = wildcardClassItor5.hasPrevious();
        boolean boolean9 = wildcardClassItor5.hasPrevious();
        boolean boolean10 = wildcardClassItor5.hasNext();
        int int11 = wildcardClassItor5.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor12 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.GenericDeclaration>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        int int1 = wildcardClassItor0.nextIndex();
        boolean boolean2 = wildcardClassItor0.hasPrevious();
        boolean boolean3 = wildcardClassItor0.hasNext();
        boolean boolean4 = wildcardClassItor0.hasNext();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor5 = wildcardClassItor0.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor7 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor6.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor7);
        int int9 = wildcardClassItor7.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor7);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate11 = wildcardClassItor10.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor12 = wildcardClassItor10.getListIterator();
        int int13 = wildcardClassItor10.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor14 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        int int15 = wildcardClassItor10.previousIndex();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor17 = wildcardClassItor0.getListIterator();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardItor5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate11);
        org.junit.Assert.assertNotNull(wildcardItor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor17);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        boolean boolean3 = wildcardClassItor1.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor5.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor9.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        int int12 = wildcardClassItor10.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        wildcardClassItor8.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor15 = wildcardClassItor8.getListIterator();
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor18 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate19 = wildcardClassItor8.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor20 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        int int21 = wildcardClassItor20.nextIndex();
        wildcardClassItor8.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor20);
        int int23 = wildcardClassItor8.nextIndex();
        int int24 = wildcardClassItor8.previousIndex();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor15);
        org.junit.Assert.assertNull(wildcardPredicate19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Comparable<java.lang.String>> strComparableItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableItor0.nextIndex();
        int int2 = strComparableItor0.nextIndex();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor3 = wildcardClassItor1.getListIterator();
        boolean boolean4 = wildcardClassItor1.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor7 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor6.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor7);
        boolean boolean9 = wildcardClassItor7.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor11 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor10.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor11);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor13 = wildcardClassItor11.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor14 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor15 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor16 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor15.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor16);
        int int18 = wildcardClassItor16.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor19 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor16);
        wildcardClassItor14.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor19);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor21 = wildcardClassItor14.getListIterator();
        wildcardClassItor11.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor14);
        wildcardClassItor7.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor14);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor24 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor14);
        int int25 = wildcardClassItor24.nextIndex();
        boolean boolean26 = wildcardClassItor24.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor27 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor28 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor27.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor28);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor30 = wildcardClassItor28.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor31 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor32 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor33 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor32.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor33);
        int int35 = wildcardClassItor33.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor36 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor33);
        wildcardClassItor31.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor36);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor38 = wildcardClassItor31.getListIterator();
        wildcardClassItor28.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor31);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor40 = wildcardClassItor31.getListIterator();
        wildcardClassItor24.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor31);
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor31);
        org.junit.Assert.assertNull(wildcardItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardItor13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(wildcardItor30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor38);
        org.junit.Assert.assertNotNull(wildcardItor40);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor0.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.Type> typeItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.Type>((java.util.ListIterator<java.lang.Class<?>>) wildcardItor7);
        int int9 = typeItor8.nextIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor11 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor12 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor11.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor12);
        int int14 = wildcardClassItor12.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor15 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor12);
        wildcardClassItor10.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor15);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor17 = wildcardClassItor10.getListIterator();
        int int18 = wildcardClassItor10.previousIndex();
        boolean boolean19 = wildcardClassItor10.hasNext();
        int int20 = wildcardClassItor10.nextIndex();
        typeItor8.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        int int22 = typeItor8.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate23 = typeItor8.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor24 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor25 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor26 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor25.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor26);
        int int28 = wildcardClassItor26.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor29 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor26);
        wildcardClassItor24.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor29);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor31 = wildcardClassItor24.getListIterator();
        int int32 = wildcardClassItor24.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor33 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor34 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor33.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor34);
        int int36 = wildcardClassItor34.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor37 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor34);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate38 = wildcardClassItor37.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor39 = wildcardClassItor37.getListIterator();
        wildcardClassItor24.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor37);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor41 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor37);
        int int42 = wildcardClassItor41.nextIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.Type> typeItor43 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.Type>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor41);
        typeItor8.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor41);
        int int45 = wildcardClassItor41.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor46 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor41);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor47 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor48 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor49 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor48.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor49);
        int int51 = wildcardClassItor49.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor52 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor49);
        wildcardClassItor47.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor52);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor54 = wildcardClassItor47.getListIterator();
        int int55 = wildcardClassItor47.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor56 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor57 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor56.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor57);
        int int59 = wildcardClassItor57.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor60 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor57);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate61 = wildcardClassItor60.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor62 = wildcardClassItor60.getListIterator();
        wildcardClassItor47.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor60);
        int int64 = wildcardClassItor60.nextIndex();
        boolean boolean65 = wildcardClassItor60.hasPrevious();
        wildcardClassItor46.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor60);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate67 = wildcardClassItor46.getPredicate();
        boolean boolean68 = wildcardClassItor46.hasNext();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate38);
        org.junit.Assert.assertNotNull(wildcardItor39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate61);
        org.junit.Assert.assertNotNull(wildcardItor62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(wildcardPredicate67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor3 = wildcardClassItor1.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor6);
        int int8 = wildcardClassItor6.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor6);
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor9);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor11 = wildcardClassItor4.getListIterator();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate13 = wildcardClassItor4.getPredicate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = wildcardPredicate13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertNull(wildcardItor3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor11);
        org.junit.Assert.assertNull(wildcardPredicate13);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor5 = wildcardClassItor4.getListIterator();
        int int6 = wildcardClassItor4.nextIndex();
        int int7 = wildcardClassItor4.previousIndex();
        // The following exception was thrown during execution in test generation
        try {
            wildcardClassItor4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: FilterListIterator.remove() is not supported.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor0.getListIterator();
        int int8 = wildcardClassItor0.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate9 = wildcardClassItor0.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor11 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.AnnotatedElement>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor12 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor12.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        int int15 = wildcardClassItor13.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor16 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor17 = wildcardClassItor13.getListIterator();
        int int18 = wildcardClassItor13.previousIndex();
        int int19 = wildcardClassItor13.previousIndex();
        boolean boolean20 = wildcardClassItor13.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor21 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor22 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor21);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor23 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor21);
        wildcardClassItor13.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor21);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor25 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        int int26 = wildcardClassItor25.nextIndex();
        boolean boolean27 = wildcardClassItor25.hasPrevious();
        int int28 = wildcardClassItor25.nextIndex();
        wildcardClassItor13.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor25);
        annotatedElementItor11.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor25);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor31 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor25);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate32 = wildcardClassItor31.getPredicate();
        int int33 = wildcardClassItor31.nextIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(wildcardItor17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(wildcardPredicate32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate2 = wildcardClassItor1.getPredicate();
        int int3 = wildcardClassItor1.nextIndex();
        boolean boolean4 = wildcardClassItor1.hasNext();
        int int5 = wildcardClassItor1.nextIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int7 = wildcardClassItor6.nextIndex();
        boolean boolean8 = wildcardClassItor6.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor9.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        int int12 = wildcardClassItor10.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor14 = wildcardClassItor13.getListIterator();
        int int15 = wildcardClassItor13.nextIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor16 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor17 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor16);
        int int18 = wildcardClassItor17.previousIndex();
        int int19 = wildcardClassItor17.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate20 = wildcardClassItor17.getPredicate();
        wildcardClassItor13.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor17);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor22 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        boolean boolean23 = wildcardClassItor13.hasPrevious();
        wildcardClassItor6.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        org.junit.Assert.assertNull(wildcardPredicate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate5 = wildcardClassItor4.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor6 = wildcardClassItor4.getListIterator();
        int int7 = wildcardClassItor4.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        java.lang.Class<?> wildcardClass9 = wildcardClassItor8.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate5);
        org.junit.Assert.assertNotNull(wildcardItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        boolean boolean3 = wildcardClassItor1.hasPrevious();
        int int4 = wildcardClassItor1.nextIndex();
        int int5 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        int int7 = wildcardClassItor6.nextIndex();
        boolean boolean8 = wildcardClassItor6.hasPrevious();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor6);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor11 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        int int12 = wildcardClassItor11.previousIndex();
        int int13 = wildcardClassItor11.nextIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor14 = wildcardClassItor11.getListIterator();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor15 = wildcardClassItor11.getListIterator();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor16 = wildcardClassItor11.getListIterator();
        wildcardClassItor6.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor11);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor18 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor11);
        boolean boolean19 = wildcardClassItor18.hasNext();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardItor14);
        org.junit.Assert.assertNotNull(wildcardItor15);
        org.junit.Assert.assertNotNull(wildcardItor16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate4 = wildcardClassItor1.getPredicate();
        boolean boolean5 = wildcardClassItor1.hasPrevious();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate6 = wildcardClassItor1.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor1.getListIterator();
        int int8 = wildcardClassItor1.nextIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor11 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor10.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor11);
        int int13 = wildcardClassItor11.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor14 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor11);
        wildcardClassItor9.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor14);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor16 = wildcardClassItor9.getListIterator();
        int int17 = wildcardClassItor9.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor18 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor19 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor18.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor19);
        int int21 = wildcardClassItor19.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor22 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor19);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate23 = wildcardClassItor22.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor24 = wildcardClassItor22.getListIterator();
        wildcardClassItor9.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor22);
        int int26 = wildcardClassItor22.nextIndex();
        boolean boolean27 = wildcardClassItor22.hasPrevious();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor22);
        int int29 = wildcardClassItor1.nextIndex();
        boolean boolean30 = wildcardClassItor1.hasPrevious();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate31 = wildcardClassItor1.getPredicate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardPredicate6);
        org.junit.Assert.assertNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate23);
        org.junit.Assert.assertNotNull(wildcardItor24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(wildcardPredicate31);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        boolean boolean2 = wildcardClassItor0.hasNext();
        boolean boolean3 = wildcardClassItor0.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.GenericDeclaration>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        int int7 = wildcardClassItor6.previousIndex();
        int int8 = wildcardClassItor6.nextIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate9 = wildcardClassItor6.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor6);
        boolean boolean11 = wildcardClassItor10.hasPrevious();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor12 = wildcardClassItor10.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor14 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor13.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor14);
        int int16 = wildcardClassItor14.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor17 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor14);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor18 = wildcardClassItor14.getListIterator();
        int int19 = wildcardClassItor14.previousIndex();
        int int20 = wildcardClassItor14.previousIndex();
        int int21 = wildcardClassItor14.previousIndex();
        boolean boolean22 = wildcardClassItor14.hasPrevious();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor23 = wildcardClassItor14.getListIterator();
        wildcardClassItor10.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor14);
        genericDeclarationItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor14);
        boolean boolean26 = wildcardClassItor14.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor27 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor14);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor28 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor14);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor29 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor30 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor31 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor30.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor31);
        int int33 = wildcardClassItor31.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor34 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor31);
        wildcardClassItor29.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor34);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor36 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor37 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor38 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor37.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor38);
        int int40 = wildcardClassItor38.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor41 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor38);
        wildcardClassItor36.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor41);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor43 = wildcardClassItor36.getListIterator();
        boolean boolean44 = wildcardClassItor36.hasPrevious();
        wildcardClassItor34.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor36);
        boolean boolean46 = wildcardClassItor34.hasNext();
        boolean boolean47 = wildcardClassItor34.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor48 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor34);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate49 = wildcardClassItor34.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor50 = wildcardClassItor34.getListIterator();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate51 = wildcardClassItor34.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.Type> typeItor52 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.Type>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor34);
        wildcardClassItor14.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor34);
        boolean boolean54 = wildcardClassItor14.hasNext();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(wildcardPredicate9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardItor12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(wildcardItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(wildcardItor23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(wildcardPredicate49);
        org.junit.Assert.assertNotNull(wildcardItor50);
        org.junit.Assert.assertNull(wildcardPredicate51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate4 = wildcardClassItor1.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        int int7 = wildcardClassItor5.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor11 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor10.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor11);
        int int13 = wildcardClassItor11.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor14 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor11);
        boolean boolean15 = wildcardClassItor14.hasNext();
        wildcardClassItor8.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor14);
        int int17 = wildcardClassItor8.previousIndex();
        int int18 = wildcardClassItor8.previousIndex();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor5 = wildcardClassItor4.getListIterator();
        int int6 = wildcardClassItor4.nextIndex();
        int int7 = wildcardClassItor4.nextIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = wildcardClassItor4.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor7 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor8.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor9);
        int int11 = wildcardClassItor9.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor12 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor9);
        wildcardClassItor7.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor12);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor14 = wildcardClassItor7.getListIterator();
        boolean boolean15 = wildcardClassItor7.hasPrevious();
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor7);
        int int17 = wildcardClassItor7.nextIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor18 = wildcardClassItor7.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor19 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate20 = wildcardClassItor19.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor21 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor19);
        wildcardClassItor7.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor19);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate23 = wildcardClassItor19.getPredicate();
        int int24 = wildcardClassItor19.previousIndex();
        int int25 = wildcardClassItor19.previousIndex();
        boolean boolean26 = wildcardClassItor19.hasNext();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardItor18);
        org.junit.Assert.assertNull(wildcardPredicate20);
        org.junit.Assert.assertNull(wildcardPredicate23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        int int1 = wildcardClassItor0.nextIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor3 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor2.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor3);
        int int5 = wildcardClassItor3.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor3);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate7 = wildcardClassItor6.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor8 = wildcardClassItor6.getListIterator();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor9 = wildcardClassItor6.getListIterator();
        boolean boolean10 = wildcardClassItor6.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor11 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor12 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor11.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor12);
        boolean boolean14 = wildcardClassItor12.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor15 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor16 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor15.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor16);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor18 = wildcardClassItor16.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor19 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor20 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor21 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor20.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor21);
        int int23 = wildcardClassItor21.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor24 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor21);
        wildcardClassItor19.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor24);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor26 = wildcardClassItor19.getListIterator();
        wildcardClassItor16.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor19);
        wildcardClassItor12.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor19);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor29 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor19);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate30 = wildcardClassItor29.getPredicate();
        wildcardClassItor6.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor29);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor32 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor29);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor33 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor34 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor33.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor34);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor36 = wildcardClassItor34.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor37 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor38 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor39 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor38.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor39);
        int int41 = wildcardClassItor39.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor42 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor39);
        wildcardClassItor37.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor42);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor44 = wildcardClassItor37.getListIterator();
        wildcardClassItor34.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor37);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor46 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor37);
        boolean boolean47 = wildcardClassItor46.hasPrevious();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor48 = wildcardClassItor46.getListIterator();
        wildcardClassItor29.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor46);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate50 = wildcardClassItor29.getPredicate();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor29);
        boolean boolean52 = wildcardClassItor0.hasNext();
        boolean boolean53 = wildcardClassItor0.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            wildcardClassItor0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: FilterListIterator.remove() is not supported.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate7);
        org.junit.Assert.assertNotNull(wildcardItor8);
        org.junit.Assert.assertNotNull(wildcardItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardItor18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor26);
        org.junit.Assert.assertNull(wildcardPredicate30);
        org.junit.Assert.assertNull(wildcardItor36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardItor48);
        org.junit.Assert.assertNull(wildcardPredicate50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor0.getListIterator();
        int int8 = wildcardClassItor0.previousIndex();
        boolean boolean9 = wildcardClassItor0.hasNext();
        int int10 = wildcardClassItor0.nextIndex();
        boolean boolean11 = wildcardClassItor0.hasPrevious();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate12 = wildcardClassItor0.getPredicate();
        int int13 = wildcardClassItor0.nextIndex();
        int int14 = wildcardClassItor0.nextIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate15 = wildcardClassItor0.getPredicate();
        int int16 = wildcardClassItor0.nextIndex();
        int int17 = wildcardClassItor0.nextIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardPredicate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(wildcardPredicate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        int int2 = wildcardClassItor1.previousIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor3 = wildcardClassItor1.getListIterator();
        int int4 = wildcardClassItor1.nextIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor5 = wildcardClassItor1.getListIterator();
        boolean boolean6 = wildcardClassItor1.hasPrevious();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor1.getListIterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardItor7);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor0.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.Type> typeItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.Type>((java.util.ListIterator<java.lang.Class<?>>) wildcardItor7);
        int int9 = typeItor8.nextIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor11 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor12 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor11.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor12);
        int int14 = wildcardClassItor12.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor15 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor12);
        wildcardClassItor10.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor15);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor17 = wildcardClassItor10.getListIterator();
        int int18 = wildcardClassItor10.previousIndex();
        boolean boolean19 = wildcardClassItor10.hasNext();
        int int20 = wildcardClassItor10.nextIndex();
        typeItor8.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        int int22 = typeItor8.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate23 = typeItor8.getPredicate();
        int int24 = typeItor8.nextIndex();
        boolean boolean25 = typeItor8.hasNext();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        int int2 = wildcardClassItor1.previousIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor3 = wildcardClassItor1.getListIterator();
        int int4 = wildcardClassItor1.nextIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int6 = wildcardClassItor1.previousIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        int int2 = wildcardClassItor1.previousIndex();
        int int3 = wildcardClassItor1.previousIndex();
        boolean boolean4 = wildcardClassItor1.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor7 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor6.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor7);
        int int9 = wildcardClassItor7.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor7);
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor12 = wildcardClassItor5.getListIterator();
        int int13 = wildcardClassItor5.previousIndex();
        boolean boolean14 = wildcardClassItor5.hasNext();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor16 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor17 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor16);
        int int18 = wildcardClassItor16.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor19 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor16);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor20 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor16);
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor16);
        int int22 = wildcardClassItor16.previousIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        boolean boolean3 = wildcardClassItor1.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor5.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor9.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        int int12 = wildcardClassItor10.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        wildcardClassItor8.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor15 = wildcardClassItor8.getListIterator();
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor18 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        int int19 = wildcardClassItor18.nextIndex();
        boolean boolean20 = wildcardClassItor18.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor21 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor22 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor21.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor22);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor24 = wildcardClassItor22.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor25 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor26 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor27 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor26.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor27);
        int int29 = wildcardClassItor27.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor30 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor27);
        wildcardClassItor25.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor30);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor32 = wildcardClassItor25.getListIterator();
        wildcardClassItor22.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor25);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor34 = wildcardClassItor25.getListIterator();
        wildcardClassItor18.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor25);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor36 = wildcardClassItor25.getListIterator();
        int int37 = wildcardClassItor25.previousIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass38 = wildcardClassItor25.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(wildcardItor24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor32);
        org.junit.Assert.assertNotNull(wildcardItor34);
        org.junit.Assert.assertNotNull(wildcardItor36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        boolean boolean3 = wildcardClassItor1.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor5.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor9.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        int int12 = wildcardClassItor10.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        wildcardClassItor8.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor15 = wildcardClassItor8.getListIterator();
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor18 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate19 = wildcardClassItor18.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor20 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor18);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor21 = wildcardClassItor20.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor22 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor20);
        boolean boolean23 = wildcardClassItor20.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = wildcardClassItor20.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor15);
        org.junit.Assert.assertNull(wildcardPredicate19);
        org.junit.Assert.assertNotNull(wildcardItor21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        int int2 = wildcardClassItor1.previousIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor3 = wildcardClassItor1.getListIterator();
        int int4 = wildcardClassItor1.nextIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        int int7 = wildcardClassItor6.previousIndex();
        int int8 = wildcardClassItor6.nextIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor9 = wildcardClassItor6.getListIterator();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor10 = wildcardClassItor6.getListIterator();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor6);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor12 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor14 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor15 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor14.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor15);
        int int17 = wildcardClassItor15.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor18 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor15);
        wildcardClassItor13.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor18);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor20 = wildcardClassItor13.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.Type> typeItor21 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.Type>((java.util.ListIterator<java.lang.Class<?>>) wildcardItor20);
        int int22 = typeItor21.nextIndex();
        int int23 = typeItor21.previousIndex();
        boolean boolean24 = typeItor21.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor25 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor26 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor25.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor26);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor28 = wildcardClassItor26.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor29 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor30 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor31 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor30.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor31);
        int int33 = wildcardClassItor31.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor34 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor31);
        wildcardClassItor29.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor34);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor36 = wildcardClassItor29.getListIterator();
        wildcardClassItor26.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor29);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor38 = wildcardClassItor29.getListIterator();
        typeItor21.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor29);
        wildcardClassItor12.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor29);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate41 = wildcardClassItor12.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor42 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor12);
        // The following exception was thrown during execution in test generation
        try {
            wildcardClassItor12.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: FilterListIterator.remove() is not supported.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardItor9);
        org.junit.Assert.assertNotNull(wildcardItor10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(wildcardItor28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor36);
        org.junit.Assert.assertNotNull(wildcardItor38);
        org.junit.Assert.assertNull(wildcardPredicate41);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        int int4 = wildcardClassItor1.nextIndex();
        int int5 = wildcardClassItor1.previousIndex();
        boolean boolean6 = wildcardClassItor1.hasPrevious();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor1.getListIterator();
        boolean boolean8 = wildcardClassItor1.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = wildcardClassItor1.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate5 = wildcardClassItor4.getPredicate();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate6 = wildcardClassItor4.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor7 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor7);
        int int9 = wildcardClassItor8.previousIndex();
        int int10 = wildcardClassItor8.nextIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor11 = wildcardClassItor8.getListIterator();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor12 = wildcardClassItor8.getListIterator();
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        boolean boolean14 = wildcardClassItor4.hasPrevious();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor15 = wildcardClassItor4.getListIterator();
        int int16 = wildcardClassItor4.previousIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = wildcardClassItor4.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate5);
        org.junit.Assert.assertNull(wildcardPredicate6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardItor11);
        org.junit.Assert.assertNotNull(wildcardItor12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate4 = wildcardClassItor1.getPredicate();
        boolean boolean5 = wildcardClassItor1.hasPrevious();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate6 = wildcardClassItor1.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor1.getListIterator();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor8 = wildcardClassItor1.getListIterator();
        boolean boolean9 = wildcardClassItor1.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor11 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor12 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor11.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor12);
        int int14 = wildcardClassItor12.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor15 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor12);
        wildcardClassItor10.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor15);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate17 = wildcardClassItor10.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor18 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor19 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor18.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor19);
        boolean boolean21 = wildcardClassItor19.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor22 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor23 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor22.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor23);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor25 = wildcardClassItor23.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor26 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor27 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor28 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor27.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor28);
        int int30 = wildcardClassItor28.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor31 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor28);
        wildcardClassItor26.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor31);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor33 = wildcardClassItor26.getListIterator();
        wildcardClassItor23.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor26);
        wildcardClassItor19.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor26);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor36 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor26);
        int int37 = wildcardClassItor26.previousIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor38 = wildcardClassItor26.getListIterator();
        wildcardClassItor10.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor26);
        int int40 = wildcardClassItor26.nextIndex();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor26);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor42 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor43 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor42.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor43);
        int int45 = wildcardClassItor43.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor46 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor43);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor47 = wildcardClassItor46.getListIterator();
        int int48 = wildcardClassItor46.nextIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor49 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor50 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor49);
        int int51 = wildcardClassItor50.previousIndex();
        int int52 = wildcardClassItor50.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate53 = wildcardClassItor50.getPredicate();
        wildcardClassItor46.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor50);
        int int55 = wildcardClassItor46.previousIndex();
        int int56 = wildcardClassItor46.previousIndex();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor46);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass58 = wildcardClassItor46.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardPredicate6);
        org.junit.Assert.assertNull(wildcardItor7);
        org.junit.Assert.assertNull(wildcardItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(wildcardItor25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        boolean boolean2 = wildcardClassItor0.hasNext();
        boolean boolean3 = wildcardClassItor0.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        boolean boolean5 = wildcardClassItor4.hasPrevious();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor3 = wildcardClassItor1.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor6);
        int int8 = wildcardClassItor6.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor6);
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor9);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor11 = wildcardClassItor4.getListIterator();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        boolean boolean14 = wildcardClassItor13.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor15 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor16 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor17 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor16.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor17);
        int int19 = wildcardClassItor17.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor20 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor17);
        wildcardClassItor15.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor20);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor22 = wildcardClassItor15.getListIterator();
        int int23 = wildcardClassItor15.previousIndex();
        boolean boolean24 = wildcardClassItor15.hasNext();
        int int25 = wildcardClassItor15.nextIndex();
        boolean boolean26 = wildcardClassItor15.hasNext();
        wildcardClassItor13.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor15);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor28 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor29 = wildcardClassItor13.getListIterator();
        org.junit.Assert.assertNull(wildcardItor3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardItor29);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor0.getListIterator();
        boolean boolean8 = wildcardClassItor0.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate10 = wildcardClassItor0.getPredicate();
        // The following exception was thrown during execution in test generation
        try {
            wildcardClassItor0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: FilterListIterator.remove() is not supported.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardPredicate10);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor0.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.Type> typeItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.Type>((java.util.ListIterator<java.lang.Class<?>>) wildcardItor7);
        int int9 = typeItor8.nextIndex();
        int int10 = typeItor8.previousIndex();
        boolean boolean11 = typeItor8.hasNext();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate12 = typeItor8.getPredicate();
        int int13 = typeItor8.previousIndex();
        int int14 = typeItor8.nextIndex();
        boolean boolean15 = typeItor8.hasNext();
        boolean boolean16 = typeItor8.hasNext();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate17 = typeItor8.getPredicate();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardPredicate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(wildcardPredicate17);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        int int2 = wildcardClassItor0.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor3 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor6);
        int int8 = wildcardClassItor6.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor6);
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor9);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor11 = wildcardClassItor4.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.Type> typeItor12 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.Type>((java.util.ListIterator<java.lang.Class<?>>) wildcardItor11);
        int int13 = typeItor12.nextIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor14 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor15 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor16 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor15.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor16);
        int int18 = wildcardClassItor16.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor19 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor16);
        wildcardClassItor14.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor19);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor21 = wildcardClassItor14.getListIterator();
        int int22 = wildcardClassItor14.previousIndex();
        boolean boolean23 = wildcardClassItor14.hasNext();
        int int24 = wildcardClassItor14.nextIndex();
        typeItor12.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor14);
        int int26 = wildcardClassItor14.nextIndex();
        boolean boolean27 = wildcardClassItor14.hasPrevious();
        java.util.ListIterator<java.lang.Class<?>> wildcardClassItor28 = null;
        wildcardClassItor14.setListIterator(wildcardClassItor28);
        int int30 = wildcardClassItor14.nextIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate31 = wildcardClassItor14.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor32 = wildcardClassItor14.getListIterator();
        int int33 = wildcardClassItor14.nextIndex();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(wildcardPredicate31);
        org.junit.Assert.assertNull(wildcardItor32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor0.getListIterator();
        int int8 = wildcardClassItor0.previousIndex();
        boolean boolean9 = wildcardClassItor0.hasNext();
        int int10 = wildcardClassItor0.nextIndex();
        boolean boolean11 = wildcardClassItor0.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor12 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor13 = wildcardClassItor12.getListIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = wildcardClassItor12.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardItor13);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        boolean boolean5 = wildcardClassItor4.hasNext();
        int int6 = wildcardClassItor4.previousIndex();
        boolean boolean7 = wildcardClassItor4.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor9.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        int int12 = wildcardClassItor10.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        wildcardClassItor8.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor15 = wildcardClassItor13.getListIterator();
        boolean boolean16 = wildcardClassItor13.hasPrevious();
        boolean boolean17 = wildcardClassItor13.hasPrevious();
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor19 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        boolean boolean20 = wildcardClassItor13.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            wildcardClassItor13.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: FilterListIterator.remove() is not supported.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate2 = wildcardClassItor0.getPredicate();
        // The following exception was thrown during execution in test generation
        try {
            wildcardClassItor0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: FilterListIterator.remove() is not supported.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertNull(wildcardPredicate2);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate5 = wildcardClassItor4.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor6 = wildcardClassItor4.getListIterator();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor4.getListIterator();
        boolean boolean8 = wildcardClassItor4.hasPrevious();
        boolean boolean9 = wildcardClassItor4.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate5);
        org.junit.Assert.assertNotNull(wildcardItor6);
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor3 = wildcardClassItor2.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardItor3);
        int int5 = wildcardClassItor4.previousIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor6 = wildcardClassItor4.getListIterator();
        org.junit.Assert.assertNotNull(wildcardItor3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor6);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate5 = wildcardClassItor4.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor6 = wildcardClassItor4.getListIterator();
        int int7 = wildcardClassItor4.previousIndex();
        boolean boolean8 = wildcardClassItor4.hasPrevious();
        int int9 = wildcardClassItor4.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.io.Serializable> serializableItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.io.Serializable>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate5);
        org.junit.Assert.assertNotNull(wildcardItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        int int4 = wildcardClassItor1.nextIndex();
        int int5 = wildcardClassItor1.previousIndex();
        boolean boolean6 = wildcardClassItor1.hasPrevious();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor1.getListIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = wildcardClassItor1.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardItor7);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor5 = wildcardClassItor1.getListIterator();
        int int6 = wildcardClassItor1.previousIndex();
        int int7 = wildcardClassItor1.previousIndex();
        boolean boolean8 = wildcardClassItor1.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor9);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor11 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor9);
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor9);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor13 = wildcardClassItor1.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor14 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor15 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Object> objItor16 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Object>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(wildcardItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardItor13);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        boolean boolean7 = wildcardClassItor0.hasNext();
        int int8 = wildcardClassItor0.nextIndex();
        boolean boolean9 = wildcardClassItor0.hasPrevious();
        java.lang.Class<?> wildcardClass10 = wildcardClassItor0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor3 = wildcardClassItor1.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor6);
        int int8 = wildcardClassItor6.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor6);
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor9);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor11 = wildcardClassItor4.getListIterator();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        java.util.ListIterator<java.lang.Class<?>> wildcardClassItor13 = null;
        wildcardClassItor1.setListIterator(wildcardClassItor13);
        int int15 = wildcardClassItor1.nextIndex();
        int int16 = wildcardClassItor1.nextIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor17 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor18 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor17);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor19 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor17);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor20 = wildcardClassItor19.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor21 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardItor20);
        int int22 = wildcardClassItor21.previousIndex();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor21);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor24 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor21);
        org.junit.Assert.assertNull(wildcardItor3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardItor20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        int int4 = wildcardClassItor1.nextIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor5 = wildcardClassItor1.getListIterator();
        int int6 = wildcardClassItor1.previousIndex();
        int int7 = wildcardClassItor1.previousIndex();
        int int8 = wildcardClassItor1.nextIndex();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(wildcardItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor0.getListIterator();
        int int8 = wildcardClassItor0.previousIndex();
        boolean boolean9 = wildcardClassItor0.hasNext();
        int int10 = wildcardClassItor0.nextIndex();
        boolean boolean11 = wildcardClassItor0.hasPrevious();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate12 = wildcardClassItor0.getPredicate();
        int int13 = wildcardClassItor0.nextIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor14 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate15 = wildcardClassItor0.getPredicate();
        int int16 = wildcardClassItor0.previousIndex();
        int int17 = wildcardClassItor0.nextIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardPredicate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(wildcardPredicate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor5 = wildcardClassItor1.getListIterator();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate6 = wildcardClassItor1.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor7 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor8.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor9);
        int int11 = wildcardClassItor9.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor12 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor9);
        wildcardClassItor7.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor12);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor14 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor15 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor16 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor15.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor16);
        int int18 = wildcardClassItor16.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor19 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor16);
        wildcardClassItor14.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor19);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor21 = wildcardClassItor14.getListIterator();
        boolean boolean22 = wildcardClassItor14.hasPrevious();
        wildcardClassItor12.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor14);
        int int24 = wildcardClassItor14.nextIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor25 = wildcardClassItor14.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor26 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate27 = wildcardClassItor26.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor28 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor26);
        wildcardClassItor14.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor26);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate30 = wildcardClassItor26.getPredicate();
        int int31 = wildcardClassItor26.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate32 = wildcardClassItor26.getPredicate();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor26);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor34 = wildcardClassItor1.getListIterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(wildcardItor5);
        org.junit.Assert.assertNull(wildcardPredicate6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardItor25);
        org.junit.Assert.assertNull(wildcardPredicate27);
        org.junit.Assert.assertNull(wildcardPredicate30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate32);
        org.junit.Assert.assertNotNull(wildcardItor34);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor0.getListIterator();
        int int8 = wildcardClassItor0.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate9 = wildcardClassItor0.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        int int11 = wildcardClassItor10.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate12 = wildcardClassItor10.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor13 = wildcardClassItor10.getListIterator();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate12);
        org.junit.Assert.assertNotNull(wildcardItor13);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        int int2 = wildcardClassItor1.previousIndex();
        int int3 = wildcardClassItor1.nextIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate4 = wildcardClassItor1.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor6 = wildcardClassItor5.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor7 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        int int8 = wildcardClassItor5.nextIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(wildcardPredicate4);
        org.junit.Assert.assertNotNull(wildcardItor6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate5 = wildcardClassItor4.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        int int7 = wildcardClassItor4.nextIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor8 = wildcardClassItor4.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Object> objItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Object>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        boolean boolean10 = wildcardClassItor4.hasNext();
        boolean boolean11 = wildcardClassItor4.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = wildcardClassItor4.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardItor8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor0.getListIterator();
        int int8 = wildcardClassItor0.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate9 = wildcardClassItor0.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        int int11 = wildcardClassItor10.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate12 = wildcardClassItor10.getPredicate();
        int int13 = wildcardClassItor10.nextIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate14 = wildcardClassItor10.getPredicate();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate15 = wildcardClassItor10.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor16 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor17 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor16);
        int int18 = wildcardClassItor17.previousIndex();
        int int19 = wildcardClassItor17.previousIndex();
        boolean boolean20 = wildcardClassItor17.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor21 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor22 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor21.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor22);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor24 = wildcardClassItor21.getListIterator();
        wildcardClassItor17.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardItor24);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor26 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor17);
        wildcardClassItor10.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor17);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor28 = wildcardClassItor17.getListIterator();
        int int29 = wildcardClassItor17.previousIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(wildcardPredicate14);
        org.junit.Assert.assertNull(wildcardPredicate15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardItor24);
        org.junit.Assert.assertNotNull(wildcardItor28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate5 = wildcardClassItor1.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor6 = wildcardClassItor1.getListIterator();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor1.getListIterator();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor8 = wildcardClassItor1.getListIterator();
        int int9 = wildcardClassItor1.previousIndex();
        boolean boolean10 = wildcardClassItor1.hasNext();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate5);
        org.junit.Assert.assertNull(wildcardItor6);
        org.junit.Assert.assertNull(wildcardItor7);
        org.junit.Assert.assertNull(wildcardItor8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor0.getListIterator();
        int int8 = wildcardClassItor0.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor9.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        int int12 = wildcardClassItor10.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate14 = wildcardClassItor13.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor15 = wildcardClassItor13.getListIterator();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor17 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        int int18 = wildcardClassItor17.nextIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.Type> typeItor19 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.Type>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor17);
        int int20 = wildcardClassItor17.previousIndex();
        boolean boolean21 = wildcardClassItor17.hasNext();
        int int22 = wildcardClassItor17.nextIndex();
        // The following exception was thrown during execution in test generation
        try {
            wildcardClassItor17.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: FilterListIterator.remove() is not supported.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate14);
        org.junit.Assert.assertNotNull(wildcardItor15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.apache.commons.collections4.iterators.FilterListIterator<java.io.Serializable> serializableItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.io.Serializable>();
        boolean boolean1 = serializableItor0.hasPrevious();
        boolean boolean2 = serializableItor0.hasNext();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate3 = serializableItor0.getPredicate();
        int int4 = serializableItor0.nextIndex();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardPredicate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        int int2 = wildcardClassItor1.previousIndex();
        int int3 = wildcardClassItor1.nextIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate4 = wildcardClassItor1.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor6 = wildcardClassItor5.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor7 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor7);
        int int9 = wildcardClassItor8.previousIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor10 = wildcardClassItor8.getListIterator();
        int int11 = wildcardClassItor8.nextIndex();
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        int int14 = wildcardClassItor13.nextIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor15 = wildcardClassItor13.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor16 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.AnnotatedElement>((java.util.ListIterator<java.lang.Class<?>>) wildcardItor15);
        int int17 = annotatedElementItor16.previousIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(wildcardPredicate4);
        org.junit.Assert.assertNotNull(wildcardItor6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardItor15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        boolean boolean7 = wildcardClassItor5.hasNext();
        boolean boolean8 = wildcardClassItor5.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            wildcardClassItor5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: FilterListIterator.remove() is not supported.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor5 = wildcardClassItor1.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor7 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor6);
        int int8 = wildcardClassItor7.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate9 = wildcardClassItor7.getPredicate();
        int int10 = wildcardClassItor7.previousIndex();
        int int11 = wildcardClassItor7.previousIndex();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor7);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        boolean boolean14 = wildcardClassItor1.hasPrevious();
        boolean boolean15 = wildcardClassItor1.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor16 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = wildcardClassItor16.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(wildcardItor5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate4 = wildcardClassItor1.getPredicate();
        boolean boolean5 = wildcardClassItor1.hasPrevious();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor6 = wildcardClassItor1.getListIterator();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor1.getListIterator();
        int int8 = wildcardClassItor1.nextIndex();
        boolean boolean9 = wildcardClassItor1.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = wildcardClassItor1.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardItor6);
        org.junit.Assert.assertNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate6 = wildcardClassItor5.getPredicate();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor9.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        int int12 = wildcardClassItor10.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        boolean boolean14 = wildcardClassItor13.hasNext();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor16 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        int int17 = wildcardClassItor16.nextIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor18 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = wildcardClassItor16.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor3 = wildcardClassItor1.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor6);
        int int8 = wildcardClassItor6.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor6);
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor9);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor11 = wildcardClassItor4.getListIterator();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor13 = wildcardClassItor1.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor14 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor15 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor16 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor15.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor16);
        int int18 = wildcardClassItor16.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor19 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor16);
        wildcardClassItor14.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor19);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor21 = wildcardClassItor14.getListIterator();
        int int22 = wildcardClassItor14.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor23 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor24 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor23.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor24);
        int int26 = wildcardClassItor24.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor27 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor24);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate28 = wildcardClassItor27.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor29 = wildcardClassItor27.getListIterator();
        wildcardClassItor14.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor27);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor31 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor27);
        int int32 = wildcardClassItor31.nextIndex();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor31);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor34 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor35 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor34.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor35);
        int int37 = wildcardClassItor35.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate38 = wildcardClassItor35.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor39 = wildcardClassItor35.getListIterator();
        boolean boolean40 = wildcardClassItor35.hasNext();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor41 = wildcardClassItor35.getListIterator();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor42 = wildcardClassItor35.getListIterator();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate43 = wildcardClassItor35.getPredicate();
        boolean boolean44 = wildcardClassItor35.hasPrevious();
        boolean boolean45 = wildcardClassItor35.hasPrevious();
        wildcardClassItor31.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor35);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor47 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor48 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor47.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor48);
        int int50 = wildcardClassItor48.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor51 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor48);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor52 = wildcardClassItor48.getListIterator();
        int int53 = wildcardClassItor48.previousIndex();
        int int54 = wildcardClassItor48.previousIndex();
        boolean boolean55 = wildcardClassItor48.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor56 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor57 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor56);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor58 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor56);
        wildcardClassItor48.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor56);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor60 = wildcardClassItor48.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor61 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor48);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor62 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor48);
        wildcardClassItor31.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor62);
        int int64 = wildcardClassItor31.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate65 = wildcardClassItor31.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor66 = wildcardClassItor31.getListIterator();
        org.junit.Assert.assertNull(wildcardItor3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor11);
        org.junit.Assert.assertNotNull(wildcardItor13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate28);
        org.junit.Assert.assertNotNull(wildcardItor29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate38);
        org.junit.Assert.assertNull(wildcardItor39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(wildcardItor41);
        org.junit.Assert.assertNull(wildcardItor42);
        org.junit.Assert.assertNull(wildcardPredicate43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNull(wildcardItor52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(wildcardItor60);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate65);
        org.junit.Assert.assertNotNull(wildcardItor66);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor3 = wildcardClassItor1.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor6);
        int int8 = wildcardClassItor6.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor6);
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor9);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor11 = wildcardClassItor4.getListIterator();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor13 = wildcardClassItor1.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor14 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor15 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor16 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor15.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor16);
        int int18 = wildcardClassItor16.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor19 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor16);
        wildcardClassItor14.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor19);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor21 = wildcardClassItor14.getListIterator();
        int int22 = wildcardClassItor14.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor23 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor24 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor23.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor24);
        int int26 = wildcardClassItor24.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor27 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor24);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate28 = wildcardClassItor27.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor29 = wildcardClassItor27.getListIterator();
        wildcardClassItor14.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor27);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor31 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor27);
        int int32 = wildcardClassItor31.nextIndex();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor31);
        boolean boolean34 = wildcardClassItor1.hasPrevious();
        int int35 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor36 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor37 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor38 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor37.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor38);
        int int40 = wildcardClassItor38.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor41 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor38);
        wildcardClassItor36.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor41);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor43 = wildcardClassItor36.getListIterator();
        int int44 = wildcardClassItor36.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor45 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor46 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor45.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor46);
        int int48 = wildcardClassItor46.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor49 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor46);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate50 = wildcardClassItor49.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor51 = wildcardClassItor49.getListIterator();
        wildcardClassItor36.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor49);
        int int53 = wildcardClassItor49.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate54 = wildcardClassItor49.getPredicate();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor49);
        int int56 = wildcardClassItor49.nextIndex();
        org.junit.Assert.assertNull(wildcardItor3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor11);
        org.junit.Assert.assertNotNull(wildcardItor13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate28);
        org.junit.Assert.assertNotNull(wildcardItor29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate50);
        org.junit.Assert.assertNotNull(wildcardItor51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        int int2 = wildcardClassItor1.previousIndex();
        int int3 = wildcardClassItor1.previousIndex();
        boolean boolean4 = wildcardClassItor1.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor7 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor6.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor7);
        int int9 = wildcardClassItor7.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor7);
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor12 = wildcardClassItor5.getListIterator();
        int int13 = wildcardClassItor5.previousIndex();
        boolean boolean14 = wildcardClassItor5.hasNext();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        int int16 = wildcardClassItor5.previousIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate5 = wildcardClassItor4.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor6 = wildcardClassItor4.getListIterator();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor4.getListIterator();
        boolean boolean8 = wildcardClassItor4.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor9.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        boolean boolean12 = wildcardClassItor10.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor14 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor13.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor14);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor16 = wildcardClassItor14.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor17 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor18 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor19 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor18.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor19);
        int int21 = wildcardClassItor19.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor22 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor19);
        wildcardClassItor17.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor22);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor24 = wildcardClassItor17.getListIterator();
        wildcardClassItor14.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor17);
        wildcardClassItor10.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor17);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor27 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor17);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate28 = wildcardClassItor27.getPredicate();
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor27);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor30 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor27);
        int int31 = wildcardClassItor30.nextIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor32 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate5);
        org.junit.Assert.assertNotNull(wildcardItor6);
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardItor16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor24);
        org.junit.Assert.assertNull(wildcardPredicate28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor3 = wildcardClassItor1.getListIterator();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor4 = wildcardClassItor1.getListIterator();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate5 = wildcardClassItor1.getPredicate();
        int int6 = wildcardClassItor1.nextIndex();
        int int7 = wildcardClassItor1.previousIndex();
        int int8 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate9 = wildcardClassItor1.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor11 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor10.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor11);
        boolean boolean13 = wildcardClassItor11.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor14 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor15 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor14.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor15);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor17 = wildcardClassItor15.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor18 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor19 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor20 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor19.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor20);
        int int22 = wildcardClassItor20.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor23 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor20);
        wildcardClassItor18.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor23);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor25 = wildcardClassItor18.getListIterator();
        wildcardClassItor15.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor18);
        wildcardClassItor11.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor18);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor28 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor18);
        int int29 = wildcardClassItor28.nextIndex();
        boolean boolean30 = wildcardClassItor28.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor31 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor32 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor31.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor32);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor34 = wildcardClassItor32.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor35 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor36 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor37 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor36.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor37);
        int int39 = wildcardClassItor37.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor40 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor37);
        wildcardClassItor35.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor40);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor42 = wildcardClassItor35.getListIterator();
        wildcardClassItor32.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor35);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor44 = wildcardClassItor35.getListIterator();
        wildcardClassItor28.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor35);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor46 = wildcardClassItor35.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor47 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor35);
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor35);
        int int49 = wildcardClassItor1.nextIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor50 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor51 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor50);
        int int52 = wildcardClassItor51.previousIndex();
        int int53 = wildcardClassItor51.nextIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate54 = wildcardClassItor51.getPredicate();
        boolean boolean55 = wildcardClassItor51.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor56 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor51);
        int int57 = wildcardClassItor56.nextIndex();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor56);
        org.junit.Assert.assertNull(wildcardItor3);
        org.junit.Assert.assertNull(wildcardItor4);
        org.junit.Assert.assertNull(wildcardPredicate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(wildcardItor17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(wildcardItor34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor42);
        org.junit.Assert.assertNotNull(wildcardItor44);
        org.junit.Assert.assertNotNull(wildcardItor46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(wildcardPredicate54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor0.getListIterator();
        int int8 = wildcardClassItor0.previousIndex();
        boolean boolean9 = wildcardClassItor0.hasNext();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor10 = wildcardClassItor0.getListIterator();
        boolean boolean11 = wildcardClassItor0.hasPrevious();
        boolean boolean12 = wildcardClassItor0.hasPrevious();
        boolean boolean13 = wildcardClassItor0.hasNext();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        boolean boolean5 = wildcardClassItor4.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor7 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor7.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        int int10 = wildcardClassItor8.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor11 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        boolean boolean12 = wildcardClassItor11.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.AnnotatedElement>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor11);
        int int14 = wildcardClassItor11.previousIndex();
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor11);
        int int16 = wildcardClassItor4.nextIndex();
        int int17 = wildcardClassItor4.nextIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor18 = wildcardClassItor4.getListIterator();
        int int19 = wildcardClassItor4.previousIndex();
        // The following exception was thrown during execution in test generation
        try {
            wildcardClassItor4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: FilterListIterator.remove() is not supported.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor0.getListIterator();
        int int8 = wildcardClassItor0.previousIndex();
        boolean boolean9 = wildcardClassItor0.hasNext();
        int int10 = wildcardClassItor0.nextIndex();
        int int11 = wildcardClassItor0.previousIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        boolean boolean5 = wildcardClassItor4.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.AnnotatedElement>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        int int7 = wildcardClassItor4.previousIndex();
        boolean boolean8 = wildcardClassItor4.hasNext();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor9 = wildcardClassItor4.getListIterator();
        int int10 = wildcardClassItor4.nextIndex();
        int int11 = wildcardClassItor4.previousIndex();
        int int12 = wildcardClassItor4.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        boolean boolean5 = wildcardClassItor4.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor7 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.AnnotatedElement>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate8 = wildcardClassItor4.getPredicate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardPredicate8);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        int int2 = wildcardClassItor1.previousIndex();
        int int3 = wildcardClassItor1.nextIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor4 = wildcardClassItor1.getListIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = wildcardClassItor1.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardItor4);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor5 = wildcardClassItor4.getListIterator();
        int int6 = wildcardClassItor4.nextIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor7 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor7);
        int int9 = wildcardClassItor8.previousIndex();
        int int10 = wildcardClassItor8.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate11 = wildcardClassItor8.getPredicate();
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        int int13 = wildcardClassItor4.previousIndex();
        int int14 = wildcardClassItor4.previousIndex();
        boolean boolean15 = wildcardClassItor4.hasPrevious();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        int int2 = wildcardClassItor1.previousIndex();
        int int3 = wildcardClassItor1.nextIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate4 = wildcardClassItor1.getPredicate();
        boolean boolean5 = wildcardClassItor1.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        boolean boolean7 = wildcardClassItor1.hasNext();
        int int8 = wildcardClassItor1.previousIndex();
        boolean boolean9 = wildcardClassItor1.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.GenericDeclaration>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(wildcardPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor5 = wildcardClassItor1.getListIterator();
        int int6 = wildcardClassItor1.previousIndex();
        int int7 = wildcardClassItor1.previousIndex();
        boolean boolean8 = wildcardClassItor1.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor9);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor11 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor9);
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor9);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor13 = wildcardClassItor1.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.io.Serializable> serializableItor14 = new org.apache.commons.collections4.iterators.FilterListIterator<java.io.Serializable>((java.util.ListIterator<java.lang.Class<?>>) wildcardItor13);
        java.lang.Class<?> wildcardClass15 = serializableItor14.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(wildcardItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardItor13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor3 = wildcardClassItor1.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor6);
        int int8 = wildcardClassItor6.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor6);
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor9);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor11 = wildcardClassItor4.getListIterator();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        boolean boolean13 = wildcardClassItor4.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor14 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = wildcardClassItor14.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertNull(wildcardItor3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor5 = wildcardClassItor1.getListIterator();
        int int6 = wildcardClassItor1.previousIndex();
        int int7 = wildcardClassItor1.previousIndex();
        boolean boolean8 = wildcardClassItor1.hasPrevious();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate9 = wildcardClassItor1.getPredicate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(wildcardItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardPredicate9);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor0.getListIterator();
        int int8 = wildcardClassItor0.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor9.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        int int12 = wildcardClassItor10.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate14 = wildcardClassItor13.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor15 = wildcardClassItor13.getListIterator();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        boolean boolean17 = wildcardClassItor13.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = wildcardClassItor13.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate14);
        org.junit.Assert.assertNotNull(wildcardItor15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        boolean boolean5 = wildcardClassItor4.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor6 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor7 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.AnnotatedElement>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = wildcardClassItor4.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        boolean boolean3 = wildcardClassItor1.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor5.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor9.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        int int12 = wildcardClassItor10.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        wildcardClassItor8.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor15 = wildcardClassItor8.getListIterator();
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor18 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate19 = wildcardClassItor8.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor20 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor21 = wildcardClassItor8.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor22 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor23 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor24 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor23);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate25 = wildcardClassItor24.getPredicate();
        int int26 = wildcardClassItor24.nextIndex();
        boolean boolean27 = wildcardClassItor24.hasNext();
        int int28 = wildcardClassItor24.nextIndex();
        wildcardClassItor22.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass30 = wildcardClassItor24.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor15);
        org.junit.Assert.assertNull(wildcardPredicate19);
        org.junit.Assert.assertNotNull(wildcardItor21);
        org.junit.Assert.assertNull(wildcardPredicate25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor0.getListIterator();
        int int8 = wildcardClassItor0.previousIndex();
        int int9 = wildcardClassItor0.nextIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate10 = wildcardClassItor0.getPredicate();
        int int11 = wildcardClassItor0.previousIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor12 = wildcardClassItor0.getListIterator();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor13 = wildcardClassItor0.getListIterator();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(wildcardPredicate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor12);
        org.junit.Assert.assertNotNull(wildcardItor13);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor0.getListIterator();
        int int8 = wildcardClassItor0.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate9 = wildcardClassItor0.getPredicate();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate11 = wildcardClassItor0.getPredicate();
        int int12 = wildcardClassItor0.previousIndex();
        int int13 = wildcardClassItor0.nextIndex();
        boolean boolean14 = wildcardClassItor0.hasNext();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor15 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = wildcardClassItor0.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate9);
        org.junit.Assert.assertNull(wildcardPredicate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate1 = wildcardClassItor0.getPredicate();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor2 = wildcardClassItor0.getListIterator();
        int int3 = wildcardClassItor0.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor5 = wildcardClassItor0.getListIterator();
        boolean boolean6 = wildcardClassItor0.hasNext();
        int int7 = wildcardClassItor0.previousIndex();
        boolean boolean8 = wildcardClassItor0.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            wildcardClassItor0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: FilterListIterator.remove() is not supported.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertNull(wildcardPredicate1);
        org.junit.Assert.assertNull(wildcardItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(wildcardItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        int int3 = wildcardClassItor1.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor5 = wildcardClassItor4.getListIterator();
        int int6 = wildcardClassItor4.nextIndex();
        java.lang.Class<?> wildcardClass7 = wildcardClassItor4.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        int int2 = wildcardClassItor1.previousIndex();
        int int3 = wildcardClassItor1.nextIndex();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor4 = wildcardClassItor1.getListIterator();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor5 = wildcardClassItor1.getListIterator();
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor6 = wildcardClassItor1.getListIterator();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate7 = wildcardClassItor1.getPredicate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = wildcardClassItor1.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            /* And violated CMM Protocol confirms this too: 
			"Constructs a new <code>FilterListIterator</code> that will not function until {@link #setListIterator(ListIterator) setListIterator} and {@link #setPredicate(Predicate) setPredicate} are invoked. "*/
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardItor4);
        org.junit.Assert.assertNotNull(wildcardItor5);
        org.junit.Assert.assertNotNull(wildcardItor6);
        org.junit.Assert.assertNull(wildcardPredicate7);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        int int2 = wildcardClassItor1.previousIndex();
        int int3 = wildcardClassItor1.nextIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.reflect.AnnotatedElement>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        boolean boolean5 = annotatedElementItor4.hasPrevious();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor1);
        boolean boolean3 = wildcardClassItor1.hasPrevious();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor4 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor4.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor5.getListIterator();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor8 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor9 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor10 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor9.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        int int12 = wildcardClassItor10.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor13 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor10);
        wildcardClassItor8.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor13);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor15 = wildcardClassItor8.getListIterator();
        wildcardClassItor5.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        int int18 = wildcardClassItor8.previousIndex();
        int int19 = wildcardClassItor8.nextIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor20 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor8);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor21 = wildcardClassItor8.getListIterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardItor21);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor0 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor1 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor2 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>();
        wildcardClassItor1.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        int int4 = wildcardClassItor2.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor5 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor2);
        wildcardClassItor0.setListIterator((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor5);
        java.util.ListIterator<? extends java.lang.Class<?>> wildcardItor7 = wildcardClassItor0.getListIterator();
        int int8 = wildcardClassItor0.previousIndex();
        org.apache.commons.collections4.Predicate<? super java.lang.Class<?>> wildcardPredicate9 = wildcardClassItor0.getPredicate();
        boolean boolean10 = wildcardClassItor0.hasPrevious();
        int int11 = wildcardClassItor0.previousIndex();
        org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>> wildcardClassItor12 = new org.apache.commons.collections4.iterators.FilterListIterator<java.lang.Class<?>>((java.util.ListIterator<java.lang.Class<?>>) wildcardClassItor0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(wildcardPredicate9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }
}

