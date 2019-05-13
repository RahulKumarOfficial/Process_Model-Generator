
public class Main {
	
	public static void main(String[] args){
		String filename = "c:\\a.xes.gz";
		XesXmlParser parser = new XesXmlParser();
		if(parser.canParse(new File(filename))){
			try {
				List<XLog> logs = parser.parse(new File(filename));
				XesLogParse x = new XesLogParse(logs.get(0));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}}

}
