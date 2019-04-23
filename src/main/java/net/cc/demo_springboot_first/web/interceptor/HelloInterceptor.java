package net.cc.demo_springboot_first.web.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 用户自定义拦截器
 *
 * @classname HelloInterceptor
 * @author: zhonghua.zhi
 * @date: 2019-04-23 13:55
 * @version: 1.0
 * @description: TODO
 */
public class HelloInterceptor implements HandlerInterceptor {

    /**
     * 功能描述:
     * 业务请求前调用
     *
     * @param request
     * @param response
     * @param handler
     * @return: boolean
     * @exception:
     * @author: zhonghua.zhi
     * @date: 2019-04-23 14:02
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {

        System.out.println("请求开始前 ......" + getIpAddress(request));
        return Boolean.TRUE;
    }


    /**
     * 功能描述:
     * 业务请求时调用
     *
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @return: void
     * @exception:
     * @author: zhonghua.zhi
     * @date: 2019-04-23 14:02
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {

        System.out.println("请求执行中 ......");
    }


    /**
     * 功能描述:
     * 业务请求后调用
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @return: void
     * @exception:
     * @author: zhonghua.zhi
     * @date: 2019-04-23 14:02
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
                                Object handler, Exception ex) throws Exception {


        System.out.println("请求执行后 ......");
    }


    /**
     * 功能描述:
     * 获取客户端IP
     *
     * @param request
     * @return: java.lang.String
     * @exception:
     * @author: zhonghua.zhi
     * @date: 2019-04-23 14:41
     */
    private String getIpAddress(HttpServletRequest request) {

        String ip = request.getHeader("x-forwarded-for");

        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }

        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }

        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }

        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }

        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }

        return ip;
    }
}
