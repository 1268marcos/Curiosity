import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "curiosities")

public class Curiosity {


@PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "curiosityId")
    private int mId;

    @Nullable
    @ColumnInfo(name = "mCuriosityName")
    private String mCreationDate;

    private String mDescription;

    public Curiosity(@Nullable String creationDate, String description, String howDidYouNow, int importance) {
        mCreationDate = creationDate;
        mDescription = description;
        mHowDidYouNow = howDidYouNow;
        mImportance = importance;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getCreationdate() {
        return mCreationDate;
    }

    public void setCreationdate(String creationdate) {
        mCreationDate = creationdate;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getHowDidYouNow() {
        return mHowDidYouNow;
    }

    public void setHowDidYouNow(String howDidYouNow) {
        mHowDidYouNow = howDidYouNow;
    }

    public int getImportance() {
        return mImportance;
    }

    public void setImportance(int importance) {
        mImportance = importance;
    }

    private String mHowDidYouNow;
    private int mImportance;
    
  }
