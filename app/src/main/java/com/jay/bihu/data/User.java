package com.jay.bihu.data;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Jay on 2017/1/13.
 * 保存登录用户信息的类
 */

public class User implements Parcelable {
    /**
     * id : 1
     * username : admin
     * avatarUrlString : null
     * token : 6c5f989bdc56fe25f8a2b08443f354c910280c50
     */

    private int id;
    private String username;
    private String avatarUrlString;
    private String token;

    public User() {}

    protected User(Parcel in) {
        id = in.readInt();
        username = in.readString();
        avatarUrlString = in.readString();
        token = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatarUrlString() {
        return avatarUrlString;
    }

    public void setAvatarUrlString(String avatarUrlString) {
        this.avatarUrlString = avatarUrlString;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(username);
        dest.writeString(avatarUrlString);
        dest.writeString(token);
    }
}
