package github.vatsal.geekcombat.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;

import github.vatsal.geekcombat.R;

/**
 * Created by
 * --Vatsal Bajpai on
 * --16/07/16 at
 * --12:39 PM in
 */
public class EventActivity extends BaseActivity {

    RecyclerView recyclerViewNotiList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_all_posts);

        init();
    }

    private void init() {

        recyclerViewNotiList = (RecyclerView) findViewById(R.id.event_list);

    }
}
