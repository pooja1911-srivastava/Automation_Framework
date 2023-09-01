package reporting_tool;
import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.PatternLayout;
import org.testng.annotations.Test;

import freemarker.log.Logger;

public class Reporting_tool_3 
{
	@Test
	public void reports() throws IOException
	{
		Layout layout= new PatternLayout("%d%m%c%n");
		Appender append= new FileAppender(layout,"./reports/r1.log");
		BasicConfigurator.configure(append);
		Logger log = Logger.getLogger(this.getClass().getName());
		log.error("tc error");
		log.warn("warning while tc runs");
		log.info("info");
	}
}
