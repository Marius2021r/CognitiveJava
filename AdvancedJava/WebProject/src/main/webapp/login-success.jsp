<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
        <!DOCTYPE html>
        <html>
        <head>
            <meta charset="ISO-8859-1">
            <title>Java Web Store</title>
        </head>
        <body>
        	<h1>Java Web Store</h1>
            <h4>You have logged in successfully. </h4>
            <table style="with: 100%">
                <tr>
                    <td>You user name: ${user.email}</td>
                </tr>
                <tr>
                    <td>You password: ${user.password}</td>
                </tr>
            </table>
        </body>
        </html>