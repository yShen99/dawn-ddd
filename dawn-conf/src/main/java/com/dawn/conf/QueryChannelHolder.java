package com.dawn.conf;

import org.dayatang.querychannel.QueryChannelService;

/**
 * Created by Dawn on 2020-04-04.
 */
public class QueryChannelHolder {
    private static QueryChannelService queryChannelService;
    public static QueryChannelService queryChannelService(){
        return queryChannelService;
    }
    public static void setQueryChannelService(QueryChannelService queryChannelService){
        QueryChannelHolder.queryChannelService=queryChannelService;
    }
}
