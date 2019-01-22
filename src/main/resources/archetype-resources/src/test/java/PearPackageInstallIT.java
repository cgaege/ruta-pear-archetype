package ${package};

import java.io.File;

import org.apache.uima.pear.tools.PackageInstaller;
import org.junit.Test;

public class PearPackageInstallIT {

	@Test
	public void testInstallPearPackage() {
		
		File installDir = new File("target/generated-test-sources");
		File pearPackage = new File("target/${artifactId}-${version}.pear");
		
		PackageInstaller.installPackage(installDir, pearPackage, true);
	}

}
