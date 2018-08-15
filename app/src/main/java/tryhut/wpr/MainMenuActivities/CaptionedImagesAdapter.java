package tryhut.wpr.MainMenuActivities;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;

import java.util.List;

import tryhut.wpr.R;

/**
 * Created by tryhu on 2018-07-07.
 */

class CaptionedImagesAdapter extends RecyclerView.Adapter<CaptionedImagesAdapter.ViewHolder> {

    private Route[] routeList;

    public CaptionedImagesAdapter(Route[] routes) {
        this.routeList = routes;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView routeName;
        private TextView kms;
        private TextView levels;
        private ImageView imageIds;

        private CardView cardView;

        ViewHolder(CardView v) {
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
    public void onBindViewHolder(ViewHolder holder, int position) {
        Route route = routeList[position];
        CardView cardView = holder.cardView;
        holder.routeName.setText(route.getName());
        holder.kms.setText(route.getKm());
        holder.levels.setText(route.getLevel());
        holder.imageIds.setImageResource(route.getImageResourceId());


    }

    @Override
    public int getItemCount() {
        return routeList.length;
    }

}
