package com.devlinks.application.controller;

import com.devlinks.application.input.CreateLink;
import com.devlinks.domain.entity.Link;
import com.devlinks.domain.service.LinkService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/links")
public class LinkController {

    private final LinkService linkService;

    public LinkController(LinkService linkService) {
        this.linkService = linkService;
    }

    @PostMapping
    public ResponseEntity<Link> createLink(@RequestBody CreateLink request) {
        Link link = linkService.createLink(request);
        return ResponseEntity.ok(link);
    }

    @GetMapping
    public ResponseEntity<List<Link>> getAllLinks() {
        List<Link> links = linkService.getAllLinks();
        return ResponseEntity.ok(links);
    }
}
