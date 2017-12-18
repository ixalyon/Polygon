import java.io.IOException;

import us.monoid.json.JSONException;
import us.monoid.web.JSONResource;
import us.monoid.web.Resty;


public class Forex {
    public static void main(String[] args) throws IOException, JSONException {
    	long time=0;
    	String s;
		for(int i = 0 ; i < 100 ; i++) {
	    		s =CurrencyQuotes("GBP/USD", "Xs9_inK7TbwPZuzkl_4grrKh6mn8YB18IdnCEI");
	    		System.out.println(time-(time=Long.parseLong(s)));
		}
    }


	static String CurrencyQuotes(String pair,String api) throws IOException, JSONException{
		StringBuilder sb = new StringBuilder("https://api.polygon.io/v1/last_quote/currencies/"+pair+"?apiKey="+api);
		Resty r = new Resty();

		JSONResource name = r.json(sb.toString());
		String s=name.toObject().getJSONObject("last").get("timestamp").toString();
//		System.out.println(s);
		
		return s;
	}

}