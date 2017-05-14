package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Alexandra Mukhina on 11.05.2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int colors;
    public WordAdapter(Context context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        colors = colorResourceId  ;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }


        Word currentwords = getItem(position);

        TextView englishWord = (TextView) listItemView.findViewById(R.id.default_text_view);
        englishWord.setText(currentwords.getEnglishWord());
        TextView miwokWord = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokWord.setText(currentwords.getMiwokWord());


        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imagePic);
        if ( currentwords.hasImage()) {
            imageView.setImageResource(currentwords.getGetImage());
        }
        else imageView.setVisibility( (View.GONE));

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),colors);
        textContainer.setBackgroundColor(color);


        return listItemView;
    }
}

