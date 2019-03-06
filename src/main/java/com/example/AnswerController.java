package com.example;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnswerController {
    private Gson gson = new Gson();
    @PostMapping("/answer")
    public Answer answerRespose(@RequestBody String body) {
        JsonObject json = gson.fromJson(body, JsonObject.class);
        return new Answer(json.get("testo").getAsString());
    }
}
