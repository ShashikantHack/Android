package com.techdudes.easysharing.service;

import android.content.SharedPreferences;

import com.techdudes.easysharing.util.AppUtils;
import com.techdudes.easysharing.util.NotificationUtils;
import com.techdudes.easysharing.db.AccessDatabase;

abstract public class Service extends android.app.Service
{
    private NotificationUtils mNotificationUtils;

    public AccessDatabase getDatabase()
    {
        return AppUtils.getDatabase(this);
    }

    public SharedPreferences getDefaultPreferences()
    {
        return AppUtils.getDefaultPreferences(getApplicationContext());
    }

    public NotificationUtils getNotificationUtils()
    {
        if (mNotificationUtils == null)
            mNotificationUtils = new NotificationUtils(getApplicationContext(), getDatabase(), getDefaultPreferences());

        return mNotificationUtils;
    }
}
