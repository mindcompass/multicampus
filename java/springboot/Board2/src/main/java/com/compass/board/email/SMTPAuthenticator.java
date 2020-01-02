package com.compass.board.email;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
public class SMTPAuthenticator extends Authenticator {
@Override
protected PasswordAuthentication getPasswordAuthentication() {
return new PasswordAuthentication(
 "kangkang119@gmail.com", "khkhkh112");
}
}