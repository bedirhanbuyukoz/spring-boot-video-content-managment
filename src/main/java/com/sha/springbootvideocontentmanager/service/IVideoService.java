package com.sha.springbootvideocontentmanager.service;


import com.sha.springbootvideocontentmanager.model.Video;

import java.util.List;

public interface IVideoService {

    Video saveVideo(Video video);

    void deleteVideo(Long id);


    List<Video> findAllVideos();
}
