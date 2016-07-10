package com.example.miaor.stormyprofessional.Adapters;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.miaor.stormyprofessional.Data.Hour;
import com.example.miaor.stormyprofessional.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * created by the one and only, Runkun Miao!!!!!!!!!
 */
public class HourAdapter extends RecyclerView.Adapter<HourAdapter.HourViewHolder> {

    private Hour[] mHours;

    public HourAdapter(Hour[] hours){
        mHours = hours;
    }

    @Override
    public HourViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.hourly_list_item,parent,false);

        return new HourViewHolder(view);
    }


    @Override
    public void onBindViewHolder(HourViewHolder holder, int position) {
        holder.bindHour(mHours[position]);

    }


    @Override
    public int getItemCount() {
        return mHours.length;
    }


    public class HourViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.SummaryTextHourlyList)
        TextView mSummary;
        @BindView(R.id.TimeLabelHourlyList)
        TextView mTimeLabel;
        @BindView(R.id.iconImageHourlyList)
        ImageView mIconImage;
        @BindView(R.id.temperatureValueHourlyList)
        TextView mTemperatureLabel;

        public HourViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void bindHour(Hour hour){
            mTimeLabel.setText(hour.getHour());
            mSummary.setText(hour.getSummary());
            mIconImage.setImageResource(hour.getIconID());
            mTemperatureLabel.setText(hour.getTemperature()+"");
        }
    }
}
