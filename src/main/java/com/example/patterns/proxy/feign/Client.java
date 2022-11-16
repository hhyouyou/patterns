package com.example.patterns.proxy.feign;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


/**
 *
 */
public interface Client {


    Object execute(Object request, Object options) throws IOException;

    class Default implements Client {

        @Override
        public Object execute(Object request,  Object options) throws IOException {
            HttpURLConnection connection = convertAndSend(request, options);
            return convertResponse(connection, request);
        }

        HttpURLConnection convertAndSend(Object request, Object options) throws IOException {
            String url = "http://127.0.0.1:8080/test";

            final HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();

            connection.setConnectTimeout(1000);
            connection.setReadTimeout(3000);
            connection.setAllowUserInteraction(false);
            connection.setInstanceFollowRedirects(true);
            connection.setRequestMethod("GET");
            connection.addRequestProperty("Accept", "*/*");
            connection.setChunkedStreamingMode(8196);
            connection.setDoOutput(true);

            try (OutputStream out = connection.getOutputStream()) {
                out.write(request.toString().getBytes(StandardCharsets.UTF_8));
            }

            return connection;
        }

        Object convertResponse(HttpURLConnection connection, Object request) throws IOException {
            int status = connection.getResponseCode();
            String reason = connection.getResponseMessage();

            InputStream inputStream = connection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }


            Map<String, Collection<String>> headers = new LinkedHashMap<>();
            for (Map.Entry<String, List<String>> field : connection.getHeaderFields().entrySet()) {
                // response message
                if (field.getKey() != null) {
                    headers.put(field.getKey(), field.getValue());
                }
            }


            return null;
//      return Response.builder()
//          .status(status)
//          .reason(reason)
//          .headers(headers)
//          .request(request)
//          .body(stream, length)
//          .build();
        }
    }
}
