package net.xdclass.online_xdclass.service;

import net.xdclass.online_xdclass.model.entity.Video;

import java.util.List;

public interface VideoOrderService {


    int save(int userId, int videoId);

    List<Video> listOrderByUserId(Integer userId);
}
