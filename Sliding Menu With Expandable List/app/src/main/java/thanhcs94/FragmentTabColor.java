package thanhcs94;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.actionbarsherlock.app.SherlockFragment;


public class FragmentTabColor extends SherlockFragment {

    private static final String COLOR = "color";

    private int color;

    public FragmentTabColor() {
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        if(savedInstanceState != null)
            color = savedInstanceState.getInt(COLOR);

        View view = inflater.inflate(R.layout.fragment_second_color, container, false);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        imageView.setBackgroundColor(color);

        return view;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        setUserVisibleHint(true);
        outState.putInt(COLOR, color);
    }

}
