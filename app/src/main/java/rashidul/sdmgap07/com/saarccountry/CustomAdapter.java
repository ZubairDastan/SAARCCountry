package rashidul.sdmgap07.com.saarccountry;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    String[] countrName;
    int[] flags;
    Context context;
    private LayoutInflater inflater;

    CustomAdapter(Context context, String[] countrName, int[] flags) {
        this.context = context;
        this.countrName = countrName;
        this.flags = flags;
    }

    @Override
    public int getCount() {
        return countrName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.activity_custom_adapter, parent, false);
        }

        //find eimage and text
        ImageView imageView = convertView.findViewById(R.id.flgID);
        TextView textView = convertView.findViewById(R.id.countryID);

        //set image and text
        imageView.setImageResource(flags[position]);
        textView.setText(countrName[position]);

        return convertView;
    }
}
