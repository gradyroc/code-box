package cn.grady.response;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * @author rociss
 * @version 1.0, on 20:51 2020/4/3.
 */
public class PersonResponse<T> {
    @JSONField(name = "NAME")
    private String name;

    @JSONField(name = "WIFElIST")
    private List<T> wifeList = null;

    @JSONField(name = "SEX")
    private String sex;
}
