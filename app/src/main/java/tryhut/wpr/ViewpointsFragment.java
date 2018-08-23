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


public class ViewpointsFragment extends Fragment {

    public ViewpointsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView viewpointRecycler = (RecyclerView) inflater.inflate(
                R.layout.fragment_viewpoints, container, false);

        String[] viewPointName = new String[Viewpoints.viewpoints.length];
        for (int i = 0; i < viewPointName.length; i++) {
            viewPointName[i] = Viewpoints.viewpoints[i].getViewpointName();
        }

        String[] viewPointAddress = new String[Viewpoints.viewpoints.length];
        for (int i = 0; i < viewPointAddress.length; i++) {
            viewPointAddress[i] = Viewpoints.viewpoints[i].getViewpointAddress();
        }

        String[] viewpointOpeningHours = new String[Viewpoints.viewpoints.length];
        for (int i = 0; i < viewpointOpeningHours.length; i++) {
            viewpointOpeningHours[i] = Viewpoints.viewpoints[i].getViewpointOpeningHours();
        }

        int[] imgViewpoint = new int[Viewpoints.viewpoints.length];
        for (int i = 0; i < imgViewpoint.length; i++) {
            imgViewpoint[i] = Viewpoints.viewpoints[i].getImageResourceViewpointId();
        }

        ViewpointsAdapter adapter =
                new ViewpointsAdapter(Viewpoints.viewpoints, getContext());
        viewpointRecycler.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        viewpointRecycler.setLayoutManager(layoutManager);

        return viewpointRecycler;


    }
}
