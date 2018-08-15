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

    private List<Route> routeList;
//    private String [] routeNames;
//    private String [] kms;
//    private String [] levels;
//    private int [] imageIds;

    //    public CaptionedImagesAdapter(String[] routeNames, String[] kms, String[] levels, int[] imageIds) {
//        this.routeNames = routeNames;
//        this.kms = kms;
//        this.levels = levels;
//        this.imageIds = imageIds;
//    }
    public CaptionedImagesAdapter(List<Route> routes) {
        routeList = routes;
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
        Route route = routeList.get(position);
        CardView cardView = holder.cardView;
        holder.routeName.setText(route.getName());
        holder.kms.setText(route.getKm());
        holder.levels.setText(route.getLevel());
        holder.imageIds.setImageResource(route.getImageResourceId());


//        TextView textView = (TextView) cardView.findViewById(R.id.route_name);
//        textView.setText(routeNames[position]);
//
//        TextView textView2 = (TextView) cardView.findViewById(R.id.route_km);
//        textView2.setText(kms[position]);
//
//
//        TextView textView3 = (TextView) cardView.findViewById(R.id.route_level);
//        textView3.setText(levels[position]);
//
//        ImageView imageView = (ImageView) cardView.findViewById(R.id.route_img);
//        Drawable drawable = cardView.getResources().getDrawable(imageIds[position], null);
//        imageView.setImageDrawable(drawable);

    }

    @Override
    public int getItemCount() {
        return routeList.size();
    }

}
