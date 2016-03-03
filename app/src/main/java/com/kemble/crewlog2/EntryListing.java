package com.kemble.crewlog2;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by pete on 2/13/16.
 */
public class EntryListing extends Fragment {
    public EntryListing(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View entryListingView = inflater.inflate(R.layout.content_crew_log, container, false);

        String[] fakeEntries = {"hi", "there", "how", "are", "you?"};
        ArrayAdapter<String> entryArrayAdapter =
                new ArrayAdapter<>(getActivity().getApplicationContext(),
                        R.layout.listview_entries, R.id.tv_entry_listing_tail, fakeEntries);

        ListView lvEntries = (ListView) entryListingView.findViewById(R.id.lv_entries);
        lvEntries.setAdapter(entryArrayAdapter);

        return entryListingView;
    }
}
