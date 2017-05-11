package com.example.android.miwok;

/**
 * Created by Alexandra Mukhina on 11.05.2017.
 */

public class Word {


    public String getEnglishWord;
    public String getMiwokWord;


    public Word (String eWord,String mWord ) {

        getEnglishWord = eWord;
        getMiwokWord = mWord;

    }

    public String getMiwokWord () {return  getMiwokWord;}
    public String getEnglishWord () {return getEnglishWord;}
    }
;
