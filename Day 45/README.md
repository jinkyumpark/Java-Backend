# JDBC Conn

# JDBC Access DB

1. Class.forname(driver)
2. Connection con = DriverManager.getConnection(url, id, pw)
3. PreparedStatement pstmt = con.prepareStatement(sql)
4. pstmt.executeUpdate()

# JDBC Select

# JDBC Insert

# JDBC Update

# JDBC Delete

# DAO(DB Access Object)
- DB 접근 및 처리를 담당하는 클래스 객체
- DAO는 4개의 기본 매소드가 있음(CRUD)
    - select()
    - insert()
    - update()
    - delete()

# DTO(Data Transfer Object)
- 다수의 자료를 객체에 한 번에 담아서 한 번에 전송하기 위한 클래스
