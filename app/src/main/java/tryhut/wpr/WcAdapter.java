package tryhut.wpr;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



/**
 * Created by tryhu on 2018-08-15.
 */

public class WcAdapter extends RecyclerView.Adapter<WcAdapter.ViewHolder> {

    private Wc[] wcList;

    public WcAdapter(Wc[] wcs) {
        this.wcList = wcs;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView wcAddress;
        private TextView wcOpeningHours;


        private CardView cardView;

        ViewHolder(CardView v) {
            super(v);
            cardView = v;
            wcAddress = (TextView) cardView.findViewById(R.id.wc_address);
            wcOpeningHours = (TextView) cardView.findViewById(R.id.wc_openinghours);

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
        holder.wcAddress.setText(wc.getWcAddress());
        holder.wcOpeningHours.setText(wc.getWcOpeningHours());


    }

    @Override
    public int getItemCount() {
        return wcList.length;
    }
}

