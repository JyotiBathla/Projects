package LaunchWebsite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigProperties {
	
	public static Properties ReadConfigProperty() throws Exception{
		
		File file = new File("C:\\Users\\admin\\workspace\\WebLaunch\\src\\LaunchWebsite\\config.ptoperties");
		FileInputStream fs = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fs);
		return prop;
	}

}
