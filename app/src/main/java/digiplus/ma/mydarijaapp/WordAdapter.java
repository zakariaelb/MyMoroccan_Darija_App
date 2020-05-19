package digiplus.ma.mydarijaapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Words> {

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    public WordAdapter(Activity context, ArrayList<Words> items_Adapter) {
        super(context, 0, items_Adapter);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_items, parent, false);
        }

    /** @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //return super.getView(position, convertView, parent);
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_items, parent, false);
        }
        */

        Words CurrentWordPosition = getItem(position);
        TextView DarijaTextView = (TextView) listItemView.findViewById(R.id.darija_translate);
        DarijaTextView.setText(CurrentWordPosition.getDTranslation());

        TextView DefaultTextView = (TextView) listItemView.findViewById(R.id.default_translate);
        DefaultTextView.setText(CurrentWordPosition.getDefaultTranslation());
        return listItemView;
    }
}
