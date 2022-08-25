package com.example.music_app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MusicDto {
    private int id;
    @NotBlank(message = "Điền vào chỗ trống")
    @Pattern(regexp = "^[A-Za-z0-9 ]*$",message = "Enter again please")
    @Size(max = 800, message = "Tối đa 800 ký tự")
    private String name;

    @NotBlank(message = "Điền vào chỗ trống")
    @Pattern(regexp = "^[A-Za-z0-9 ]*$",message = "Không nhập ký tự đặc biệt")
    @Size(max = 300, message = "Tối đa 300 ký tự")
    private String artist;

    @NotBlank(message = "Điền vào chỗ trống")
    @Pattern(regexp = "^[A-Za-z0-9 \\\\,]*$",message = "Vui lòng nhập lại không chứa kí tự đặc biệt trừ dấu phẩy")
    @Size(max = 1000, message = "Tối đa 1000 ký tự")
    private String type;
}
