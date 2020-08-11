package org.toradocu.accuracy.equivalences.dataset;

import org.junit.Test;
import org.toradocu.testlib.AbstractPrecisionRecallTestSuite;

public class AccuracyJDK8NoSBES extends AbstractPrecisionRecallTestSuite {
  private static final String JDK_8_SRC =
      "/Users/arianna/toradocu/src/test/resources/jdk8-sources/src/share/classes";
  private static final String JDK_8_BIN =
      "/Users/arianna/toradocu/src/test/resources/bin/jdk8-2.9.0.jar";
  private static final String JDK_8_GOAL_DIR = "expected-equivalences/jdk";

  public AccuracyJDK8NoSBES() {
    super(JDK_8_SRC, JDK_8_BIN, JDK_8_GOAL_DIR);
  }

  @Test
  public void testUtil_SimpleTimeZone() {
    test("java.util.SimpleTimeZone", 1, 1);
  }

  @Test
  public void testUtil_TimeZone() {
    test("java.util.TimeZone", 1, 0);
  }

  @Test
  public void testUtil_ArrayDeque() {
    test("java.util.ArrayDeque", 0.9, 1);
  }

  @Test
  public void testConcurrent_LinkedBlockingDeque() {
    test("java.util.concurrent.LinkedBlockingDeque", 1, 1);
  }

  //    @Test
  //    public void testUtil_Currency() {
  //        test("java.util.Currency", 1, 1);
  //    }

  @Test
  public void testUtil_Deque() {
    test("java.util.Deque", 0.9, 1);
  }

  @Test
  public void testIo_DataInputStream() {
    test("java.io.DataInputStream", 1, 0);
  }

  @Test
  public void testIo_InputStream() {
    test("java.io.InputStream", 1, 0);
  }

  //    @Test
  //    public void testIo_File() {
  //        test("java.io.File", 1, 1);
  //    }

  //    @Test
  //    public void testTemporal_Temporal() {
  //        test("java.time.temporal.Temporal", 1, 1);
  //    }

  //    @Test
  //    public void testTemporal_TemporalAdjusters() {
  //        test("java.time.temporal.TemporalAdjusters", 1, 1);
  //    }

  @Test
  public void testTime_Instant() {
    test("java.time.Instant", 0.5, 1);
  }

  @Test
  public void testChrono_IsoChronology() {
    test("java.time.chrono.IsoChronology", 1, 0.857);
  }

  @Test
  public void testTime_LocalTime() {
    test("java.time.LocalTime", 0.333, 1);
  }

  @Test
  public void testTime_YearMonth() {
    test("java.time.YearMonth", 0.5, 1);
  }

  @Test
  public void testTime_Year() {
    test("java.time.Year", 0.5, 1);
  }

  //    @Test
  //    public void testTime_MonthDay() {
  //        test("java.time.MonthDay", 1, 1);
  //    }

  @Test
  public void testTime_OffsetDateTime() {
    test("java.time.OffsetDateTime", 0.5, 1);
  }

  @Test
  public void testFormat_DateTimeFormatterBuilder() {
    test("java.time.format.DateTimeFormatterBuilder", 0, 0);
  }

  @Test
  public void testTime_Clock() {
    test("java.time.Clock", 1, 1);
  }

  //    @Test
  //    public void testLang_System() {
  //        test("java.lang.System", 1, 1);
  //    }

  //    @Test
  //    public void testReflect_Field() {
  //        test("java.lang.reflect.Field", 1, 1);
  //    }

  //    @Test
  //    public void testManagement_RuntimeMXBean() {
  //        test("java.lang.management.RuntimeMXBean", 1, 1);
  //    }

  //    @Test
  //    public void testManagement_OperatingSystemMXBean() {
  //        test("java.lang.management.OperatingSystemMXBean", 1, 1);
  //    }

  @Test
  public void testLang_String() {
    test("java.lang.String", 1, 1);
  }

  @Test
  public void testLang_Math() {
    test("java.lang.Math", 0.714, 0.714);
  }

  //    @Test
  //    public void testAwt_Graphics2D() {
  //        test("java.awt.Graphics2D", 1, 1);
  //    }

  //    @Test
  //    public void testAwt_Point() {
  //        test("java.awt.Point", 1, 1);
  //    }

  //    @Test
  //    public void testPrint_PrinterJob() {
  //        test("java.awt.print.PrinterJob", 1, 1);
  //    }

  //    @Test
  //    public void testImage_WritableRenderedImage() {
  //        test("java.awt.image.WritableRenderedImage", 1, 1);
  //    }

  @Test
  public void testImage_VolatileImage() {
    test("java.awt.image.VolatileImage", 0, 0);
  }

  @Test
  public void testGeom_AffineTransform() {
    test("java.awt.geom.AffineTransform", 1, 1);
  }
}
