package org.syaku.sns.apps.post.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.syaku.sns.apps.post.domain.Post;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void test() {
        mockMvc.perform()
    }
}

@Controller
class PostController {

    @GetMapping("/posts")
    public List<Post> getPosts() {
        return Arrays.asList(
            new Post(1L, "", new Date()),
            new Post(2L, "", new Date()),
            new Post(3L, "", new Date())
        );
    }
}
