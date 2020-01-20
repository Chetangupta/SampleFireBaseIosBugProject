package example.com.samplefirebaseiosbugproject.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

import example.com.samplefirebaseiosbugproject.model.FireBaseIssueList;
import example.com.samplefirebaseiosbugproject.repository.FireBaseIosRepository;

public class FireBaseIosIssueViewModel extends AndroidViewModel {

    private FireBaseIosRepository fireBaseIosRepository;
    private LiveData<List<FireBaseIssueList>> fireBaseIssueListLiveData;

    public FireBaseIosIssueViewModel(@NonNull Application application) {
        super(application);

        fireBaseIosRepository = new FireBaseIosRepository(application);
        this.fireBaseIssueListLiveData = fireBaseIosRepository.getDataList();
    }

    public LiveData<List<FireBaseIssueList>> getIssuesLiveData() {
        return fireBaseIssueListLiveData;
    }
}