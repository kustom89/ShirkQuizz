package cl.kustom89.shirkquizz;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super( fm );
    }



    //enganche para conectar el fragment con el section pager adapter
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return PartyFragment.newInstance();
            case 1:
                return LuckyFragment.newInstance();
            case 2:
                return MatchFragment.newInstance();
                default:
                    return PartyFragment.newInstance();
        }

    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }

    @Override
    //cambiale los titulos al getItem
    public CharSequence getPageTitle(int position) {
        switch (position ) {
            case 0:
                return "PArty";//mismo caso q getIntem misma posicion
            case 1:
                return "Lucky";
            case 2:
                return "Match";

        }
        return null;
    }
}
