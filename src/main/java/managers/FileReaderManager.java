package managers;

import dataProviders.ConfigFileReader;

/*
The FileReaderManager:  class maintains a static reference to its own instance and returns that reference from the static getInstance() method.
FileReaderManager:  implements a private constructor so clients cannot instantiate FileReaderManager instances.
getConfigReader():  method returns the instance of the ConfigFileReader but this method is not static. So that client has to use the getInstance() method to access other public methods of the FileReaderManager like FileReaderManager.getInstance().getConfigReader()
 */

public class FileReaderManager {
	private static FileReaderManager fileReaderManager = new FileReaderManager();
	 private static ConfigFileReader configFileReader;
	 
	 private FileReaderManager() {
	 }
	 
	 public static FileReaderManager getInstance( ) {
	       return fileReaderManager;
	 }
	 
	 public ConfigFileReader getConfigReader() {
	 return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
	 }
}
