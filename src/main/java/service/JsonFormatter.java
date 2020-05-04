package service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.JsonData;

public class JsonFormatter {

    private ObjectMapper objectMapper;

    public JsonFormatter() {
        objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public JsonData formatJson(String json) {
        while (true) {
            try {
                return objectMapper.readValue(json, JsonData.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("Не удалось распарсить JSON", e);
            }
        }
    }

}
