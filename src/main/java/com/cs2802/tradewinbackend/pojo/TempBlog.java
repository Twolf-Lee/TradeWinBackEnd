package com.cs2802.tradewinbackend.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TempBlog {
    private Integer blogId;
    private String blogTitle;
    private String blogContent;
    private LocalDateTime blogCreateTime;
    private String username;
}
