package example.com.samplefirebaseiosbugproject.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import example.com.samplefirebaseiosbugproject.R;
import example.com.samplefirebaseiosbugproject.model.FireBaseIssueList;

public class FireBaseIosIssueAdapter extends RecyclerView.Adapter<FireBaseIosIssueAdapter.MyViewHolder> {

    private List<FireBaseIssueList> fireBaseIssueLists;


    public FireBaseIosIssueAdapter(List<FireBaseIssueList> fireBaseIssueLists) {
        this.fireBaseIssueLists = fireBaseIssueLists;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.ios_issue_list, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        FireBaseIssueList result = fireBaseIssueLists.get(position);
        holder.title.setText(result.getTitle());
        holder.body.setText(result.getBody());
    }

    @Override
    public int getItemCount() {
        return fireBaseIssueLists.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public TextView body;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.tv_title);
            body = (TextView) view.findViewById(R.id.tv_body);
        }


    }


}
