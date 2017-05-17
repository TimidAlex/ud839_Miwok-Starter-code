package com.example.android.miwok;

/**
 * Created by Alexandra Mukhina on 11.05.2017.
 */
public class Word {


    private String getEnglishWord;
    private String getMiwokWord;
    private Integer getImage = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
   private  int mediaPlayer;


    public Word (String eWord,String mWord, Integer image, Integer MP ) {

        getEnglishWord = eWord;
        getMiwokWord = mWord;
        getImage = image;
        mediaPlayer = MP;



    }

    public Word (String eWord, String mWord,Integer MP ) {

        getEnglishWord = eWord;
        getMiwokWord = mWord;
        mediaPlayer = MP;

    }

    public String getMiwokWord () {return  getMiwokWord;}
    public String getEnglishWord () {return getEnglishWord;}
    public Integer getGetImage () { return getImage;}
    public  int getMP() {return mediaPlayer;}

    public Boolean hasImage () {return getImage != NO_IMAGE_PROVIDED ;}
}
;
