package com.chat.mapper;

import com.chat.model.FriendsRequest;

public interface FriendsRequestMapper {
    int deleteByPrimaryKey(String id);

    int insert(FriendsRequest record);

    int insertSelective(FriendsRequest record);

    FriendsRequest selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(FriendsRequest record);

    int updateByPrimaryKey(FriendsRequest record);

    //根据好友请求对象进行删除操作
    void deleteByFriendRequest(FriendsRequest friendsRequest);
}