/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author APL
 */
@WebServlet("/login")
public class Login extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
    
        String email = req.getParameter("email");
        String pass = req.getParameter("ps");
        
        Cookie ck = new Cookie("email", email);
        Cookie ck2 = new Cookie("ps", pass);
        
        resp.addCookie(ck);
        resp.addCookie(ck2);
        
        resp.sendRedirect("profile");
    }

    
    
    
    
    
}
