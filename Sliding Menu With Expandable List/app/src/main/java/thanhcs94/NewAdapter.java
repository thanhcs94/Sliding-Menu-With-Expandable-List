package thanhcs94;

import java.util.ArrayList;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.media.Image;
import android.os.Build;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


@SuppressWarnings("unchecked")
public class NewAdapter extends BaseExpandableListAdapter {

	public ArrayList<String> groupItem, tempChild;
	public ArrayList<Object> Childtem = new ArrayList<Object>();
	public LayoutInflater minflater;
	public Activity activity;
	private final Context context;
    ImageView imgArrow[] = new ImageView[6];
    ArrayList<ImageView> arrIMG;
    int dem[]= {0, 0, 0, 0, 0, 0};
	public NewAdapter(Context context,ArrayList<String> grList, ArrayList<Object> childItem) {
		this.context = context;
		groupItem = grList;
		this.Childtem = childItem;
        arrIMG = new ArrayList<ImageView>();
	}

	public void setInflater(LayoutInflater mInflater, Activity act) {
		this.minflater = mInflater;
		activity = act;
	}

	@Override
	public Object getChild(int groupPosition, int childPosition) {
		return null;
	}

	@Override
	public long getChildId(int groupPosition, int childPosition) {
		return 0;
	}

	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
	public View getChildView(int groupPosition, final int childPosition,
			boolean isLastChild, View convertView, ViewGroup parent) {
		tempChild = (ArrayList<String>) Childtem.get(groupPosition);
		TextView text = null;
		if (convertView == null) {
			convertView = new TextView(context);
		}
		text = (TextView) convertView;
	   text.setText(""+tempChild.get(childPosition));
        text.setTextSize(20);
       text.setTextColor(Color.parseColor("#ffffff"));
        text.setPadding(80,20, 10, 20);



		convertView.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(context, tempChild.get(childPosition).toString(),
						Toast.LENGTH_SHORT).show();
			}
		});
		convertView.setTag(tempChild.get(childPosition));
		return convertView;
	}




    @Override
	public int getChildrenCount(int groupPosition) {
		return ((ArrayList<String>) Childtem.get(groupPosition)).size();
	}

	@Override
	public Object getGroup(int groupPosition) {
		return null;
	}

	@Override
	public int getGroupCount() {
		return groupItem.size();
	}

	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
	public void onGroupCollapsed(int groupPosition) {
        arrIMG.get(groupPosition).setRotation(0);
		super.onGroupCollapsed(groupPosition);
	}

	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
	public void onGroupExpanded(int groupPosition) {
        arrIMG.get(groupPosition).setRotation(90);
		super.onGroupExpanded(groupPosition);
	}

	@Override
	public long getGroupId(int groupPosition) {
		return 0;
	}
//groupItem.get(groupPosition)
    @Override
    public View getGroupView(final int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String headerTitle = (String)getGroup(groupPosition);
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_row_data_alkitab, null);
        }
        if(groupPosition==0) {
            imgArrow[0] = (ImageView)convertView.findViewById(R.id.imageView2);
            arrIMG.add( imgArrow[0]);
            ((ImageView) convertView.findViewById(R.id.image2)).setVisibility(View.VISIBLE);
            ((ImageView) convertView.findViewById(R.id.imageView2)).setVisibility(View.VISIBLE);
            ((LinearLayout)convertView.findViewById(R.id.llrow)).setBackgroundResource(R.drawable.non);
            ((ImageView) convertView.findViewById(R.id.image2)).setImageResource(R.drawable.show);
            ((TextView) convertView.findViewById(R.id.text2)).setText(groupItem.get(groupPosition));
            }
        if(groupPosition==1) {
            imgArrow[1] = (ImageView)convertView.findViewById(R.id.imageView2);
            arrIMG.add( imgArrow[1]);
            ((ImageView) convertView.findViewById(R.id.image2)).setVisibility(View.VISIBLE);
            ((ImageView) convertView.findViewById(R.id.imageView2)).setVisibility(View.VISIBLE);
            ((LinearLayout)convertView.findViewById(R.id.llrow)).setBackgroundResource(R.drawable.non);
            ((ImageView) convertView.findViewById(R.id.image2)).setImageResource(R.drawable.show);
            ((TextView) convertView.findViewById(R.id.text2)).setText(groupItem.get(groupPosition));
        }
        if(groupPosition==2) {
            imgArrow[2] = (ImageView)convertView.findViewById(R.id.imageView2);
            arrIMG.add( imgArrow[2]);
            ((ImageView) convertView.findViewById(R.id.image2)).setVisibility(View.VISIBLE);
            ((ImageView) convertView.findViewById(R.id.imageView2)).setVisibility(View.VISIBLE);
            ((LinearLayout)convertView.findViewById(R.id.llrow)).setBackgroundResource(R.drawable.non);
            ((ImageView) convertView.findViewById(R.id.image2)).setImageResource(R.drawable.show);
            ((TextView) convertView.findViewById(R.id.text2)).setText(groupItem.get(groupPosition));
        }
        if(groupPosition==4) {
            imgArrow[4] = (ImageView)convertView.findViewById(R.id.imageView2);
            arrIMG.add( imgArrow[4]);
            ((ImageView) convertView.findViewById(R.id.image2)).setVisibility(View.VISIBLE);
            ((ImageView) convertView.findViewById(R.id.imageView2)).setVisibility(View.VISIBLE);
            ((LinearLayout)convertView.findViewById(R.id.llrow)).setBackgroundResource(R.drawable.non);
            ((ImageView) convertView.findViewById(R.id.image2)).setImageResource(R.drawable.show);
            ((TextView) convertView.findViewById(R.id.text2)).setText(groupItem.get(groupPosition));
        }
        if(groupPosition==5) {
            imgArrow[5] = (ImageView)convertView.findViewById(R.id.imageView2);
            arrIMG.add( imgArrow[5]);
            ((ImageView) convertView.findViewById(R.id.image2)).setVisibility(View.VISIBLE);
            ((ImageView) convertView.findViewById(R.id.imageView2)).setVisibility(View.VISIBLE);
            ((LinearLayout)convertView.findViewById(R.id.llrow)).setBackgroundResource(R.drawable.non);
            ((ImageView) convertView.findViewById(R.id.image2)).setImageResource(R.drawable.show);
            ((TextView) convertView.findViewById(R.id.text2)).setText(groupItem.get(groupPosition));
        }

        if(groupPosition==3) {
            imgArrow[3] = (ImageView)convertView.findViewById(R.id.imageView2);
            arrIMG.add( imgArrow[3]);
            ((ImageView) convertView.findViewById(R.id.image2)).setVisibility(View.GONE);
            ((ImageView) convertView.findViewById(R.id.imageView2)).setVisibility(View.GONE);
            ((LinearLayout)convertView.findViewById(R.id.llrow)).setBackgroundResource(R.drawable.another);
            ((TextView) convertView.findViewById(R.id.text2)).setText(groupItem.get(groupPosition));
            ((TextView) convertView.findViewById(R.id.text2)).setHeight(40);
            ((TextView) convertView.findViewById(R.id.text2)).setPadding(30, 0, 0, 0);
        }


        return convertView;
	}

	@Override
	public boolean hasStableIds() {
		return false;
	}

	@Override
	public boolean isChildSelectable(int groupPosition, int childPosition) {
		return false;
	}

}
