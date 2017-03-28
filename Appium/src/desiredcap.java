import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class desiredcap {

	@Test
	public void test() {
		DesiredCapabilities cap=new DesiredCapabilities();
			//Basic desired capabilities
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
	}

}
