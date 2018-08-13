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
    private String[] names;
    private String[] phoneNumbers;
    private String[] openingHours;
    private String[] addresses;
    private String[] emails;

    public TouristInformationAdapter(String[] names, String[] phoneNumbers, String[] openingHours, String[] addresses, String[] emails) {
        this.names = names;
        this.phoneNumbers = phoneNumbers;
        this.openingHours = openingHours;
        this.addresses = addresses;
        this.emails = emails;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private CardView cardView;

        public ViewHolder(CardView v) {
            super(v);
            cardView = v;
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

        CardView cardView = holder.cardView;
        TextView textView = (TextView) cardView.findViewById(R.id.ti_name);
        textView.setText(names[position]);

        TextView textView2 = (TextView) cardView.findViewById(R.id.ti_phonenumber);
        textView2.setText(phoneNumbers[position]);
//
//        textView2.setOnClickListener(new View.OnClickListener() {
//
//            public void onClick(View v) {
//               Intent callintent = new Intent(Intent.ACTION_CALL, Uri.parse(phoneNumbers[position]));
//                startActivity(callintent);
//            }
//        });

        TextView textView3 = (TextView) cardView.findViewById(R.id.ti_openinghours);
        textView3.setText(openingHours[position]);

        TextView textView4 = (TextView) cardView.findViewById(R.id.ti_addressess);
        textView4.setText(addresses[position]);

        TextView textView5 = (TextView) cardView.findViewById(R.id.ti_emails);
        textView5.setText(emails[position]);


    }


    @Override
    public int getItemCount() {
        return names.length;
    }
}
