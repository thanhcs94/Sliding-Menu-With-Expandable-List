package thanhcs94;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.MenuItem;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

import java.util.ArrayList;



public class MainActivity extends SherlockFragmentActivity implements ExpandableListView.OnChildClickListener {


    private SlidingMenu menu;
    private ExpandableListView drawerList;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        SlidingMenu menu = new SlidingMenu(this);
        menu.setMode(SlidingMenu.LEFT);
        menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
       // menu.setFadeDegree(0.35f);
        menu.attachToActivity(this, SlidingMenu.SLIDING_WINDOW);
        menu.setMenu(R.layout.sidemenu);
        menu.setBackgroundColor(Color.parseColor("#ffffff"));
        menu.setBehindWidthRes(R.dimen.slidingmenu_behind_width);
        menu.setSelectorDrawable(R.drawable.sidemenu_items_background);

        setGroupData();
        setChildGroupData();
        drawerList = (ExpandableListView) findViewById(R.id.sidemenu);

        drawerList.setAdapter(new NewAdapter(this, groupItem, childItem));

        drawerList.setOnChildClickListener(this);
       // dl = (DrawerLayout)findViewById(R.id.drawer_layout);
//        ((ExpandableListView) findViewById(R.id.sidemenu)).setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                menuToggle();
//
//                if (currentMenuPosition != position)
//                  //  changeFragment(position);
//
//                currentMenuPosition = position;
//            }
//        });


        this.menu = menu;

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

//    public void setGroupData() {
//        groupItem.add("Live TV");
//        groupItem.add("Phim");
//        groupItem.add("TV Show");
//        groupItem.add("Các chức năng khác");
//        groupItem.add("Liên hệ hỗ trợ");
//        groupItem.add("Chia sẻ bạn bè");
//    }

    public void setGroupData() {
        groupItem.add("Languages");
        groupItem.add("Phone");
        groupItem.add("Mobile");
        groupItem.add("Contact");
        groupItem.add("About");
        groupItem.add("Share");
    }

    ArrayList<String> groupItem = new ArrayList<String>();
    ArrayList<Object> childItem = new ArrayList<Object>();

    public void setChildGroupData() {
        /**
         * Add Data For TecthNology
         */
        ArrayList<String> child = new ArrayList<String>();
        child.add("Java");
        child.add("Drupal");
        child.add(".Net Framework");
        child.add("PHP");
        childItem.add(child);

        /**
         * Add Data For Mobile
         */
        child = new ArrayList<String>();
        child.add("Android");
        child.add("Window Mobile");
        child.add("iPHone");
        child.add("Blackberry");
        childItem.add(child);
        /**
         * Add Data For Manufacture
         */
        child = new ArrayList<String>();
        child.add("HTC");
        child.add("Apple");
        child.add("Samsung");
        child.add("Nokia");
        childItem.add(child);
        /**
         * Add Data For Extras
         */
        child = new ArrayList<String>();
        childItem.add(child);

        /**
         * Add Data For Extras
         */
        child = new ArrayList<String>();
        child.add("Contact Us");
        child.add("About Us");
        child.add("Location");
        child.add("Root Cause");
        childItem.add(child);

        /**
         * Add Data For Extras
         */
        child = new ArrayList<String>();
        child.add("Contact Us");
        child.add("About Us");
        child.add("Location");
        child.add("Root Cause");
        childItem.add(child);
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if(menu.isMenuShowing()){
                menu.toggle(true);
                return false;
            }
        }
        return super.onKeyDown(keyCode, event);
    }

    private void changeFragment(int position) {
        switch (position) {
            case 0:
                showFragment(new FirstFragment());
                break;
            case 1:
                showFragment(new SecondFragment());
                break;
        }
    }

    private void showFragment(Fragment currentFragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.container, currentFragment)
                .commit();
    }

    public SlidingMenu getMenu() {
        return menu;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                menuToggle();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
//
    public void menuToggle(){
        if(menu.isMenuShowing())
            menu.showContent();
        else
            menu.showMenu();
  }


    @Override
    public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long l) {
        Toast.makeText(this, "Clicked On Child" + view.getTag(),
                Toast.LENGTH_SHORT).show();
        return false;
    }
}

