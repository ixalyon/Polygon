import java.io.IOException;

import us.monoid.web.Resty;


public class Forex {
    public static void main(String[] args) throws IOException {
    //	for(int i = 0 ; i < 100 ; i++)
    		CurrencyQuotes("GBP/USD", "Xs9_inK7TbwPZuzkl_4grrKh6mn8YB18IdnCEI");
    }


	static void CurrencyQuotes(String pair,String api) throws IOException{
		StringBuilder sb = new StringBuilder("https://api.polygon.io/v1/last_quote/currencies/"+pair+"?apiKey="+api);

		Resty r = new Resty();

		Object name = r.text(sb.toString());
		System.out.println(name.toString());
		
	}

}