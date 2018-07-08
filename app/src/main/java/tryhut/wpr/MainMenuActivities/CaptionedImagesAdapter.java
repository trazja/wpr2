package tryhut.wpr.MainMenuActivities;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;

import tryhut.wpr.R;

/**
 * Created by tryhu on 2018-07-07.
 */

class CaptionedImagesAdapter extends RecyclerView.Adapter<CaptionedImagesAdapter.ViewHolder> {

    private String [] routeNames;
    private double [] kms;
    private String [] levels;
    private int [] imageIds;

    public CaptionedImagesAdapter(String[] routeNames, double[] kms, String[] levels, int[] imageIds) {
        this.routeNames = routeNames;
        this.kms = kms;
        this.levels = levels;
        this.imageIds = imageIds;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        private CardView cardView;
        public ViewHolder(CardView v) {
            super(v);
            cardView=v;
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
    public  void onBindViewHolder (ViewHolder holder, int position){

   CardView cardView = holder.cardView;
   TextView textView = (TextView)cardView.findViewById(R.id.route_name);
   textView.setText(routeNames[position]);

   TextView textView2 = (TextView)cardView.findViewById(R.id.route_km);
   textView.setText(routeNames[position]);


   TextView textView3 = (TextView)cardView.findViewById(R.id.route_level);
   textView.setText(routeNames[position]);

   ImageView imageView = (ImageView)cardView.findViewById(R.id.route_img);
   Drawable drawable = cardView.getResources().getDrawable(imageIds[position]);
   imageView.setImageDrawable(drawable);

}
@Override
    public int getItemCount(){
return routeNames.length;
}

}
