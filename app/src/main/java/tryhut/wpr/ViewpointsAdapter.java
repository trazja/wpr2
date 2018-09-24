package tryhut.wpr;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

import tryhut.wpr.MainMenuActivities.MapsActivity;

/**
 * Created by tryhu on 2018-08-23.
 */

public class ViewpointsAdapter extends RecyclerView.Adapter<ViewpointsAdapter.ViewHolder> {
    private Viewpoints[] viewpoints;
    Context ctx;

    public ViewpointsAdapter(Viewpoints[] viewpointsList, Context ctx) {

        this.viewpoints = viewpointsList;
        this.ctx = ctx;

    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView viewpointName;
        private TextView viewpointAddress;
        private TextView viewpointOpeningHours;
        private ImageView imageResourceViewpointId;
        private Button viewpointsbutton;


        private CardView cardView;

        public ViewHolder(CardView v) {
            super(v);
            cardView = v;

            viewpointName = (TextView) cardView.findViewById(R.id.viewpoint_name);
            viewpointAddress = (TextView) cardView.findViewById(R.id.viewpoint_address);
            viewpointOpeningHours = (TextView) cardView.findViewById(R.id.viewpoint_openinghours);
            imageResourceViewpointId = (ImageView) cardView.findViewById(R.id.viewpoint_img);
            viewpointsbutton = (Button) cardView.findViewById(R.id.viewpoint_show_on_map_button);
        }

    }

    @Override
    public ViewpointsAdapter.ViewHolder onCreateViewHolder(
            ViewGroup parent, int viewType) {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_viewpoints, parent, false);

        return new ViewpointsAdapter.ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(ViewpointsAdapter.ViewHolder holder, final int position) {
        Viewpoints viewpoints1ist = viewpoints[position];
        CardView cardView = holder.cardView;
        Button viewpointsbutton = holder.viewpointsbutton;
        holder.viewpointName.setText(viewpoints1ist.getViewpointName());
        holder.viewpointAddress.setText(viewpoints1ist.getViewpointAddress());
        holder.viewpointOpeningHours.setText(viewpoints1ist.getViewpointOpeningHours());
        holder.imageResourceViewpointId.setImageResource(viewpoints1ist.getImageResourceViewpointId());

        Glide.with(ctx)
                .load(viewpoints[position].getImageResourceViewpointId())
                .apply(new RequestOptions().skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.NONE).centerCrop()).into(holder.imageResourceViewpointId);

        holder.viewpointsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.getContext().startActivity(new Intent(ctx,MapsActivity.class));
            }
        });

    }

    @Override
    public int getItemCount() {
        return viewpoints.length;
    }

}
