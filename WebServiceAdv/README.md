        Connect the android application to the web service:
        
        String url = "http://10.0.2.2:8080/webapi/coupon";
        /*  if you get an ERROR - you may need to change the manifest:
        <manifest ...>
                <uses-permission android:name="android.permission.INTERNET" />
                        <application
                        ...
                        android:usesCleartextTraffic="true"
                        ...>
                        ...
                </application>
        </manifest> */

        Request request = new Request.Builder()
                .url(url)
                .build();

        // for - POST
        //MediaType JSON = MediaType.parse("application/json; charset=utf-8");
        //RequestBody body = RequestBody.create(JSON, "{\"id\":1, \"value\":\"hello\"}");
        //Request request = new Request.Builder()
         //       .url(url)
         //       .post(body)
         //       .build();
