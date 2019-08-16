package com.icebartech.core.netty;

import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

/**
 * @author Created by liuao on 2019/8/16.
 * @desc
 */
public class MyChannelHandlerPool {

    public MyChannelHandlerPool(){}
    public static ChannelGroup channelGroup = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
}
