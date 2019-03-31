package hello;

//import com.origamisoftware.teach.advanced.model.StockQuote;
//import com.origamisoftware.teach.advanced.util.Interval;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Calendar;
import java.util.List;

public class RestfulStockService implements StockService {

    @Override
    public StockQuote getQuote(String symbol) throws StockServiceException {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            URL url = new URL("http://localhost:8080");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

            String output;
            System.out.println("Output from server... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            conn.disconnect();

        } catch(IOException e) {
            throw new StockServiceException(e.getMessage());
        }
        System.out.println(stringBuffer.toString());
        return new StockQuote(new BigDecimal(100), Calendar.getInstance().getTime(), "APPL");
    }

    @Override
    public List<StockQuote> getQuote(String symbol, Calendar from, Calendar until, Interval interval) throws StockServiceException {
        return null;
    }
}
