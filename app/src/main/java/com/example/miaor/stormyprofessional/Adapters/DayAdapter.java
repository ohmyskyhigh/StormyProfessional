package com.example.miaor.stormyprofessional.Adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.miaor.stormyprofessional.Data.Day;
import com.example.miaor.stormyprofessional.R;

/**
 * created by the one and only, Runkun Miao!!!!!!!!!
 */
public class DayAdapter extends BaseAdapter {

    private Context mContext;
    private Day[] mDays;


    public DayAdapter(Context context, Day[] days){
        mContext = context;
        mDays = days;
    }


    @Override
    public int getCount() {
        return mDays.length;
    }


    @Override
    public Object getItem(int position) {
        return mDays[position];
    }


    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if(convertView == null){
            //brand new
            convertView = LayoutInflater.from(mContext).inflate(R.layout.daily_list_item, null);
            holder = new ViewHolder();
            holder.mIconImageView = (ImageView) convertView.findViewById(R.id.iconImageList);
            holder.mTemperatureLabel = (TextView) convertView.findViewById(R.id.temperatureValueList);
            holder.mTimeText = (TextView) convertView.findViewById(R.id.dayNameList);
            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder) convertView.getTag();
        }

        Day day = mDays[position];
        holder.mIconImageView.setImageResource(day.getIconID());
        holder.mTimeText.setText(day.getDayOfTheWeek());
        holder.mTemperatureLabel.setText(day.getTemperatureMax()+"");
        return null;
    }


    private static class ViewHolder{
        ImageView mIconImageView;
        TextView mTimeText;
        TextView mTemperatureLabel;
    }
}
