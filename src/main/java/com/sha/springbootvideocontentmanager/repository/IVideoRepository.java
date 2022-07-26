package com.sha.springbootvideocontentmanager.repository;

import com.sha.springbootvideocontentmanager.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVideoRepository extends JpaRepository<Video, Long> {
}
