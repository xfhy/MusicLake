package com.cyl.musiclake.ui.my;

import com.cyl.musiclake.MusicApp;
import com.cyl.musiclake.ui.my.user.User;
import com.cyl.musiclake.ui.my.user.UserStatus;

/**
 * Created by D22434 on 2018/1/3.
 */

public class UserModel implements UserContract.Model {

    public UserModel() {
    }

    @Override
    public void savaInfo(User userInfo) {
        //保存用户信息  用户信息是存入SP中的
        UserStatus.saveUserInfo(userInfo);
    }

    @Override
    public User getUserInfo() {
        return UserStatus.getUserInfo();
    }

    @Override
    public void cleanInfo() {
        UserStatus.clearUserInfo();
    }
}
