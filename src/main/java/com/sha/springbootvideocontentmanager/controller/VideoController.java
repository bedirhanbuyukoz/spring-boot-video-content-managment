package com.sha.springbootvideocontentmanager.controller;

import com.sha.springbootvideocontentmanager.model.Video;
import com.sha.springbootvideocontentmanager.service.IVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/video")//pre-path
public class VideoController {

    @Autowired
    private IVideoService videoService;


    @PostMapping //api/video
    public ResponseEntity<?> saveVideo(@RequestBody Video video)
    {
        return new ResponseEntity<>(videoService.saveVideo(video), HttpStatus.CREATED);
    }

    @DeleteMapping("{videoId}")//api/video/{videoId}
    public ResponseEntity<?> deleteVideo(@PathVariable Long videoId)
    {
        videoService.deleteVideo(videoId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping//api/book
    public ResponseEntity<?> getAllVideos()
    {
        return new ResponseEntity<>(videoService.findAllVideos(),HttpStatus.OK);
    }

}
