package com.trevynmace.server;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet
{
    private static final long serialVersionUID = 1L;

    private int count = 0;

    @Override
    public void init()
    {
        System.out.println("Count: " + count); //$NON-NLS-1$
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    {
        count++;
        System.out.println("Count: " + count); //$NON-NLS-1$
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    {
        doGet(request, response);
    }
}