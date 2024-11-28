package com.devlinks.domain.service;

import com.devlinks.application.input.CreateLink;
import com.devlinks.domain.entity.Link;
import com.devlinks.infrastructure.repository.LinkRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class LinkService {

    private final LinkRepository linkRepository;

    public LinkService(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public Link createLink(CreateLink request) {
        Link link = new Link();
        link.setLink(request.getLink());
        link.setPlatform(request.getPlatform());
        link.setCreatedAt(LocalDateTime.now());
        link.setUpdatedAt(LocalDateTime.now());

        return linkRepository.save(link);
    }

    public List<Link> getAllLinks() {
        return linkRepository.findAll();
    }
}
