package com.example.nlp;

import java.io.File;

import org.apache.uima.pear.tools.PackageInstaller;
import org.junit.Test;

public class PearPackageInstallIT {

	@Test
	public void testInstallPearPackage() {
		
		File installDir = new File("target/generated-test-sources");
		File pearPackage = new File("target/contract-annotator-0.1.0-SNAPSHOT.pear");
		
		PackageInstaller.installPackage(installDir, pearPackage, true);
	}

}
