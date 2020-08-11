package org.toradocu.accuracy.equivalences.dataset;

import org.junit.Test;
import org.toradocu.testlib.AbstractPrecisionRecallTestSuite;

public class AccuracyGWT2 extends AbstractPrecisionRecallTestSuite {

  private static final String GWT_2_SRC =
      "/Users/arianna/doc-utils/src/main/resources/gwt-2.5.1-sources/";
  private static final String GWT_2_BIN =
      "/Users/arianna/doc-utils/src/main/resources/gwt-user-2.5.1.jar";
  private static final String GWT_GOAL_DIR = "expected-equivalences/gwt";

  public AccuracyGWT2() {
    super(GWT_2_SRC, GWT_2_BIN, GWT_GOAL_DIR);
  }

  // void
  @Test
  public void testClient_Animation() {
    test("com.google.gwt.animation.client.Animation", 1, 1);
  }

  // Void

  // Static vs void method
  //  @Test
  //  public void testImpl_WeakMapping() {
  //    test("com.google.gwt.core.client.impl.WeakMapping", 1, 1);
  //  }

  // Yet another Javadoc bug/clone, Javadoc of getTime() points to itself, it's actually the Javadoc
  // of create()
  // indeed I am not really sure about the oracle!
  @Test
  public void testClient_JsDate() {
    test("com.google.gwt.core.client.JsDate", 1, 1);
  }

  @Test
  public void testClient_AutoDirectionHandler() {
    test("com.google.gwt.i18n.client.AutoDirectionHandler", 0, 0);
  }

  @Test
  public void testClient_CurrencyData() {
    test("com.google.gwt.i18n.client.CurrencyData", 1, 0.5);
  }

  @Test
  public void testRebind_AbstractResource() {
    test("com.google.gwt.i18n.rebind.AbstractResource", 1, 0);
  }

  @Test
  public void testShared_BidiFormatter() {
    test("com.google.gwt.i18n.shared.BidiFormatter", 1, 0);
  }

  @Test
  public void testShared_BidiFormatterBase() {
    test("com.google.gwt.i18n.shared.BidiFormatterBase", 1, 0);
  }

  @Test
  public void testShared_BidiUtils() {
    test("com.google.gwt.i18n.shared.BidiUtils", 1, 0);
  }

  // Not sure I know how to translate
  //  @Test
  //  public void testShared_GwtLocale() {
  //    test("com.google.gwt.i18n.shared.GwtLocale", 1, 1);
  //  }

  @Test
  public void testShared_RegExp() {
    test("com.google.gwt.regexp.shared.RegExp", 1, 1);
  }

  // All the following Safe* have a bad-written signature (equals())
  @Test
  public void testShared_SafeStyles() {
    test("com.google.gwt.safecss.shared.SafeStyles", 1, 1);
  }

  @Test
  public void testShared_SafeHtml() {
    test("com.google.gwt.safehtml.shared.SafeHtml", 1, 1);
  }

  @Test
  public void testShared_SafeUri() {
    test("com.google.gwt.safehtml.shared.SafeUri", 1, 1);
  }

  // Javadoc bug :) "Like nextToken(String) with no info" should be pointing to method public String
  // nextToken(Object info,
  //               String resolved) instead it's auto-reference
  //  @Test
  //  public void testRebind_Tokenator() {
  //    test("com.google.gwt.uibinder.rebind.Tokenator", 1, 1);
  //  }

  // Very nice but very complex comment:
  // Equivalent to calling setRowCount(int) with the length of the list of values,
  // setVisibleRange(Range) from 0 to
  // the size of the list of values, and setRowData(int, List) with a start of 0 and the specified
  // list of values.
  // Also "this method delegates to..."
  //  @Test
  //  public void testClient_AbstractHasData() {
  //    test("com.google.gwt.user.cellview.client.AbstractHasData", 1, 1);
  //  }

  // @deprecated
  //  @Test
  //  public void testClient_DOM() {
  //    test("com.google.gwt.user.client.DOM", 1, 1);
  //  }

  // @see
  //  @Test
  //  public void testUi_DockLayoutPanel() {
  //    test("com.google.gwt.user.client.ui.DockLayoutPanel", 1, 1);
  //  }

  // @see
  //  @Test
  //  public void testUi_DockPanel() {
  //    test("com.google.gwt.user.client.ui.DockPanel", 1, 1);
  //  }

  // voids...
  @Test
  public void testUi_ListBox() {
    test("com.google.gwt.user.client.ui.ListBox", 1, 0.2);
  }

  // This recall used to be slightly higher: check.
  @Test
  public void testRpc_RPC() {
    test("com.google.gwt.user.server.rpc.RPC", 1, 0.333);
  }

  @Test
  public void testImpl_TypeUtils() {
    test("com.google.web.bindery.autobean.vm.impl.TypeUtils", 1, 0);
  }

  @Test
  public void testShared_Request() {
    test("com.google.web.bindery.requestfactory.shared.Request", 0, 1);
  }

  @Test
  public void testTesting_FakeRequestFactory() {
    test("com.google.web.bindery.requestfactory.shared.testing.FakeRequestFactory", 1, 0);
  }
}
