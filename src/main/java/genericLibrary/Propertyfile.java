package genericLibrary;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
public class Propertyfile {
	
	public String getPropertydata(String key) throws IOException
	{
		Properties p = new Properties();
	 FileInputStream fis = new FileInputStream(IPathConstant.propertyfilepath);
	 p.load(fis);
	 return p.getProperty(key);
	}

}