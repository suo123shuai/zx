package com.jsk.zx.pay.model;

public class AlipayConfig {
	// 1.商户appid
	public static String APPID = "2018080160780938";

	// 2.私钥 pkcs8格式的
	public static String RSA_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCi5AGEMJ8R84jqlHbiZ3i9X0P37ab1hgbIJt1D0G/byc5oIrBO65Wcgevoc8NREKkUp+Um1JHireMZ8OcVZmCol0MG4463lWtq4QpEom9RerQcMCWvuXNC0Ou/WZS3iPQPyZ5A0SNh+UOnG/VaFuBXdnp1Insov7Bv+miNEaiGA6vdu8d+ty0T3PRsqqTvdeAh2IDlwiPdR/EbmN7OlmsluQrh7fEdZGLTAAHkiwbDeShRFhX8FcjuqJ/G3fA4Ew3DwxZjoYLFHgFMYDUDvEy1tIlMJCjKJdb7k0VgWiPz97BVJcTlJW+hJj+cVn5Yb0v0Cec9mJxBxtsH/ZDnu3hlAgMBAAECggEBAI2HKcIfNLa2MKoQ4NKKMJ/pW/bYqA3/q3jQO8OmIOqIhyx3p1SK4G0hfUV0/6k5no7x6eo5G6AmkYGCjGVNlIInGverU98ylihA61kDAVF8GW28b6IksX7GY27YeJyXA+eLuFJ85A9GMn/JjP3/jmCv8mo/0V5wXu6MVbbsNs5ojamku2Tfnsic8wiy+gHMD2KepjBX4osza+A8KzbftpYkdcbqFeAEAKRpbEJS3JiPICe9/o8vsueRaK33Omq+owy527IBAR8NX0zsf88gLTAe0c7uQbhffFpVaF4LQKKkXv59Uvlw7mlMsIKwx3lW96mWepTwe+zUIGgk7URwcMECgYEA9DO4s1VNxHcfNxHlsS7QM3J2GTJr1kahV3E3jdVntCCXrtjw8JOr8lRQVuC+OcSwF2KznwxbfMCGCm3IyKXbhkH1e9g27xI/0cL6bUhXgitIA4+SCBbczmuyIEIQN2NaM58fDl6Wa8AZ7PtgBI2rcF2zJOViMvMxnH0r7hvPQI0CgYEAqsKhF7J+Qv/Uce8/Z9lBw3UwySf1Oci5pgxspfB5dKBtub+Zc9Y9VRh4Jp1V6yophBCWiJvO0zOS16xBYe+QIi76NYrh9mGeF4lqnUjJajG/qLupkOB0JRopllM5W8YHoC3Wguta351q1ZpwJkAhaTGNJgvOW0rJzb3JS1smvTkCgYEAjiz+wApOOLBSEDHvVPU4anudnpXoitycWtijy4QP2KORLE9KGAch+Ph1vd8jYWbOTw88HMGJElzUrYW1fHx0Dvqf/faoJRCu72Vhf/a6XCLuzoPsNaF59QRmtLlBz72caqmd3zPax+kULxE7mesRgV5MSpLyVU+Z9s45oWu3gpECgYBY1MkS19MhLY8p+ikE8Btq/9LyQiwq9EXHoN0Achns1uxd3dOJVCEx3HnctKqWnKdeQXbd+Bfe/Qxd0AlvVj2n2sJlCivEjUG9wsnIqq3E5b5rm7x5Vpp1FqgdwIutN1aOOGpITwFGJNEH78B51ZDL9XAVI70k9sIGmr1Vy0Ra2QKBgEKyAoPoNBwbJ8a2r7g1mae16sLMazK4ruIpe0FDh+KGYM/n94GArryzVNIH5F/BVa3s8NiWJC6hSqheoF/J2r2ms/IkpV9UMOfixrO35U9f1Zzp0IkqjtjId6efBeKAYr/UlJTpy798B/i99NIk4qCNqKVuqDgsZrZe7U5yIni1";
	//3.应用公钥
	public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApgAxHkQeltSpMnQdUNC2/W/SG/bcBgPItr4nLvIbppaCAowtHQvc6FLutPfOQu2bZzWAoZvVEZxbKjY7K54edxRMG/74GVxMxeUKOR2vgCcPU6sdIsqZ5J0sZHemWVf9X5xsJ4ogXH6SC7SlGMv/hgGAGNUmGG4Xf1R9VdByt904aAl2U+Qsx74W5/VQRoMrj6nlYcLdluqjTdlp5hmoUpVrG7qDO2mMDAnOdKEXaBjqMZPvTBJ0o2XZARunpaBZO7dSUdeqkVAmwAce+FYIHE5QFxgdvlL9inHTod2olZyDoBEW/aeLu265MYf+bNy6sv6LSjJZIIPzLCIXsHSKYQIDAQAB";
	// 4.服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	//public static String notify_url = "http://www.dashiquan.cn:8081/pay/aliscallbacks";

	// 5.页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	// 商户可以自定义同步跳转地址
	public static String return_url = "http://www.dashiquan.cn:8081/pay/aliscallbacks";

	// 6.请求网关地址
	public static String URL = "https://openapi.alipay.com/gateway.do";

	// 7.编码
	public static String CHARSET = "UTF-8";

	// 8.返回格式
	public static String FORMAT = "json";

	// 9.加密类型
	public static String SIGNTYPE = "RSA2";
}
