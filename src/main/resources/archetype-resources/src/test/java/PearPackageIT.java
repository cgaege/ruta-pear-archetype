package ${package};

import java.io.File;
import java.io.IOException;

import org.apache.uima.UIMAException;
import org.apache.uima.analysis_engine.AnalysisEngine;
import org.apache.uima.fit.factory.AnalysisEngineFactory;
import org.apache.uima.fit.factory.JCasFactory;
import org.apache.uima.jcas.JCas;
import org.apache.uima.pear.tools.PackageInstaller;
import org.junit.Test;

/*
 * This integration test ensures that the annotator PEAR package fulfills
 * the minimal requirements to be installed by the UIMA PackageInstaller 
 * and to process text
 */
public class PearPackageIT {

	/*
	 * Make sure that the annotator PEAR package 
	 * can be installed by the UIMA PackageInstaller
	 */
	@Test
	public void testInstallPearPackage() {
		
		File installDir = new File("target/generated-test-sources");
		File pearPackage = new File("target/${artifactId}-${version}.pear");
		
		PackageInstaller.installPackage(installDir, pearPackage, true);
	}
	
	/*
	 * Make sure that the annotator is able to 
	 * process text without exceptions
	 */
	@Test
	public void testProcess() throws IOException, UIMAException {
		
		AnalysisEngine analysisEngine = AnalysisEngineFactory.createEngine("${packageInPathFormat}/${artifactId}RutaAnnotator");
		JCas jCas = JCasFactory.createJCas();
		jCas.setDocumentText("Test document text");
		
		analysisEngine.process(jCas);
	}

}
