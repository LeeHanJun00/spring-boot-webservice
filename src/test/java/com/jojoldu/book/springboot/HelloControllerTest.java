package com.jojoldu.book.springboot;

import com.jojoldu.book.springboot.web.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class) // 테스트를 진행할때 SpringRunner 라는 실행자를 사용
@WebMvcTest(controllers = HelloController.class) // 컨트롤러 어노테이션 사용 가능
public class HelloControllerTest {

  @Autowired
  // 이 클래스를 통해 GET POST 등에 대한 API 테스트를 할 수 있다.
  private MockMvc mvc; // 웹 API를 테스트할 때 사용, 스프링 MVC 테스트의 시작점

  @Test
  public void hello가_리턴된다() throws Exception {
    String hello = "hello";

    mvc.perform(get("/hello")) // MockMvc를 통해 입력 주소로 get 요펑을한다.
            .andExpect(status().isOk()) // 결과를 검증한다 HTTP Header의 Status를 검증한다. (Ok == 200인지 확인)
            .andExpect(content().string(hello)); // 응답 본문의 내용을 검증한다.
  }
}
