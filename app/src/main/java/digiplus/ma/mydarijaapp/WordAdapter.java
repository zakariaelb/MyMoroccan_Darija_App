package digiplus.ma.mydarijaapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Words> {

    public WordAdapter(Activity context, ArrayList<Words> itemsAdapter) {
        super(context, 0, itemsAdapter);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //return super.getView(position, convertView, parent);
        /*             */
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_items, parent, false);
        }
        Words CurrentWords = getItem(position);

        //TextView DarijaTextView = (TextView) listItemView.findViewById(R.id.darija_translate);
        //DarijaTextView.setText(CurrentWords.getDarijaTranslation());
        //>>
        TextView DefaultTextView = (TextView) listItemView.findViewById(R.id.default_translate);
        DefaultTextView.setText(CurrentWords.getDefaultTranslation());
        return listItemView;
    }
}
