package com.ifohair.controller;

import com.ifohair.request.PostCreate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
public class PostController {

    @PostMapping ("/posts")
    public Map<String, String> post(@RequestBody @Valid PostCreate params) throws Exception {
        return Map.of();
    }
}
