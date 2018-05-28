package mecalogik.com.fireimage;

import com.google.firebase.database.Exclude;

/**
 * Created by Ryzen on 22/05/2018.
 */

public class Upload {
    private String mName;
    private String mImageUrl;
    private String mkey;

    public Upload(){

    }

    public Upload(String name, String imageUrl){
        if (name.trim().equals("")){
            name = "No Name";
        }

        mName = name;
        mImageUrl = imageUrl;
    }

    public String getName(){
        return mName;
    }

    public void setName(String name){
        mName = name;
    }

    public String getImageUrl(){
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl){
        mImageUrl = imageUrl;
    }
    @Exclude
    public String getkey(){
        return mkey;
    }
    @Exclude
    public void setKey(String key){
        mkey = key;
    }
}
