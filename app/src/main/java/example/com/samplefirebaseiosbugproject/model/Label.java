
package example.com.samplefirebaseiosbugproject.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Label implements Parcelable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("node_id")
    @Expose
    private String nodeId;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("default")
    @Expose
    private Boolean _default;
    @SerializedName("description")
    @Expose
    private String description;
    public final static Creator<Label> CREATOR = new Creator<Label>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Label createFromParcel(Parcel in) {
            return new Label(in);
        }

        public Label[] newArray(int size) {
            return (new Label[size]);
        }

    }
    ;

    protected Label(Parcel in) {
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.nodeId = ((String) in.readValue((String.class.getClassLoader())));
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.color = ((String) in.readValue((String.class.getClassLoader())));
        this._default = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.description = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Label() {
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getDefault() {
        return _default;
    }

    public void setDefault(Boolean _default) {
        this._default = _default;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(nodeId);
        dest.writeValue(url);
        dest.writeValue(name);
        dest.writeValue(color);
        dest.writeValue(_default);
        dest.writeValue(description);
    }

    public int describeContents() {
        return  0;
    }

}
