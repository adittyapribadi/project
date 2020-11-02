package com.klobot.amindermylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class CustomListActivity extends AppCompatActivity {

    private ListView listView;

    private String[] namaWanita = new String[]{
            "Izumi Sagiri", "Kurumi Tokisaki", "Megumi Kato", "Nishimiya Shouko",
            "Kaori Miyazono", "Mikasa Ackerman", "Nao Tomori",
            "Emilia", "Yatogami Tohka", "Yuuki Asuna", "Kosaki Onodera",
            "Rem", "Chika Fujiwara", "Chitoge Kirisaki", "Mio Akiyama",
            "Mai Sakurajima", "Touka Kirishima"
    };
    private String[] asal = new String[]{
            "Lombok", "Padang", "Yogyakarta", "Bangka",
            "Bandung", "Bengkulu","Lombok", "Padang", "Yogyakarta", "Bangka",
            "Bandung", "Bengkulu","Lombok", "Padang", "Yogyakarta", "Bangka",
            "Bandung", "Bengkulu","Lombok"
    };

    private int[] nim = new int[]{
            18112395,18112396,18112397,18112398,18112399,18112401,
            18112402,18112403,18112404,18112405,18112406,18112407,
            18112408,18112409,18112410,18112411,18112412
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);

        listView = findViewById(R.id.custom_listn_view);
        DataAdapter adapter = new DataAdapter(this,namaWanita,asal,nim);

        listView.setAdapter(adapter);


    }
}