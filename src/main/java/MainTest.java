
import org.apache.log4j.Logger;
import org.json.JSONObject;

public class MainTest {
	private static final String URL = "http://yourapp.com/";
	private final static Logger LOGGER = Logger.getLogger(MainTest.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JSONObject jsonObjSend = new JSONObject();

		try {
			jsonObjSend.put("storeId", "1");
			jsonObjSend.put("itemId", "1");
			JSONObject header = new JSONObject();
			jsonObjSend.put("header", header);
			
			LOGGER.info(jsonObjSend.toString(2));

		} catch (Exception e) {
			e.printStackTrace();
		}

		JSONObject jsonObjRecv = HttpClient.SendHttpPost(URL, jsonObjSend);

		System.out.println(jsonObjRecv);

	}
}