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

import tryhut.wpr.MainMenuActivities.MapsActivity;


/**
 * Created by tryhu on 2018-08-15.
 */

public class WcAdapter extends RecyclerView.Adapter<WcAdapter.ViewHolder> {

    private Wc[] wcList;
    private Context ctx;

    public WcAdapter(Wc[] wcs, Context context) {
        this.wcList = wcs;
        this.ctx = context;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView wcName;
        private TextView wcAddress;
        private TextView wcOpeningHours;
        private Button wcButton;


        private CardView cardView;

        ViewHolder(CardView v) {
            super(v);
            cardView = v;
            wcName = (TextView) cardView.findViewById(R.id.wc_name);
            wcAddress = (TextView) cardView.findViewById(R.id.wc_address);
            wcOpeningHours = (TextView) cardView.findViewById(R.id.wc_openinghours);
            wcButton = (Button) cardView.findViewById(R.id.show_on_map_button_wc);

        }
    }

    @Override
    public WcAdapter.ViewHolder onCreateViewHolder(
            ViewGroup parent, int viewType) {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.wc_cardview, parent, false);
        return new WcAdapter.ViewHolder(cv);

    }

    @Override
    public void onBindViewHolder(WcAdapter.ViewHolder holder, int position) {
        Wc wc = wcList[position];
        CardView cardView = holder.cardView;
        Button wcbutton = holder.wcButton;
        holder.wcName.setText(wc.getWcName());
        holder.wcAddress.setText(wc.getWcAddress());
        holder.wcOpeningHours.setText(wc.getWcOpeningHours());

        holder.wcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.getContext().startActivity(new Intent(ctx,MapsActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return wcList.length;
    }
}

