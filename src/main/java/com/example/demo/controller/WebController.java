//package com.example.demo.controller;
//
//import com.example.demo.entity.SysUserEntity;
//import com.example.demo.service.SysUserService;
//
//import com.example.demo.utils.JWTUtil;
//import com.example.demo.utils.ResponseBean;
//import com.example.demo.utils.StringTool;
//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;
//import org.apache.shiro.SecurityUtils;
//import org.apache.shiro.authz.UnauthorizedException;
//import org.apache.shiro.authz.annotation.Logical;
//import org.apache.shiro.authz.annotation.RequiresAuthentication;
//import org.apache.shiro.authz.annotation.RequiresPermissions;
//import org.apache.shiro.authz.annotation.RequiresRoles;
//import org.apache.shiro.subject.Subject;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.HashMap;
//
//@RestController
//public class WebController {
//
//    private static final Logger LOGGER = LogManager.getLogger(WebController.class);
//
//    @Autowired
//    private SysUserService userService;
////    @Autowired
////    private StudentDao studentDao;
//
//
//    @PostMapping("/login")
//    public ResponseBean login(@RequestParam("username") String username,
//                              @RequestParam("password") String password) {
//        SysUserEntity userBean = userService.getByUsername(username);
//        if (userBean.getPassword().equalsIgnoreCase(StringTool.Encrypt(password, "MD5"))) {
//            ResponseBean responseBean = new ResponseBean();
//            responseBean.setCode(200);
//            responseBean.setMsg("Login success");
//            HashMap<String,String> tokenmap = new HashMap<>() ;
//            String token = JWTUtil.sign(username);
//            tokenmap.put("token",token);
//            responseBean.setData(tokenmap);
//            return responseBean;
//        } else {
//            throw new UnauthorizedException();
//        }
//    }
//
//    @GetMapping("/article")
//    public ResponseBean article() {
//        Subject subject = SecurityUtils.getSubject();
//        if (subject.isAuthenticated()) {
//            return new ResponseBean(200, "You are already logged in", null);
//        } else {
//            return new ResponseBean(200, "You are guest", null);
//        }
//    }
////    @GetMapping("/getStudentByName")
////    public ResponseBean getStudentByName(String student_name) {
////        //插入数据库的操作
////        Student student = studentDao.getStudentByName(student_name);
////        return new ResponseBean(200,"ok",student);
////    }
////    @GetMapping("/addStudent")
////    public ResponseBean addStudent(String student_name) {
////        //插入数据库的操作
////        studentDao.addStudent(student_name);
////       return new ResponseBean(200,"ok",null);
////    }
////    @GetMapping("/deleteStudent")
////    public ResponseBean deleteStudent(String student_name) {
////        //插入数据库的操作
////        studentDao.delete(student_name);
////        return new ResponseBean(200,"ok",null);
////    }
////    @GetMapping("/updateStudent")
////    public ResponseBean updateStudent(String student_name,String new_name) {
////        //插入数据库的操作
////        studentDao.updateStudent(student_name,new_name);
////        return new ResponseBean(200,"ok",null);
////    }
//    @GetMapping("/require_auth")
//    @RequiresAuthentication
//    public ResponseBean requireAuth() {
//        return new ResponseBean(200, "You are authenticated", null);
//    }
//
//    @GetMapping("/require_role")
//    @RequiresRoles("normal")
//    public ResponseBean requireRole() {
//        return new ResponseBean(200, "You are visiting require_role", null);
//    }
//
//    @GetMapping("/require_permission")
//    @RequiresPermissions(logical = Logical.OR, value = {"senior","ordinary"})
//    public ResponseBean requirePermission() {
//        return new ResponseBean(200, "You are visiting permission require edit,view", null);
//    }
//
//    @RequestMapping(path = "/401")
//    @ResponseStatus(HttpStatus.UNAUTHORIZED)
//    public ResponseBean unauthorized() {
//        return new ResponseBean(401, "Unauthorized", null);
//    }
//
//
//    @RequestMapping(path = "/classmate")
//    @ResponseStatus(HttpStatus.UNAUTHORIZED)
//    public ResponseBean classmate() {
//        return new ResponseBean(401, "Unauthorized", null);
//    }
//
//}
