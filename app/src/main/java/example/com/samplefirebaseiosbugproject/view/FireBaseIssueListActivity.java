package example.com.samplefirebaseiosbugproject.view;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Collections;
import java.util.List;

import example.com.samplefirebaseiosbugproject.R;
import example.com.samplefirebaseiosbugproject.adapter.FireBaseIosIssueAdapter;
import example.com.samplefirebaseiosbugproject.model.FireBaseIssueList;
import example.com.samplefirebaseiosbugproject.util.RecyclerItemClickListener;
import example.com.samplefirebaseiosbugproject.viewmodel.FireBaseIosIssueViewModel;

public class FireBaseIssueListActivity extends AppCompatActivity {
    private FireBaseIosIssueViewModel mViewModel;
    private FireBaseIosIssueAdapter mAdapter;
    private RecyclerView recyclerView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        progressBar = (ProgressBar) findViewById(R.id.progress_circular);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        getData();
    }

    private void getData() {
        mViewModel = ViewModelProviders.of(this).get(FireBaseIosIssueViewModel.class);
        mViewModel.getIssuesLiveData().observe(this, new Observer<List<FireBaseIssueList>>() {
            @Override
            public void onChanged(@Nullable List<FireBaseIssueList> fireBaseIssueLists) {
                progressBar.setVisibility(View.GONE);
                Collections.sort(fireBaseIssueLists);
                mAdapter = new FireBaseIosIssueAdapter(fireBaseIssueLists);
                recyclerView.setAdapter(mAdapter);
                recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(FireBaseIssueListActivity.this, new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {

                                FireBaseIssueList fireBaseIssueList = fireBaseIssueLists.get(position);
                                if(fireBaseIssueList.getComments()==0){
                                    setAlertDialog();

                                }
                                else{
                                    Intent intent = new Intent(FireBaseIssueListActivity.this, FireBaseIssueListDetailActivity.class);
                                    intent.putExtra("FireBase", fireBaseIssueList);
                                    startActivity(intent);
                                }


                            }
                        })
                );

            }
        });
    }

    private void setAlertDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(
                FireBaseIssueListActivity.this);

        builder.setMessage("No Comment");
        builder.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,
                                        int which) {
                        dialog.dismiss();
                    }
                });
        builder.show();
    }
}
