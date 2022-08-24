package utils;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class JsonReader {
    public static Object[][] getJSONData(String JSON_path, String JSON_Data, int JSON_attributes) throws IOException, ParseException {
        Object object = new JSONParser().parse(new FileReader(JSON_path));
        JSONObject jsonObject = (JSONObject) object;
        JSONArray jsonArray = (JSONArray) jsonObject.get(JSON_Data);
        Object[][] arr = new String[jsonArray.size()][JSON_attributes];
        for (int i = 0; i < jsonArray.size(); i++){
            JSONObject object1 = (JSONObject) jsonArray.get(i);
            arr[i][0] = String.valueOf(object1.get("TaskName"));
            arr[i][1] = String.valueOf(object1.get("TaskNote"));

        }
        return arr;


    }
}
