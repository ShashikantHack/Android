package com.techdudes.easysharing.util;

import com.techdudes.easysharing.model.NetworkDevice;

import java.util.List;

public interface OnDeviceSelectedListener
{
    void onDeviceSelected(NetworkDevice.Connection connection, List<NetworkDevice.Connection> availableInterfaces);
}
