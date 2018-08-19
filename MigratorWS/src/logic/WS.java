package logic;
public class WS {
	private String warName;
	private String webPath;
	private String wsdlName;
	private String directory;

	public String getDirectory() {
		return directory;
	}

	public void setDirectory(String directory) {
		this.directory = directory;
	}

	public String getWarName() {
		return warName;
	}

	public void setWarName(String filePath) {
		this.warName = filePath;
	}

	public String getWebPath() {
		return webPath;
	}

	public void setWebPath(String webPath) {
		this.webPath = webPath;
	}

	public String getWsdlName() {
		return wsdlName;
	}

	public void setWsdlName(String wsdlPath) {
		this.wsdlName = wsdlPath;
	}

}
