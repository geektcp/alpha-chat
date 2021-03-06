package com.geektcp.alpha.chat.data.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.geektcp.alpha.chat.data.view.FriendView;

@Repository
public interface SearchDao {

	public List<FriendView> queryByName(String userName);
}
