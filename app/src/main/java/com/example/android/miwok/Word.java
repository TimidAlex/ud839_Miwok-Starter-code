package com.example.android.miwok;

/**
 * Created by Alexandra Mukhina on 11.05.2017.
 */
public class Word {


    private String getEnglishWord;
    private String getMiwokWord;
    private Integer getImage = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;


    public Word (String eWord,String mWord, Integer image ) {

        getEnglishWord = eWord;
        getMiwokWord = mWord;
        getImage = image;


    }

    public Word (String eWord, String mWord) {

        getEnglishWord = eWord;
        getMiwokWord = mWord;

    }

    public String getMiwokWord () {return  getMiwokWord;}
    public String getEnglishWord () {return getEnglishWord;}
    public Integer getGetImage () { return getImage;}

    public Boolean hasImage () {return getImage != NO_IMAGE_PROVIDED ;}
}
;
