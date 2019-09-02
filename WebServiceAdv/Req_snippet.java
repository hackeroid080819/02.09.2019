        String url = "http://10.0.2.2:8080/webapi/coupon";

        Request request = new Request.Builder()
                .url(url)
                .build();
        // POST
        //MediaType JSON = MediaType.parse("application/json; charset=utf-8");
        //RequestBody body = RequestBody.create(JSON, "{\"id\":1, \"value\":\"hello\"}");
        //Request request = new Request.Builder()
         //       .url(url)
         //       .post(body)
         //       .build();
