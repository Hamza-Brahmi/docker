package com.MicroService.Users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
  
@GetMapping
String Landing(){

    return "<center><img src="+"https://img.freepik.com/free-vector/career-progress-concept-illustration_114360-2491.jpg?w=740&t=st=1695981276~exp=1695981876~hmac=1dfade8923ede2fbb673d10c427be6e2f04d518b69620117a6b3fc69ba53c88a"+" height=400px width=400px"+" > <h1> Welcome a board</h1></center>"  ; 
}   


}
