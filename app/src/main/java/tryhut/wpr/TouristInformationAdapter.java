package tryhut.wpr;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import tryhut.wpr.MainMenuActivities.MapsActivity;


/**
 * Created by tryhu on 2018-08-12.
 */

public class TouristInformationAdapter extends RecyclerView.Adapter<TouristInformationAdapter.ViewHolder> {

    private TouristicInformation[] touristicInformations;
    private Context ctx;

    public TouristInformationAdapter(TouristicInformation[] tiInfo, Context context) {
        this.touristicInformations = tiInfo;
        this.ctx = context;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tinames;
        private TextView tiPhoneNumbers;
        private TextView tiOpeningHours;
        private TextView tiAddresses;
        private TextView tiEmails;
        private CardView cardView;
        private Button tibutton;

        public ViewHolder(CardView v) {
            super(v);
            cardView = v;
            tinames = (TextView) cardView.findViewById(R.id.ti_name);
            tiPhoneNumbers = (TextView) cardView.findViewById(R.id.ti_phonenumber);
            tiOpeningHours = (TextView) cardView.findViewById(R.id.ti_openinghours);
            tiAddresses = (TextView) cardView.findViewById(R.id.ti_addressess);
            tiEmails = (TextView) cardView.findViewById(R.id.ti_emails);
            tibutton = (Button) cardView.findViewById(R.id.show_on_map_button_ti);
        }
    }

    @Override
    public TouristInformationAdapter.ViewHolder onCreateViewHolder(
            ViewGroup parent, int viewType) {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.tourist_information_cardview, parent, false);
        return new TouristInformationAdapter.ViewHolder(cv);

    }

    @Override
    public void onBindViewHolder(TouristInformationAdapter.ViewHolder holder, final int position) {
        TouristicInformation touristicInformation = touristicInformations[position];
        CardView cardView = holder.cardView;
        Button tibutton = holder.tibutton;

        holder.tinames.setText(touristicInformation.getName());
        holder.tiPhoneNumbers.setText(touristicInformation.getPhoneNumber());
        holder.tiEmails.setText(touristicInformation.getEmail());
        holder.tiAddresses.setText(touristicInformation.getAddress());
        holder.tiOpeningHours.setText(touristicInformation.getOpeningHours());


        holder.tibutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.getContext().startActivity(new Intent(ctx,MapsActivity.class));
            }
        });
    }


    @Override
    public int getItemCount() {
        return touristicInformations.length;
    }
}
