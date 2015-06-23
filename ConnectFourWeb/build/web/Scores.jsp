<%-- 
    Document   : Scores
    Created on : Jun 20, 2015, 1:26:21 AM
    Author     : yashar
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Scores</title>
        <style>
            table {
                width:100%;
            }
            table, th, td {
                border: 1px solid black;
                border-collapse: collapse;
            }
            th, td {
                padding: 5px;
                text-align: left;
            }
            table tr:nth-child(even) {
                background-color: #eee;
            }
            table tr:nth-child(odd) {
                background-color:#fff;
            }
            table th	{
                background-color: black;
                color: white;
            }
        </style>
    </head>
    <body style="background-color: black">
        <%
            final String DB_URL = "jdbc:derby://localhost:1527/Score;create=true";
            final String JDBC_DRIVER = "org.apache.derby.jdbc.ClientDriver";

            try {
                Class.forName(JDBC_DRIVER).newInstance();
                Connection conn = DriverManager.getConnection(DB_URL, "yasharne", "123456789");
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT ID, SCORE FROM SCORE ORDER BY SCORE DESC");
        %>
        <p style="font-family: Courier; color: aqua">Top Scores:</p>
        <div>
            <table><%
                while (rs.next()) {
                %><tr><%
                    String id = rs.getString("id");
                    int score = rs.getInt("score");
                    %><td><%= id%></td>
                    <td><%= score%></td><%
                    %></tr><%                    }
                %></table>
        </div>
        <p style="font-family: Courier; color: aqua">Online players:</p>
        <div>
            <table>
                <%  rs = stmt.executeQuery("SELECT * FROM SCORE WHERE ONLINE=true ORDER BY SCORE asc");

                    while (rs.next()) {

                %><tr><%                    String id = rs.getString("id");
                    boolean online = rs.getBoolean("online");
                    %>
                    <td><%= id%></td>
                    <td style="color: green">Online</td>
                </tr><%
                    }
                %>
            </table>
        </div>
        <%        } catch (Exception e) {
        %>
        <h1><%= e%></h1>
        <%
            }
        %>

    </body>
</html>
