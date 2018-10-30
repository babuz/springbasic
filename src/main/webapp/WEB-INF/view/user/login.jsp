<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Welcome page</title>
</head>
<body>
        <h1>Login Page</h1>
        <div>
        <form action="/spring-demo-1.0-SNAPSHOT/user/authenticate">
                <table>
                    <tr>
                            <td>User Name<td>
                             <td><input type="text" id="userName" name="userName"></td>
                      </tr>
                    <tr>
                        <td>Password<td>
                        <td>
                            <input type="password" id="password" name="password">
                         </td>
                     </tr>
                    <tr>
                        <td colspan="2">
                                <button type="submit">Login<button>
                            <td>
                      </tr>
                </table>
                </form>
        </div>
</body>
</html>