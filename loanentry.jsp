<%-- 
    Document   : loanentry
    Created on : 24-Mar-2020, 15:55:50
    Author     : Jack
--%>

<!DOCTYPE html>
<html>
    <head>
        <title>Loan Page</title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <div class="container-fluid" style="padding-top: 20px;">
            <div class="row" style="background: #f8f9fa;">
                <div class="col-md-12" id="logo" style="">
                    <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
                        <a class="navbar-brand" href="#">
                            <img src="img_logo.png" alt="Logo" style="width:100px;">
                        </a>
                        <h1><strong>Deadline Day</strong> </h1>
                    </nav> 
                </div>
                <div class="col-md-12">
                    <div class="row">
                        <div class="col-md-6" align="">
                            <ul class="nav">
                                <li class="nav-item">
                                    <a class="nav-link" href="home page.html">Home</a>
                                </li>
                                <li>
                                    <strong><h2>></h2></strong>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="loan page.html">Loan</a>
                                </li>
                                <li>
                                    <strong><h2>></h2></strong>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="loan history page.html">Loan History</a>
                                </li>
                                <li>
                                    <strong><h2>></h2></strong>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="settings page.html">Settings</a>
                                </li>


                            </ul> 

                        </div>
                        <div class="col-md-6">
                            <input type="text" placeholder="Search.." style="border-radius:20px;border: none;background: darkgray;padding: 10px;">
                        </div>

                    </div>

                    <br>
                    <br>
                    <div class="col-md-12">
                        <div class="row">
                            <div class="col-md-4">
                                <h1><strong>Loan</strong></h1>
                                <br>
                                <div class="row">
                                    <div class="col-md-12">
                                        <div class="row">
                                            <div class="col-md-6">
                                                <input type="text" placeholder="Find a Book" style="width:200px;border: none;background: darkgray;padding: 10px;">
                                            </div>
                                            <div class="col-md-3">
                                                <img src="search.png" style="width:40px;height:40px">
                                            </div>

                                        </div>
                                        <br>

                                    </div>
                                    <br>
                                    <br>
                                    <div class="col-md-12" align="">
                                        <button type="button" class="btn btn-light" style="background: gray; width:200px;"><strong>Current Loan</strong></button>
                                    </div>
                                    <div class="col-md-12" align="">
                                        <button type="button" class="btn btn-light" style="background: gray;width:200px"><strong>Return A Book</strong></button>

                                    </div>

                                </div>
                            </div>


                            <form action="<%=request.getContextPath()%>/loanentry" method="post">
                                <table>
                                    <tr>
                                        <td>Book Name</td>
                                        <td><input type="text" name="book_name" /></td>
                                    </tr>
                                    <tr>
                                        <td>Author</td>
                                        <td><input type="text" name="author" /></td>
                                    </tr>

                                    <tr>
                                        <td>Day of loan: </td>
                                        <td><input type="date" name="loanday" /></td>
                                    </tr>
                                    <tr>
                                        <td>Loan period(weeks):</td>
                                        <td><input type="number" name="loanperiod" /></td>
                                    </tr>
                                </table>
                                </tr>
                                </table>

                                <input type="submit" value="Submit">
                            </form>




                        </div>	

                        <br>


                        <br>
                        <div class="row">
                            <div class="col-md-2">

                            </div>
                            <div class="col-md-6" align="right">

                            </div>
                            <div class="col-md-4" align="right">
                                <img src="mark.png" style="border-radius:50%;width:40px;">
                            </div>

                        </div>

                    </div>

                </div>


            </div>
        </div> 

    </body>
</html>
