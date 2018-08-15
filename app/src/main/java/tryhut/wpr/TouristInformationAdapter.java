package tryhut.wpr;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by tryhu on 2018-08-12.
 */

public class TouristInformationAdapter extends RecyclerView.Adapter<TouristInformationAdapter.ViewHolder> {

    private TouristicInformation[] touristicInformations;

    public TouristInformationAdapter(TouristicInformation[] tiInfo) {
        this.touristicInformations = tiInfo;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tinames;
        private TextView tiPhoneNumbers;
        private TextView tiOpeningHours;
        private TextView tiAddresses;
        private TextView tiEmails;
        private CardView cardView;

        public ViewHolder(CardView v) {
            super(v);
            cardView = v;
            tinames = (TextView) cardView.findViewById(R.id.ti_name);
            tiPhoneNumbers = (TextView) cardView.findViewById(R.id.ti_phonenumber);
            tiOpeningHours = (TextView) cardView.findViewById(R.id.ti_openinghours);
            tiAddresses = (TextView) cardView.findViewById(R.id.ti_addressess);
            tiEmails = (TextView) cardView.findViewById(R.id.ti_emails);
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

        holder.tinames.setText(touristicInformation.getName());
        holder.tiPhoneNumbers.setText(touristicInformation.getPhoneNumber());
        holder.tiEmails.setText(touristicInformation.getEmail());
        holder.tiAddresses.setText(touristicInformation.getAddress());
        holder.tiOpeningHours.setText(touristicInformation.getOpeningHours());

    }


    @Override
    public int getItemCount() {
        return touristicInformations.length;
    }
}
