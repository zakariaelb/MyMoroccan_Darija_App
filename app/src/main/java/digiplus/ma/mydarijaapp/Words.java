package digiplus.ma.mydarijaapp;

public class Words {

    private String mDefaultTranslation;
    private String mDarijaTranslation;
    private int  mImage = NO_IMAGE;
    public static final int NO_IMAGE = -1;

    public Words(String DTranslation, String DefaultTranslation) {
        mDefaultTranslation = DefaultTranslation;
        mDarijaTranslation = DTranslation;
    }

    public Words(int Image, String DTranslation, String DefaultTranslation) {
                mDefaultTranslation = DefaultTranslation;
                mDarijaTranslation = DTranslation;
                mImage = Image;
    }

    public String getDTranslation() {
        return mDarijaTranslation;
    }
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    public int getImage(){return mImage;}
    public boolean HasImage(){ return mImage != NO_IMAGE;}
}
