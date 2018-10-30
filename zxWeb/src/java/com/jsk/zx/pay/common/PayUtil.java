package com.jsk.zx.pay.common;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
 

import javax.servlet.http.HttpServletRequest;
 

import org.springframework.util.StringUtils;

import com.alipay.api.AlipayConstants;

public class PayUtil {
    /**
     * 对支付参数信息进行签名
     * 
     * @param map
     *            待签名授权信息
     * 
     * @return
     */
    public static String getSign(Map<String, String> map, String rsaKey) {
        List<String> keys = new ArrayList<String>(map.keySet());
        // key排序
        Collections.sort(keys);
 
        StringBuilder authInfo = new StringBuilder();
        boolean first = true;
        for (String key : keys) {
            if (first) {
                first = false;
            } else {
                authInfo.append("&");
            }
            authInfo.append(key).append("=").append(map.get(key)); 
        }
 
        return AliSignUtils.sign(authInfo.toString(), rsaKey);
    }
    /**
     * 返回签名编码拼接url
     * 
     * @param params
     * @param isEncode
     * @return
     */
    public static String getSignEncodeUrl(Map<String, String> map, boolean isEncode) {
        String sign = map.get("sign");
        String encodedSign = "";
        if (!StringUtils.isEmpty(map)) {
            map.remove("sign");
            List<String> keys = new ArrayList<String>(map.keySet());
            // key排序
            Collections.sort(keys);
 
            StringBuilder authInfo = new StringBuilder();
 
            boolean first = true;// 是否第一个
            for (String key: keys) {
                if (first) {
                    first = false;
                } else {
                    authInfo.append("&");
                }
                authInfo.append(key).append("=");
                if (isEncode) {
                    try {
                        authInfo.append(URLEncoder.encode(map.get(key), AlipayConstants.CHARSET_UTF8));
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                } else {
                    authInfo.append(map.get(key));
                }
            }
 
            try {
                encodedSign = authInfo.toString() + "&sign=" + URLEncoder.encode(sign, AlipayConstants.CHARSET_UTF8);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
 
        return encodedSign.replaceAll("\\+", "%20");
    }
}
