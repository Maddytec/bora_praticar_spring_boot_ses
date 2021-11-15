package br.com.maddytec.email.controller;

import br.com.maddytec.email.model.Email;
import br.com.maddytec.email.service.EmailService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
@AllArgsConstructor
@RequestMapping("api/email")
public class EmailController {

    private EmailService emailService;

    @PostMapping
    public void enviarEmail(@RequestBody Email email) throws MessagingException {
        emailService.enviarEmail(email);
    }

}
