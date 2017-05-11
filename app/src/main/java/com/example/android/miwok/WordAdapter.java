package com.example.android.miwok;

import android.content.Context;
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

    public class WordAdapter extends ArrayAdapter <Word> {
    public WordAdapter(Context context, ArrayList<Word> words) {
        super(context, 0, words);
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
        englishWord.setText(currentwords.getEnglishWord);
        TextView miwokWord = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokWord.setText(currentwords.getMiwokWord());


        return listItemView;
    }
}

