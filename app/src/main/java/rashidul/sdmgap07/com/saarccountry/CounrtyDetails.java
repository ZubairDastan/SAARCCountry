package rashidul.sdmgap07.com.saarccountry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CounrtyDetails extends AppCompatActivity {
    private ImageView imageView;
    private TextView countryName, countryDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counrty_details);
        imageView = findViewById(R.id.imgID);
        countryName= findViewById(R.id.countryNameID);
        countryDetail = findViewById(R.id.countryDetailsID);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null){
            imageView.setImageResource(bundle.getInt("flags"));
            countryName.setText(bundle.getString("country"));
            countryDetail.setText(bundle.getString("details"));
        }
    }
}
