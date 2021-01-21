<%-- 
    Document   : cart
    Created on : Jul 20, 2019, 9:24:07 PM
    Author     : PC
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<li class="header-cart dropdown default-dropdown">
    <a class="dropdown-toggle" data-toggle="dropdown" aria-expanded="true">
        <div class="header-btns-icon">
            <i class="fa fa-shopping-cart"></i>
            <span class="qty">${sessionScope.myCartNum}</span>
        </div>
        <strong class="text-uppercase">Donate</strong>
        <br>
        <span></span>
    </a>

    <div class="custom-menu">
        <div id="shopping-cart">
            
            <div class="shopping-cart-btns">
                <a onclick="location.href='checkout.htm'" class="primary-btn" >Checkout <i class="fa fa-arrow-circle-right"></i></a>
            </div>
        </div>
    </div>
</li>