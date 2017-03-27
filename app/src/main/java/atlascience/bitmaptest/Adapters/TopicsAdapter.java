package atlascience.bitmaptest.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import atlascience.bitmaptest.Models.Knowledge.Topics;
import atlascience.bitmaptest.R;

public class TopicsAdapter extends RecyclerView.Adapter<TopicsAdapter.TopicsViewHolder> {

    private List<Topics> topics;
    private int rowLayout;
    private Context context;

    public TopicsAdapter(List<Topics> topics, int rowLayout, Context context) {
        this.topics = topics;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public TopicsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new TopicsViewHolder(v);
    }

    @Override
    public void onBindViewHolder(TopicsViewHolder holder, int position) {
        holder.topic.setText(topics.get(position).getTopics());
    }

    @Override
    public int getItemCount() {
        return topics.size();
    }

    public class TopicsViewHolder extends RecyclerView.ViewHolder {

        TextView topic;

        public TopicsViewHolder(View itemView) {
            super(itemView);
            topic = (TextView) itemView.findViewById(R.id.topic_content);
        }
    }

}
