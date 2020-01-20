package example.com.samplefirebaseiosbugproject.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import example.com.samplefirebaseiosbugproject.R;
import example.com.samplefirebaseiosbugproject.model.FireBaseIssueList;
import example.com.samplefirebaseiosbugproject.model.User;

public class FireBaseIssueListDetailActivity extends AppCompatActivity {
     TextView tvUser;
     TextView tvComment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire_base_issue_list_detail);
        tvUser=(TextView)findViewById(R.id.tv_user);
        tvComment=(TextView)findViewById(R.id.tv_comment);

        FireBaseIssueList fireBaseIssueList=getIntent().getParcelableExtra("FireBase");
       /* User user=fireBaseIssueList.getUser();
        tvUser.setText(user.getLogin());*/
        tvComment.setText(fireBaseIssueList.getBody());

    }
}
