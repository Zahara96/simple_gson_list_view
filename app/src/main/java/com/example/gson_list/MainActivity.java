package com.example.gson_list;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {


    ListView listView;

    String json =  "{[\n" +
            "\t{\n" +
            "\t\tcolor: \"red\",\n" +
            "\t\tvalue: \"#f00\"\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\tcolor: \"green\",\n" +
            "\t\tvalue: \"#0f0\"\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\tcolor: \"blue\",\n" +
            "\t\tvalue: \"#00f\"\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\tcolor: \"cyan\",\n" +
            "\t\tvalue: \"#0ff\"\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\tcolor: \"magenta\",\n" +
            "\t\tvalue: \"#f0f\"\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\tcolor: \"yellow\",\n" +
            "\t\tvalue: \"#ff0\"\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\tcolor: \"black\",\n" +
            "\t\tvalue: \"#000\"\n" +
            "\t}\n" +
            "]}";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list_view1);


        Gson gson = new Gson();
        ArrayList<Color> colors= new ArrayList<>();

        JSONArray jobjColors = null;

        try {
            jobjColors = new JSONArray(json);
            for (int i =0; i<jobjColors.length(); i++) {

                Color color = gson.fromJson(jobjColors.get(i).toString(), Color.class);
                colors.add(color);

            }

            ColorAdapter adapter = new ColorAdapter(this, colors);
            listView.setAdapter(adapter);




        } catch (JSONException e) {
            e.printStackTrace();
        }



    }

/*
    public class Color {
        public String color;
        public String value;

        public Color(String color, String value) {
            this.color = color;
            this.value = value;
        }
    }

 */

    class Color{
        public String color;
        public   String value;

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }











/*

        Gson gson = new Gson();
        String json =  "{{\"age\":30,\"firstName\":\"John\",\"mail\":\"john@gmail.com\"}";
        Employee employee = gson.fromJson(json,Employee.class);


        Gson gson = new Gson();
        Address address = new Address("Sri Lanka","Colombo");

        List<FamilyMember> family = new ArrayList<>();
        family.add(new FamilyMember("Wife",30));
        family.add(new FamilyMember("Daughter",5));


        Employee employee = new Employee("John",30, "john@gmail.com",address,family);
        String json =gson.toJson(employee);


        String json =  "{{\"age\":30,\"firstName\":\"John\",\"mail\":\"john@gmail.com\"}";
        Employee employee = gson.fromJson(json,Employee.class);

 */








}


