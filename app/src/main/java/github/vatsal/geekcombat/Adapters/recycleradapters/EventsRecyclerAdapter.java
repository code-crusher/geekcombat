package github.vatsal.geekcombat.Adapters.recycleradapters;

import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import github.vatsal.geekcombat.Adapters.viewholders.EventsViewHolder;
import github.vatsal.geekcombat.R;

/**
 * Created by
 * --Vatsal Bajpai
 */

public class EventsRecyclerAdapter extends RecyclerView.Adapter<EventsViewHolder> {

    private Context mContext;
    private Activity mActivity;
    private ArrayList<EventItem> itemList;

    public EventsRecyclerAdapter(Activity activity, Context context, ArrayList<EventItem> itemList) {
        this.itemList = itemList;
        this.mContext = context;
        this.mActivity = activity;
    }

    @Override
    public EventsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.event_list_item, null);

        return new EventsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(EventsViewHolder holder, int position) {
        handleCommentsEvents(holder, position);

    }

    private void handleCommentsEvents(EventsViewHolder mVHolder, final int position) {

        EventItem notiItem = itemList.get(position);
        if (notiItem != null) {
            try {

                mVHolder.tvCntTitle.setText(notiItem.title);
                mVHolder.tv_desc.setText(notiItem.desc);

                byte[] imageAsBytes = Base64.decode(notiItem.headImg.getBytes(), Base64.DEFAULT);

                mVHolder.ivApp.setImageBitmap(BitmapFactory.decodeByteArray(imageAsBytes, 0, imageAsBytes.length));

                mVHolder.tvCntTitle.setTag(mVHolder);
                mVHolder.ivApp.setTag(mVHolder);

                mVHolder.btLink.setOnClickListener(new clickHandler(position, notiItem));
                mVHolder.favCard.setOnClickListener(new clickHandler(position, notiItem));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    class clickHandler implements View.OnClickListener {

        int position;
        EventItem notiItem;

        public clickHandler(int position, EventItem notiItem) {
            this.notiItem = notiItem;
            this.position = position;
        }

        @Override
        public void onClick(View v) {
            int id = v.getId();
            switch (id) {
            }
        }
    }

}

