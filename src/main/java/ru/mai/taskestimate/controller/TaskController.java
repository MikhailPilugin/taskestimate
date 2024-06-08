package ru.mai.taskestimate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskController {

//    @Autowired
//    private TaskRepository taskRepository;

    @GetMapping("/file")
    public String index() {
        return "index";
    }

    @GetMapping("/")
    public String task() {
        return "task";
    }

//    @PostMapping("/upload")
//    public String uploadFile(@RequestParam("file") MultipartFile file) {
//        // здесь добавьте код для парсинга файла CSV и сохранения данных в базу данных
//        return "redirect:/";
//    }
}
