package com.example.android.miwok;

/**
 * Created by diyahm-pl on 7/18/16.
 */
public class Word {
    private String defaultTranslation;
    private String miwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation){
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation(){
        return defaultTranslation;
    }

    public String getMiwokTranslation(){
        return miwokTranslation;
    }

    public void setDefaultTranslation(String defaultTranslation){
        this.defaultTranslation = defaultTranslation;
    }

    public void setMiwokTranslation(String miwokTranslation){
        this.miwokTranslation = miwokTranslation;
    }
}
