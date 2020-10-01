package com.techdudes.easysharing.util;

import com.techdudes.easysharing.model.NetworkDevice;

public interface NetworkDeviceSelectedListener
{
    boolean onNetworkDeviceSelected(NetworkDevice networkDevice, NetworkDevice.Connection connection);

    boolean isListenerEffective();
}
