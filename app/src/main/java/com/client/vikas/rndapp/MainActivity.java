package com.client.vikas.rndapp;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;

import org.json.JSONException;
import org.json.JSONObject;

import io.crossbar.autobahn.websocket.WebSocketConnection;
import io.crossbar.autobahn.websocket.WebSocketConnectionHandler;
import io.crossbar.autobahn.websocket.exceptions.WebSocketException;
import io.crossbar.autobahn.websocket.types.ConnectionResponse;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* Controller c = new Controller();
        c.start();*/

        final WebSocketConnection connection = new WebSocketConnection();
        try {
            connection.connect("ws://antiqcart.co:8090/mobile/php-socket.php", new WebSocketConnectionHandler() {
                @Override
                public void onConnect(ConnectionResponse response) {
                    System.out.println("Connected to server");
                }

                @Override
                public void onOpen() {
                    JSONObject obj = new JSONObject();
                    try {
                        obj.put("Autobahn", "Echo with Autobahn");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //connection.sendMessage(obj.toString());
                }

                @Override
                public void onClose(int code, String reason) {
                    System.out.println("Connection closed");
                }

                @Override
                public void onMessage(String payload) {
                    System.out.println("Received message: " + payload);
                    //connection.sendMessage(payload);
                    if (payload.contains("Animesh")) {
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                connection.sendMessage(getChatData().toString());
                            }
                        }, 5000);
                    }
                }
            });
        } catch (WebSocketException e) {
            e.printStackTrace();
        }
    }

    private JSONObject getChatData() {
        JSONObject chatObj = new JSONObject();
        try {
            chatObj.put("chat_user", "Mayank");
          //  chatObj.put("chat_message", "Animesh: <div class='chat-box-message'>how are you</div>");
            chatObj.put("message_type", "chat-box-html");
            chatObj.put("chat_message", "how are you");
        } catch (JSONException e) {

        }
        return chatObj;
    }
}
