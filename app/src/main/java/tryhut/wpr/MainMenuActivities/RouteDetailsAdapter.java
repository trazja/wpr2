package tryhut.wpr.MainMenuActivities;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.request.RequestOptions;

import javax.microedition.khronos.opengles.GL;

import tryhut.wpr.MyGlideApp;
import tryhut.wpr.R;

/**
 * Created by tryhu on 2018-08-15.
 */

public class RouteDetailsAdapter extends RecyclerView.Adapter<RouteDetailsAdapter.ViewHolder> {

    private RouteDetails[] routeDetails;
    Context ctx;

    public RouteDetailsAdapter(RouteDetails[] routeDetailsList, Context ctx) {
        this.routeDetails = routeDetailsList;
        this.ctx = ctx;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView description;
        private ImageView photo1;
        private ImageView photo2;
        private ImageView photo3;
        private ImageView photo4;

        private CardView cardView;

        public ViewHolder(CardView v) {
            super(v);
            cardView = v;

            photo1 = (ImageView) cardView.findViewById(R.id.photo1);
            photo2 = (ImageView) cardView.findViewById(R.id.photo2);
            photo3 = (ImageView) cardView.findViewById(R.id.photo3);
            photo4 = (ImageView) cardView.findViewById(R.id.photo4);

            description = (TextView) cardView.findViewById(R.id.description);
        }
    }

    @Override
    public RouteDetailsAdapter.ViewHolder onCreateViewHolder(
            ViewGroup parent, int viewType) {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_routedetails, parent, false);

        return new RouteDetailsAdapter.ViewHolder(cv);
    }

    @Override

    public void onBindViewHolder(RouteDetailsAdapter.ViewHolder holder, final int position) {
        RouteDetails routedet = routeDetails[position];
        CardView cardView = holder.cardView;
        holder.photo1.setImageResource(routedet.getPhoto1ResourceId());
        holder.photo2.setImageResource(routedet.getPhoto2ResourceId());
        holder.photo3.setImageResource(routedet.getPhoto3ResourceId());
        holder.photo4.setImageResource(routedet.getPhoto4ResourceId());
        holder.description.setText(routedet.getRouteDetailsDescription());


        Glide.with(ctx)
                .load(routeDetails[position].getPhoto1ResourceId()).
                apply(new RequestOptions()
                        .placeholder(R.drawable.placeholder1)
                        .centerCrop()).into(holder.photo1);
        Glide.with(ctx)
                .load(routeDetails[position].getPhoto2ResourceId()).
                apply(new RequestOptions()
                        .placeholder(R.drawable.placeholder2)
                        .centerCrop()).into(holder.photo2);
        Glide.with(ctx)
                .load(routeDetails[position].getPhoto3ResourceId()).
                apply(new RequestOptions()
                        .placeholder(R.drawable.placeholder3)
                        .centerCrop()).into(holder.photo3);
        Glide.with(ctx)
                .load(routeDetails[position].getPhoto4ResourceId()).
                apply(new RequestOptions()
                        .placeholder(R.drawable.placeholder4)
                        .centerCrop()).into(holder.photo4);

    }


    @Override
    public int getItemCount() {
        return routeDetails.length;
    }
}
