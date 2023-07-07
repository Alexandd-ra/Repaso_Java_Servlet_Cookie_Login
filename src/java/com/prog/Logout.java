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
@WebServlet("/logout")
public class Logout extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
    
        Cookie[] ck = req.getCookies();
        
        ck[0].setMaxAge(0);
        ck[1].setMaxAge(0);
        
        resp.addCookie(ck[0]);
        resp.addCookie(ck[1]);
        resp.sendRedirect("index.html");
    }

    
}
