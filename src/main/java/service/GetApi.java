package service;

import model.JsonData;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class GetApi {
    private static final String url = "https://coronavirus-19-api.herokuapp.com/countries/";
    private CloseableHttpClient client = HttpClients.createDefault();
    private String result;
    private JsonFormatter formatter = new JsonFormatter();

    public JsonData myLink(String country) throws Exception {
        HttpGet request = new HttpGet(url + country);
        CloseableHttpResponse response = client.execute(request);
        HttpEntity entity = response.getEntity();
        if (entity != null){
            result = EntityUtils.toString(entity);
            //response.close();
        }
        return formatter.formatJson(result);
    }
}
