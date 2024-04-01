package com.jojoldu.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor // 선언된 모든 final 필드가 포함된 생성자를 생성해준다.(final이 없으면 포함X)
public class HelloResponseDto {
  private final String name;
  private final int amount;
}
