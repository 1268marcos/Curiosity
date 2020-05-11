@PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "curiosityId")
    private int mId;

    @Nullable
    @ColumnInfo(name = "curiosityName")
    private String mCreationDate;

    private String mDescription;

    public Museum(@Nullable String creationDate, String description, String howDidYouNow, Int importance) {
        mcreationDate = creationDate;
        mDescription = description;
        mHowDidYouKnow = howDidYouKnow;
        mImportance = importance;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getCreationdate() {
        return mCreationdate;
    }

    public void setCreationdate(String creationdate) {
        mCreationdate = creationdate;
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

    public Int getImportance() {
        return mImportance;
    }

    public void setImportance(Int importance) {
        mImportance = importance;
    }

    private String mHowDidYouNow;
    private Int mImportance;

}