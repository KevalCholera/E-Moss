package com.example.keval.e_moss;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.keval.e_moss.Utils.AdapterKioskCenter;

import org.json.JSONArray;
import org.json.JSONObject;

public class KioskCenter extends AppCompatActivity {

    ListView lvKioskCenter;
    AdapterKioskCenter adapterKioskCenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kiosk_center);

        JSONArray arrayKioskMain = new JSONArray();

        JSONObject objectKioskElement = new JSONObject();
        objectKioskElement.optString("userName", "Rajesh Bhai");
        objectKioskElement.optString("userAdd", "9,458,jaipur");
        objectKioskElement.optString("userNumber", "+91 1236547890");
        objectKioskElement.optString("userEmail", "rajesh@gmail.com");
        objectKioskElement.optString("userCategory", "N.A.");
        objectKioskElement.optString("userLat", "26.812615");
        objectKioskElement.optString("userLon", "75.542911");

        JSONObject objectKioskElement1 = new JSONObject();
        objectKioskElement.optString("userName", "Hari Bhai");
        objectKioskElement.optString("userAdd", "hshu,czjk,jaipur");
        objectKioskElement.optString("userNumber", "+91 7412589630");
        objectKioskElement.optString("userEmail", "hari@gmail.com");
        objectKioskElement.optString("userCategory", "N.A.");
        objectKioskElement.optString("userLat", "26.850240");
        objectKioskElement.optString("userLon", "75.635481");

        JSONObject objectKioskElement2 = new JSONObject();
        objectKioskElement.optString("userName", "hello Bhai");
        objectKioskElement.optString("userAdd", "9bcbhbd,vfjhvhfb,jaipur");
        objectKioskElement.optString("userNumber", "+91 4521479632");
        objectKioskElement.optString("userEmail", "hello@gmail.com");
        objectKioskElement.optString("userCategory", "N.A.");
        objectKioskElement.optString("userLat", "26.807279");
        objectKioskElement.optString("userLon", "75.806288");

        JSONObject objectKioskElement3 = new JSONObject();
        objectKioskElement.optString("userName", "KIOLO Bhai");
        objectKioskElement.optString("userAdd", "hcdhcjz,zczdckjzc,jaipur");
        objectKioskElement.optString("userNumber", "+91 1214587412");
        objectKioskElement.optString("userEmail", "kiolo@gmail.com");
        objectKioskElement.optString("userCategory", "N.A.");
        objectKioskElement.optString("userLat", "26.886130");
        objectKioskElement.optString("userLon", "75.746367");

        JSONObject objectKioskElement4 = new JSONObject();
        objectKioskElement.optString("userName", "kujiji Bhai");
        objectKioskElement.optString("userAdd", "kvjxx,hdvdx,jaipur");
        objectKioskElement.optString("userNumber", "+91 45214785");
        objectKioskElement.optString("userEmail", "kevgjk@gmail.com");
        objectKioskElement.optString("userCategory", "N.A.");
        objectKioskElement.optString("userLat", "26.886519");
        objectKioskElement.optString("userLon", "75.834123");

        JSONObject objectKioskElement5 = new JSONObject();
        objectKioskElement.optString("userName", "LOPOLO Bhai");
        objectKioskElement.optString("userAdd", "cjjhkdj,dhkdhk,jaipur");
        objectKioskElement.optString("userNumber", "+91 4125896325");
        objectKioskElement.optString("userEmail", "hfhfshdfk@gmail.com");
        objectKioskElement.optString("userCategory", "N.A.");
        objectKioskElement.optString("userLat", "26.870782");
        objectKioskElement.optString("userLon", "75.692110");

        JSONObject objectKioskElement6 = new JSONObject();
        objectKioskElement.optString("userName", "dhsjfhkf Bhai");
        objectKioskElement.optString("userAdd", "fsfhfkjs,fdsfjkh,jaipur");
        objectKioskElement.optString("userNumber", "+91 4521478965");
        objectKioskElement.optString("userEmail", "oijuhyu@gmail.com");
        objectKioskElement.optString("userCategory", "N.A.");
        objectKioskElement.optString("userLat", "26.895705");
        objectKioskElement.optString("userLon", "75.783491");

        JSONObject objectKioskElement7 = new JSONObject();
        objectKioskElement.optString("userName", "Ramesh Bhai");
        objectKioskElement.optString("userAdd", "hvjhkjd,fjdkhfdx,jaipur");
        objectKioskElement.optString("userNumber", "+91 5565656556");
        objectKioskElement.optString("userEmail", "ramesh@gmail.com");
        objectKioskElement.optString("userCategory", "N.A.");
        objectKioskElement.optString("userLat", "26.822683");
        objectKioskElement.optString("userLon", "75.543727");

        arrayKioskMain.put(objectKioskElement);
        arrayKioskMain.put(objectKioskElement1);
        arrayKioskMain.put(objectKioskElement2);
        arrayKioskMain.put(objectKioskElement3);
        arrayKioskMain.put(objectKioskElement4);
        arrayKioskMain.put(objectKioskElement5);
        arrayKioskMain.put(objectKioskElement6);
        arrayKioskMain.put(objectKioskElement7);

        lvKioskCenter = (ListView) findViewById(R.id.lvKioskCenter);
        adapterKioskCenter = new AdapterKioskCenter(this, arrayKioskMain);
        lvKioskCenter.setAdapter(adapterKioskCenter);

    }
}