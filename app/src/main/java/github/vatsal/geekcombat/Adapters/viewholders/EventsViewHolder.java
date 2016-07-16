package github.vatsal.geekcombat.Adapters.viewholders;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import github.vatsal.geekcombat.R;

public class EventsViewHolder extends RecyclerView.ViewHolder {

    @Bind(R.id.iv_app)
    public ImageView ivApp;
    @Bind(R.id.tv_cntTitle)
    public TextView tvCntTitle;
    @Bind(R.id.tv_desc)
    public TextView tv_desc;
    @Bind(R.id.bt_link)
    public Button btLink;
    @Bind(R.id.favCard)
    public CardView favCard;

    public EventsViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}