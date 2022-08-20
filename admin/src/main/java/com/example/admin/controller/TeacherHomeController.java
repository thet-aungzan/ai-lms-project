package com.example.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teacher")
public class TeacherHomeController {

    @GetMapping("/home")
    public String home(){
        return "TCH01";
    }

    @GetMapping("/chat")
    public String chat(){ return "TCH02"; }

    @GetMapping("/publicComment")
    public String publicComment(){
        return "TCH03";
    }

    @GetMapping("/batchManagement")
    public String batchManagement(){
        return "TCH04";
    }

    @GetMapping("/batchDetail")
    public String batchDetail(){ return "TCH05"; }

    @GetMapping("/examDetail")
    public String examDetail(){ return "TCH06"; }

    @GetMapping("/assignmentDetail")
    public String assignmentDetial(){ return "TCH07"; }

    @GetMapping("/attendanceCreate")
    public String attendanceCreate(){ return "TCH08"; }
}
