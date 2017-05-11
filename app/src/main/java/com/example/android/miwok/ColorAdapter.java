package com.example.android.miwok;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Alexandra Mukhina on 11.05.2017.
 */

public class ColorAdapter extends ArrayAdapter <Color>  {
    public ColorAdapter( ColorsActivity context,   ArrayList<Color> colors) {
        super(context, 0, colors);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
      View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);

        }

        Color currentColor = getItem(position);

        TextView eColor = (TextView) listItemView.findViewById(R.id.default_text_view);
        eColor.setText(currentColor.geteColor());

        TextView mColor = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        mColor.setText(currentColor.getmColor());

        return listItemView;


    }
}
