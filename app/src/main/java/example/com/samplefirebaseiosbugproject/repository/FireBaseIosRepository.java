package example.com.samplefirebaseiosbugproject.repository;

import android.content.Context;
import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

import example.com.samplefirebaseiosbugproject.model.FireBaseIssueList;
import example.com.samplefirebaseiosbugproject.network.APIClient;
import example.com.samplefirebaseiosbugproject.network.APIInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FireBaseIosRepository {
    private static final String TAG = FireBaseIosRepository.class.getSimpleName();
    private APIInterface apiRequest;

    public FireBaseIosRepository(Context context) {
        apiRequest = APIClient.getRetrofitInstance(context).create(APIInterface.class);
    }

    public LiveData<List<FireBaseIssueList>> getDataList() {
        final MutableLiveData<List<FireBaseIssueList>> data = new MutableLiveData<>();
        apiRequest.getData()
                .enqueue(new Callback<List<FireBaseIssueList>>() {
                    @Override
                    public void onResponse(Call<List<FireBaseIssueList>> call, Response<List<FireBaseIssueList>> response) {
                        Log.d(TAG, "onResponse response:: " + response);
                        if (response.body() != null) {
                            data.setValue(response.body());
                        }
                    }

                    @Override
                    public void onFailure(Call<List<FireBaseIssueList>>call, Throwable t) {
                        data.setValue(null);
                    }
                });
        return data;
    }



}

