package notepad.modular;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import javax.swing.JTabbedPane;
import javax.swing.SwingWorker;


public class ReadFile extends SwingWorker<String, String>   // first generic represents the type of object returned when the worker has finished working
{															// second generic represents the type of information that worker uses to update the application (publish)
	private File file;
	private JTabbedPane tab;
	private InputStream inputStream;
	public ReadFile(File _file, JTabbedPane _tab)
	{
		file = _file;
		tab = _tab;
	}
	
	  @Override
	  protected String doInBackground() throws Exception 
	  {	    
		  long byteLength = file.length();    // get length of the file in bytes
		  try {
                      inputStream = new FileInputStream(file);
		      byte[] content = new byte[(int) (byteLength/5)]; 
		      int bytesRead = -1;
		      long totalBytes = 0;
		      while ((bytesRead = inputStream.read(content)) != -1)
		      {
                          totalBytes += bytesRead;
		    	  setProgress(Math.round(((float) totalBytes / (float) byteLength) * 100f));
		    	  String text = new String(content, 0, bytesRead);
		    	  publish(text);
		    	 ((Panel)tab.getComponentAt(tab.getComponentCount() - 1)).append(text);
		      }
		      inputStream.close();
		  }catch(FileNotFoundException ex){}
		return null;
	  }
	  
	  @Override
	  protected void process(List<String> chunks){
 
          }
	  @Override
	  protected void done(){}
	
}