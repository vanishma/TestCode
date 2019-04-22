package com.maqh.singleton;

/**
 * ResponseEnum class
 *
 * @author maqh
 * @date 2019/4/22
 */
public enum  DemoErrors  {
    SYSTEM_ERROR(10000, "系统错误"),
    PARAM_ERROR(10001, "参数错误"),
    ;

    DemoErrors(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
    private Integer code;

    private String message;

    private Object bean;

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}


class testtest{
    public static void main(String[] args) {
        DemoErrors demoErrors =  DemoErrors.SYSTEM_ERROR;
        demoErrors.setBean("sdflsdkfjlsd");
        System.out.println(demoErrors.getCode());
        System.out.println(demoErrors.getMessage());
        System.out.println(demoErrors.getBean());

        DemoErrors demoErrors2 =  DemoErrors.PARAM_ERROR;
        System.out.println(demoErrors2.getCode());
        System.out.println(demoErrors2.getMessage());
        System.out.println(demoErrors2.getBean());
    }
}
