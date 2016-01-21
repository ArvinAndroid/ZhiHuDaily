package com.fei.zhihudaily.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.fei.zhihudaily.R;
import com.fei.zhihudaily.entity.StoriesEntity;

import java.util.List;

/**
 * Created by Administrator on 2016/1/21 0021.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private Context context;
    private List<StoriesEntity> data;

    public RecyclerViewAdapter(Context context, List<StoriesEntity> data) {
        super();
        this.context = context;
        this.data = data;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tv_news_title;
        public ImageView iv_news_preview;

        public ViewHolder(View itemView) {
            super(itemView);
            this.tv_news_title = (TextView) itemView.findViewById(R.id.tv_news_title);
            this.iv_news_preview = (ImageView) itemView.findViewById(R.id.iv_news_preview);
        }

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    /*
     * Bind data
     */
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        StoriesEntity storiesEntity = data.get(position);
        viewHolder.tv_news_title.setText(storiesEntity.getTitle());
        String imageUrl = storiesEntity.getImages().get(0);
        Glide.with(context).load(imageUrl).into(viewHolder.iv_news_preview);

        if (mOnItemClickListener != null) {
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    mOnItemClickListener.onItemClick(v, position);
                }
            });
        }
    }

    /*
     * Create ViewHolder
     */
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news_latest, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    public void add(List<StoriesEntity> item, int position) {
        if (data == null || position < 0 || position > data.size())
            return;
        data.addAll(position, item);
        notifyItemInserted(position);
    }

    public void remove(int position) {
        if (data == null || data.size() == 0)
            return;
        data.remove(position);
        notifyItemRemoved(position);
        notifyDataSetChanged();
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    OnItemClickListener mOnItemClickListener;

    public void setOnItemClickListener(OnItemClickListener listener) {
        mOnItemClickListener = listener;
    }
}
