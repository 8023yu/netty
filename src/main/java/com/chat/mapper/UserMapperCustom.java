package com.chat.mapper;

import com.chat.vo.FriendsRequestVO;
import com.chat.vo.MyFriendsVO;

import java.util.List;

public interface UserMapperCustom {
    List<FriendsRequestVO> queryFriendRequestList(String acceptUserId);
    List<MyFriendsVO> queryMyFriends(String userId);
    void batchUpdateMsgSigned(List<String> msgIdList);

}
