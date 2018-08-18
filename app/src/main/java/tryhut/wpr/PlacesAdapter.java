package tryhut.wpr;


import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

/**
 * Created by tryhu on 2018-08-15.
 */

public class PlacesAdapter extends RecyclerView.Adapter<PlacesAdapter.ViewHolder> {

    private Places[] placesList;
    Context ctx;

    public PlacesAdapter(Places[] places, Context ctx) {
        this.placesList = places;
        this.ctx = ctx;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView placeName;
        private TextView placeAddress;
        private TextView placeDescription;
        private ImageView imageResourcePlaceId;

        private CardView cardView;

        public ViewHolder(CardView v) {
            super(v);
            cardView = v;

            imageResourcePlaceId = (ImageView) cardView.findViewById(R.id.place_img);
            placeAddress = (TextView) cardView.findViewById(R.id.place_address);
            placeName = (TextView) cardView.findViewById(R.id.place_name);
            placeDescription = (TextView) cardView.findViewById(R.id.place_description);
        }
    }

    @Override
    public PlacesAdapter.ViewHolder onCreateViewHolder(
            ViewGroup parent, int viewType) {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_places, parent, false);

        return new ViewHolder(cv);
    }

    @Override

    public void onBindViewHolder(ViewHolder holder, final int position) {
        Places places = placesList[position];
        CardView cardView = holder.cardView;
        holder.imageResourcePlaceId.setImageResource(places.getImageResourcePlaceId());
        holder.placeName.setText(places.getPlaceName());
        holder.placeAddress.setText(places.getPlaceAddress());
        holder.placeDescription.setText(places.getPlaceDescription());


        Glide.with(ctx)
                .load(placesList[position].getImageResourcePlaceId())
                .apply(new RequestOptions().skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.NONE).centerCrop()).into(holder.imageResourcePlaceId);

    }


    @Override
    public int getItemCount() {
        return placesList.length;
    }
}
