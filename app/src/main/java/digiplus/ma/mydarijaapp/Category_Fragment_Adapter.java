package digiplus.ma.mydarijaapp;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class Category_Fragment_Adapter extends FragmentPagerAdapter {
    private Context mContext;
    public Category_Fragment_Adapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumberFragment();
        } else if (position == 1) {
            return new FamilyFragment();
        } else if (position == 2) {
            return new ColorsFragment();
        } else {
            return new PhrasesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.Numbers);
        } else if (position == 1) {
            return mContext.getString(R.string.Family);
        } else if (position == 2) {
            return mContext.getString(R.string.Colors);
        } else {
            return mContext.getString(R.string.Phrases);
        }
    }
}
