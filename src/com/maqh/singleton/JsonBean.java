package com.maqh.singleton;

import java.time.chrono.IsoChronology;

/**
 * JsonBean class
 *
 * @author maqh
 * @date 2019/4/22
 */
public class JsonBean {
    private String code = "200";
    private String message = "success";

    private Object data;

    private Integer count;
    private String menu;

    private JsonBean() {
    }

    public static JsonBean getInstance() {
        return JsonBeanClass.INSTANCE;
    }

    private static class JsonBeanClass {
        private static final JsonBean INSTANCE = new JsonBean();
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setBean(Object data) {
        this.data = data;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }


    public void fail(String code, String reason) {
        this.setCode(code);
        this.setMessage(reason);
        this.data = null;
    }

    public void error(String code, String reason) {
        this.setCode(code);
        this.setMessage(reason);
        this.data = null;
    }

    public void success(String reason) {
        this.setCode("200");
        this.setMessage(reason);
    }

    public void fail4hasLogout() {
        this.setCode("logout");
        this.data = null;
    }

    @Override
    public String toString() {
        return "JsonBean [code=" + code + ", message=" + message + ", data=" + data + "]";
    }
}

class testSingLeton {
    public static void main(String[] args) {
        JsonBean instance = JsonBean.getInstance();
        instance.setCode("555");
        System.out.println(instance.getCode());

        JsonBean instance2 = JsonBean.getInstance();
        System.out.println(instance2.getCode());
    }
}
