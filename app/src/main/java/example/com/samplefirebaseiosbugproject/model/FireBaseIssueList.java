
package example.com.samplefirebaseiosbugproject.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FireBaseIssueList implements Parcelable,Comparable<FireBaseIssueList> {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("repository_url")
    @Expose
    private String repositoryUrl;
    @SerializedName("labels_url")
    @Expose
    private String labelsUrl;
    @SerializedName("comments_url")
    @Expose
    private String commentsUrl;
    @SerializedName("events_url")
    @Expose
    private String eventsUrl;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("node_id")
    @Expose
    private String nodeId;
    @SerializedName("number")
    @Expose
    private Integer number;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("labels")
    @Expose
    private List<Label> labels=new ArrayList<>();
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("locked")
    @Expose
    private Boolean locked;
    @SerializedName("assignee")
    @Expose
    private Object assignee;
    @SerializedName("assignees")
    @Expose
    private List<Object> assignees=new ArrayList<>();
    @SerializedName("milestone")
    @Expose
    private Object milestone;
    @SerializedName("comments")
    @Expose
    private Integer comments;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("closed_at")
    @Expose
    private Object closedAt;
    @SerializedName("author_association")
    @Expose
    private String authorAssociation;
    @SerializedName("body")
    @Expose
    private String body;
    public final static Creator<FireBaseIssueList> CREATOR = new Creator<FireBaseIssueList>() {


        @SuppressWarnings({
            "unchecked"
        })
        public FireBaseIssueList createFromParcel(Parcel in) {
            return new FireBaseIssueList(in);
        }

        public FireBaseIssueList[] newArray(int size) {
            return (new FireBaseIssueList[size]);
        }

    }
    ;

    protected FireBaseIssueList(Parcel in) {
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        this.repositoryUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.labelsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.commentsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.eventsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.htmlUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.nodeId = ((String) in.readValue((String.class.getClassLoader())));
        this.number = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        this.user = ((User) in.readValue((User.class.getClassLoader())));
        in.readList(this.labels, Label.class.getClassLoader());
        this.state = ((String) in.readValue((String.class.getClassLoader())));
        this.locked = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.assignee = ((Object) in.readValue((Object.class.getClassLoader())));
        in.readList(this.assignees, (Object.class.getClassLoader()));
        this.milestone = ((Object) in.readValue((Object.class.getClassLoader())));
        this.comments = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.createdAt = ((String) in.readValue((String.class.getClassLoader())));
        this.updatedAt = ((String) in.readValue((String.class.getClassLoader())));
        this.closedAt = ((Object) in.readValue((Object.class.getClassLoader())));
        this.authorAssociation = ((String) in.readValue((String.class.getClassLoader())));
        this.body = ((String) in.readValue((String.class.getClassLoader())));
    }

    public FireBaseIssueList() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    public void setRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    public String getLabelsUrl() {
        return labelsUrl;
    }

    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    public String getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Label> getLabels() {
        return labels;
    }

    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public Object getAssignee() {
        return assignee;
    }

    public void setAssignee(Object assignee) {
        this.assignee = assignee;
    }

    public List<Object> getAssignees() {
        return assignees;
    }

    public void setAssignees(List<Object> assignees) {
        this.assignees = assignees;
    }

    public Object getMilestone() {
        return milestone;
    }

    public void setMilestone(Object milestone) {
        this.milestone = milestone;
    }

    public Integer getComments() {
        return comments;
    }

    public void setComments(Integer comments) {
        this.comments = comments;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Object getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(Object closedAt) {
        this.closedAt = closedAt;
    }

    public String getAuthorAssociation() {
        return authorAssociation;
    }

    public void setAuthorAssociation(String authorAssociation) {
        this.authorAssociation = authorAssociation;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(url);
        dest.writeValue(repositoryUrl);
        dest.writeValue(labelsUrl);
        dest.writeValue(commentsUrl);
        dest.writeValue(eventsUrl);
        dest.writeValue(htmlUrl);
        dest.writeValue(id);
        dest.writeValue(nodeId);
        dest.writeValue(number);
        dest.writeValue(title);
        dest.writeValue(user);
        dest.writeList(labels);
        dest.writeValue(state);
        dest.writeValue(locked);
        dest.writeValue(assignee);
        dest.writeList(assignees);
        dest.writeValue(milestone);
        dest.writeValue(comments);
        dest.writeValue(createdAt);
        dest.writeValue(updatedAt);
        dest.writeValue(closedAt);
        dest.writeValue(authorAssociation);
        dest.writeValue(body);
    }

    public int describeContents() {
        return  0;
    }

    @Override
    public int compareTo(FireBaseIssueList transaction) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        Date date1 = null;
        Date date2=null;
        try {
            date1 = format.parse(this.updatedAt);
            date2 = format.parse(transaction.updatedAt);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date1.compareTo(date2);

        //return new Date(this.updatedAt).compareTo(new Date(transaction.updatedAt));
    }


    @Override
    public String toString() {
        return "FireBaseIssueList{" +
                "url='" + url + '\'' +
                ", repositoryUrl='" + repositoryUrl + '\'' +
                ", labelsUrl='" + labelsUrl + '\'' +
                ", commentsUrl='" + commentsUrl + '\'' +
                ", eventsUrl='" + eventsUrl + '\'' +
                ", htmlUrl='" + htmlUrl + '\'' +
                ", id=" + id +
                ", nodeId='" + nodeId + '\'' +
                ", number=" + number +
                ", title='" + title + '\'' +
                ", user=" + user +
                ", labels=" + labels +
                ", state='" + state + '\'' +
                ", locked=" + locked +
                ", assignee=" + assignee +
                ", assignees=" + assignees +
                ", milestone=" + milestone +
                ", comments=" + comments +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", closedAt=" + closedAt +
                ", authorAssociation='" + authorAssociation + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
