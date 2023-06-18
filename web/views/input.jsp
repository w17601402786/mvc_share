<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生信息录入</title>
<!-- 引入Bootstrap样式 -->
<link rel="stylesheet" href="https://cdn.bootcdn.net/ajax/libs/twitter-bootstrap/5.1.0/css/bootstrap.min.css">
</head>
<body>
    <div class="d-flex justify-content-center">
        <div class="col-lg-6">
           <div class="card">
              <h5 class="card-header text-center">学生信息录入</h5>
              <div class="card-body">
                 <form action="show" method="post">
                    <div class="form-group mb-3">
                       <label for="studentId">学号：</label>
                       <input type="text" id="studentId" name="studentId" class="form-control">
                    </div>
                    <div class="form-group mb-3">
                       <label for="name">姓名：</label>
                       <input type="text" id="name" name="name" class="form-control">
                    </div>
                    <div class="form-group mb-3">
                       <label for="gender">性别：</label>
                       <div>
                          <input type="radio" id="male" name="gender" value="male" class="form-check-input">
                          <label for="male" class="form-check-label">男</label>
                       </div>
                       <div>
                          <input type="radio" id="female" name="gender" value="female" class="form-check-input">
                          <label for="female" class="form-check-label">女</label>
                       </div>
                    </div>
                    <div class="form-group mb-3">
                       <label for="birthDate">出生日期：</label>
                       <input type="date" id="birthDate" name="birthDate" class="form-control">
                    </div>
                    <div class="form-group mb-3">
                       <label for="score">成绩：</label>
                       <input type="number" id="score" name="score" class="form-control">
                    </div>
                    <div class="text-center">
                       <button type="submit" class="btn btn-primary">提交</button>
                    </div>
                 </form>
              </div>
           </div>
        </div>
     </div>
</body>

</html>