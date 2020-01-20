package example.com.samplefirebaseiosbugproject.network;

import java.util.List;

import example.com.samplefirebaseiosbugproject.model.FireBaseIssueList;
import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {

    @GET("firebase-ios-sdk/issues")
    Call<List<FireBaseIssueList>> getData();


}
