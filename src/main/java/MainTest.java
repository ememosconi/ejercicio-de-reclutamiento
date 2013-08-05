
import org.apache.log4j.Logger;
import org.json.JSONObject;

public class MainTest {
	private static final String URL = "http://api.openweathermap.org/data/2.5/weather?q=Buenos%20Aires";
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

		JSONObject jsonObjRecv = HttpClient.SendHttp(URL, jsonObjSend);

		System.out.println(jsonObjRecv);

	}
}