package com.ifohair.controller;

import com.ifohair.request.PostCreate;
import com.ifohair.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

@Slf4j
@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @PostMapping ("/posts")
    public Map<String, String> post(@RequestBody @Valid PostCreate request) throws Exception {
        // db.save(params)
        postService.write(request);
        return Map.of();
    }
}
