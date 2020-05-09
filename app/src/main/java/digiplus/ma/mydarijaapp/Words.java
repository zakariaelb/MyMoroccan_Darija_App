package digiplus.ma.mydarijaapp;

public class Words {

    private String mDefaultTranslation;

    private String mDarijaTranslation;

    public Words(String DefaultTranslation, String DarijaTranslation) {
                mDefaultTranslation = DefaultTranslation;
                mDarijaTranslation = DarijaTranslation;
    }

    public String getDarijaTranslation() {
        return mDarijaTranslation;
    }
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
}
