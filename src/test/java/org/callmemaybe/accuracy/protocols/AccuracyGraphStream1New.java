// package org.callmemaybe.accuracy.protocols;
//
// import org.callmemaybe.testlib.AbstractPrecisionRecallTestSuite;
// import org.junit.Test;
//
// public class AccuracyGraphStream1New extends AbstractPrecisionRecallTestSuite {
//
//    private static final String GS_1_SRC =
// "/Users/arianna/toradocu/src/test/resources/gs-core-1.3-sources/";
//    private static final String GS_1_BIN =
// "/Users/arianna/toradocu/src/test/resources/bin/gs-core-1.3.jar";
//    private static final String GS_1_DIR = "expected-tp/gs-new";
//
//    public AccuracyGraphStream1New() {
//        super(GS_1_SRC, GS_1_BIN, GS_1_DIR);
//    }
//
//    @Test
//    public void testStream_PipeAdapter() {
//        test("org.graphstream.stream.PipeAdapter", 1, 1);
//    }
//
//    @Test
//    public void testStream_GraphParseException() {
//        test("org.graphstream.stream.GraphParseException", 1, 1);
//    }
//
//    @Test
//    public void testNet_URLSource() {
//        test("org.graphstream.stream.net.URLSource", 1, 1);
//    }
//
//    @Test
//    public void testNet_HTTPSource() {
//        test("org.graphstream.stream.net.HTTPSource", 1, 1);
//    }
//
//    @Test
//    public void testStream_SourceAdapter() {
//        test("org.graphstream.stream.SourceAdapter", 1, 1);
//    }
//
//    @Test
//    public void testStream_AttributeSink() {
//        test("org.graphstream.stream.AttributeSink", 1, 1);
//    }
//
//    @Test
//    public void testGml_GMLParserTokenManager() {
//        test("org.graphstream.stream.file.gml.GMLParserTokenManager", 1, 1);
//    }
//
//    @Test
//    public void testGml_GMLContext() {
//        test("org.graphstream.stream.file.gml.GMLContext", 1, 1);
//    }
//
//    @Test
//    public void testFile_FileSinkGraphML() {
//        test("org.graphstream.stream.file.FileSinkGraphML", 1, 1);
//    }
//
//    @Test
//    public void testTlp_TLPParserConstants() {
//        test("org.graphstream.stream.file.tlp.TLPParserConstants", 1, 1);
//    }
//
//    @Test
//    public void testTlp_TLPParser() {
//        test("org.graphstream.stream.file.tlp.TLPParser", 1, 1);
//    }
//
//    @Test
//    public void testTlp_TLPParserTokenManager() {
//        test("org.graphstream.stream.file.tlp.TLPParserTokenManager", 1, 1);
//    }
//
//    @Test
//    public void testFile_FileSinkFactory() {
//        test("org.graphstream.stream.file.FileSinkFactory", 1, 1);
//    }
//
//    @Test
//    public void testFile_FileSourceEdge() {
//        test("org.graphstream.stream.file.FileSourceEdge", 1, 1);
//    }
//
//    @Test
//    public void testFile_FileSinkTikZ() {
//        test("org.graphstream.stream.file.FileSinkTikZ", 1, 1);
//    }
//
//    @Test
//    public void testFile_FileSourceGEXF() {
//        test("org.graphstream.stream.file.FileSourceGEXF", 1, 1);
//    }
//
//    @Test
//    public void testDot_DOTParser() {
//        test("org.graphstream.stream.file.dot.DOTParser", 1, 1);
//    }
//
//    @Test
//    public void testDot_DOTParserConstants() {
//        test("org.graphstream.stream.file.dot.DOTParserConstants", 1, 1);
//    }
//
//    @Test
//    public void testDot_DOTParserTokenManager() {
//        test("org.graphstream.stream.file.dot.DOTParserTokenManager", 1, 1);
//    }
//
//
//    @Test
//    public void testPajek_PajekContext() {
//        test("org.graphstream.stream.file.pajek.PajekContext", 1, 1);
//    }
//
//    @Test
//    public void testPajek_PajekParserTokenManager() {
//        test("org.graphstream.stream.file.pajek.PajekParserTokenManager", 1, 1);
//    }
//
//    @Test
//    public void testPajek_PajekParserConstants() {
//        test("org.graphstream.stream.file.pajek.PajekParserConstants", 1, 1);
//    }
//
//    @Test
//    public void testPajek_PajekParser() {
//        test("org.graphstream.stream.file.pajek.PajekParser", 1, 1);
//    }
//
//    @Test
//    public void testFile_FileSourceXML() {
//        test("org.graphstream.stream.file.FileSourceXML", 1, 1);
//    }
//
//    @Test
//    public void testFile_FileSinkDOT() {
//        test("org.graphstream.stream.file.FileSinkDOT", 1, 1);
//    }
//
//    @Test
//    public void testFile_FileSourceParser() {
//        test("org.graphstream.stream.file.FileSourceParser", 1, 1);
//    }
//
//    @Test
//    public void testFile_FileSinkDGSFiltered() {
//        test("org.graphstream.stream.file.FileSinkDGSFiltered", 1, 1);
//    }
//
//    @Test
//    public void testFile_FileSourceDOT() {
//        test("org.graphstream.stream.file.FileSourceDOT", 1, 1);
//    }
//
//    @Test
//    public void testFile_FileSourceDGS1And2() {
//        test("org.graphstream.stream.file.FileSourceDGS1And2", 1, 1);
//    }
//
//    @Test
//    public void testFile_FileSourceGraphML() {
//        test("org.graphstream.stream.file.FileSourceGraphML", 1, 1);
//    }
//
//    @Test
//    public void testFile_FileSinkDynamicGML() {
//        test("org.graphstream.stream.file.FileSinkDynamicGML", 1, 1);
//    }
//
//    @Test
//    public void testFile_FileSinkSVG() {
//        test("org.graphstream.stream.file.FileSinkSVG", 1, 1);
//    }
//
//    @Test
//    public void testGexf_GEXFSpell() {
//        test("org.graphstream.stream.file.gexf.GEXFSpell", 1, 1);
//    }
//
//    @Test
//    public void testGexf_SmartXMLWriter() {
//        test("org.graphstream.stream.file.gexf.SmartXMLWriter", 1, 1);
//    }
//
//    @Test
//    public void testGexf_GEXFElement() {
//        test("org.graphstream.stream.file.gexf.GEXFElement", 1, 1);
//    }
//
//    @Test
//    public void testGexf_GEXFEdges() {
//        test("org.graphstream.stream.file.gexf.GEXFEdges", 1, 1);
//    }
//
//    @Test
//    public void testGexf_GEXFAttValues() {
//        test("org.graphstream.stream.file.gexf.GEXFAttValues", 1, 1);
//    }
//
//    @Test
//    public void testGexf_GEXFEdge() {
//        test("org.graphstream.stream.file.gexf.GEXFEdge", 1, 1);
//    }
//
//    @Test
//    public void testGexf_GEXFSpells() {
//        test("org.graphstream.stream.file.gexf.GEXFSpells", 1, 1);
//    }
//
//    @Test
//    public void testGexf_GEXFAttValue() {
//        test("org.graphstream.stream.file.gexf.GEXFAttValue", 1, 1);
//    }
//
//    @Test
//    public void testGexf_GEXFNodes() {
//        test("org.graphstream.stream.file.gexf.GEXFNodes", 1, 1);
//    }
//
//    @Test
//    public void testGexf_GEXFNode() {
//        test("org.graphstream.stream.file.gexf.GEXFNode", 1, 1);
//    }
//
//    @Test
//    public void testGexf_GEXFMeta() {
//        test("org.graphstream.stream.file.gexf.GEXFMeta", 1, 1);
//    }
//
//    @Test
//    public void testGexf_GEXFAttributes() {
//        test("org.graphstream.stream.file.gexf.GEXFAttributes", 1, 1);
//    }
//
//    @Test
//    public void testGexf_GEXF() {
//        test("org.graphstream.stream.file.gexf.GEXF", 1, 1);
//    }
//
//    @Test
//    public void testGexf_GEXFGraph() {
//        test("org.graphstream.stream.file.gexf.GEXFGraph", 1, 1);
//    }
//
//    @Test
//    public void testGexf_GEXFAttribute() {
//        test("org.graphstream.stream.file.gexf.GEXFAttribute", 1, 1);
//    }
//
//    @Test
//    public void testDgs_OldFileSourceDGS() {
//        test("org.graphstream.stream.file.dgs.OldFileSourceDGS", 1, 1);
//    }
//
//    @Test
//    public void testDgs_DGSParser() {
//        test("org.graphstream.stream.file.dgs.DGSParser", 1, 1);
//    }
//
//
//    @Test
//    public void testFile_FileSinkGML() {
//        test("org.graphstream.stream.file.FileSinkGML", 1, 1);
//    }
//
//    @Test
//    public void testFile_FileSourceDGS() {
//        test("org.graphstream.stream.file.FileSourceDGS", 1, 1);
//    }
//
//    @Test
//    public void testFile_FileSinkDGSUtility() {
//        test("org.graphstream.stream.file.FileSinkDGSUtility", 1, 1);
//    }
//
//    @Test
//    public void testFile_FileSourceTLP() {
//        test("org.graphstream.stream.file.FileSourceTLP", 1, 1);
//    }
//
//    @Test
//    public void testFile_FileSinkSVG2() {
//        test("org.graphstream.stream.file.FileSinkSVG2", 1, 1);
//    }
//
//
//
//    @Test
//    public void testFile_FileSourceNCol() {
//        test("org.graphstream.stream.file.FileSourceNCol", 1, 1);
//    }
//
//    @Test
//    public void testFile_FileSourcePajek() {
//        test("org.graphstream.stream.file.FileSourcePajek", 1, 1);
//    }
//
//    @Test
//    public void testFile_FileSourceGPX() {
//        test("org.graphstream.stream.file.FileSourceGPX", 1, 1);
//    }
//
//    @Test
//    public void testFile_FileSourceLGL() {
//        test("org.graphstream.stream.file.FileSourceLGL", 1, 1);
//    }
//
//    @Test
//    public void testFile_FileSinkGEXF2() {
//        test("org.graphstream.stream.file.FileSinkGEXF2", 1, 1);
//    }
//
//    @Test
//    public void testFile_FileSourceGML() {
//        test("org.graphstream.stream.file.FileSourceGML", 1, 1);
//    }
//
//    @Test
//    public void testFile_FileSinkGEXF() {
//        test("org.graphstream.stream.file.FileSinkGEXF", 1, 1);
//    }
//
//    @Test
//    public void testFile_FileSinkDGS() {
//        test("org.graphstream.stream.file.FileSinkDGS", 1, 1);
//    }
//
//    @Test
//    public void testStream_Sink() {
//        test("org.graphstream.stream.Sink", 1, 1);
//    }
//
//    @Test
//    public void testStream_Timeline() {
//        test("org.graphstream.stream.Timeline", 1, 1);
//    }
//
//    @Test
//    public void testStream_Pipe() {
//        test("org.graphstream.stream.Pipe", 1, 1);
//    }
//
//    @Test
//    public void testStream_SinkAdapter() {
//        test("org.graphstream.stream.SinkAdapter", 1, 1);
//    }
//
//    @Test
//    public void testStream_Replayable() {
//        test("org.graphstream.stream.Replayable", 1, 1);
//    }
//
//    @Test
//    public void testStream_Source() {
//        test("org.graphstream.stream.Source", 1, 1);
//    }
//
//    @Test
//    public void testStream_AnnotatedSink() {
//        test("org.graphstream.stream.AnnotatedSink", 1, 1);
//    }
//
//    @Test
//    public void testStream_GraphReplay() {
//        test("org.graphstream.stream.GraphReplay", 1, 1);
//    }
//
//    @Test
//    public void testSync_SinkTime() {
//        test("org.graphstream.stream.sync.SinkTime", 1, 1);
//    }
//
//    @Test
//    public void testSync_SourceTime() {
//        test("org.graphstream.stream.sync.SourceTime", 1, 1);
//    }
//
//    @Test
//    public void testStream_PipeBase() {
//        test("org.graphstream.stream.PipeBase", 1, 1);
//    }
//
//    @Test
//    public void testThread_ThreadProxyPipeOld() {
//        test("org.graphstream.stream.thread.ThreadProxyPipeOld", 1, 1);
//    }
//
//    @Test
//    public void testRmi_RMISource() {
//        test("org.graphstream.stream.rmi.RMISource", 1, 1);
//    }
//
//    @Test
//    public void testRmi_RMIAdapterOut() {
//        test("org.graphstream.stream.rmi.RMIAdapterOut", 1, 1);
//    }
//
//    @Test
//    public void testRmi_RMISink() {
//        test("org.graphstream.stream.rmi.RMISink", 1, 1);
//    }
//
//    @Test
//    public void testRmi_RMIAdapterIn() {
//        test("org.graphstream.stream.rmi.RMIAdapterIn", 1, 1);
//    }
//
//
//
//    @Test
//    public void testNetstream_NetStreamConstants() {
//        test("org.graphstream.stream.netstream.NetStreamConstants", 1, 1);
//    }
//
//    @Test
//    public void testNetstream_NetStreamSender() {
//        test("org.graphstream.stream.netstream.NetStreamSender", 1, 1);
//    }
//
//    @Test
//    public void testNetstream_DefaultNetStreamDecoder() {
//        test("org.graphstream.stream.netstream.DefaultNetStreamDecoder", 1, 1);
//    }
//
//    @Test
//    public void testPacking_NetStreamUnpacker() {
//        test("org.graphstream.stream.netstream.packing.NetStreamUnpacker", 1, 1);
//    }
//
//    @Test
//    public void testPacking_Base64Packer() {
//        test("org.graphstream.stream.netstream.packing.Base64Packer", 1, 1);
//    }
//
//    @Test
//    public void testPacking_Base64Unpacker() {
//        test("org.graphstream.stream.netstream.packing.Base64Unpacker", 1, 1);
//    }
//
//    @Test
//    public void testPacking_NetStreamPacker() {
//        test("org.graphstream.stream.netstream.packing.NetStreamPacker", 1, 1);
//    }
//
//    @Test
//    public void testStream_AttributePredicate() {
//        test("org.graphstream.stream.AttributePredicate", 1, 1);
//    }
//
//
// }
