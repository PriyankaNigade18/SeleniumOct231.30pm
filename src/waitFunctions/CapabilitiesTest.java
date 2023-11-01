package waitFunctions;

import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapabilitiesTest {

	public static void main(String[] args)
	{

		ChromeDriver driver=new ChromeDriver();
		
		Capabilities cap=driver.getCapabilities();
		System.out.println("Browser name: "+cap.getBrowserName());
		System.out.println("Browser version: "+cap.getBrowserVersion());
		System.out.println("Platform name: "+cap.getPlatformName());
		
		//get all capabilities -asMap
		Map<String,Object> pop=cap.asMap();
		
		System.out.println(pop);
		/*
		 * {acceptInsecureCerts=false,
		 *  browserName=chrome, 
		 *  browserVersion=118.0.5993.118, 
		 *  chrome={chromedriverVersion=118.0.5993.70 (e52f33f30b91b4ddfad649acddc39ab570473b86-refs/branch-heads/5993@{#1216}),
		 *   userDataDir=C:\Users\Ganes\AppData\Local\Temp\scoped_dir16556_92926745},
		 *    fedcm:accounts=true, goog:chromeOptions={debuggerAddress=localhost:51505}, 
		 *    networkConnectionEnabled=false,
		 *     pageLoadStrategy=normal,
		 *      platformName=windows,
		 *       proxy=Proxy(), se:cdp=ws://localhost:51505/devtools/browser/b7a9ddd2-8605-496e-95af-3cc809e72322,
		 *        se:cdpVersion=118.0.5993.118, 
		 *        setWindowRect=true, 
		 *        strictFileInteractability=false, 
		 *        timeouts={implicit=0, pageLoad=300000, script=30000},
		 *         unhandledPromptBehavior=dismiss and notify, 
		 *         webauthn:extension:credBlob=true,
		 *          webauthn:extension:largeBlob=true, 
		 *          webauthn:extension:minPinLength=true, 
		 *          webauthn:extension:prf=true, 
		 *  webauthn:virtualAuthenticators=true}

		 */
		
		
		
		
		
		
		

	}

}
