package thanhcs94;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerColorAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 3;

    public ViewPagerColorAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int arg0) {
        FragmentTabColor fragmentTabColor = new FragmentTabColor();

        switch (arg0) {
            case 0:
                fragmentTabColor.setColor(Color.RED);
                break;
            case 1:
                fragmentTabColor.setColor(Color.GREEN);
                break;
            case 2:
                fragmentTabColor.setColor(Color.BLUE);
                break;
        }

        return fragmentTabColor;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}
