package com.elhady.newsapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.elhady.newsapp.R;
import com.elhady.newsapp.Interface.ItemClickListener;
import com.elhady.newsapp.models.WebSite;


import de.hdodenhof.circleimageview.CircleImageView;


public class ListSourceAdapter extends RecyclerView.Adapter<ListSourceViewHolder> {
    private Context context;
    private WebSite webSite;

   // private IconBetterIdeaService mService;

    public ListSourceAdapter(Context context, WebSite webSite) {
        this.context = context;
        this.webSite = webSite;

     //   mService = Common.getIconService();
    }


    @Override
    public ListSourceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.source_layout, parent, false);
        return new ListSourceViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final ListSourceViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return webSite.getSources().size();
    }

    class ListSourceViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener {

        ItemClickListener itemClickListener;

        TextView source_title;
        CircleImageView source_image;

        public ListSourceViewHolder(View itemView) {
            super(itemView);

            source_image = (CircleImageView)itemView.findViewById(R.id.source_image);
            source_title = (TextView)itemView.findViewById(R.id.source_name);

            //itemView.setOnClickListener(this);
        }

        public void setItemClickListener(ItemClickListener itemClickListener) {
            this.itemClickListener = itemClickListener;
        }

        @Override
        public void onClick(View view) {
            itemClickListener.onClick(view,getAdapterPosition(),false);
        }
    }
}
