package com.developer.imlv.languagelearn;

/**
 * Created by IMLV on 02-02-2018.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED =-1;

    public Word(String defaultTranslation,String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;

    }
    public Word(String defaultTranslation,String miwokTranslation,int imageresourceId){
        mDefaultTranslation =defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId =imageresourceId;

    }
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getmImageResourceId(){
        return mImageResourceId;
    }
    public boolean hasImage(){
        return mImageResourceId !=NO_IMAGE_PROVIDED;
    }




}
