package com.example.asif.testasynctask;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listToBeShown;

    private String [] texts = {"BANGLADESH","AMERICA","JAPAN","CANADA",
            "CHINA","NEWZELAND","AUSTRALIA","UGANDA","SOUTH AFRICA",
            "BRAZIL","ARGENTINA","COLUMBIA","UGANDA","SOUTH AFRICA",
            "BRAZIL","AMERICA","JAPAN","CANADA","CHINA","NEWZELAND",
            "UGANDA","SOUTH AFRICA","BRAZIL","ARGENTINA", "BANGLADESH",
            "AMERICA","JAPAN","CANADA","CHINA","NEWZELAND","NEWZELAND",
            "UGANDA","SOUTH AFRICA","BRAZIL","ARGENTINA", "JAPAN",
            "CANADA","CHINA","NEWZELAND","UGANDA","SOUTH AFRICA","UK"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listToBeShown = (ListView) findViewById(R.id.sampleListView);
//        Adapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, new ArrayList<String>());
//        listToBeShown.setAdapter((ListAdapter) adapter);

        listToBeShown.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, new ArrayList<String>()));

        //new TestClassAsyncTask2().execute();
    }


    /*
     class TestClassAsyncTask extends AsyncTask {

        private ArrayAdapter<String> adapter;
        @Override
        protected void onPreExecute() {
            adapter = (ArrayAdapter<String>) listToBeShown.getAdapter();
        }
        @Override
        protected Object doInBackground(Object[] objects) {
            for(String item: texts){
                publishProgress(item);
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Object[] values) {
            super.onProgressUpdate(values[0]);
        }

        @Override
        protected void onPostExecute(Object o) {
            Toast.makeText(MainActivity.this,"successful",Toast.LENGTH_LONG).show();
        }

    }
    */
}
