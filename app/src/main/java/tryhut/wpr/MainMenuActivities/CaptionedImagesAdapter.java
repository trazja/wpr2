package tryhut.wpr.MainMenuActivities;

import android.content.Context;
import android.content.Intent;
import android.net.sip.SipSession;
import android.nfc.Tag;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

import tryhut.wpr.R;
import tryhut.wpr.RouteDetailsActivity;

/**
 * Created by tryhu on 2018-07-07.
 */

class CaptionedImagesAdapter extends RecyclerView.Adapter<CaptionedImagesAdapter.ViewHolder> {

    private Route[] routeList;
    Context mContext;
    private RouteListener listener;

    public static interface RouteListener {
        public void onClick(int position);
    }


    public CaptionedImagesAdapter(Route[] routes) {

        this.routeList = routes;

    }

    public void setListener(RouteListener listener) {
        this.listener = listener;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView routeName;
        private TextView kms;
        private TextView levels;
        private ImageView imageIds;

        private CardView cardView;

        public ViewHolder(CardView v) {
            super(v);
            cardView = v;

            routeName = (TextView) cardView.findViewById(R.id.route_name);
            kms = (TextView) cardView.findViewById(R.id.route_km);
            levels = (TextView) cardView.findViewById(R.id.route_level);
            imageIds = (ImageView) cardView.findViewById(R.id.route_img);
        }
    }

    @Override
    public CaptionedImagesAdapter.ViewHolder onCreateViewHolder(
            ViewGroup parent, int viewType) {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.route_cardview, parent, false);

        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.getAdapterPosition();
        Route route = routeList[position];
        CardView cardView = holder.cardView;
        holder.routeName.setText(route.getName());
        holder.kms.setText(route.getKm());
        holder.levels.setText(route.getLevel());
        holder.imageIds.setImageResource(route.getImageResourceId());




        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.onClick(position);
                }
            }
        });
//
//        Glide.with(mContext)
//                .load(routeList[position].getImageResourceId())
//                .apply(new RequestOptions().skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.NONE).centerCrop())
//                .into(holder.imageIds);

    }

    @Override
    public int getItemCount() {
        return routeList.length;
    }

}
