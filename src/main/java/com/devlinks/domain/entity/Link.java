package com.devlinks.domain.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "links")
public class Link {

    @Id
    private String id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String link;
    private String platform;
}
