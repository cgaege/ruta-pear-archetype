package de.customer.nlp;

import java.io.File;
import java.io.IOException;

import org.apache.uima.UIMAException;
import org.apache.uima.analysis_engine.AnalysisEngine;
import org.apache.uima.fit.factory.AnalysisEngineFactory;
import org.apache.uima.fit.factory.JCasFactory;
import org.apache.uima.jcas.JCas;
import org.apache.uima.pear.tools.PackageInstaller;
import org.junit.Test;

public class PearPackageInstallIT {

	@Test
	public void testInstallPearPackage() {
		
		File installDir = new File("target/generated-test-sources");
		File pearPackage = new File("target/MyAnnotator-1.pear");
		
		PackageInstaller.installPackage(installDir, pearPackage, true);
	}
	
	@Test
	public void testProcess() throws IOException, UIMAException {
		
		AnalysisEngine analysisEngine = AnalysisEngineFactory.createEngine("de/customer/nlp/MyAnnotatorRutaAnnotator");
		JCas jCas = JCasFactory.createJCas();
		jCas.setDocumentText("Test document text");
		
		analysisEngine.process(jCas);
	}

}
