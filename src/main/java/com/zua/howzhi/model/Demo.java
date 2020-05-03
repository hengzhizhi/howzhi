package com.zua.howzhi.model;

import java.util.Date;

public class Demo {
   private String name;
   private String password;
   private String code;
   private Date time;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getCode() {
      return code;
   }

   public void setCode(String code) {
      this.code = code;
   }

   public Date getTime() {
      return time;
   }

   public void setTime(Date time) {
      this.time = time;
   }

   public Demo() {
   }

   public Demo(String name, String password, String code, Date time) {
      this.name = name;
      this.password = password;
      this.code = code;
      this.time = time;
   }

   @Override
   public String toString() {
      return "Demo{" +
              "name='" + name + '\'' +
              ", password='" + password + '\'' +
              ", code='" + code + '\'' +
              ", time=" + time +
              '}';
   }
}
