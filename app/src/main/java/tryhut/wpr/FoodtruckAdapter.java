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
 * Created by tryhu on 2018-08-18.
 */

public class FoodtruckAdapter extends RecyclerView.Adapter<FoodtruckAdapter.ViewHolder> {

    private Foodtrucks[] foodtrucks;
    Context ctx;

    public FoodtruckAdapter(Foodtrucks[] foodtruckList, Context ctx) {

        this.foodtrucks = foodtruckList;
        this.ctx = ctx;

    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView foodtruckName;
        private TextView foodtruckAddress;
        private TextView foodtruckOpeningHours;
        private TextView foodtruckWebsite;
        private ImageView imageResourceFoodtruckId;
        private Button foodtruckButton;

        private CardView cardView;

        public ViewHolder(CardView v) {
            super(v);
            cardView = v;

            foodtruckName = (TextView) cardView.findViewById(R.id.foodtruck_name);
            foodtruckAddress = (TextView) cardView.findViewById(R.id.foodtruck_address);
            foodtruckOpeningHours = (TextView) cardView.findViewById(R.id.foodtruck_openinghours);
            foodtruckWebsite = (TextView) cardView.findViewById(R.id.foodtruck_website);
            imageResourceFoodtruckId = (ImageView) cardView.findViewById(R.id.foodtruck_img);
            foodtruckButton = (Button) cardView.findViewById(R.id.foodtruck_show_on_map_button);
        }

    }

    @Override
    public FoodtruckAdapter.ViewHolder onCreateViewHolder(
            ViewGroup parent, int viewType) {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_foodtruck, parent, false);

        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Foodtrucks foodtruckList = foodtrucks[position];
        CardView cardView = holder.cardView;
        Button button = holder.foodtruckButton;
        holder.foodtruckName.setText(foodtruckList.getFoodtruckName());
        holder.foodtruckAddress.setText(foodtruckList.getFoodtruckAddress());
        holder.foodtruckOpeningHours.setText(foodtruckList.getFoodtruckOpeningHours());
        holder.foodtruckWebsite.setText(foodtruckList.getFoodtruckWebsite());
        holder.imageResourceFoodtruckId.setImageResource(foodtruckList.getImageResourceFoodtruckId());

        Glide.with(ctx)
                .load(foodtrucks[position].getImageResourceFoodtruckId())
                .apply(new RequestOptions().skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.NONE).centerCrop()).into(holder.imageResourceFoodtruckId);

        holder.foodtruckButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.getContext().startActivity(new Intent(ctx,MapsActivity.class));
            }
        });

    }

    @Override
    public int getItemCount() {
        return foodtrucks.length;
    }

}
