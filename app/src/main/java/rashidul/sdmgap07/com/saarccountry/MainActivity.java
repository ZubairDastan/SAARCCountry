package rashidul.sdmgap07.com.saarccountry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private String[] countryName;
    private String[] countryDetails;
    private int[] flags = {R.drawable.afghanistan,
            R.drawable.bangladesh,
            R.drawable.bhutan,
            R.drawable.india,
            R.drawable.maldives,
            R.drawable.pakistan,
            R.drawable.nepal,
            R.drawable.srilanka};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listViewID);

        //find array
        countryName = getResources().getStringArray(R.array.countrName);
        countryDetails = getResources().getStringArray(R.array.countryDetails);

        //set adapter
        CustomAdapter adapter = new CustomAdapter(this, countryName, flags);
        listView.setAdapter(adapter);

        //settting a listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, CounrtyDetails.class);

                intent.putExtra("country", countryName[position]);
                intent.putExtra("details", countryDetails[position]);
                intent.putExtra("flags", flags[position]);
                startActivity(intent);
            }
        });

    }
}
