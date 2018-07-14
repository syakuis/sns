package org.syaku.sns.apps.post.domain;

import lombok.AllArgsConstructor;

import java.util.Date;

@AllArgsConstructor
public class Post {
    private long postIdx;
    private String contents;
    private Date regDate;
}
