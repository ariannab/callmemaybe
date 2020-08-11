package org.toradocu.accuracy.equivalences.dataset.executions;

import org.junit.Test;
import org.toradocu.testlib.AbstractPrecisionRecallTestSuite;

public class AccuracyHibernate5 extends AbstractPrecisionRecallTestSuite {
  private static final String HIBERNATE_5_SRC = "src/test/resources/hibernate-core-5.4.2-sources";
  private static final String HIBERNATE_5_BIN =
      "src/test/resources/bin/hibernate-core-5.4.2.jar:/Users/arianna/toradocu/src/test/resources/bin/javax.persistence-api-2.2.jar";
  private static final String HIBERNATE_5_GOAL_DIR = "expected-equivalences/hibernate";

  public AccuracyHibernate5() {
    super(HIBERNATE_5_SRC, HIBERNATE_5_BIN, HIBERNATE_5_GOAL_DIR);
  }

  @Test
  public void testStax_BufferedXMLEventReader() {
    test("org.hibernate.boot.jaxb.internal.stax.BufferedXMLEventReader", 1, 1);
  }

  @Test
  public void testXml_BufferedXMLEventReader() {
    test("org.hibernate.internal.util.xml.BufferedXMLEventReader", 1, 1);
  }

  @Test
  public void testCollections_BoundedConcurrentHashMap() {
    test("org.hibernate.internal.util.collections.BoundedConcurrentHashMap", 1, 1);
  }

  @Test
  public void testCollections_ConcurrentReferenceHashMap() {
    test("org.hibernate.internal.util.collections.ConcurrentReferenceHashMap", 1, 1);
  }

  @Test
  public void testCriterion_Example() {
    test("org.hibernate.criterion.Example", 1, 1);
  }

  @Test
  public void testSpi_BidirectionalEntityReference() {
    test("org.hibernate.loader.plan.spi.BidirectionalEntityReference", 1, 1);
  }

  @Test
  public void testSpi_EntityReferenceAliases() {
    test("org.hibernate.loader.plan.exec.spi.EntityReferenceAliases", 1, 1);
  }

  @Test
  public void testPagination_SQLServer2005LimitHandler() {
    test("org.hibernate.dialect.pagination.SQLServer2005LimitHandler", 1, 1);
  }

  @Test
  public void testJdbc_ResourceRegistry() {
    test("org.hibernate.resource.jdbc.ResourceRegistry", 1, 1);
  }

  @Test
  public void testSpi_MultiTenantConnectionProvider() {
    test("org.hibernate.engine.jdbc.connections.spi.MultiTenantConnectionProvider", 1, 1);
  }

  @Test
  public void testSpi_ResultSetReturn() {
    test("org.hibernate.engine.jdbc.spi.ResultSetReturn", 1, 1);
  }

  @Test
  public void testSpi_SubselectFetch() {
    test("org.hibernate.engine.spi.SubselectFetch", 1, 1);
  }

  @Test
  public void testHibernate_TypeHelper() {
    test("org.hibernate.TypeHelper", 1, 1);
  }
}
