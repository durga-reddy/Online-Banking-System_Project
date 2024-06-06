<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View Bank Result Table</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        h1 {
            text-align: center;
            color: #333;
        }

        table {
            width: 80%;
            margin: 20px auto;
            border-collapse: collapse;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            background-color: #fff;
        }

        th, td {
            border: 1px solid #ddd;
            padding: 10px;
            text-align: left;
        }

        th {
            background-color: #4caf50;
            color: #fff;
        }
    </style>
</head>
<body>
    <h1>View Bank Result Table</h1>
    <table>
        <tr>
            <th>Account Number</th>
            <th>Name</th>
            <th>Password</th>
            <th>Amount</th>
            <th>Address</th>
            <th>Mobile</th>
        </tr>
        <tr>
            <td>${dur.accountNum}</td>
            <td>${dur.name}</td>
            <td>${dur.password}</td>
            <td>${dur.amount}</td>
            <td>${dur.address}</td>
            <td>${dur.mobile}</td>
        </tr>
    </table>
</body>
</html>

