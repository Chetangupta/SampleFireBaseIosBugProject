package example.com.samplefirebaseiosbugproject.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PullRequest implements Parcelable {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @SerializedName("diff_url")
    @Expose
    private String diffUrl;
    @SerializedName("patch_url")
    @Expose
    private String patchUrl;
    public final static Parcelable.Creator<PullRequest> CREATOR = new Creator<PullRequest>() {


        @SuppressWarnings({
                "unchecked"
        })
        public PullRequest createFromParcel(Parcel in) {
            return new PullRequest(in);
        }

        public PullRequest[] newArray(int size) {
            return (new PullRequest[size]);
        }

    };

    protected PullRequest(Parcel in) {
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        this.htmlUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.diffUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.patchUrl = ((String) in.readValue((String.class.getClassLoader())));
    }

    public PullRequest() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getDiffUrl() {
        return diffUrl;
    }

    public void setDiffUrl(String diffUrl) {
        this.diffUrl = diffUrl;
    }

    public String getPatchUrl() {
        return patchUrl;
    }

    public void setPatchUrl(String patchUrl) {
        this.patchUrl = patchUrl;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(url);
        dest.writeValue(htmlUrl);
        dest.writeValue(diffUrl);
        dest.writeValue(patchUrl);
    }

    public int describeContents() {
        return 0;
    }
}
