package com.sha.springbootvideocontentmanager.service;


import com.sha.springbootvideocontentmanager.model.Video;
import com.sha.springbootvideocontentmanager.repository.IVideoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class VideoService implements IVideoService {

    private final IVideoRepository videoRepository;

    public VideoService(IVideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    @Override
    public Video saveVideo(Video video) {
        video.setCreateTime(LocalDateTime.now());
        return videoRepository.save(video);
    }

    @Override
    public void deleteVideo(Long id) {
        videoRepository.deleteById(id);
    }

    @Override
    public List<Video> findAllVideos() {
        return videoRepository.findAll();
    }


}
