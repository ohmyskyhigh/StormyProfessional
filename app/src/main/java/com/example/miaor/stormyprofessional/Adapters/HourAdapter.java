package com.example.miaor.stormyprofessional.Adapters;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.miaor.stormyprofessional.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * created by the one and only, Runkun Miao!!!!!!!!!
 */
public class HourAdapter extends RecyclerView.Adapter<HourAdapter.HourViewHolder> {


    @Override
    public HourViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }


    @Override
    public void onBindViewHolder(HourViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return 0;
    }


    public class HourViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.SummaryTextHourlyList)
        TextView mSummary;
        @BindView(R.id.TimeLabelHourlyList)
        TextView mTimeLabel;
        @BindView(R.id.iconImageHourlyList)
        ImageView mIconImage;

        public HourViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }
}
