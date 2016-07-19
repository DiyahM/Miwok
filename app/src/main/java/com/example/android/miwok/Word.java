package com.example.android.miwok;

/**
 * Created by diyahm-pl on 7/18/16.
 */
public class Word {
    private String defaultTranslation;
    private String miwokTranslation;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int imageResourceId = NO_IMAGE_PROVIDED;

    public Word(String defaultTranslation, String miwokTranslation){
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imageResourceId = imageResourceId;
    }

    public String getDefaultTranslation(){
        return defaultTranslation;
    }

    public String getMiwokTranslation(){
        return miwokTranslation;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }

    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

    public void setDefaultTranslation(String defaultTranslation){
        this.defaultTranslation = defaultTranslation;
    }

    public void setMiwokTranslation(String miwokTranslation){
        this.miwokTranslation = miwokTranslation;
    }
}
