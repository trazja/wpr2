package tryhut.wpr;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;




public class WcFragment extends Fragment {
    public WcFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView wcRecycler = (RecyclerView) inflater.inflate(
                R.layout.fragment_wc, container, false);

        String[] wcName = new String[Wc.wcs.length];
        for (int i = 0; i < wcName.length; i++) {
            wcName[i] = Wc.wcs[i].getWcName();
        }

        String[] wcAddresses = new String[Wc.wcs.length];
        for (int i = 0; i < wcAddresses.length; i++) {
            wcAddresses[i] = Wc.wcs[i].getWcAddress();
        }

        String[] wcOpeningHours = new String[Wc.wcs.length];
        for (int i = 0; i < wcOpeningHours.length; i++) {
            wcOpeningHours[i] = Wc.wcs[i].getWcOpeningHours();
        }


        WcAdapter adapter =
                new WcAdapter(Wc.wcs);
        wcRecycler.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        wcRecycler.setLayoutManager(layoutManager);
        return wcRecycler;
    }
}
