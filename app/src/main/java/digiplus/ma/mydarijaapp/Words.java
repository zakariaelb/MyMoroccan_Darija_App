package digiplus.ma.mydarijaapp;

public class Words {

    private String mDefaultTranslation;
    private String mDarijaTranslation;

    public Words(String DTranslation, String DefaultTranslation) {
                mDefaultTranslation = DefaultTranslation;
                mDarijaTranslation = DTranslation;
    }

    public String getDTranslation() {
        return mDarijaTranslation;
    }
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
}
