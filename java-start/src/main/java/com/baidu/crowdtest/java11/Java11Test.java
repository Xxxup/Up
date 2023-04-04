package com.baidu.crowdtest.java11;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;

/**
 * Description:
 *
 * @author v_wujunhui01
 * @create 2022/12/30 16:50
 */
public class Java11Test {

    @Test
    public void inferTest() {
        Consumer<String> con = (var s) -> {
            s.getBytes();
        };
    }

    @Test
    public void strTest() {
//        String str = "   ";
//        System.out.println(str.isBlank());

        String s = "hello";
        System.out.println(s.repeat(3));

    }

    @Test
    public void httpClientTest() throws URISyntaxException, ExecutionException, InterruptedException {
        // 构建客户端
        var client = HttpClient.newHttpClient();
        // 构建请求
        var request = HttpRequest.newBuilder()
                .uri(new URI("https://www.baidu.com"))
                .GET()
                .version(HttpClient.Version.HTTP_2)
                .setHeader("Authorization", "x-token")
                .build();

        // 异步发送请求 返回 CompleteFuture
        var future = client.sendAsync(request, HttpResponse.BodyHandlers.ofString());
        // 获取body
        var body = future.get().body();
        System.out.println(body);

    }
}
