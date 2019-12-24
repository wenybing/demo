package com.example.demo;

import org.jasypt.util.text.BasicTextEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void jasyptTest() {
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        //加密所需的salt(盐)
        textEncryptor.setPassword("EbfYkitulv73I2p0mXI50JMXoaxZTKJ7");
        //要加密的数据（数据库的用户名或密码）
        String username = textEncryptor.encrypt("postgres");
        String password = textEncryptor.encrypt("root");

        System.out.println("username:" + username);  //username:Td2HvgkdnveKck9iB1iQMw==
        System.out.println("password:" + password);  //password:nxcaTRvASystjQFVdKkC1KZvTqJknnc5

        System.out.println("明文2(username):" + textEncryptor.decrypt(username));
        System.out.println("明文2(password):" + textEncryptor.decrypt(password));

    }

}
