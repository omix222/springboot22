package com.example.omix222.demo22;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;
    @RequestMapping("/")
    public ToDto hello(){
        FromDto from = new FromDto();
        from.setHoge("hoge");
        from.setHuga("huga");
//        ToDto to = new ToDto();
//        BeanUtils.copyProperties(from,to);
        ToDto to = new ToDto(from.huga, from.hoge);
        return to;
    }

    class FromDto {
        private String huga;
        private String hoge;
        public void setHuga(String huga) {
            this.huga = huga;
        }
        public String getHoge() {
            return hoge;
        }
        public void setHoge(String hoge) {
            this.hoge = hoge;
        }
        public String getHuga(){
            return huga;
        }
    }
    static class ToDto {
        public ToDto(String huga, String hoge) {
            this.huga = huga;
            this.hoge = hoge;
        }

        public ToDto() {
        }
        public static ToDto generte(String huga,String hoge) {
            return new ToDto(huga,
                    hoge);
        }
        private String huga;
        private String hoge;
        public String getHuga() {
            return huga;
        }
        public String getHoge() {
            return hoge;
        }

        public void setHoge(String hoge) {
            this.hoge = hoge;
        }

        public void setHuga(String huga) {
            this.huga = huga;
        }
    }
    @RequestMapping("/hello")
    public String helloQuru() {
        String aa = "dummy";
        aa= aa+"bb";
        return "Hello Guru!!";
    }
}
