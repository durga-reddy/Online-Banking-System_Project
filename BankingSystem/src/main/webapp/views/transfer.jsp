<!DOCTYPE html>
<html>
<head>
    <title>TRANSFER FORM</title>
</head>
<body>
    <center>
        <h1>TRANSFER FORM</h1>
        <form action="/tra" onsubmit="return validateForm()">
            <table>
                <tr>
                    <td>Account Number</td>
                    <td><input type="text" name="accountNum" id="accountNum"></td>
                </tr>
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="name" id="name"></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="password" id="password"></td>
                </tr>
                <tr>
                    <td>Target Account Number</td>
                    <td><input type="text" name="taccountNum" id="taccountNum"></td>
                </tr>
                <tr>
                    <td>Amount</td>
                    <td><input type="text" name="amount" id="amount"></td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <input type="submit" value="Submit">
                        <input type="reset" value="Clear">
                    </td>
                </tr>
            </table>
        </form>
    </center>

    <script>
        function validateForm() {
            var accountNum = document.getElementById("accountNum").value;
            var name = document.getElementById("name").value;
            var password = document.getElementById("password").value;
            var taccountNum = document.getElementById("taccountNum").value;
            var amount = document.getElementById("amount").value;

            if (accountNum.trim() == "") {
                alert("Please enter Account Number");
                return false;
            }

            if (name.trim() == "") {
                alert("Please enter Name");
                return false;
            }

            if (password.trim() == "") {
                alert("Please enter Password");
                return false;
            }

            if (taccountNum.trim() == "") {
                alert("Please enter Target Account Number");
                return false;
            }

            if (amount.trim() == "" || isNaN(amount)) {
                alert("Please enter a valid Amount");
                return false;
            }

            return true;
        }
    </script>
</body>
</html>
