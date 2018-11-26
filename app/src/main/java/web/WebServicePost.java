package web;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by huohu on 2018/11/23.
 */

public class WebServicePost {
    private static String IP = "188.131.169.231:8080" ;

    public static String executeHttpPost(String username, String password){
        try{
            String path = "http://" + IP + "/sign_system/Login";
            //发送指令和信息
            Map<String, String> params = new HashMap<String, String>();
            params.put("username", username);
            params.put("password", password);

            return sendPostRequest(path, params, "UTF-8");
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    private static String sendPostRequest(String oath, Map<String, String> params, String encoding){


        return null;
    }
}
