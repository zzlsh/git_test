package com.lsh.git_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitTestApplication.class, args);
    }

    public void test1() {

        /*ctrl + t 将远程库中的修改更新到当前项目中*/
        /*ctrl + k 将项目提交到主干分支*/
        /*ctrl + alt + k 将项目提交并推送*/
        /*ctrl + q 查看修改，并撤销修改*/
        System.out.println("第一次尝试");
        System.out.println("远程库中进行修改");
        System.out.println("协同开发第一次");
        System.out.println("is ok");

    }

}
